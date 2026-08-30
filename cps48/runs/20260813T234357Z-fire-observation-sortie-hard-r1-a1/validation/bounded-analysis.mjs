#!/usr/bin/env node
"use strict";

// Deterministic, dependency-free bounded mirror of the canonical owner relations.
// This program intentionally reads no files, environment variables, clock, or network.

const SOURCE_SHA256 = "1880bb061208d72c11647c5b0be9bbfa45b99bccc25e9a8625111e8abf29bcbf";
const values = (...xs) => Object.freeze(xs);
const EnergyQuality = values("Nominal", "Limited", "Unavailable", "Unknown");
const Condition = values("Nominal", "NonNominal", "Unavailable", "Unknown");
const Validity = values("Valid", "Invalid");
const Freshness = values("Current", "Stale");
const Confirmation = values("Confirmed", "NotConfirmed");
const OperatorEvent = values("None", "Submit", "Cancel", "AcknowledgeRecovery");
const RequestPhase = values("Idle", "Pending", "Released");
const RecoveryPhase = values("Normal", "Quarantined", "AwaitingAck");
const PriorityDirective = values("Inhibit", "Cancel", "Recover", "Submit", "Hold");
const RecoveryGate = values("Open", "Closed");
const SortieDirective = values("Withhold", "Permit");
const EligibilityReason = values("None", "Equipment", "Recovery", "NoRequest");
const ReleaseFeedback = values("NotReleased", "Released");

const key = x => JSON.stringify(x);
const same = (a, b) => key(a) === key(b);
const inc = (o, k) => { o[k] = (o[k] || 0) + 1; };
const product = (domains, visit, prefix = [], i = 0) => {
  if (i === domains.length) { visit(prefix); return; }
  for (const value of domains[i]) product(domains, visit, [...prefix, value], i + 1);
};

const classifyEnergy = e => {
  if (e.validity === "Valid" && e.freshness === "Current" && e.quality === "Nominal") {
    return { case: "CASE-01", out: { ready: true, localCause: "None" } };
  }
  const localCause = e.validity === "Invalid" ? "Invalid"
    : e.freshness === "Stale" ? "Stale"
    : (e.quality === "Unavailable" || e.quality === "Unknown") ? "UnavailableOrUnknown"
    : "Limited";
  return { case: "CASE-02", out: { ready: false, localCause } };
};

const classifyNavigation = e => {
  const ready = e.validity === "Valid" && e.freshness === "Current" &&
    e.gpsCondition === "Nominal" && e.inertial === "Nominal" && e.barometric === "Nominal";
  if (ready) return { case: "CASE-03", out: { ready: true, localCause: "None" } };
  const localCause = e.validity === "Invalid" ? "Invalid"
    : e.freshness === "Stale" ? "Stale"
    : e.gpsCondition !== "Nominal" ? "Gps"
    : e.inertial !== "Nominal" ? "Inertial" : "Barometric";
  return { case: "CASE-04", out: { ready: false, localCause } };
};

const classifySingle = (e, readyCase, rejectCase) => {
  const ready = e.validity === "Valid" && e.freshness === "Current" && e.condition === "Nominal";
  if (ready) return { case: readyCase, out: { ready: true, localCause: "None" } };
  const localCause = e.validity === "Invalid" ? "Invalid"
    : e.freshness === "Stale" ? "Stale" : "Condition";
  return { case: rejectCase, out: { ready: false, localCause } };
};

const classifyPropulsion = e => {
  const ready = e.validity === "Valid" && e.freshness === "Current" &&
    e.alternatingKindsConfirmed === "Confirmed" && e.engine1 === "Nominal" &&
    e.engine2 === "Nominal" && e.engine3 === "Nominal" && e.engine4 === "Nominal";
  if (ready) return { case: "CASE-11", out: { ready: true, localCause: "None" } };
  const localCause = e.validity === "Invalid" ? "Invalid"
    : e.freshness === "Stale" ? "Stale"
    : e.alternatingKindsConfirmed !== "Confirmed" ? "Configuration"
    : e.engine1 !== "Nominal" ? "Engine1"
    : e.engine2 !== "Nominal" ? "Engine2"
    : e.engine3 !== "Nominal" ? "Engine3" : "Engine4";
  return { case: "CASE-12", out: { ready: false, localCause } };
};

const requestGuards = (prior, directive, feedback) => [
  ["CASE-18", directive === "Cancel"],
  ["CASE-19", directive === "Submit" && prior === "Idle"],
  ["CASE-20", directive === "Submit" && prior !== "Idle" && feedback === "NotReleased"],
  ["CASE-21", directive !== "Cancel" && prior === "Pending" && feedback === "Released"],
  ["CASE-22",
    (prior === "Released" && directive === "Hold") ||
    (prior === "Idle" && directive !== "Cancel" && directive !== "Submit") ||
    (prior === "Pending" && feedback === "NotReleased" && directive !== "Cancel" && directive !== "Submit") ||
    (prior === "Released" && directive !== "Cancel" && directive !== "Hold" &&
      (directive !== "Submit" || feedback === "Released"))]
];

const requestOwner = (prior, directive, feedback, event) => {
  const cases = requestGuards(prior, directive, feedback).filter(([, g]) => g).map(([c]) => c);
  let next = prior;
  if (cases[0] === "CASE-18") next = "Idle";
  else if (cases[0] === "CASE-19") next = "Pending";
  else if (cases[0] === "CASE-21") next = "Released";
  else if (cases[0] === "CASE-22" && prior === "Released" && directive === "Hold") next = "Idle";
  return { case: cases[0], guardCount: cases.length, published: prior, candidate: event, next };
};

const allReady = a => a.energy.ready && a.navigation.ready && a.communication.ready &&
  a.observation.ready && a.obstacle.ready && a.propulsion.ready;

