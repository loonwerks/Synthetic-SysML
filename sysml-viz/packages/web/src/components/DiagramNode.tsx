import { Handle, NodeResizer, Position, type NodeProps } from '@xyflow/react';
import { assessContainerResize } from '@sysml-viz/core/container-geometry';
import { memo, type KeyboardEvent, type SyntheticEvent } from 'react';
import type { DiagramNodePayload, DiagramPort, SysmlFlowNode } from '../types';
import { Icon } from './Icon';

function isInput(direction: string): boolean {
  return ['in', 'input', 'inout'].includes(direction.toLowerCase());
}

function isOutput(direction: string): boolean {
  return ['out', 'output', 'inout'].includes(direction.toLowerCase());
}

function portTitle(port: DiagramPort) {
  return `${port.direction} ${port.name}${port.typeName ? ` : ${port.typeName}` : ''}`;
}

function isSelectedPort(port: DiagramPort, selectedElementId?: string): boolean {
  return Boolean(selectedElementId && (port.elementId === selectedElementId || port.id === selectedElementId));
}

function ContractBadges({ counts }: { counts: SysmlFlowNode['data']['element']['contractCounts'] }) {
  const requirements = counts.requirements ?? 0;
  const total = counts.assumptions + counts.guarantees + counts.cases + counts.invariants + requirements;
  if (!total) return <span className="node-contracts-empty">No contracts</span>;
  return (
    <div className="node-contract-badges" aria-label={`${total} GUMBO contracts`}>
      {counts.assumptions > 0 && <span className="contract-count assumption">A {counts.assumptions}</span>}
      {counts.guarantees > 0 && <span className="contract-count guarantee">G {counts.guarantees}</span>}
      {counts.cases > 0 && <span className="contract-count cases">C {counts.cases}</span>}
      {counts.invariants > 0 && <span className="contract-count invariant">I {counts.invariants}</span>}
      {requirements > 0 && <span className="contract-count requirement">R {requirements}</span>}
    </div>
  );
}

function CompactPortHandles({
  inputs,
  outputs,
  onSelect,
  selectedElementId,
}: {
  inputs: DiagramPort[];
  outputs: DiagramPort[];
  onSelect: (event: SyntheticEvent, port: DiagramPort) => void;
  selectedElementId?: string;
}) {
  return (
    <div className="compact-port-handles">
      {inputs.map((port, index) => (
        <Handle
          aria-label={`Inspect ${portTitle(port)}`}
          aria-pressed={isSelectedPort(port, selectedElementId)}
          className={`port-handle input compact nodrag nopan ${isSelectedPort(port, selectedElementId) ? 'is-selected' : ''}`}
          id={port.id}
          key={`compact-in-${port.id}`}
          onClick={(event) => onSelect(event, port)}
          onKeyDown={(event) => {
            if (event.key === 'Enter' || event.key === ' ') {
              event.preventDefault();
              onSelect(event, port);
            }
          }}
          onPointerDown={(event) => event.stopPropagation()}
          position={Position.Left}
          role="button"
          style={{ top: `${((index + 1) / (inputs.length + 1)) * 100}%` }}
          tabIndex={0}
          type="target"
        />
      ))}
      {outputs.map((port, index) => (
        <Handle
          aria-label={`Inspect ${portTitle(port)}`}
          aria-pressed={isSelectedPort(port, selectedElementId)}
          className={`port-handle output compact nodrag nopan ${isSelectedPort(port, selectedElementId) ? 'is-selected' : ''}`}
          id={port.id}
          key={`compact-out-${port.id}`}
          onClick={(event) => onSelect(event, port)}
          onKeyDown={(event) => {
            if (event.key === 'Enter' || event.key === ' ') {
              event.preventDefault();
              onSelect(event, port);
            }
          }}
          onPointerDown={(event) => event.stopPropagation()}
          position={Position.Right}
          role="button"
          style={{ top: `${((index + 1) / (outputs.length + 1)) * 100}%` }}
          tabIndex={0}
          type="source"
        />
      ))}
    </div>
  );
}

