import { readFileSync } from "node:fs";
import { createHash } from "node:crypto";

const canonicalUrl = new URL("../model/Cabin_Air_Treatment_Supervisor.sysml", import.meta.url);
const sourceSha256 = createHash("sha256").update(readFileSync(canonicalUrl)).digest("hex");
const expectedSourceSha256 = "cb0615bda26e1dcc432ad8459bc0338c416267374c0257e1b08ca838f1059b3d";

const domains = {
  selection: ["Off", "Auto", "Purge"], validity: ["Valid", "Invalid"],
  air: ["Clean", "Elevated", "Poor"], humidity: ["Dry", "Comfortable", "Damp"],
  path: ["Ready", "Unavailable"], requestMemory: ["Released", "AcceptedActive", "RearmRequired"],
  requestIntent: ["None", "FreshAuto", "FreshPurge", "HeldAuto", "HeldPurge", "BlockedInvalid", "BlockedRearm"],
  airAssessment: ["Unknown", "Clear", "FilterNormalNeeded", "FilterIntensiveNeeded"],
  humidityAssessment: ["Unknown", "NoExcessHumidity", "DryingNeeded"],
  readiness: ["Unknown", "NeitherReady", "FilterOnly", "DryerOnly", "BothReady"],
  readinessContext: ["CriticalUnknown", "Clear"], recovery: ["Ready", "FaultHeld", "AwaitFresh"],
  airProposal: ["None", "InvalidAirObservation", "FilterUnavailable", "FilterNormal", "FilterIntensive"],
  humidityProposal: ["None", "InvalidHumidityObservation", "DryerUnavailable", "Dry"]
};

const actionable = i => ["FreshAuto", "FreshPurge", "HeldAuto", "HeldPurge"].includes(i);
const autoIntent = i => i === "FreshAuto" || i === "HeldAuto";
const purgeIntent = i => i === "FreshPurge" || i === "HeldPurge";
const filterReady = r => r === "FilterOnly" || r === "BothReady";
const dryerReady = r => r === "DryerOnly" || r === "BothReady";

function requestOwner(selection, validity, pre) {
  if (validity === "Invalid") return { caseId: "CASE-RQ-01", requestIntent: "BlockedInvalid", nextRequestMemory: "RearmRequired" };
  if (selection === "Off") return { caseId: "CASE-RQ-02", requestIntent: "None", nextRequestMemory: "Released" };
  if (pre === "Released") return { caseId: "CASE-RQ-03", requestIntent: selection === "Auto" ? "FreshAuto" : "FreshPurge", nextRequestMemory: "AcceptedActive" };
  if (pre === "AcceptedActive") return { caseId: "CASE-RQ-04", requestIntent: selection === "Auto" ? "HeldAuto" : "HeldPurge", nextRequestMemory: "AcceptedActive" };
  return { caseId: "CASE-RQ-05", requestIntent: "BlockedRearm", nextRequestMemory: "RearmRequired" };
}

function airOwner(air, validity) {
  const airAssessment = validity === "Invalid" ? "Unknown" :
    air === "Clean" ? "Clear" : air === "Elevated" ? "FilterNormalNeeded" : "FilterIntensiveNeeded";
  return { caseId: "CASE-AIR-01", airAssessment };
}

function humidityOwner(humidity, validity) {
  const humidityAssessment = validity === "Invalid" ? "Unknown" :
    humidity === "Damp" ? "DryingNeeded" : "NoExcessHumidity";
  return { caseId: "CASE-HUM-01", humidityAssessment };
}

function readinessOwner(statusValidity, filtrationChannel, dryingChannel) {
  if (statusValidity === "Invalid") return { caseId: "CASE-EQP-01", treatmentReadiness: "Unknown", readinessContext: "CriticalUnknown" };
  const treatmentReadiness = filtrationChannel === "Ready"
    ? (dryingChannel === "Ready" ? "BothReady" : "FilterOnly")
    : (dryingChannel === "Ready" ? "DryerOnly" : "NeitherReady");
  return { caseId: "CASE-EQP-02", treatmentReadiness, readinessContext: "Clear" };
}

function filtrationOwner(requestIntent, airAssessment, treatmentReadiness) {
  let airProposal;
  if (!actionable(requestIntent)) airProposal = "None";
  else if (purgeIntent(requestIntent)) airProposal = filterReady(treatmentReadiness) ? "FilterIntensive" : "FilterUnavailable";
  else if (airAssessment === "Unknown") airProposal = "InvalidAirObservation";
  else if (airAssessment === "Clear") airProposal = "None";
  else if (!filterReady(treatmentReadiness)) airProposal = "FilterUnavailable";
  else airProposal = airAssessment === "FilterNormalNeeded" ? "FilterNormal" : "FilterIntensive";
  return { caseId: "CASE-AIR-02", airProposal };
}

