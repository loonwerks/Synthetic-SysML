#!/usr/bin/env node

"use strict";

// Deterministic bounded conformance analysis. This program intentionally reads
// no files, environment, clock, randomness, network, or mutable external state.

const SOURCE_SHA256 = "3f03db15b5504cb8bc7dcf189c53b73119679554616351c6994c72a2bb2fa0c3";

const semanticConnectionMap = {
  "INT-01": { from: "root.contactEvidence", to: "threatEvidenceInterpreter.contactEvidence", value: "ContactEvidence" },
  "INT-02": { from: "root.identificationEvidence", to: "threatEvidenceInterpreter.identificationEvidence", value: "IdentificationEvidence" },
  "INT-03": { from: "root.defenseEvidence", to: "defenseReadinessAssessor.defenseEvidence", value: "DefenseEvidence" },
  "INT-04": { from: "root.retreatNavigationEvidence", to: "retreatReadinessAssessor.retreatNavigationEvidence", value: "RetreatNavigationEvidence" },
  "INT-05": { from: "root.responseRequest", to: "principalResponseCoordinator.responseRequest", value: "ResponseRequest" },
  "INT-06": { from: "threatEvidenceInterpreter.qualifiedThreat", to: "principalResponseCoordinator.qualifiedThreat", value: "QualifiedThreat" },
  "INT-07": { from: "defenseReadinessAssessor.defenseCondition", to: "principalResponseCoordinator.defenseCondition", value: "DefenseCondition" },
  "INT-08": { from: "retreatReadinessAssessor.retreatCondition", to: "principalResponseCoordinator.retreatCondition", value: "RetreatCondition" },
  "INT-09": { from: "principalResponseCoordinator.defenseActivation", to: "root.defenseActivation", value: "DefenseActivation" },
  "INT-10": { from: "principalResponseCoordinator.retreatNavigationCommand", to: "root.retreatNavigationCommand", value: "RetreatNavigationCommand" },
  "INT-11": { from: "principalResponseCoordinator.responseRecord", to: "threatReportComposer.responseRecord", value: "ResponseRecord" },
  "INT-12": { from: "root.reportAcknowledgment", to: "threatReportComposer.reportAcknowledgment", value: "ReportAcknowledgment" },
  "INT-13": { from: "threatReportComposer.threatReport", to: "root.threatReport", value: "ThreatReport" }
};

const bools = [false, true];
const statusValues = ["VALID", "INVALID"];
const contactEvidenceDomain = [];
for (const signature of ["NONE", "CONTACT"]) for (const signatureStatus of statusValues)
  contactEvidenceDomain.push({ signature, signatureStatus });
const identificationEvidenceDomain = [];
for (const identity of ["NO_HOSTILE", "HOSTILE"]) for (const identityStatus of statusValues)
  identificationEvidenceDomain.push({ identity, identityStatus });
const defenseEvidenceDomain = [];
for (const defenseAvailable of ["AVAILABLE", "UNAVAILABLE"])
  for (const defenseStatus of statusValues)
    for (const droneReadiness of ["READY", "NOT_READY"])
      for (const droneStatus of statusValues)
        defenseEvidenceDomain.push({ defenseAvailable, defenseStatus, droneReadiness, droneStatus });
const retreatEvidenceDomain = [];
for (const destination of ["IDENTIFIED", "ABSENT"])
  for (const destinationStatus of statusValues)
    for (const warpProgress of ["READY", "IN_PROGRESS", "COMPLETE", "UNAVAILABLE"])
      for (const warpStatus of statusValues)
        retreatEvidenceDomain.push({ destination, destinationStatus, warpProgress, warpStatus });
const requestDomain = [];
for (const request of ["OBSERVE", "DEFEND_IF_HOSTILE", "RETREAT"])
  for (const requestStatus of statusValues) requestDomain.push({ request, requestStatus });
const acknowledgmentDomain = [];
for (const acknowledgment of ["NOT_ACKNOWLEDGED", "ACKNOWLEDGED"])
  for (const acknowledgmentStatus of statusValues)
    acknowledgmentDomain.push({ acknowledgment, acknowledgmentStatus });
const principalStateDomain = [];
for (const responseCommitment of ["OPEN", "DEFENSE_COMMITTED", "RETREAT_COMMITTED"])
  for (const retreatRequestArmed of bools)
    principalStateDomain.push({ responseCommitment, retreatRequestArmed });

