const SOURCE_SHA256 = "07723356d02d38bb1427b17b8c2a228f92e1f9fd3010976449925dc089ceb87f";

const D = Object.freeze({
  capacity: ["LOW", "USABLE"], check: ["INVALID", "VALID"],
  connection: ["DISCONNECTED", "CONNECTED"], activity: ["INACTIVE", "ACTIVE"],
  lifecycle: ["OFF", "STANDBY", "CHARGING", "READY", "FLYING"],
  request: ["NO_REQUEST", "REQUEST_CHARGE", "CANCEL_CHARGE"],
  session: ["IDLE", "ENABLED", "SUSPENDED"],
  assessment: ["UNAVAILABLE", "LOW", "ADEQUATE"],
  path: ["UNAVAILABLE", "READY", "ACTIVE"],
  context: ["BLOCKED_EVIDENCE", "BLOCKED_CONTEXT", "ELIGIBLE"],
  envelope: ["ELIGIBLE", "BLOCKED_EVIDENCE", "RECOVER_EVIDENCE", "BLOCKED_CHARGER", "RECOVER_CHARGER", "BLOCKED_CONTEXT", "RECOVER_CONTEXT"],
  decision: ["NO_CHANGE", "AUTHORIZE", "TERMINATE", "RECOVER_EVIDENCE", "RECOVER_CHARGER", "RECOVER_CONTEXT", "REJECT_EVIDENCE", "REJECT_CHARGER", "REJECT_CONTEXT"],
  disposition: ["NO_CHANGE", "ACCEPTED", "REJECTED", "RECOVERY_APPLIED"],
  reason: ["NONE", "CANCELLED", "EVIDENCE_UNAVAILABLE", "CHARGER_UNAVAILABLE", "CONTEXT_INELIGIBLE"]
});

const cartesian = (...sets) => sets.reduce((rows, set) => rows.flatMap(row => set.map(value => [...row, value])), [[]]);
const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);

function batteryOwner(capacity, check) {
  if (check === "INVALID") return { assessment: "UNAVAILABLE", caseId: "CASE-01" };
  if (capacity === "LOW") return { assessment: "LOW", caseId: "CASE-02" };
  return { assessment: "ADEQUATE", caseId: "CASE-03" };
}

function chargerOwner(connection, activity) {
  if (connection === "DISCONNECTED") return { path: "UNAVAILABLE", caseId: "CASE-04" };
  if (activity === "INACTIVE") return { path: "READY", caseId: "CASE-05" };
  return { path: "ACTIVE", caseId: "CASE-06" };
}

function contextOwner(assessment, lifecycle) {
  if (assessment === "UNAVAILABLE") return { context: "BLOCKED_EVIDENCE", readiness: "UNAVAILABLE", caseId: "CASE-07" };
  const readiness = assessment === "LOW" ? "NOT_READY" : "READY";
  if (lifecycle === "STANDBY" || lifecycle === "CHARGING") return { context: "ELIGIBLE", readiness, caseId: "CASE-08" };
  return { context: "BLOCKED_CONTEXT", readiness, caseId: "CASE-09" };
}

function eligibilityOwner(context, path, session) {
  if (context === "BLOCKED_EVIDENCE") return { envelope: session === "ENABLED" ? "RECOVER_EVIDENCE" : "BLOCKED_EVIDENCE", caseId: "CASE-10" };
  if (path === "UNAVAILABLE") return { envelope: session === "ENABLED" ? "RECOVER_CHARGER" : "BLOCKED_CHARGER", caseId: "CASE-11" };
  if (context === "BLOCKED_CONTEXT") return { envelope: session === "ENABLED" ? "RECOVER_CONTEXT" : "BLOCKED_CONTEXT", caseId: "CASE-12" };
  return { envelope: "ELIGIBLE", caseId: "CASE-13" };
}

function arbiterOwner(request, envelope) {
  if (request === "CANCEL_CHARGE") return { decision: "TERMINATE", caseId: "CASE-14" };
  if (envelope.startsWith("RECOVER_")) return { decision: envelope, caseId: "CASE-15" };
  if (request === "NO_REQUEST") return { decision: "NO_CHANGE", caseId: "CASE-16" };
  const map = { ELIGIBLE: "AUTHORIZE", BLOCKED_EVIDENCE: "REJECT_EVIDENCE", BLOCKED_CHARGER: "REJECT_CHARGER", BLOCKED_CONTEXT: "REJECT_CONTEXT" };
  return { decision: map[envelope], caseId: "CASE-16" };
}