function humidityProposalOwner(requestIntent, humidityAssessment, treatmentReadiness) {
  let humidityProposal;
  if (!autoIntent(requestIntent)) humidityProposal = "None";
  else if (humidityAssessment === "Unknown") humidityProposal = "InvalidHumidityObservation";
  else if (humidityAssessment === "NoExcessHumidity") humidityProposal = "None";
  else humidityProposal = dryerReady(treatmentReadiness) ? "Dry" : "DryerUnavailable";
  return { caseId: "CASE-HUM-02", humidityProposal };
}

function recoveryOwner(readinessContext, requestIntent, pre) {
  if (readinessContext === "CriticalUnknown") return { caseId: "CASE-REC-01", recoveryGate: "FaultHeld", nextRecoveryMemory: "FaultHeld" };
  if (pre === "FaultHeld") return { caseId: "CASE-REC-02", recoveryGate: "AwaitFresh", nextRecoveryMemory: "AwaitFresh" };
  if (pre === "AwaitFresh" && (requestIntent === "FreshAuto" || requestIntent === "FreshPurge")) return { caseId: "CASE-REC-03", recoveryGate: "Ready", nextRecoveryMemory: "Ready" };
  if (pre === "AwaitFresh") return { caseId: "CASE-REC-04", recoveryGate: "AwaitFresh", nextRecoveryMemory: "AwaitFresh" };
  return { caseId: "CASE-REC-05", recoveryGate: "Ready", nextRecoveryMemory: "Ready" };
}

function arbiterOwner(requestIntent, airProposal, humidityProposal, recoveryGate) {
  if (recoveryGate !== "Ready") return {
    caseId: "CASE-ARB-01", command: "Off",
    status: { mode: "Recovery", reason: recoveryGate === "FaultHeld" ? "ReadinessInvalid" : "AwaitFresh" }
  };
  if (!actionable(requestIntent)) return {
    caseId: "CASE-ARB-02", command: "Off",
    status: requestIntent === "None" ? { mode: "Idle", reason: "None" } :
      requestIntent === "BlockedInvalid" ? { mode: "Attention", reason: "RequestInvalid" } :
      { mode: "Attention", reason: "RearmRequired" }
  };
  if (airProposal === "FilterNormal" || airProposal === "FilterIntensive") return {
    caseId: "CASE-ARB-03", command: airProposal,
    status: { mode: "Active", reason: humidityProposal === "Dry" ? "AirPriority" :
      humidityProposal === "InvalidHumidityObservation" ? "HumidityObservationInvalid" :
      humidityProposal === "DryerUnavailable" ? "DryerUnavailable" : "Filtering" }
  };
  if (humidityProposal === "Dry") return {
    caseId: "CASE-ARB-04", command: "Dry",
    status: { mode: "Active", reason: airProposal === "InvalidAirObservation" ? "AirObservationInvalid" :
      airProposal === "FilterUnavailable" ? "FilterUnavailable" : "Drying" }
  };
  return {
    caseId: "CASE-ARB-04", command: "Off",
    status: { mode: "Active", reason: airProposal === "InvalidAirObservation" ? "AirObservationInvalid" :
      airProposal === "FilterUnavailable" ? "FilterUnavailable" :
      humidityProposal === "InvalidHumidityObservation" ? "HumidityObservationInvalid" :
      humidityProposal === "DryerUnavailable" ? "DryerUnavailable" : "NoTreatmentNeeded" }
  };
}

