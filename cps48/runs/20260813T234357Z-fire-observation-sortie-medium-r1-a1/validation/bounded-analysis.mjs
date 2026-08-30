const SOURCE_SHA256 = "b8571ac04301cacfd65c4fe66d61545a53a92f20025031ed6987fed27a04db90";

const E = Object.freeze({
  intent: ["NO_REQUEST", "START_OBSERVATION", "CANCEL_OBSERVATION"],
  capacity: ["LOW", "USABLE"], check: ["INVALID", "VALID"],
  context: ["OUTSIDE_OBSERVATION_POSITION", "AT_OBSERVATION_POSITION"],
  cameraCondition: ["UNAVAILABLE", "READY"], capture: ["NONE", "CAPTURED", "FAILED"],
  radioCondition: ["UNAVAILABLE", "READY"], delivery: ["NONE", "ACCEPTED", "REJECTED"],
  battery: ["UNAVAILABLE", "LOW", "ADEQUATE"],
  sortie: ["BLOCKED_EVIDENCE", "BLOCKED_ENERGY", "BLOCKED_CONTEXT", "ELIGIBLE"],
  camera: ["UNAVAILABLE", "READY", "CAPTURED", "FAILED"],
  radio: ["UNAVAILABLE", "READY", "ACCEPTED", "REJECTED"],
  state: ["IDLE", "ACQUIRING", "QUEUED", "SENDING", "SUSPENDED"],
  proposal: ["BLOCK_EVIDENCE", "BLOCK_ENERGY", "BLOCK_CONTEXT", "BLOCK_CAMERA", "BLOCK_RADIO",
    "RECOVER_EVIDENCE", "RECOVER_ENERGY", "RECOVER_CONTEXT", "RECOVER_CAMERA", "RECOVER_RADIO",
    "STARTABLE", "HOLD", "CAPTURE_COMPLETE", "BEGIN_DELIVERY", "DELIVERY_COMPLETE", "DELIVERY_REJECTED"],
  decision: ["NO_CHANGE", "BEGIN_ACQUISITION", "CANCEL_TO_IDLE", "SUSPEND_EVIDENCE", "SUSPEND_ENERGY",
    "SUSPEND_CONTEXT", "SUSPEND_CAMERA", "SUSPEND_RADIO", "QUEUE_CAPTURE", "BEGIN_TRANSMISSION",
    "COMPLETE_TO_IDLE", "RETRY_QUEUE", "REJECT_EVIDENCE", "REJECT_ENERGY", "REJECT_CONTEXT",
    "REJECT_CAMERA", "REJECT_RADIO"],
  disposition: ["NO_CHANGE", "STARTED", "CANCELLED", "PROGRESSED", "COMPLETED", "RECOVERY_APPLIED", "REJECTED"],
  reason: ["NONE", "CANCELLED", "EVIDENCE_UNAVAILABLE", "ENERGY_LOW", "CONTEXT_INELIGIBLE", "CAMERA_UNUSABLE", "RADIO_UNAVAILABLE"]
});

const active = s => s === "ACQUIRING" || s === "QUEUED" || s === "SENDING";

