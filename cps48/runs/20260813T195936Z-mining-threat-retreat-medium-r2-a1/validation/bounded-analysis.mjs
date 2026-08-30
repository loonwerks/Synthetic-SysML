const SOURCE_SHA256 = "93b4a01942241129e5345e9e7517009fb9b922e25641a9e78949b2fa9adce875";

const D = Object.freeze({
  evidenceBand: ["CLEAR", "SUSPICIOUS", "HOSTILE"],
  validity: ["INVALID", "VALID"],
  pilotDisposition: ["NO_RESPONSE", "ACKNOWLEDGE_ALERT", "CONFIRM_CLEAR"],
  defenseAvailability: ["UNAVAILABLE", "AVAILABLE"],
  capacitorSupport: ["INSUFFICIENT", "SUFFICIENT"],
  egressRoute: ["UNKNOWN", "BLOCKED", "AVAILABLE"],
  egressProgress: ["NOT_STARTED", "EN_ROUTE", "SAFE_DESTINATION_OBSERVED", "FAILED"],
  responseAuthorization: ["NO_REQUEST", "EGRESS_REQUEST", "CANCEL_EGRESS"],
  evidenceAssessment: ["UNAVAILABLE", "CLEAR", "SUSPECT", "HOSTILE"],
  episode: ["QUIET", "WATCH", "DECLARED", "CLEAR_PENDING"],
  defenseQualification: ["INAPPLICABLE", "BLOCKED_AVAILABILITY", "BLOCKED_CAPACITOR", "READY"],
  egressQualification: ["INAPPLICABLE", "ROUTE_UNKNOWN", "ROUTE_BLOCKED", "READY"],
  directive: ["RESET", "CONTAIN", "CANCEL_EGRESS", "START_EGRESS", "DEFEND", "HOLD_BLOCKED", "MONITOR"],
  egressSession: ["IDLE", "ORDERED", "MOVING", "BLOCKED", "ARRIVED"],
  threatReport: ["NO_REPORT", "WATCH_REPORT", "HOSTILE_ALERT", "EVIDENCE_FAULT", "CLEAR_PENDING_REPORT", "CLEAR_CONFIRMED_REPORT"],
  defenseCommand: ["STANDBY", "ACTIVATE"],
  egressCommand: ["NONE", "INITIATE", "CONTINUE", "HOLD", "CANCEL"],
  responseStatus: ["QUIET", "WATCHING", "THREAT_DECLARED", "DEFENDING", "EGRESS_ORDERED", "EGRESS_MOVING", "EGRESS_BLOCKED", "ARRIVAL_OBSERVED", "EVIDENCE_UNAVAILABLE", "CLEAR_PENDING"]
});

const semanticConnectionMap = Object.freeze({
  "INT-01": ["root.threatObservation", "threatEvidenceQualifier.threatObservation"],
  "INT-02": ["root.pilotDisposition", "threatEpisodeTracker.pilotDisposition"],
  "INT-03": ["root.defenseSupport", "defenseReadinessQualifier.defenseSupport"],
  "INT-04": ["root.egressRoute", "egressReadinessQualifier.egressRoute"],
  "INT-05": ["root.egressProgress", "responseStateController.egressProgress"],
  "INT-06": ["root.responseAuthorization", "threatResponseArbiter.responseAuthorization"],
  "INT-07": ["threatEvidenceQualifier.evidenceAssessment", "threatEpisodeTracker.evidenceAssessment"],
  "INT-08": ["threatEpisodeTracker.episodeSnapshot", "threatReportPolicy.episodeSnapshot"],
  "INT-09": ["threatEvidenceQualifier.evidenceAssessment", "defenseReadinessQualifier.evidenceAssessment"],
  "INT-10": ["defenseReadinessQualifier.defenseQualification", "threatResponseArbiter.defenseQualification"],
  "INT-11": ["threatEvidenceQualifier.evidenceAssessment", "egressReadinessQualifier.evidenceAssessment"],
  "INT-12": ["egressReadinessQualifier.egressQualification", "threatResponseArbiter.egressQualification"],
  "INT-13": ["threatEpisodeTracker.episodeSnapshot", "threatResponseArbiter.episodeSnapshot"],
  "INT-14": ["threatResponseArbiter.responseDirective", "responseStateController.responseDirective"],
  "INT-15": ["responseStateController.responseSnapshot", "responseStatusAssessor.responseSnapshot"],
  "INT-16": ["threatEpisodeTracker.episodeSnapshot", "responseStatusAssessor.episodeSnapshot"],
  "INT-17": ["threatReportPolicy.threatReport", "root.threatReport"],
  "INT-18": ["responseStateController.defenseCommand", "root.defenseCommand"],
  "INT-19": ["responseStateController.egressCommand", "root.egressCommand"],
  "INT-20": ["responseStatusAssessor.responseStatus", "root.responseStatus"]
});

function same(a, b) {
  return JSON.stringify(a) === JSON.stringify(b);
}

function bump(record, key) {
  record[key] = (record[key] || 0) + 1;
}

function deliver(ports, id, value) {
  const target = semanticConnectionMap[id][1];
  if (Object.prototype.hasOwnProperty.call(ports, target)) {
    throw new Error("duplicate delivery to " + target);
  }
  ports[target] = value;
}

function modelEvidence(observation) {
  const guards = [
    observation.validity === "INVALID",
    observation.validity === "VALID" && observation.evidenceBand === "CLEAR",
    observation.validity === "VALID" && (observation.evidenceBand === "SUSPICIOUS" || observation.evidenceBand === "HOSTILE")
  ];
  if (guards[0]) return { value: "UNAVAILABLE", caseId: "CASE-01", guards };
  if (guards[1]) return { value: "CLEAR", caseId: "CASE-02", guards };
  return { value: observation.evidenceBand === "SUSPICIOUS" ? "SUSPECT" : "HOSTILE", caseId: "CASE-03", guards };
}

function referenceEvidence(observation) {
  if (observation.validity !== "VALID") return "UNAVAILABLE";
  if (observation.evidenceBand === "CLEAR") return "CLEAR";
  if (observation.evidenceBand === "SUSPICIOUS") return "SUSPECT";
  return "HOSTILE";
}

