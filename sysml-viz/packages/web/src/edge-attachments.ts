import type { EdgeAttachment, EdgeAttachmentEnd, EdgeAttachmentSide, ViewEdgeRoute } from './types';

export interface Point {
  x: number;
  y: number;
}

export interface Rectangle extends Point {
  width: number;
  height: number;
}

const MIN_OFFSET = 0.04;
const MAX_OFFSET = 0.96;

function clamp(value: number, minimum: number, maximum: number): number {
  return Math.min(maximum, Math.max(minimum, value));
}

export function attachmentPoint(bounds: Rectangle, attachment: EdgeAttachment): Point {
  const offset = clamp(attachment.offset, 0, 1);
  if (attachment.side === 'top') {
    return { x: bounds.x + bounds.width * offset, y: bounds.y };
  }
  if (attachment.side === 'bottom') {
    return { x: bounds.x + bounds.width * offset, y: bounds.y + bounds.height };
  }
  if (attachment.side === 'left') {
    return { x: bounds.x, y: bounds.y + bounds.height * offset };
  }
  return { x: bounds.x + bounds.width, y: bounds.y + bounds.height * offset };
}

export function projectPointToSide(
  bounds: Rectangle,
  point: Point,
  side: EdgeAttachmentSide,
): Point {
  const offset = side === 'left' || side === 'right'
    ? (point.y - bounds.y) / Math.max(bounds.height, 1)
    : (point.x - bounds.x) / Math.max(bounds.width, 1);
  return attachmentPoint(bounds, { side, offset });
}

export function nearestAttachment(bounds: Rectangle, point: Point): EdgeAttachment {
  const distances: Array<[EdgeAttachmentSide, number]> = [
    ['top', Math.abs(point.y - bounds.y)],
    ['right', Math.abs(point.x - (bounds.x + bounds.width))],
    ['bottom', Math.abs(point.y - (bounds.y + bounds.height))],
    ['left', Math.abs(point.x - bounds.x)],
  ];
  const side = distances.reduce((closest, candidate) =>
    candidate[1] < closest[1] ? candidate : closest,
  )[0];
  const rawOffset = side === 'left' || side === 'right'
    ? (point.y - bounds.y) / Math.max(bounds.height, 1)
    : (point.x - bounds.x) / Math.max(bounds.width, 1);
  return { side, offset: clamp(rawOffset, MIN_OFFSET, MAX_OFFSET) };
}

function offsetForSide(
  bounds: Rectangle,
  point: Point,
  side: EdgeAttachmentSide,
): number {
  const value = side === 'left' || side === 'right'
    ? (point.y - bounds.y) / Math.max(bounds.height, 1)
    : (point.x - bounds.x) / Math.max(bounds.width, 1);
  return clamp(value, MIN_OFFSET, MAX_OFFSET);
}

/**
 * Chooses facing node sides for an unpinned edge. Horizontal flow wins for
 * diagonal relationships, while near-vertical relationships use top/bottom
 * anchors so connectors do not loop around both node bodies.
 */
export function facingAttachments(
  sourceBounds: Rectangle,
  targetBounds: Rectangle,
  sourcePortPoint: Point,
  targetPortPoint: Point,
): { source: EdgeAttachment; target: EdgeAttachment } {
  const sourceCenter = {
    x: sourceBounds.x + sourceBounds.width / 2,
    y: sourceBounds.y + sourceBounds.height / 2,
  };
  const targetCenter = {
    x: targetBounds.x + targetBounds.width / 2,
    y: targetBounds.y + targetBounds.height / 2,
  };
  const dx = targetCenter.x - sourceCenter.x;
  const dy = targetCenter.y - sourceCenter.y;
  const vertical = Math.abs(dy) > Math.abs(dx) * 1.15;
  const sourceSide: EdgeAttachmentSide = vertical
    ? (dy >= 0 ? 'bottom' : 'top')
    : (dx >= 0 ? 'right' : 'left');
  const targetSide: EdgeAttachmentSide = vertical
    ? (dy >= 0 ? 'top' : 'bottom')
    : (dx >= 0 ? 'left' : 'right');
  return {
    source: {
      side: sourceSide,
      offset: vertical ? 0.5 : offsetForSide(sourceBounds, sourcePortPoint, sourceSide),
    },
    target: {
      side: targetSide,
      offset: vertical ? 0.5 : offsetForSide(targetBounds, targetPortPoint, targetSide),
    },
  };
}

/**
 * Promote an endpoint adjustment into a manual route. Generated ELK bends
 * describe the previous automatic geometry, not an intentional user path, so
 * they must not become permanent merely because the user moved an attachment.
 */
export function updateManualAttachmentRoute(
  route: ViewEdgeRoute | undefined,
  end: EdgeAttachmentEnd,
  attachment: EdgeAttachment | undefined,
): ViewEdgeRoute | undefined {
  const field = end === 'source' ? 'sourceAttachment' : 'targetAttachment';
  const next: ViewEdgeRoute = {
    ...(route ?? { pinned: true, points: [] }),
    pinned: true,
    points: route?.pinned ? route.points.map((point) => ({ ...point })) : [],
  };
  if (attachment) next[field] = { ...attachment };
  else delete next[field];
  return next.points.length || next.sourceAttachment || next.targetAttachment ? next : undefined;
}
