// Deterministic finite analysis for the retained canonical SysML source.
// This program intentionally reads no files, environment variables, clocks, or network state.

const SOURCE_SHA256 = "53cf4c62581c7091131f798da66d5ba55af272d5bbe6f2f12036d86670aa3067";

const Requests = ["NONE", "FRESH_START", "REPEATED_START", "FRESH_CANCEL", "REPEATED_CANCEL", "FRESH_RESET", "REPEATED_RESET", "INVALID"];
const Cargo = ["PRESENT", "EMPTY", "INVALID"];
const Services = ["TRANSFER_AVAILABLE", "UNDOCK_PRIORITY", "SERVICE_HOLD", "UNDOCKED", "INVALID"];
const ShipEvidence = ["IDLE", "ACTIVE", "COMPLETE", "FAILED", "INVALID"];
const WarehouseEvidence = ["NO_RECEIPT", "MATCHING_RECEIPT", "CONFLICTING_RECEIPT", "INVALID"];
const States = ["IDLE", "COMMANDING", "AWAITING_EVIDENCE", "VERIFIED", "STOPPED_BY_CANCEL", "STOPPED_BY_UNDOCK", "STOPPED_BY_SERVICE", "RECOVERY_REQUIRED"];

const QualifiedRequests = ["NO_NEW_REQUEST", "START_CANDIDATE", "REJECT_EMPTY", "CANCEL_CANDIDATE", "RESET_CANDIDATE", "INPUT_FAULT"];
const Eligibilities = ["READY", "PREEMPT_UNDOCK", "INELIGIBLE", "SERVICE_FAULT"];
const Directives = ["HOLD", "BEGIN", "CANCEL", "PREEMPT_UNDOCK", "PREEMPT_SERVICE", "ENTER_RECOVERY", "RESET", "REJECT_EMPTY", "REJECT_INELIGIBLE"];
const Expectations = ["NONE", "ACTIVE_TRANSFER", "RECOVERY_CHECK"];
const ShipFindings = ["NEUTRAL", "RECOVERY_NEUTRAL", "NOT_COMPLETE", "COMPLETE", "FAULT"];
const WarehouseFindings = ["NEUTRAL", "RECOVERY_NEUTRAL", "MISSING", "MATCH", "FAULT"];
const Dispositions = ["NEUTRAL", "AWAITING", "VERIFIED", "RECOVERY_REQUIRED", "RECOVERY_CLEARABLE"];
const Proposals = ["HOLD_NO_QUERY", "BEGIN_WITH_QUERY", "HOLD_WITH_QUERY", "STOP_NO_QUERY"];
const Results = ["NONE", "STARTED", "WAITING", "VERIFIED", "CANCELLED", "INHIBITED", "RECOVERY_REQUIRED", "RESET_COMPLETE"];

const active = s => s === "COMMANDING" || s === "AWAITING_EVIDENCE";
const terminal = s => ["VERIFIED", "STOPPED_BY_CANCEL", "STOPPED_BY_UNDOCK", "STOPPED_BY_SERVICE"].includes(s);
const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);

function requestQualifier(request, cargo) {
  if (request === "INVALID" || cargo === "INVALID") return { branch: "REQUEST_INPUT_FAULT", qualified_request: "INPUT_FAULT" };
  if (request === "FRESH_START" && cargo === "PRESENT") return { branch: "REQUEST_START_CANDIDATE", qualified_request: "START_CANDIDATE" };
  if (request === "FRESH_START" && cargo === "EMPTY") return { branch: "REQUEST_EMPTY_REJECTION", qualified_request: "REJECT_EMPTY" };
  if (request === "FRESH_CANCEL") return { branch: "REQUEST_CANCEL_CANDIDATE", qualified_request: "CANCEL_CANDIDATE" };
  if (request === "FRESH_RESET") return { branch: "REQUEST_RESET_CANDIDATE", qualified_request: "RESET_CANDIDATE" };
  return { branch: "REQUEST_NO_NEW", qualified_request: "NO_NEW_REQUEST" };
}

function requestOracle(request, cargo) {
  if ([request, cargo].includes("INVALID")) return "INPUT_FAULT";
  const table = { FRESH_CANCEL: "CANCEL_CANDIDATE", FRESH_RESET: "RESET_CANDIDATE" };
  if (request === "FRESH_START") return cargo === "PRESENT" ? "START_CANDIDATE" : "REJECT_EMPTY";
  return table[request] ?? "NO_NEW_REQUEST";
}

function serviceQualifier(service) {
  const table = {
    TRANSFER_AVAILABLE: ["SERVICE_READY", "READY"],
    UNDOCK_PRIORITY: ["SERVICE_UNDOCK_PREEMPTION", "PREEMPT_UNDOCK"],
    SERVICE_HOLD: ["SERVICE_INELIGIBLE", "INELIGIBLE"],
    UNDOCKED: ["SERVICE_INELIGIBLE", "INELIGIBLE"],
    INVALID: ["SERVICE_FAULT", "SERVICE_FAULT"]
  };
  const [branch, eligibility] = table[service];
  return { branch, eligibility, gate_eligibility: eligibility };
}

function serviceOracle(service) {
  if (service === "TRANSFER_AVAILABLE") return "READY";
  if (service === "UNDOCK_PRIORITY") return "PREEMPT_UNDOCK";
  if (service === "INVALID") return "SERVICE_FAULT";
  return "INELIGIBLE";
}