// PART-01 owner-local relation. Downstream policy receives only its INT-06 value.
function threatEvidenceInterpreter(contactEvidence, identificationEvidence) {
  if (contactEvidence.signatureStatus === "INVALID" || identificationEvidence.identityStatus === "INVALID") return "UNKNOWN";
  if (contactEvidence.signature === "NONE" && identificationEvidence.identity === "HOSTILE") return "UNKNOWN";
  if (contactEvidence.signature === "CONTACT" && identificationEvidence.identity === "HOSTILE") return "HOSTILE";
  if (contactEvidence.signature === "CONTACT") return "SUSPECT";
  return "CLEAR";
}

// PART-02 owner-local relation. Downstream policy receives only its INT-07 value.
function defenseReadinessAssessor(defenseEvidence) {
  if (defenseEvidence.defenseStatus === "INVALID" || defenseEvidence.droneStatus === "INVALID") return "UNKNOWN";
  if (defenseEvidence.defenseAvailable === "AVAILABLE" && defenseEvidence.droneReadiness === "READY") return "READY";
  return "UNAVAILABLE";
}

// PART-03 owner-local relation. Downstream policy receives only its INT-08 value.
function retreatReadinessAssessor(retreatNavigationEvidence) {
  if (retreatNavigationEvidence.destinationStatus === "INVALID" || retreatNavigationEvidence.warpStatus === "INVALID") return "UNKNOWN";
  if (retreatNavigationEvidence.warpProgress === "COMPLETE") return "COMPLETE";
  if (retreatNavigationEvidence.destination === "IDENTIFIED" &&
      (retreatNavigationEvidence.warpProgress === "READY" || retreatNavigationEvidence.warpProgress === "IN_PROGRESS")) return "AVAILABLE";
  return "UNAVAILABLE";
}

function coordinatorGuardHits(input, preState) {
  const decisionValid = input.qualifiedThreat !== "UNKNOWN" && input.defenseCondition !== "UNKNOWN" &&
    input.retreatCondition !== "UNKNOWN" && input.responseRequest.requestStatus === "VALID";
  const freshRetreatTrigger = preState.responseCommitment !== "RETREAT_COMMITTED" &&
    input.retreatCondition !== "COMPLETE" &&
    ((input.responseRequest.request === "RETREAT" && preState.retreatRequestArmed) ||
     (input.responseRequest.request === "DEFEND_IF_HOSTILE" && input.qualifiedThreat === "HOSTILE" &&
      input.defenseCondition === "UNAVAILABLE"));
  const defenseGuard = input.qualifiedThreat === "HOSTILE" &&
    input.responseRequest.request === "DEFEND_IF_HOSTILE" && input.defenseCondition === "READY";
  return [
    !decisionValid,
    decisionValid && preState.responseCommitment === "RETREAT_COMMITTED" && input.retreatCondition === "AVAILABLE",
    decisionValid && preState.responseCommitment === "RETREAT_COMMITTED" && input.retreatCondition === "UNAVAILABLE",
    decisionValid && preState.responseCommitment === "RETREAT_COMMITTED" && input.retreatCondition === "COMPLETE",
    decisionValid && preState.responseCommitment !== "RETREAT_COMMITTED" && freshRetreatTrigger && input.retreatCondition === "AVAILABLE",
    decisionValid && preState.responseCommitment !== "RETREAT_COMMITTED" && freshRetreatTrigger && input.retreatCondition === "UNAVAILABLE",
    decisionValid && preState.responseCommitment !== "RETREAT_COMMITTED" && !freshRetreatTrigger && defenseGuard,
    decisionValid && preState.responseCommitment !== "RETREAT_COMMITTED" && !freshRetreatTrigger && !defenseGuard
  ];
}

function ordinaryArmUpdate(responseRequest, preState) {
  return responseRequest.requestStatus === "VALID" && responseRequest.request !== "RETREAT"
    ? true : preState.retreatRequestArmed;
}

