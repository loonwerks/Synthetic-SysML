#!/usr/bin/env node

"use strict";

// Deterministic bounded consistency analysis.  This program intentionally reads
// no files, environment, clock, randomness, network, or mutable external state.

const SOURCE_SHA256 = "c843b555f4601df7b706eb1bee8619349d98928143c2590fc50e3763aa634a7d";

const requests = [
  "R1_AngleA_One", "R1_AngleA_Two", "R1_AngleB_One", "R1_AngleB_Two",
  "R2_AngleA_One", "R2_AngleA_Two", "R2_AngleB_One", "R2_AngleB_Two"
];
const arrivals = ["No_Arrival"];
for (const status of ["Invalid", "Valid"]) for (const request of requests) arrivals.push(`${status}_${request}`);
const bands = ["Zero", "One", "Two_Or_More"];
const inventories = [];
for (const angleA of bands) for (const angleB of bands) for (const status of ["Valid", "Invalid"])
  inventories.push({ angleA, angleB, status });
const readinesses = [];
for (const readiness of ["Ready", "Not_Ready"]) for (const status of ["Valid", "Invalid"])
  readinesses.push({ readiness, status });
const results = ["No_Result"];
for (const status of ["Invalid", "Valid"]) for (const id of ["R1", "R2"]) for (const outcome of ["Succeeded", "Failed"])
  results.push(`${status}_${id}_${outcome}`);

const activeValues = ["Empty"];
for (const phase of ["Pending", "Submitted"]) for (const request of requests) activeValues.push(`${phase}_${request}`);
const completionValues = ["No_Completion", ...requests.map(request => `Completed_${request}`)];

const requestId = request => request === "No_Request" ? "None" : request.slice(0, 2);
const requestProduct = request => request.includes("AngleA") ? "AngleA" : "AngleB";
const requestAmount = request => request.endsWith("_One") ? "One" : "Two";
const activeRequest = active => active === "Empty" ? "No_Request" : active.replace(/^Pending_|^Submitted_/, "");
const completionRequest = completion => completion === "No_Completion" ? "No_Request" : completion.replace(/^Completed_/, "");
const activePending = active => active.startsWith("Pending_");
const activeSubmitted = active => active.startsWith("Submitted_");
const sameId = (left, right) => left !== "No_Request" && right !== "No_Request" && requestId(left) === requestId(right);
const invariant = state => state.active === "Empty" || !sameId(activeRequest(state.active), completionRequest(state.lastCompleted));

const states = [];
for (const active of activeValues) for (const lastCompleted of completionValues) {
  const state = { active, lastCompleted };
  if (invariant(state)) states.push(state);
}

const arrivalPresent = arrival => arrival !== "No_Arrival";
const arrivalInvalid = arrival => arrival.startsWith("Invalid_");
const arrivalValid = arrival => arrival.startsWith("Valid_");
const rawArrivalRequest = arrival => arrivalPresent(arrival) ? arrival.replace(/^Invalid_|^Valid_/, "") : "No_Request";
const resultPresent = result => result !== "No_Result";
const resultInvalid = result => result.startsWith("Invalid_");
const resultValid = result => result.startsWith("Valid_");
const resultSucceeded = result => resultValid(result) && result.endsWith("_Succeeded");
const resultFailed = result => resultValid(result) && result.endsWith("_Failed");
const resultId = result => resultPresent(result) ? result.split("_")[1] : "None";
const resultMatches = (result, active) => activeSubmitted(active) && resultId(result) === requestId(activeRequest(active));

// Owner-local relation for PART-01; no downstream owner inspects the raw arrival.
function requestQualification(arrival) {
  if (arrival === "No_Arrival") return "No_Arrival_Fact";
  if (arrivalInvalid(arrival)) return "Invalid_Arrival";
  return `Valid_${rawArrivalRequest(arrival)}`;
}

const factValid = fact => fact.startsWith("Valid_");
const factRequest = fact => factValid(fact) ? fact.replace(/^Valid_/, "") : "No_Request";
const factPresent = fact => fact !== "No_Arrival_Fact";