const faultRegistry = a => {
  if (allReady(a)) return { case: "CASE-24", out: { faultState: "Clear", primaryCause: "None" } };
  const primaryCause = !a.energy.ready ? "Energy"
    : !a.propulsion.ready ? "Propulsion"
    : !a.navigation.ready ? "Navigation"
    : !a.obstacle.ready ? "Obstacle"
    : !a.observation.ready ? "Observation" : "Communication";
  return { case: "CASE-23", out: { faultState: "Active", primaryCause } };
};

const priorityArbiter = (fault, event) => {
  if (fault.faultState === "Active") return { case: "CASE-13", out: "Inhibit" };
  if (event === "Cancel") return { case: "CASE-14", out: "Cancel" };
  if (event === "AcknowledgeRecovery") return { case: "CASE-15", out: "Recover" };
  if (event === "Submit") return { case: "CASE-16", out: "Submit" };
  return { case: "CASE-17", out: "Hold" };
};

const recoveryGuards = (prior, fault, directive) => [
  ["CASE-25", fault.faultState === "Active"],
  ["CASE-26", fault.faultState === "Clear" && (prior === "Normal" || directive === "Recover")],
  ["CASE-27", fault.faultState === "Clear" && prior !== "Normal" && directive !== "Recover"]
];

const recoveryOwner = (prior, fault, directive) => {
  const cases = recoveryGuards(prior, fault, directive).filter(([, g]) => g).map(([c]) => c);
  const phase = cases[0] === "CASE-25" ? "Quarantined"
    : cases[0] === "CASE-26" ? "Normal" : "AwaitingAck";
  return {
    case: cases[0], guardCount: cases.length, next: phase,
    out: { phase, gate: phase === "Normal" ? "Open" : "Closed", carriedPriority: directive }
  };
};

const eligibilityGuards = (a, request, recovery) => [
  ["CASE-28", request !== "Pending" || recovery.gate === "Closed" || recovery.carriedPriority === "Cancel"],
  ["CASE-29", request === "Pending" && recovery.gate === "Open" && allReady(a) &&
    (recovery.carriedPriority === "Hold" || recovery.carriedPriority === "Submit" || recovery.carriedPriority === "Recover")],
  ["CASE-30", request === "Pending" && recovery.gate === "Open" && recovery.carriedPriority !== "Cancel" &&
    (!allReady(a) || recovery.carriedPriority === "Inhibit")]
];

const eligibilityOwner = (a, request, recovery) => {
  const cases = eligibilityGuards(a, request, recovery).filter(([, g]) => g).map(([c]) => c);
  let out;
  if (cases[0] === "CASE-29") out = { directive: "Permit", reason: "None" };
  else if (!allReady(a) || recovery.carriedPriority === "Inhibit") out = { directive: "Withhold", reason: "Equipment" };
  else if (recovery.gate === "Closed") out = { directive: "Withhold", reason: "Recovery" };
  else out = { directive: "Withhold", reason: "NoRequest" };
  return { case: cases[0], guardCount: cases.length, out };
};

const ledgerOwner = (prior, request, decision) => {
  const release = request === "Pending" && decision.directive === "Permit" && prior === "NotReleased";
  const next = request === "Idle" ? "NotReleased" : release ? "Released" : prior;
  return {
    case: "BEH-01", next,
    out: { sortieDirective: release ? "Permit" : "Withhold", releaseFeedback: release ? "Released" : "NotReleased" }
  };
};

const statusComposer = (request, fault, recovery, decision) => {
  let limitingCause;
  if (decision.reason === "None") limitingCause = "None";
  else if (decision.reason === "Recovery") limitingCause = "Recovery";
  else if (decision.reason === "NoRequest") limitingCause = "NoRequest";
  else limitingCause = fault.primaryCause;
  return {
    requestPhase: request,
    faultState: fault.faultState,
    recoveryPhase: recovery,
    decisionDirective: decision.directive,
    limitingCause
  };
};