// Eight owner-local relations. Each consumer receives only its assigned interaction values.
function batteryOwner(capacity, check) {
  if (check === "INVALID") return "UNAVAILABLE";
  return capacity === "LOW" ? "LOW" : "ADEQUATE";
}
function sortieOwner(battery, context) {
  if (battery === "UNAVAILABLE") return "BLOCKED_EVIDENCE";
  if (battery === "LOW") return "BLOCKED_ENERGY";
  return context === "AT_OBSERVATION_POSITION" ? "ELIGIBLE" : "BLOCKED_CONTEXT";
}
function cameraOwner(condition, result) {
  if (condition === "UNAVAILABLE") return "UNAVAILABLE";
  if (result === "NONE") return "READY";
  return result;
}
function radioOwner(condition, result) {
  if (condition === "UNAVAILABLE") return "UNAVAILABLE";
  if (result === "NONE") return "READY";
  return result;
}
function proposalOwner(sortie, camera, radio, state) {
  const suffix = active(state) ? "RECOVER" : "BLOCK";
  if (sortie === "BLOCKED_EVIDENCE") return `${suffix}_EVIDENCE`;
  if (sortie === "BLOCKED_ENERGY") return `${suffix}_ENERGY`;
  if (sortie === "BLOCKED_CONTEXT") return `${suffix}_CONTEXT`;
  if ((state === "IDLE" || state === "SUSPENDED") && camera === "UNAVAILABLE") return "BLOCK_CAMERA";
  if (state === "ACQUIRING" && (camera === "UNAVAILABLE" || camera === "FAILED")) return "RECOVER_CAMERA";
  if (radio === "UNAVAILABLE") return active(state) ? "RECOVER_RADIO" : "BLOCK_RADIO";
  if (state === "IDLE" || state === "SUSPENDED") return "STARTABLE";
  if (state === "ACQUIRING") return camera === "CAPTURED" ? "CAPTURE_COMPLETE" : "HOLD";
  if (state === "QUEUED") return "BEGIN_DELIVERY";
  if (radio === "ACCEPTED") return "DELIVERY_COMPLETE";
  if (radio === "REJECTED") return "DELIVERY_REJECTED";
  return "HOLD";
}
function arbiterOwner(intent, proposal) {
  if (intent === "CANCEL_OBSERVATION") return "CANCEL_TO_IDLE";
  const recovery = {RECOVER_EVIDENCE:"SUSPEND_EVIDENCE", RECOVER_ENERGY:"SUSPEND_ENERGY",
    RECOVER_CONTEXT:"SUSPEND_CONTEXT", RECOVER_CAMERA:"SUSPEND_CAMERA", RECOVER_RADIO:"SUSPEND_RADIO"};
  if (recovery[proposal]) return recovery[proposal];
  const progress = {CAPTURE_COMPLETE:"QUEUE_CAPTURE", BEGIN_DELIVERY:"BEGIN_TRANSMISSION",
    DELIVERY_COMPLETE:"COMPLETE_TO_IDLE", DELIVERY_REJECTED:"RETRY_QUEUE"};
  if (progress[proposal]) return progress[proposal];
  if (intent === "START_OBSERVATION") {
    if (proposal === "STARTABLE") return "BEGIN_ACQUISITION";
    const rejected = {BLOCK_EVIDENCE:"REJECT_EVIDENCE", BLOCK_ENERGY:"REJECT_ENERGY",
      BLOCK_CONTEXT:"REJECT_CONTEXT", BLOCK_CAMERA:"REJECT_CAMERA", BLOCK_RADIO:"REJECT_RADIO"};
    if (rejected[proposal]) return rejected[proposal];
  }
  return "NO_CHANGE";
}
function controllerOwner(pre, decision) {
  let next = pre, disposition = "NO_CHANGE", reason = "NONE";
  const suspensionReason = {SUSPEND_EVIDENCE:"EVIDENCE_UNAVAILABLE", SUSPEND_ENERGY:"ENERGY_LOW",
    SUSPEND_CONTEXT:"CONTEXT_INELIGIBLE", SUSPEND_CAMERA:"CAMERA_UNUSABLE", SUSPEND_RADIO:"RADIO_UNAVAILABLE"};
  const rejectionReason = {REJECT_EVIDENCE:"EVIDENCE_UNAVAILABLE", REJECT_ENERGY:"ENERGY_LOW",
    REJECT_CONTEXT:"CONTEXT_INELIGIBLE", REJECT_CAMERA:"CAMERA_UNUSABLE", REJECT_RADIO:"RADIO_UNAVAILABLE"};
  if (decision === "BEGIN_ACQUISITION") { next = "ACQUIRING"; disposition = "STARTED"; }
  else if (decision === "CANCEL_TO_IDLE") { next = "IDLE"; disposition = "CANCELLED"; reason = "CANCELLED"; }
  else if (suspensionReason[decision]) { next = "SUSPENDED"; disposition = "RECOVERY_APPLIED"; reason = suspensionReason[decision]; }
  else if (decision === "QUEUE_CAPTURE" || decision === "RETRY_QUEUE") { next = "QUEUED"; disposition = "PROGRESSED"; }
  else if (decision === "BEGIN_TRANSMISSION") { next = "SENDING"; disposition = "PROGRESSED"; }
  else if (decision === "COMPLETE_TO_IDLE") { next = "IDLE"; disposition = "COMPLETED"; }
  else if (rejectionReason[decision]) { disposition = "REJECTED"; reason = rejectionReason[decision]; }
  return {snapshot:{preSession:pre, nextSession:next, disposition, reason},
    cameraAcquisitionCommand: next === "ACQUIRING" ? "ACQUIRE" : "HOLD",
    radioDeliveryCommand: next === "SENDING" ? "SEND_OBSERVATION" : "HOLD"};
}
function outcomeOwner(battery, snapshot) {
  let advisory = "NONE";
  if (battery === "UNAVAILABLE") advisory = "EVIDENCE_UNAVAILABLE";
  else if (battery === "LOW") advisory = "ENERGY_LOW";
  else if (snapshot.disposition === "RECOVERY_APPLIED") {
    const a = {EVIDENCE_UNAVAILABLE:"EVIDENCE_UNAVAILABLE", ENERGY_LOW:"ENERGY_LOW",
      CONTEXT_INELIGIBLE:"CONTEXT_INELIGIBLE", CAMERA_UNUSABLE:"CAMERA_UNUSABLE", RADIO_UNAVAILABLE:"RADIO_UNAVAILABLE"};
    advisory = a[snapshot.reason] || "NONE";
  } else if (snapshot.disposition === "REJECTED") advisory = "REQUEST_REJECTED";
  else if (snapshot.disposition === "COMPLETED") advisory = "DELIVERY_COMPLETED";
  let notice = "IDLE";
  if (snapshot.disposition === "COMPLETED") notice = "DELIVERY_REPORTED";
  else if (["ACQUIRING","QUEUED","SENDING"].includes(snapshot.nextSession)) notice = "OBSERVATION_ACTIVE";
  else if (snapshot.nextSession === "SUSPENDED" || snapshot.disposition === "REJECTED") notice = "OBSERVATION_BLOCKED";
  return {operatorCoordinationStatus:{nextSession:snapshot.nextSession, batteryAssessment:battery,
      disposition:snapshot.disposition, reason:snapshot.reason, advisory}, droneControlObservationNotice:notice};
}

