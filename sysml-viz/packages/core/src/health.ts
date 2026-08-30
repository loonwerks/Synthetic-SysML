import { buildRenderScene } from "./scene.js";
import type {
  DiagramCrossing,
  DiagramGeometry,
  DiagramHealth,
  DiagramHealthFinding,
  DiagramLayout,
  DiagramModel,
  DiagramPoint,
  DiagramOverlap,
  DiagramRouteObjectCollision,
  RenderSvgOptions,
} from "./types.js";

interface Segment {
  readonly start: DiagramPoint;
  readonly end: DiagramPoint;
}

function intersectingArea(left: DiagramGeometry, right: DiagramGeometry): number {
  const width = Math.min(left.x + left.width, right.x + right.width) - Math.max(left.x, right.x);
  const height = Math.min(left.y + left.height, right.y + right.height) - Math.max(left.y, right.y);
  return width > 0 && height > 0 ? width * height : 0;
}

function center(box: DiagramGeometry): DiagramPoint {
  return { x: box.x + box.width / 2, y: box.y + box.height / 2 };
}

function orientation(a: DiagramPoint, b: DiagramPoint, c: DiagramPoint): number {
  return (b.y - a.y) * (c.x - b.x) - (b.x - a.x) * (c.y - b.y);
}

function segmentIntersection(left: Segment, right: Segment): DiagramPoint | undefined {
  const o1 = orientation(left.start, left.end, right.start);
  const o2 = orientation(left.start, left.end, right.end);
  const o3 = orientation(right.start, right.end, left.start);
  const o4 = orientation(right.start, right.end, left.end);
  if (!(o1 * o2 < 0 && o3 * o4 < 0)) return undefined;
  const { x: x1, y: y1 } = left.start;
  const { x: x2, y: y2 } = left.end;
  const { x: x3, y: y3 } = right.start;
  const { x: x4, y: y4 } = right.end;
  const denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
  if (denominator === 0) return undefined;
  return {
    x: ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator,
    y: ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator,
  };
}

/** Return the first true segment/rectangle contact; a bounding-box overlap alone is not enough. */
function segmentRectangleIntersection(segment: Segment, box: DiagramGeometry): DiagramPoint | undefined {
  const inside = (point: DiagramPoint): boolean =>
    point.x >= box.x && point.x <= box.x + box.width && point.y >= box.y && point.y <= box.y + box.height;
  if (inside(segment.start)) return segment.start;
  if (inside(segment.end)) return segment.end;
  const topLeft = { x: box.x, y: box.y };
  const topRight = { x: box.x + box.width, y: box.y };
  const bottomRight = { x: box.x + box.width, y: box.y + box.height };
  const bottomLeft = { x: box.x, y: box.y + box.height };
  for (const edge of [
    { start: topLeft, end: topRight },
    { start: topRight, end: bottomRight },
    { start: bottomRight, end: bottomLeft },
    { start: bottomLeft, end: topLeft },
  ]) {
    const at = segmentIntersectionInclusive(segment, edge);
    if (at) return at;
  }
  return undefined;
}

function segmentIntersectionInclusive(left: Segment, right: Segment): DiagramPoint | undefined {
  const x1 = left.start.x;
  const y1 = left.start.y;
  const dx1 = left.end.x - x1;
  const dy1 = left.end.y - y1;
  const x2 = right.start.x;
  const y2 = right.start.y;
  const dx2 = right.end.x - x2;
  const dy2 = right.end.y - y2;
  const denominator = dx1 * dy2 - dy1 * dx2;
  if (Math.abs(denominator) < 1e-9) return undefined;
  const t = ((x2 - x1) * dy2 - (y2 - y1) * dx2) / denominator;
  const u = ((x2 - x1) * dy1 - (y2 - y1) * dx1) / denominator;
  return t >= 0 && t <= 1 && u >= 0 && u <= 1 ? { x: x1 + t * dx1, y: y1 + t * dy1 } : undefined;
}

function routeSegments(points: readonly DiagramPoint[]): Segment[] {
  return points.slice(0, -1).flatMap((start, index) => {
    const end = points[index + 1];
    return end ? [{ start, end }] : [];
  });
}

