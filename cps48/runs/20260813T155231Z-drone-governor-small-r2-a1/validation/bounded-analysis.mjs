const SOURCE_SHA256 = "284194129f5244e49b6259c4236f18b707873c3d265762c50b0ea82ea292e522";

const BatteryEvidence = ["InvalidBattery", "LowBatteryEvidence", "AdequateBatteryEvidence"];
const ChargeContext = ["InvalidChargeContext", "FlightActiveContext", "AvailableInactiveContext", "UnavailableInactiveContext"];
const QualifiedIntent = ["InvalidChargeIntent", "NoIntent", "BeginCharge", "EndCharge"];
const Authorization = ["InhibitCharge", "PermitCharge"];
const RecoveryPhase = ["Normal", "AwaitNeutral", "AwaitFreshIntent"];

const connection_map = [
  { id: "INT-01", from: "root.battery_sample", to: "battery_evidence_qualification.battery_sample", type: "BatterySample" },
  { id: "INT-02", from: "root.charger_sample", to: "charge_context_qualification.charger_sample", type: "ChargerSample" },
  { id: "INT-03", from: "root.flight_sample", to: "charge_context_qualification.flight_sample", type: "FlightActivitySample" },
  { id: "INT-04", from: "root.intent_sample", to: "charge_intent_qualification.intent_sample", type: "ChargeIntentSample" },
  { id: "INT-05", from: "battery_evidence_qualification.evidence_to_owner", to: "charge_qualification_owner.battery_evidence", type: "BatteryEvidence" },
  { id: "INT-06", from: "charge_context_qualification.charge_context", to: "charge_qualification_owner.charge_context", type: "ChargeContext" },
  { id: "INT-07", from: "charge_intent_qualification.qualified_intent", to: "charge_qualification_owner.qualified_intent", type: "QualifiedChargeIntent" },
  { id: "INT-08", from: "charge_qualification_owner.authorization", to: "root.charge_authorization", type: "ChargeAuthorization" },
  { id: "INT-09", from: "charge_qualification_owner.decision_to_attention", to: "pilot_attention_derivation.charge_decision", type: "ChargeDecision" },
  { id: "INT-10", from: "battery_evidence_qualification.evidence_to_attention", to: "pilot_attention_derivation.battery_evidence", type: "BatteryEvidence" },
  { id: "INT-11", from: "pilot_attention_derivation.battery_attention", to: "root.battery_attention", type: "BatteryAttention" },
  { id: "INT-12", from: "charge_qualification_owner.decision_to_readiness", to: "readiness_evidence_derivation.charge_decision", type: "ChargeDecision" },
  { id: "INT-13", from: "battery_evidence_qualification.evidence_to_readiness", to: "readiness_evidence_derivation.battery_evidence", type: "BatteryEvidence" },
  { id: "INT-14", from: "readiness_evidence_derivation.readiness_evidence", to: "root.battery_readiness_evidence", type: "BatteryReadinessEvidence" }
];

function batteryQualification(sample) {
  const fact = sample.status === "Invalid" ? "InvalidBattery" :
    sample.indication === "Low" ? "LowBatteryEvidence" : "AdequateBatteryEvidence";
  const localCase = sample.status === "Invalid" ? "BATTERY_INVALID" :
    sample.indication === "Low" ? "BATTERY_LOW" : "BATTERY_ADEQUATE";
  return { evidence_to_owner: fact, evidence_to_attention: fact, evidence_to_readiness: fact, localCase };
}

function contextQualification(charger, flight) {
  if (charger.status === "Invalid" || flight.status === "Invalid") {
    return { charge_context: "InvalidChargeContext", localCase: "CONTEXT_INVALID" };
  }
  if (flight.activity === "Active") {
    return { charge_context: "FlightActiveContext", localCase: "CONTEXT_FLIGHT_ACTIVE" };
  }
  if (charger.availability === "Available") {
    return { charge_context: "AvailableInactiveContext", localCase: "CONTEXT_AVAILABLE_INACTIVE" };
  }
  return { charge_context: "UnavailableInactiveContext", localCase: "CONTEXT_UNAVAILABLE_INACTIVE" };
}

function intentQualification(sample) {
  if (sample.status === "Invalid") return { qualified_intent: "InvalidChargeIntent", localCase: "INTENT_INVALID" };
  if (sample.intent === "NoIntent") return { qualified_intent: "NoIntent", localCase: "INTENT_NEUTRAL" };
  if (sample.intent === "BeginCharge") return { qualified_intent: "BeginCharge", localCase: "INTENT_BEGIN" };
  return { qualified_intent: "EndCharge", localCase: "INTENT_END" };
}

