import { useCallback, useEffect, useRef, useState } from 'react';
import { api } from './api';
import type { DiagramFidelity, DiagramHealth, DiagramHealthFinding } from './types';

export interface DiagramAssessmentOptions {
  rootId?: string;
  viewId?: string;
  /** Change after model, view, visibility, validation, or layout revisions. */
  refreshKey?: string | number;
  enabled?: boolean;
  debounceMs?: number;
  fetchHealth?: (rootId?: string, viewId?: string, signal?: AbortSignal) => Promise<DiagramHealth>;
}

export interface DiagramAssessmentState {
  health?: DiagramHealth;
  checking: boolean;
  error?: string;
  refresh: () => void;
}

export interface FidelityStatusViewModel {
  state: DiagramFidelity['state'] | 'unavailable';
  tone: 'good' | 'pending' | 'danger';
  label: string;
  summary: string;
  scope: string;
  checking: boolean;
  unavailable: boolean;
  findings: readonly DiagramHealthFinding[];
  repairableFindings: readonly DiagramHealthFinding[];
  canRepair: boolean;
  canValidate: boolean;
}

const SCOPE_LABEL = 'Supported AADL-oriented SysML subset';

export function buildFidelityStatusViewModel(
  health: DiagramHealth | undefined,
  checking = false,
  error?: string,
): FidelityStatusViewModel {
  if (!health) {
    return {
      state: 'unavailable',
      tone: error ? 'danger' : 'pending',
      label: error ? 'Assessment unavailable' : 'Checking diagram…',
      summary: error ?? 'Assessing diagram fidelity and geometry.',
      scope: SCOPE_LABEL,
      checking,
      unavailable: Boolean(error),
      findings: [],
      repairableFindings: [],
      canRepair: false,
      canValidate: true,
    };
  }

  const repairableFindings = health.findings.filter((finding) => finding.repairable && finding.count > 0);
  const unavailable = Boolean(error);
  const tone = health.status === 'blocked' || health.fidelity.state === 'invalid'
    ? 'danger'
    : checking || unavailable || health.status === 'attention' || health.fidelity.state === 'partial' || health.fidelity.state === 'stale'
      ? 'pending'
      : 'good';
  return {
    state: health.fidelity.state,
    tone,
    label: health.fidelity.label,
    summary: unavailable ? `Assessment unavailable: ${error}` : health.fidelity.summary,
    scope: health.fidelity.scope === 'aadl-oriented-subset' ? SCOPE_LABEL : health.fidelity.scope,
    checking,
    unavailable,
    findings: health.findings,
    repairableFindings,
    canRepair: repairableFindings.length > 0,
    canValidate: health.fidelity.state !== 'validated' || health.status !== 'clear',
  };
}

/**
 * Debounced, last-request-wins health assessment. The previous result remains
 * visible while a new revision is checked, avoiding status flicker.
 */
export function useDiagramAssessment({
  rootId,
  viewId,
  refreshKey,
  enabled = true,
  debounceMs = 750,
  fetchHealth = api.health,
}: DiagramAssessmentOptions): DiagramAssessmentState {
  const [health, setHealth] = useState<DiagramHealth>();
  const [checking, setChecking] = useState(false);
  const [error, setError] = useState<string>();
  const [refreshSequence, setRefreshSequence] = useState(0);
  const requestSequence = useRef(0);
  const refresh = useCallback(() => setRefreshSequence((value) => value + 1), []);

  useEffect(() => {
    if (!enabled) {
      setChecking(false);
      return;
    }
    const requestId = ++requestSequence.current;
    const controller = new AbortController();
    let active = true;
    setChecking(true);
    const timer = window.setTimeout(() => {
      void fetchHealth(rootId, viewId, controller.signal).then((nextHealth) => {
        if (!active || requestId !== requestSequence.current) return;
        setHealth(nextHealth);
        setError(undefined);
        setChecking(false);
      }).catch((reason: unknown) => {
        if (!active || requestId !== requestSequence.current) return;
        if (reason && typeof reason === 'object' && 'name' in reason && reason.name === 'AbortError') return;
        setError(reason instanceof Error ? reason.message : 'Could not assess the diagram.');
        setChecking(false);
      });
    }, debounceMs);
    return () => {
      active = false;
      controller.abort();
      window.clearTimeout(timer);
    };
  }, [debounceMs, enabled, fetchHealth, refreshKey, refreshSequence, rootId, viewId]);

  return { health, checking, error, refresh };
}
