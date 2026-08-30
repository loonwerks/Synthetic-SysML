// Deterministic, dependency-free bounded mirror of the retained canonical source.
// It intentionally reads no file, environment variable, clock, random source, or
// other mutable external state.

const SOURCE_SHA256 = "d4edf7ab89d07cfec03c783df4ab33931b2135029558ac6dd30c89d1acb0bc91";

const statuses = ["Valid", "Invalid"];
const lifecycleEvents = ["NoLifecycleEvent", "Start", "On", "Off"];
const conditionEvents = ["NoConditionEvent", "Maintenance", "Degraded", "ReturnToNormal"];
const lifecycleAssessments = ["InvalidLifecycle", "NoLifecycle", "StartRequested", "OnRequested", "OffRequested"];
const conditionAssessments = ["InvalidCondition", "NoCondition", "MaintenanceRequested", "DegradedReported", "ReturnRequested"];
const coordinationClasses = ["InvalidEvidence", "Quiet", "LifecycleOnly", "ConditionOnly", "OffDominantConflict", "ConditionDominantConflict", "RecoveryConflict"];
const modes = ["Off", "Starting", "On", "Maintenance", "Degraded"];
const reasons = ["InvalidEvidence", "OffAccepted", "DegradedAccepted", "MaintenanceAccepted", "ConflictingRequestsRejected", "ReturnAccepted", "ReturnNotApplicable", "OnAccepted", "StartAccepted", "NoRequest", "TransitionRejected"];

const lifecycleSamples = lifecycleEvents.flatMap(event => statuses.map(status => ({ event, status })));
const conditionSamples = conditionEvents.flatMap(event => statuses.map(status => ({ event, status })));

const semanticConnectionMap = {
  "INT-01": { from: "root.lifecycle_sample", to: "lifecycle_indication_qualification.lifecycle_sample", type: "LifecycleSample" },
  "INT-02": { from: "root.condition_sample", to: "condition_indication_qualification.condition_sample", type: "ConditionSample" },
  "INT-03": { from: "lifecycle_indication_qualification.assessment_to_compatibility", to: "cross_channel_compatibility.lifecycle_assessment", type: "LifecycleAssessment" },
  "INT-04": { from: "condition_indication_qualification.assessment_to_compatibility", to: "cross_channel_compatibility.condition_assessment", type: "ConditionAssessment" },
  "INT-05": { from: "lifecycle_indication_qualification.assessment_to_arbiter", to: "controller_mode_arbitration.lifecycle_assessment", type: "LifecycleAssessment" },
  "INT-06": { from: "condition_indication_qualification.assessment_to_arbiter", to: "controller_mode_arbitration.condition_assessment", type: "ConditionAssessment" },
  "INT-07": { from: "cross_channel_compatibility.coordination_class", to: "controller_mode_arbitration.coordination_class", type: "CoordinationClass" },
  "INT-08": { from: "controller_mode_arbitration.mode_decision", to: "coordination_frame_derivation.mode_decision", type: "ModeDecision" },
  "INT-09": { from: "coordination_frame_derivation.mode_disposition", to: "root.mode_disposition", type: "ControllerModeDisposition" },
  "INT-10": { from: "coordination_frame_derivation.coordination_result", to: "root.coordination_result", type: "CoordinationResult" }
};

// PART-01: exact mirror of QUAL-LIFE-01 and QUAL_LIFE_DERIVATION.
function lifecycleQualificationOwner(sample) {
  if (sample.status === "Invalid") return "InvalidLifecycle";
  if (sample.event === "NoLifecycleEvent") return "NoLifecycle";
  if (sample.event === "Start") return "StartRequested";
  if (sample.event === "On") return "OnRequested";
  return "OffRequested";
}

// PART-02: exact mirror of QUAL-COND-01 and QUAL_COND_DERIVATION.
function conditionQualificationOwner(sample) {
  if (sample.status === "Invalid") return "InvalidCondition";
  if (sample.event === "NoConditionEvent") return "NoCondition";
  if (sample.event === "Maintenance") return "MaintenanceRequested";
  if (sample.event === "Degraded") return "DegradedReported";
  return "ReturnRequested";
}

