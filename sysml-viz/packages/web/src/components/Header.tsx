import type { ConnectionStatus } from '../api';
import type { FidelityStatusViewModel } from '../diagram-assessment';
import type { SessionState } from '../types';
import { DiagramStatus } from './DiagramStatus';
import { Icon } from './Icon';

export type UiMode = 'explore' | 'advanced';

interface HeaderProps {
  session?: SessionState;
  connection: ConnectionStatus;
  mode: UiMode;
  status: FidelityStatusViewModel;
  isValidating: boolean;
  repairBusy: boolean;
  canUndo: boolean;
  canRedo: boolean;
  onModeChange: (mode: UiMode) => void;
  onOpenProject: () => void;
  onValidate: () => void;
  onRepair: () => void;
  onCheckpoint: () => void;
  onExport: (format: 'png' | 'svg') => void;
  onRefresh: () => void;
  onUndo: () => void;
  onRedo: () => void;
  onTools: () => void;
}

export function Header({
  session, connection, mode, status, isValidating, repairBusy, canUndo, canRedo,
  onModeChange, onOpenProject, onValidate, onRepair, onCheckpoint, onExport, onRefresh, onUndo, onRedo, onTools,
}: HeaderProps) {
  return (
    <header className="app-header">
      <div className="brand">
        <span className="brand-mark"><Icon name="architecture" size={19} /></span>
        <span className="brand-copy"><strong>SysML Viz</strong><span>Architecture explorer</span></span>
      </div>

      <button className="header-session" onClick={onOpenProject} title={`${session?.root ?? 'No project loaded'} — open or switch project`} type="button">
        <span className={`connection-dot ${connection}`} aria-label={`Live updates: ${connection}`} />
        <Icon name="folder" size={15} />
        <span className="header-root">{session?.root ? session.root.split('/').filter(Boolean).at(-1) : 'Connecting…'}</span>
        {mode === 'advanced' && session && <span className="revision">rev {session.revision}</span>}
      </button>

      <div className="header-statuses">
        <DiagramStatus
          onRepair={onRepair}
          onValidate={onValidate}
          repairBusy={repairBusy}
          status={status}
          validationBusy={isValidating}
        />
      </div>

      <div className="header-actions">
        <div className="history-actions" role="group" aria-label="View history">
          <button aria-keyshortcuts="Control+Z Meta+Z" aria-label="Undo view change" className="button subtle icon-only" disabled={!canUndo} onClick={onUndo} title="Undo view change (Ctrl/Cmd+Z)"><Icon name="undo" /></button>
          <button aria-keyshortcuts="Control+Shift+Z Meta+Shift+Z" aria-label="Redo view change" className="button subtle icon-only" disabled={!canRedo} onClick={onRedo} title="Redo view change (Ctrl/Cmd+Shift+Z)"><Icon name="redo" /></button>
        </div>
        <div className="mode-toggle" role="group" aria-label="Interface mode">
          <button aria-pressed={mode === 'explore'} onClick={() => onModeChange('explore')}>Explore</button>
          <button aria-pressed={mode === 'advanced'} onClick={() => onModeChange('advanced')}>Advanced</button>
        </div>
        {mode === 'advanced' && <>
          <button className="button subtle icon-only" onClick={onRefresh} title="Refresh model" aria-label="Refresh model"><Icon name="refresh" /></button>
          <button className="button subtle" onClick={onTools} aria-label="Open View Tools"><Icon name="command" />View Tools</button>
          <button className="button subtle" onClick={onCheckpoint}><Icon name="bookmark" />Checkpoint</button>
        </>}
        <details className="export-menu">
          <summary className="button primary"><Icon name="download" />Export<Icon name="chevron-down" size={13} /></summary>
          <div className="menu-popover">
            <button onClick={() => onExport('svg')}><span className="file-format">SVG</span><span>Vector diagram</span></button>
            <button onClick={() => onExport('png')}><span className="file-format">PNG</span><span>Presentation image</span></button>
          </div>
        </details>
      </div>
    </header>
  );
}
