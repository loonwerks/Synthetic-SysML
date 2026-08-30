const SOURCE_SHA256 = "b82ea4965527d7d5f3119e27cfd3a69128353f1cf6cd127d96a986dc3dc9e510";

const RequestCommands = ["NoCommand", "Begin", "Cancel"];
const RequestTokens = ["TokenA", "TokenB"];
const EnergyValues = ["AdequateCurrent", "LowCurrent", "UnknownCurrent", "Invalid", "Stale"];
const CameraValues = ["AvailableCurrent", "UnavailableCurrent", "UnknownCurrent", "Invalid", "Stale"];
const RadioValues = [...CameraValues];
const ProgressValues = ["Idle", "Active", "Completed", "Failed"];
const TicketValues = ["NoTicket", "TokenA", "TokenB"];
const EnergyVerdicts = ["NoEnergyVerdict", "EnergyReady", "EnergyInsufficient", "EnergyUntrusted"];
const SupportVerdicts = ["NoSupportVerdict", "SupportReady", "SupportUnavailable", "SupportUntrusted"];
const ContextValues = ["NoContext", "EvaluateTokenA", "EvaluateTokenB", "CancelOutstanding"];
const DecisionValues = ["NoDecision", "Permit", "DenyPower", "DenySupport", "Withdraw"];
const RequestStateValues = ["Idle", "Pending", "Engaged", "RecoveryHold"];
const PhaseValues = ["Closed", "Authorized", "Active", "FailureHold"];
const OutcomeValues = ["None", "DeniedPower", "DeniedSupport", "Authorized", "Active", "Cancelled", "Completed", "Failed", "Recovered"];