// PART-03: exact mirror of COMPAT-01 and COMPATIBILITY_DERIVATION.
function compatibilityOwner(life, cond) {
  if (life === "InvalidLifecycle" || cond === "InvalidCondition") return "InvalidEvidence";
  if (life === "NoLifecycle" && cond === "NoCondition") return "Quiet";
  if (life !== "NoLifecycle" && cond === "NoCondition") return "LifecycleOnly";
  if (life === "NoLifecycle" && cond !== "NoCondition") return "ConditionOnly";
  if (life === "OffRequested") return "OffDominantConflict";
  if ((life === "StartRequested" || life === "OnRequested") &&
      (cond === "MaintenanceRequested" || cond === "DegradedReported")) return "ConditionDominantConflict";
  return "RecoveryConflict";
}

const canonicalGuardManifest = [
  { id: "CASE-01", guard: "invalid lifecycle or invalid condition or class inconsistent" },
  { id: "CASE-02", guard: "otherwise lifecycle OffRequested" },
  { id: "CASE-03", guard: "otherwise condition DegradedReported" },
  { id: "CASE-04", guard: "otherwise condition MaintenanceRequested" },
  { id: "CASE-05", guard: "otherwise class RecoveryConflict" },
  { id: "CASE-06", guard: "otherwise unopposed ReturnRequested in Maintenance or Degraded" },
  { id: "CASE-07", guard: "otherwise unopposed ReturnRequested in Off, Starting, or On" },
  { id: "CASE-08", guard: "otherwise OnRequested in Starting or On" },
  { id: "CASE-09", guard: "otherwise StartRequested in Off or Starting" },
  { id: "CASE-10", guard: "otherwise NoLifecycle and NoCondition" },
  { id: "CASE-11", guard: "every remaining valid transition" }
];

// These booleans directly mirror guard_case_01 through guard_case_11 in source.
function canonicalGuardVector(life, cond, kind, mode) {
  const g1 = life === "InvalidLifecycle" || cond === "InvalidCondition" || kind !== compatibilityOwner(life, cond);
  const g2 = !g1 && life === "OffRequested";
  const g3 = !g1 && !g2 && cond === "DegradedReported";
  const g4 = !g1 && !g2 && !g3 && cond === "MaintenanceRequested";
  const g5 = !g1 && !g2 && !g3 && !g4 && kind === "RecoveryConflict";
  const g6 = !g1 && !g2 && !g3 && !g4 && !g5 && life === "NoLifecycle" && cond === "ReturnRequested" && (mode === "Maintenance" || mode === "Degraded");
  const g7 = !g1 && !g2 && !g3 && !g4 && !g5 && !g6 && life === "NoLifecycle" && cond === "ReturnRequested";
  const g8 = !g1 && !g2 && !g3 && !g4 && !g5 && !g6 && !g7 && life === "OnRequested" && cond === "NoCondition" && (mode === "Starting" || mode === "On");
  const g9 = !g1 && !g2 && !g3 && !g4 && !g5 && !g6 && !g7 && !g8 && life === "StartRequested" && cond === "NoCondition" && (mode === "Off" || mode === "Starting");
  const g10 = !g1 && !g2 && !g3 && !g4 && !g5 && !g6 && !g7 && !g8 && !g9 && life === "NoLifecycle" && cond === "NoCondition";
  const g11 = !g1 && !g2 && !g3 && !g4 && !g5 && !g6 && !g7 && !g8 && !g9 && !g10;
  return [g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11];
}

// PART-04 consumes PART-01/02/03-produced values. It never sees root samples.
function arbitrationOwner(life, cond, kind, preMode) {
  const vector = canonicalGuardVector(life, cond, kind, preMode);
  const hits = vector.reduce((n, value) => n + Number(value), 0);
  const index = vector.findIndex(Boolean);
  const id = `CASE-${String(index + 1).padStart(2, "0")}`;
  let nextMode;
  let reason;
  if (index === 0) { nextMode = "Degraded"; reason = "InvalidEvidence"; }
  else if (index === 1) { nextMode = "Off"; reason = "OffAccepted"; }
  else if (index === 2) { nextMode = "Degraded"; reason = "DegradedAccepted"; }
  else if (index === 3) { nextMode = "Maintenance"; reason = "MaintenanceAccepted"; }
  else if (index === 4) { nextMode = preMode; reason = "ConflictingRequestsRejected"; }
  else if (index === 5) { nextMode = "Off"; reason = "ReturnAccepted"; }
  else if (index === 6) { nextMode = preMode; reason = "ReturnNotApplicable"; }
  else if (index === 7) { nextMode = "On"; reason = "OnAccepted"; }
  else if (index === 8) { nextMode = "Starting"; reason = "StartAccepted"; }
  else if (index === 9) { nextMode = preMode; reason = "NoRequest"; }
  else { nextMode = preMode; reason = "TransitionRejected"; }
  return { caseId: id, nextMode, reason, guardHits: hits };
}

