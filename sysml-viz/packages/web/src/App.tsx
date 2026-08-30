import {
  useCallback,
  useEffect,
  useMemo,
  useRef,
  useState,
} from 'react';
import {
  applyEdgeChanges,
  applyNodeChanges,
  Background,
  BackgroundVariant,
  Controls,
  MarkerType,
  MiniMap,
  ReactFlow,
  useReactFlow,
  type EdgeChange,
  type EdgeMouseHandler,
  type NodeChange,
  type NodeMouseHandler,
  type OnNodeDrag,
  type Viewport,
} from '@xyflow/react';
import { annotationBounds } from '@sysml-viz/core/scene';
import { assessContainerResize, defaultContainerResizeConstraints } from '@sysml-viz/core/container-geometry';
import { api, ApiError, isOwnViewMutationEvent, subscribeToEvents, type ConnectionStatus } from './api';
import { AnnotationNode } from './components/AnnotationNode';
import { DiagramNode } from './components/DiagramNode';
import { Header } from './components/Header';
import type { UiMode } from './components/Header';
import { Icon } from './components/Icon';
import { Inspector } from './components/Inspector';
import { RoutedEdge } from './components/RoutedEdge';
import { updateManualAttachmentRoute } from './edge-attachments';
import { ProjectDialog } from './components/ProjectDialog';
import {
  CheckpointDialog,
  DiagnosticsBanner,
  EmptyCanvas,
  ErrorCanvas,
  LoadingCanvas,
  Toasts,
} from './components/Overlays';
import { Sidebar } from './components/Sidebar';
import { ViewTools } from './components/ViewTools';
import { TraceabilityPanel } from './components/TraceabilityPanel';
import { CreateSavedDiagramDialog } from './components/CreateSavedDiagramDialog';
import { layoutDiagram, repairDiagramCollisions } from './layout';
import { buildFidelityStatusViewModel, useDiagramAssessment } from './diagram-assessment';
import { diagnosticKey, visibleDiagnostics } from './diagnostics';
import {
  clampSystemAbstractWidth,
  interactionProps,
  isCanvasModeShortcut,
  MAX_SYSTEM_ABSTRACT_WIDTH,
  MINIMAP_VISIBLE_KEY,
  MIN_SYSTEM_ABSTRACT_WIDTH,
  maximumSystemAbstractWidth,
  readBooleanPreference,
  readSystemAbstractWidth,
  SYSTEM_ABSTRACT_WIDTH_KEY,
  type CanvasInteractionMode,
} from './canvas-preferences';
import type {
  DiagramData,
  DiagramNodePayload,
  DiagramPort,
  Breadcrumb,
  AnnotationFlowNode,
  CanvasFlowNode,
  ElementDetails,
  GumboContract,
  LayoutAlignment,
  LayoutDistribution,
  ModelData,
  ModelContractRecord,
  ModelSearchResult,
  NamedView,
  RequirementRecord,
  SessionState,
  SysmlFlowEdge,
  SysmlFlowNode,
  ToastMessage,
  ValidationState,
  SystemAbstractDocument,
  ViewsData,
  ViewPatch,
  ViewEdgeRoute,
  EdgeAttachment,
  EdgeAttachmentEnd,
} from './types';

const nodeTypes = { sysmlNode: DiagramNode, annotationNode: AnnotationNode };
const edgeTypes = { routed: RoutedEdge };
const EMPTY_MODEL: ModelData = { definitions: [], rootCandidates: [], contracts: [], requirements: [] };
const EMPTY_VIEWS: ViewsData = { schemaVersion: 1, views: [] };
const EMPTY_VALIDATION: ValidationState = { status: 'not-run' };
const VIEW_HISTORY_LIMIT = 50;
const UI_MODE_KEY = 'sysml-viz.ui-mode.v1';

function initialUiMode(): UiMode {
  try { return localStorage.getItem(UI_MODE_KEY) === 'advanced' ? 'advanced' : 'explore'; }
  catch { return 'explore'; }
}

function initialMinimapVisible(): boolean {
  return readBooleanPreference(typeof localStorage === 'undefined' ? undefined : localStorage, MINIMAP_VISIBLE_KEY, true);
}

type ViewSnapshot = Required<Pick<NamedView,
  | 'name'
  | 'rootId'
  | 'positions'
  | 'edgeRoutes'
  | 'pinned'
  | 'hidden'
  | 'expanded'
  | 'aliases'
  | 'annotations'
  | 'constraints'
  | 'presentationNodes'
  | 'presentationEdges'
  | 'showPorts'
  | 'showEdgeLabels'
  | 'showTypes'
  | 'camera'
>>;

interface ViewHistory {
  undo: ViewSnapshot[];
  redo: ViewSnapshot[];
}

function snapshotView(view: NamedView): ViewSnapshot {
  return {
    name: view.name,
    rootId: view.rootId,
    positions: Object.fromEntries(
      Object.entries(view.positions).map(([id, position]) => [id, { ...position }]),
    ),
    edgeRoutes: Object.fromEntries(
      Object.entries(view.edgeRoutes ?? {}).map(([id, route]) => [
        id,
        {
          pinned: route.pinned,
          points: route.points.map((point) => ({ ...point })),
          ...(route.sourceAttachment ? { sourceAttachment: { ...route.sourceAttachment } } : {}),
          ...(route.targetAttachment ? { targetAttachment: { ...route.targetAttachment } } : {}),
        },
      ]),
    ),
    pinned: [...view.pinned],
    hidden: [...view.hidden],
    expanded: [...view.expanded],
    aliases: { ...view.aliases },
    annotations: view.annotations.map((annotation) => ({
      ...annotation,
      position: { ...annotation.position },
      ...(annotation.arrow ? { arrow: { ...annotation.arrow } } : {}),
    })),
    constraints: (view.constraints ?? []).map((constraint) => ({ ...constraint })),
    presentationNodes: (view.presentationNodes ?? []).map((node) => ({ ...node })),
    presentationEdges: (view.presentationEdges ?? []).map((edge) => ({
      ...edge,
      ...(edge.bendPoints ? { bendPoints: edge.bendPoints.map((point) => ({ ...point })) } : {}),
    })),
    showPorts: view.showPorts ?? true,
    showEdgeLabels: view.showEdgeLabels ?? true,
    showTypes: view.showTypes ?? true,
    camera: { ...(view.camera ?? { x: 0, y: 0, zoom: 1 }) },
  };
}

function snapshotPatch(snapshot: ViewSnapshot): ViewPatch {
  return {
    name: snapshot.name,
    rootId: snapshot.rootId,
    positions: snapshot.positions,
    edgeRoutes: snapshot.edgeRoutes,
    pinned: snapshot.pinned,
    hidden: snapshot.hidden,
    expanded: snapshot.expanded,
    aliases: snapshot.aliases,
    annotations: snapshot.annotations,
    constraints: snapshot.constraints,
    presentationNodes: snapshot.presentationNodes,
    presentationEdges: snapshot.presentationEdges,
    showPorts: snapshot.showPorts,
    showEdgeLabels: snapshot.showEdgeLabels,
    showTypes: snapshot.showTypes,
    camera: snapshot.camera,
  };
}

function restoreViewSnapshot(view: NamedView, snapshot: ViewSnapshot): NamedView {
  return { ...view, ...snapshotView({ ...view, ...snapshot }) };
}

function sameSnapshot(first: ViewSnapshot, second: ViewSnapshot): boolean {
  return JSON.stringify(first) === JSON.stringify(second);
}

function boundedPush(snapshots: ViewSnapshot[], snapshot: ViewSnapshot): ViewSnapshot[] {
  return [...snapshots.slice(-(VIEW_HISTORY_LIMIT - 1)), snapshot];
}

function isEditingText(target: EventTarget | null): boolean {
  return target instanceof HTMLElement && (
    target.isContentEditable ||
    target.matches('input, textarea, select, [role="textbox"]')
  );
}

function countContracts(node: DiagramNodePayload): number {
  return Object.values(node.contractCounts).reduce((sum, count) => sum + count, 0);
}

export function nextExpandedIds(
  current: readonly string[],
  element: Pick<DiagramNodePayload, 'id' | 'elementId' | 'expanded'>,
): string[] {
  const equivalentIds = new Set(
    [element.id, element.elementId].filter((id): id is string => Boolean(id)),
  );
  const isExpanded = Boolean(element.expanded) ||
    current.some((id) => equivalentIds.has(id));
  const next = current.filter((id) => !equivalentIds.has(id));
  if (!isExpanded) next.push(element.elementId ?? element.id);
  return [...new Set(next)];
}

