import type { Edge, Node, Viewport } from '@xyflow/react';
import type { ContainerResizeConstraints } from '@sysml-viz/core/container-geometry';

export type ParseStatus = 'idle' | 'parsing' | 'valid' | 'invalid' | 'stale' | 'error' | string;
export type ValidationStatus =
  | 'not-run'
  | 'pending'
  | 'valid'
  | 'invalid'
  | 'stale'
  | 'tool-error'
  | string;

export interface SourceLocation {
  file: string;
  line?: number;
  column?: number;
  endLine?: number;
  endColumn?: number;
  text?: string;
}

export interface Diagnostic {
  id?: string;
  severity: 'error' | 'warning' | 'info' | string;
  message: string;
  code?: string;
  source?: SourceLocation;
  suggestion?: string;
}

export interface ValidationState {
  status: ValidationStatus;
  message?: string;
  startedAt?: string;
  completedAt?: string;
  revision?: string | number;
  diagnostics?: Diagnostic[];
}

export interface SessionState {
  active?: boolean;
  workspaceRoot?: string;
  root: string | null;
  libraryRoots: string[];
  include?: string[];
  exclude?: string[];
  files: string[];
  revision: string | number;
  parseStatus: ParseStatus;
  validation: ValidationState;
  activeRootId?: string;
  activeViewId?: string;
}

export interface ProjectConfiguration {
  root: string;
  libraryRoots: string[];
  include: string[];
  exclude: string[];
}

export interface ProjectPreview extends ProjectConfiguration {
  projectFileCount: number;
  libraryFileCount: number;
  totalFileCount: number;
}

export interface WorkspaceDirectory {
  workspaceRoot: string;
  path: string;
  parent: string | null;
  directories: Array<{ name: string; path: string }>;
}

export type PortDirection = 'in' | 'out' | 'inout' | 'input' | 'output' | string;

export interface DiagramPort {
  id: string;
  elementId?: string;
  name: string;
  direction: PortDirection;
  typeName?: string;
  traceIds?: string[];
}

export interface ContractCounts {
  assumptions: number;
  guarantees: number;
  cases: number;
  invariants: number;
  requirements: number;
}

export type ContractKind =
  | 'assumption'
  | 'guarantee'
  | 'case'
  | 'invariant'
  | 'function'
  | 'state'
  | 'initialize'
  | string;

export interface GumboContract {
  id: string;
  name: string;
  kind: ContractKind;
  text: string;
  description?: string;
  requirementId?: string;
  references?: string[];
  traceIds?: string[];
  source?: SourceLocation;
  verificationStatus?: ValidationStatus;
  inferred?: boolean;
}

/** A contract plus enough ownership context to focus it from an abstract link. */
export interface ModelContractRecord extends GumboContract {
  ownerId: string;
  ownerName?: string;
  ownerUsageIds?: string[];
}

export interface ElementDetails {
  id: string;
  semanticId?: string;
  label: string;
  qualifiedName?: string;
  typeName?: string;
  category?: string;
  kind?: string;
  ownerId?: string;
  contractId?: string;
  contractKind?: ContractKind;
  description?: string;
  text?: string;
  references?: string[];
  parentId?: string;
  source?: SourceLocation;
  ports: DiagramPort[];
  contracts: GumboContract[];
  connections?: Array<{
    id: string;
    label?: string;
    source: string;
    target: string;
  }>;
  children?: string[];
  validation?: ValidationState;
  traceIds?: string[];
}

export interface DiagramNodePayload {
  id: string;
  elementId?: string;
  definitionId?: string;
  kind: string;
  label: string;
  typeName?: string;
  category?: string;
  parentId?: string;
  canExpand?: boolean;
  expanded?: boolean;
  dimensions?: { width: number; height: number };
  position: { x: number; y: number };
  pinned: boolean;
  ports: DiagramPort[];
  contractCounts: ContractCounts;
  contracts?: GumboContract[];
  source?: SourceLocation;
  qualifiedName?: string;
  isNew?: boolean;
  presentationOnly?: boolean;
  traceIds?: string[];
}

export interface DiagramEdgePayload {
  id: string;
  elementId?: string;
  source: string;
  sourcePort?: string;
  target: string;
  targetPort?: string;
  label?: string;
  unresolved?: boolean;
  sourceLocation?: SourceLocation;
  presentationKind?: 'reference' | 'informational';
  presentationOnly?: boolean;
  bendPoints?: Array<{ x: number; y: number }>;
  traceIds?: string[];
}

export interface MarkdownTraceAnchor {
  id: string;
  heading?: string;
  startLine: number;
  endLine: number;
  startOffset: number;
  endOffset: number;
  text: string;
}

export interface SystemAbstractDocument {
  schemaVersion: 1;
  path: string;
  relativePath: string;
  markdown: string;
  anchors: MarkdownTraceAnchor[];
  taggedElementCount: number;
  traceAssociationCount: number;
  referencedTraceIds: string[];
  unresolvedTraceIds: string[];
  duplicateAnchorIds: string[];
}