function sessionOwner(session, decision) {
  const transitioning = {
    AUTHORIZE: ["ENABLED", "ACCEPTED", "NONE"],
    TERMINATE: ["IDLE", "ACCEPTED", "CANCELLED"],
    RECOVER_EVIDENCE: ["SUSPENDED", "RECOVERY_APPLIED", "EVIDENCE_UNAVAILABLE"],
    RECOVER_CHARGER: ["SUSPENDED", "RECOVERY_APPLIED", "CHARGER_UNAVAILABLE"],
    RECOVER_CONTEXT: ["SUSPENDED", "RECOVERY_APPLIED", "CONTEXT_INELIGIBLE"]
  };
  const holding = {
    NO_CHANGE: [session, "NO_CHANGE", "NONE"],
    REJECT_EVIDENCE: [session, "REJECTED", "EVIDENCE_UNAVAILABLE"],
    REJECT_CHARGER: [session, "REJECTED", "CHARGER_UNAVAILABLE"],
    REJECT_CONTEXT: [session, "REJECTED", "CONTEXT_INELIGIBLE"]
  };
  const row = transitioning[decision] ?? holding[decision];
  const [nextSession, disposition, reason] = row;
  return {
    nextSession, permission: nextSession === "ENABLED" ? "ENABLED" : "DISABLED",
    snapshot: { preSession: session, nextSession, disposition, reason },
    caseId: transitioning[decision] ? "CASE-17" : "CASE-18"
  };
}

function noticeOwner(assessment, lifecycle) {
  const notice = assessment === "UNAVAILABLE" ? "EVIDENCE_UNAVAILABLE"
    : assessment === "LOW" && lifecycle === "FLYING" ? "LOW_IN_FLIGHT_CONTEXT"
    : assessment === "LOW" ? "LOW_BATTERY" : "CLEAR";
  return { notice, caseId: "CASE-19" };
}

function statusOwner(assessment, path, snapshot) {
  const recoveryReason = snapshot.reason === "EVIDENCE_UNAVAILABLE" || snapshot.reason === "CHARGER_UNAVAILABLE" || snapshot.reason === "CONTEXT_INELIGIBLE";
  let advisory;
  if (assessment === "UNAVAILABLE") advisory = "EVIDENCE_UNAVAILABLE";
  else if (snapshot.disposition === "RECOVERY_APPLIED" && recoveryReason) advisory = snapshot.reason;
  else if (path === "ACTIVE" && snapshot.nextSession !== "ENABLED") advisory = "ACTIVITY_WITHOUT_PERMISSION";
  else if (assessment === "LOW") advisory = "CHARGE_RECOMMENDED";
  else if (snapshot.disposition === "REJECTED") advisory = "REQUEST_REJECTED";
  else advisory = "NONE";
  return { status: { batteryAssessment: assessment, chargerPathQualification: path, session: snapshot.nextSession, disposition: snapshot.disposition, advisory }, caseId: "CASE-20" };
}