function modelEpisode(pre, assessment, disposition) {
  const guards = [
    assessment === "UNAVAILABLE",
    assessment === "HOSTILE" || assessment === "SUSPECT",
    assessment === "CLEAR"
  ];
  let next;
  let caseId;
  if (guards[0]) {
    caseId = "CASE-04";
    next = pre === "QUIET" || pre === "WATCH" ? "WATCH" : "DECLARED";
  } else if (guards[1]) {
    caseId = "CASE-05";
    next = assessment === "HOSTILE" ? "DECLARED" : (pre === "QUIET" || pre === "WATCH" ? "WATCH" : "DECLARED");
  } else {
    caseId = "CASE-06";
    if (pre === "QUIET" || pre === "WATCH") next = "QUIET";
    else if (pre === "DECLARED") next = "CLEAR_PENDING";
    else next = disposition === "CONFIRM_CLEAR" ? "QUIET" : "CLEAR_PENDING";
  }
  return {
    value: next,
    snapshot: { preEpisode: pre, nextEpisode: next, assessment, pilotDisposition: disposition },
    caseId,
    guards
  };
}

function referenceEpisode(pre, assessment, disposition) {
  if (assessment === "HOSTILE") return "DECLARED";
  if (assessment === "UNAVAILABLE") return pre === "QUIET" || pre === "WATCH" ? "WATCH" : "DECLARED";
  if (assessment === "SUSPECT") return pre === "QUIET" || pre === "WATCH" ? "WATCH" : "DECLARED";
  if (pre === "QUIET" || pre === "WATCH") return "QUIET";
  if (pre === "DECLARED") return "CLEAR_PENDING";
  return disposition === "CONFIRM_CLEAR" ? "QUIET" : "CLEAR_PENDING";
}

function reportGuards(snapshot) {
  const unavailable = snapshot.assessment === "UNAVAILABLE";
  const hostileAlert = snapshot.assessment === "HOSTILE" && snapshot.pilotDisposition !== "ACKNOWLEDGE_ALERT";
  const hostileAcknowledged = snapshot.assessment === "HOSTILE" && snapshot.pilotDisposition === "ACKNOWLEDGE_ALERT";
  const confirmed = snapshot.assessment !== "UNAVAILABLE" && snapshot.assessment !== "HOSTILE" &&
    snapshot.preEpisode === "CLEAR_PENDING" && snapshot.nextEpisode === "QUIET";
  const pending = snapshot.assessment !== "UNAVAILABLE" && snapshot.assessment !== "HOSTILE" &&
    !(snapshot.preEpisode === "CLEAR_PENDING" && snapshot.nextEpisode === "QUIET") &&
    snapshot.nextEpisode === "CLEAR_PENDING";
  const suspect = snapshot.assessment === "SUSPECT" &&
    !(snapshot.preEpisode === "CLEAR_PENDING" && snapshot.nextEpisode === "QUIET") &&
    snapshot.nextEpisode !== "CLEAR_PENDING";
  const clearFallthrough = snapshot.assessment === "CLEAR" &&
    !(snapshot.preEpisode === "CLEAR_PENDING" && snapshot.nextEpisode === "QUIET") &&
    snapshot.nextEpisode !== "CLEAR_PENDING";
  return [unavailable, hostileAlert, hostileAcknowledged, confirmed, pending, suspect, clearFallthrough];
}

function modelReport(snapshot) {
  const guards = reportGuards(snapshot);
  const branchNames = ["EVIDENCE_FAULT", "HOSTILE_ALERT", "HOSTILE_ACKNOWLEDGED", "CLEAR_CONFIRMED", "CLEAR_PENDING", "WATCH", "NO_REPORT"];
  const outputs = ["EVIDENCE_FAULT", "HOSTILE_ALERT", "NO_REPORT", "CLEAR_CONFIRMED_REPORT", "CLEAR_PENDING_REPORT", "WATCH_REPORT", "NO_REPORT"];
  const index = guards.findIndex(Boolean);
  return { value: outputs[index], caseId: "CASE-15", branch: branchNames[index], guards };
}

function referenceReport(snapshot) {
  if (snapshot.assessment === "UNAVAILABLE") return "EVIDENCE_FAULT";
  if (snapshot.assessment === "HOSTILE") return snapshot.pilotDisposition === "ACKNOWLEDGE_ALERT" ? "NO_REPORT" : "HOSTILE_ALERT";
  if (snapshot.preEpisode === "CLEAR_PENDING" && snapshot.nextEpisode === "QUIET") return "CLEAR_CONFIRMED_REPORT";
  if (snapshot.nextEpisode === "CLEAR_PENDING") return "CLEAR_PENDING_REPORT";
  if (snapshot.assessment === "SUSPECT") return "WATCH_REPORT";
  return "NO_REPORT";
}

function modelDefense(assessment, support) {
  const guards = [
    assessment !== "HOSTILE",
    assessment === "HOSTILE" && support.defenseAvailability === "UNAVAILABLE",
    assessment === "HOSTILE" && support.defenseAvailability === "AVAILABLE" && support.capacitorSupport === "INSUFFICIENT",
    assessment === "HOSTILE" && support.defenseAvailability === "AVAILABLE" && support.capacitorSupport === "SUFFICIENT"
  ];
  if (guards[0]) return { value: "INAPPLICABLE", caseId: "CASE-07", guards };
  if (guards[1]) return { value: "BLOCKED_AVAILABILITY", caseId: "CASE-08", guards };
  if (guards[2]) return { value: "BLOCKED_CAPACITOR", caseId: "CASE-09", guards };
  return { value: "READY", caseId: "CASE-10", guards };
}

function referenceDefense(assessment, support) {
  if (assessment !== "HOSTILE") return "INAPPLICABLE";
  if (support.defenseAvailability !== "AVAILABLE") return "BLOCKED_AVAILABILITY";
  return support.capacitorSupport === "SUFFICIENT" ? "READY" : "BLOCKED_CAPACITOR";
}

function modelEgress(assessment, route) {
  const guards = [
    assessment !== "HOSTILE",
    assessment === "HOSTILE" && route === "UNKNOWN",
    assessment === "HOSTILE" && route === "BLOCKED",
    assessment === "HOSTILE" && route === "AVAILABLE"
  ];
  if (guards[0]) return { value: "INAPPLICABLE", caseId: "CASE-11", guards };
  if (guards[1]) return { value: "ROUTE_UNKNOWN", caseId: "CASE-12", guards };
  if (guards[2]) return { value: "ROUTE_BLOCKED", caseId: "CASE-13", guards };
  return { value: "READY", caseId: "CASE-14", guards };
}

function referenceEgress(assessment, route) {
  if (assessment !== "HOSTILE") return "INAPPLICABLE";
  if (route === "UNKNOWN") return "ROUTE_UNKNOWN";
  if (route === "BLOCKED") return "ROUTE_BLOCKED";
  return "READY";
}

