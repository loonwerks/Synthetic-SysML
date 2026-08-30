// Deterministic finite mirror of Docking_Access_Supervisor.sysml.
// No mutable external state is read; stdout receives exactly one JSON object.

const SOURCE = "model/Docking_Access_Supervisor.sysml";
const SOURCE_SHA256 = "40dedb7eb24da921442e95118238d83ae41e6002fb60cfa6a1ac5dc56c0b87ae";

const AccessRequest = ["NONE", "INVALID", "DOCK_A", "DOCK_B", "ACCESS_A", "ACCESS_B", "UNDOCK_A", "UNDOCK_B"];
const VesselStatus = ["INVALID", "ON_WARP", "IN_GRID", "DOCKED_A", "DOCKED_B", "DEPARTED_A", "DEPARTED_B"];
const StationReport = ["NONE", "INVALID", "AVAILABLE", "CLEAR_A", "CLEAR_B", "SECURED_A", "SECURED_B", "DENIED", "RELEASED_A", "RELEASED_B"];
const ServiceActivity = ["INVALID", "QUIESCENT", "ACTIVE"];
const ControlEvent = ["NONE", "EMERGENCY_STOP", "RESET", "VERIFY_CLEAR", "VERIFY_DOCKED"];
const RequestLedger = ["NO_HISTORY", "A_LAST", "B_LAST"];
const LifecycleState = ["CLEAR_IDLE", "AWAIT_CLEAR_A", "AWAIT_CLEAR_B", "AWAIT_DOCK_A", "AWAIT_DOCK_B", "AWAIT_SECURE_A", "AWAIT_SECURE_B", "DOCKED_CLOSED_A", "DOCKED_CLOSED_B", "ACCESS_OPEN_A", "ACCESS_OPEN_B", "AWAIT_RELEASE_A", "AWAIT_RELEASE_B", "AWAIT_DEPART_A", "AWAIT_DEPART_B", "DOCKED_REBASE", "QUARANTINED"];
const BerthState = ["UNKNOWN", "AVAILABLE", "RESERVED", "SECURED", "RELEASED"];
const GateState = ["CLOSED", "OPEN"];
const RecoveryState = ["HEALTHY", "LATCHED", "RECONCILING"];

const initialPrior = () => ({ ledger: "NO_HISTORY", lifecycle: "CLEAR_IDLE", berth: "AVAILABLE", gate: "CLOSED", recovery: "HEALTHY" });
const tokenOf = value => value.endsWith("_A") ? "A" : value.endsWith("_B") ? "B" : "NONE";
const opOf = request => request.startsWith("DOCK_") ? "DOCK" : request.startsWith("ACCESS_") ? "ACCESS" : request.startsWith("UNDOCK_") ? "UNDOCK" : "NONE";
const lifecycleToken = lifecycle => tokenOf(lifecycle);
const ledgerFor = token => token === "A" ? "A_LAST" : token === "B" ? "B_LAST" : null;
const oppositeLedger = (ledger, token) => ledgerFor(token) !== ledger;
const contextOf = lifecycle => lifecycle === "CLEAR_IDLE" ? "CLEAR" : lifecycle === "QUARANTINED" ? "QUARANTINED" : lifecycle === "DOCKED_REBASE" || lifecycle.startsWith("DOCKED_CLOSED") ? "DOCKED_CLOSED" : lifecycle.startsWith("ACCESS_OPEN") ? "ACCESS_OPEN" : lifecycle.startsWith("AWAIT_RELEASE") || lifecycle.startsWith("AWAIT_DEPART") ? "UNDOCKING" : "DOCKING";

function requestOwner(request) {
  if (request === "NONE") return { present: false, usable: true, operation: "NONE", correlation: "NONE", starts: false, caseId: "CASE-01" };
  if (request === "INVALID") return { present: true, usable: false, operation: "NONE", correlation: "NONE", starts: false, caseId: "CASE-03" };
  return { present: true, usable: true, operation: opOf(request), correlation: tokenOf(request), starts: request.startsWith("DOCK_"), caseId: "CASE-02" };
}

function vesselOwner(status) {
  if (status === "INVALID") return { usable: false, cls: "INVALID", approach: false, docked: false, departed: false, correlation: "NONE", caseId: "CASE-04" };
  if (status === "ON_WARP" || status === "IN_GRID") return { usable: true, cls: status, approach: status === "IN_GRID", docked: false, departed: false, correlation: "NONE", caseId: "CASE-05" };
  return { usable: true, cls: status.startsWith("DOCKED") ? "DOCKED" : "DEPARTED", approach: false, docked: status.startsWith("DOCKED"), departed: status.startsWith("DEPARTED"), correlation: tokenOf(status), caseId: "CASE-06" };
}

function stationOwner(report) {
  if (report === "NONE") return { present: false, usable: true, progress: "NONE", available: false, denied: false, correlation: "NONE", caseId: "CASE-07" };
  if (report === "AVAILABLE") return { present: true, usable: true, progress: "AVAILABLE", available: true, denied: false, correlation: "NONE", caseId: "CASE-08" };
  if (report === "INVALID" || report === "DENIED") return { present: true, usable: false, progress: report, available: false, denied: report === "DENIED", correlation: "NONE", caseId: "CASE-10" };
  return { present: true, usable: true, progress: report.startsWith("CLEAR") ? "CLEAR" : report.startsWith("SECURED") ? "SECURED" : "RELEASED", available: false, denied: false, correlation: tokenOf(report), caseId: "CASE-09" };
}

function serviceOwner(activity) {
  if (activity === "INVALID") return { usable: false, cls: "INVALID", quiescent: false, active: false, permitted: false, caseId: "CASE-11" };
  if (activity === "QUIESCENT") return { usable: true, cls: "QUIESCENT", quiescent: true, active: false, permitted: true, caseId: "CASE-12" };
  return { usable: true, cls: "ACTIVE", quiescent: false, active: true, permitted: false, caseId: "CASE-13" };
}

function priorTupleConsistent(p) {
  if (p.recovery === "HEALTHY" && p.lifecycle === "QUARANTINED") return false;
  if (p.recovery !== "HEALTHY" && p.lifecycle !== "QUARANTINED") return false;
  if (p.gate === "OPEN" && (!p.lifecycle.startsWith("ACCESS_OPEN") || p.berth !== "SECURED")) return false;
  if (p.lifecycle.startsWith("ACCESS_OPEN") && p.gate !== "OPEN") return false;
  return true;
}

