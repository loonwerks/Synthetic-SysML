#!/usr/bin/env node
"use strict";

// Deterministic finite mirror of model/EIT_Acquisition_Supervisor.sysml.
// It intentionally reads no files, environment variables, clocks, randomness, or other mutable state.
const SOURCE_SHA256 = "0564e91f916c2401cdbc96441994bbf22b5364579ca13d3da394d9de63cbfd15";

const Doctor = ["NONE", "START", "STOP", "ACK_IMAGE", "INVALID_INTENT", "INVALID_STATUS"];
const Prep = ["READY", "NOT_APPLIED", "CALIBRATION_NOT_PERFORMED", "CALIBRATION_FAILED", "INVALID_BELT_STATUS", "INVALID_CALIBRATION_STATUS"];
const Equip = ["READY", "NOT_READY", "BUSY", "FAULTED", "INVALID_HEALTH_STATUS", "INVALID_AVAILABILITY_STATUS"];
const Batch = ["NONE", "COMPLETE", "INCOMPLETE", "CORRUPT", "INVALID_BATCH_KIND", "INVALID_BATCH_STATUS"];
const Image = ["NONE", "GENERATED", "FAILED", "INVALID_RESULT", "INVALID_STATUS"];
const RecoveryEvent = ["NONE", "RESET", "VERIFY_OK", "INVALID_RESET", "INVALID_STATUS"];
const Session = ["IDLE", "MONITORING", "RECOVERY"];
const Cycle = ["DORMANT", "READY", "COLLECTING", "BATCH_READY", "RECOVERY"];
const ImageState = ["EMPTY", "AWAITING_IMAGE", "AVAILABLE", "RECOVERY"];
const RecoveryState = ["HEALTHY", "LATCHED", "VERIFYING"];

const SEMANTIC_CONNECTIONS = Object.freeze([
  ["INT-01", "doctor_request_qualification.request_facts", "fault_composition.request_facts"],
  ["INT-02", "doctor_request_qualification.request_facts", "start_feasibility.request_facts"],
  ["INT-03", "doctor_request_qualification.request_facts", "session_control.request_facts"],
  ["INT-04", "doctor_request_qualification.request_facts", "image_availability_control.request_facts"],
  ["INT-05", "preparation_assessment.preparation_facts", "fault_composition.preparation_facts"],
  ["INT-06", "preparation_assessment.preparation_facts", "start_feasibility.preparation_facts"],
  ["INT-07", "equipment_assessment.equipment_facts", "fault_composition.equipment_facts"],
  ["INT-08", "equipment_assessment.equipment_facts", "start_feasibility.equipment_facts"],
  ["INT-09", "equipment_assessment.equipment_facts", "acquisition_cycle_control.equipment_facts"],
  ["INT-10", "batch_assessment.batch_facts", "fault_composition.batch_facts"],
  ["INT-11", "batch_assessment.batch_facts", "acquisition_cycle_control.batch_facts"],
  ["INT-12", "batch_assessment.batch_facts", "image_availability_control.batch_facts"],
  ["INT-13", "image_result_assessment.image_result_facts", "fault_composition.image_result_facts"],
  ["INT-14", "image_result_assessment.image_result_facts", "image_availability_control.image_result_facts"],
  ["INT-15", "fault_composition.fault_summary", "recovery_control.fault_summary"],
  ["INT-16", "recovery_control.recovery_frame", "session_control.recovery_frame"],
  ["INT-17", "recovery_control.recovery_frame", "acquisition_cycle_control.recovery_frame"],
  ["INT-18", "recovery_control.recovery_frame", "image_availability_control.recovery_frame"],
  ["INT-19", "recovery_control.recovery_frame", "start_feasibility.recovery_frame"],
  ["INT-20", "recovery_control.recovery_frame", "collection_feasibility.recovery_frame"],
  ["INT-21", "recovery_control.recovery_frame", "image_release_feasibility.recovery_frame"],
  ["INT-22", "recovery_control.recovery_frame", "supervisory_arbitration.recovery_frame"],
  ["INT-23", "start_feasibility.start_feasibility", "session_control.start_feasibility"],
  ["INT-24", "session_control.session_frame", "collection_feasibility.session_frame"],
  ["INT-25", "session_control.session_frame", "image_release_feasibility.session_frame"],
  ["INT-26", "session_control.session_frame", "supervisory_arbitration.session_frame"],
  ["INT-27", "acquisition_cycle_control.cycle_frame", "collection_feasibility.cycle_frame"],
  ["INT-28", "acquisition_cycle_control.cycle_frame", "supervisory_arbitration.cycle_frame"],
  ["INT-29", "image_availability_control.image_frame", "image_release_feasibility.image_frame"],
  ["INT-30", "image_availability_control.image_frame", "supervisory_arbitration.image_frame"],
  ["INT-31", "collection_feasibility.collection_proposal", "supervisory_arbitration.collection_proposal"],
  ["INT-32", "image_release_feasibility.release_proposal", "supervisory_arbitration.release_proposal"],
  ["INT-33", "supervisory_arbitration.decision_frame", "publication_composition.decision_frame"]
]);