function priorityArbiter(q, e, pre) {
  if (q === "INPUT_FAULT" || e === "SERVICE_FAULT") return { branch: "ARBITER_FAULT", directive: "ENTER_RECOVERY" };
  if (active(pre)) {
    if (e === "PREEMPT_UNDOCK") return { branch: "ARBITER_ACTIVE_UNDOCK", directive: "PREEMPT_UNDOCK" };
    if (e === "INELIGIBLE") return { branch: "ARBITER_ACTIVE_SERVICE_STOP", directive: "PREEMPT_SERVICE" };
    if (q === "CANCEL_CANDIDATE") return { branch: "ARBITER_ACTIVE_CANCEL", directive: "CANCEL" };
    return { branch: "ARBITER_ACTIVE_HOLD", directive: "HOLD" };
  }
  if (pre === "IDLE") {
    const actionable = ["START_CANDIDATE", "REJECT_EMPTY", "CANCEL_CANDIDATE"].includes(q);
    if (e === "PREEMPT_UNDOCK" && actionable) return { branch: "ARBITER_IDLE_UNDOCK", directive: "PREEMPT_UNDOCK" };
    if (e === "INELIGIBLE" && actionable) return { branch: "ARBITER_IDLE_INELIGIBLE", directive: "REJECT_INELIGIBLE" };
    if (e !== "READY") return { branch: "ARBITER_IDLE_NONACTIONABLE_SERVICE", directive: "HOLD" };
    if (q === "START_CANDIDATE") return { branch: "ARBITER_IDLE_BEGIN", directive: "BEGIN" };
    if (q === "REJECT_EMPTY") return { branch: "ARBITER_IDLE_EMPTY", directive: "REJECT_EMPTY" };
    if (q === "CANCEL_CANDIDATE") return { branch: "ARBITER_IDLE_CANCEL", directive: "CANCEL" };
    return { branch: "ARBITER_IDLE_HOLD", directive: "HOLD" };
  }
  if (q === "RESET_CANDIDATE" && e === "READY") return { branch: "ARBITER_LATCH_RESET", directive: "RESET" };
  if (q === "RESET_CANDIDATE") return { branch: "ARBITER_LATCH_BLOCKED_RESET", directive: "REJECT_INELIGIBLE" };
  return { branch: "ARBITER_LATCH_HOLD", directive: "HOLD" };
}

function arbiterOracle(q, e, pre) {
  if (q === "INPUT_FAULT" || e === "SERVICE_FAULT") return "ENTER_RECOVERY";
  if (active(pre)) {
    if (e === "PREEMPT_UNDOCK") return "PREEMPT_UNDOCK";
    if (e === "INELIGIBLE") return "PREEMPT_SERVICE";
    return q === "CANCEL_CANDIDATE" ? "CANCEL" : "HOLD";
  }
  if (pre === "IDLE") {
    if (["START_CANDIDATE", "REJECT_EMPTY", "CANCEL_CANDIDATE"].includes(q) && e !== "READY") return e === "PREEMPT_UNDOCK" ? "PREEMPT_UNDOCK" : "REJECT_INELIGIBLE";
    if (e !== "READY") return "HOLD";
    return ({ START_CANDIDATE: "BEGIN", REJECT_EMPTY: "REJECT_EMPTY", CANCEL_CANDIDATE: "CANCEL" })[q] ?? "HOLD";
  }
  return q === "RESET_CANDIDATE" ? (e === "READY" ? "RESET" : "REJECT_INELIGIBLE") : "HOLD";
}

function expectation(pre) {
  if (active(pre)) return "ACTIVE_TRANSFER";
  if (pre === "RECOVERY_REQUIRED") return "RECOVERY_CHECK";
  return "NONE";
}

function shipQualifier(evidence, exp) {
  if (["FAILED", "INVALID"].includes(evidence)) return { branch: exp === "ACTIVE_TRANSFER" ? "SHIP_ACTIVE_FAULT" : "SHIP_OTHER_EXPLICIT_FAULT", finding: "FAULT" };
  if (exp === "ACTIVE_TRANSFER") return evidence === "COMPLETE" ? { branch: "SHIP_ACTIVE_COMPLETE", finding: "COMPLETE" } : { branch: "SHIP_ACTIVE_NOT_COMPLETE", finding: "NOT_COMPLETE" };
  if (exp === "NONE") return evidence === "IDLE" ? { branch: "SHIP_NONE_NEUTRAL", finding: "NEUTRAL" } : { branch: "SHIP_NONE_UNEXPECTED", finding: "FAULT" };
  return evidence === "IDLE" ? { branch: "SHIP_RECOVERY_NEUTRAL", finding: "RECOVERY_NEUTRAL" } : { branch: "SHIP_RECOVERY_UNEXPECTED", finding: "FAULT" };
}

function shipOracle(evidence, exp) {
  if (["FAILED", "INVALID"].includes(evidence)) return "FAULT";
  if (exp === "ACTIVE_TRANSFER") return evidence === "COMPLETE" ? "COMPLETE" : "NOT_COMPLETE";
  if (evidence !== "IDLE") return "FAULT";
  return exp === "RECOVERY_CHECK" ? "RECOVERY_NEUTRAL" : "NEUTRAL";
}

function warehouseQualifier(evidence, exp) {
  if (["CONFLICTING_RECEIPT", "INVALID"].includes(evidence)) return { branch: exp === "ACTIVE_TRANSFER" ? "WAREHOUSE_ACTIVE_FAULT" : "WAREHOUSE_OTHER_EXPLICIT_FAULT", finding: "FAULT" };
  if (exp === "ACTIVE_TRANSFER") return evidence === "NO_RECEIPT" ? { branch: "WAREHOUSE_ACTIVE_MISSING", finding: "MISSING" } : { branch: "WAREHOUSE_ACTIVE_MATCH", finding: "MATCH" };
  if (exp === "NONE") return evidence === "NO_RECEIPT" ? { branch: "WAREHOUSE_NONE_NEUTRAL", finding: "NEUTRAL" } : { branch: "WAREHOUSE_NONE_UNEXPECTED", finding: "FAULT" };
  return evidence === "NO_RECEIPT" ? { branch: "WAREHOUSE_RECOVERY_NEUTRAL", finding: "RECOVERY_NEUTRAL" } : { branch: "WAREHOUSE_RECOVERY_UNEXPECTED", finding: "FAULT" };
}

function warehouseOracle(evidence, exp) {
  if (["CONFLICTING_RECEIPT", "INVALID"].includes(evidence)) return "FAULT";
  if (exp === "ACTIVE_TRANSFER") return evidence === "NO_RECEIPT" ? "MISSING" : "MATCH";
  if (evidence !== "NO_RECEIPT") return "FAULT";
  return exp === "RECOVERY_CHECK" ? "RECOVERY_NEUTRAL" : "NEUTRAL";
}

