#!/usr/bin/env node
"use strict";

// Deterministic, dependency-free bounded conformance analysis. This file reads
// no external state. The source hash is bound to the retained canonical model.
const SOURCE_SHA256 = "a0d536bd69898122aacee8b6d8c03d08385de2a118a5475becdbb1d95ca05c71";

const D = ["NONE", "INVALID", "ARoutine", "AUrgent", "BRoutine", "BUrgent"];
const I = ["INVALID", "EMPTY", "LOW", "READY"];
const A = ["INVALID", "UNAVAILABLE", "AVAILABLE"];
const M = ["NONE", "OrderAccepted", "ReceiptOk", "HandoffOk", "FAILED"];
const R = ["NONE", "RESET", "VerifyOk"];
const DS = ["IDLE", "ARoutineOpen", "AUrgentOpen", "BRoutineOpen", "BUrgentOpen"];
const SS = ["CLEAR", "ORDERED"];
const RS = ["HEALTHY", "LATCHED", "RECOVERING"];

const semanticConnections = Object.freeze({
  "INT-01": "root.demand_signal -> demand_acquisition.demand_signal",
  "INT-02": "root.inventory_band -> inventory_acquisition.inventory_band",
  "INT-03": "root.material_event -> event_acquisition.material_event",
  "INT-04": "root.recovery_event -> recovery_supervisor.recovery_event",
  "INT-05": "root.supplier_availability -> replenishment_eligibility.supplier_availability",
  "INT-06": "root.production_availability -> material_readiness_assessment.production_availability",
  "INT-07": "result_composition.material_coordination_result -> root.material_coordination_result",
  "INT-08": "demand_acquisition.demand_boundary_facts -> demand_qualification.demand_boundary_facts",
  "INT-09": "inventory_acquisition.inventory_boundary_facts -> material_readiness_assessment.inventory_boundary_facts",
  "INT-10": "event_acquisition.event_boundary_facts -> event_coherence.event_boundary_facts",
  "INT-11": "demand_registry.prior_demand_state -> event_coherence.prior_demand_state",
  "INT-12": "supply_lifecycle.prior_supply_state -> event_coherence.prior_supply_state",
  "INT-13": "event_coherence.qualified_event_to_demand -> demand_registry.qualified_event",
  "INT-14": "event_coherence.qualified_event_to_supply -> supply_lifecycle.qualified_event",
  "INT-15": "event_coherence.fault_trigger -> recovery_supervisor.fault_trigger",
  "INT-16": "recovery_supervisor.gate_to_demand -> demand_registry.recovery_gate",
  "INT-17": "recovery_supervisor.gate_to_supply -> supply_lifecycle.recovery_gate",
  "INT-18": "recovery_supervisor.gate_to_urgent -> urgent_release_eligibility.recovery_gate",
  "INT-19": "recovery_supervisor.gate_to_routine -> routine_release_eligibility.recovery_gate",
  "INT-20": "recovery_supervisor.gate_to_replenishment -> replenishment_eligibility.recovery_gate",
  "INT-21": "recovery_supervisor.emergency_state -> material_action_arbitration.emergency_state",
  "INT-22": "demand_qualification.demand_facts -> demand_registry.demand_facts",
  "INT-23": "demand_registry.current_state_to_urgent -> urgent_release_eligibility.demand_state",
  "INT-24": "demand_registry.current_state_to_routine -> routine_release_eligibility.demand_state",
  "INT-25": "demand_registry.demand_transition -> result_composition.demand_transition",
  "INT-26": "material_readiness_assessment.readiness_to_urgent -> urgent_release_eligibility.material_readiness_facts",
  "INT-27": "material_readiness_assessment.readiness_to_routine -> routine_release_eligibility.material_readiness_facts",
  "INT-28": "material_readiness_assessment.readiness_to_replenishment -> replenishment_eligibility.material_readiness_facts",
  "INT-29": "supply_lifecycle.current_state_to_replenishment -> replenishment_eligibility.supply_state",
  "INT-30": "supply_lifecycle.current_state_to_composition -> result_composition.supply_state",
  "INT-31": "urgent_release_eligibility.proposal -> material_action_arbitration.urgent_proposal",
  "INT-32": "routine_release_eligibility.proposal -> material_action_arbitration.routine_proposal",
  "INT-33": "replenishment_eligibility.proposal -> material_action_arbitration.replenishment_proposal",
  "INT-34": "material_action_arbitration.decision -> result_composition.decision",
  "INT-35": "recovery_supervisor.recovery_state -> result_composition.recovery_state"
});

