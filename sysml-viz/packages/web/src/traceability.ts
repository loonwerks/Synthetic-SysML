import type { MarkdownTraceAnchor, ModelContractRecord } from './types';

export interface MarkdownDisplayBlock {
  key: string;
  text: string;
  startLine: number;
  endLine: number;
  traceIds?: string[];
}

export interface TraceNavigationMatch {
  blockKey: string;
  traceIds: string[];
}

/** Return document-ordered, distinct ranges matching any requested trace ID. */
export function traceNavigationMatches(
  blocks: readonly MarkdownDisplayBlock[],
  traceIds: readonly string[],
): TraceNavigationMatch[] {
  const requested = new Set(traceIds);
  if (requested.size === 0) return [];
  return blocks.flatMap((block) => {
    const matchingIds = block.traceIds?.filter((id) => requested.has(id)) ?? [];
    return matchingIds.length > 0 ? [{ blockKey: block.key, traceIds: matchingIds }] : [];
  });
}

/** Return each explicitly linked contract once, preserving model/source order. */
export function contractsForTraceIds(
  contracts: readonly ModelContractRecord[],
  traceIds: readonly string[],
): ModelContractRecord[] {
  const requested = new Set(traceIds);
  if (requested.size === 0) return [];
  return contracts.filter((contract) =>
    contract.traceIds?.some((traceId) => requested.has(traceId)) ?? false,
  );
}

/** Partition the complete source around non-overlapping server-provided ranges. */
export function markdownDisplayBlocks(
  markdown: string,
  anchors: readonly MarkdownTraceAnchor[],
): MarkdownDisplayBlock[] {
  const blocks: MarkdownDisplayBlock[] = [];
  const ordered = [...anchors].sort((left, right) => left.startOffset - right.startOffset);
  let offset = 0;
  let line = 1;
  const push = (text: string, startLine: number, traceIds?: string[]): void => {
    if (!text) return;
    const newlineCount = (text.match(/\n/gu) ?? []).length;
    blocks.push({
      key: traceIds ? `trace:${traceIds.join(':')}:${startLine}` : `prose:${startLine}:${blocks.length}`,
      text,
      startLine,
      endLine: startLine + newlineCount,
      ...(traceIds ? { traceIds } : {}),
    });
  };
  for (let index = 0; index < ordered.length; index += 1) {
    const anchor = ordered[index]!;
    if (anchor.startOffset < offset || anchor.endOffset < anchor.startOffset) continue;
    const traceIds = [anchor.id];
    while (
      ordered[index + 1]?.startOffset === anchor.startOffset &&
      ordered[index + 1]?.endOffset === anchor.endOffset
    ) {
      traceIds.push(ordered[index + 1]!.id);
      index += 1;
    }
    const prose = markdown.slice(offset, anchor.startOffset);
    push(prose, line);
    line += (prose.match(/\n/gu) ?? []).length;
    const traced = markdown.slice(anchor.startOffset, anchor.endOffset);
    push(traced, anchor.startLine, traceIds);
    line = anchor.endLine + ((traced.endsWith('\n') || traced === '') ? 0 : 1);
    offset = anchor.endOffset;
  }
  push(markdown.slice(offset), line);
  return blocks;
}