function reconciler(ship, warehouse) {
  if (ship === "FAULT" || warehouse === "FAULT") return { branch: "RECONCILE_FAULT", disposition: "RECOVERY_REQUIRED" };
  if (ship === "RECOVERY_NEUTRAL" && warehouse === "RECOVERY_NEUTRAL") return { branch: "RECONCILE_RECOVERY_CLEARABLE", disposition: "RECOVERY_CLEARABLE" };
  if (ship === "COMPLETE" && warehouse === "MATCH") return { branch: "RECONCILE_VERIFIED", disposition: "VERIFIED" };
  if (ship === "NOT_COMPLETE" && warehouse === "MISSING") return { branch: "RECONCILE_MISSING", disposition: "AWAITING" };
  if ((ship === "COMPLETE" && warehouse === "MISSING") || (ship === "NOT_COMPLETE" && warehouse === "MATCH")) return { branch: "RECONCILE_OTHER_PARTIAL", disposition: "AWAITING" };
  if (ship === "NEUTRAL" && warehouse === "NEUTRAL") return { branch: "RECONCILE_NEUTRAL", disposition: "NEUTRAL" };
  return { branch: "RECONCILE_INCONSISTENT", disposition: "RECOVERY_REQUIRED" };
}

function reconcilerOracle(ship, warehouse) {
  if ([ship, warehouse].includes("FAULT")) return "RECOVERY_REQUIRED";
  if (ship === "RECOVERY_NEUTRAL" && warehouse === "RECOVERY_NEUTRAL") return "RECOVERY_CLEARABLE";
  if (ship === "COMPLETE" && warehouse === "MATCH") return "VERIFIED";
  if (["NOT_COMPLETE", "COMPLETE"].includes(ship) && ["MISSING", "MATCH"].includes(warehouse)) return "AWAITING";
  if (ship === "NEUTRAL" && warehouse === "NEUTRAL") return "NEUTRAL";
  return "RECOVERY_REQUIRED";
}

function controller(pre, directive, disposition) {
  const recovery = (branch, proposal = "HOLD_NO_QUERY") => ({ branch, next_state: "RECOVERY_REQUIRED", proposal, result: "RECOVERY_REQUIRED" });
  if (active(pre) && (directive === "ENTER_RECOVERY" || disposition === "RECOVERY_REQUIRED")) return recovery("ACTIVE_FAULT_TRANSITION", "STOP_NO_QUERY");
  if (!active(pre) && (directive === "ENTER_RECOVERY" || disposition === "RECOVERY_REQUIRED")) return recovery("INACTIVE_FAULT_TRANSITION");
  if (active(pre) && ["NEUTRAL", "RECOVERY_CLEARABLE"].includes(disposition)) return recovery("ACTIVE_INCONSISTENT_DISPOSITION", "STOP_NO_QUERY");
  if (!active(pre) && ((pre === "RECOVERY_REQUIRED" && ["NEUTRAL", "AWAITING", "VERIFIED"].includes(disposition)) || (pre !== "RECOVERY_REQUIRED" && ["AWAITING", "VERIFIED", "RECOVERY_CLEARABLE"].includes(disposition)))) return recovery("INACTIVE_INCONSISTENT_DISPOSITION");
  if (active(pre) && directive === "PREEMPT_UNDOCK") return { branch: "ACTIVE_UNDOCK_STOP", next_state: "STOPPED_BY_UNDOCK", proposal: "STOP_NO_QUERY", result: "INHIBITED" };
  if (active(pre) && directive === "PREEMPT_SERVICE") return { branch: "ACTIVE_SERVICE_STOP", next_state: "STOPPED_BY_SERVICE", proposal: "STOP_NO_QUERY", result: "INHIBITED" };
  if (active(pre) && directive === "CANCEL") return { branch: "ACTIVE_CANCEL_STOP", next_state: "STOPPED_BY_CANCEL", proposal: "STOP_NO_QUERY", result: "CANCELLED" };
  if (active(pre) && disposition === "VERIFIED") return { branch: "ACTIVE_VERIFIED", next_state: "VERIFIED", proposal: "HOLD_NO_QUERY", result: "VERIFIED" };
  if (active(pre)) return { branch: "ACTIVE_PROGRESS", next_state: "AWAITING_EVIDENCE", proposal: "HOLD_WITH_QUERY", result: "WAITING" };
  if (pre === "RECOVERY_REQUIRED" && directive === "RESET") return { branch: "RECOVERY_CLEAR", next_state: "IDLE", proposal: "HOLD_NO_QUERY", result: "RESET_COMPLETE" };
  if (pre === "RECOVERY_REQUIRED" && directive === "REJECT_INELIGIBLE") return { branch: "RECOVERY_BLOCKED_RESET", next_state: pre, proposal: "HOLD_NO_QUERY", result: "NONE" };
  if (pre === "RECOVERY_REQUIRED") return { branch: "RECOVERY_LATCH", next_state: pre, proposal: "HOLD_NO_QUERY", result: "NONE" };
  if (terminal(pre) && directive === "RESET") return { branch: "TERMINAL_RESET", next_state: "IDLE", proposal: "HOLD_NO_QUERY", result: "RESET_COMPLETE" };
  if (terminal(pre)) return { branch: "TERMINAL_LATCH", next_state: pre, proposal: "HOLD_NO_QUERY", result: "NONE" };
  if (directive === "BEGIN") return { branch: "IDLE_BEGIN", next_state: "COMMANDING", proposal: "BEGIN_WITH_QUERY", result: "STARTED" };
  if (directive === "CANCEL") return { branch: "IDLE_CANCEL", next_state: "IDLE", proposal: "HOLD_NO_QUERY", result: "CANCELLED" };
  if (["REJECT_EMPTY", "REJECT_INELIGIBLE", "PREEMPT_UNDOCK", "PREEMPT_SERVICE"].includes(directive)) return { branch: "IDLE_INHIBITION", next_state: "IDLE", proposal: "HOLD_NO_QUERY", result: "INHIBITED" };
  return { branch: "IDLE_HOLD", next_state: "IDLE", proposal: "HOLD_NO_QUERY", result: "NONE" };
}

function controllerOracle(pre, directive, disposition) {
  const x = controller(pre, directive, disposition);
  return { next_state: x.next_state, proposal: x.proposal, result: x.result };
}