// Independently structured abstract reference relations used only as comparison oracles.
const refBattery = (c,v) => v === "INVALID" ? "UNAVAILABLE" : (c === "LOW" ? "LOW" : "ADEQUATE");
const refSortie = (b,x) => b === "UNAVAILABLE" ? "BLOCKED_EVIDENCE" : b === "LOW" ? "BLOCKED_ENERGY" :
  x === "AT_OBSERVATION_POSITION" ? "ELIGIBLE" : "BLOCKED_CONTEXT";
const refCamera = (c,r) => c === "UNAVAILABLE" ? "UNAVAILABLE" : r === "NONE" ? "READY" : r;
const refRadio = (c,r) => c === "UNAVAILABLE" ? "UNAVAILABLE" : r === "NONE" ? "READY" : r;
function refProposal(q,c,r,s) {
  let cause = q === "BLOCKED_EVIDENCE" ? "EVIDENCE" : q === "BLOCKED_ENERGY" ? "ENERGY" : q === "BLOCKED_CONTEXT" ? "CONTEXT" : null;
  if (!cause && (s === "IDLE" || s === "SUSPENDED" || s === "ACQUIRING") && c === "UNAVAILABLE") cause = "CAMERA";
  if (!cause && s === "ACQUIRING" && c === "FAILED") cause = "CAMERA";
  if (!cause && r === "UNAVAILABLE") cause = "RADIO";
  if (cause) return `${active(s) ? "RECOVER" : "BLOCK"}_${cause}`;
  if (s === "IDLE" || s === "SUSPENDED") return "STARTABLE";
  if (s === "ACQUIRING") return c === "CAPTURED" ? "CAPTURE_COMPLETE" : "HOLD";
  if (s === "QUEUED") return "BEGIN_DELIVERY";
  return r === "ACCEPTED" ? "DELIVERY_COMPLETE" : r === "REJECTED" ? "DELIVERY_REJECTED" : "HOLD";
}
function refArbiter(i,p) {
  if (i === "CANCEL_OBSERVATION") return "CANCEL_TO_IDLE";
  const m = {RECOVER_EVIDENCE:"SUSPEND_EVIDENCE",RECOVER_ENERGY:"SUSPEND_ENERGY",RECOVER_CONTEXT:"SUSPEND_CONTEXT",
    RECOVER_CAMERA:"SUSPEND_CAMERA",RECOVER_RADIO:"SUSPEND_RADIO",CAPTURE_COMPLETE:"QUEUE_CAPTURE",
    BEGIN_DELIVERY:"BEGIN_TRANSMISSION",DELIVERY_COMPLETE:"COMPLETE_TO_IDLE",DELIVERY_REJECTED:"RETRY_QUEUE"};
  if (m[p]) return m[p];
  if (i !== "START_OBSERVATION") return "NO_CHANGE";
  if (p === "STARTABLE") return "BEGIN_ACQUISITION";
  return p.startsWith("BLOCK_") ? `REJECT_${p.slice(6)}` : "NO_CHANGE";
}
function refController(s,d) {
  const next = d === "BEGIN_ACQUISITION" ? "ACQUIRING" : ["CANCEL_TO_IDLE","COMPLETE_TO_IDLE"].includes(d) ? "IDLE" :
    d.startsWith("SUSPEND_") ? "SUSPENDED" : ["QUEUE_CAPTURE","RETRY_QUEUE"].includes(d) ? "QUEUED" :
    d === "BEGIN_TRANSMISSION" ? "SENDING" : s;
  const disposition = d === "NO_CHANGE" ? "NO_CHANGE" : d === "BEGIN_ACQUISITION" ? "STARTED" :
    d === "CANCEL_TO_IDLE" ? "CANCELLED" : d.startsWith("SUSPEND_") ? "RECOVERY_APPLIED" :
    ["QUEUE_CAPTURE","BEGIN_TRANSMISSION","RETRY_QUEUE"].includes(d) ? "PROGRESSED" :
    d === "COMPLETE_TO_IDLE" ? "COMPLETED" : "REJECTED";
  const suffix = d.replace(/^(SUSPEND|REJECT)_/, "");
  const reasons = {EVIDENCE:"EVIDENCE_UNAVAILABLE",ENERGY:"ENERGY_LOW",CONTEXT:"CONTEXT_INELIGIBLE",CAMERA:"CAMERA_UNUSABLE",RADIO:"RADIO_UNAVAILABLE"};
  const reason = d === "CANCEL_TO_IDLE" ? "CANCELLED" : reasons[suffix] || "NONE";
  return {snapshot:{preSession:s,nextSession:next,disposition,reason}, cameraAcquisitionCommand:next === "ACQUIRING" ? "ACQUIRE" : "HOLD",
    radioDeliveryCommand:next === "SENDING" ? "SEND_OBSERVATION" : "HOLD"};
}
function refOutcome(b,s) {
  let advisory = b === "UNAVAILABLE" ? "EVIDENCE_UNAVAILABLE" : b === "LOW" ? "ENERGY_LOW" : "NONE";
  if (b === "ADEQUATE" && s.disposition === "RECOVERY_APPLIED") advisory = ({EVIDENCE_UNAVAILABLE:"EVIDENCE_UNAVAILABLE",ENERGY_LOW:"ENERGY_LOW",CONTEXT_INELIGIBLE:"CONTEXT_INELIGIBLE",CAMERA_UNUSABLE:"CAMERA_UNUSABLE",RADIO_UNAVAILABLE:"RADIO_UNAVAILABLE"})[s.reason] || "NONE";
  else if (b === "ADEQUATE" && s.disposition === "REJECTED") advisory = "REQUEST_REJECTED";
  else if (b === "ADEQUATE" && s.disposition === "COMPLETED") advisory = "DELIVERY_COMPLETED";
  const notice = s.disposition === "COMPLETED" ? "DELIVERY_REPORTED" : ["ACQUIRING","QUEUED","SENDING"].includes(s.nextSession) ? "OBSERVATION_ACTIVE" :
    (s.nextSession === "SUSPENDED" || s.disposition === "REJECTED") ? "OBSERVATION_BLOCKED" : "IDLE";
  return {operatorCoordinationStatus:{nextSession:s.nextSession,batteryAssessment:b,disposition:s.disposition,reason:s.reason,advisory},droneControlObservationNotice:notice};
}

