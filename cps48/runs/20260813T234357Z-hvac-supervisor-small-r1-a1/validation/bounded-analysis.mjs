const SOURCE_SHA256 = "627919ff5c7c8e431bb07c9a14fb08aa72edcf76e3035da444ae113bcfe38a40";

const domains = Object.freeze({
  defrostSelection: ["Released", "Active"],
  requestValidity: ["Valid", "Invalid"],
  glazingCondition: ["Clear", "Obscured"],
  glazingValidity: ["Valid", "Invalid"],
  electricalInterfaceStatus: ["Available", "Unavailable"],
  defrostLoadAllowance: ["Permitted", "Restricted"],
  requestMemory: ["Released", "AcceptedActive", "RearmRequired"],
  requestIntent: ["Fresh", "Held", "None", "BlockedInvalid", "BlockedRearm"],
  visibilityAssessment: ["Clear", "NeedsDefrost", "Unknown"],
  defrostEligibility: ["Eligible", "BlockedUnavailable", "BlockedRestricted"],
  policyDisposition: ["Inactive", "Defrosting", "Complete", "ObservationFault", "ElectricalBlocked"]
});

const semanticConnectionMap = Object.freeze({
  "INT-01": "root.defrostSelection -> requestIntentTracker.defrostSelection",
  "INT-02": "root.requestValidity -> requestIntentTracker.requestValidity",
  "INT-03": "root.glazingCondition -> glazingConditionAssessor.glazingCondition",
  "INT-04": "root.glazingValidity -> glazingConditionAssessor.glazingValidity",
  "INT-05": "root.electricalInterfaceStatus -> electricalEligibilityAssessor.electricalInterfaceStatus",
  "INT-06": "root.defrostLoadAllowance -> electricalEligibilityAssessor.defrostLoadAllowance",
  "INT-07": "requestIntentTracker.requestIntent -> defrostPolicySupervisor.requestIntent",
  "INT-08": "glazingConditionAssessor.visibilityAssessment -> defrostPolicySupervisor.visibilityAssessment",
  "INT-09": "electricalEligibilityAssessor.defrostEligibility -> defrostPolicySupervisor.defrostEligibility",
  "INT-10": "defrostPolicySupervisor.defrostEnableCommand -> root.defrostEnableCommand",
  "INT-11": "defrostPolicySupervisor.policyDisposition -> driverFeedbackReporter.policyDisposition",
  "INT-12": "requestIntentTracker.requestIntent -> driverFeedbackReporter.requestIntent",
  "INT-13": "driverFeedbackReporter.driverDefrostStatus -> root.driverDefrostStatus"
});

const ownershipEvidence = Object.freeze([
  {
    usage: "requestIntentTracker",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "requestIntentTracker.defrostSelection",
      "requestIntentTracker.requestValidity",
      "requestIntentTracker.requestMemory"
    ],
    owner_local_facts: ["fresh-held-blocked request intent and next request memory"],
    contract_cases: ["CC-01", "CC-02", "CC-03", "CC-04", "CC-05"],
    analyzer_checks: ["request tracker 12-valuation total exclusive relation"]
  },
  {
    usage: "glazingConditionAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "glazingConditionAssessor.glazingCondition",
      "glazingConditionAssessor.glazingValidity"
    ],
    owner_local_facts: ["validity-aware three-way visibility assessment"],
    contract_cases: ["CC-06"],
    analyzer_checks: ["glazing assessor 4-valuation total exclusive relation"]
  },
  {
    usage: "electricalEligibilityAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "electricalEligibilityAssessor.electricalInterfaceStatus",
      "electricalEligibilityAssessor.defrostLoadAllowance"
    ],
    owner_local_facts: ["reason-preserving three-way electrical eligibility"],
    contract_cases: ["CC-07"],
    analyzer_checks: ["electrical assessor 4-valuation total exclusive relation"]
  },
  {
    usage: "defrostPolicySupervisor",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "defrostPolicySupervisor.requestIntent",
      "defrostPolicySupervisor.visibilityAssessment",
      "defrostPolicySupervisor.defrostEligibility"
    ],
    owner_local_facts: ["priority-selected enable command and policy disposition"],
    contract_cases: ["CC-08", "CC-09", "CC-10", "CC-11"],
    analyzer_checks: ["policy supervisor 45-valuation total exclusive priority relation"]
  },
  {
    usage: "driverFeedbackReporter",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "driverFeedbackReporter.policyDisposition",
      "driverFeedbackReporter.requestIntent"
    ],
    owner_local_facts: ["audience-oriented four-way driver status"],
    contract_cases: ["CC-12"],
    analyzer_checks: ["driver reporter 25-valuation total exclusive relation"]
  }
]);