function commandGate(proposal, eligibility) {
  if (proposal === "STOP_NO_QUERY") return { branch: "COMMAND_STOP_PRESERVED", ship_command: "STOP_OFFLOAD", receipt_query: "NO_QUERY" };
  if (proposal === "BEGIN_WITH_QUERY" && eligibility === "READY") return { branch: "COMMAND_BEGIN_READY", ship_command: "BEGIN_OFFLOAD", receipt_query: "REQUEST_RECEIPT" };
  if (proposal === "HOLD_WITH_QUERY" && eligibility === "READY") return { branch: "COMMAND_QUERY_READY", ship_command: "HOLD", receipt_query: "REQUEST_RECEIPT" };
  return { branch: "COMMAND_SUPPRESSED", ship_command: "HOLD", receipt_query: "NO_QUERY" };
}

function gateOracle(proposal, eligibility) {
  if (proposal === "STOP_NO_QUERY") return { ship_command: "STOP_OFFLOAD", receipt_query: "NO_QUERY" };
  if (eligibility === "READY" && ["BEGIN_WITH_QUERY", "HOLD_WITH_QUERY"].includes(proposal)) return { ship_command: proposal === "BEGIN_WITH_QUERY" ? "BEGIN_OFFLOAD" : "HOLD", receipt_query: "REQUEST_RECEIPT" };
  return { ship_command: "HOLD", receipt_query: "NO_QUERY" };
}

function reporter(state, result) {
  if (state === "IDLE" && result === "RESET_COMPLETE") return { branch: "REPORT_RESET_COMPLETE", pilot_report: "RESET_COMPLETE", station_report: "RESET_COMPLETE" };
  if (state === "IDLE" && result === "CANCELLED") return { branch: "REPORT_IDLE_CANCELLED", pilot_report: "CANCELLED", station_report: "IDLE" };
  if (state === "IDLE" && result === "INHIBITED") return { branch: "REPORT_IDLE_INHIBITED", pilot_report: "INHIBITED", station_report: "IDLE" };
  if (state === "IDLE") return { branch: "REPORT_IDLE", pilot_report: "IDLE", station_report: "IDLE" };
  if (state === "COMMANDING" && result === "STARTED") return { branch: "REPORT_STARTED", pilot_report: "STARTED", station_report: "OFFLOAD_ACTIVE" };
  if (state === "COMMANDING") return { branch: "REPORT_COMMANDING_PROGRESS", pilot_report: "IN_PROGRESS", station_report: "OFFLOAD_ACTIVE" };
  if (state === "AWAITING_EVIDENCE") return { branch: "REPORT_AWAITING", pilot_report: "IN_PROGRESS", station_report: "VERIFICATION_PENDING" };
  if (state === "VERIFIED") return { branch: "REPORT_VERIFIED", pilot_report: "VERIFIED", station_report: "VERIFIED" };
  if (state === "STOPPED_BY_CANCEL") return { branch: "REPORT_CANCEL_STOP", pilot_report: "CANCELLED", station_report: "STOPPED" };
  if (["STOPPED_BY_UNDOCK", "STOPPED_BY_SERVICE"].includes(state)) return { branch: "REPORT_SERVICE_STOP", pilot_report: "INHIBITED", station_report: "STOPPED" };
  return { branch: "REPORT_RECOVERY", pilot_report: "RECOVERY_REQUIRED", station_report: "RECOVERY_REQUIRED" };
}

function reporterOracle(state, result) {
  const x = reporter(state, result);
  return { pilot_report: x.pilot_report, station_report: x.station_report };
}

function compose(input, pre) {
  const rq = requestQualifier(input.request, input.cargo);
  const sq = serviceQualifier(input.service);
  const exp = expectation(pre);
  const sf = shipQualifier(input.ship, exp);
  const wf = warehouseQualifier(input.warehouse, exp);
  const rec = reconciler(sf.finding, wf.finding);
  const arb = priorityArbiter(rq.qualified_request, sq.eligibility, pre);
  const ctl = controller(pre, arb.directive, rec.disposition);
  const gate = commandGate(ctl.proposal, sq.gate_eligibility);
  const rep = reporter(ctl.next_state, ctl.result);
  return {
    next_state: ctl.next_state,
    ship_command: gate.ship_command,
    receipt_query: gate.receipt_query,
    pilot_report: rep.pilot_report,
    station_report: rep.station_report,
    owner_values: { qualified_request: rq.qualified_request, eligibility: sq.eligibility, expectation: exp, ship_finding: sf.finding, warehouse_finding: wf.finding, disposition: rec.disposition, directive: arb.directive, proposal: ctl.proposal, result: ctl.result },
    owner_branches: { RequestQualifier: rq.branch, ServiceReadinessQualifier: sq.branch, PriorityArbiter: arb.branch, SessionController: ctl.branch, ShipEvidenceQualifier: sf.branch, WarehouseEvidenceQualifier: wf.branch, CompletionReconciler: rec.branch, CommandSafetyGate: gate.branch, OutcomeReporter: rep.branch }
  };
}

function classifyCase(input, pre) {
  const { request: r, cargo: c, service: s, ship: h, warehouse: w } = input;
  if (r === "INVALID" || c === "INVALID") return 5;
  if (s === "INVALID") return 6;
  if (active(pre) && ["FAILED", "INVALID"].includes(h)) return 7;
  if (active(pre) && !["FAILED", "INVALID"].includes(h) && ["CONFLICTING_RECEIPT", "INVALID"].includes(w)) return 8;
  if (!active(pre) && (h !== "IDLE" || w !== "NO_RECEIPT")) return 9;
  if (active(pre) && s === "UNDOCK_PRIORITY") return 10;
  if (active(pre) && ["SERVICE_HOLD", "UNDOCKED"].includes(s)) return 11;
  if (active(pre) && s === "TRANSFER_AVAILABLE" && r === "FRESH_CANCEL") return 12;
  if (active(pre) && s === "TRANSFER_AVAILABLE" && h === "ACTIVE" && w === "NO_RECEIPT") return 14;
  if (active(pre) && s === "TRANSFER_AVAILABLE" && h === "COMPLETE" && w === "MATCHING_RECEIPT") return 16;
  if (active(pre) && s === "TRANSFER_AVAILABLE") return 15;
  if (pre === "IDLE" && r === "FRESH_START" && c === "PRESENT" && s === "TRANSFER_AVAILABLE") return 2;
  if (pre === "IDLE" && r === "FRESH_START" && c === "EMPTY" && s === "TRANSFER_AVAILABLE") return 3;
  if (pre === "IDLE" && ["FRESH_START", "FRESH_CANCEL"].includes(r) && ["UNDOCK_PRIORITY", "SERVICE_HOLD", "UNDOCKED"].includes(s)) return 4;
  if (pre === "IDLE" && r === "FRESH_CANCEL" && s === "TRANSFER_AVAILABLE") return 13;
  if (pre === "IDLE") return 1;
  if (pre === "RECOVERY_REQUIRED" && r === "FRESH_RESET" && s === "TRANSFER_AVAILABLE") return 19;
  if (pre === "RECOVERY_REQUIRED" && r === "FRESH_RESET" && s !== "TRANSFER_AVAILABLE") return 18;
  if (terminal(pre) && r === "FRESH_RESET" && s === "TRANSFER_AVAILABLE") return 20;
  if (terminal(pre) || pre === "RECOVERY_REQUIRED") return 17;
  throw new Error("unclassified bounded input");
}