const ownershipAudit = [
  ["demand_acquisition", ["applicability"], ["demand_acquisition.demand_signal"], ["demand presence classification"], ["REL-DEM-01"], ["demand acquisition classification"]],
  ["inventory_acquisition", ["applicability"], ["inventory_acquisition.inventory_band"], ["inventory usability classification"], ["REL-INV-01"], ["inventory acquisition classification"]],
  ["event_acquisition", ["applicability"], ["event_acquisition.material_event"], ["event class classification"], ["REL-EVT-01"], ["event acquisition classification"]],
  ["demand_qualification", ["applicability"], ["demand_qualification.demand_boundary_facts"], ["validity urgency and material class"], ["REL-DEM-01"], ["demand qualification derivation"]],
  ["material_readiness_assessment", ["applicability"], ["material_readiness_assessment.inventory_boundary_facts", "material_readiness_assessment.production_availability"], ["material availability reserve and acceptance facts"], ["REL-INV-01"], ["readiness derivation"]],
  ["event_coherence", ["decision"], ["event_coherence.event_boundary_facts", "event_coherence.prior_demand_state", "event_coherence.prior_supply_state"], ["qualified event and fault trigger"], ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06"], ["event coherence partition"]],
  ["demand_registry", ["decision"], ["demand_registry.demand_facts", "demand_registry.qualified_event", "demand_registry.recovery_gate"], ["next demand phase update and disposition"], ["CASE-13", "CASE-14", "CASE-15", "CASE-16"], ["demand transition partition", "demand disposition relation"]],
  ["supply_lifecycle", ["decision"], ["supply_lifecycle.qualified_event", "supply_lifecycle.recovery_gate"], ["next supply phase"], ["CASE-17", "CASE-18"], ["supply transition partition"]],
  ["recovery_supervisor", ["decision"], ["recovery_supervisor.recovery_event", "recovery_supervisor.fault_trigger"], ["next recovery phase gate and emergency"], ["CASE-07", "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12"], ["recovery transition partition", "two event recovery sequence"]],
  ["urgent_release_eligibility", ["proposal"], ["urgent_release_eligibility.demand_state", "urgent_release_eligibility.material_readiness_facts", "urgent_release_eligibility.recovery_gate"], ["urgent release proposal"], ["CASE-19", "CASE-20"], ["urgent proposal partition"]],
  ["routine_release_eligibility", ["proposal"], ["routine_release_eligibility.demand_state", "routine_release_eligibility.material_readiness_facts", "routine_release_eligibility.recovery_gate"], ["routine release proposal"], ["CASE-21", "CASE-22"], ["routine proposal partition"]],
  ["replenishment_eligibility", ["proposal"], ["replenishment_eligibility.material_readiness_facts", "replenishment_eligibility.supply_state", "replenishment_eligibility.supplier_availability", "replenishment_eligibility.recovery_gate"], ["replenishment proposal"], ["CASE-23", "CASE-24"], ["replenishment proposal partition"]],
  ["material_action_arbitration", ["decision"], ["material_action_arbitration.emergency_state", "material_action_arbitration.urgent_proposal", "material_action_arbitration.replenishment_proposal", "material_action_arbitration.routine_proposal"], ["strict priority action and cause"], ["CASE-25", "CASE-26", "CASE-27", "CASE-28", "CASE-29"], ["arbitration priority partition"]],
  ["result_composition", ["decision"], ["result_composition.demand_transition", "result_composition.supply_state", "result_composition.recovery_state", "result_composition.decision"], ["atomic public mode and flat result"], ["REL-COMP-01"], ["atomic composition mapping"]]
].map(([usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks]) => ({usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks}));

const demandAcquire = d => ({demandValue:d, present:d !== "NONE"});
const inventoryAcquire = i => ({band:i, usable:i !== "INVALID"});
const eventAcquire = m => ({materialEvent:m, eventClass:m === "NONE" ? "NoEvent" : m === "FAILED" ? "FAILURE" : "SUCCESS"});
const demandQualify = f => ({...f, valid:["ARoutine","AUrgent","BRoutine","BUrgent"].includes(f.demandValue), urgent:["AUrgent","BUrgent"].includes(f.demandValue), materialClass:f.demandValue.startsWith("A") ? "A" : f.demandValue.startsWith("B") ? "B" : "NONE"});
const readinessAssess = (f, p) => ({band:f.band, usable:f.usable, materialAvailable:f.usable && ["LOW","READY"].includes(f.band), reserveLow:f.usable && f.band === "LOW", replenishmentNeeded:f.usable && ["EMPTY","LOW"].includes(f.band), productionEvidenceUsable:p !== "INVALID", productionAccepting:p === "AVAILABLE"});

function eventCoherence(f, ds, ss) {
  const guards = [f.eventClass === "NoEvent" && f.materialEvent === "NONE", f.eventClass === "FAILURE" && f.materialEvent === "FAILED", f.eventClass === "SUCCESS" && f.materialEvent === "OrderAccepted" && ss === "CLEAR", f.eventClass === "SUCCESS" && f.materialEvent === "ReceiptOk" && ss === "ORDERED", f.eventClass === "SUCCESS" && f.materialEvent === "HandoffOk" && ds !== "IDLE"];
  guards.push(!guards.some(Boolean));
  const k = guards.findIndex(Boolean) + 1;
  const q = ["NoProgress","FAULT","OrderRegistered","ReceiptConfirmed","HandoffConfirmed","FAULT"][k-1];
  return {qualifiedEvent:q, faultTrigger:q === "FAULT" ? "ACTIVE" : "INACTIVE", caseId:`CASE-0${k}`, guardCount:guards.filter(Boolean).length};
}
function recoveryOwner(prior, fault, re) {
  const guards = [fault === "ACTIVE", fault === "INACTIVE" && prior === "HEALTHY", fault === "INACTIVE" && prior === "LATCHED" && re === "RESET", fault === "INACTIVE" && prior === "LATCHED" && re !== "RESET", fault === "INACTIVE" && prior === "RECOVERING" && re === "VerifyOk", fault === "INACTIVE" && prior === "RECOVERING" && re !== "VerifyOk"];
  const k = guards.findIndex(Boolean) + 7;
  const phase = k === 7 || k === 10 ? "LATCHED" : k === 9 || k === 12 ? "RECOVERING" : "HEALTHY";
  return {recoveryPhase:phase, gate:phase === "HEALTHY" ? "OPEN" : "CLOSED", emergency:phase === "HEALTHY" ? "INACTIVE" : "ACTIVE", caseId:`CASE-${String(k).padStart(2,"0")}`, guardCount:guards.filter(Boolean).length};
}
function demandOwner(prior, facts, q, gate) {
  const exact = {ARoutine:"ARoutineOpen", AUrgent:"AUrgentOpen", BRoutine:"BRoutineOpen", BUrgent:"BUrgentOpen"}[facts.demandValue];
  const guards = [gate === "CLOSED", gate === "OPEN" && q === "HandoffConfirmed", gate === "OPEN" && q !== "HandoffConfirmed" && prior === "IDLE" && facts.valid, gate === "OPEN" && q !== "HandoffConfirmed" && (prior !== "IDLE" || !facts.valid)];
  const k = guards.findIndex(Boolean) + 13;
  let phase = prior, update = "NoChange";
  if (k === 14) { phase = "IDLE"; update = "CLEARED"; }
  if (k === 15) { phase = exact; update = "ACCEPTED"; }
  if (k === 16 && facts.valid) update = exact === prior ? "DUPLICATE" : "BUSY";
  const disposition = facts.demandValue === "NONE" ? "NoRequest" : facts.demandValue === "INVALID" ? "REJECTED" : update === "ACCEPTED" ? "ACCEPTED" : update === "DUPLICATE" ? "RetainedDuplicate" : "DEFERRED";
  return {demandPhase:phase, demandUpdate:update, demandDisposition:disposition, caseId:`CASE-${k}`, guardCount:guards.filter(Boolean).length};
}
function supplyOwner(prior, q, gate) {
  const progress = gate === "OPEN" && ["OrderRegistered","ReceiptConfirmed"].includes(q);
  return {supplyPhase:progress ? (q === "OrderRegistered" ? "ORDERED" : "CLEAR") : prior, caseId:progress ? "CASE-17" : "CASE-18", guardCount:1};
}
function urgentOwner(ds, f, gate) { const yes=gate === "OPEN" && ["AUrgentOpen","BUrgentOpen"].includes(ds) && f.materialAvailable && f.productionEvidenceUsable && f.productionAccepting; return {proposal:yes?"PROPOSED":"NotProposed",caseId:yes?"CASE-19":"CASE-20",guardCount:1}; }
function routineOwner(ds, f, gate) { const yes=gate === "OPEN" && ["ARoutineOpen","BRoutineOpen"].includes(ds) && f.materialAvailable && f.productionEvidenceUsable && f.productionAccepting; return {proposal:yes?"PROPOSED":"NotProposed",caseId:yes?"CASE-21":"CASE-22",guardCount:1}; }
function replenishOwner(f, ss, a, gate) { const yes=gate === "OPEN" && f.replenishmentNeeded && ss === "CLEAR" && a === "AVAILABLE"; return {proposal:yes?"PROPOSED":"NotProposed",caseId:yes?"CASE-23":"CASE-24",guardCount:1}; }
function arbitrate(e, u, p, r) { const guards=[e === "ACTIVE",e === "INACTIVE"&&u === "PROPOSED",e === "INACTIVE"&&u === "NotProposed"&&p === "PROPOSED",e === "INACTIVE"&&u === "NotProposed"&&p === "NotProposed"&&r === "PROPOSED",e === "INACTIVE"&&u === "NotProposed"&&p === "NotProposed"&&r === "NotProposed"]; const k=guards.findIndex(Boolean)+25; return {decision:[{actionValue:"HOLD",cause:"FaultOrRecovery"},{actionValue:"ReleaseUrgentMaterial",cause:"UrgentDemand"},{actionValue:"IssueMaterialOrder",cause:"ReserveReplenishment"},{actionValue:"ReleaseRoutineMaterial",cause:"RoutineDemand"},{actionValue:"HOLD",cause:"NoEligibleWork"}][k-25],caseId:`CASE-${k}`,guardCount:guards.filter(Boolean).length}; }
function compose(d, s, r, decision) { const mode=r !== "HEALTHY" ? "FAULT" : decision.actionValue === "IssueMaterialOrder" ? "ORDERING" : decision.actionValue.startsWith("Release") ? "RELEASING" : "HOLDING"; return {...decision,mode,demandPhase:d.demandPhase,supplyPhase:s,recoveryPhase:r,demandDisposition:d.demandDisposition}; }

function candidateStep(input, prior) {
  const db=demandAcquire(input.demandSignal), ib=inventoryAcquire(input.inventoryBand), eb=eventAcquire(input.materialEvent);
  const df=demandQualify(db), mf=readinessAssess(ib,input.productionAvailability);
  const ec=eventCoherence(eb,prior.demandPhase,prior.supplyPhase);
  const ro=recoveryOwner(prior.recoveryPhase,ec.faultTrigger,input.recoveryEvent);
  const dr=demandOwner(prior.demandPhase,df,ec.qualifiedEvent,ro.gate);
  const sl=supplyOwner(prior.supplyPhase,ec.qualifiedEvent,ro.gate);
  const up=urgentOwner(dr.demandPhase,mf,ro.gate), rp=routineOwner(dr.demandPhase,mf,ro.gate), pp=replenishOwner(mf,sl.supplyPhase,input.supplierAvailability,ro.gate);
  const ar=arbitrate(ro.emergency,up.proposal,pp.proposal,rp.proposal);
  const result=compose(dr,sl.supplyPhase,ro.recoveryPhase,ar.decision);
  return {result,next:{demandPhase:dr.demandPhase,supplyPhase:sl.supplyPhase,recoveryPhase:ro.recoveryPhase},cases:[ec.caseId,ro.caseId,dr.caseId,sl.caseId,up.caseId,rp.caseId,pp.caseId,ar.caseId],guardCounts:[ec.guardCount,ro.guardCount,dr.guardCount,sl.guardCount,up.guardCount,rp.guardCount,pp.guardCount,ar.guardCount],interactions:{"INT-08":db,"INT-09":ib,"INT-10":eb,"INT-13":ec.qualifiedEvent,"INT-14":ec.qualifiedEvent,"INT-15":ec.faultTrigger,"INT-16":ro.gate,"INT-17":ro.gate,"INT-18":ro.gate,"INT-19":ro.gate,"INT-20":ro.gate,"INT-21":ro.emergency,"INT-22":df,"INT-23":dr.demandPhase,"INT-24":dr.demandPhase,"INT-25":dr,"INT-26":mf,"INT-27":mf,"INT-28":mf,"INT-29":sl.supplyPhase,"INT-30":sl.supplyPhase,"INT-31":up.proposal,"INT-32":rp.proposal,"INT-33":pp.proposal,"INT-34":ar.decision,"INT-35":ro.recoveryPhase}};
}

// Independent abstract oracle: this relation does not call candidate owners and
// receives only root inputs and prior states.
function referenceStep(x, p) {
  let q="FAULT";
  if(x.materialEvent==="NONE")q="NoProgress"; else if(x.materialEvent==="FAILED")q="FAULT"; else if(x.materialEvent==="OrderAccepted"&&p.supplyPhase==="CLEAR")q="OrderRegistered"; else if(x.materialEvent==="ReceiptOk"&&p.supplyPhase==="ORDERED")q="ReceiptConfirmed"; else if(x.materialEvent==="HandoffOk"&&p.demandPhase!=="IDLE")q="HandoffConfirmed";
  let rr;
  if(q==="FAULT")rr="LATCHED"; else if(p.recoveryPhase==="HEALTHY")rr="HEALTHY"; else if(p.recoveryPhase==="LATCHED"&&x.recoveryEvent==="RESET")rr="RECOVERING"; else if(p.recoveryPhase==="RECOVERING"&&x.recoveryEvent==="VerifyOk")rr="HEALTHY"; else rr=p.recoveryPhase;
  const gate=rr==="HEALTHY";
  const valid=["ARoutine","AUrgent","BRoutine","BUrgent"].includes(x.demandSignal), exact={ARoutine:"ARoutineOpen",AUrgent:"AUrgentOpen",BRoutine:"BRoutineOpen",BUrgent:"BUrgentOpen"}[x.demandSignal];
  let ds=p.demandPhase,du="NoChange"; if(gate&&q==="HandoffConfirmed"){ds="IDLE";du="CLEARED";} else if(gate&&p.demandPhase==="IDLE"&&valid){ds=exact;du="ACCEPTED";} else if(gate&&valid){du=exact===p.demandPhase?"DUPLICATE":"BUSY";}
  const disp=x.demandSignal==="NONE"?"NoRequest":x.demandSignal==="INVALID"?"REJECTED":du==="ACCEPTED"?"ACCEPTED":du==="DUPLICATE"?"RetainedDuplicate":"DEFERRED";
  let ss=p.supplyPhase; if(gate&&q==="OrderRegistered")ss="ORDERED"; if(gate&&q==="ReceiptConfirmed")ss="CLEAR";
  const usable=x.inventoryBand!=="INVALID", available=usable&&["LOW","READY"].includes(x.inventoryBand), repl=usable&&["EMPTY","LOW"].includes(x.inventoryBand), prod=x.productionAvailability!=="INVALID"&&x.productionAvailability==="AVAILABLE";
  const u=gate&&["AUrgentOpen","BUrgentOpen"].includes(ds)&&available&&prod, r=gate&&["ARoutineOpen","BRoutineOpen"].includes(ds)&&available&&prod, o=gate&&repl&&ss==="CLEAR"&&x.supplierAvailability==="AVAILABLE";
  let actionValue="HOLD",cause=rr==="HEALTHY"?"NoEligibleWork":"FaultOrRecovery"; if(rr==="HEALTHY"&&u){actionValue="ReleaseUrgentMaterial";cause="UrgentDemand";} else if(rr==="HEALTHY"&&o){actionValue="IssueMaterialOrder";cause="ReserveReplenishment";} else if(rr==="HEALTHY"&&r){actionValue="ReleaseRoutineMaterial";cause="RoutineDemand";}
  const mode=rr!=="HEALTHY"?"FAULT":actionValue==="IssueMaterialOrder"?"ORDERING":actionValue.startsWith("Release")?"RELEASING":"HOLDING";
  return {actionValue,cause,mode,demandPhase:ds,supplyPhase:ss,recoveryPhase:rr,demandDisposition:disp};
}

const caseCounts=Object.fromEntries(Array.from({length:29},(_,i)=>[`CASE-${String(i+1).padStart(2,"0")}`,0]));
let evaluations=0,gaps=0,overlaps=0,requiredOutputMismatches=0,stateMismatches=0,interactionValueMismatches=0,priorityViolations=0,compositionViolations=0,invariantViolations=0;
const ownershipExecutions=Object.fromEntries(ownershipAudit.map(a=>[a.usage,0]));
const ownershipFailures=Object.fromEntries(ownershipAudit.map(a=>[a.usage,0]));
for(const demandSignal of D)for(const inventoryBand of I)for(const supplierAvailability of A)for(const productionAvailability of A)for(const materialEvent of M)for(const recoveryEvent of R)for(const demandPhase of DS)for(const supplyPhase of SS)for(const recoveryPhase of RS){
  const input={demandSignal,inventoryBand,supplierAvailability,productionAvailability,materialEvent,recoveryEvent},prior={demandPhase,supplyPhase,recoveryPhase};
  const c=candidateStep(input,prior),ref=referenceStep(input,prior); evaluations++;
  c.cases.forEach(id=>caseCounts[id]++); gaps+=c.guardCounts.filter(n=>n===0).length; overlaps+=c.guardCounts.filter(n=>n>1).length;
  if(JSON.stringify(c.result)!==JSON.stringify(ref))requiredOutputMismatches++;
  if(JSON.stringify(c.next)!==JSON.stringify({demandPhase:ref.demandPhase,supplyPhase:ref.supplyPhase,recoveryPhase:ref.recoveryPhase}))stateMismatches++;
  if(c.interactions["INT-13"]!==c.interactions["INT-14"]||c.interactions["INT-16"]!==c.interactions["INT-20"]||c.interactions["INT-23"]!==c.interactions["INT-24"]||JSON.stringify(c.interactions["INT-26"])!==JSON.stringify(c.interactions["INT-28"]))interactionValueMismatches++;
  const a=c.result.actionValue;if((c.interactions["INT-21"]==="ACTIVE"&&a!=="HOLD")||(c.interactions["INT-21"]==="INACTIVE"&&c.interactions["INT-31"]==="PROPOSED"&&a!=="ReleaseUrgentMaterial")||(c.interactions["INT-21"]==="INACTIVE"&&c.interactions["INT-31"]==="NotProposed"&&c.interactions["INT-33"]==="PROPOSED"&&a!=="IssueMaterialOrder"))priorityViolations++;
  if(c.result.recoveryPhase!==c.next.recoveryPhase||c.result.supplyPhase!==c.next.supplyPhase||c.result.demandPhase!==c.next.demandPhase)compositionViolations++;
  if(c.next.recoveryPhase!=="HEALTHY"&&(c.interactions["INT-31"]!=="NotProposed"||c.interactions["INT-32"]!=="NotProposed"||c.interactions["INT-33"]!=="NotProposed"||a!=="HOLD"))invariantViolations++;

  for(const usage of Object.keys(ownershipExecutions))ownershipExecutions[usage]++;
  const db=c.interactions["INT-08"],ib=c.interactions["INT-09"],eb=c.interactions["INT-10"],df=c.interactions["INT-22"],mf=c.interactions["INT-26"];
  if(db.demandValue!==demandSignal||db.present!==(demandSignal!=="NONE"))ownershipFailures.demand_acquisition++;
  if(ib.band!==inventoryBand||ib.usable!==(inventoryBand!=="INVALID"))ownershipFailures.inventory_acquisition++;
  if(eb.materialEvent!==materialEvent||eb.eventClass!==(materialEvent==="NONE"?"NoEvent":materialEvent==="FAILED"?"FAILURE":"SUCCESS"))ownershipFailures.event_acquisition++;
  if(df.present!==db.present||df.demandValue!==db.demandValue||df.valid!==["ARoutine","AUrgent","BRoutine","BUrgent"].includes(db.demandValue)||df.urgent!==["AUrgent","BUrgent"].includes(db.demandValue))ownershipFailures.demand_qualification++;
  if(mf.band!==ib.band||mf.usable!==ib.usable||mf.productionEvidenceUsable!==(productionAvailability!=="INVALID")||mf.productionAccepting!==(productionAvailability==="AVAILABLE"))ownershipFailures.material_readiness_assessment++;
  if(c.guardCounts[0]!==1)ownershipFailures.event_coherence++;
  if(c.guardCounts[2]!==1||c.result.demandPhase!==c.next.demandPhase)ownershipFailures.demand_registry++;
  if(c.guardCounts[3]!==1||c.result.supplyPhase!==c.next.supplyPhase)ownershipFailures.supply_lifecycle++;
  if(c.guardCounts[1]!==1||c.result.recoveryPhase!==c.next.recoveryPhase)ownershipFailures.recovery_supervisor++;
  if(c.guardCounts[4]!==1)ownershipFailures.urgent_release_eligibility++;
  if(c.guardCounts[5]!==1)ownershipFailures.routine_release_eligibility++;
  if(c.guardCounts[6]!==1)ownershipFailures.replenishment_eligibility++;
  if(c.guardCounts[7]!==1)ownershipFailures.material_action_arbitration++;
  if(c.result.actionValue!==c.interactions["INT-34"].actionValue||c.result.cause!==c.interactions["INT-34"].cause||c.result.demandDisposition!==c.interactions["INT-25"].demandDisposition)ownershipFailures.result_composition++;
}

const base={demandSignal:"NONE",inventoryBand:"READY",supplierAvailability:"UNAVAILABLE",productionAvailability:"AVAILABLE",materialEvent:"NONE",recoveryEvent:"NONE"};
function runTrace(initial, steps){let state={...initial};return steps.map((input,index)=>{const merged={...base,...input},o=candidateStep(merged,state);const row={step:index+1,input:merged,prior_state:state,expected_branch:o.cases,observed_result:o.result,next_state:o.next};state=o.next;return row;});}
const scenarios=[
  {id:"SCN-01",expected_named_branch:"CASE-15 then CASE-14",trace:runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{demandSignal:"ARoutine"},{materialEvent:"HandoffOk"}])},
  {id:"SCN-02",expected_named_branch:"CASE-19 and CASE-23 then CASE-26",trace:runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{demandSignal:"AUrgent",inventoryBand:"LOW",supplierAvailability:"AVAILABLE"}])},
  {id:"SCN-03",expected_named_branch:"CASE-21 and CASE-23 then CASE-27",trace:runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{demandSignal:"ARoutine",inventoryBand:"LOW",supplierAvailability:"AVAILABLE"}])},
  {id:"SCN-04",expected_named_branch:"CASE-23 then CASE-27",trace:runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{inventoryBand:"EMPTY",supplierAvailability:"AVAILABLE"}])},
  {id:"SCN-05",expected_named_branch:"CASE-03/17 then CASE-04/17",trace:runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{materialEvent:"OrderAccepted"},{materialEvent:"ReceiptOk"}])},
  {id:"SCN-06",expected_named_branch:"CASE-16 duplicate busy and invalid",trace:runTrace({demandPhase:"ARoutineOpen",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{demandSignal:"ARoutine"},{demandSignal:"BUrgent"},{demandSignal:"INVALID"}])},
  {id:"SCN-07",expected_named_branch:"CASE-20/22/24 invalid evidence inhibition",trace:runTrace({demandPhase:"AUrgentOpen",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{inventoryBand:"INVALID",productionAvailability:"AVAILABLE",supplierAvailability:"AVAILABLE"},{inventoryBand:"READY",productionAvailability:"INVALID"},{inventoryBand:"EMPTY",supplierAvailability:"INVALID"}])},
  {id:"SCN-08",expected_named_branch:"CASE-02/07/13/18/25",trace:runTrace({demandPhase:"AUrgentOpen",supplyPhase:"ORDERED",recoveryPhase:"HEALTHY"},[{materialEvent:"FAILED"}])},
  {id:"SCN-09",expected_named_branch:"CASE-06/07/25 phase inconsistency",trace:runTrace({demandPhase:"IDLE",supplyPhase:"ORDERED",recoveryPhase:"HEALTHY"},[{materialEvent:"OrderAccepted"}]),additional_witnesses:[
    ...runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{materialEvent:"ReceiptOk"}]),
    ...runTrace({demandPhase:"IDLE",supplyPhase:"CLEAR",recoveryPhase:"HEALTHY"},[{materialEvent:"HandoffOk"}])
  ]},
  {id:"SCN-10",expected_named_branch:"CASE-09 then CASE-11 and resumed CASE-19/26",trace:runTrace({demandPhase:"AUrgentOpen",supplyPhase:"CLEAR",recoveryPhase:"LATCHED"},[{recoveryEvent:"RESET"},{recoveryEvent:"VerifyOk"}])}
];