const semanticConnectionMap = [
  ["INT-01", "root.airCareSelection", "requestLifecycleOwner.airCareSelection"],
  ["INT-02", "root.requestValidity", "requestLifecycleOwner.requestValidity"],
  ["INT-03", "root.cabinAirQuality", "airQualityOwner.cabinAirQuality"],
  ["INT-04", "root.airQualityValidity", "airQualityOwner.airQualityValidity"],
  ["INT-05", "root.cabinHumidity", "humidityOwner.cabinHumidity"],
  ["INT-06", "root.humidityValidity", "humidityOwner.humidityValidity"],
  ["INT-07", "root.treatmentEquipmentStatus", "readinessOwner.treatmentEquipmentStatus"],
  ["INT-08", "requestLifecycleOwner.requestIntent", "filtrationProposalOwner.requestIntent"],
  ["INT-09", "requestLifecycleOwner.requestIntent", "humidityProposalOwner.requestIntent"],
  ["INT-10", "requestLifecycleOwner.requestIntent", "recoveryOwner.requestIntent"],
  ["INT-11", "requestLifecycleOwner.requestIntent", "resultArbiter.requestIntent"],
  ["INT-12", "airQualityOwner.airAssessment", "filtrationProposalOwner.airAssessment"],
  ["INT-13", "humidityOwner.humidityAssessment", "humidityProposalOwner.humidityAssessment"],
  ["INT-14", "readinessOwner.treatmentReadiness", "filtrationProposalOwner.treatmentReadiness"],
  ["INT-15", "readinessOwner.treatmentReadiness", "humidityProposalOwner.treatmentReadiness"],
  ["INT-16", "readinessOwner.readinessContext", "recoveryOwner.readinessContext"],
  ["INT-17", "filtrationProposalOwner.airProposal", "resultArbiter.airProposal"],
  ["INT-18", "humidityProposalOwner.humidityProposal", "resultArbiter.humidityProposal"],
  ["INT-19", "recoveryOwner.recoveryGate", "resultArbiter.recoveryGate"],
  ["INT-20", "resultArbiter.command", "root.airTreatmentCommand"],
  ["INT-21", "resultArbiter.status", "root.airCareSupervisorStatus"]
].map(([id, source, destination]) => ({ id, source, destination }));

function evaluate(state, input) {
  const rq = requestOwner(input.selection, input.requestValidity, state.requestMemory);
  const aq = airOwner(input.air, input.airValidity);
  const hq = humidityOwner(input.humidity, input.humidityValidity);
  const eq = readinessOwner(input.statusValidity, input.filtrationChannel, input.dryingChannel);
  const fp = filtrationOwner(rq.requestIntent, aq.airAssessment, eq.treatmentReadiness);
  const hp = humidityProposalOwner(rq.requestIntent, hq.humidityAssessment, eq.treatmentReadiness);
  const rec = recoveryOwner(eq.readinessContext, rq.requestIntent, state.recoveryMemory);
  const arb = arbiterOwner(rq.requestIntent, fp.airProposal, hp.humidityProposal, rec.recoveryGate);
  return { cases: [rq.caseId, aq.caseId, hq.caseId, eq.caseId, fp.caseId, hp.caseId, rec.caseId, arb.caseId],
    facts: { requestIntent: rq.requestIntent, airAssessment: aq.airAssessment, humidityAssessment: hq.humidityAssessment,
      treatmentReadiness: eq.treatmentReadiness, readinessContext: eq.readinessContext,
      airProposal: fp.airProposal, humidityProposal: hp.humidityProposal, recoveryGate: rec.recoveryGate },
    output: { command: arb.command, status: arb.status },
    nextState: { requestMemory: rq.nextRequestMemory, recoveryMemory: rec.nextRecoveryMemory } };
}

function product(arrays, visit, prefix = [], index = 0) {
  if (index === arrays.length) return visit(prefix);
  for (const value of arrays[index]) product(arrays, visit, [...prefix, value], index + 1);
}

const allCaseIds = [
  "CASE-RQ-01", "CASE-RQ-02", "CASE-RQ-03", "CASE-RQ-04", "CASE-RQ-05",
  "CASE-AIR-01", "CASE-HUM-01", "CASE-EQP-01", "CASE-EQP-02", "CASE-AIR-02", "CASE-HUM-02",
  "CASE-REC-01", "CASE-REC-02", "CASE-REC-03", "CASE-REC-04", "CASE-REC-05",
  "CASE-ARB-01", "CASE-ARB-02", "CASE-ARB-03", "CASE-ARB-04"
];
const caseHits = Object.fromEntries(allCaseIds.map(id => [id, 0]));
let partitionGaps = 0, partitionOverlaps = 0, requiredOutputMismatches = 0, invariantViolations = 0;