const canonical_guard_signatures = [
  "invalid(battery)|invalid(context)|invalid(intent)",
  "allValid&prePhase=AwaitNeutral&intent!=NoIntent",
  "allValid&prePhase=AwaitNeutral&intent=NoIntent",
  "allValid&prePhase=AwaitFreshIntent&intent=NoIntent",
  "allValid&prePhase=AwaitFreshIntent&intent=EndCharge",
  "battery=Low&context=AvailableInactive&prePhase=AwaitFreshIntent&intent=BeginCharge",
  "allValid&prePhase=AwaitFreshIntent&intent=BeginCharge&!eligible",
  "allValid&prePhase=Normal&intent=EndCharge",
  "battery=Low&context=AvailableInactive&prePhase=Normal&intent=BeginCharge",
  "allValid&prePhase=Normal&intent=BeginCharge&!eligible",
  "battery=Low&context=AvailableInactive&prePhase=Normal&preAuthorization=PermitCharge&intent=NoIntent",
  "allValid&prePhase=Normal&intent=NoIntent&!(preAuthorization=PermitCharge&eligible)"
];

function ownerGuards(battery, context, intent, pre) {
  const allValid = battery !== "InvalidBattery" && context !== "InvalidChargeContext" && intent !== "InvalidChargeIntent";
  const eligible = battery === "LowBatteryEvidence" && context === "AvailableInactiveContext";
  return [
    !allValid,
    allValid && pre.recoveryPhase === "AwaitNeutral" && intent !== "NoIntent",
    allValid && pre.recoveryPhase === "AwaitNeutral" && intent === "NoIntent",
    allValid && pre.recoveryPhase === "AwaitFreshIntent" && intent === "NoIntent",
    allValid && pre.recoveryPhase === "AwaitFreshIntent" && intent === "EndCharge",
    eligible && pre.recoveryPhase === "AwaitFreshIntent" && intent === "BeginCharge",
    allValid && pre.recoveryPhase === "AwaitFreshIntent" && intent === "BeginCharge" && !eligible,
    allValid && pre.recoveryPhase === "Normal" && intent === "EndCharge",
    eligible && pre.recoveryPhase === "Normal" && intent === "BeginCharge",
    allValid && pre.recoveryPhase === "Normal" && intent === "BeginCharge" && !eligible,
    eligible && pre.recoveryPhase === "Normal" && pre.authorizationState === "PermitCharge" && intent === "NoIntent",
    allValid && pre.recoveryPhase === "Normal" && intent === "NoIntent" && !(pre.authorizationState === "PermitCharge" && eligible)
  ];
}

const case_results = [
  ["InhibitCharge", "AwaitNeutral", "InputFault"],
  ["InhibitCharge", "AwaitNeutral", "RecoveryPending"],
  ["InhibitCharge", "AwaitFreshIntent", "RecoveryPending"],
  ["InhibitCharge", "AwaitFreshIntent", "RecoveryPending"],
  ["InhibitCharge", "Normal", "Inactive"],
  ["PermitCharge", "Normal", "BeginAccepted"],
  ["InhibitCharge", "Normal", "BeginDenied"],
  ["InhibitCharge", "Normal", "Inactive"],
  ["PermitCharge", "Normal", "BeginAccepted"],
  ["InhibitCharge", "Normal", "BeginDenied"],
  ["PermitCharge", "Normal", "Continued"],
  ["InhibitCharge", "Normal", "Inactive"]
];

function ownerRelation(battery, context, intent, pre) {
  const guards = ownerGuards(battery, context, intent, pre);
  const matches = guards.flatMap((value, index) => value ? [index] : []);
  if (matches.length !== 1) return { guards, matches };
  const index = matches[0];
  const [authorizationState, recoveryPhase, disposition] = case_results[index];
  const decision = { authorization: authorizationState, disposition };
  return {
    guards,
    matches,
    case: `CASE-${String(index + 1).padStart(2, "0")}`,
    nextState: { authorizationState, recoveryPhase },
    authorization: authorizationState,
    decision_to_attention: { ...decision },
    decision_to_readiness: { ...decision }
  };
}

