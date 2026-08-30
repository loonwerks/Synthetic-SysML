const V = Object.freeze({
  presence: ["None", "Present"], validity: ["Valid", "Invalid"], work: ["NoWork", "W1", "W2"],
  product: ["AngleProduct", "UnsupportedProduct"], material: ["Ready", "Unavailable"],
  stepDisposition: ["Ready", "Blocked"], event: ["NoEvent", "InProgress", "Completed", "Failed"],
  phase: ["Idle", "Active", "TransferPending", "RecoveryPending", "TerminalComplete", "TerminalFailed"],
  attempt: ["First", "Retry"], steps: [0, 1, 2, 3, 4, 5]
});

const SOURCE_SHA256 = "6021ecad6d6ae12651dea1ecb72ea594b762e6c00d20b60f1e96d0fd08a5de63";
const SOURCE = "model/factory_flow_supervisor.sysml";
const absentRequest = () => ({ presence: "None", validity: "Valid", work_id: "NoWork", product: "AngleProduct" });
const eligibleRequest = (work_id = "W1") => ({ presence: "Present", validity: "Valid", work_id, product: "AngleProduct" });
const malformedRequest = () => ({ presence: "Present", validity: "Invalid", work_id: "W1", product: "AngleProduct" });
const material = (work_id = "W1", disposition = "Ready", validity = "Valid") => ({ validity, work_id, disposition });
const readiness = (step = 0, disposition = "Ready", validity = "Valid") => ({ validity, step, disposition });
const result = (work_id = "NoWork", step = 0, event_kind = "NoEvent", validity = "Valid") => ({ validity, work_id, step, event_kind });
const initialState = () => ({ phase: "Idle", work_id: "NoWork", step: 0, attempt: "First" });
const defaultInput = () => ({ request: absentRequest(), material: material("NoWork", "Unavailable", "Invalid"), readiness: readiness(0, "Blocked", "Invalid"), result: result() });
const successor = step => step === 0 ? 1 : step === 1 ? 2 : step === 2 ? 3 : step === 3 ? 4 : 5;
const targetName = (step, suffix) => ["Heating", "Bending", "Cutting", "Drilling", "Grinding", "Polishing"][step] + suffix;

function modelRequest(request) {
  if (request.presence === "None") return { assessment: "NoRequest", work_id: "NoWork" };
  if (request.validity === "Valid" && (request.work_id === "W1" || request.work_id === "W2") && request.product === "AngleProduct") {
    return { assessment: "Eligible", work_id: request.work_id };
  }
  return { assessment: "Malformed", work_id: "NoWork" };
}
function oracleRequest(request) {
  const absent = request.presence === "None";
  const eligible = !absent && request.validity === "Valid" && ["W1", "W2"].includes(request.work_id) && request.product === "AngleProduct";
  return absent ? { assessment: "NoRequest", work_id: "NoWork" } : eligible ? { assessment: "Eligible", work_id: request.work_id } : { assessment: "Malformed", work_id: "NoWork" };
}

function modelMaterial(admission, observation) {
  if (admission.assessment !== "Eligible" || observation.validity === "Invalid" || observation.work_id !== admission.work_id) return "MaterialUnknown";
  return observation.disposition === "Ready" ? "MaterialReady" : "MaterialUnavailable";
}
function oracleMaterial(admission, observation) {
  const correlated = admission.assessment === "Eligible" && observation.validity === "Valid" && observation.work_id === admission.work_id;
  if (!correlated) return "MaterialUnknown";
  if (observation.disposition === "Unavailable") return "MaterialUnavailable";
  return "MaterialReady";
}

function relevantTarget(context) {
  if (context.phase === "Idle") return 0;
  if (context.phase === "Active") return successor(context.step);
  return context.step;
}
function modelTarget(context, observation) {
  const target = relevantTarget(context);
  if (observation.validity !== "Valid" || observation.step !== target) return targetName(target, "Unknown");
  return targetName(target, observation.disposition === "Ready" ? "Ready" : "Blocked");
}
function oracleTarget(context, observation) {
  const target = context.phase === "Idle" ? 0 : context.phase === "Active" ? (context.step < 5 ? context.step + 1 : 5) : context.step;
  const correlated = observation.validity === "Valid" && observation.step === target;
  const suffix = !correlated ? "Unknown" : observation.disposition === "Blocked" ? "Blocked" : "Ready";
  return targetName(target, suffix);
}

function modelOutcome(context, observation) {
  const correlated = context.phase === "Active" && observation.validity === "Valid" && observation.work_id === context.work_id && observation.step === context.step;
  if (!correlated || observation.event_kind === "NoEvent" || observation.event_kind === "InProgress") return "Preserve";
  if (observation.event_kind === "Completed") return context.step === 5 ? "FinalCompleted" : "IntermediateCompleted";
  return context.attempt === "First" ? "FirstFailure" : "RetryFailure";
}
function oracleOutcome(context, observation) {
  if (context.phase !== "Active") return "Preserve";
  if (observation.validity !== "Valid" || observation.work_id !== context.work_id || observation.step !== context.step) return "Preserve";
  switch (observation.event_kind) {
    case "Completed": return context.step < 5 ? "IntermediateCompleted" : "FinalCompleted";
    case "Failed": return context.attempt === "Retry" ? "RetryFailure" : "FirstFailure";
    default: return "Preserve";
  }
}

function modelPriority(admission, context) {
  const competitor = admission.assessment === "Eligible" ? "Present" : "Absent";
  if (context.phase === "Idle") return { kind: admission.assessment === "Eligible" ? "FreshIntent" : "NoIntent", competitor, assessment: admission.assessment, phase: context.phase, work_id: admission.assessment === "Eligible" ? admission.work_id : "NoWork", step: 0 };
  const kind = context.phase === "Active" ? "ActiveIntent" : context.phase === "TransferPending" ? "TransferIntent" : context.phase === "RecoveryPending" ? "RecoveryIntent" : "ResetIntent";
  return { kind, competitor, assessment: admission.assessment, phase: context.phase, work_id: context.work_id, step: context.step };
}
function oraclePriority(admission, context) {
  let kind;
  if (["TerminalComplete", "TerminalFailed"].includes(context.phase)) kind = "ResetIntent";
  else if (context.phase === "RecoveryPending") kind = "RecoveryIntent";
  else if (context.phase === "TransferPending") kind = "TransferIntent";
  else if (context.phase === "Active") kind = "ActiveIntent";
  else kind = admission.assessment === "Eligible" ? "FreshIntent" : "NoIntent";
  const protectedWork = context.phase !== "Idle";
  return { kind, competitor: admission.assessment === "Eligible" ? "Present" : "Absent", assessment: admission.assessment, phase: context.phase, work_id: protectedWork ? context.work_id : admission.assessment === "Eligible" ? admission.work_id : "NoWork", step: protectedWork ? context.step : 0 };
}