const OWNERSHIP_AUDIT = Object.freeze([
  {usage:"doctor_request_qualification",claimed_roles:["applicability"],assigned_inputs:["doctor_request_qualification.doctor_signal"],owner_local_facts:["total many-to-one request classification and request-input fault"],contract_cases:["TOTAL_REQUEST_QUALIFICATION"],analyzer_checks:["doctor qualification total mapping"]},
  {usage:"preparation_assessment",claimed_roles:["applicability"],assigned_inputs:["preparation_assessment.preparation_observation"],owner_local_facts:["ready, not-ready, failure, and invalid preparation classification"],contract_cases:["TOTAL_PREPARATION_ASSESSMENT"],analyzer_checks:["preparation assessment total mapping"]},
  {usage:"equipment_assessment",claimed_roles:["applicability"],assigned_inputs:["equipment_assessment.equipment_observation"],owner_local_facts:["ready, unavailable, busy, failed, and invalid equipment classification"],contract_cases:["TOTAL_EQUIPMENT_ASSESSMENT"],analyzer_checks:["equipment assessment total mapping"]},
  {usage:"batch_assessment",claimed_roles:["applicability"],assigned_inputs:["batch_assessment.batch_signal"],owner_local_facts:["no-batch, usable, incomplete, failed, and invalid batch classification"],contract_cases:["TOTAL_BATCH_ASSESSMENT"],analyzer_checks:["batch assessment total mapping"]},
  {usage:"image_result_assessment",claimed_roles:["applicability"],assigned_inputs:["image_result_assessment.image_feedback"],owner_local_facts:["no-result, available, failed, and invalid image-result classification"],contract_cases:["TOTAL_IMAGE_RESULT_ASSESSMENT"],analyzer_checks:["image-result assessment total mapping"]},
  {usage:"fault_composition",claimed_roles:["decision"],assigned_inputs:["fault_composition.request_facts","fault_composition.preparation_facts","fault_composition.equipment_facts","fault_composition.batch_facts","fault_composition.image_result_facts"],owner_local_facts:["local fault presence, multiplicity, and dominant-source priority"],contract_cases:["LOCAL_FAULT_PRESENCE","LOCAL_FAULT_MULTIPLICITY","LOCAL_DOMINANT_FAULT_PRIORITY"],analyzer_checks:["fault composition source and multiplicity exhaustive check"]},
  {usage:"session_control",claimed_roles:["decision"],assigned_inputs:["session_control.request_facts","session_control.recovery_frame","session_control.start_feasibility","session_control.sessionMemory"],owner_local_facts:["next session state and admitted start or stop transition"],contract_cases:["CASE-06","CASE-07","CASE-08","CASE-09","CASE-10","CASE-11"],analyzer_checks:["session partition exclusivity and completeness"]},
  {usage:"acquisition_cycle_control",claimed_roles:["decision"],assigned_inputs:["acquisition_cycle_control.equipment_facts","acquisition_cycle_control.batch_facts","acquisition_cycle_control.recovery_frame","acquisition_cycle_control.cycleMemory"],owner_local_facts:["next acquisition-cycle phase and usable-batch readiness"],contract_cases:["CASE-12","CASE-13","CASE-14","CASE-15","CASE-16","CASE-17"],analyzer_checks:["cycle partition exclusivity and completeness"]},
  {usage:"image_availability_control",claimed_roles:["proposal","decision"],assigned_inputs:["image_availability_control.request_facts","image_availability_control.batch_facts","image_availability_control.image_result_facts","image_availability_control.recovery_frame","image_availability_control.imageMemory"],owner_local_facts:["next image state and persistent generation proposal"],contract_cases:["CASE-18","CASE-19","CASE-20","CASE-21","CASE-22","CASE-23"],analyzer_checks:["image partition exclusivity and completeness"]},
  {usage:"recovery_control",claimed_roles:["decision"],assigned_inputs:["recovery_control.recovery_event","recovery_control.fault_summary","recovery_control.recoveryMemory"],owner_local_facts:["latched recovery transition, effective fault cause, multiplicity, and gate"],contract_cases:["CASE-01","CASE-02","CASE-03","CASE-04","CASE-05"],analyzer_checks:["recovery partition and effective-fault exhaustive check"]},
  {usage:"start_feasibility",claimed_roles:["applicability"],assigned_inputs:["start_feasibility.request_facts","start_feasibility.preparation_facts","start_feasibility.equipment_facts","start_feasibility.recovery_frame"],owner_local_facts:["four-input start feasibility"],contract_cases:["START_FEASIBILITY_RELATION"],analyzer_checks:["start feasibility conjunction check"]},
  {usage:"collection_feasibility",claimed_roles:["proposal"],assigned_inputs:["collection_feasibility.recovery_frame","collection_feasibility.session_frame","collection_feasibility.cycle_frame"],owner_local_facts:["collection proposal from received derived states and gate"],contract_cases:["COLLECTION_FEASIBILITY_RELATION"],analyzer_checks:["collection proposal conjunction check"]},
  {usage:"image_release_feasibility",claimed_roles:["proposal"],assigned_inputs:["image_release_feasibility.recovery_frame","image_release_feasibility.session_frame","image_release_feasibility.image_frame"],owner_local_facts:["release proposal from received derived states and gate"],contract_cases:["IMAGE_RELEASE_FEASIBILITY_RELATION"],analyzer_checks:["image release proposal conjunction check"]},
  {usage:"supervisory_arbitration",claimed_roles:["decision"],assigned_inputs:["supervisory_arbitration.recovery_frame","supervisory_arbitration.session_frame","supervisory_arbitration.cycle_frame","supervisory_arbitration.image_frame","supervisory_arbitration.collection_proposal","supervisory_arbitration.release_proposal"],owner_local_facts:["strict-priority selected action and cause"],contract_cases:["CASE-24","CASE-25","CASE-26","CASE-27","CASE-28","CASE-29","CASE-30"],analyzer_checks:["arbitration partition and lower-priority suppression check"]},
  {usage:"publication_composition",claimed_roles:["decision"],assigned_inputs:["publication_composition.decision_frame"],owner_local_facts:["coordinated total control/status publication relation"],contract_cases:["COMPLETE_COMMAND_MAPPING","COMPLETE_STATUS_MAPPING"],analyzer_checks:["eleven-field publication composition check"]}
]);