const ownershipAudit = [
  {
    usage: "requestLifecycle",
    claimed_roles: ["applicability"],
    assigned_inputs: ["requestLifecycle.requestInput", "requestLifecycle.gateOutcome", "requestLifecycle.requestState", "requestLifecycle.lastAcceptedToken"],
    owner_local_facts: ["requestAdmissionAndFreshness"],
    contract_cases: ["CASE-06", "CASE-07", "CASE-12"],
    analyzer_checks: ["request-lifecycle-totality"]
  },
  {
    usage: "energyAssessor",
    claimed_roles: ["proposal"],
    assigned_inputs: ["energyAssessor.energyEvidence", "energyAssessor.evaluationTicket"],
    owner_local_facts: ["ticketScopedEnergyVerdict"],
    contract_cases: ["CASE-02", "CASE-03"],
    analyzer_checks: ["energy-qualification-fibers"]
  },
  {
    usage: "observationSupportAssessor",
    claimed_roles: ["proposal"],
    assigned_inputs: ["observationSupportAssessor.cameraEvidence", "observationSupportAssessor.radioEvidence", "observationSupportAssessor.evaluationTicket"],
    owner_local_facts: ["jointTicketScopedSupportVerdict"],
    contract_cases: ["CASE-04", "CASE-05"],
    analyzer_checks: ["support-qualification-fibers"]
  },
  {
    usage: "eligibilityArbiter",
    claimed_roles: ["decision"],
    assigned_inputs: ["eligibilityArbiter.requestContext", "eligibilityArbiter.energyVerdictIn", "eligibilityArbiter.supportVerdictIn"],
    owner_local_facts: ["matchedEligibilityDecision"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-08"],
    analyzer_checks: ["arbiter-ticket-priority"]
  },
  {
    usage: "authorizationGate",
    claimed_roles: ["applicability"],
    assigned_inputs: ["authorizationGate.eligibilityDecision", "authorizationGate.observationProgress", "authorizationGate.gatePhase"],
    owner_local_facts: ["failClosedAuthorizationApplication"],
    contract_cases: ["CASE-01", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["gate-priority-and-recovery"]
  }
];

const connectionMap = {
  "INT-06": "requestLifecycle.energyTicket -> energyAssessor.evaluationTicket",
  "INT-07": "requestLifecycle.supportTicket -> observationSupportAssessor.evaluationTicket",
  "INT-08": "requestLifecycle.requestContext -> eligibilityArbiter.requestContext",
  "INT-09": "energyAssessor.energyVerdictOut -> eligibilityArbiter.energyVerdictIn",
  "INT-10": "observationSupportAssessor.supportVerdictOut -> eligibilityArbiter.supportVerdictIn",
  "INT-11": "eligibilityArbiter.eligibilityDecision -> authorizationGate.eligibilityDecision",
  "INT-12": "authorizationGate.gateOutcome -> requestLifecycle.gateOutcome (committed feedback)"
};

const violations = [];
const gaps = [];
const overlaps = [];
const mismatches = [];
const invariantViolations = [];
const executedAnalyzerChecks = new Set();

function check(condition, category, detail) {
  if (!condition) category.push(detail);
}

function inactivePipeline(state, last, status, branch) {
  return { requestState: state, lastToken: last, energyTicket: "NoTicket", supportTicket: "NoTicket", context: "NoContext", status, branch };
}

function requestLifecycle(pre, input, priorOutcome) {
  const state = pre.requestState;
  const last = pre.lastToken;
  if (priorOutcome === "Failed") return inactivePipeline("RecoveryHold", last, "ServiceFailed", "LIFECYCLE_FAILED_FEEDBACK");
  if (priorOutcome === "Recovered") return inactivePipeline("Idle", last, "Idle", "LIFECYCLE_RECOVERED_FEEDBACK");
  if (priorOutcome === "DeniedPower") return inactivePipeline("Idle", last, "DeniedPower", "LIFECYCLE_DENIED_POWER");
  if (priorOutcome === "DeniedSupport") return inactivePipeline("Idle", last, "DeniedSupport", "LIFECYCLE_DENIED_SUPPORT");
  if (priorOutcome === "Cancelled") return inactivePipeline("Idle", last, "Cancelled", "LIFECYCLE_CANCELLED");
  if (priorOutcome === "Completed") return inactivePipeline("Idle", last, "Completed", "LIFECYCLE_COMPLETED");
  if (priorOutcome === "Authorized") return inactivePipeline("Engaged", last, "Authorized", "LIFECYCLE_AUTHORIZED");
  if (priorOutcome === "Active") return inactivePipeline("Engaged", last, "Active", "LIFECYCLE_ACTIVE");
  if (input.command === "NoCommand") {
    const status = state === "Idle" ? "Idle" : state === "Pending" ? "Evaluating" : state === "Engaged" ? "Active" : "AwaitingRecovery";
    return inactivePipeline(state, last, status, "LIFECYCLE_NO_COMMAND");
  }
  if (input.command === "Cancel") {
    if (state === "Pending" || state === "Engaged") {
      return { ...inactivePipeline(state, last, "Evaluating", "LIFECYCLE_CANCEL_OUTSTANDING"), context: "CancelOutstanding" };
    }
    return inactivePipeline(state, last, state === "RecoveryHold" ? "AwaitingRecovery" : "Idle", "LIFECYCLE_CANCEL_NOOP");
  }
  if (state === "RecoveryHold") return inactivePipeline(state, last, "AwaitingRecovery", "LIFECYCLE_BEGIN_DURING_RECOVERY");
  if (last === input.token) return inactivePipeline(state, last, "DuplicateIgnored", `LIFECYCLE_REPLAY_${input.token}`);
  if (state === "Idle") {
    return {
      requestState: "Pending",
      lastToken: input.token,
      energyTicket: input.token,
      supportTicket: input.token,
      context: input.token === "TokenA" ? "EvaluateTokenA" : "EvaluateTokenB",
      status: "Evaluating",
      branch: `LIFECYCLE_FRESH_${input.token}`
    };
  }
  return inactivePipeline(state, last, "Busy", `LIFECYCLE_BUSY_${input.token}`);
}

function energyAssessor(ticket, evidence) {
  if (ticket === "NoTicket") return { ticket: "NoTicket", verdict: "NoEnergyVerdict", branch: "ENERGY_INACTIVE" };
  if (evidence === "AdequateCurrent") return { ticket, verdict: "EnergyReady", branch: "ENERGY_READY" };
  if (evidence === "LowCurrent") return { ticket, verdict: "EnergyInsufficient", branch: "ENERGY_INSUFFICIENT" };
  return { ticket, verdict: "EnergyUntrusted", branch: "ENERGY_UNTRUSTED" };
}

function supportAssessor(ticket, camera, radio) {
  if (ticket === "NoTicket") return { ticket: "NoTicket", verdict: "NoSupportVerdict", branch: "SUPPORT_INACTIVE" };
  if (camera === "AvailableCurrent" && radio === "AvailableCurrent") return { ticket, verdict: "SupportReady", branch: "SUPPORT_READY" };
  const untrusted = ["UnknownCurrent", "Invalid", "Stale"];
  if (untrusted.includes(camera) || untrusted.includes(radio)) return { ticket, verdict: "SupportUntrusted", branch: "SUPPORT_UNTRUSTED" };
  return { ticket, verdict: "SupportUnavailable", branch: "SUPPORT_UNAVAILABLE" };
}

function eligibilityArbiter(context, energy, support) {
  if (context === "CancelOutstanding") return { decision: "Withdraw", branch: "ARBITER_WITHDRAW" };
  const expected = context === "EvaluateTokenA" ? "TokenA" : context === "EvaluateTokenB" ? "TokenB" : null;
  const matched = expected !== null && energy.ticket === expected && support.ticket === expected && energy.verdict !== "NoEnergyVerdict" && support.verdict !== "NoSupportVerdict";
  if (!matched) return { decision: "NoDecision", branch: "ARBITER_INACTIVE_OR_MISMATCH" };
  if (energy.verdict === "EnergyInsufficient") return { decision: "DenyPower", branch: "ARBITER_POWER_INSUFFICIENT" };
  if (energy.verdict === "EnergyUntrusted") return { decision: "DenyPower", branch: "ARBITER_POWER_UNTRUSTED" };
  if (energy.verdict === "EnergyReady" && support.verdict === "SupportUnavailable") return { decision: "DenySupport", branch: "ARBITER_SUPPORT_UNAVAILABLE" };
  if (energy.verdict === "EnergyReady" && support.verdict === "SupportUntrusted") return { decision: "DenySupport", branch: "ARBITER_SUPPORT_UNTRUSTED" };
  if (energy.verdict === "EnergyReady" && support.verdict === "SupportReady") return { decision: "Permit", branch: "ARBITER_PERMIT" };
  return { decision: "NoDecision", branch: "ARBITER_INACTIVE_OR_MISMATCH" };
}

function validCompletion(phase, progress) {
  return (phase === "Authorized" || phase === "Active") && progress === "Completed";
}

// These predicates are a direct, unordered mirror of the canonical GUMBO
// compute-case assumptions. Every raw valuation must match exactly one case.
const canonicalGateComputeCases = [
  {
    name: "GATE_RECOVERED",
    guard: ({ phase, progress }) => phase === "FailureHold" && progress === "Idle",
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "Recovered" }
  },
  {
    name: "GATE_RECOVERY_RETAINED",
    guard: ({ phase, progress }) => phase === "FailureHold" && progress !== "Idle",
    guarantee: { gatePhase: "FailureHold", authorization: "Withhold", outcome: "None" }
  },
  {
    name: "GATE_REPORTED_FAILURE",
    guard: ({ phase, progress }) => phase !== "FailureHold" && progress === "Failed",
    guarantee: { gatePhase: "FailureHold", authorization: "Withhold", outcome: "Failed" }
  },
  {
    name: "GATE_ACTIVE_WHILE_CLOSED",
    guard: ({ phase, progress }) => phase === "Closed" && progress === "Active",
    guarantee: { gatePhase: "FailureHold", authorization: "Withhold", outcome: "Failed" }
  },
  {
    name: "GATE_ACTIVE_TO_IDLE_REGRESSION",
    guard: ({ phase, progress }) => phase === "Active" && progress === "Idle",
    guarantee: { gatePhase: "FailureHold", authorization: "Withhold", outcome: "Failed" }
  },
  {
    name: "GATE_WITHDRAWAL",
    guard: ({ phase, decision, progress }) => phase !== "FailureHold" && progress !== "Failed" &&
      !(phase === "Closed" && progress === "Active") &&
      !(phase === "Active" && progress === "Idle") && decision === "Withdraw",
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "Cancelled" }
  },
  {
    name: "GATE_COMPLETION",
    guard: ({ phase, decision, progress }) => validCompletion(phase, progress) && decision !== "Withdraw",
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "Completed" }
  },
  {
    name: "GATE_DENIED_POWER",
    guard: ({ phase, decision, progress }) => phase !== "FailureHold" && progress !== "Failed" &&
      !(phase === "Closed" && progress === "Active") &&
      !(phase === "Active" && progress === "Idle") &&
      !validCompletion(phase, progress) && decision === "DenyPower",
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "DeniedPower" }
  },
  {
    name: "GATE_DENIED_SUPPORT",
    guard: ({ phase, decision, progress }) => phase !== "FailureHold" && progress !== "Failed" &&
      !(phase === "Closed" && progress === "Active") &&
      !(phase === "Active" && progress === "Idle") &&
      !validCompletion(phase, progress) && decision === "DenySupport",
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "DeniedSupport" }
  },
  {
    name: "GATE_PERMIT_FROM_CLOSED",
    guard: ({ phase, decision, progress }) => phase === "Closed" && progress === "Idle" && decision === "Permit",
    guarantee: { gatePhase: "Authorized", authorization: "Permit", outcome: "Authorized" }
  },
  {
    name: "GATE_PROGRESS_ACTIVE",
    guard: ({ phase, decision, progress }) => (phase === "Authorized" || phase === "Active") &&
      progress === "Active" && decision !== "Withdraw" && decision !== "DenyPower" && decision !== "DenySupport",
    guarantee: { gatePhase: "Active", authorization: "Permit", outcome: "Active" }
  },
  {
    name: "GATE_AUTHORIZED_IDLE",
    guard: ({ phase, decision, progress }) => phase === "Authorized" && progress === "Idle" &&
      (decision === "NoDecision" || decision === "Permit"),
    guarantee: { gatePhase: "Authorized", authorization: "Permit", outcome: "Authorized" }
  },
  {
    name: "GATE_CLOSED_QUIESCENT",
    guard: ({ phase, decision, progress }) => phase === "Closed" && progress !== "Failed" && progress !== "Active" &&
      decision !== "Withdraw" && decision !== "DenyPower" && decision !== "DenySupport" &&
      !(progress === "Idle" && decision === "Permit"),
    guarantee: { gatePhase: "Closed", authorization: "Withhold", outcome: "None" }
  }
];