// Independent readable oracle for cross-checking the canonical guards/results.
function arbitrationOracle(life, cond, kind, preMode) {
  if (life === "InvalidLifecycle" || cond === "InvalidCondition" || kind !== compatibilityOwner(life, cond))
    return { caseId: "CASE-01", nextMode: "Degraded", reason: "InvalidEvidence" };
  if (life === "OffRequested") return { caseId: "CASE-02", nextMode: "Off", reason: "OffAccepted" };
  if (cond === "DegradedReported") return { caseId: "CASE-03", nextMode: "Degraded", reason: "DegradedAccepted" };
  if (cond === "MaintenanceRequested") return { caseId: "CASE-04", nextMode: "Maintenance", reason: "MaintenanceAccepted" };
  if (kind === "RecoveryConflict") return { caseId: "CASE-05", nextMode: preMode, reason: "ConflictingRequestsRejected" };
  if (cond === "ReturnRequested" && (preMode === "Maintenance" || preMode === "Degraded"))
    return { caseId: "CASE-06", nextMode: "Off", reason: "ReturnAccepted" };
  if (cond === "ReturnRequested") return { caseId: "CASE-07", nextMode: preMode, reason: "ReturnNotApplicable" };
  if (life === "OnRequested" && (preMode === "Starting" || preMode === "On"))
    return { caseId: "CASE-08", nextMode: "On", reason: "OnAccepted" };
  if (life === "StartRequested" && (preMode === "Off" || preMode === "Starting"))
    return { caseId: "CASE-09", nextMode: "Starting", reason: "StartAccepted" };
  if (life === "NoLifecycle" && cond === "NoCondition")
    return { caseId: "CASE-10", nextMode: preMode, reason: "NoRequest" };
  return { caseId: "CASE-11", nextMode: preMode, reason: "TransitionRejected" };
}

// PART-05: exact non-bijective OUT-01 result classification.
function frameOwner(decision) {
  let coordinationResult;
  if (decision.reason === "InvalidEvidence") coordinationResult = "EvidenceFault";
  else if (decision.reason === "NoRequest") coordinationResult = "Stable";
  else if (decision.reason === "ConflictingRequestsRejected" ||
           decision.reason === "ReturnNotApplicable" ||
           decision.reason === "TransitionRejected") coordinationResult = "Rejected";
  else coordinationResult = "Applied";
  return { modeDisposition: decision.nextMode, coordinationResult };
}

// Compose the named local owners only through the approved semantic map.
function composeOwners(preMode, lifecycleSample, conditionSample) {
  const lifeForCompatibility = lifecycleQualificationOwner(lifecycleSample); // INT-01 then INT-03
  const lifeForArbiter = lifecycleQualificationOwner(lifecycleSample);       // INT-01 then INT-05
  const condForCompatibility = conditionQualificationOwner(conditionSample); // INT-02 then INT-04
  const condForArbiter = conditionQualificationOwner(conditionSample);       // INT-02 then INT-06
  const kindForArbiter = compatibilityOwner(lifeForCompatibility, condForCompatibility); // INT-07
  const decisionForFrame = arbitrationOwner(lifeForArbiter, condForArbiter, kindForArbiter, preMode); // INT-08
  const frame = frameOwner(decisionForFrame); // INT-09 and INT-10
  return {
    lifecycleAssessment: lifeForArbiter,
    conditionAssessment: condForArbiter,
    coordinationClass: kindForArbiter,
    ...decisionForFrame,
    ...frame
  };
}

// Independent root-input oracle used for comparison only, never as production.
function rootOracle(preMode, lifecycleSample, conditionSample) {
  const life = lifecycleQualificationOwner(lifecycleSample);
  const cond = conditionQualificationOwner(conditionSample);
  const kind = compatibilityOwner(life, cond);
  const decision = arbitrationOracle(life, cond, kind, preMode);
  return { ...decision, ...frameOwner(decision) };
}

