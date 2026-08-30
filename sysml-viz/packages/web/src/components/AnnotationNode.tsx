import { Handle, Position, type NodeProps } from '@xyflow/react';
import type { AnnotationFlowNode } from '../types';
import { Icon } from './Icon';

export function AnnotationNode({ data, selected }: NodeProps<AnnotationFlowNode>) {
  const { annotation } = data;
  return (
    <aside className={`annotation-node style-${annotation.style ?? 'info'} ${selected ? 'is-selected' : ''}`} aria-label={`View annotation: ${annotation.text}`}>
      <Handle className="fallback-handle" id="__source" position={Position.Right} type="source" />
      <header className="annotation-drag-handle">
        <span><Icon name="info" size={12} /> {annotation.style ?? 'info'} note</span>
        <i aria-hidden="true"><Icon name="more" size={14} /></i>
      </header>
      <p>{annotation.text}</p>
      {annotation.linkedElementId && (
        <footer><Icon name="focus" size={11} /> Linked to model element</footer>
      )}
      {annotation.arrow && (
        <footer><Icon name="focus" size={11} /> Points to {annotation.arrow.targetKind}</footer>
      )}
    </aside>
  );
}