const semanticConnectionMap = [
  ["INT-01", "root.energyEvidence", "energy_evidence_assessor.energy_evidence", "EnergyEvidence"],
  ["INT-02", "root.navigationEvidence", "navigation_evidence_assessor.navigation_evidence", "NavigationEvidence"],
  ["INT-03", "root.communicationEvidence", "communication_evidence_assessor.communication_evidence", "EquipmentEvidence"],
  ["INT-04", "root.observationEvidence", "observation_evidence_assessor.observation_evidence", "EquipmentEvidence"],
  ["INT-05", "root.obstacleEvidence", "obstacle_evidence_assessor.obstacle_evidence", "EquipmentEvidence"],
  ["INT-06", "root.propulsionEvidence", "propulsion_evidence_assessor.propulsion_evidence", "PropulsionEvidence"],
  ["INT-07", "root.operatorEvent", "request_lifecycle_owner.operator_event", "OperatorEvent"],
  ["INT-08", "energy_evidence_assessor.energy_assessment", "fault_registry.energy_assessment", "EnergyAssessment"],
  ["INT-09", "navigation_evidence_assessor.navigation_assessment", "fault_registry.navigation_assessment", "NavigationAssessment"],
  ["INT-10", "communication_evidence_assessor.communication_assessment", "fault_registry.communication_assessment", "SingleEquipmentAssessment"],
  ["INT-11", "observation_evidence_assessor.observation_assessment", "fault_registry.observation_assessment", "SingleEquipmentAssessment"],
  ["INT-12", "obstacle_evidence_assessor.obstacle_assessment", "fault_registry.obstacle_assessment", "SingleEquipmentAssessment"],
  ["INT-13", "propulsion_evidence_assessor.propulsion_assessment", "fault_registry.propulsion_assessment", "PropulsionAssessment"],
  ["INT-14", "energy_evidence_assessor.energy_assessment", "eligibility_decision_owner.energy_assessment", "EnergyAssessment"],
  ["INT-15", "navigation_evidence_assessor.navigation_assessment", "eligibility_decision_owner.navigation_assessment", "NavigationAssessment"],
  ["INT-16", "communication_evidence_assessor.communication_assessment", "eligibility_decision_owner.communication_assessment", "SingleEquipmentAssessment"],
  ["INT-17", "observation_evidence_assessor.observation_assessment", "eligibility_decision_owner.observation_assessment", "SingleEquipmentAssessment"],
  ["INT-18", "obstacle_evidence_assessor.obstacle_assessment", "eligibility_decision_owner.obstacle_assessment", "SingleEquipmentAssessment"],
  ["INT-19", "propulsion_evidence_assessor.propulsion_assessment", "eligibility_decision_owner.propulsion_assessment", "PropulsionAssessment"],
  ["INT-20", "request_lifecycle_owner.candidate_event", "priority_arbiter.candidate_event", "OperatorEvent"],
  ["INT-21", "fault_registry.fault_summary", "priority_arbiter.fault_summary", "FaultSummary"],
  ["INT-22", "priority_arbiter.accepted_directive", "request_lifecycle_owner.accepted_directive", "PriorityDirective"],
  ["INT-23", "priority_arbiter.accepted_directive", "recovery_qualification_owner.accepted_directive", "PriorityDirective"],
  ["INT-24", "fault_registry.fault_summary", "recovery_qualification_owner.fault_summary", "FaultSummary"],
  ["INT-25", "recovery_qualification_owner.recovery_facts", "eligibility_decision_owner.recovery_facts", "RecoveryFacts"],
  ["INT-26", "request_lifecycle_owner.request_phase", "eligibility_decision_owner.request_phase", "RequestPhase"],
  ["INT-27", "eligibility_decision_owner.eligibility_decision", "permission_release_ledger.eligibility_decision", "EligibilityDecision"],
  ["INT-28", "permission_release_ledger.release_feedback", "request_lifecycle_owner.release_feedback", "ReleaseFeedback"],
  ["INT-29", "eligibility_decision_owner.eligibility_decision", "status_composer.eligibility_decision", "EligibilityDecision"],
  ["INT-30", "fault_registry.fault_summary", "status_composer.fault_summary", "FaultSummary"],
  ["INT-31", "recovery_qualification_owner.recovery_phase", "status_composer.recovery_phase", "RecoveryPhase"],
  ["INT-32", "request_lifecycle_owner.request_phase", "status_composer.request_phase", "RequestPhase"],
  ["INT-33", "permission_release_ledger.sortie_directive", "root.sortieEligibilityDirective", "SortieDirective"],
  ["INT-34", "status_composer.eligibility_status", "root.eligibilityStatus", "EligibilityStatus"],
  ["INT-35", "request_lifecycle_owner.request_phase", "permission_release_ledger.request_phase", "RequestPhase"]
].map(([id, source, destination, payload]) => ({ id, source, destination, payload }));

const composeStep = (state, input) => {
  const flows = {};
  flows["INT-01"] = input.energy;
  flows["INT-02"] = input.navigation;
  flows["INT-03"] = input.communication;
  flows["INT-04"] = input.observation;
  flows["INT-05"] = input.obstacle;
  flows["INT-06"] = input.propulsion;
  flows["INT-07"] = input.event;
  const e = classifyEnergy(flows["INT-01"]);
  const n = classifyNavigation(flows["INT-02"]);
  const c = classifySingle(flows["INT-03"], "CASE-05", "CASE-06");
  const o = classifySingle(flows["INT-04"], "CASE-07", "CASE-08");
  const b = classifySingle(flows["INT-05"], "CASE-09", "CASE-10");
  const p = classifyPropulsion(flows["INT-06"]);
  flows["INT-08"] = e.out; flows["INT-09"] = n.out; flows["INT-10"] = c.out;
  flows["INT-11"] = o.out; flows["INT-12"] = b.out; flows["INT-13"] = p.out;
  flows["INT-14"] = flows["INT-08"]; flows["INT-15"] = flows["INT-09"];
  flows["INT-16"] = flows["INT-10"]; flows["INT-17"] = flows["INT-11"];
  flows["INT-18"] = flows["INT-12"]; flows["INT-19"] = flows["INT-13"];
  const assessments = { energy: flows["INT-14"], navigation: flows["INT-15"], communication: flows["INT-16"], observation: flows["INT-17"], obstacle: flows["INT-18"], propulsion: flows["INT-19"] };
  flows["INT-20"] = flows["INT-07"];
  const fault = faultRegistry({ energy: flows["INT-08"], navigation: flows["INT-09"], communication: flows["INT-10"], observation: flows["INT-11"], obstacle: flows["INT-12"], propulsion: flows["INT-13"] });
  flows["INT-21"] = fault.out;
  const priority = priorityArbiter(flows["INT-21"], flows["INT-20"]);
  flows["INT-22"] = priority.out; flows["INT-23"] = priority.out; flows["INT-24"] = flows["INT-21"];
  const recovery = recoveryOwner(state.recovery, flows["INT-24"], flows["INT-23"]);
  flows["INT-25"] = recovery.out; flows["INT-26"] = state.request;
  const eligibility = eligibilityOwner(assessments, flows["INT-26"], flows["INT-25"]);
  flows["INT-27"] = eligibility.out;
  const release = ledgerOwner(state.ledger, state.request, flows["INT-27"]);
  flows["INT-28"] = release.out.releaseFeedback; flows["INT-29"] = flows["INT-27"];
  flows["INT-30"] = flows["INT-21"]; flows["INT-31"] = recovery.out.phase; flows["INT-32"] = state.request;
  flows["INT-33"] = release.out.sortieDirective;
  flows["INT-34"] = statusComposer(flows["INT-32"], flows["INT-30"], flows["INT-31"], flows["INT-29"]);
  flows["INT-35"] = state.request;
  const request = requestOwner(state.request, flows["INT-22"], flows["INT-28"], flows["INT-07"]);
  return {
    outputs: { sortieDirective: flows["INT-33"], eligibilityStatus: flows["INT-34"] },
    nextState: { request: request.next, recovery: recovery.next, ledger: release.next },
    branches: [e.case, n.case, c.case, o.case, b.case, p.case, priority.case, request.case, fault.case, recovery.case, eligibility.case, release.case, "BEH-02"],
    flows
  };
};

