import assert from 'node:assert/strict';
import test from 'node:test';
import { buildFidelityStatusViewModel } from '../src/diagram-assessment.ts';
import type { DiagramHealth } from '../src/types.ts';

function health(overrides: Partial<DiagramHealth> = {}): DiagramHealth {
  return {
    nodeCount: 2,
    edgeCount: 1,
    unresolvedEndpointCount: 0,
    overlapCount: 0,
    crossingCount: 0,
    hiddenElementCount: 0,
    unresolvedEdgeIds: [],
    overlaps: [],
    crossings: [],
    labelCollisionCount: 0,
    truncatedTextCount: 0,
    outOfBoundsCount: 0,
    labelCollisions: [],
    truncatedTexts: [],
    outOfBounds: [],
    status: 'clear',
    findings: [],
    danglingPresentationLinkCount: 0,
    danglingPresentationLinkIds: [],
    routeObjectCollisionCount: 0,
    routeObjectCollisions: [],
    fidelity: {
      state: 'validated',
      label: 'Validated by Sireum',
      summary: 'The current model revision passed validation.',
      scope: 'aadl-oriented-subset',
    },
    ...overrides,
  };
}

test('fidelity view model exposes one validated plain-language state', () => {
  const status = buildFidelityStatusViewModel(health());
  assert.equal(status.label, 'Validated by Sireum');
  assert.equal(status.tone, 'good');
  assert.equal(status.scope, 'Supported AADL-oriented SysML subset');
  assert.equal(status.canRepair, false);
});

test('repair is available only for actionable repairable findings', () => {
  const finding = {
    code: 'object-overlap' as const,
    severity: 'blocked' as const,
    message: 'Two objects overlap.',
    count: 2,
    elementIds: ['one', 'two'],
    repairable: true,
  };
  const status = buildFidelityStatusViewModel(health({
    status: 'blocked',
    findings: [finding, { ...finding, code: 'unresolved-endpoint', repairable: false }],
    fidelity: {
      state: 'partial',
      label: 'Partial diagram',
      summary: 'Some constructs are not represented.',
      scope: 'aadl-oriented-subset',
    },
  }));
  assert.equal(status.tone, 'danger');
  assert.equal(status.canRepair, true);
  assert.deepEqual(status.repairableFindings, [finding]);
});

test('local diagrams with route and label readability findings are amber, not blocked', () => {
  const status = buildFidelityStatusViewModel(health({
    status: 'attention',
    findings: [
      {
        code: 'route-object-collision',
        severity: 'attention',
        message: '5 routes cross a diagram object.',
        count: 5,
        elementIds: ['route-1'],
        repairable: false,
      },
      {
        code: 'label-collision',
        severity: 'attention',
        message: '53 label collisions need attention.',
        count: 53,
        elementIds: ['label-1'],
        repairable: false,
      },
    ],
    fidelity: {
      state: 'local',
      label: 'Locally rendered',
      summary: 'Rendered locally; Sireum validation has not been requested.',
      scope: 'aadl-oriented-subset',
    },
  }));
  assert.equal(status.tone, 'pending');
  assert.equal(status.canRepair, false);
});

test('refresh failures preserve prior fidelity while disclosing unavailable assessment', () => {
  const status = buildFidelityStatusViewModel(health(), false, 'Connection lost');
  assert.equal(status.label, 'Validated by Sireum');
  assert.equal(status.unavailable, true);
  assert.equal(status.tone, 'pending');
  assert.match(status.summary, /Assessment unavailable: Connection lost/);
});

test('initial assessment failure has an explicit unavailable state', () => {
  const status = buildFidelityStatusViewModel(undefined, false, 'Service unavailable');
  assert.equal(status.state, 'unavailable');
  assert.equal(status.label, 'Assessment unavailable');
  assert.equal(status.tone, 'danger');
});