const isReady = target => target.endsWith("Ready");
const isBlocked = target => target.endsWith("Blocked");
const isUnknown = target => target.endsWith("Unknown");
function authorizationGuardIds(intent, materialFact, targetFact, outcomeFact) {
  const ids = [];
  if (intent.kind === "ResetIntent" && intent.phase === "TerminalComplete") ids.push("CASE-01");
  if (intent.kind === "ResetIntent" && intent.phase === "TerminalFailed") ids.push("CASE-02");
  if (intent.kind === "ActiveIntent" && outcomeFact === "Preserve" && intent.competitor === "Absent") ids.push("CASE-03");
  if (intent.kind === "ActiveIntent" && outcomeFact === "Preserve" && intent.competitor === "Present") ids.push("CASE-04");
  if (intent.kind === "ActiveIntent" && outcomeFact === "FinalCompleted") ids.push("CASE-05");
  if (intent.kind === "ActiveIntent" && outcomeFact === "IntermediateCompleted" && isReady(targetFact)) ids.push("CASE-06");
  if (intent.kind === "ActiveIntent" && outcomeFact === "IntermediateCompleted" && !isReady(targetFact)) ids.push("CASE-07");
  if (intent.kind === "ActiveIntent" && outcomeFact === "FirstFailure") ids.push("CASE-08");
  if (intent.kind === "ActiveIntent" && outcomeFact === "RetryFailure") ids.push("CASE-09");
  if (intent.kind === "TransferIntent" && isReady(targetFact)) ids.push("CASE-10");
  if (intent.kind === "TransferIntent" && !isReady(targetFact)) ids.push("CASE-11");
  if (intent.kind === "RecoveryIntent" && isReady(targetFact)) ids.push("CASE-12");
  if (intent.kind === "RecoveryIntent" && !isReady(targetFact)) ids.push("CASE-13");
  if (intent.kind === "NoIntent" && intent.assessment === "NoRequest") ids.push("CASE-14");
  if (intent.kind === "NoIntent" && intent.assessment === "Malformed") ids.push("CASE-15");
  if (intent.kind === "FreshIntent" && materialFact === "MaterialUnavailable") ids.push("CASE-16");
  if (intent.kind === "FreshIntent" && materialFact === "MaterialUnknown") ids.push("CASE-17");
  if (intent.kind === "FreshIntent" && materialFact === "MaterialReady" && isBlocked(targetFact)) ids.push("CASE-18");
  if (intent.kind === "FreshIntent" && materialFact === "MaterialReady" && isUnknown(targetFact)) ids.push("CASE-19");
  if (intent.kind === "FreshIntent" && materialFact === "MaterialReady" && isReady(targetFact)) ids.push("CASE-20");
  return ids;
}
const CASE_EFFECT = Object.freeze({
  "CASE-01": ["ResetComplete", "ResetComplete"], "CASE-02": ["ResetFailed", "ResetFailed"],
  "CASE-03": ["HoldActive", "Processing"], "CASE-04": ["BusyActive", "ProtectedBusy"],
  "CASE-05": ["CompleteProduction", "Completed"], "CASE-06": ["AdvanceNow", "Advanced"],
  "CASE-07": ["HoldTransfer", "TransferWaiting"], "CASE-08": ["EnterRecovery", "RecoveryEntered"],
  "CASE-09": ["FailTerminal", "Failed"], "CASE-10": ["ReleaseTransfer", "TransferReleased"],
  "CASE-11": ["WaitTransfer", "TransferWaiting"], "CASE-12": ["RetryNow", "RecoveryReleased"],
  "CASE-13": ["WaitRecovery", "RecoveryWaiting"], "CASE-14": ["IdleNoRequest", "NoRequest"],
  "CASE-15": ["RejectMalformed", "MalformedRequest"], "CASE-16": ["WaitMaterialUnavailable", "MaterialUnavailable"],
  "CASE-17": ["WaitMaterialUnknown", "MaterialUnknown"], "CASE-18": ["WaitHeatingBlocked", "HeatingBlocked"],
  "CASE-19": ["WaitHeatingUnknown", "HeatingUnknown"], "CASE-20": ["StartWork", "Started"]
});
function modelAuthorize(intent, materialFact, targetFact, outcomeFact) {
  const ids = authorizationGuardIds(intent, materialFact, targetFact, outcomeFact);
  if (ids.length !== 1) return { ids };
  const case_id = ids[0], [decision, reason] = CASE_EFFECT[case_id];
  const empty = case_id === "CASE-14" || case_id === "CASE-15";
  return { ids, case_id, decision, reason, work_id: empty ? "NoWork" : intent.work_id, step: empty ? 0 : intent.step };
}
function oracleAuthorize(intent, materialFact, targetFact, outcomeFact) {
  let case_id;
  if (intent.kind === "ResetIntent") case_id = intent.phase === "TerminalComplete" ? "CASE-01" : "CASE-02";
  else if (intent.kind === "ActiveIntent") {
    if (outcomeFact === "Preserve") case_id = intent.competitor === "Present" ? "CASE-04" : "CASE-03";
    else if (outcomeFact === "FinalCompleted") case_id = "CASE-05";
    else if (outcomeFact === "IntermediateCompleted") case_id = isReady(targetFact) ? "CASE-06" : "CASE-07";
    else case_id = outcomeFact === "FirstFailure" ? "CASE-08" : "CASE-09";
  } else if (intent.kind === "TransferIntent") case_id = isReady(targetFact) ? "CASE-10" : "CASE-11";
  else if (intent.kind === "RecoveryIntent") case_id = isReady(targetFact) ? "CASE-12" : "CASE-13";
  else if (intent.kind === "NoIntent") case_id = intent.assessment === "NoRequest" ? "CASE-14" : "CASE-15";
  else if (materialFact === "MaterialUnavailable") case_id = "CASE-16";
  else if (materialFact === "MaterialUnknown") case_id = "CASE-17";
  else case_id = isReady(targetFact) ? "CASE-20" : isBlocked(targetFact) ? "CASE-18" : "CASE-19";
  const [decision, reason] = CASE_EFFECT[case_id];
  return { case_id, decision, reason, work_id: ["CASE-14", "CASE-15"].includes(case_id) ? "NoWork" : intent.work_id, step: ["CASE-14", "CASE-15"].includes(case_id) ? 0 : intent.step };
}