function registryGuardHits(fact, result, state) {
  const simultaneousOrInvalid = fact === "Invalid_Arrival" || resultInvalid(result) || (factValid(fact) && resultValid(result));
  const matchingSuccess = !simultaneousOrInvalid && resultSucceeded(result) && resultMatches(result, state.active);
  const matchingFailure = !simultaneousOrInvalid && resultFailed(result) && resultMatches(result, state.active);
  const staleResult = !simultaneousOrInvalid && resultValid(result) && !matchingSuccess && !matchingFailure;
  const noEvent = fact === "No_Arrival_Fact" && result === "No_Result";
  const request = factRequest(fact);
  const duplicate = result === "No_Result" && factValid(fact) &&
    (request === activeRequest(state.active) || request === completionRequest(state.lastCompleted));
  const conflict = result === "No_Result" && factValid(fact) && !duplicate &&
    (sameId(request, activeRequest(state.active)) || sameId(request, completionRequest(state.lastCompleted)));
  const accept = result === "No_Result" && factValid(fact) && !duplicate && !conflict && state.active === "Empty";
  const busy = result === "No_Result" && factValid(fact) && !duplicate && !conflict && state.active !== "Empty";
  return [simultaneousOrInvalid, matchingSuccess, matchingFailure, staleResult, noEvent, duplicate, conflict, accept, busy];
}

// Owner-local PART-02 event relation.  It consumes only INT-02, INT-03, pre-state,
// and later INT-09 for commit; it does not decide release eligibility.
function registryLocal(fact, result, state) {
  const hits = registryGuardHits(fact, result, state);
  const index = hits.findIndex(Boolean);
  const eventCase = `CASE-${String(index + 1).padStart(2, "0")}`;
  let provisional = { ...state };
  let outcome = "No_Registry_Notice";
  let eventBlocked = false;
  let recoveryHold = false;
  if (index === 0) { outcome = "Invalid_Event"; eventBlocked = true; }
  else if (index === 1) {
    provisional = { active: "Empty", lastCompleted: `Completed_${activeRequest(state.active)}` };
    outcome = "Shipment_Confirmed";
  } else if (index === 2) {
    provisional = { active: `Pending_${activeRequest(state.active)}`, lastCompleted: state.lastCompleted };
    outcome = "Shipment_Failed_Retry_Pending";
    recoveryHold = true;
  } else if (index === 3) outcome = "Stale_Result";
  else if (index === 4) outcome = "No_Registry_Notice";
  else if (index === 5) outcome = "Duplicate_Acknowledged";
  else if (index === 6) { outcome = "Identifier_Conflict"; eventBlocked = true; }
  else if (index === 7) {
    provisional = { active: `Pending_${factRequest(fact)}`, lastCompleted: state.lastCompleted };
    outcome = "Request_Accepted";
  } else outcome = "Busy";
  const request = activePending(provisional.active) ? activeRequest(provisional.active) : "No_Request";
  return {
    eventCase, guardHits: hits.filter(Boolean).length, provisional, outcome,
    pendingView: request, candidate: { request, eventBlocked, recoveryHold }
  };
}

// Owner-local PART-03 relation, consuming the pending view through INT-04 and
// the boundary inventory value through INT-05.
function inventoryLocal(pendingView, inventory) {
  if (pendingView === "No_Request") return "No_Demand";
  if (inventory.status === "Invalid") return "Invalid_Inventory";
  const band = requestProduct(pendingView) === "AngleA" ? inventory.angleA : inventory.angleB;
  const sufficient = requestAmount(pendingView) === "One" ? band !== "Zero" : band === "Two_Or_More";
  return sufficient ? "Sufficient" : "Insufficient";
}

const releaseFor = request => request === "No_Request" ? "No_Release" : `Release_${request}`;
const instructionFor = request => request === "No_Request" ? "No_State_Instruction" : `Mark_Submitted_${request}`;

function arbiterGuardHits(candidate, finding, readiness) {
  const noDemand = candidate.request === "No_Request";
  const eligible = !noDemand && !candidate.eventBlocked && !candidate.recoveryHold &&
    finding === "Sufficient" && readiness.status === "Valid" && readiness.readiness === "Ready";
  return [noDemand, !noDemand && !eligible, eligible];
}

