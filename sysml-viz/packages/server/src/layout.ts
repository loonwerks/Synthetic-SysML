import type { NodeLayout, ViewState } from "./types.js";

export interface LayoutGraph {
  nodes: Array<{
    id: string;
    kind?: string;
    parentId?: string;
    width?: number;
    height?: number;
  }>;
  edges: Array<{ source: string; target: string }>;
}

export interface LayoutOptions {
  onlyNew?: boolean;
  horizontalGap?: number;
  verticalGap?: number;
}

export type LayoutAlignment =
  | "left"
  | "center-x"
  | "right"
  | "top"
  | "center-y"
  | "bottom";

export type LayoutDistribution = "horizontal" | "vertical";

/** Apply persistent pairwise constraints deterministically in stored order. */
export function applyLayoutConstraints(view: ViewState): ViewState {
  const positions = { ...view.positions };
  for (const constraint of [...(view.constraints ?? [])].sort((a, b) => a.id.localeCompare(b.id))) {
    const subject = positions[constraint.subjectId];
    const object = positions[constraint.objectId];
    if (!subject || !object) continue;
    const gap = constraint.gap ?? 40;
    const subjectWidth = subject.width ?? DEFAULT_NODE_WIDTH;
    const subjectHeight = subject.height ?? DEFAULT_NODE_HEIGHT;
    const objectWidth = object.width ?? DEFAULT_NODE_WIDTH;
    const objectHeight = object.height ?? DEFAULT_NODE_HEIGHT;
    switch (constraint.relation) {
      case "above": positions[constraint.subjectId] = { ...subject, y: object.y - subjectHeight - gap }; break;
      case "below": positions[constraint.subjectId] = { ...subject, y: object.y + objectHeight + gap }; break;
      case "left-of": positions[constraint.subjectId] = { ...subject, x: object.x - subjectWidth - gap }; break;
      case "right-of": positions[constraint.subjectId] = { ...subject, x: object.x + objectWidth + gap }; break;
    }
  }
  return { ...view, positions, updatedAt: new Date().toISOString() };
}

interface LayoutRectangle {
  readonly x: number;
  readonly y: number;
  readonly width: number;
  readonly height: number;
}

const DEFAULT_NODE_WIDTH = 250;
const DEFAULT_NODE_HEIGHT = 150;
const MINIMUM_NODE_GAP = 20;
const LAYOUT_ALIGNMENTS: readonly LayoutAlignment[] = [
  "left",
  "center-x",
  "right",
  "top",
  "center-y",
  "bottom",
];
const LAYOUT_DISTRIBUTIONS: readonly LayoutDistribution[] = ["horizontal", "vertical"];

function rectangle(position: NodeLayout): LayoutRectangle {
  return {
    x: position.x,
    y: position.y,
    width: position.width ?? DEFAULT_NODE_WIDTH,
    height: position.height ?? DEFAULT_NODE_HEIGHT,
  };
}

function overlaps(left: LayoutRectangle, right: LayoutRectangle): boolean {
  return (
    left.x < right.x + right.width + MINIMUM_NODE_GAP &&
    left.x + left.width + MINIMUM_NODE_GAP > right.x &&
    left.y < right.y + right.height + MINIMUM_NODE_GAP &&
    left.y + left.height + MINIMUM_NODE_GAP > right.y
  );
}

function collisionFreePosition(
  desired: NodeLayout,
  occupied: readonly LayoutRectangle[],
  verticalGap: number,
): NodeLayout {
  const baseY = desired.y;
  let y = baseY;
  while (true) {
    const candidate = rectangle({ ...desired, y });
    const conflicts = occupied.filter((obstacle) => overlaps(candidate, obstacle));
    if (conflicts.length === 0) {
      return { ...desired, y };
    }
    const firstFreeY = Math.max(
      ...conflicts.map((obstacle) => obstacle.y + obstacle.height + MINIMUM_NODE_GAP),
    );
    const rows = Math.max(1, Math.ceil((firstFreeY - baseY) / verticalGap));
    y = baseY + rows * verticalGap;
  }
}

