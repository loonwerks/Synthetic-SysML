import assert from 'node:assert/strict';
import test from 'node:test';
import { nextRovingTabIndex } from '../src/components/useRovingTabs.ts';

test('arrow keys move through tabs and wrap at either end', () => {
  assert.equal(nextRovingTabIndex(0, 3, 'ArrowRight'), 1);
  assert.equal(nextRovingTabIndex(2, 3, 'ArrowRight'), 0);
  assert.equal(nextRovingTabIndex(2, 3, 'ArrowLeft'), 1);
  assert.equal(nextRovingTabIndex(0, 3, 'ArrowLeft'), 2);
});

test('Home and End move to the first and last tabs', () => {
  assert.equal(nextRovingTabIndex(1, 3, 'Home'), 0);
  assert.equal(nextRovingTabIndex(1, 3, 'End'), 2);
});

test('unhandled keys and invalid tab collections do not move selection', () => {
  assert.equal(nextRovingTabIndex(1, 3, 'Enter'), undefined);
  assert.equal(nextRovingTabIndex(0, 0, 'ArrowRight'), undefined);
  assert.equal(nextRovingTabIndex(-1, 3, 'ArrowRight'), undefined);
  assert.equal(nextRovingTabIndex(3, 3, 'ArrowLeft'), undefined);
});
