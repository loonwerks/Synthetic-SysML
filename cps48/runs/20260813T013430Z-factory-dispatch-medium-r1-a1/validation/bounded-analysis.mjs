const SOURCE_SHA256 = "51b6e31e3dbad8e6f5baf352dc8c68631e79837efda1275e09e2c6a3aee1816d";

const ids = ["None", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8"];
const products = ["None", "P1", "P2", "P3", "P4"];
const amounts = [0, 1, 2, 3, 4];
const freshnesses = ["Fresh", "Repeated"];
const validities = ["Valid", "Invalid"];
const dockDispositions = ["Ready", "Occupied", "Unavailable"];
const attempts = ["FreshAttempt", "RetryAttempt"];
const results = ["NoReport", "InProgress", "Completed", "Failed"];
const lifecycles = ["Idle", "ActiveFresh", "RecoveryPending", "ActiveRetry", "TerminalCompleted", "TerminalFailed"];
const admissions = ["NoRequest", "Malformed", "Repeated", "AdmissibleFresh"];
const inventoryAssessments = ["NotApplicable", "Sufficient", "Insufficient", "Unknown"];
const dockAssessments = ["Ready", "Blocked", "Unknown"];
const plans = ["Preserve", "Completed", "RetryEligible", "Abort"];
const intents = ["None", "FreshIntent", "RecoveryIntent"];
const reasons = ["Idle", "Rejected", "WaitingInventory", "WaitingDock", "Busy", "Released", "TerminalReset"];

const semanticConnectionMap = [
  ["INT-01", "root.request", "request_qualifier.request"],
  ["INT-02", "root.inventorySnapshot", "inventory_qualifier.inventory_snapshot"],
  ["INT-03", "root.dockSnapshot", "dock_qualifier.dock_snapshot"],
  ["INT-04", "root.executionOutcome", "outcome_recovery_classifier.execution_outcome"],
  ["INT-05", "request_qualifier.inventory_request_fact", "inventory_qualifier.request_fact"],
  ["INT-06", "request_qualifier.priority_admission", "dispatch_priority_resolver.admission"],
  ["INT-07", "request_qualifier.arbiter_request_fact", "release_arbiter.request_fact"],
  ["INT-08", "inventory_qualifier.candidate_readiness", "release_arbiter.candidate_readiness"],
  ["INT-09", "dock_qualifier.assessment", "release_arbiter.dock_assessment"],
  ["INT-10", "commitment_tracker.execution_context", "outcome_recovery_classifier.execution_context"],
  ["INT-11", "outcome_recovery_classifier.recovery_plan", "dispatch_priority_resolver.recovery_plan"],
  ["INT-12", "outcome_recovery_classifier.transition_plan", "commitment_tracker.outcome_plan"],
  ["INT-13", "dispatch_priority_resolver.selected_intent", "release_arbiter.selected_intent"],
  ["INT-14", "commitment_tracker.recovery_context", "inventory_qualifier.recovery_context"],
  ["INT-15", "release_arbiter.dispatch_decision", "commitment_tracker.dispatch_decision"],
  ["INT-16", "commitment_tracker.shipment_instruction", "root.shipmentInstruction"],
  ["INT-17", "outcome_recovery_classifier.confirmation_context", "confirmation_determiner.confirmation_context"],
  ["INT-18", "confirmation_determiner.shipping_confirmation", "root.shippingConfirmation"],
  ["INT-19", "release_arbiter.decision_reason", "status_determiner.decision_reason"],
  ["INT-20", "commitment_tracker.lifecycle_snapshot", "status_determiner.lifecycle_snapshot"],
  ["INT-21", "status_determiner.dispatch_status", "root.dispatchStatus"]
];

const noRequest = () => ({ requestId: "None", productId: "None", amount: 0, freshness: "Fresh" });
const noPayload = () => ({ requestId: "None", productId: "None", amount: 0 });
const noInstruction = () => ({ kind: "NoInstruction", ...noPayload() });
const noConfirmation = () => ({ kind: "None", requestId: "None" });
const initialState = () => ({ lifecycle: "Idle", ...noPayload(), attempt: "FreshAttempt" });
const eq = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const bump = (object, key) => { object[key] = (object[key] ?? 0) + 1; };

function requestOwner(request) {
  if (request.requestId === "None" && request.productId === "None" && request.amount === 0) return "NoRequest";
  if (request.requestId === "None" || request.productId === "None" || request.amount === 0) return "Malformed";
  return request.freshness === "Repeated" ? "Repeated" : "AdmissibleFresh";
}
function requestOracle(request) {
  const sentinel = request.requestId === "None" && request.productId === "None" && request.amount === 0;
  const wellFormed = request.requestId !== "None" && request.productId !== "None" && [1, 2, 3, 4].includes(request.amount);
  if (sentinel) return "NoRequest";
  if (!wellFormed) return "Malformed";
  if (request.freshness === "Fresh") return "AdmissibleFresh";
  return "Repeated";
}

function freshInventoryOwner(fact, snapshot) {
  if (fact.assessment !== "AdmissibleFresh") return "NotApplicable";
  if (snapshot.validity !== "Valid" || fact.productId === "None" || snapshot.productId !== fact.productId) return "Unknown";
  return snapshot.amount >= fact.amount ? "Sufficient" : "Insufficient";
}
function freshInventoryOracle(fact, snapshot) {
  if (fact.assessment !== "AdmissibleFresh") return "NotApplicable";
  const matches = snapshot.validity === "Valid" && fact.productId !== "None" && snapshot.productId === fact.productId;
  if (!matches) return "Unknown";
  const atLeast = [
    [true, true, true, true, true],
    [false, true, true, true, true],
    [false, false, true, true, true],
    [false, false, false, true, true],
    [false, false, false, false, true]
  ];
  return atLeast[fact.amount][snapshot.amount] ? "Sufficient" : "Insufficient";
}
function recoveryInventoryOwner(context, snapshot) {
  const applicable = context.lifecycle === "RecoveryPending" && context.requestId !== "None" && context.productId !== "None" && context.amount !== 0;
  if (!applicable) return "NotApplicable";
  if (snapshot.validity !== "Valid" || snapshot.productId !== context.productId) return "Unknown";
  return snapshot.amount >= context.amount ? "Sufficient" : "Insufficient";
}
function recoveryInventoryOracle(context, snapshot) {
  if (context.lifecycle !== "RecoveryPending" || context.requestId === "None" || context.productId === "None" || context.amount === 0) return "NotApplicable";
  if (!(snapshot.validity === "Valid" && snapshot.productId === context.productId)) return "Unknown";
  const allowed = {
    1: [1, 2, 3, 4],
    2: [2, 3, 4],
    3: [3, 4],
    4: [4]
  };
  return allowed[context.amount].includes(snapshot.amount) ? "Sufficient" : "Insufficient";
}
function inventoryOwner(fact, recoveryContext, snapshot) {
  return {
    freshAssessment: freshInventoryOwner(fact, snapshot),
    recoveryAssessment: recoveryInventoryOwner(recoveryContext, snapshot),
    recoveryRequestId: recoveryContext.requestId,
    recoveryProductId: recoveryContext.productId,
    recoveryAmount: recoveryContext.amount,
    lifecycleCapacity: recoveryContext.lifecycle
  };
}

function dockOwner(snapshot) {
  if (snapshot.validity !== "Valid") return "Unknown";
  return snapshot.disposition === "Ready" ? "Ready" : "Blocked";
}
function dockOracle(snapshot) {
  if (snapshot.validity === "Invalid") return "Unknown";
  if (snapshot.disposition === "Occupied" || snapshot.disposition === "Unavailable") return "Blocked";
  return "Ready";
}

function outcomeOwner(raw, context) {
  if (context.lifecycle === "RecoveryPending") return "RetryEligible";
  const active = context.lifecycle === "ActiveFresh" || context.lifecycle === "ActiveRetry";
  const matching = active && context.requestId !== "None" && raw.requestId === context.requestId && raw.attempt === context.attempt;
  if (!matching) return "Preserve";
  if (raw.result === "Completed") return "Completed";
  if (raw.result === "Failed" && context.lifecycle === "ActiveFresh") return "RetryEligible";
  if (raw.result === "Failed" && context.lifecycle === "ActiveRetry") return "Abort";
  return "Preserve";
}
function outcomeOracle(raw, context) {
  if (context.lifecycle === "RecoveryPending") return "RetryEligible";
  if (!(context.lifecycle === "ActiveFresh" || context.lifecycle === "ActiveRetry")) return "Preserve";
  if (context.requestId === "None" || raw.requestId !== context.requestId || raw.attempt !== context.attempt) return "Preserve";
  const table = {
    ActiveFresh: { NoReport: "Preserve", InProgress: "Preserve", Completed: "Completed", Failed: "RetryEligible" },
    ActiveRetry: { NoReport: "Preserve", InProgress: "Preserve", Completed: "Completed", Failed: "Abort" }
  };
  return table[context.lifecycle][raw.result];
}

function priorityOwner(admission, plan) {
  if (plan === "RetryEligible") return "RecoveryIntent";
  if (admission === "AdmissibleFresh") return "FreshIntent";
  return "None";
}
function priorityOracle(admission, plan) {
  const recoveryWins = plan === "RetryEligible";
  const freshEligible = admission === "AdmissibleFresh";
  return recoveryWins ? "RecoveryIntent" : freshEligible ? "FreshIntent" : "None";
}

function arbiterOwner({ fact, readiness, dock, intent }) {
  const fresh = { requestId: fact.requestId, productId: fact.productId, amount: fact.amount };
  const stored = { requestId: readiness.recoveryRequestId, productId: readiness.recoveryProductId, amount: readiness.recoveryAmount };
  const lifecycle = readiness.lifecycleCapacity;
  if (lifecycle === "TerminalCompleted" || lifecycle === "TerminalFailed") return { kind: "ResetIdle", reason: "TerminalReset", payload: noPayload() };
  if ((lifecycle === "ActiveFresh" || lifecycle === "ActiveRetry") && fact.assessment !== "NoRequest") return { kind: "Busy", reason: "Busy", payload: stored };
  if (lifecycle === "ActiveFresh" || lifecycle === "ActiveRetry") return { kind: "None", reason: "Released", payload: noPayload() };
  if (lifecycle === "Idle" && (fact.assessment === "Malformed" || fact.assessment === "Repeated")) return { kind: "Reject", reason: "Rejected", payload: noPayload() };
  const selectedAssessment = intent === "RecoveryIntent" ? readiness.recoveryAssessment : readiness.freshAssessment;
  const selectedPayload = intent === "RecoveryIntent" ? stored : fresh;
  if (intent !== "None" && selectedAssessment !== "Sufficient") return { kind: "WaitInventory", reason: "WaitingInventory", payload: selectedPayload };
  if (intent !== "None" && selectedAssessment === "Sufficient" && dock !== "Ready") return { kind: "WaitDock", reason: "WaitingDock", payload: selectedPayload };
  if (lifecycle === "Idle" && intent === "FreshIntent" && selectedAssessment === "Sufficient" && dock === "Ready") return { kind: "ReleaseFresh", reason: "Released", payload: fresh };
  if (lifecycle === "RecoveryPending" && intent === "RecoveryIntent" && selectedAssessment === "Sufficient" && dock === "Ready") return { kind: "ReleaseRetry", reason: "Released", payload: stored };
  return { kind: "None", reason: "Idle", payload: noPayload() };
}
function arbiterOracle(input) {
  const lifecycle = input.readiness.lifecycleCapacity;
  if (lifecycle.startsWith("Terminal")) return ["ResetIdle", "TerminalReset"];
  if ((lifecycle === "ActiveFresh" || lifecycle === "ActiveRetry") && input.fact.assessment !== "NoRequest") return ["Busy", "Busy"];
  if (lifecycle === "ActiveFresh" || lifecycle === "ActiveRetry") return ["None", "Released"];
  if (lifecycle === "Idle" && ["Malformed", "Repeated"].includes(input.fact.assessment)) return ["Reject", "Rejected"];
  const assessment = input.intent === "RecoveryIntent" ? input.readiness.recoveryAssessment : input.readiness.freshAssessment;
  if (input.intent !== "None" && assessment !== "Sufficient") return ["WaitInventory", "WaitingInventory"];
  if (input.intent !== "None" && assessment === "Sufficient" && input.dock !== "Ready") return ["WaitDock", "WaitingDock"];
  if (lifecycle === "Idle" && input.intent === "FreshIntent") return ["ReleaseFresh", "Released"];
  if (lifecycle === "RecoveryPending" && input.intent === "RecoveryIntent") return ["ReleaseRetry", "Released"];
  return ["None", "Idle"];
}

function trackerOwner(state, plan, decision) {
  let next = { ...state };
  let instruction = noInstruction();
  if ((state.lifecycle === "TerminalCompleted" || state.lifecycle === "TerminalFailed") && decision.kind === "ResetIdle") return { state: initialState(), instruction };
  if (state.lifecycle === "Idle" && decision.kind === "ReleaseFresh") {
    next = { lifecycle: "ActiveFresh", ...decision.payload, attempt: "FreshAttempt" };
    instruction = { kind: "ReleaseFresh", ...decision.payload };
  } else if ((state.lifecycle === "ActiveFresh" || state.lifecycle === "ActiveRetry") && plan === "Completed") {
    next.lifecycle = "TerminalCompleted";
  } else if (state.lifecycle === "ActiveFresh" && plan === "RetryEligible") {
    next.lifecycle = "RecoveryPending";
  } else if (state.lifecycle === "RecoveryPending" && decision.kind === "ReleaseRetry") {
    next.lifecycle = "ActiveRetry";
    next.attempt = "RetryAttempt";
    instruction = { kind: "ReleaseRetry", requestId: state.requestId, productId: state.productId, amount: state.amount };
  } else if (state.lifecycle === "ActiveRetry" && plan === "Abort") {
    next.lifecycle = "TerminalFailed";
    instruction = { kind: "Cancel", requestId: state.requestId, productId: state.productId, amount: state.amount };
  }
  return { state: next, instruction };
}
function trackerOracle(state, plan, decision) {
  if (state.lifecycle.startsWith("Terminal") && decision.kind === "ResetIdle") return "Idle";
  if (state.lifecycle === "Idle" && decision.kind === "ReleaseFresh") return "ActiveFresh";
  if ((state.lifecycle === "ActiveFresh" || state.lifecycle === "ActiveRetry") && plan === "Completed") return "TerminalCompleted";
  if (state.lifecycle === "ActiveFresh" && plan === "RetryEligible") return "RecoveryPending";
  if (state.lifecycle === "RecoveryPending" && decision.kind === "ReleaseRetry") return "ActiveRetry";
  if (state.lifecycle === "ActiveRetry" && plan === "Abort") return "TerminalFailed";
  return state.lifecycle;
}

function confirmationOwner(plan, requestId) {
  if (plan === "Completed") return { kind: "Shipped", requestId };
  if (plan === "Abort") return { kind: "DispatchFailed", requestId };
  return noConfirmation();
}
function confirmationOracle(plan) {
  const table = { Preserve: "None", RetryEligible: "None", Completed: "Shipped", Abort: "DispatchFailed" };
  return table[plan];
}

function statusOwner(reason, lifecycle) {
  if (lifecycle === "TerminalCompleted") return "Completed";
  if (lifecycle === "TerminalFailed") return "Failed";
  if (lifecycle === "RecoveryPending") return "Recovering";
  if (lifecycle === "ActiveFresh" || lifecycle === "ActiveRetry") return reason === "Busy" ? "Busy" : "Released";
  if (reason === "TerminalReset") return "Idle";
  if (reason === "Rejected" || reason === "WaitingInventory" || reason === "WaitingDock") return reason;
  return "Idle";
}
function statusOracle(reason, lifecycle) {
  const lifecycleStatus = { TerminalCompleted: "Completed", TerminalFailed: "Failed", RecoveryPending: "Recovering" }[lifecycle];
  if (lifecycleStatus) return lifecycleStatus;
  if (["ActiveFresh", "ActiveRetry"].includes(lifecycle)) return reason === "Busy" ? "Busy" : "Released";
  const reasonStatus = { Rejected: "Rejected", WaitingInventory: "WaitingInventory", WaitingDock: "WaitingDock", TerminalReset: "Idle" }[reason];
  return reasonStatus ?? "Idle";
}

function step(state, request, inventorySnapshot, dockSnapshot, executionOutcome) {
  const wire = { "INT-01": request, "INT-02": inventorySnapshot, "INT-03": dockSnapshot, "INT-04": executionOutcome };
  const admission = requestOwner(wire["INT-01"]);
  const fact = { assessment: admission, ...wire["INT-01"] };
  wire["INT-05"] = fact;
  wire["INT-06"] = admission;
  wire["INT-07"] = fact;
  wire["INT-10"] = { lifecycle: state.lifecycle, requestId: state.requestId, attempt: state.attempt };
  wire["INT-14"] = { lifecycle: state.lifecycle, requestId: state.requestId, productId: state.productId, amount: state.amount };
  wire["INT-08"] = inventoryOwner(wire["INT-05"], wire["INT-14"], wire["INT-02"]);
  wire["INT-09"] = dockOwner(wire["INT-03"]);
  const plan = outcomeOwner(wire["INT-04"], wire["INT-10"]);
  wire["INT-11"] = plan;
  wire["INT-12"] = plan;
  wire["INT-13"] = priorityOwner(wire["INT-06"], wire["INT-11"]);
  const arbiterInput = { fact: wire["INT-07"], readiness: wire["INT-08"], dock: wire["INT-09"], intent: wire["INT-13"] };
  wire["INT-15"] = arbiterOwner(arbiterInput);
  const tracked = trackerOwner(state, wire["INT-12"], wire["INT-15"]);
  wire["INT-16"] = tracked.instruction;
  wire["INT-17"] = { plan, requestId: state.requestId };
  wire["INT-18"] = confirmationOwner(wire["INT-17"].plan, wire["INT-17"].requestId);
  wire["INT-19"] = wire["INT-15"].reason;
  wire["INT-20"] = tracked.state.lifecycle;
  wire["INT-21"] = statusOwner(wire["INT-19"], wire["INT-20"]);
  return {
    admission,
    freshInventory: wire["INT-08"].freshAssessment,
    recoveryInventory: wire["INT-08"].recoveryAssessment,
    dock: wire["INT-09"],
    plan,
    intent: wire["INT-13"],
    decision: wire["INT-15"],
    instruction: wire["INT-16"],
    confirmation: wire["INT-18"],
    status: wire["INT-21"],
    nextState: tracked.state
  };
}

const counters = { oracle_mismatches: 0, local_gaps: 0, unintended_local_overlaps: 0, required_output_mismatches: 0 };
const partitions = { request: {}, fresh_inventory: {}, recovery_inventory: {}, dock: {}, outcome: {}, priority: {}, arbiter: {}, root_decision: {} };

let requestValuations = 0;
for (const requestId of ids) for (const productId of products) for (const amount of amounts) for (const freshness of freshnesses) {
  const request = { requestId, productId, amount, freshness };
  const actual = requestOwner(request);
  requestValuations++;
  bump(partitions.request, actual);
  if (actual !== requestOracle(request)) counters.oracle_mismatches++;
}

let freshInventoryPairs = 0;
let recoveryInventoryPairs = 0;
for (const requestId of ids.slice(1)) for (const productId of products.slice(1)) for (const amount of amounts.slice(1))
for (const validity of validities) for (const snapshotProduct of products) for (const snapshotAmount of amounts) {
  const snapshot = { validity, productId: snapshotProduct, amount: snapshotAmount };
  const fact = { assessment: "AdmissibleFresh", requestId, productId, amount, freshness: "Fresh" };
  const recoveryContext = { lifecycle: "RecoveryPending", requestId, productId, amount };
  const freshActual = freshInventoryOwner(fact, snapshot);
  const recoveryActual = recoveryInventoryOwner(recoveryContext, snapshot);
  freshInventoryPairs++;
  recoveryInventoryPairs++;
  bump(partitions.fresh_inventory, freshActual);
  bump(partitions.recovery_inventory, recoveryActual);
  if (freshActual !== freshInventoryOracle(fact, snapshot)) counters.oracle_mismatches++;
  if (recoveryActual !== recoveryInventoryOracle(recoveryContext, snapshot)) counters.oracle_mismatches++;
}

let dockValuations = 0;
for (const validity of validities) for (const disposition of dockDispositions) {
  const snapshot = { validity, disposition };
  const actual = dockOwner(snapshot);
  dockValuations++;
  bump(partitions.dock, actual);
  if (actual !== dockOracle(snapshot)) counters.oracle_mismatches++;
}

let outcomeContextPairs = 0;
for (const lifecycle of lifecycles) for (const requestId of ids) for (const attempt of attempts)
for (const rawId of ids) for (const rawAttempt of attempts) for (const result of results) {
  const context = { lifecycle, requestId, attempt };
  const raw = { requestId: rawId, attempt: rawAttempt, result };
  const actual = outcomeOwner(raw, context);
  outcomeContextPairs++;
  bump(partitions.outcome, actual);
  if (actual !== outcomeOracle(raw, context)) counters.oracle_mismatches++;
}

let priorityPairs = 0;
for (const admission of admissions) for (const plan of plans) {
  const actual = priorityOwner(admission, plan);
  priorityPairs++;
  bump(partitions.priority, actual);
  if (actual !== priorityOracle(admission, plan)) counters.oracle_mismatches++;
}

let rootInputValuations = 0;
const idle = initialState();
for (const requestId of ids) for (const productId of products) for (const amount of amounts) for (const freshness of freshnesses)
for (const validity of validities) for (const snapshotProduct of products) for (const snapshotAmount of amounts)
for (const dockValidity of validities) for (const disposition of dockDispositions)
for (const rawId of ids) for (const rawAttempt of attempts) for (const result of results) {
  const observed = step(
    idle,
    { requestId, productId, amount, freshness },
    { validity, productId: snapshotProduct, amount: snapshotAmount },
    { validity: dockValidity, disposition },
    { requestId: rawId, attempt: rawAttempt, result }
  );
  rootInputValuations++;
  bump(partitions.root_decision, observed.decision.kind);
  bump(partitions.arbiter, observed.decision.kind);
  if (!observed.instruction || !observed.confirmation || !observed.status || !observed.nextState) counters.required_output_mismatches++;
  if (observed.decision.kind === "ReleaseFresh" && !(observed.admission === "AdmissibleFresh" && observed.freshInventory === "Sufficient" && observed.dock === "Ready")) counters.required_output_mismatches++;
}

let terminalResetProducts = 0;
for (const terminalLifecycle of ["TerminalCompleted", "TerminalFailed"])
for (const requestId of ids) for (const productId of products) for (const amount of amounts) for (const freshness of freshnesses)
for (const freshAssessment of inventoryAssessments) for (const recoveryAssessment of inventoryAssessments)
for (const dock of dockAssessments) for (const intent of intents)
for (const recoveryRequestId of ids) for (const recoveryProductId of products) for (const recoveryAmount of amounts) {
  const request = { requestId, productId, amount, freshness };
  const fact = { assessment: requestOwner(request), ...request };
  const readiness = { freshAssessment, recoveryAssessment, recoveryRequestId, recoveryProductId, recoveryAmount, lifecycleCapacity: terminalLifecycle };
  const actual = arbiterOwner({ fact, readiness, dock, intent });
  terminalResetProducts++;
  bump(partitions.arbiter, actual.kind);
  if (actual.kind !== "ResetIdle" || actual.reason !== "TerminalReset" || !eq(actual.payload, noPayload())) counters.required_output_mismatches++;
  if (!eq([actual.kind, actual.reason], arbiterOracle({ fact, readiness, dock, intent }))) counters.oracle_mismatches++;
}

const representativeStates = [
  initialState(),
  { lifecycle: "ActiveFresh", requestId: "R1", productId: "P1", amount: 2, attempt: "FreshAttempt" },
  { lifecycle: "RecoveryPending", requestId: "R1", productId: "P1", amount: 2, attempt: "FreshAttempt" },
  { lifecycle: "ActiveRetry", requestId: "R1", productId: "P1", amount: 2, attempt: "RetryAttempt" },
  { lifecycle: "TerminalCompleted", requestId: "R1", productId: "P1", amount: 2, attempt: "FreshAttempt" },
  { lifecycle: "TerminalFailed", requestId: "R1", productId: "P1", amount: 2, attempt: "RetryAttempt" }
];
for (const state of representativeStates) for (const plan of plans)
for (const kind of ["None", "Reject", "WaitInventory", "WaitDock", "Busy", "ReleaseFresh", "ReleaseRetry", "ResetIdle"]) {
  const decision = { kind, reason: "Idle", payload: { requestId: "R2", productId: "P2", amount: 3 } };
  const actual = trackerOwner(state, plan, decision);
  if (actual.state.lifecycle !== trackerOracle(state, plan, decision)) counters.oracle_mismatches++;
}
for (const plan of plans) if (confirmationOwner(plan, "R1").kind !== confirmationOracle(plan)) counters.oracle_mismatches++;
for (const lifecycle of lifecycles) for (const reason of reasons) if (statusOwner(reason, lifecycle) !== statusOracle(reason, lifecycle)) counters.oracle_mismatches++;

const mkReq = (requestId = "R1", productId = "P1", amount = 2, freshness = "Fresh") => ({ requestId, productId, amount, freshness });
const goodInv = (productId = "P1", amount = 2) => ({ validity: "Valid", productId, amount });
const readyDock = { validity: "Valid", disposition: "Ready" };
const blockedDock = { validity: "Valid", disposition: "Occupied" };
const noOutcome = { requestId: "None", attempt: "FreshAttempt", result: "NoReport" };
const matchingOutcome = (state, result) => ({ requestId: state.requestId, attempt: state.attempt, result });

function executeTrace(name, steps) {
  let state = initialState();
  const observedSteps = [];
  for (const specification of steps) {
    if (specification.startState) state = { ...specification.startState };
    const observed = step(state, specification.request, specification.inventorySnapshot, specification.dockSnapshot, specification.executionOutcome);
    observedSteps.push({
      input_state: state,
      inputs: {
        request: specification.request,
        inventorySnapshot: specification.inventorySnapshot,
        dockSnapshot: specification.dockSnapshot,
        executionOutcome: specification.executionOutcome
      },
      expected_case: specification.expectedCase,
      observed: {
        freshInventory: observed.freshInventory,
        recoveryInventory: observed.recoveryInventory,
        selectedIntent: observed.intent,
        decision: observed.decision,
        instruction: observed.instruction,
        confirmation: observed.confirmation,
        status: observed.status,
        next_state: observed.nextState
      }
    });
    state = observed.nextState;
  }
  return { name, steps: observedSteps };
}

const releaseStep = { request: mkReq(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-10" };
const firstFailureStep = { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "FreshAttempt", result: "Failed" }, expectedCase: "CCASE-16" };
const retryNoRequestStep = { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-17" };
const retryCompetitorStep = { request: mkReq("R2", "P2", 1), inventorySnapshot: goodInv("P1", 2), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-14/CCASE-17" };
const retryNegativeStep = { request: mkReq("R2", "P2", 1), inventorySnapshot: goodInv("P2", 1), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-11" };

const scenarios = [
  { id: "SCN-01", family: "fresh-eligible-release", traces: [executeTrace("fresh-release", [releaseStep])] },
  { id: "SCN-02", family: "request-rejection", traces: [
    executeTrace("malformed-rejection", [{ request: mkReq("None", "P1", 2), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-01" }]),
    executeTrace("repeated-rejection", [{ request: mkReq("R2", "P2", 1, "Repeated"), inventorySnapshot: goodInv("P2", 1), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-02" }])
  ] },
  { id: "SCN-03", family: "candidate-specific-inventory-wait-and-precedence", traces: [
    executeTrace("fresh-inventory-wait-precedes-dock", [{ request: mkReq(), inventorySnapshot: goodInv("P1", 1), dockSnapshot: blockedDock, executionOutcome: noOutcome, expectedCase: "CCASE-11" }]),
    executeTrace("recovery-uses-stored-readiness", [releaseStep, firstFailureStep, retryNegativeStep])
  ] },
  { id: "SCN-04", family: "dock-wait", traces: [
    executeTrace("fresh-dock-wait", [{ request: mkReq(), inventorySnapshot: goodInv("P1", 3), dockSnapshot: blockedDock, executionOutcome: noOutcome, expectedCase: "CCASE-12" }]),
    executeTrace("recovery-dock-wait", [releaseStep, firstFailureStep, { ...retryNoRequestStep, dockSnapshot: blockedDock, expectedCase: "CCASE-12" }])
  ] },
  { id: "SCN-05", family: "protected-work-conflict", traces: [
    executeTrace("active-fresh-preserves-identity", [releaseStep, { request: mkReq("R2", "P2", 1), inventorySnapshot: goodInv("P2", 1), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-13" }])
  ] },
  { id: "SCN-06", family: "successful-completion-and-reset", traces: [
    executeTrace("fresh-completion-reset", [releaseStep, { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "FreshAttempt", result: "Completed" }, expectedCase: "CCASE-15" }, { request: mkReq("R3", "P3", 4), inventorySnapshot: goodInv("P3", 4), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-15-terminal-reset" }]),
    executeTrace("retry-completion-reset", [releaseStep, firstFailureStep, retryNoRequestStep, { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "RetryAttempt", result: "Completed" }, expectedCase: "CCASE-15" }, { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-15-terminal-reset" }])
  ] },
  { id: "SCN-07", family: "recoverable-failure-and-stored-payload-retry", traces: [
    executeTrace("retry-with-no-presented-request", [releaseStep, firstFailureStep, retryNoRequestStep]),
    executeTrace("retry-outranks-different-competitor", [releaseStep, firstFailureStep, retryCompetitorStep]),
    executeTrace("competitor-only-readiness-cannot-authorize-retry", [releaseStep, firstFailureStep, retryNegativeStep])
  ] },
  { id: "SCN-08", family: "stale-feedback-retry-termination-and-reset", traces: [
    executeTrace("preserve-then-abort-reset", [
      releaseStep,
      firstFailureStep,
      retryNoRequestStep,
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "RetryAttempt", result: "NoReport" }, expectedCase: "CCASE-19" },
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "RetryAttempt", result: "InProgress" }, expectedCase: "CCASE-19" },
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R8", attempt: "RetryAttempt", result: "Completed" }, expectedCase: "CCASE-19" },
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "FreshAttempt", result: "Completed" }, expectedCase: "CCASE-19" },
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: { requestId: "R1", attempt: "RetryAttempt", result: "Failed" }, expectedCase: "CCASE-18" },
      { request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-18-terminal-reset" }
    ])
  ] }
];

const flattenedScenarioSteps = scenarios.flatMap(scenario => scenario.traces.flatMap(trace => trace.steps));
const findStep = (expectedCase, predicate = () => true) => flattenedScenarioSteps.find(item => item.expected_case === expectedCase && predicate(item));
const caseWitnesses = {
  "CCASE-01": findStep("CCASE-01"),
  "CCASE-02": findStep("CCASE-02"),
  "CCASE-03": { request: mkReq(), admission: requestOwner(mkReq()) },
  "CCASE-04": { candidate: mkReq(), snapshot: goodInv(), fresh: freshInventoryOwner({ assessment: "AdmissibleFresh", ...mkReq() }, goodInv()), recovery: recoveryInventoryOwner({ lifecycle: "RecoveryPending", requestId: "R1", productId: "P1", amount: 2 }, goodInv()) },
  "CCASE-05": { candidate: mkReq(), snapshot: goodInv("P1", 1), fresh: freshInventoryOwner({ assessment: "AdmissibleFresh", ...mkReq() }, goodInv("P1", 1)), recovery: recoveryInventoryOwner({ lifecycle: "RecoveryPending", requestId: "R1", productId: "P1", amount: 2 }, goodInv("P1", 1)) },
  "CCASE-06": { invalid: freshInventoryOwner({ assessment: "AdmissibleFresh", ...mkReq() }, { validity: "Invalid", productId: "P1", amount: 4 }), absent: recoveryInventoryOwner({ lifecycle: "Idle", ...noPayload() }, goodInv()) },
  "CCASE-07": { snapshot: readyDock, assessment: dockOwner(readyDock) },
  "CCASE-08": { snapshot: blockedDock, assessment: dockOwner(blockedDock) },
  "CCASE-09": { snapshot: { validity: "Invalid", disposition: "Ready" }, assessment: dockOwner({ validity: "Invalid", disposition: "Ready" }) },
  "CCASE-10": findStep("CCASE-10"),
  "CCASE-11": findStep("CCASE-11"),
  "CCASE-12": findStep("CCASE-12"),
  "CCASE-13": findStep("CCASE-13"),
  "CCASE-14": findStep("CCASE-14/CCASE-17"),
  "CCASE-15": findStep("CCASE-15"),
  "CCASE-16": findStep("CCASE-16"),
  "CCASE-17": findStep("CCASE-17"),
  "CCASE-18": findStep("CCASE-18"),
  "CCASE-19": findStep("CCASE-19"),
  "CCASE-20": executeTrace("idle", [{ request: noRequest(), inventorySnapshot: goodInv(), dockSnapshot: readyDock, executionOutcome: noOutcome, expectedCase: "CCASE-20" }]).steps[0]
};

const ownership_audit = [
  { usage: "request_qualifier", claimed_roles: ["applicability"], assigned_inputs: ["request"], owner_local_facts: ["four-way admission classification"], contract_cases: ["CCASE-01", "CCASE-02", "CCASE-03", "CCASE-20"], analyzer_checks: ["request-owner-450-valuations"] },
  { usage: "inventory_qualifier", claimed_roles: ["applicability"], assigned_inputs: ["inventory_snapshot", "request_fact", "recovery_context"], owner_local_facts: ["candidate-specific fresh inventory assessment", "candidate-specific stored recovery inventory assessment"], contract_cases: ["CCASE-04", "CCASE-05", "CCASE-06"], analyzer_checks: ["fresh-inventory-owner-6400-pairs", "recovery-inventory-owner-6400-pairs"] },
  { usage: "dock_qualifier", claimed_roles: ["applicability"], assigned_inputs: ["dock_snapshot"], owner_local_facts: ["validity-disposition dock assessment"], contract_cases: ["CCASE-07", "CCASE-08", "CCASE-09"], analyzer_checks: ["dock-owner-6-valuations"] },
  { usage: "outcome_recovery_classifier", claimed_roles: ["applicability", "decision"], assigned_inputs: ["execution_outcome", "execution_context"], owner_local_facts: ["correlated state-dependent outcome plan"], contract_cases: ["CCASE-14", "CCASE-15", "CCASE-16", "CCASE-18", "CCASE-19"], analyzer_checks: ["outcome-owner-7776-context-pairs"] },
  { usage: "dispatch_priority_resolver", claimed_roles: ["decision"], assigned_inputs: ["admission", "recovery_plan"], owner_local_facts: ["recovery-over-fresh priority selection"], contract_cases: ["CCASE-14"], analyzer_checks: ["priority-owner-16-pairs"] },
  { usage: "release_arbiter", claimed_roles: ["decision"], assigned_inputs: ["request_fact", "candidate_readiness", "dock_assessment", "selected_intent"], owner_local_facts: ["matching-source release/wait/reject/busy decision", "terminal-pre-state reset decision"], contract_cases: ["CCASE-01", "CCASE-02", "CCASE-10", "CCASE-11", "CCASE-12", "CCASE-13", "CCASE-15", "CCASE-17", "CCASE-18", "CCASE-19", "CCASE-20"], analyzer_checks: ["arbiter-owner-partition-check", "terminal-reset-29160000-products"] },
  { usage: "commitment_tracker", claimed_roles: ["decision"], assigned_inputs: ["outcome_plan", "dispatch_decision", "In(lifecycle,payload,attempt)"], owner_local_facts: ["state-dependent commitment transition and instruction", "terminal reset clears commitment"], contract_cases: ["CCASE-10", "CCASE-11", "CCASE-12", "CCASE-15", "CCASE-16", "CCASE-17", "CCASE-18", "CCASE-19", "CCASE-20"], analyzer_checks: ["tracker-transition-oracle-check"] },
  { usage: "confirmation_determiner", claimed_roles: ["decision"], assigned_inputs: ["confirmation_context"], owner_local_facts: ["two-class confirmation suppression and terminal distinction"], contract_cases: ["CCASE-15", "CCASE-16", "CCASE-18", "CCASE-19"], analyzer_checks: ["confirmation-owner-four-classes"] },
  { usage: "status_determiner", claimed_roles: ["decision"], assigned_inputs: ["decision_reason", "lifecycle_snapshot"], owner_local_facts: ["terminal/recovery/busy/wait/reset status precedence"], contract_cases: ["CCASE-01", "CCASE-10", "CCASE-11", "CCASE-12", "CCASE-13", "CCASE-15", "CCASE-16", "CCASE-18", "CCASE-20"], analyzer_checks: ["status-owner-42-precedence-pairs"] }
];

const scn07NoRequest = scenarios[6].traces[0].steps.at(-1).observed;
const scn07Competitor = scenarios[6].traces[1].steps.at(-1).observed;
const scn07Negative = scenarios[6].traces[2].steps.at(-1).observed;
const scn08Steps = scenarios[7].traces[0].steps;
const preservedRetrySteps = scn08Steps.slice(3, 7);
const invariant_checks = {
  exact_root_input_domain_exhausted: rootInputValuations === 9720000,
  request_domain_exhausted: requestValuations === 450,
  fresh_inventory_product_exhausted: freshInventoryPairs === 6400,
  recovery_inventory_product_exhausted: recoveryInventoryPairs === 6400,
  dock_domain_exhausted: dockValuations === 6,
  outcome_context_product_exhausted: outcomeContextPairs === 7776,
  priority_product_exhausted: priorityPairs === 16,
  terminal_prestate_product_exhausted: terminalResetProducts === 29160000,
  all_20_case_witnesses: Object.keys(caseWitnesses).length === 20 && Object.values(caseWitnesses).every(Boolean),
  all_8_scenario_families_have_concrete_traces: scenarios.length === 8 && scenarios.every(scenario => scenario.traces.length > 0 && scenario.traces.every(trace => trace.steps.length > 0)),
  semantic_connection_map_exact: semanticConnectionMap.length === 21 && new Set(semanticConnectionMap.map(connection => connection[0])).size === 21,
  recovery_outprioritizes_fresh: priorityOwner("AdmissibleFresh", "RetryEligible") === "RecoveryIntent",
  no_same_evaluation_retry: scenarios[6].traces[0].steps[1].observed.instruction.kind === "NoInstruction",
  retry_without_presented_request_uses_stored_payload: scn07NoRequest.instruction.kind === "ReleaseRetry" && scn07NoRequest.instruction.requestId === "R1",
  retry_with_different_competitor_uses_stored_payload: scn07Competitor.instruction.kind === "ReleaseRetry" && scn07Competitor.instruction.requestId === "R1" && scn07Competitor.selectedIntent === "RecoveryIntent",
  competitor_only_readiness_cannot_authorize_retry: scn07Negative.instruction.kind === "NoInstruction" && scn07Negative.decision.kind === "WaitInventory" && scn07Negative.freshInventory === "Sufficient" && scn07Negative.recoveryInventory !== "Sufficient",
  protected_active_identity_preserved: scenarios[4].traces[0].steps[1].observed.next_state.requestId === "R1" && scenarios[4].traces[0].steps[1].observed.status === "Busy",
  fresh_and_retry_completion_covered: scenarios[5].traces.length === 2 && scenarios[5].traces.every(trace => trace.steps.some(item => item.observed.confirmation.kind === "Shipped")),
  stale_progress_mismatch_preserve_retry_state: preservedRetrySteps.every(item => item.observed.next_state.lifecycle === "ActiveRetry" && item.observed.next_state.requestId === "R1"),
  retry_failure_has_no_second_retry: scn08Steps[7].observed.next_state.lifecycle === "TerminalFailed" && scn08Steps[7].observed.instruction.kind === "Cancel",
  completed_and_failed_terminal_reset_to_idle: scenarios[5].traces.every(trace => trace.steps.at(-1).observed.next_state.lifecycle === "Idle" && trace.steps.at(-1).observed.status === "Idle" && trace.steps.at(-1).observed.confirmation.kind === "None") && scn08Steps.at(-1).observed.next_state.lifecycle === "Idle" && scn08Steps.at(-1).observed.status === "Idle" && scn08Steps.at(-1).observed.confirmation.kind === "None"
};

const allChecks = Object.values(invariant_checks).every(Boolean);
const passed = allChecks && Object.values(counters).every(value => value === 0);
const completedOwnershipAudit = ownership_audit.map(record => ({ ...record, passed }));
const output = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exact finite checking of the canonical owner-local relations, the 21-interaction semantic connection map, all finite root inputs, and named bounded state traces only; no compositional proof, solver certification, generated-code correctness, execution, quantitative timing, physical performance, safety, or certification claim.",
  semantic_connection_map: semanticConnectionMap,
  exhaustive_domain: {
    root_input_valuations: rootInputValuations,
    request_valuations: requestValuations,
    fresh_inventory_pairs: freshInventoryPairs,
    recovery_inventory_pairs: recoveryInventoryPairs,
    dock_valuations: dockValuations,
    outcome_context_pairs: outcomeContextPairs,
    priority_pairs: priorityPairs,
    terminal_prestate_products: terminalResetProducts
  },
  partition_counts: partitions,
  gaps: counters.local_gaps,
  overlaps: counters.unintended_local_overlaps,
  required_output_mismatches: counters.required_output_mismatches,
  oracle_mismatches: counters.oracle_mismatches,
  invariant_checks,
  ownership_audit: completedOwnershipAudit,
  case_witnesses: caseWitnesses,
  scenario_traces: scenarios
};
process.stdout.write(JSON.stringify(output));
