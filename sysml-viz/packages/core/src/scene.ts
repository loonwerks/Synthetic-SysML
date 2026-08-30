import type {
  DiagramAnnotation,
  DiagramGeometry,
  DiagramLayout,
  DiagramModel,
  DiagramPoint,
  DiagramPresentationEdge,
  DiagramPresentationNode,
  RenderSvgOptions,
} from "./types.js";

export interface SceneRoute {
  readonly id: string;
  readonly kind: "semantic" | "presentation" | "annotation";
  readonly points: readonly DiagramPoint[];
  readonly label?: string;
  readonly labelVisible: boolean;
  readonly unresolved?: boolean;
  readonly presentationKind?: "reference" | "informational";
}

export interface SceneLabel {
  readonly id: string;
  readonly ownerId: string;
  readonly kind: "node" | "edge" | "presentation-edge" | "presentation-node" | "annotation";
  readonly text: string;
  readonly bounds: DiagramGeometry;
}

export interface SceneAnnotation extends DiagramAnnotation {
  readonly bounds: DiagramGeometry;
  readonly lines: readonly string[];
}

export interface ScenePresentationNode extends DiagramPresentationNode {
  readonly bounds: DiagramGeometry;
}

export interface RenderScene {
  readonly nodes: Readonly<Record<string, DiagramGeometry>>;
  readonly ports: Readonly<Record<string, DiagramPoint>>;
  readonly routes: readonly SceneRoute[];
  readonly labels: readonly SceneLabel[];
  readonly annotations: readonly SceneAnnotation[];
  readonly presentationNodes: readonly ScenePresentationNode[];
  readonly bounds: DiagramGeometry;
  readonly width: number;
  readonly height: number;
  readonly translate: DiagramPoint;
  readonly padding: number;
}

export const PRESENTATION_CARD_WIDTH = 248;
export const PRESENTATION_CARD_HEIGHT = 142;
export const PRESENTATION_OBJECT_CLEARANCE = 28;
const MARKER_OVERFLOW = 9;

export function annotationGeometry(text: string, hasFooter = false): { lines: string[]; width: number; height: number } {
  // Keep these values aligned with the browser annotation card: a 220px card,
  // 29px header, 21px line-height plus 21px body padding, and an optional
  // 25px footer. This shared bound drives layout, health, and exports.
  const lines = text.match(/.{1,27}(?:\s+|$)/gu)?.map((line) => line.trim()) ?? [text];
  return {
    lines,
    width: 220,
    height: 29 + lines.length * 21 + 21 + (hasFooter ? 25 : 0),
  };
}

/** Bounds used by the browser, health checks, and deterministic exports. */
export function annotationBounds(
  annotation: Pick<DiagramAnnotation, "text" | "position"> & Partial<Pick<DiagramAnnotation, "arrow">> & { readonly linkedElementId?: string },
): DiagramGeometry {
  const geometry = annotationGeometry(annotation.text, Boolean(annotation.arrow || annotation.linkedElementId));
  return { ...annotation.position, width: geometry.width, height: geometry.height };
}

/** True when rectangles overlap, optionally including a required clear-space margin. */
export function rectanglesOverlap(
  left: DiagramGeometry,
  right: DiagramGeometry,
  clearance = 0,
): boolean {
  return left.x < right.x + right.width + clearance &&
    left.x + left.width + clearance > right.x &&
    left.y < right.y + right.height + clearance &&
    left.y + left.height + clearance > right.y;
}

export interface NearestFreePositionOptions {
  readonly clearance?: number;
  readonly step?: number;
  readonly maxRings?: number;
}

/**
 * Find a deterministic nearby position on Manhattan rings. The preferred
 * position is returned unchanged when it is already clear.
 */