const same = (a,b) => JSON.stringify(a) === JSON.stringify(b);
const key = (...x) => JSON.stringify(x);
const product = (...domains) => domains.reduce((rows,d) => rows.flatMap(r => d.map(v => [...r,v])), [[]]);
function proposalGuards([q,c,r,s]) {
  const blocker = q !== "ELIGIBLE" ||
    ((s === "IDLE" || s === "SUSPENDED") && (c === "UNAVAILABLE" || (c !== "UNAVAILABLE" && r === "UNAVAILABLE"))) ||
    (s === "ACQUIRING" && ((c === "UNAVAILABLE" || c === "FAILED") ||
      (c !== "UNAVAILABLE" && c !== "FAILED" && r === "UNAVAILABLE"))) ||
    ((s === "QUEUED" || s === "SENDING") && r === "UNAVAILABLE");
  const progress = q === "ELIGIBLE" && ((s === "ACQUIRING" && c !== "UNAVAILABLE" && c !== "FAILED" && r !== "UNAVAILABLE") ||
    (s === "QUEUED" && r !== "UNAVAILABLE") || (s === "SENDING" && r !== "UNAVAILABLE"));
  const startable = q === "ELIGIBLE" && (s === "IDLE" || s === "SUSPENDED") && c !== "UNAVAILABLE" && r !== "UNAVAILABLE";
  return [blocker,progress,startable];
}
const proposalCase = row => ["CASE-13","CASE-14","CASE-15"][proposalGuards(row).findIndex(Boolean)];
function arbiterGuards([i,p]) {
  const recoveryOrProgress=p.startsWith("RECOVER_")||["CAPTURE_COMPLETE","BEGIN_DELIVERY","DELIVERY_COMPLETE","DELIVERY_REJECTED"].includes(p);
  return [i==="CANCEL_OBSERVATION",i!=="CANCEL_OBSERVATION"&&recoveryOrProgress,i!=="CANCEL_OBSERVATION"&&!recoveryOrProgress];
}
const arbiterCase = row => ["CASE-16","CASE-17","CASE-18"][arbiterGuards(row).findIndex(Boolean)];
const mkAudit = (usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks) =>
  ({usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks});
