import type { ELK, ElkNode, ElkPoint } from 'elkjs/lib/elk-api.js';
import {
  annotationBounds,
  nearestFreePosition,
  PRESENTATION_OBJECT_CLEARANCE,
  presentationNodeBounds,
  rectanglesOverlap,
} from '@sysml-viz/core/scene';
import { nearestAttachment } from './edge-attachments';
import type { NamedView, SysmlFlowEdge, SysmlFlowNode, ViewAnnotation, ViewEdgeRoute } from './types';

let elkPromise: Promise<ELK> | undefined;

function loadElk(): Promise<ELK> {
  elkPromise ??= import('elkjs/lib/elk.bundled.js').then(({ default: Elk }) => new Elk());
  return elkPromise;
}
const DEFAULT_WIDTH = 248;
const DEFAULT_HEIGHT = 142;

export interface DiagramLayoutResult {
  nodes: SysmlFlowNode[];
  edgeRoutes: Record<string, ViewEdgeRoute>;
  presentationNodes: NonNullable<NamedView['presentationNodes']>;
  annotations: ViewAnnotation[];
  moved: Array<{ id: string; kind: 'semantic' | 'presentation' | 'annotation' }>;
}

export interface DiagramPresentationLayout {
  presentationNodes?: NamedView['presentationNodes'];
  annotations?: readonly ViewAnnotation[];
}

function nodeWidth(node: SysmlFlowNode): number {
  return node.measured?.width ?? node.data.element.dimensions?.width ?? node.width ?? DEFAULT_WIDTH;
}

function nodeHeight(node: SysmlFlowNode): number {
  return node.measured?.height ?? node.data.element.dimensions?.height ?? node.height ?? DEFAULT_HEIGHT;
}

function overlaps(
  first: { x: number; y: number; width: number; height: number },
  second: { x: number; y: number; width: number; height: number },
  gap = 26,
): boolean {
  return !(
    first.x + first.width + gap < second.x ||
    second.x + second.width + gap < first.x ||
    first.y + first.height + gap < second.y ||
    second.y + second.height + gap < first.y
  );
}

type Box = { x: number; y: number; width: number; height: number };

function topLevelBox(node: SysmlFlowNode): Box {
  return { x: node.position.x, y: node.position.y, width: nodeWidth(node), height: nodeHeight(node) };
}

function samePosition(left: { x: number; y: number }, right: { x: number; y: number }): boolean {
  return left.x === right.x && left.y === right.y;
}

/**
 * Preserve clear saved coordinates while moving colliding objects in a stable
 * kind/id order. Semantic pins are immutable obstacles. The returned groups
 * map directly to the three persisted view fields used by the shell.
 */
export function repairDiagramCollisions(
  nodes: readonly SysmlFlowNode[],
  presentation: DiagramPresentationLayout = {},
): Pick<DiagramLayoutResult, 'nodes' | 'presentationNodes' | 'annotations' | 'moved'> {
  const moved: DiagramLayoutResult['moved'] = [];
  const topLevel = nodes.filter((node) => !node.parentId);
  const pinned = topLevel
    .filter((node) => node.data.element.pinned)
    .sort((left, right) => left.id.localeCompare(right.id));
  const movable = topLevel
    .filter((node) => !node.data.element.pinned)
    .sort((left, right) => left.id.localeCompare(right.id));
  const occupied: Box[] = pinned.map(topLevelBox);
  const repairedById = new Map<string, SysmlFlowNode>(pinned.map((node) => [node.id, node]));

  for (const node of movable) {
    const size = { width: nodeWidth(node), height: nodeHeight(node) };
    const position = nearestFreePosition(node.position, size, occupied);
    const repaired = samePosition(position, node.position) ? node : { ...node, position };
    if (repaired !== node) moved.push({ id: node.id, kind: 'semantic' });
    repairedById.set(node.id, repaired);
    occupied.push({ ...position, ...size });
  }

  const repairedNodes = nodes.map((node) => node.parentId ? node : repairedById.get(node.id) ?? node);
  // Top-level containers are the semantic envelopes. Children are already
  // contained by them, so adding relative child boxes would over-constrain the
  // placement search and mix coordinate spaces.
  const semanticOccupied = repairedNodes.filter((node) => !node.parentId).map(topLevelBox);
  occupied.splice(0, occupied.length, ...semanticOccupied);

  const repairedPresentation = [...(presentation.presentationNodes ?? [])]
    .sort((left, right) => left.id.localeCompare(right.id))
    .map((node) => {
      const bounds = presentationNodeBounds(node);
      const position = nearestFreePosition({ x: node.x, y: node.y }, bounds, occupied);
      const repaired = samePosition(position, node) ? { ...node } : { ...node, ...position };
      if (!samePosition(position, node)) moved.push({ id: node.id, kind: 'presentation' });
      occupied.push(presentationNodeBounds(repaired));
      return repaired;
    });

  const repairedAnnotations = [...(presentation.annotations ?? [])]
    .sort((left, right) => left.id.localeCompare(right.id))
    .map((annotation) => {
      const bounds = annotationBounds(annotation);
      const position = nearestFreePosition(annotation.position, bounds, occupied);
      const repaired = samePosition(position, annotation.position) ? { ...annotation } : { ...annotation, position };
      if (!samePosition(position, annotation.position)) moved.push({ id: annotation.id, kind: 'annotation' });
      occupied.push(annotationBounds(repaired));
      return repaired;
    });

  return { nodes: repairedNodes, presentationNodes: repairedPresentation, annotations: repairedAnnotations, moved };
}