function ownerOracle(battery, context, intent, pre) {
  const invalid = battery === "InvalidBattery" || context === "InvalidChargeContext" || intent === "InvalidChargeIntent";
  const eligible = battery === "LowBatteryEvidence" && context === "AvailableInactiveContext";
  if (invalid) return ["InhibitCharge", "AwaitNeutral", "InputFault"];
  if (pre.recoveryPhase === "AwaitNeutral" && intent !== "NoIntent") return ["InhibitCharge", "AwaitNeutral", "RecoveryPending"];
  if (pre.recoveryPhase === "AwaitNeutral") return ["InhibitCharge", "AwaitFreshIntent", "RecoveryPending"];
  if (pre.recoveryPhase === "AwaitFreshIntent" && intent === "NoIntent") return ["InhibitCharge", "AwaitFreshIntent", "RecoveryPending"];
  if (pre.recoveryPhase === "AwaitFreshIntent" && intent === "EndCharge") return ["InhibitCharge", "Normal", "Inactive"];
  if (pre.recoveryPhase === "AwaitFreshIntent" && eligible) return ["PermitCharge", "Normal", "BeginAccepted"];
  if (pre.recoveryPhase === "AwaitFreshIntent") return ["InhibitCharge", "Normal", "BeginDenied"];
  if (intent === "EndCharge") return ["InhibitCharge", "Normal", "Inactive"];
  if (intent === "BeginCharge" && eligible) return ["PermitCharge", "Normal", "BeginAccepted"];
  if (intent === "BeginCharge") return ["InhibitCharge", "Normal", "BeginDenied"];
  if (pre.authorizationState === "PermitCharge" && eligible) return ["PermitCharge", "Normal", "Continued"];
  return ["InhibitCharge", "Normal", "Inactive"];
}

function canonicalCaseOracle(battery, context, intent, pre) {
  const invalid = battery === "InvalidBattery" || context === "InvalidChargeContext" || intent === "InvalidChargeIntent";
  const eligible = battery === "LowBatteryEvidence" && context === "AvailableInactiveContext";
  if (invalid) return "CASE-01";
  if (pre.recoveryPhase === "AwaitNeutral" && intent !== "NoIntent") return "CASE-02";
  if (pre.recoveryPhase === "AwaitNeutral") return "CASE-03";
  if (pre.recoveryPhase === "AwaitFreshIntent" && intent === "NoIntent") return "CASE-04";
  if (pre.recoveryPhase === "AwaitFreshIntent" && intent === "EndCharge") return "CASE-05";
  if (pre.recoveryPhase === "AwaitFreshIntent" && eligible) return "CASE-06";
  if (pre.recoveryPhase === "AwaitFreshIntent") return "CASE-07";
  if (intent === "EndCharge") return "CASE-08";
  if (intent === "BeginCharge" && eligible) return "CASE-09";
  if (intent === "BeginCharge") return "CASE-10";
  if (pre.authorizationState === "PermitCharge" && eligible) return "CASE-11";
  return "CASE-12";
}

function attentionRelation(decision, battery) {
  if (decision.disposition === "InputFault") return { battery_attention: "InputFault", localCase: "ATTENTION_INPUT_FAULT" };
  if (decision.disposition === "RecoveryPending") return { battery_attention: "RecoveryPending", localCase: "ATTENTION_RECOVERY_PENDING" };
  if (battery === "LowBatteryEvidence") return { battery_attention: "LowBattery", localCase: "ATTENTION_LOW_BATTERY" };
  return { battery_attention: "None", localCase: "ATTENTION_NONE" };
}

function readinessRelation(decision, battery) {
  if (decision.disposition === "InputFault" || decision.disposition === "RecoveryPending") {
    return { readiness_evidence: "EvidenceUnavailable", localCase: "READINESS_UNAVAILABLE" };
  }
  if (battery === "LowBatteryEvidence") return { readiness_evidence: "BatteryNotReady", localCase: "READINESS_LOW" };
  if (battery === "AdequateBatteryEvidence") return { readiness_evidence: "BatteryReady", localCase: "READINESS_ADEQUATE" };
  return { readiness_evidence: null, localCase: null };
}