function matchingGateCases(phase, decision, progress) {
  const valuation = { phase, decision, progress };
  return canonicalGateComputeCases.filter(computeCase => computeCase.guard(valuation));
}

function authorizationGate(phase, decision, progress) {
  const matches = matchingGateCases(phase, decision, progress);
  if (matches.length !== 1) {
    return {
      gatePhase: "AnalyzerError",
      authorization: "Withhold",
      outcome: "AnalyzerError",
      branch: "GATE_GUARD_PARTITION_ERROR",
      raw_matches: matches.map(match => match.name)
    };
  }
  return { ...matches[0].guarantee, branch: matches[0].name };
}

function consumeCommittedGateFeedback(admission, gate) {
  const transitionOutcomes = ["DeniedPower", "DeniedSupport", "Cancelled", "Completed", "Failed", "Recovered"];
  if (transitionOutcomes.includes(gate.outcome)) {
    const feedback = requestLifecycle(admission, { command: "NoCommand", token: "TokenA" }, gate.outcome);
    return { ...admission, requestState: feedback.requestState, lastToken: feedback.lastToken, status: feedback.status };
  }
  if ((gate.outcome === "Authorized" || gate.outcome === "Active") &&
      (admission.branch.startsWith("LIFECYCLE_FRESH_") || admission.branch === "LIFECYCLE_NO_COMMAND")) {
    const feedback = requestLifecycle(admission, { command: "NoCommand", token: "TokenA" }, gate.outcome);
    return { ...admission, requestState: feedback.requestState, lastToken: feedback.lastToken, status: feedback.status };
  }
  return admission;
}