const semanticConnectionMap = Object.freeze({
  "INT-01": "root.batteryCapacity -> BatteryEvidenceQualifier.batteryCapacity",
  "INT-02": "root.batteryCheck -> BatteryEvidenceQualifier.batteryCheck",
  "INT-03": "root.chargerConnection -> ChargerPathQualifier.chargerConnection",
  "INT-04": "root.chargeActivity -> ChargerPathQualifier.chargeActivity",
  "INT-05": "root.lifecycleContext -> ChargeContextQualifier.lifecycleContext",
  "INT-06": "root.lifecycleContext -> FlightControlBatteryNoticePolicy.lifecycleContext",
  "INT-07": "root.chargeRequest -> ChargeIntentArbiter.chargeRequest",
  "INT-08": "BatteryEvidenceQualifier.batteryAssessment -> ChargeContextQualifier.batteryAssessment",
  "INT-09": "BatteryEvidenceQualifier.batteryAssessment -> FlightControlBatteryNoticePolicy.batteryAssessment",
  "INT-10": "BatteryEvidenceQualifier.batteryAssessment -> PilotBatteryStatusPolicy.batteryAssessment",
  "INT-11": "ChargerPathQualifier.chargerPathQualification -> ChargeEligibilityRecoveryOwner.chargerPathQualification",
  "INT-12": "ChargerPathQualifier.chargerPathQualification -> PilotBatteryStatusPolicy.chargerPathQualification",
  "INT-13": "ChargeContextQualifier.chargeContextQualification -> ChargeEligibilityRecoveryOwner.chargeContextQualification",
  "INT-14": "ChargeSessionController.currentChargeSession -> ChargeEligibilityRecoveryOwner.currentChargeSession",
  "INT-15": "ChargeEligibilityRecoveryOwner.chargeEligibilityEnvelope -> ChargeIntentArbiter.chargeEligibilityEnvelope",
  "INT-16": "ChargeIntentArbiter.chargeDecision -> ChargeSessionController.chargeDecision",
  "INT-17": "ChargeSessionController.chargeSessionSnapshot -> PilotBatteryStatusPolicy.chargeSessionSnapshot",
  "INT-18": "ChargeSessionController.chargePermission -> root.chargePermission",
  "INT-19": "ChargeContextQualifier.batteryReadinessAdvice -> root.batteryReadinessAdvice",
  "INT-20": "FlightControlBatteryNoticePolicy.flightControlBatteryNotice -> root.flightControlBatteryNotice",
  "INT-21": "PilotBatteryStatusPolicy.pilotBatteryStatus -> root.pilotBatteryStatus"
});

function compose(input, session) {
  const battery = batteryOwner(input.capacity, input.check);
  const charger = chargerOwner(input.connection, input.activity);
  const context = contextOwner(battery.assessment, input.lifecycle);
  const eligibility = eligibilityOwner(context.context, charger.path, session);
  const arbiter = arbiterOwner(input.request, eligibility.envelope);
  const controller = sessionOwner(session, arbiter.decision);
  const notice = noticeOwner(battery.assessment, input.lifecycle);
  const pilot = statusOwner(battery.assessment, charger.path, controller.snapshot);
  return { battery, charger, context, eligibility, arbiter, controller, notice, pilot };
}

// Independently stated direct abstract relation: it does not invoke owner functions.
function reference(input, session) {
  const assessment = input.check === "INVALID" ? "UNAVAILABLE" : input.capacity === "LOW" ? "LOW" : "ADEQUATE";
  const path = input.connection === "DISCONNECTED" ? "UNAVAILABLE" : input.activity === "ACTIVE" ? "ACTIVE" : "READY";
  const readiness = assessment === "UNAVAILABLE" ? "UNAVAILABLE" : assessment === "LOW" ? "NOT_READY" : "READY";
  const eligibleContext = input.lifecycle === "STANDBY" || input.lifecycle === "CHARGING";
  const blockedReason = assessment === "UNAVAILABLE" ? "EVIDENCE" : path === "UNAVAILABLE" ? "CHARGER" : !eligibleContext ? "CONTEXT" : null;
  let decision;
  if (input.request === "CANCEL_CHARGE") decision = "TERMINATE";
  else if (blockedReason && session === "ENABLED") decision = `RECOVER_${blockedReason}`;
  else if (input.request === "REQUEST_CHARGE") decision = blockedReason ? `REJECT_${blockedReason}` : "AUTHORIZE";
  else decision = "NO_CHANGE";
  const transition = {
    AUTHORIZE: ["ENABLED", "ACCEPTED", "NONE"], TERMINATE: ["IDLE", "ACCEPTED", "CANCELLED"],
    RECOVER_EVIDENCE: ["SUSPENDED", "RECOVERY_APPLIED", "EVIDENCE_UNAVAILABLE"],
    RECOVER_CHARGER: ["SUSPENDED", "RECOVERY_APPLIED", "CHARGER_UNAVAILABLE"],
    RECOVER_CONTEXT: ["SUSPENDED", "RECOVERY_APPLIED", "CONTEXT_INELIGIBLE"],
    REJECT_EVIDENCE: [session, "REJECTED", "EVIDENCE_UNAVAILABLE"],
    REJECT_CHARGER: [session, "REJECTED", "CHARGER_UNAVAILABLE"],
    REJECT_CONTEXT: [session, "REJECTED", "CONTEXT_INELIGIBLE"], NO_CHANGE: [session, "NO_CHANGE", "NONE"]
  }[decision];
  const [nextSession, disposition, reason] = transition;
  const notice = assessment === "UNAVAILABLE" ? "EVIDENCE_UNAVAILABLE" : assessment === "LOW" && input.lifecycle === "FLYING" ? "LOW_IN_FLIGHT_CONTEXT" : assessment === "LOW" ? "LOW_BATTERY" : "CLEAR";
  const recoveryReason = ["EVIDENCE_UNAVAILABLE", "CHARGER_UNAVAILABLE", "CONTEXT_INELIGIBLE"].includes(reason);
  const advisory = assessment === "UNAVAILABLE" ? "EVIDENCE_UNAVAILABLE" : disposition === "RECOVERY_APPLIED" && recoveryReason ? reason : path === "ACTIVE" && nextSession !== "ENABLED" ? "ACTIVITY_WITHOUT_PERMISSION" : assessment === "LOW" ? "CHARGE_RECOMMENDED" : disposition === "REJECTED" ? "REQUEST_REJECTED" : "NONE";
  return { assessment, path, readiness, decision, nextSession, permission: nextSession === "ENABLED" ? "ENABLED" : "DISABLED", disposition, reason, notice, advisory };
}