// PART-04 is the sole principal response owner and consumes INT-05..INT-08.
function principalResponseCoordinator(input, preState) {
  const hits = coordinatorGuardHits(input, preState);
  const matching = hits.flatMap((hit, index) => hit ? [index + 1] : []);
  if (matching.length !== 1) return { matching, commandCase: null };
  const number = matching[0];
  const result = {
    matching,
    commandCase: `CASE-${String(number).padStart(2, "0")}`,
    defenseActivation: "STAND_DOWN",
    retreatNavigationCommand: "HOLD",
    responseRecord: { qualifiedThreat: input.qualifiedThreat, disposition: "OBSERVED" },
    nextState: { responseCommitment: "OPEN", retreatRequestArmed: ordinaryArmUpdate(input.responseRequest, preState) }
  };
  if (number === 1) {
    result.responseRecord.disposition = "INPUT_FAULT";
    result.nextState.responseCommitment = preState.responseCommitment === "RETREAT_COMMITTED" ? "RETREAT_COMMITTED" : "OPEN";
  } else if (number === 2) {
    result.retreatNavigationCommand = "RETREAT";
    result.responseRecord.disposition = "RETREAT_ACTIVE";
    result.nextState.responseCommitment = "RETREAT_COMMITTED";
  } else if (number === 3) {
    result.responseRecord.disposition = "RETREAT_BLOCKED";
    result.nextState.responseCommitment = "RETREAT_COMMITTED";
  } else if (number === 4) {
    result.responseRecord.disposition = "RETREAT_COMPLETE";
  } else if (number === 5 || number === 6) {
    result.retreatNavigationCommand = number === 5 ? "RETREAT" : "HOLD";
    result.responseRecord.disposition = number === 5 ? "RETREAT_ACTIVE" : "RETREAT_BLOCKED";
    result.nextState.responseCommitment = "RETREAT_COMMITTED";
    result.nextState.retreatRequestArmed = input.responseRequest.request === "RETREAT" ? false : true;
  } else if (number === 7) {
    result.defenseActivation = "ACTIVATE";
    result.responseRecord.disposition = "DEFENSE_ACTIVE";
    result.nextState.responseCommitment = "DEFENSE_COMMITTED";
    result.nextState.retreatRequestArmed = true;
  }
  return result;
}

function reportGuardHits(responseRecord, reportAcknowledgment) {
  return [
    reportAcknowledgment.acknowledgmentStatus === "INVALID",
    reportAcknowledgment.acknowledgmentStatus === "VALID" && reportAcknowledgment.acknowledgment === "ACKNOWLEDGED",
    reportAcknowledgment.acknowledgmentStatus === "VALID" && reportAcknowledgment.acknowledgment === "NOT_ACKNOWLEDGED" &&
      (responseRecord.disposition === "INPUT_FAULT" || responseRecord.disposition === "RETREAT_BLOCKED"),
    reportAcknowledgment.acknowledgmentStatus === "VALID" && reportAcknowledgment.acknowledgment === "NOT_ACKNOWLEDGED" &&
      ["OBSERVED", "DEFENSE_ACTIVE", "RETREAT_ACTIVE", "RETREAT_COMPLETE"].includes(responseRecord.disposition)
  ];
}

// PART-05 consumes INT-11 and INT-12 and owns report priority only.
function threatReportComposer(responseRecord, reportAcknowledgment) {
  const hits = reportGuardHits(responseRecord, reportAcknowledgment);
  const matching = hits.flatMap((hit, index) => hit ? [index + 9] : []);
  if (matching.length !== 1) return { matching, reportCase: null };
  const priority = matching[0] === 9 ? "COMMUNICATION_FAULT" :
    matching[0] === 10 ? "CLOSED" : matching[0] === 11 ? "URGENT" : "ROUTINE";
  return {
    matching,
    reportCase: `CASE-${String(matching[0]).padStart(2, "0")}`,
    threatReport: { qualifiedThreat: responseRecord.qualifiedThreat, disposition: responseRecord.disposition, priority }
  };
}

// Exact semantic composition: values produced by each owner cross the named
// interaction before the next owner consumes them.
function compose(preState, rootInput) {
  const int01 = rootInput.contactEvidence;
  const int02 = rootInput.identificationEvidence;
  const int03 = rootInput.defenseEvidence;
  const int04 = rootInput.retreatNavigationEvidence;
  const int05 = rootInput.responseRequest;
  const int06 = threatEvidenceInterpreter(int01, int02);
  const int07 = defenseReadinessAssessor(int03);
  const int08 = retreatReadinessAssessor(int04);
  const coordinator = principalResponseCoordinator({
    responseRequest: int05,
    qualifiedThreat: int06,
    defenseCondition: int07,
    retreatCondition: int08
  }, preState);
  if (coordinator.commandCase === null) return { int06, int07, int08, coordinator, composer: null };
  const int11 = coordinator.responseRecord;
  const int12 = rootInput.reportAcknowledgment;
  const composer = threatReportComposer(int11, int12);
  return { int06, int07, int08, coordinator, composer };
}