export function nearestFreePosition(
  preferred: DiagramPoint,
  size: Pick<DiagramGeometry, "width" | "height">,
  occupied: readonly DiagramGeometry[],
  options: NearestFreePositionOptions = {},
): DiagramPoint {
  const clearance = options.clearance ?? PRESENTATION_OBJECT_CLEARANCE;
  const step = options.step ?? clearance;
  const maxRings = options.maxRings ?? 80;
  const isFree = (point: DiagramPoint): boolean => {
    const candidate = { ...point, width: size.width, height: size.height };
    return occupied.every((box) => !rectanglesOverlap(candidate, box, clearance));
  };
  if (isFree(preferred)) return preferred;
  for (let ring = 1; ring <= maxRings; ring += 1) {
    for (let horizontal = -ring; horizontal <= ring; horizontal += 1) {
      const vertical = ring - Math.abs(horizontal);
      const candidates = vertical === 0 ? [0] : [-vertical, vertical];
      for (const offsetY of candidates) {
        const point = { x: preferred.x + horizontal * step, y: preferred.y + offsetY * step };
        if (isFree(point)) return point;
      }
    }
  }
  const bottom = occupied.reduce((maximum, box) => Math.max(maximum, box.y + box.height), preferred.y);
  let fallback = { x: preferred.x, y: bottom + clearance };
  while (!isFree(fallback)) fallback = { ...fallback, y: fallback.y + step };
  return fallback;
}

export function defaultDiagramLayout(diagram: DiagramModel): Record<string, DiagramGeometry> {
  const geometry: Record<string, DiagramGeometry> = {};
  const topLevel = diagram.nodes.filter((node) => node.parentNodeId === null);
  const topIndex = new Map(topLevel.map((node, index) => [node.instancePath[0] ?? node.id, index]));
  const childCounts = new Map<string, number>();
  for (const node of diagram.nodes) {
    const rootName = node.instancePath[0] ?? node.id;
    const parentKey = node.parentNodeId ?? "root";
    const childIndex = childCounts.get(parentKey) ?? 0;
    childCounts.set(parentKey, childIndex + 1);
    const left = node.ports.filter((port) => port.direction !== "out").length;
    const right = node.ports.filter((port) => port.direction === "out").length;
    const rows = Math.max(left, right);
    geometry[node.id] = {
      x: 100 + (topIndex.get(rootName) ?? 0) * 300 + node.depth * 34,
      y: 110 + node.depth * 170 + childIndex * 145,
      width: 230,
      height: Math.max(68, 58 + rows * 20),
    };
  }
  return geometry;
}

function center(box: DiagramGeometry): DiagramPoint {
  return { x: box.x + box.width / 2, y: box.y + box.height / 2 };
}

export function rectanglePerimeterPoint(box: DiagramGeometry, toward: DiagramPoint): DiagramPoint {
  const c = center(box);
  const dx = toward.x - c.x;
  const dy = toward.y - c.y;
  if (dx === 0 && dy === 0) return { x: c.x, y: box.y };
  const scale = 1 / Math.max(Math.abs(dx) / (box.width / 2), Math.abs(dy) / (box.height / 2));
  return { x: c.x + dx * scale, y: c.y + dy * scale };
}

export function routeMidpoint(route: readonly DiagramPoint[]): DiagramPoint | undefined {
  if (route.length === 0) return undefined;
  let total = 0;
  const lengths: number[] = [];
  for (let index = 0; index + 1 < route.length; index += 1) {
    const a = route[index]!;
    const b = route[index + 1]!;
    const length = Math.hypot(b.x - a.x, b.y - a.y);
    lengths.push(length);
    total += length;
  }
  let remaining = total / 2;
  for (let index = 0; index < lengths.length; index += 1) {
    const length = lengths[index]!;
    if (remaining <= length) {
      const a = route[index]!;
      const b = route[index + 1]!;
      const ratio = length === 0 ? 0 : remaining / length;
      return { x: a.x + (b.x - a.x) * ratio, y: a.y + (b.y - a.y) * ratio };
    }
    remaining -= length;
  }
  return route.at(-1);
}