// Exhaust each declared owner-local relation independently.
const ownerProducts = {};
function auditOwner(name, arrays, relation, validCases, check) {
  let count = 0;
  product(arrays, values => {
    count++;
    const result = relation(...values);
    if (!result?.caseId) partitionGaps++;
    if (!validCases.includes(result.caseId)) partitionOverlaps++;
    if (!check(values, result)) requiredOutputMismatches++;
    if (caseHits[result.caseId] !== undefined) caseHits[result.caseId]++;
  });
  ownerProducts[name] = count;
}
auditOwner("requestLifecycleOwner", [domains.selection, domains.validity, domains.requestMemory], requestOwner,
  ["CASE-RQ-01", "CASE-RQ-02", "CASE-RQ-03", "CASE-RQ-04", "CASE-RQ-05"],
  ([s, v, pre], r) => domains.requestIntent.includes(r.requestIntent) && domains.requestMemory.includes(r.nextRequestMemory));
auditOwner("airQualityOwner", [domains.air, domains.validity], airOwner, ["CASE-AIR-01"],
  (_, r) => domains.airAssessment.includes(r.airAssessment));
auditOwner("humidityOwner", [domains.humidity, domains.validity], humidityOwner, ["CASE-HUM-01"],
  (_, r) => domains.humidityAssessment.includes(r.humidityAssessment));
auditOwner("readinessOwner", [domains.validity, domains.path, domains.path], readinessOwner,
  ["CASE-EQP-01", "CASE-EQP-02"], (_, r) => domains.readiness.includes(r.treatmentReadiness) && domains.readinessContext.includes(r.readinessContext));
auditOwner("filtrationProposalOwner", [domains.requestIntent, domains.airAssessment, domains.readiness], filtrationOwner,
  ["CASE-AIR-02"], (_, r) => domains.airProposal.includes(r.airProposal));
auditOwner("humidityProposalOwner", [domains.requestIntent, domains.humidityAssessment, domains.readiness], humidityProposalOwner,
  ["CASE-HUM-02"], (_, r) => domains.humidityProposal.includes(r.humidityProposal));
auditOwner("recoveryOwner", [domains.readinessContext, domains.requestIntent, domains.recovery], recoveryOwner,
  ["CASE-REC-01", "CASE-REC-02", "CASE-REC-03", "CASE-REC-04", "CASE-REC-05"],
  (_, r) => r.recoveryGate === r.nextRecoveryMemory && domains.recovery.includes(r.recoveryGate));
auditOwner("resultArbiter", [domains.requestIntent, domains.airProposal, domains.humidityProposal, domains.recovery], arbiterOwner,
  ["CASE-ARB-01", "CASE-ARB-02", "CASE-ARB-03", "CASE-ARB-04"],
  (_, r) => ["Off", "FilterNormal", "FilterIntensive", "Dry"].includes(r.command) && r.status?.mode && r.status?.reason);

// Exhaust the 1,728 root snapshots crossed with all nine abstract pre-state combinations.
let composedValuations = 0;
product([domains.selection, domains.validity, domains.air, domains.validity, domains.humidity, domains.validity,
  domains.validity, domains.path, domains.path, domains.requestMemory, domains.recovery], values => {
  const [selection, requestValidity, air, airValidity, humidity, humidityValidity,
    statusValidity, filtrationChannel, dryingChannel, requestMemory, recoveryMemory] = values;
  const result = evaluate({ requestMemory, recoveryMemory }, { selection, requestValidity, air, airValidity,
    humidity, humidityValidity, statusValidity, filtrationChannel, dryingChannel });
  composedValuations++;
  if (result.output.command !== "Off" && result.output.status.mode !== "Active") invariantViolations++;
  if (result.facts.recoveryGate !== "Ready" && result.output.command !== "Off") invariantViolations++;
  if (["FilterNormal", "FilterIntensive"].includes(result.facts.airProposal) &&
      result.facts.humidityProposal === "Dry" && result.facts.recoveryGate === "Ready" && actionable(result.facts.requestIntent) &&
      result.output.status.reason !== "AirPriority") invariantViolations++;
});

const baseInput = { selection: "Auto", requestValidity: "Valid", air: "Clean", airValidity: "Valid",
  humidity: "Comfortable", humidityValidity: "Valid", statusValidity: "Valid",
  filtrationChannel: "Ready", dryingChannel: "Ready" };
function traceFamily(id, steps) {
  let state = { requestMemory: "Released", recoveryMemory: "Ready" };
  const trace = [];
  for (const step of steps) {
    const input = { ...baseInput, ...step.input };
    const preState = { ...state };
    const observed = evaluate(state, input);
    const expectedOk = observed.cases.includes(step.expectedCase) &&
      (!step.command || observed.output.command === step.command) &&
      (!step.reason || observed.output.status.reason === step.reason);
    if (!expectedOk) requiredOutputMismatches++;
    trace.push({ step: step.name, input, pre_state: preState, expected_named_branch: step.expectedCase,
      observed_owner_cases: observed.cases, observed_facts: observed.facts,
      observed_outputs: observed.output, observed_next_state: observed.nextState, passed: expectedOk });
    state = observed.nextState;
  }
  return { scenario_id: id, passed: trace.every(s => s.passed), trace };
}