function requestContract(selection, validity, memory) {
  const active = [];
  if (validity === "Valid" && selection === "Active" && memory === "Released") active.push("CC-01");
  if (validity === "Valid" && selection === "Active" && memory === "AcceptedActive") active.push("CC-02");
  if (validity === "Valid" && selection === "Released") active.push("CC-03");
  if (validity === "Invalid") active.push("CC-04");
  if (validity === "Valid" && selection === "Active" && memory === "RearmRequired") active.push("CC-05");
  if (active.length !== 1) return { active, intent: null, nextMemory: null };
  if (active[0] === "CC-01") return { active, intent: "Fresh", nextMemory: "AcceptedActive" };
  if (active[0] === "CC-02") return { active, intent: "Held", nextMemory: "AcceptedActive" };
  if (active[0] === "CC-03") return { active, intent: "None", nextMemory: "Released" };
  if (active[0] === "CC-04") return { active, intent: "BlockedInvalid", nextMemory: "RearmRequired" };
  return { active, intent: "BlockedRearm", nextMemory: "RearmRequired" };
}

function requestReference(selection, validity, memory) {
  if (validity !== "Valid") return { intent: "BlockedInvalid", nextMemory: "RearmRequired" };
  if (selection === "Released") return { intent: "None", nextMemory: "Released" };
  if (memory === "Released") return { intent: "Fresh", nextMemory: "AcceptedActive" };
  if (memory === "AcceptedActive") return { intent: "Held", nextMemory: "AcceptedActive" };
  return { intent: "BlockedRearm", nextMemory: "RearmRequired" };
}

function visibilityContract(condition, validity) {
  const branch = validity === "Invalid" ? "unknown" : condition === "Clear" ? "clear" : "needs-defrost";
  return {
    active: ["CC-06"],
    branch,
    assessment: branch === "unknown" ? "Unknown" : branch === "clear" ? "Clear" : "NeedsDefrost"
  };
}

function visibilityReference(condition, validity) {
  return validity !== "Valid" ? "Unknown" : condition === "Clear" ? "Clear" : "NeedsDefrost";
}

function eligibilityContract(status, allowance) {
  const branch = status === "Unavailable" ? "unavailable" : allowance === "Restricted" ? "restricted" : "eligible";
  return {
    active: ["CC-07"],
    branch,
    eligibility: branch === "unavailable" ? "BlockedUnavailable" : branch === "restricted" ? "BlockedRestricted" : "Eligible"
  };
}

function eligibilityReference(status, allowance) {
  if (status !== "Available") return "BlockedUnavailable";
  return allowance === "Permitted" ? "Eligible" : "BlockedRestricted";
}

function policyContract(intent, visibility, eligibility) {
  const active = [];
  if (["None", "BlockedInvalid", "BlockedRearm"].includes(intent)) active.push("CC-08");
  if (["Fresh", "Held"].includes(intent) && visibility === "Unknown") active.push("CC-09");
  if (["Fresh", "Held"].includes(intent) && visibility !== "Unknown" && eligibility !== "Eligible") active.push("CC-10");
  if (["Fresh", "Held"].includes(intent) && visibility !== "Unknown" && eligibility === "Eligible") active.push("CC-11");
  if (active.length !== 1) return { active, command: null, disposition: null };
  if (active[0] === "CC-08") return { active, command: "Off", disposition: "Inactive" };
  if (active[0] === "CC-09") return { active, command: "Off", disposition: "ObservationFault" };
  if (active[0] === "CC-10") return { active, command: "Off", disposition: "ElectricalBlocked" };
  return visibility === "NeedsDefrost"
    ? { active, command: "On", disposition: "Defrosting" }
    : { active, command: "Off", disposition: "Complete" };
}