function modelArbiter(snapshot, defense, egress, authorization) {
  const guards = [
    snapshot.nextEpisode === "QUIET" || snapshot.assessment === "UNAVAILABLE" || authorization === "CANCEL_EGRESS",
    snapshot.nextEpisode !== "QUIET" && snapshot.assessment !== "UNAVAILABLE" && authorization === "EGRESS_REQUEST",
    snapshot.nextEpisode !== "QUIET" && snapshot.assessment !== "UNAVAILABLE" && authorization === "NO_REQUEST"
  ];
  let value;
  let caseId;
  let branch;
  if (guards[0]) {
    caseId = "CASE-16";
    if (snapshot.nextEpisode === "QUIET") {
      value = "RESET";
      branch = "RESET";
    } else if (snapshot.assessment === "UNAVAILABLE") {
      value = "CONTAIN";
      branch = "CONTAIN";
    } else {
      value = "CANCEL_EGRESS";
      branch = "CANCEL_EGRESS";
    }
  } else if (guards[1]) {
    caseId = "CASE-17";
    if (egress === "READY") {
      value = "START_EGRESS";
      branch = "START_EGRESS";
    } else if (defense === "READY") {
      value = "DEFEND";
      branch = "REQUEST_DEFEND";
    } else {
      value = "HOLD_BLOCKED";
      branch = "HOLD_BLOCKED";
    }
  } else {
    caseId = "CASE-18";
    value = defense === "READY" ? "DEFEND" : "MONITOR";
    branch = value;
  }
  return { value, caseId, branch, guards };
}

function referenceArbiter(snapshot, defense, egress, authorization) {
  if (snapshot.nextEpisode === "QUIET") return "RESET";
  if (snapshot.assessment === "UNAVAILABLE") return "CONTAIN";
  if (authorization === "CANCEL_EGRESS") return "CANCEL_EGRESS";
  if (authorization === "EGRESS_REQUEST" && egress === "READY") return "START_EGRESS";
  if (defense === "READY") return "DEFEND";
  if (authorization === "EGRESS_REQUEST") return "HOLD_BLOCKED";
  return "MONITOR";
}

function modelController(pre, directive, progress) {
  const active = pre === "ORDERED" || pre === "MOVING";
  let next;
  let defenseCommand;
  let egressCommand;
  let branch;
  if (directive === "RESET") {
    [next, egressCommand, defenseCommand, branch] = ["IDLE", "NONE", "STANDBY", "RESET"];
  } else if (active && progress === "SAFE_DESTINATION_OBSERVED") {
    [next, egressCommand, defenseCommand, branch] = ["ARRIVED", "HOLD", "STANDBY", "ARRIVAL"];
  } else if (directive === "CANCEL_EGRESS") {
    [next, egressCommand, defenseCommand, branch] = ["IDLE", "CANCEL", "STANDBY", "CANCEL"];
  } else if (active && progress === "FAILED") {
    [next, egressCommand, defenseCommand, branch] = ["BLOCKED", "HOLD", directive === "DEFEND" ? "ACTIVATE" : "STANDBY", "FAILURE"];
  } else if (pre === "ORDERED" && progress === "NOT_STARTED") {
    [next, egressCommand, defenseCommand, branch] = ["ORDERED", "INITIATE", "STANDBY", "ORDERED_NOT_STARTED"];
  } else if (pre === "ORDERED" && progress === "EN_ROUTE") {
    [next, egressCommand, defenseCommand, branch] = ["MOVING", "CONTINUE", "STANDBY", "ORDERED_EN_ROUTE"];
  } else if (pre === "MOVING") {
    [next, egressCommand, defenseCommand, branch] = ["MOVING", "CONTINUE", "STANDBY", "MOVING_CONTINUE"];
  } else if (pre === "BLOCKED" && directive === "START_EGRESS") {
    [next, egressCommand, defenseCommand, branch] = ["ORDERED", "INITIATE", "STANDBY", "BLOCKED_RETRY"];
  } else if (pre === "BLOCKED") {
    [next, egressCommand, defenseCommand, branch] = ["BLOCKED", "HOLD", directive === "DEFEND" ? "ACTIVATE" : "STANDBY", "BLOCKED_HOLD"];
  } else if (pre === "ARRIVED") {
    [next, egressCommand, defenseCommand, branch] = ["ARRIVED", "HOLD", "STANDBY", "ARRIVED_HOLD"];
  } else if (directive === "START_EGRESS") {
    [next, egressCommand, defenseCommand, branch] = ["ORDERED", "INITIATE", "STANDBY", "IDLE_START"];
  } else if (directive === "DEFEND") {
    [next, egressCommand, defenseCommand, branch] = ["IDLE", "NONE", "ACTIVATE", "IDLE_DEFEND"];
  } else {
    [next, egressCommand, defenseCommand, branch] = ["IDLE", "NONE", "STANDBY", "IDLE_HOLD"];
  }
  return {
    value: next,
    defenseCommand,
    egressCommand,
    snapshot: { preEgress: pre, nextEgress: next, directive, defenseCommand, egressCommand },
    caseId: "CASE-19",
    branch,
    guards: [true]
  };
}

function referenceController(pre, directive, progress) {
  const active = pre === "ORDERED" || pre === "MOVING";
  if (directive === "RESET") return { next: "IDLE", defenseCommand: "STANDBY", egressCommand: "NONE" };
  if (active && progress === "SAFE_DESTINATION_OBSERVED") return { next: "ARRIVED", defenseCommand: "STANDBY", egressCommand: "HOLD" };
  if (directive === "CANCEL_EGRESS") return { next: "IDLE", defenseCommand: "STANDBY", egressCommand: "CANCEL" };
  if (active && progress === "FAILED") return { next: "BLOCKED", defenseCommand: directive === "DEFEND" ? "ACTIVATE" : "STANDBY", egressCommand: "HOLD" };
  if (pre === "ORDERED" && progress === "NOT_STARTED") return { next: "ORDERED", defenseCommand: "STANDBY", egressCommand: "INITIATE" };
  if (pre === "ORDERED" && progress === "EN_ROUTE") return { next: "MOVING", defenseCommand: "STANDBY", egressCommand: "CONTINUE" };
  if (pre === "MOVING") return { next: "MOVING", defenseCommand: "STANDBY", egressCommand: "CONTINUE" };
  if (pre === "BLOCKED" && directive === "START_EGRESS") return { next: "ORDERED", defenseCommand: "STANDBY", egressCommand: "INITIATE" };
  if (pre === "BLOCKED") return { next: "BLOCKED", defenseCommand: directive === "DEFEND" ? "ACTIVATE" : "STANDBY", egressCommand: "HOLD" };
  if (pre === "ARRIVED") return { next: "ARRIVED", defenseCommand: "STANDBY", egressCommand: "HOLD" };
  if (directive === "START_EGRESS") return { next: "ORDERED", defenseCommand: "STANDBY", egressCommand: "INITIATE" };
  if (directive === "DEFEND") return { next: "IDLE", defenseCommand: "ACTIVATE", egressCommand: "NONE" };
  return { next: "IDLE", defenseCommand: "STANDBY", egressCommand: "NONE" };
}

