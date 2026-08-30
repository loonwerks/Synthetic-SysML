import type { FidelityStatusViewModel } from '../diagram-assessment';

export interface DiagramStatusProps {
  status: FidelityStatusViewModel;
  onRepair: () => void;
  onValidate: () => void;
  repairBusy?: boolean;
  validationBusy?: boolean;
}

/** Single plain-language entry point for parse, validation, and geometry state. */
export function DiagramStatus({
  status,
  onRepair,
  onValidate,
  repairBusy = false,
  validationBusy = false,
}: DiagramStatusProps) {
  return (
    <details className={`diagram-status diagram-status-${status.tone}`} data-state={status.state}>
      <summary className={`status-pill ${status.tone}`} aria-label={`Diagram status: ${status.label}`}>
        <span className="diagram-status-indicator" aria-hidden="true" />
        <span>{status.label}</span>
        {status.checking && <span className="button-spinner" aria-hidden="true" />}
      </summary>
      <div className="diagram-status-popover">
        <strong>{status.label}</strong>
        <p aria-live="polite">{status.summary}</p>
        <small>{status.scope}</small>
        {status.findings.length > 0 && (
          <ul className="diagram-status-findings">
            {status.findings.map((finding) => (
              <li key={finding.code} data-severity={finding.severity}>
                <span>{finding.message}</span>
                <strong>{finding.count}</strong>
              </li>
            ))}
          </ul>
        )}
        <div className="diagram-status-actions">
          {status.canRepair && (
            <button className="button secondary" disabled={repairBusy} onClick={onRepair}>
              {repairBusy ? 'Repairing…' : 'Repair layout'}
            </button>
          )}
          <button className="button secondary" disabled={validationBusy} onClick={onValidate}>
            {validationBusy ? 'Validating…' : 'Run validation'}
          </button>
        </div>
      </div>
    </details>
  );
}