export interface Breadcrumb {
  id: string;
  label: string;
}

export interface DiagramData {
  revision: string | number;
  rootId: string;
  title?: string;
  nodes: DiagramNodePayload[];
  edges: DiagramEdgePayload[];
  breadcrumbs: Breadcrumb[];
  diagnostics: Diagnostic[];
  validation: ValidationState;
}

export interface ModelDefinition {
  id: string;
  name: string;
  qualifiedName?: string;
  typeName?: string;
  category?: string;
  kind?: string;
  parentId?: string;
  childIds?: string[];
  children?: ModelDefinition[];
  source?: SourceLocation;
}

/**
 * One occurrence in the model explorer. Unlike ModelDefinition, this is an
 * instance/containment tree: a reused definition can appear at several paths.
 */
export interface ModelHierarchyItem {
  /** Stable, occurrence-specific key used only by the explorer. */
  id: string;
  /** Semantic part, port, or definition ID used for selection/inspection. */
  elementId: string;
  definitionId?: string;
  ownerDefinitionId?: string;
  name: string;
  qualifiedName?: string;
  typeName?: string;
  category?: string;
  kind: 'component' | 'port';
  direction?: PortDirection;
  root?: boolean;
  recursive?: boolean;
  unresolved?: boolean;
  source?: SourceLocation;
  children: ModelHierarchyItem[];
}

export interface RequirementRecord {
  id: string;
  name: string;
  requirementId?: string;
  contractId?: string;
  ownerId?: string;
  ownerUsageIds?: string[];
  ownerName?: string;
  kind?: ContractKind;
  description?: string;
  text?: string;
  references?: string[];
  traceIds?: string[];
  source?: SourceLocation;
  inferred?: boolean;
  urls?: string[];
}

export interface ModelSearchResult {
  id: string;
  label: string;
  qualifiedName?: string;
  kind: string;
  score: number;
  snippet?: string;
  ownerId?: string;
  source: SourceLocation;
}

export interface ModelData {
  definitions: ModelDefinition[];
  rootCandidates: ModelDefinition[];
  hierarchy?: ModelHierarchyItem[];
  contracts: ModelContractRecord[];
  requirements: RequirementRecord[];
}

export interface ViewCamera {
  x: number;
  y: number;
  zoom: number;
}

export interface ViewAnnotation {
  id: string;
  text: string;
  position: { x: number; y: number };
  linkedElementId?: string;
  style?: 'info' | 'success' | 'warning' | 'error';
  arrow?: { targetId: string; targetKind: 'node' | 'port' };
}

export interface ViewEdgeRoute {
  pinned: boolean;
  points: Array<{ x: number; y: number }>;
  sourceAttachment?: EdgeAttachment;
  targetAttachment?: EdgeAttachment;
}

export type EdgeAttachmentSide = 'top' | 'right' | 'bottom' | 'left';

export interface EdgeAttachment {
  side: EdgeAttachmentSide;
  /** Normalized position along the selected side, from 0 to 1. */
  offset: number;
}

export type EdgeAttachmentEnd = 'source' | 'target';

export interface NamedView {
  id: string;
  name: string;
  rootId: string;
  positions: Record<string, { x: number; y: number; width?: number; height?: number }>;
  edgeRoutes: Record<string, ViewEdgeRoute>;
  pinned: string[];
  hidden: string[];
  expanded: string[];
  aliases: Record<string, string>;
  annotations: ViewAnnotation[];
  constraints?: Array<{ id: string; relation: 'above' | 'below' | 'left-of' | 'right-of'; subjectId: string; objectId: string; gap?: number }>;
  presentationNodes?: Array<{ id: string; label: string; kind: 'actor' | 'reference'; x: number; y: number; width?: number; height?: number }>;
  presentationEdges?: Array<{ id: string; sourceId: string; targetId: string; label?: string; kind: 'reference' | 'informational'; bendPoints?: Array<{ x: number; y: number }> }>;
  showPorts?: boolean;
  showEdgeLabels?: boolean;
  showTypes?: boolean;
  camera?: ViewCamera;
}

export interface ViewsData {
  schemaVersion: number;
  viewRevision?: number;
  activeViewId?: string;
  views: NamedView[];
  mutations?: ViewMutation[];
}

export interface ViewMutation {
  id?: string;
  at?: string;
  operation?: string;
  actor?: string;
  client?: string;
  viewId?: string;
  targetIds?: string[];
}