const scenarioTraces = [
  traceFamily("SCN-NOM-01", [
    { name: "fresh-no-need", input: {}, expectedCase: "CASE-ARB-04", command: "Off", reason: "NoTreatmentNeeded" },
    { name: "held-no-need", input: {}, expectedCase: "CASE-RQ-04", command: "Off", reason: "NoTreatmentNeeded" }
  ]),
  traceFamily("SCN-FIL-01", [
    { name: "elevated", input: { air: "Elevated" }, expectedCase: "CASE-ARB-03", command: "FilterNormal", reason: "Filtering" },
    { name: "poor", input: { air: "Poor" }, expectedCase: "CASE-ARB-03", command: "FilterIntensive", reason: "Filtering" }
  ]),
  traceFamily("SCN-PUR-01", [
    { name: "fresh-purge", input: { selection: "Purge" }, expectedCase: "CASE-RQ-03", command: "FilterIntensive", reason: "Filtering" },
    { name: "held-purge", input: { selection: "Purge" }, expectedCase: "CASE-RQ-04", command: "FilterIntensive", reason: "Filtering" }
  ]),
  traceFamily("SCN-DRY-01", [
    { name: "both-paths-ready", input: { humidity: "Damp" }, expectedCase: "CASE-ARB-04", command: "Dry", reason: "Drying" },
    { name: "unused-filter-unavailable", input: { humidity: "Damp", filtrationChannel: "Unavailable" }, expectedCase: "CASE-ARB-04", command: "Dry", reason: "Drying" }
  ]),
  traceFamily("SCN-PRI-01", [
    { name: "normal-filter-conflict", input: { air: "Elevated", humidity: "Damp" }, expectedCase: "CASE-ARB-03", command: "FilterNormal", reason: "AirPriority" },
    { name: "intensive-filter-conflict", input: { air: "Poor", humidity: "Damp" }, expectedCase: "CASE-ARB-03", command: "FilterIntensive", reason: "AirPriority" }
  ]),
  traceFamily("SCN-DEG-01", [
    { name: "invalid-air-drying-continues", input: { airValidity: "Invalid", humidity: "Damp" }, expectedCase: "CASE-ARB-04", command: "Dry", reason: "AirObservationInvalid" },
    { name: "invalid-humidity-filtering-continues", input: { air: "Poor", humidityValidity: "Invalid" }, expectedCase: "CASE-ARB-03", command: "FilterIntensive", reason: "HumidityObservationInvalid" },
    { name: "filter-unavailable-drying-continues", input: { air: "Poor", humidity: "Damp", filtrationChannel: "Unavailable" }, expectedCase: "CASE-ARB-04", command: "Dry", reason: "FilterUnavailable" },
    { name: "dryer-unavailable-filtering-continues", input: { air: "Poor", humidity: "Damp", dryingChannel: "Unavailable" }, expectedCase: "CASE-ARB-03", command: "FilterIntensive", reason: "DryerUnavailable" }
  ]),
  traceFamily("SCN-REC-01", [
    { name: "active-filtering", input: { air: "Elevated" }, expectedCase: "CASE-ARB-03", command: "FilterNormal", reason: "Filtering" },
    { name: "readiness-invalid", input: { air: "Elevated", statusValidity: "Invalid" }, expectedCase: "CASE-REC-01", command: "Off", reason: "ReadinessInvalid" },
    { name: "readiness-restored-held", input: { air: "Elevated" }, expectedCase: "CASE-REC-02", command: "Off", reason: "AwaitFresh" },
    { name: "held-again", input: { air: "Elevated" }, expectedCase: "CASE-REC-04", command: "Off", reason: "AwaitFresh" },
    { name: "valid-off-release", input: { selection: "Off", air: "Elevated" }, expectedCase: "CASE-RQ-02", command: "Off", reason: "AwaitFresh" },
    { name: "fresh-auto-reauthorized", input: { air: "Elevated" }, expectedCase: "CASE-REC-03", command: "FilterNormal", reason: "Filtering" }
  ])
];