function statusGuards(episode, response) {
  return [
    episode.assessment === "UNAVAILABLE",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "ARRIVED",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "MOVING",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "ORDERED",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "BLOCKED",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "IDLE" && response.defenseCommand === "ACTIVATE",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "IDLE" && response.defenseCommand !== "ACTIVATE" && episode.nextEpisode === "CLEAR_PENDING",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "IDLE" && response.defenseCommand !== "ACTIVATE" && episode.nextEpisode === "WATCH",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "IDLE" && response.defenseCommand !== "ACTIVATE" && episode.nextEpisode === "QUIET",
    episode.assessment !== "UNAVAILABLE" && response.nextEgress === "IDLE" && response.defenseCommand !== "ACTIVATE" && episode.nextEpisode === "DECLARED"
  ];
}

function modelStatus(episode, response) {
  const guards = statusGuards(episode, response);
  const values = ["EVIDENCE_UNAVAILABLE", "ARRIVAL_OBSERVED", "EGRESS_MOVING", "EGRESS_ORDERED", "EGRESS_BLOCKED", "DEFENDING", "CLEAR_PENDING", "WATCHING", "QUIET", "THREAT_DECLARED"];
  const index = guards.findIndex(Boolean);
  return { value: values[index], caseId: "CASE-20", branch: values[index], guards };
}

function referenceStatus(episode, response) {
  if (episode.assessment === "UNAVAILABLE") return "EVIDENCE_UNAVAILABLE";
  if (response.nextEgress === "ARRIVED") return "ARRIVAL_OBSERVED";
  if (response.nextEgress === "MOVING") return "EGRESS_MOVING";
  if (response.nextEgress === "ORDERED") return "EGRESS_ORDERED";
  if (response.nextEgress === "BLOCKED") return "EGRESS_BLOCKED";
  if (response.defenseCommand === "ACTIVATE") return "DEFENDING";
  if (episode.nextEpisode === "CLEAR_PENDING") return "CLEAR_PENDING";
  if (episode.nextEpisode === "WATCH") return "WATCHING";
  if (episode.nextEpisode === "QUIET") return "QUIET";
  return "THREAT_DECLARED";
}

function compose(root, preEpisode, preEgress) {
  const ports = {};
  deliver(ports, "INT-01", root.threatObservation);
  deliver(ports, "INT-02", root.pilotDisposition);
  deliver(ports, "INT-03", root.defenseSupport);
  deliver(ports, "INT-04", root.egressRoute);
  deliver(ports, "INT-05", root.egressProgress);
  deliver(ports, "INT-06", root.responseAuthorization);

  const evidence = modelEvidence(ports["threatEvidenceQualifier.threatObservation"]);
  deliver(ports, "INT-07", evidence.value);
  deliver(ports, "INT-09", evidence.value);
  deliver(ports, "INT-11", evidence.value);

  const episode = modelEpisode(preEpisode, ports["threatEpisodeTracker.evidenceAssessment"], ports["threatEpisodeTracker.pilotDisposition"]);
  deliver(ports, "INT-08", episode.snapshot);
  deliver(ports, "INT-13", episode.snapshot);
  deliver(ports, "INT-16", episode.snapshot);

  const report = modelReport(ports["threatReportPolicy.episodeSnapshot"]);
  deliver(ports, "INT-17", report.value);
  const defense = modelDefense(ports["defenseReadinessQualifier.evidenceAssessment"], ports["defenseReadinessQualifier.defenseSupport"]);
  deliver(ports, "INT-10", defense.value);
  const egress = modelEgress(ports["egressReadinessQualifier.evidenceAssessment"], ports["egressReadinessQualifier.egressRoute"]);
  deliver(ports, "INT-12", egress.value);

  const arbiter = modelArbiter(
    ports["threatResponseArbiter.episodeSnapshot"],
    ports["threatResponseArbiter.defenseQualification"],
    ports["threatResponseArbiter.egressQualification"],
    ports["threatResponseArbiter.responseAuthorization"]
  );
  deliver(ports, "INT-14", arbiter.value);
  const controller = modelController(preEgress, ports["responseStateController.responseDirective"], ports["responseStateController.egressProgress"]);
  deliver(ports, "INT-15", controller.snapshot);
  deliver(ports, "INT-18", controller.defenseCommand);
  deliver(ports, "INT-19", controller.egressCommand);
  const status = modelStatus(ports["responseStatusAssessor.episodeSnapshot"], ports["responseStatusAssessor.responseSnapshot"]);
  deliver(ports, "INT-20", status.value);

  return {
    evidence,
    episode,
    report,
    defense,
    egress,
    arbiter,
    controller,
    status,
    outputs: {
      threatReport: ports["root.threatReport"],
      defenseCommand: ports["root.defenseCommand"],
      egressCommand: ports["root.egressCommand"],
      responseStatus: ports["root.responseStatus"]
    }
  };
}

function oneGuard(result) {
  return result.guards.filter(Boolean).length === 1;
}

const local = {
  evidence: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {} },
  episode: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {} },
  defense: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {} },
  egress: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {} },
  report: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {}, branch_counts: {} },
  arbiter: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {}, branch_counts: {} },
  controller: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {}, branch_counts: {} },
  status: { combinations: 0, gaps: 0, overlaps: 0, mismatches: 0, case_counts: {}, branch_counts: {} }
};

const producerEpisodeSnapshots = new Map();
const producerResponseSnapshots = new Map();

for (const evidenceBand of D.evidenceBand) for (const validity of D.validity) {
  const observation = { evidenceBand, validity };
  const result = modelEvidence(observation);
  local.evidence.combinations++;
  if (result.guards.filter(Boolean).length === 0) local.evidence.gaps++;
  if (result.guards.filter(Boolean).length > 1) local.evidence.overlaps++;
  if (result.value !== referenceEvidence(observation)) local.evidence.mismatches++;
  bump(local.evidence.case_counts, result.caseId);
}