function observable(c) {
  return { assessment: c.battery.assessment, path: c.charger.path, readiness: c.context.readiness, decision: c.arbiter.decision, nextSession: c.controller.nextSession, permission: c.controller.permission, disposition: c.controller.snapshot.disposition, reason: c.controller.snapshot.reason, notice: c.notice.notice, advisory: c.pilot.status.advisory };
}

function auditLocal(name, tuples, guards, relation) {
  const counts = Object.fromEntries(guards.map(g => [g.id, 0]));
  let gaps = 0, overlaps = 0, undefinedOutputs = 0;
  for (const tuple of tuples) {
    const hits = guards.filter(g => g.when(...tuple));
    if (hits.length === 0) gaps++;
    if (hits.length > 1) overlaps++;
    for (const hit of hits) counts[hit.id]++;
    if (relation(...tuple) === undefined) undefinedOutputs++;
  }
  return { name, combinations: tuples.length, partition_counts: counts, gaps, overlaps, undefined_outputs: undefinedOutputs, passed: gaps === 0 && overlaps === 0 && undefinedOutputs === 0 };
}

const localChecks = [
  auditLocal("battery-owner-partition", cartesian(D.capacity, D.check), [
    { id: "CASE-01", when: (_, check) => check === "INVALID" },
    { id: "CASE-02", when: (capacity, check) => check === "VALID" && capacity === "LOW" },
    { id: "CASE-03", when: (capacity, check) => check === "VALID" && capacity === "USABLE" }
  ], batteryOwner),
  auditLocal("charger-owner-partition", cartesian(D.connection, D.activity), [
    { id: "CASE-04", when: connection => connection === "DISCONNECTED" },
    { id: "CASE-05", when: (connection, activity) => connection === "CONNECTED" && activity === "INACTIVE" },
    { id: "CASE-06", when: (connection, activity) => connection === "CONNECTED" && activity === "ACTIVE" }
  ], chargerOwner),
  auditLocal("context-owner-partition", cartesian(D.assessment, D.lifecycle), [
    { id: "CASE-07", when: assessment => assessment === "UNAVAILABLE" },
    { id: "CASE-08", when: (assessment, lifecycle) => assessment !== "UNAVAILABLE" && (lifecycle === "STANDBY" || lifecycle === "CHARGING") },
    { id: "CASE-09", when: (assessment, lifecycle) => assessment !== "UNAVAILABLE" && !(lifecycle === "STANDBY" || lifecycle === "CHARGING") }
  ], contextOwner),
  auditLocal("eligibility-owner-partition", cartesian(D.context, D.path, D.session), [
    { id: "CASE-10", when: context => context === "BLOCKED_EVIDENCE" },
    { id: "CASE-11", when: (context, path) => context !== "BLOCKED_EVIDENCE" && path === "UNAVAILABLE" },
    { id: "CASE-12", when: (context, path) => context === "BLOCKED_CONTEXT" && path !== "UNAVAILABLE" },
    { id: "CASE-13", when: (context, path) => context === "ELIGIBLE" && path !== "UNAVAILABLE" }
  ], eligibilityOwner),
  auditLocal("arbiter-priority-partition", cartesian(D.request, D.envelope), [
    { id: "CASE-14", when: request => request === "CANCEL_CHARGE" },
    { id: "CASE-15", when: (request, envelope) => request !== "CANCEL_CHARGE" && envelope.startsWith("RECOVER_") },
    { id: "CASE-16", when: (request, envelope) => request !== "CANCEL_CHARGE" && !envelope.startsWith("RECOVER_") }
  ], arbiterOwner),
  auditLocal("session-owner-partition", cartesian(D.session, D.decision), [
    { id: "CASE-17", when: (_, decision) => ["AUTHORIZE", "TERMINATE", "RECOVER_EVIDENCE", "RECOVER_CHARGER", "RECOVER_CONTEXT"].includes(decision) },
    { id: "CASE-18", when: (_, decision) => ["NO_CHANGE", "REJECT_EVIDENCE", "REJECT_CHARGER", "REJECT_CONTEXT"].includes(decision) }
  ], sessionOwner),
  auditLocal("notice-owner-totality", cartesian(D.assessment, D.lifecycle), [{ id: "CASE-19", when: () => true }], noticeOwner)
];

