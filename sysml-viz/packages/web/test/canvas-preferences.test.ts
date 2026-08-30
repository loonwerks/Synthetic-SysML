import assert from 'node:assert/strict';
import test from 'node:test';
import {
  clampSystemAbstractWidth,
  DEFAULT_SYSTEM_ABSTRACT_WIDTH,
  interactionProps,
  isCanvasModeShortcut,
  maximumSystemAbstractWidth,
  readBooleanPreference,
  readSystemAbstractWidth,
  SYSTEM_ABSTRACT_WIDTH_KEY,
} from '../src/canvas-preferences.ts';

function storage(value: string | null) {
  return { getItem: () => value };
}

test('browser preferences fail closed to stable defaults', () => {
  assert.equal(readBooleanPreference(storage(null), 'minimap', true), true);
  assert.equal(readBooleanPreference(storage('false'), 'minimap', true), false);
  assert.equal(readBooleanPreference(storage('invalid'), 'minimap', true), true);
  assert.equal(readSystemAbstractWidth(storage('640')), 640);
  assert.equal(readSystemAbstractWidth(storage('900')), DEFAULT_SYSTEM_ABSTRACT_WIDTH);
  assert.equal(readSystemAbstractWidth({ getItem: (key) => {
    assert.equal(key, SYSTEM_ABSTRACT_WIDTH_KEY);
    throw new Error('disabled');
  } }), DEFAULT_SYSTEM_ABSTRACT_WIDTH);
});

test('System Abstract width preserves a 600px canvas at supported viewports', () => {
  assert.equal(maximumSystemAbstractWidth(1280, 240), 440);
  assert.equal(clampSystemAbstractWidth(720, 1280, 240), 440);
  assert.equal(clampSystemAbstractWidth(400, 1280, 240), 400);
  assert.equal(maximumSystemAbstractWidth(1600, 0), 720);
  assert.equal(clampSystemAbstractWidth(200, 1600, 0), 320);
});

test('interaction modes preserve pane panning while gating object movement', () => {
  assert.deepEqual(interactionProps('pan'), {
    editing: false,
    nodesDraggable: false,
    selectionOnDrag: false,
    panOnDrag: [0, 1],
  });
  assert.deepEqual(interactionProps('edit'), {
    editing: true,
    nodesDraggable: true,
    selectionOnDrag: false,
    panOnDrag: [0, 1],
  });
});

test('canvas mode shortcuts ignore modifiers without requiring a browser global', () => {
  assert.equal(isCanvasModeShortcut({ key: 'h', altKey: false, ctrlKey: false, metaKey: false, shiftKey: false, target: null }), true);
  assert.equal(isCanvasModeShortcut({ key: 'v', altKey: false, ctrlKey: true, metaKey: false, shiftKey: false, target: null }), false);
  assert.equal(isCanvasModeShortcut({ key: 'x', altKey: false, ctrlKey: false, metaKey: false, shiftKey: false, target: null }), false);
});