// Sole principal decision relation for PART-04, consuming exactly INT-06,
// INT-07, and INT-08.  It produces INT-09/10/12 as one coherent choice.
function arbiterLocal(candidate, finding, readiness) {
  const hits = arbiterGuardHits(candidate, finding, readiness);
  if (hits[0]) return { dispatchCase: "CASE-10", guardHits: 1, release: "No_Release", instruction: "No_State_Instruction", disposition: "No_Dispatch_Demand" };
  if (hits[1]) {
    const disposition = candidate.eventBlocked ? "Event_Blocked" :
      candidate.recoveryHold ? "Recovery_Held" :
      finding === "Invalid_Inventory" ? "Inventory_Invalid" :
      readiness.status === "Invalid" ? "Readiness_Invalid" :
      finding === "Insufficient" ? "Waiting_Stock" : "Waiting_Dispatch";
    return { dispatchCase: "CASE-11", guardHits: 1, release: "No_Release", instruction: "No_State_Instruction", disposition };
  }
  return {
    dispatchCase: "CASE-12", guardHits: 1,
    release: releaseFor(candidate.request), instruction: instructionFor(candidate.request), disposition: "Release_Issued"
  };
}

function registryCommit(plan, instruction) {
  if (instruction === "No_State_Instruction") return { ...plan.provisional };
  return { active: instruction.replace(/^Mark_Submitted_/, "Submitted_"), lastCompleted: plan.provisional.lastCompleted };
}

// PART-05 consumes only INT-11 and INT-12; it never sees boundary inputs.
function noticeLocal(registry, dispatch) {
  if (registry === "Invalid_Event") return "Invalid_Event";
  if (registry === "Identifier_Conflict") return "Identifier_Conflict";
  if (registry === "Stale_Result") return "Stale_Result";
  if (registry === "Busy") return "Busy";
  if (registry === "Shipment_Failed_Retry_Pending") return "Shipment_Failed_Retry_Pending";
  if (registry === "Duplicate_Acknowledged") return "Duplicate_Acknowledged";
  if (dispatch === "Inventory_Invalid") return "Inventory_Evidence_Invalid";
  if (dispatch === "Readiness_Invalid") return "Readiness_Evidence_Invalid";
  if (dispatch === "Waiting_Stock") return "Waiting_For_Stock";
  if (dispatch === "Waiting_Dispatch") return "Waiting_For_Dispatch";
  if (dispatch === "Release_Issued") return "Release_Issued";
  if (registry === "Shipment_Confirmed") return "Shipment_Confirmed";
  if (registry === "Request_Accepted") return "Request_Accepted";
  return "None";
}

const semanticConnectionMap = {
  "INT-01": { from: "root.request_arrival", to: "request_qualification.request_arrival", value: "Request_Arrival_Sample", routes: ["support_boundary_arrival", "support_arrival_to_qualification"] },
  "INT-02": { from: "request_qualification.arrival_fact", to: "request_registry.arrival_fact", value: "Arrival_Fact", routes: ["qualified_arrival_to_registry"] },
  "INT-03": { from: "root.shipment_result", to: "request_registry.shipment_result", value: "Shipment_Result_Sample", routes: ["support_boundary_result", "support_result_to_registry"] },
  "INT-04": { from: "request_registry.pending_request", to: "inventory_assessment.pending_request", value: "Pending_Request_View", routes: ["pending_request_to_inventory"] },
  "INT-05": { from: "root.inventory_evidence", to: "inventory_assessment.inventory_evidence", value: "Inventory_Sample", routes: ["support_boundary_inventory", "support_inventory_to_assessment"] },
  "INT-06": { from: "request_registry.dispatch_candidate", to: "dispatch_arbiter.dispatch_candidate", value: "Dispatch_Candidate", routes: ["candidate_to_arbiter"] },
  "INT-07": { from: "inventory_assessment.inventory_finding", to: "dispatch_arbiter.inventory_finding", value: "Inventory_Finding", routes: ["inventory_finding_to_arbiter"] },
  "INT-08": { from: "root.readiness_sample", to: "dispatch_arbiter.readiness_sample", value: "Dispatch_Readiness_Sample", routes: ["support_boundary_readiness", "support_readiness_to_arbiter"] },
  "INT-09": { from: "dispatch_arbiter.registry_instruction", to: "request_registry.registry_instruction", value: "Registry_Instruction", routes: ["arbiter_instruction_to_registry"] },
  "INT-10": { from: "dispatch_arbiter.shipment_release", to: "root.shipment_release", value: "Shipment_Release_Directive", routes: ["support_release_to_process", "support_boundary_release"] },
  "INT-11": { from: "request_registry.registry_outcome", to: "customer_notice_synthesis.registry_outcome", value: "Registry_Outcome", routes: ["registry_outcome_to_notice"] },
  "INT-12": { from: "dispatch_arbiter.dispatch_disposition", to: "customer_notice_synthesis.dispatch_disposition", value: "Dispatch_Disposition", routes: ["disposition_to_notice"] },
  "INT-13": { from: "customer_notice_synthesis.customer_notice", to: "root.customer_notice", value: "Customer_Dispatch_Notice", routes: ["support_notice_to_process", "support_boundary_notice"] }
};