interface SelectedLayout {
  readonly id: string;
  readonly position: NodeLayout;
  readonly rectangle: LayoutRectangle;
}

function selectedLayouts(
  view: ViewState,
  nodeIds: readonly string[],
  minimum: number,
  operation: "align" | "distribute",
): SelectedLayout[] {
  if (nodeIds.length < minimum) {
    throw new Error(
      `Cannot ${operation} nodes: expected at least ${minimum} distinct node IDs, received ${nodeIds.length}`,
    );
  }

  const seen = new Set<string>();
  const duplicates = new Set<string>();
  for (const id of nodeIds) {
    if (seen.has(id)) duplicates.add(id);
    seen.add(id);
  }
  if (duplicates.size > 0) {
    throw new Error(
      `Cannot ${operation} nodes: duplicate node IDs ${[...duplicates]
        .sort()
        .map((id) => `'${id}'`)
        .join(", ")}; provide distinct node IDs`,
    );
  }

  const missing = nodeIds.filter((id) => view.positions[id] === undefined).sort();
  if (missing.length > 0) {
    throw new Error(
      `Cannot ${operation} nodes: no layout position exists for ${missing
        .map((id) => `'${id}'`)
        .join(", ")}`,
    );
  }

  return nodeIds.map((id) => {
    const position = view.positions[id];
    if (!position) {
      // The complete missing-ID check above makes this unreachable while also
      // keeping indexed access safe under strict TypeScript settings.
      throw new Error(`Cannot ${operation} node '${id}': its layout position disappeared`);
    }
    return { id, position, rectangle: rectangle(position) };
  });
}

function compareIds(left: string, right: string): number {
  return left < right ? -1 : left > right ? 1 : 0;
}

function cycleBrokenOrder(
  nodeIds: readonly string[],
  edges: readonly { source: string; target: string }[],
): string[] {
  const remaining = new Set(nodeIds);
  const left: string[] = [];
  const right: string[] = [];
  const incoming = new Map(nodeIds.map((id) => [id, new Set<string>()]));
  const outgoing = new Map(nodeIds.map((id) => [id, new Set<string>()]));
  for (const edge of edges) {
    incoming.get(edge.target)?.add(edge.source);
    outgoing.get(edge.source)?.add(edge.target);
  }
  const degree = (id: string, direction: "in" | "out") =>
    [...(direction === "in" ? incoming.get(id) ?? [] : outgoing.get(id) ?? [])]
      .filter((neighbor) => remaining.has(neighbor)).length;
  const remove = (id: string) => remaining.delete(id);

  while (remaining.size > 0) {
    const ids = [...remaining].sort(compareIds);
    const sink = ids.find((id) => degree(id, "out") === 0);
    if (sink) {
      remove(sink);
      right.push(sink);
      continue;
    }
    const source = ids.find((id) => degree(id, "in") === 0);
    if (source) {
      remove(source);
      left.push(source);
      continue;
    }
    const selected = ids
      .map((id) => ({ id, score: degree(id, "out") - degree(id, "in") }))
      .sort((first, second) => second.score - first.score || compareIds(first.id, second.id))[0]!;
    remove(selected.id);
    left.push(selected.id);
  }
  return [...left, ...right.reverse()];
}