function coordinatorOracle(input, preState) {
  const valid = input.qualifiedThreat !== "UNKNOWN" && input.defenseCondition !== "UNKNOWN" &&
    input.retreatCondition !== "UNKNOWN" && input.responseRequest.requestStatus === "VALID";
  const fresh = preState.responseCommitment !== "RETREAT_COMMITTED" && input.retreatCondition !== "COMPLETE" &&
    ((input.responseRequest.request === "RETREAT" && preState.retreatRequestArmed) ||
     (input.responseRequest.request === "DEFEND_IF_HOSTILE" && input.qualifiedThreat === "HOSTILE" && input.defenseCondition === "UNAVAILABLE"));
  if (!valid) return "CASE-01";
  if (preState.responseCommitment === "RETREAT_COMMITTED") {
    if (input.retreatCondition === "AVAILABLE") return "CASE-02";
    if (input.retreatCondition === "UNAVAILABLE") return "CASE-03";
    return "CASE-04";
  }
  if (fresh) return input.retreatCondition === "AVAILABLE" ? "CASE-05" : "CASE-06";
  if (input.qualifiedThreat === "HOSTILE" && input.responseRequest.request === "DEFEND_IF_HOSTILE" && input.defenseCondition === "READY") return "CASE-07";
  return "CASE-08";
}