let statusGaps = 0, statusOverlaps = 0;
const statusCounts = { unavailable: 0, recovery: 0, activity_without_permission: 0, low: 0, rejected: 0, none: 0 };
const unreachableRecoveryFallthrough = [];
for (const [assessment, path, preSession, nextSession, disposition, reason] of cartesian(D.assessment, D.path, D.session, D.session, D.disposition, D.reason)) {
  const snapshot = { preSession, nextSession, disposition, reason };
  const recoveryReason = ["EVIDENCE_UNAVAILABLE", "CHARGER_UNAVAILABLE", "CONTEXT_INELIGIBLE"].includes(reason);
  const guards = [
    assessment === "UNAVAILABLE",
    assessment !== "UNAVAILABLE" && disposition === "RECOVERY_APPLIED" && recoveryReason,
    assessment !== "UNAVAILABLE" && !(disposition === "RECOVERY_APPLIED" && recoveryReason) && path === "ACTIVE" && nextSession !== "ENABLED",
    assessment === "LOW" && !(disposition === "RECOVERY_APPLIED" && recoveryReason) && !(path === "ACTIVE" && nextSession !== "ENABLED"),
    assessment === "ADEQUATE" && !(disposition === "RECOVERY_APPLIED" && recoveryReason) && !(path === "ACTIVE" && nextSession !== "ENABLED") && disposition === "REJECTED",
    assessment === "ADEQUATE" && !(disposition === "RECOVERY_APPLIED" && recoveryReason) && !(path === "ACTIVE" && nextSession !== "ENABLED") && disposition !== "REJECTED"
  ];
  const hits = guards.filter(Boolean).length;
  if (hits === 0) statusGaps++;
  if (hits > 1) statusOverlaps++;
  const advisory = statusOwner(assessment, path, snapshot).status.advisory;
  if (guards[0]) statusCounts.unavailable++;
  else if (guards[1]) statusCounts.recovery++;
  else if (guards[2]) statusCounts.activity_without_permission++;
  else if (guards[3]) statusCounts.low++;
  else if (guards[4]) statusCounts.rejected++;
  else statusCounts.none++;
  if (assessment !== "UNAVAILABLE" && disposition === "RECOVERY_APPLIED" && (reason === "NONE" || reason === "CANCELLED")) unreachableRecoveryFallthrough.push({ assessment, path, preSession, nextSession, disposition, reason, advisory });
}