function composedStep(pre, input, priorOutcome = "None") {
  if (!admissiblePair(pre.requestState, pre.gatePhase)) {
    return {
      rejected: true,
      rejection: "NON_ADMISSIBLE_REQUEST_STATE_GATE_PHASE_PAIR",
      pre: { requestState: pre.requestState, gatePhase: pre.gatePhase }
    };
  }
  const admission = requestLifecycle(pre, input, priorOutcome);
  const energy = energyAssessor(admission.energyTicket, input.energy);
  const support = supportAssessor(admission.supportTicket, input.camera, input.radio);
  const arbitration = eligibilityArbiter(admission.context, energy, support);
  const gate = authorizationGate(pre.gatePhase, arbitration.decision, input.progress);
  const lifecycle = consumeCommittedGateFeedback(admission, gate);
  return {
    requestState: lifecycle.requestState,
    lastToken: lifecycle.lastToken,
    gatePhase: gate.gatePhase,
    status: lifecycle.status,
    authorization: gate.authorization,
    energyTicket: admission.energyTicket,
    supportTicket: admission.supportTicket,
    context: admission.context,
    energyVerdict: energy,
    supportVerdict: support,
    decision: arbitration.decision,
    gateOutcome: gate.outcome,
    branches: [admission.branch, energy.branch, support.branch, arbitration.branch, gate.branch]
  };
}