export interface DiagramHealth {
  nodeCount: number;
  edgeCount: number;
  unresolvedEndpointCount: number;
  overlapCount: number;
  crossingCount: number;
  hiddenElementCount: number;
  unresolvedEdgeIds: string[];
  overlaps: Array<{ firstNodeId: string; secondNodeId: string; area: number }>;
  crossings: Array<{ firstEdgeId: string; secondEdgeId: string; at: { x: number; y: number } }>;
  labelCollisionCount: number;
  truncatedTextCount: number;
  outOfBoundsCount: number;
  labelCollisions: unknown[];
  truncatedTexts: unknown[];
  outOfBounds: unknown[];
  status: 'clear' | 'attention' | 'blocked';
  findings: DiagramHealthFinding[];
  danglingPresentationLinkCount: number;
  danglingPresentationLinkIds: string[];
  routeObjectCollisionCount: number;
  routeObjectCollisions: unknown[];
  fidelity: DiagramFidelity;
}

export interface DiagramHealthFinding {
  code:
    | 'unresolved-endpoint'
    | 'object-overlap'
    | 'dangling-presentation-link'
    | 'route-object-collision'
    | 'out-of-bounds'
    | 'truncated-text'
    | 'label-collision'
    | 'edge-crossing';
  severity: 'attention' | 'blocked';
  message: string;
  count: number;
  elementIds: string[];
  repairable: boolean;
}

export interface DiagramFidelity {
  state: 'validated' | 'local' | 'partial' | 'stale' | 'invalid';
  label: string;
  summary: string;
  scope: 'aadl-oriented-subset';
}

export interface Checkpoint {
  id: string;
  name: string;
  message?: string;
  author?: string;
  createdAt: string;
  modelRevision: string | number;
  viewRevision: number;
  validationStatus: string;
}

export interface LayoutTemplate {
  schemaVersion: 1;
  sourceViewId?: string;
  nodes: Array<{ id: string; semanticId?: string; label?: string; x: number; y: number; width?: number; height?: number; pinned?: boolean }>;
  constraints?: NamedView['constraints'];
}

export interface WorkflowCapability {
  id: string;
  category: 'project' | 'inspect' | 'view' | 'overlay' | 'arrange' | 'quality' | 'artifact' | 'live';
  label: string;
  agentEntryPoint: string;
  manualSurface: string;
  testSelector: string;
}

export interface CapabilityInventory {
  schemaVersion: 1;
  capabilities: WorkflowCapability[];
  transportOnlyExceptions: Array<{ id: string; reason: string }>;
}

export interface SysmlNodeData extends Record<string, unknown> {
  element: DiagramNodePayload;
  onSelectElement?: (id: string) => void;
  onToggleExpansion?: (element: DiagramNodePayload) => void;
  onOpenDefinition?: (element: DiagramNodePayload) => void;
  onResizeContainer?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void;
  onResizeContainerStart?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void;
  onResizeContainerDraft?: (element: DiagramNodePayload, geometry: { width: number; height: number; x: number; y: number }) => void;
  resizeConstraints?: ContainerResizeConstraints;
  resizeCoordinateOffset?: { x: number; y: number };
  expansionBusy?: boolean;
  selectedElementId?: string;
  selectedByContract?: boolean;
  isContainer?: boolean;
  showPorts?: boolean;
  showTypes?: boolean;
  editingEnabled?: boolean;
}

export type SysmlFlowNode = Node<SysmlNodeData, 'sysmlNode'>;

export interface AnnotationNodeData extends Record<string, unknown> {
  annotation: ViewAnnotation;
}

export type AnnotationFlowNode = Node<AnnotationNodeData, 'annotationNode'>;
export type CanvasFlowNode = SysmlFlowNode | AnnotationFlowNode;
export interface RoutedEdgeData extends Record<string, unknown> {
  route?: ViewEdgeRoute;
  elementId?: string;
  source?: SourceLocation;
  sourceIsPort?: boolean;
  targetIsPort?: boolean;
  editingEnabled?: boolean;
  onMoveAttachment?: (
    edgeId: string,
    end: EdgeAttachmentEnd,
    attachment: EdgeAttachment | undefined,
    commit: boolean,
  ) => void;
}

export type SysmlFlowEdge = Edge<RoutedEdgeData, 'routed'>;

export interface ToastMessage {
  id: number;
  title: string;
  detail?: string;
  tone: 'success' | 'error' | 'info';
}

export interface EventMessage {
  type: string;
  revision?: string | number;
  data?: unknown;
}

export interface ViewPatch {
  name?: string;
  rootId?: string;
  positions?: Record<string, { x: number; y: number; width?: number; height?: number }>;
  edgeRoutes?: Record<string, ViewEdgeRoute>;
  pinned?: string[];
  hidden?: string[];
  expanded?: string[];
  aliases?: Record<string, string>;
  annotations?: ViewAnnotation[];
  constraints?: NamedView['constraints'];
  presentationNodes?: NamedView['presentationNodes'];
  presentationEdges?: NamedView['presentationEdges'];
  showPorts?: boolean;
  showEdgeLabels?: boolean;
  showTypes?: boolean;
  camera?: Viewport;
}

export type LayoutAlignment = 'left' | 'center-x' | 'right' | 'top' | 'center-y' | 'bottom';
export type LayoutDistribution = 'horizontal' | 'vertical';
