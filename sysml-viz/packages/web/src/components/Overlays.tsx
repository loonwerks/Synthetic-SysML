import { useId, useRef, useState } from 'react';
import type { Diagnostic, ToastMessage } from '../types';
import { Icon } from './Icon';
import { ModalDialog } from './ModalDialog';

export function DiagnosticsBanner({
  diagnostics,
  stale,
  onDismissWarning,
  onDismissAllWarnings,
}: {
  diagnostics: Diagnostic[];
  stale: boolean;
  onDismissWarning: (diagnostic: Diagnostic) => void;
  onDismissAllWarnings: () => void;
}) {
  const [expanded, setExpanded] = useState(false);
  const primary = diagnostics.find((diagnostic) => diagnostic.severity === 'error') ?? diagnostics[0];
  const warningCount = diagnostics.filter((diagnostic) => diagnostic.severity === 'warning').length;
  if (!stale && !primary) return null;
  return (
    <div className={`diagnostics-banner ${stale ? 'stale' : ''} ${expanded ? 'expanded' : ''}`} role="status">
      <span className="diagnostic-icon"><Icon name={primary?.severity === 'error' ? 'error' : 'warning'} size={17} /></span>
      <div className="diagnostic-copy">
        <strong>{stale ? 'Showing the last renderable model' : 'Model diagnostic'}</strong>
        <span>{primary?.message ?? 'The current source has not produced a renderable revision yet.'}</span>
      </div>
      {primary?.source && <code>{primary.source.file.split('/').at(-1)}:{primary.source.line ?? 1}</code>}
      <div className="diagnostic-actions">
        {diagnostics.length > 1 && (
          <button
            aria-expanded={expanded}
            className="diagnostic-count"
            onClick={() => setExpanded((open) => !open)}
            title={`${expanded ? 'Hide' : 'Show'} ${diagnostics.length - 1} additional diagnostic${diagnostics.length === 2 ? '' : 's'}`}
          >+{diagnostics.length - 1}</button>
        )}
        {primary?.severity === 'warning' && (
          <button aria-label="Dismiss this warning" onClick={() => onDismissWarning(primary)} title="Dismiss this warning"><Icon name="x" size={13} /></button>
        )}
      </div>
      {expanded && (
        <div className="diagnostic-list">
          {diagnostics.map((diagnostic) => (
            <div className={`diagnostic-list-item ${diagnostic.severity}`} key={`${diagnostic.code}:${diagnostic.source?.file}:${diagnostic.source?.line}:${diagnostic.message}`}>
              <Icon name={diagnostic.severity === 'error' ? 'error' : 'warning'} size={14} />
              <span><strong>{diagnostic.code ?? diagnostic.severity}</strong>{diagnostic.message}</span>
              {diagnostic.source && <code>{diagnostic.source.file.split('/').at(-1)}:{diagnostic.source.line ?? 1}</code>}
              {diagnostic.severity === 'warning' && <button aria-label="Dismiss warning" onClick={() => onDismissWarning(diagnostic)}><Icon name="x" size={12} /></button>}
            </div>
          ))}
          {warningCount > 1 && <button className="dismiss-all-warnings" onClick={onDismissAllWarnings}>Dismiss all {warningCount} warnings</button>}
        </div>
      )}
    </div>
  );
}

export function LoadingCanvas() {
  return (
    <div className="canvas-loading">
      <div className="loading-architecture"><span /><i /><span /><i /><span /></div>
      <h2>Building the architecture view</h2>
      <p>Parsing parts, ports, connections, and GUMBO contracts…</p>
    </div>
  );
}

export function ErrorCanvas({ message, detail, onRetry }: { message: string; detail?: string; onRetry: () => void }) {
  return (
    <div className="canvas-error">
      <span className="error-graphic"><Icon name="error" size={28} /></span>
      <h2>{message}</h2>
      <p>{detail ?? 'Start a session with an explicit project root, then try again.'}</p>
      <code>sysml-viz serve --root /path/to/model</code>
      <button className="button primary" onClick={onRetry}><Icon name="refresh" />Retry connection</button>
    </div>
  );
}

export function EmptyCanvas({ onLayout }: { onLayout: () => void }) {
  return (
    <div className="canvas-empty">
      <span><Icon name="architecture" size={30} /></span>
      <h2>No elements in this view</h2>
      <p>Choose another semantic root, reveal hidden elements, or add parts to the SysML source.</p>
      <button className="button secondary" onClick={onLayout}><Icon name="layout" />Try automatic layout</button>
    </div>
  );
}

export function Toasts({ messages, onDismiss }: { messages: ToastMessage[]; onDismiss: (id: number) => void }) {
  return (
    <div className="toast-stack" aria-live="polite">
      {messages.map((message) => (
        <article className={`toast ${message.tone}`} key={message.id}>
          <span><Icon name={message.tone === 'error' ? 'error' : message.tone === 'success' ? 'check' : 'info'} size={16} /></span>
          <div><strong>{message.title}</strong>{message.detail && <p>{message.detail}</p>}</div>
          <button onClick={() => onDismiss(message.id)} aria-label="Dismiss"><Icon name="x" size={13} /></button>
        </article>
      ))}
    </div>
  );
}

interface CheckpointDialogProps {
  open: boolean;
  busy: boolean;
  onClose: () => void;
  onSave: (name: string, message: string) => void;
}

export function CheckpointDialog({ open, busy, onClose, onSave }: CheckpointDialogProps) {
  const inputRef = useRef<HTMLInputElement>(null);
  const titleId = useId();
  const descriptionId = useId();
  return (
    <ModalDialog
      canDismiss={!busy}
      descriptionId={descriptionId}
      initialFocusRef={inputRef}
      onClose={onClose}
      open={open}
      titleId={titleId}
    >
      <form className="dialog" onSubmit={(event) => {
        event.preventDefault();
        const data = new FormData(event.currentTarget);
        onSave(String(data.get('name') ?? ''), String(data.get('message') ?? ''));
      }}>
        <header><span><Icon name="bookmark" /></span><div><h2 id={titleId}>Create checkpoint</h2><p id={descriptionId}>Record a stable model and view milestone for humans and agents.</p></div><button aria-label="Close checkpoint dialog" disabled={busy} type="button" onClick={onClose}><Icon name="x" /></button></header>
        <label><span>Name</span><input disabled={busy} name="name" placeholder="Isolette context laid out" ref={inputRef} required /></label>
        <label><span>Message <em>optional</em></span><textarea disabled={busy} name="message" placeholder="What changed in this revision?" rows={3} /></label>
        <footer><button className="button subtle" disabled={busy} type="button" onClick={onClose}>Cancel</button><button className="button primary" disabled={busy} type="submit">{busy ? 'Saving…' : 'Create checkpoint'}</button></footer>
      </form>
    </ModalDialog>
  );
}