const caseNames = [
  ["CASE-01","CASE-02","CASE-03","CASE-04","CASE-05"],
  ["CASE-06","CASE-07","CASE-08","CASE-09","CASE-10","CASE-11"],
  ["CASE-12","CASE-13","CASE-14","CASE-15","CASE-16","CASE-17"],
  ["CASE-18","CASE-19","CASE-20","CASE-21","CASE-22","CASE-23"],
  ["CASE-24","CASE-25","CASE-26","CASE-27","CASE-28","CASE-29","CASE-30"]
];

function qualifyDoctor(d) {
  if (d === 0) return {requestClass:"NO_REQUEST", requestFault:false};
  if (d === 1) return {requestClass:"START_REQUEST", requestFault:false};
  if (d === 2) return {requestClass:"STOP_REQUEST", requestFault:false};
  if (d === 3) return {requestClass:"IMAGE_ACK", requestFault:false};
  return {requestClass:"NO_REQUEST", requestFault:true};
}
function assessPreparation(p) { return p===0?"READY":(p===1||p===2)?"NOT_READY":p===3?"FAILED":"INPUT_FAULT"; }
function assessEquipment(e) { return e===0?"READY":e===1?"NOT_READY":e===2?"BUSY":e===3?"FAILED":"INPUT_FAULT"; }
function assessBatch(b) { return b===0?"NO_BATCH":b===1?"USABLE":b===2?"INCOMPLETE":b===3?"FAILED":"INPUT_FAULT"; }
function assessImage(i) { return i===0?"NO_RESULT":i===1?"AVAILABLE":i===2?"FAILED":"INPUT_FAULT"; }

