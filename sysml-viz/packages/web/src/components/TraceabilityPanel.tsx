import { useCallback, useEffect, useMemo, useRef, useState, type KeyboardEvent, type PointerEvent } from 'react';
import { DEFAULT_SYSTEM_ABSTRACT_WIDTH } from '../canvas-preferences';
import type { ModelContractRecord, SystemAbstractDocument } from '../types';
import { contractsForTraceIds, markdownDisplayBlocks, traceNavigationMatches } from '../traceability';
import { Icon } from './Icon';

export interface TraceabilityPanelProps {
  activeTraceIds: readonly string[];
  contracts: readonly ModelContractRecord[];
  document: SystemAbstractDocument;
  navigationRequest: { requestId: number; traceIds: readonly string[]; preferredTraceId?: string } | null;
  onClose: () => void;
  onSelectContract: (contract: ModelContractRecord) => void;
  width: number;
  minWidth: number;
  maxWidth: number;
  onWidthChange: (width: number) => void;
}

export function TraceabilityPanel({
  activeTraceIds,
  contracts,
  document,
  navigationRequest,
  onClose,
  onSelectContract,
  width,
  minWidth,
  maxWidth,
  onWidthChange,
}: TraceabilityPanelProps) {
  const container = useRef<HTMLDivElement>(null);
  const separator = useRef<HTMLDivElement>(null);
  const resizeDrag = useRef<{
    pointerId: number;
    startX: number;
    startWidth: number;
    nextWidth: number;
    frame?: number;
  } | undefined>(undefined);
  const [currentMatchIndex, setCurrentMatchIndex] = useState(0);
  const [contractChoices, setContractChoices] = useState<{
    traceIds: readonly string[];
    contracts: readonly ModelContractRecord[];
  }>();
  const active = useMemo(() => new Set(activeTraceIds), [activeTraceIds]);
  const blocks = useMemo(
    () => markdownDisplayBlocks(document.markdown, document.anchors),
    [document],
  );
  const matches = useMemo(
    () => traceNavigationMatches(blocks, navigationRequest?.traceIds ?? []),
    [blocks, navigationRequest?.traceIds],
  );
  const currentMatch = matches[currentMatchIndex];
  const clampWidth = useCallback((nextWidth: number) => Math.max(minWidth, Math.min(maxWidth, nextWidth)), [maxWidth, minWidth]);

  const previewWidth = useCallback((nextWidth: number) => {
    const resolved = clampWidth(nextWidth);
    const apply = (value: number) => {
      separator.current?.closest<HTMLElement>('.workspace')
        ?.style.setProperty('--traceability-panel-width', `${value}px`);
      separator.current?.setAttribute('aria-valuenow', String(Math.round(value)));
    };
    const drag = resizeDrag.current;
    if (!drag) {
      apply(resolved);
      return resolved;
    }
    drag.nextWidth = resolved;
    if (drag.frame === undefined) {
      drag.frame = window.requestAnimationFrame(() => {
        const current = resizeDrag.current;
        if (!current) return;
        current.frame = undefined;
        apply(current.nextWidth);
      });
    }
    return resolved;
  }, [clampWidth]);

  const finishResize = useCallback((event: PointerEvent<HTMLDivElement>) => {
    const drag = resizeDrag.current;
    if (!drag || event.pointerId !== drag.pointerId) return;
    if (drag.frame !== undefined) window.cancelAnimationFrame(drag.frame);
    const nextWidth = drag.nextWidth;
    resizeDrag.current = undefined;
    previewWidth(nextWidth);
    onWidthChange(nextWidth);
  }, [onWidthChange, previewWidth]);

  const resizeFromKeyboard = useCallback((event: KeyboardEvent<HTMLDivElement>) => {
    let nextWidth: number | undefined;
    const step = event.shiftKey ? 32 : 8;
    if (event.key === 'ArrowLeft') nextWidth = width + step;
    if (event.key === 'ArrowRight') nextWidth = width - step;
    if (event.key === 'Home') nextWidth = minWidth;
    if (event.key === 'End') nextWidth = maxWidth;
    if (nextWidth === undefined) return;
    event.preventDefault();
    onWidthChange(clampWidth(nextWidth));
  }, [clampWidth, maxWidth, minWidth, onWidthChange, width]);

  const navigateTo = useCallback((index: number) => {
    if (matches.length === 0) return;
    const normalized = (index + matches.length) % matches.length;
    setCurrentMatchIndex(normalized);
    const key = matches[normalized]!.blockKey;
    window.requestAnimationFrame(() => {
      const target = [...(container.current?.querySelectorAll<HTMLElement>('[data-block-key]') ?? [])]
        .find((element) => element.dataset.blockKey === key);
      target?.focus({ preventScroll: true });
      target?.scrollIntoView({ behavior: 'smooth', block: 'center' });
    });
  }, [matches]);

  // Navigation is deliberately driven only by an explicit selection click
  // request. Hover and ordinary selection may highlight ranges but never move
  // the reader's scroll position.
  useEffect(() => {
    if (!navigationRequest || matches.length === 0) return;
    const preferredIndex = navigationRequest.preferredTraceId
      ? matches.findIndex((match) => match.traceIds.includes(navigationRequest.preferredTraceId!))
      : -1;
    navigateTo(preferredIndex >= 0 ? preferredIndex : 0);
    // The request ID distinguishes repeated clicks on the same component.
  }, [matches.length, navigateTo, navigationRequest]);

  const linkedContracts = useCallback((traceIds: readonly string[]) => {
    return contractsForTraceIds(contracts, traceIds);
  }, [contracts]);

  const inspectTraceBlock = useCallback((traceIds: readonly string[]) => {
    const linked = linkedContracts(traceIds);
    if (linked.length === 1) {
      setContractChoices(undefined);
      onSelectContract(linked[0]!);
    } else if (linked.length > 1) {
      setContractChoices({ traceIds, contracts: linked });
    }
  }, [linkedContracts, onSelectContract]);

  return (
    <aside className="traceability-panel" aria-label="System Abstract traceability" data-capability="traceability.inspect">
      <div
        aria-label="Resize System Abstract"
        aria-orientation="vertical"
        aria-valuemax={Math.round(maxWidth)}
        aria-valuemin={Math.round(minWidth)}
        aria-valuenow={Math.round(width)}
        className="traceability-resize-handle"
        onDoubleClick={() => onWidthChange(clampWidth(DEFAULT_SYSTEM_ABSTRACT_WIDTH))}
        onKeyDown={resizeFromKeyboard}
        onPointerCancel={finishResize}
        onPointerDown={(event) => {
          if (event.button !== 0) return;
          event.preventDefault();
          event.currentTarget.setPointerCapture(event.pointerId);
          resizeDrag.current = {
            pointerId: event.pointerId,
            startX: event.clientX,
            startWidth: width,
            nextWidth: width,
          };
        }}
        onPointerMove={(event) => {
          const drag = resizeDrag.current;
          if (!drag || event.pointerId !== drag.pointerId) return;
          previewWidth(drag.startWidth + drag.startX - event.clientX);
        }}
        onPointerUp={finishResize}
        ref={separator}
        role="separator"
        tabIndex={0}
        title="Drag to resize; use arrow keys for precise changes; double-click to reset"
      />
      <header>
        <span className="traceability-title-icon"><Icon name="requirement" size={15} /></span>
        <span><strong>System Abstract</strong><small>{document.relativePath}</small></span>
        <button aria-label="Close System Abstract" onClick={onClose} title="Close traceability mode"><Icon name="x" size={14} /></button>
      </header>
      <div className="traceability-status">
        <div className="traceability-status-copy" role="status">
          {activeTraceIds.length > 0
            ? <><span>Matching</span>{activeTraceIds.map((id) => <code key={id}>{id}</code>)}</>
            : <span>Hover to preview; click a traced component to inspect and navigate.</span>}
        </div>
        {matches.length > 0 && (
          <nav className="traceability-navigation" aria-label="Matching System Abstract ranges">
            <button
              aria-label="Previous matching trace range"
              disabled={matches.length < 2}
              onClick={() => navigateTo(currentMatchIndex - 1)}
              title="Previous matching trace range"
            ><Icon name="arrow-left" size={12} /></button>
            <span aria-live="polite">
              <strong>{currentMatchIndex + 1} of {matches.length}</strong>
              <small>{currentMatch?.traceIds.join(', ')}</small>
            </span>
            <button
              aria-label="Next matching trace range"
              disabled={matches.length < 2}
              onClick={() => navigateTo(currentMatchIndex + 1)}
              title="Next matching trace range"
            ><Icon name="chevron-right" size={12} /></button>
          </nav>
        )}
      </div>
      {contractChoices && (
        <div className="trace-contract-chooser" role="dialog" aria-label="Contracts linked to abstract passage">
          <header>
            <span><strong>Linked contracts</strong><small>{contractChoices.traceIds.join(', ')}</small></span>
            <button aria-label="Close linked-contract chooser" onClick={() => setContractChoices(undefined)}><Icon name="x" size={12} /></button>
          </header>
          <div>
            {contractChoices.contracts.map((contract) => (
              <button key={contract.id} onClick={() => {
                setContractChoices(undefined);
                onSelectContract(contract);
              }}>
                <span>{contract.kind}</span>
                <strong>{contract.requirementId ?? contract.name}</strong>
                <small>{contract.ownerName}</small>
              </button>
            ))}
          </div>
        </div>
      )}
      <div className="traceability-document" ref={container}>
        {blocks.map((block) => (
          <pre
            aria-current={currentMatch?.blockKey === block.key ? 'location' : undefined}
            className={`${block.traceIds ? 'trace-block' : 'abstract-prose'} ${block.traceIds?.some((id) => active.has(id)) ? 'active' : ''} ${currentMatch?.blockKey === block.key ? 'current' : ''}`.trim()}
            data-block-key={block.key}
            data-trace-ids={block.traceIds?.join(' ')}
            key={block.key}
            onClick={block.traceIds ? () => inspectTraceBlock(block.traceIds!) : undefined}
            onKeyDown={block.traceIds ? (event) => {
              if (event.key === 'Enter' || event.key === ' ') {
                event.preventDefault();
                inspectTraceBlock(block.traceIds!);
              }
            } : undefined}
            role={block.traceIds ? 'button' : undefined}
            tabIndex={block.traceIds ? 0 : undefined}
            title={block.traceIds ? `${block.traceIds.join(', ')} · lines ${block.startLine}–${block.endLine} · click to inspect linked contracts` : undefined}
          >{block.text}</pre>
        ))}
      </div>
      {document.unresolvedTraceIds.length > 0 && (
        <footer title={document.unresolvedTraceIds.join(', ')}>
          {document.unresolvedTraceIds.length} model trace IDs have no abstract declaration
        </footer>
      )}
      {document.duplicateAnchorIds.length > 0 && (
        <footer title={document.duplicateAnchorIds.join(', ')}>
          {document.duplicateAnchorIds.length} abstract trace IDs have ambiguous duplicate declarations
        </footer>
      )}
    </aside>
  );
}