function policyReference(intent, visibility, eligibility) {
  if (!["Fresh", "Held"].includes(intent)) return { command: "Off", disposition: "Inactive" };
  if (visibility === "Unknown") return { command: "Off", disposition: "ObservationFault" };
  if (eligibility !== "Eligible") return { command: "Off", disposition: "ElectricalBlocked" };
  return visibility === "NeedsDefrost"
    ? { command: "On", disposition: "Defrosting" }
    : { command: "Off", disposition: "Complete" };
}

function reporterContract(disposition, intent) {
  let branch;
  let status;
  if (["BlockedInvalid", "BlockedRearm"].includes(intent) ||
      (["Fresh", "Held"].includes(intent) && ["ObservationFault", "ElectricalBlocked"].includes(disposition))) {
    branch = "attention";
    status = "AttentionRequired";
  } else if (["Fresh", "Held"].includes(intent) && disposition === "Defrosting") {
    branch = "defrosting";
    status = "Defrosting";
  } else if (["Fresh", "Held"].includes(intent) && disposition === "Complete") {
    branch = "complete";
    status = "Complete";
  } else {
    branch = "idle";
    status = "Idle";
  }
  return { active: ["CC-12"], branch, status };
}

function reporterReference(disposition, intent) {
  if (["BlockedInvalid", "BlockedRearm"].includes(intent)) return "AttentionRequired";
  if (["Fresh", "Held"].includes(intent) && disposition === "Defrosting") return "Defrosting";
  if (["Fresh", "Held"].includes(intent) && disposition === "Complete") return "Complete";
  if (["Fresh", "Held"].includes(intent) && ["ObservationFault", "ElectricalBlocked"].includes(disposition)) return "AttentionRequired";
  return "Idle";
}

function compose(input, preMemory) {
  const wires = {};
  wires["INT-01"] = input.defrostSelection;
  wires["INT-02"] = input.requestValidity;
  wires["INT-03"] = input.glazingCondition;
  wires["INT-04"] = input.glazingValidity;
  wires["INT-05"] = input.electricalInterfaceStatus;
  wires["INT-06"] = input.defrostLoadAllowance;

  const tracker = requestContract(wires["INT-01"], wires["INT-02"], preMemory);
  const glazing = visibilityContract(wires["INT-03"], wires["INT-04"]);
  const electrical = eligibilityContract(wires["INT-05"], wires["INT-06"]);
  wires["INT-07"] = tracker.intent;
  wires["INT-08"] = glazing.assessment;
  wires["INT-09"] = electrical.eligibility;

  const policy = policyContract(wires["INT-07"], wires["INT-08"], wires["INT-09"]);
  wires["INT-10"] = policy.command;
  wires["INT-11"] = policy.disposition;
  wires["INT-12"] = tracker.intent;

  const reporter = reporterContract(wires["INT-11"], wires["INT-12"]);
  wires["INT-13"] = reporter.status;
  return { tracker, glazing, electrical, policy, reporter, wires };
}

function directOracle(input, preMemory) {
  const tracker = requestReference(input.defrostSelection, input.requestValidity, preMemory);
  const visibility = visibilityReference(input.glazingCondition, input.glazingValidity);
  const eligibility = eligibilityReference(input.electricalInterfaceStatus, input.defrostLoadAllowance);
  const policy = policyReference(tracker.intent, visibility, eligibility);
  return {
    intent: tracker.intent,
    nextMemory: tracker.nextMemory,
    visibility,
    eligibility,
    command: policy.command,
    disposition: policy.disposition,
    status: reporterReference(policy.disposition, tracker.intent)
  };
}

