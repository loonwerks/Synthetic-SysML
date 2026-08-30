import assert from 'node:assert/strict';
import test from 'node:test';
import { hasDiagramCollision, layoutDiagram, repairDiagramCollisions } from '../src/layout.ts';
import type { SysmlFlowEdge, SysmlFlowNode } from '../src/types.ts';

function node(id: string, height: number, pinned = false): SysmlFlowNode {
  return {
    id,
    type: 'sysmlNode',
    position: { x: 0, y: 0 },
    data: {
      element: {
        id,
        kind: 'component',
        label: id,
        position: { x: 0, y: 0 },
        pinned,
        dimensions: { width: 248, height },
        ports: [],
        contractCounts: { invariants: 0, assumptions: 0, guarantees: 0, cases: 0, requirements: 0 },
      },
    },
  };
}

function edge(
  id: string,
  source: string,
  target: string,
  data: SysmlFlowEdge['data'] = {},
): SysmlFlowEdge {
  return { id, source, target, type: 'routed', data };
}

test('ELK layout is deterministic, overlap-free, and keeps obstacle-aware routes', async () => {
  const nodes = [node('a', 260), node('b', 150), node('c', 210), node('d', 180)];
  const edges = [
    edge('ab', 'a', 'b'),
    edge('ac', 'a', 'c'),
    edge('bd', 'b', 'd'),
    edge('cd', 'c', 'd'),
    edge('da', 'd', 'a'),
  ];
  const first = await layoutDiagram(nodes, edges);
  const second = await layoutDiagram(nodes, edges);

  assert.deepEqual(
    first.nodes.map(({ id, position }) => ({ id, position })),
    second.nodes.map(({ id, position }) => ({ id, position })),
  );
  for (let index = 0; index < first.nodes.length; index += 1) {
    const left = first.nodes[index]!;
    for (let other = index + 1; other < first.nodes.length; other += 1) {
      const right = first.nodes[other]!;
      const separated =
        left.position.x + 248 <= right.position.x ||
        right.position.x + 248 <= left.position.x ||
        left.position.y + left.data.element.dimensions!.height <= right.position.y ||
        right.position.y + right.data.element.dimensions!.height <= left.position.y;
      assert.ok(separated, `${left.id} and ${right.id} must not overlap`);
    }
  }
  assert.deepEqual(Object.keys(first.edgeRoutes).sort(), edges.map(({ id }) => id).sort());
  for (const route of Object.values(first.edgeRoutes)) {
    assert.equal(route.pinned, false);
    assert.ok(route.sourceAttachment);
    assert.ok(route.targetAttachment);
  }
});

test('ELK layout leaves pinned nodes fixed and declines stale absolute routes', async () => {
  const anchor = node('anchor', 180, true);
  anchor.position = { x: 777, y: 333 };
  const result = await layoutDiagram(
    [anchor, node('target', 180)],
    [edge('connection', 'anchor', 'target')],
  );

  assert.deepEqual(result.nodes.find(({ id }) => id === 'anchor')?.position, { x: 777, y: 333 });
  assert.deepEqual(result.edgeRoutes, {});
});

test('ELK does not persist node-to-node bends for exact semantic-port edges', async () => {
  const result = await layoutDiagram(
    [node('source', 180), node('target', 180)],
    [edge('port-edge', 'source', 'target', { sourceIsPort: true, targetIsPort: true })],
  );

  assert.deepEqual(result.edgeRoutes, {});
});

test('repair preserves clear saved coordinates and separates presentation objects', () => {
  const semantic = node('system', 180, true);
  semantic.position = { x: 100, y: 100 };
  const presentationNodes = [
    { id: 'pilot', label: 'Pilot', kind: 'actor' as const, x: 100, y: 100 },
    { id: 'display', label: 'Display', kind: 'reference' as const, x: 800, y: 100 },
  ];
  const annotations = [
    { id: 'warning', text: 'Review this interface before release.', position: { x: 100, y: 100 } },
    { id: 'clear-note', text: 'This note is already clear.', position: { x: 1100, y: 400 } },
  ];

  const repaired = repairDiagramCollisions([semantic], { presentationNodes, annotations });

  assert.deepEqual(repaired.nodes[0]?.position, { x: 100, y: 100 }, 'pinned semantic node must not move');
  assert.deepEqual(
    repaired.presentationNodes.find(({ id }) => id === 'display'),
    presentationNodes[1],
    'clear saved presentation coordinates must remain exact',
  );
  assert.deepEqual(
    repaired.annotations.find(({ id }) => id === 'clear-note'),
    annotations[1],
    'clear saved annotation coordinates must remain exact',
  );
  assert.equal(hasDiagramCollision(repaired.nodes, repaired), false);
  assert.deepEqual(repaired.moved.map(({ id }) => id), ['pilot', 'warning']);
});

test('repair is deterministic and idempotent', () => {
  const first = node('a', 180, true);
  const second = node('b', 180);
  first.position = { x: 0, y: 0 };
  second.position = { x: 0, y: 0 };
  const input = {
    presentationNodes: [{ id: 'actor', label: 'Actor', kind: 'actor' as const, x: 0, y: 0 }],
    annotations: [{ id: 'note', text: 'A colliding note', position: { x: 0, y: 0 } }],
  };

  const repaired = repairDiagramCollisions([first, second], input);
  const repeated = repairDiagramCollisions(repaired.nodes, repaired);
  const independent = repairDiagramCollisions([first, second], input);

  assert.deepEqual(repaired, independent);
  assert.deepEqual(repeated.nodes, repaired.nodes);
  assert.deepEqual(repeated.presentationNodes, repaired.presentationNodes);
  assert.deepEqual(repeated.annotations, repaired.annotations);
  assert.deepEqual(repeated.moved, []);
});