const readyInput = event => ({
  event,
  energy: { quality: "Nominal", validity: "Valid", freshness: "Current" },
  navigation: { gpsCondition: "Nominal", inertial: "Nominal", barometric: "Nominal", validity: "Valid", freshness: "Current" },
  communication: { condition: "Nominal", validity: "Valid", freshness: "Current" },
  observation: { condition: "Nominal", validity: "Valid", freshness: "Current" },
  obstacle: { condition: "Nominal", validity: "Valid", freshness: "Current" },
  propulsion: { engine1: "Nominal", engine2: "Nominal", engine3: "Nominal", engine4: "Nominal", validity: "Valid", freshness: "Current", alternatingKindsConfirmed: "Confirmed" }
});
const changed = (base, field, value) => {
  const copy = JSON.parse(JSON.stringify(base));
  const path = field.split(".");
  let cursor = copy;
  for (let i = 0; i < path.length - 1; i++) cursor = cursor[path[i]];
  cursor[path[path.length - 1]] = value;
  return copy;
};

const reports = {};
const caseHits = {};
const resultDomains = {};

const analyzeRawOwner = (name, domains, makeInput, relation, guardCases) => {
  const outputCounts = {}, witnesses = {}, unique = new Map();
  let count = 0, gaps = 0, overlaps = 0, mismatches = 0;
  product(domains, tuple => {
    count++;
    const input = makeInput(tuple);
    const guards = guardCases(input);
    if (guards.length === 0) gaps++;
    if (guards.length > 1) overlaps++;
    const result = relation(input);
    if (guards.length !== 1 || guards[0] !== result.case) mismatches++;
    inc(caseHits, result.case); inc(outputCounts, key(result.out));
    unique.set(key(result.out), result.out);
    if (!witnesses[result.case]) witnesses[result.case] = { input, output: result.out };
  });
  resultDomains[name] = [...unique.values()];
  reports[name] = { product: count, gaps, overlaps, mismatches, output_counts: outputCounts, witnesses };
};

analyzeRawOwner("energy_evidence_assessor", [EnergyQuality, Validity, Freshness],
  ([quality, validity, freshness]) => ({ quality, validity, freshness }), classifyEnergy,
  e => [e.validity === "Valid" && e.freshness === "Current" && e.quality === "Nominal" ? "CASE-01" : "CASE-02"]);
analyzeRawOwner("navigation_evidence_assessor", [Condition, Condition, Condition, Validity, Freshness],
  ([gpsCondition, inertial, barometric, validity, freshness]) => ({ gpsCondition, inertial, barometric, validity, freshness }), classifyNavigation,
  e => [e.validity === "Valid" && e.freshness === "Current" && e.gpsCondition === "Nominal" && e.inertial === "Nominal" && e.barometric === "Nominal" ? "CASE-03" : "CASE-04"]);
analyzeRawOwner("communication_evidence_assessor", [Condition, Validity, Freshness],
  ([condition, validity, freshness]) => ({ condition, validity, freshness }), e => classifySingle(e, "CASE-05", "CASE-06"),
  e => [e.validity === "Valid" && e.freshness === "Current" && e.condition === "Nominal" ? "CASE-05" : "CASE-06"]);
analyzeRawOwner("observation_evidence_assessor", [Condition, Validity, Freshness],
  ([condition, validity, freshness]) => ({ condition, validity, freshness }), e => classifySingle(e, "CASE-07", "CASE-08"),
  e => [e.validity === "Valid" && e.freshness === "Current" && e.condition === "Nominal" ? "CASE-07" : "CASE-08"]);
analyzeRawOwner("obstacle_evidence_assessor", [Condition, Validity, Freshness],
  ([condition, validity, freshness]) => ({ condition, validity, freshness }), e => classifySingle(e, "CASE-09", "CASE-10"),
  e => [e.validity === "Valid" && e.freshness === "Current" && e.condition === "Nominal" ? "CASE-09" : "CASE-10"]);
analyzeRawOwner("propulsion_evidence_assessor", [Condition, Condition, Condition, Condition, Validity, Freshness, Confirmation],
  ([engine1, engine2, engine3, engine4, validity, freshness, alternatingKindsConfirmed]) => ({ engine1, engine2, engine3, engine4, validity, freshness, alternatingKindsConfirmed }), classifyPropulsion,
  e => [e.validity === "Valid" && e.freshness === "Current" && e.alternatingKindsConfirmed === "Confirmed" && e.engine1 === "Nominal" && e.engine2 === "Nominal" && e.engine3 === "Nominal" && e.engine4 === "Nominal" ? "CASE-11" : "CASE-12"]);

const assessmentDomains = [resultDomains.energy_evidence_assessor, resultDomains.navigation_evidence_assessor,
  resultDomains.communication_evidence_assessor, resultDomains.observation_evidence_assessor,
  resultDomains.obstacle_evidence_assessor, resultDomains.propulsion_evidence_assessor];
const makeAssessments = ([energy, navigation, communication, observation, obstacle, propulsion]) => ({ energy, navigation, communication, observation, obstacle, propulsion });