/** Report semantic counts and visual findings from exactly the scene that is rendered. */
export function computeDiagramHealth(
  diagram: DiagramModel,
  layout: DiagramLayout = {},
  options: Omit<RenderSvgOptions, "layout"> = {},
): DiagramHealth {
  const scene = buildRenderScene(diagram, { ...options, layout });
  const parentByNodeId = new Map(diagram.nodes.map((node) => [node.id, node.parentNodeId] as const));
  const isAncestor = (ancestorId: string, descendantId: string): boolean => {
    const visited = new Set<string>();
    let current = parentByNodeId.get(descendantId) ?? null;
    while (current !== null && !visited.has(current)) {
      if (current === ancestorId) return true;
      visited.add(current);
      current = parentByNodeId.get(current) ?? null;
    }
    return false;
  };

  const visualObjects = [
    ...diagram.nodes.flatMap((node) => scene.nodes[node.id] ? [{ id: node.id, box: scene.nodes[node.id]!, semantic: true, kind: "semantic" as const }] : []),
    ...scene.presentationNodes.map((node) => ({ id: node.id, box: node.bounds, semantic: false, kind: "presentation" as const })),
    ...scene.annotations.map((annotation) => ({ id: annotation.id, box: annotation.bounds, semantic: false, kind: "annotation" as const })),
  ];
  const overlaps: DiagramOverlap[] = [];
  for (let leftIndex = 0; leftIndex < visualObjects.length; leftIndex += 1) {
    const left = visualObjects[leftIndex]!;
    for (let rightIndex = leftIndex + 1; rightIndex < visualObjects.length; rightIndex += 1) {
      const right = visualObjects[rightIndex]!;
      if (left.semantic && right.semantic && (isAncestor(left.id, right.id) || isAncestor(right.id, left.id))) continue;
      const area = intersectingArea(left.box, right.box);
      if (area > 0) overlaps.push({ firstNodeId: left.id, secondNodeId: right.id, area, actionable: true });
    }
  }

  const semanticRoutes = scene.routes.filter((route) => route.kind === "semantic");
  const crossings: DiagramCrossing[] = [];
  for (let leftIndex = 0; leftIndex < semanticRoutes.length; leftIndex += 1) {
    const left = semanticRoutes[leftIndex]!;
    const leftEdge = diagram.edges.find((edge) => edge.id === left.id);
    for (let rightIndex = leftIndex + 1; rightIndex < semanticRoutes.length; rightIndex += 1) {
      const right = semanticRoutes[rightIndex]!;
      const rightEdge = diagram.edges.find((edge) => edge.id === right.id);
      if (leftEdge && rightEdge && [rightEdge.sourceNodeId, rightEdge.targetNodeId].some((id) => id !== null && (id === leftEdge.sourceNodeId || id === leftEdge.targetNodeId))) continue;
      let at: DiagramPoint | undefined;
      for (const first of routeSegments(left.points)) {
        for (const second of routeSegments(right.points)) {
          at = segmentIntersection(first, second);
          if (at) break;
        }
        if (at) break;
      }
      if (at) crossings.push({ firstEdgeId: left.id, secondEdgeId: right.id, at });
    }
  }

  const labelCollisions: DiagramHealth["labelCollisions"][number][] = [];
  for (let index = 0; index < scene.labels.length; index += 1) {
    const label = scene.labels[index]!;
    for (let otherIndex = index + 1; otherIndex < scene.labels.length; otherIndex += 1) {
      const other = scene.labels[otherIndex]!;
      const area = intersectingArea(label.bounds, other.bounds);
      if (area > 0) labelCollisions.push({
        kind: "label-label",
        firstId: label.id,
        secondId: other.id,
        at: center({ x: Math.max(label.bounds.x, other.bounds.x), y: Math.max(label.bounds.y, other.bounds.y), width: 0, height: 0 }),
        area,
        labelBounds: label.bounds,
        distance: 0,
      });
    }
    for (const object of visualObjects) {
      if (object.id === label.ownerId) continue;
      const area = intersectingArea(label.bounds, object.box);
      if (area > 0) labelCollisions.push({
        kind: "label-node",
        firstId: label.id,
        secondId: object.id,
        at: center(label.bounds),
        area,
        labelBounds: label.bounds,
        distance: 0,
      });
    }
    for (const route of scene.routes) {
      if (route.id === label.ownerId) continue;
      for (const segment of routeSegments(route.points)) {
        const intersection = segmentRectangleIntersection(segment, label.bounds);
        if (!intersection) continue;
        labelCollisions.push({
          kind: "label-edge",
          firstId: label.id,
          secondId: route.id,
          at: intersection,
          labelBounds: label.bounds,
          routeSegment: segment,
          intersection,
          distance: 0,
          actionable: !(label.kind === "annotation" && route.kind === "annotation" && route.id === `${label.ownerId}--arrow`),
        });
        break;
      }
    }
  }

  const truncatedTexts = diagram.nodes.flatMap((node) => {
    const box = scene.nodes[node.id];
    const estimatedWidth = node.label.length * 7;
    const availableWidth = Math.max(0, (box?.width ?? 0) - 26);
    return box && estimatedWidth > availableWidth
      ? [{ id: `${node.id}--label`, text: node.label, availableWidth, estimatedWidth }]
      : [];
  });
  const outOfBounds = [
    ...visualObjects.map((object) => ({ id: object.id, bounds: object.box })),
    ...scene.labels.map((label) => ({ id: label.id, bounds: label.bounds })),
    ...scene.routes.map((route) => {
      const xs = route.points.map((point) => point.x);
      const ys = route.points.map((point) => point.y);
      const minX = Math.min(...xs) - 9;
      const minY = Math.min(...ys) - 9;
      return {
        id: route.id,
        bounds: {
          x: minX,
          y: minY,
          width: Math.max(...xs) + 9 - minX,
          height: Math.max(...ys) + 9 - minY,
        },
      };
    }),
  ].filter(({ bounds }) => {
    const x = bounds.x + scene.translate.x;
    const y = bounds.y + scene.translate.y;
    return x < 0 || y < 0 || x + bounds.width > scene.width || y + bounds.height > scene.height;
  });
  const unresolvedEdgeIds = diagram.edges.filter((edge) => edge.unresolved).map((edge) => edge.id).sort();
  const knownEndpoints = new Set([
    ...Object.keys(scene.nodes),
    ...Object.keys(scene.ports),
    ...scene.presentationNodes.map((node) => node.id),
  ]);
  const danglingPresentationLinkIds = [
    ...(options.presentation?.edges ?? []).filter((edge) =>
      !knownEndpoints.has(edge.sourceId) || !knownEndpoints.has(edge.targetId)
    ).map((edge) => edge.id),
    ...(options.presentation?.annotations ?? []).filter((annotation) =>
      annotation.arrow && !knownEndpoints.has(annotation.arrow.targetId)
    ).map((annotation) => `${annotation.id}--arrow`),
  ].sort();

  const semanticEdges = new Map(diagram.edges.map((edge) => [edge.id, edge] as const));
  const presentationEdges = new Map((options.presentation?.edges ?? []).map((edge) => [edge.id, edge] as const));
  const annotationTargets = new Map<string, string>((options.presentation?.annotations ?? []).flatMap((annotation) =>
    annotation.arrow ? [[`${annotation.id}--arrow`, annotation.arrow.targetId] as const] : []
  ));
  const routeObjectCollisions: DiagramRouteObjectCollision[] = [];
  for (const route of scene.routes) {
    const semantic = semanticEdges.get(route.id);
    const presentation = presentationEdges.get(route.id);
    const endpointIds = new Set<string>([
      ...(semantic ? [semantic.sourceNodeId, semantic.targetNodeId, semantic.sourcePortId, semantic.targetPortId] : []),
      ...(presentation ? [presentation.sourceId, presentation.targetId] : []),
      ...(annotationTargets.has(route.id) ? [annotationTargets.get(route.id)] : []),
    ].filter((id): id is string => id !== null && id !== undefined));
    for (const object of visualObjects) {
      const annotationOwnBorder = route.kind === "annotation" && route.id === `${object.id}--arrow`;
      if (endpointIds.has(object.id)) continue;
      // A connection between descendants is expected to travel through their
      // containing semantic node; containment is not a route obstruction.
      if (object.semantic && [...endpointIds].some((endpointId) => isAncestor(object.id, endpointId))) continue;
      let at: DiagramPoint | undefined;
      for (const segment of routeSegments(route.points)) {
        at = segmentRectangleIntersection(segment, object.box);
        if (at) break;
      }
      if (at) routeObjectCollisions.push({
        routeId: route.id,
        objectId: object.id,
        at,
        actionable: !annotationOwnBorder,
      });
    }
  }

  const actionableLabelCollisions = labelCollisions.filter((collision) => collision.actionable !== false);
  const actionableRouteCollisions = routeObjectCollisions.filter((collision) => collision.actionable);
  const uniqueIds = (ids: readonly string[]): string[] => [...new Set(ids)].sort();
  const findings: DiagramHealthFinding[] = [];
  const addFinding = (
    code: DiagramHealthFinding["code"],
    severity: DiagramHealthFinding["severity"],
    message: string,
    count: number,
    elementIds: readonly string[],
    repairable: boolean,
  ): void => {
    if (count > 0) findings.push({ code, severity, message, count, elementIds: uniqueIds(elementIds), repairable });
  };
  addFinding("unresolved-endpoint", "blocked", `${unresolvedEdgeIds.length} connection endpoint${unresolvedEdgeIds.length === 1 ? " is" : "s are"} unresolved.`, unresolvedEdgeIds.length, unresolvedEdgeIds, false);
  addFinding("object-overlap", "blocked", `${overlaps.length} diagram object overlap${overlaps.length === 1 ? " needs" : "s need"} repair.`, overlaps.length, overlaps.flatMap((overlap) => [overlap.firstNodeId, overlap.secondNodeId]), true);
  addFinding("dangling-presentation-link", "blocked", `${danglingPresentationLinkIds.length} presentation link${danglingPresentationLinkIds.length === 1 ? " has" : "s have"} a missing endpoint.`, danglingPresentationLinkIds.length, danglingPresentationLinkIds, false);
  // A route through a card is a readability problem, but it does not mean the
  // semantic model is unusable. The browser's Repair action currently moves
  // overlapping objects only; it cannot guarantee a different edge route.
  addFinding("route-object-collision", "attention", `${actionableRouteCollisions.length} route${actionableRouteCollisions.length === 1 ? " crosses" : "s cross"} a diagram object.`, actionableRouteCollisions.length, actionableRouteCollisions.flatMap((collision) => [collision.routeId, collision.objectId]), false);
  addFinding("out-of-bounds", "blocked", `${outOfBounds.length} diagram object${outOfBounds.length === 1 ? " is" : "s are"} outside the export bounds.`, outOfBounds.length, outOfBounds.map((issue) => issue.id), true);
  addFinding("truncated-text", "attention", `${truncatedTexts.length} label${truncatedTexts.length === 1 ? " is" : "s are"} truncated.`, truncatedTexts.length, truncatedTexts.map((issue) => issue.id), false);
  addFinding("label-collision", "attention", `${actionableLabelCollisions.length} label collision${actionableLabelCollisions.length === 1 ? " needs" : "s need"} attention.`, actionableLabelCollisions.length, actionableLabelCollisions.flatMap((collision) => [collision.firstId, collision.secondId]), false);
  addFinding("edge-crossing", "attention", `${crossings.length} connection crossing${crossings.length === 1 ? " needs" : "s need"} attention.`, crossings.length, crossings.flatMap((crossing) => [crossing.firstEdgeId, crossing.secondEdgeId]), false);
  const status = findings.some((finding) => finding.severity === "blocked")
    ? "blocked" as const
    : findings.length > 0 ? "attention" as const : "clear" as const;
  return {
    nodeCount: diagram.nodes.length,
    edgeCount: diagram.edges.length,
    unresolvedEndpointCount: unresolvedEdgeIds.length,
    overlapCount: overlaps.length,
    crossingCount: crossings.length,
    hiddenElementCount: diagram.hiddenElementIds.length,
    unresolvedEdgeIds,
    overlaps,
    crossings,
    labelCollisionCount: labelCollisions.length,
    truncatedTextCount: truncatedTexts.length,
    outOfBoundsCount: outOfBounds.length,
    labelCollisions,
    truncatedTexts,
    outOfBounds,
    status,
    findings,
    danglingPresentationLinkCount: danglingPresentationLinkIds.length,
    danglingPresentationLinkIds,
    routeObjectCollisionCount: actionableRouteCollisions.length,
    routeObjectCollisions,
  };
}
