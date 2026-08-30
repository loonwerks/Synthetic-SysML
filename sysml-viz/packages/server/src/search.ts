import path from "node:path";

import type { NormalizedElement, NormalizedModel, SourceSpan } from "@sysml-viz/core";

export interface ModelSearchResult {
  id: string;
  label: string;
  qualifiedName?: string;
  kind: string;
  score: number;
  snippet?: string;
  ownerId?: string;
  source: {
    file: string;
    line: number;
    column: number;
    endLine: number;
    endColumn: number;
  };
}

function location(span: SourceSpan): ModelSearchResult["source"] {
  return {
    file: span.file,
    line: span.start.line,
    column: span.start.column,
    endLine: span.end.line,
    endColumn: span.end.column,
  };
}

function elementLabel(element: NormalizedElement): string {
  return element.kind === "requirement"
    ? element.requirementId
    : element.name;
}

function ownerId(element: NormalizedElement): string | undefined {
  if (
    element.kind === "part-usage" ||
    element.kind === "port" ||
    element.kind === "connection" ||
    element.kind === "allocation"
  ) {
    return element.ownerDefinitionId;
  }
  if (
    element.kind === "gumbo-block" ||
    element.kind === "gumbo-contract" ||
    element.kind === "requirement"
  ) {
    return element.ownerId;
  }
  return undefined;
}

function elementContent(element: NormalizedElement): string {
  switch (element.kind) {
    case "part-definition":
      return `${element.category} ${element.baseType ?? ""}`;
    case "part-usage":
      return `${element.category} ${element.typeName}`;
    case "port":
      return `${element.direction} ${element.portKind} ${element.typeName ?? ""}`;
    case "connection":
      return `${element.connectionType} ${element.source.raw} ${element.target.raw}`;
    case "allocation":
      return `${element.allocationType} ${element.source.raw} ${element.target.raw}`;
    case "gumbo-block":
      return element.raw;
    case "gumbo-contract":
      return `${element.contractKind} ${element.phase} ${element.description ?? ""} ${element.expression} ${element.raw}`;
    case "requirement":
      return `${element.contractKind} ${element.phase} ${element.description ?? ""} ${element.expression} ${element.urls.join(" ")}`;
    case "import":
      return element.target;
    case "package":
      return element.qualifiedName;
  }
}

function scoreMatch(query: string, label: string, qualifiedName: string, content: string, file: string): number {
  const normalizedLabel = label.toLocaleLowerCase();
  if (normalizedLabel === query) return 100;
  if (normalizedLabel.startsWith(query)) return 80;
  if (normalizedLabel.includes(query)) return 65;
  if (qualifiedName.toLocaleLowerCase().includes(query)) return 50;
  if (content.toLocaleLowerCase().includes(query)) return 30;
  if (file.toLocaleLowerCase().includes(query)) return 15;
  return 0;
}

function snippet(content: string, query: string): string | undefined {
  const collapsed = content.replace(/\s+/gu, " ").trim();
  if (!collapsed) return undefined;
  const index = collapsed.toLocaleLowerCase().indexOf(query);
  const start = Math.max(0, index < 0 ? 0 : index - 55);
  const rendered = collapsed.slice(start, start + 180).trim();
  return `${start > 0 ? "…" : ""}${rendered}${start + 180 < collapsed.length ? "…" : ""}`;
}

/** Search semantic names, ports, files, connection endpoints, and raw GUMBO text. */
export function searchModel(
  model: NormalizedModel,
  rawQuery: string,
  limit = 75,
): ModelSearchResult[] {
  const query = rawQuery.trim().toLocaleLowerCase();
  if (!query) return [];
  const results: ModelSearchResult[] = [];

  for (const file of model.files) {
    const label = file.relativePath;
    const qualified = file.path;
    const score = scoreMatch(query, label, qualified, file.origin, file.path);
    if (score > 0) {
      results.push({
        id: `file:${file.path}`,
        label,
        qualifiedName: qualified,
        kind: "file",
        score,
        snippet: `${file.origin} SysML source`,
        source: { file: file.path, line: 1, column: 1, endLine: 1, endColumn: 1 },
      });
    }
  }

  for (const element of Object.values(model.elements)) {
    const label = elementLabel(element);
    const content = elementContent(element);
    const fileName = path.basename(element.span.file);
    const score = scoreMatch(query, label, element.qualifiedName, content, fileName);
    if (score === 0) continue;
    const owner = ownerId(element);
    const renderedSnippet = snippet(content, query);
    results.push({
      id: element.id,
      label,
      qualifiedName: element.qualifiedName,
      kind: element.kind,
      score,
      ...(owner === undefined ? {} : { ownerId: owner }),
      ...(renderedSnippet === undefined ? {} : { snippet: renderedSnippet }),
      source: location(element.span),
    });
  }

  return results
    .sort(
      (left, right) =>
        right.score - left.score ||
        left.label.localeCompare(right.label) ||
        Number(left.kind !== "requirement") - Number(right.kind !== "requirement") ||
        left.id.localeCompare(right.id),
    )
    .slice(0, Math.max(1, Math.min(250, limit)));
}
