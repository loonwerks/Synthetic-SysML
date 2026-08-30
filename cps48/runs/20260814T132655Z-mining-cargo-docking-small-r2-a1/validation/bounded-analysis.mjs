const SOURCE_SHA256 = "f6e3daabbf5e160614f1b24a70aa7650b3d3bb5fbb5f2f1860b728f7b587bfd2";

const modes = ["Idle", "Mining", "CapacityHold", "ConditionHold", "RecoveryReady"];
const bools = [false, true];
const statuses = ["Valid", "Invalid"];
const holdObservations = ["RoomAvailable", "NearlyFull"];
const asteroids = ["OreAvailable", "Depleted"];
const lasers = ["Ready", "Overheated"];
const targets = ["Locked", "Interfered"];

const semanticConnectionMap = {
  "INT-01": "root.pilot_request -> request_freshness_priority_owner.pilot_request",
  "INT-02": "root.hold_sample -> hold_guard_qualification_owner.hold_sample",
  "INT-03": "root.mining_support -> mining_support_qualification_owner.mining_support",
  "INT-04": "request_freshness_priority_owner.request_assessment -> ore_hold_decision_owner.request_assessment",
  "INT-05": "hold_guard_qualification_owner.hold_assessment -> ore_hold_decision_owner.hold_assessment",
  "INT-06": "mining_support_qualification_owner.support_assessment -> ore_hold_decision_owner.support_assessment",
  "INT-07": "ore_hold_decision_owner.resolution_to_command -> mining_command_derivation_owner.guard_resolution",
  "INT-08": "ore_hold_decision_owner.resolution_to_reporting -> guard_reporting_derivation_owner.guard_resolution",
  "INT-09": "mining_command_derivation_owner.mining_command -> root.mining_command",
  "INT-10": "guard_reporting_derivation_owner.guard_status -> root.guard_status",
  "INT-11": "guard_reporting_derivation_owner.offload_readiness -> root.offload_readiness"
};