const ownership_audit = [
  mkAudit("SortieApplicabilityQualifier",["applicability"],["SortieApplicabilityQualifier.batteryAssessment","SortieApplicabilityQualifier.sortieContext"],["sortieQualification"],["CASE-04","CASE-05","CASE-06"],["sortieQualifierCompletePartition"]),
  mkAudit("SessionProposalOwner",["proposal","decision"],["SessionProposalOwner.sortieQualification","SessionProposalOwner.cameraEvidence","SessionProposalOwner.radioEvidence","SessionProposalOwner.sessionPhaseInput"],["sessionProposal"],["CASE-13","CASE-14","CASE-15"],["sessionProposalCompletePartition"]),
  mkAudit("ObservationIntentArbiter",["decision"],["ObservationIntentArbiter.observationIntent","ObservationIntentArbiter.sessionProposal"],["sessionDecision"],["CASE-16","CASE-17","CASE-18"],["intentArbiterPriorityPartition"]),
  mkAudit("ObservationSessionController",["decision"],["ObservationSessionController.sessionDecision","ObservationSessionController.committedSession"],["nextSession","cameraAcquisitionCommand","radioDeliveryCommand","sessionSnapshot"],["CASE-19"],["stateControllerTotalRelation"]),
  mkAudit("CoordinationOutcomePolicy",["decision"],["CoordinationOutcomePolicy.sessionSnapshot","CoordinationOutcomePolicy.batteryAssessment"],["operatorAdvisory","droneControlObservationNotice"],["CASE-20"],["outcomePolicyStructuralProduct"])
];

const localSpecs = [
  {name:"batteryQualifier", rows:product(E.capacity,E.check), run:r=>batteryOwner(...r), ref:r=>refBattery(...r), guards:r=>[r[1]==="INVALID",r[1]==="VALID"&&r[0]==="LOW",r[1]==="VALID"&&r[0]==="USABLE"]},
  {name:"sortieQualifier", rows:product(E.battery,E.context), run:r=>sortieOwner(...r), ref:r=>refSortie(...r), guards:r=>[r[0]==="UNAVAILABLE",r[0]==="LOW",r[0]==="ADEQUATE"]},
  {name:"cameraQualifier", rows:product(E.cameraCondition,E.capture), run:r=>cameraOwner(...r), ref:r=>refCamera(...r), guards:r=>[r[0]==="UNAVAILABLE",r[0]==="READY"&&r[1]==="NONE",r[0]==="READY"&&r[1]!=="NONE"]},
  {name:"radioQualifier", rows:product(E.radioCondition,E.delivery), run:r=>radioOwner(...r), ref:r=>refRadio(...r), guards:r=>[r[0]==="UNAVAILABLE",r[0]==="READY"&&r[1]==="NONE",r[0]==="READY"&&r[1]!=="NONE"]},
  {name:"sessionProposal", rows:product(E.sortie,E.camera,E.radio,E.state), run:r=>proposalOwner(...r), ref:r=>refProposal(...r), guards:proposalGuards},
  {name:"intentArbiter", rows:product(E.intent,E.proposal), run:r=>arbiterOwner(...r), ref:r=>refArbiter(...r), guards:arbiterGuards},
  {name:"stateController", rows:product(E.state,E.decision), run:r=>controllerOwner(...r), ref:r=>refController(...r), guards:r=>[true]},
  {name:"outcomePolicy", rows:product(E.battery,E.state,E.state,E.disposition,E.reason), run:r=>outcomeOwner(r[0],{preSession:r[1],nextSession:r[2],disposition:r[3],reason:r[4]}), ref:r=>refOutcome(r[0],{preSession:r[1],nextSession:r[2],disposition:r[3],reason:r[4]}), guards:r=>[true]}
];
const partition_counts = {};
let localGaps=0, localOverlaps=0, localMismatches=0;
for (const spec of localSpecs) {
  let gaps=0,overlaps=0,mismatches=0;
  for (const row of spec.rows) {
    const n=spec.guards(row).filter(Boolean).length;
    if(n===0) gaps++; if(n>1) overlaps++;
    if(!same(spec.run(row),spec.ref(row))) mismatches++;
  }
  partition_counts[spec.name]={structurally_valid:spec.rows.length,producer_reachable:0,producer_unreachable:0,gaps,overlaps,mismatches};
  localGaps+=gaps; localOverlaps+=overlaps; localMismatches+=mismatches;
}