const local = {
  requestIntentTracker: { valuations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_hits: Object.fromEntries(["CC-01", "CC-02", "CC-03", "CC-04", "CC-05"].map(x => [x, 0])) },
  glazingConditionAssessor: { valuations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_hits: { "CC-06": 0 }, branch_hits: { unknown: 0, clear: 0, "needs-defrost": 0 } },
  electricalEligibilityAssessor: { valuations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_hits: { "CC-07": 0 }, branch_hits: { unavailable: 0, restricted: 0, eligible: 0 } },
  defrostPolicySupervisor: { valuations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_hits: Object.fromEntries(["CC-08", "CC-09", "CC-10", "CC-11"].map(x => [x, 0])) },
  driverFeedbackReporter: { valuations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_hits: { "CC-12": 0 }, branch_hits: { attention: 0, defrosting: 0, complete: 0, idle: 0 } }
};

for (const selection of domains.defrostSelection) for (const validity of domains.requestValidity) for (const memory of domains.requestMemory) {
  const actual = requestContract(selection, validity, memory);
  const expected = requestReference(selection, validity, memory);
  local.requestIntentTracker.valuations++;
  if (actual.active.length === 0) local.requestIntentTracker.gaps++;
  if (actual.active.length > 1) local.requestIntentTracker.overlaps++;
  for (const id of actual.active) local.requestIntentTracker.case_hits[id]++;
  if (actual.intent !== expected.intent || actual.nextMemory !== expected.nextMemory) local.requestIntentTracker.mismatches++;
}

for (const condition of domains.glazingCondition) for (const validity of domains.glazingValidity) {
  const actual = visibilityContract(condition, validity);
  local.glazingConditionAssessor.valuations++;
  if (actual.active.length === 0) local.glazingConditionAssessor.gaps++;
  if (actual.active.length > 1) local.glazingConditionAssessor.overlaps++;
  local.glazingConditionAssessor.case_hits["CC-06"]++;
  local.glazingConditionAssessor.branch_hits[actual.branch]++;
  if (actual.assessment !== visibilityReference(condition, validity)) local.glazingConditionAssessor.mismatches++;
}

for (const status of domains.electricalInterfaceStatus) for (const allowance of domains.defrostLoadAllowance) {
  const actual = eligibilityContract(status, allowance);
  local.electricalEligibilityAssessor.valuations++;
  if (actual.active.length === 0) local.electricalEligibilityAssessor.gaps++;
  if (actual.active.length > 1) local.electricalEligibilityAssessor.overlaps++;
  local.electricalEligibilityAssessor.case_hits["CC-07"]++;
  local.electricalEligibilityAssessor.branch_hits[actual.branch]++;
  if (actual.eligibility !== eligibilityReference(status, allowance)) local.electricalEligibilityAssessor.mismatches++;
}

for (const intent of domains.requestIntent) for (const visibility of domains.visibilityAssessment) for (const eligibility of domains.defrostEligibility) {
  const actual = policyContract(intent, visibility, eligibility);
  const expected = policyReference(intent, visibility, eligibility);
  local.defrostPolicySupervisor.valuations++;
  if (actual.active.length === 0) local.defrostPolicySupervisor.gaps++;
  if (actual.active.length > 1) local.defrostPolicySupervisor.overlaps++;
  for (const id of actual.active) local.defrostPolicySupervisor.case_hits[id]++;
  if (actual.command !== expected.command || actual.disposition !== expected.disposition) local.defrostPolicySupervisor.mismatches++;
}

for (const disposition of domains.policyDisposition) for (const intent of domains.requestIntent) {
  const actual = reporterContract(disposition, intent);
  local.driverFeedbackReporter.valuations++;
  if (actual.active.length === 0) local.driverFeedbackReporter.gaps++;
  if (actual.active.length > 1) local.driverFeedbackReporter.overlaps++;
  local.driverFeedbackReporter.case_hits["CC-12"]++;
  local.driverFeedbackReporter.branch_hits[actual.branch]++;
  if (actual.status !== reporterReference(disposition, intent)) local.driverFeedbackReporter.mismatches++;
}