export function hasDiagramCollision(
  nodes: readonly SysmlFlowNode[],
  presentation: DiagramPresentationLayout = {},
): boolean {
  const boxes: Box[] = [
    ...nodes.filter((node) => !node.parentId).map(topLevelBox),
    ...(presentation.presentationNodes ?? []).map(presentationNodeBounds),
    ...(presentation.annotations ?? []).map(annotationBounds),
  ];
  return boxes.some((box, index) => boxes.slice(index + 1).some((other) =>
    rectanglesOverlap(box, other, PRESENTATION_OBJECT_CLEARANCE),
  ));
}

export async function layoutDiagram(
  nodes: SysmlFlowNode[],
  edges: SysmlFlowEdge[],
  presentation: DiagramPresentationLayout = {},
): Promise<DiagramLayoutResult> {
  if (!nodes.length) {
    const repaired = repairDiagramCollisions(nodes, presentation);
    return { ...repaired, edgeRoutes: {} };
  }
  const elk = await loadElk();
  // Expanded children already have meaningful parent-relative geometry. ELK
  // lays out only the top-level architecture so it cannot reinterpret those
  // relative coordinates as global positions or move content out of a group.
  const layoutNodes = nodes.filter((node) => !node.parentId);
  const layoutIds = new Set(layoutNodes.map((node) => node.id));
  const layoutEdges = edges.filter((edge) => layoutIds.has(edge.source) && layoutIds.has(edge.target));
  if (!layoutNodes.length) {
    const repaired = repairDiagramCollisions(nodes, presentation);
    return { ...repaired, edgeRoutes: {} };
  }

  const pinned = new Map(
    layoutNodes
      .filter((node) => node.data.element.pinned)
      .map((node) => [node.id, { ...node.position, width: nodeWidth(node), height: nodeHeight(node) }]),
  );

  const graph = await elk.layout<ElkNode>({
    id: 'root',
    layoutOptions: {
      'elk.algorithm': 'layered',
      'elk.direction': 'RIGHT',
      'elk.edgeRouting': 'ORTHOGONAL',
      'elk.layered.spacing.nodeNodeBetweenLayers': '100',
      'elk.spacing.nodeNode': '72',
      'elk.spacing.edgeNode': '40',
      'elk.layered.spacing.edgeEdgeBetweenLayers': '18',
      'elk.layered.cycleBreaking.strategy': 'GREEDY',
      'elk.layered.nodePlacement.strategy': 'NETWORK_SIMPLEX',
      'elk.layered.crossingMinimization.strategy': 'LAYER_SWEEP',
      'elk.layered.crossingMinimization.greedySwitch.type': 'TWO_SIDED',
      'elk.layered.compaction.postCompaction.strategy': 'EDGE_LENGTH',
      'elk.layered.thoroughness': '8',
    },
    children: layoutNodes.map((node) => ({
      id: node.id,
      width: nodeWidth(node),
      height: nodeHeight(node),
    })),
    edges: layoutEdges.map((edge) => ({
      id: edge.id,
      sources: [edge.source],
      targets: [edge.target],
    })),
  });

  const laidOut = new Map(graph.children?.map((child) => [child.id, child]) ?? []);
  const occupied = [...pinned.values()];

  const resultNodes = nodes.map((node) => {
    if (node.parentId) return node;
    const locked = pinned.get(node.id);
    if (locked) return { ...node, position: { x: locked.x, y: locked.y } };

    const candidate = laidOut.get(node.id);
    const width = candidate?.width ?? DEFAULT_WIDTH;
    const height = candidate?.height ?? DEFAULT_HEIGHT;
    let x = candidate?.x ?? node.position.x;
    let y = candidate?.y ?? node.position.y;
    let attempts = 0;
    while (occupied.some((box) => overlaps({ x, y, width, height }, box)) && attempts < 40) {
      y += height + 46;
      attempts += 1;
      if (attempts % 8 === 0) {
        x += width + 70;
        y = candidate?.y ?? 0;
      }
    }
    occupied.push({ x, y, width, height });
    return { ...node, position: { x, y } };
  });
  const boxes = new Map(resultNodes.filter((node) => !node.parentId).map((node) => [node.id, {
    x: node.position.x,
    y: node.position.y,
    width: nodeWidth(node),
    height: nodeHeight(node),
  }]));
  const originalEdges = new Map(layoutEdges.map((edge) => [edge.id, edge]));
  const edgeRoutes: Record<string, ViewEdgeRoute> = {};
  // Pinned nodes are restored after ELK, so its absolute connector sections no
  // longer match. For the common all-unpinned case, keep ELK's obstacle-aware
  // orthogonal sections instead of asking React Flow to rediscover a route.
  if (pinned.size === 0) {
    for (const edge of graph.edges ?? []) {
      const section = edge.sections?.[0];
      const original = originalEdges.get(edge.id);
      const sourceBounds = original ? boxes.get(original.source) : undefined;
      const targetBounds = original ? boxes.get(original.target) : undefined;
      // ELK is laid out against node rectangles, but React Flow attaches these
      // edges to exact semantic port handles. Its section bends therefore do
      // not describe this edge's actual endpoints and can form diagonal hooks.
      if (original?.data?.sourceIsPort || original?.data?.targetIsPort) continue;
      if (!section || !sourceBounds || !targetBounds) continue;
      edgeRoutes[edge.id] = {
        pinned: false,
        points: (section.bendPoints ?? []).map((point: ElkPoint) => ({ x: point.x, y: point.y })),
        sourceAttachment: nearestAttachment(sourceBounds, section.startPoint),
        targetAttachment: nearestAttachment(targetBounds, section.endPoint),
      };
    }
  }
  const repaired = repairDiagramCollisions(resultNodes, presentation);
  return { ...repaired, edgeRoutes };
}
