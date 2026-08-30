import {
  useEffect,
  useMemo,
  useRef,
  useState,
  type CSSProperties,
  type KeyboardEvent,
  type PointerEvent,
  type ReactNode,
} from 'react';
import type { DiagramNodePayload, ElementDetails, GumboContract, SourceLocation } from '../types';
import { Icon } from './Icon';
import { useRovingTabs } from './useRovingTabs';

export interface InspectorProps {
  node?: DiagramNodePayload;
  details?: ElementDetails;
  height: number;
  loading: boolean;
  minimumContainerSize?: { width: number; height: number };
  traceIds: readonly string[];
  selectedContractId?: string;
  onSelectContract: (contract?: GumboContract) => void;
  onTraceHover: (traceIds: readonly string[]) => void;
  onTraceNavigate: (traceIds: readonly string[], preferredTraceId?: string) => void;
  onPin: () => void;
  onHide: () => void;
  onExpand: () => void;
  onOpen: () => void;
  onResize: (width: number, height: number) => void;
  onFitContents: () => void;
  onClose: () => void;
  onHeightChange: (height: number) => void;
  onOpenSource: (source: SourceLocation) => void;
}

const INSPECTOR_TABS = ['details', 'style', 'contracts'] as const;

const GUMBO_TOKEN = /(\b(?:assume|assumption|guarantee|case|invariant|compute|initialize|if|then|else|and|or|not|true|false|state|functions?|integration|modifies)\b|\bREQ_[A-Za-z0-9_]+\b|"[^"\n]*"|--[^\n]*)/gim;

function highlightedGumbo(source: string): ReactNode[] {
  const parts = source.split(GUMBO_TOKEN);
  return parts.map((part, index) => {
    if (!part) return null;
    const lower = part.toLowerCase();
    let className = '';
    if (lower.startsWith('--')) className = 'syntax-comment';
    else if (part.startsWith('"')) className = 'syntax-string';
    else if (/^REQ_/.test(part)) className = 'syntax-requirement';
    else if (GUMBO_TOKEN.test(part)) className = 'syntax-keyword';
    GUMBO_TOKEN.lastIndex = 0;
    return className ? <span className={className} key={index}>{part}</span> : part;
  });
}

function kindLabel(kind: string): string {
  return kind.replace(/[-_]/g, ' ').replace(/^./, (letter) => letter.toUpperCase());
}

function SourceCard({ source, onOpen }: { source: SourceLocation; onOpen: () => void }) {
  const filename = source.file.split('/').at(-1) ?? source.file;
  return (
    <button className="source-card" onClick={onOpen} title={source.file}>
      <span className="source-file-icon"><Icon name="file" size={16} /></span>
      <span><strong>{filename}</strong><small>Line {source.line ?? 1}{source.column ? `, column ${source.column}` : ''}</small></span>
      <Icon name="external" size={14} />
    </button>
  );
}

function ContractCard({
  contract,
  selected,
  onSelect,
  onActivate,
  onOpenSource,
  onTraceHover,
  onTraceNavigate,
}: {
  contract: GumboContract;
  selected: boolean;
  onSelect: () => void;
  onActivate: () => void;
  onOpenSource: (source: SourceLocation) => void;
  onTraceHover: (traceIds: readonly string[]) => void;
  onTraceNavigate: (traceIds: readonly string[], preferredTraceId?: string) => void;
}) {
  return (
    <article className={`contract-card contract-${contract.kind} ${selected ? 'selected' : ''}`}>
      <button className="contract-heading" onClick={onSelect}>
        <span className="contract-kind">{kindLabel(contract.kind)}</span>
        <strong>{contract.requirementId ?? contract.name}</strong>
        {contract.inferred && <em>inferred</em>}
        <Icon name={selected ? 'chevron-down' : 'chevron-right'} size={14} />
      </button>
      {contract.traceIds && contract.traceIds.length > 0 && (
        <div className="contract-trace-links" aria-label={`System Abstract links for ${contract.name}`}>
          <div className="contract-trace-label">
            <Icon name="requirement" size={13} />
            <strong>System Abstract</strong>
            <small>Click a trace ID to navigate</small>
          </div>
          <div className="contract-trace-chips">
            {contract.traceIds.map((traceId) => (
              <button
                aria-label={`Open ${traceId} in the System Abstract`}
                key={traceId}
                onClick={(event) => {
                  event.stopPropagation();
                  onActivate();
                  onTraceNavigate(contract.traceIds ?? [], traceId);
                }}
                onMouseEnter={() => onTraceHover([traceId])}
                onMouseLeave={() => onTraceHover([])}
                title={`Preview ${traceId}; click to open it in the System Abstract`}
                type="button"
              ><span>{traceId}</span><Icon name="chevron-right" size={11} /></button>
            ))}
          </div>
        </div>
      )}
      {selected && (
        <div className="contract-body">
          {contract.description && <p>{contract.description}</p>}
          <pre><code>{highlightedGumbo(contract.text)}</code></pre>
          {contract.references && contract.references.length > 0 && (
            <div className="reference-chips"><span>References</span>{contract.references.map((reference) => <code key={reference}>{reference}</code>)}</div>
          )}
          <div className="contract-meta">
            {contract.verificationStatus && <span className={`verification ${contract.verificationStatus}`}>{contract.verificationStatus}</span>}
            {contract.source && <button onClick={() => onOpenSource(contract.source!)}>Open source <Icon name="external" size={12} /></button>}
          </div>
        </div>
      )}
    </article>
  );
}