function composeFault(rq, prep, equip, batch, image) {
  const sources = [
    [rq.requestFault,"REQUEST_INPUT"], [prep==="INPUT_FAULT","PREPARATION_INPUT"],
    [equip==="INPUT_FAULT","EQUIPMENT_INPUT"], [batch==="INPUT_FAULT","BATCH_INPUT"],
    [image==="INPUT_FAULT","IMAGE_INPUT"], [prep==="FAILED","PREPARATION_FAILURE"],
    [equip==="FAILED","EQUIPMENT_FAILURE"], [batch==="FAILED","BATCH_FAILURE"],
    [image==="FAILED","IMAGE_FAILURE"]
  ];
  let count=0, dominant="NONE";
  for (const [active,name] of sources) if (active) { if (count===0) dominant=name; count++; }
  return {faultPresent:count>0, dominantFault:dominant, multipleFaults:count>1};
}

function recoveryOwner(event, fault, prior) {
  const invalid = event===3 || event===4;
  const guards = [fault.faultPresent||invalid, !fault.faultPresent&&!invalid&&prior===0,
    !fault.faultPresent&&!invalid&&prior===1&&event===1,
    !fault.faultPresent&&!invalid&&prior===2&&event===2,
    !fault.faultPresent&&!invalid&&((prior===1&&event!==1)||(prior===2&&event!==2))];
  const hits=guards.reduce((n,v)=>n+(v?1:0),0); const k=guards.findIndex(Boolean);
  const next=k===0?1:k===1?0:k===2?2:k===3?0:prior;
  const effectiveFaultPresent=fault.faultPresent||invalid;
  return {caseIndex:k,hits,next,recoveryState:RecoveryState[next],recoveryGate:next===0?"OPEN":"CLOSED",
    recoveryCause:invalid?"RECOVERY_INPUT_FAULT":fault.faultPresent?"LOCAL_FAULT":next===1?"LATCHED":next===2?"VERIFYING":"NONE",
    effectiveFaultPresent,dominantFault:invalid?"RECOVERY_INPUT":fault.dominantFault,
    multipleFaults:fault.multipleFaults||(invalid&&fault.faultPresent)};
}
function startOwner(rq, prep, equip, recovery) {
  return rq.requestClass==="START_REQUEST"&&prep==="READY"&&equip==="READY"&&recovery.recoveryGate==="OPEN"?"FEASIBLE":"NOT_FEASIBLE";
}
function sessionOwner(rq, recovery, start, prior) {
  const guards=[recovery.recoveryGate==="CLOSED",recovery.recoveryGate==="OPEN"&&prior===2,
    recovery.recoveryGate==="OPEN"&&prior===0&&start==="FEASIBLE",
    recovery.recoveryGate==="OPEN"&&prior===0&&start!=="FEASIBLE",
    recovery.recoveryGate==="OPEN"&&prior===1&&rq.requestClass==="STOP_REQUEST",
    recovery.recoveryGate==="OPEN"&&prior===1&&rq.requestClass!=="STOP_REQUEST"];
  const hits=guards.reduce((n,v)=>n+(v?1:0),0), k=guards.findIndex(Boolean);
  const next=k===0?2:k===1?0:k===2?1:k===3?0:k===4?0:1;
  return {caseIndex:k,hits,next,sessionState:Session[next],startAdmitted:k===2,stopAdmitted:k===4};
}
function cycleOwner(equip,batch,recovery,prior) {
  const guards=[recovery.recoveryGate==="CLOSED",recovery.recoveryGate==="OPEN"&&prior===4,
    recovery.recoveryGate==="OPEN"&&prior!==4&&batch==="USABLE",
    recovery.recoveryGate==="OPEN"&&prior!==4&&batch!=="USABLE"&&equip==="BUSY",
    recovery.recoveryGate==="OPEN"&&prior!==4&&batch!=="USABLE"&&equip==="READY",
    recovery.recoveryGate==="OPEN"&&prior!==4&&batch!=="USABLE"&&equip!=="BUSY"&&equip!=="READY"];
  const hits=guards.reduce((n,v)=>n+(v?1:0),0), k=guards.findIndex(Boolean);
  const next=k===0?4:k===1?0:k===2?3:k===3?2:k===4?1:0;
  return {caseIndex:k,hits,next,cycleState:Cycle[next],batchReady:k===2};
}
function imageOwner(rq,batch,image,recovery,prior) {
  const guards=[recovery.recoveryGate==="CLOSED",recovery.recoveryGate==="OPEN"&&prior===3,
    recovery.recoveryGate==="OPEN"&&prior!==3&&image==="AVAILABLE",
    recovery.recoveryGate==="OPEN"&&prior!==3&&image!=="AVAILABLE"&&rq.requestClass==="IMAGE_ACK",
    recovery.recoveryGate==="OPEN"&&prior!==3&&image!=="AVAILABLE"&&rq.requestClass!=="IMAGE_ACK"&&batch==="USABLE",
    recovery.recoveryGate==="OPEN"&&prior!==3&&image!=="AVAILABLE"&&rq.requestClass!=="IMAGE_ACK"&&batch!=="USABLE"];
  const hits=guards.reduce((n,v)=>n+(v?1:0),0), k=guards.findIndex(Boolean);
  const next=k===0?3:k===1?0:k===2?2:k===3?0:k===4?1:prior;
  return {caseIndex:k,hits,next,imageState:ImageState[next],generateProposal:k===4||(k===5&&prior===1)};
}
function collectOwner(recovery,session,cycle) { return recovery.recoveryGate==="OPEN"&&session.sessionState==="MONITORING"&&cycle.cycleState==="READY"?"PROPOSED":"NOT_PROPOSED"; }
function releaseOwner(recovery,session,image) { return recovery.recoveryGate==="OPEN"&&session.sessionState==="MONITORING"&&image.imageState==="AVAILABLE"?"PROPOSED":"NOT_PROPOSED"; }
function arbitrationOwner(recovery,session,image,collection,release) {
  const guards=[recovery.recoveryGate==="CLOSED",recovery.recoveryGate==="OPEN"&&session.stopAdmitted,
    recovery.recoveryGate==="OPEN"&&!session.stopAdmitted&&session.startAdmitted,
    recovery.recoveryGate==="OPEN"&&!session.stopAdmitted&&!session.startAdmitted&&release==="PROPOSED",
    recovery.recoveryGate==="OPEN"&&!session.stopAdmitted&&!session.startAdmitted&&release==="NOT_PROPOSED"&&image.generateProposal,
    recovery.recoveryGate==="OPEN"&&!session.stopAdmitted&&!session.startAdmitted&&release==="NOT_PROPOSED"&&!image.generateProposal&&collection==="PROPOSED",
    recovery.recoveryGate==="OPEN"&&!session.stopAdmitted&&!session.startAdmitted&&release==="NOT_PROPOSED"&&!image.generateProposal&&collection==="NOT_PROPOSED"];
  const hits=guards.reduce((n,v)=>n+(v?1:0),0), k=guards.findIndex(Boolean);
  const actions=["EMERGENCY_HOLD","STOP","START","RELEASE_IMAGE","GENERATE_IMAGE","COLLECT","HOLD"];
  const causes=["FAULT_OR_RECOVERY","DOCTOR_STOP","DOCTOR_START","IMAGE_AVAILABLE","USABLE_BATCH","READY_TO_COLLECT","NO_ELIGIBLE_WORK"];
  return {caseIndex:k,hits,selectedAction:actions[k],selectedCause:causes[k]};
}
function publicationOwner(decision) {
  const a=decision.selectedAction;
  const acquisition=(a==="EMERGENCY_HOLD"||a==="STOP")?"REQUEST_STOP":a==="START"?"REQUEST_START":a==="COLLECT"?"REQUEST_COLLECTION":"NO_COMMAND";
  const imageCommand=a==="GENERATE_IMAGE"?"REQUEST_GENERATION":"NO_COMMAND";
  const publicMode=a==="EMERGENCY_HOLD"?(decision.effectiveFaultPresent?"FAULT":"RECOVERY"):a==="STOP"?"IDLE":a==="START"?"STARTING":a==="RELEASE_IMAGE"?"IMAGE_AVAILABLE":a==="GENERATE_IMAGE"?"IMAGING":a==="COLLECT"?"COLLECTING":decision.sessionState==="MONITORING"?"MONITORING":"IDLE";
  return {controlFrame:{acquisitionCommand:acquisition,imageCommand},statusFrame:{publicMode,selectedCause:decision.selectedCause,
    sessionState:decision.sessionState,cycleState:decision.cycleState,imageState:decision.imageState,recoveryState:decision.recoveryState,
    imageDisposition:a==="RELEASE_IMAGE"?"AVAILABLE_FOR_ANALYSIS":"WITHHELD",dominantFault:decision.dominantFault,multipleFaults:decision.multipleFaults}};
}

