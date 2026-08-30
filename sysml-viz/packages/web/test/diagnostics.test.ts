import assert from 'node:assert/strict';
import test from 'node:test';
import { diagnosticKey, visibleDiagnostics } from '../src/diagnostics.ts';
import type { Diagnostic } from '../src/types.ts';

const warning: Diagnostic = {
  severity: 'warning',
  code: 'GLOBAL_PART_USAGE',
  message: 'Package-level part usage is not handled.',
  source: { file: '/model.sysml', line: 12, column: 2 },
};

test('warning dismissal is exact and never suppresses errors', () => {
  const error: Diagnostic = { ...warning, severity: 'error' };
  const dismissed = new Set([diagnosticKey(warning), diagnosticKey(error)]);
  assert.deepEqual(visibleDiagnostics([warning, error], dismissed), [error]);
});

test('a genuinely changed warning gets a new key and becomes visible', () => {
  const dismissed = new Set([diagnosticKey(warning)]);
  const moved = { ...warning, source: { ...warning.source!, line: 13 } };
  const changed = { ...warning, message: `${warning.message} Updated.` };
  assert.notEqual(diagnosticKey(moved), diagnosticKey(warning));
  assert.notEqual(diagnosticKey(changed), diagnosticKey(warning));
  assert.deepEqual(visibleDiagnostics([moved, changed], dismissed), [moved, changed]);
});

test('the same warning from diagram and session channels is shown once', () => {
  assert.deepEqual(visibleDiagnostics([warning, { ...warning }], new Set()), [warning]);
});