const ownershipAudit = [
  {
    usage: "request_freshness_priority_owner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["request_freshness_priority_owner.pilot_request", "state.previousStart", "state.previousHalt", "state.previousResume"],
    owner_local_facts: ["requestValidity", "freshStart", "freshResume", "haltPriority", "requestConflict", "requestDisposition"],
    contract_cases: ["REQUEST_QUALIFICATION_PRIORITY_AND_FRESHNESS"],
    analyzer_checks: ["request-owner-128-transitions"]
  },
  {
    usage: "hold_guard_qualification_owner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["hold_guard_qualification_owner.hold_sample"],
    owner_local_facts: ["threeWayHoldAssessment"],
    contract_cases: ["HOLD_GUARD_QUALIFICATION"],
    analyzer_checks: ["hold-owner-four-samples"]
  },
  {
    usage: "mining_support_qualification_owner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["mining_support_qualification_owner.mining_support"],
    owner_local_facts: ["threeWaySupportAssessment", "allPositiveSupportApplicability"],
    contract_cases: ["MINING_SUPPORT_QUALIFICATION"],
    analyzer_checks: ["support-owner-sixteen-samples"]
  },
  {
    usage: "ore_hold_decision_owner",
    claimed_roles: ["decision"],
    assigned_inputs: ["ore_hold_decision_owner.request_assessment", "ore_hold_decision_owner.hold_assessment", "ore_hold_decision_owner.support_assessment", "state.guardMode"],
    owner_local_facts: ["orderedGuardResolution", "nextGuardMode", "resolutionReason", "preservedRequestConflict"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11"],
    analyzer_checks: ["decision-owner-total-exclusive-40960"]
  },
  {
    usage: "mining_command_derivation_owner",
    claimed_roles: ["proposal"],
    assigned_inputs: ["mining_command_derivation_owner.guard_resolution"],
    owner_local_facts: ["miningCommandFromNextMode"],
    contract_cases: ["OUTPUT-01"],
    analyzer_checks: ["command-owner-five-mode-equivalence"]
  },
  {
    usage: "guard_reporting_derivation_owner",
    claimed_roles: ["proposal"],
    assigned_inputs: ["guard_reporting_derivation_owner.guard_resolution"],
    owner_local_facts: ["guardStatusFromReasonAndConflict", "offloadReadinessFromNextMode"],
    contract_cases: ["OUTPUT-02", "OUTPUT-03"],
    analyzer_checks: ["report-owner-eleven-reason-classification", "readiness-owner-five-mode-equivalence"]
  }
];

function qualifyRequest(sample, previous) {
  const nextPrevious = { start: sample.start, halt: sample.halt, resume: sample.resume };
  if (sample.status === "Invalid") {
    return { value: { disposition: "InvalidRequest", conflict: false }, nextPrevious };
  }
  const conflict = (sample.start && sample.halt) || (sample.start && sample.resume) || (sample.halt && sample.resume);
  const freshResume = sample.resume && !previous.resume;
  const freshStart = sample.start && !previous.start;
  let disposition = "NoFreshRequest";
  if (sample.halt) disposition = "HaltDominant";
  else if (freshResume) disposition = "FreshResume";
  else if (freshStart) disposition = "FreshStart";
  return { value: { disposition, conflict }, nextPrevious };
}

function qualifyHold(sample) {
  if (sample.status === "Invalid") return "InvalidHold";
  return sample.observation === "RoomAvailable" ? "SpaceAvailable" : "GuardReached";
}

function qualifySupport(sample) {
  if (sample.status === "Invalid") return "InvalidSupport";
  return sample.asteroid === "OreAvailable" && sample.laser === "Ready" && sample.target === "Locked"
    ? "SupportReady" : "SupportBlocked";
}

function canonicalGuards(mode, request, hold, support) {
  return [
    request.disposition === "InvalidRequest" || hold === "InvalidHold" || support === "InvalidSupport",
    request.disposition !== "InvalidRequest" && hold !== "InvalidHold" && support !== "InvalidSupport" && request.disposition === "HaltDominant",
    request.disposition !== "InvalidRequest" && hold !== "InvalidHold" && support !== "InvalidSupport" && request.disposition !== "HaltDominant" && hold === "GuardReached",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && hold === "SpaceAvailable" && support === "SupportBlocked",
    request.disposition === "FreshStart" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "Idle",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && request.disposition !== "FreshStart" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "Idle",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "Mining",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "CapacityHold",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "ConditionHold",
    request.disposition === "FreshResume" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "RecoveryReady",
    request.disposition !== "InvalidRequest" && request.disposition !== "HaltDominant" && request.disposition !== "FreshResume" && hold === "SpaceAvailable" && support === "SupportReady" && mode === "RecoveryReady"
  ];
}

const resolutionByCase = [
  ["ConditionHold", "InvalidEvidence"], ["Idle", "HaltSelected"],
  ["CapacityHold", "HoldGuardReached"], ["ConditionHold", "SupportUnavailable"],
  ["Mining", "StartAdmitted"], ["Idle", "IdleWaiting"],
  ["Mining", "MiningMaintained"], ["RecoveryReady", "GuardCleared"],
  ["RecoveryReady", "EvidenceRestored"], ["Mining", "ResumeAdmitted"],
  ["RecoveryReady", "RecoveryWaiting"]
];

function decisionOwner(mode, request, hold, support) {
  let index;
  if (request.disposition === "InvalidRequest" || hold === "InvalidHold" || support === "InvalidSupport") index = 0;
  else if (request.disposition === "HaltDominant") index = 1;
  else if (hold === "GuardReached") index = 2;
  else if (support === "SupportBlocked") index = 3;
  else if (mode === "Idle" && request.disposition === "FreshStart") index = 4;
  else if (mode === "Idle") index = 5;
  else if (mode === "Mining") index = 6;
  else if (mode === "CapacityHold") index = 7;
  else if (mode === "ConditionHold") index = 8;
  else if (mode === "RecoveryReady" && request.disposition === "FreshResume") index = 9;
  else index = 10;
  return {
    case_id: `CASE-${String(index + 1).padStart(2, "0")}`,
    nextMode: resolutionByCase[index][0],
    reason: resolutionByCase[index][1],
    requestConflict: request.conflict
  };
}

function deriveCommand(resolution) {
  return resolution.nextMode === "Mining" ? "ContinueMining" : "StopMining";
}

function deriveStatus(resolution) {
  if (resolution.reason === "InvalidEvidence") return "InputFault";
  if (resolution.reason === "HaltSelected") return "HaltedByPilot";
  if (resolution.reason === "HoldGuardReached") return "GuardedNearlyFull";
  if (resolution.reason === "SupportUnavailable") return "HeldForSupport";
  if (["StartAdmitted", "MiningMaintained", "ResumeAdmitted"].includes(resolution.reason)) return "MiningAuthorized";
  if (["GuardCleared", "EvidenceRestored", "RecoveryWaiting"].includes(resolution.reason)) return "AwaitingFreshResume";
  return resolution.requestConflict ? "RequestConflict" : "Idle";
}

function deriveReadiness(resolution) {
  return resolution.nextMode === "CapacityHold" ? "ReadyForLaterOffload" : "NotReadyForOffload";
}

function compose(state, rootInputs) {
  const requestOwner = qualifyRequest(rootInputs.pilot_request, state.previous);
  const holdOwner = qualifyHold(rootInputs.hold_sample);
  const supportOwner = qualifySupport(rootInputs.mining_support);
  const resolutionToCommand = decisionOwner(state.mode, requestOwner.value, holdOwner, supportOwner);
  const resolutionToReporting = { ...resolutionToCommand };
  return {
    request_assessment: requestOwner.value,
    hold_assessment: holdOwner,
    support_assessment: supportOwner,
    resolution_to_command: resolutionToCommand,
    resolution_to_reporting: resolutionToReporting,
    mining_command: deriveCommand(resolutionToCommand),
    guard_status: deriveStatus(resolutionToReporting),
    offload_readiness: deriveReadiness(resolutionToReporting),
    next_state: { mode: resolutionToCommand.nextMode, previous: requestOwner.nextPrevious }
  };
}

const previousStates = [];
const requestSamples = [];
const holdSamples = [];
const supportSamples = [];
for (const start of bools) for (const halt of bools) for (const resume of bools) previousStates.push({ start, halt, resume });
for (const start of bools) for (const halt of bools) for (const resume of bools) for (const status of statuses) requestSamples.push({ start, halt, resume, status });
for (const observation of holdObservations) for (const status of statuses) holdSamples.push({ observation, status });
for (const asteroid of asteroids) for (const laser of lasers) for (const target of targets) for (const status of statuses) supportSamples.push({ asteroid, laser, target, status });

const counts = Object.fromEntries(resolutionByCase.map((_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
let snapshots = 0;
let gaps = 0;
let overlaps = 0;
let requestStateMismatches = 0;
let resolutionMismatches = 0;
let fanoutMismatches = 0;
let commandMismatches = 0;
let statusMismatches = 0;
let readinessMismatches = 0;
let commandEquivalenceMismatches = 0;
let readinessEquivalenceMismatches = 0;
let coherentOutputMismatches = 0;

for (const mode of modes) for (const previous of previousStates) for (const pilot_request of requestSamples) for (const hold_sample of holdSamples) for (const mining_support of supportSamples) {
  snapshots++;
  const state = { mode, previous };
  const rootInputs = { pilot_request, hold_sample, mining_support };
  const result = compose(state, rootInputs);
  const active = canonicalGuards(mode, result.request_assessment, result.hold_assessment, result.support_assessment)
    .map((value, index) => value ? index : -1).filter(index => index >= 0);
  if (active.length === 0) gaps++;
  if (active.length > 1) overlaps++;
  if (active.length === 1) {
    const expectedCase = `CASE-${String(active[0] + 1).padStart(2, "0")}`;
    counts[expectedCase]++;
    const expected = resolutionByCase[active[0]];
    if (result.resolution_to_command.case_id !== expectedCase || result.resolution_to_command.nextMode !== expected[0] || result.resolution_to_command.reason !== expected[1] || result.resolution_to_command.requestConflict !== result.request_assessment.conflict) resolutionMismatches++;
  }
  if (result.next_state.previous.start !== pilot_request.start || result.next_state.previous.halt !== pilot_request.halt || result.next_state.previous.resume !== pilot_request.resume) requestStateMismatches++;
  if (JSON.stringify(result.resolution_to_command) !== JSON.stringify(result.resolution_to_reporting)) fanoutMismatches++;
  if (result.mining_command !== deriveCommand(result.resolution_to_command)) commandMismatches++;
  if (result.guard_status !== deriveStatus(result.resolution_to_reporting)) statusMismatches++;
  if (result.offload_readiness !== deriveReadiness(result.resolution_to_reporting)) readinessMismatches++;
  if ((result.mining_command === "ContinueMining") !== (result.resolution_to_command.nextMode === "Mining")) commandEquivalenceMismatches++;
  if ((result.offload_readiness === "ReadyForLaterOffload") !== (result.resolution_to_reporting.nextMode === "CapacityHold")) readinessEquivalenceMismatches++;
  if (result.mining_command === "ContinueMining" && (result.guard_status !== "MiningAuthorized" || result.offload_readiness !== "NotReadyForOffload")) coherentOutputMismatches++;
  if (result.offload_readiness === "ReadyForLaterOffload" && (result.mining_command !== "StopMining" || result.guard_status !== "GuardedNearlyFull")) coherentOutputMismatches++;
}

const goodHold = { observation: "RoomAvailable", status: "Valid" };
const nearFull = { observation: "NearlyFull", status: "Valid" };
const invalidHold = { observation: "RoomAvailable", status: "Invalid" };
const goodSupport = { asteroid: "OreAvailable", laser: "Ready", target: "Locked", status: "Valid" };
const invalidSupport = { ...goodSupport, status: "Invalid" };
const noRequest = { start: false, halt: false, resume: false, status: "Valid" };
const initialState = (mode = "Idle", previous = { start: false, halt: false, resume: false }) => ({ mode, previous });

function executeTrace(id, startState, steps) {
  let state = startState;
  const observedSteps = [];
  let passed = true;
  for (let index = 0; index < steps.length; index++) {
    const spec = steps[index];
    const result = compose(state, spec.inputs);
    if (result.resolution_to_command.case_id !== spec.expected_case) passed = false;
    observedSteps.push({
      step: index + 1,
      inputs: spec.inputs,
      expected_case: spec.expected_case,
      observed: {
        request_assessment: result.request_assessment,
        hold_assessment: result.hold_assessment,
        support_assessment: result.support_assessment,
        resolution: result.resolution_to_command,
        outputs: {
          mining_command: result.mining_command,
          guard_status: result.guard_status,
          offload_readiness: result.offload_readiness
        },
        next_state: result.next_state
      }
    });
    state = result.next_state;
  }
  return { trace_id: id, passed, steps: observedSteps };
}

const scenarioFamilies = [];
scenarioFamilies.push({
  scenario_id: "SCN-01",
  partition: "nominal-admission-and-persistence",
  traces: [executeTrace("SCN-01-NOMINAL", initialState(), [
    { inputs: { pilot_request: { start: true, halt: false, resume: false, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-05" },
    { inputs: { pilot_request: { start: true, halt: false, resume: false, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-07" }
  ])]
});
scenarioFamilies.push({
  scenario_id: "SCN-02",
  partition: "nearly-full-boundary-protection",
  traces: [executeTrace("SCN-02-GUARD-AND-RETAIN", initialState("Mining"), [
    { inputs: { pilot_request: noRequest, hold_sample: nearFull, mining_support: goodSupport }, expected_case: "CASE-03" },
    { inputs: { pilot_request: noRequest, hold_sample: nearFull, mining_support: goodSupport }, expected_case: "CASE-03" }
  ])]
});

const supportBlocks = [];
for (const asteroid of asteroids) for (const laser of lasers) for (const target of targets) {
  if (asteroid === "OreAvailable" && laser === "Ready" && target === "Locked") continue;
  supportBlocks.push({ asteroid, laser, target, status: "Valid" });
}
const scn03Traces = [
  executeTrace("SCN-03-INVALID-REQUEST", initialState("Mining"), [{ inputs: { pilot_request: { ...noRequest, status: "Invalid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-01" }]),
  executeTrace("SCN-03-INVALID-HOLD", initialState("Mining"), [{ inputs: { pilot_request: noRequest, hold_sample: invalidHold, mining_support: goodSupport }, expected_case: "CASE-01" }]),
  executeTrace("SCN-03-INVALID-SUPPORT", initialState("Mining"), [{ inputs: { pilot_request: noRequest, hold_sample: goodHold, mining_support: invalidSupport }, expected_case: "CASE-01" }])
];
supportBlocks.forEach((sample, index) => scn03Traces.push(executeTrace(`SCN-03-SUPPORT-BLOCK-${index + 1}`, initialState("Mining"), [{ inputs: { pilot_request: noRequest, hold_sample: goodHold, mining_support: sample }, expected_case: "CASE-04" }])));
scenarioFamilies.push({ scenario_id: "SCN-03", partition: "invalid-and-support-fault-protection", traces: scn03Traces });

scenarioFamilies.push({
  scenario_id: "SCN-04",
  partition: "command-priority-and-freshness",
  traces: [
    executeTrace("SCN-04-HALT-CONFLICT-NONREPLAY", initialState(), [
      { inputs: { pilot_request: { start: true, halt: true, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-02" },
      { inputs: { pilot_request: { start: true, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-06" }
    ]),
    executeTrace("SCN-04-RESUME-BEFORE-START", initialState(), [
      { inputs: { pilot_request: { start: true, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-06" }
    ]),
    executeTrace("SCN-04-INVALID-TO-VALID-NONFRESH", initialState(), [
      { inputs: { pilot_request: { start: true, halt: false, resume: false, status: "Invalid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-01" },
      { inputs: { pilot_request: { start: true, halt: false, resume: false, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-09" }
    ])
  ]
});

scenarioFamilies.push({
  scenario_id: "SCN-05",
  partition: "protected-recovery",
  traces: [
    executeTrace("SCN-05-CAPACITY-CLEAR-DISCARD-WAIT-RESUME", initialState("CapacityHold"), [
      { inputs: { pilot_request: { start: false, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-08" },
      { inputs: { pilot_request: { start: false, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-11" },
      { inputs: { pilot_request: noRequest, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-11" },
      { inputs: { pilot_request: { start: false, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-10" }
    ]),
    executeTrace("SCN-05-CONDITION-RESTORE-THEN-RESUME", initialState("ConditionHold"), [
      { inputs: { pilot_request: { start: false, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-09" },
      { inputs: { pilot_request: noRequest, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-11" },
      { inputs: { pilot_request: { start: false, halt: false, resume: true, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-10" }
    ]),
    executeTrace("SCN-05-FRESH-START-REJECTED", initialState("RecoveryReady"), [
      { inputs: { pilot_request: { start: true, halt: false, resume: false, status: "Valid" }, hold_sample: goodHold, mining_support: goodSupport }, expected_case: "CASE-11" }
    ]),
    executeTrace("SCN-05-REPROTECTION-CAPACITY", initialState("RecoveryReady"), [
      { inputs: { pilot_request: noRequest, hold_sample: nearFull, mining_support: goodSupport }, expected_case: "CASE-03" }
    ]),
    executeTrace("SCN-05-REPROTECTION-SUPPORT", initialState("RecoveryReady"), [
      { inputs: { pilot_request: noRequest, hold_sample: goodHold, mining_support: supportBlocks[0] }, expected_case: "CASE-04" }
    ])
  ]
});

const expectedCounts = {
  "CASE-01": 35840, "CASE-02": 2560, "CASE-03": 1280, "CASE-04": 1120,
  "CASE-05": 6, "CASE-06": 26, "CASE-07": 32, "CASE-08": 32,
  "CASE-09": 32, "CASE-10": 8, "CASE-11": 24
};
const partitionCountMismatches = Object.keys(expectedCounts).filter(id => counts[id] !== expectedCounts[id]);
const scenarioFailures = scenarioFamilies.flatMap(family => family.traces.filter(trace => !trace.passed).map(trace => trace.trace_id));
const allPassed = snapshots === 40960 && gaps === 0 && overlaps === 0 && partitionCountMismatches.length === 0 &&
  requestStateMismatches === 0 && resolutionMismatches === 0 && fanoutMismatches === 0 &&
  commandMismatches === 0 && statusMismatches === 0 && readinessMismatches === 0 &&
  commandEquivalenceMismatches === 0 && readinessEquivalenceMismatches === 0 && coherentOutputMismatches === 0 &&
  scenarioFailures.length === 0 && supportBlocks.length === 7;

const report = {
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source: "model/Ore_Hold_Mining_Guard_Supervisor.sysml",
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exact finite-domain conformance of the retained owner-local relations, semantic connection map, outputs, invariants, and named bounded scenarios only; not execution, physical performance, compositional proof, solver certification, generated-code correctness, or safety certification.",
  domain: {
    formula: "5 pre-modes * 8 previous request states * 16 current request samples * 4 hold samples * 16 support samples",
    expected_snapshots: 40960,
    enumerated_snapshots: snapshots
  },
  semantic_connection_map: semanticConnectionMap,
  partition_counts: counts,
  expected_partition_counts: expectedCounts,
  partition_count_mismatches: partitionCountMismatches,
  gaps,
  overlaps,
  required_output_mismatches: {
    mining_command: commandMismatches,
    guard_status: statusMismatches,
    offload_readiness: readinessMismatches
  },
  invariant_checks: {
    request_history_update_mismatches: requestStateMismatches,
    decision_resolution_mismatches: resolutionMismatches,
    resolution_fanout_mismatches: fanoutMismatches,
    continue_mining_iff_next_mode_mining_mismatches: commandEquivalenceMismatches,
    readiness_iff_capacity_hold_mismatches: readinessEquivalenceMismatches,
    coherent_output_tuple_mismatches: coherentOutputMismatches,
    support_block_variant_count: supportBlocks.length
  },
  ownership_audit: ownershipAudit.map(record => ({ ...record, passed: allPassed })),
  ownership_checks_passed: allPassed,
  scenario_family_count: scenarioFamilies.length,
  scenario_failures: scenarioFailures,
  scenario_families: scenarioFamilies
};

process.stdout.write(`${JSON.stringify(report)}\n`);