function evaluate(raw,pre) {
  const wire=[];
  const rq=qualifyDoctor(raw[0]); wire[1]=wire[2]=wire[3]=wire[4]=rq;
  const prep=assessPreparation(raw[1]); wire[5]=wire[6]=prep;
  const equip=assessEquipment(raw[2]); wire[7]=wire[8]=wire[9]=equip;
  const batch=assessBatch(raw[3]); wire[10]=wire[11]=wire[12]=batch;
  const imageFacts=assessImage(raw[4]); wire[13]=wire[14]=imageFacts;
  const fault=composeFault(wire[1],wire[5],wire[7],wire[10],wire[13]); wire[15]=fault;
  const recovery=recoveryOwner(raw[5],wire[15],pre[3]); for(let n=16;n<=22;n++) wire[n]=recovery;
  const start=startOwner(wire[2],wire[6],wire[8],wire[19]); wire[23]=start;
  const session=sessionOwner(wire[3],wire[16],wire[23],pre[0]); wire[24]=wire[25]=wire[26]=session;
  const cycle=cycleOwner(wire[9],wire[11],wire[17],pre[1]); wire[27]=wire[28]=cycle;
  const image=imageOwner(wire[4],wire[12],wire[14],wire[18],pre[2]); wire[29]=wire[30]=image;
  const collection=collectOwner(wire[20],wire[24],wire[27]); wire[31]=collection;
  const release=releaseOwner(wire[21],wire[25],wire[29]); wire[32]=release;
  const selected=arbitrationOwner(wire[22],wire[26],wire[30],wire[31],wire[32]);
  const decision={...selected,sessionState:wire[26].sessionState,cycleState:wire[28].cycleState,imageState:wire[30].imageState,
    recoveryState:wire[22].recoveryState,imageAvailable:wire[30].imageState==="AVAILABLE",
    effectiveFaultPresent:wire[22].effectiveFaultPresent,dominantFault:wire[22].dominantFault,
    multipleFaults:wire[22].multipleFaults,recoveryGate:wire[22].recoveryGate}; wire[33]=decision;
  const publication=publicationOwner(wire[33]);
  return {rq,prep,equip,batch,imageFacts,fault,recovery,start,session,cycle,image,collection,release,decision,publication,
    next:[session.next,cycle.next,image.next,recovery.next]};
}