function modelLedger(pre, auth) {
  let next = { ...pre }, action_kind = "NoCommand", commandWork = pre.work_id, commandStep = pre.step;
  switch (auth.case_id) {
    case "CASE-01": case "CASE-02": case "CASE-14": case "CASE-15": case "CASE-16": case "CASE-17": case "CASE-18": case "CASE-19": next = initialState(); commandWork = "NoWork"; commandStep = 0; break;
    case "CASE-03": case "CASE-04": case "CASE-11": case "CASE-13": break;
    case "CASE-05": next.phase = "TerminalComplete"; break;
    case "CASE-06": next = { phase: "Active", work_id: pre.work_id, step: successor(pre.step), attempt: "First" }; action_kind = "Advance"; commandStep = next.step; break;
    case "CASE-07": next = { phase: "TransferPending", work_id: pre.work_id, step: successor(pre.step), attempt: "First" }; commandStep = next.step; break;
    case "CASE-08": next.phase = "RecoveryPending"; next.attempt = "First"; break;
    case "CASE-09": next.phase = "TerminalFailed"; next.attempt = "Retry"; action_kind = "Abort"; break;
    case "CASE-10": next.phase = "Active"; next.attempt = "First"; action_kind = "Advance"; break;
    case "CASE-12": next.phase = "Active"; next.attempt = "Retry"; action_kind = "Retry"; break;
    case "CASE-20": next = { phase: "Active", work_id: auth.work_id, step: 0, attempt: "First" }; action_kind = "Start"; commandWork = auth.work_id; commandStep = 0; break;
  }
  return { next, command: { action_kind, work_id: commandWork, step: commandStep }, snapshot: { ...next } };
}
function oracleLedger(pre, auth) {
  const c = auth.case_id;
  if (["CASE-01", "CASE-02", "CASE-14", "CASE-15", "CASE-16", "CASE-17", "CASE-18", "CASE-19"].includes(c)) return { next: initialState(), command: { action_kind: "NoCommand", work_id: "NoWork", step: 0 } };
  if (c === "CASE-20") return { next: { phase: "Active", work_id: auth.work_id, step: 0, attempt: "First" }, command: { action_kind: "Start", work_id: auth.work_id, step: 0 } };
  let phase = pre.phase, step = pre.step, attempt = pre.attempt, action_kind = "NoCommand";
  if (c === "CASE-05") phase = "TerminalComplete";
  if (c === "CASE-06") { phase = "Active"; step = successor(pre.step); attempt = "First"; action_kind = "Advance"; }
  if (c === "CASE-07") { phase = "TransferPending"; step = successor(pre.step); attempt = "First"; }
  if (c === "CASE-08") { phase = "RecoveryPending"; attempt = "First"; }
  if (c === "CASE-09") { phase = "TerminalFailed"; attempt = "Retry"; action_kind = "Abort"; }
  if (c === "CASE-10") { phase = "Active"; attempt = "First"; action_kind = "Advance"; }
  if (c === "CASE-12") { phase = "Active"; attempt = "Retry"; action_kind = "Retry"; }
  return { next: { phase, work_id: pre.work_id, step, attempt }, command: { action_kind, work_id: pre.work_id, step } };
}

function modelProductionOutcome(plan, snapshot) {
  if (snapshot.phase === "TerminalComplete" && plan === "FinalCompleted") return { result: "ProductionComplete", work_id: snapshot.work_id };
  if (snapshot.phase === "TerminalFailed" && plan === "RetryFailure") return { result: "ProductionFailed", work_id: snapshot.work_id };
  return { result: "None", work_id: "NoWork" };
}
function oracleProductionOutcome(plan, snapshot) {
  const complete = plan === "FinalCompleted" && snapshot.phase === "TerminalComplete";
  const failed = plan === "RetryFailure" && snapshot.phase === "TerminalFailed";
  return complete ? { result: "ProductionComplete", work_id: snapshot.work_id } : failed ? { result: "ProductionFailed", work_id: snapshot.work_id } : { result: "None", work_id: "NoWork" };
}
function modelStatus(reason, snapshot) {
  if (snapshot.phase === "TerminalComplete") return "Completed";
  if (snapshot.phase === "TerminalFailed") return "Failed";
  if (snapshot.phase === "RecoveryPending") return "Recovering";
  if (snapshot.phase === "TransferPending") return "WaitingStation";
  if (snapshot.phase === "Active" && reason === "RecoveryReleased") return "Recovering";
  if (snapshot.phase === "Active" && ["Advanced", "TransferReleased"].includes(reason)) return "Advanced";
  if (snapshot.phase === "Active" && reason === "Started") return "Started";
  if (snapshot.phase === "Active" && reason === "ProtectedBusy") return "Busy";
  if (snapshot.phase === "Active" && reason === "Processing") return "Processing";
  if (snapshot.phase === "Idle" && reason === "MalformedRequest") return "Rejected";
  if (snapshot.phase === "Idle" && ["MaterialUnavailable", "MaterialUnknown"].includes(reason)) return "WaitingMaterial";
  if (snapshot.phase === "Idle" && ["HeatingBlocked", "HeatingUnknown"].includes(reason)) return "WaitingStation";
  if (snapshot.phase === "Idle" && ["NoRequest", "ResetComplete", "ResetFailed"].includes(reason)) return "Idle";
  return undefined;
}
function oracleStatus(reason, snapshot) {
  switch (snapshot.phase) {
    case "TerminalComplete": return "Completed";
    case "TerminalFailed": return "Failed";
    case "RecoveryPending": return "Recovering";
    case "TransferPending": return "WaitingStation";
    case "Active": return reason === "RecoveryReleased" ? "Recovering" : reason === "Started" ? "Started" : ["Advanced", "TransferReleased"].includes(reason) ? "Advanced" : reason === "ProtectedBusy" ? "Busy" : reason === "Processing" ? "Processing" : undefined;
    case "Idle": return reason === "MalformedRequest" ? "Rejected" : ["MaterialUnavailable", "MaterialUnknown"].includes(reason) ? "WaitingMaterial" : ["HeatingBlocked", "HeatingUnknown"].includes(reason) ? "WaitingStation" : ["NoRequest", "ResetComplete", "ResetFailed"].includes(reason) ? "Idle" : undefined;
  }
}