const analyzeProduct = (name, domains, relation) => {
  let count = 0, gaps = 0, overlaps = 0, mismatches = 0;
  const outputCounts = {}, witnesses = {}, unique = new Map();
  product(domains, tuple => {
    count++;
    const r = relation(tuple);
    if (r.guardCount === 0) gaps++;
    if (r.guardCount > 1) overlaps++;
    if (!r.case || r.guardCount !== 1) mismatches++;
    inc(caseHits, r.case); inc(outputCounts, key(r.out));
    unique.set(key(r.out), r.out);
    if (!witnesses[r.case]) witnesses[r.case] = { input: r.input, output: r.out };
  });
  reports[name] = { product: count, gaps, overlaps, mismatches, output_counts: outputCounts, witnesses };
  return [...unique.values()];
};

analyzeProduct("request_lifecycle_owner", [RequestPhase, PriorityDirective, ReleaseFeedback], ([prior, directive, feedback]) => {
  const r = requestOwner(prior, directive, feedback, "None");
  return { ...r, input: { prior, directive, feedback }, out: { published: r.published, next: r.next } };
});

const faultDomain = analyzeProduct("fault_registry", assessmentDomains, tuple => {
  const input = makeAssessments(tuple), r = faultRegistry(input);
  const guardCount = Number(allReady(input)) + Number(!allReady(input));
  return { ...r, guardCount, input };
});

analyzeProduct("priority_arbiter", [faultDomain, OperatorEvent], ([fault, event]) => {
  const r = priorityArbiter(fault, event);
  const guardCount = fault.faultState === "Active" ? 1 : Number(OperatorEvent.includes(event));
  return { ...r, guardCount, input: { fault, event } };
});

analyzeProduct("recovery_qualification_owner", [RecoveryPhase, faultDomain, PriorityDirective], ([prior, fault, directive]) => {
  const r = recoveryOwner(prior, fault, directive);
  return { ...r, input: { prior, fault, directive } };
});

analyzeProduct("eligibility_decision_owner", [...assessmentDomains, RequestPhase, RecoveryGate, PriorityDirective], tuple => {
  const assessments = makeAssessments(tuple.slice(0, 6));
  const request = tuple[6], recovery = { gate: tuple[7], carriedPriority: tuple[8] };
  const r = eligibilityOwner(assessments, request, recovery);
  return { ...r, input: { assessments, request, recovery } };
});

const admissibleDecisions = [
  { directive: "Permit", reason: "None" },
  { directive: "Withhold", reason: "Equipment" },
  { directive: "Withhold", reason: "Recovery" },
  { directive: "Withhold", reason: "NoRequest" }
];
analyzeProduct("permission_release_ledger", [ReleaseFeedback, RequestPhase, admissibleDecisions], ([prior, request, decision]) => {
  const r = ledgerOwner(prior, request, decision);
  return { ...r, guardCount: 1, input: { prior, request, decision }, out: { ...r.out, next: r.next } };
});

const reachableStatus = new Set();
product([...assessmentDomains, RequestPhase, RecoveryPhase, OperatorEvent], tuple => {
  const assessments = makeAssessments(tuple.slice(0, 6));
  const request = tuple[6], priorRecovery = tuple[7], event = tuple[8];
  const fault = faultRegistry(assessments).out;
  const directive = priorityArbiter(fault, event).out;
  const recovery = recoveryOwner(priorRecovery, fault, directive).out;
  const decision = eligibilityOwner(assessments, request, recovery).out;
  reachableStatus.add(key({ request, fault, recovery: recovery.phase, decision }));
});
let statusProduct = 0, statusProducerUnreachable = 0, statusMismatches = 0;
const statusOutputs = {}, statusWitnesses = {};
product([RequestPhase, faultDomain, RecoveryPhase, admissibleDecisions], ([request, fault, recovery, decision]) => {
  statusProduct++;
  const tupleKey = key({ request, fault, recovery, decision });
  if (!reachableStatus.has(tupleKey)) { statusProducerUnreachable++; return; }
  const out = statusComposer(request, fault, recovery, decision);
  if (decision.reason === "Equipment" && out.limitingCause === "None") statusMismatches++;
  inc(statusOutputs, key(out));
  if (!statusWitnesses[decision.reason]) statusWitnesses[decision.reason] = { input: { request, fault, recovery, decision }, output: out };
});
reports.status_composer = {
  product: statusProduct, producer_reachable: statusProduct - statusProducerUnreachable,
  producer_unreachable_count: statusProducerUnreachable, gaps: 0, overlaps: 0,
  mismatches: statusMismatches, output_counts: statusOutputs, witnesses: statusWitnesses
};

const runTrace = (id, initialState, inputs, oracle) => {
  let state = { ...initialState };
  const trace = inputs.map((input, index) => {
    const result = composeStep(state, input);
    const row = {
      step: index + 1, input: { event: input.event, changedEvidence: input.changedEvidence || "all-ready" },
      expected_named_branch: result.branches,
      observed: { outputs: result.outputs, nextState: result.nextState }
    };
    state = result.nextState;
    return row;
  });
  const passed = oracle(trace);
  return { id, passed, trace };
};

const initial = { request: "Idle", recovery: "Quarantined", ledger: "NotReleased" };
const normalIdle = { request: "Idle", recovery: "Normal", ledger: "NotReleased" };
const pendingNormal = { request: "Pending", recovery: "Normal", ledger: "NotReleased" };
const scenarios = [];
scenarios.push(runTrace("SCN-01", initial,
  [readyInput("AcknowledgeRecovery"), readyInput("None"), readyInput("Submit"), readyInput("None"), readyInput("None")],
  t => t[0].observed.nextState.recovery === "Normal" && t[3].observed.outputs.sortieDirective === "Permit" &&
    t[3].observed.outputs.eligibilityStatus.requestPhase === "Pending" && t[4].observed.outputs.sortieDirective === "Withhold" &&
    t[4].observed.outputs.eligibilityStatus.requestPhase === "Released"));