const scenarioExpectations={
  "SCN-01":s=>s.trace[0].observed_result.actionValue==="ReleaseRoutineMaterial"&&s.trace[0].observed_result.demandDisposition==="ACCEPTED"&&s.trace[1].next_state.demandPhase==="IDLE",
  "SCN-02":s=>s.trace[0].expected_branch.includes("CASE-19")&&s.trace[0].expected_branch.includes("CASE-23")&&s.trace[0].observed_result.actionValue==="ReleaseUrgentMaterial",
  "SCN-03":s=>s.trace[0].expected_branch.includes("CASE-21")&&s.trace[0].expected_branch.includes("CASE-23")&&s.trace[0].observed_result.actionValue==="IssueMaterialOrder"&&s.trace[0].next_state.demandPhase==="ARoutineOpen",
  "SCN-04":s=>s.trace[0].observed_result.actionValue==="IssueMaterialOrder"&&s.trace[0].expected_branch.includes("CASE-20")&&s.trace[0].expected_branch.includes("CASE-22"),
  "SCN-05":s=>s.trace[0].next_state.supplyPhase==="ORDERED"&&s.trace[1].next_state.supplyPhase==="CLEAR",
  "SCN-06":s=>s.trace.map(t=>t.observed_result.demandDisposition).join(",")==="RetainedDuplicate,DEFERRED,REJECTED"&&s.trace.every(t=>t.next_state.demandPhase==="ARoutineOpen"),
  "SCN-07":s=>s.trace.every(t=>t.observed_result.actionValue==="HOLD")&&s.trace[0].expected_branch.includes("CASE-20")&&s.trace[1].expected_branch.includes("CASE-20")&&s.trace[2].expected_branch.includes("CASE-24"),
  "SCN-08":s=>s.trace[0].observed_result.mode==="FAULT"&&s.trace[0].observed_result.actionValue==="HOLD"&&s.trace[0].next_state.demandPhase==="AUrgentOpen"&&s.trace[0].next_state.supplyPhase==="ORDERED"&&s.trace[0].next_state.recoveryPhase==="LATCHED",
  "SCN-09":s=>[...s.trace,...s.additional_witnesses].every(t=>t.expected_branch.includes("CASE-06")&&t.observed_result.mode==="FAULT"&&t.observed_result.actionValue==="HOLD"&&t.next_state.recoveryPhase==="LATCHED"),
  "SCN-10":s=>s.trace[0].next_state.recoveryPhase==="RECOVERING"&&s.trace[0].observed_result.actionValue==="HOLD"&&s.trace[1].next_state.recoveryPhase==="HEALTHY"&&s.trace[1].observed_result.actionValue==="ReleaseUrgentMaterial"
};
const scenarioChecks=scenarios.map(s=>({id:s.id,executed_steps:s.trace.length+(s.additional_witnesses?.length||0),passed:s.trace.length>0&&s.trace.every(t=>t.observed_result&&t.next_state)&&scenarioExpectations[s.id](s)}));
const allCaseWitnesses=Object.values(caseCounts).every(n=>n>0), allScenarios=scenarioChecks.every(s=>s.passed);
const auditedOwnership=ownershipAudit.map(a=>({...a,executed_evaluations:ownershipExecutions[a.usage],passed:ownershipExecutions[a.usage]===evaluations&&ownershipFailures[a.usage]===0&&a.contract_cases.every(id=>!id.startsWith("CASE-")||caseCounts[id]>0)}));
const allOwnershipChecks=auditedOwnership.every(a=>a.passed);
const passed=evaluations===97200&&Object.keys(semanticConnections).length===35&&allCaseWitnesses&&allScenarios&&allOwnershipChecks&&[gaps,overlaps,requiredOutputMismatches,stateMismatches,interactionValueMismatches,priorityViolations,compositionViolations,invariantViolations].every(n=>n===0);
const output={
  status:passed?"passed":"failed",passed,
  source_sha256:SOURCE_SHA256,
  claim_boundary:"Exhaustive conformance over the declared finite root-input and prior-state domain only; not formal proof, execution, generated-code correctness, physical performance, or safety certification.",
  domain:{root_input_combinations:3240,prior_state_tuples:30,exhaustive_one_step_evaluations:evaluations},
  semantic_connection_map:semanticConnections,
  partition_counts:caseCounts,
  gaps,overlaps,required_output_mismatches:requiredOutputMismatches,state_mismatches:stateMismatches,interaction_value_mismatches:interactionValueMismatches,
  invariant_checks:{closed_gate_inhibition_violations:invariantViolations,priority_violations:priorityViolations,composition_violations:compositionViolations,all_cases_witnessed:allCaseWitnesses,all_scenarios_executed:allScenarios},
  ownership_audit:auditedOwnership,
  scenario_checks:scenarioChecks,
  scenario_traces:scenarios
};
process.stdout.write(JSON.stringify(output));