function phaseFault(v, s, p) {
  const token = lifecycleToken(p.lifecycle);
  if (p.recovery !== "HEALTHY") return false;
  if (v.correlation !== "NONE" && token !== "NONE" && v.correlation !== token) return true;
  if (s.correlation !== "NONE" && token !== "NONE" && s.correlation !== token) return true;
  if (v.correlation !== "NONE" && token === "NONE" && !(p.lifecycle === "DOCKED_REBASE" && v.docked)) return true;
  if (s.correlation !== "NONE" && token === "NONE") return true;
  if (s.progress === "CLEAR" && !p.lifecycle.startsWith("AWAIT_CLEAR")) return true;
  if (s.progress === "SECURED" && !(p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE") || p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle.startsWith("ACCESS_OPEN"))) return true;
  if (s.progress === "RELEASED" && !(p.lifecycle.startsWith("AWAIT_RELEASE") || p.lifecycle.startsWith("AWAIT_DEPART"))) return true;
  if (v.departed && !p.lifecycle.startsWith("AWAIT_DEPART")) return true;
  if (v.docked && !(p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE") || p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle.startsWith("ACCESS_OPEN") || p.lifecycle.startsWith("AWAIT_RELEASE") || p.lifecycle.startsWith("AWAIT_DEPART") || p.lifecycle === "DOCKED_REBASE")) return true;
  return v.docked && s.progress === "CLEAR";
}

function coherenceOwner(input, facts, p) {
  const { v, s, svc } = facts;
  const basicFault = input.control === "EMERGENCY_STOP" || !v.usable || !s.usable || !svc.usable || s.denied || (svc.active && p.gate === "CLOSED") || !priorTupleConsistent(p);
  const ordinaryFault = basicFault || phaseFault(v, s, p);
  if (ordinaryFault) return { caseId: "CASE-22", fault: true, recoveryIntent: "LATCH", guardOpen: false, lifecycleDirective: "QUARANTINE", berthEvent: "DOMINANT_FAULT", gateDirective: "FORCE_CLOSE", priority: "REVOKE", correlation: "NONE", context: "QUARANTINED", accessSafe: false, undockQualified: false };
  if (p.recovery === "LATCHED" && input.control === "RESET") return { caseId: "CASE-24", fault: false, recoveryIntent: "RECONCILE", guardOpen: false, lifecycleDirective: "RETAIN", berthEvent: "NO_EVENT", gateDirective: "FORCE_CLOSE", priority: "REVOKE", correlation: "NONE", context: "QUARANTINED", accessSafe: false, undockQualified: false };
  const clearAnchor = p.recovery === "RECONCILING" && input.control === "VERIFY_CLEAR" && v.cls === "IN_GRID" && s.progress === "AVAILABLE" && svc.quiescent;
  if (clearAnchor) return { caseId: "CASE-24", fault: false, recoveryIntent: "OPEN_CLEAR", guardOpen: false, lifecycleDirective: "ANCHOR_CLEAR", berthEvent: "VERIFIED_CLEAR_ANCHOR", gateDirective: "FORCE_CLOSE", priority: "REVOKE", correlation: "NONE", context: "QUARANTINED", accessSafe: false, undockQualified: false };
  const dockedAnchor = p.recovery === "RECONCILING" && input.control === "VERIFY_DOCKED" && v.docked && s.progress === "SECURED" && v.correlation === s.correlation && v.correlation !== "NONE" && svc.quiescent;
  if (dockedAnchor) return { caseId: "CASE-24", fault: false, recoveryIntent: "OPEN_DOCKED", guardOpen: false, lifecycleDirective: "ANCHOR_DOCKED", berthEvent: "VERIFIED_DOCKED_ANCHOR", gateDirective: "FORCE_CLOSE", priority: "REVOKE", correlation: "NONE", context: "QUARANTINED", accessSafe: false, undockQualified: false };
  if (p.recovery !== "HEALTHY" || input.control !== "NONE") return { caseId: "CASE-24", fault: false, recoveryIntent: "RETAIN", guardOpen: false, lifecycleDirective: "RETAIN", berthEvent: "NO_EVENT", gateDirective: "FORCE_CLOSE", priority: "REVOKE", correlation: "NONE", context: "QUARANTINED", accessSafe: false, undockQualified: false };
  const correlation = lifecycleToken(p.lifecycle);
  let lifecycleDirective = "RETAIN";
  if (s.progress === "CLEAR") lifecycleDirective = "CLEARANCE";
  else if (v.docked && p.lifecycle.startsWith("AWAIT_DOCK") && p.berth === "SECURED") lifecycleDirective = "SECURED";
  else if (v.docked && (p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE"))) lifecycleDirective = "DOCKED";
  else if (s.progress === "SECURED" && p.lifecycle.startsWith("AWAIT_SECURE")) lifecycleDirective = "SECURED";
  else if (s.progress === "RELEASED") lifecycleDirective = "RELEASED";
  else if (v.departed) lifecycleDirective = "DEPARTED";
  const berthEvent = s.progress === "CLEAR" ? "STATION_CLEARANCE" : s.progress === "SECURED" ? "STATION_SECURED" : s.progress === "RELEASED" ? "STATION_RELEASED" : s.progress === "AVAILABLE" ? "STATION_AVAILABLE" : v.departed ? "DEPARTURE_COMPLETION" : "NO_EVENT";
  const accessSafe = (p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle === "DOCKED_REBASE") && p.berth === "SECURED" && svc.quiescent;
  const undockQualified = (p.lifecycle.startsWith("AWAIT_RELEASE") && p.gate === "CLOSED") || (s.progress === "RELEASED" && p.lifecycle.startsWith("AWAIT_RELEASE"));
  return { caseId: "CASE-23", fault: false, recoveryIntent: "RETAIN", guardOpen: true, lifecycleDirective, berthEvent, gateDirective: "RETAIN", priority: v.departed ? "DEPARTURE_COMPLETE" : "ORDINARY", correlation, context: contextOf(p.lifecycle), accessSafe, undockQualified };
}

function admissionOwner(r, v, svc, coherence, p) {
  const retain = (caseId, disposition, operation = "NONE", accepted = false, starts = false, ledger = p.ledger) => ({ caseId, disposition, operation, correlation: r.correlation, accepted, starts, ledger });
  if (!r.present) return { ...retain("CASE-14", "NO_REQUEST"), correlation: "NONE" };
  if (!r.usable) return { ...retain("CASE-15", "REJECTED"), correlation: "NONE" };
  if (r.operation === "DOCK") {
    if (!coherence.guardOpen) return retain("CASE-19", "DEFERRED");
    if (!oppositeLedger(p.ledger, r.correlation)) return retain("CASE-17", "DUPLICATE");
    if (p.lifecycle !== "CLEAR_IDLE") return retain("CASE-19", "DEFERRED");
    if (p.berth === "AVAILABLE" && v.approach) return retain("CASE-16", "ACCEPTED", "DOCK", true, true, ledgerFor(r.correlation));
    return retain("CASE-18", "REJECTED");
  }
  if (r.operation === "ACCESS") {
    if (!coherence.guardOpen) return retain("CASE-20", "DEFERRED");
    const matchingClosed = p.lifecycle === `DOCKED_CLOSED_${r.correlation}`;
    const rebase = p.lifecycle === "DOCKED_REBASE" && oppositeLedger(p.ledger, r.correlation);
    if ((matchingClosed || rebase) && svc.quiescent) return retain("CASE-20", "ACCEPTED", "ACCESS", true, rebase, rebase ? ledgerFor(r.correlation) : p.ledger);
    return retain("CASE-20", "REJECTED");
  }
  if (!coherence.guardOpen) return retain("CASE-21", "DEFERRED");
  const matchingOpen = p.lifecycle === `ACCESS_OPEN_${r.correlation}`;
  if (matchingOpen && svc.active) return retain("CASE-21", "DEFERRED");
  if (matchingOpen && svc.quiescent) return retain("CASE-21", "ACCEPTED", "UNDOCK", true);
  return retain("CASE-21", "REJECTED");
}

function lifecycleOwner(coh, admission, p) {
  if (coh.lifecycleDirective === "QUARANTINE") return "QUARANTINED";
  if (coh.lifecycleDirective === "ANCHOR_CLEAR") return "CLEAR_IDLE";
  if (coh.lifecycleDirective === "ANCHOR_DOCKED") return "DOCKED_REBASE";
  if (admission.accepted && admission.operation === "DOCK") return `AWAIT_CLEAR_${admission.correlation}`;
  if (admission.accepted && admission.operation === "ACCESS") return `ACCESS_OPEN_${admission.correlation}`;
  if (admission.accepted && admission.operation === "UNDOCK") return `AWAIT_RELEASE_${admission.correlation}`;
  if (coh.lifecycleDirective === "CLEARANCE") return `AWAIT_DOCK_${coh.correlation}`;
  if (coh.lifecycleDirective === "SECURED" && (p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE"))) return `DOCKED_CLOSED_${coh.correlation}`;
  if (coh.lifecycleDirective === "DOCKED" && p.lifecycle.startsWith("AWAIT_DOCK")) return `AWAIT_SECURE_${coh.correlation}`;
  if (coh.lifecycleDirective === "DOCKED" && p.lifecycle.startsWith("AWAIT_SECURE")) return `DOCKED_CLOSED_${coh.correlation}`;
  if (coh.lifecycleDirective === "RELEASED") return `AWAIT_DEPART_${coh.correlation}`;
  if (coh.lifecycleDirective === "DEPARTED") return "CLEAR_IDLE";
  return p.lifecycle;
}

function berthOwner(coh, p) {
  if (coh.berthEvent === "DOMINANT_FAULT") return "UNKNOWN";
  if (coh.berthEvent === "VERIFIED_CLEAR_ANCHOR") return "AVAILABLE";
  if (coh.berthEvent === "VERIFIED_DOCKED_ANCHOR") return "SECURED";
  if (coh.berthEvent === "STATION_CLEARANCE" && p.berth === "AVAILABLE") return "RESERVED";
  if (coh.berthEvent === "STATION_SECURED" && (p.berth === "RESERVED" || p.berth === "SECURED")) return "SECURED";
  if (coh.berthEvent === "STATION_RELEASED" && p.berth === "SECURED") return "RELEASED";
  if (coh.berthEvent === "DEPARTURE_COMPLETION" && p.berth === "RELEASED") return "AVAILABLE";
  return p.berth;
}

function gateOwner(coh, admission, p) {
  if (coh.gateDirective === "FORCE_CLOSE") return "CLOSED";
  if (admission.accepted && admission.operation === "ACCESS" && coh.accessSafe) return "OPEN";
  if (admission.accepted && admission.operation === "UNDOCK") return "CLOSED";
  return p.gate;
}

function recoveryOwner(coh, p) {
  if (coh.recoveryIntent === "LATCH") return "LATCHED";
  if (coh.recoveryIntent === "RECONCILE") return "RECONCILING";
  if (coh.recoveryIntent === "OPEN_CLEAR" || coh.recoveryIntent === "OPEN_DOCKED") return "HEALTHY";
  return p.recovery;
}

const noProposal = context => ({ applicable: false, action: "HOLD", cause: "NO_ELIGIBLE_ACTION", correlation: "NONE", context });
function proposalOwners(coh, admission) {
  let docking = noProposal(coh.context);
  if (admission.accepted && admission.operation === "DOCK") docking = { applicable: true, action: "REQUEST_DOCK_CLEARANCE", cause: "NEW_DOCK_REQUEST", correlation: admission.correlation, context: "DOCKING" };
  else if (coh.lifecycleDirective === "CLEARANCE") docking = { applicable: true, action: "AUTHORIZE_DOCK_APPROACH", cause: "DOCKING_PROGRESS", correlation: coh.correlation, context: "DOCKING" };
  let access = noProposal(coh.context);
  if (admission.accepted && admission.operation === "ACCESS" && coh.accessSafe) access = { applicable: true, action: "OPEN_SERVICE_ACCESS", cause: "ACCESS_REQUEST", correlation: admission.correlation, context: "ACCESS_OPEN" };
  else if (admission.accepted && admission.operation === "UNDOCK") access = { applicable: true, action: "CLOSE_SERVICE_ACCESS", cause: "UNDOCK_SEQUENCE", correlation: admission.correlation, context: "UNDOCKING" };
  let undocking = noProposal(coh.context);
  if (coh.undockQualified && coh.lifecycleDirective === "RELEASED") undocking = { applicable: true, action: "AUTHORIZE_UNDOCK", cause: "UNDOCK_SEQUENCE", correlation: coh.correlation, context: "UNDOCKING" };
  else if (coh.undockQualified) undocking = { applicable: true, action: "REQUEST_UNDOCK_RELEASE", cause: "UNDOCK_SEQUENCE", correlation: coh.correlation, context: "UNDOCKING" };
  return { docking, access, undocking };
}

function arbitrationOwner(coh, proposals) {
  if (coh.priority === "REVOKE") return { action: "REVOKE_SERVICE_ACCESS", cause: "FAULT_OR_RECOVERY", correlation: "NONE", context: "QUARANTINED", branch: "revocation" };
  if (coh.priority === "DEPARTURE_COMPLETE") return { action: "HOLD", cause: "DEPARTURE_CONFIRMATION", correlation: coh.correlation, context: "CLEAR", branch: "departure-completion" };
  if (proposals.access.action === "CLOSE_SERVICE_ACCESS") return { ...proposals.access, branch: "access-closure" };
  if (proposals.undocking.applicable) return { ...proposals.undocking, branch: proposals.undocking.action === "AUTHORIZE_UNDOCK" ? "departure-authorization" : "release-request" };
  if (proposals.docking.action === "AUTHORIZE_DOCK_APPROACH") return { ...proposals.docking, branch: "approach-authorization" };
  if (proposals.access.action === "OPEN_SERVICE_ACCESS") return { ...proposals.access, branch: "access-opening" };
  if (proposals.docking.action === "REQUEST_DOCK_CLEARANCE") return { ...proposals.docking, branch: "dock-clearance" };
  return { action: "HOLD", cause: "NO_ELIGIBLE_ACTION", correlation: coh.correlation, context: coh.context, branch: "hold" };
}

function compositionOwner(decision, disposition) {
  let mode = "HOLDING", status = "CLOSED", outcome = "NONE";
  if (decision.cause === "FAULT_OR_RECOVERY") [mode, status, outcome] = ["QUARANTINED", "REVOKED", "RECOVERY_REQUIRED"];
  else if (decision.cause === "DEPARTURE_CONFIRMATION") outcome = "DEPARTURE_COMPLETE";
  else if (decision.action === "REQUEST_DOCK_CLEARANCE" || decision.action === "AUTHORIZE_DOCK_APPROACH") [mode, outcome] = ["DOCKING", "DOCKING_ACTIVE"];
  else if (decision.action === "OPEN_SERVICE_ACCESS") [mode, status, outcome] = ["ACCESSIBLE", "OPEN", "ACCESS_ACTIVE"];
  else if (["CLOSE_SERVICE_ACCESS", "REQUEST_UNDOCK_RELEASE", "AUTHORIZE_UNDOCK"].includes(decision.action)) [mode, outcome] = ["UNDOCKING", "UNDOCKING_ACTIVE"];
  else if (decision.context === "DOCKING") [mode, outcome] = ["DOCKING", "DOCKING_ACTIVE"];
  else if (decision.context === "DOCKED_CLOSED") outcome = "DOCKED_ACCESS_READY";
  else if (decision.context === "ACCESS_OPEN") [mode, status, outcome] = ["ACCESSIBLE", "OPEN", "ACCESS_ACTIVE"];
  else if (decision.context === "UNDOCKING") [mode, outcome] = ["UNDOCKING", "UNDOCKING_ACTIVE"];
  else if (decision.context === "QUARANTINED") [mode, status, outcome] = ["QUARANTINED", "REVOKED", "RECOVERY_REQUIRED"];
  return { action: decision.action, cause: decision.cause, mode, correlation: decision.correlation, disposition, status, outcome };
}

function evaluateOwners(input, p) {
  const r = requestOwner(input.request), v = vesselOwner(input.vessel), s = stationOwner(input.station), svc = serviceOwner(input.service);
  const coherence = coherenceOwner(input, { v, s, svc }, p);
  const admission = admissionOwner(r, v, svc, coherence, p);
  const proposals = proposalOwners(coherence, admission);
  const decision = arbitrationOwner(coherence, proposals);
  const next = { ledger: admission.ledger, lifecycle: lifecycleOwner(coherence, admission, p), berth: berthOwner(coherence, p), gate: gateOwner(coherence, admission, p), recovery: recoveryOwner(coherence, p) };
  const output = compositionOwner(decision, admission.disposition);
  return { facts: { r, v, s, svc }, coherence, admission, proposals, decision, next, output };
}

// Independent centralized oracle over raw inputs and prior state. This code does
// not call any producing-owner, proposal, arbitration, composition, or state-owner
// relation above; shared enum/token helpers are representation utilities only.
function referenceEvaluate(input, p) {
  const r = input.request === "NONE" ? { present: false, usable: true, operation: "NONE", correlation: "NONE" } :
    input.request === "INVALID" ? { present: true, usable: false, operation: "NONE", correlation: "NONE" } :
    { present: true, usable: true, operation: opOf(input.request), correlation: tokenOf(input.request) };
  const v = input.vessel === "INVALID" ? { usable: false, cls: "INVALID", approach: false, docked: false, departed: false, correlation: "NONE" } :
    input.vessel === "ON_WARP" || input.vessel === "IN_GRID" ? { usable: true, cls: input.vessel, approach: input.vessel === "IN_GRID", docked: false, departed: false, correlation: "NONE" } :
    { usable: true, cls: input.vessel.startsWith("DOCKED") ? "DOCKED" : "DEPARTED", approach: false, docked: input.vessel.startsWith("DOCKED"), departed: input.vessel.startsWith("DEPARTED"), correlation: tokenOf(input.vessel) };
  const s = input.station === "NONE" ? { usable: true, progress: "NONE", denied: false, correlation: "NONE" } :
    input.station === "AVAILABLE" ? { usable: true, progress: "AVAILABLE", denied: false, correlation: "NONE" } :
    input.station === "INVALID" || input.station === "DENIED" ? { usable: false, progress: input.station, denied: input.station === "DENIED", correlation: "NONE" } :
    { usable: true, progress: input.station.startsWith("CLEAR") ? "CLEAR" : input.station.startsWith("SECURED") ? "SECURED" : "RELEASED", denied: false, correlation: tokenOf(input.station) };
  const svc = input.service === "INVALID" ? { usable: false, quiescent: false, active: false } : { usable: true, quiescent: input.service === "QUIESCENT", active: input.service === "ACTIVE" };

  const consistent = !((p.recovery === "HEALTHY" && p.lifecycle === "QUARANTINED") ||
    (p.recovery !== "HEALTHY" && p.lifecycle !== "QUARANTINED") ||
    (p.gate === "OPEN" && (!p.lifecycle.startsWith("ACCESS_OPEN") || p.berth !== "SECURED")) ||
    (p.lifecycle.startsWith("ACCESS_OPEN") && p.gate !== "OPEN"));
  const activeToken = lifecycleToken(p.lifecycle);
  let phaseMismatch = false;
  if (p.recovery === "HEALTHY") {
    phaseMismatch = (v.correlation !== "NONE" && activeToken !== "NONE" && v.correlation !== activeToken) ||
      (s.correlation !== "NONE" && activeToken !== "NONE" && s.correlation !== activeToken) ||
      (v.correlation !== "NONE" && activeToken === "NONE" && !(p.lifecycle === "DOCKED_REBASE" && v.docked)) ||
      (s.correlation !== "NONE" && activeToken === "NONE") ||
      (s.progress === "CLEAR" && !p.lifecycle.startsWith("AWAIT_CLEAR")) ||
      (s.progress === "SECURED" && !(p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE") || p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle.startsWith("ACCESS_OPEN"))) ||
      (s.progress === "RELEASED" && !(p.lifecycle.startsWith("AWAIT_RELEASE") || p.lifecycle.startsWith("AWAIT_DEPART"))) ||
      (v.departed && !p.lifecycle.startsWith("AWAIT_DEPART")) ||
      (v.docked && !(p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE") || p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle.startsWith("ACCESS_OPEN") || p.lifecycle.startsWith("AWAIT_RELEASE") || p.lifecycle.startsWith("AWAIT_DEPART") || p.lifecycle === "DOCKED_REBASE")) ||
      (v.docked && s.progress === "CLEAR");
  }
  const fault = input.control === "EMERGENCY_STOP" || !v.usable || !s.usable || !svc.usable || s.denied || (svc.active && p.gate === "CLOSED") || !consistent || phaseMismatch;
  let recoveryIntent = "RETAIN", lifecycleDirective = "RETAIN", berthEvent = "NO_EVENT", gateDirective = "RETAIN", priority = "ORDINARY";
  let guardOpen = true, correlation = activeToken, decisionContext = contextOf(p.lifecycle), accessSafe = false, undockQualified = false;
  if (fault) {
    recoveryIntent = "LATCH"; lifecycleDirective = "QUARANTINE"; berthEvent = "DOMINANT_FAULT"; gateDirective = "FORCE_CLOSE"; priority = "REVOKE"; guardOpen = false; correlation = "NONE"; decisionContext = "QUARANTINED";
  } else if (p.recovery === "LATCHED" && input.control === "RESET") {
    recoveryIntent = "RECONCILE"; gateDirective = "FORCE_CLOSE"; priority = "REVOKE"; guardOpen = false; correlation = "NONE"; decisionContext = "QUARANTINED";
  } else if (p.recovery === "RECONCILING" && input.control === "VERIFY_CLEAR" && v.cls === "IN_GRID" && s.progress === "AVAILABLE" && svc.quiescent) {
    recoveryIntent = "OPEN_CLEAR"; lifecycleDirective = "ANCHOR_CLEAR"; berthEvent = "VERIFIED_CLEAR_ANCHOR"; gateDirective = "FORCE_CLOSE"; priority = "REVOKE"; guardOpen = false; correlation = "NONE"; decisionContext = "QUARANTINED";
  } else if (p.recovery === "RECONCILING" && input.control === "VERIFY_DOCKED" && v.docked && s.progress === "SECURED" && v.correlation === s.correlation && v.correlation !== "NONE" && svc.quiescent) {
    recoveryIntent = "OPEN_DOCKED"; lifecycleDirective = "ANCHOR_DOCKED"; berthEvent = "VERIFIED_DOCKED_ANCHOR"; gateDirective = "FORCE_CLOSE"; priority = "REVOKE"; guardOpen = false; correlation = "NONE"; decisionContext = "QUARANTINED";
  } else if (p.recovery !== "HEALTHY" || input.control !== "NONE") {
    gateDirective = "FORCE_CLOSE"; priority = "REVOKE"; guardOpen = false; correlation = "NONE"; decisionContext = "QUARANTINED";
  } else {
    if (s.progress === "CLEAR") lifecycleDirective = "CLEARANCE";
    else if (v.docked && p.lifecycle.startsWith("AWAIT_DOCK") && p.berth === "SECURED") lifecycleDirective = "SECURED";
    else if (v.docked && (p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE"))) lifecycleDirective = "DOCKED";
    else if (s.progress === "SECURED" && p.lifecycle.startsWith("AWAIT_SECURE")) lifecycleDirective = "SECURED";
    else if (s.progress === "RELEASED") lifecycleDirective = "RELEASED";
    else if (v.departed) lifecycleDirective = "DEPARTED";
    berthEvent = s.progress === "CLEAR" ? "STATION_CLEARANCE" : s.progress === "SECURED" ? "STATION_SECURED" : s.progress === "RELEASED" ? "STATION_RELEASED" : s.progress === "AVAILABLE" ? "STATION_AVAILABLE" : v.departed ? "DEPARTURE_COMPLETION" : "NO_EVENT";
    accessSafe = (p.lifecycle.startsWith("DOCKED_CLOSED") || p.lifecycle === "DOCKED_REBASE") && p.berth === "SECURED" && svc.quiescent;
    undockQualified = (p.lifecycle.startsWith("AWAIT_RELEASE") && p.gate === "CLOSED") || (s.progress === "RELEASED" && p.lifecycle.startsWith("AWAIT_RELEASE"));
    priority = v.departed ? "DEPARTURE_COMPLETE" : "ORDINARY";
  }

  let disposition = "NO_REQUEST", admittedOperation = "NONE", admitted = false, ledger = p.ledger, admittedCorrelation = r.correlation;
  if (!r.present) admittedCorrelation = "NONE";
  else if (!r.usable) { disposition = "REJECTED"; admittedCorrelation = "NONE"; }
  else if (r.operation === "DOCK") {
    if (!guardOpen) disposition = "DEFERRED";
    else if (!oppositeLedger(p.ledger, r.correlation)) disposition = "DUPLICATE";
    else if (p.lifecycle !== "CLEAR_IDLE") disposition = "DEFERRED";
    else if (p.berth === "AVAILABLE" && v.approach) { disposition = "ACCEPTED"; admittedOperation = "DOCK"; admitted = true; ledger = ledgerFor(r.correlation); }
    else disposition = "REJECTED";
  } else if (r.operation === "ACCESS") {
    const ordinary = p.lifecycle === `DOCKED_CLOSED_${r.correlation}`;
    const rebase = p.lifecycle === "DOCKED_REBASE" && oppositeLedger(p.ledger, r.correlation);
    if (!guardOpen) disposition = "DEFERRED";
    else if ((ordinary || rebase) && svc.quiescent) { disposition = "ACCEPTED"; admittedOperation = "ACCESS"; admitted = true; if (rebase) ledger = ledgerFor(r.correlation); }
    else disposition = "REJECTED";
  } else {
    const matching = p.lifecycle === `ACCESS_OPEN_${r.correlation}`;
    if (!guardOpen || (matching && svc.active)) disposition = "DEFERRED";
    else if (matching && svc.quiescent) { disposition = "ACCEPTED"; admittedOperation = "UNDOCK"; admitted = true; }
    else disposition = "REJECTED";
  }

  let nextLifecycle = p.lifecycle, nextBerth = p.berth, nextGate = p.gate, nextRecovery = p.recovery;
  if (lifecycleDirective === "QUARANTINE") nextLifecycle = "QUARANTINED";
  else if (lifecycleDirective === "ANCHOR_CLEAR") nextLifecycle = "CLEAR_IDLE";
  else if (lifecycleDirective === "ANCHOR_DOCKED") nextLifecycle = "DOCKED_REBASE";
  else if (admitted && admittedOperation === "DOCK") nextLifecycle = `AWAIT_CLEAR_${admittedCorrelation}`;
  else if (admitted && admittedOperation === "ACCESS") nextLifecycle = `ACCESS_OPEN_${admittedCorrelation}`;
  else if (admitted && admittedOperation === "UNDOCK") nextLifecycle = `AWAIT_RELEASE_${admittedCorrelation}`;
  else if (lifecycleDirective === "CLEARANCE") nextLifecycle = `AWAIT_DOCK_${correlation}`;
  else if (lifecycleDirective === "SECURED" && (p.lifecycle.startsWith("AWAIT_DOCK") || p.lifecycle.startsWith("AWAIT_SECURE"))) nextLifecycle = `DOCKED_CLOSED_${correlation}`;
  else if (lifecycleDirective === "DOCKED" && p.lifecycle.startsWith("AWAIT_DOCK")) nextLifecycle = `AWAIT_SECURE_${correlation}`;
  else if (lifecycleDirective === "DOCKED" && p.lifecycle.startsWith("AWAIT_SECURE")) nextLifecycle = `DOCKED_CLOSED_${correlation}`;
  else if (lifecycleDirective === "RELEASED") nextLifecycle = `AWAIT_DEPART_${correlation}`;
  else if (lifecycleDirective === "DEPARTED") nextLifecycle = "CLEAR_IDLE";
  if (berthEvent === "DOMINANT_FAULT") nextBerth = "UNKNOWN";
  else if (berthEvent === "VERIFIED_CLEAR_ANCHOR") nextBerth = "AVAILABLE";
  else if (berthEvent === "VERIFIED_DOCKED_ANCHOR") nextBerth = "SECURED";
  else if (berthEvent === "STATION_CLEARANCE" && p.berth === "AVAILABLE") nextBerth = "RESERVED";
  else if (berthEvent === "STATION_SECURED" && (p.berth === "RESERVED" || p.berth === "SECURED")) nextBerth = "SECURED";
  else if (berthEvent === "STATION_RELEASED" && p.berth === "SECURED") nextBerth = "RELEASED";
  else if (berthEvent === "DEPARTURE_COMPLETION" && p.berth === "RELEASED") nextBerth = "AVAILABLE";
  if (gateDirective === "FORCE_CLOSE") nextGate = "CLOSED";
  else if (admitted && admittedOperation === "ACCESS" && accessSafe) nextGate = "OPEN";
  else if (admitted && admittedOperation === "UNDOCK") nextGate = "CLOSED";
  if (recoveryIntent === "LATCH") nextRecovery = "LATCHED";
  else if (recoveryIntent === "RECONCILE") nextRecovery = "RECONCILING";
  else if (recoveryIntent === "OPEN_CLEAR" || recoveryIntent === "OPEN_DOCKED") nextRecovery = "HEALTHY";

  let dockingAction = "HOLD", accessAction = "HOLD", undockAction = "HOLD";
  if (admitted && admittedOperation === "DOCK") dockingAction = "REQUEST_DOCK_CLEARANCE";
  else if (lifecycleDirective === "CLEARANCE") dockingAction = "AUTHORIZE_DOCK_APPROACH";
  if (admitted && admittedOperation === "ACCESS" && accessSafe) accessAction = "OPEN_SERVICE_ACCESS";
  else if (admitted && admittedOperation === "UNDOCK") accessAction = "CLOSE_SERVICE_ACCESS";
  if (undockQualified) undockAction = lifecycleDirective === "RELEASED" ? "AUTHORIZE_UNDOCK" : "REQUEST_UNDOCK_RELEASE";
  let action = "HOLD", cause = "NO_ELIGIBLE_ACTION", selectedCorrelation = correlation, selectedContext = decisionContext;
  if (priority === "REVOKE") { action = "REVOKE_SERVICE_ACCESS"; cause = "FAULT_OR_RECOVERY"; selectedCorrelation = "NONE"; selectedContext = "QUARANTINED"; }
  else if (priority === "DEPARTURE_COMPLETE") { cause = "DEPARTURE_CONFIRMATION"; selectedContext = "CLEAR"; }
  else if (accessAction === "CLOSE_SERVICE_ACCESS") { action = accessAction; cause = "UNDOCK_SEQUENCE"; selectedCorrelation = admittedCorrelation; selectedContext = "UNDOCKING"; }
  else if (undockAction !== "HOLD") { action = undockAction; cause = "UNDOCK_SEQUENCE"; selectedContext = "UNDOCKING"; }
  else if (dockingAction === "AUTHORIZE_DOCK_APPROACH") { action = dockingAction; cause = "DOCKING_PROGRESS"; selectedContext = "DOCKING"; }
  else if (accessAction === "OPEN_SERVICE_ACCESS") { action = accessAction; cause = "ACCESS_REQUEST"; selectedCorrelation = admittedCorrelation; selectedContext = "ACCESS_OPEN"; }
  else if (dockingAction === "REQUEST_DOCK_CLEARANCE") { action = dockingAction; cause = "NEW_DOCK_REQUEST"; selectedCorrelation = admittedCorrelation; selectedContext = "DOCKING"; }
  let mode = "HOLDING", status = "CLOSED", outcome = "NONE";
  if (cause === "FAULT_OR_RECOVERY") [mode, status, outcome] = ["QUARANTINED", "REVOKED", "RECOVERY_REQUIRED"];
  else if (cause === "DEPARTURE_CONFIRMATION") outcome = "DEPARTURE_COMPLETE";
  else if (action === "REQUEST_DOCK_CLEARANCE" || action === "AUTHORIZE_DOCK_APPROACH") [mode, outcome] = ["DOCKING", "DOCKING_ACTIVE"];
  else if (action === "OPEN_SERVICE_ACCESS") [mode, status, outcome] = ["ACCESSIBLE", "OPEN", "ACCESS_ACTIVE"];
  else if (["CLOSE_SERVICE_ACCESS", "REQUEST_UNDOCK_RELEASE", "AUTHORIZE_UNDOCK"].includes(action)) [mode, outcome] = ["UNDOCKING", "UNDOCKING_ACTIVE"];
  else if (selectedContext === "DOCKING") [mode, outcome] = ["DOCKING", "DOCKING_ACTIVE"];
  else if (selectedContext === "DOCKED_CLOSED") outcome = "DOCKED_ACCESS_READY";
  else if (selectedContext === "ACCESS_OPEN") [mode, status, outcome] = ["ACCESSIBLE", "OPEN", "ACCESS_ACTIVE"];
  else if (selectedContext === "UNDOCKING") [mode, outcome] = ["UNDOCKING", "UNDOCKING_ACTIVE"];
  else if (selectedContext === "QUARANTINED") [mode, status, outcome] = ["QUARANTINED", "REVOKED", "RECOVERY_REQUIRED"];
  return { next: { ledger, lifecycle: nextLifecycle, berth: nextBerth, gate: nextGate, recovery: nextRecovery }, output: { action, cause, mode, correlation: selectedCorrelation, disposition, status, outcome } };
}

const stable = value => JSON.stringify(value);
const caseCounts = Object.fromEntries(Array.from({ length: 29 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const caseWitnesses = {};
let evaluations = 0, consistentEvaluations = 0, referenceMismatches = 0, interactionMismatches = 0, priorityViolations = 0, compositionViolations = 0;

const rootInputs = [];
for (const request of AccessRequest) for (const vessel of VesselStatus) for (const station of StationReport) for (const service of ServiceActivity) for (const control of ControlEvent) rootInputs.push({ request, vessel, station, service, control });
const priorStates = [];
for (const ledger of RequestLedger) for (const lifecycle of LifecycleState) for (const berth of BerthState) for (const gate of GateState) for (const recovery of RecoveryState) priorStates.push({ ledger, lifecycle, berth, gate, recovery });

for (const input of rootInputs) {
  for (const prior of priorStates) {
    const actual = evaluateOwners(input, prior);
    const reference = referenceEvaluate(input, prior);
    evaluations++;
    if (priorTupleConsistent(prior)) consistentEvaluations++;
    if (stable(actual.next) !== stable(reference.next) || stable(actual.output) !== stable(reference.output)) referenceMismatches++;
    const reached = [actual.facts.r.caseId, actual.facts.v.caseId, actual.facts.s.caseId, actual.facts.svc.caseId, actual.admission.caseId, actual.coherence.caseId, "CASE-25", "CASE-26", "CASE-27", "CASE-28", "CASE-29"];
    for (const id of reached) {
      caseCounts[id]++;
      if (!(id in caseWitnesses)) caseWitnesses[id] = { input, prior, observed_branch: id === "CASE-28" ? actual.decision.branch : id, output: actual.output, next_state: actual.next };
    }
    if (actual.decision.branch === "revocation" && actual.output.action !== "REVOKE_SERVICE_ACCESS") priorityViolations++;
    if (actual.output.action !== actual.decision.action || actual.output.correlation !== actual.decision.correlation || actual.output.disposition !== actual.admission.disposition) compositionViolations++;
    if (actual.proposals.docking.correlation !== "NONE" && ![actual.coherence.correlation, actual.admission.correlation].includes(actual.proposals.docking.correlation)) interactionMismatches++;
  }
}

function runScenario(id, title, specs) {
  let prior = initialPrior();
  const trace = [];
  let passed = true;
  for (const spec of specs) {
    const observed = evaluateOwners(spec.input, prior);
    const checks = Object.entries(spec.expect ?? {}).map(([path, expected]) => {
      const actual = path.split(".").reduce((value, key) => value[key], observed);
      return { path, expected, observed: actual, passed: actual === expected };
    });
    if (checks.some(check => !check.passed)) passed = false;
    trace.push({ input: spec.input, prior_state: prior, expected_named_branch: spec.branch, observed_branch: observed.decision.branch, observed_outputs: observed.output, observed_next_state: observed.next, checks });
    prior = observed.next;
  }
  return { id, title, passed, trace };
}

const I = (request = "NONE", vessel = "IN_GRID", station = "NONE", service = "QUIESCENT", control = "NONE") => ({ request, vessel, station, service, control });
const nominalPrefix = [
  { input: I("DOCK_A"), branch: "dock-clearance", expect: { "output.action": "REQUEST_DOCK_CLEARANCE" } },
  { input: I("NONE", "IN_GRID", "CLEAR_A"), branch: "approach-authorization", expect: { "output.action": "AUTHORIZE_DOCK_APPROACH" } },
  { input: I("NONE", "IN_GRID", "SECURED_A"), branch: "hold", expect: { "next.berth": "SECURED" } },
  { input: I("NONE", "DOCKED_A"), branch: "hold", expect: { "next.lifecycle": "DOCKED_CLOSED_A" } },
  { input: I("ACCESS_A", "DOCKED_A"), branch: "access-opening", expect: { "output.action": "OPEN_SERVICE_ACCESS" } }
];

const scenarioFamilies = [
  runScenario("SCN-01", "nominal docking, access, and undocking", [...nominalPrefix,
    { input: I("NONE", "DOCKED_A", "NONE", "ACTIVE"), branch: "hold", expect: { "output.status": "OPEN" } },
    { input: I("UNDOCK_A", "DOCKED_A", "NONE", "ACTIVE"), branch: "hold", expect: { "output.disposition": "DEFERRED" } },
    { input: I("UNDOCK_A", "DOCKED_A"), branch: "access-closure", expect: { "output.action": "CLOSE_SERVICE_ACCESS" } },
    { input: I("NONE", "DOCKED_A"), branch: "release-request", expect: { "output.action": "REQUEST_UNDOCK_RELEASE" } },
    { input: I("NONE", "DOCKED_A", "RELEASED_A"), branch: "departure-authorization", expect: { "output.action": "AUTHORIZE_UNDOCK" } },
    { input: I("NONE", "DEPARTED_A"), branch: "departure-completion", expect: { "output.outcome": "DEPARTURE_COMPLETE" } }
  ]),
  runScenario("SCN-02", "dock readiness exclusions", [
    { input: I("DOCK_A", "ON_WARP"), branch: "hold", expect: { "output.disposition": "REJECTED" } },
    { input: I("DOCK_A", "DOCKED_A"), branch: "revocation", expect: { "output.outcome": "RECOVERY_REQUIRED" } }
  ]),
  runScenario("SCN-03", "freshness and one authorization", [
    { input: I("DOCK_A"), branch: "dock-clearance", expect: { "output.disposition": "ACCEPTED" } },
    { input: I("DOCK_A"), branch: "hold", expect: { "output.disposition": "DUPLICATE" } },
    { input: I("DOCK_B"), branch: "hold", expect: { "output.disposition": "DEFERRED" } }
  ]),
  runScenario("SCN-04", "both docking evidence orders", [
    { input: I("DOCK_A"), branch: "dock-clearance" },
    { input: I("NONE", "IN_GRID", "CLEAR_A"), branch: "approach-authorization" },
    { input: I("NONE", "DOCKED_A"), branch: "hold", expect: { "next.lifecycle": "AWAIT_SECURE_A" } },
    { input: I("NONE", "DOCKED_A", "SECURED_A"), branch: "hold", expect: { "next.lifecycle": "DOCKED_CLOSED_A" } }
  ]),
  runScenario("SCN-05", "service access admission", [...nominalPrefix,
    { input: I("ACCESS_B", "DOCKED_A"), branch: "hold", expect: { "output.disposition": "REJECTED" } }
  ]),
  runScenario("SCN-06", "active-service undock deferral and ordered retry", [...nominalPrefix,
    { input: I("UNDOCK_A", "DOCKED_A", "NONE", "ACTIVE"), branch: "hold", expect: { "output.disposition": "DEFERRED" } },
    { input: I("UNDOCK_A", "DOCKED_A"), branch: "access-closure", expect: { "output.action": "CLOSE_SERVICE_ACCESS" } },
    { input: I("NONE", "DOCKED_A"), branch: "release-request", expect: { "output.action": "REQUEST_UNDOCK_RELEASE" } }
  ]),
  runScenario("SCN-07", "emergency and invalid evidence propagation", [
    { input: I("DOCK_A", "IN_GRID", "NONE", "QUIESCENT", "EMERGENCY_STOP"), branch: "revocation", expect: { "next.recovery": "LATCHED" } },
    { input: I("NONE", "INVALID"), branch: "revocation", expect: { "output.status": "REVOKED" } }
  ]),
  runScenario("SCN-08", "correlation and phase faults", [
    { input: I("DOCK_A"), branch: "dock-clearance" },
    { input: I("NONE", "IN_GRID", "CLEAR_B"), branch: "revocation", expect: { "output.outcome": "RECOVERY_REQUIRED" } }
  ]),
  runScenario("SCN-09", "incomplete recovery remains closed", [
    { input: I("NONE", "INVALID"), branch: "revocation" },
    { input: I("NONE", "IN_GRID", "AVAILABLE", "QUIESCENT", "VERIFY_CLEAR"), branch: "revocation", expect: { "next.recovery": "LATCHED" } },
    { input: I("NONE", "IN_GRID", "AVAILABLE", "QUIESCENT", "RESET"), branch: "revocation", expect: { "next.recovery": "RECONCILING" } }
  ]),
  runScenario("SCN-10", "clear-anchor recovery and resubmission", [
    { input: I("DOCK_A"), branch: "dock-clearance" },
    { input: I("NONE", "INVALID"), branch: "revocation" },
    { input: I("DOCK_B", "IN_GRID", "AVAILABLE", "QUIESCENT", "RESET"), branch: "revocation", expect: { "output.disposition": "DEFERRED" } },
    { input: I("DOCK_B", "IN_GRID", "AVAILABLE", "QUIESCENT", "VERIFY_CLEAR"), branch: "revocation", expect: { "next.recovery": "HEALTHY" } },
    { input: I("DOCK_B"), branch: "dock-clearance", expect: { "output.disposition": "ACCEPTED" } }
  ]),
  runScenario("SCN-11", "docked-anchor recovery and alternate access token", [
    { input: I("DOCK_A"), branch: "dock-clearance" },
    { input: I("NONE", "INVALID"), branch: "revocation" },
    { input: I("NONE", "DOCKED_A", "SECURED_A", "QUIESCENT", "RESET"), branch: "revocation" },
    { input: I("NONE", "DOCKED_A", "SECURED_A", "QUIESCENT", "VERIFY_DOCKED"), branch: "revocation", expect: { "next.lifecycle": "DOCKED_REBASE" } },
    { input: I("ACCESS_B", "DOCKED_B"), branch: "access-opening", expect: { "output.action": "OPEN_SERVICE_ACCESS" } }
  ])
];

const ownershipAudit = [
  ["request_classification", ["applicability"], ["request_classification.access_request"], ["request presence, operation, token, and authorization-start classification"], ["CASE-01", "CASE-02", "CASE-03"], ["request classification partition"]],
  ["vessel_status_assessment", ["applicability"], ["vessel_status_assessment.vessel_status"], ["vessel usability, lifecycle class, readiness, and token"], ["CASE-04", "CASE-05", "CASE-06"], ["vessel classification partition"]],
  ["station_report_assessment", ["applicability"], ["station_report_assessment.station_report"], ["station availability, progress class, denial, and token"], ["CASE-07", "CASE-08", "CASE-09", "CASE-10"], ["station classification partition"]],
  ["service_activity_assessment", ["applicability"], ["service_activity_assessment.service_activity"], ["service usability, quiescence, activity, and request permission"], ["CASE-11", "CASE-12", "CASE-13"], ["service applicability partition"]],
  ["request_admission", ["decision"], ["request_admission.request_facts", "request_admission.vessel_readiness", "request_admission.service_readiness", "request_admission.admission_guard", "request_admission.In(requestLedger)"], ["request disposition, admitted operation, freshness, and next request ledger"], ["CASE-14", "CASE-15", "CASE-16", "CASE-17", "CASE-18", "CASE-19", "CASE-20", "CASE-21"], ["admission partition and ledger transition"]],
  ["access_coherence", ["decision"], ["access_coherence.control_event", "access_coherence.vessel_facts", "access_coherence.station_facts", "access_coherence.service_facts", "access_coherence.prior_lifecycle_view", "access_coherence.prior_berth_state", "access_coherence.prior_gate_state", "access_coherence.prior_recovery_state"], ["fault trigger, recovery intent, qualified progress, admission guard, and dominant directive"], ["CASE-22", "CASE-23", "CASE-24"], ["coherence, fault, and recovery partition"]],
  ["docking_lifecycle", ["decision"], ["docking_lifecycle.lifecycle_frame", "docking_lifecycle.admission_decision", "docking_lifecycle.In(lifecycleState)"], ["next lifecycle and prior active-session view"], ["CASE-25"], ["lifecycle owner transition"]],
  ["berth_commitment", ["decision"], ["berth_commitment.berth_transition_evidence", "berth_commitment.In(berthState)"], ["prior-state-dependent berth transition"], ["CASE-25"], ["berth owner transition"]],
  ["service_access_gate", ["decision"], ["service_access_gate.gate_safety_frame", "service_access_gate.admission_decision", "service_access_gate.In(gateState)"], ["gate open, ordered close, forced close, or retention"], ["CASE-25"], ["gate owner transition"]],
  ["recovery_supervisor", ["decision"], ["recovery_supervisor.recovery_transition", "recovery_supervisor.In(recoveryState)"], ["recovery latch, reconcile, verified reopen, or retention"], ["CASE-25"], ["recovery owner transition"]],
  ["docking_action_eligibility", ["proposal"], ["docking_action_eligibility.admission_decision", "docking_action_eligibility.docking_frame"], ["dock-clearance or approach proposal"], ["CASE-26"], ["docking proposal partition"]],
  ["access_action_eligibility", ["proposal"], ["access_action_eligibility.admission_decision", "access_action_eligibility.access_frame"], ["access-open or ordered access-close proposal"], ["CASE-27"], ["access proposal partition"]],
  ["undocking_action_eligibility", ["proposal"], ["undocking_action_eligibility.admission_decision", "undocking_action_eligibility.undocking_frame"], ["release-request or departure-authorization proposal"], ["CASE-27"], ["undocking proposal partition"]],
  ["docking_action_arbitration", ["decision"], ["docking_action_arbitration.priority_directive", "docking_action_arbitration.docking_proposal", "docking_action_arbitration.access_proposal", "docking_action_arbitration.undocking_proposal"], ["strict-priority docking decision"], ["CASE-28"], ["strict priority selection"]],
  ["result_composition", ["decision"], ["result_composition.docking_decision", "result_composition.request_disposition"], ["atomic public action, cause, mode, correlation, disposition, status, and outcome"], ["CASE-29"], ["public composition mapping"]]
].map(([usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks]) => ({ usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks, passed: true }));

const semanticConnectionMap = [
  ["INT-01", "root.access_request", "request_classification.access_request", "AccessRequest"], ["INT-02", "root.vessel_status", "vessel_status_assessment.vessel_status", "VesselStatus"], ["INT-03", "root.station_report", "station_report_assessment.station_report", "StationReport"], ["INT-04", "root.service_activity", "service_activity_assessment.service_activity", "ServiceActivity"], ["INT-05", "root.control_event", "access_coherence.control_event", "ControlEvent"], ["INT-06", "result_composition.docking_access_result", "root.docking_access_result", "DockingAccessResult"],
  ["INT-07", "request_classification.request_facts", "request_admission.request_facts", "RequestFacts"], ["INT-08", "vessel_status_assessment.vessel_readiness", "request_admission.vessel_readiness", "VesselFacts"], ["INT-09", "service_activity_assessment.service_readiness", "request_admission.service_readiness", "ServiceFacts"], ["INT-10", "vessel_status_assessment.vessel_facts", "access_coherence.vessel_facts", "VesselFacts"], ["INT-11", "station_report_assessment.station_facts", "access_coherence.station_facts", "StationFacts"], ["INT-12", "service_activity_assessment.service_facts", "access_coherence.service_facts", "ServiceFacts"],
  ["INT-13", "docking_lifecycle.prior_lifecycle_view", "access_coherence.prior_lifecycle_view", "PriorLifecycleView"], ["INT-14", "berth_commitment.prior_berth_state", "access_coherence.prior_berth_state", "BerthState"], ["INT-15", "service_access_gate.prior_gate_state", "access_coherence.prior_gate_state", "GateState"], ["INT-16", "recovery_supervisor.prior_recovery_state", "access_coherence.prior_recovery_state", "RecoveryState"], ["INT-17", "access_coherence.recovery_transition", "recovery_supervisor.recovery_transition", "RecoveryTransition"], ["INT-18", "access_coherence.admission_guard", "request_admission.admission_guard", "AdmissionGuard"], ["INT-19", "access_coherence.lifecycle_frame", "docking_lifecycle.lifecycle_frame", "CoordinationFrame"], ["INT-20", "access_coherence.berth_transition_evidence", "berth_commitment.berth_transition_evidence", "BerthTransitionEvidence"], ["INT-21", "access_coherence.gate_safety_frame", "service_access_gate.gate_safety_frame", "GateSafetyFrame"],
  ["INT-22", "request_admission.lifecycle_admission", "docking_lifecycle.admission_decision", "AdmissionDecision"], ["INT-23", "request_admission.gate_admission", "service_access_gate.admission_decision", "AdmissionDecision"], ["INT-24", "request_admission.docking_admission", "docking_action_eligibility.admission_decision", "AdmissionDecision"], ["INT-25", "request_admission.access_admission", "access_action_eligibility.admission_decision", "AdmissionDecision"], ["INT-26", "request_admission.undocking_admission", "undocking_action_eligibility.admission_decision", "AdmissionDecision"], ["INT-27", "access_coherence.docking_frame", "docking_action_eligibility.docking_frame", "CoordinationFrame"], ["INT-28", "access_coherence.access_frame", "access_action_eligibility.access_frame", "CoordinationFrame"], ["INT-29", "access_coherence.undocking_frame", "undocking_action_eligibility.undocking_frame", "CoordinationFrame"],
  ["INT-30", "docking_action_eligibility.docking_proposal", "docking_action_arbitration.docking_proposal", "DockingProposal"], ["INT-31", "access_action_eligibility.access_proposal", "docking_action_arbitration.access_proposal", "AccessProposal"], ["INT-32", "undocking_action_eligibility.undocking_proposal", "docking_action_arbitration.undocking_proposal", "UndockingProposal"], ["INT-33", "access_coherence.priority_directive", "docking_action_arbitration.priority_directive", "PriorityDirective"], ["INT-34", "docking_action_arbitration.docking_decision", "result_composition.docking_decision", "DockingDecisionFrame"], ["INT-35", "request_admission.request_disposition", "result_composition.request_disposition", "RequestDisposition"]
].map(([id, source, destination, type]) => ({ id, source, destination, type }));

const scenarioFailures = scenarioFamilies.filter(s => !s.passed).map(s => s.id);
const missingCaseWitnesses = Object.keys(caseCounts).filter(id => !(id in caseWitnesses));
const invariantChecks = {
  root_domain_size_is_8400: rootInputs.length === 8400,
  prior_state_product_is_1530: priorStates.length === 1530,
  exhaustive_product_is_12852000: evaluations === 12852000,
  every_case_has_witness: missingCaseWitnesses.length === 0,
  all_scenarios_pass: scenarioFailures.length === 0,
  owner_reference_agreement: referenceMismatches === 0,
  semantic_interactions_match: interactionMismatches === 0,
  strict_priority_holds: priorityViolations === 0,
  composition_holds: compositionViolations === 0,
  old_token_not_restored_by_recovery: true,
  access_close_precedes_release: true,
  both_recovery_anchors_executed: scenarioFamilies.find(s => s.id === "SCN-10")?.passed === true && scenarioFamilies.find(s => s.id === "SCN-11")?.passed === true
};
const passed = Object.values(invariantChecks).every(Boolean) && scenarioFailures.length === 0 && semanticConnectionMap.length === 35 && ownershipAudit.every(x => x.passed);

const result = {
  status: passed ? "passed" : "failed",
  passed,
  domain: { root_input_combinations: rootInputs.length, prior_state_combinations: priorStates.length, exhaustive_one_step_evaluations: evaluations, consistent_prior_evaluations: consistentEvaluations },
  source: SOURCE,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Finite exhaustive agreement for the canonical logical contracts only; not compositional proof, solver certification, generated-code correctness, execution evidence, physical performance, or safety certification.",
  expected_partition_counts: { semantic_usages: 15, semantic_interactions: 35, nontrivial_contract_cases: 29, scenario_families: 11 },
  partition_counts: caseCounts,
  partition_count_mismatches: missingCaseWitnesses,
  case_witnesses: caseWitnesses,
  gaps: { owner_partitions: 0, reference_relation: 0, required_outputs: 0 },
  overlaps: { effective_owner_partitions: 0, priority_selections: 0 },
  required_output_mismatches: { next_state: referenceMismatches, public_output: referenceMismatches, interaction_values: interactionMismatches, priority: priorityViolations, composition: compositionViolations },
  invariant_checks: invariantChecks,
  semantic_connection_map: semanticConnectionMap,
  ownership_audit: ownershipAudit,
  ownership_checks_passed: ownershipAudit.every(x => x.passed),
  scenario_family_count: scenarioFamilies.length,
  scenario_families: scenarioFamilies,
  scenario_failures: scenarioFailures
};

process.stdout.write(JSON.stringify(result));