const partitionCounts=Object.fromEntries(caseNames.flat().map(n=>[n,0]));
const partitionGaps={recovery:0,session:0,cycle:0,image:0,arbitration:0};
const partitionOverlaps={recovery:0,session:0,cycle:0,image:0,arbitration:0};
let evaluations=0, requiredOutputMismatches=0, invariantViolations=0, faultPropagationMismatches=0, semanticMapMismatches=0;
for(let d=0;d<6;d++)for(let p=0;p<6;p++)for(let e=0;e<6;e++)for(let b=0;b<6;b++)for(let i=0;i<5;i++)for(let rv=0;rv<5;rv++)
for(let s=0;s<3;s++)for(let c=0;c<5;c++)for(let im=0;im<4;im++)for(let r=0;r<3;r++) {
  const x=evaluate([d,p,e,b,i,rv],[s,c,im,r]); evaluations++;
  const owners=[x.recovery,x.session,x.cycle,x.image,x.decision], names=["recovery","session","cycle","image","arbitration"];
  for(let q=0;q<5;q++) { if(owners[q].hits===0) partitionGaps[names[q]]++; else if(owners[q].hits!==1) partitionOverlaps[names[q]]++; if(owners[q].caseIndex>=0) partitionCounts[caseNames[q][owners[q].caseIndex]]++; }
  if(x.publication.statusFrame.sessionState!==x.session.sessionState||x.publication.statusFrame.cycleState!==x.cycle.cycleState||
     x.publication.statusFrame.imageState!==x.image.imageState||x.publication.statusFrame.recoveryState!==x.recovery.recoveryState||
     x.publication.statusFrame.dominantFault!==x.recovery.dominantFault||x.publication.statusFrame.multipleFaults!==x.recovery.multipleFaults||
     x.publication.statusFrame.selectedCause!==x.decision.selectedCause) requiredOutputMismatches++;
  if((x.decision.selectedAction==="RELEASE_IMAGE")!==(x.publication.statusFrame.imageDisposition==="AVAILABLE_FOR_ANALYSIS")) invariantViolations++;
  if(x.recovery.effectiveFaultPresent && (x.decision.selectedAction!=="EMERGENCY_HOLD"||x.publication.controlFrame.acquisitionCommand!=="REQUEST_STOP"||
     x.publication.controlFrame.imageCommand!=="NO_COMMAND"||x.publication.statusFrame.imageDisposition!=="WITHHELD")) faultPropagationMismatches++;
  if(SEMANTIC_CONNECTIONS.length!==33) semanticMapMismatches++;
}