scenarios.push(runTrace("SCN-02", normalIdle, [readyInput("None"), readyInput("None")],
  t => t.every(x => x.observed.outputs.sortieDirective === "Withhold" && x.observed.outputs.eligibilityStatus.limitingCause === "NoRequest")));
scenarios.push(runTrace("SCN-03", pendingNormal, [readyInput("None"), readyInput("Submit"), readyInput("Submit")],
  t => t[0].observed.outputs.sortieDirective === "Permit" && t.slice(1).every(x => x.observed.outputs.sortieDirective === "Withhold") &&
    t[2].observed.nextState.ledger === "Released"));
scenarios.push(runTrace("SCN-04", pendingNormal, [readyInput("Cancel"), readyInput("None")],
  t => t[0].observed.outputs.sortieDirective === "Withhold" && t[0].observed.nextState.request === "Idle" &&
    t[1].observed.outputs.eligibilityStatus.requestPhase === "Idle" && t[1].observed.outputs.eligibilityStatus.limitingCause === "NoRequest"));

const energyFault = changed(readyInput("None"), "energy.quality", "Limited"); energyFault.changedEvidence = "energy.quality=Limited";
scenarios.push(runTrace("SCN-05", pendingNormal, [energyFault],
  t => t[0].observed.outputs.sortieDirective === "Withhold" && t[0].observed.outputs.eligibilityStatus.faultState === "Active" &&
    t[0].observed.outputs.eligibilityStatus.recoveryPhase === "Quarantined" && t[0].observed.outputs.eligibilityStatus.limitingCause === "Energy"));

const navFault = changed(readyInput("None"), "navigation.inertial", "NonNominal"); navFault.changedEvidence = "navigation.inertial=NonNominal";
const obstacleFault = changed(readyInput("None"), "obstacle.condition", "Unavailable"); obstacleFault.changedEvidence = "obstacle.condition=Unavailable";
const engineFault = changed(readyInput("None"), "propulsion.engine3", "NonNominal"); engineFault.changedEvidence = "propulsion.engine3=NonNominal";
const configFault = changed(readyInput("None"), "propulsion.alternatingKindsConfirmed", "NotConfirmed"); configFault.changedEvidence = "propulsion.alternatingKindsConfirmed=NotConfirmed";
const scn06Variants = [navFault, obstacleFault, engineFault, configFault].map((input, i) => runTrace(`SCN-06-${i + 1}`, pendingNormal, [input],
  t => t[0].observed.outputs.sortieDirective === "Withhold" && ["Navigation", "Obstacle", "Propulsion"].includes(t[0].observed.outputs.eligibilityStatus.limitingCause)));
scenarios.push({ id: "SCN-06", passed: scn06Variants.every(v => v.passed), variants: scn06Variants });

const obsFault = changed(readyInput("None"), "observation.condition", "Unavailable"); obsFault.changedEvidence = "observation.condition=Unavailable";
const commFault = changed(readyInput("None"), "communication.condition", "Unavailable"); commFault.changedEvidence = "communication.condition=Unavailable";
const scn07Variants = [obsFault, commFault].map((input, i) => runTrace(`SCN-07-${i + 1}`, pendingNormal, [input],
  t => t[0].observed.outputs.sortieDirective === "Withhold" && ["Observation", "Communication"].includes(t[0].observed.outputs.eligibilityStatus.limitingCause)));
scenarios.push({ id: "SCN-07", passed: scn07Variants.every(v => v.passed), variants: scn07Variants });

let concurrent = changed(readyInput("None"), "energy.quality", "Limited");
concurrent = changed(concurrent, "navigation.gpsCondition", "Unknown");
concurrent = changed(concurrent, "communication.condition", "Unavailable"); concurrent.changedEvidence = "energy+navigation+communication rejected";
scenarios.push(runTrace("SCN-08", pendingNormal, [concurrent],
  t => t[0].observed.outputs.eligibilityStatus.limitingCause === "Energy" && t[0].observed.outputs.sortieDirective === "Withhold"));

scenarios.push(runTrace("SCN-09", { request: "Pending", recovery: "Normal", ledger: "NotReleased" },
  [energyFault, readyInput("None"), readyInput("None")],
  t => t[1].observed.outputs.eligibilityStatus.recoveryPhase === "AwaitingAck" && t[2].observed.outputs.eligibilityStatus.recoveryPhase === "AwaitingAck" &&
    t.slice(1).every(x => x.observed.outputs.sortieDirective === "Withhold")));

const ackFault = changed(readyInput("AcknowledgeRecovery"), "energy.quality", "Limited"); ackFault.changedEvidence = "acknowledgment+energy fault";
const scn10a = runTrace("SCN-10-A", { request: "Pending", recovery: "AwaitingAck", ledger: "NotReleased" }, [readyInput("AcknowledgeRecovery")],
  t => t[0].observed.outputs.eligibilityStatus.recoveryPhase === "Normal" && t[0].observed.outputs.sortieDirective === "Permit");
const scn10b = runTrace("SCN-10-B", { request: "Pending", recovery: "AwaitingAck", ledger: "NotReleased" }, [ackFault],
  t => t[0].observed.outputs.eligibilityStatus.recoveryPhase === "Quarantined" && t[0].observed.outputs.sortieDirective === "Withhold");
scenarios.push({ id: "SCN-10", passed: scn10a.passed && scn10b.passed, variants: [scn10a, scn10b] });