for (const pre of D.episode) for (const assessment of D.evidenceAssessment) for (const disposition of D.pilotDisposition) {
  const result = modelEpisode(pre, assessment, disposition);
  local.episode.combinations++;
  if (result.guards.filter(Boolean).length === 0) local.episode.gaps++;
  if (result.guards.filter(Boolean).length > 1) local.episode.overlaps++;
  if (result.value !== referenceEpisode(pre, assessment, disposition)) local.episode.mismatches++;
  bump(local.episode.case_counts, result.caseId);
  producerEpisodeSnapshots.set(JSON.stringify(result.snapshot), result.snapshot);
}

for (const assessment of D.evidenceAssessment) for (const defenseAvailability of D.defenseAvailability) for (const capacitorSupport of D.capacitorSupport) {
  const support = { defenseAvailability, capacitorSupport };
  const result = modelDefense(assessment, support);
  local.defense.combinations++;
  if (result.guards.filter(Boolean).length === 0) local.defense.gaps++;
  if (result.guards.filter(Boolean).length > 1) local.defense.overlaps++;
  if (result.value !== referenceDefense(assessment, support)) local.defense.mismatches++;
  bump(local.defense.case_counts, result.caseId);
}

for (const assessment of D.evidenceAssessment) for (const route of D.egressRoute) {
  const result = modelEgress(assessment, route);
  local.egress.combinations++;
  if (result.guards.filter(Boolean).length === 0) local.egress.gaps++;
  if (result.guards.filter(Boolean).length > 1) local.egress.overlaps++;
  if (result.value !== referenceEgress(assessment, route)) local.egress.mismatches++;
  bump(local.egress.case_counts, result.caseId);
}

for (const preEpisode of D.episode) for (const nextEpisode of D.episode) for (const assessment of D.evidenceAssessment) for (const pilotDisposition of D.pilotDisposition) {
  const snapshot = { preEpisode, nextEpisode, assessment, pilotDisposition };
  const result = modelReport(snapshot);
  local.report.combinations++;
  if (result.guards.filter(Boolean).length === 0) local.report.gaps++;
  if (result.guards.filter(Boolean).length > 1) local.report.overlaps++;
  if (result.value !== referenceReport(snapshot)) local.report.mismatches++;
  bump(local.report.case_counts, result.caseId);
  bump(local.report.branch_counts, result.branch);
}

for (const preEpisode of D.episode) for (const nextEpisode of D.episode) for (const assessment of D.evidenceAssessment) for (const pilotDisposition of D.pilotDisposition)
  for (const defense of D.defenseQualification) for (const egress of D.egressQualification) for (const authorization of D.responseAuthorization) {
    const snapshot = { preEpisode, nextEpisode, assessment, pilotDisposition };
    const result = modelArbiter(snapshot, defense, egress, authorization);
    local.arbiter.combinations++;
    if (result.guards.filter(Boolean).length === 0) local.arbiter.gaps++;
    if (result.guards.filter(Boolean).length > 1) local.arbiter.overlaps++;
    if (result.value !== referenceArbiter(snapshot, defense, egress, authorization)) local.arbiter.mismatches++;
    bump(local.arbiter.case_counts, result.caseId);
    bump(local.arbiter.branch_counts, result.branch);
  }

for (const pre of D.egressSession) for (const directive of D.directive) for (const progress of D.egressProgress) {
  const result = modelController(pre, directive, progress);
  const reference = referenceController(pre, directive, progress);
  local.controller.combinations++;
  if (!oneGuard(result)) local.controller.gaps++;
  if (!same({ next: result.value, defenseCommand: result.defenseCommand, egressCommand: result.egressCommand }, reference)) local.controller.mismatches++;
  bump(local.controller.case_counts, result.caseId);
  bump(local.controller.branch_counts, result.branch);
  producerResponseSnapshots.set(JSON.stringify(result.snapshot), result.snapshot);
}

for (const preEpisode of D.episode) for (const nextEpisode of D.episode) for (const assessment of D.evidenceAssessment) for (const pilotDisposition of D.pilotDisposition)
  for (const preEgress of D.egressSession) for (const nextEgress of D.egressSession) for (const directive of D.directive)
    for (const defenseCommand of D.defenseCommand) for (const egressCommand of D.egressCommand) {
      const episode = { preEpisode, nextEpisode, assessment, pilotDisposition };
      const response = { preEgress, nextEgress, directive, defenseCommand, egressCommand };
      const result = modelStatus(episode, response);
      local.status.combinations++;
      if (result.guards.filter(Boolean).length === 0) local.status.gaps++;
      if (result.guards.filter(Boolean).length > 1) local.status.overlaps++;
      if (result.value !== referenceStatus(episode, response)) local.status.mismatches++;
      bump(local.status.case_counts, result.caseId);
      bump(local.status.branch_counts, result.branch);
    }

const endToEnd = {
  combinations: 0,
  local_fact_mismatches: 0,
  required_output_mismatches: 0,
  snapshot_preservation_mismatches: 0,
  invalid_clear_violations: 0,
  egress_defense_conflict_violations: 0,
  blocked_retry_violations: 0,
  cancellation_arrival_violations: 0
};