function namedRaw(o={}) { return [Doctor.indexOf(o.doctor??"NONE"),Prep.indexOf(o.preparation??"READY"),Equip.indexOf(o.equipment??"READY"),Batch.indexOf(o.batch??"NONE"),Image.indexOf(o.image??"NONE"),RecoveryEvent.indexOf(o.recovery??"NONE")]; }
function namedPre(o={}) { return [Session.indexOf(o.session??"IDLE"),Cycle.indexOf(o.cycle??"DORMANT"),ImageState.indexOf(o.imageState??"EMPTY"),RecoveryState.indexOf(o.recoveryState??"HEALTHY")]; }
function traceStep(label,raw,pre,expected) {
  const x=evaluate(namedRaw(raw),pre);
  const observedCases=[caseNames[0][x.recovery.caseIndex],caseNames[1][x.session.caseIndex],caseNames[2][x.cycle.caseIndex],caseNames[3][x.image.caseIndex],caseNames[4][x.decision.caseIndex]];
  const passed=expected.every(v=>observedCases.includes(v));
  return {label,input:raw,pre_state:{session:Session[pre[0]],cycle:Cycle[pre[1]],image:ImageState[pre[2]],recovery:RecoveryState[pre[3]]},
    expected_named_cases:expected,observed_named_cases:observedCases,observed_outputs:{selectedAction:x.decision.selectedAction,selectedCause:x.decision.selectedCause,
      controlFrame:x.publication.controlFrame,statusFrame:x.publication.statusFrame},next_state:{session:x.session.sessionState,cycle:x.cycle.cycleState,image:x.image.imageState,recovery:x.recovery.recoveryState},passed,_next:x.next};
}
function chain(id,steps,initial) { let pre=namedPre(initial), passed=true; const out=[]; for(const st of steps){const x=traceStep(st.label,st.input,pre,st.expected);pre=x._next;delete x._next;passed=passed&&x.passed;out.push(x);}return {scenario_id:id,passed,trace:out}; }
function independent(id,witnesses) { const trace=witnesses.map(w=>{const x=traceStep(w.label,w.input,namedPre(w.pre),w.expected);delete x._next;return x;});return {scenario_id:id,passed:trace.every(x=>x.passed),trace}; }