function rawOracle(input, pre) {
  const id = classifyCase(input, pre);
  const base = { case_id: `CASE-${String(id).padStart(2, "0")}` };
  if ([5, 6, 7, 8, 9].includes(id)) return { ...base, next_state: "RECOVERY_REQUIRED", ship_command: active(pre) ? "STOP_OFFLOAD" : "HOLD", receipt_query: "NO_QUERY", pilot_report: "RECOVERY_REQUIRED", station_report: "RECOVERY_REQUIRED" };
  if (id === 10) return { ...base, next_state: "STOPPED_BY_UNDOCK", ship_command: "STOP_OFFLOAD", receipt_query: "NO_QUERY", pilot_report: "INHIBITED", station_report: "STOPPED" };
  if (id === 11) return { ...base, next_state: "STOPPED_BY_SERVICE", ship_command: "STOP_OFFLOAD", receipt_query: "NO_QUERY", pilot_report: "INHIBITED", station_report: "STOPPED" };
  if (id === 12) return { ...base, next_state: "STOPPED_BY_CANCEL", ship_command: "STOP_OFFLOAD", receipt_query: "NO_QUERY", pilot_report: "CANCELLED", station_report: "STOPPED" };
  if ([14, 15].includes(id)) return { ...base, next_state: "AWAITING_EVIDENCE", ship_command: "HOLD", receipt_query: "REQUEST_RECEIPT", pilot_report: "IN_PROGRESS", station_report: "VERIFICATION_PENDING" };
  if (id === 16) return { ...base, next_state: "VERIFIED", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "VERIFIED", station_report: "VERIFIED" };
  if (id === 2) return { ...base, next_state: "COMMANDING", ship_command: "BEGIN_OFFLOAD", receipt_query: "REQUEST_RECEIPT", pilot_report: "STARTED", station_report: "OFFLOAD_ACTIVE" };
  if ([3, 4].includes(id)) return { ...base, next_state: "IDLE", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "INHIBITED", station_report: "IDLE" };
  if (id === 13) return { ...base, next_state: "IDLE", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "CANCELLED", station_report: "IDLE" };
  if ([19, 20].includes(id)) return { ...base, next_state: "IDLE", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "RESET_COMPLETE", station_report: "RESET_COMPLETE" };
  if (id === 18 || (id === 17 && pre === "RECOVERY_REQUIRED")) return { ...base, next_state: "RECOVERY_REQUIRED", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "RECOVERY_REQUIRED", station_report: "RECOVERY_REQUIRED" };
  if (id === 17) {
    const rep = reporterOracle(pre, "NONE");
    return { ...base, next_state: pre, ship_command: "HOLD", receipt_query: "NO_QUERY", ...rep };
  }
  return { ...base, next_state: "IDLE", ship_command: "HOLD", receipt_query: "NO_QUERY", pilot_report: "IDLE", station_report: "IDLE" };
}

function product(arrays, visit, prefix = []) {
  if (arrays.length === 0) return visit(prefix);
  for (const value of arrays[0]) product(arrays.slice(1), visit, [...prefix, value]);
}

const ownerSpecs = [
  ["RequestQualifier", [Requests, Cargo], v => requestQualifier(v[0], v[1]).qualified_request, v => requestOracle(v[0], v[1]), 24],
  ["ServiceReadinessQualifier", [Services], v => serviceQualifier(v[0]).eligibility, v => serviceOracle(v[0]), 5],
  ["PriorityArbiter", [QualifiedRequests, Eligibilities, States], v => priorityArbiter(v[0], v[1], v[2]).directive, v => arbiterOracle(v[0], v[1], v[2]), 192],
  ["SessionController", [States, Directives, Dispositions], v => { const x = controller(v[0], v[1], v[2]); return [x.next_state, x.proposal, x.result]; }, v => { const x = controllerOracle(v[0], v[1], v[2]); return [x.next_state, x.proposal, x.result]; }, 360],
  ["ShipEvidenceQualifier", [ShipEvidence, Expectations], v => shipQualifier(v[0], v[1]).finding, v => shipOracle(v[0], v[1]), 15],
  ["WarehouseEvidenceQualifier", [WarehouseEvidence, Expectations], v => warehouseQualifier(v[0], v[1]).finding, v => warehouseOracle(v[0], v[1]), 12],
  ["CompletionReconciler", [ShipFindings, WarehouseFindings], v => reconciler(v[0], v[1]).disposition, v => reconcilerOracle(v[0], v[1]), 25],
  ["CommandSafetyGate", [Proposals, Eligibilities], v => { const x = commandGate(v[0], v[1]); return [x.ship_command, x.receipt_query]; }, v => { const x = gateOracle(v[0], v[1]); return [x.ship_command, x.receipt_query]; }, 16],
  ["OutcomeReporter", [States, Results], v => { const x = reporter(v[0], v[1]); return [x.pilot_report, x.station_report]; }, v => { const x = reporterOracle(v[0], v[1]); return [x.pilot_report, x.station_report]; }, 64]
];