function minimizeLayerCrossings(
  rowsByLevel: Map<number, string[]>,
  levels: ReadonlyMap<string, number>,
  edges: readonly { source: string; target: string }[],
): void {
  const maximumLevel = Math.max(0, ...rowsByLevel.keys());
  const reorder = (level: number, neighborDirection: -1 | 1) => {
    const row = rowsByLevel.get(level);
    const neighborRow = rowsByLevel.get(level + neighborDirection);
    if (!row || !neighborRow) return;
    const neighborIndex = new Map(neighborRow.map((id, index) => [id, index]));
    const previousIndex = new Map(row.map((id, index) => [id, index]));
    row.sort((left, right) => {
      const barycenter = (id: string) => {
        const adjacent = edges.flatMap((edge) => {
          if (edge.source === id && levels.get(edge.target) === level + neighborDirection) {
            return [neighborIndex.get(edge.target) ?? 0];
          }
          if (edge.target === id && levels.get(edge.source) === level + neighborDirection) {
            return [neighborIndex.get(edge.source) ?? 0];
          }
          return [];
        });
        return adjacent.length
          ? adjacent.reduce((sum, value) => sum + value, 0) / adjacent.length
          : previousIndex.get(id) ?? 0;
      };
      return barycenter(left) - barycenter(right) ||
        (previousIndex.get(left) ?? 0) - (previousIndex.get(right) ?? 0) ||
        compareIds(left, right);
    });
  };

  // Alternating barycentric sweeps are inexpensive for architecture-sized
  // graphs and eliminate most crossings caused only by alphabetical order.
  for (let pass = 0; pass < 4; pass += 1) {
    for (let level = 1; level <= maximumLevel; level += 1) reorder(level, -1);
    for (let level = maximumLevel - 1; level >= 0; level -= 1) reorder(level, 1);
  }
}

/**
 * A deterministic, inexpensive layered layout used by CLI/server operations.
 * The browser may offer a richer ELK layout, but both paths enforce the same
 * invariant: a pinned node is never moved.
 */
export function applyLayeredLayout(
  view: ViewState,
  graph: LayoutGraph,
  options: LayoutOptions = {},
): ViewState {
  const horizontalGap = options.horizontalGap ?? 330;
  const verticalGap = options.verticalGap ?? 170;
  if (!Number.isFinite(horizontalGap) || horizontalGap <= 0) {
    throw new Error("horizontalGap must be a positive finite number");
  }
  if (!Number.isFinite(verticalGap) || verticalGap <= 0) {
    throw new Error("verticalGap must be a positive finite number");
  }
  const nodeIds = new Set(graph.nodes.map((node) => node.id));
  const edges = graph.edges.filter((edge) =>
    nodeIds.has(edge.source) && nodeIds.has(edge.target) && edge.source !== edge.target,
  );
  const ordering = cycleBrokenOrder([...nodeIds], edges);
  const orderIndex = new Map(ordering.map((id, index) => [id, index]));
  const outgoing = new Map([...nodeIds].map((id) => [id, [] as string[]]));
  for (const edge of edges) outgoing.get(edge.source)?.push(edge.target);

  // Keep only forward edges from the deterministic cycle-broken ordering.
  // Unlike putting every member of a cycle in one final column, this yields a
  // useful left-to-right flow for feedback-heavy system models.
  const level = new Map(ordering.map((id) => [id, 0]));
  for (const id of ordering) {
    for (const target of (outgoing.get(id) ?? []).sort(compareIds)) {
      if ((orderIndex.get(target) ?? 0) <= (orderIndex.get(id) ?? 0)) continue;
      level.set(target, Math.max(level.get(target) ?? 0, (level.get(id) ?? 0) + 1));
    }
  }

  const rowsByLevel = new Map<number, string[]>();
  for (const id of ordering) {
    const value = level.get(id) ?? 0;
    const row = rowsByLevel.get(value) ?? [];
    row.push(id);
    rowsByLevel.set(value, row);
  }
  minimizeLayerCrossings(rowsByLevel, level, edges);

  const graphNodes = new Map(graph.nodes.map((node) => [node.id, node]));
  const dimensions = (id: string) => {
    const existing = view.positions[id];
    const node = graphNodes.get(id);
    return {
      width: existing?.width ?? node?.width ?? DEFAULT_NODE_WIDTH,
      height: existing?.height ?? node?.height ?? DEFAULT_NODE_HEIGHT,
      explicitWidth: existing?.width ?? node?.width,
      explicitHeight: existing?.height ?? node?.height,
    };
  };
  const layerWidths = new Map([...rowsByLevel].map(([column, ids]) => [
    column,
    Math.max(...ids.map((id) => dimensions(id).width)),
  ]));
  const layerX = new Map<number, number>();
  let nextX = 80;
  for (const column of [...rowsByLevel.keys()].sort((left, right) => left - right)) {
    layerX.set(column, nextX);
    nextX += Math.max(horizontalGap, (layerWidths.get(column) ?? DEFAULT_NODE_WIDTH) + 80);
  }
  const relativeRows = new Map<number, Map<string, number>>();
  const layerHeights = new Map<number, number>();
  for (const [column, ids] of rowsByLevel) {
    const offsets = new Map<string, number>();
    let y = 0;
    let previousHeight = 0;
    ids.forEach((id, index) => {
      if (index > 0) y += Math.max(verticalGap, previousHeight + MINIMUM_NODE_GAP + 16);
      offsets.set(id, y);
      previousHeight = dimensions(id).height;
    });
    relativeRows.set(column, offsets);
    const last = ids.at(-1);
    layerHeights.set(column, last ? (offsets.get(last) ?? 0) + dimensions(last).height : 0);
  }
  const tallestLayer = Math.max(0, ...layerHeights.values());

  const positions: Record<string, NodeLayout> = { ...view.positions };
  const occupied = [...nodeIds]
    .sort()
    .flatMap((id) => {
      const existing = positions[id];
      const size = dimensions(id);
      return existing !== undefined && (existing.pinned || options.onlyNew)
        ? [rectangle({ ...existing, width: size.width, height: size.height })]
        : [];
    });
  for (const [column, ids] of [...rowsByLevel.entries()].sort(([left], [right]) => left - right)) {
    ids.forEach((id) => {
      const existing = positions[id];
      if (existing?.pinned || (options.onlyNew && existing)) {
        return;
      }
      const size = dimensions(id);
      const desired: NodeLayout = {
        x: layerX.get(column) ?? 80,
        y: 80 + (tallestLayer - (layerHeights.get(column) ?? 0)) / 2 +
          (relativeRows.get(column)?.get(id) ?? 0),
        pinned: existing?.pinned ?? false,
        ...(size.explicitWidth === undefined ? {} : { width: size.explicitWidth }),
        ...(size.explicitHeight === undefined ? {} : { height: size.explicitHeight }),
      };
      const placed = collisionFreePosition(desired, occupied, verticalGap);
      positions[id] = placed;
      occupied.push(rectangle(placed));
    });
  }

  return applyLayoutConstraints({ ...view, positions, updatedAt: new Date().toISOString() });
}