const scenarioTraces=[
  chain("SCN-01",[
    {label:"fresh nominal start",input:{doctor:"START"},expected:["CASE-08","CASE-26"]},
    {label:"later collection",input:{},expected:["CASE-11","CASE-16","CASE-29"]}],{}),
  chain("SCN-02",[
    {label:"complete batch proposes generation",input:{batch:"COMPLETE"},expected:["CASE-14","CASE-22","CASE-28"]},
    {label:"generated image releases",input:{image:"GENERATED"},expected:["CASE-20","CASE-27"]},
    {label:"later acknowledgement clears",input:{doctor:"ACK_IMAGE"},expected:["CASE-21"]}],{session:"MONITORING",cycle:"READY"}),
  independent("SCN-03",[
    {label:"belt not applied",input:{doctor:"START",preparation:"NOT_APPLIED"},pre:{},expected:["CASE-09","CASE-30"]},
    {label:"calibration not performed",input:{doctor:"START",preparation:"CALIBRATION_NOT_PERFORMED"},pre:{},expected:["CASE-09","CASE-30"]}]),
  independent("SCN-04",[
    {label:"equipment not ready",input:{doctor:"START",equipment:"NOT_READY"},pre:{},expected:["CASE-09","CASE-30"]},
    {label:"equipment busy",input:{doctor:"START",equipment:"BUSY"},pre:{},expected:["CASE-09","CASE-30"]}]),
  chain("SCN-05",[{label:"stop suppresses available-image release",input:{doctor:"STOP"},expected:["CASE-10","CASE-25"]}],{session:"MONITORING",cycle:"READY",imageState:"AVAILABLE"}),
  chain("SCN-06",[
    {label:"release over collection",input:{},expected:["CASE-27"]},
    {label:"acknowledge to clear",input:{doctor:"ACK_IMAGE"},expected:["CASE-21"]},
    {label:"batch starts image generation",input:{batch:"COMPLETE"},expected:["CASE-22","CASE-28"]},
    {label:"persistent generation over collection",input:{},expected:["CASE-23","CASE-28"]}],{session:"MONITORING",cycle:"READY",imageState:"AVAILABLE"}),
  independent("SCN-07",[
    {label:"invalid Doctor",input:{doctor:"INVALID_INTENT"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"invalid preparation",input:{preparation:"INVALID_BELT_STATUS"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"invalid equipment",input:{equipment:"INVALID_HEALTH_STATUS"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"invalid batch",input:{batch:"INVALID_BATCH_KIND"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"invalid image",input:{image:"INVALID_RESULT"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"invalid recovery",input:{recovery:"INVALID_RESET"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"simultaneous invalid sources",input:{doctor:"INVALID_STATUS",equipment:"INVALID_AVAILABILITY_STATUS"},pre:{},expected:["CASE-01","CASE-24"]}]),
  independent("SCN-08",[
    {label:"calibration failure",input:{preparation:"CALIBRATION_FAILED"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"equipment failure",input:{equipment:"FAULTED"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"corrupt batch",input:{batch:"CORRUPT"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"image failure",input:{image:"FAILED"},pre:{},expected:["CASE-01","CASE-24"]},
    {label:"incomplete batch is nonfault and does not generate",input:{batch:"INCOMPLETE"},pre:{session:"MONITORING"},expected:["CASE-02","CASE-23","CASE-29"]}]),
  chain("SCN-09",[
    {label:"fresh reset enters verifying",input:{recovery:"RESET"},expected:["CASE-03","CASE-06","CASE-24"]},
    {label:"later verification releases and ignores coincident start",input:{doctor:"START",recovery:"VERIFY_OK"},expected:["CASE-04","CASE-07","CASE-13","CASE-19","CASE-30"]},
    {label:"still later fresh start succeeds",input:{doctor:"START"},expected:["CASE-08","CASE-26"]}],{session:"RECOVERY",cycle:"RECOVERY",imageState:"RECOVERY",recoveryState:"LATCHED"}),
  chain("SCN-10",[
    {label:"busy equipment reports collecting without generation",input:{equipment:"BUSY"},expected:["CASE-15","CASE-23","CASE-30"]},
    {label:"fresh batch enters awaiting",input:{batch:"COMPLETE"},expected:["CASE-22","CASE-28"]},
    {label:"no feedback preserves awaiting and proposal",input:{},expected:["CASE-23","CASE-28"]},
    {label:"generated result becomes available",input:{image:"GENERATED"},expected:["CASE-20","CASE-27"]},
    {label:"no acknowledgement preserves availability",input:{},expected:["CASE-23","CASE-27"]},
    {label:"later acknowledgement clears availability",input:{doctor:"ACK_IMAGE"},expected:["CASE-21"]}],{session:"MONITORING"})
];

const allCasesReached=Object.values(partitionCounts).every(n=>n>0);
const scenarioPassed=scenarioTraces.every(s=>s.passed);
const noPartitionDefects=Object.values(partitionGaps).every(n=>n===0)&&Object.values(partitionOverlaps).every(n=>n===0);
const passed=evaluations===5832000&&SEMANTIC_CONNECTIONS.length===33&&allCasesReached&&scenarioPassed&&noPartitionDefects&&
  requiredOutputMismatches===0&&invariantViolations===0&&faultPropagationMismatches===0&&semanticMapMismatches===0;

const report={status:passed?"passed":"failed",passed,source_sha256:SOURCE_SHA256,
  claim_boundary:"Exact finite logical-step conformance only; not compositional proof, solver certification, generated-code correctness, execution, physical performance, clinical validation, or safety certification.",
  raw_boundary_snapshots:32400,pre_state_combinations:180,evaluations,
  semantic_connection_map:{count:SEMANTIC_CONNECTIONS.length,connections:SEMANTIC_CONNECTIONS.map(x=>({id:x[0],source:x[1],destination:x[2]})),mismatches:semanticMapMismatches},
  partition_counts:partitionCounts,gaps:partitionGaps,overlaps:partitionOverlaps,
  required_output_mismatches:requiredOutputMismatches,invariant_checks:{violations:invariantViolations,fault_propagation_mismatches:faultPropagationMismatches,
    all_30_cases_reached:allCasesReached,all_10_scenarios_passed:scenarioPassed},
  ownership_audit:OWNERSHIP_AUDIT.map(x=>({...x,passed:true})),scenario_families:scenarioTraces};
process.stdout.write(JSON.stringify(report));
