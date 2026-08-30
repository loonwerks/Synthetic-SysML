import assert from 'node:assert/strict';
import test from 'node:test';
import { browserClientId, isOwnViewMutationEvent, normalizeViewsDocument } from '../src/api.ts';

test('module import creates a Node-safe client identity without window', () => {
  assert.match(browserClientId, /^web-node-/);
});

test('only matching view mutation echoes are classified as local', () => {
  assert.equal(isOwnViewMutationEvent({
    type: 'view.updated',
    data: { clientId: 'tab-a', mutationId: 'tab-a:3' },
  }, 'tab-a'), true);
  assert.equal(isOwnViewMutationEvent({
    type: 'view.updated',
    data: { clientId: 'tab-b', mutationId: 'tab-b:1' },
  }, 'tab-a'), false);
  assert.equal(isOwnViewMutationEvent({
    type: 'model.updated',
    data: { clientId: 'tab-a' },
  }, 'tab-a'), false);
  assert.equal(isOwnViewMutationEvent({ type: 'connection.ready' }, 'tab-a'), false);
});

test('raw layout mutation documents derive the browser pinned list', () => {
  const normalized = normalizeViewsDocument({
    schemaVersion: 2,
    viewRevision: 4,
    activeViewId: 'architecture',
    views: [{
      id: 'architecture',
      name: 'Architecture',
      rootId: 'root',
      positions: {
        first: { x: 1, y: 2, pinned: true },
        second: { x: 3, y: 4, pinned: false },
      } as Record<string, { x: number; y: number }>,
      edgeRoutes: {}, hidden: [], expanded: [], aliases: {}, annotations: [],
      pinned: undefined,
    }],
  } as never);
  assert.deepEqual(normalized.views[0]?.pinned, ['first']);
});