export const DiagramNode = memo(function DiagramNode({ data, selected }: NodeProps<SysmlFlowNode>) {
  const { element } = data;
  // A root input boundary is a source for the interior diagram (and a root
  // output boundary is its target), so its physical handle side is reversed.
  const isBoundary = (element.category ?? element.kind).toLowerCase() === 'boundary';
  const inputs = element.ports.filter((port) => isBoundary ? isOutput(port.direction) : isInput(port.direction));
  const outputs = element.ports.filter((port) => isBoundary ? isInput(port.direction) : isOutput(port.direction));
  const rows = Math.max(inputs.length, outputs.length, 1);
  const category = (element.category ?? element.kind ?? 'component').toLowerCase();
  const showPorts = data.showPorts ?? true;
  const showTypes = data.showTypes ?? true;
  const selectPort = (event: SyntheticEvent, port: DiagramPort) => {
    event.stopPropagation();
    data.onSelectElement?.(port.elementId ?? port.id);
  };
  const selectPortFromKeyboard = (event: KeyboardEvent, port: DiagramPort) => {
    if (event.key !== 'Enter' && event.key !== ' ') return;
    event.preventDefault();
    selectPort(event, port);
  };
  const invokeCardAction = (
    event: SyntheticEvent,
    action: ((element: DiagramNodePayload) => void) | undefined,
  ) => {
    event.preventDefault();
    event.stopPropagation();
    action?.(element);
  };

  if (element.presentationOnly) {
    const presentationKind = element.kind === 'presentation-actor' ? 'ACTOR' : 'REFERENCE';
    return (
      <article className="presentation-card-node" aria-label={`Non-semantic ${presentationKind.toLowerCase()} ${element.label}`}>
        <Handle className="fallback-handle" id="__target" position={Position.Left} type="target" />
        <Handle className="fallback-handle" id="__source" position={Position.Right} type="source" />
        <span className="presentation-marker">NON-SEMANTIC · {presentationKind}</span>
        <strong>{element.label}</strong>
      </article>
    );
  }

  if (data.isContainer) {
    return (
      <article
        className={`diagram-container category-${category.replace(/[^a-z0-9]+/g, '-')} ${showPorts ? '' : 'ports-hidden'} ${showTypes ? '' : 'types-hidden'} ${selected ? 'is-selected' : ''} ${data.selectedByContract ? 'is-contract-related' : ''}`}
        aria-label={`Expanded ${element.category ?? element.kind} ${element.label}`}
      >
        <NodeResizer
          isVisible={Boolean(selected && data.editingEnabled)}
          lineClassName="container-resize-line"
          minHeight={380}
          minWidth={640}
          handleClassName="container-resize-handle nodrag nopan"
          onResizeStart={(_event, geometry) => data.onResizeContainerStart?.(element, {
            width: geometry.width,
            height: geometry.height,
            x: geometry.x,
            y: geometry.y,
          })}
          onResize={(_event, geometry) => data.onResizeContainerDraft?.(element, {
            width: geometry.width,
            height: geometry.height,
            x: geometry.x,
            y: geometry.y,
          })}
          shouldResize={(_event, geometry) => !data.resizeConstraints || assessContainerResize({
            id: element.id,
            x: geometry.x + (data.resizeCoordinateOffset?.x ?? 0),
            y: geometry.y + (data.resizeCoordinateOffset?.y ?? 0),
            width: geometry.width,
            height: geometry.height,
          }, data.resizeConstraints).valid}
          onResizeEnd={(_event, geometry) => data.onResizeContainer?.(element, {
            width: geometry.width,
            height: geometry.height,
            x: geometry.x,
            y: geometry.y,
          })}
        />
        <Handle className="fallback-handle" id="__target" position={Position.Left} type="target" />
        <Handle className="fallback-handle" id="__source" position={Position.Right} type="source" />
        <header className="container-titlebar">
          <span className="node-category-icon"><Icon name="architecture" size={14} /></span>
          <span className="container-identity">
            <strong>{element.label}</strong>
            {showTypes && <small>{element.typeName ?? element.category ?? element.kind}</small>}
          </span>
          {showTypes && <span className="container-category">{element.category ?? element.kind}</span>}
          <span className="container-expanded-state">Expanded in place</span>
          <ContractBadges counts={element.contractCounts} />
          <span className="node-navigation-actions container-actions nodrag nopan">
            {element.definitionId && (
              <button
                aria-label={`Open ${element.label} as current system`}
                onClick={(event) => invokeCardAction(event, data.onOpenDefinition)}
                onDoubleClick={(event) => event.stopPropagation()}
                onPointerDown={(event) => event.stopPropagation()}
                title="Open this system as the entire canvas"
                type="button"
              >
                <Icon name="external" size={12} />Open system
              </button>
            )}
            <button
              aria-label={`Hide contents of ${element.label}`}
              onClick={(event) => invokeCardAction(event, data.onToggleExpansion)}
              onDoubleClick={(event) => event.stopPropagation()}
              onPointerDown={(event) => event.stopPropagation()}
              title="Hide this system’s children"
              type="button"
            >
              <Icon name="layers" size={12} />Hide contents
            </button>
          </span>
          {element.pinned && <span className="node-pin" title="Pinned position"><Icon name="pin" size={13} /></span>}
        </header>
        {showPorts ? <><div className="container-port-rail input-rail">
          {inputs.map((port) => (
            <div
              aria-label={`Inspect ${portTitle(port)}`}
              aria-pressed={isSelectedPort(port, data.selectedElementId)}
              className={`container-port input selectable-port nodrag nopan ${isSelectedPort(port, data.selectedElementId) ? 'is-selected' : ''}`}
              key={`container-in-${port.id}`}
              onClick={(event) => selectPort(event, port)}
              onKeyDown={(event) => selectPortFromKeyboard(event, port)}
              onPointerDown={(event) => event.stopPropagation()}
              role="button"
              tabIndex={0}
              title={portTitle(port)}
            >
              <Handle
                className="port-handle input"
                id={port.id}
                position={Position.Left}
                type="target"
              />
              <span>{port.name}</span>
              <small>{port.direction}</small>
            </div>
          ))}
        </div>
        <div className="container-port-rail output-rail">
          {outputs.map((port) => (
            <div
              aria-label={`Inspect ${portTitle(port)}`}
              aria-pressed={isSelectedPort(port, data.selectedElementId)}
              className={`container-port output selectable-port nodrag nopan ${isSelectedPort(port, data.selectedElementId) ? 'is-selected' : ''}`}
              key={`container-out-${port.id}`}
              onClick={(event) => selectPort(event, port)}
              onKeyDown={(event) => selectPortFromKeyboard(event, port)}
              onPointerDown={(event) => event.stopPropagation()}
              role="button"
              tabIndex={0}
              title={portTitle(port)}
            >
              <small>{port.direction}</small>
              <span>{port.name}</span>
              <Handle
                className="port-handle output"
                id={port.id}
                position={Position.Right}
                type="source"
              />
            </div>
          ))}
        </div></> : <CompactPortHandles inputs={inputs} onSelect={selectPort} outputs={outputs} selectedElementId={data.selectedElementId} />}
        {showTypes && <span className="container-watermark">{element.category ?? 'System'} boundary</span>}
      </article>
    );
  }

  return (
    <article
      className={`diagram-node category-${category.replace(/[^a-z0-9]+/g, '-')} ${showPorts ? '' : 'ports-hidden'} ${showTypes ? '' : 'types-hidden'} ${selected ? 'is-selected' : ''} ${data.selectedByContract ? 'is-contract-related' : ''} ${element.isNew ? 'is-new' : ''}`}
      style={{ '--port-rows': rows } as React.CSSProperties}
      aria-label={`${element.category ?? element.kind} ${element.label}`}
    >
      <Handle className="fallback-handle" id="__target" position={Position.Left} type="target" />
      <Handle className="fallback-handle" id="__source" position={Position.Right} type="source" />
      <header className="node-titlebar">
        <span className="node-category-icon"><Icon name="component" size={14} /></span>
        {showTypes && <span className="node-category">{element.category ?? element.kind ?? 'Component'}</span>}
        {element.pinned && <span className="node-pin" title="Pinned position"><Icon name="pin" size={13} /></span>}
      </header>
      <div className="node-identity">
        <strong>{element.label}</strong>
        {showTypes && element.typeName && <span title={element.typeName}>{element.typeName}</span>}
      </div>
      {showPorts ? <div className="node-ports">
        <div className="port-column input-ports">
          {inputs.map((port) => (
            <div
              aria-label={`Inspect ${portTitle(port)}`}
              aria-pressed={isSelectedPort(port, data.selectedElementId)}
              className={`port-row input selectable-port nodrag nopan ${isSelectedPort(port, data.selectedElementId) ? 'is-selected' : ''}`}
              key={`in-${port.id}`}
              onClick={(event) => selectPort(event, port)}
              onKeyDown={(event) => selectPortFromKeyboard(event, port)}
              onPointerDown={(event) => event.stopPropagation()}
              role="button"
              tabIndex={0}
              title={portTitle(port)}
            >
              <Handle
                className="port-handle input"
                id={port.id}
                position={Position.Left}
                type="target"
              />
              <span className="port-direction">IN</span>
              <span className="port-name">{port.name}</span>
            </div>
          ))}
        </div>
        <div className="port-column output-ports">
          {outputs.map((port) => (
            <div
              aria-label={`Inspect ${portTitle(port)}`}
              aria-pressed={isSelectedPort(port, data.selectedElementId)}
              className={`port-row output selectable-port nodrag nopan ${isSelectedPort(port, data.selectedElementId) ? 'is-selected' : ''}`}
              key={`out-${port.id}`}
              onClick={(event) => selectPort(event, port)}
              onKeyDown={(event) => selectPortFromKeyboard(event, port)}
              onPointerDown={(event) => event.stopPropagation()}
              role="button"
              tabIndex={0}
              title={portTitle(port)}
            >
              <span className="port-name">{port.name}</span>
              <span className="port-direction">OUT</span>
              <Handle
                className="port-handle output"
                id={port.id}
                position={Position.Right}
                type="source"
              />
            </div>
          ))}
        </div>
        {!element.ports.length && <div className="node-no-ports">No boundary ports</div>}
      </div> : <CompactPortHandles inputs={inputs} onSelect={selectPort} outputs={outputs} selectedElementId={data.selectedElementId} />}
      <footer className="node-footer">
        <ContractBadges counts={element.contractCounts} />
        <span className="node-navigation-actions nodrag nopan">
          {element.definitionId && (
            <button
              aria-label={`Open ${element.label} as current system`}
              onClick={(event) => invokeCardAction(event, data.onOpenDefinition)}
              onDoubleClick={(event) => event.stopPropagation()}
              onPointerDown={(event) => event.stopPropagation()}
              title="Open this system as the entire canvas"
              type="button"
            >
              <Icon name="external" size={12} />Open system
            </button>
          )}
          {element.canExpand && (
            <button
              aria-label={`Show contents of ${element.label} here`}
              onClick={(event) => invokeCardAction(event, data.onToggleExpansion)}
              onDoubleClick={(event) => event.stopPropagation()}
              onPointerDown={(event) => event.stopPropagation()}
              title="Keep the current context and reveal this system’s children"
              type="button"
            >
              <Icon name="layers" size={12} />Show contents here
            </button>
          )}
        </span>
      </footer>
    </article>
  );
});