function portPoints(
  diagram: DiagramModel,
  geometry: Readonly<Record<string, DiagramGeometry>>,
): Record<string, DiagramPoint> {
  const points: Record<string, DiagramPoint> = {};
  for (const node of diagram.nodes) {
    const box = geometry[node.id];
    if (!box) continue;
    const left = node.ports.filter((port) => port.direction !== "out");
    const right = node.ports.filter((port) => port.direction === "out");
    for (const [index, port] of left.entries()) {
      points[port.id] = { x: box.x, y: box.y + 54 + ((index + 1) * (box.height - 58)) / (left.length + 1) };
      points[port.elementId] = points[port.id]!;
    }
    for (const [index, port] of right.entries()) {
      points[port.id] = { x: box.x + box.width, y: box.y + 54 + ((index + 1) * (box.height - 58)) / (right.length + 1) };
      points[port.elementId] = points[port.id]!;
    }
  }
  const boxes = Object.values(geometry);
  const minX = Math.min(...boxes.map((box) => box.x), 100);
  const maxX = Math.max(...boxes.map((box) => box.x + box.width), 700);
  const minY = Math.min(...boxes.map((box) => box.y), 100);
  const maxY = Math.max(...boxes.map((box) => box.y + box.height), 500);
  const input = diagram.boundaryPorts.filter((port) => port.direction !== "out");
  const output = diagram.boundaryPorts.filter((port) => port.direction === "out");
  for (const [index, port] of input.entries()) {
    points[port.id] = { x: minX - 72, y: minY + ((index + 1) * (maxY - minY)) / (input.length + 1) };
    points[port.elementId] = points[port.id]!;
  }
  for (const [index, port] of output.entries()) {
    points[port.id] = { x: maxX + 72, y: minY + ((index + 1) * (maxY - minY)) / (output.length + 1) };
    points[port.elementId] = points[port.id]!;
  }
  return points;
}

export function presentationNodeBounds(node: DiagramPresentationNode): DiagramGeometry {
  return {
    x: node.x,
    y: node.y,
    // Old view documents contain actor/reference artwork dimensions. Normalize
    // them at the shared scene boundary so hit testing, routing and exports all
    // agree without requiring a destructive view-state migration.
    width: Math.max(PRESENTATION_CARD_WIDTH, node.width ?? PRESENTATION_CARD_WIDTH),
    height: Math.max(PRESENTATION_CARD_HEIGHT, node.height ?? PRESENTATION_CARD_HEIGHT),
  };
}

function endpointBox(id: string, nodes: Readonly<Record<string, DiagramGeometry>>, presentation: readonly ScenePresentationNode[]): DiagramGeometry | undefined {
  return nodes[id] ?? presentation.find((node) => node.id === id)?.bounds;
}

function presentationRoute(
  edge: DiagramPresentationEdge,
  nodes: Readonly<Record<string, DiagramGeometry>>,
  presentation: readonly ScenePresentationNode[],
  ports: Readonly<Record<string, DiagramPoint>>,
): DiagramPoint[] {
  const sourcePort = ports[edge.sourceId];
  const targetPort = ports[edge.targetId];
  const sourceBox = endpointBox(edge.sourceId, nodes, presentation);
  const targetBox = endpointBox(edge.targetId, nodes, presentation);
  const bends = [...(edge.bendPoints ?? [])];
  const sourceAim = bends[0] ?? targetPort ?? (targetBox ? center(targetBox) : undefined);
  const targetAim = bends.at(-1) ?? sourcePort ?? (sourceBox ? center(sourceBox) : undefined);
  const source = sourcePort ?? (sourceBox && sourceAim ? rectanglePerimeterPoint(sourceBox, sourceAim) : undefined);
  const target = targetPort ?? (targetBox && targetAim ? rectanglePerimeterPoint(targetBox, targetAim) : undefined);
  return source && target ? [source, ...bends, target] : [];
}