/**
 * Align node rectangles against the selected set's bounding box. The result is
 * independent of the order in which IDs are supplied. Selected nodes are
 * pinned by default so a later automatic layout cannot undo the adjustment.
 */
export function alignNodes(
  view: ViewState,
  nodeIds: readonly string[],
  alignment: LayoutAlignment,
  pinned = true,
): ViewState {
  if (!LAYOUT_ALIGNMENTS.includes(alignment)) {
    throw new Error(
      `Unknown layout alignment '${String(alignment)}'; expected one of: ${LAYOUT_ALIGNMENTS.join(", ")}`,
    );
  }
  const selected = selectedLayouts(view, nodeIds, 2, "align");
  const left = Math.min(...selected.map((item) => item.rectangle.x));
  const right = Math.max(
    ...selected.map((item) => item.rectangle.x + item.rectangle.width),
  );
  const top = Math.min(...selected.map((item) => item.rectangle.y));
  const bottom = Math.max(
    ...selected.map((item) => item.rectangle.y + item.rectangle.height),
  );
  const centerX = (left + right) / 2;
  const centerY = (top + bottom) / 2;
  const positions: Record<string, NodeLayout> = { ...view.positions };

  for (const item of selected) {
    switch (alignment) {
      case "left":
        positions[item.id] = { ...item.position, x: left, pinned };
        break;
      case "center-x":
        positions[item.id] = {
          ...item.position,
          x: centerX - item.rectangle.width / 2,
          pinned,
        };
        break;
      case "right":
        positions[item.id] = {
          ...item.position,
          x: right - item.rectangle.width,
          pinned,
        };
        break;
      case "top":
        positions[item.id] = { ...item.position, y: top, pinned };
        break;
      case "center-y":
        positions[item.id] = {
          ...item.position,
          y: centerY - item.rectangle.height / 2,
          pinned,
        };
        break;
      case "bottom":
        positions[item.id] = {
          ...item.position,
          y: bottom - item.rectangle.height,
          pinned,
        };
        break;
    }
  }

  return { ...view, positions, updatedAt: new Date().toISOString() };
}