export function toFlowNodes(
  diagram: DiagramData,
  view?: NamedView,
  previousIds = new Set<string>(),
  onSelectElement?: (id: string) => void,
  onToggleExpansion?: (element: DiagramNodePayload) => void,
  onOpenDefinition?: (element: DiagramNodePayload) => void,
  onResizeContainer?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void,
  onResizeContainerStart?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void,
  onResizeContainerDraft?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void,
): SysmlFlowNode[] {
  const showPorts = view?.showPorts ?? true;
  const showTypes = view?.showTypes ?? true;
  const elements = diagram.nodes.filter((element) => !view?.hidden.includes(element.id));
  const visibleIds = new Set(elements.map((element) => element.id));
  const absolutePositions = new Map(elements.map((element, index) => [
    element.id,
    view?.positions[element.id] ?? element.position ?? {
        x: (index % 3) * 330,
        y: Math.floor(index / 3) * 210,
      },
  ]));
  const childCounts = new Map<string, number>();
  const childrenByParent = new Map<string, DiagramNodePayload[]>();
  for (const element of elements) {
    if (element.parentId && visibleIds.has(element.parentId)) {
      childCounts.set(element.parentId, (childCounts.get(element.parentId) ?? 0) + 1);
      const siblings = childrenByParent.get(element.parentId) ?? [];
      siblings.push(element);
      childrenByParent.set(element.parentId, siblings);
    }
  }
  const depth = (element: DiagramNodePayload): number => {
    let result = 0;
    let parentId = element.parentId;
    const visited = new Set<string>();
    while (parentId && visibleIds.has(parentId) && !visited.has(parentId)) {
      visited.add(parentId);
      result += 1;
      parentId = elements.find((candidate) => candidate.id === parentId)?.parentId;
    }
    return result;
  };
  const ordinaryHeight = (element: DiagramNodePayload) => {
    const portRows = Math.max(
      element.ports.filter((port) => ['in', 'input', 'inout'].includes(port.direction.toLowerCase())).length,
      element.ports.filter((port) => ['out', 'output', 'inout'].includes(port.direction.toLowerCase())).length,
      1,
    );
    return (showPorts ? 128 + portRows * 25 : 104) - (showTypes ? 0 : 16);
  };
  const resolvedDimensions = new Map(elements.map((element) => {
    const stored = absolutePositions.get(element.id)!;
    const storedWidth = 'width' in stored && typeof stored.width === 'number' ? stored.width : undefined;
    const storedHeight = 'height' in stored && typeof stored.height === 'number' ? stored.height : undefined;
    const presentationOnly = element.presentationOnly === true;
    const expandedContainer = element.expanded === true || childrenByParent.has(element.id);
    return [element.id, {
      width: presentationOnly
        ? Math.max(248, element.dimensions?.width ?? storedWidth ?? 248)
        : expandedContainer
          ? storedWidth ?? element.dimensions?.width ?? 248
          : 248,
      height: presentationOnly
        ? Math.max(142, element.dimensions?.height ?? storedHeight ?? 142)
        : expandedContainer
          ? storedHeight ?? element.dimensions?.height ?? ordinaryHeight(element)
          : ordinaryHeight(element),
    }];
  }));
  const parents = elements
    .filter((element) => childrenByParent.has(element.id))
    .sort((first, second) => depth(second) - depth(first));
  for (const parent of parents) {
    const children = childrenByParent.get(parent.id) ?? [];
    const leftInset = 28;
    const topInset = 72;
    const current = resolvedDimensions.get(parent.id) ?? { width: 248, height: ordinaryHeight(parent) };
    let parentStored = absolutePositions.get(parent.id)!;
    let parentDimensions = { width: Math.max(640, current.width), height: Math.max(380, current.height) };

    // A pinned legacy child is a user decision.  Shift only the boundary when
    // necessary so its canvas-absolute coordinate survives first expansion.
    for (const child of children) {
      const stored = absolutePositions.get(child.id)!;
      const dimensions = resolvedDimensions.get(child.id)!;
      const pinned = view?.pinned.includes(child.id) ?? child.pinned;
      if (!pinned) continue;
      parentStored = {
        ...parentStored,
        x: Math.min(parentStored.x, stored.x - leftInset),
        y: Math.min(parentStored.y, stored.y - topInset),
      };
      parentDimensions = {
        width: Math.max(parentDimensions.width, stored.x + dimensions.width + 28 - parentStored.x),
        height: Math.max(parentDimensions.height, stored.y + dimensions.height + 28 - parentStored.y),
      };
    }
    absolutePositions.set(parent.id, parentStored);

    const retainedIds = new Set(children.flatMap((child) => {
      const dimensions = resolvedDimensions.get(child.id)!;
      const stored = absolutePositions.get(child.id)!;
      const pinned = view?.pinned.includes(child.id) ?? child.pinned;
      const saved = view?.positions[child.id] !== undefined;
      const relative = { x: stored.x - parentStored.x, y: stored.y - parentStored.y };
      const inBounds = relative.x >= leftInset && relative.y >= topInset &&
        relative.x + dimensions.width <= parentDimensions.width - 28 &&
        relative.y + dimensions.height <= parentDimensions.height - 28;
      return saved && (inBounds || pinned) ? [child.id] : [];
    }));
    const occupied = children.flatMap((child) => {
      if (!retainedIds.has(child.id)) return [];
      const stored = absolutePositions.get(child.id)!;
      const dimensions = resolvedDimensions.get(child.id)!;
      return [{
        x: stored.x - parentStored.x,
        y: stored.y - parentStored.y,
        ...dimensions,
      }];
    });
    for (const child of children) {
      const dimensions = resolvedDimensions.get(child.id)!;
      const stored = absolutePositions.get(child.id)!;
      const pinned = view?.pinned.includes(child.id) ?? child.pinned;
      const relative = { x: stored.x - parentStored.x, y: stored.y - parentStored.y };
      // Saved in-bounds geometry is authoritative: overlap and close spacing
      // are intentional layout choices, never a reason to repack siblings.
      if (retainedIds.has(child.id)) {
        parentDimensions = {
          width: Math.max(parentDimensions.width, relative.x + dimensions.width + 28),
          height: Math.max(parentDimensions.height, relative.y + dimensions.height + 28),
        };
        continue;
      }
      if (pinned) continue;
      const packed = { x: leftInset, y: topInset };
      while (true) {
        const collisions = occupied.filter((box) =>
          packed.x < box.x + box.width + 28 &&
          packed.x + dimensions.width + 28 > box.x &&
          packed.y < box.y + box.height + 28 &&
          packed.y + dimensions.height + 28 > box.y
        );
        if (collisions.length === 0) break;
        packed.y = Math.max(...collisions.map((box) => box.y + box.height + 28));
      }
      absolutePositions.set(child.id, {
        ...stored,
        x: parentStored.x + packed.x,
        y: parentStored.y + packed.y,
      });
      occupied.push({ ...packed, ...dimensions });
      parentDimensions = {
        width: Math.max(parentDimensions.width, packed.x + dimensions.width + 28),
        height: Math.max(parentDimensions.height, packed.y + dimensions.height + 28),
      };
    }
    resolvedDimensions.set(parent.id, parentDimensions);
  }

  // React Flow requires a parent node to precede all of its children.
  return [...elements]
    .sort((first, second) => depth(first) - depth(second))
    .map((element) => {
      const stored = absolutePositions.get(element.id)!;
      const parentStored = element.parentId ? absolutePositions.get(element.parentId) : undefined;
      const hasVisibleChildren = (childCounts.get(element.id) ?? 0) > 0;
      const { width, height } = resolvedDimensions.get(element.id) ?? { width: 248, height: ordinaryHeight(element) };
      const baseHeight = ordinaryHeight(element);
      const isContainer = hasVisibleChildren || Boolean(element.expanded && (width > 360 || height > baseHeight + 80));
      const parentIsVisibleContainer = Boolean(
        element.parentId &&
        visibleIds.has(element.parentId) &&
        (childCounts.get(element.parentId) ?? 0) > 0,
      );
      const position = parentIsVisibleContainer && parentStored
        ? { x: stored.x - parentStored.x, y: stored.y - parentStored.y }
        : { x: stored.x, y: stored.y };
      const pinned = view?.pinned.includes(element.id) ?? element.pinned;
      const alias = view?.aliases[element.id];
      const coordinateOffset = { x: stored.x - position.x, y: stored.y - position.y };
      const resizeChildren = (childrenByParent.get(element.id) ?? []).map((child) => {
        const childPosition = absolutePositions.get(child.id)!;
        const childDimensions = resolvedDimensions.get(child.id)!;
        return { id: child.id, x: childPosition.x, y: childPosition.y, ...childDimensions };
      });
      const containingPosition = element.parentId ? absolutePositions.get(element.parentId) : undefined;
      const containingDimensions = element.parentId ? resolvedDimensions.get(element.parentId) : undefined;
      return {
        id: element.id,
        type: 'sysmlNode',
        position,
        ...(parentIsVisibleContainer ? { parentId: element.parentId, extent: 'parent' as const } : {}),
        zIndex: isContainer ? 0 : depth(element) + 1,
        data: {
          element: {
            ...element,
            dimensions: { width, height },
            label: alias ?? element.label,
            pinned,
            isNew: previousIds.size > 0 && !previousIds.has(element.id),
          },
          isContainer,
          showPorts,
          showTypes,
          onSelectElement,
          onToggleExpansion,
          onOpenDefinition,
          onResizeContainer,
          onResizeContainerStart,
          onResizeContainerDraft,
          ...(isContainer ? {
            resizeConstraints: defaultContainerResizeConstraints(
              resizeChildren,
              containingPosition && containingDimensions ? {
                x: containingPosition.x + 28,
                y: containingPosition.y + 72,
                width: containingDimensions.width - 56,
                height: containingDimensions.height - 100,
              } : undefined,
            ),
            resizeCoordinateOffset: coordinateOffset,
          } : {}),
        },
        className: isContainer ? 'flow-container-node' : undefined,
        style: isContainer || element.presentationOnly ? { width, height } : { width, minHeight: baseHeight },
      };
    });
}

function absoluteNodePosition(
  node: SysmlFlowNode,
  nodes: SysmlFlowNode[],
): { x: number; y: number } {
  let x = node.position.x;
  let y = node.position.y;
  let parentId = node.parentId;
  const byId = new Map(nodes.map((candidate) => [candidate.id, candidate]));
  const visited = new Set<string>();
  while (parentId && !visited.has(parentId)) {
    visited.add(parentId);
    const parent = byId.get(parentId);
    if (!parent) break;
    x += parent.position.x;
    y += parent.position.y;
    parentId = parent.parentId;
  }
  return { x, y };
}

function toAnnotationNodes(view?: NamedView): AnnotationFlowNode[] {
  return (view?.annotations ?? []).map((annotation) => {
    const bounds = annotationBounds(annotation);
    return ({
    id: `view-annotation:${annotation.id}`,
    type: 'annotationNode',
    position: annotation.position,
    data: { annotation },
    dragHandle: '.annotation-drag-handle',
    selectable: true,
    zIndex: 20,
    style: { width: bounds.width, height: bounds.height },
  });
  });
}

function toAnnotationEdges(diagram: DiagramData, view?: NamedView): SysmlFlowEdge[] {
  const nodeByElement = new Map<string, string>();
  const portOwner = new Map<string, { nodeId: string; portId: string }>();
  for (const node of diagram.nodes) {
    nodeByElement.set(node.id, node.id);
    if (node.elementId) nodeByElement.set(node.elementId, node.id);
    for (const port of node.ports) {
      portOwner.set(port.id, { nodeId: node.id, portId: port.id });
      if (port.elementId) portOwner.set(port.elementId, { nodeId: node.id, portId: port.id });
    }
  }
  return (view?.annotations ?? []).flatMap((annotation) => {
    if (!annotation.arrow) return [];
    const targetPort = annotation.arrow.targetKind === 'port'
      ? portOwner.get(annotation.arrow.targetId)
      : undefined;
    const target = targetPort?.nodeId ?? nodeByElement.get(annotation.arrow.targetId);
    if (!target) return [];
    return [{
      id: `view-annotation-arrow:${annotation.id}`,
      source: `view-annotation:${annotation.id}`,
      sourceHandle: '__source',
      target,
      targetHandle: targetPort?.portId ?? '__target',
      type: 'routed' as const,
      data: {
        sourceIsPort: false,
        targetIsPort: Boolean(targetPort),
      },
      markerEnd: { type: MarkerType.ArrowClosed, width: 13, height: 13, color: '#b7791f' },
      className: 'diagram-edge annotation-arrow',
      style: { stroke: '#b7791f', strokeWidth: 1.5, strokeDasharray: '4 3' },
      zIndex: 12,
    }];
  });
}

function toFlowEdges(
  diagram: DiagramData,
  showLabels = true,
  routes: Record<string, ViewEdgeRoute> = {},
): SysmlFlowEdge[] {
  return diagram.edges.map((edge) => ({
    id: edge.id,
    source: edge.source,
    target: edge.target,
    sourceHandle: edge.sourcePort ?? '__source',
    targetHandle: edge.targetPort ?? '__target',
    label: showLabels || edge.presentationOnly ? edge.label : undefined,
    type: 'routed',
    data: {
      route: routes[edge.id] ?? (edge.bendPoints ? { pinned: true, points: edge.bendPoints } : undefined),
      elementId: edge.elementId,
      source: edge.sourceLocation,
      sourceIsPort: Boolean(edge.sourcePort),
      targetIsPort: Boolean(edge.targetPort),
    },
    markerEnd: { type: MarkerType.ArrowClosed, width: 14, height: 14, color: edge.unresolved ? '#dc5960' : '#607087' },
    className: edge.presentationOnly ? 'diagram-edge presentation-only' : edge.unresolved ? 'diagram-edge unresolved' : 'diagram-edge',
    style: {
      stroke: edge.unresolved ? '#dc5960' : '#607087',
      strokeWidth: 1.65,
      ...(edge.presentationOnly ? { strokeDasharray: '7 5', opacity: 0.78 } : {}),
    },
    labelStyle: { fill: '#475569', fontSize: 11, fontWeight: 600 },
    labelBgStyle: { fill: '#f8fafc', fillOpacity: 0.92 },
    labelBgPadding: [5, 3] as [number, number],
    labelBgBorderRadius: 4,
  }));
}

function errorMessage(error: unknown): { message: string; detail?: string } {
  if (error instanceof ApiError) return { message: error.message, detail: error.detail };
  if (error instanceof Error) return { message: error.message };
  return { message: 'An unexpected error occurred.' };
}

