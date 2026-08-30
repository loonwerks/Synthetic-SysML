import type {
  DiagramGeometry,
  DiagramLayout,
  DiagramModel,
  DiagramNode,
  DiagramPoint,
  DiagramPort,
  RenderSvgOptions,
  SvgTheme,
} from "./types.js";
import { buildRenderScene } from "./scene.js";

const DEFAULT_THEME: SvgTheme = {
  background: "#f7f9fc",
  nodeFill: "#ffffff",
  nodeStroke: "#334155",
  text: "#0f172a",
  mutedText: "#64748b",
  edge: "#475569",
  inputPort: "#2563eb",
  outputPort: "#ea580c",
  unresolved: "#dc2626",
};

function xml(value: string): string {
  return value
    .replace(/&/gu, "&amp;")
    .replace(/</gu, "&lt;")
    .replace(/>/gu, "&gt;")
    .replace(/"/gu, "&quot;")
    .replace(/'/gu, "&apos;");
}

function numeric(value: number): string {
  return Number.isInteger(value) ? String(value) : value.toFixed(2).replace(/0+$/u, "").replace(/\.$/u, "");
}

function truncateVisible(value: string, maximumCharacters: number): string | undefined {
  if (maximumCharacters < 8) return undefined;
  if (value.length <= maximumCharacters) return value;
  return `${value.slice(0, Math.max(1, maximumCharacters - 1)).trimEnd()}…`;
}

function routeMidpoint(route: readonly DiagramPoint[]): DiagramPoint | undefined {
  if (route.length === 0) return undefined;
  if (route.length === 1) return route[0];
  const segments: Array<{ start: DiagramPoint; end: DiagramPoint; length: number }> = [];
  let total = 0;
  for (let index = 0; index + 1 < route.length; index += 1) {
    const start = route[index];
    const end = route[index + 1];
    if (start === undefined || end === undefined) continue;
    const length = Math.hypot(end.x - start.x, end.y - start.y);
    segments.push({ start, end, length });
    total += length;
  }
  if (total === 0) return route[0];
  const target = total / 2;
  let travelled = 0;
  for (const segment of segments) {
    if (travelled + segment.length >= target) {
      const ratio = segment.length === 0 ? 0 : (target - travelled) / segment.length;
      return {
        x: segment.start.x + (segment.end.x - segment.start.x) * ratio,
        y: segment.start.y + (segment.end.y - segment.start.y) * ratio,
      };
    }
    travelled += segment.length;
  }
  return route.at(-1);
}

interface EdgeLabelPlacement {
  readonly edgeId: string;
  readonly fullLabel: string;
  readonly visibleLabel: string;
  readonly x: number;
  readonly y: number;
  readonly width: number;
}

function defaultLayout(diagram: DiagramModel): Required<Pick<DiagramLayout, "nodes">>["nodes"] {
  const geometry: Record<string, DiagramGeometry> = {};
  const topLevel = diagram.nodes.filter((node) => node.parentNodeId === null);
  const topIndex = new Map(topLevel.map((node, index) => [node.instancePath[0] ?? node.id, index]));
  const childCounts = new Map<string, number>();
  for (const node of diagram.nodes) {
    const rootName = node.instancePath[0] ?? node.id;
    const rootIndex = topIndex.get(rootName) ?? 0;
    const parentKey = node.parentNodeId ?? "root";
    const childIndex = childCounts.get(parentKey) ?? 0;
    childCounts.set(parentKey, childIndex + 1);
    const portRows = Math.max(
      node.ports.filter((port) => port.direction === "in" || port.direction === "inout").length,
      node.ports.filter((port) => port.direction === "out" || port.direction === "inout").length,
      2,
    );
    geometry[node.id] = {
      x: 100 + rootIndex * 300 + node.depth * 34,
      y: 110 + node.depth * 170 + childIndex * 145,
      width: 230,
      height: Math.max(105, 62 + portRows * 22),
    };
  }
  return geometry;
}

function portPoints(
  diagram: DiagramModel,
  geometry: Readonly<Record<string, DiagramGeometry>>,
  width: number,
  height: number,
): Readonly<Record<string, DiagramPoint>> {
  const points: Record<string, DiagramPoint> = {};
  for (const node of diagram.nodes) {
    const box = geometry[node.id];
    if (box === undefined) continue;
    const left = node.ports.filter((port) => port.direction === "in" || port.direction === "inout");
    const right = node.ports.filter((port) => port.direction === "out");
    left.forEach((port, index) => {
      points[port.id] = {
        x: box.x,
        y: box.y + 57 + ((index + 1) * (box.height - 66)) / (left.length + 1),
      };
    });
    right.forEach((port, index) => {
      points[port.id] = {
        x: box.x + box.width,
        y: box.y + 57 + ((index + 1) * (box.height - 66)) / (right.length + 1),
      };
    });
  }
  const input = diagram.boundaryPorts.filter((port) => port.direction === "in" || port.direction === "inout");
  const output = diagram.boundaryPorts.filter((port) => port.direction === "out");
  input.forEach((port, index) => {
    points[port.id] = { x: 28, y: 80 + ((index + 1) * (height - 130)) / (input.length + 1) };
  });
  output.forEach((port, index) => {
    points[port.id] = {
      x: width - 28,
      y: 80 + ((index + 1) * (height - 130)) / (output.length + 1),
    };
  });
  return points;
}

function portColor(port: DiagramPort, theme: SvgTheme): string {
  return port.direction === "out" ? theme.outputPort : theme.inputPort;
}

function renderNodeForeground(
  node: DiagramNode,
  box: DiagramGeometry,
  points: Readonly<Record<string, DiagramPoint>>,
  theme: SvgTheme,
  showPorts: boolean,
  showTypes: boolean,
  foregroundOnly: boolean,
): string[] {
  const visibleNodeLabel = truncateVisible(node.label, Math.floor(Math.max(0, box.width - 26) / 7)) ?? "";
  const lines = [
    `    <g id="${xml(node.id)}" data-element-id="${xml(node.elementId)}" data-category="${node.category}">`,
    `      <rect x="${numeric(box.x)}" y="${numeric(box.y)}" width="${numeric(box.width)}" height="${numeric(box.height)}" rx="9" fill="${foregroundOnly ? "none" : theme.nodeFill}" stroke="${theme.nodeStroke}" stroke-width="1.5"/>`,
    `      <path d="M${numeric(box.x)},${numeric(box.y + 45)} H${numeric(box.x + box.width)}" stroke="${theme.nodeStroke}" stroke-opacity="0.28"/>`,
  ];
  if (visibleNodeLabel !== node.label) lines.push(`      <title>${xml(node.label)}</title>`);
  lines.push(
    `      <text x="${numeric(box.x + 13)}" y="${numeric(box.y + 20)}" fill="${theme.text}" font-family="Inter, system-ui, sans-serif" font-size="13" font-weight="700">${xml(visibleNodeLabel)}</text>`,
  );
  if (showTypes) {
    lines.push(
      `      <text x="${numeric(box.x + 13)}" y="${numeric(box.y + 37)}" fill="${theme.mutedText}" font-family="Inter, system-ui, sans-serif" font-size="10">${xml(`${node.category} · ${node.typeName}`)}</text>`,
    );
  }
  if (node.contracts.requirements + node.contracts.guarantees + node.contracts.assumptions > 0) {
    const badge = `A ${node.contracts.assumptions} · G ${node.contracts.guarantees} · R ${node.contracts.requirements}`;
    lines.push(
      `      <text x="${numeric(box.x + box.width - 10)}" y="${numeric(box.y + 20)}" text-anchor="end" fill="${theme.mutedText}" font-family="Inter, system-ui, sans-serif" font-size="8">${xml(badge)}</text>`,
    );
  }
  if (showPorts) {
    for (const port of node.ports) {
      const point = points[port.id];
      if (point === undefined) continue;
      const left = port.direction !== "out";
      lines.push(
        `      <circle cx="${numeric(point.x)}" cy="${numeric(point.y)}" r="4.2" fill="${portColor(port, theme)}" stroke="${theme.nodeFill}" stroke-width="1.5"/>`,
        `      <text x="${numeric(point.x + (left ? 9 : -9))}" y="${numeric(point.y + 3)}" text-anchor="${left ? "start" : "end"}" fill="${theme.text}" font-family="Inter, system-ui, sans-serif" font-size="9">${xml(port.label)}</text>`,
      );
    }
  }
  lines.push("    </g>");
  return lines;
}

function renderSceneSvg(diagram: DiagramModel, options: RenderSvgOptions): string {
  const theme: SvgTheme = { ...DEFAULT_THEME, ...options.theme };
  const scene = buildRenderScene(diagram, options);
  const showPorts = options.showPorts ?? true;
  const showTypes = options.showTypes ?? true;
  const parentNodeIds = new Set(diagram.nodes.flatMap((node) => node.parentNodeId ? [node.parentNodeId] : []));
  const containerNodeIds = new Set(diagram.nodes.filter((node) => node.expanded || parentNodeIds.has(node.id)).map((node) => node.id));
  const qname = showTypes ? truncateVisible(diagram.rootQualifiedName, Math.floor(Math.max(0, scene.width - scene.padding * 2) / 6.4)) : undefined;
  const lines = [
    `<svg xmlns="http://www.w3.org/2000/svg" width="${scene.width}" height="${scene.height}" viewBox="0 0 ${scene.width} ${scene.height}" role="img" aria-labelledby="diagram-title diagram-desc" data-root-qualified-name="${xml(diagram.rootQualifiedName)}">`,
    `  <title id="diagram-title">${xml(`${diagram.title} — ${diagram.rootQualifiedName}`)}</title>`,
    `  <desc id="diagram-desc">SysML architecture view for ${xml(diagram.rootQualifiedName)}</desc>`,
    "  <defs>",
    `    <marker id="arrow" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto"><path d="M0,0 L8,4 L0,8 z" fill="${theme.edge}"/></marker>`,
    `    <marker id="arrow-unresolved" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto"><path d="M0,0 L8,4 L0,8 z" fill="${theme.unresolved}"/></marker>`,
    "  </defs>",
  ];
  if (!(options.transparent ?? false)) lines.push(`  <rect width="100%" height="100%" fill="${theme.background}"/>`);
  lines.push(`  <g id="render-scene" transform="translate(${numeric(scene.translate.x)},${numeric(scene.translate.y)})">`);
  lines.push(`    <text x="${numeric(scene.bounds.x)}" y="${numeric(scene.bounds.y + 28)}" fill="${theme.text}" font-family="Inter,system-ui,sans-serif" font-size="20" font-weight="700">${xml(diagram.title)}</text>`);
  if (qname !== undefined) lines.push(`    <text id="root-qualified-name" x="${numeric(scene.bounds.x)}" y="${numeric(scene.bounds.y + 49)}" fill="${theme.mutedText}" font-family="Inter,system-ui,sans-serif" font-size="11">${xml(qname)}</text>`);

  lines.push('    <g id="container-backgrounds">');
  for (const node of diagram.nodes) {
    if (!containerNodeIds.has(node.id)) continue;
    const box = scene.nodes[node.id];
    if (!box) continue;
    lines.push(`      <rect id="${xml(node.id)}--background" data-element-id="${xml(node.elementId)}" x="${numeric(box.x)}" y="${numeric(box.y)}" width="${numeric(box.width)}" height="${numeric(box.height)}" rx="9" fill="${theme.nodeFill}" stroke="${theme.nodeStroke}" stroke-width="1.5"/>`);
  }
  lines.push("    </g>", '    <g id="edges" fill="none">');
  for (const route of scene.routes.filter((item) => item.kind === "semantic")) {
    const d = route.points.map((point, index) => `${index === 0 ? "M" : "L"}${numeric(point.x)},${numeric(point.y)}`).join(" ");
    lines.push(`      <path id="${xml(route.id)}" d="${d}" stroke="${route.unresolved ? theme.unresolved : theme.edge}" stroke-width="1.7" marker-end="url(#${route.unresolved ? "arrow-unresolved" : "arrow"})"${route.unresolved ? ' stroke-dasharray="5 4"' : ""}/>`);
  }
  lines.push("    </g>", '    <g id="presentation-edges" fill="none">');
  for (const route of scene.routes.filter((item) => item.kind !== "semantic")) {
    const d = route.points.map((point, index) => `${index === 0 ? "M" : "L"}${numeric(point.x)},${numeric(point.y)}`).join(" ");
    lines.push(`      <path id="${xml(route.id)}" data-presentation-only="true"${route.presentationKind ? ` data-kind="${route.presentationKind}"` : ""} d="${d}" stroke="${route.kind === "annotation" ? "#b7791f" : "#64748b"}" stroke-width="1.5" stroke-dasharray="${route.kind === "annotation" ? "4 3" : "7 5"}" marker-end="url(#arrow)"/>`);
  }
  lines.push("    </g>", '    <g id="edge-labels">');
  for (const label of scene.labels.filter((item) => item.kind === "edge" || item.kind === "presentation-edge")) {
    lines.push(
      `      <g id="${xml(label.id)}" class="edge-label${label.kind === "presentation-edge" ? " presentation-only" : ""}" data-edge-id="${xml(label.ownerId)}">`,
      `        <title>${xml(label.text)}</title>`,
      `        <rect x="${numeric(label.bounds.x)}" y="${numeric(label.bounds.y)}" width="${numeric(label.bounds.width)}" height="${numeric(label.bounds.height)}" rx="4" fill="${theme.nodeFill}" fill-opacity="0.94" stroke="${theme.edge}" stroke-opacity="0.22" stroke-width="0.8"/>`,
      `        <text x="${numeric(label.bounds.x + label.bounds.width / 2)}" y="${numeric(label.bounds.y + 13.5)}" text-anchor="middle" fill="${theme.text}" stroke="${theme.nodeFill}" stroke-width="3" paint-order="stroke" stroke-linejoin="round" font-family="Inter,system-ui,sans-serif" font-size="10" font-weight="600">${xml(label.text)}</text>`,
      "      </g>",
    );
  }
  lines.push("    </g>", '    <g id="leaf-nodes">');
  for (const node of diagram.nodes) {
    if (containerNodeIds.has(node.id)) continue;
    const box = scene.nodes[node.id];
    if (box) lines.push(...renderNodeForeground(node, box, scene.ports, theme, showPorts, showTypes, false));
  }
  lines.push("    </g>", '    <g id="container-foregrounds">');
  for (const node of diagram.nodes) {
    if (!containerNodeIds.has(node.id)) continue;
    const box = scene.nodes[node.id];
    if (box) lines.push(...renderNodeForeground(node, box, scene.ports, theme, showPorts, showTypes, true));
  }
  lines.push("    </g>", '    <g id="boundary-ports">');
  if (showPorts) {
    for (const port of diagram.boundaryPorts) {
      const point = scene.ports[port.id];
      if (!point) continue;
      const left = port.direction !== "out";
      lines.push(
        `      <circle cx="${numeric(point.x)}" cy="${numeric(point.y)}" r="5" fill="${portColor(port, theme)}"/>`,
        `      <text x="${numeric(point.x + (left ? 10 : -10))}" y="${numeric(point.y - 8)}" text-anchor="${left ? "start" : "end"}" fill="${theme.mutedText}" font-family="Inter,system-ui,sans-serif" font-size="9">${xml(port.label)}</text>`,
      );
    }
  }
  lines.push("    </g>", '    <g id="presentation-nodes">');
  for (const node of scene.presentationNodes) {
    const box = node.bounds;
    lines.push(
      `      <g id="${xml(node.id)}" data-presentation-only="true" data-kind="${node.kind}">`,
      `        <rect x="${numeric(box.x)}" y="${numeric(box.y)}" width="${numeric(box.width)}" height="${numeric(box.height)}" rx="9" fill="#f8fafc" stroke="#64748b" stroke-dasharray="7 5"/>`,
      `        <path d="M${numeric(box.x)},${numeric(box.y + 34)} H${numeric(box.x + box.width)}" stroke="#64748b" stroke-opacity="0.28"/>`,
      `        <text x="${numeric(box.x + 12)}" y="${numeric(box.y + 21)}" font-family="Inter,system-ui,sans-serif" font-size="8" font-weight="700" fill="#64748b">NON-SEMANTIC · ${node.kind.toUpperCase()}</text>`,
      `        <text x="${numeric(box.x + 12)}" y="${numeric(box.y + 61)}" font-family="Inter,system-ui,sans-serif" font-size="13" font-weight="700" fill="#334155">${xml(node.label)}</text>`,
      "      </g>",
    );
  }
  lines.push("    </g>", '    <g id="view-annotations">');
  const colors = { info: ["#fffbea", "#d6b85d"], success: ["#ecfdf5", "#16835b"], warning: ["#fffbeb", "#d97706"], error: ["#fef2f2", "#dc2626"] } as const;
  for (const annotation of scene.annotations) {
    const style = annotation.style ?? "info";
    const palette = colors[style];
    lines.push(
      `      <g data-annotation-id="${xml(annotation.id)}" data-style="${style}">`,
      `        <rect x="${numeric(annotation.bounds.x)}" y="${numeric(annotation.bounds.y)}" width="${numeric(annotation.bounds.width)}" height="${numeric(annotation.bounds.height)}" rx="9" fill="${palette[0]}" stroke="${palette[1]}" stroke-dasharray="4 3"/>`,
      ...annotation.lines.map((text, index) => `        <text x="${numeric(annotation.bounds.x + 14)}" y="${numeric(annotation.bounds.y + 23 + index * 17)}" font-family="Inter,system-ui,sans-serif" font-size="12" fill="#475569">${xml(text)}</text>`),
      "      </g>",
    );
  }
  lines.push("    </g>", "  </g>", "</svg>");
  return `${lines.join("\n")}\n`;
}

function legacyRenderDiagramSvg(
  diagram: DiagramModel,
  options: RenderSvgOptions = {},
): string {
  const theme: SvgTheme = { ...DEFAULT_THEME, ...options.theme };
  const automatic = defaultLayout(diagram);
  const geometry: Record<string, DiagramGeometry> = { ...automatic, ...(options.layout?.nodes ?? {}) };
  const bounds = Object.values(geometry).reduce(
    (result, box) => ({
      x: Math.max(result.x, box.x + box.width),
      y: Math.max(result.y, box.y + box.height),
    }),
    { x: 800, y: 500 },
  );
  const padding = options.padding ?? 54;
  const width = options.width ?? Math.ceil(bounds.x + padding);
  const height = options.height ?? Math.ceil(bounds.y + padding);
  const points = portPoints(diagram, geometry, width, height);
  const parentNodeIds = new Set(
    diagram.nodes
      .map((node) => node.parentNodeId)
      .filter((id): id is string => id !== null),
  );
  const containerNodeIds = new Set(
    diagram.nodes
      .filter((node) => node.expanded || parentNodeIds.has(node.id))
      .map((node) => node.id),
  );
  const showPorts = options.showPorts ?? true;
  const showTypes = options.showTypes ?? true;
  const visibleQualifiedName = showTypes
    ? truncateVisible(
        diagram.rootQualifiedName,
        Math.floor(Math.max(0, width - padding * 2) / 6.4),
      )
    : undefined;
  const lines: string[] = [
    `<svg xmlns="http://www.w3.org/2000/svg" width="${width}" height="${height}" viewBox="0 0 ${width} ${height}" role="img" aria-labelledby="diagram-title diagram-desc" data-root-qualified-name="${xml(diagram.rootQualifiedName)}">`,
    `  <title id="diagram-title">${xml(`${diagram.title} — ${diagram.rootQualifiedName}`)}</title>`,
    `  <desc id="diagram-desc">SysML architecture view for ${xml(diagram.rootQualifiedName)}</desc>`,
    "  <defs>",
    `    <marker id="arrow" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto"><path d="M0,0 L8,4 L0,8 z" fill="${theme.edge}"/></marker>`,
    `    <marker id="arrow-unresolved" markerWidth="8" markerHeight="8" refX="7" refY="4" orient="auto"><path d="M0,0 L8,4 L0,8 z" fill="${theme.unresolved}"/></marker>`,
    "  </defs>",
  ];
  if (!(options.transparent ?? false)) {
    lines.push(`  <rect width="100%" height="100%" fill="${theme.background}"/>`);
  }
  lines.push(
    `  <text x="${padding}" y="38" fill="${theme.text}" font-family="Inter, system-ui, sans-serif" font-size="20" font-weight="700">${xml(diagram.title)}</text>`,
  );
  if (visibleQualifiedName !== undefined) {
    lines.push(
      `  <text id="root-qualified-name" x="${padding}" y="59" fill="${theme.mutedText}" font-family="Inter, system-ui, sans-serif" font-size="11">${xml(visibleQualifiedName)}</text>`,
    );
  }
  lines.push('  <g id="container-backgrounds">');
  for (const node of diagram.nodes) {
    if (!containerNodeIds.has(node.id)) continue;
    const box = geometry[node.id];
    if (box === undefined) continue;
    lines.push(
      `    <rect id="${xml(node.id)}--background" data-element-id="${xml(node.elementId)}" x="${numeric(box.x)}" y="${numeric(box.y)}" width="${numeric(box.width)}" height="${numeric(box.height)}" rx="9" fill="${theme.nodeFill}" stroke="${theme.nodeStroke}" stroke-width="1.5"/>`,
    );
  }
  lines.push("  </g>", '  <g id="edges" fill="none">');
  const edgeLabels: EdgeLabelPlacement[] = [];
  for (const edge of diagram.edges) {
    const explicit = options.layout?.edges?.[edge.id];
    const source = edge.sourcePortId === null ? undefined : points[edge.sourcePortId];
    const target = edge.targetPortId === null ? undefined : points[edge.targetPortId];
    const route = explicit !== undefined && explicit.length >= 2
      ? explicit
      : source !== undefined && target !== undefined
        ? [source, { x: (source.x + target.x) / 2, y: source.y }, { x: (source.x + target.x) / 2, y: target.y }, target]
        : [];
    if (route.length < 2) continue;
    const data = route
      .map((point, index) => `${index === 0 ? "M" : "L"}${numeric(point.x)},${numeric(point.y)}`)
      .join(" ");
    const stroke = edge.unresolved ? theme.unresolved : theme.edge;
    const marker = edge.unresolved ? "arrow-unresolved" : "arrow";
    lines.push(
      `    <path id="${xml(edge.id)}" d="${data}" stroke="${stroke}" stroke-width="1.7" marker-end="url(#${marker})"${edge.unresolved ? ' stroke-dasharray="5 4"' : ""}/>`,
    );
    const fullLabel = edge.label.trim();
    const midpoint = routeMidpoint(route);
    if ((options.showEdgeLabels ?? true) && fullLabel !== "" && midpoint !== undefined) {
      const availableWidth = Math.max(8, width - 12);
      const visibleLabel = truncateVisible(fullLabel, Math.floor(availableWidth / 6.2));
      if (visibleLabel !== undefined) {
        const labelWidth = Math.min(availableWidth, Math.max(36, visibleLabel.length * 6.2 + 16));
        edgeLabels.push({
          edgeId: edge.id,
          fullLabel,
          visibleLabel,
          x: Math.max(labelWidth / 2 + 6, Math.min(width - labelWidth / 2 - 6, midpoint.x)),
          y: Math.max(13, Math.min(height - 13, midpoint.y - 10)),
          width: labelWidth,
        });
      }
    }
  }
  lines.push("  </g>", '  <g id="edge-labels">');
  for (const label of edgeLabels) {
    lines.push(
      `    <g id="${xml(label.edgeId)}--label" class="edge-label" data-edge-id="${xml(label.edgeId)}">`,
      `      <title>${xml(label.fullLabel)}</title>`,
      `      <rect x="${numeric(label.x - label.width / 2)}" y="${numeric(label.y - 10)}" width="${numeric(label.width)}" height="20" rx="4" fill="${theme.nodeFill}" fill-opacity="0.94" stroke="${theme.edge}" stroke-opacity="0.22" stroke-width="0.8"/>`,
      `      <text x="${numeric(label.x)}" y="${numeric(label.y + 3.5)}" text-anchor="middle" fill="${theme.text}" stroke="${theme.nodeFill}" stroke-width="3" paint-order="stroke" stroke-linejoin="round" font-family="Inter, system-ui, sans-serif" font-size="10" font-weight="600">${xml(label.visibleLabel)}</text>`,
      "    </g>",
    );
  }
  lines.push("  </g>", '  <g id="leaf-nodes">');
  for (const node of diagram.nodes) {
    if (containerNodeIds.has(node.id)) continue;
    const box = geometry[node.id];
    if (box === undefined) continue;
    lines.push(...renderNodeForeground(node, box, points, theme, showPorts, showTypes, false));
  }
  lines.push("  </g>", '  <g id="container-foregrounds">');
  for (const node of diagram.nodes) {
    if (!containerNodeIds.has(node.id)) continue;
    const box = geometry[node.id];
    if (box === undefined) continue;
    lines.push(...renderNodeForeground(node, box, points, theme, showPorts, showTypes, true));
  }
  lines.push("  </g>", '  <g id="boundary-ports">');
  if (showPorts) {
    for (const port of diagram.boundaryPorts) {
      const point = points[port.id];
      if (point === undefined) continue;
      const left = port.direction !== "out";
      lines.push(
        `    <circle cx="${numeric(point.x)}" cy="${numeric(point.y)}" r="5" fill="${portColor(port, theme)}"/>`,
        `    <text x="${numeric(point.x + (left ? 10 : -10))}" y="${numeric(point.y - 8)}" text-anchor="${left ? "start" : "end"}" fill="${theme.mutedText}" font-family="Inter, system-ui, sans-serif" font-size="9">${xml(port.label)}</text>`,
      );
    }
  }
  lines.push("  </g>", "</svg>");
  return `${lines.join("\n")}\n`;
}

/** Produce dependency-free, deterministic SVG suitable for CLI export and golden tests. */
export function renderDiagramSvg(diagram: DiagramModel, options: RenderSvgOptions = {}): string {
  return renderSceneSvg(diagram, options);
}

// Keep the original implementation type-checked until downstream consumers
// have completed their transition to the shared scene.
void legacyRenderDiagramSvg;