export function Inspector({
  node,
  details,
  height,
  loading,
  minimumContainerSize,
  traceIds,
  selectedContractId,
  onSelectContract,
  onTraceHover,
  onTraceNavigate,
  onPin,
  onHide,
  onExpand,
  onOpen,
  onResize,
  onFitContents,
  onClose,
  onHeightChange,
  onOpenSource,
}: InspectorProps) {
  const [tab, setTab] = useState<'details' | 'style' | 'contracts'>('details');
  const { getPanelProps, getTabProps } = useRovingTabs(INSPECTOR_TABS, tab, setTab);
  const [containerWidth, setContainerWidth] = useState('');
  const [containerHeight, setContainerHeight] = useState('');
  const drawer = useRef<HTMLElement>(null);
  const scrollRegion = useRef<HTMLDivElement>(null);
  const drag = useRef<{ startY: number; startHeight: number; draftHeight: number; frame?: number } | undefined>(undefined);
  const ports = details?.ports ?? node?.ports ?? [];
  const contracts = details?.contracts ?? node?.contracts ?? [];
  const source = details?.source ?? node?.source;
  const label = details?.label ?? node?.label;
  const typeName = details?.typeName ?? node?.typeName;
  const category = details?.category ?? node?.category ?? details?.kind ?? node?.kind;
  const semanticTraceIds = useMemo(
    () => [...new Set([...(details?.traceIds ?? []), ...traceIds])],
    [details?.traceIds, traceIds],
  );
  const contractsByKind = useMemo(() => {
    const grouped = new Map<string, GumboContract[]>();
    for (const contract of contracts) grouped.set(contract.kind, [...(grouped.get(contract.kind) ?? []), contract]);
    return grouped;
  }, [contracts]);

  useEffect(() => {
    if (selectedContractId) setTab('contracts');
  }, [selectedContractId]);
  useEffect(() => {
    // Each tab is a separate view. Do not carry a long Details/GUMBO scroll
    // position into the newly selected panel.
    scrollRegion.current?.scrollTo({ top: 0 });
  }, [tab]);
  useEffect(() => {
    setContainerWidth(node?.dimensions?.width === undefined ? '' : String(Math.round(node.dimensions.width)));
    setContainerHeight(node?.dimensions?.height === undefined ? '' : String(Math.round(node.dimensions.height)));
  }, [node?.id, node?.dimensions?.height, node?.dimensions?.width]);

  const heightBounds = () => {
    const available = drawer.current?.parentElement?.clientHeight ?? window.innerHeight - 58;
    return { min: 210, max: Math.max(260, Math.floor(available * 0.68)) };
  };
  const constrainedHeight = (nextHeight: number) => {
    const bounds = heightBounds();
    return Math.max(bounds.min, Math.min(bounds.max, Math.round(nextHeight)));
  };
  const updateHeight = (nextHeight: number) => {
    onHeightChange(constrainedHeight(nextHeight));
  };
  const startResize = (event: PointerEvent<HTMLDivElement>) => {
    drag.current = { startY: event.clientY, startHeight: height, draftHeight: height };
    event.currentTarget.setPointerCapture(event.pointerId);
  };
  const continueResize = (event: PointerEvent<HTMLDivElement>) => {
    const activeDrag = drag.current;
    if (!activeDrag) return;
    activeDrag.draftHeight = constrainedHeight(activeDrag.startHeight + activeDrag.startY - event.clientY);
    if (activeDrag.frame !== undefined) return;
    activeDrag.frame = window.requestAnimationFrame(() => {
      const current = drag.current;
      if (!current) return;
      current.frame = undefined;
      const value = `${current.draftHeight}px`;
      drawer.current?.style.setProperty('--inspector-drawer-height', value);
      drawer.current?.parentElement?.style.setProperty('--inspector-drawer-height', value);
    });
  };
  const finishResize = (event: PointerEvent<HTMLDivElement>) => {
    const activeDrag = drag.current;
    if (activeDrag?.frame !== undefined) window.cancelAnimationFrame(activeDrag.frame);
    if (activeDrag) onHeightChange(activeDrag.draftHeight);
    drag.current = undefined;
    if (event.currentTarget.hasPointerCapture(event.pointerId)) event.currentTarget.releasePointerCapture(event.pointerId);
  };
  const resizeFromKeyboard = (event: KeyboardEvent<HTMLDivElement>) => {
    if (!['ArrowUp', 'ArrowDown', 'Home', 'End'].includes(event.key)) return;
    event.preventDefault();
    const bounds = heightBounds();
    if (event.key === 'Home') updateHeight(bounds.min);
    else if (event.key === 'End') updateHeight(bounds.max);
    else updateHeight(height + (event.key === 'ArrowUp' ? 24 : -24));
  };

  if (!node && !details && !loading) {
    return (
      <aside className="inspector inspector-drawer empty-inspector">
        <div className="empty-inspector-graphic"><Icon name="component" size={28} /></div>
        <h2>Inspect the architecture</h2>
        <p>Select a component, port, or connection to see its source and GUMBO contracts.</p>
        <div className="shortcut-hint"><kbd>⌘</kbd><kbd>K</kbd><span>Search the model</span></div>
      </aside>
    );
  }

  return (
    <aside
      className="inspector inspector-drawer"
      ref={drawer}
      style={{ '--inspector-drawer-height': `${height}px` } as CSSProperties}
    >
      <div
        aria-label="Resize component inspector"
        aria-orientation="horizontal"
        aria-valuemax={heightBounds().max}
        aria-valuemin={heightBounds().min}
        aria-valuenow={height}
        className="inspector-resize-handle"
        onKeyDown={resizeFromKeyboard}
        onPointerCancel={finishResize}
        onPointerDown={startResize}
        onPointerMove={continueResize}
        onPointerUp={finishResize}
        role="separator"
        tabIndex={0}
        title="Drag to resize; use Up/Down arrow keys when focused"
      ><span /></div>
      <header className="inspector-header">
        <div className="inspector-identity">
          <div className="inspector-category"><span className={`category-dot category-${category?.toLowerCase()}`} />{category ?? 'Component'}</div>
          <h2>{label}</h2>
          {typeName && <p title={typeName}>{typeName}</p>}
        </div>
        <button className="inspector-close" aria-label="Close component inspector" onClick={onClose} title="Close inspector"><Icon name="x" size={14} /></button>
      </header>

      <nav aria-label="Component inspector sections" className="inspector-tabs" role="tablist">
        <button className={tab === 'details' ? 'active' : ''} {...getTabProps('details')}>Details</button>
        <button className={tab === 'style' ? 'active' : ''} {...getTabProps('style')}>Style</button>
        <button className={tab === 'contracts' ? 'active' : ''} {...getTabProps('contracts')}>GUMBO <span>{contracts.length || node && Object.values(node.contractCounts).reduce((sum, count) => sum + count, 0)}</span></button>
      </nav>

      <div className="inspector-scroll" ref={scrollRegion}>
        {loading && <div className="inspector-loading"><span /><span /><span /></div>}
        <div className="inspector-details-grid" {...getPanelProps('details')}>
            <section className="inspector-section semantic-summary">
              <h3>Semantic identity</h3>
              <dl>
                <dt>Kind</dt><dd>{kindLabel(details?.kind ?? node?.kind ?? 'component')}</dd>
                <dt>Datatype / type</dt><dd>{typeName ?? 'Not reported'}</dd>
                {(details?.qualifiedName ?? node?.qualifiedName) && <><dt>Qualified name</dt><dd><code>{details?.qualifiedName ?? node?.qualifiedName}</code></dd></>}
              </dl>
              <div className="trace-tag-list">
                <span>@trace tags</span>
                {semanticTraceIds.map((id) => <code key={id}>{id}</code>)}
                {!semanticTraceIds.length && <em>None attached</em>}
              </div>
            </section>
            <section className="inspector-section">
              <h3>Source</h3>
              {source ? <SourceCard onOpen={() => onOpenSource(source)} source={source} /> : <p className="inspector-muted">No source location was reported.</p>}
              {node && (node.definitionId || node.canExpand || node.expanded) && (
                <div className="inspector-actions" aria-label="System navigation actions">
                  {node.definitionId && <button onClick={onOpen}><Icon name="external" size={15} />Open system</button>}
                  {(node.canExpand || node.expanded) && <button onClick={onExpand}><Icon name="layers" size={15} />{node.expanded ? 'Hide contents' : 'Show contents here'}</button>}
                </div>
              )}
            </section>
            <section className="inspector-section">
              <h3>Boundary ports and datatypes <span>{ports.length}</span></h3>
              <div className="port-table">
                {ports.map((port) => (
                  <div className="port-detail" key={port.id}>
                    <span className={`direction direction-${port.direction.toLowerCase()}`}>{port.direction}</span>
                    <span><strong>{port.name}</strong><small>Datatype: {port.typeName ?? 'Untyped'}</small></span>
                    <Icon name="port" size={14} />
                  </div>
                ))}
                {!ports.length && <p className="inspector-muted">This element has no boundary ports.</p>}
              </div>
            </section>

            {details?.connections && details.connections.length > 0 && (
              <section className="inspector-section">
                <h3>Connections <span>{details.connections.length}</span></h3>
                <div className="connection-list">
                  {details.connections.map((connection) => <div key={connection.id}><Icon name="port" size={13} /><span>{connection.label ?? connection.id}</span></div>)}
                </div>
              </section>
            )}
        </div>

        <div className="inspector-style-grid" {...getPanelProps('style')}>
            <section className="inspector-section">
              <h3>Diagram presentation</h3>
              <div className="inspector-actions">
                <button disabled={!node} onClick={onPin} title={node ? (node.pinned ? 'Unpin position' : 'Pin position') : 'Available for rendered diagram nodes only'}><Icon name={node?.pinned ? 'pin-off' : 'pin'} size={15} />{node?.pinned ? 'Unpin' : 'Pin'}</button>
                <button disabled={!node} onClick={onHide}><Icon name="eye-off" size={15} />Hide from view</button>
              </div>
              {node && <p className="inspector-muted">Position: {Math.round(node.position.x)}, {Math.round(node.position.y)} · {node.pinned ? 'pinned' : 'automatic placement'}</p>}
            </section>
            {node?.expanded && node.dimensions && (
              <section className="inspector-section container-size-controls">
                <h3>Expanded system dimensions</h3>
                <form onSubmit={(event) => {
                  event.preventDefault();
                  const nextWidth = Number(containerWidth);
                  const nextHeight = Number(containerHeight);
                  if (Number.isFinite(nextWidth) && Number.isFinite(nextHeight)) onResize(nextWidth, nextHeight);
                }}>
                  <label>Width<input aria-label="Container width" min={Math.ceil(minimumContainerSize?.width ?? 640)} onChange={(event) => setContainerWidth(event.target.value)} type="number" value={containerWidth} /></label>
                  <label>Height<input aria-label="Container height" min={Math.ceil(minimumContainerSize?.height ?? 380)} onChange={(event) => setContainerHeight(event.target.value)} type="number" value={containerHeight} /></label>
                  <div><button type="submit">Apply size</button><button onClick={onFitContents} type="button">Fit contents</button></div>
                </form>
                <p className="inspector-muted">Minimum for current contents: {Math.ceil(minimumContainerSize?.width ?? 640)} × {Math.ceil(minimumContainerSize?.height ?? 380)}</p>
              </section>
            )}
        </div>

        <section className="contracts-panel" {...getPanelProps('contracts')}>
            {contracts.length ? (
              [...contractsByKind.entries()].map(([kind, entries]) => (
                <div className="contract-group" key={kind}>
                  <h3>{kindLabel(kind)} <span>{entries.length}</span></h3>
                  {entries.map((contract) => (
                    <ContractCard
                      contract={contract}
                      key={contract.id}
                      onActivate={() => onSelectContract(contract)}
                      onOpenSource={onOpenSource}
                      onSelect={() => onSelectContract(selectedContractId === contract.id ? undefined : contract)}
                      onTraceHover={onTraceHover}
                      onTraceNavigate={onTraceNavigate}
                      selected={selectedContractId === contract.id}
                    />
                  ))}
                </div>
              ))
            ) : (
              <div className="contracts-empty">
                <Icon name="contract" size={24} />
                <h3>Contract details unavailable</h3>
                <p>{node && Object.values(node.contractCounts).some(Boolean) ? 'The model reports contracts, but this element endpoint did not return their source yet.' : 'No GUMBO contracts are attached to this element.'}</p>
              </div>
            )}
        </section>
      </div>
    </aside>
  );
}