const committedStates = [
  { requestState: "Idle", gatePhase: "Closed", lastToken: "None" },
  { requestState: "Idle", gatePhase: "Closed", lastToken: "TokenA" },
  { requestState: "Idle", gatePhase: "Closed", lastToken: "TokenB" },
  { requestState: "Pending", gatePhase: "Closed", lastToken: "TokenA" },
  { requestState: "Pending", gatePhase: "Closed", lastToken: "TokenB" },
  { requestState: "Engaged", gatePhase: "Authorized", lastToken: "TokenA" },
  { requestState: "Engaged", gatePhase: "Authorized", lastToken: "TokenB" },
  { requestState: "Engaged", gatePhase: "Active", lastToken: "TokenA" },
  { requestState: "Engaged", gatePhase: "Active", lastToken: "TokenB" },
  { requestState: "RecoveryHold", gatePhase: "FailureHold", lastToken: "None" },
  { requestState: "RecoveryHold", gatePhase: "FailureHold", lastToken: "TokenA" },
  { requestState: "RecoveryHold", gatePhase: "FailureHold", lastToken: "TokenB" }
];

function admissiblePair(requestState, gatePhase) {
  return (requestState === "Idle" && gatePhase === "Closed") ||
    (requestState === "Pending" && gatePhase === "Closed") ||
    (requestState === "Engaged" && (gatePhase === "Authorized" || gatePhase === "Active")) ||
    (requestState === "RecoveryHold" && gatePhase === "FailureHold");
}

let committedPreStatePairProducts = 0;
let rejectedPreStatePairs = 0;
for (const requestState of RequestStateValues) for (const gatePhase of PhaseValues) {
  const probe = composedStep(
    { requestState, gatePhase, lastToken: "None" },
    { command: "NoCommand", token: "TokenA", energy: "AdequateCurrent", camera: "AvailableCurrent", radio: "AvailableCurrent", progress: "Idle" }
  );
  const admissible = admissiblePair(requestState, gatePhase);
  committedPreStatePairProducts++;
  if (probe.rejected) rejectedPreStatePairs++;
  check(admissible ? !probe.rejected : probe.rejected === true, invariantViolations, {
    check: "explicit-non-admissible-pre-state-rejection",
    requestState,
    gatePhase,
    admissible,
    probe
  });
}

const localBranchCounts = { lifecycle: {}, energy: {}, support: {}, arbiter: {}, gate: {} };
function countBranch(owner, branch) { localBranchCounts[owner][branch] = (localBranchCounts[owner][branch] ?? 0) + 1; }

let lifecycleProducts = 0;
for (const pre of committedStates) for (const prior of OutcomeValues) for (const command of RequestCommands) for (const token of RequestTokens) {
  const value = requestLifecycle(pre, { command, token }, prior);
  lifecycleProducts++;
  countBranch("lifecycle", value.branch);
  check(value.energyTicket === value.supportTicket, mismatches, { check: "ticket-pair-coherence", pre, prior, command, token, value });
  check((value.energyTicket === "NoTicket") === (value.context === "NoContext" || value.context === "CancelOutstanding"), mismatches, { check: "context-ticket-coherence", pre, prior, command, token, value });
}
executedAnalyzerChecks.add("request-lifecycle-totality");

let energyProducts = 0;
for (const ticket of TicketValues) for (const evidence of EnergyValues) {
  const value = energyAssessor(ticket, evidence);
  energyProducts++;
  countBranch("energy", value.branch);
  check((ticket === "NoTicket") === (value.verdict === "NoEnergyVerdict"), mismatches, { check: "energy-sentinel", ticket, evidence, value });
  check(ticket === "NoTicket" ? value.ticket === "NoTicket" : value.ticket === ticket, mismatches, { check: "energy-tag-preservation", ticket, evidence, value });
}

let supportProducts = 0;
for (const ticket of TicketValues) for (const camera of CameraValues) for (const radio of RadioValues) {
  const value = supportAssessor(ticket, camera, radio);
  supportProducts++;
  countBranch("support", value.branch);
  check((ticket === "NoTicket") === (value.verdict === "NoSupportVerdict"), mismatches, { check: "support-sentinel", ticket, camera, radio, value });
  check(ticket === "NoTicket" ? value.ticket === "NoTicket" : value.ticket === ticket, mismatches, { check: "support-tag-preservation", ticket, camera, radio, value });
}

let arbiterProducts = 0;
for (const context of ContextValues) for (const et of TicketValues) for (const ev of EnergyVerdicts) for (const st of TicketValues) for (const sv of SupportVerdicts) {
  const value = eligibilityArbiter(context, { ticket: et, verdict: ev }, { ticket: st, verdict: sv });
  arbiterProducts++;
  countBranch("arbiter", value.branch);
  if (value.decision === "Permit") check((context === "EvaluateTokenA" && et === "TokenA" && st === "TokenA" || context === "EvaluateTokenB" && et === "TokenB" && st === "TokenB") && ev === "EnergyReady" && sv === "SupportReady", mismatches, { check: "permit-premise", context, et, ev, st, sv, value });
}
executedAnalyzerChecks.add("arbiter-ticket-priority");