const ownershipAudit = [
  {
    usage: "lifecycle_indication_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["lifecycle_indication_qualification.lifecycle_sample"],
    owner_local_facts: ["eight-value lifecycle applicability classification"],
    contract_cases: ["QUAL_LIFE_DERIVATION"],
    analyzer_checks: ["lifecycle-owner-eight-values"]
  },
  {
    usage: "condition_indication_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["condition_indication_qualification.condition_sample"],
    owner_local_facts: ["eight-value condition applicability classification"],
    contract_cases: ["QUAL_COND_DERIVATION"],
    analyzer_checks: ["condition-owner-eight-values"]
  },
  {
    usage: "cross_channel_compatibility",
    claimed_roles: ["decision"],
    assigned_inputs: ["cross_channel_compatibility.lifecycle_assessment", "cross_channel_compatibility.condition_assessment"],
    owner_local_facts: ["seven-valued cross-channel compatibility classification"],
    contract_cases: ["COMPATIBILITY_DERIVATION"],
    analyzer_checks: ["compatibility-owner-twenty-five-pairs"]
  },
  {
    usage: "controller_mode_arbitration",
    claimed_roles: ["decision"],
    assigned_inputs: ["controller_mode_arbitration.lifecycle_assessment", "controller_mode_arbitration.condition_assessment", "controller_mode_arbitration.coordination_class", "state.controllerMode"],
    owner_local_facts: ["class-consistency defense", "strict transition priority", "applied next-mode decision"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11"],
    analyzer_checks: ["arbiter-owner-eight-hundred-seventy-five-tuples", "arbiter-canonical-guard-cross-check"]
  },
  {
    usage: "coordination_frame_derivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["coordination_frame_derivation.mode_decision"],
    owner_local_facts: ["eleven-reason to four-result classification"],
    contract_cases: ["FRAME_DERIVATION"],
    analyzer_checks: ["frame-owner-fifty-five-decisions"]
  }
];

const observations = {
  qualification_gaps: 0,
  compatibility_gaps: 0,
  effective_case_overlaps: 0,
  malformed_class_mismatches: 0,
  owner_local_mismatches: 0,
  next_state_mismatches: 0,
  required_output_mismatches: 0,
  invariant_violations: 0,
  scenario_mismatches: 0
};

const ownerLocalSpaceCounts = {
  lifecycle_qualification: 0,
  condition_qualification: 0,
  compatibility: 0,
  arbitration: 0,
  frame_derivation: 0
};

const qualificationFibers = { lifecycle: {}, condition: {} };
for (const sample of lifecycleSamples) {
  ownerLocalSpaceCounts.lifecycle_qualification++;
  const result = lifecycleQualificationOwner(sample);
  qualificationFibers.lifecycle[result] = (qualificationFibers.lifecycle[result] ?? 0) + 1;
  if (!lifecycleAssessments.includes(result)) observations.qualification_gaps++;
}
for (const sample of conditionSamples) {
  ownerLocalSpaceCounts.condition_qualification++;
  const result = conditionQualificationOwner(sample);
  qualificationFibers.condition[result] = (qualificationFibers.condition[result] ?? 0) + 1;
  if (!conditionAssessments.includes(result)) observations.qualification_gaps++;
}

const compatibilityFibers = Object.fromEntries(coordinationClasses.map(value => [value, 0]));
for (const life of lifecycleAssessments) for (const cond of conditionAssessments) {
  ownerLocalSpaceCounts.compatibility++;
  const kind = compatibilityOwner(life, cond);
  compatibilityFibers[kind]++;
  if (!coordinationClasses.includes(kind)) observations.compatibility_gaps++;
}

const localCaseCounts = Object.fromEntries(canonicalGuardManifest.map(record => [record.id, 0]));
let malformedClassTupleCount = 0;
let consistentClassTupleCount = 0;
for (const life of lifecycleAssessments) for (const cond of conditionAssessments)
for (const kind of coordinationClasses) for (const mode of modes) {
  ownerLocalSpaceCounts.arbitration++;
  const actual = arbitrationOwner(life, cond, kind, mode);
  const expected = arbitrationOracle(life, cond, kind, mode);
  localCaseCounts[actual.caseId]++;
  if (actual.guardHits !== 1) observations.effective_case_overlaps++;
  if (actual.caseId !== expected.caseId || actual.nextMode !== expected.nextMode || actual.reason !== expected.reason)
    observations.owner_local_mismatches++;
  if (kind === compatibilityOwner(life, cond)) consistentClassTupleCount++;
  else {
    malformedClassTupleCount++;
    if (actual.caseId !== "CASE-01" || actual.nextMode !== "Degraded" || actual.reason !== "InvalidEvidence")
      observations.malformed_class_mismatches++;
  }
  if (actual.nextMode !== actual.nextMode || !modes.includes(actual.nextMode)) observations.invariant_violations++;
}

const resultFibers = { Applied: 0, Stable: 0, Rejected: 0, EvidenceFault: 0 };
for (const nextMode of modes) for (const reason of reasons) {
  ownerLocalSpaceCounts.frame_derivation++;
  const frame = frameOwner({ nextMode, reason });
  resultFibers[frame.coordinationResult]++;
  if (frame.modeDisposition !== nextMode) observations.owner_local_mismatches++;
}

const composedCaseCounts = Object.fromEntries(canonicalGuardManifest.map(record => [record.id, 0]));
let composedSnapshotCount = 0;
for (const lifecycleSample of lifecycleSamples) for (const conditionSample of conditionSamples) for (const preMode of modes) {
  composedSnapshotCount++;
  const actual = composeOwners(preMode, lifecycleSample, conditionSample);
  const expected = rootOracle(preMode, lifecycleSample, conditionSample);
  composedCaseCounts[actual.caseId]++;
  if (actual.guardHits !== 1) observations.effective_case_overlaps++;
  if (actual.nextMode !== expected.nextMode) observations.next_state_mismatches++;
  if (actual.caseId !== expected.caseId || actual.reason !== expected.reason ||
      actual.modeDisposition !== expected.modeDisposition || actual.coordinationResult !== expected.coordinationResult)
    observations.required_output_mismatches++;
  if (actual.modeDisposition !== actual.nextMode) observations.invariant_violations++;
}

function validLifecycle(event) { return { event, status: "Valid" }; }
function invalidLifecycle(event) { return { event, status: "Invalid" }; }
function validCondition(event) { return { event, status: "Valid" }; }
function invalidCondition(event) { return { event, status: "Invalid" }; }
const noLife = validLifecycle("NoLifecycleEvent");
const noCond = validCondition("NoConditionEvent");

function expected(caseId, nextMode, reason, coordinationResult) {
  return { caseId, nextMode, reason, modeDisposition: nextMode, coordinationResult };
}

function executeScenario(scenarioId, initialMode, steps) {
  let mode = initialMode;
  let passed = true;
  const trace = [];
  for (const step of steps) {
    const observed = composeOwners(mode, step.lifecycle, step.condition);
    const observedFrame = {
      caseId: observed.caseId,
      nextMode: observed.nextMode,
      reason: observed.reason,
      modeDisposition: observed.modeDisposition,
      coordinationResult: observed.coordinationResult
    };
    const stepPassed = JSON.stringify(observedFrame) === JSON.stringify(step.expected);
    if (!stepPassed) {
      passed = false;
      observations.scenario_mismatches++;
    }
    trace.push({
      pre_mode: mode,
      input: { lifecycle_sample: step.lifecycle, condition_sample: step.condition },
      expected_named_branch: step.expected.caseId,
      expected: step.expected,
      observed: observedFrame,
      passed: stepPassed
    });
    mode = observed.nextMode;
  }
  return { scenario_id: scenarioId, passed, initial_mode: initialMode, final_mode: mode, trace };
}

const scenarioTraces = [
  executeScenario("SCN-01", "Off", [
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-09", "Starting", "StartAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Starting", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("On"), condition: noCond, expected: expected("CASE-08", "On", "OnAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "On", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Off"), condition: noCond, expected: expected("CASE-02", "Off", "OffAccepted", "Applied") }
  ]),
  executeScenario("SCN-02", "Off", [
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("On"), condition: noCond, expected: expected("CASE-11", "Off", "TransitionRejected", "Rejected") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-09", "Starting", "StartAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Starting", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-09", "Starting", "StartAccepted", "Applied") },
    { lifecycle: validLifecycle("On"), condition: noCond, expected: expected("CASE-08", "On", "OnAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "On", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("On"), condition: noCond, expected: expected("CASE-08", "On", "OnAccepted", "Applied") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-11", "On", "TransitionRejected", "Rejected") },
    { lifecycle: noLife, condition: validCondition("Maintenance"), expected: expected("CASE-04", "Maintenance", "MaintenanceAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Maintenance", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-11", "Maintenance", "TransitionRejected", "Rejected") },
    { lifecycle: noLife, condition: validCondition("Degraded"), expected: expected("CASE-03", "Degraded", "DegradedAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-11", "Degraded", "TransitionRejected", "Rejected") }
  ]),
  executeScenario("SCN-03", "On", [
    { lifecycle: noLife, condition: validCondition("Maintenance"), expected: expected("CASE-04", "Maintenance", "MaintenanceAccepted", "Applied") },
    { lifecycle: validLifecycle("On"), condition: noCond, expected: expected("CASE-11", "Maintenance", "TransitionRejected", "Rejected") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Maintenance", "NoRequest", "Stable") },
    { lifecycle: noLife, condition: validCondition("ReturnToNormal"), expected: expected("CASE-06", "Off", "ReturnAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: noCond, expected: expected("CASE-09", "Starting", "StartAccepted", "Applied") }
  ]),
  executeScenario("SCN-04", "On", [
    { lifecycle: noLife, condition: validCondition("Degraded"), expected: expected("CASE-03", "Degraded", "DegradedAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: invalidLifecycle("Start"), condition: noCond, expected: expected("CASE-01", "Degraded", "InvalidEvidence", "EvidenceFault") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: noLife, condition: invalidCondition("Maintenance"), expected: expected("CASE-01", "Degraded", "InvalidEvidence", "EvidenceFault") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: noLife, condition: validCondition("ReturnToNormal"), expected: expected("CASE-06", "Off", "ReturnAccepted", "Applied") }
  ]),
  executeScenario("SCN-05", "On", [
    { lifecycle: validLifecycle("Off"), condition: invalidCondition("Maintenance"), expected: expected("CASE-01", "Degraded", "InvalidEvidence", "EvidenceFault") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Off"), condition: validCondition("Maintenance"), expected: expected("CASE-02", "Off", "OffAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Off"), condition: validCondition("Degraded"), expected: expected("CASE-02", "Off", "OffAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Off"), condition: validCondition("ReturnToNormal"), expected: expected("CASE-02", "Off", "OffAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: validCondition("Degraded"), expected: expected("CASE-03", "Degraded", "DegradedAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Degraded", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("On"), condition: validCondition("Maintenance"), expected: expected("CASE-04", "Maintenance", "MaintenanceAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Maintenance", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("Start"), condition: validCondition("ReturnToNormal"), expected: expected("CASE-05", "Maintenance", "ConflictingRequestsRejected", "Rejected") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Maintenance", "NoRequest", "Stable") },
    { lifecycle: validLifecycle("On"), condition: validCondition("ReturnToNormal"), expected: expected("CASE-05", "Maintenance", "ConflictingRequestsRejected", "Rejected") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Maintenance", "NoRequest", "Stable") },
    { lifecycle: noLife, condition: validCondition("ReturnToNormal"), expected: expected("CASE-06", "Off", "ReturnAccepted", "Applied") },
    { lifecycle: noLife, condition: noCond, expected: expected("CASE-10", "Off", "NoRequest", "Stable") }
  ])
];

const ownershipChecks = {
  lifecycle_indication_qualification:
    ownerLocalSpaceCounts.lifecycle_qualification === 8 &&
    JSON.stringify(qualificationFibers.lifecycle) === JSON.stringify({ NoLifecycle: 1, InvalidLifecycle: 4, StartRequested: 1, OnRequested: 1, OffRequested: 1 }),
  condition_indication_qualification:
    ownerLocalSpaceCounts.condition_qualification === 8 &&
    JSON.stringify(qualificationFibers.condition) === JSON.stringify({ NoCondition: 1, InvalidCondition: 4, MaintenanceRequested: 1, DegradedReported: 1, ReturnRequested: 1 }),
  cross_channel_compatibility:
    ownerLocalSpaceCounts.compatibility === 25 &&
    JSON.stringify(compatibilityFibers) === JSON.stringify({ InvalidEvidence: 9, Quiet: 1, LifecycleOnly: 3, ConditionOnly: 3, OffDominantConflict: 3, ConditionDominantConflict: 4, RecoveryConflict: 2 }),
  controller_mode_arbitration:
    ownerLocalSpaceCounts.arbitration === 875 && malformedClassTupleCount === 750 && consistentClassTupleCount === 125 &&
    canonicalGuardManifest.map(record => record.id).every(id => localCaseCounts[id] > 0) &&
    observations.effective_case_overlaps === 0 && observations.owner_local_mismatches === 0,
  coordination_frame_derivation:
    ownerLocalSpaceCounts.frame_derivation === 55 &&
    JSON.stringify(resultFibers) === JSON.stringify({ Applied: 30, Stable: 5, Rejected: 15, EvidenceFault: 5 })
};

const ownershipAuditResult = ownershipAudit.map(record => ({
  ...record,
  passed: ownershipChecks[record.usage] === true
}));

const checks = {
  exact_owner_local_spaces:
    JSON.stringify(ownerLocalSpaceCounts) === JSON.stringify({ lifecycle_qualification: 8, condition_qualification: 8, compatibility: 25, arbitration: 875, frame_derivation: 55 }),
  exact_root_input_domain: lifecycleSamples.length * conditionSamples.length === 64,
  exact_composed_snapshot_count: composedSnapshotCount === 320,
  exact_semantic_connection_map: Object.keys(semanticConnectionMap).length === 10,
  canonical_guard_manifest_complete: canonicalGuardManifest.length === 11 && canonicalGuardManifest.every((record, index) => record.id === `CASE-${String(index + 1).padStart(2, "0")}`),
  canonical_guards_total_and_exclusive: observations.effective_case_overlaps === 0,
  all_eleven_cases_witnessed: Object.values(localCaseCounts).every(count => count > 0) && Object.values(composedCaseCounts).every(count => count > 0),
  malformed_classes_fail_closed: malformedClassTupleCount === 750 && observations.malformed_class_mismatches === 0,
  required_outputs_match_oracle: observations.required_output_mismatches === 0 && observations.next_state_mismatches === 0,
  initialization_safe: frameOwner({ nextMode: "Off", reason: "NoRequest" }).modeDisposition === "Off" && frameOwner({ nextMode: "Off", reason: "NoRequest" }).coordinationResult === "Stable",
  applied_decision_coherent: observations.invariant_violations === 0,
  all_five_scenario_traces_passed: scenarioTraces.length === 5 && scenarioTraces.every(scenario => scenario.passed),
  owner_local_cases_executed: ownershipAuditResult.every(record => record.passed)
};

const passed = Object.values(observations).every(value => value === 0) && Object.values(checks).every(Boolean);

const report = {
  schema_version: 1,
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive finite-domain consistency for the retained SysML/GUMBO relations over 8 lifecycle samples, 8 condition samples, and 5 pre-modes, plus all owner-local spaces; not execution, solver certification, compositional proof, generated-code correctness, physical performance, safety, or certification evidence.",
  domain: {
    lifecycle_samples: lifecycleSamples.length,
    condition_samples: conditionSamples.length,
    pre_modes: modes.length,
    root_input_combinations: lifecycleSamples.length * conditionSamples.length,
    composed_snapshots: composedSnapshotCount,
    owner_local_spaces: ownerLocalSpaceCounts,
    malformed_class_tuples: malformedClassTupleCount,
    consistent_class_tuples: consistentClassTupleCount
  },
  semantic_connection_map: semanticConnectionMap,
  canonical_guard_manifest: canonicalGuardManifest,
  partition_counts: {
    owner_local_875: localCaseCounts,
    composed_root_320: composedCaseCounts
  },
  owner_fibers: {
    lifecycle_qualification: qualificationFibers.lifecycle,
    condition_qualification: qualificationFibers.condition,
    compatibility: compatibilityFibers,
    frame_result: resultFibers
  },
  observations,
  invariant_checks: {
    "INIT-01": checks.initialization_safe,
    "SEM-01": checks.applied_decision_coherent,
    "CONSIST-01": checks.malformed_classes_fail_closed,
    "OUT-01": checks.required_outputs_match_oracle
  },
  checks,
  ownership_audit: ownershipAuditResult,
  scenario_traces: scenarioTraces
};

process.stdout.write(`${JSON.stringify(report)}\n`);