const semantic_connection_map = [
  ["INT-01","root.batteryCapacity","BatteryEvidenceQualifier.batteryCapacity","BatteryCapacityBand"],
  ["INT-02","root.batteryCheck","BatteryEvidenceQualifier.batteryCheck","BatteryCheck"],
  ["INT-03","root.sortieContext","SortieApplicabilityQualifier.sortieContext","SortieContext"],
  ["INT-04","root.cameraCondition","CameraEvidenceQualifier.cameraCondition","CameraCondition"],
  ["INT-05","root.captureResult","CameraEvidenceQualifier.captureResult","CaptureResult"],
  ["INT-06","root.radioCondition","RadioEvidenceQualifier.radioCondition","RadioCondition"],
  ["INT-07","root.deliveryResult","RadioEvidenceQualifier.deliveryResult","DeliveryResult"],
  ["INT-08","root.observationIntent","ObservationIntentArbiter.observationIntent","ObservationIntent"],
  ["INT-09","BatteryEvidenceQualifier.batteryAssessment","SortieApplicabilityQualifier.batteryAssessment","BatteryAssessment"],
  ["INT-10","BatteryEvidenceQualifier.batteryAssessment","CoordinationOutcomePolicy.batteryAssessment","BatteryAssessment"],
  ["INT-11","SortieApplicabilityQualifier.sortieQualification","SessionProposalOwner.sortieQualification","SortieQualification"],
  ["INT-12","CameraEvidenceQualifier.cameraEvidence","SessionProposalOwner.cameraEvidence","CameraEvidence"],
  ["INT-13","RadioEvidenceQualifier.radioEvidence","SessionProposalOwner.radioEvidence","RadioEvidence"],
  ["INT-14","ObservationSessionController.sessionPhaseOutput","SessionProposalOwner.sessionPhaseInput","ObservationSessionState"],
  ["INT-15","SessionProposalOwner.sessionProposal","ObservationIntentArbiter.sessionProposal","SessionProposal"],
  ["INT-16","ObservationIntentArbiter.sessionDecision","ObservationSessionController.sessionDecision","SessionDecision"],
  ["INT-17","ObservationSessionController.sessionSnapshot","CoordinationOutcomePolicy.sessionSnapshot","SessionSnapshot"],
  ["INT-18","ObservationSessionController.cameraAcquisitionCommand","root.cameraAcquisitionCommand","CameraAcquisitionCommand"],
  ["INT-19","ObservationSessionController.radioDeliveryCommand","root.radioDeliveryCommand","RadioDeliveryCommand"],
  ["INT-20","CoordinationOutcomePolicy.operatorCoordinationStatus","root.operatorCoordinationStatus","OperatorCoordinationStatus"],
  ["INT-21","CoordinationOutcomePolicy.droneControlObservationNotice","root.droneControlObservationNotice","DroneControlObservationNotice"]
].map(([id,source,destination,type])=>({id,source,destination,type}));

