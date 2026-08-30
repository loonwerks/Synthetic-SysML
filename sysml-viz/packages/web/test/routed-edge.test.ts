import assert from 'node:assert/strict';
import test from 'node:test';
import { routeBendsAlignWithEndpoints } from '../src/components/RoutedEdge.tsx';

test('stale bend chains are rejected when they no longer meet the rendered endpoints orthogonally', () => {
  assert.equal(
    routeBendsAlignWithEndpoints(
      [{ x: 80, y: 20 }, { x: 80, y: 120 }],
      { x: 20, y: 20 },
      { x: 140, y: 120 },
    ),
    true,
  );
  assert.equal(
    routeBendsAlignWithEndpoints(
      [{ x: 80, y: 60 }, { x: 80, y: 120 }],
      { x: 20, y: 20 },
      { x: 140, y: 120 },
    ),
    false,
  );
});