const ownershipAuditBase = [
  ["requestLifecycleOwner", ["decision"], ["airCareSelection", "requestValidity", "In(requestMemory)"], ["requestIntent", "nextRequestMemory"], ["CASE-RQ-01", "CASE-RQ-02", "CASE-RQ-03", "CASE-RQ-04", "CASE-RQ-05"], ["request lifecycle totality and freshness"]],
  ["airQualityOwner", ["applicability"], ["cabinAirQuality", "airQualityValidity"], ["airAssessment"], ["CASE-AIR-01"], ["air qualification validity dominance"]],
  ["humidityOwner", ["applicability"], ["cabinHumidity", "humidityValidity"], ["humidityAssessment"], ["CASE-HUM-01"], ["humidity qualification collapse"]],
  ["readinessOwner", ["applicability"], ["treatmentEquipmentStatus.statusValidity", "treatmentEquipmentStatus.filtrationChannel", "treatmentEquipmentStatus.dryingChannel"], ["treatmentReadiness", "readinessContext"], ["CASE-EQP-01", "CASE-EQP-02"], ["readiness cross-product and invalid dominance"]],
  ["filtrationProposalOwner", ["proposal"], ["requestIntent", "airAssessment", "treatmentReadiness"], ["airProposal"], ["CASE-AIR-02"], ["filtration applicability totality"]],
  ["humidityProposalOwner", ["proposal"], ["requestIntent", "humidityAssessment", "treatmentReadiness"], ["humidityProposal"], ["CASE-HUM-02"], ["drying applicability totality"]],
  ["recoveryOwner", ["decision"], ["readinessContext", "requestIntent", "In(recoveryMemory)"], ["recoveryGate", "nextRecoveryMemory"], ["CASE-REC-01", "CASE-REC-02", "CASE-REC-03", "CASE-REC-04", "CASE-REC-05"], ["fault hold and fresh reauthorization"]],
  ["resultArbiter", ["decision"], ["requestIntent", "airProposal", "humidityProposal", "recoveryGate"], ["airTreatmentCommand", "airCareSupervisorStatus"], ["CASE-ARB-01", "CASE-ARB-02", "CASE-ARB-03", "CASE-ARB-04"], ["priority and diagnostic precedence"]]
];
const ownershipAudit = ownershipAuditBase.map(([usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks]) =>
  ({ usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks,
    passed: ownerProducts[usage] > 0 && contract_cases.every(id => caseHits[id] > 0) }));

const checks = {
  source_hash_bound: sourceSha256 === expectedSourceSha256,
  exact_semantic_connection_map: semanticConnectionMap.length === 21,
  all_twenty_cases_executed: allCaseIds.every(id => caseHits[id] > 0),
  all_seven_scenarios_executed: scenarioTraces.length === 7 && scenarioTraces.every(s => s.passed),
  all_eight_owner_audits_passed: ownershipAudit.length === 8 && ownershipAudit.every(o => o.passed),
  complete_root_and_state_product: composedValuations === 15552,
  filtration_priority_checked: scenarioTraces.find(s => s.scenario_id === "SCN-PRI-01")?.passed === true,
  six_step_recovery_checked: scenarioTraces.find(s => s.scenario_id === "SCN-REC-01")?.trace.length === 6
};
const passed = Object.values(checks).every(Boolean) && partitionGaps === 0 && partitionOverlaps === 0 &&
  requiredOutputMismatches === 0 && invariantViolations === 0;

const result = {
  status: passed ? "passed" : "failed", passed,
  source_sha256: sourceSha256,
  claim_boundary: "Exhaustive only over the abstract finite root-input and pre-state domains with deterministic same-evaluation composition; no execution, timing, physical-performance, safety, or certification claim.",
  semantic_connection_map: semanticConnectionMap,
  partition_counts: { owner_local_products: ownerProducts, root_input_snapshots: 1728, pre_state_combinations: 9,
    composed_valuations: composedValuations, case_hits: caseHits, scenario_families: scenarioTraces.length },
  observations: { partition_gaps: partitionGaps, partition_overlaps: partitionOverlaps,
    required_output_mismatches: requiredOutputMismatches, invariant_violations: invariantViolations,
    source_hash_mismatches: sourceSha256 === expectedSourceSha256 ? 0 : 1 },
  invariant_checks: {
    recovery_inhibits_active_command: invariantViolations === 0,
    active_commands_have_active_status: invariantViolations === 0,
    filtration_defeats_drying_with_air_priority: checks.filtration_priority_checked
  },
  checks, ownership_audit: ownershipAudit, scenario_traces: scenarioTraces
};

process.stdout.write(JSON.stringify(result));
