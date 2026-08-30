import assert from 'node:assert/strict';
import test from 'node:test';
import { contractsForTraceIds, markdownDisplayBlocks, traceNavigationMatches } from '../src/traceability.ts';
import type { ModelContractRecord } from '../src/types.ts';

test('display blocks preserve every Markdown byte and carry exact trace IDs', () => {
  const markdown = '# Abstract\n\nPART-01: First.\nMore.\n\nPART-02: Second.\n';
  const firstStart = markdown.indexOf('PART-01');
  const secondStart = markdown.indexOf('PART-02');
  const blocks = markdownDisplayBlocks(markdown, [
    { id: 'PART-01', startLine: 3, endLine: 4, startOffset: firstStart, endOffset: secondStart, text: 'unused' },
    { id: 'PART-02', startLine: 6, endLine: 6, startOffset: secondStart, endOffset: markdown.length, text: 'unused' },
  ]);
  assert.equal(blocks.map((block) => block.text).join(''), markdown);
  assert.deepEqual(blocks.filter((block) => block.traceIds).flatMap((block) => block.traceIds), ['PART-01', 'PART-02']);
});

test('navigation matches are distinct ranges in document order', () => {
  const blocks = [
    { key: 'prose', text: 'intro', startLine: 1, endLine: 1 },
    { key: 'part', text: 'part', startLine: 2, endLine: 2, traceIds: ['PART-01'] },
    { key: 'shared', text: 'behavior', startLine: 3, endLine: 3, traceIds: ['BEH-01', 'CASE-01'] },
    { key: 'other', text: 'other', startLine: 4, endLine: 4, traceIds: ['PART-02'] },
  ];
  assert.deepEqual(traceNavigationMatches(blocks, ['CASE-01', 'PART-01', 'BEH-01']), [
    { blockKey: 'part', traceIds: ['PART-01'] },
    { blockKey: 'shared', traceIds: ['BEH-01', 'CASE-01'] },
  ]);
  assert.deepEqual(traceNavigationMatches(blocks, []), []);
});

test('reverse trace lookup preserves source order and de-duplicates many-to-many contracts', () => {
  const contract = (
    id: string,
    traceIds: string[],
  ): ModelContractRecord => ({
    id,
    name: id,
    kind: 'guarantee',
    text: 'true',
    traceIds,
    ownerId: `owner-${id}`,
  });
  const contracts = [
    contract('first', ['MON-01', 'SAF-03']),
    contract('second', ['SAF-03']),
    contract('unlinked', []),
  ];
  assert.deepEqual(
    contractsForTraceIds(contracts, ['SAF-03', 'MON-01']).map((entry) => entry.id),
    ['first', 'second'],
  );
  assert.deepEqual(contractsForTraceIds(contracts, []), []);
});