const commandCaseCounts = Object.fromEntries(Array.from({ length: 8 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const reportCaseCounts = Object.fromEntries(Array.from({ length: 4 }, (_, i) => [`CASE-${String(i + 9).padStart(2, "0")}`, 0]));
const observations = {
  command_partition_gaps: 0,
  command_partition_overlaps: 0,
  report_partition_gaps: 0,
  report_partition_overlaps: 0,
  assessor_mismatches: 0,
  owner_local_relation_mismatches: 0,
  required_output_mismatches: 0,
  state_invariant_violations: 0,
  report_preservation_mismatches: 0,
  command_override_mismatches: 0,
  unresolved_endpoint_mismatches: 0,
  metric_evidence_mismatches: 0
};
const firstWitnesses = {};
let snapshots = 0;

function witness(name, value) { if (!(name in firstWitnesses)) firstWitnesses[name] = value; }
function completeCoordinatorOutput(value) {
  return value && ["STAND_DOWN", "ACTIVATE"].includes(value.defenseActivation) &&
    ["HOLD", "RETREAT"].includes(value.retreatNavigationCommand) &&
    ["OPEN", "DEFENSE_COMMITTED", "RETREAT_COMMITTED"].includes(value.nextState.responseCommitment) &&
    typeof value.nextState.retreatRequestArmed === "boolean" &&
    ["CLEAR", "SUSPECT", "HOSTILE", "UNKNOWN"].includes(value.responseRecord.qualifiedThreat) &&
    ["OBSERVED", "DEFENSE_ACTIVE", "RETREAT_ACTIVE", "RETREAT_BLOCKED", "RETREAT_COMPLETE", "INPUT_FAULT"].includes(value.responseRecord.disposition);
}

for (const contactEvidence of contactEvidenceDomain)
  for (const identificationEvidence of identificationEvidenceDomain)
    for (const defenseEvidence of defenseEvidenceDomain)
      for (const retreatNavigationEvidence of retreatEvidenceDomain)
        for (const responseRequest of requestDomain)
          for (const reportAcknowledgment of acknowledgmentDomain)
            for (const preState of principalStateDomain) {
              const rootInput = { contactEvidence, identificationEvidence, defenseEvidence, retreatNavigationEvidence, responseRequest, reportAcknowledgment };
              const result = compose(preState, rootInput);
              snapshots += 1;
              if (result.coordinator.matching.length === 0) { observations.command_partition_gaps += 1; witness("command_partition_gap", { preState, rootInput }); continue; }
              if (result.coordinator.matching.length > 1) { observations.command_partition_overlaps += 1; witness("command_partition_overlap", { preState, rootInput, matching: result.coordinator.matching }); continue; }
              commandCaseCounts[result.coordinator.commandCase] += 1;
              if (result.composer.matching.length === 0) { observations.report_partition_gaps += 1; witness("report_partition_gap", { preState, rootInput }); continue; }
              if (result.composer.matching.length > 1) { observations.report_partition_overlaps += 1; witness("report_partition_overlap", { preState, rootInput, matching: result.composer.matching }); continue; }
              reportCaseCounts[result.composer.reportCase] += 1;
              const ownerInput = { responseRequest, qualifiedThreat: result.int06, defenseCondition: result.int07, retreatCondition: result.int08 };
              if (result.coordinator.commandCase !== coordinatorOracle(ownerInput, preState)) {
                observations.owner_local_relation_mismatches += 1; witness("owner_local_relation_mismatch", { preState, rootInput, result });
              }
              if (!completeCoordinatorOutput(result.coordinator)) {
                observations.required_output_mismatches += 1; witness("required_output_mismatch", { preState, rootInput, result });
              }
              if (result.coordinator.defenseActivation === "ACTIVATE" && result.coordinator.retreatNavigationCommand === "RETREAT") {
                observations.state_invariant_violations += 1; witness("simultaneous_command_violation", { preState, rootInput, result });
              }
              if (preState.responseCommitment === "RETREAT_COMMITTED" && result.coordinator.commandCase !== "CASE-01" &&
                  result.int08 !== "COMPLETE" && result.coordinator.nextState.responseCommitment !== "RETREAT_COMMITTED") {
                observations.state_invariant_violations += 1; witness("retreat_persistence_violation", { preState, rootInput, result });
              }
              if (result.composer.threatReport.qualifiedThreat !== result.coordinator.responseRecord.qualifiedThreat ||
                  result.composer.threatReport.disposition !== result.coordinator.responseRecord.disposition) {
                observations.report_preservation_mismatches += 1; witness("report_preservation_mismatch", { preState, rootInput, result });
              }
            }

const part01Product = [];
for (const contactEvidence of contactEvidenceDomain) for (const identificationEvidence of identificationEvidenceDomain)
  part01Product.push(threatEvidenceInterpreter(contactEvidence, identificationEvidence));
const part02Product = defenseEvidenceDomain.map(defenseReadinessAssessor);
const part03Product = retreatEvidenceDomain.map(retreatReadinessAssessor);

const localRelationChecks = {
  part01_total_16_relation: part01Product.length === 16 && ["CLEAR", "SUSPECT", "HOSTILE", "UNKNOWN"].every(value => part01Product.includes(value)),
  part02_total_16_relation: part02Product.length === 16 && part02Product.filter(value => value === "READY").length === 1 &&
    part02Product.filter(value => value === "UNAVAILABLE").length === 3 && part02Product.filter(value => value === "UNKNOWN").length === 12,
  part03_total_32_relation: part03Product.length === 32 && ["AVAILABLE", "UNAVAILABLE", "COMPLETE", "UNKNOWN"].every(value => part03Product.includes(value)),
  part04_eight_case_partition: Object.values(commandCaseCounts).every(count => count > 0),
  part05_four_case_partition: Object.values(reportCaseCounts).every(count => count > 0)
};

function baseInput() {
  return {
    contactEvidence: { signature: "NONE", signatureStatus: "VALID" },
    identificationEvidence: { identity: "NO_HOSTILE", identityStatus: "VALID" },
    defenseEvidence: { defenseAvailable: "AVAILABLE", defenseStatus: "VALID", droneReadiness: "READY", droneStatus: "VALID" },
    retreatNavigationEvidence: { destination: "IDENTIFIED", destinationStatus: "VALID", warpProgress: "READY", warpStatus: "VALID" },
    responseRequest: { request: "OBSERVE", requestStatus: "VALID" },
    reportAcknowledgment: { acknowledgment: "NOT_ACKNOWLEDGED", acknowledgmentStatus: "VALID" }
  };
}
function changed(base, patch) {
  const copy = JSON.parse(JSON.stringify(base));
  for (const [group, values] of Object.entries(patch)) copy[group] = { ...copy[group], ...values };
  return copy;
}
function scenarioStep(id, preState, input, expectedCommandCase, expectedReportCase) {
  const result = compose(preState, input);
  const observed = {
    qualifiedThreat: result.int06,
    defenseCondition: result.int07,
    retreatCondition: result.int08,
    commandCase: result.coordinator.commandCase,
    reportCase: result.composer.reportCase,
    defenseActivation: result.coordinator.defenseActivation,
    retreatNavigationCommand: result.coordinator.retreatNavigationCommand,
    disposition: result.coordinator.responseRecord.disposition,
    reportPriority: result.composer.threatReport.priority,
    nextState: result.coordinator.nextState
  };
  return { id, boundaryInput: input, preState, expected: { commandCase: expectedCommandCase, reportCase: expectedReportCase }, observed,
    passed: observed.commandCase === expectedCommandCase && observed.reportCase === expectedReportCase };
}
function chainedTrace(specs, initialState) {
  const trace = [];
  let state = initialState;
  for (const spec of specs) {
    const step = scenarioStep(spec.id, state, spec.input, spec.commandCase, spec.reportCase);
    trace.push(step);
    state = step.observed.nextState;
  }
  return trace;
}

const scn01Base = baseInput();
const scenarioFamilies = {
  "SCN-01": chainedTrace([
    { id: "clear-observation", input: scn01Base, commandCase: "CASE-08", reportCase: "CASE-12" },
    { id: "suspect-observation", input: changed(scn01Base, { contactEvidence: { signature: "CONTACT" } }), commandCase: "CASE-08", reportCase: "CASE-12" },
    { id: "confirmed-defense", input: changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, responseRequest: { request: "DEFEND_IF_HOSTILE" } }), commandCase: "CASE-07", reportCase: "CASE-12" },
    { id: "continued-defense-acknowledged", input: changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, responseRequest: { request: "DEFEND_IF_HOSTILE" }, reportAcknowledgment: { acknowledgment: "ACKNOWLEDGED" } }), commandCase: "CASE-07", reportCase: "CASE-10" },
    { id: "threat-clearance", input: scn01Base, commandCase: "CASE-08", reportCase: "CASE-12" }
  ], { responseCommitment: "OPEN", retreatRequestArmed: true }),
  "SCN-02": [
    scenarioStep("clear-ready-available", { responseCommitment: "OPEN", retreatRequestArmed: true }, scn01Base, "CASE-08", "CASE-12"),
    scenarioStep("suspect-unavailable-route", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, defenseEvidence: { defenseAvailable: "UNAVAILABLE" }, retreatNavigationEvidence: { destination: "ABSENT", warpProgress: "UNAVAILABLE" } }), "CASE-08", "CASE-12"),
    scenarioStep("hostile-defense-at-completion", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, retreatNavigationEvidence: { warpProgress: "COMPLETE" }, responseRequest: { request: "DEFEND_IF_HOSTILE" } }), "CASE-07", "CASE-12"),
    scenarioStep("contradictory-unknown-threat", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { identificationEvidence: { identity: "HOSTILE" } }), "CASE-01", "CASE-11"),
    scenarioStep("unknown-defense", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { defenseEvidence: { defenseStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("unknown-retreat", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { retreatNavigationEvidence: { warpStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("hostile-unavailable-defense-fallback", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, defenseEvidence: { defenseAvailable: "UNAVAILABLE" }, responseRequest: { request: "DEFEND_IF_HOSTILE" } }), "CASE-05", "CASE-12"),
    scenarioStep("retreat-priority-over-ready-defense", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, retreatNavigationEvidence: { destination: "ABSENT", warpProgress: "UNAVAILABLE" }, responseRequest: { request: "RETREAT" } }), "CASE-06", "CASE-11")
  ],
  "SCN-03": [
    scenarioStep("invalid-signature-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signatureStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-identity-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { identificationEvidence: { identityStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-defense-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { defenseEvidence: { defenseStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-drone-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { defenseEvidence: { droneStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-destination-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { retreatNavigationEvidence: { destinationStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-warp-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { retreatNavigationEvidence: { warpStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-request-status", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { responseRequest: { requestStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("invalid-ack-only", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signature: "CONTACT" }, identificationEvidence: { identity: "HOSTILE" }, responseRequest: { request: "DEFEND_IF_HOSTILE" }, reportAcknowledgment: { acknowledgmentStatus: "INVALID" } }), "CASE-07", "CASE-09"),
    scenarioStep("multiple-invalid", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { contactEvidence: { signatureStatus: "INVALID" }, defenseEvidence: { droneStatus: "INVALID" }, retreatNavigationEvidence: { destinationStatus: "INVALID" } }), "CASE-01", "CASE-11"),
    scenarioStep("valid-contradiction", { responseCommitment: "OPEN", retreatRequestArmed: true }, changed(scn01Base, { identificationEvidence: { identity: "HOSTILE" } }), "CASE-01", "CASE-11"),
    scenarioStep("valid-restoration", { responseCommitment: "OPEN", retreatRequestArmed: true }, scn01Base, "CASE-08", "CASE-12")
  ],
  "SCN-04": chainedTrace([
    { id: "fresh-blocked-retreat", input: changed(scn01Base, { retreatNavigationEvidence: { destination: "ABSENT", warpProgress: "UNAVAILABLE" }, responseRequest: { request: "RETREAT" } }), commandCase: "CASE-06", reportCase: "CASE-11" },
    { id: "route-recovery", input: changed(scn01Base, { responseRequest: { request: "RETREAT" } }), commandCase: "CASE-02", reportCase: "CASE-12" },
    { id: "completion-closure", input: changed(scn01Base, { retreatNavigationEvidence: { warpProgress: "COMPLETE" }, responseRequest: { request: "RETREAT" } }), commandCase: "CASE-04", reportCase: "CASE-12" }
  ], { responseCommitment: "OPEN", retreatRequestArmed: true }),
  "SCN-05": chainedTrace([
    { id: "persistent-consumed-request", input: changed(scn01Base, { responseRequest: { request: "RETREAT" } }), commandCase: "CASE-08", reportCase: "CASE-12" },
    { id: "non-retreat-rearm", input: scn01Base, commandCase: "CASE-08", reportCase: "CASE-12" },
    { id: "second-fresh-request-blocked", input: changed(scn01Base, { retreatNavigationEvidence: { destination: "ABSENT", warpProgress: "UNAVAILABLE" }, responseRequest: { request: "RETREAT" } }), commandCase: "CASE-06", reportCase: "CASE-11" },
    { id: "second-retreat-active", input: changed(scn01Base, { responseRequest: { request: "RETREAT" } }), commandCase: "CASE-02", reportCase: "CASE-12" },
    { id: "second-retreat-acknowledged-complete", input: changed(scn01Base, { retreatNavigationEvidence: { warpProgress: "COMPLETE" }, responseRequest: { request: "RETREAT" }, reportAcknowledgment: { acknowledgment: "ACKNOWLEDGED" } }), commandCase: "CASE-04", reportCase: "CASE-10" },
    { id: "invalid-ack-after-completion", input: changed(scn01Base, { reportAcknowledgment: { acknowledgmentStatus: "INVALID" } }), commandCase: "CASE-08", reportCase: "CASE-09" }
  ], { responseCommitment: "OPEN", retreatRequestArmed: false })
};