for (const evidenceBand of D.evidenceBand) for (const validity of D.validity)
  for (const pilotDisposition of D.pilotDisposition)
    for (const defenseAvailability of D.defenseAvailability) for (const capacitorSupport of D.capacitorSupport)
      for (const egressRoute of D.egressRoute) for (const egressProgress of D.egressProgress)
        for (const responseAuthorization of D.responseAuthorization)
          for (const preEpisode of D.episode) for (const preEgress of D.egressSession) {
            const root = {
              threatObservation: { evidenceBand, validity },
              pilotDisposition,
              defenseSupport: { defenseAvailability, capacitorSupport },
              egressRoute,
              egressProgress,
              responseAuthorization
            };
            const result = compose(root, preEpisode, preEgress);
            endToEnd.combinations++;
            const referenceAssessment = referenceEvidence(root.threatObservation);
            const referenceNextEpisode = referenceEpisode(preEpisode, referenceAssessment, pilotDisposition);
            const referenceEpisodeSnapshot = { preEpisode, nextEpisode: referenceNextEpisode, assessment: referenceAssessment, pilotDisposition };
            const referenceDefenseFact = referenceDefense(referenceAssessment, root.defenseSupport);
            const referenceEgressFact = referenceEgress(referenceAssessment, egressRoute);
            const referenceDirective = referenceArbiter(referenceEpisodeSnapshot, referenceDefenseFact, referenceEgressFact, responseAuthorization);
            const referenceControl = referenceController(preEgress, referenceDirective, egressProgress);
            const referenceResponseSnapshot = {
              preEgress,
              nextEgress: referenceControl.next,
              directive: referenceDirective,
              defenseCommand: referenceControl.defenseCommand,
              egressCommand: referenceControl.egressCommand
            };
            const requiredOutputs = {
              threatReport: referenceReport(referenceEpisodeSnapshot),
              defenseCommand: referenceControl.defenseCommand,
              egressCommand: referenceControl.egressCommand,
              responseStatus: referenceStatus(referenceEpisodeSnapshot, referenceResponseSnapshot)
            };
            if (result.evidence.value !== referenceAssessment ||
                result.episode.value !== referenceNextEpisode ||
                result.defense.value !== referenceDefenseFact ||
                result.egress.value !== referenceEgressFact ||
                result.arbiter.value !== referenceDirective ||
                result.controller.value !== referenceControl.next) {
              endToEnd.local_fact_mismatches++;
            }
            if (!same(result.outputs, requiredOutputs)) endToEnd.required_output_mismatches++;
            if (!same(result.episode.snapshot, referenceEpisodeSnapshot) || !same(result.controller.snapshot, referenceResponseSnapshot)) {
              endToEnd.snapshot_preservation_mismatches++;
            }
            if (validity === "INVALID" && (preEpisode === "DECLARED" || preEpisode === "CLEAR_PENDING") && result.episode.value !== "DECLARED") {
              endToEnd.invalid_clear_violations++;
            }
            if (referenceAssessment === "HOSTILE" && responseAuthorization === "EGRESS_REQUEST" &&
                referenceEgressFact === "READY" && referenceDefenseFact === "READY" &&
                (result.arbiter.value !== "START_EGRESS" || result.controller.defenseCommand !== "STANDBY")) {
              endToEnd.egress_defense_conflict_violations++;
            }
            if (preEgress === "BLOCKED" && responseAuthorization !== "EGRESS_REQUEST" && result.controller.value !== "BLOCKED" &&
                result.arbiter.value !== "RESET" && result.arbiter.value !== "CANCEL_EGRESS") {
              endToEnd.blocked_retry_violations++;
            }
            if ((preEgress === "ORDERED" || preEgress === "MOVING") && result.arbiter.value === "CANCEL_EGRESS" &&
                egressProgress === "SAFE_DESTINATION_OBSERVED" && result.controller.value !== "ARRIVED") {
              endToEnd.cancellation_arrival_violations++;
            }
          }

function rootInput(overrides = {}) {
  return {
    threatObservation: { evidenceBand: "CLEAR", validity: "VALID" },
    pilotDisposition: "NO_RESPONSE",
    defenseSupport: { defenseAvailability: "UNAVAILABLE", capacitorSupport: "INSUFFICIENT" },
    egressRoute: "UNKNOWN",
    egressProgress: "NOT_STARTED",
    responseAuthorization: "NO_REQUEST",
    ...overrides
  };
}

function traceStep(step, input, preEpisode, preEgress, expected) {
  const result = compose(input, preEpisode, preEgress);
  return {
    step,
    input,
    pre_state: { threatEpisode: preEpisode, egressSession: preEgress },
    expected_branch_cases: expected,
    observed: {
      evidenceAssessment: result.evidence.value,
      nextThreatEpisode: result.episode.value,
      defenseQualification: result.defense.value,
      egressQualification: result.egress.value,
      responseDirective: result.arbiter.value,
      nextEgressSession: result.controller.value,
      threatReport: result.outputs.threatReport,
      defenseCommand: result.outputs.defenseCommand,
      egressCommand: result.outputs.egressCommand,
      responseStatus: result.outputs.responseStatus
    }
  };
}

const scenarios = [
  {
    id: "SCN-01",
    name: "suspicious-evidence-watch",
    traces: [traceStep(1, rootInput({ threatObservation: { evidenceBand: "SUSPICIOUS", validity: "VALID" } }), "QUIET", "IDLE", ["CASE-03", "CASE-05", "CASE-15", "CASE-18", "CASE-19", "CASE-20"])]
  },
  {
    id: "SCN-02",
    name: "hostile-defense",
    traces: [traceStep(1, rootInput({
      threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" },
      defenseSupport: { defenseAvailability: "AVAILABLE", capacitorSupport: "SUFFICIENT" },
      egressRoute: "BLOCKED"
    }), "QUIET", "IDLE", ["CASE-03", "CASE-05", "CASE-10", "CASE-13", "CASE-18", "CASE-19", "CASE-20"])]
  },
  {
    id: "SCN-03",
    name: "egress-over-defense-conflict",
    traces: [traceStep(1, rootInput({
      threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" },
      defenseSupport: { defenseAvailability: "AVAILABLE", capacitorSupport: "SUFFICIENT" },
      egressRoute: "AVAILABLE",
      responseAuthorization: "EGRESS_REQUEST"
    }), "QUIET", "IDLE", ["CASE-10", "CASE-14", "CASE-17:START_EGRESS", "CASE-19:IDLE_START", "CASE-20:EGRESS_ORDERED"])]
  },
  {
    id: "SCN-04",
    name: "egress-continuation-and-arrival",
    traces: [
      traceStep(1, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "AVAILABLE", egressProgress: "EN_ROUTE" }), "DECLARED", "ORDERED", ["CASE-19:ORDERED_EN_ROUTE", "CASE-20:EGRESS_MOVING"]),
      traceStep(2, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "AVAILABLE", egressProgress: "SAFE_DESTINATION_OBSERVED" }), "DECLARED", "MOVING", ["CASE-19:ARRIVAL", "CASE-20:ARRIVAL_OBSERVED"])
    ]
  },
  {
    id: "SCN-05",
    name: "route-block-and-fresh-retry",
    traces: [
      traceStep(1, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "BLOCKED", responseAuthorization: "EGRESS_REQUEST" }), "DECLARED", "IDLE", ["CASE-13", "CASE-17:HOLD_BLOCKED"]),
      traceStep(2, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "AVAILABLE", responseAuthorization: "EGRESS_REQUEST" }), "DECLARED", "IDLE", ["CASE-14", "CASE-17:START_EGRESS", "CASE-19:IDLE_START"]),
      traceStep(3, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "BLOCKED", egressProgress: "FAILED", responseAuthorization: "EGRESS_REQUEST" }), "DECLARED", "ORDERED", ["CASE-17:HOLD_BLOCKED", "CASE-19:FAILURE"]),
      traceStep(4, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "AVAILABLE" }), "DECLARED", "BLOCKED", ["CASE-18:MONITOR", "CASE-19:BLOCKED_HOLD"]),
      traceStep(5, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressRoute: "AVAILABLE", responseAuthorization: "EGRESS_REQUEST" }), "DECLARED", "BLOCKED", ["CASE-17:START_EGRESS", "CASE-19:BLOCKED_RETRY"])
    ]
  },
  {
    id: "SCN-06",
    name: "invalid-evidence-containment",
    traces: [
      traceStep(1, rootInput({ threatObservation: { evidenceBand: "CLEAR", validity: "INVALID" } }), "QUIET", "IDLE", ["CASE-01", "CASE-04", "CASE-15:EVIDENCE_FAULT", "CASE-16:CONTAIN"]),
      traceStep(2, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" } }), "WATCH", "IDLE", ["CASE-03", "CASE-05:HOSTILE", "CASE-15:HOSTILE_ALERT"]),
      traceStep(3, rootInput({ threatObservation: { evidenceBand: "CLEAR", validity: "INVALID" }, responseAuthorization: "CANCEL_EGRESS" }), "DECLARED", "IDLE", ["CASE-04", "CASE-16:CONTAIN", "CASE-20:EVIDENCE_UNAVAILABLE"])
    ]
  },
  {
    id: "SCN-07",
    name: "threat-clear-recovery",
    traces: [
      traceStep(1, rootInput(), "DECLARED", "IDLE", ["CASE-06:CLEAR_PENDING", "CASE-15:CLEAR_PENDING"]),
      traceStep(2, rootInput(), "CLEAR_PENDING", "IDLE", ["CASE-06:CLEAR_PENDING", "CASE-15:CLEAR_PENDING"]),
      traceStep(3, rootInput({ pilotDisposition: "CONFIRM_CLEAR" }), "CLEAR_PENDING", "IDLE", ["CASE-06:CONFIRM_CLEAR", "CASE-15:CLEAR_CONFIRMED", "CASE-16:RESET"])
    ]
  },
  {
    id: "SCN-08",
    name: "cancellation-versus-arrival-priority",
    traces: [
      traceStep(1, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressProgress: "EN_ROUTE", responseAuthorization: "CANCEL_EGRESS" }), "DECLARED", "ORDERED", ["CASE-16:CANCEL_EGRESS", "CASE-19:CANCEL"]),
      traceStep(2, rootInput({ threatObservation: { evidenceBand: "HOSTILE", validity: "VALID" }, egressProgress: "SAFE_DESTINATION_OBSERVED", responseAuthorization: "CANCEL_EGRESS" }), "DECLARED", "ORDERED", ["CASE-16:CANCEL_EGRESS", "CASE-19:ARRIVAL"])
    ]
  }
];