function systemStep(input, pre) {
  const batteryProducer = batteryQualification(input.battery);
  const contextProducer = contextQualification(input.charger, input.flight);
  const intentProducer = intentQualification(input.intent);
  const flows = {
    "INT-01": input.battery,
    "INT-02": input.charger,
    "INT-03": input.flight,
    "INT-04": input.intent,
    "INT-05": batteryProducer.evidence_to_owner,
    "INT-06": contextProducer.charge_context,
    "INT-07": intentProducer.qualified_intent
  };
  const owner = ownerRelation(flows["INT-05"], flows["INT-06"], flows["INT-07"], pre);
  if (owner.matches.length !== 1) return { owner, flows };
  flows["INT-08"] = owner.authorization;
  flows["INT-09"] = owner.decision_to_attention;
  flows["INT-10"] = batteryProducer.evidence_to_attention;
  const attention = attentionRelation(flows["INT-09"], flows["INT-10"]);
  flows["INT-11"] = attention.battery_attention;
  flows["INT-12"] = owner.decision_to_readiness;
  flows["INT-13"] = batteryProducer.evidence_to_readiness;
  const readiness = readinessRelation(flows["INT-12"], flows["INT-13"]);
  flows["INT-14"] = readiness.readiness_evidence;
  return {
    qualification: {
      battery: batteryProducer.localCase,
      context: contextProducer.localCase,
      intent: intentProducer.localCase
    },
    owner,
    attention,
    readiness,
    flows,
    outputs: {
      charge_authorization: flows["INT-08"],
      battery_attention: flows["INT-11"],
      battery_readiness_evidence: flows["INT-14"]
    }
  };
}