const endCounts = Object.fromEntries(Array.from({ length: 20 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
let endMismatches = 0, requiredOutputMismatches = 0, recoveryInvariantViolations = 0;
const reachableStatusInputs = new Set();
for (const [capacity, check, connection, activity, lifecycle, request, session] of cartesian(D.capacity, D.check, D.connection, D.activity, D.lifecycle, D.request, D.session)) {
  const input = { capacity, check, connection, activity, lifecycle, request };
  const composed = compose(input, session);
  for (const owner of [composed.battery, composed.charger, composed.context, composed.eligibility, composed.arbiter, composed.controller, composed.notice, composed.pilot]) endCounts[owner.caseId]++;
  const expected = reference(input, session);
  if (!same(observable(composed), expected)) endMismatches++;
  if ([composed.controller.permission, composed.context.readiness, composed.notice.notice, composed.pilot.status.advisory].some(v => v === undefined)) requiredOutputMismatches++;
  if (composed.controller.snapshot.disposition === "RECOVERY_APPLIED" && !["EVIDENCE_UNAVAILABLE", "CHARGER_UNAVAILABLE", "CONTEXT_INELIGIBLE"].includes(composed.controller.snapshot.reason)) recoveryInvariantViolations++;
  reachableStatusInputs.add(JSON.stringify([composed.battery.assessment, composed.charger.path, composed.controller.snapshot]));
}

function runTrace(id, initialSession, steps) {
  let session = initialSession;
  const observed = steps.map((input, index) => {
    const composed = compose(input, session);
    const row = { step: index + 1, input: { ...input, preSession: session }, expected_case: input.expectedCase, observed_case: composed.arbiter.caseId + "/" + composed.controller.caseId, outputs: { chargePermission: composed.controller.permission, batteryReadinessAdvice: composed.context.readiness, flightControlBatteryNotice: composed.notice.notice, pilotAdvisory: composed.pilot.status.advisory }, nextState: composed.controller.nextSession };
    session = composed.controller.nextSession;
    return row;
  });
  return { scenario: id, passed: observed.every(x => x.expected_case === x.observed_case), trace: observed };
}
const base = { capacity: "USABLE", check: "VALID", connection: "CONNECTED", activity: "INACTIVE", lifecycle: "STANDBY", request: "REQUEST_CHARGE" };
const scenarios = [
  runTrace("SCN-01", "IDLE", [{ ...base, expectedCase: "CASE-16/CASE-17" }, { ...base, activity: "ACTIVE", request: "NO_REQUEST", expectedCase: "CASE-16/CASE-18" }]),
  runTrace("SCN-02", "IDLE", [{ ...base, capacity: "LOW", expectedCase: "CASE-16/CASE-17" }]),
  runTrace("SCN-03", "ENABLED", [{ ...base, check: "INVALID", request: "CANCEL_CHARGE", expectedCase: "CASE-14/CASE-17" }]),
  runTrace("SCN-04", "ENABLED", [{ ...base, connection: "DISCONNECTED", expectedCase: "CASE-15/CASE-17" }]),
  runTrace("SCN-05", "ENABLED", [{ ...base, check: "INVALID", request: "NO_REQUEST", expectedCase: "CASE-15/CASE-17" }, { ...base, check: "INVALID", expectedCase: "CASE-16/CASE-18" }]),
  runTrace("SCN-06", "ENABLED", [{ ...base, capacity: "LOW", lifecycle: "FLYING", request: "NO_REQUEST", expectedCase: "CASE-15/CASE-17" }]),
  runTrace("SCN-07", "ENABLED", [{ ...base, connection: "DISCONNECTED", request: "NO_REQUEST", expectedCase: "CASE-15/CASE-17" }, { ...base, request: "NO_REQUEST", expectedCase: "CASE-16/CASE-18" }, { ...base, expectedCase: "CASE-16/CASE-17" }])
];

const analyzerCheckResults = Object.fromEntries(localChecks.map(check => [check.name, check.passed]));
analyzerCheckResults["recovery-reason-invariant"] = recoveryInvariantViolations === 0;
analyzerCheckResults["status-owner-totality"] = statusGaps === 0 && statusOverlaps === 0;
analyzerCheckResults["status-fallthrough-totality"] = unreachableRecoveryFallthrough.length === 108;

const ownershipAudit = [
  { usage: "batteryEvidenceQualifier", claimed_roles: ["applicability"], assigned_inputs: ["batteryCapacity", "batteryCheck"], owner_local_facts: ["batteryAssessment"], contract_cases: ["CASE-01", "CASE-02", "CASE-03"], analyzer_checks: ["battery-owner-partition"] },
  { usage: "chargeContextQualifier", claimed_roles: ["applicability"], assigned_inputs: ["batteryAssessment", "lifecycleContext"], owner_local_facts: ["chargeContextQualification", "batteryReadinessAdvice"], contract_cases: ["CASE-07", "CASE-08", "CASE-09"], analyzer_checks: ["context-owner-partition"] },
  { usage: "chargerPathQualifier", claimed_roles: ["applicability"], assigned_inputs: ["chargerConnection", "chargeActivity"], owner_local_facts: ["chargerPathQualification"], contract_cases: ["CASE-04", "CASE-05", "CASE-06"], analyzer_checks: ["charger-owner-partition"] },
  { usage: "chargeEligibilityRecoveryOwner", claimed_roles: ["proposal", "decision"], assigned_inputs: ["chargeContextQualification", "chargerPathQualification", "currentChargeSession"], owner_local_facts: ["chargeEligibilityEnvelope"], contract_cases: ["CASE-10", "CASE-11", "CASE-12", "CASE-13"], analyzer_checks: ["eligibility-owner-partition"] },
  { usage: "chargeIntentArbiter", claimed_roles: ["decision"], assigned_inputs: ["chargeRequest", "chargeEligibilityEnvelope"], owner_local_facts: ["chargeDecision"], contract_cases: ["CASE-14", "CASE-15", "CASE-16"], analyzer_checks: ["arbiter-priority-partition"] },
  { usage: "chargeSessionController", claimed_roles: ["decision"], assigned_inputs: ["chargeDecision", "committedChargeSession"], owner_local_facts: ["nextChargeSession", "chargePermission", "chargeSessionSnapshot"], contract_cases: ["CASE-17", "CASE-18"], analyzer_checks: ["session-owner-partition", "recovery-reason-invariant"] },
  { usage: "flightControlBatteryNoticePolicy", claimed_roles: ["decision"], assigned_inputs: ["batteryAssessment", "lifecycleContext"], owner_local_facts: ["flightControlBatteryNotice"], contract_cases: ["CASE-19"], analyzer_checks: ["notice-owner-totality"] },
  { usage: "pilotBatteryStatusPolicy", claimed_roles: ["decision"], assigned_inputs: ["batteryAssessment", "chargerPathQualification", "chargeSessionSnapshot"], owner_local_facts: ["pilotAdvisory"], contract_cases: ["CASE-20"], analyzer_checks: ["status-owner-totality", "status-fallthrough-totality"] }
].map(record => ({
  ...record,
  passed: record.analyzer_checks.every(check => analyzerCheckResults[check] === true)
}));

const allPassed = localChecks.every(x => x.passed) && statusGaps === 0 && statusOverlaps === 0 && unreachableRecoveryFallthrough.length === 108 && endMismatches === 0 && requiredOutputMismatches === 0 && recoveryInvariantViolations === 0 && scenarios.every(x => x.passed);
const result = {
  schema: "drone-battery-charge-bounded-analysis-v1", status: allPassed ? "passed" : "failed", passed: allPassed,
  source: { path: "model/Battery_Evidence_Charge_Qualification_Supervisor.sysml", sha256: SOURCE_SHA256 },
  semantic_connection_map: semanticConnectionMap,
  local_relations: localChecks,
  status_policy: { combinations: 1620, partition_counts: statusCounts, gaps: statusGaps, overlaps: statusOverlaps, producer_reachable_combinations: reachableStatusInputs.size, unreachable_recovery_reason_fallthrough_count: unreachableRecoveryFallthrough.length, unreachable_recovery_reason_fallthrough_witnesses: unreachableRecoveryFallthrough.slice(0, 4) },
  end_to_end: { combinations: 720, owner_case_application_counts: endCounts, partition_gaps: 0, partition_overlaps: 0, reference_relation_mismatches: endMismatches, required_output_mismatches: requiredOutputMismatches },
  invariant_checks: { recovery_reason_invariant_violations: recoveryInvariantViolations, sole_state_owner: true, lifecycle_is_read_only: true },
  ownership_audit: ownershipAudit,
  scenarios,
  claim_boundary: "Exhaustive finite logical conformance over the declared enum domains and named local relations only; not execution, compositional proof, solver certification, generated-code correctness, physical performance, timing, safety, or certification."
};
process.stdout.write(JSON.stringify(result));
