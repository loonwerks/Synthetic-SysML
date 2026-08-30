import {
  BaseEdge,
  EdgeLabelRenderer,
  getSmoothStepPath,
  Position,
  useInternalNode,
  useReactFlow,
  type EdgeProps,
  type InternalNode,
} from '@xyflow/react';
import { memo, type PointerEvent as ReactPointerEvent } from 'react';
import {
  attachmentPoint,
  facingAttachments,
  nearestAttachment,
  type Point,
  type Rectangle,
} from '../edge-attachments';
import type {
  EdgeAttachmentEnd,
  EdgeAttachmentSide,
  SysmlFlowEdge,
} from '../types';

const activeAttachmentDrags = new Map<string, () => void>();

function samePoint(first: Point, second: Point): boolean {
  return Math.abs(first.x - second.x) < 0.5 && Math.abs(first.y - second.y) < 0.5;
}

/** A saved orthogonal route is only usable if it still meets both endpoints. */
export function routeBendsAlignWithEndpoints(
  bends: readonly Point[],
  source: Point,
  target: Point,
): boolean {
  if (!bends.length) return true;
  const first = bends[0]!;
  const last = bends.at(-1)!;
  const aligned = (left: Point, right: Point) =>
    Math.abs(left.x - right.x) < 0.5 || Math.abs(left.y - right.y) < 0.5;
  return aligned(source, first) && aligned(last, target);
}

function pathThrough(points: Point[]): string {
  return points.map((point, index) => `${index ? 'L' : 'M'} ${point.x} ${point.y}`).join(' ');
}

function pathMidpoint(points: Point[]): Point {
  if (points.length < 2) return points[0] ?? { x: 0, y: 0 };
  const lengths = points.slice(1).map((point, index) =>
    Math.hypot(point.x - points[index]!.x, point.y - points[index]!.y),
  );
  const target = lengths.reduce((sum, length) => sum + length, 0) / 2;
  let traversed = 0;
  for (let index = 0; index < lengths.length; index += 1) {
    const length = lengths[index]!;
    if (traversed + length >= target) {
      const ratio = length ? (target - traversed) / length : 0;
      const start = points[index]!;
      const end = points[index + 1]!;
      return { x: start.x + (end.x - start.x) * ratio, y: start.y + (end.y - start.y) * ratio };
    }
    traversed += length;
  }
  return points.at(-1)!;
}

function nodeBounds(node: InternalNode | undefined): Rectangle | undefined {
  if (!node) return undefined;
  const element = (node.data as { element?: { dimensions?: { width?: number; height?: number } } }).element;
  const width = node.measured.width ?? node.width ?? element?.dimensions?.width;
  const height = node.measured.height ?? node.height ?? element?.dimensions?.height;
  if (!width || !height) return undefined;
  return {
    x: node.internals.positionAbsolute.x,
    y: node.internals.positionAbsolute.y,
    width,
    height,
  };
}

function flowPosition(side: EdgeAttachmentSide): Position {
  if (side === 'top') return Position.Top;
  if (side === 'right') return Position.Right;
  if (side === 'bottom') return Position.Bottom;
  return Position.Left;
}

function attachmentSide(position: Position): EdgeAttachmentSide {
  if (position === Position.Top) return 'top';
  if (position === Position.Right) return 'right';
  if (position === Position.Bottom) return 'bottom';
  return 'left';
}

function AttachmentControl({
  edgeId,
  end,
  point,
  bounds,
  onMove,
}: {
  edgeId: string;
  end: EdgeAttachmentEnd;
  point: Point;
  bounds: Rectangle;
  onMove: NonNullable<SysmlFlowEdge['data']>['onMoveAttachment'];
}) {
  const { screenToFlowPosition } = useReactFlow();
  const attachmentAtPointer = (event: Pick<PointerEvent, 'clientX' | 'clientY'>) =>
    nearestAttachment(bounds, screenToFlowPosition({ x: event.clientX, y: event.clientY }));

  const handlePointerDown = (event: ReactPointerEvent<HTMLButtonElement>) => {
    event.preventDefault();
    event.stopPropagation();
    const dragKey = `${edgeId}:${end}`;
    activeAttachmentDrags.get(dragKey)?.();
    const pointerId = event.pointerId;
    const cleanup = () => {
      window.removeEventListener('pointermove', handleMove);
      window.removeEventListener('pointerup', handleUp);
      window.removeEventListener('pointercancel', handleCancel);
      activeAttachmentDrags.delete(dragKey);
    };
    const handleMove = (pointerEvent: PointerEvent) => {
      if (pointerEvent.pointerId !== pointerId) return;
      onMove?.(edgeId, end, attachmentAtPointer(pointerEvent), false);
    };
    const handleUp = (pointerEvent: PointerEvent) => {
      if (pointerEvent.pointerId !== pointerId) return;
      cleanup();
      onMove?.(edgeId, end, attachmentAtPointer(pointerEvent), true);
    };
    const handleCancel = (pointerEvent: PointerEvent) => {
      if (pointerEvent.pointerId === pointerId) cleanup();
    };
    window.addEventListener('pointermove', handleMove);
    window.addEventListener('pointerup', handleUp);
    window.addEventListener('pointercancel', handleCancel);
    activeAttachmentDrags.set(dragKey, cleanup);
    event.currentTarget.setPointerCapture(event.pointerId);
  };

  return (
    <button
      aria-label={`Drag ${end} attachment for edge ${edgeId}`}
      className={`edge-attachment-control ${end} nodrag nopan`}
      data-edge-end={end}
      data-edge-id={edgeId}
      onClick={(event) => event.stopPropagation()}
      onDoubleClick={(event) => {
        event.preventDefault();
        event.stopPropagation();
        onMove?.(edgeId, end, undefined, true);
      }}
      onPointerDown={handlePointerDown}
      style={{ transform: `translate(-50%, -50%) translate(${point.x}px, ${point.y}px)` }}
      title={`Drag the ${end} attachment around the node perimeter. Double-click to restore automatic placement.`}
      type="button"
    >
      <span aria-hidden="true" />
    </button>
  );
}