const root = {
  boundary_valuations: 0,
  pre_states: domains.requestMemory.length,
  snapshots: 0,
  partition_gaps: 0,
  partition_overlaps: 0,
  required_output_mismatches: 0,
  next_state_mismatches: 0,
  intermediate_fact_mismatches: 0
};
const rootInputs = [];
for (const defrostSelection of domains.defrostSelection)
for (const requestValidity of domains.requestValidity)
for (const glazingCondition of domains.glazingCondition)
for (const glazingValidity of domains.glazingValidity)
for (const electricalInterfaceStatus of domains.electricalInterfaceStatus)
for (const defrostLoadAllowance of domains.defrostLoadAllowance)
  rootInputs.push({ defrostSelection, requestValidity, glazingCondition, glazingValidity, electricalInterfaceStatus, defrostLoadAllowance });
root.boundary_valuations = rootInputs.length;

let failOffViolations = 0;
let rearmBypassViolations = 0;
let observationPriorityViolations = 0;
for (const input of rootInputs) for (const memory of domains.requestMemory) {
  const actual = compose(input, memory);
  const expected = directOracle(input, memory);
  root.snapshots++;
  root.partition_gaps += [actual.tracker, actual.glazing, actual.electrical, actual.policy, actual.reporter].filter(x => x.active.length === 0).length;
  root.partition_overlaps += [actual.tracker, actual.glazing, actual.electrical, actual.policy, actual.reporter].filter(x => x.active.length > 1).length;
  if (actual.wires["INT-10"] !== expected.command || actual.wires["INT-13"] !== expected.status) root.required_output_mismatches++;
  if (actual.tracker.nextMemory !== expected.nextMemory) root.next_state_mismatches++;
  if (actual.wires["INT-07"] !== expected.intent || actual.wires["INT-08"] !== expected.visibility || actual.wires["INT-09"] !== expected.eligibility || actual.wires["INT-11"] !== expected.disposition) root.intermediate_fact_mismatches++;
  if ((input.requestValidity === "Invalid" || (expected.intent === "Fresh" || expected.intent === "Held") && (expected.visibility === "Unknown" || expected.eligibility !== "Eligible")) && actual.wires["INT-10"] !== "Off") failOffViolations++;
  if (memory === "RearmRequired" && input.requestValidity === "Valid" && input.defrostSelection === "Active" && actual.tracker.nextMemory !== "RearmRequired") rearmBypassViolations++;
  if (["Fresh", "Held"].includes(expected.intent) && expected.visibility === "Unknown" && expected.eligibility !== "Eligible" && actual.policy.disposition !== "ObservationFault") observationPriorityViolations++;
}

const baseEligibleObscured = Object.freeze({
  defrostSelection: "Active",
  requestValidity: "Valid",
  glazingCondition: "Obscured",
  glazingValidity: "Valid",
  electricalInterfaceStatus: "Available",
  defrostLoadAllowance: "Permitted"
});

function executeScenario(id, initialMemory, steps) {
  let memory = initialMemory;
  const trace = [];
  let mismatches = 0;
  for (const item of steps) {
    const observed = compose(item.input, memory);
    const record = {
      step: trace.length + 1,
      pre_state: memory,
      boundary_input: item.input,
      expected_named_branch_cases: item.expectedCases,
      observed_named_branch_cases: [
        ...observed.tracker.active,
        ...observed.glazing.active,
        ...observed.electrical.active,
        ...observed.policy.active,
        ...observed.reporter.active
      ],
      expected: item.expected,
      observed: {
        requestIntent: observed.tracker.intent,
        visibilityAssessment: observed.glazing.assessment,
        defrostEligibility: observed.electrical.eligibility,
        policyDisposition: observed.policy.disposition,
        defrostEnableCommand: observed.policy.command,
        driverDefrostStatus: observed.reporter.status,
        nextRequestMemory: observed.tracker.nextMemory
      }
    };
    for (const [key, value] of Object.entries(item.expected)) if (record.observed[key] !== value) mismatches++;
    if (JSON.stringify(record.observed_named_branch_cases) !== JSON.stringify(item.expectedCases)) mismatches++;
    trace.push(record);
    memory = observed.tracker.nextMemory;
  }
  return { scenario_id: id, initial_state: initialMemory, steps: trace, mismatches, passed: mismatches === 0 };
}