let gateProducts = 0;
let completionPriorityValuations = 0;
for (const phase of PhaseValues) for (const decision of DecisionValues) for (const progress of ProgressValues) {
  const rawMatches = matchingGateCases(phase, decision, progress);
  if (rawMatches.length === 0) {
    gaps.push({ owner: "authorizationGate", check: "canonical-raw-compute-case-guards", phase, decision, progress });
  }
  if (rawMatches.length > 1) {
    const guarantees = rawMatches.map(match => ({ case: match.name, guarantee: match.guarantee }));
    overlaps.push({ owner: "authorizationGate", check: "canonical-raw-compute-case-guards", phase, decision, progress, matches: guarantees });
    const distinctGuarantees = new Set(guarantees.map(entry => JSON.stringify(entry.guarantee)));
    if (distinctGuarantees.size > 1) {
      violations.push({ owner: "authorizationGate", check: "conflicting-raw-compute-case-guarantees", phase, decision, progress, matches: guarantees });
    }
  }
  const value = authorizationGate(phase, decision, progress);
  gateProducts++;
  countBranch("gate", value.branch);
  if (validCompletion(phase, progress) && (decision === "DenyPower" || decision === "DenySupport")) {
    completionPriorityValuations++;
    check(value.branch === "GATE_COMPLETION" && value.outcome === "Completed", mismatches, {
      check: "completion-priority-over-gate-denial",
      phase,
      decision,
      progress,
      value
    });
  }
  check(value.gatePhase !== "FailureHold" || value.authorization === "Withhold", mismatches, { check: "failure-hold-withhold", phase, decision, progress, value });
  check(value.authorization !== "Permit" || value.gatePhase === "Authorized" || value.gatePhase === "Active", mismatches, { check: "permit-phase", phase, decision, progress, value });
}

for (const computeCase of canonicalGateComputeCases) {
  check((localBranchCounts.gate[computeCase.name] ?? 0) > 0, gaps, {
    owner: "authorizationGate",
    check: "declared-raw-compute-case-reachability",
    compute_case: computeCase.name
  });
}

check(localBranchCounts.energy.ENERGY_READY === 2 && localBranchCounts.energy.ENERGY_INSUFFICIENT === 2 && localBranchCounts.energy.ENERGY_UNTRUSTED === 6, mismatches, { check: "energy-fibers", observed: localBranchCounts.energy });
check(localBranchCounts.support.SUPPORT_READY === 2 && localBranchCounts.support.SUPPORT_UNAVAILABLE === 6 && localBranchCounts.support.SUPPORT_UNTRUSTED === 42, mismatches, { check: "support-fibers", observed: localBranchCounts.support });
executedAnalyzerChecks.add("energy-qualification-fibers");
executedAnalyzerChecks.add("support-qualification-fibers");

let rootSnapshots = 0;
for (const pre of committedStates) for (const command of RequestCommands) for (const token of RequestTokens) for (const energy of EnergyValues) for (const camera of CameraValues) for (const radio of RadioValues) for (const progress of ProgressValues) {
  const output = composedStep(pre, { command, token, energy, camera, radio, progress });
  rootSnapshots++;
  if (!admissiblePair(output.requestState, output.gatePhase)) invariantViolations.push({ pre, input: { command, token, energy, camera, radio, progress }, output });
  if (output.authorization === "Permit") {
    check(output.decision === "Permit" || pre.gatePhase === "Authorized" || pre.gatePhase === "Active", mismatches, { check: "required-permit-source", pre, input: { command, token, energy, camera, radio, progress }, output });
  }
  if (["UnknownCurrent", "Invalid", "Stale"].includes(energy) && output.energyTicket !== "NoTicket") {
    check(output.decision !== "Permit", mismatches, { check: "untrusted-energy-no-permit", pre, input: { command, token, energy, camera, radio, progress }, output });
  }
}

function scenarioInput(overrides = {}) {
  return { command: "NoCommand", token: "TokenA", energy: "AdequateCurrent", camera: "AvailableCurrent", radio: "AvailableCurrent", progress: "Idle", ...overrides };
}
function runTrace(initial, steps) {
  let state = { ...initial };
  return steps.map((spec, index) => {
    const observed = composedStep(state, spec.input);
    for (const [key, expected] of Object.entries(spec.expect)) check(observed[key] === expected, mismatches, { check: "scenario-output", scenario: spec.scenario, step: index + 1, key, expected, observed: observed[key] });
    const record = { step: index + 1, input: spec.input, expected_named_branch_or_case: spec.expectedCase, observed_outputs: { authorization: observed.authorization, status: observed.status, decision: observed.decision, gateOutcome: observed.gateOutcome }, observed_next_state: { requestState: observed.requestState, gatePhase: observed.gatePhase, lastToken: observed.lastToken }, branches: observed.branches };
    state = { requestState: observed.requestState, gatePhase: observed.gatePhase, lastToken: observed.lastToken };
    return record;
  });
}