const semanticConnections = Object.freeze([
  ["INT-01", "root.presentedWork", "PART-01.presentedWork"], ["INT-02", "root.materialObservation", "PART-02.materialObservation"],
  ["INT-03", "root.readinessObservation", "PART-03.readinessObservation"], ["INT-04", "root.processResult", "PART-04.processResult"],
  ["INT-05", "PART-01.admissionToMaterial", "PART-02.admission"], ["INT-06", "PART-01.admissionToPriority", "PART-05.admission"],
  ["INT-07", "PART-02.materialFact", "PART-06.materialFact"], ["INT-08", "PART-03.targetFact", "PART-06.targetFact"],
  ["INT-09", "PART-04.outcomeToAuthorization", "PART-06.outcomeFact"], ["INT-10", "PART-05.intentFact", "PART-06.intentFact"],
  ["INT-11", "PART-06.authorization", "PART-07.authorization"], ["INT-12", "PART-07.preState", "PART-03.flowContext"],
  ["INT-13", "PART-07.preState", "PART-04.flowContext"], ["INT-14", "PART-07.preState", "PART-05.protectionContext"],
  ["INT-15", "PART-04.outcomeToDeterminer", "PART-08.outcomeFact"], ["INT-16", "PART-06.reasonToStatus", "PART-09.decisionReason"],
  ["INT-17", "PART-07.appliedSnapshot", "PART-08.appliedSnapshot"], ["INT-18", "PART-07.appliedSnapshot", "PART-09.appliedSnapshot"],
  ["INT-19", "PART-07.lineCommand", "root.lineCommand"], ["INT-20", "PART-08.productionOutcome", "root.productionOutcome"],
  ["INT-21", "PART-09.flowStatus", "root.flowStatus"]
]);
function compose(pre, input) {
  const int01 = input.request, int02 = input.material, int03 = input.readiness, int04 = input.result;
  const int12 = { ...pre }, int13 = { ...pre }, int14 = { ...pre };
  const part01 = modelRequest(int01);
  const int05 = part01, int06 = part01;
  const int07 = modelMaterial(int05, int02);
  const int08 = modelTarget(int12, int03);
  const int09 = modelOutcome(int13, int04), int15 = int09;
  const int10 = modelPriority(int06, int14);
  const part06 = modelAuthorize(int10, int07, int08, int09);
  if (part06.ids.length !== 1) return { gap: part06.ids.length === 0, overlap: part06.ids.length > 1, ids: part06.ids };
  const int11 = part06, part07 = modelLedger(pre, int11), int17 = part07.snapshot, int18 = part07.snapshot;
  const int16 = part06.reason;
  const int19 = part07.command;
  const int20 = modelProductionOutcome(int15, int17);
  const int21 = modelStatus(int16, int18);
  return { case_id: part06.case_id, next: part07.next, command: int19, outcome: int20, status: int21, facts: { admission: int05, material: int07, target: int08, outcome: int09, intent: int10, authorization: int11 } };
}

const equal = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const ownerStats = Object.fromEntries(["PART-01", "PART-02", "PART-03", "PART-04", "PART-05", "PART-06", "PART-07", "PART-08", "PART-09"].map(k => [k, { evaluated: 0, gaps: 0, overlaps: 0, oracle_mismatches: 0 }]));

