import type { Diagnostic } from './types';

/** Stable for an unchanged diagnostic, but changes with its meaning or location. */
export function diagnosticKey(diagnostic: Diagnostic): string {
  return JSON.stringify([
    diagnostic.severity,
    diagnostic.code ?? '',
    diagnostic.message,
    diagnostic.source?.file ?? '',
    diagnostic.source?.line ?? 0,
    diagnostic.source?.column ?? 0,
    diagnostic.source?.endLine ?? 0,
    diagnostic.source?.endColumn ?? 0,
  ]);
}

/** Warning dismissal can never suppress errors or other diagnostic severities. */
export function visibleDiagnostics(
  diagnostics: readonly Diagnostic[],
  dismissedWarningKeys: ReadonlySet<string>,
): Diagnostic[] {
  const seen = new Set<string>();
  return diagnostics.filter((diagnostic) => {
    const key = diagnosticKey(diagnostic);
    if (seen.has(key)) return false;
    seen.add(key);
    return diagnostic.severity !== 'warning' || !dismissedWarningKeys.has(key);
  });
}