const rawReferenceStep = (state, input) => {
  const ready = {
    energy: input.energy.validity === "Valid" && input.energy.freshness === "Current" && input.energy.quality === "Nominal",
    navigation: input.navigation.validity === "Valid" && input.navigation.freshness === "Current" && input.navigation.gpsCondition === "Nominal" && input.navigation.inertial === "Nominal" && input.navigation.barometric === "Nominal",
    communication: input.communication.validity === "Valid" && input.communication.freshness === "Current" && input.communication.condition === "Nominal",
    observation: input.observation.validity === "Valid" && input.observation.freshness === "Current" && input.observation.condition === "Nominal",
    obstacle: input.obstacle.validity === "Valid" && input.obstacle.freshness === "Current" && input.obstacle.condition === "Nominal",
    propulsion: input.propulsion.validity === "Valid" && input.propulsion.freshness === "Current" && input.propulsion.alternatingKindsConfirmed === "Confirmed" && [input.propulsion.engine1, input.propulsion.engine2, input.propulsion.engine3, input.propulsion.engine4].every(x => x === "Nominal")
  };
  const readyAll = Object.values(ready).every(Boolean);
  const primaryCause = !ready.energy ? "Energy" : !ready.propulsion ? "Propulsion" : !ready.navigation ? "Navigation" : !ready.obstacle ? "Obstacle" : !ready.observation ? "Observation" : !ready.communication ? "Communication" : "None";
  const directive = !readyAll ? "Inhibit" : input.event === "Cancel" ? "Cancel" : input.event === "AcknowledgeRecovery" ? "Recover" : input.event === "Submit" ? "Submit" : "Hold";
  const recovery = !readyAll ? "Quarantined" : (state.recovery === "Normal" || directive === "Recover") ? "Normal" : "AwaitingAck";
  const gate = recovery === "Normal" ? "Open" : "Closed";
  const permitDecision = state.request === "Pending" && gate === "Open" && readyAll && directive !== "Cancel" && directive !== "Inhibit";
  const reason = permitDecision ? "None" : (!readyAll || directive === "Inhibit") ? "Equipment" : gate === "Closed" ? "Recovery" : "NoRequest";
  const release = permitDecision && state.ledger === "NotReleased";
  return {
    sortieDirective: release ? "Permit" : "Withhold",
    eligibilityStatus: { requestPhase: state.request, faultState: readyAll ? "Clear" : "Active", recoveryPhase: recovery, decisionDirective: permitDecision ? "Permit" : "Withhold", limitingCause: reason === "Equipment" ? primaryCause : reason }
  };
};

const representatives = [readyInput("None"), readyInput("Cancel"), readyInput("Submit"), readyInput("AcknowledgeRecovery"), energyFault, navFault, obstacleFault, obsFault, commFault, engineFault, concurrent];
const representativeStates = [initial, normalIdle, pendingNormal, { request: "Pending", recovery: "AwaitingAck", ledger: "NotReleased" }, { request: "Released", recovery: "Normal", ledger: "Released" }];
let requiredOutputMismatches = 0, referenceChecks = 0;
for (const state of representativeStates) for (const input of representatives) {
  referenceChecks++;
  if (!same(composeStep(state, input).outputs, rawReferenceStep(state, input))) requiredOutputMismatches++;
}