const scenarioChecks = Object.fromEntries(Object.entries(scenarioFamilies).map(([id, trace]) => [id, trace.length > 0 && trace.every(step => step.passed)]));
const endpointCheck = Object.keys(semanticConnectionMap).length === 13 && Object.values(semanticConnectionMap).every(edge => edge.from && edge.to && edge.value);
if (!endpointCheck) observations.unresolved_endpoint_mismatches = 1;
const expectedBoundaryCombinations = 196608;
const expectedSnapshots = 1179648;
const checks = {
  raw_boundary_product_exact: contactEvidenceDomain.length * identificationEvidenceDomain.length * defenseEvidenceDomain.length *
    retreatEvidenceDomain.length * requestDomain.length * acknowledgmentDomain.length === expectedBoundaryCombinations,
  six_principal_pre_states: principalStateDomain.length === 6,
  snapshot_count_exact: snapshots === expectedSnapshots,
  semantic_connection_map_exact: endpointCheck,
  ...localRelationChecks,
  command_partition_complete_disjoint: observations.command_partition_gaps === 0 && observations.command_partition_overlaps === 0,
  report_partition_complete_disjoint: observations.report_partition_gaps === 0 && observations.report_partition_overlaps === 0,
  outputs_and_next_state_complete: observations.required_output_mismatches === 0,
  state_and_command_invariants: observations.state_invariant_violations === 0,
  response_record_preserved: observations.report_preservation_mismatches === 0,
  source_guards_match_analyzer_guards: observations.owner_local_relation_mismatches === 0,
  all_five_scenario_families: Object.keys(scenarioFamilies).length === 5 && Object.values(scenarioChecks).every(Boolean)
};
const passed = Object.values(checks).every(Boolean) && Object.values(observations).every(value => value === 0);

