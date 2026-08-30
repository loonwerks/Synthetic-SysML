import assert from 'node:assert/strict';
import test from 'node:test';
import {
  attachmentPoint,
  facingAttachments,
  nearestAttachment,
  projectPointToSide,
  updateManualAttachmentRoute,
} from '../src/edge-attachments.ts';

const bounds = { x: 100, y: 200, width: 300, height: 160 };

test('attachmentPoint places normalized anchors on each node side', () => {
  assert.deepEqual(attachmentPoint(bounds, { side: 'top', offset: 0.25 }), { x: 175, y: 200 });
  assert.deepEqual(attachmentPoint(bounds, { side: 'right', offset: 0.5 }), { x: 400, y: 280 });
  assert.deepEqual(attachmentPoint(bounds, { side: 'bottom', offset: 0.75 }), { x: 325, y: 360 });
  assert.deepEqual(attachmentPoint(bounds, { side: 'left', offset: 0.5 }), { x: 100, y: 280 });
});

test('nearestAttachment selects the closest perimeter and preserves its relative location', () => {
  assert.deepEqual(nearestAttachment(bounds, { x: 250, y: 185 }), { side: 'top', offset: 0.5 });
  assert.deepEqual(nearestAttachment(bounds, { x: 420, y: 320 }), { side: 'right', offset: 0.75 });
  assert.deepEqual(nearestAttachment(bounds, { x: 175, y: 380 }), { side: 'bottom', offset: 0.25 });
  assert.deepEqual(nearestAttachment(bounds, { x: 85, y: 240 }), { side: 'left', offset: 0.25 });
});

test('nearestAttachment keeps controls away from rounded node corners', () => {
  assert.deepEqual(nearestAttachment(bounds, { x: -100, y: 201 }), { side: 'top', offset: 0.04 });
  assert.deepEqual(nearestAttachment(bounds, { x: 1000, y: 359 }), { side: 'bottom', offset: 0.96 });
});

test('projectPointToSide keeps an automatic port aligned while snapping it to the body', () => {
  assert.deepEqual(projectPointToSide(bounds, { x: 412, y: 272 }, 'right'), { x: 400, y: 272 });
  assert.deepEqual(projectPointToSide(bounds, { x: 162, y: 184 }, 'top'), { x: 162, y: 200 });
  assert.deepEqual(projectPointToSide(bounds, { x: 162, y: 380 }, 'bottom'), { x: 162, y: 360 });
});

test('facingAttachments chooses short-facing sides while preserving port rows', () => {
  assert.deepEqual(
    facingAttachments(
      { x: 0, y: 0, width: 200, height: 100 },
      { x: 500, y: 40, width: 200, height: 200 },
      { x: 200, y: 25 },
      { x: 500, y: 160 },
    ),
    {
      source: { side: 'right', offset: 0.25 },
      target: { side: 'left', offset: 0.6 },
    },
  );
  assert.deepEqual(
    facingAttachments(
      { x: 100, y: 0, width: 200, height: 100 },
      { x: 120, y: 400, width: 200, height: 100 },
      { x: 300, y: 50 },
      { x: 120, y: 450 },
    ),
    {
      source: { side: 'bottom', offset: 0.5 },
      target: { side: 'top', offset: 0.5 },
    },
  );
});

test('editing an attachment promotes only deliberate manual bends', () => {
  const generated = updateManualAttachmentRoute(
    {
      pinned: false,
      points: [{ x: 300, y: 200 }, { x: 300, y: 400 }],
      sourceAttachment: { side: 'right', offset: 0.5 },
    },
    'target',
    { side: 'left', offset: 0.25 },
  );
  assert.deepEqual(generated, {
    pinned: true,
    points: [],
    sourceAttachment: { side: 'right', offset: 0.5 },
    targetAttachment: { side: 'left', offset: 0.25 },
  });

  const manual = updateManualAttachmentRoute(
    { pinned: true, points: [{ x: 300, y: 200 }] },
    'source',
    { side: 'bottom', offset: 0.75 },
  );
  assert.deepEqual(manual, {
    pinned: true,
    points: [{ x: 300, y: 200 }],
    sourceAttachment: { side: 'bottom', offset: 0.75 },
  });
});