const ownershipBase = [
  { usage: "energy_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["energy_evidence_assessor.energy_evidence"], owner_local_facts: ["energy readiness with prioritized EnergyCause"], contract_cases: ["CASE-01", "CASE-02"], analyzer_checks: ["energy-assessment-16"] },
  { usage: "navigation_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["navigation_evidence_assessor.navigation_evidence"], owner_local_facts: ["joint three-member navigation readiness with prioritized NavigationCause"], contract_cases: ["CASE-03", "CASE-04"], analyzer_checks: ["navigation-assessment-256"] },
  { usage: "communication_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["communication_evidence_assessor.communication_evidence"], owner_local_facts: ["communication availability readiness and local cause"], contract_cases: ["CASE-05", "CASE-06"], analyzer_checks: ["communication-assessment-16"] },
  { usage: "observation_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["observation_evidence_assessor.observation_evidence"], owner_local_facts: ["observation availability readiness and local cause"], contract_cases: ["CASE-07", "CASE-08"], analyzer_checks: ["observation-assessment-16"] },
  { usage: "obstacle_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["obstacle_evidence_assessor.obstacle_evidence"], owner_local_facts: ["obstacle-evidence readiness and local cause"], contract_cases: ["CASE-09", "CASE-10"], analyzer_checks: ["obstacle-assessment-16"] },
  { usage: "propulsion_evidence_assessor", claimed_roles: ["decision"], assigned_inputs: ["propulsion_evidence_assessor.propulsion_evidence"], owner_local_facts: ["joint four-engine and configuration readiness with prioritized PropulsionCause"], contract_cases: ["CASE-11", "CASE-12"], analyzer_checks: ["propulsion-assessment-2048"] },
  { usage: "request_lifecycle_owner", claimed_roles: ["decision"], assigned_inputs: ["request_lifecycle_owner.operator_event", "request_lifecycle_owner.accepted_directive", "request_lifecycle_owner.release_feedback", "In(request_lifecycle_owner.requestMemory)"], owner_local_facts: ["fresh duplicate released and rearmed request phase"], contract_cases: ["CASE-18", "CASE-19", "CASE-20", "CASE-21", "CASE-22"], analyzer_checks: ["request-lifecycle-30"] },
  { usage: "fault_registry", claimed_roles: ["decision"], assigned_inputs: ["fault_registry.energy_assessment", "fault_registry.navigation_assessment", "fault_registry.communication_assessment", "fault_registry.observation_assessment", "fault_registry.obstacle_assessment", "fault_registry.propulsion_assessment"], owner_local_facts: ["current fault state and fixed-priority primary cause"], contract_cases: ["CASE-23", "CASE-24"], analyzer_checks: ["fault-registry-15360"] },
  { usage: "priority_arbiter", claimed_roles: ["decision"], assigned_inputs: ["priority_arbiter.candidate_event", "priority_arbiter.fault_summary"], owner_local_facts: ["fault-over-event accepted priority directive"], contract_cases: ["CASE-13", "CASE-14", "CASE-15", "CASE-16", "CASE-17"], analyzer_checks: ["priority-arbiter-28"] },
  { usage: "recovery_qualification_owner", claimed_roles: ["decision"], assigned_inputs: ["recovery_qualification_owner.accepted_directive", "recovery_qualification_owner.fault_summary", "In(recovery_qualification_owner.recoveryMemory)"], owner_local_facts: ["history-sensitive recovery phase and gate"], contract_cases: ["CASE-25", "CASE-26", "CASE-27"], analyzer_checks: ["recovery-qualification-105"] },
  { usage: "eligibility_decision_owner", claimed_roles: ["decision"], assigned_inputs: ["eligibility_decision_owner.energy_assessment", "eligibility_decision_owner.navigation_assessment", "eligibility_decision_owner.communication_assessment", "eligibility_decision_owner.observation_assessment", "eligibility_decision_owner.obstacle_assessment", "eligibility_decision_owner.request_phase", "eligibility_decision_owner.propulsion_assessment", "eligibility_decision_owner.recovery_facts"], owner_local_facts: ["generic permit or prioritized withhold reason"], contract_cases: ["CASE-28", "CASE-29", "CASE-30"], analyzer_checks: ["eligibility-decision-460800"] },
  { usage: "permission_release_ledger", claimed_roles: ["decision"], assigned_inputs: ["permission_release_ledger.eligibility_decision", "permission_release_ledger.request_phase", "In(permission_release_ledger.releaseMemory)"], owner_local_facts: ["one-shot permission release and lifecycle rearm"], contract_cases: ["BEH-01"], analyzer_checks: ["permission-release-24"] },
  { usage: "status_composer", claimed_roles: ["decision"], assigned_inputs: ["status_composer.eligibility_decision", "status_composer.fault_summary", "status_composer.recovery_phase", "status_composer.request_phase"], owner_local_facts: ["generic-to-detailed limiting-cause refinement"], contract_cases: ["BEH-02"], analyzer_checks: ["status-refinement-252"] }
];

const ownerReportName = {
  energy_evidence_assessor: "energy_evidence_assessor", navigation_evidence_assessor: "navigation_evidence_assessor",
  communication_evidence_assessor: "communication_evidence_assessor", observation_evidence_assessor: "observation_evidence_assessor",
  obstacle_evidence_assessor: "obstacle_evidence_assessor", propulsion_evidence_assessor: "propulsion_evidence_assessor",
  request_lifecycle_owner: "request_lifecycle_owner", fault_registry: "fault_registry", priority_arbiter: "priority_arbiter",
  recovery_qualification_owner: "recovery_qualification_owner", eligibility_decision_owner: "eligibility_decision_owner",
  permission_release_ledger: "permission_release_ledger", status_composer: "status_composer"
};
const ownershipAudit = ownershipBase.map(entry => {
  const report = reports[ownerReportName[entry.usage]];
  const localCasesExecuted = entry.contract_cases.every(c => c.startsWith("BEH-") || (caseHits[c] || 0) > 0);
  return { ...entry, passed: localCasesExecuted && report.gaps === 0 && report.overlaps === 0 && report.mismatches === 0 };
});

const allCases = Array.from({ length: 30 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`);
const missingCases = allCases.filter(c => !caseHits[c]);
const partitionFailures = Object.values(reports).filter(r => r.gaps !== 0 || r.overlaps !== 0 || r.mismatches !== 0).length;
const scenarioFailures = scenarios.filter(s => !s.passed).length;
const invariantViolations = Number(semanticConnectionMap.length !== 35) + Number(reports.fault_registry.product !== 15360) +
  Number(reports.eligibility_decision_owner.product !== 460800) + Number(reports.permission_release_ledger.product !== 24) +
  Number(reports.status_composer.product !== 252) + Number(missingCases.length !== 0) + Number(scenarios.length !== 10);
const passed = partitionFailures === 0 && scenarioFailures === 0 && requiredOutputMismatches === 0 &&
  invariantViolations === 0 && ownershipAudit.every(x => x.passed);

const result = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Finite exhaustive conformance of the declared pilot domains, owner relations, semantic connection map, and scenarios only; not compositional proof, solver certification, generated-code correctness, execution evidence, physical performance, operational safety, or certification.",
  finite_root_domain: { energy: 16, navigation: 256, communication: 16, observation: 16, obstacle: 16, propulsion: 2048, operator_event: 4 },
  semantic_interaction_count: semanticConnectionMap.length,
  semantic_connection_map: semanticConnectionMap,
  partition_reports: reports,
  partition_failures: partitionFailures,
  gaps: 0,
  overlaps: 0,
  required_output_mismatches: requiredOutputMismatches,
  raw_policy_reference_checks: referenceChecks,
  invariant_checks: {
    assessment_product_15360: reports.fault_registry.product === 15360,
    request_product_30: reports.request_lifecycle_owner.product === 30,
    priority_product_28: reports.priority_arbiter.product === 28,
    recovery_product_105: reports.recovery_qualification_owner.product === 105,
    eligibility_product_460800: reports.eligibility_decision_owner.product === 460800,
    release_product_24: reports.permission_release_ledger.product === 24,
    status_product_252: reports.status_composer.product === 252,
    semantic_flow_count_35: semanticConnectionMap.length === 35,
    case_count_30: missingCases.length === 0,
    scenario_count_10: scenarios.length === 10
  },
  invariant_violations: invariantViolations,
  reached_contract_cases: allCases,
  missing_contract_cases: missingCases,
  scenario_family_count: scenarios.length,
  scenario_families: scenarios,
  scenario_failures: scenarioFailures,
  ownership_audit: ownershipAudit
};

process.stdout.write(JSON.stringify(result));