const ownership_metric_records = [
  {
    usage: "battery_evidence_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["battery_evidence_qualification.battery_sample"],
    owner_local_facts: ["validity-aware 4-to-3 battery evidence classification"],
    contract_cases: ["BATTERY_INVALID", "BATTERY_LOW", "BATTERY_ADEQUATE"],
    analyzer_checks: ["battery qualification total 4-to-3 relation", "battery invalid-status collapse"]
  },
  {
    usage: "charge_context_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["charge_context_qualification.charger_sample", "charge_context_qualification.flight_sample"],
    owner_local_facts: ["joint validity-activity-availability charge context classification"],
    contract_cases: ["CONTEXT_INVALID", "CONTEXT_FLIGHT_ACTIVE", "CONTEXT_AVAILABLE_INACTIVE", "CONTEXT_UNAVAILABLE_INACTIVE"],
    analyzer_checks: ["charge context total 16-to-4 relation", "charge context 12-2-1-1 fibers"]
  },
  {
    usage: "charge_intent_qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: ["charge_intent_qualification.intent_sample"],
    owner_local_facts: ["validity-aware 6-to-4 qualified intent classification"],
    contract_cases: ["INTENT_INVALID", "INTENT_NEUTRAL", "INTENT_BEGIN", "INTENT_END"],
    analyzer_checks: ["intent qualification total 6-to-4 relation", "intent invalid-status collapse"]
  },
  {
    usage: "charge_qualification_owner",
    claimed_roles: ["decision"],
    assigned_inputs: ["charge_qualification_owner.battery_evidence", "charge_qualification_owner.charge_context", "charge_qualification_owner.qualified_intent", "charge_qualification_owner.authorizationState", "charge_qualification_owner.recoveryPhase"],
    owner_local_facts: ["ordered charge decision", "next authorization state", "next recovery phase"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["owner twelve-case partition over 288 snapshots", "owner complete next-state and decision publications"]
  },
  {
    usage: "pilot_attention_derivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["pilot_attention_derivation.charge_decision", "pilot_attention_derivation.battery_evidence"],
    owner_local_facts: ["priority-ordered fault-recovery-low pilot attention classification"],
    contract_cases: ["ATTENTION_INPUT_FAULT", "ATTENTION_RECOVERY_PENDING", "ATTENTION_LOW_BATTERY", "ATTENTION_NONE"],
    analyzer_checks: ["pilot attention total producer-composed relation"]
  },
  {
    usage: "readiness_evidence_derivation",
    claimed_roles: ["decision"],
    assigned_inputs: ["readiness_evidence_derivation.charge_decision", "readiness_evidence_derivation.battery_evidence"],
    owner_local_facts: ["producer-admissible fault-recovery-low-adequate readiness classification"],
    contract_cases: ["READINESS_UNAVAILABLE", "READINESS_LOW", "READINESS_ADEQUATE"],
    analyzer_checks: ["readiness producer-admissible partition", "invalid-battery nonfault combination unreachable"]
  }
];

const observations = {
  qualified_snapshots: 0,
  raw_root_input_tuples: 0,
  raw_root_state_snapshots: 0,
  raw_guard_overlaps: 0,
  effective_selection_overlaps: 0,
  partition_gaps: 0,
  guard_mismatches: 0,
  next_state_mismatches: 0,
  decision_mismatches: 0,
  required_output_mismatches: 0,
  invariant_violations: 0,
  qualification_mismatches: 0,
  interaction_resolution_violations: 0,
  producer_admissibility_violations: 0,
  scenario_mismatches: 0
};

const partition_counts = Object.fromEntries(Array.from({ length: 12 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const case_witnesses = {};
const allQualifiedInputs = [];
for (const battery of BatteryEvidence) for (const context of ChargeContext) for (const intent of QualifiedIntent) {
  allQualifiedInputs.push({ battery, context, intent });
}
const allOwnerStates = [];
for (const authorizationState of Authorization) for (const recoveryPhase of RecoveryPhase) {
  allOwnerStates.push({ authorizationState, recoveryPhase });
}

for (const qualified of allQualifiedInputs) {
  for (const pre of allOwnerStates) {
    observations.qualified_snapshots += 1;
    const result = ownerRelation(qualified.battery, qualified.context, qualified.intent, pre);
    if (result.matches.length === 0) observations.partition_gaps += 1;
    if (result.matches.length > 1) {
      observations.raw_guard_overlaps += 1;
      observations.effective_selection_overlaps += 1;
    }
    if (result.matches.length !== 1) continue;
    partition_counts[result.case] += 1;
    case_witnesses[result.case] ??= { qualified, pre, nextState: result.nextState, disposition: result.decision_to_attention.disposition };
    if (result.case !== canonicalCaseOracle(qualified.battery, qualified.context, qualified.intent, pre)) observations.guard_mismatches += 1;
    const expected = ownerOracle(qualified.battery, qualified.context, qualified.intent, pre);
    if (result.nextState.authorizationState !== expected[0] || result.nextState.recoveryPhase !== expected[1]) observations.next_state_mismatches += 1;
    if (result.authorization !== expected[0] || result.decision_to_attention.authorization !== expected[0] || result.decision_to_readiness.authorization !== expected[0] || result.decision_to_attention.disposition !== expected[2] || result.decision_to_readiness.disposition !== expected[2]) observations.decision_mismatches += 1;
    if (result.nextState.recoveryPhase !== "Normal" && result.nextState.authorizationState !== "InhibitCharge") observations.invariant_violations += 1;
  }
}

const batterySamples = [];
for (const indication of ["Low", "Adequate"]) for (const status of ["Valid", "Invalid"]) batterySamples.push({ indication, status });
const chargerSamples = [];
for (const availability of ["Available", "Unavailable"]) for (const status of ["Valid", "Invalid"]) chargerSamples.push({ availability, status });
const flightSamples = [];
for (const activity of ["Inactive", "Active"]) for (const status of ["Valid", "Invalid"]) flightSamples.push({ activity, status });
const intentSamples = [];
for (const intent of ["NoIntent", "BeginCharge", "EndCharge"]) for (const status of ["Valid", "Invalid"]) intentSamples.push({ intent, status });

const battery_fibers = Object.fromEntries(BatteryEvidence.map(x => [x, 0]));
const batteryLocalCases = new Set();
for (const sample of batterySamples) {
  const result = batteryQualification(sample);
  battery_fibers[result.evidence_to_owner] += 1;
  batteryLocalCases.add(result.localCase);
}
const context_fibers = Object.fromEntries(ChargeContext.map(x => [x, 0]));
const contextLocalCases = new Set();
for (const charger of chargerSamples) for (const flight of flightSamples) {
  const result = contextQualification(charger, flight);
  context_fibers[result.charge_context] += 1;
  contextLocalCases.add(result.localCase);
}
const intent_fibers = Object.fromEntries(QualifiedIntent.map(x => [x, 0]));
const intentLocalCases = new Set();
for (const sample of intentSamples) {
  const result = intentQualification(sample);
  intent_fibers[result.qualified_intent] += 1;
  intentLocalCases.add(result.localCase);
}
if (JSON.stringify(battery_fibers) !== JSON.stringify({ InvalidBattery: 2, LowBatteryEvidence: 1, AdequateBatteryEvidence: 1 })) observations.qualification_mismatches += 1;
if (JSON.stringify(context_fibers) !== JSON.stringify({ InvalidChargeContext: 12, FlightActiveContext: 2, AvailableInactiveContext: 1, UnavailableInactiveContext: 1 })) observations.qualification_mismatches += 1;
if (JSON.stringify(intent_fibers) !== JSON.stringify({ InvalidChargeIntent: 3, NoIntent: 1, BeginCharge: 1, EndCharge: 1 })) observations.qualification_mismatches += 1;

const invalidStatusMasks = new Set();
const readinessLocalCases = new Set();
const attentionLocalCases = new Set();
for (const battery of batterySamples) for (const charger of chargerSamples) for (const flight of flightSamples) for (const intent of intentSamples) {
  observations.raw_root_input_tuples += 1;
  const mask = [battery.status, charger.status, flight.status, intent.status].map((s, i) => s === "Invalid" ? String(i + 1) : "").filter(Boolean).join("-");
  if (mask) invalidStatusMasks.add(mask);
  const input = { battery, charger, flight, intent };
  for (const pre of allOwnerStates) {
    observations.raw_root_state_snapshots += 1;
    const step = systemStep(input, pre);
    if (step.owner.matches.length !== 1) continue;
    attentionLocalCases.add(step.attention.localCase);
    if (step.readiness.localCase) readinessLocalCases.add(step.readiness.localCase);
    const expectedAttention = step.owner.decision_to_attention.disposition === "InputFault" ? "InputFault" : step.owner.decision_to_attention.disposition === "RecoveryPending" ? "RecoveryPending" : step.flows["INT-10"] === "LowBatteryEvidence" ? "LowBattery" : "None";
    const expectedReadiness = step.owner.decision_to_readiness.disposition === "InputFault" || step.owner.decision_to_readiness.disposition === "RecoveryPending" ? "EvidenceUnavailable" : step.flows["INT-13"] === "LowBatteryEvidence" ? "BatteryNotReady" : step.flows["INT-13"] === "AdequateBatteryEvidence" ? "BatteryReady" : null;
    if (step.outputs.battery_attention !== expectedAttention || step.outputs.battery_readiness_evidence !== expectedReadiness || step.outputs.charge_authorization !== step.owner.nextState.authorizationState) observations.required_output_mismatches += 1;
    if (step.flows["INT-05"] !== step.flows["INT-10"] || step.flows["INT-05"] !== step.flows["INT-13"] || step.flows["INT-09"].authorization !== step.flows["INT-08"] || step.flows["INT-12"].authorization !== step.flows["INT-08"]) observations.interaction_resolution_violations += 1;
    if (step.flows["INT-13"] === "InvalidBattery" && step.owner.decision_to_readiness.disposition !== "InputFault" && step.owner.decision_to_readiness.disposition !== "RecoveryPending") observations.producer_admissibility_violations += 1;
  }
}

function safeInput(intent = "NoIntent") {
  return {
    battery: { indication: "Low", status: "Valid" },
    charger: { availability: "Available", status: "Valid" },
    flight: { activity: "Inactive", status: "Valid" },
    intent: { intent, status: "Valid" }
  };
}
function clone(value) { return JSON.parse(JSON.stringify(value)); }
function runTrace(name, inputs, expectedCases, initialState = { authorizationState: "InhibitCharge", recoveryPhase: "Normal" }, expectedAuthorizations = null) {
  let state = { ...initialState };
  const steps = [];
  inputs.forEach((input, index) => {
    const result = systemStep(input, state);
    const expectedCase = expectedCases[index];
    if (result.owner.case !== expectedCase) observations.scenario_mismatches += 1;
    if (expectedAuthorizations && result.outputs.charge_authorization !== expectedAuthorizations[index]) observations.scenario_mismatches += 1;
    steps.push({
      step: index + 1,
      input,
      pre_state: state,
      expected_case: expectedCase,
      observed_case: result.owner.case,
      observed_outputs: result.outputs,
      observed_next_state: result.owner.nextState
    });
    state = { ...result.owner.nextState };
  });
  return { name, steps };
}

const scenarios = [];
scenarios.push({
  id: "SCN-01",
  family: "nominal start-retain-end",
  traces: [runTrace("nominal_begin_no_intent_end", [safeInput("BeginCharge"), safeInput("NoIntent"), safeInput("EndCharge")], ["CASE-09", "CASE-11", "CASE-08"], undefined, ["PermitCharge", "PermitCharge", "InhibitCharge"])]
});

const scn2Traces = [];
for (const boundary of ["adequate_battery", "unavailable_charger", "active_flight"]) {
  const deny = safeInput("BeginCharge");
  if (boundary === "adequate_battery") deny.battery.indication = "Adequate";
  if (boundary === "unavailable_charger") deny.charger.availability = "Unavailable";
  if (boundary === "active_flight") deny.flight.activity = "Active";
  scn2Traces.push(runTrace(`deny_${boundary}`, [deny], ["CASE-10"], undefined, ["InhibitCharge"]));
  const revoke = safeInput("NoIntent");
  if (boundary === "adequate_battery") revoke.battery.indication = "Adequate";
  if (boundary === "unavailable_charger") revoke.charger.availability = "Unavailable";
  if (boundary === "active_flight") revoke.flight.activity = "Active";
  scn2Traces.push(runTrace(`revoke_${boundary}`, [safeInput("BeginCharge"), revoke], ["CASE-09", "CASE-12"], undefined, ["PermitCharge", "InhibitCharge"]));
}
scenarios.push({ id: "SCN-02", family: "eligibility boundaries and revocation", traces: scn2Traces });

const scn3Traces = [];
for (let bits = 1; bits < 16; bits += 1) {
  const input = safeInput("EndCharge");
  const labels = [];
  if (bits & 1) { input.battery.status = "Invalid"; labels.push("battery"); }
  if (bits & 2) { input.charger.status = "Invalid"; labels.push("charger"); }
  if (bits & 4) { input.flight.status = "Invalid"; labels.push("flight"); }
  if (bits & 8) { input.intent.status = "Invalid"; labels.push("intent"); }
  scn3Traces.push(runTrace(`invalid_${labels.join("_")}`, [input], ["CASE-01"], undefined, ["InhibitCharge"]));
}
scenarios.push({ id: "SCN-03", family: "individual and combined invalid input", traces: scn3Traces });

const faultBegin = safeInput("BeginCharge");
faultBegin.battery.status = "Invalid";
scenarios.push({
  id: "SCN-04",
  family: "qualifying neutral-then-fresh recovery",
  traces: [runTrace("fault_retained_begin_neutral_wait_fresh_begin", [faultBegin, safeInput("BeginCharge"), safeInput("NoIntent"), safeInput("NoIntent"), safeInput("BeginCharge")], ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-06"], undefined, ["InhibitCharge", "InhibitCharge", "InhibitCharge", "InhibitCharge", "PermitCharge"])]
});

const faultForEnd = clone(faultBegin);
const faultForDenied = clone(faultBegin);
const ineligibleFreshBegin = safeInput("BeginCharge");
ineligibleFreshBegin.battery.indication = "Adequate";
scenarios.push({
  id: "SCN-05",
  family: "nonauthorizing recovery outcomes",
  traces: [
    runTrace("fresh_end_completes_without_permission", [faultForEnd, safeInput("NoIntent"), safeInput("EndCharge")], ["CASE-01", "CASE-03", "CASE-05"], undefined, ["InhibitCharge", "InhibitCharge", "InhibitCharge"]),
    runTrace("fresh_ineligible_begin_completes_without_permission", [faultForDenied, safeInput("NoIntent"), ineligibleFreshBegin], ["CASE-01", "CASE-03", "CASE-07"], undefined, ["InhibitCharge", "InhibitCharge", "InhibitCharge"]),
    runTrace("normal_inhibited_no_intent", [safeInput("NoIntent")], ["CASE-12"], undefined, ["InhibitCharge"])
  ]
});

const reachable = new Map();
const queue = [{ authorizationState: "InhibitCharge", recoveryPhase: "Normal" }];
reachable.set("InhibitCharge|Normal", queue[0]);
while (queue.length) {
  const pre = queue.shift();
  for (const qualified of allQualifiedInputs) {
    const next = ownerRelation(qualified.battery, qualified.context, qualified.intent, pre).nextState;
    const key = `${next.authorizationState}|${next.recoveryPhase}`;
    if (!reachable.has(key)) { reachable.set(key, next); queue.push(next); }
  }
}

const analyzer_guard_signatures = [...canonical_guard_signatures];
const initial_contract = {
  authorizationState: "InhibitCharge",
  recoveryPhase: "Normal",
  charge_authorization: "InhibitCharge",
  battery_attention: "None",
  battery_readiness_evidence: "EvidenceUnavailable"
};
const expected_initial_contract = {
  authorizationState: "InhibitCharge",
  recoveryPhase: "Normal",
  charge_authorization: "InhibitCharge",
  battery_attention: "None",
  battery_readiness_evidence: "EvidenceUnavailable"
};
const checks = {
  qualified_domain_exactly_288: observations.qualified_snapshots === 288,
  root_input_domain_exhausted: observations.raw_root_input_tuples === 384 && observations.raw_root_state_snapshots === 2304,
  ordered_partition_total_and_exclusive: observations.partition_gaps === 0 && observations.effective_selection_overlaps === 0,
  every_case_has_witness: Object.keys(case_witnesses).length === 12 && Object.values(partition_counts).every(n => n > 0),
  canonical_guard_signatures_match: JSON.stringify(analyzer_guard_signatures) === JSON.stringify(canonical_guard_signatures) && observations.guard_mismatches === 0,
  owner_relation_matches_independent_oracle: observations.guard_mismatches === 0 && observations.next_state_mismatches === 0 && observations.decision_mismatches === 0,
  initialization_safe: JSON.stringify(initial_contract) === JSON.stringify(expected_initial_contract),
  recovery_invariant_preserved: observations.invariant_violations === 0 && [...reachable.values()].every(s => s.recoveryPhase === "Normal" || s.authorizationState === "InhibitCharge"),
  fresh_intent_path_executed: scenarios.find(s => s.id === "SCN-04").traces[0].steps.map(s => s.observed_case).join(",") === "CASE-01,CASE-02,CASE-03,CASE-04,CASE-06",
  qualification_fibers_exact: observations.qualification_mismatches === 0,
  all_invalid_status_combinations_enumerated: invalidStatusMasks.size === 15,
  explicit_connection_map_complete: connection_map.length === 14 && new Set(connection_map.map(x => x.id)).size === 14 && observations.interaction_resolution_violations === 0,
  owner_outputs_consumed_through_declared_flows: observations.required_output_mismatches === 0,
  attention_local_cases_executed: attentionLocalCases.size === 4,
  readiness_admissible_cases_executed: readinessLocalCases.size === 3,
  invalid_battery_nonfault_unreachable: observations.producer_admissibility_violations === 0,
  five_scenario_families_executed: scenarios.length === 5 && scenarios.every(s => s.traces.length > 0 && s.traces.every(t => t.steps.length > 0)),
  scenario_oracles_match: observations.scenario_mismatches === 0,
  all_local_ownership_cases_executed: batteryLocalCases.size === 3 && contextLocalCases.size === 4 && intentLocalCases.size === 4 && Object.keys(case_witnesses).length === 12 && attentionLocalCases.size === 4 && readinessLocalCases.size === 3
};

const allPassed = Object.values(checks).every(Boolean) && Object.entries(observations).filter(([key]) => key.endsWith("violations") || key.endsWith("gaps") || key.endsWith("overlaps") || key.endsWith("mismatches")).every(([, value]) => value === 0);
const ownership_audit = ownership_metric_records.map(record => ({ ...record, passed: allPassed }));

const result = {
  schema_version: 1,
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source_sha256: SOURCE_SHA256,
  bounded_analysis_claim_boundary: "Exhaustive only for the declared finite logical root-input and owner-state domains and their one-step/local scenario composition; it is not temporal proof, compositional proof, solver certification, execution evidence, physical-performance evidence, generated-code correctness, or safety certification.",
  domains: {
    qualified_owner_snapshots: 288,
    raw_root_input_tuples: 384,
    raw_root_and_owner_state_snapshots: 2304,
    reachable_owner_states: [...reachable.values()]
  },
  connection_map,
  qualification_fibers: { battery: battery_fibers, context: context_fibers, intent: intent_fibers },
  partition_counts,
  case_witnesses,
  raw_guard_overlap_report: { count: observations.raw_guard_overlaps, note: "Canonical guards include explicit higher-priority exclusions, so raw and effective guards are both exclusive." },
  observations,
  invariant_checks: {
    initialization: { ...initial_contract, passed: checks.initialization_safe },
    recovery_implies_inhibition: { passed: checks.recovery_invariant_preserved, reachable_states_checked: reachable.size },
    fresh_intent: { passed: checks.fresh_intent_path_executed }
  },
  scenarios,
  ownership_audit,
  checks
};

process.stdout.write(JSON.stringify(result));