export function App() {
  const [session, setSession] = useState<SessionState>();
  const [model, setModel] = useState<ModelData>(EMPTY_MODEL);
  const [viewsData, setViewsData] = useState<ViewsData>(EMPTY_VIEWS);
  const [requirements, setRequirements] = useState<RequirementRecord[]>([]);
  const [systemAbstract, setSystemAbstract] = useState<SystemAbstractDocument | null>(null);
  const [traceabilityOpen, setTraceabilityOpen] = useState(false);
  const [systemAbstractPreferredWidth, setSystemAbstractPreferredWidth] = useState(() =>
    readSystemAbstractWidth(typeof localStorage === 'undefined' ? undefined : localStorage));
  const [workspaceWidth, setWorkspaceWidth] = useState(() => typeof window === 'undefined' ? 1280 : window.innerWidth);
  const [hoveredTraceIds, setHoveredTraceIds] = useState<string[]>([]);
  const [hoveredTraceLabel, setHoveredTraceLabel] = useState<string>();
  const [traceNavigationRequest, setTraceNavigationRequest] = useState<{
    requestId: number;
    traceIds: string[];
    preferredTraceId?: string;
  } | null>(null);
  const [sidebarOpen, setSidebarOpen] = useState(true);
  const [inspectorHeight, setInspectorHeight] = useState(300);
  const [diagram, setDiagram] = useState<DiagramData>();
  const [nodes, setNodes] = useState<SysmlFlowNode[]>([]);
  const [annotationNodes, setAnnotationNodes] = useState<AnnotationFlowNode[]>([]);
  const [edges, setEdges] = useState<SysmlFlowEdge[]>([]);
  const [activeViewId, setActiveViewId] = useState<string>();
  const [activeRootId, setActiveRootId] = useState<string>();
  const [navigationCrumbs, setNavigationCrumbs] = useState<Breadcrumb[]>([]);
  const [selectedId, setSelectedId] = useState<string>();
  const [selectedDetails, setSelectedDetails] = useState<ElementDetails>();
  const [selectedContract, setSelectedContract] = useState<GumboContract>();
  const [detailsLoading, setDetailsLoading] = useState(false);
  const [initialLoading, setInitialLoading] = useState(true);
  const [loadError, setLoadError] = useState<{ message: string; detail?: string }>();
  const [connection, setConnection] = useState<ConnectionStatus>('connecting');
  const [layoutBusy, setLayoutBusy] = useState(false);
  const [validating, setValidating] = useState(false);
  const [checkpointOpen, setCheckpointOpen] = useState(false);
  const [checkpointBusy, setCheckpointBusy] = useState(false);
  const [projectDialogOpen, setProjectDialogOpen] = useState(false);
  const [viewToolsOpen, setViewToolsOpen] = useState(false);
  const [createViewOpen, setCreateViewOpen] = useState(false);
  const [createViewBusy, setCreateViewBusy] = useState(false);
  const [uiMode, setUiMode] = useState<UiMode>(initialUiMode);
  const [interactionMode, setInteractionMode] = useState<CanvasInteractionMode>('pan');
  const [spacePanning, setSpacePanning] = useState(false);
  const [minimapVisible, setMinimapVisible] = useState(initialMinimapVisible);
  const [historyBusy, setHistoryBusy] = useState(false);
  const [historyRevision, setHistoryRevision] = useState(0);
  const [interactionActive, setInteractionActive] = useState(false);
  const [toasts, setToasts] = useState<ToastMessage[]>([]);
  const [dismissedWarningKeys, setDismissedWarningKeys] = useState<Set<string>>(() => new Set());
  const previousIds = useRef(new Set<string>());
  const workspaceRef = useRef<HTMLDivElement>(null);
  const viewsDataRef = useRef<ViewsData>(EMPTY_VIEWS);
  const viewHistories = useRef(new Map<string, ViewHistory>());
  const historyBusyRef = useRef(false);
  const bootstrapped = useRef(false);
  const eventTimer = useRef<number | undefined>(undefined);
  const cameraTimer = useRef<number | undefined>(undefined);
  const layoutMenuRef = useRef<HTMLDetailsElement>(null);
  const layoutAfterRefresh = useRef(false);
  const toastSequence = useRef(0);
  const refreshCurrentRef = useRef<(quiet?: boolean) => Promise<boolean>>(async () => false);
  const refreshViewCurrentRef = useRef<(quiet?: boolean) => Promise<boolean>>(async () => false);
  const refreshGeneration = useRef(0);
  const interactionActiveRef = useRef(false);
  const deferredExternalRefresh = useRef<'view' | 'full' | undefined>(undefined);
  const semanticSelectionRef = useRef<(id: string) => void>(() => undefined);
  const expansionRef = useRef<(element: DiagramNodePayload) => void>(() => undefined);
  const definitionNavigationRef = useRef<(element: DiagramNodePayload) => void>(() => undefined);
  const containerResizeRef = useRef<(element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void>(() => undefined);
  const containerResizeStartRef = useRef<(element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void>(() => undefined);
  const containerResizeDraftRef = useRef<(element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void>(() => undefined);
  const containerResizeGesture = useRef<{
    nodeId: string;
    startPosition: { x: number; y: number };
    startDimensions: { width: number; height: number };
    childPositions: Map<string, { x: number; y: number }>;
    beforeNodes: SysmlFlowNode[];
  } | undefined>(undefined);
  const { fitView, setViewport } = useReactFlow<CanvasFlowNode, SysmlFlowEdge>();

  const activeView = useMemo(
    () => viewsData.views.find((view) => view.id === activeViewId),
    [activeViewId, viewsData.views],
  );
  const selectedNode = useMemo(
    () => nodes.find((node) => node.id === selectedId)?.data.element,
    [nodes, selectedId],
  );
  const selectedContainerMinimum = useMemo(() => {
    const flowNode = nodes.find((node) => node.id === selectedId);
    const constraints = flowNode?.data.resizeConstraints;
    if (!flowNode || !constraints) return undefined;
    const absolute = absoluteNodePosition(flowNode, nodes);
    return assessContainerResize({
      x: absolute.x,
      y: absolute.y,
      width: constraints.minimumWidth,
      height: constraints.minimumHeight,
    }, constraints).required;
  }, [nodes, selectedId]);
  const selectedPort = useMemo<DiagramPort | undefined>(
    () => nodes.flatMap((node) => node.data.element.ports)
      .find((port) => port.id === selectedId || port.elementId === selectedId),
    [nodes, selectedId],
  );
  const activeTraceIds = useMemo(
    () => hoveredTraceIds.length > 0
      ? hoveredTraceIds
      : (selectedContract?.traceIds ?? selectedPort?.traceIds ?? selectedNode?.traceIds ?? selectedDetails?.traceIds ?? []),
    [hoveredTraceIds, selectedContract?.traceIds, selectedDetails?.traceIds, selectedNode, selectedPort?.traceIds],
  );
  const selectedEdgeId = useMemo(
    () => edges.find((edge) => edge.selected)?.id,
    [edges],
  );
  const selectedLayoutIds = useMemo(
    () => nodes.filter((node) => node.selected).map((node) => node.id),
    [nodes],
  );
  const selectedLayoutNode = useMemo(
    () => selectedLayoutIds.length === 1
      ? nodes.find((node) => node.id === selectedLayoutIds[0] && !node.data.element.presentationOnly)
      : undefined,
    [nodes, selectedLayoutIds],
  );
  const systemAbstractMaxWidth = useMemo(
    () => maximumSystemAbstractWidth(workspaceWidth, sidebarOpen ? 240 : 0),
    [sidebarOpen, workspaceWidth],
  );
  const systemAbstractWidth = useMemo(
    () => clampSystemAbstractWidth(systemAbstractPreferredWidth, workspaceWidth, sidebarOpen ? 240 : 0),
    [sidebarOpen, systemAbstractPreferredWidth, workspaceWidth],
  );
  const canvasInteraction = interactionProps(spacePanning ? 'pan' : interactionMode);

  useEffect(() => {
    viewsDataRef.current = viewsData;
  }, [viewsData]);

  useEffect(() => {
    const workspace = workspaceRef.current;
    if (!workspace) return;
    const updateWidth = () => setWorkspaceWidth(workspace.clientWidth);
    updateWidth();
    const observer = new ResizeObserver(updateWidth);
    observer.observe(workspace);
    return () => observer.disconnect();
  }, []);

  const changeInteractionMode = useCallback((mode: CanvasInteractionMode) => {
    setInteractionMode(mode);
    if (mode === 'edit') {
      setSelectedId(undefined);
      setSelectedContract(undefined);
    }
  }, []);

  const changeSystemAbstractWidth = useCallback((width: number) => {
    const resolved = Math.max(MIN_SYSTEM_ABSTRACT_WIDTH, Math.min(MAX_SYSTEM_ABSTRACT_WIDTH, width));
    setSystemAbstractPreferredWidth(resolved);
    try { localStorage.setItem(SYSTEM_ABSTRACT_WIDTH_KEY, String(Math.round(resolved))); } catch { /* Optional browser preference. */ }
  }, []);

  const toggleMinimap = useCallback(() => {
    setMinimapVisible((visible) => {
      const next = !visible;
      try { localStorage.setItem(MINIMAP_VISIBLE_KEY, String(next)); } catch { /* Optional browser preference. */ }
      return next;
    });
  }, []);

  const changeUiMode = useCallback((mode: UiMode) => {
    setUiMode(mode);
    try { localStorage.setItem(UI_MODE_KEY, mode); } catch { /* Storage may be unavailable. */ }
    if (mode === 'explore') setViewToolsOpen(false);
  }, []);

  const assessmentRefreshKey = `${session?.revision ?? ''}:${diagram?.revision ?? ''}:${viewsData.viewRevision ?? ''}:${historyRevision}:${activeView?.showPorts}:${activeView?.showEdgeLabels}:${activeView?.showTypes}`;
  const assessment = useDiagramAssessment({
    rootId: activeRootId,
    viewId: activeViewId,
    refreshKey: assessmentRefreshKey,
    enabled: Boolean(session?.active && diagram && !interactionActive),
  });
  const fidelityStatus = useMemo(
    () => buildFidelityStatusViewModel(assessment.health, assessment.checking, assessment.error),
    [assessment.checking, assessment.error, assessment.health],
  );

  useEffect(() => {
    setDismissedWarningKeys(new Set());
  }, [session?.root]);

  const showToast = useCallback((title: string, tone: ToastMessage['tone'] = 'info', detail?: string) => {
    const id = ++toastSequence.current;
    setToasts((messages) => [...messages.slice(-3), { id, title, tone, detail }]);
    window.setTimeout(() => setToasts((messages) => messages.filter((message) => message.id !== id)), 4500);
  }, []);

  const selectSemanticElement = useCallback((id: string) => {
    semanticSelectionRef.current(id);
  }, []);

  const requestExpansion = useCallback((element: DiagramNodePayload) => {
    expansionRef.current(element);
  }, []);

  const requestDefinitionNavigation = useCallback((element: DiagramNodePayload) => {
    definitionNavigationRef.current(element);
  }, []);

  const requestContainerResize = useCallback((element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => {
    containerResizeRef.current(element, geometry);
  }, []);

  const requestContainerResizeStart = useCallback((element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => {
    containerResizeStartRef.current(element, geometry);
  }, []);

  const requestContainerResizeDraft = useCallback((element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => {
    containerResizeDraftRef.current(element, geometry);
  }, []);

  const applyDiagram = useCallback((nextDiagram: DiagramData, view?: NamedView) => {
    setDiagram({ ...nextDiagram, validation: nextDiagram.validation ?? EMPTY_VALIDATION, diagnostics: nextDiagram.diagnostics ?? [] });
    setNodes(toFlowNodes(
      nextDiagram,
      view,
      previousIds.current,
      selectSemanticElement,
      requestExpansion,
      requestDefinitionNavigation,
      requestContainerResize,
      requestContainerResizeStart,
      requestContainerResizeDraft,
    ));
    setAnnotationNodes(toAnnotationNodes(view));
    setEdges(toFlowEdges(nextDiagram, view?.showEdgeLabels ?? true, view?.edgeRoutes ?? {}));
    previousIds.current = new Set(nextDiagram.nodes.map((node) => node.id));
  }, [requestContainerResize, requestContainerResizeDraft, requestContainerResizeStart, requestDefinitionNavigation, requestExpansion, selectSemanticElement]);

  const acceptViewsDocument = useCallback((nextViews: ViewsData) => {
    viewsDataRef.current = nextViews;
    setViewsData(nextViews);
  }, []);

  const beginCanvasInteraction = useCallback(() => {
    interactionActiveRef.current = true;
    setInteractionActive(true);
  }, []);

  const endCanvasInteraction = useCallback(() => {
    interactionActiveRef.current = false;
    setInteractionActive(false);
    const deferred = deferredExternalRefresh.current;
    deferredExternalRefresh.current = undefined;
    if (!deferred) return;
    if (eventTimer.current) window.clearTimeout(eventTimer.current);
    eventTimer.current = window.setTimeout(() => {
      if (deferred === 'view') void refreshViewCurrentRef.current();
      else void refreshCurrentRef.current();
    }, 180);
  }, []);

  const loadEverything = useCallback(async (
    requestedRoot?: string,
    requestedView?: string,
    quiet = false,
  ) => {
    if (!quiet) setInitialLoading(true);
    setLoadError(undefined);
    try {
      const nextSession = await api.session();
      setSession({ ...nextSession, validation: nextSession.validation ?? EMPTY_VALIDATION });
      if (nextSession.active === false || !nextSession.root) {
        setModel(EMPTY_MODEL);
        setViewsData(EMPTY_VIEWS);
        setRequirements([]);
        setSystemAbstract(null);
        setTraceabilityOpen(false);
        setDiagram(undefined);
        setNodes([]);
        setEdges([]);
        setProjectDialogOpen(true);
        return;
      }
      const [modelResult, viewsResult, requirementsResult, abstractResult] = await Promise.allSettled([
        api.model(),
        api.views(),
        api.requirements(),
        api.systemAbstract(),
      ]);
      const nextModel = modelResult.status === 'fulfilled' ? modelResult.value : EMPTY_MODEL;
      const nextViews = viewsResult.status === 'fulfilled' ? viewsResult.value : EMPTY_VIEWS;
      const combinedRequirements = requirementsResult.status === 'fulfilled' && requirementsResult.value.length
        ? requirementsResult.value
        : nextModel.requirements ?? [];
      const nextSystemAbstract = abstractResult.status === 'fulfilled' ? abstractResult.value : null;
      const nextViewId = requestedView ?? nextSession.activeViewId ?? nextViews.activeViewId ?? nextViews.views[0]?.id;
      const nextView = nextViews.views.find((view) => view.id === nextViewId);
      const nextRootId = requestedRoot ?? nextSession.activeRootId ?? nextView?.rootId ?? nextModel.rootCandidates[0]?.id;
      const nextDiagram = await api.diagram(nextRootId, nextViewId);

      setModel(nextModel);
      viewsDataRef.current = nextViews;
      setViewsData(nextViews);
      setRequirements(combinedRequirements);
      setSystemAbstract(nextSystemAbstract);
      setTraceabilityOpen(Boolean(nextSystemAbstract));
      setActiveViewId(nextViewId);
      setActiveRootId(nextDiagram.rootId ?? nextRootId);
      setNavigationCrumbs(
        nextDiagram.breadcrumbs.length
          ? nextDiagram.breadcrumbs
          : [{ id: nextDiagram.rootId ?? nextRootId ?? 'architecture', label: nextDiagram.title ?? 'Architecture' }],
      );
      applyDiagram(nextDiagram, nextView);
      if (nextView?.camera) window.requestAnimationFrame(() => void setViewport(nextView.camera!, { duration: 0 }));
    } catch (error) {
      setLoadError(errorMessage(error));
    } finally {
      setInitialLoading(false);
    }
  }, [applyDiagram, setViewport]);

  const refreshCurrent = useCallback(async (quiet = true) => {
    const generation = ++refreshGeneration.current;
    try {
      const [nextSession, nextViews, nextModel, nextRequirements, nextSystemAbstract] = await Promise.all([
        api.session(),
        api.views(),
        api.model(),
        api.requirements().catch(() => requirements),
        api.systemAbstract().catch(() => systemAbstract),
      ]);
      const nextViewId = nextSession.activeViewId ?? nextViews.activeViewId ?? activeViewId ?? nextViews.views[0]?.id;
      const nextView = nextViews.views.find((view) => view.id === nextViewId) ?? nextViews.views[0];
      const nextRootId = nextSession.activeRootId ?? nextView?.rootId ?? activeRootId;
      const nextDiagram = await api.diagram(nextRootId, nextViewId);
      if (generation !== refreshGeneration.current) return false;
      const resolvedRootId = nextDiagram.rootId ?? nextRootId;
      const externalNavigationChanged = nextViewId !== activeViewId || resolvedRootId !== activeRootId;

      setSession({ ...nextSession, validation: nextSession.validation ?? EMPTY_VALIDATION });
      acceptViewsDocument(nextViews);
      setModel(nextModel);
      setRequirements(nextRequirements);
      setSystemAbstract(nextSystemAbstract);
      setActiveViewId(nextViewId);
      setActiveRootId(resolvedRootId);
      applyDiagram(nextDiagram, nextView);
      if (externalNavigationChanged) {
        setNavigationCrumbs([
          {
            id: resolvedRootId ?? 'architecture',
            label: nextDiagram.breadcrumbs.at(-1)?.label ?? nextDiagram.title ?? nextView?.name ?? 'Architecture',
          },
        ]);
      }
      if (nextViewId !== activeViewId && nextView?.camera) {
        window.requestAnimationFrame(() => void setViewport(nextView.camera!, { duration: 220 }));
      }
      setLoadError(undefined);
      return true;
    } catch (error) {
      if (!quiet && generation === refreshGeneration.current) setLoadError(errorMessage(error));
      return false;
    }
  }, [acceptViewsDocument, activeRootId, activeViewId, applyDiagram, requirements, setViewport, systemAbstract]);

  /** Refresh only view-dependent state after a mutation from another client. */
  const refreshViewCurrent = useCallback(async (quiet = true) => {
    const generation = ++refreshGeneration.current;
    try {
      const nextViews = await api.views();
      const nextViewId = nextViews.activeViewId ?? activeViewId ?? nextViews.views[0]?.id;
      const nextView = nextViews.views.find((view) => view.id === nextViewId) ?? nextViews.views[0];
      const nextRootId = nextView?.rootId ?? activeRootId;
      const nextDiagram = await api.diagram(nextRootId, nextViewId);
      if (generation !== refreshGeneration.current) return false;
      acceptViewsDocument(nextViews);
      setActiveViewId(nextViewId);
      setActiveRootId(nextDiagram.rootId ?? nextRootId);
      applyDiagram(nextDiagram, nextView);
      setLoadError(undefined);
      return true;
    } catch (error) {
      if (!quiet && generation === refreshGeneration.current) setLoadError(errorMessage(error));
      return false;
    }
  }, [acceptViewsDocument, activeRootId, activeViewId, applyDiagram]);

  useEffect(() => {
    refreshCurrentRef.current = refreshCurrent;
    refreshViewCurrentRef.current = refreshViewCurrent;
  }, [refreshCurrent, refreshViewCurrent]);

  useEffect(() => {
    if (bootstrapped.current) return;
    bootstrapped.current = true;
    void loadEverything();
  }, [loadEverything]);

  useEffect(() => {
    const handleShortcut = (event: KeyboardEvent) => {
      if (isCanvasModeShortcut(event) && !document.querySelector('dialog[open]')) {
        event.preventDefault();
        changeInteractionMode(event.key.toLowerCase() === 'h' ? 'pan' : 'edit');
        return;
      }
      if ((event.metaKey || event.ctrlKey) && event.key.toLowerCase() === 'k') {
        event.preventDefault();
        document.querySelector<HTMLInputElement>('[data-model-search]')?.focus();
      }
      if (event.key === 'Escape') {
        if (document.querySelector('dialog[open]')) return;
        if (viewToolsOpen) {
          setViewToolsOpen(false);
          return;
        }
        setSelectedId(undefined);
        setSelectedContract(undefined);
        setEdges((current) => current.map((edge) => edge.selected ? { ...edge, selected: false } : edge));
      }
    };
    window.addEventListener('keydown', handleShortcut);
    return () => window.removeEventListener('keydown', handleShortcut);
  }, [changeInteractionMode, viewToolsOpen]);

  useEffect(() => {
    const isCanvasTarget = (target: EventTarget | null) => target instanceof HTMLElement && (
      target === document.body ||
      Boolean(target.closest('.react-flow'))
    );
    const startTemporaryPan = (event: KeyboardEvent) => {
      if (
        event.code !== 'Space' ||
        interactionMode !== 'edit' ||
        isEditingText(event.target) ||
        document.querySelector('dialog[open]') ||
        !isCanvasTarget(event.target)
      ) return;
      event.preventDefault();
      setSpacePanning(true);
    };
    const stopTemporaryPan = (event: KeyboardEvent) => {
      if (event.code === 'Space') setSpacePanning(false);
    };
    const resetTemporaryPan = () => setSpacePanning(false);
    window.addEventListener('keydown', startTemporaryPan);
    window.addEventListener('keyup', stopTemporaryPan);
    window.addEventListener('blur', resetTemporaryPan);
    return () => {
      window.removeEventListener('keydown', startTemporaryPan);
      window.removeEventListener('keyup', stopTemporaryPan);
      window.removeEventListener('blur', resetTemporaryPan);
    };
  }, [interactionMode]);

  useEffect(() => {
    const unsubscribe = subscribeToEvents(
      (message) => {
        if (message.type === 'connection.ready') return;
        if (isOwnViewMutationEvent(message)) return;
        const data = message.data && typeof message.data === 'object'
          ? message.data as Record<string, unknown>
          : undefined;
        // Passive layout writes are server-maintained cache healing. They are
        // often emitted while serving this client's mutation and never require
        // a second browser fetch.
        if (message.type === 'view.updated' && data?.passive === true) return;
        const refreshKind = message.type === 'view.updated' ? 'view' : 'full';
        if (interactionActiveRef.current) {
          if (refreshKind === 'full' || deferredExternalRefresh.current === undefined) {
            deferredExternalRefresh.current = refreshKind;
          }
          return;
        }
        if (eventTimer.current) window.clearTimeout(eventTimer.current);
        eventTimer.current = window.setTimeout(() => {
          if (refreshKind === 'view') void refreshViewCurrentRef.current();
          else void refreshCurrentRef.current();
        }, 180);
      },
      setConnection,
    );
    return () => {
      if (eventTimer.current) window.clearTimeout(eventTimer.current);
      unsubscribe();
    };
  }, []);

  useEffect(() => {
    if (!selectedId) {
      setSelectedDetails(undefined);
      return;
    }
    let active = true;
    setSelectedDetails(undefined);
    setDetailsLoading(true);
    api.element(selectedId)
      .then((details) => active && setSelectedDetails(details))
      .catch(() => active && setSelectedDetails(undefined))
      .finally(() => active && setDetailsLoading(false));
    return () => { active = false; };
  }, [selectedId, diagram?.revision]);

  const recordViewHistory = useCallback((viewId: string, before: ViewSnapshot) => {
    const history = viewHistories.current.get(viewId) ?? { undo: [], redo: [] };
    viewHistories.current.set(viewId, {
      undo: boundedPush(history.undo, before),
      redo: [],
    });
    setHistoryRevision((revision) => revision + 1);
  }, []);

  const patchView = useCallback(async (patch: ViewPatch, quiet = false) => {
    if (!activeViewId) {
      if (!quiet) showToast('Create or select a named view before changing its layout.', 'error');
      return false;
    }
    const currentView = viewsDataRef.current.views.find((view) => view.id === activeViewId);
    if (!currentView) {
      if (!quiet) showToast('The active named view is no longer available.', 'error');
      return false;
    }
    const before = snapshotView(currentView);
    const optimisticView = { ...currentView, ...patch } as NamedView;
    const after = snapshotView(optimisticView);
    if (sameSnapshot(before, after)) return true;

    const optimisticData: ViewsData = {
      ...viewsDataRef.current,
      views: viewsDataRef.current.views.map((view) => view.id === activeViewId ? optimisticView : view),
    };
    viewsDataRef.current = optimisticData;
    setViewsData(optimisticData);
    try {
      await api.updateView(activeViewId, patch);
      recordViewHistory(activeViewId, before);
      return true;
    } catch (error) {
      const latestView = viewsDataRef.current.views.find((view) => view.id === activeViewId);
      if (latestView && sameSnapshot(snapshotView(latestView), after)) {
        const revertedData: ViewsData = {
          ...viewsDataRef.current,
          views: viewsDataRef.current.views.map((view) => view.id === activeViewId ? currentView : view),
        };
        viewsDataRef.current = revertedData;
        setViewsData(revertedData);
      } else {
        void refreshCurrentRef.current();
      }
      if (!quiet) {
        const rendered = errorMessage(error);
        showToast('Could not save the view', 'error', rendered.message);
      }
      return false;
    }
  }, [activeViewId, recordViewHistory, showToast]);

  const restoreHistory = useCallback(async (direction: 'undo' | 'redo') => {
    if (!activeViewId || historyBusyRef.current) return;
    const history = viewHistories.current.get(activeViewId);
    const source = direction === 'undo' ? history?.undo : history?.redo;
    const target = direction === 'undo' ? history?.redo : history?.undo;
    const snapshot = source?.at(-1);
    const currentView = viewsDataRef.current.views.find((view) => view.id === activeViewId);
    if (!history || !source || !target || !snapshot || !currentView) return;

    historyBusyRef.current = true;
    setHistoryBusy(true);
    const currentSnapshot = snapshotView(currentView);
    try {
      await api.updateView(activeViewId, snapshotPatch(snapshot));
      const restoredView = restoreViewSnapshot(currentView, snapshot);
      const restoredData: ViewsData = {
        ...viewsDataRef.current,
        views: viewsDataRef.current.views.map((view) => view.id === activeViewId ? restoredView : view),
      };
      viewsDataRef.current = restoredData;
      setViewsData(restoredData);
      source.pop();
      const destination = boundedPush(target, currentSnapshot);
      if (direction === 'undo') history.redo = destination;
      else history.undo = destination;
      setHistoryRevision((revision) => revision + 1);
      await refreshCurrentRef.current(false);
      await setViewport(snapshot.camera, { duration: 220 });
    } catch (error) {
      const rendered = errorMessage(error);
      showToast(`Could not ${direction} the view change`, 'error', rendered.message);
    } finally {
      historyBusyRef.current = false;
      setHistoryBusy(false);
    }
  }, [activeViewId, setViewport, showToast]);

  const undoView = useCallback(() => restoreHistory('undo'), [restoreHistory]);
  const redoView = useCallback(() => restoreHistory('redo'), [restoreHistory]);

  useEffect(() => {
    const handleHistoryShortcut = (event: KeyboardEvent) => {
      if (
        !(event.metaKey || event.ctrlKey) ||
        event.altKey ||
        event.key.toLowerCase() !== 'z' ||
        isEditingText(event.target)
      ) return;
      event.preventDefault();
      void (event.shiftKey ? redoView() : undoView());
    };
    window.addEventListener('keydown', handleHistoryShortcut);
    return () => window.removeEventListener('keydown', handleHistoryShortcut);
  }, [redoView, undoView]);

  const persistNodeLayout = useCallback((
    nextNodes: SysmlFlowNode[],
    nextEdgeRoutes?: Record<string, ViewEdgeRoute>,
  ) => {
    const positions = { ...(activeView?.positions ?? {}) };
    const pinned = new Set(activeView?.pinned ?? []);
    for (const node of nextNodes) {
      const position = absoluteNodePosition(node, nextNodes);
      const dimensions = node.data.element.dimensions;
      positions[node.id] = {
        ...position,
        ...(dimensions ? { width: dimensions.width, height: dimensions.height } : {}),
      };
      if (node.data.element.pinned) pinned.add(node.id);
      else pinned.delete(node.id);
    }
    void patchView({
      positions,
      pinned: [...pinned],
      ...(nextEdgeRoutes ? { edgeRoutes: nextEdgeRoutes } : {}),
    });
  }, [activeView?.pinned, activeView?.positions, patchView]);

  const handleNodesChange = useCallback((changes: NodeChange<CanvasFlowNode>[]) => {
    setNodes((current) => {
      const byId = new Map(current.map((node) => [node.id, node]));
      const constrained = changes.map((change) => {
        if (change.type !== 'position' || !change.position) return change;
        const node = byId.get(change.id) as SysmlFlowNode | undefined;
        const parent = node?.parentId ? byId.get(node.parentId) as SysmlFlowNode | undefined : undefined;
        if (!node || !parent) return change;
        const width = node.data.element.dimensions?.width ?? Number(node.style?.width) ?? 248;
        const height = node.data.element.dimensions?.height ?? Number(node.style?.height) ?? 142;
        const parentWidth = parent.data.element.dimensions?.width ?? Number(parent.style?.width) ?? 640;
        const parentHeight = parent.data.element.dimensions?.height ?? Number(parent.style?.height) ?? 380;
        return {
          ...change,
          position: {
            x: Math.max(28, Math.min(change.position.x, parentWidth - 28 - width)),
            y: Math.max(72, Math.min(change.position.y, parentHeight - 28 - height)),
          },
        };
      });
      return applyNodeChanges(constrained as NodeChange<SysmlFlowNode>[], current);
    });
    setAnnotationNodes((current) => applyNodeChanges(changes as NodeChange<AnnotationFlowNode>[], current));
  }, []);

  const handleEdgesChange = useCallback((changes: EdgeChange<SysmlFlowEdge>[]) => {
    setEdges((current) => applyEdgeChanges(changes, current));
  }, []);

  const handleEdgeAttachmentMove = useCallback((
    edgeId: string,
    end: EdgeAttachmentEnd,
    attachment: EdgeAttachment | undefined,
    commit: boolean,
  ) => {
    const currentView = activeViewId
      ? viewsDataRef.current.views.find((view) => view.id === activeViewId)
      : undefined;
    setEdges((current) => current.map((edge) => {
      if (edge.id !== edgeId) return edge;
      const route = updateManualAttachmentRoute(edge.data?.route ?? currentView?.edgeRoutes[edgeId], end, attachment);
      return { ...edge, data: { ...edge.data, ...(route ? { route } : { route: undefined }) } };
    }));
    if (!commit || !currentView) return;

    const edgeRoutes = { ...(currentView.edgeRoutes ?? {}) };
    const route = updateManualAttachmentRoute(edgeRoutes[edgeId], end, attachment);
    if (route) edgeRoutes[edgeId] = route;
    else delete edgeRoutes[edgeId];
    void patchView({ edgeRoutes });
  }, [activeViewId, patchView]);

  const clearEdgeSelection = useCallback(() => {
    setEdges((current) => current.map((edge) => edge.selected ? { ...edge, selected: false } : edge));
  }, []);

  const navigateToTraceIds = useCallback((traceIds: readonly string[], preferredTraceId?: string) => {
    if (!systemAbstract || traceIds.length === 0) return;
    setViewToolsOpen(false);
    setTraceabilityOpen(true);
    setTraceNavigationRequest((current) => ({
      requestId: (current?.requestId ?? 0) + 1,
      traceIds: [...traceIds],
      ...(preferredTraceId ? { preferredTraceId } : {}),
    }));
  }, [systemAbstract]);

  const handleNodeClick: NodeMouseHandler<CanvasFlowNode> = useCallback((_event, node) => {
    clearEdgeSelection();
    if (interactionMode === 'edit') {
      // React Flow owns layout selection in Edit mode. Opening the drawer on
      // every click would cover the selection; Details is an explicit action.
      setSelectedId(undefined);
      setSelectedContract(undefined);
      return;
    }
    if (node.type === 'annotationNode') {
      const linkedId = node.data.annotation.linkedElementId;
      if (!linkedId) return;
      const linkedNode = nodes.find((candidate) =>
        candidate.id === linkedId ||
        candidate.data.element.elementId === linkedId ||
        candidate.data.element.definitionId === linkedId,
      );
      const selected = linkedNode?.id ?? linkedId;
      setSelectedId(selected);
      if (linkedNode) void fitView({ nodes: [{ id: linkedNode.id }], padding: 0.8, duration: 350, maxZoom: 1.4 });
      return;
    }
    const traceIds = node.data.element.traceIds ?? [];
    navigateToTraceIds(traceIds);
    setSelectedId(node.id);
    setSelectedContract(undefined);
  }, [clearEdgeSelection, fitView, interactionMode, navigateToTraceIds, nodes]);

  const openSelectedLayoutDetails = useCallback(() => {
    if (!selectedLayoutNode) return;
    const element = selectedLayoutNode.data.element;
    navigateToTraceIds(element.traceIds ?? []);
    setSelectedId(selectedLayoutNode.id);
    setSelectedContract(undefined);
  }, [navigateToTraceIds, selectedLayoutNode]);

  const handleNodeMouseEnter: NodeMouseHandler<CanvasFlowNode> = useCallback((_event, node) => {
    if (node.type === 'annotationNode') return;
    setHoveredTraceIds(node.data.element.traceIds ?? []);
    setHoveredTraceLabel(node.data.element.label);
  }, []);

  const handleNodeMouseLeave: NodeMouseHandler<CanvasFlowNode> = useCallback(() => {
    setHoveredTraceIds([]);
    setHoveredTraceLabel(undefined);
  }, []);

  const handleEdgeClick: EdgeMouseHandler<SysmlFlowEdge> = useCallback((_event, edge) => {
    setEdges((current) => current.map((candidate) => ({
      ...candidate,
      selected: candidate.id === edge.id,
    })));
    // Edge selection is represented by React Flow's selected edge state. Do
    // not retain a semantic id that resolves to an empty component inspector.
    setSelectedId(undefined);
    setSelectedContract(undefined);
  }, []);

  const navigateRoot = useCallback(async (
    rootId: string,
    options: {
      history?: 'push' | 'reset' | 'return';
      index?: number;
      label?: string;
      persistViewRoot?: boolean;
    } = {},
  ) => {
    setActiveRootId(rootId);
    setSelectedId(undefined);
    setSelectedContract(undefined);
    try {
      const nextDiagram = await api.diagram(rootId, activeViewId);
      applyDiagram(nextDiagram, activeView);
      const resolvedId = nextDiagram.rootId ?? rootId;
      setActiveRootId(resolvedId);
      const crumb: Breadcrumb = {
        id: resolvedId,
        label: options.label ?? nextDiagram.breadcrumbs.at(-1)?.label ?? nextDiagram.title ?? resolvedId,
      };
      setNavigationCrumbs((current) => {
        if (options.history === 'reset') return [crumb];
        if (options.history === 'return') {
          const index = options.index ?? current.findIndex((entry) => entry.id === resolvedId);
          return index >= 0 ? [...current.slice(0, index), crumb] : [crumb];
        }
        const existingIndex = current.findIndex((entry) => entry.id === resolvedId);
        if (existingIndex >= 0) return [...current.slice(0, existingIndex), crumb];
        return [...current, crumb];
      });
      if (activeViewId && options.persistViewRoot !== false) void patchView({ rootId: resolvedId }, true);
      window.requestAnimationFrame(() => void fitView({ padding: 0.18, duration: 380 }));
    } catch (error) {
      const rendered = errorMessage(error);
      showToast('Could not open that component', 'error', rendered.message);
    }
  }, [activeView, activeViewId, applyDiagram, fitView, patchView, showToast]);

  const openDefinition = useCallback((element: DiagramNodePayload) => {
    if (!element.definitionId) {
      showToast('This element has no component definition to open', 'info');
      return;
    }
    void navigateRoot(element.definitionId, { history: 'push', label: element.label });
  }, [navigateRoot, showToast]);

  useEffect(() => {
    definitionNavigationRef.current = openDefinition;
    return () => { definitionNavigationRef.current = () => undefined; };
  }, [openDefinition]);

  const handleNodeDoubleClick: NodeMouseHandler<CanvasFlowNode> = useCallback((_event, node) => {
    if (node.type === 'annotationNode') return;
    openDefinition(node.data.element);
  }, [openDefinition]);

  const handleNodeDragStop: OnNodeDrag<CanvasFlowNode> = useCallback((_event, dragged) => {
    endCanvasInteraction();
    if (dragged.type === 'annotationNode') {
      const annotations = (activeView?.annotations ?? []).map((annotation) =>
        annotation.id === dragged.data.annotation.id
          ? { ...annotation, position: dragged.position }
          : annotation,
      );
      setAnnotationNodes((current) => current.map((node) => node.id === dragged.id
        ? { ...node, position: dragged.position, data: { annotation: { ...dragged.data.annotation, position: dragged.position } } }
        : node));
      void patchView({ annotations });
      return;
    }
    if (dragged.data.element.presentationOnly) {
      const presentationNodes = (activeView?.presentationNodes ?? []).map((node) =>
        node.id === dragged.id ? { ...node, x: dragged.position.x, y: dragged.position.y } : node,
      );
      setNodes((current) => current.map((node) => node.id === dragged.id ? { ...node, position: dragged.position } : node));
      void patchView({ presentationNodes });
      return;
    }
    const next = nodes.map((node) => node.id === dragged.id
      ? { ...node, position: dragged.position, data: { ...node.data, element: { ...node.data.element, pinned: true } } }
      : node);
    setNodes(next);
    if (!activeViewId || !activeView) return;
    const before = snapshotView(activeView);
    const moved = next.find((node) => node.id === dragged.id)!;
    const absolute = absoluteNodePosition(moved, next);
    void api.moveLayout(activeViewId, { id: dragged.id, x: absolute.x, y: absolute.y, pinned: true })
      .then((nextViews) => {
        acceptViewsDocument(nextViews);
        const updated = nextViews.views.find((view) => view.id === activeViewId);
        if (updated && !sameSnapshot(before, snapshotView(updated))) recordViewHistory(activeViewId, before);
      })
      .catch(async (error) => {
        showToast('Could not move the element', 'error', errorMessage(error).message);
        await refreshViewCurrent(false);
      });
  }, [acceptViewsDocument, activeView, activeView?.annotations, activeViewId, endCanvasInteraction, nodes, patchView, recordViewHistory, refreshViewCurrent, showToast]);

  const beginContainerResize = useCallback((element: DiagramNodePayload, geometry: { x: number; y: number; width: number; height: number }) => {
    beginCanvasInteraction();
    setNodes((current) => {
      containerResizeGesture.current = {
        nodeId: element.id,
        startPosition: { x: geometry.x, y: geometry.y },
        startDimensions: { width: geometry.width, height: geometry.height },
        childPositions: new Map(current
          .filter((node) => node.parentId === element.id)
          .map((node) => [node.id, { ...node.position }])),
        beforeNodes: current,
      };
      return current;
    });
  }, [beginCanvasInteraction]);

  const updateContainerResizeDraft = useCallback((element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => {
    const gesture = containerResizeGesture.current;
    if (!gesture || gesture.nodeId !== element.id) return;
    const compensateX = gesture.startPosition.x - geometry.x;
    const compensateY = gesture.startPosition.y - geometry.y;
    setNodes((current) => current.map((candidate) => {
      if (candidate.id === element.id) return {
        ...candidate,
        position: { x: geometry.x, y: geometry.y },
        style: { ...candidate.style, width: geometry.width, height: geometry.height },
        data: { ...candidate.data, element: { ...candidate.data.element, dimensions: { width: geometry.width, height: geometry.height } } },
      };
      const childStart = gesture.childPositions.get(candidate.id);
      return childStart ? {
        ...candidate,
        position: { x: childStart.x + compensateX, y: childStart.y + compensateY },
      } : candidate;
    }));
  }, []);

  useEffect(() => {
    containerResizeStartRef.current = beginContainerResize;
    containerResizeDraftRef.current = updateContainerResizeDraft;
    return () => {
      containerResizeStartRef.current = () => undefined;
      containerResizeDraftRef.current = () => undefined;
    };
  }, [beginContainerResize, updateContainerResizeDraft]);

  const resizeContainer = useCallback(async (
    element: DiagramNodePayload,
    geometry: { width: number; height: number; x: number; y: number },
  ) => {
    if (!activeViewId || !activeView) {
      endCanvasInteraction();
      return;
    }
    const gesture = containerResizeGesture.current;
    if (
      gesture?.nodeId === element.id &&
      Math.abs(gesture.startPosition.x - geometry.x) < 0.01 &&
      Math.abs(gesture.startPosition.y - geometry.y) < 0.01 &&
      Math.abs(gesture.startDimensions.width - geometry.width) < 0.01 &&
      Math.abs(gesture.startDimensions.height - geometry.height) < 0.01
    ) {
      containerResizeGesture.current = undefined;
      endCanvasInteraction();
      return;
    }
    const node = nodes.find((candidate) => candidate.id === element.id);
    if (!node) {
      endCanvasInteraction();
      return;
    }
    const absolute = absoluteNodePosition({ ...node, position: { x: geometry.x, y: geometry.y } }, nodes);
    const before = snapshotView(activeView);
    const next = nodes.map((candidate) => candidate.id === node.id ? {
      ...candidate,
      position: { x: geometry.x, y: geometry.y },
      style: { ...candidate.style, width: geometry.width, height: geometry.height },
      data: { ...candidate.data, element: { ...candidate.data.element, dimensions: { width: geometry.width, height: geometry.height } } },
    } : candidate);
    setNodes(next);
    try {
      const nextViews = await api.resizeLayout(activeViewId, {
        id: node.id,
        width: geometry.width,
        height: geometry.height,
        x: absolute.x,
        y: absolute.y,
      });
      acceptViewsDocument(nextViews);
      const updated = nextViews.views.find((view) => view.id === activeViewId);
      setNodes((current) => current.map((candidate) => candidate.id === node.id ? {
        ...candidate,
        data: { ...candidate.data, element: { ...candidate.data.element, pinned: true } },
      } : candidate));
      if (updated && !sameSnapshot(before, snapshotView(updated))) recordViewHistory(activeViewId, before);
      containerResizeGesture.current = undefined;
      endCanvasInteraction();
    } catch (error) {
      const gesture = containerResizeGesture.current;
      setNodes(gesture?.nodeId === node.id ? gesture.beforeNodes : nodes);
      containerResizeGesture.current = undefined;
      endCanvasInteraction();
      showToast('Resize was not saved; the previous size was restored', 'error', errorMessage(error).message);
    }
  }, [acceptViewsDocument, activeView, activeViewId, endCanvasInteraction, nodes, recordViewHistory, showToast]);

  useEffect(() => {
    containerResizeRef.current = (element, geometry) => void resizeContainer(element, geometry);
    return () => { containerResizeRef.current = () => undefined; };
  }, [resizeContainer]);

  const resizeSelectedContainer = useCallback((width: number, height: number) => {
    if (!selectedNode) return;
    const flowNode = nodes.find((node) => node.id === selectedNode.id);
    if (!flowNode) return;
    void resizeContainer(selectedNode, { width, height, x: flowNode.position.x, y: flowNode.position.y });
  }, [nodes, resizeContainer, selectedNode]);

  const fitSelectedContainer = useCallback(async () => {
    if (!selectedNode || !activeViewId || !activeView) return;
    const before = snapshotView(activeView);
    try {
      await api.resizeLayout(activeViewId, { id: selectedNode.id, fit: true });
      await refreshCurrent(false);
      const updated = viewsDataRef.current.views.find((view) => view.id === activeViewId);
      if (updated && !sameSnapshot(before, snapshotView(updated))) recordViewHistory(activeViewId, before);
    } catch (error) {
      showToast('Could not fit expanded system contents', 'error', errorMessage(error).message);
    }
  }, [activeView, activeViewId, recordViewHistory, refreshCurrent, selectedNode, showToast]);

  const handleLayout = useCallback(async (repairOnly = false) => {
    setLayoutBusy(true);
    try {
      const semanticNodes = nodes.filter((node) => !node.data.element.presentationOnly);
      const presentation = {
        presentationNodes: activeView?.presentationNodes ?? [],
        annotations: activeView?.annotations ?? [],
      };
      const layout = repairOnly
        ? { ...repairDiagramCollisions(semanticNodes, presentation), edgeRoutes: {} }
        : await layoutDiagram(semanticNodes, edges, presentation);
      const nextEdgeRoutes = { ...(activeView?.edgeRoutes ?? {}) };
      if (!repairOnly) for (const edge of edges) {
        const existing = nextEdgeRoutes[edge.id];
        if (existing?.pinned) continue;
        const generated = layout.edgeRoutes[edge.id];
        if (generated) nextEdgeRoutes[edge.id] = generated;
        else delete nextEdgeRoutes[edge.id];
      }
      const semanticById = new Map(layout.nodes.map((node) => [node.id, node]));
      const presentationById = new Map(layout.presentationNodes.map((node) => [node.id, node]));
      const nextNodes = nodes.map((node) => {
        const semantic = semanticById.get(node.id);
        if (semantic) return semantic;
        const presentationNode = presentationById.get(node.id);
        return presentationNode ? { ...node, position: { x: presentationNode.x, y: presentationNode.y } } : node;
      });
      setNodes(nextNodes);
      setAnnotationNodes(toAnnotationNodes(activeView ? { ...activeView, annotations: layout.annotations } : undefined));
      setEdges((current) => current.map((edge) => ({
        ...edge,
        data: { ...edge.data, route: nextEdgeRoutes[edge.id] },
      })));
      const positions = { ...(activeView?.positions ?? {}) };
      const pinned = new Set(activeView?.pinned ?? []);
      for (const node of layout.nodes) {
        const position = absoluteNodePosition(node, layout.nodes);
        const dimensions = node.data.element.dimensions;
        positions[node.id] = { ...position, ...(dimensions ? dimensions : {}) };
        if (node.data.element.pinned) pinned.add(node.id); else pinned.delete(node.id);
      }
      await patchView({
        positions,
        pinned: [...pinned],
        presentationNodes: layout.presentationNodes,
        annotations: layout.annotations,
        ...(!repairOnly ? { edgeRoutes: nextEdgeRoutes } : {}),
      });
      window.requestAnimationFrame(() => void fitView({ padding: 0.16, duration: 420 }));
      showToast(
        repairOnly ? 'Layout repaired' : 'Diagram tidied',
        'success',
        layout.moved.length
          ? `Moved ${layout.moved.length} object${layout.moved.length === 1 ? '' : 's'}. Pinned elements stayed in place.`
          : 'No repairable collisions were found.',
      );
    } catch (error) {
      showToast('Layout could not be completed', 'error', errorMessage(error).message);
    } finally {
      setLayoutBusy(false);
    }
  }, [activeView, edges, fitView, nodes, patchView, showToast]);

  const patchViewFromAdvancedTools = useCallback(async (patch: ViewPatch) => {
    if (!activeView || (!patch.presentationNodes && !patch.annotations)) return patchView(patch);
    const hasNewPresentation = Boolean(patch.presentationNodes?.some((candidate) =>
      !(activeView.presentationNodes ?? []).some((existing) => existing.id === candidate.id),
    ));
    const hasNewAnnotation = Boolean(patch.annotations?.some((candidate) =>
      !activeView.annotations.some((existing) => existing.id === candidate.id),
    ));
    if (!hasNewPresentation && !hasNewAnnotation) return patchView(patch);
    const repaired = repairDiagramCollisions(
      nodes.filter((node) => !node.data.element.presentationOnly),
      {
        presentationNodes: patch.presentationNodes ?? activeView.presentationNodes ?? [],
        annotations: patch.annotations ?? activeView.annotations,
      },
    );
    return patchView({
      ...patch,
      ...(patch.presentationNodes ? { presentationNodes: repaired.presentationNodes } : {}),
      ...(patch.annotations ? { annotations: repaired.annotations } : {}),
    });
  }, [activeView, nodes, patchView]);

  useEffect(() => {
    if (!layoutAfterRefresh.current) return;
    layoutAfterRefresh.current = false;
    void handleLayout();
  }, [handleLayout, nodes]);

  const runServerLayoutMutation = useCallback(async (
    successTitle: string,
    mutate: (viewId: string) => Promise<unknown>,
    successDetail = 'The affected nodes are pinned. Undo is available in view history.',
  ) => {
    if (!activeViewId) {
      showToast('Create or select a named view before changing its layout.', 'error');
      return;
    }
    const currentView = viewsDataRef.current.views.find((view) => view.id === activeViewId);
    if (!currentView) {
      showToast('The active named view is no longer available.', 'error');
      return;
    }

    const before = snapshotView(currentView);
    layoutMenuRef.current?.removeAttribute('open');
    setLayoutBusy(true);
    try {
      await mutate(activeViewId);
      const refreshed = await refreshCurrent(false);
      if (!refreshed) {
        showToast('The layout changed, but the refreshed view could not be loaded.', 'error');
        return;
      }
      const updatedView = viewsDataRef.current.views.find((view) => view.id === activeViewId);
      const changed = Boolean(updatedView && !sameSnapshot(before, snapshotView(updatedView)));
      if (changed) {
        recordViewHistory(activeViewId, before);
      }
      window.requestAnimationFrame(() => void fitView({ padding: 0.18, duration: 350 }));
      showToast(successTitle, 'success', changed ? successDetail : 'The saved layout already matched this command.');
    } catch (error) {
      showToast('Could not update the layout', 'error', errorMessage(error).message);
    } finally {
      setLayoutBusy(false);
    }
  }, [activeViewId, fitView, recordViewHistory, refreshCurrent, showToast]);

  const alignSelected = useCallback((alignment: LayoutAlignment) => {
    if (selectedLayoutIds.length < 2) {
      showToast('Select at least two nodes to align them.', 'info');
      return;
    }
    void runServerLayoutMutation(
      'Selected nodes aligned',
      (viewId) => api.alignLayout(viewId, selectedLayoutIds, alignment),
    );
  }, [runServerLayoutMutation, selectedLayoutIds, showToast]);

  const distributeSelected = useCallback((axis: LayoutDistribution) => {
    if (selectedLayoutIds.length < 3) {
      showToast('Select at least three nodes to distribute them.', 'info');
      return;
    }
    void runServerLayoutMutation(
      'Selected nodes distributed',
      (viewId) => api.distributeLayout(viewId, selectedLayoutIds, axis),
    );
  }, [runServerLayoutMutation, selectedLayoutIds, showToast]);

  const resetLayout = useCallback(() => {
    if (!activeViewId || !activeView) {
      showToast('Create or select a named view before resetting its layout.', 'error');
      return;
    }
    const hasSavedLayout = Object.keys(activeView.positions).length > 0 ||
      Object.keys(activeView.edgeRoutes ?? {}).length > 0 ||
      activeView.pinned.length > 0;
    if (hasSavedLayout && !window.confirm(
      `Reset all saved node positions, pins, and edge routes in “${activeView.name}”? You can undo this change afterward.`,
    )) return;
    void runServerLayoutMutation(
      'Layout reset',
      (viewId) => api.resetLayout(viewId),
      'Saved positions, pins, and edge routes were reset. Undo is available in view history.',
    );
  }, [activeView, activeViewId, runServerLayoutMutation, showToast]);

  const toggleSelectedPin = useCallback(() => {
    if (!selectedNode) return;
    const next = nodes.map((node) => node.id === selectedNode.id
      ? { ...node, data: { ...node.data, element: { ...node.data.element, pinned: !node.data.element.pinned } } }
      : node);
    setNodes(next);
    persistNodeLayout(next);
  }, [nodes, persistNodeLayout, selectedNode]);

  const hideSelected = useCallback(async () => {
    if (!selectedNode) return;
    const hidden = [...new Set([...(activeView?.hidden ?? []), selectedNode.id])];
    if (await patchView({ hidden })) {
      setNodes((current) => current.filter((node) => node.id !== selectedNode.id));
      setEdges((current) => current.filter((edge) => edge.source !== selectedNode.id && edge.target !== selectedNode.id));
      setSelectedId(undefined);
      showToast('Element hidden in this view', 'success');
    }
  }, [activeView?.hidden, patchView, selectedNode, showToast]);

  const showHidden = useCallback(async () => {
    if (await patchView({ hidden: [] })) {
      showToast('Hidden elements restored', 'success');
      await refreshCurrent(false);
    }
  }, [patchView, refreshCurrent, showToast]);

  const toggleShowPorts = useCallback(async () => {
    if (await patchView({ showPorts: !(activeView?.showPorts ?? true) })) await refreshCurrent(false);
  }, [activeView?.showPorts, patchView, refreshCurrent]);

  const toggleShowEdgeLabels = useCallback(async () => {
    if (await patchView({ showEdgeLabels: !(activeView?.showEdgeLabels ?? true) })) await refreshCurrent(false);
  }, [activeView?.showEdgeLabels, patchView, refreshCurrent]);

  const toggleShowTypes = useCallback(async () => {
    if (await patchView({ showTypes: !(activeView?.showTypes ?? true) })) await refreshCurrent(false);
  }, [activeView?.showTypes, patchView, refreshCurrent]);

  const toggleNodeExpansion = useCallback(async (element: DiagramNodePayload) => {
    if (!element.canExpand && !element.expanded) {
      showToast('This component has no child systems to reveal.', 'info');
      return;
    }
    const expanded = nextExpandedIds(activeView?.expanded ?? [], element);
    if (await patchView({ expanded })) {
      layoutAfterRefresh.current = true;
      if (!await refreshCurrent(false)) layoutAfterRefresh.current = false;
    }
  }, [activeView?.expanded, patchView, refreshCurrent, showToast]);

  useEffect(() => {
    expansionRef.current = (element) => void toggleNodeExpansion(element);
    return () => { expansionRef.current = () => undefined; };
  }, [toggleNodeExpansion]);

  const toggleExpandSelected = useCallback(() => {
    if (selectedNode) void toggleNodeExpansion(selectedNode);
  }, [selectedNode, toggleNodeExpansion]);

  const selectView = useCallback(async (view: NamedView) => {
    setActiveViewId(view.id);
    setActiveRootId(view.rootId);
    setSelectedId(undefined);
    try {
      await api.activateView(view.id);
      const nextDiagram = await api.diagram(view.rootId, view.id);
      applyDiagram(nextDiagram, view);
      setNavigationCrumbs([
        {
          id: nextDiagram.rootId ?? view.rootId,
          label: nextDiagram.breadcrumbs.at(-1)?.label ?? nextDiagram.title ?? view.name,
        },
      ]);
      if (view.camera) await setViewport(view.camera, { duration: 260 });
      else window.requestAnimationFrame(() => void fitView({ padding: 0.18, duration: 350 }));
    } catch (error) {
      showToast('Could not open the named view', 'error', errorMessage(error).message);
    }
  }, [applyDiagram, fitView, setViewport, showToast]);

  const createView = useCallback(async (requestedName: string) => {
    const name = requestedName.trim();
    if (!name || !activeRootId) return;
    setCreateViewBusy(true);
    const positions = Object.fromEntries(nodes.filter((node) => !node.data.element.presentationOnly).map((node) => {
      const position = absoluteNodePosition(node, nodes);
      const dimensions = node.data.element.dimensions;
      return [node.id, { ...position, ...(dimensions ? dimensions : {}) }];
    }));
    try {
      const created = await api.createView({
        id: name.toLowerCase().replace(/[^a-z0-9]+/g, '-').replace(/^-|-$/g, '') || `view-${Date.now()}`,
        name,
        rootId: activeRootId,
        positions,
        edgeRoutes: activeView?.edgeRoutes ?? {},
        pinned: nodes.filter((node) => node.data.element.pinned).map((node) => node.id),
        hidden: [...(activeView?.hidden ?? [])],
        expanded: [...(activeView?.expanded ?? [])],
        aliases: { ...(activeView?.aliases ?? {}) },
        annotations: activeView?.annotations ?? [],
        constraints: activeView?.constraints ?? [],
        presentationNodes: activeView?.presentationNodes ?? [],
        presentationEdges: activeView?.presentationEdges ?? [],
        showPorts: activeView?.showPorts ?? true,
        showEdgeLabels: activeView?.showEdgeLabels ?? true,
        showTypes: activeView?.showTypes ?? true,
      });
      setViewsData((current) => ({ ...current, activeViewId: created.id, views: [...current.views, created] }));
      setActiveViewId(created.id);
      setCreateViewOpen(false);
      showToast(`Created “${name}”`, 'success');
    } catch (error) {
      showToast('Could not create the view', 'error', errorMessage(error).message);
    } finally {
      setCreateViewBusy(false);
    }
  }, [activeRootId, activeView, nodes, showToast, viewsData.views.length]);

  const validate = useCallback(async () => {
    setValidating(true);
    try {
      await api.validate();
      setSession((current) => current ? { ...current, validation: { ...current.validation, status: 'pending' } } : current);
      showToast('Sireum validation started', 'info', 'The canvas remains interactive while it runs.');
    } catch (error) {
      showToast('Validation could not start', 'error', errorMessage(error).message);
    } finally {
      setValidating(false);
    }
  }, [showToast]);

  const saveCheckpoint = useCallback(async (name: string, message: string) => {
    setCheckpointBusy(true);
    try {
      await api.checkpoint(name, message || undefined);
      setCheckpointOpen(false);
      showToast(`Checkpoint “${name}” created`, 'success');
    } catch (error) {
      showToast('Could not create checkpoint', 'error', errorMessage(error).message);
    } finally {
      setCheckpointBusy(false);
    }
  }, [showToast]);

  const exportDiagram = useCallback(async (format: 'png' | 'svg') => {
    try {
      await api.exportDiagram(format, activeRootId, activeViewId);
      showToast(`${format.toUpperCase()} export ready`, 'success');
    } catch (error) {
      showToast('Export failed', 'error', errorMessage(error).message);
    }
  }, [activeRootId, activeViewId, showToast]);

  const openSource = useCallback((source: { file: string; line?: number; column?: number }) => {
    const absolute = source.file.startsWith('/') ? source.file : `${session?.root?.replace(/\/$/, '') ?? ''}/${source.file}`;
    const suffix = `:${source.line ?? 1}:${source.column ?? 1}`;
    window.location.href = `vscode://file${encodeURI(absolute)}${suffix}`;
  }, [session?.root]);

  const selectElement = useCallback(async (id: string, ownerId?: string) => {
    setSelectedContract(undefined);
    clearEdgeSelection();
    const visibleNode = nodes.find((node) =>
      node.id === id || node.data.element.elementId === id || node.data.element.definitionId === id,
    );
    if (visibleNode) {
      setSelectedId(visibleNode.id);
      void fitView({ nodes: [{ id: visibleNode.id }], padding: 0.8, duration: 350, maxZoom: 1.4 });
      return;
    }

    const visiblePortOwner = nodes.find((node) => node.data.element.ports.some((port) =>
      port.id === id || port.elementId === id,
    ));
    if (visiblePortOwner) {
      const port = visiblePortOwner.data.element.ports.find((candidate) =>
        candidate.id === id || candidate.elementId === id,
      );
      setSelectedId(port?.elementId ?? port?.id ?? id);
      void fitView({ nodes: [{ id: visiblePortOwner.id }], padding: 0.8, duration: 350, maxZoom: 1.4 });
      return;
    }

    const visibleEdge = edges.find((edge) => edge.id === id || edge.data?.elementId === id);
    if (visibleEdge) {
      setEdges((current) => current.map((edge) => ({ ...edge, selected: edge.id === visibleEdge.id })));
      setSelectedId(visibleEdge.data?.elementId ?? visibleEdge.id);
      void fitView({
        nodes: [{ id: visibleEdge.source }, { id: visibleEdge.target }],
        padding: 0.8,
        duration: 350,
        maxZoom: 1.4,
      });
      return;
    }

    const definition = model.definitions.find((entry) => entry.id === id);
    const focusRootId = ownerId ?? definition?.id;
    if (focusRootId && focusRootId !== activeRootId) {
      await navigateRoot(focusRootId, {
        history: 'push',
        label: definition?.name ?? focusRootId,
      });
    }
    setSelectedId(id);
  }, [activeRootId, clearEdgeSelection, edges, fitView, model.definitions, navigateRoot, nodes]);

  useEffect(() => {
    semanticSelectionRef.current = (id) => {
      const port = nodes.flatMap((node) => node.data.element.ports)
        .find((candidate) => candidate.id === id || candidate.elementId === id);
      if (!port) {
        void selectElement(id);
        return;
      }
      clearEdgeSelection();
      setSelectedContract(undefined);
      setSelectedId(port.elementId ?? port.id);
      navigateToTraceIds(port.traceIds ?? []);
    };
    return () => { semanticSelectionRef.current = () => undefined; };
  }, [clearEdgeSelection, navigateToTraceIds, nodes, selectElement]);

  const focusContractOwner = useCallback(async (
    ownerId: string | undefined,
    ownerUsageIds: string[] = [],
    label?: string,
  ) => {
    clearEdgeSelection();
    const visibleOwner = nodes.find((node) =>
      ownerUsageIds.some((usageId) => node.id === usageId || node.data.element.elementId === usageId) ||
      node.data.element.definitionId === ownerId ||
      node.data.element.elementId === ownerId,
    );
    if (visibleOwner) {
      setSelectedId(visibleOwner.id);
      void fitView({ nodes: [{ id: visibleOwner.id }], padding: 0.8, duration: 350, maxZoom: 1.4 });
      return;
    }
    if (ownerId) {
      if (ownerId !== activeRootId) {
        await navigateRoot(ownerId, {
          history: 'push',
          label: label ?? ownerId,
          persistViewRoot: false,
        });
      }
      setSelectedId(ownerId);
    }
  }, [activeRootId, clearEdgeSelection, fitView, navigateRoot, nodes]);

  const selectModelContract = useCallback(async (contract: ModelContractRecord) => {
    setSelectedContract(undefined);
    await focusContractOwner(contract.ownerId, contract.ownerUsageIds, contract.ownerName);
    setSelectedContract(contract);
  }, [focusContractOwner]);

  const selectRequirement = useCallback(async (requirement: RequirementRecord) => {
    setSelectedContract(undefined);
    await focusContractOwner(requirement.ownerId, requirement.ownerUsageIds, requirement.ownerName);
    const contract: GumboContract = {
      id: requirement.contractId ?? requirement.id,
      name: requirement.name,
      requirementId: requirement.requirementId,
      kind: requirement.kind ?? 'case',
      text: requirement.text ?? requirement.description ?? '',
      description: requirement.description,
      references: requirement.references,
      traceIds: requirement.traceIds,
      source: requirement.source,
      inferred: requirement.inferred,
    };
    setSelectedContract(contract);
  }, [focusContractOwner]);

  const selectSearchResult = useCallback(async (result: ModelSearchResult) => {
    if (result.kind === 'file') {
      openSource(result.source);
      return;
    }
    if (result.kind === 'requirement') {
      const requirement = requirements.find((entry) => entry.id === result.id);
      if (requirement) {
        await selectRequirement(requirement);
        return;
      }
    }
    if (result.kind === 'gumbo-contract') {
      const requirement = requirements.find((entry) => entry.contractId === result.id);
      if (requirement) {
        await selectRequirement(requirement);
        return;
      }
      try {
        const details = await api.element(result.id);
        await focusContractOwner(details.ownerId ?? result.ownerId, [], result.label);
        setSelectedContract({
          id: details.semanticId ?? result.id,
          name: result.label,
          kind: details.contractKind ?? 'contract',
          text: details.text ?? result.snippet ?? '',
          description: details.description,
          references: details.references,
          traceIds: details.traceIds,
          source: details.source ?? result.source,
        });
        return;
      } catch {
        // Fall through to ordinary semantic inspection if contract lookup fails.
      }
    }
    await selectElement(result.id, result.ownerId);
  }, [focusContractOwner, openSource, requirements, selectElement, selectRequirement]);

  const handleMoveEnd = useCallback((_event: MouseEvent | TouchEvent | null, viewport: Viewport) => {
    endCanvasInteraction();
    // React Flow passes null for fitView/setViewport-driven moves. Persisting
    // those creates a camera mutation -> WebSocket refresh feedback loop.
    if (_event === null) return;
    if (cameraTimer.current) window.clearTimeout(cameraTimer.current);
    cameraTimer.current = window.setTimeout(() => void patchView({ camera: viewport }, true), 450);
  }, [endCanvasInteraction, patchView]);

  const visibleNodes = useMemo(() => {
    const references = new Set(selectedContract?.references ?? []);
    return nodes.map((node) => {
      const element = node.data.element;
      const selectedPort = element.ports.some((port) =>
        port.id === selectedId || port.elementId === selectedId,
      );
      const related = selectedContract ? (
        node.id === selectedId ||
        references.has(node.id) ||
        (element.elementId ? references.has(element.elementId) : false) ||
        (element.definitionId ? references.has(element.definitionId) : false) ||
        references.has(element.label) ||
        element.ports.some((port) => references.has(port.id) || (port.elementId ? references.has(port.elementId) : false) || references.has(port.name))
      ) : false;
      const selectedElementId = selectedPort ? selectedId : undefined;
      if (
        node.data.selectedByContract === related &&
        node.data.selectedElementId === selectedElementId
      ) return node;
      return {
        ...node,
        data: {
          ...node.data,
          editingEnabled: canvasInteraction.editing,
          selectedByContract: related,
          selectedElementId,
        },
      };
    });
  }, [canvasInteraction.editing, nodes, selectedContract, selectedId]);

  const visibleEdges = useMemo(() => {
    const annotationEdges = diagram ? toAnnotationEdges(diagram, activeView) : [];
    const interactiveEdges = [...edges, ...annotationEdges].map((edge) => ({
      ...edge,
      data: {
        ...edge.data,
        editingEnabled: canvasInteraction.editing,
        onMoveAttachment: handleEdgeAttachmentMove,
      },
    }));
    if (!selectedContract) return interactiveEdges;
    const references = new Set(selectedContract.references ?? []);
    return interactiveEdges.map((edge) => {
      const related = references.has(edge.id) ||
        (edge.data?.elementId ? references.has(edge.data.elementId) : false) ||
        references.has(edge.source) ||
        references.has(edge.target) ||
        references.has(String(edge.sourceHandle)) ||
        references.has(String(edge.targetHandle));
      return related ? { ...edge, animated: true, className: `${edge.className ?? ''} contract-related`, style: { ...edge.style, stroke: '#8b5cf6', strokeWidth: 2.4 } } : { ...edge, className: `${edge.className ?? ''} contract-dimmed` };
    });
  }, [activeView, canvasInteraction.editing, diagram, edges, handleEdgeAttachmentMove, selectedContract]);

  const canvasNodes = useMemo<CanvasFlowNode[]>(
    () => [...visibleNodes, ...annotationNodes],
    [annotationNodes, visibleNodes],
  );

  const rawDiagnostics = [...(diagram?.diagnostics ?? []), ...(session?.validation.diagnostics ?? [])];
  const diagnostics = visibleDiagnostics(rawDiagnostics, dismissedWarningKeys);
  const stale = ['invalid', 'stale', 'error'].includes(session?.parseStatus ?? '') || (session && diagram ? String(session.revision) !== String(diagram.revision) : false);
  const hiddenCount = activeView?.hidden.length ?? 0;
  const activeHistory = useMemo(
    () => activeViewId ? viewHistories.current.get(activeViewId) : undefined,
    [activeViewId, historyRevision],
  );
  const canUndo = !historyBusy && (activeHistory?.undo.length ?? 0) > 0;
  const canRedo = !historyBusy && (activeHistory?.redo.length ?? 0) > 0;

  return (
    <div className="app-shell">
      <Header
        canRedo={canRedo}
        canUndo={canUndo}
        connection={connection}
        mode={uiMode}
        status={fidelityStatus}
        repairBusy={layoutBusy}
        isValidating={validating}
        onCheckpoint={() => setCheckpointOpen(true)}
        onExport={exportDiagram}
        onRedo={() => void redoView()}
        onRefresh={() => void refreshCurrent(false)}
        onUndo={() => void undoView()}
        onValidate={() => void validate()}
        onModeChange={changeUiMode}
        onOpenProject={() => setProjectDialogOpen(true)}
        onRepair={() => void handleLayout(true)}
        onTools={() => {
          setTraceabilityOpen(false);
          setViewToolsOpen(true);
        }}
        session={session}
      />

      <div
        className={`workspace ${sidebarOpen ? 'sidebar-open' : 'sidebar-closed'} ${selectedId ? 'inspector-open' : ''} ${viewToolsOpen ? 'tools-open' : ''} ${traceabilityOpen && systemAbstract ? 'traceability-open' : ''}`}
        ref={workspaceRef}
        style={{ '--traceability-panel-width': `${systemAbstractWidth}px` } as React.CSSProperties}
      >
        {sidebarOpen && <Sidebar
          mode={uiMode}
          activeRootId={activeRootId}
          activeViewId={activeViewId}
          hiddenCount={hiddenCount}
          model={model}
          onCreateView={() => setCreateViewOpen(true)}
          onSelectElement={(id, ownerDefinitionId) => void selectElement(id, ownerDefinitionId)}
          onSelectRequirement={selectRequirement}
          onSelectRoot={(id) => void navigateRoot(id, { history: 'reset' })}
          onSelectSearchResult={(result) => void selectSearchResult(result)}
          onSelectView={(view) => void selectView(view)}
          onShowHidden={() => void showHidden()}
          onToggleEdgeLabels={() => void toggleShowEdgeLabels()}
          onTogglePorts={() => void toggleShowPorts()}
          onToggleTypes={() => void toggleShowTypes()}
          onOpenProject={() => setProjectDialogOpen(true)}
          onClose={() => setSidebarOpen(false)}
          requirements={requirements}
          session={session}
          showEdgeLabels={activeView?.showEdgeLabels ?? true}
          showPorts={activeView?.showPorts ?? true}
          showTypes={activeView?.showTypes ?? true}
          views={viewsData.views}
        />}

        <main
          className={`canvas-region interaction-${canvasInteraction.editing ? 'edit' : 'pan'}`}
          style={{ '--inspector-drawer-height': `${inspectorHeight}px` } as React.CSSProperties}
        >
          {initialLoading && <LoadingCanvas />}
          {!initialLoading && loadError && <ErrorCanvas detail={loadError.detail} message={loadError.message} onRetry={() => void loadEverything(activeRootId, activeViewId)} />}
          {!initialLoading && !loadError && (
            <>
              <ReactFlow<CanvasFlowNode, SysmlFlowEdge>
                colorMode="light"
                defaultEdgeOptions={{ type: 'routed' }}
                edges={visibleEdges}
                edgeTypes={edgeTypes}
                elevateEdgesOnSelect
                fitView
                fitViewOptions={{ padding: 0.18, maxZoom: 1.15 }}
                minZoom={0.14}
                nodeTypes={nodeTypes}
                nodes={canvasNodes}
                nodesConnectable={false}
                nodesDraggable={canvasInteraction.nodesDraggable}
                onEdgeClick={handleEdgeClick}
                onEdgesChange={handleEdgesChange}
                onMoveEnd={handleMoveEnd}
                onMoveStart={beginCanvasInteraction}
                onNodeClick={handleNodeClick}
                onNodeDoubleClick={handleNodeDoubleClick}
                onNodeDragStop={handleNodeDragStop}
                onNodeDragStart={beginCanvasInteraction}
                onNodeMouseEnter={handleNodeMouseEnter}
                onNodeMouseLeave={handleNodeMouseLeave}
                onNodesChange={handleNodesChange}
                onPaneClick={() => {
                  clearEdgeSelection();
                  setSelectedId(undefined);
                  setSelectedContract(undefined);
                }}
                proOptions={{ hideAttribution: true }}
                panActivationKeyCode="Space"
                panOnDrag={canvasInteraction.panOnDrag}
                selectionOnDrag={canvasInteraction.selectionOnDrag}
              >
                <Background color="#d9e0e8" gap={24} size={1} variant={BackgroundVariant.Dots} />
                <Controls position="bottom-left" showInteractive={false} />
                {minimapVisible && <MiniMap
                  className="diagram-minimap"
                  maskColor="rgba(240, 244, 248, 0.72)"
                  nodeColor={(node) => {
                    const category = String((node.data as { element?: { category?: string } })?.element?.category ?? '').toLowerCase();
                    if (category.includes('device')) return '#55a68a';
                    if (category.includes('thread')) return '#a17bd1';
                    if (category.includes('process')) return '#e0a044';
                    return '#5d89d8';
                  }}
                  pannable
                  position="bottom-right"
                  zoomable
                />}
              </ReactFlow>

              <div className="canvas-topbar">
                <nav className="breadcrumbs" aria-label="Model hierarchy">
                  {navigationCrumbs.map((crumb, index) => (
                    <span key={crumb.id}>
                      {index > 0 && <Icon name="chevron-right" size={13} />}
                      <button className={index === navigationCrumbs.length - 1 ? 'current' : ''} onClick={() => void navigateRoot(crumb.id, { history: 'return', index, label: crumb.label })}>{crumb.label}</button>
                    </span>
                  ))}
                  {!navigationCrumbs.length && <span><button className="current">Architecture</button></span>}
                </nav>

                <div className="canvas-actions">
                  <div className="interaction-mode-control" role="group" aria-label="Canvas interaction mode">
                    <button
                      aria-keyshortcuts="H"
                      aria-label="Pan canvas"
                      aria-pressed={interactionMode === 'pan'}
                      onClick={() => changeInteractionMode('pan')}
                      title="Pan canvas (H); hold Space to pan temporarily while editing"
                    ><Icon name="hand" size={14} /><span>Pan</span></button>
                    <button
                      aria-keyshortcuts="V"
                      aria-label="Edit layout"
                      aria-pressed={interactionMode === 'edit'}
                      onClick={() => changeInteractionMode('edit')}
                      title="Edit layout (V): move, resize, and arrange diagram objects"
                    ><Icon name="component" size={14} /><span>Edit</span></button>
                  </div>
                  {interactionMode === 'edit' && (
                    <button
                      disabled={!selectedLayoutNode}
                      onClick={openSelectedLayoutDetails}
                      title={selectedLayoutNode ? `Open details for ${selectedLayoutNode.data.element.label}` : 'Select one semantic component to open its details'}
                    ><Icon name="eye" size={14} />Details</button>
                  )}
                  <button disabled={layoutBusy || !nodes.length} onClick={() => void handleLayout()} title="Tidy unpinned elements to reduce overlaps, crossings, and connector length">
                    {layoutBusy ? <span className="button-spinner dark" /> : <Icon name="layout" size={14} />}
                    {layoutBusy ? 'Tidying…' : 'Tidy layout'}
                  </button>
                  {uiMode === 'advanced' && <details className="canvas-layout-menu" ref={layoutMenuRef}>
                    <summary aria-label="Open alignment and distribution controls" title="Arrange selected nodes">
                      <Icon name="more" size={14} />
                      Arrange
                      {selectedLayoutIds.length > 0 && <span className="layout-selection-count">{selectedLayoutIds.length}</span>}
                      <Icon name="chevron-down" size={11} />
                    </summary>
                    <div className="canvas-layout-popover">
                      <div className="layout-menu-heading"><strong>Align selection</strong><small>2+ nodes</small></div>
                      <div className="layout-command-grid" role="group" aria-label="Align selected nodes">
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('left')} title="Align left edges">Left</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('center-x')} title="Align horizontal centers">Center</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('right')} title="Align right edges">Right</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('top')} title="Align top edges">Top</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('center-y')} title="Align vertical centers">Middle</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 2} onClick={() => alignSelected('bottom')} title="Align bottom edges">Bottom</button>
                      </div>
                      <div className="layout-menu-heading"><strong>Distribute</strong><small>3+ nodes</small></div>
                      <div className="layout-command-grid distribution" role="group" aria-label="Distribute selected nodes">
                        <button disabled={layoutBusy || selectedLayoutIds.length < 3} onClick={() => distributeSelected('horizontal')}>Horizontal</button>
                        <button disabled={layoutBusy || selectedLayoutIds.length < 3} onClick={() => distributeSelected('vertical')}>Vertical</button>
                      </div>
                      <button className="layout-reset-command" disabled={layoutBusy || !activeViewId} onClick={resetLayout}><Icon name="refresh" size={13} />Reset layout</button>
                    </div>
                  </details>}
                  {uiMode === 'advanced' && <button disabled={!selectedNode} onClick={toggleSelectedPin} title={selectedNode ? 'Pin or unpin selected element' : 'Select a rendered node to pin it'}><Icon name={selectedNode?.pinned ? 'pin-off' : 'pin'} size={14} />{selectedNode?.pinned ? 'Unpin' : 'Pin'}</button>}
                  <details className="canvas-layout-menu display-menu">
                    <summary aria-label="Open display settings" title="Display settings"><Icon name="eye" size={14} />Display<Icon name="chevron-down" size={11} /></summary>
                    <div className="canvas-layout-popover display-popover">
                      <button aria-pressed={activeView?.showPorts ?? true} onClick={() => void toggleShowPorts()}>Ports</button>
                      <button aria-pressed={activeView?.showEdgeLabels ?? true} onClick={() => void toggleShowEdgeLabels()}>Edge labels</button>
                      <button aria-pressed={activeView?.showTypes ?? true} onClick={() => void toggleShowTypes()}>Type details</button>
                      <button aria-pressed={minimapVisible} onClick={toggleMinimap}>Minimap</button>
                      {hiddenCount > 0 && <button onClick={() => void showHidden()}>Show {hiddenCount} hidden</button>}
                    </div>
                  </details>
                  <button onClick={() => void fitView({ padding: 0.18, duration: 350 })} title="Fit diagram to viewport"><Icon name="focus" size={14} />Fit</button>
                </div>
              </div>

              <div className="canvas-panel-toggles" role="group" aria-label="Workspace panels">
                <button
                  aria-pressed={sidebarOpen}
                  onClick={() => setSidebarOpen((open) => !open)}
                  title={sidebarOpen ? 'Hide model sidebar' : 'Show model sidebar'}
                ><Icon name="layers" size={14} />{sidebarOpen ? 'Hide sidebar' : 'Show sidebar'}</button>
              </div>

              {hoveredTraceIds.length > 0 && (
                <div className="trace-navigation-hint" role="status">
                  <Icon name="requirement" size={14} />
                  <span>Click <strong>{hoveredTraceLabel}</strong> to inspect it and navigate to {hoveredTraceIds.length === 1 ? hoveredTraceIds[0] : `${hoveredTraceIds.length} linked abstract ranges`}.</span>
                </div>
              )}

              <DiagnosticsBanner
                diagnostics={diagnostics}
                onDismissAllWarnings={() => setDismissedWarningKeys((current) => {
                  const next = new Set(current);
                  rawDiagnostics.filter((diagnostic) => diagnostic.severity === 'warning')
                    .forEach((diagnostic) => next.add(diagnosticKey(diagnostic)));
                  return next;
                })}
                onDismissWarning={(diagnostic) => setDismissedWarningKeys((current) => new Set(current).add(diagnosticKey(diagnostic)))}
                stale={Boolean(stale)}
              />
              {selectedEdgeId && canvasInteraction.editing && (
                <div className="edge-attachment-hint" role="status">
                  <Icon name="port" size={14} />
                  <span><strong>Adjust edge endpoints</strong> Drag the green source or blue target dot around its node. Double-click a dot to restore automatic placement.</span>
                </div>
              )}
              {!nodes.length && <EmptyCanvas onLayout={() => void handleLayout()} />}
              <div className="canvas-legend">
                <span><i className="legend-system" />System</span>
                <span><i className="legend-process" />Process</span>
                <span><i className="legend-thread" />Thread</span>
                <span><i className="legend-device" />Device</span>
                <em>{nodes.length} components · {edges.length} connections · {nodes.reduce((sum, node) => sum + countContracts(node.data.element), 0)} contracts</em>
              </div>

              {selectedId && !viewToolsOpen && (
                <Inspector
                  details={selectedDetails}
                  height={inspectorHeight}
                  key={selectedId}
                  loading={detailsLoading}
                  minimumContainerSize={selectedContainerMinimum}
                  node={selectedNode}
                  onClose={() => {
                    setSelectedId(undefined);
                    setSelectedContract(undefined);
                  }}
                  onExpand={() => void toggleExpandSelected()}
                  onFitContents={() => void fitSelectedContainer()}
                  onHeightChange={setInspectorHeight}
                  onHide={() => void hideSelected()}
                  onOpen={() => selectedNode && openDefinition(selectedNode)}
                  onOpenSource={openSource}
                  onPin={toggleSelectedPin}
                  onResize={resizeSelectedContainer}
                  onSelectContract={setSelectedContract}
                  onTraceHover={(traceIds) => {
                    setHoveredTraceIds([...traceIds]);
                    setHoveredTraceLabel(traceIds.length > 0 ? 'trace chip' : undefined);
                  }}
                  onTraceNavigate={navigateToTraceIds}
                  selectedContractId={selectedContract?.id}
                  traceIds={selectedPort?.traceIds ?? selectedNode?.traceIds ?? selectedDetails?.traceIds ?? []}
                />
              )}
            </>
          )}
        </main>

        {traceabilityOpen && !viewToolsOpen && systemAbstract && (
          <TraceabilityPanel
            activeTraceIds={activeTraceIds}
            contracts={model.contracts ?? []}
            document={systemAbstract}
            navigationRequest={traceNavigationRequest}
            maxWidth={systemAbstractMaxWidth}
            minWidth={MIN_SYSTEM_ABSTRACT_WIDTH}
            onClose={() => setTraceabilityOpen(false)}
            onSelectContract={(contract) => void selectModelContract(contract)}
            onWidthChange={changeSystemAbstractWidth}
            width={systemAbstractWidth}
          />
        )}

        {!traceabilityOpen && systemAbstract && (
          <button
            className="traceability-restore-tab"
            onClick={() => {
              setViewToolsOpen(false);
              setTraceabilityOpen(true);
            }}
            title="Open System Abstract"
          ><Icon name="requirement" size={14} /><span>System abstract</span></button>
        )}

        <ViewTools
          diagram={diagram}
          model={model}
          onCheckpoint={() => setCheckpointOpen(true)}
          onClose={() => setViewToolsOpen(false)}
          onExport={(format) => void exportDiagram(format)}
          onLayoutMutation={(title, action) => runServerLayoutMutation(title, action)}
          onPatch={patchViewFromAdvancedTools}
          onRefresh={() => refreshCurrent(false)}
          onValidate={() => void validate()}
          open={viewToolsOpen}
          selectedEdgeId={selectedEdgeId}
          selectedId={selectedId}
          session={session}
          view={activeView}
          views={viewsData}
        />

      </div>

      <ProjectDialog
        canCancel={Boolean(session?.active)}
        onCancel={() => setProjectDialogOpen(false)}
        onOpened={async () => {
          setProjectDialogOpen(false);
          viewHistories.current.clear();
          previousIds.current.clear();
          await loadEverything();
        }}
        open={projectDialogOpen}
      />

      <CheckpointDialog busy={checkpointBusy} onClose={() => setCheckpointOpen(false)} onSave={(name, message) => void saveCheckpoint(name, message)} open={checkpointOpen} />
      <CreateSavedDiagramDialog
        busy={createViewBusy}
        defaultName={`Architecture ${viewsData.views.length + 1}`}
        onClose={() => setCreateViewOpen(false)}
        onSave={(name) => void createView(name)}
        open={createViewOpen}
      />
      <Toasts messages={toasts} onDismiss={(id) => setToasts((messages) => messages.filter((message) => message.id !== id))} />
    </div>
  );
}