/**
 * Distribute rectangles with equal edge-to-edge gaps while preserving the two
 * spatially outer node rectangles. Node IDs only break coordinate ties, so
 * callers receive the same layout regardless of selection order.
 */
export function distributeNodes(
  view: ViewState,
  nodeIds: readonly string[],
  direction: LayoutDistribution,
  pinned = true,
): ViewState {
  if (!LAYOUT_DISTRIBUTIONS.includes(direction)) {
    throw new Error(
      `Unknown layout distribution '${String(direction)}'; expected one of: ${LAYOUT_DISTRIBUTIONS.join(", ")}`,
    );
  }
  const selected = selectedLayouts(view, nodeIds, 3, "distribute");
  const horizontal = direction === "horizontal";
  const ordered = [...selected].sort((left, right) => {
    const difference = horizontal
      ? left.rectangle.x - right.rectangle.x
      : left.rectangle.y - right.rectangle.y;
    return difference || compareIds(left.id, right.id);
  });
  const first = ordered[0];
  const last = ordered.at(-1);
  if (!first || !last) {
    throw new Error("Cannot distribute nodes: the selected layout unexpectedly became empty");
  }
  const leadingEdge = horizontal ? first.rectangle.x : first.rectangle.y;
  const trailingEdge = horizontal
    ? last.rectangle.x + last.rectangle.width
    : last.rectangle.y + last.rectangle.height;
  const occupiedExtent = ordered.reduce(
    (total, item) =>
      total + (horizontal ? item.rectangle.width : item.rectangle.height),
    0,
  );
  const gap = (trailingEdge - leadingEdge - occupiedExtent) / (ordered.length - 1);
  const positions: Record<string, NodeLayout> = { ...view.positions };
  let precedingExtent = 0;

  ordered.forEach((item, index) => {
    const coordinate = leadingEdge + precedingExtent + gap * index;
    positions[item.id] = horizontal
      ? { ...item.position, x: coordinate, pinned }
      : { ...item.position, y: coordinate, pinned };
    precedingExtent += horizontal ? item.rectangle.width : item.rectangle.height;
  });

  return { ...view, positions, updatedAt: new Date().toISOString() };
}

/**
 * Remove manual node and edge geometry. Passing the returned view to
 * applyLayeredLayout produces a completely fresh layout whose nodes start
 * unpinned, while all non-layout view presentation state remains intact.
 */
export function resetLayout(view: ViewState): ViewState {
  return {
    ...view,
    positions: {},
    edgeRoutes: {},
    updatedAt: new Date().toISOString(),
  };
}

export function moveNode(
  view: ViewState,
  id: string,
  x: number,
  y: number,
  pinned = true,
): ViewState {
  const current = view.positions[id];
  return {
    ...view,
    positions: {
      ...view.positions,
      [id]: {
        x,
        y,
        pinned,
        ...(current?.width === undefined ? {} : { width: current.width }),
        ...(current?.height === undefined ? {} : { height: current.height }),
      },
    },
    updatedAt: new Date().toISOString(),
  };
}

export function pinNode(view: ViewState, id: string, pinned: boolean): ViewState {
  const current = view.positions[id];
  if (!current) {
    throw new Error(`Cannot ${pinned ? "pin" : "unpin"} '${id}' before it has a layout position`);
  }
  return {
    ...view,
    positions: { ...view.positions, [id]: { ...current, pinned } },
    updatedAt: new Date().toISOString(),
  };
}