function addBounds(result: { minX: number; minY: number; maxX: number; maxY: number }, box: DiagramGeometry): void {
  result.minX = Math.min(result.minX, box.x);
  result.minY = Math.min(result.minY, box.y);
  result.maxX = Math.max(result.maxX, box.x + box.width);
  result.maxY = Math.max(result.maxY, box.y + box.height);
}

export function buildRenderScene(diagram: DiagramModel, options: RenderSvgOptions = {}): RenderScene {
  const nodes = { ...defaultDiagramLayout(diagram), ...(options.layout?.nodes ?? {}) };
  const ports = portPoints(diagram, nodes);
  const presentationNodes: ScenePresentationNode[] = (options.presentation?.nodes ?? []).map((node) => ({
    ...node,
    bounds: presentationNodeBounds(node),
  }));
  const routes: SceneRoute[] = [];
  for (const edge of diagram.edges) {
    const explicit = options.layout?.edges?.[edge.id];
    const source = edge.sourcePortId ? ports[edge.sourcePortId] : undefined;
    const target = edge.targetPortId ? ports[edge.targetPortId] : undefined;
    let points = explicit && explicit.length >= 2 ? [...explicit] : [];
    if (points.length < 2 && source && target) {
      const x = (source.x + target.x) / 2;
      points = [source, { x, y: source.y }, { x, y: target.y }, target];
    } else if (points.length >= 2) {
      if (source) points[0] = source;
      else if (edge.sourceNodeId && nodes[edge.sourceNodeId]) points[0] = rectanglePerimeterPoint(nodes[edge.sourceNodeId]!, points[1]!);
      if (target) points[points.length - 1] = target;
      else if (edge.targetNodeId && nodes[edge.targetNodeId]) {
        points[points.length - 1] = rectanglePerimeterPoint(nodes[edge.targetNodeId]!, points.at(-2)!);
      }
    }
    if (points.length >= 2) routes.push({
      id: edge.id,
      kind: "semantic",
      points,
      label: edge.label.trim(),
      labelVisible: (options.showEdgeLabels ?? true) && edge.label.trim() !== "",
      unresolved: edge.unresolved,
    });
  }
  for (const edge of options.presentation?.edges ?? []) {
    const points = presentationRoute(edge, nodes, presentationNodes, ports);
    if (points.length >= 2) routes.push({
      id: edge.id,
      kind: "presentation",
      points,
      ...(edge.label?.trim() ? { label: edge.label.trim() } : {}),
      labelVisible: Boolean(edge.label?.trim()),
      presentationKind: edge.kind,
    });
  }
  const annotations: SceneAnnotation[] = (options.presentation?.annotations ?? []).map((annotation) => {
    const geometry = annotationGeometry(annotation.text);
    return {
      ...annotation,
      lines: geometry.lines,
      bounds: annotationBounds(annotation),
    };
  });
  for (const annotation of annotations) {
    if (!annotation.arrow) continue;
    const targetPort = ports[annotation.arrow.targetId];
    const targetBox = nodes[annotation.arrow.targetId];
    const sourceBox = annotation.bounds;
    const target = targetPort ?? (targetBox ? rectanglePerimeterPoint(targetBox, center(sourceBox)) : undefined);
    if (!target) continue;
    const source = rectanglePerimeterPoint(sourceBox, target);
    routes.push({ id: `${annotation.id}--arrow`, kind: "annotation", points: [source, target], labelVisible: false });
  }
  const labels: SceneLabel[] = [];
  for (const node of diagram.nodes) {
    const box = nodes[node.id];
    if (!box) continue;
    labels.push({
      id: `${node.id}--label`,
      ownerId: node.id,
      kind: "node",
      text: node.label,
      bounds: { x: box.x + 10, y: box.y + 6, width: Math.min(box.width - 20, node.label.length * 7), height: 18 },
    });
    if (options.showPorts ?? true) {
      for (const port of node.ports) {
        const point = ports[port.id];
        if (!point) continue;
        const left = port.direction !== "out";
        labels.push({
          id: `${port.id}--label`,
          ownerId: node.id,
          kind: "node",
          text: port.label,
          bounds: {
            x: left ? point.x + 7 : point.x - 7 - port.label.length * 5.4,
            y: point.y - 7,
            width: port.label.length * 5.4,
            height: 12,
          },
        });
      }
    }
  }
  if (options.showPorts ?? true) {
    for (const port of diagram.boundaryPorts) {
      const point = ports[port.id];
      if (!point) continue;
      const left = port.direction !== "out";
      labels.push({
        id: `${port.id}--label`,
        ownerId: `boundary:${port.id}`,
        kind: "node",
        text: port.label,
        bounds: {
          x: left ? point.x + 8 : point.x - 8 - port.label.length * 5.4,
          y: point.y - 18,
          width: port.label.length * 5.4,
          height: 12,
        },
      });
    }
  }
  for (const route of routes) {
    if (!route.labelVisible || !route.label) continue;
    const at = routeMidpoint(route.points);
    if (!at) continue;
    const width = Math.max(36, route.label.length * 6.2 + 16);
    labels.push({
      id: `${route.id}--label`,
      ownerId: route.id,
      kind: route.kind === "presentation" ? "presentation-edge" : "edge",
      text: route.label,
      bounds: { x: at.x - width / 2, y: at.y - 20, width, height: 20 },
    });
  }
  for (const node of presentationNodes) {
    labels.push({
      id: `${node.id}--label`,
      ownerId: node.id,
      kind: "presentation-node",
      text: node.label,
      bounds: { x: node.bounds.x + 12, y: node.bounds.y + 42, width: node.bounds.width - 24, height: 22 },
    });
  }
  for (const annotation of annotations) {
    labels.push({ id: `${annotation.id}--label`, ownerId: annotation.id, kind: "annotation", text: annotation.text, bounds: annotation.bounds });
  }

  const extent = { minX: Number.POSITIVE_INFINITY, minY: Number.POSITIVE_INFINITY, maxX: Number.NEGATIVE_INFINITY, maxY: Number.NEGATIVE_INFINITY };
  for (const box of Object.values(nodes)) addBounds(extent, box);
  for (const node of presentationNodes) addBounds(extent, node.bounds);
  for (const annotation of annotations) addBounds(extent, annotation.bounds);
  for (const label of labels) addBounds(extent, label.bounds);
  for (const route of routes) for (const point of route.points) addBounds(extent, { x: point.x - MARKER_OVERFLOW, y: point.y - MARKER_OVERFLOW, width: MARKER_OVERFLOW * 2, height: MARKER_OVERFLOW * 2 });
  if (!Number.isFinite(extent.minX)) Object.assign(extent, { minX: 0, minY: 72, maxX: 800, maxY: 500 });
  const padding = options.padding ?? 54;
  // Reserve and measure the title band above whichever visible object is highest.
  const titleX = extent.minX;
  const titleTop = extent.minY - 72;
  extent.maxX = Math.max(
    extent.maxX,
    titleX + diagram.title.length * 11,
    titleX + ((options.showTypes ?? true) ? diagram.rootQualifiedName.length * 6.4 : 0),
  );
  extent.minY = titleTop;
  const naturalWidth = Math.ceil(extent.maxX - extent.minX + padding * 2);
  const naturalHeight = Math.ceil(extent.maxY - extent.minY + padding * 2);
  return {
    nodes,
    ports,
    routes,
    labels,
    annotations,
    presentationNodes,
    bounds: { x: extent.minX, y: extent.minY, width: extent.maxX - extent.minX, height: extent.maxY - extent.minY },
    width: options.width ?? naturalWidth,
    height: options.height ?? naturalHeight,
    translate: { x: padding - extent.minX, y: padding - extent.minY },
    padding,
  };
}