const scenarioChecks = {
  "SCN-01": scenarios[0].traces[0].observed.responseStatus === "WATCHING" && scenarios[0].traces[0].observed.threatReport === "WATCH_REPORT",
  "SCN-02": scenarios[1].traces[0].observed.defenseCommand === "ACTIVATE" && scenarios[1].traces[0].observed.responseStatus === "DEFENDING",
  "SCN-03": scenarios[2].traces[0].observed.responseDirective === "START_EGRESS" && scenarios[2].traces[0].observed.defenseCommand === "STANDBY",
  "SCN-04": scenarios[3].traces[0].observed.nextEgressSession === "MOVING" && scenarios[3].traces[1].observed.nextEgressSession === "ARRIVED" && scenarios[3].traces[1].observed.nextThreatEpisode === "DECLARED",
  "SCN-05": scenarios[4].traces[0].observed.responseDirective === "HOLD_BLOCKED" && scenarios[4].traces[2].observed.nextEgressSession === "BLOCKED" && scenarios[4].traces[3].observed.nextEgressSession === "BLOCKED" && scenarios[4].traces[4].observed.nextEgressSession === "ORDERED",
  "SCN-06": scenarios[5].traces[0].observed.nextThreatEpisode === "WATCH" && scenarios[5].traces[1].observed.nextThreatEpisode === "DECLARED" && scenarios[5].traces[2].observed.nextThreatEpisode === "DECLARED" && scenarios[5].traces[2].observed.responseDirective === "CONTAIN",
  "SCN-07": scenarios[6].traces[0].observed.nextThreatEpisode === "CLEAR_PENDING" && scenarios[6].traces[1].observed.nextThreatEpisode === "CLEAR_PENDING" && scenarios[6].traces[2].observed.nextThreatEpisode === "QUIET",
  "SCN-08": scenarios[7].traces[0].observed.nextEgressSession === "IDLE" && scenarios[7].traces[0].observed.egressCommand === "CANCEL" && scenarios[7].traces[1].observed.nextEgressSession === "ARRIVED"
};