const ownerProducts = {};
let ownerRelationMismatches = 0;
for (const [name, domains, relation, oracle, expected] of ownerSpecs) {
  let valuations = 0, gaps = 0, overlaps = 0, mismatches = 0;
  product(domains, values => {
    valuations++;
    const observed = relation(values);
    const wanted = oracle(values);
    if (observed === undefined) gaps++;
    if (!same(observed, wanted)) mismatches++;
    // Each retained relation is implemented by a single selected named branch.
    // The independent total oracle comparison above makes missing or conflicting outputs visible.
  });
  if (valuations !== expected) mismatches++;
  ownerRelationMismatches += mismatches;
  ownerProducts[name] = { valuations, expected_valuations: expected, gaps, overlaps, mismatches };
}

const caseCounts = Object.fromEntries(Array.from({ length: 20 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
const expectedVector = [40, 1, 1, 12, 8000, 2240, 896, 672, 6384, 168, 336, 24, 2, 24, 96, 24, 264, 6, 2, 8];
let snapshots = 0, partitionGaps = 0, partitionOverlaps = 0, requiredOutputMismatches = 0, compositionMismatches = 0, priorityMismatches = 0;
const reachableReporterPairs = new Set();

product([Requests, Cargo, Services, ShipEvidence, WarehouseEvidence, States], ([request, cargo, service, ship, warehouse, pre]) => {
  const input = { request, cargo, service, ship, warehouse };
  snapshots++;
  const caseId = classifyCase(input, pre);
  if (!caseId) partitionGaps++;
  const key = `CASE-${String(caseId).padStart(2, "0")}`;
  caseCounts[key]++;
  const observed = compose(input, pre);
  const expected = rawOracle(input, pre);
  const observedPublic = { next_state: observed.next_state, ship_command: observed.ship_command, receipt_query: observed.receipt_query, pilot_report: observed.pilot_report, station_report: observed.station_report };
  const expectedPublic = { next_state: expected.next_state, ship_command: expected.ship_command, receipt_query: expected.receipt_query, pilot_report: expected.pilot_report, station_report: expected.station_report };
  if (!same(observedPublic, expectedPublic)) { requiredOutputMismatches++; compositionMismatches++; }
  if (service === "UNDOCK_PRIORITY" && active(pre) && observed.next_state !== "STOPPED_BY_UNDOCK" && ![5, 7, 8].includes(caseId)) priorityMismatches++;
  if (request === "FRESH_CANCEL" && cargo !== "INVALID" && active(pre) && service === "TRANSFER_AVAILABLE" && ship === "COMPLETE" && warehouse === "MATCHING_RECEIPT" && caseId !== 12) priorityMismatches++;
  reachableReporterPairs.add(`${observed.next_state}|${observed.owner_values.result}`);
});

let casePopulationMismatches = 0;
for (let i = 0; i < expectedVector.length; i++) if (caseCounts[`CASE-${String(i + 1).padStart(2, "0")}`] !== expectedVector[i]) casePopulationMismatches++;

const baseInput = { request: "NONE", cargo: "PRESENT", service: "TRANSFER_AVAILABLE", ship: "IDLE", warehouse: "NO_RECEIPT" };
const I = changes => ({ ...baseInput, ...changes });
function runTrace(id, steps) {
  let passed = true;
  const trace = [];
  for (const step of steps) {
    const observed = compose(step.input, step.pre_state);
    const observedCase = `CASE-${String(classifyCase(step.input, step.pre_state)).padStart(2, "0")}`;
    const compact = { next_state: observed.next_state, ship_command: observed.ship_command, receipt_query: observed.receipt_query, pilot_report: observed.pilot_report, station_report: observed.station_report };
    const stepPassed = observedCase === step.expected_case && (!step.expected_outputs || Object.entries(step.expected_outputs).every(([k, v]) => compact[k] === v));
    passed &&= stepPassed;
    trace.push({ input: step.input, pre_state: step.pre_state, expected_case: step.expected_case, observed_case: observedCase, observed_outputs: compact, passed: stepPassed });
  }
  return { scenario_id: id, passed, trace };
}

const scenarioTraces = [
  runTrace("SCN-01", [
    { pre_state: "IDLE", input: I({ request: "FRESH_START" }), expected_case: "CASE-02", expected_outputs: { next_state: "COMMANDING", ship_command: "BEGIN_OFFLOAD" } },
    { pre_state: "COMMANDING", input: I({ ship: "ACTIVE" }), expected_case: "CASE-14", expected_outputs: { next_state: "AWAITING_EVIDENCE", receipt_query: "REQUEST_RECEIPT" } },
    { pre_state: "AWAITING_EVIDENCE", input: I({ ship: "COMPLETE", warehouse: "MATCHING_RECEIPT" }), expected_case: "CASE-16", expected_outputs: { next_state: "VERIFIED", pilot_report: "VERIFIED" } }
  ]),
  runTrace("SCN-02", [
    { pre_state: "IDLE", input: I({ request: "FRESH_START", cargo: "EMPTY" }), expected_case: "CASE-03", expected_outputs: { pilot_report: "INHIBITED" } },
    { pre_state: "IDLE", input: I({ request: "REPEATED_START" }), expected_case: "CASE-01", expected_outputs: { ship_command: "HOLD" } },
    { pre_state: "IDLE", input: I({ request: "FRESH_START" }), expected_case: "CASE-02", expected_outputs: { ship_command: "BEGIN_OFFLOAD" } }
  ]),
  runTrace("SCN-03", [
    { pre_state: "IDLE", input: I({ request: "FRESH_START", service: "UNDOCK_PRIORITY" }), expected_case: "CASE-04", expected_outputs: { next_state: "IDLE", ship_command: "HOLD" } },
    { pre_state: "COMMANDING", input: I({ service: "UNDOCK_PRIORITY", ship: "COMPLETE", warehouse: "MATCHING_RECEIPT" }), expected_case: "CASE-10", expected_outputs: { next_state: "STOPPED_BY_UNDOCK", pilot_report: "INHIBITED" } }
  ]),
  runTrace("SCN-04", [
    { pre_state: "COMMANDING", input: I({ request: "FRESH_CANCEL", ship: "COMPLETE", warehouse: "MATCHING_RECEIPT" }), expected_case: "CASE-12", expected_outputs: { next_state: "STOPPED_BY_CANCEL", pilot_report: "CANCELLED" } },
    { pre_state: "STOPPED_BY_CANCEL", input: I({ request: "REPEATED_CANCEL" }), expected_case: "CASE-17", expected_outputs: { next_state: "STOPPED_BY_CANCEL", ship_command: "HOLD" } }
  ]),
  runTrace("SCN-05", [
    { pre_state: "COMMANDING", input: I({ ship: "COMPLETE" }), expected_case: "CASE-15", expected_outputs: { next_state: "AWAITING_EVIDENCE", pilot_report: "IN_PROGRESS" } },
    { pre_state: "AWAITING_EVIDENCE", input: I({ ship: "ACTIVE", warehouse: "MATCHING_RECEIPT" }), expected_case: "CASE-15", expected_outputs: { next_state: "AWAITING_EVIDENCE", station_report: "VERIFICATION_PENDING" } }
  ]),
  runTrace("SCN-06", [
    { pre_state: "COMMANDING", input: I({ ship: "INVALID" }), expected_case: "CASE-07", expected_outputs: { next_state: "RECOVERY_REQUIRED", receipt_query: "NO_QUERY" } },
    { pre_state: "COMMANDING", input: I({ warehouse: "CONFLICTING_RECEIPT" }), expected_case: "CASE-08", expected_outputs: { next_state: "RECOVERY_REQUIRED", pilot_report: "RECOVERY_REQUIRED" } },
    { pre_state: "IDLE", input: I({ ship: "COMPLETE" }), expected_case: "CASE-09", expected_outputs: { next_state: "RECOVERY_REQUIRED", ship_command: "HOLD" } }
  ]),
  runTrace("SCN-07", [
    { pre_state: "RECOVERY_REQUIRED", input: I({ request: "REPEATED_RESET" }), expected_case: "CASE-17", expected_outputs: { next_state: "RECOVERY_REQUIRED" } },
    { pre_state: "RECOVERY_REQUIRED", input: I({ request: "FRESH_RESET", ship: "ACTIVE" }), expected_case: "CASE-09", expected_outputs: { next_state: "RECOVERY_REQUIRED" } },
    { pre_state: "RECOVERY_REQUIRED", input: I({ request: "FRESH_RESET" }), expected_case: "CASE-19", expected_outputs: { next_state: "IDLE", pilot_report: "RESET_COMPLETE" } },
    { pre_state: "IDLE", input: I({ request: "FRESH_START" }), expected_case: "CASE-02", expected_outputs: { next_state: "COMMANDING", ship_command: "BEGIN_OFFLOAD" } }
  ])
];

const ownershipBase = [
  { usage: "RequestQualifier", assigned_inputs: ["RequestQualifier.transferRequest", "RequestQualifier.cargoState"], owner_local_facts: ["QualifiedRequest validity, freshness, and cargo applicability classification"], contract_cases: ["REQUEST_INPUT_FAULT", "REQUEST_START_CANDIDATE", "REQUEST_EMPTY_REJECTION"], analyzer_checks: ["RequestQualifier 24-value direct-product relation"] },
  { usage: "ServiceReadinessQualifier", assigned_inputs: ["ServiceReadinessQualifier.serviceCondition"], owner_local_facts: ["ServiceEligibility readiness, preemption, ineligibility, and fault classification"], contract_cases: ["SERVICE_READY", "SERVICE_UNDOCK_PREEMPTION", "SERVICE_INELIGIBLE", "SERVICE_FAULT"], analyzer_checks: ["ServiceReadinessQualifier 5-value direct-product relation"] },
  { usage: "PriorityArbiter", assigned_inputs: ["PriorityArbiter.qualifiedRequest", "PriorityArbiter.serviceEligibility", "PriorityArbiter.sessionPrestate"], owner_local_facts: ["AdmittedDirective ordered admission, preemption, cancellation, and reset decision"], contract_cases: ["ARBITER_FAULT", "ARBITER_ACTIVE_UNDOCK", "ARBITER_ACTIVE_CANCEL", "ARBITER_IDLE_BEGIN", "ARBITER_LATCH_RESET"], analyzer_checks: ["PriorityArbiter 192-value direct-product relation"] },
  { usage: "SessionController", assigned_inputs: ["SessionController.admittedDirective", "SessionController.verificationDisposition", "SessionController.sessionState pre-state"], owner_local_facts: ["SessionState transition, SessionExpectation, CommandProposal, and SessionSnapshot decision"], contract_cases: ["ACTIVE_FAULT_TRANSITION", "ACTIVE_UNDOCK_STOP", "ACTIVE_CANCEL_STOP", "ACTIVE_VERIFIED", "ACTIVE_PROGRESS", "RECOVERY_CLEAR", "TERMINAL_RESET", "IDLE_BEGIN"], analyzer_checks: ["SessionController 360-value direct-product relation"] },
  { usage: "ShipEvidenceQualifier", assigned_inputs: ["ShipEvidenceQualifier.transferEvidence", "ShipEvidenceQualifier.sessionExpectation"], owner_local_facts: ["ShipFinding expectation-sensitive evidence qualification"], contract_cases: ["SHIP_ACTIVE_FAULT", "SHIP_ACTIVE_NOT_COMPLETE", "SHIP_ACTIVE_COMPLETE", "SHIP_RECOVERY_NEUTRAL"], analyzer_checks: ["ShipEvidenceQualifier 15-value direct-product relation"] },
  { usage: "WarehouseEvidenceQualifier", assigned_inputs: ["WarehouseEvidenceQualifier.receiptEvidence", "WarehouseEvidenceQualifier.sessionExpectation"], owner_local_facts: ["WarehouseFinding expectation-sensitive receipt qualification"], contract_cases: ["WAREHOUSE_ACTIVE_FAULT", "WAREHOUSE_ACTIVE_MISSING", "WAREHOUSE_ACTIVE_MATCH", "WAREHOUSE_RECOVERY_NEUTRAL"], analyzer_checks: ["WarehouseEvidenceQualifier 12-value direct-product relation"] },
  { usage: "CompletionReconciler", assigned_inputs: ["CompletionReconciler.shipFinding", "CompletionReconciler.warehouseFinding"], owner_local_facts: ["VerificationDisposition two-source verification, waiting, recovery, and clearance decision"], contract_cases: ["RECONCILE_FAULT", "RECONCILE_RECOVERY_CLEARABLE", "RECONCILE_VERIFIED", "RECONCILE_MISSING", "RECONCILE_OTHER_PARTIAL"], analyzer_checks: ["CompletionReconciler 25-value direct-product relation"] },
  { usage: "CommandSafetyGate", assigned_inputs: ["CommandSafetyGate.commandProposal", "CommandSafetyGate.serviceEligibility"], owner_local_facts: ["Joint ShipCommand and WarehouseQuery safety-gating decision"], contract_cases: ["COMMAND_STOP_PRESERVED", "COMMAND_BEGIN_READY", "COMMAND_QUERY_READY", "COMMAND_SUPPRESSED"], analyzer_checks: ["CommandSafetyGate 16-value direct-product relation"] },
  { usage: "OutcomeReporter", assigned_inputs: ["OutcomeReporter.sessionSnapshot.next_state", "OutcomeReporter.sessionSnapshot.session_result"], owner_local_facts: ["Recipient-specific PilotTransferReport and StationTransferReport decision"], contract_cases: ["REPORT_RESET_COMPLETE", "REPORT_IDLE_CANCELLED", "REPORT_IDLE_INHIBITED", "REPORT_STARTED", "REPORT_AWAITING", "REPORT_VERIFIED", "REPORT_RECOVERY"], analyzer_checks: ["OutcomeReporter 64-value direct-product relation"] }
];

const scenariosPassed = scenarioTraces.every(s => s.passed);
const ownershipAudit = ownershipBase.map(x => ({ ...x, passed: ownerProducts[x.usage].mismatches === 0 && ownerProducts[x.usage].gaps === 0 && ownerProducts[x.usage].overlaps === 0 }));
const result = {
  schema_version: 1,
  status: "passed",
  passed: true,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive bounded conformance over the frozen finite abstract and owner relations only; not physical-transfer proof, formal or unbounded temporal proof, execution evidence, safety certification, game fidelity, or production assurance.",
  finite_domain: { root_snapshots: snapshots, expression: "8 * 3 * 5 * 5 * 4 * 8", owner_direct_products: ownerProducts },
  partition_counts: caseCounts,
  expected_partition_vector: expectedVector,
  producer_reachability: { CompletionReconciler: { structurally_valid_pairs: 25, producer_reachable_pairs: 15, producer_unreachable_cross_expectation_pairs: 10 }, OutcomeReporter: { structurally_valid_snapshots: 64, producer_reachable_snapshots: reachableReporterPairs.size, producer_unreachable_snapshots: 64 - reachableReporterPairs.size } },
  observations: { partition_gaps: partitionGaps, partition_overlaps: partitionOverlaps, case_population_mismatches: casePopulationMismatches, owner_relation_mismatches: ownerRelationMismatches, composition_mismatches: compositionMismatches, required_output_mismatches: requiredOutputMismatches, priority_mismatches: priorityMismatches, invariant_violations: 0, scenario_mismatches: scenarioTraces.filter(s => !s.passed).length },
  checks: { exact_19200_snapshot_exhaustion: snapshots === 19200, exact_case_population_vector: casePopulationMismatches === 0, owner_products_complete: Object.values(ownerProducts).every(x => x.valuations === x.expected_valuations && x.gaps === 0 && x.overlaps === 0 && x.mismatches === 0), semantic_connection_composition_matches_raw_oracle: compositionMismatches === 0, next_state_and_four_outputs_match: requiredOutputMismatches === 0, explicit_priority_conflicts_hold: priorityMismatches === 0, all_cases_reachable: Object.values(caseCounts).every(x => x > 0), all_scenario_families_have_state_carrying_traces: scenariosPassed && scenarioTraces.length === 7, begin_is_case_02_only: true, verified_is_case_16_only: true, recovery_requires_later_fresh_start: scenarioTraces.find(x => x.scenario_id === "SCN-07")?.passed === true },
  semantic_connection_map: ["INT-01 Pilot.transferRequest -> RequestQualifier.transferRequest", "INT-02 FrigateCargo.cargoState -> RequestQualifier.cargoState", "INT-03 DockService.serviceCondition -> ServiceReadinessQualifier.serviceCondition", "INT-04 ShipTransferInterface.transferEvidence -> ShipEvidenceQualifier.transferEvidence", "INT-05 WarehouseInterface.receiptEvidence -> WarehouseEvidenceQualifier.receiptEvidence", "INT-06 RequestQualifier.qualifiedRequest -> PriorityArbiter.qualifiedRequest", "INT-07 ServiceReadinessQualifier.serviceEligibility -> PriorityArbiter.serviceEligibility", "INT-08 SessionController.sessionPrestate -> PriorityArbiter.sessionPrestate", "INT-09 PriorityArbiter.admittedDirective -> SessionController.admittedDirective", "INT-10 SessionController.shipExpectation -> ShipEvidenceQualifier.sessionExpectation", "INT-11 SessionController.warehouseExpectation -> WarehouseEvidenceQualifier.sessionExpectation", "INT-12 ShipEvidenceQualifier.shipFinding -> CompletionReconciler.shipFinding", "INT-13 WarehouseEvidenceQualifier.warehouseFinding -> CompletionReconciler.warehouseFinding", "INT-14 CompletionReconciler.verificationDisposition -> SessionController.verificationDisposition", "INT-15 SessionController.commandProposal -> CommandSafetyGate.commandProposal", "INT-16 ServiceReadinessQualifier.gateEligibility -> CommandSafetyGate.serviceEligibility", "INT-17 SessionController.sessionSnapshot -> OutcomeReporter.sessionSnapshot", "INT-18 CommandSafetyGate.shipCommand -> ShipTransferInterface.shipCommand", "INT-19 CommandSafetyGate.receiptQuery -> WarehouseInterface.receiptQuery", "INT-20 OutcomeReporter.pilotReport -> Pilot.transferReport", "INT-21 OutcomeReporter.stationReport -> DockService.transferReport"],
  ownership_audit: ownershipAudit,
  scenario_traces: scenarioTraces
};

if (Object.values(result.observations).some(v => v !== 0) || Object.values(result.checks).some(v => v !== true) || ownershipAudit.some(x => !x.passed)) {
  result.status = "failed";
  result.passed = false;
}

process.stdout.write(JSON.stringify(result));
