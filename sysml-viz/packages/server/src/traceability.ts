import { readFile, realpath } from "node:fs/promises";
import path from "node:path";

export interface MarkdownTraceAnchor {
  id: string;
  heading?: string;
  startLine: number;
  endLine: number;
  /** Zero-based UTF-16 offsets, matching JavaScript string slicing. */
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

interface MarkdownLine {
  text: string;
  start: number;
  end: number;
}

function markdownLines(markdown: string): MarkdownLine[] {
  const result: MarkdownLine[] = [];
  let start = 0;
  while (start < markdown.length) {
    const newline = markdown.indexOf("\n", start);
    const end = newline < 0 ? markdown.length : newline + 1;
    result.push({ text: markdown.slice(start, end), start, end });
    start = end;
  }
  if (markdown.length === 0) result.push({ text: "", start: 0, end: 0 });
  return result;
}

/** Parse explicit `ID: prose` declarations into exact, one-based line ranges. */
export function parseMarkdownTraceAnchors(markdown: string): MarkdownTraceAnchor[] {
  const lines = markdownLines(markdown);
  const declarations = lines.flatMap((line, index) => {
    const match = line.text.match(
      /^([A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?)(?:\s*\/\s*([A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?))?(?:\s*(?:\([^\)\n]*\)|\[[^\]\n]*\]))?(?::\s*|\s+[—-]\s+)/u,
    );
    return (match?.slice(1, 3).filter((id): id is string => Boolean(id)) ?? [])
      .map((id) => ({ id, index }));
  });
  return declarations.map((declaration, declarationIndex) => {
    const nextDeclaration = declarations
      .slice(declarationIndex + 1)
      .find((candidate) => candidate.index > declaration.index)?.index ?? lines.length;
    let hardBoundary = nextDeclaration;
    for (let index = declaration.index + 1; index < nextDeclaration; index += 1) {
      if (/^#{1,6}\s/u.test(lines[index]?.text ?? "")) {
        hardBoundary = index;
        break;
      }
    }
    const paragraphEnd = (start: number): number => {
      let end = start;
      while (end < hardBoundary && (lines[end]?.text ?? "").trim() !== "") end += 1;
      return end;
    };
    const skipBlanks = (start: number): number => {
      let next = start;
      while (next < hardBoundary && (lines[next]?.text ?? "").trim() === "") next += 1;
      return next;
    };
    let endIndex = paragraphEnd(declaration.index);
    let nextParagraph = skipBlanks(endIndex);
    const declarationText = lines
      .slice(declaration.index, endIndex)
      .map((line) => line.text.trim())
      .join(" ")
      .replace(
        /^[A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?(?:\s*\/\s*[A-Z][A-Z0-9]*(?:-[A-Z][A-Z0-9]*)*-\d+[A-Z]?)?(?:\s*(?:\([^\)\n]*\)|\[[^\]\n]*\]))?(?::|\s+[—-]\s+)\s*/u,
        "",
      )
      .trim();
    // Title-style declarations (for example `PART-01: Sensor Intake`) own
    // the immediately following descriptive paragraph. Full-sentence
    // declarations do not absorb unrelated free prose after a blank line.
    if (nextParagraph < hardBoundary && !/[.!?]$/u.test(declarationText)) {
      endIndex = paragraphEnd(nextParagraph);
      nextParagraph = skipBlanks(endIndex);
    }
    // Explicit rationale/verification paragraphs are part of the clause.
    while (/^(Rationale|Verification):\s/u.test(lines[nextParagraph]?.text ?? "")) {
      endIndex = paragraphEnd(nextParagraph);
      nextParagraph = skipBlanks(endIndex);
    }
    let heading: string | undefined;
    for (let index = declaration.index - 1; index >= 0; index -= 1) {
      const match = lines[index]?.text.match(/^#{1,6}\s+(.+?)\s*$/u);
      if (match?.[1]) {
        heading = match[1];
        break;
      }
    }
    const first = lines[declaration.index]!;
    const last = lines[Math.max(declaration.index, endIndex - 1)]!;
    return {
      id: declaration.id,
      ...(heading ? { heading } : {}),
      startLine: declaration.index + 1,
      endLine: Math.max(declaration.index + 1, endIndex),
      startOffset: first.start,
      endOffset: last.end,
      text: markdown.slice(first.start, last.end).replace(/[\r\n]+$/u, ""),
    };
  });
}

function isWithin(root: string, candidate: string): boolean {
  const relative = path.relative(root, candidate);
  return relative === "" || (!relative.startsWith(`..${path.sep}`) && relative !== ".." && !path.isAbsolute(relative));
}

/** Resolve only conventional System Abstract locations inside the workspace. */
export async function loadSystemAbstract(
  projectRoot: string,
  workspaceRoot: string,
  referencedTraceIds: readonly string[] = [],
  traceCounts: Readonly<{
    taggedElementCount: number;
    traceAssociationCount: number;
  }> = { taggedElementCount: 0, traceAssociationCount: 0 },
): Promise<SystemAbstractDocument | null> {
  const boundedWorkspace = await realpath(workspaceRoot);
  const candidates = [
    path.join(projectRoot, "system-abstract.md"),
    path.join(path.dirname(projectRoot), "system-abstract.md"),
  ];
  for (const candidate of candidates) {
    let canonical: string;
    try {
      canonical = await realpath(candidate);
    } catch {
      continue;
    }
    if (!isWithin(boundedWorkspace, canonical)) continue;
    const markdown = await readFile(canonical, "utf8");
    const anchors = parseMarkdownTraceAnchors(markdown);
    const anchorCounts = new Map<string, number>();
    for (const anchor of anchors) {
      anchorCounts.set(anchor.id, (anchorCounts.get(anchor.id) ?? 0) + 1);
    }
    const defined = new Set(anchorCounts.keys());
    const referenced = [...new Set(referencedTraceIds)].sort();
    return {
      schemaVersion: 1,
      path: canonical,
      relativePath: path.relative(boundedWorkspace, canonical),
      markdown,
      anchors,
      taggedElementCount: traceCounts.taggedElementCount,
      traceAssociationCount: traceCounts.traceAssociationCount,
      referencedTraceIds: referenced,
      unresolvedTraceIds: referenced.filter((id) => !defined.has(id)),
      duplicateAnchorIds: [...anchorCounts]
        .filter(([, count]) => count > 1)
        .map(([id]) => id)
        .sort(),
    };
  }
  return null;
}
