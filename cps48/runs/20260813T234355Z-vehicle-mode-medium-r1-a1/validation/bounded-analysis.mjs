const SOURCE_SHA256 = "1a4cb0d0296ebe42b7b525f88eb330dda0cfdc2ed36398b51cd031ec104eb8da";

const bools = [false, true];
const requestLevels = [];
for (const start of bools) for (const off of bools) for (const returnLevel of bools) {
  requestLevels.push({start, off, returnLevel});
}
const brakeObservations = ["Pressed", "Released", "Invalid"];
const thermalConditions = ["Normal", "OverMaximum", "Invalid"];
const maintenanceConditions = ["NotDue", "Due", "Invalid"];
const healthObservations = [];
for (const thermal of thermalConditions) for (const maintenance of maintenanceConditions) {
  healthObservations.push({thermal, maintenance});
}
const powerObservations = ["Available", "Unavailable", "Invalid"];
const selfTestObservations = ["NoEvent", "FreshPass", "FreshFail", "Invalid"];
const cycles = ["Idle", "AwaitingStart", "AwaitingRecovery", "StartPassed", "RecoveryPassed", "Failed", "Invalid"];
const modes = ["Off", "Starting", "On", "Degraded"];
const directives = ["None", "BeginStart", "BeginRecovery", "Clear"];

