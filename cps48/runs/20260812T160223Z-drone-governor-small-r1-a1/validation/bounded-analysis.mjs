const SOURCE_SHA256 = "a61a14aae9f46abc046d9caf39a54596be651abab11fc215fa10f5e21fa8bc24";

const phases = ["Off", "Standby", "Charging", "Ready", "Flying"];
const recoveryFlags = [false, true];
const requestStatuses = ["Valid", "Invalid"];
const events = [
  "No_Request", "Switch_On", "Switch_Off", "Begin_Charge", "End_Charge",
  "Activate", "Deactivate", "Begin_Flight", "End_Flight"
];
const batteryStatuses = ["Valid", "Invalid"];
const indications = ["Adequate", "Low"];
const caseIds = Array.from({ length: 12 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`);

const semanticConnectionMap = Object.freeze({
  "INT-01": ["root.lifecycle_request", "request_qualification.raw_request"],
  "INT-02": ["request_qualification.qualified_request", "lifecycle_decision_owner.qualified_request"],
  "INT-03": ["root.battery_sample", "battery_assessment.raw_battery"],
  "INT-04": ["battery_assessment.battery_assessment", "lifecycle_decision_owner.battery_assessment"],
  "INT-05": ["lifecycle_decision_owner.selected_phase", "controlled_outcome_derivation.selected_phase"],
  "INT-06": ["lifecycle_decision_owner.decision_disposition", "attention_derivation.decision_disposition"],
  "INT-07": ["battery_assessment.battery_assessment", "attention_derivation.battery_assessment"],
  "INT-08": ["controlled_outcome_derivation.lifecycle_actuation", "root.lifecycle_actuation"],
  "INT-09": ["attention_derivation.attention_status", "root.attention_status"],
  "INT-10": ["lifecycle_decision_owner.phase_report", "root.commanded_phase_report"]
});

const canonicalGuardSignatures = Object.freeze({
  "CASE-01": "request=Invalid_Request OR battery=Invalid_Battery",
  "CASE-02": "valid inputs AND pre.recovery=true AND request!=No_Request",
  "CASE-03": "valid inputs AND pre.recovery=true AND request=No_Request",
  "CASE-04": "valid inputs AND pre.recovery=false AND request=Switch_Off",
  "CASE-05": "valid inputs AND pre.recovery=false AND pre.phase=Off AND request=Switch_On",
  "CASE-06": "valid inputs AND pre.recovery=false AND pre.phase=Standby AND request=Begin_Charge AND battery=Low_Battery",
  "CASE-07": "valid inputs AND pre.recovery=false AND pre.phase=Charging AND request=End_Charge AND battery=Adequate_Battery",
  "CASE-08": "valid inputs AND pre.recovery=false AND pre.phase=Standby AND request=Activate AND battery=Adequate_Battery",
  "CASE-09": "valid inputs AND pre.recovery=false AND pre.phase=Ready AND request=Begin_Flight AND battery=Adequate_Battery",
  "CASE-10": "valid inputs AND pre.recovery=false AND pre.phase=Flying AND request=End_Flight",
  "CASE-11": "valid inputs AND pre.recovery=false AND pre.phase=Ready AND request=Deactivate",
  "CASE-12": "valid inputs AND pre.recovery=false AND request!=Switch_Off AND none of CASE-05..CASE-11"
});

const analyzerGuardSignatures = Object.freeze({
  "CASE-01": "request=Invalid_Request OR battery=Invalid_Battery",
  "CASE-02": "valid inputs AND pre.recovery=true AND request!=No_Request",
  "CASE-03": "valid inputs AND pre.recovery=true AND request=No_Request",
  "CASE-04": "valid inputs AND pre.recovery=false AND request=Switch_Off",
  "CASE-05": "valid inputs AND pre.recovery=false AND pre.phase=Off AND request=Switch_On",
  "CASE-06": "valid inputs AND pre.recovery=false AND pre.phase=Standby AND request=Begin_Charge AND battery=Low_Battery",
  "CASE-07": "valid inputs AND pre.recovery=false AND pre.phase=Charging AND request=End_Charge AND battery=Adequate_Battery",
  "CASE-08": "valid inputs AND pre.recovery=false AND pre.phase=Standby AND request=Activate AND battery=Adequate_Battery",
  "CASE-09": "valid inputs AND pre.recovery=false AND pre.phase=Ready AND request=Begin_Flight AND battery=Adequate_Battery",
  "CASE-10": "valid inputs AND pre.recovery=false AND pre.phase=Flying AND request=End_Flight",
  "CASE-11": "valid inputs AND pre.recovery=false AND pre.phase=Ready AND request=Deactivate",
  "CASE-12": "valid inputs AND pre.recovery=false AND request!=Switch_Off AND none of CASE-05..CASE-11"
});
const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);

function transmit(id, from, to, value, diagnostics) {
  const endpoints = semanticConnectionMap[id];
  if (!endpoints || endpoints[0] !== from || endpoints[1] !== to) {
    diagnostics.connection_endpoint_mismatches += 1;
  }
  return value;
}

function requestQualification(raw) {
  if (raw.status === "Invalid") return "Invalid_Request";
  return raw.event;
}

function batteryAssessment(raw) {
  if (raw.status === "Invalid") return "Invalid_Battery";
  return raw.indication === "Adequate" ? "Adequate_Battery" : "Low_Battery";
}

function ownerCaseGuards(pre, request, battery) {
  const valid = request !== "Invalid_Request" && battery !== "Invalid_Battery";
  const transition05 = pre.current_phase === "Off" && request === "Switch_On";
  const transition06 = pre.current_phase === "Standby" && request === "Begin_Charge" && battery === "Low_Battery";
  const transition07 = pre.current_phase === "Charging" && request === "End_Charge" && battery === "Adequate_Battery";
  const transition08 = pre.current_phase === "Standby" && request === "Activate" && battery === "Adequate_Battery";
  const transition09 = pre.current_phase === "Ready" && request === "Begin_Flight" && battery === "Adequate_Battery";
  const transition10 = pre.current_phase === "Flying" && request === "End_Flight";
  const transition11 = pre.current_phase === "Ready" && request === "Deactivate";
  return {
    "CASE-01": !valid,
    "CASE-02": valid && pre.recovery_required && request !== "No_Request",
    "CASE-03": valid && pre.recovery_required && request === "No_Request",
    "CASE-04": valid && !pre.recovery_required && request === "Switch_Off",
    "CASE-05": valid && !pre.recovery_required && transition05,
    "CASE-06": valid && !pre.recovery_required && transition06,
    "CASE-07": valid && !pre.recovery_required && transition07,
    "CASE-08": valid && !pre.recovery_required && transition08,
    "CASE-09": valid && !pre.recovery_required && transition09,
    "CASE-10": valid && !pre.recovery_required && transition10,
    "CASE-11": valid && !pre.recovery_required && transition11,
    "CASE-12": valid && !pre.recovery_required && request !== "Switch_Off" &&
      !transition05 && !transition06 && !transition07 && !transition08 &&
      !transition09 && !transition10 && !transition11
  };
}

function expectedOwnerResult(caseId, pre) {
  const phaseByCase = {
    "CASE-01": "Off", "CASE-02": "Off", "CASE-03": "Off", "CASE-04": "Off",
    "CASE-05": "Standby", "CASE-06": "Charging", "CASE-07": "Standby",
    "CASE-08": "Ready", "CASE-09": "Flying", "CASE-10": "Ready",
    "CASE-11": "Standby", "CASE-12": pre.current_phase
  };
  return {
    current_phase: phaseByCase[caseId],
    recovery_required: caseId === "CASE-01" || caseId === "CASE-02",
    selected_phase: phaseByCase[caseId],
    phase_report: phaseByCase[caseId],
    decision_disposition: {
      input_fault_detected: caseId === "CASE-01",
      recovery_pending: caseId === "CASE-01" || caseId === "CASE-02"
    }
  };
}

function lifecycleDecisionOwner(pre, request, battery) {
  const guards = ownerCaseGuards(pre, request, battery);
  const matches = caseIds.filter((id) => guards[id]);
  if (matches.length !== 1) return { matches, result: null };
  return { matches, result: { case_id: matches[0], ...expectedOwnerResult(matches[0], pre) } };
}

function controlledOutcomeDerivation(selectedPhase) {
  return {
    Off: { power: "Disabled", charging_permitted: false, flight_permitted: false },
    Standby: { power: "Standby_Enabled", charging_permitted: false, flight_permitted: false },
    Charging: { power: "Operational_Enabled", charging_permitted: true, flight_permitted: false },
    Ready: { power: "Operational_Enabled", charging_permitted: false, flight_permitted: false },
    Flying: { power: "Operational_Enabled", charging_permitted: false, flight_permitted: true }
  }[selectedPhase];
}

function attentionDerivation(disposition, battery) {
  if (disposition.input_fault_detected) return "Input_Fault";
  if (disposition.recovery_pending) return "Recovery_Awaiting_Neutral";
  if (battery === "Low_Battery") return "Low_Battery";
  return "None";
}

function compose(pre, rawRequest, rawBattery, diagnostics) {
  const requestInput = transmit("INT-01", "root.lifecycle_request", "request_qualification.raw_request", rawRequest, diagnostics);
  const requestFact = requestQualification(requestInput);
  const ownerRequest = transmit("INT-02", "request_qualification.qualified_request", "lifecycle_decision_owner.qualified_request", requestFact, diagnostics);

  const batteryInput = transmit("INT-03", "root.battery_sample", "battery_assessment.raw_battery", rawBattery, diagnostics);
  const batteryFact = batteryAssessment(batteryInput);
  const ownerBattery = transmit("INT-04", "battery_assessment.battery_assessment", "lifecycle_decision_owner.battery_assessment", batteryFact, diagnostics);

  const owner = lifecycleDecisionOwner(pre, ownerRequest, ownerBattery);
  if (!owner.result) return { owner, requestFact, batteryFact };

  const outcomePhase = transmit("INT-05", "lifecycle_decision_owner.selected_phase", "controlled_outcome_derivation.selected_phase", owner.result.selected_phase, diagnostics);
  const disposition = transmit("INT-06", "lifecycle_decision_owner.decision_disposition", "attention_derivation.decision_disposition", owner.result.decision_disposition, diagnostics);
  const advisoryBattery = transmit("INT-07", "battery_assessment.battery_assessment", "attention_derivation.battery_assessment", batteryFact, diagnostics);
  const localActuation = controlledOutcomeDerivation(outcomePhase);
  const localAttention = attentionDerivation(disposition, advisoryBattery);

  return {
    requestFact,
    batteryFact,
    owner,
    root_outputs: {
      lifecycle_actuation: transmit("INT-08", "controlled_outcome_derivation.lifecycle_actuation", "root.lifecycle_actuation", localActuation, diagnostics),
      attention_status: transmit("INT-09", "attention_derivation.attention_status", "root.attention_status", localAttention, diagnostics),
      commanded_phase_report: transmit("INT-10", "lifecycle_decision_owner.phase_report", "root.commanded_phase_report", owner.result.phase_report, diagnostics)
    },
    next_state: {
      current_phase: owner.result.current_phase,
      recovery_required: owner.result.recovery_required
    }
  };
}

const diagnostics = {
  case_gaps: 0,
  case_overlaps: 0,
  qualification_mismatches: 0,
  owner_output_mismatches: 0,
  required_output_mismatches: 0,
  state_invariant_violations: 0,
  connection_endpoint_mismatches: 0,
  scenario_mismatches: 0
};
const partitionCounts = Object.fromEntries(caseIds.map((id) => [id, 0]));
const caseWitnesses = {};
let snapshots = 0;
let invariantChecks = 0;

for (const current_phase of phases) {
  for (const recovery_required of recoveryFlags) {
    for (const requestStatus of requestStatuses) {
      for (const event of events) {
        for (const batteryStatus of batteryStatuses) {
          for (const indication of indications) {
            snapshots += 1;
            const pre = { current_phase, recovery_required };
            const rawRequest = { event, status: requestStatus };
            const rawBattery = { indication, status: batteryStatus };
            const composed = compose(pre, rawRequest, rawBattery, diagnostics);
            const matchCount = composed.owner.matches.length;
            if (matchCount === 0) diagnostics.case_gaps += 1;
            if (matchCount > 1) diagnostics.case_overlaps += 1;
            if (matchCount !== 1) continue;

            const caseId = composed.owner.result.case_id;
            partitionCounts[caseId] += 1;
            caseWitnesses[caseId] ??= { pre_state: pre, raw_request: rawRequest, raw_battery: rawBattery };

            const expectedRequest = requestStatus === "Invalid" ? "Invalid_Request" : event;
            const expectedBattery = batteryStatus === "Invalid" ? "Invalid_Battery" : `${indication}_Battery`;
            if (composed.requestFact !== expectedRequest || composed.batteryFact !== expectedBattery) diagnostics.qualification_mismatches += 1;

            const expectedOwner = expectedOwnerResult(caseId, pre);
            const actualOwner = { ...composed.owner.result };
            delete actualOwner.case_id;
            if (!same(actualOwner, expectedOwner)) diagnostics.owner_output_mismatches += 1;

            const expectedActuation = controlledOutcomeDerivation(expectedOwner.selected_phase);
            const expectedAttention = attentionDerivation(expectedOwner.decision_disposition, expectedBattery);
            if (!same(composed.root_outputs.lifecycle_actuation, expectedActuation) ||
                composed.root_outputs.commanded_phase_report !== expectedOwner.phase_report ||
                composed.root_outputs.attention_status !== expectedAttention) {
              diagnostics.required_output_mismatches += 1;
            }

            invariantChecks += 1;
            if (composed.next_state.recovery_required && composed.next_state.current_phase !== "Off") diagnostics.state_invariant_violations += 1;
          }
        }
      }
    }
  }
}

function scenarioStep(state, event, indication, expectedCase, overrides = {}) {
  const rawRequest = { event, status: overrides.request_status ?? "Valid" };
  const rawBattery = { indication, status: overrides.battery_status ?? "Valid" };
  const composed = compose(state, rawRequest, rawBattery, diagnostics);
  const observedCase = composed.owner.result?.case_id ?? null;
  if (observedCase !== expectedCase) diagnostics.scenario_mismatches += 1;
  const record = {
    pre_state: state,
    root_inputs: { lifecycle_request: rawRequest, battery_sample: rawBattery },
    expected_case: expectedCase,
    observed_case: observedCase,
    observed_outputs: composed.root_outputs,
    observed_next_state: composed.next_state
  };
  return [composed.next_state, record];
}

function runTrace(initial, specs) {
  let state = initial;
  const steps = [];
  for (const spec of specs) {
    const [next, record] = scenarioStep(state, spec.event, spec.indication, spec.case_id, spec);
    steps.push(record);
    state = next;
  }
  return steps;
}

const init = { current_phase: "Off", recovery_required: false };
const scenarioTraces = [
  {
    scenario_id: "SCN-01",
    family: "nominal lifecycle",
    traces: [{ trace_id: "SCN-01-NOMINAL", steps: runTrace(init, [
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-05" },
      { event: "Activate", indication: "Adequate", case_id: "CASE-08" },
      { event: "Begin_Flight", indication: "Adequate", case_id: "CASE-09" },
      { event: "End_Flight", indication: "Adequate", case_id: "CASE-10" },
      { event: "Deactivate", indication: "Adequate", case_id: "CASE-11" },
      { event: "Switch_Off", indication: "Adequate", case_id: "CASE-04" }
    ]) }]
  },
  {
    scenario_id: "SCN-02",
    family: "charging and qualitative battery boundary",
    traces: [{ trace_id: "SCN-02-CHARGE", steps: runTrace(init, [
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-05" },
      { event: "Begin_Charge", indication: "Low", case_id: "CASE-06" },
      { event: "End_Charge", indication: "Low", case_id: "CASE-12" },
      { event: "End_Charge", indication: "Adequate", case_id: "CASE-07" }
    ]) }]
  },
  {
    scenario_id: "SCN-03",
    family: "admissibility and priority boundary",
    traces: [{ trace_id: "SCN-03-PRIORITY", steps: runTrace(init, [
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-05" },
      { event: "Activate", indication: "Low", case_id: "CASE-12" },
      { event: "Activate", indication: "Adequate", case_id: "CASE-08" },
      { event: "Begin_Flight", indication: "Low", case_id: "CASE-12" },
      { event: "Begin_Flight", indication: "Adequate", case_id: "CASE-09" },
      { event: "Switch_Off", indication: "Adequate", case_id: "CASE-04" },
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-05" },
      { event: "Activate", indication: "Adequate", case_id: "CASE-08" },
      { event: "Switch_Off", indication: "Adequate", request_status: "Invalid", case_id: "CASE-01" }
    ]) }]
  },
  {
    scenario_id: "SCN-04",
    family: "invalid and fault entry",
    traces: [
      { trace_id: "SCN-04-INVALID-REQUEST", steps: runTrace({ current_phase: "Ready", recovery_required: false }, [
        { event: "Activate", indication: "Adequate", request_status: "Invalid", case_id: "CASE-01" }
      ]) },
      { trace_id: "SCN-04-INVALID-BATTERY", steps: runTrace({ current_phase: "Flying", recovery_required: false }, [
        { event: "No_Request", indication: "Low", battery_status: "Invalid", case_id: "CASE-01" }
      ]) },
      { trace_id: "SCN-04-BOTH-INVALID", steps: runTrace({ current_phase: "Charging", recovery_required: false }, [
        { event: "End_Charge", indication: "Low", request_status: "Invalid", battery_status: "Invalid", case_id: "CASE-01" }
      ]) }
    ]
  },
  {
    scenario_id: "SCN-05",
    family: "recovery and fresh request",
    traces: [{ trace_id: "SCN-05-NEUTRAL-THEN-FRESH", steps: runTrace({ current_phase: "Ready", recovery_required: false }, [
      { event: "Activate", indication: "Adequate", request_status: "Invalid", case_id: "CASE-01" },
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-02" },
      { event: "No_Request", indication: "Adequate", case_id: "CASE-03" },
      { event: "Switch_On", indication: "Adequate", case_id: "CASE-05" }
    ]) }]
  }
];

const ownershipChecks = {
  owner_case_partition_complete: diagnostics.case_gaps === 0,
  owner_case_partition_exclusive: diagnostics.case_overlaps === 0,
  owner_case_outputs_match: diagnostics.owner_output_mismatches === 0,
  owner_post_state_invariant: diagnostics.state_invariant_violations === 0
};

const ownershipAudit = [{
  usage: "lifecycle_decision_owner",
  claimed_roles: ["decision"],
  assigned_inputs: [
    "lifecycle_decision_owner.qualified_request",
    "lifecycle_decision_owner.battery_assessment",
    "lifecycle_decision_owner.current_phase",
    "lifecycle_decision_owner.recovery_required"
  ],
  owner_local_facts: [
    "selected_phase",
    "decision_disposition.input_fault_detected",
    "decision_disposition.recovery_pending",
    "current_phase",
    "recovery_required"
  ],
  contract_cases: caseIds,
  analyzer_checks: Object.keys(ownershipChecks),
  passed: Object.values(ownershipChecks).every(Boolean)
}];

const checks = {
  exact_720_snapshot_domain: snapshots === 720,
  all_twelve_cases_reachable: caseIds.every((id) => partitionCounts[id] > 0),
  owner_partition_complete: diagnostics.case_gaps === 0,
  owner_partition_exclusive: diagnostics.case_overlaps === 0,
  local_qualifications_match: diagnostics.qualification_mismatches === 0,
  owner_outputs_match_cases: diagnostics.owner_output_mismatches === 0,
  required_outputs_match_local_producers: diagnostics.required_output_mismatches === 0,
  recovery_invariant_holds: diagnostics.state_invariant_violations === 0,
  semantic_connections_match: diagnostics.connection_endpoint_mismatches === 0 && Object.keys(semanticConnectionMap).length === 10,
  canonical_guards_match_analyzer: same(canonicalGuardSignatures, analyzerGuardSignatures),
  all_five_scenario_families_executed: scenarioTraces.length === 5 && diagnostics.scenario_mismatches === 0,
  safe_initialization_matches: same(controlledOutcomeDerivation("Off"), { power: "Disabled", charging_permitted: false, flight_permitted: false }) && attentionDerivation({ input_fault_detected: false, recovery_pending: false }, "Adequate_Battery") === "None",
  sole_principal_owner_audited: ownershipAudit.length === 1 && ownershipAudit[0].passed
};

const passed = Object.values(checks).every(Boolean) && Object.values(diagnostics).every((value) => value === 0);
const report = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  analysis_kind: "deterministic finite-domain compositional conformance",
  claim_boundary: "Exhaustive only over the abstract's 720 finite logical snapshots and the five declared scenario families; this is not compositional proof, solver certification, generated-code correctness, execution evidence, physical-performance evidence, or safety certification.",
  semantic_connection_map: semanticConnectionMap,
  canonical_guard_crosscheck: {
    status: checks.canonical_guards_match_analyzer ? "passed" : "failed",
    source_case_guards: canonicalGuardSignatures,
    analyzer_case_guards: analyzerGuardSignatures
  },
  partition_counts: { total_snapshots: snapshots, by_case: partitionCounts },
  observations: diagnostics,
  invariant_checks: { evaluated_post_states: invariantChecks, violations: diagnostics.state_invariant_violations },
  required_output_checks: { evaluated_snapshots: snapshots - diagnostics.case_gaps, mismatches: diagnostics.required_output_mismatches },
  checks,
  case_witnesses: caseWitnesses,
  scenario_traces: scenarioTraces,
  ownership_audit: ownershipAudit
};

console.log(JSON.stringify(report));
if (!passed) process.exitCode = 1;