for (const presence of V.presence) for (const validity of V.validity) for (const work_id of V.work) for (const product of V.product) {
  const x = { presence, validity, work_id, product }; ownerStats["PART-01"].evaluated++; if (!equal(modelRequest(x), oracleRequest(x))) ownerStats["PART-01"].oracle_mismatches++;
}
const legalAdmissions = [{ assessment: "NoRequest", work_id: "NoWork" }, { assessment: "Malformed", work_id: "NoWork" }, { assessment: "Eligible", work_id: "W1" }, { assessment: "Eligible", work_id: "W2" }];
for (const admission of legalAdmissions) for (const validity of V.validity) for (const work_id of V.work) for (const disposition of V.material) {
  const x = { validity, work_id, disposition }; ownerStats["PART-02"].evaluated++; if (modelMaterial(admission, x) !== oracleMaterial(admission, x)) ownerStats["PART-02"].oracle_mismatches++;
}
for (const phase of V.phase) for (const step of V.steps) for (const validity of V.validity) for (const observedStep of V.steps) for (const disposition of V.stepDisposition) {
  const context = { phase, work_id: "W1", step, attempt: "First" }, x = { validity, step: observedStep, disposition };
  ownerStats["PART-03"].evaluated++; if (modelTarget(context, x) !== oracleTarget(context, x)) ownerStats["PART-03"].oracle_mismatches++;
}
const rawContexts = [];
for (const phase of V.phase) for (const work_id of V.work) for (const step of V.steps) for (const attempt of V.attempt) rawContexts.push({ phase, work_id, step, attempt });
for (const context of rawContexts) for (const validity of V.validity) for (const work_id of V.work) for (const step of V.steps) for (const event_kind of V.event) {
  const x = { validity, work_id, step, event_kind }; ownerStats["PART-04"].evaluated++; if (modelOutcome(context, x) !== oracleOutcome(context, x)) ownerStats["PART-04"].oracle_mismatches++;
}
const intentMap = new Map();
for (const admission of legalAdmissions) for (const context of rawContexts) {
  const a = modelPriority(admission, context), o = oraclePriority(admission, context); ownerStats["PART-05"].evaluated++;
  if (!equal(a, o)) ownerStats["PART-05"].oracle_mismatches++;
  intentMap.set(JSON.stringify(a), a);
}
const targetFacts = V.steps.flatMap(s => [targetName(s, "Ready"), targetName(s, "Blocked"), targetName(s, "Unknown")]);
const outcomeFacts = ["Preserve", "IntermediateCompleted", "FinalCompleted", "FirstFailure", "RetryFailure"];
const materialFacts = ["MaterialReady", "MaterialUnavailable", "MaterialUnknown"];
const caseCounts = Object.fromEntries(Array.from({ length: 20 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));
for (const intent of intentMap.values()) for (const m of materialFacts) for (const t of targetFacts) for (const o of outcomeFacts) {
  const model = modelAuthorize(intent, m, t, o), oracle = oracleAuthorize(intent, m, t, o); ownerStats["PART-06"].evaluated++;
  if (model.ids.length === 0) ownerStats["PART-06"].gaps++;
  if (model.ids.length > 1) ownerStats["PART-06"].overlaps++;
  if (model.ids.length === 1) { caseCounts[model.case_id]++; if (!equal({ case_id: model.case_id, decision: model.decision, reason: model.reason, work_id: model.work_id, step: model.step }, oracle)) ownerStats["PART-06"].oracle_mismatches++; }
}

const representative = {
  "CASE-01": [{ phase: "TerminalComplete", work_id: "W1", step: 5, attempt: "First" }, absentRequest(), "MaterialUnknown", "HeatingUnknown", "Preserve"],
  "CASE-02": [{ phase: "TerminalFailed", work_id: "W1", step: 2, attempt: "Retry" }, absentRequest(), "MaterialUnknown", "CuttingUnknown", "Preserve"],
  "CASE-03": [{ phase: "Active", work_id: "W1", step: 2, attempt: "First" }, absentRequest(), "MaterialUnknown", "DrillingUnknown", "Preserve"],
  "CASE-04": [{ phase: "Active", work_id: "W1", step: 2, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "DrillingUnknown", "Preserve"],
  "CASE-05": [{ phase: "Active", work_id: "W1", step: 5, attempt: "First" }, absentRequest(), "MaterialUnknown", "PolishingUnknown", "FinalCompleted"],
  "CASE-06": [{ phase: "Active", work_id: "W1", step: 2, attempt: "First" }, absentRequest(), "MaterialUnknown", "DrillingReady", "IntermediateCompleted"],
  "CASE-07": [{ phase: "Active", work_id: "W1", step: 2, attempt: "First" }, absentRequest(), "MaterialUnknown", "DrillingBlocked", "IntermediateCompleted"],
  "CASE-08": [{ phase: "Active", work_id: "W1", step: 2, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "DrillingReady", "FirstFailure"],
  "CASE-09": [{ phase: "Active", work_id: "W1", step: 2, attempt: "Retry" }, absentRequest(), "MaterialUnknown", "DrillingReady", "RetryFailure"],
  "CASE-10": [{ phase: "TransferPending", work_id: "W1", step: 3, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "DrillingReady", "Preserve"],
  "CASE-11": [{ phase: "TransferPending", work_id: "W1", step: 3, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "DrillingUnknown", "Preserve"],
  "CASE-12": [{ phase: "RecoveryPending", work_id: "W1", step: 2, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "CuttingReady", "Preserve"],
  "CASE-13": [{ phase: "RecoveryPending", work_id: "W1", step: 2, attempt: "First" }, eligibleRequest("W2"), "MaterialUnknown", "CuttingBlocked", "Preserve"],
  "CASE-14": [initialState(), absentRequest(), "MaterialUnknown", "HeatingUnknown", "Preserve"],
  "CASE-15": [initialState(), malformedRequest(), "MaterialUnknown", "HeatingUnknown", "Preserve"],
  "CASE-16": [initialState(), eligibleRequest("W1"), "MaterialUnavailable", "HeatingReady", "Preserve"],
  "CASE-17": [initialState(), eligibleRequest("W1"), "MaterialUnknown", "HeatingReady", "Preserve"],
  "CASE-18": [initialState(), eligibleRequest("W1"), "MaterialReady", "HeatingBlocked", "Preserve"],
  "CASE-19": [initialState(), eligibleRequest("W1"), "MaterialReady", "HeatingUnknown", "Preserve"],
  "CASE-20": [initialState(), eligibleRequest("W1"), "MaterialReady", "HeatingReady", "Preserve"]
};
for (const [case_id, [pre, request, m, t, o]] of Object.entries(representative)) {
  const admission = modelRequest(request), intent = modelPriority(admission, pre), auth = modelAuthorize(intent, m, t, o), model = modelLedger(pre, auth), oracle = oracleLedger(pre, { ...auth, case_id });
  if (!equal({ next: model.next, command: model.command }, oracle)) ownerStats["PART-07"].oracle_mismatches++;
}
const legalOutcomePairs = new Map(), legalStatusPairs = new Map();
for (const context of rawContexts) for (const admission of legalAdmissions) {
  const intent = modelPriority(admission, context);
  const legalMaterials = admission.assessment === "Eligible" ? materialFacts : ["MaterialUnknown"];
  const target = relevantTarget(context), legalTargets = [targetName(target, "Ready"), targetName(target, "Blocked"), targetName(target, "Unknown")];
  const legalOutcomes = context.phase === "Active" ? outcomeFacts : ["Preserve"];
  for (const m of legalMaterials) for (const t of legalTargets) for (const o of legalOutcomes) {
    const auth = modelAuthorize(intent, m, t, o), model = modelLedger(context, auth), oracle = oracleLedger(context, auth);
    ownerStats["PART-07"].evaluated++;
    if (!equal({ next: model.next, command: model.command }, oracle)) ownerStats["PART-07"].oracle_mismatches++;
    legalOutcomePairs.set(JSON.stringify([o, model.snapshot]), [o, model.snapshot]);
    legalStatusPairs.set(JSON.stringify([auth.reason, model.snapshot]), [auth.reason, model.snapshot]);
  }
}
for (const [plan, snapshot] of legalOutcomePairs.values()) {
  ownerStats["PART-08"].evaluated++;
  if (!equal(modelProductionOutcome(plan, snapshot), oracleProductionOutcome(plan, snapshot))) ownerStats["PART-08"].oracle_mismatches++;
}
for (const [reason, snapshot] of legalStatusPairs.values()) {
  ownerStats["PART-09"].evaluated++;
  if (modelStatus(reason, snapshot) !== oracleStatus(reason, snapshot)) ownerStats["PART-09"].oracle_mismatches++;
}

const rootCounts = Object.fromEntries(Object.keys(caseCounts).map(k => [k, 0]));
let rootEvaluated = 0, rootGaps = 0, rootOverlaps = 0, rootOutputMismatches = 0;
for (const presence of V.presence) for (const requestValidity of V.validity) for (const requestWork of V.work) for (const product of V.product)
for (const materialValidity of V.validity) for (const materialWork of V.work) for (const materialDisposition of V.material)
for (const readinessValidity of V.validity) for (const readinessStep of V.steps) for (const readinessDisposition of V.stepDisposition)
for (const resultValidity of V.validity) for (const resultWork of V.work) for (const resultStep of V.steps) for (const event_kind of V.event) {
  const input = { request: { presence, validity: requestValidity, work_id: requestWork, product }, material: { validity: materialValidity, work_id: materialWork, disposition: materialDisposition }, readiness: { validity: readinessValidity, step: readinessStep, disposition: readinessDisposition }, result: { validity: resultValidity, work_id: resultWork, step: resultStep, event_kind } };
  const observed = compose(initialState(), input); rootEvaluated++;
  if (observed.gap) { rootGaps++; continue; } if (observed.overlap) { rootOverlaps++; continue; }
  rootCounts[observed.case_id]++;
  const admission = oracleRequest(input.request), materialFact = oracleMaterial(admission, input.material), targetFact = oracleTarget(initialState(), input.readiness), intent = oraclePriority(admission, initialState()), auth = oracleAuthorize(intent, materialFact, targetFact, "Preserve"), ledger = oracleLedger(initialState(), auth);
  const expected = { case_id: auth.case_id, next: ledger.next, command: ledger.command, outcome: { result: "None", work_id: "NoWork" }, status: oracleStatus(auth.reason, ledger.next) };
  if (!equal({ case_id: observed.case_id, next: observed.next, command: observed.command, outcome: observed.outcome, status: observed.status }, expected)) rootOutputMismatches++;
}

function inputWith(parts = {}) { const base = defaultInput(); return { ...base, ...parts }; }
function runTrace(name, start, steps) {
  let state = { ...start }, passed = true;
  const observations = steps.map((spec, index) => {
    const observed = compose(state, spec.input), expected = spec.expected;
    const actual = { case_id: observed.case_id, command: observed.command, outcome: observed.outcome, status: observed.status, next: observed.next };
    for (const [key, value] of Object.entries(expected)) if (!equal(actual[key], value)) passed = false;
    state = observed.next;
    return { step: index + 1, input: spec.input, expected_named_branch: expected.case_id, expected, observed: actual };
  });
  return { name, passed, observations };
}
const E = (case_id, action_kind, status, phase, work_id, step, attempt, outcome = "None") => ({ case_id, command: { action_kind, work_id: action_kind === "NoCommand" && phase === "Idle" ? "NoWork" : work_id, step }, outcome: { result: outcome, work_id: outcome === "None" ? "NoWork" : work_id }, status, next: { phase, work_id, step, attempt } });

const scenarios = [];
scenarios.push({ scenario_id: "SCN-01", traces: [runTrace("fresh-W1-start", initialState(), [{ input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") }])] });
scenarios.push({ scenario_id: "SCN-02", traces: [runTrace("fresh-rejection-boundary", initialState(), [
  { input: inputWith(), expected: E("CASE-14", "NoCommand", "Idle", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: malformedRequest() }), expected: E("CASE-15", "NoCommand", "Rejected", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: { presence: "Present", validity: "Valid", work_id: "NoWork", product: "AngleProduct" } }), expected: E("CASE-15", "NoCommand", "Rejected", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: { presence: "Present", validity: "Valid", work_id: "W1", product: "UnsupportedProduct" } }), expected: E("CASE-15", "NoCommand", "Rejected", "Idle", "NoWork", 0, "First") }
])] });
scenarios.push({ scenario_id: "SCN-03", traces: [runTrace("material-partitions", initialState(), [
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1", "Unavailable"), readiness: readiness(0) }), expected: E("CASE-16", "NoCommand", "WaitingMaterial", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1", "Ready", "Invalid"), readiness: readiness(0) }), expected: E("CASE-17", "NoCommand", "WaitingMaterial", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W2"), readiness: readiness(0) }), expected: E("CASE-17", "NoCommand", "WaitingMaterial", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0, "Blocked") }), expected: E("CASE-18", "NoCommand", "WaitingStation", "Idle", "NoWork", 0, "First") }
])] });
scenarios.push({ scenario_id: "SCN-04", traces: [runTrace("station-and-transfer-wait", initialState(), [
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0, "Blocked") }), expected: E("CASE-18", "NoCommand", "WaitingStation", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(1) }), expected: E("CASE-19", "NoCommand", "WaitingStation", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") },
  { input: inputWith({ readiness: readiness(1, "Blocked"), result: result("W1", 0, "Completed") }), expected: E("CASE-07", "NoCommand", "WaitingStation", "TransferPending", "W1", 1, "First") },
  { input: inputWith({ readiness: readiness(1, "Blocked") }), expected: E("CASE-11", "NoCommand", "WaitingStation", "TransferPending", "W1", 1, "First") },
  { input: inputWith({ readiness: readiness(1) }), expected: E("CASE-10", "Advance", "Advanced", "Active", "W1", 1, "First") }
])] });
const nominalSteps = [{ input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") }];
for (let s = 0; s < 5; s++) nominalSteps.push({ input: inputWith({ readiness: readiness(s + 1), result: result("W1", s, "Completed") }), expected: E("CASE-06", "Advance", "Advanced", "Active", "W1", s + 1, "First") });
nominalSteps.push({ input: inputWith({ readiness: readiness(5), result: result("W1", 5, "Completed") }), expected: E("CASE-05", "NoCommand", "Completed", "TerminalComplete", "W1", 5, "First", "ProductionComplete") });
nominalSteps.push({ input: inputWith({ request: eligibleRequest("W2"), material: material("W2"), readiness: readiness(0) }), expected: E("CASE-01", "NoCommand", "Idle", "Idle", "NoWork", 0, "First") });
scenarios.push({ scenario_id: "SCN-05", traces: [runTrace("six-step-nominal", initialState(), nominalSteps)] });
scenarios.push({ scenario_id: "SCN-06", traces: [runTrace("protected-work-conflict", initialState(), [
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W2") }), expected: E("CASE-04", "NoCommand", "Busy", "Active", "W1", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W2"), readiness: readiness(1, "Blocked"), result: result("W1", 0, "Completed") }), expected: E("CASE-07", "NoCommand", "WaitingStation", "TransferPending", "W1", 1, "First") },
  { input: inputWith({ request: eligibleRequest("W2"), readiness: readiness(1) }), expected: E("CASE-10", "Advance", "Advanced", "Active", "W1", 1, "First") }
])] });
const recoveryStart = { phase: "RecoveryPending", work_id: "W1", step: 2, attempt: "First" };
scenarios.push({ scenario_id: "SCN-07", traces: [
  runTrace("first-failure-then-competing-retry", initialState(), [
    { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") },
    { input: inputWith({ request: eligibleRequest("W2"), result: result("W1", 0, "Failed") }), expected: E("CASE-08", "NoCommand", "Recovering", "RecoveryPending", "W1", 0, "First") },
    { input: inputWith({ request: eligibleRequest("W2"), readiness: readiness(0) }), expected: E("CASE-12", "Retry", "Recovering", "Active", "W1", 0, "Retry") }
  ]),
  runTrace("recovery-no-request", recoveryStart, [{ input: inputWith({ readiness: readiness(2) }), expected: E("CASE-12", "Retry", "Recovering", "Active", "W1", 2, "Retry") }]),
  runTrace("recovery-blocked", recoveryStart, [{ input: inputWith({ request: eligibleRequest("W2"), readiness: readiness(2, "Blocked") }), expected: E("CASE-13", "NoCommand", "Recovering", "RecoveryPending", "W1", 2, "First") }])
] });
scenarios.push({ scenario_id: "SCN-08", traces: [runTrace("stale-result-exhausted-retry-reset-represent", initialState(), [
  { input: inputWith({ request: eligibleRequest("W1"), material: material("W1"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W1", 0, "First") },
  { input: inputWith({ result: result("W2", 0, "Completed") }), expected: E("CASE-03", "NoCommand", "Processing", "Active", "W1", 0, "First") },
  { input: inputWith({ result: result("W1", 0, "InProgress") }), expected: E("CASE-03", "NoCommand", "Processing", "Active", "W1", 0, "First") },
  { input: inputWith({ result: result("W1", 0, "Failed") }), expected: E("CASE-08", "NoCommand", "Recovering", "RecoveryPending", "W1", 0, "First") },
  { input: inputWith({ readiness: readiness(0) }), expected: E("CASE-12", "Retry", "Recovering", "Active", "W1", 0, "Retry") },
  { input: inputWith({ result: result("W1", 0, "Failed") }), expected: E("CASE-09", "Abort", "Failed", "TerminalFailed", "W1", 0, "Retry", "ProductionFailed") },
  { input: inputWith({ request: eligibleRequest("W2"), material: material("W2"), readiness: readiness(0) }), expected: E("CASE-02", "NoCommand", "Idle", "Idle", "NoWork", 0, "First") },
  { input: inputWith({ request: eligibleRequest("W2"), material: material("W2"), readiness: readiness(0) }), expected: E("CASE-20", "Start", "Started", "Active", "W2", 0, "First") }
])] });

const ownershipAuditRecords = [
  { usage: "workRequestQualifier", claimed_roles: ["applicability"], assigned_inputs: ["presentedWork"], owner_local_facts: ["AdmissionAssessment and eligible work identity"], contract_cases: ["RequestAbsent", "RequestEligible", "RequestMalformed"], analyzer_checks: ["request_classification_product"] },
  { usage: "materialCorrelationQualifier", claimed_roles: ["applicability"], assigned_inputs: ["admission", "materialObservation"], owner_local_facts: ["MaterialAssessment with identifier correlation"], contract_cases: ["MaterialReadyCorrelated", "MaterialUnavailableCorrelated", "MaterialUnknownOrInapplicable"], analyzer_checks: ["material_correlation_product"] },
  { usage: "targetStepReadinessQualifier", claimed_roles: ["applicability"], assigned_inputs: ["readinessObservation", "flowContext"], owner_local_facts: ["state-derived target and TargetQualification"], contract_cases: ["TargetReadyCorrelated", "TargetBlockedCorrelated", "TargetUnknownOrMismatched"], analyzer_checks: ["target_readiness_product"] },
  { usage: "processOutcomeCorrelator", claimed_roles: ["applicability"], assigned_inputs: ["processResult", "flowContext"], owner_local_facts: ["five-way CorrelatedOutcomePlan"], contract_cases: ["IntermediateCompletion", "FinalCompletion", "FirstAttemptFailure", "RetryAttemptFailure", "PreserveUncorrelated"], analyzer_checks: ["process_outcome_product"] },
  { usage: "protectedWorkPriorityResolver", claimed_roles: ["decision"], assigned_inputs: ["admission", "protectionContext"], owner_local_facts: ["protected FlowIntent and competitor classification"], contract_cases: ["IdleWithoutEligibleWork", "FreshWorkIntent", "ActiveWorkProtected", "TransferWorkProtected", "RecoveryWorkProtected", "TerminalResetIntent"], analyzer_checks: ["priority_intent_product", "retry_over_fresh_conflict"] },
  { usage: "flowAuthorizationOwner", claimed_roles: ["decision"], assigned_inputs: ["materialFact", "targetFact", "outcomeFact", "intentFact"], owner_local_facts: ["complete FlowDecision and DecisionReason partition"], contract_cases: Object.keys(caseCounts), analyzer_checks: ["authorization_partition_product"] },
  { usage: "flowLedger", claimed_roles: ["decision"], assigned_inputs: ["authorization", "pre-state phase", "pre-state work", "pre-state step", "pre-state attempt"], owner_local_facts: ["persistent transition and LineFlowCommand"], contract_cases: Object.keys(caseCounts), analyzer_checks: ["ledger_transition_partition"] },
  { usage: "productionOutcomeDeterminer", claimed_roles: ["decision"], assigned_inputs: ["outcomeFact", "appliedSnapshot"], owner_local_facts: ["entry-only ProductionOutcome"], contract_cases: ["CompletionEntry", "FailureEntry", "SuppressNonterminalAndReset"], analyzer_checks: ["entry_outcome_product"] },
  { usage: "flowStatusDeterminer", claimed_roles: ["decision"], assigned_inputs: ["decisionReason", "appliedSnapshot"], owner_local_facts: ["lifecycle-precedence ProductionFlowStatus"], contract_cases: ["TerminalCompleteStatus", "TerminalFailedStatus", "RecoveryPendingStatus", "RetryReleasedStatus", "TransferPendingStatus", "RejectedStatus", "MaterialWaitStatus", "HeatingWaitStatus", "StartedStatus", "AdvancedStatus", "BusyStatus", "ProcessingStatus", "IdleStatus"], analyzer_checks: ["status_precedence_product"] }
];

const invariantChecks = {
  explicit_successor: V.steps.slice(0, 5).map(successor).join(",") === "1,2,3,4,5",
  terminal_reset_unconditional: ["CASE-01", "CASE-02"].every(c => equal(modelLedger(representative[c][0], modelAuthorize(modelPriority(modelRequest(representative[c][1]), representative[c][0]), representative[c][2], representative[c][3], representative[c][4])).next, initialState())),
  retry_over_fresh_priority: (() => { const x = modelPriority(modelRequest(eligibleRequest("W2")), recoveryStart); return x.kind === "RecoveryIntent" && x.work_id === "W1" && x.step === 2 && x.competitor === "Present"; })(),
  one_retry_maximum: scenarios.find(x => x.scenario_id === "SCN-08").traces[0].observations.filter(x => x.observed.command.action_kind === "Retry").length === 1,
  all_six_steps_commanded_in_order: scenarios.find(x => x.scenario_id === "SCN-05").traces[0].observations.filter(x => ["Start", "Advance"].includes(x.observed.command.action_kind)).map(x => x.observed.command.step).join(",") === "0,1,2,3,4,5",
  entry_only_terminal_outcome: scenarios.find(x => x.scenario_id === "SCN-05").traces[0].observations.filter(x => x.observed.outcome.result === "ProductionComplete").length === 1,
  production_not_dispatch_vocabulary: !["Start", "Advance", "Retry", "Abort", "ProductionComplete", "ProductionFailed"].some(x => /dispatch|shipment|shipping/i.test(x))
};
const scenarioPassed = scenarios.every(s => s.traces.length > 0 && s.traces.every(t => t.passed));
const ownerPassed = Object.values(ownerStats).every(s => s.gaps === 0 && s.overlaps === 0 && s.oracle_mismatches === 0);
const ownerStatPassed = usageId => {
  const stats = ownerStats[usageId];
  return stats.evaluated > 0 && stats.gaps === 0 && stats.overlaps === 0 && stats.oracle_mismatches === 0;
};
const ownershipCheckResults = Object.freeze({
  request_classification_product: ownerStatPassed("PART-01"),
  material_correlation_product: ownerStatPassed("PART-02"),
  target_readiness_product: ownerStatPassed("PART-03"),
  process_outcome_product: ownerStatPassed("PART-04"),
  priority_intent_product: ownerStatPassed("PART-05"),
  retry_over_fresh_conflict: invariantChecks.retry_over_fresh_priority,
  authorization_partition_product: ownerStatPassed("PART-06"),
  ledger_transition_partition: ownerStatPassed("PART-07"),
  entry_outcome_product: ownerStatPassed("PART-08"),
  status_precedence_product: ownerStatPassed("PART-09")
});
const ownershipAudit = ownershipAuditRecords.map(record => ({
  ...record,
  passed: record.analyzer_checks.every(check => ownershipCheckResults[check] === true)
}));
const ownershipPassed = ownershipAudit.every(record => record.passed === true);
const casePassed = Object.values(caseCounts).every(n => n > 0);
const allPassed = rootEvaluated === 995328 && rootGaps === 0 && rootOverlaps === 0 && rootOutputMismatches === 0 && ownerPassed && ownershipPassed && casePassed && scenarioPassed && Object.values(invariantChecks).every(Boolean);

const report = {
  schema: "factory-flow-supervisor-bounded-analysis-v1", status: allPassed ? "passed" : "failed", passed: allPassed,
  source: SOURCE, source_sha256: SOURCE_SHA256,
  claim_boundary: "Deterministic finite-domain conformance evidence for the retained SysML contracts and approved logical policy; not compositional proof, solver certification, generated-code correctness, execution, physical performance, safety certification, or physical validation.",
  semantic_connection_map: semanticConnections.map(([id, from, to]) => ({ id, from, to })),
  root_input_domain: { cardinality: 995328, evaluated: rootEvaluated, partition_counts: rootCounts, gaps: rootGaps, overlaps: rootOverlaps, required_output_mismatches: rootOutputMismatches },
  owner_local_analysis: ownerStats,
  contract_partition: { case_witness_counts: caseCounts, gaps: ownerStats["PART-06"].gaps, overlaps: ownerStats["PART-06"].overlaps, oracle_mismatches: ownerStats["PART-06"].oracle_mismatches },
  scenario_families: scenarios,
  invariant_checks: invariantChecks,
  ownership_audit: ownershipAudit,
  gaps: rootGaps + Object.values(ownerStats).reduce((n, x) => n + x.gaps, 0),
  overlaps: rootOverlaps + Object.values(ownerStats).reduce((n, x) => n + x.overlaps, 0),
  required_output_mismatches: rootOutputMismatches,
  elapsed_time_claim: "No wall-clock performance claim; the harness enforces the external 180-second watchdog."
};
process.stdout.write(JSON.stringify(report));