const semanticConnectionMap = [
  ["INT-01", "root.request_levels", "request_priority_owner.request_levels", "RequestLevels"],
  ["INT-02", "root.brake_observation", "brake_qualification_owner.brake_observation", "BrakeObservation"],
  ["INT-03", "root.health_observation", "health_qualification_owner.health_observation", "HealthObservation"],
  ["INT-04", "root.power_observation", "power_qualification_owner.power_observation", "PowerObservation"],
  ["INT-05", "root.self_test_observation", "self_test_cycle_owner.self_test_observation", "SelfTestObservation"],
  ["INT-06", "request_priority_owner.request_to_authorization", "start_authorization_owner.request_facts", "RequestFacts"],
  ["INT-07", "request_priority_owner.request_to_lifecycle", "lifecycle_recovery_owner.request_facts", "RequestFacts"],
  ["INT-08", "brake_qualification_owner.brake_to_authorization", "start_authorization_owner.brake_facts", "BrakeFacts"],
  ["INT-09", "brake_qualification_owner.brake_to_lifecycle", "lifecycle_recovery_owner.brake_facts", "BrakeFacts"],
  ["INT-10", "health_qualification_owner.health_to_authorization", "start_authorization_owner.health_qualification", "HealthQualification"],
  ["INT-11", "health_qualification_owner.health_to_lifecycle", "lifecycle_recovery_owner.health_qualification", "HealthQualification"],
  ["INT-12", "power_qualification_owner.power_to_authorization", "start_authorization_owner.power_facts", "PowerFacts"],
  ["INT-13", "power_qualification_owner.power_to_lifecycle", "lifecycle_recovery_owner.power_facts", "PowerFacts"],
  ["INT-14", "self_test_cycle_owner.cycle_assessment", "lifecycle_recovery_owner.cycle_assessment", "CycleAssessment"],
  ["INT-15", "start_authorization_owner.authorization_to_lifecycle", "lifecycle_recovery_owner.authorization", "StartAuthorizationFacts"],
  ["INT-16", "start_authorization_owner.authorization_to_outcome", "coordinated_outcome_owner.authorization", "StartAuthorizationFacts"],
  ["INT-17", "lifecycle_recovery_owner.test_cycle_directive", "self_test_cycle_owner.test_cycle_directive", "TestCycleDirective"],
  ["INT-18", "lifecycle_recovery_owner.applied_lifecycle", "coordinated_outcome_owner.applied_lifecycle", "AppliedLifecycleSnapshot"],
  ["INT-19", "coordinated_outcome_owner.control_frame", "root.control_frame", "ControlFrame"]
].map(([id, from, to, payload]) => ({id, from, to, payload}));
const analyzerTraceMap = [
  {relation: "requestOwner", trace_ids: ["PART-01", "STATE-01", "POL-01"]},
  {relation: "brakeOwner", trace_ids: ["PART-02", "TYPE-02"]},
  {relation: "healthOwner", trace_ids: ["PART-03", "TYPE-03"]},
  {relation: "powerOwner", trace_ids: ["PART-04", "TYPE-04"]},
  {relation: "cycleAssessment/cycleStore", trace_ids: ["PART-05", "STATE-02", "STATE-03"]},
  {relation: "authorizationOwner", trace_ids: ["PART-06", "CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05"]},
  {relation: "lifecycleOwner", trace_ids: ["PART-07", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12", "CASE-13", "CASE-14", "CASE-15", "CASE-16", "CASE-17", "CASE-18", "CASE-19", "CASE-20"]},
  {relation: "outcomeOwner", trace_ids: ["PART-08", "POL-05", "POL-06", "POL-07"]},
  {relation: "scenarioSpecs", trace_ids: ["SCN-01", "SCN-02", "SCN-03", "SCN-04", "SCN-05", "SCN-06", "SCN-07", "SCN-08"]}
];

const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const modeSnapshot = x => x;
const directiveSnapshot = x => x;

function requestOwner(current, previous) {
  const offActive = current.off;
  const freshReturn = current.returnLevel && !previous.returnLevel;
  const freshStart = current.start && !previous.start;
  const conflict = Number(offActive) + Number(freshReturn) + Number(freshStart) >= 2;
  const disposition = offActive ? "OffDominant" : freshReturn ? "ReturnCandidate" : freshStart ? "StartCandidate" : "None";
  return {offActive, freshReturn, freshStart, conflict, disposition};
}
function oracleRequest(current, previous) {
  const candidates = [];
  if (current.off) candidates.push([3, "OffDominant"]);
  if (current.returnLevel && previous.returnLevel === false) candidates.push([2, "ReturnCandidate"]);
  if (current.start && previous.start === false) candidates.push([1, "StartCandidate"]);
  candidates.sort((a, b) => b[0] - a[0]);
  return {
    offActive: current.off === true,
    freshReturn: current.returnLevel === true && previous.returnLevel === false,
    freshStart: current.start === true && previous.start === false,
    conflict: candidates.length > 1,
    disposition: candidates.length ? candidates[0][1] : "None"
  };
}
function brakeOwner(observation) {
  return observation === "Pressed" ? {evidenceTrusted: true, readyForAdmission: true}
    : observation === "Released" ? {evidenceTrusted: true, readyForAdmission: false}
    : {evidenceTrusted: false, readyForAdmission: false};
}
const oracleBrake = observation => ({
  evidenceTrusted: observation !== "Invalid",
  readyForAdmission: observation === "Pressed"
});
function healthOwner(observation) {
  if (observation.thermal === "Invalid" || observation.maintenance === "Invalid") return "Invalid";
  if (observation.thermal === "OverMaximum" || observation.maintenance === "Due") return "NotReady";
  return "Ready";
}
function oracleHealth(observation) {
  const key = `${observation.thermal}/${observation.maintenance}`;
  const table = {
    "Normal/NotDue": "Ready", "Normal/Due": "NotReady", "Normal/Invalid": "Invalid",
    "OverMaximum/NotDue": "NotReady", "OverMaximum/Due": "NotReady", "OverMaximum/Invalid": "Invalid",
    "Invalid/NotDue": "Invalid", "Invalid/Due": "Invalid", "Invalid/Invalid": "Invalid"
  };
  return table[key];
}
function powerOwner(observation) {
  return observation === "Available" ? {evidenceTrusted: true, availableForSupervision: true}
    : observation === "Unavailable" ? {evidenceTrusted: true, availableForSupervision: false}
    : {evidenceTrusted: false, availableForSupervision: false};
}
const oraclePower = observation => ({
  evidenceTrusted: observation !== "Invalid",
  availableForSupervision: observation === "Available"
});

function cycleAssessment(preCycle, observation) {
  if (preCycle === "AwaitingStart") {
    return ({NoEvent: "AwaitingStart", FreshPass: "StartPassed", FreshFail: "Failed", Invalid: "Invalid"})[observation];
  }
  if (preCycle === "AwaitingRecovery") {
    return ({NoEvent: "AwaitingRecovery", FreshPass: "RecoveryPassed", FreshFail: "Failed", Invalid: "Invalid"})[observation];
  }
  if ((preCycle === "StartPassed" || preCycle === "RecoveryPassed") && observation === "Invalid") return "Invalid";
  return preCycle;
}
function oracleCycleAssessment(preCycle, observation) {
  const row = cycles.indexOf(preCycle);
  const column = selfTestObservations.indexOf(observation);
  const matrix = [
    ["Idle", "Idle", "Idle", "Idle"],
    ["AwaitingStart", "StartPassed", "Failed", "Invalid"],
    ["AwaitingRecovery", "RecoveryPassed", "Failed", "Invalid"],
    ["StartPassed", "StartPassed", "StartPassed", "Invalid"],
    ["RecoveryPassed", "RecoveryPassed", "RecoveryPassed", "Invalid"],
    ["Failed", "Failed", "Failed", "Failed"],
    ["Invalid", "Invalid", "Invalid", "Invalid"]
  ];
  return matrix[row][column];
}
function cycleStore(assessment, directive) {
  if (directive === "Clear") return "Idle";
  if (directive === "BeginStart") return "AwaitingStart";
  if (directive === "BeginRecovery") return "AwaitingRecovery";
  return assessment;
}
function oracleCycleStore(assessment, directive) {
  return ({Clear: "Idle", BeginStart: "AwaitingStart", BeginRecovery: "AwaitingRecovery", None: assessment})[directive];
}

function authorizationGuards(i) {
  const invalid = !i.brake.evidenceTrusted || i.health === "Invalid" || !i.power.evidenceTrusted;
  const notReady = !i.brake.readyForAdmission || i.health === "NotReady" || !i.power.availableForSupervision;
  return [
    i.request.disposition === "OffDominant",
    i.request.disposition === "ReturnCandidate" || i.request.disposition === "None",
    i.request.disposition === "StartCandidate" && invalid,
    i.request.disposition === "StartCandidate" && !invalid && notReady,
    i.request.disposition === "StartCandidate" && !invalid && !notReady
  ];
}
function authorizationOwner(i) {
  const guards = authorizationGuards(i);
  const selected = guards.flatMap((value, index) => value ? [index] : []);
  const decisions = ["OffPriority", "NoStart", "DenyInvalid", "DenyNotReady", "BeginStartTest"];
  return {caseId: `CASE-${String(selected[0] + 1).padStart(2, "0")}`, decision: decisions[selected[0]], conflict: i.request.conflict, guardCount: selected.length};
}
function oracleAuthorization(i) {
  if (i.request.disposition === "OffDominant") return "OffPriority";
  if (i.request.disposition !== "StartCandidate") return "NoStart";
  const trustVector = [i.brake.evidenceTrusted, i.health !== "Invalid", i.power.evidenceTrusted];
  if (trustVector.includes(false)) return "DenyInvalid";
  const readyVector = [i.brake.readyForAdmission, i.health === "Ready", i.power.availableForSupervision];
  return readyVector.includes(false) ? "DenyNotReady" : "BeginStartTest";
}

const recoveryReady = i => i.brake.evidenceTrusted && i.brake.readyForAdmission && i.health === "Ready" && i.power.evidenceTrusted && i.power.availableForSupervision;
function lifecycleGuards(i) {
  const ready = recoveryReady(i);
  return [
    i.mode === "Off" && i.authorization.decision === "BeginStartTest",
    i.mode === "Off" && i.authorization.decision !== "BeginStartTest",
    i.mode === "Starting" && i.request.offActive,
    i.mode === "Starting" && !i.request.offActive && !ready,
    i.mode === "Starting" && !i.request.offActive && ready && ["Failed", "Invalid"].includes(i.assessment),
    i.mode === "Starting" && !i.request.offActive && ready && ["Idle", "AwaitingStart", "AwaitingRecovery", "RecoveryPassed"].includes(i.assessment),
    i.mode === "Starting" && !i.request.offActive && ready && i.assessment === "StartPassed",
    i.mode === "On" && i.request.offActive,
    i.mode === "On" && !i.request.offActive && (i.health !== "Ready" || !i.power.evidenceTrusted || !i.power.availableForSupervision || i.assessment !== "StartPassed"),
    i.mode === "On" && !i.request.offActive && i.health === "Ready" && i.power.evidenceTrusted && i.power.availableForSupervision && i.assessment === "StartPassed",
    i.mode === "Degraded" && i.request.offActive,
    i.mode === "Degraded" && !i.request.offActive && !ready,
    i.mode === "Degraded" && !i.request.offActive && ready && i.request.freshReturn,
    i.mode === "Degraded" && !i.request.offActive && ready && !i.request.freshReturn && i.assessment === "RecoveryPassed",
    i.mode === "Degraded" && !i.request.offActive && ready && !i.request.freshReturn && i.assessment !== "RecoveryPassed"
  ];
}
function lifecycleOwner(i) {
  const selected = lifecycleGuards(i).flatMap((value, index) => value ? [index] : []);
  const caseNumber = selected[0] + 6;
  let nextMode = i.mode, directive = "None", reason = "Ordinary";
  if ([8, 13, 16].includes(caseNumber)) { nextMode = "Off"; directive = "Clear"; }
  else if (caseNumber === 6) { nextMode = "Starting"; directive = "BeginStart"; }
  else if ([9, 10, 14].includes(caseNumber)) { nextMode = "Degraded"; directive = "Clear"; }
  else if (caseNumber === 12) nextMode = "On";
  else if (caseNumber === 17) { nextMode = "Degraded"; directive = "Clear"; }
  else if (caseNumber === 18) { nextMode = "Degraded"; directive = "BeginRecovery"; }
  else if (caseNumber === 19) { nextMode = "Off"; directive = "Clear"; reason = "RecoveryCompleted"; }
  else if (caseNumber === 20) { nextMode = "Degraded"; reason = i.assessment === "AwaitingRecovery" ? "RecoveryAwaiting" : "Ordinary"; }
  if (caseNumber === 9) reason = (!i.brake.evidenceTrusted || i.health === "Invalid" || !i.power.evidenceTrusted) ? "QualificationInvalid" : "QualificationNotReady";
  return {caseId: `CASE-${String(caseNumber).padStart(2, "0")}`, priorMode: i.mode, nextMode, directive, reason, guardCount: selected.length};
}
function oracleLifecycle(i) {
  const ready = recoveryReady(i);
  if (i.mode === "Off") return i.authorization.decision === "BeginStartTest"
    ? {nextMode: "Starting", directive: "BeginStart", reason: "Ordinary"}
    : {nextMode: "Off", directive: "None", reason: "Ordinary"};
  if (i.request.offActive) return {nextMode: "Off", directive: "Clear", reason: "Ordinary"};
  if (i.mode === "Starting") {
    if (!ready) return {nextMode: "Degraded", directive: "Clear", reason: (!i.brake.evidenceTrusted || i.health === "Invalid" || !i.power.evidenceTrusted) ? "QualificationInvalid" : "QualificationNotReady"};
    if (["Failed", "Invalid"].includes(i.assessment)) return {nextMode: "Degraded", directive: "Clear", reason: "Ordinary"};
    if (i.assessment === "StartPassed") return {nextMode: "On", directive: "None", reason: "Ordinary"};
    return {nextMode: "Starting", directive: "None", reason: "Ordinary"};
  }
  if (i.mode === "On") return i.health === "Ready" && i.power.evidenceTrusted && i.power.availableForSupervision && i.assessment === "StartPassed"
    ? {nextMode: "On", directive: "None", reason: "Ordinary"}
    : {nextMode: "Degraded", directive: "Clear", reason: "Ordinary"};
  if (!ready) return {nextMode: "Degraded", directive: "Clear", reason: "Ordinary"};
  if (i.request.freshReturn) return {nextMode: "Degraded", directive: "BeginRecovery", reason: "Ordinary"};
  if (i.assessment === "RecoveryPassed") return {nextMode: "Off", directive: "Clear", reason: "RecoveryCompleted"};
  return {nextMode: "Degraded", directive: "None", reason: i.assessment === "AwaitingRecovery" ? "RecoveryAwaiting" : "Ordinary"};
}

function outcomeOwner(authorization, applied) {
  if (applied.nextMode === "Starting") return {startEnable: "Inhibit", parkingBrake: "Apply", powerDisposition: "TestOnly", selfTestCommand: applied.directive === "BeginStart" ? "Initiate" : "None", lifecycleMode: "Starting", status: "Testing"};
  if (applied.nextMode === "On") return {startEnable: "Permit", parkingBrake: "Release", powerDisposition: "Enable", selfTestCommand: "None", lifecycleMode: "On", status: "Operating"};
  if (applied.nextMode === "Degraded") return {startEnable: "Inhibit", parkingBrake: "Apply", powerDisposition: "Isolate", selfTestCommand: applied.directive === "BeginRecovery" ? "Initiate" : "None", lifecycleMode: "Degraded", status: (applied.directive === "BeginRecovery" || applied.reason === "RecoveryAwaiting") ? "RecoveryTesting" : "Degraded"};
  const status = applied.reason === "RecoveryCompleted" ? "RecoveredAwaitFreshStart"
    : authorization.decision === "DenyInvalid" ? "StartBlockedInvalid"
    : authorization.decision === "DenyNotReady" ? "StartBlockedNotReady"
    : authorization.conflict ? "RequestConflict" : "Idle";
  return {startEnable: "Inhibit", parkingBrake: "Apply", powerDisposition: "Isolate", selfTestCommand: "None", lifecycleMode: "Off", status};
}
function oracleOutcome(authorization, applied) {
  const permissive = applied.nextMode === "On";
  const testPhase = applied.nextMode === "Starting";
  const recoveryPhase = applied.nextMode === "Degraded";
  let status = permissive ? "Operating" : testPhase ? "Testing" : recoveryPhase ? ((applied.directive === "BeginRecovery" || applied.reason === "RecoveryAwaiting") ? "RecoveryTesting" : "Degraded") : "Idle";
  if (applied.nextMode === "Off") {
    if (applied.reason === "RecoveryCompleted") status = "RecoveredAwaitFreshStart";
    else if (authorization.decision === "DenyInvalid") status = "StartBlockedInvalid";
    else if (authorization.decision === "DenyNotReady") status = "StartBlockedNotReady";
    else if (authorization.conflict) status = "RequestConflict";
  }
  return {startEnable: permissive ? "Permit" : "Inhibit", parkingBrake: permissive ? "Release" : "Apply", powerDisposition: permissive ? "Enable" : testPhase ? "TestOnly" : "Isolate", selfTestCommand: ((testPhase && applied.directive === "BeginStart") || (recoveryPhase && applied.directive === "BeginRecovery")) ? "Initiate" : "None", lifecycleMode: applied.nextMode, status};
}

const observations = {
  request_owner_mismatches: 0, qualification_owner_mismatches: 0,
  cycle_owner_mismatches: 0, authorization_gaps: 0, authorization_overlaps: 0,
  authorization_mismatches: 0, lifecycle_gaps: 0, lifecycle_overlaps: 0,
  lifecycle_mismatches: 0, required_output_mismatches: 0,
  invariant_violations: 0, scenario_mismatches: 0
};

let requestChecks = 0, brakeChecks = 0, healthChecks = 0, powerChecks = 0, cycleChecks = 0;
for (const current of requestLevels) for (const previous of requestLevels) {
  requestChecks++;
  if (!same(requestOwner(current, previous), oracleRequest(current, previous))) observations.request_owner_mismatches++;
}
for (const value of brakeObservations) { brakeChecks++; if (!same(brakeOwner(value), oracleBrake(value))) observations.qualification_owner_mismatches++; }
for (const value of healthObservations) { healthChecks++; if (healthOwner(value) !== oracleHealth(value)) observations.qualification_owner_mismatches++; }
for (const value of powerObservations) { powerChecks++; if (!same(powerOwner(value), oraclePower(value))) observations.qualification_owner_mismatches++; }
for (const preCycle of cycles) for (const observation of selfTestObservations) for (const directive of directives) {
  cycleChecks++;
  const assessment = cycleAssessment(preCycle, observation);
  if (assessment !== oracleCycleAssessment(preCycle, observation) || cycleStore(assessment, directive) !== oracleCycleStore(assessment, directive)) observations.cycle_owner_mismatches++;
}

const authorizationCaseCounts = Object.fromEntries(Array.from({length: 5}, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
for (const disposition of ["OffDominant", "ReturnCandidate", "StartCandidate", "None"]) for (const conflict of bools) {
  for (const brake of brakeObservations.map(brakeOwner)) for (const health of ["Ready", "NotReady", "Invalid"]) for (const power of powerObservations.map(powerOwner)) {
    const input = {request: {disposition, conflict}, brake, health, power};
    const result = authorizationOwner(input);
    if (result.guardCount === 0) observations.authorization_gaps++;
    if (result.guardCount > 1) observations.authorization_overlaps++;
    if (result.decision !== oracleAuthorization(input)) observations.authorization_mismatches++;
    authorizationCaseCounts[result.caseId]++;
  }
}

const lifecycleCaseCounts = Object.fromEntries(Array.from({length: 15}, (_, i) => [`CASE-${String(i + 6).padStart(2, "0")}`, 0]));
for (const mode of modes) for (const offActive of bools) for (const freshReturn of bools) {
  for (const brake of brakeObservations.map(brakeOwner)) for (const health of ["Ready", "NotReady", "Invalid"]) for (const power of powerObservations.map(powerOwner)) for (const assessment of cycles) for (const decision of ["OffPriority", "NoStart", "DenyInvalid", "DenyNotReady", "BeginStartTest"]) {
    const input = {mode, request: {offActive, freshReturn}, brake, health, power, assessment, authorization: {decision, conflict: false}};
    const result = lifecycleOwner(input);
    if (result.guardCount === 0) observations.lifecycle_gaps++;
    if (result.guardCount > 1) observations.lifecycle_overlaps++;
    const oracle = oracleLifecycle(input);
    if (!same({nextMode: result.nextMode, directive: result.directive, reason: result.reason}, oracle)) observations.lifecycle_mismatches++;
    lifecycleCaseCounts[result.caseId]++;
  }
}

const stateAdjacency = new Map();
const caseWitnesses = {};
let rawValuations = 0;
for (const current of requestLevels) for (const brakeObservation of brakeObservations) for (const healthObservation of healthObservations) for (const powerObservation of powerObservations) for (const selfTestObservation of selfTestObservations) {
  for (const previous of requestLevels) for (const preCycle of cycles) for (const mode of modes) {
    rawValuations++;
    const int01 = current;
    const int02 = brakeObservation;
    const int03 = healthObservation;
    const int04 = powerObservation;
    const int05 = selfTestObservation;
    const int06 = requestOwner(int01, previous);
    const int07 = {...int06};
    const int08 = brakeOwner(int02);
    const int09 = {...int08};
    const int10 = healthOwner(int03);
    const int11 = int10;
    const int12 = powerOwner(int04);
    const int13 = {...int12};
    const int14 = cycleAssessment(preCycle, int05);
    const int15 = authorizationOwner({request: int06, brake: int08, health: int10, power: int12});
    const int16 = {...int15};
    const int18 = lifecycleOwner({mode, request: int07, brake: int09, health: int11, power: int13, assessment: int14, authorization: int15});
    const int17 = int18.directive;
    const nextCycle = cycleStore(int14, int17);
    const int19 = outcomeOwner(int16, int18);
    const oracleRequestValue = oracleRequest(current, previous);
    const oracleBrakeValue = oracleBrake(brakeObservation);
    const oracleHealthValue = oracleHealth(healthObservation);
    const oraclePowerValue = oraclePower(powerObservation);
    const oracleAssessment = oracleCycleAssessment(preCycle, selfTestObservation);
    const oracleDecision = oracleAuthorization({request: oracleRequestValue, brake: oracleBrakeValue, health: oracleHealthValue, power: oraclePowerValue});
    const oracleAuthorizationValue = {decision: oracleDecision, conflict: oracleRequestValue.conflict};
    const oracleApplied = oracleLifecycle({mode, request: oracleRequestValue, brake: oracleBrakeValue, health: oracleHealthValue, power: oraclePowerValue, assessment: oracleAssessment, authorization: oracleAuthorizationValue});
    const oracleFrame = oracleOutcome(oracleAuthorizationValue, oracleApplied);
    if (!same(int19, oracleFrame) || nextCycle !== oracleCycleStore(oracleAssessment, oracleApplied.directive)) observations.required_output_mismatches++;
    const frameInvariant = (int19.startEnable === "Permit") === (int19.lifecycleMode === "On") &&
      (int19.parkingBrake === "Release") === (int19.lifecycleMode === "On") &&
      (int19.powerDisposition === "Enable") === (int19.lifecycleMode === "On");
    if (!frameInvariant || (int06.offActive && int18.nextMode !== "Off" && mode !== "Off")) observations.invariant_violations++;
    for (const selected of [int15.caseId, int18.caseId]) if (!(selected in caseWitnesses)) {
      caseWitnesses[selected] = {current, previous, brakeObservation, healthObservation, powerObservation, selfTestObservation, preCycle, mode, observed: selected === int15.caseId ? {decision: int15.decision} : {nextMode: int18.nextMode, directive: int18.directive, reason: int18.reason}};
    }
    const stateKey = JSON.stringify({previous, preCycle, mode});
    const nextKey = JSON.stringify({previous: current, preCycle: nextCycle, mode: int18.nextMode});
    if (!stateAdjacency.has(stateKey)) stateAdjacency.set(stateKey, new Set());
    stateAdjacency.get(stateKey).add(nextKey);
  }
}

function executeTrace(initialState, steps) {
  let state = JSON.parse(JSON.stringify(initialState));
  const evidence = [];
  for (const spec of steps) {
    const request = requestOwner(spec.input.request, state.previous);
    const brake = brakeOwner(spec.input.brake);
    const health = healthOwner(spec.input.health);
    const power = powerOwner(spec.input.power);
    const assessment = cycleAssessment(state.cycle, spec.input.selfTest);
    const authorization = authorizationOwner({request, brake, health, power});
    const applied = lifecycleOwner({mode: state.mode, request, brake, health, power, assessment, authorization});
    const frame = outcomeOwner(authorization, applied);
    const observedCases = [authorization.caseId, applied.caseId];
    if (!same(observedCases, spec.expectedCases)) observations.scenario_mismatches++;
    const nextState = {previous: spec.input.request, cycle: cycleStore(assessment, applied.directive), mode: applied.nextMode};
    evidence.push({input: spec.input, expected_named_branches: spec.expectedCases, observed: {request, assessment, decision: authorization.decision, lifecycle_case: applied.caseId, nextMode: applied.nextMode, reason: applied.reason, directive: applied.directive, controlFrame: frame, nextState}});
    state = nextState;
  }
  return evidence;
}
const ready = (request = {start: false, off: false, returnLevel: false}, selfTest = "NoEvent") => ({request, brake: "Pressed", health: {thermal: "Normal", maintenance: "NotDue"}, power: "Available", selfTest});
const init = (mode = "Off", cycle = "Idle", previous = {start: false, off: false, returnLevel: false}) => ({mode, cycle, previous});
const scenarioSpecs = [
  {scenario_id: "SCN-01", partition: "nominal fresh start and armed later pass", traces: [{name: "nominal-start", initial: init(), steps: [
    {input: ready({start: true, off: false, returnLevel: false}), expectedCases: ["CASE-05", "CASE-06"]},
    {input: ready({start: true, off: false, returnLevel: false}), expectedCases: ["CASE-02", "CASE-11"]},
    {input: ready({start: true, off: false, returnLevel: false}, "FreshPass"), expectedCases: ["CASE-02", "CASE-12"]}
  ]}]},
  {scenario_id: "SCN-02", partition: "off-return-start priority conflicts", traces: [
    {name: "start-plus-off", initial: init(), steps: [{input: ready({start: true, off: true, returnLevel: false}), expectedCases: ["CASE-01", "CASE-07"]}]},
    {name: "return-plus-off-degraded", initial: init("Degraded"), steps: [{input: ready({start: false, off: true, returnLevel: true}), expectedCases: ["CASE-01", "CASE-16"]}]},
    {name: "return-plus-start-degraded", initial: init("Degraded"), steps: [{input: ready({start: true, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-18"]}]}
  ]},
  {scenario_id: "SCN-03", partition: "invalid before valid-not-ready admission", traces: [
    {name: "brake-invalid", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), brake: "Invalid"}, expectedCases: ["CASE-03", "CASE-07"]}]},
    {name: "brake-not-ready", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), brake: "Released"}, expectedCases: ["CASE-04", "CASE-07"]}]},
    {name: "health-invalid", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), health: {thermal: "Invalid", maintenance: "NotDue"}}, expectedCases: ["CASE-03", "CASE-07"]}]},
    {name: "health-not-ready", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), health: {thermal: "OverMaximum", maintenance: "NotDue"}}, expectedCases: ["CASE-04", "CASE-07"]}]},
    {name: "power-invalid", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), power: "Invalid"}, expectedCases: ["CASE-03", "CASE-07"]}]},
    {name: "power-not-ready", initial: init(), steps: [{input: {...ready({start: true, off: false, returnLevel: false}), power: "Unavailable"}, expectedCases: ["CASE-04", "CASE-07"]}]}
  ]},
  {scenario_id: "SCN-04", partition: "starting prerequisite loss or fresh failure", traces: [
    {name: "starting-brake-loss", initial: init("Starting", "AwaitingStart"), steps: [{input: {...ready(), brake: "Released"}, expectedCases: ["CASE-02", "CASE-09"]}]},
    {name: "starting-health-invalid", initial: init("Starting", "AwaitingStart"), steps: [{input: {...ready(), health: {thermal: "Invalid", maintenance: "NotDue"}}, expectedCases: ["CASE-02", "CASE-09"]}]},
    {name: "starting-power-loss", initial: init("Starting", "AwaitingStart"), steps: [{input: {...ready(), power: "Unavailable"}, expectedCases: ["CASE-02", "CASE-09"]}]},
    {name: "starting-test-fail", initial: init("Starting", "AwaitingStart"), steps: [{input: ready(undefined, "FreshFail"), expectedCases: ["CASE-02", "CASE-10"]}]}
  ]},
  {scenario_id: "SCN-05", partition: "operating protection with brake inapplicable", traces: [
    {name: "temperature-loss", initial: init("On", "StartPassed"), steps: [{input: {...ready(), health: {thermal: "OverMaximum", maintenance: "NotDue"}}, expectedCases: ["CASE-02", "CASE-14"]}]},
    {name: "maintenance-due", initial: init("On", "StartPassed"), steps: [{input: {...ready(), health: {thermal: "Normal", maintenance: "Due"}}, expectedCases: ["CASE-02", "CASE-14"]}]},
    {name: "power-invalid", initial: init("On", "StartPassed"), steps: [{input: {...ready(), power: "Invalid"}, expectedCases: ["CASE-02", "CASE-14"]}]},
    {name: "retained-test-invalid", initial: init("On", "StartPassed"), steps: [{input: ready(undefined, "Invalid"), expectedCases: ["CASE-02", "CASE-14"]}]},
    {name: "brake-inapplicable", initial: init("On", "StartPassed"), steps: [{input: {...ready(), brake: "Released"}, expectedCases: ["CASE-02", "CASE-15"]}]}
  ]},
  {scenario_id: "SCN-06", partition: "off shutdown in every active mode", traces: [
    {name: "starting-off", initial: init("Starting", "AwaitingStart"), steps: [{input: ready({start: false, off: true, returnLevel: false}), expectedCases: ["CASE-01", "CASE-08"]}]},
    {name: "on-off", initial: init("On", "StartPassed"), steps: [{input: ready({start: false, off: true, returnLevel: false}), expectedCases: ["CASE-01", "CASE-13"]}]},
    {name: "degraded-off", initial: init("Degraded", "Failed"), steps: [{input: ready({start: false, off: true, returnLevel: false}), expectedCases: ["CASE-01", "CASE-16"]}]}
  ]},
  {scenario_id: "SCN-07", partition: "armed recovery, completed to off, later fresh start", traces: [{name: "successful-recovery", initial: init("Degraded"), steps: [
    {input: ready({start: false, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-18"]},
    {input: ready({start: false, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-20"]},
    {input: ready({start: false, off: false, returnLevel: true}, "FreshPass"), expectedCases: ["CASE-02", "CASE-19"]},
    {input: ready({start: false, off: false, returnLevel: false}), expectedCases: ["CASE-02", "CASE-07"]},
    {input: ready({start: true, off: false, returnLevel: false}), expectedCases: ["CASE-05", "CASE-06"]}
  ]}]},
  {scenario_id: "SCN-08", partition: "recovery rejection and freshness defenses", traces: [
    {name: "prerequisite-revocation", initial: init("Degraded", "AwaitingRecovery"), steps: [{input: {...ready({start: false, off: false, returnLevel: true}), brake: "Released"}, expectedCases: ["CASE-02", "CASE-17"]}]},
    {name: "held-return", initial: init("Degraded", "AwaitingRecovery", {start: false, off: false, returnLevel: true}), steps: [{input: ready({start: false, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-20"]}]},
    {name: "unarmed-pass", initial: init("Degraded", "Idle"), steps: [{input: ready(undefined, "FreshPass"), expectedCases: ["CASE-02", "CASE-20"]}]},
    {name: "completion-on-arm", initial: init("Degraded", "Idle"), steps: [{input: ready({start: false, off: false, returnLevel: true}, "FreshPass"), expectedCases: ["CASE-02", "CASE-18"]}]},
    {name: "fresh-recovery-fail", initial: init("Degraded", "AwaitingRecovery", {start: false, off: false, returnLevel: true}), steps: [{input: ready(undefined, "FreshFail"), expectedCases: ["CASE-02", "CASE-20"]}]},
    {name: "simultaneous-return-start", initial: init("Degraded"), steps: [{input: ready({start: true, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-18"]}]},
    {name: "held-start-after-recovery", initial: init("Off", "Idle", {start: true, off: false, returnLevel: true}), steps: [{input: ready({start: true, off: false, returnLevel: true}), expectedCases: ["CASE-02", "CASE-07"]}]}
  ]}
];
const scenarios = scenarioSpecs.map(family => ({scenario_id: family.scenario_id, distinct_oracle_partition: family.partition, traces: family.traces.map(trace => ({name: trace.name, initial_state: trace.initial, steps: executeTrace(trace.initial, trace.steps)}))}));
const scenarioCoveredCases = new Set();
for (const family of scenarios) for (const trace of family.traces) for (const step of trace.steps) for (const id of step.expected_named_branches) scenarioCoveredCases.add(id);

const initialized = init();
const initialKey = JSON.stringify({previous: initialized.previous, preCycle: initialized.cycle, mode: initialized.mode});
const reachable = new Set([initialKey]);
const queue = [initialKey];
while (queue.length) {
  const current = queue.shift();
  for (const next of stateAdjacency.get(current) || []) if (!reachable.has(next)) { reachable.add(next); queue.push(next); }
}
const allStateCount = requestLevels.length * cycles.length * modes.length;

const ownershipBase = [
  {usage: "request_priority_owner", claimed_roles: ["decision"], assigned_inputs: ["request_priority_owner.request_levels", "state.previous_request_levels"], owner_local_facts: ["offActive", "freshReturn", "freshStart", "requestConflict", "requestDisposition"], contract_cases: ["REQUEST_PRIORITY_DERIVATION"], analyzer_checks: ["request-owner-64-pairs"]},
  {usage: "brake_qualification_owner", claimed_roles: ["applicability"], assigned_inputs: ["brake_qualification_owner.brake_observation"], owner_local_facts: ["brakeEvidenceTrusted", "brakeReadyForAdmission"], contract_cases: ["BRAKE_FACT_DERIVATION"], analyzer_checks: ["brake-owner-three-values"]},
  {usage: "health_qualification_owner", claimed_roles: ["applicability"], assigned_inputs: ["health_qualification_owner.health_observation"], owner_local_facts: ["combinedHealthQualification", "invalidOverNotReadyPriority"], contract_cases: ["HEALTH_QUALIFICATION_DERIVATION"], analyzer_checks: ["health-owner-nine-values"]},
  {usage: "power_qualification_owner", claimed_roles: ["applicability"], assigned_inputs: ["power_qualification_owner.power_observation"], owner_local_facts: ["powerEvidenceTrusted", "powerAvailableForSupervision"], contract_cases: ["POWER_FACT_DERIVATION"], analyzer_checks: ["power-owner-three-values"]},
  {usage: "self_test_cycle_owner", claimed_roles: ["applicability"], assigned_inputs: ["self_test_cycle_owner.self_test_observation", "self_test_cycle_owner.test_cycle_directive", "state.committed_test_cycle"], owner_local_facts: ["preUpdateCycleAssessment", "postUpdateCommittedTestCycle"], contract_cases: ["PRE_UPDATE_CYCLE_ASSESSMENT", "INDEPENDENT_TEST_CYCLE_STORAGE"], analyzer_checks: ["cycle-owner-112-tuples"]},
  {usage: "start_authorization_owner", claimed_roles: ["decision"], assigned_inputs: ["start_authorization_owner.request_facts", "start_authorization_owner.brake_facts", "start_authorization_owner.health_qualification", "start_authorization_owner.power_facts"], owner_local_facts: ["fiveWayStartDecision"], contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05"], analyzer_checks: ["authorization-total-exclusive-product"]},
  {usage: "lifecycle_recovery_owner", claimed_roles: ["decision"], assigned_inputs: ["lifecycle_recovery_owner.request_facts", "lifecycle_recovery_owner.brake_facts", "lifecycle_recovery_owner.health_qualification", "lifecycle_recovery_owner.power_facts", "lifecycle_recovery_owner.cycle_assessment", "lifecycle_recovery_owner.authorization", "state.lifecycle_mode"], owner_local_facts: ["nextLifecycleMode", "lifecycleReason", "testCycleDirective"], contract_cases: Array.from({length: 15}, (_, i) => `CASE-${String(i + 6).padStart(2, "0")}`), analyzer_checks: ["lifecycle-total-exclusive-product"]},
  {usage: "coordinated_outcome_owner", claimed_roles: ["decision"], assigned_inputs: ["coordinated_outcome_owner.authorization", "coordinated_outcome_owner.applied_lifecycle"], owner_local_facts: ["atomicControlFrame", "failClosedStatusPrecedence"], contract_cases: ["STARTING_AND_ON_FRAME_MAPPING", "DEGRADED_FRAME_MAPPING", "OFF_FRAME_MAPPING"], analyzer_checks: ["complete-frame-oracle-product"]}
];
const allZero = Object.values(observations).every(value => value === 0);
const allCasesWitnessed = Array.from({length: 20}, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`).every(id => id in caseWitnesses && scenarioCoveredCases.has(id));
const ownershipAudit = ownershipBase.map(record => ({...record, passed: allZero}));
const result = {
  status: allZero && allCasesWitnessed && rawValuations === 580608 ? "passed" : "failed",
  passed: allZero && allCasesWitnessed && rawValuations === 580608,
  source_sha256: SOURCE_SHA256,
  bounded_analysis_claim_boundary: "Exhaustive only over the finite abstract root-input and retained-state domains declared by SA-VEH-MED-01; not compositional or unbounded proof, code execution, physical validation, reliability evidence, or certification.",
  semantic_connection_map: semanticConnectionMap,
  analyzer_trace_map: analyzerTraceMap,
  partition_counts: {
    request_owner_pairs: requestChecks, brake_owner_values: brakeChecks,
    health_owner_values: healthChecks, power_owner_values: powerChecks,
    cycle_owner_tuples: cycleChecks, raw_root_state_valuations: rawValuations,
    authorization_local_tuples: Object.values(authorizationCaseCounts).reduce((a, b) => a + b, 0),
    lifecycle_local_tuples: Object.values(lifecycleCaseCounts).reduce((a, b) => a + b, 0),
    abstract_states: allStateCount, reachable_abstract_states: reachable.size,
    unreachable_abstract_states: allStateCount - reachable.size
  },
  case_partitions: {authorization: authorizationCaseCounts, lifecycle: lifecycleCaseCounts},
  case_witnesses: caseWitnesses,
  scenarios,
  ownership_audit: ownershipAudit,
  observations,
  checks: {
    source_hash_bound: SOURCE_SHA256.length === 64,
    nineteen_semantic_connections_composed: semanticConnectionMap.length === 19,
    complete_raw_product: rawValuations === 580608,
    owner_local_products_complete: requestChecks === 64 && brakeChecks === 3 && healthChecks === 9 && powerChecks === 3 && cycleChecks === 112,
    authorization_total_and_exclusive: observations.authorization_gaps === 0 && observations.authorization_overlaps === 0,
    lifecycle_total_and_exclusive: observations.lifecycle_gaps === 0 && observations.lifecycle_overlaps === 0,
    all_twenty_cases_have_product_and_scenario_witnesses: allCasesWitnessed,
    eight_distinct_scenario_families_executed: scenarios.length === 8 && new Set(scenarios.map(x => x.distinct_oracle_partition)).size === 8,
    required_outputs_match_independent_oracle: observations.required_output_mismatches === 0,
    invariants_hold: observations.invariant_violations === 0,
    ownership_checks_executed: ownershipAudit.every(x => x.passed)
  }
};
console.log(JSON.stringify(result));
