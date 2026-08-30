import assert from 'node:assert/strict';
import test from 'node:test';
import { nextExpandedIds, toFlowNodes } from '../src/App.tsx';
import type { DiagramData, DiagramNodePayload, NamedView } from '../src/types.ts';

const counts = { invariants: 0, assumptions: 0, guarantees: 0, cases: 0, requirements: 0 };

function payload(id: string, parentId?: string): DiagramNodePayload {
  return {
    id,
    kind: 'component',
    label: id,
    canExpand: id === 'parent',
    ...(parentId ? { parentId } : {}),
    position: { x: 100, y: 100 },
    dimensions: { width: 248, height: 153 },
    pinned: false,
    ports: [],
    contractCounts: counts,
  };
}

test('expanded children are packed inside a real container instead of stacked at its origin', () => {
  const diagram: DiagramData = {
    revision: 1,
    rootId: 'root',
    nodes: [payload('parent'), payload('first', 'parent'), payload('second', 'parent'), payload('edge', 'parent')],
    edges: [],
    breadcrumbs: [],
    diagnostics: [],
    validation: { status: 'not-run' },
  };
  const view: NamedView = {
    id: 'view',
    name: 'View',
    rootId: 'root',
    positions: {
      parent: { x: 100, y: 100, width: 248, height: 153 },
      first: { x: 100, y: 100, width: 248, height: 153 },
      second: { x: 100, y: 100, width: 248, height: 153 },
    },
    edgeRoutes: {},
    pinned: [],
    hidden: [],
    expanded: ['parent'],
    aliases: {},
    annotations: [],
  };

  const nodes = toFlowNodes(diagram, view);
  const parent = nodes.find(({ id }) => id === 'parent')!;
  const first = nodes.find(({ id }) => id === 'first')!;
  const second = nodes.find(({ id }) => id === 'second')!;
  assert.equal(parent.data.isContainer, true);
  assert.ok(parent.data.element.dimensions!.width >= 640);
  assert.ok(parent.data.element.dimensions!.height >= 380);
  assert.equal(first.parentId, 'parent');
  assert.equal(second.parentId, 'parent');
  assert.notDeepEqual(first.position, second.position);
  for (const child of [first, second]) {
    assert.ok(child.position.x >= 28);
    assert.ok(child.position.y >= 72);
    assert.ok(child.position.x + child.data.element.dimensions!.width <= parent.data.element.dimensions!.width);
    assert.ok(child.position.y + child.data.element.dimensions!.height <= parent.data.element.dimensions!.height);
  }
});

test('expansion toggles canonical semantic IDs and collapses stale container geometry', () => {
  const element = {
    ...payload('node:root/parent'),
    elementId: 'part:Root::parent',
    expanded: true,
  };
  assert.deepEqual(
    nextExpandedIds(['part:Root::parent', 'unrelated'], element),
    ['unrelated'],
  );
  assert.deepEqual(
    nextExpandedIds(['unrelated'], { ...element, expanded: false }),
    ['unrelated', 'part:Root::parent'],
  );

  const diagram: DiagramData = {
    revision: 2,
    rootId: 'root',
    nodes: [{ ...element, expanded: false, dimensions: { width: 900, height: 600 } }],
    edges: [],
    breadcrumbs: [],
    diagnostics: [],
    validation: { status: 'not-run' },
  };
  const view: NamedView = {
    id: 'view',
    name: 'View',
    rootId: 'root',
    positions: { [element.id]: { x: 100, y: 100, width: 900, height: 600 } },
    edgeRoutes: {},
    pinned: [],
    hidden: [],
    expanded: [],
    aliases: {},
    annotations: [],
  };
  const collapsed = toFlowNodes(diagram, view)[0]!;
  assert.equal(collapsed.data.isContainer, false);
  assert.equal(collapsed.data.element.dimensions?.width, 248);
  assert.ok((collapsed.data.element.dimensions?.height ?? 0) < 250);
});

test('saved overlapping and near-edge children remain authoritative across flow conversion', () => {
  const diagram: DiagramData = {
    revision: 3, rootId: 'root',
    nodes: [payload('parent'), payload('first', 'parent'), payload('second', 'parent'), payload('edge', 'parent')],
    edges: [], breadcrumbs: [], diagnostics: [], validation: { status: 'not-run' },
  };
  const view: NamedView = {
    id: 'view', name: 'View', rootId: 'root', edgeRoutes: {}, pinned: [], hidden: [], expanded: ['parent'], aliases: {}, annotations: [],
    positions: {
      parent: { x: 100, y: 100, width: 640, height: 420 },
      first: { x: 128, y: 172, width: 248, height: 153 },
      // This intentionally overlaps first.
      second: { x: 170, y: 190, width: 248, height: 153 },
      edge: { x: 464, y: 339, width: 248, height: 153 },
    },
  };
  const convert = () => toFlowNodes(diagram, view).map((node) => ({ id: node.id, position: node.position }));
  const first = convert();
  const second = convert();
  assert.deepEqual(first, second);
  assert.deepEqual(first.find((node) => node.id === 'first')?.position, { x: 28, y: 72 });
  assert.deepEqual(first.find((node) => node.id === 'second')?.position, { x: 70, y: 90 });
  assert.deepEqual(first.find((node) => node.id === 'edge')?.position, { x: 364, y: 239 });
});

test('packing a missing child leaves valid siblings untouched and avoids their envelope', () => {
  const diagram: DiagramData = {
    revision: 4, rootId: 'root',
    nodes: [payload('parent'), payload('first', 'parent'), payload('new-child', 'parent')],
    edges: [], breadcrumbs: [], diagnostics: [], validation: { status: 'not-run' },
  };
  const view: NamedView = {
    id: 'view', name: 'View', rootId: 'root', edgeRoutes: {}, pinned: [], hidden: [], expanded: ['parent'], aliases: {}, annotations: [],
    positions: {
      parent: { x: 100, y: 100, width: 640, height: 380 },
      first: { x: 128, y: 172, width: 248, height: 153 },
    },
  };

  const nodes = toFlowNodes(diagram, view);
  assert.deepEqual(nodes.find((node) => node.id === 'first')?.position, { x: 28, y: 72 });
  assert.deepEqual(nodes.find((node) => node.id === 'new-child')?.position, { x: 28, y: 253 });
});