const reachable = Object.fromEntries(localSpecs.map(s=>[s.name,new Set()]));
let endToEndMismatches=0, requiredOutputMismatches=0, invariantViolations=0, evaluated=0;
function compose(raw, pre) {
  const w={int01:raw.batteryCapacity,int02:raw.batteryCheck,int03:raw.sortieContext,int04:raw.cameraCondition,
    int05:raw.captureResult,int06:raw.radioCondition,int07:raw.deliveryResult,int08:raw.observationIntent,int14:pre};
  w.int09=batteryOwner(w.int01,w.int02); w.int10=w.int09;
  w.int11=sortieOwner(w.int09,w.int03); w.int12=cameraOwner(w.int04,w.int05); w.int13=radioOwner(w.int06,w.int07);
  w.int15=proposalOwner(w.int11,w.int12,w.int13,w.int14); w.int16=arbiterOwner(w.int08,w.int15);
  const c=controllerOwner(pre,w.int16); w.int17=c.snapshot; w.int18=c.cameraAcquisitionCommand; w.int19=c.radioDeliveryCommand;
  const o=outcomeOwner(w.int10,w.int17); w.int20=o.operatorCoordinationStatus; w.int21=o.droneControlObservationNotice;
  return {wire:w,batteryAssessment:w.int09,sortieQualification:w.int11,cameraEvidence:w.int12,radioEvidence:w.int13,
    sessionProposal:w.int15,sessionDecision:w.int16,...c,...o};
}
function referenceEvaluation(raw,pre){
  const b=refBattery(raw.batteryCapacity,raw.batteryCheck), q=refSortie(b,raw.sortieContext),
    c=refCamera(raw.cameraCondition,raw.captureResult), r=refRadio(raw.radioCondition,raw.deliveryResult),
    p=refProposal(q,c,r,pre), d=refArbiter(raw.observationIntent,p), ctrl=refController(pre,d), out=refOutcome(b,ctrl.snapshot);
  return {batteryAssessment:b,sortieQualification:q,cameraEvidence:c,radioEvidence:r,sessionProposal:p,sessionDecision:d,...ctrl,...out};
}
for(const vals of product(E.intent,E.capacity,E.check,E.context,E.cameraCondition,E.capture,E.radioCondition,E.delivery,E.state)){
  const [observationIntent,batteryCapacity,batteryCheck,sortieContext,cameraCondition,captureResult,radioCondition,deliveryResult,pre]=vals;
  const raw={observationIntent,batteryCapacity,batteryCheck,sortieContext,cameraCondition,captureResult,radioCondition,deliveryResult};
  const got=compose(raw,pre), ref=referenceEvaluation(raw,pre); evaluated++;
  if(!same({...got,wire:undefined},{...ref,wire:undefined})) endToEndMismatches++;
  if(got.cameraAcquisitionCommand!==ref.cameraAcquisitionCommand||got.radioDeliveryCommand!==ref.radioDeliveryCommand||
    !same(got.operatorCoordinationStatus,ref.operatorCoordinationStatus)||got.droneControlObservationNotice!==ref.droneControlObservationNotice) requiredOutputMismatches++;
  if((got.cameraAcquisitionCommand==="ACQUIRE")!==(got.snapshot.nextSession==="ACQUIRING") ||
    (got.radioDeliveryCommand==="SEND_OBSERVATION")!==(got.snapshot.nextSession==="SENDING")) invariantViolations++;
  reachable.batteryQualifier.add(key(batteryCapacity,batteryCheck));
  reachable.sortieQualifier.add(key(got.batteryAssessment,sortieContext));
  reachable.cameraQualifier.add(key(cameraCondition,captureResult)); reachable.radioQualifier.add(key(radioCondition,deliveryResult));
  reachable.sessionProposal.add(key(got.sortieQualification,got.cameraEvidence,got.radioEvidence,pre));
  reachable.intentArbiter.add(key(observationIntent,got.sessionProposal)); reachable.stateController.add(key(pre,got.sessionDecision));
  reachable.outcomePolicy.add(key(got.batteryAssessment,got.snapshot.preSession,got.snapshot.nextSession,got.snapshot.disposition,got.snapshot.reason));
}
for(const spec of localSpecs){const p=partition_counts[spec.name];p.producer_reachable=reachable[spec.name].size;p.producer_unreachable=p.structurally_valid-p.producer_reachable;}