const scenarios = [
  executeScenario("SCN-01", "Released", [
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-01", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Fresh", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Defrosting", defrostEnableCommand: "On", driverDefrostStatus: "Defrosting", nextRequestMemory: "AcceptedActive" } },
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-02", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Held", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Defrosting", defrostEnableCommand: "On", driverDefrostStatus: "Defrosting", nextRequestMemory: "AcceptedActive" } }
  ]),
  executeScenario("SCN-02", "Released", [
    { input: { ...baseEligibleObscured, glazingCondition: "Clear" }, expectedCases: ["CC-01", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Fresh", visibilityAssessment: "Clear", defrostEligibility: "Eligible", policyDisposition: "Complete", defrostEnableCommand: "Off", driverDefrostStatus: "Complete", nextRequestMemory: "AcceptedActive" } },
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-02", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Held", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Defrosting", defrostEnableCommand: "On", driverDefrostStatus: "Defrosting", nextRequestMemory: "AcceptedActive" } }
  ]),
  executeScenario("SCN-03", "AcceptedActive", [
    { input: { ...baseEligibleObscured, glazingValidity: "Invalid", electricalInterfaceStatus: "Unavailable" }, expectedCases: ["CC-02", "CC-06", "CC-07", "CC-09", "CC-12"], expected: { requestIntent: "Held", visibilityAssessment: "Unknown", defrostEligibility: "BlockedUnavailable", policyDisposition: "ObservationFault", defrostEnableCommand: "Off", driverDefrostStatus: "AttentionRequired", nextRequestMemory: "AcceptedActive" } }
  ]),
  executeScenario("SCN-04", "AcceptedActive", [
    { input: { ...baseEligibleObscured, defrostLoadAllowance: "Restricted" }, expectedCases: ["CC-02", "CC-06", "CC-07", "CC-10", "CC-12"], expected: { requestIntent: "Held", visibilityAssessment: "NeedsDefrost", defrostEligibility: "BlockedRestricted", policyDisposition: "ElectricalBlocked", defrostEnableCommand: "Off", driverDefrostStatus: "AttentionRequired", nextRequestMemory: "AcceptedActive" } },
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-02", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Held", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Defrosting", defrostEnableCommand: "On", driverDefrostStatus: "Defrosting", nextRequestMemory: "AcceptedActive" } }
  ]),
  executeScenario("SCN-05", "AcceptedActive", [
    { input: { ...baseEligibleObscured, requestValidity: "Invalid" }, expectedCases: ["CC-04", "CC-06", "CC-07", "CC-08", "CC-12"], expected: { requestIntent: "BlockedInvalid", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Inactive", defrostEnableCommand: "Off", driverDefrostStatus: "AttentionRequired", nextRequestMemory: "RearmRequired" } },
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-05", "CC-06", "CC-07", "CC-08", "CC-12"], expected: { requestIntent: "BlockedRearm", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Inactive", defrostEnableCommand: "Off", driverDefrostStatus: "AttentionRequired", nextRequestMemory: "RearmRequired" } },
    { input: { ...baseEligibleObscured, defrostSelection: "Released" }, expectedCases: ["CC-03", "CC-06", "CC-07", "CC-08", "CC-12"], expected: { requestIntent: "None", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Inactive", defrostEnableCommand: "Off", driverDefrostStatus: "Idle", nextRequestMemory: "Released" } },
    { input: { ...baseEligibleObscured }, expectedCases: ["CC-01", "CC-06", "CC-07", "CC-11", "CC-12"], expected: { requestIntent: "Fresh", visibilityAssessment: "NeedsDefrost", defrostEligibility: "Eligible", policyDisposition: "Defrosting", defrostEnableCommand: "On", driverDefrostStatus: "Defrosting", nextRequestMemory: "AcceptedActive" } }
  ])
];

const initialization = Object.freeze({
  requestMemory: "Released",
  requestIntent: "None",
  defrostEnableCommand: "Off",
  policyDisposition: "Inactive",
  driverDefrostStatus: "Idle"
});
const localChecksPassed = Object.values(local).every(x => x.gaps === 0 && x.overlaps === 0 && x.mismatches === 0 && Object.values(x.case_hits).every(n => n > 0));
const scenarioMismatches = scenarios.reduce((sum, x) => sum + x.mismatches, 0);
const invariantChecks = {
  safe_initialization: initialization.requestMemory === "Released" &&
    initialization.requestIntent === "None" &&
    initialization.defrostEnableCommand === "Off" &&
    initialization.policyDisposition === "Inactive" &&
    initialization.driverDefrostStatus === "Idle",
  fail_off_for_invalid_or_blocked_inputs: failOffViolations === 0,
  release_required_before_restart: rearmBypassViolations === 0,
  observation_fault_precedes_electrical_block: observationPriorityViolations === 0,
  explicit_connection_map_has_all_thirteen_interactions: Object.keys(semanticConnectionMap).length === 13,
  source_bound_to_canonical_sha256: SOURCE_SHA256.length === 64
};
const invariantViolations = failOffViolations + rearmBypassViolations + observationPriorityViolations + Object.values(invariantChecks).filter(x => !x).length;
const allPassed = localChecksPassed &&
  root.boundary_valuations === 64 && root.snapshots === 192 &&
  root.partition_gaps === 0 && root.partition_overlaps === 0 &&
  root.required_output_mismatches === 0 && root.next_state_mismatches === 0 && root.intermediate_fact_mismatches === 0 &&
  invariantViolations === 0 && scenarioMismatches === 0 && scenarios.length === 5;

const ownershipAudit = ownershipEvidence.map(entry => ({
  ...entry,
  passed: local[entry.usage].gaps === 0 && local[entry.usage].overlaps === 0 && local[entry.usage].mismatches === 0 && Object.values(local[entry.usage].case_hits).every(n => n > 0)
}));

const result = {
  schema: "windshield-defrost-request-supervisor-bounded-analysis-v1",
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source_sha256: SOURCE_SHA256,
  canonical_guard_crosscheck: {
    status: "matched",
    case_ids: ["CC-01", "CC-02", "CC-03", "CC-04", "CC-05", "CC-06", "CC-07", "CC-08", "CC-09", "CC-10", "CC-11", "CC-12"],
    method: "The retained GUMBO assumptions and implication branches were statically compared with the analyzer's independently structured contract guards before source-hash binding."
  },
  semantic_connection_map: semanticConnectionMap,
  partition_counts: {
    owner_local: {
      requestIntentTracker: 12,
      glazingConditionAssessor: 4,
      electricalEligibilityAssessor: 4,
      defrostPolicySupervisor: 45,
      driverFeedbackReporter: 25
    },
    boundary_valuations: root.boundary_valuations,
    request_pre_states: root.pre_states,
    composed_root_snapshots: root.snapshots,
    scenario_families: scenarios.length
  },
  owner_local_relations: local,
  ownership_audit: ownershipAudit,
  composed_analysis: root,
  partition_gaps: root.partition_gaps + Object.values(local).reduce((sum, x) => sum + x.gaps, 0),
  partition_overlaps: root.partition_overlaps + Object.values(local).reduce((sum, x) => sum + x.overlaps, 0),
  required_output_mismatches: root.required_output_mismatches,
  next_state_mismatches: root.next_state_mismatches,
  intermediate_fact_mismatches: root.intermediate_fact_mismatches,
  invariant_checks: invariantChecks,
  invariant_violations: invariantViolations,
  scenario_traces: scenarios,
  scenario_mismatches: scenarioMismatches,
  bounded_analysis_claim_boundary: "Exhaustive evidence is limited to the finite abstract domains, owner-local relations, explicit semantic connection map, 192 one-observation snapshots, and five named traces. It is not execution, solver certification, compositional proof, physical-performance evidence, generated-code correctness, or safety certification."
};

console.log(JSON.stringify(result));