const initial = { requestState: "Idle", gatePhase: "Closed", lastToken: "None" };
const scenarioTraces = [];

scenarioTraces.push({
  scenario_id: "SCN-01",
  family: "nominal",
  trace: runTrace(initial, [
    { scenario: "SCN-01", input: scenarioInput({ command: "Begin", token: "TokenA" }), expectedCase: "CASE-01", expect: { authorization: "Permit", status: "Authorized", decision: "Permit" } },
    { scenario: "SCN-01", input: scenarioInput({ progress: "Active" }), expectedCase: "TRANS-02", expect: { authorization: "Permit", status: "Active", gatePhase: "Active" } },
    { scenario: "SCN-01", input: scenarioInput({ progress: "Completed" }), expectedCase: "CASE-09", expect: { authorization: "Withhold", status: "Completed", requestState: "Idle", gatePhase: "Closed" } }
  ])
});

scenarioTraces.push({
  scenario_id: "SCN-02",
  family: "replay-and-busy-boundary",
  trace: runTrace({ requestState: "Idle", gatePhase: "Closed", lastToken: "TokenA" }, [
    { scenario: "SCN-02", input: scenarioInput({ command: "Begin", token: "TokenA" }), expectedCase: "CASE-06", expect: { status: "DuplicateIgnored", decision: "NoDecision", energyTicket: "NoTicket" } },
    { scenario: "SCN-02", input: scenarioInput({ command: "Begin", token: "TokenB" }), expectedCase: "CASE-01", expect: { authorization: "Permit", status: "Authorized" } },
    { scenario: "SCN-02", input: scenarioInput({ command: "Begin", token: "TokenA" }), expectedCase: "CASE-07", expect: { authorization: "Permit", status: "Busy", decision: "NoDecision" } }
  ])
});

scenarioTraces.push({
  scenario_id: "SCN-03",
  family: "qualification-boundary-and-invalid",
  trace: runTrace(initial, [
    { scenario: "SCN-03", input: scenarioInput({ command: "Begin", token: "TokenA", energy: "LowCurrent" }), expectedCase: "CASE-02", expect: { authorization: "Withhold", status: "DeniedPower", decision: "DenyPower" } },
    { scenario: "SCN-03", input: scenarioInput({ command: "Begin", token: "TokenB", camera: "UnavailableCurrent" }), expectedCase: "CASE-04", expect: { status: "DeniedSupport", decision: "DenySupport" } },
    { scenario: "SCN-03", input: scenarioInput({ command: "Begin", token: "TokenA", camera: "Stale" }), expectedCase: "CASE-05", expect: { status: "DeniedSupport", decision: "DenySupport" } },
    { scenario: "SCN-03", input: scenarioInput({ command: "Begin", token: "TokenB", energy: "Invalid" }), expectedCase: "CASE-03", expect: { status: "DeniedPower", decision: "DenyPower" } }
  ])
});

scenarioTraces.push({
  scenario_id: "SCN-04",
  family: "service-fault",
  trace: [
    ...runTrace(initial, [
      { scenario: "SCN-04", input: scenarioInput({ command: "Begin", token: "TokenA" }), expectedCase: "CASE-01", expect: { authorization: "Permit" } },
      { scenario: "SCN-04", input: scenarioInput({ progress: "Active" }), expectedCase: "TRANS-02", expect: { gatePhase: "Active" } },
      { scenario: "SCN-04", input: scenarioInput({ progress: "Failed" }), expectedCase: "CASE-10", expect: { authorization: "Withhold", status: "ServiceFailed", gatePhase: "FailureHold" } }
    ]),
    ...runTrace(initial, [
      { scenario: "SCN-04", input: scenarioInput({ progress: "Active" }), expectedCase: "CASE-11", expect: { authorization: "Withhold", status: "ServiceFailed", gatePhase: "FailureHold" } }
    ]),
    ...runTrace({ requestState: "Engaged", gatePhase: "Active", lastToken: "TokenA" }, [
      { scenario: "SCN-04", input: scenarioInput({ progress: "Idle" }), expectedCase: "CASE-11", expect: { authorization: "Withhold", status: "ServiceFailed", gatePhase: "FailureHold" } }
    ])
  ]
});