function composeLocal(state, input) {
  const arrivalFact = requestQualification(input.arrival);                  // INT-01 -> INT-02
  const registry = registryLocal(arrivalFact, input.result, state);         // INT-02 + INT-03
  const inventory = inventoryLocal(registry.pendingView, input.inventory);  // INT-04 + INT-05
  const arbiter = arbiterLocal(registry.candidate, inventory, input.readiness); // INT-06 + INT-07 + INT-08
  const nextState = registryCommit(registry, arbiter.instruction);           // INT-09
  const notice = noticeLocal(registry.outcome, arbiter.disposition);         // INT-11 + INT-12
  return { arrivalFact, ...registry, eventGuardHits: registry.guardHits, inventory, ...arbiter, dispatchGuardHits: arbiter.guardHits, nextState, notice };
}

// Independent abstract evaluator.  It intentionally does not call any of the
// owner-local production relations above and works directly from root values.
function referenceStep(state, input) {
  const aPresent = arrivalPresent(input.arrival);
  const aInvalid = arrivalInvalid(input.arrival);
  const aValid = arrivalValid(input.arrival);
  const rPresent = resultPresent(input.result);
  const rInvalid = resultInvalid(input.result);
  const rValid = resultValid(input.result);
  const simultaneousOrInvalid = aInvalid || rInvalid || (aValid && rValid);
  const rawRequest = rawArrivalRequest(input.arrival);
  const matching = rValid && activeSubmitted(state.active) && resultId(input.result) === requestId(activeRequest(state.active));
  const duplicate = aValid && (rawRequest === activeRequest(state.active) || rawRequest === completionRequest(state.lastCompleted));
  const conflict = aValid && !duplicate && (sameId(rawRequest, activeRequest(state.active)) || sameId(rawRequest, completionRequest(state.lastCompleted)));
  let eventCase;
  let provisional = { ...state };
  let registry = "No_Registry_Notice";
  let eventBlocked = false;
  let recoveryHold = false;
  if (simultaneousOrInvalid) { eventCase = "CASE-01"; registry = "Invalid_Event"; eventBlocked = true; }
  else if (input.result.endsWith("Succeeded") && matching) {
    eventCase = "CASE-02"; registry = "Shipment_Confirmed";
    provisional = { active: "Empty", lastCompleted: `Completed_${activeRequest(state.active)}` };
  } else if (input.result.endsWith("Failed") && matching) {
    eventCase = "CASE-03"; registry = "Shipment_Failed_Retry_Pending"; recoveryHold = true;
    provisional = { active: `Pending_${activeRequest(state.active)}`, lastCompleted: state.lastCompleted };
  } else if (rValid) { eventCase = "CASE-04"; registry = "Stale_Result"; }
  else if (!aPresent && !rPresent) eventCase = "CASE-05";
  else if (duplicate) { eventCase = "CASE-06"; registry = "Duplicate_Acknowledged"; }
  else if (conflict) { eventCase = "CASE-07"; registry = "Identifier_Conflict"; eventBlocked = true; }
  else if (state.active === "Empty") {
    eventCase = "CASE-08"; registry = "Request_Accepted";
    provisional = { active: `Pending_${rawRequest}`, lastCompleted: state.lastCompleted };
  } else { eventCase = "CASE-09"; registry = "Busy"; }

  const candidate = activePending(provisional.active) ? activeRequest(provisional.active) : "No_Request";
  let finding = "No_Demand";
  if (candidate !== "No_Request") {
    if (input.inventory.status === "Invalid") finding = "Invalid_Inventory";
    else {
      const band = requestProduct(candidate) === "AngleA" ? input.inventory.angleA : input.inventory.angleB;
      const enough = requestAmount(candidate) === "One" ? band !== "Zero" : band === "Two_Or_More";
      finding = enough ? "Sufficient" : "Insufficient";
    }
  }
  let dispatchCase = "CASE-10";
  let disposition = "No_Dispatch_Demand";
  let release = "No_Release";
  let instruction = "No_State_Instruction";
  if (candidate !== "No_Request") {
    const eligible = !eventBlocked && !recoveryHold && finding === "Sufficient" &&
      input.readiness.status === "Valid" && input.readiness.readiness === "Ready";
    if (eligible) {
      dispatchCase = "CASE-12"; disposition = "Release_Issued";
      release = `Release_${candidate}`; instruction = `Mark_Submitted_${candidate}`;
    } else {
      dispatchCase = "CASE-11";
      disposition = eventBlocked ? "Event_Blocked" : recoveryHold ? "Recovery_Held" :
        finding === "Invalid_Inventory" ? "Inventory_Invalid" : input.readiness.status === "Invalid" ? "Readiness_Invalid" :
        finding === "Insufficient" ? "Waiting_Stock" : "Waiting_Dispatch";
    }
  }
  const nextState = instruction === "No_State_Instruction" ? provisional :
    { active: instruction.replace(/^Mark_Submitted_/, "Submitted_"), lastCompleted: provisional.lastCompleted };
  let notice = "None";
  if (registry === "Invalid_Event") notice = "Invalid_Event";
  else if (registry === "Identifier_Conflict") notice = "Identifier_Conflict";
  else if (registry === "Stale_Result") notice = "Stale_Result";
  else if (registry === "Busy") notice = "Busy";
  else if (registry === "Shipment_Failed_Retry_Pending") notice = "Shipment_Failed_Retry_Pending";
  else if (registry === "Duplicate_Acknowledged") notice = "Duplicate_Acknowledged";
  else if (disposition === "Inventory_Invalid") notice = "Inventory_Evidence_Invalid";
  else if (disposition === "Readiness_Invalid") notice = "Readiness_Evidence_Invalid";
  else if (disposition === "Waiting_Stock") notice = "Waiting_For_Stock";
  else if (disposition === "Waiting_Dispatch") notice = "Waiting_For_Dispatch";
  else if (disposition === "Release_Issued") notice = "Release_Issued";
  else if (registry === "Shipment_Confirmed") notice = "Shipment_Confirmed";
  else if (registry === "Request_Accepted") notice = "Request_Accepted";
  return { eventCase, dispatchCase, nextState, release, instruction, disposition, registry, finding, notice };
}