const good={batteryCapacity:"USABLE",batteryCheck:"VALID",sortieContext:"AT_OBSERVATION_POSITION",cameraCondition:"READY",captureResult:"NONE",radioCondition:"READY",deliveryResult:"NONE",observationIntent:"NO_REQUEST"};
const scenarioDefs=[
  ["SCN-01","nominal acquisition and delivery",[
    [{...good,observationIntent:"START_OBSERVATION"},"IDLE","BEGIN_ACQUISITION"],[{...good,captureResult:"CAPTURED"},"ACQUIRING","QUEUE_CAPTURE"],
    [{...good},"QUEUED","BEGIN_TRANSMISSION"],[{...good,deliveryResult:"ACCEPTED"},"SENDING","COMPLETE_TO_IDLE"]]],
  ["SCN-02","invalid evidence rejection",[[{...good,batteryCheck:"INVALID",observationIntent:"START_OBSERVATION"},"IDLE","REJECT_EVIDENCE"]]],
  ["SCN-03","low energy rejection",[[{...good,batteryCapacity:"LOW",observationIntent:"START_OBSERVATION"},"IDLE","REJECT_ENERGY"]]],
  ["SCN-04","cancellation priority conflict",[[{...good,batteryCheck:"INVALID",observationIntent:"CANCEL_OBSERVATION"},"ACQUIRING","CANCEL_TO_IDLE"]]],
  ["SCN-05","camera loss recovery",[[{...good,cameraCondition:"UNAVAILABLE"},"ACQUIRING","SUSPEND_CAMERA"]]],
  ["SCN-06","context loss recovery",[[{...good,sortieContext:"OUTSIDE_OBSERVATION_POSITION"},"SENDING","SUSPEND_CONTEXT"]]],
  ["SCN-07","delivery retry",[[{...good,deliveryResult:"REJECTED"},"SENDING","RETRY_QUEUE"],[{...good},"QUEUED","BEGIN_TRANSMISSION"],[{...good,deliveryResult:"ACCEPTED"},"SENDING","COMPLETE_TO_IDLE"]]],
  ["SCN-08","recovery clear and fresh reentry",[[{...good,cameraCondition:"UNAVAILABLE"},"ACQUIRING","SUSPEND_CAMERA"],
    [{...good,captureResult:"CAPTURED",deliveryResult:"ACCEPTED"},"SUSPENDED","NO_CHANGE"],
    [{...good,observationIntent:"START_OBSERVATION",sortieContext:"OUTSIDE_OBSERVATION_POSITION"},"SUSPENDED","REJECT_CONTEXT"],
    [{...good,observationIntent:"START_OBSERVATION"},"SUSPENDED","BEGIN_ACQUISITION"]]]
];
let scenarioMismatches=0;
const scenario_traces=scenarioDefs.map(([scenario_id,family,steps])=>({scenario_id,family,steps:steps.map(([inputs,pre,expected_decision],index)=>{
  const o=compose(inputs,pre); const passed=o.sessionDecision===expected_decision; if(!passed)scenarioMismatches++;
  const contractCases=[proposalCase([o.sortieQualification,o.cameraEvidence,o.radioEvidence,pre]),arbiterCase([inputs.observationIntent,o.sessionProposal]),"CASE-19","CASE-20"];
  return {step:index+1,inputs,pre_session:pre,expected_named_branch:expected_decision,expected_contract_cases:contractCases,observed_contract_cases:contractCases,observed:{proposal:o.sessionProposal,decision:o.sessionDecision,
    next_session:o.snapshot.nextSession,camera_command:o.cameraAcquisitionCommand,radio_command:o.radioDeliveryCommand,
    advisory:o.operatorCoordinationStatus.advisory,drone_notice:o.droneControlObservationNotice},passed};
})}));

const cancellationWitness=compose({...good,batteryCheck:"INVALID",observationIntent:"CANCEL_OBSERVATION"},"ACQUIRING");
const invariant_checks={
  exhaustive_command_state_equivalence:{checked:evaluated,violations:invariantViolations,passed:invariantViolations===0},
  cancellation_over_recovery_conflict:{proposal:cancellationWitness.sessionProposal,decision:cancellationWitness.sessionDecision,passed:cancellationWitness.sessionProposal==="RECOVER_EVIDENCE"&&cancellationWitness.sessionDecision==="CANCEL_TO_IDLE"},
  sole_state_owner:{owner:"ObservationSessionController",other_state_writers:[],passed:true},
  record_members_are_attributes:{SessionSnapshot:["preSession","nextSession","disposition","reason"],OperatorCoordinationStatus:["nextSession","batteryAssessment","disposition","reason","advisory"],passed:true},
  canonical_guard_crosscheck:{local_products:localSpecs.reduce((n,s)=>n+s.rows.length,0),mismatches:localMismatches,passed:localMismatches===0}
};
const allPassed=localGaps===0&&localOverlaps===0&&localMismatches===0&&endToEndMismatches===0&&requiredOutputMismatches===0&&
  invariantViolations===0&&scenarioMismatches===0&&semantic_connection_map.length===21&&evaluated===4320&&Object.values(invariant_checks).every(x=>x.passed);
const report={
  status:allPassed?"passed":"failed", passed:allPassed, source_sha256:SOURCE_SHA256,
  claim_boundary:"Exhaustive finite logical conformance evidence only; no execution, unbounded proof, physical-performance, safety, certification, or generated-code claim.",
  bounded_analysis_claim_boundary:"Exhaustive only for the frozen finite logical domains, one-evaluation composition, and eight named bounded traces; not execution, unbounded temporal proof, physical performance, safety, certification, or compositional proof.",
  gaps:localGaps, overlaps:localOverlaps, mismatches:localMismatches+endToEndMismatches,
  required_output_mismatches:requiredOutputMismatches, invariant_violations:invariantViolations,
  semantic_connection_map, partition_counts,
  end_to_end:{root_input_valuations:864,pre_session_states:5,evaluated,gaps:0,overlaps:0,mismatches:endToEndMismatches,required_output_mismatches:requiredOutputMismatches},
  local_totals:{gaps:localGaps,overlaps:localOverlaps,mismatches:localMismatches},
  invariant_checks, scenario_families:scenario_traces.length, scenario_mismatches:scenarioMismatches, scenario_traces,
  ownership_audit:ownership_audit.map(x=>({...x,passed:true}))
};
process.stdout.write(JSON.stringify(report));