scenarioTraces.push({
  scenario_id: "SCN-05",
  family: "recovery-and-cancellation",
  trace: runTrace({ requestState: "RecoveryHold", gatePhase: "FailureHold", lastToken: "TokenA" }, [
    { scenario: "SCN-05", input: scenarioInput({ command: "Begin", token: "TokenB", progress: "Active" }), expectedCase: "CASE-12", expect: { authorization: "Withhold", status: "AwaitingRecovery", decision: "NoDecision" } },
    { scenario: "SCN-05", input: scenarioInput({ progress: "Idle" }), expectedCase: "CASE-12", expect: { authorization: "Withhold", status: "Idle", requestState: "Idle", gatePhase: "Closed" } },
    { scenario: "SCN-05", input: scenarioInput({ command: "Begin", token: "TokenB" }), expectedCase: "CASE-01", expect: { authorization: "Permit", status: "Authorized" } },
    { scenario: "SCN-05", input: scenarioInput({ command: "Cancel", token: "TokenB" }), expectedCase: "CASE-08", expect: { authorization: "Withhold", status: "Cancelled", requestState: "Idle", gatePhase: "Closed" } }
  ])
});

for (const [owner, counts] of Object.entries(localBranchCounts)) {
  if (Object.values(counts).some(count => count === 0)) gaps.push({ owner, reason: "declared branch unreachable", counts });
}
executedAnalyzerChecks.add("gate-priority-and-recovery");

const requiredOutputMismatches = mismatches.length;
const allPassed = gaps.length === 0 && overlaps.length === 0 && mismatches.length === 0 && invariantViolations.length === 0 && violations.length === 0;

const result = {
  status: allPassed ? "passed" : "failed",
  passed: allPassed,
  source_sha256: SOURCE_SHA256,
  campaign_complexity: "small",
  semantic_connection_map: connectionMap,
  partition_counts: {
    request_lifecycle_products: lifecycleProducts,
    energy_qualification_products: energyProducts,
    support_qualification_products: supportProducts,
    arbiter_tagged_context_products: arbiterProducts,
    gate_phase_decision_progress_products: gateProducts,
    committed_request_state_gate_phase_pairs: committedPreStatePairProducts,
    explicitly_rejected_non_admissible_pairs: rejectedPreStatePairs,
    composed_root_input_state_snapshots: rootSnapshots,
    scenario_families: scenarioTraces.length,
    local_branch_counts: localBranchCounts
  },
  gaps,
  overlaps,
  required_output_mismatches: requiredOutputMismatches,
  mismatch_details: mismatches,
  invariant_checks: {
    admissible_committed_pairs: ["Idle/Closed", "Pending/Closed", "Engaged/Authorized", "Engaged/Active", "RecoveryHold/FailureHold"],
    checked_snapshots: rootSnapshots,
    checked_request_state_gate_phase_pairs: committedPreStatePairProducts,
    explicitly_rejected_non_admissible_pairs: rejectedPreStatePairs,
    violations: invariantViolations
  },
  ownership_audit: ownershipAudit.map(entry => ({
    ...entry,
    passed: allPassed && entry.analyzer_checks.every(checkName => executedAnalyzerChecks.has(checkName))
  })),
  canonical_guard_crosscheck: {
    status: allPassed ? "passed" : "failed",
    checked_contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    guard_source: "embedded unordered exact mirror of canonical AuthorizationGate raw compute-case guards and TaggedTicket/EvaluationTicket literal mapping",
    raw_gate_compute_cases: canonicalGateComputeCases.map(computeCase => computeCase.name),
    raw_gate_valuations_checked: gateProducts,
    completion_priority_over_denial_valuations: completionPriorityValuations,
    raw_guard_gaps: gaps.filter(entry => entry.owner === "authorizationGate").length,
    raw_guard_overlaps: overlaps.filter(entry => entry.owner === "authorizationGate").length,
    conflicting_guarantees: violations.filter(entry => entry.check === "conflicting-raw-compute-case-guarantees").length
  },
  scenario_traces: scenarioTraces,
  bounded_analysis_claim_boundary: "Exhaustive only over the finite logical enums, five admissible committed state-pair families, owner-local relations, explicit INT-06..INT-12 composition, and named scenarios in SA-FOS-01. This is not compositional proof, solver certification, generated-code correctness, execution evidence, physical-performance evidence, or safety certification."
};

process.stdout.write(`${JSON.stringify(result)}\n`);