const ownershipAudit = [
  {
    usage: "request_qualification", claimed_roles: ["applicability"],
    assigned_inputs: ["request_qualification.request_arrival"],
    owner_local_facts: ["17-value arrival qualification"],
    contract_cases: ["QUAL_NO_ARRIVAL", "QUAL_INVALID_ARRIVAL", "QUAL_VALID_ARRIVAL"],
    analyzer_checks: ["qualification 17-to-10 total relation"]
  },
  {
    usage: "request_registry", claimed_roles: ["decision"],
    assigned_inputs: ["request_registry.arrival_fact", "request_registry.shipment_result", "request_registry.registry_instruction", "request_registry.active", "request_registry.last_completed"],
    owner_local_facts: ["ordered event classification", "provisional registry transition", "event and recovery blockers"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08", "CASE-09"],
    analyzer_checks: ["registry nine-case effective partition", "registry commit and invariant"]
  },
  {
    usage: "inventory_assessment", claimed_roles: ["applicability"],
    assigned_inputs: ["inventory_assessment.pending_request", "inventory_assessment.inventory_evidence"],
    owner_local_facts: ["product-and-amount stock threshold classification"],
    contract_cases: ["STOCK_NO_DEMAND", "STOCK_INVALID", "STOCK_SUFFICIENT", "STOCK_INSUFFICIENT"],
    analyzer_checks: ["inventory four-class total relation", "both-product two-amount threshold matrix"]
  },
  {
    usage: "dispatch_arbiter", claimed_roles: ["decision"],
    assigned_inputs: ["dispatch_arbiter.dispatch_candidate", "dispatch_arbiter.inventory_finding", "dispatch_arbiter.readiness_sample"],
    owner_local_facts: ["prioritized release authorization", "matching submission instruction"],
    contract_cases: ["CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["arbiter three-case effective partition", "release instruction coherence"]
  },
  {
    usage: "customer_notice_synthesis", claimed_roles: ["decision"],
    assigned_inputs: ["customer_notice_synthesis.registry_outcome", "customer_notice_synthesis.dispatch_disposition"],
    owner_local_facts: ["ordered competing-fact notice resolution"],
    contract_cases: ["NOTICE_PRIORITY_RESOLUTION"],
    analyzer_checks: ["notice priority total relation"]
  }
];

const caseCounts = Object.fromEntries(Array.from({ length: 12 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const observations = {
  partition_gaps: 0, effective_partition_overlaps: 0, state_mismatches: 0,
  required_output_mismatches: 0, invariant_violations: 0, coherence_violations: 0,
  owner_local_mismatches: 0
};
const qualificationValuesSeen = new Set();
const inventoryValuesSeen = new Set();

let snapshotCount = 0;
for (const state of states) for (const arrival of arrivals) for (const inventory of inventories)
for (const readiness of readinesses) for (const result of results) {
  snapshotCount++;
  const input = { arrival, inventory, readiness, result };
  const local = composeLocal(state, input);
  qualificationValuesSeen.add(local.arrivalFact);
  inventoryValuesSeen.add(local.inventory);
  const reference = referenceStep(state, input);
  if (local.eventGuardHits === 0 || local.dispatchGuardHits === 0) observations.partition_gaps++;
  if (local.eventGuardHits !== 1 || local.dispatchGuardHits !== 1) observations.effective_partition_overlaps++;
  caseCounts[local.eventCase]++;
  caseCounts[local.dispatchCase]++;
  if (JSON.stringify(local.nextState) !== JSON.stringify(reference.nextState)) observations.state_mismatches++;
  if (local.release !== reference.release || local.notice !== reference.notice || local.instruction !== reference.instruction ||
      local.disposition !== reference.disposition || local.outcome !== reference.registry || local.inventory !== reference.finding ||
      local.eventCase !== reference.eventCase || local.dispatchCase !== reference.dispatchCase) observations.required_output_mismatches++;
  if (!invariant(local.nextState)) observations.invariant_violations++;
  const releaseRequest = local.release.replace(/^Release_/, "");
  const instructionRequest = local.instruction.replace(/^Mark_Submitted_/, "");
  if ((local.release === "No_Release") !== (local.instruction === "No_State_Instruction") ||
      (local.release !== "No_Release" && (releaseRequest !== instructionRequest || local.nextState.active !== `Submitted_${releaseRequest}`)))
    observations.coherence_violations++;
}

function input(arrival, angleA, angleB, inventoryStatus, readiness, readinessStatus, result) {
  return { arrival, inventory: { angleA, angleB, status: inventoryStatus }, readiness: { readiness, status: readinessStatus }, result };
}

function runTrace(id, initialState, steps) {
  let state = { ...initialState };
  const observed = [];
  let passed = true;
  for (const step of steps) {
    const result = composeLocal(state, step.input);
    const actual = { event_case: result.eventCase, dispatch_case: result.dispatchCase, release: result.release, notice: result.notice, next_state: result.nextState };
    const expected = step.expected;
    if (JSON.stringify(actual) !== JSON.stringify(expected)) passed = false;
    observed.push({ input: step.input, expected_named_branch: [expected.event_case, expected.dispatch_case], observed: actual });
    state = result.nextState;
  }
  return { scenario_id: id, passed, initial_state: initialState, trace: observed };
}

const empty = { active: "Empty", lastCompleted: "No_Completion" };
const scenarios = [
  runTrace("SCN-01", empty, [
    { input: input("Valid_R1_AngleA_One", "One", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-08", dispatch_case: "CASE-12", release: "Release_R1_AngleA_One", notice: "Release_Issued", next_state: { active: "Submitted_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "One", "Zero", "Valid", "Ready", "Valid", "Valid_R1_Succeeded"), expected: { event_case: "CASE-02", dispatch_case: "CASE-10", release: "No_Release", notice: "Shipment_Confirmed", next_state: { active: "Empty", lastCompleted: "Completed_R1_AngleA_One" } } }
  ]),
  runTrace("SCN-02", empty, [
    { input: input("Valid_R1_AngleB_Two", "Zero", "One", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-08", dispatch_case: "CASE-11", release: "No_Release", notice: "Waiting_For_Stock", next_state: { active: "Pending_R1_AngleB_Two", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "Zero", "Two_Or_More", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-05", dispatch_case: "CASE-12", release: "Release_R1_AngleB_Two", notice: "Release_Issued", next_state: { active: "Submitted_R1_AngleB_Two", lastCompleted: "No_Completion" } } }
  ]),
  runTrace("SCN-03", { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" }, [
    { input: input("Valid_R1_AngleA_One", "Zero", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-06", dispatch_case: "CASE-11", release: "No_Release", notice: "Duplicate_Acknowledged", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("Valid_R1_AngleB_One", "Zero", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-07", dispatch_case: "CASE-11", release: "No_Release", notice: "Identifier_Conflict", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("Valid_R2_AngleB_One", "Zero", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-09", dispatch_case: "CASE-11", release: "No_Release", notice: "Busy", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } }
  ]),
  runTrace("SCN-04", { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" }, [
    { input: input("Invalid_R2_AngleA_One", "One", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-01", dispatch_case: "CASE-11", release: "No_Release", notice: "Invalid_Event", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("Valid_R2_AngleA_One", "One", "Zero", "Valid", "Ready", "Valid", "Valid_R2_Failed"), expected: { event_case: "CASE-01", dispatch_case: "CASE-11", release: "No_Release", notice: "Invalid_Event", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "One", "Zero", "Invalid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-05", dispatch_case: "CASE-11", release: "No_Release", notice: "Inventory_Evidence_Invalid", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "One", "Zero", "Valid", "Ready", "Invalid", "No_Result"), expected: { event_case: "CASE-05", dispatch_case: "CASE-11", release: "No_Release", notice: "Readiness_Evidence_Invalid", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } }
  ]),
  runTrace("SCN-05", { active: "Submitted_R1_AngleA_One", lastCompleted: "No_Completion" }, [
    { input: input("No_Arrival", "One", "Zero", "Valid", "Ready", "Valid", "Valid_R1_Failed"), expected: { event_case: "CASE-03", dispatch_case: "CASE-11", release: "No_Release", notice: "Shipment_Failed_Retry_Pending", next_state: { active: "Pending_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "One", "Zero", "Valid", "Ready", "Valid", "No_Result"), expected: { event_case: "CASE-05", dispatch_case: "CASE-12", release: "Release_R1_AngleA_One", notice: "Release_Issued", next_state: { active: "Submitted_R1_AngleA_One", lastCompleted: "No_Completion" } } },
    { input: input("No_Arrival", "One", "Zero", "Valid", "Ready", "Valid", "Valid_R1_Succeeded"), expected: { event_case: "CASE-02", dispatch_case: "CASE-10", release: "No_Release", notice: "Shipment_Confirmed", next_state: { active: "Empty", lastCompleted: "Completed_R1_AngleA_One" } } }
  ])
];

const allCasesWitnessed = Object.values(caseCounts).every(count => count > 0);
const allScenariosPassed = scenarios.every(scenario => scenario.passed);
const zeroDiagnostics = Object.values(observations).every(value => value === 0);
const registryOutcomes = ["No_Registry_Notice", "Invalid_Event", "Shipment_Confirmed", "Shipment_Failed_Retry_Pending", "Stale_Result", "Duplicate_Acknowledged", "Identifier_Conflict", "Request_Accepted", "Busy"];
const dispatchDispositions = ["No_Dispatch_Demand", "Event_Blocked", "Recovery_Held", "Inventory_Invalid", "Readiness_Invalid", "Waiting_Stock", "Waiting_Dispatch", "Release_Issued"];
const noticeMatrix = [];
for (const registry of registryOutcomes) for (const dispatch of dispatchDispositions) noticeMatrix.push(noticeLocal(registry, dispatch));
let arbiterPartitionTotal = true;
for (const request of ["No_Request", ...requests]) for (const eventBlocked of [false, true]) for (const recoveryHold of [false, true])
for (const finding of ["No_Demand", "Invalid_Inventory", "Sufficient", "Insufficient"]) for (const readiness of readinesses) {
  if (arbiterGuardHits({ request, eventBlocked, recoveryHold }, finding, readiness).filter(Boolean).length !== 1) arbiterPartitionTotal = false;
}
const ownershipChecks = {
  request_qualification: qualificationValuesSeen.size === 10,
  request_registry: Array.from({ length: 9 }, (_, i) => caseCounts[`CASE-${String(i + 1).padStart(2, "0")}`] > 0).every(Boolean),
  inventory_assessment: ["No_Demand", "Invalid_Inventory", "Sufficient", "Insufficient"].every(value => inventoryValuesSeen.has(value)),
  dispatch_arbiter: arbiterPartitionTotal && ["CASE-10", "CASE-11", "CASE-12"].every(id => caseCounts[id] > 0),
  customer_notice_synthesis: noticeMatrix.length === 72 && noticeMatrix.every(value => typeof value === "string")
};
const ownershipAuditResult = ownershipAudit.map(record => ({ ...record, passed: ownershipChecks[record.usage] === true }));
const checks = {
  exact_state_domain: states.length === 89,
  exact_boundary_domain: arrivals.length * inventories.length * readinesses.length * results.length === 11016,
  exact_snapshot_count: snapshotCount === 980424,
  exact_semantic_connection_map: Object.keys(semanticConnectionMap).length === 13 && Object.values(semanticConnectionMap).reduce((n, edge) => n + edge.routes.length, 0) === 19,
  all_twelve_cases_witnessed: allCasesWitnessed,
  zero_diagnostics: zeroDiagnostics,
  initialization_safe: empty.active === "Empty" && empty.lastCompleted === "No_Completion",
  invariant_preserved: observations.invariant_violations === 0,
  release_instruction_coherent: observations.coherence_violations === 0,
  all_five_scenario_traces_passed: allScenariosPassed,
  owner_local_cases_executed: ownershipAuditResult.every(record => record.passed)
};
const passed = Object.values(checks).every(Boolean);

const report = {
  schema_version: 1,
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive consistency over the seed's finite 89-state by 11,016-input domain; not execution, solver certification, compositional proof, generated-code correctness, physical performance, safety, or certification evidence.",
  domain: {
    owner_states: states.length,
    request_arrivals: arrivals.length,
    inventory_samples: inventories.length,
    readiness_samples: readinesses.length,
    shipment_results: results.length,
    boundary_combinations: arrivals.length * inventories.length * readinesses.length * results.length,
    snapshots: snapshotCount
  },
  semantic_connection_map: semanticConnectionMap,
  partition_counts: caseCounts,
  observations,
  invariant_checks: { "INIT-01": checks.initialization_safe, "INVAR-01": checks.invariant_preserved, "COHERENCE-01": checks.release_instruction_coherent },
  checks,
  ownership_audit: ownershipAuditResult,
  scenario_traces: scenarios
};

process.stdout.write(`${JSON.stringify(report)}\n`);