const ownershipAudit = [
  {
    usage: "threatEvidenceQualifier",
    assigned_inputs: ["threatObservation.evidenceBand", "threatObservation.validity"],
    owner_local_facts: ["evidenceAssessment"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03"],
    analyzer_checks: ["evidence-owner-partition"],
    passed: local.evidence.combinations === 6 && local.evidence.gaps === 0 && local.evidence.overlaps === 0 && local.evidence.mismatches === 0
  },
  {
    usage: "threatEpisodeTracker",
    assigned_inputs: ["evidenceAssessment", "pilotDisposition", "committedEpisode"],
    owner_local_facts: ["nextThreatEpisode", "episodeSnapshot"],
    contract_cases: ["CASE-04", "CASE-05", "CASE-06"],
    analyzer_checks: ["episode-owner-partition", "invalid-evidence-retention", "clear-confirmation-recovery"],
    passed: local.episode.combinations === 48 && local.episode.gaps === 0 && local.episode.overlaps === 0 && local.episode.mismatches === 0
  },
  {
    usage: "threatReportPolicy",
    assigned_inputs: ["episodeSnapshot.assessment", "episodeSnapshot.preEpisode", "episodeSnapshot.nextEpisode", "episodeSnapshot.pilotDisposition"],
    owner_local_facts: ["threatReport"],
    contract_cases: ["CASE-15"],
    analyzer_checks: ["report-owner-totality", "report-precedence"],
    passed: local.report.combinations === 192 && local.report.gaps === 0 && local.report.overlaps === 0 && local.report.mismatches === 0
  },
  {
    usage: "defenseReadinessQualifier",
    assigned_inputs: ["evidenceAssessment", "defenseSupport.defenseAvailability", "defenseSupport.capacitorSupport"],
    owner_local_facts: ["defenseQualification"],
    contract_cases: ["CASE-07", "CASE-08", "CASE-09", "CASE-10"],
    analyzer_checks: ["defense-owner-partition"],
    passed: local.defense.combinations === 16 && local.defense.gaps === 0 && local.defense.overlaps === 0 && local.defense.mismatches === 0
  },
  {
    usage: "egressReadinessQualifier",
    assigned_inputs: ["evidenceAssessment", "egressRoute"],
    owner_local_facts: ["egressQualification"],
    contract_cases: ["CASE-11", "CASE-12", "CASE-13", "CASE-14"],
    analyzer_checks: ["egress-owner-partition"],
    passed: local.egress.combinations === 12 && local.egress.gaps === 0 && local.egress.overlaps === 0 && local.egress.mismatches === 0
  },
  {
    usage: "threatResponseArbiter",
    assigned_inputs: ["episodeSnapshot.nextEpisode", "episodeSnapshot.assessment", "defenseQualification", "egressQualification", "responseAuthorization"],
    owner_local_facts: ["responseDirective"],
    contract_cases: ["CASE-16", "CASE-17", "CASE-18"],
    analyzer_checks: ["arbiter-priority-partition", "egress-over-defense-conflict"],
    passed: local.arbiter.combinations === 9216 && local.arbiter.gaps === 0 && local.arbiter.overlaps === 0 && local.arbiter.mismatches === 0
  },
  {
    usage: "responseStateController",
    assigned_inputs: ["responseDirective", "egressProgress", "committedEgress"],
    owner_local_facts: ["nextEgressSession", "defenseCommand", "egressCommand", "responseSnapshot"],
    contract_cases: ["CASE-19"],
    analyzer_checks: ["controller-owner-totality", "fresh-retry-only", "arrival-over-cancellation"],
    passed: local.controller.combinations === 140 && local.controller.gaps === 0 && local.controller.overlaps === 0 && local.controller.mismatches === 0
  },
  {
    usage: "responseStatusAssessor",
    assigned_inputs: ["episodeSnapshot.assessment", "episodeSnapshot.nextEpisode", "responseSnapshot.nextEgress", "responseSnapshot.defenseCommand"],
    owner_local_facts: ["responseStatus"],
    contract_cases: ["CASE-20"],
    analyzer_checks: ["status-owner-totality", "status-precedence"],
    passed: local.status.combinations === 336000 && local.status.gaps === 0 && local.status.overlaps === 0 && local.status.mismatches === 0
  }
];

const checks = {
  "semantic-connection-map-exact": Object.keys(semanticConnectionMap).length === 20,
  "evidence-owner-partition": ownershipAudit[0].passed,
  "episode-owner-partition": ownershipAudit[1].passed,
  "clear-confirmation-recovery": scenarioChecks["SCN-07"],
  "report-owner-totality": ownershipAudit[2].passed,
  "report-precedence": ownershipAudit[2].passed,
  "defense-owner-partition": ownershipAudit[3].passed,
  "egress-owner-partition": ownershipAudit[4].passed,
  "arbiter-priority-partition": ownershipAudit[5].passed,
  "controller-owner-totality": ownershipAudit[6].passed,
  "status-owner-totality": ownershipAudit[7].passed,
  "status-precedence": ownershipAudit[7].passed,
  "root-domain-exhausted": endToEnd.combinations === 51840,
  "composed-local-facts-match-reference": endToEnd.local_fact_mismatches === 0,
  "required-outputs-match-reference": endToEnd.required_output_mismatches === 0,
  "snapshot-preservation": endToEnd.snapshot_preservation_mismatches === 0,
  "invalid-evidence-retention": endToEnd.invalid_clear_violations === 0,
  "egress-over-defense-conflict": endToEnd.egress_defense_conflict_violations === 0,
  "fresh-retry-only": endToEnd.blocked_retry_violations === 0,
  "arrival-over-cancellation": endToEnd.cancellation_arrival_violations === 0,
  "scenario-transition-linkage": [3, 4, 5, 6].every((scenarioIndex) =>
    scenarios[scenarioIndex].traces.slice(1).every((trace, index) =>
      scenarios[scenarioIndex].traces[index].observed.nextThreatEpisode === trace.pre_state.threatEpisode &&
      scenarios[scenarioIndex].traces[index].observed.nextEgressSession === trace.pre_state.egressSession)),
  "all-scenario-traces": Object.values(scenarioChecks).every(Boolean)
};

const passed = Object.values(checks).every(Boolean) && ownershipAudit.every((entry) => entry.passed);

const result = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive only over the approved finite one-evaluation domains and explicit scenario traces; no compositional proof, solver certification, generated-code correctness, execution, physical-performance, retreat-success, threat-defeat, or safety-certification claim is made.",
  semantic_connection_map: semanticConnectionMap,
  partition_counts: {
    evidence: local.evidence,
    episode: local.episode,
    defense: local.defense,
    egress: local.egress,
    report: local.report,
    arbiter: local.arbiter,
    controller: local.controller,
    status: local.status
  },
  reachability: {
    episode_snapshots: {
      structurally_valid: 192,
      producer_reachable: producerEpisodeSnapshots.size,
      structurally_valid_but_unreachable: 192 - producerEpisodeSnapshots.size
    },
    response_snapshots: {
      structurally_valid: 1750,
      producer_reachable: producerResponseSnapshots.size,
      structurally_valid_but_unreachable: 1750 - producerResponseSnapshots.size
    },
    status_snapshot_pairs: {
      structurally_valid: 336000,
      producer_reachable: producerEpisodeSnapshots.size * producerResponseSnapshots.size,
      structurally_valid_but_unreachable: 336000 - (producerEpisodeSnapshots.size * producerResponseSnapshots.size)
    }
  },
  observations: {
    root_combinations: endToEnd.combinations,
    local_partition_gaps: Object.values(local).reduce((sum, item) => sum + item.gaps, 0),
    local_partition_overlaps: Object.values(local).reduce((sum, item) => sum + item.overlaps, 0),
    local_relation_mismatches: Object.values(local).reduce((sum, item) => sum + item.mismatches, 0),
    composed_local_fact_mismatches: endToEnd.local_fact_mismatches,
    required_output_mismatches: endToEnd.required_output_mismatches,
    snapshot_preservation_mismatches: endToEnd.snapshot_preservation_mismatches,
    invariant_violations: endToEnd.invalid_clear_violations + endToEnd.egress_defense_conflict_violations + endToEnd.blocked_retry_violations + endToEnd.cancellation_arrival_violations
  },
  invariant_checks: {
    invalid_evidence_retention_violations: endToEnd.invalid_clear_violations,
    egress_over_defense_conflict_violations: endToEnd.egress_defense_conflict_violations,
    blocked_retry_violations: endToEnd.blocked_retry_violations,
    cancellation_arrival_violations: endToEnd.cancellation_arrival_violations
  },
  checks,
  ownership_audit: ownershipAudit,
  scenarios,
  scenario_checks: scenarioChecks
};

process.stdout.write(JSON.stringify(result));