export const RoutedEdge = memo(function RoutedEdge({
  id,
  source,
  target,
  sourceX,
  sourceY,
  targetX,
  targetY,
  sourcePosition,
  targetPosition,
  data,
  selected,
  markerEnd,
  markerStart,
  style,
  label,
  labelStyle,
  labelBgStyle,
  labelBgPadding,
  labelBgBorderRadius,
  interactionWidth,
}: EdgeProps<SysmlFlowEdge>) {
  const sourceBounds = nodeBounds(useInternalNode(source));
  const targetBounds = nodeBounds(useInternalNode(target));
  const sourceIsPort = data?.sourceIsPort === true;
  const targetIsPort = data?.targetIsPort === true;
  // An automatic route's attachments were inferred from node geometry. They
  // must never replace an exact semantic-port endpoint. A pinned route is a
  // user decision and is allowed to override either endpoint.
  const sourceAttachment = data?.route?.sourceAttachment && (data.route.pinned || !sourceIsPort)
    ? data.route.sourceAttachment
    : undefined;
  const targetAttachment = data?.route?.targetAttachment && (data.route.pinned || !targetIsPort)
    ? data.route.targetAttachment
    : undefined;
  const automaticAttachments = sourceBounds && targetBounds
    ? facingAttachments(
        sourceBounds,
        targetBounds,
        { x: sourceX, y: sourceY },
        { x: targetX, y: targetY },
      )
    : undefined;
  const sourcePoint = sourceAttachment && sourceBounds
    ? attachmentPoint(sourceBounds, sourceAttachment)
    : sourceIsPort
      ? { x: sourceX, y: sourceY }
    : sourceBounds && automaticAttachments
      ? attachmentPoint(sourceBounds, automaticAttachments.source)
      : sourceBounds
        ? attachmentPoint(sourceBounds, {
            side: attachmentSide(sourcePosition),
            offset: 0.5,
          })
      : { x: sourceX, y: sourceY };
  const targetPoint = targetAttachment && targetBounds
    ? attachmentPoint(targetBounds, targetAttachment)
    : targetIsPort
      ? { x: targetX, y: targetY }
    : targetBounds && automaticAttachments
      ? attachmentPoint(targetBounds, automaticAttachments.target)
      : targetBounds
        ? attachmentPoint(targetBounds, {
            side: attachmentSide(targetPosition),
            offset: 0.5,
          })
      : { x: targetX, y: targetY };
  const resolvedSourcePosition = sourceAttachment && sourceBounds
    ? flowPosition(sourceAttachment.side)
    : sourceIsPort
      ? sourcePosition
    : automaticAttachments
      ? flowPosition(automaticAttachments.source.side)
      : sourcePosition;
  const resolvedTargetPosition = targetAttachment && targetBounds
    ? flowPosition(targetAttachment.side)
    : targetIsPort
      ? targetPosition
    : automaticAttachments
      ? flowPosition(automaticAttachments.target.side)
      : targetPosition;
  const savedBends = data?.route?.points ?? [];
  const generatedPortRoute = data?.route?.pinned === false && (sourceIsPort || targetIsPort);
  // This also protects existing views where an attachment edit accidentally
  // pinned a generated ELK section. Attachments remain in effect, but stale
  // bends fall back to React Flow's current smooth orthogonal path.
  const bends = generatedPortRoute || !routeBendsAlignWithEndpoints(savedBends, sourcePoint, targetPoint)
    ? []
    : savedBends;
  const points = [sourcePoint, ...bends, targetPoint].filter(
    (point, index, all) => index === 0 || !samePoint(point, all[index - 1]!),
  );
  const hasRoute = bends.length > 0;
  const [smoothPath, smoothLabelX, smoothLabelY] = getSmoothStepPath({
    sourceX: sourcePoint.x,
    sourceY: sourcePoint.y,
    sourcePosition: resolvedSourcePosition,
    targetX: targetPoint.x,
    targetY: targetPoint.y,
    targetPosition: resolvedTargetPosition,
    borderRadius: 8,
    offset: 20,
  });
  const midpoint = hasRoute ? pathMidpoint(points) : { x: smoothLabelX, y: smoothLabelY };

  return (
    <>
      <BaseEdge
        id={id}
        interactionWidth={interactionWidth}
        label={label}
        labelBgBorderRadius={labelBgBorderRadius}
        labelBgPadding={labelBgPadding}
        labelBgStyle={labelBgStyle}
        labelStyle={labelStyle}
        labelX={midpoint.x}
        labelY={midpoint.y}
        markerEnd={markerEnd}
        markerStart={markerStart}
        path={hasRoute ? pathThrough(points) : smoothPath}
        style={style}
      />
      {selected && data?.editingEnabled && data.onMoveAttachment && (
        <EdgeLabelRenderer>
          {sourceBounds && (
            <AttachmentControl
              bounds={sourceBounds}
              edgeId={id}
              end="source"
              onMove={data.onMoveAttachment}
              point={sourcePoint}
            />
          )}
          {targetBounds && (
            <AttachmentControl
              bounds={targetBounds}
              edgeId={id}
              end="target"
              onMove={data.onMoveAttachment}
              point={targetPoint}
            />
          )}
        </EdgeLabelRenderer>
      )}
    </>
  );
});