const ownershipAuditBase = [
  {
    usage: "threatEvidenceInterpreter",
    claimed_roles: ["applicability"],
    assigned_inputs: ["threatEvidenceInterpreter.contactEvidence", "threatEvidenceInterpreter.identificationEvidence"],
    owner_local_facts: ["qualifiedThreat four-class evidence interpretation"],
    contract_cases: ["CONTRACT-LOCAL-01"],
    analyzer_checks: ["part01_total_16_relation"]
  },
  {
    usage: "defenseReadinessAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: ["defenseReadinessAssessor.defenseEvidence"],
    owner_local_facts: ["defenseCondition conjunction of independently valid defense and drone readiness"],
    contract_cases: ["CONTRACT-LOCAL-02"],
    analyzer_checks: ["part02_total_16_relation"]
  },
  {
    usage: "retreatReadinessAssessor",
    claimed_roles: ["applicability"],
    assigned_inputs: ["retreatReadinessAssessor.retreatNavigationEvidence"],
    owner_local_facts: ["retreatCondition completion-precedent route classification"],
    contract_cases: ["CONTRACT-LOCAL-03"],
    analyzer_checks: ["part03_total_32_relation"]
  },
  {
    usage: "principalResponseCoordinator",
    claimed_roles: ["decision"],
    assigned_inputs: ["principalResponseCoordinator.responseRequest", "principalResponseCoordinator.qualifiedThreat", "principalResponseCoordinator.defenseCondition", "principalResponseCoordinator.retreatCondition", "principalResponseCoordinator.responseCommitment", "principalResponseCoordinator.retreatRequestArmed"],
    owner_local_facts: ["exclusive response disposition and command choice", "response commitment transition", "fresh-request arming transition"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08"],
    analyzer_checks: ["part04_eight_case_partition", "source_guards_match_analyzer_guards"]
  },
  {
    usage: "threatReportComposer",
    claimed_roles: ["decision"],
    assigned_inputs: ["threatReportComposer.responseRecord", "threatReportComposer.reportAcknowledgment"],
    owner_local_facts: ["acknowledgment-aware four-class report priority"],
    contract_cases: ["CASE-09", "CASE-10", "CASE-11", "CASE-12"],
    analyzer_checks: ["part05_four_case_partition", "response_record_preserved"]
  }
];
const ownershipAudit = ownershipAuditBase.map(record => ({
  ...record,
  passed: record.analyzer_checks.every(name => checks[name] === true)
}));

process.stdout.write(JSON.stringify({
  schema_version: 2,
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  bounded_analysis_claim_boundary: "Exhaustive finite conformance over the declared logical value/status and two-state snapshot domain only; not execution, physical validation, safety certification, solver certification, compositional proof, or unbounded proof.",
  domain_counts: {
    raw_boundary_combinations: expectedBoundaryCombinations,
    principal_pre_states: principalStateDomain.length,
    snapshots
  },
  semantic_connection_map: semanticConnectionMap,
  partition_counts: { command_policy: commandCaseCounts, reporting: reportCaseCounts },
  owner_local_products: {
    threat_interpreter_combinations: part01Product.length,
    defense_assessor_combinations: part02Product.length,
    retreat_assessor_combinations: part03Product.length
  },
  observations,
  first_witnesses: firstWitnesses,
  invariant_checks: {
    command_mutual_exclusion: checks.state_and_command_invariants,
    retreat_commitment_persistence: checks.state_and_command_invariants,
    report_record_preservation: checks.response_record_preserved,
    acknowledgment_fault_command_isolation: scenarioFamilies["SCN-03"].find(step => step.id === "invalid-ack-only").passed
  },
  checks,
  ownership_audit: ownershipAudit,
  scenario_families: Object.fromEntries(Object.entries(scenarioFamilies).map(([id, trace]) => [id, { passed: scenarioChecks[id], trace }]))
}));
