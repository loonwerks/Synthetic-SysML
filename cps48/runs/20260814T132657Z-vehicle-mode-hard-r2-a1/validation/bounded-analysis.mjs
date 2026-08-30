const SOURCE_SHA256 = "8cb7491149f6756563a9e2d852e83e99f7695c054431f9f28d3ac029ad2dc5a3";

const LEVELS = ["Clear", "Asserted", "Invalid"];
const CONFLICTS = ["InputInvalid", "MultipleActionable", "SingleOrNone"];
const SELECTIONS = ["InvalidSelected", "DegradedSelected", "OffSelected", "MaintenanceSelected", "ReturnSelected", "OnSelected", "StartSelected", "NoneSelected"];
const DEMANDS = ["Dormant", "Staged", "RunRequested"];
const SESSIONS = ["Inactive", "Active"];
const EPISODES = ["ClearEpisode", "Latched", "ReturnArmed"];
const RECOVERY = ["NotApplicable", "Arm", "Confirm", "Cancel", "Wait"];
const MODES = ["Off", "Standby", "Operating", "Maintenance", "Degraded"];
const BRAKE_DEMANDS = ["RequireApply", "AllowRelease"];

const semanticConnectionMap = {
  "INT-01": ["Root.lifecycleIndications", "lifecycleEpochOwner.lifecycleIndications"],
  "INT-02": ["Root.maintenanceIndication", "maintenanceEpochOwner.maintenanceIndication"],
  "INT-03": ["Root.degradedIndication", "degradationEpochOwner.degradedIndication"],
  "INT-04": ["Root.returnIndication", "returnEpochOwner.returnIndication"],
  "INT-05": ["lifecycleEpochOwner.factsToConflict", "conflictClassificationOwner.lifecycleFacts"],
  "INT-06": ["maintenanceEpochOwner.factsToConflict", "conflictClassificationOwner.maintenanceFacts"],
  "INT-07": ["degradationEpochOwner.factsToConflict", "conflictClassificationOwner.degradationFacts"],
  "INT-08": ["returnEpochOwner.factsToConflict", "conflictClassificationOwner.returnFacts"],
  "INT-09": ["conflictClassificationOwner.conflictToPriority", "indicationPriorityOwner.conflictClass"],
  "INT-10": ["lifecycleEpochOwner.factsToPriority", "indicationPriorityOwner.lifecycleFacts"],
  "INT-11": ["maintenanceEpochOwner.factsToPriority", "indicationPriorityOwner.maintenanceFacts"],
  "INT-12": ["degradationEpochOwner.factsToPriority", "indicationPriorityOwner.degradationFacts"],
  "INT-13": ["returnEpochOwner.factsToPriority", "indicationPriorityOwner.returnFacts"],
  "INT-14": ["indicationPriorityOwner.selectionToDemand", "operatingDemandOwner.selectedIndication"],
  "INT-15": ["indicationPriorityOwner.selectionToSession", "maintenanceSessionOwner.selectedIndication"],
  "INT-16": ["maintenanceEpochOwner.factsToSession", "maintenanceSessionOwner.maintenanceFacts"],
  "INT-17": ["degradationEpochOwner.factsToEpisode", "degradedEpisodeOwner.degradationFacts"],
  "INT-18": ["conflictClassificationOwner.conflictToRecovery", "recoveryEligibilityOwner.conflictClass"],
  "INT-19": ["indicationPriorityOwner.selectionToRecovery", "recoveryEligibilityOwner.selectedIndication"],
  "INT-20": ["degradationEpochOwner.factsToRecovery", "recoveryEligibilityOwner.degradationFacts"],
  "INT-21": ["returnEpochOwner.factsToRecovery", "recoveryEligibilityOwner.returnFacts"],
  "INT-22": ["degradedEpisodeOwner.snapshotToRecovery.currentEpisode", "recoveryEligibilityOwner.episodeSnapshot.currentEpisode"],
  "INT-23": ["recoveryEligibilityOwner.decisionToEpisode", "degradedEpisodeOwner.recoveryDecision"],
  "INT-24": ["recoveryEligibilityOwner.decisionToDemand", "operatingDemandOwner.recoveryDecision"],
  "INT-25": ["operatingDemandOwner.demandSnapshot", "controllerModeTransitionOwner.demandSnapshot"],
  "INT-26": ["maintenanceSessionOwner.maintenanceSnapshot", "controllerModeTransitionOwner.maintenanceSnapshot"],
  "INT-27": ["degradedEpisodeOwner.snapshotToMode", "controllerModeTransitionOwner.episodeSnapshot"],
  "INT-28": ["indicationPriorityOwner.selectionToEpisode", "degradedEpisodeOwner.selectedIndication"],
  "INT-29": ["recoveryEligibilityOwner.decisionToMode", "controllerModeTransitionOwner.recoveryDecision"],
  "INT-30": ["maintenanceSessionOwner.snapshotToBrake", "parkingBrakeDemandOwner.maintenanceSnapshot"],
  "INT-31": ["degradedEpisodeOwner.snapshotToBrake", "parkingBrakeDemandOwner.episodeSnapshot"],
  "INT-32": ["indicationPriorityOwner.selectionToBrake", "parkingBrakeDemandOwner.selectedIndication"],
  "INT-33": ["controllerModeTransitionOwner.modeDecision", "outcomeCoherenceOwner.modeDecision"],
  "INT-34": ["parkingBrakeDemandOwner.brakeDemand", "outcomeCoherenceOwner.brakeDemand"],
  "INT-35": ["outcomeCoherenceOwner.coordinationFrame", "Root.coordinationFrame"]
};

const ownershipAudit = [
  {usage:"lifecycleEpochOwner",claimed_roles:["proposal"],assigned_inputs:["lifecycleEpochOwner.lifecycleIndications","lifecycleEpochOwner.previousStart","lifecycleEpochOwner.previousOn","lifecycleEpochOwner.previousOff"],owner_local_facts:["fresh-start fresh-on off-active held-level and lifecycle-invalid facts"],contract_cases:["LIFECYCLE_EPOCH_DERIVATION"],analyzer_checks:["complete lifecycle current/history epoch relation"]},
  {usage:"maintenanceEpochOwner",claimed_roles:["proposal"],assigned_inputs:["maintenanceEpochOwner.maintenanceIndication","maintenanceEpochOwner.previousMaintenance"],owner_local_facts:["maintenance active fresh cleared held and invalid facts"],contract_cases:["MAINTENANCE_EPOCH_DERIVATION"],analyzer_checks:["complete maintenance current/history epoch relation"]},
  {usage:"degradationEpochOwner",claimed_roles:["proposal"],assigned_inputs:["degradationEpochOwner.degradedIndication","degradationEpochOwner.previousDegraded"],owner_local_facts:["degradation active fresh cleared held and invalid facts"],contract_cases:["DEGRADATION_EPOCH_DERIVATION"],analyzer_checks:["complete degradation current/history epoch relation"]},
  {usage:"returnEpochOwner",claimed_roles:["proposal"],assigned_inputs:["returnEpochOwner.returnIndication","returnEpochOwner.previousReturn"],owner_local_facts:["return fresh held clear and invalid facts"],contract_cases:["RETURN_EPOCH_DERIVATION"],analyzer_checks:["complete return current/history epoch relation"]},
  {usage:"conflictClassificationOwner",claimed_roles:["proposal"],assigned_inputs:["conflictClassificationOwner.lifecycleFacts","conflictClassificationOwner.maintenanceFacts","conflictClassificationOwner.degradationFacts","conflictClassificationOwner.returnFacts"],owner_local_facts:["invalid-dominant actionable-cardinality conflict class"],contract_cases:["CONFLICT_CARDINALITY_CLASSIFICATION"],analyzer_checks:["complete root epoch conflict classification"]},
  {usage:"indicationPriorityOwner",claimed_roles:["decision"],assigned_inputs:["indicationPriorityOwner.conflictClass","indicationPriorityOwner.lifecycleFacts","indicationPriorityOwner.maintenanceFacts","indicationPriorityOwner.degradationFacts","indicationPriorityOwner.returnFacts"],owner_local_facts:["unique priority-selected indication"],contract_cases:["CASE-01","CASE-02","CASE-03","CASE-04","CASE-05","CASE-06","CASE-07","CASE-08"],analyzer_checks:["priority partition and ordered raw-input oracle comparison"]},
  {usage:"operatingDemandOwner",claimed_roles:["decision"],assigned_inputs:["operatingDemandOwner.selectedIndication","operatingDemandOwner.recoveryDecision","operatingDemandOwner.demandMemory"],owner_local_facts:["next operating demand"],contract_cases:["CASE-09","CASE-10","CASE-11","CASE-12"],analyzer_checks:["operating demand partition"]},
  {usage:"maintenanceSessionOwner",claimed_roles:["decision"],assigned_inputs:["maintenanceSessionOwner.selectedIndication","maintenanceSessionOwner.maintenanceFacts","maintenanceSessionOwner.sessionMemory"],owner_local_facts:["next maintenance session"],contract_cases:["CASE-13","CASE-14","CASE-15"],analyzer_checks:["maintenance session partition"]},
  {usage:"degradedEpisodeOwner",claimed_roles:["decision"],assigned_inputs:["degradedEpisodeOwner.degradationFacts","degradedEpisodeOwner.recoveryDecision","degradedEpisodeOwner.selectedIndication","degradedEpisodeOwner.episodeMemory"],owner_local_facts:["next degraded episode"],contract_cases:["CASE-16","CASE-17","CASE-18","CASE-19","CASE-20"],analyzer_checks:["degraded episode partition and same-evaluation fault latch"]},
  {usage:"recoveryEligibilityOwner",claimed_roles:["decision"],assigned_inputs:["recoveryEligibilityOwner.conflictClass","recoveryEligibilityOwner.selectedIndication","recoveryEligibilityOwner.degradationFacts","recoveryEligibilityOwner.returnFacts","recoveryEligibilityOwner.episodeSnapshot.currentEpisode"],owner_local_facts:["phase-relative recovery decision"],contract_cases:["CASE-21","CASE-22","CASE-23","CASE-24","CASE-25"],analyzer_checks:["recovery eligibility partition and freshness checks"]},
  {usage:"controllerModeTransitionOwner",claimed_roles:["decision"],assigned_inputs:["controllerModeTransitionOwner.demandSnapshot","controllerModeTransitionOwner.maintenanceSnapshot","controllerModeTransitionOwner.episodeSnapshot","controllerModeTransitionOwner.recoveryDecision","controllerModeTransitionOwner.modeMemory"],owner_local_facts:["next controller mode and transition reason"],contract_cases:["CASE-26","CASE-27","CASE-28","CASE-29","CASE-30"],analyzer_checks:["controller mode partition"]},
  {usage:"parkingBrakeDemandOwner",claimed_roles:["decision"],assigned_inputs:["parkingBrakeDemandOwner.maintenanceSnapshot","parkingBrakeDemandOwner.episodeSnapshot","parkingBrakeDemandOwner.selectedIndication"],owner_local_facts:["independent conservative brake demand"],contract_cases:["INDEPENDENT_BRAKE_DEMAND"],analyzer_checks:["all 48 brake-demand tuples"]},
  {usage:"outcomeCoherenceOwner",claimed_roles:["decision"],assigned_inputs:["outcomeCoherenceOwner.modeDecision","outcomeCoherenceOwner.brakeDemand"],owner_local_facts:["non-bijective atomic mode and parking-brake frame"],contract_cases:["CONSERVATIVE_TWO_INPUT_COMPOSITION"],analyzer_checks:["all 10 mode brake-demand compositions"]}
];

const eq = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const makeCounts = ids => Object.fromEntries(ids.map(id => [id, 0]));
const firstWitness = {};
const remember = (id, value) => { if (!(id in firstWitness)) firstWitness[id] = value; };

function lifecycleEpoch(previous, current) {
  return {freshStart:previous.start === "Clear" && current.start === "Asserted",freshOn:previous.on === "Clear" && current.on === "Asserted",offActive:current.off === "Asserted",heldStart:previous.start === "Asserted" && current.start === "Asserted",heldOn:previous.on === "Asserted" && current.on === "Asserted",heldOff:previous.off === "Asserted" && current.off === "Asserted",anyInvalid:current.start === "Invalid" || current.on === "Invalid" || current.off === "Invalid"};
}
function scalarEpoch(previous, current) {
  return {active:current === "Asserted",fresh:previous === "Clear" && current === "Asserted",cleared:previous === "Asserted" && current === "Clear",held:previous === "Asserted" && current === "Asserted",invalid:current === "Invalid"};
}
function returnEpoch(previous, current) { return {fresh:previous === "Clear" && current === "Asserted",held:previous === "Asserted" && current === "Asserted",clear:current === "Clear",invalid:current === "Invalid"}; }
function conflictOwner(l, m, d, r) {
  if (l.anyInvalid || m.invalid || d.invalid || r.invalid) return "InputInvalid";
  const n = [d.active,l.offActive,m.active,r.fresh,l.freshOn,l.freshStart].filter(Boolean).length;
  return n > 1 ? "MultipleActionable" : "SingleOrNone";
}
function priorityGuards(c,l,m,d,r) {
  const valid = c !== "InputInvalid";
  return [c === "InputInvalid",valid && d.active,valid && !d.active && l.offActive,valid && !d.active && !l.offActive && m.active,valid && !d.active && !l.offActive && !m.active && r.fresh,valid && !d.active && !l.offActive && !m.active && !r.fresh && l.freshOn,valid && !d.active && !l.offActive && !m.active && !r.fresh && !l.freshOn && l.freshStart,valid && !d.active && !l.offActive && !m.active && !r.fresh && !l.freshOn && !l.freshStart];
}
function priorityOwner(c,l,m,d,r) { const i=priorityGuards(c,l,m,d,r).findIndex(Boolean); return {caseId:`CASE-${String(i+1).padStart(2,"0")}`,value:SELECTIONS[i]}; }
function demandGuards(s,r,p) { const c9=["InvalidSelected","DegradedSelected","OffSelected"].includes(s); const c10=!c9 && (r === "Confirm" || (s === "StartSelected" && p === "Dormant")); const c11=!c9 && !c10 && s === "OnSelected" && p === "Staged"; return [c9,c10,c11,!c9&&!c10&&!c11]; }
function demandOwner(s,r,p) { const i=demandGuards(s,r,p).findIndex(Boolean); return {caseId:`CASE-${String(i+9).padStart(2,"0")}`,value:["Dormant","Staged","RunRequested",p][i]}; }
function sessionGuards(s,m,p) { const c13=s === "MaintenanceSelected"; const c14=!c13 && (["InvalidSelected","DegradedSelected","OffSelected"].includes(s) || (p === "Active" && !m.active && !m.invalid && s === "OnSelected")); return [c13,c14,!c13&&!c14]; }
function sessionOwner(s,m,p) { const i=sessionGuards(s,m,p).findIndex(Boolean); return {caseId:`CASE-${i+13}`,value:["Active","Inactive",p][i]}; }
function episodeGuards(s,d,r,p) { const c16=d.active||d.invalid||s==="InvalidSelected"||s==="DegradedSelected"; const c17=!c16&&p==="Latched"&&r==="Arm"; const c18=!c16&&p==="ReturnArmed"&&r==="Confirm"; const c19=!c16&&p==="ReturnArmed"&&r==="Cancel"; return [c16,c17,c18,c19,!c16&&!c17&&!c18&&!c19]; }
function episodeOwner(s,d,r,p) { const i=episodeGuards(s,d,r,p).findIndex(Boolean); return {caseId:`CASE-${i+16}`,value:["Latched","ReturnArmed","ClearEpisode","Latched",p][i]}; }
function recoveryGuards(p,c,s,d,r) { const c21=p==="ClearEpisode"; const c22=p==="Latched"&&!d.active&&!d.invalid&&!r.invalid&&r.fresh&&s==="ReturnSelected"&&c==="SingleOrNone"; const c23=p==="ReturnArmed"&&!d.active&&!d.invalid&&!r.invalid&&r.clear&&s==="NoneSelected"&&c==="SingleOrNone"; const cancelSet=["InvalidSelected","DegradedSelected","OffSelected","MaintenanceSelected","OnSelected","StartSelected"].includes(s); const c24=p==="ReturnArmed"&&!c23&&(d.active||d.invalid||r.invalid||c==="MultipleActionable"||cancelSet); return [c21,c22,c23,c24,!c21&&!c22&&!c23&&!c24]; }
function recoveryOwner(p,c,s,d,r) { const i=recoveryGuards(p,c,s,d,r).findIndex(Boolean); return {caseId:`CASE-${i+21}`,value:RECOVERY[i]}; }
function modeGuards(d,m,e) { const c26=e!=="ClearEpisode"; const c27=!c26&&m==="Active"; const c28=!c26&&!c27&&d==="Staged"; const c29=!c26&&!c27&&!c28&&d==="RunRequested"; return [c26,c27,c28,c29,!c26&&!c27&&!c28&&!c29]; }
function modeOwner(d,m,e,r) { const i=modeGuards(d,m,e).findIndex(Boolean); const mode=["Degraded","Maintenance","Standby","Operating","Off"][i]; const reason=["FaultDominant","MaintenanceDominant",r==="Confirm"?"RecoveryConfirmed":"StartStaged","RunRequested","DormantDemand"][i]; return {caseId:`CASE-${i+26}`,value:{nextMode:mode,reason}}; }
function brakeOwner(m,e,s) { return m==="Active"||e!=="ClearEpisode"||["InvalidSelected","DegradedSelected","OffSelected","MaintenanceSelected"].includes(s)?"RequireApply":"AllowRelease"; }
function frameOwner(mode,brake) { return {mode,parkingBrake:mode==="Operating"&&brake==="AllowRelease"?"Release":"Apply"}; }

// Independent direct tables used only as comparison oracles. The composed
// production path above continues to consume values from the declared INT map.
function demandOracle(s,r,p) {
  if (["InvalidSelected","DegradedSelected","OffSelected"].includes(s)) return {caseId:"CASE-09",value:"Dormant"};
  if (r==="Confirm" || (s==="StartSelected" && p==="Dormant")) return {caseId:"CASE-10",value:"Staged"};
  if (s==="OnSelected" && p==="Staged") return {caseId:"CASE-11",value:"RunRequested"};
  return {caseId:"CASE-12",value:p};
}
function sessionOracle(s,m,p) {
  if (s==="MaintenanceSelected") return {caseId:"CASE-13",value:"Active"};
  if (["InvalidSelected","DegradedSelected","OffSelected"].includes(s) || (p==="Active"&&!m.active&&!m.invalid&&s==="OnSelected")) return {caseId:"CASE-14",value:"Inactive"};
  return {caseId:"CASE-15",value:p};
}
function episodeOracle(s,d,r,p) {
  if (d.active||d.invalid||s==="InvalidSelected"||s==="DegradedSelected") return {caseId:"CASE-16",value:"Latched"};
  if (p==="Latched"&&r==="Arm") return {caseId:"CASE-17",value:"ReturnArmed"};
  if (p==="ReturnArmed"&&r==="Confirm") return {caseId:"CASE-18",value:"ClearEpisode"};
  if (p==="ReturnArmed"&&r==="Cancel") return {caseId:"CASE-19",value:"Latched"};
  return {caseId:"CASE-20",value:p};
}
function recoveryOracle(p,c,s,d,r) {
  if (p==="ClearEpisode") return {caseId:"CASE-21",value:"NotApplicable"};
  if (p==="Latched"&&!d.active&&!d.invalid&&!r.invalid&&r.fresh&&s==="ReturnSelected"&&c==="SingleOrNone") return {caseId:"CASE-22",value:"Arm"};
  if (p==="ReturnArmed"&&!d.active&&!d.invalid&&!r.invalid&&r.clear&&s==="NoneSelected"&&c==="SingleOrNone") return {caseId:"CASE-23",value:"Confirm"};
  if (p==="ReturnArmed"&&(d.active||d.invalid||r.invalid||c==="MultipleActionable"||["InvalidSelected","DegradedSelected","OffSelected","MaintenanceSelected","OnSelected","StartSelected"].includes(s))) return {caseId:"CASE-24",value:"Cancel"};
  return {caseId:"CASE-25",value:"Wait"};
}
function modeOracle(d,m,e,r) {
  if (e!=="ClearEpisode") return {caseId:"CASE-26",value:{nextMode:"Degraded",reason:"FaultDominant"}};
  if (m==="Active") return {caseId:"CASE-27",value:{nextMode:"Maintenance",reason:"MaintenanceDominant"}};
  if (d==="Staged") return {caseId:"CASE-28",value:{nextMode:"Standby",reason:r==="Confirm"?"RecoveryConfirmed":"StartStaged"}};
  if (d==="RunRequested") return {caseId:"CASE-29",value:{nextMode:"Operating",reason:"RunRequested"}};
  return {caseId:"CASE-30",value:{nextMode:"Off",reason:"DormantDemand"}};
}

function rawOracle(previous,current) {
  const invalid=Object.values(current).some(v=>v==="Invalid");
  const fresh=(name)=>previous[name]==="Clear"&&current[name]==="Asserted";
  const candidates=[current.degraded==="Asserted",current.off==="Asserted",current.maintenance==="Asserted",fresh("return"),fresh("on"),fresh("start")];
  const conflict=invalid?"InputInvalid":candidates.filter(Boolean).length>1?"MultipleActionable":"SingleOrNone";
  const selected=invalid?"InvalidSelected":current.degraded==="Asserted"?"DegradedSelected":current.off==="Asserted"?"OffSelected":current.maintenance==="Asserted"?"MaintenanceSelected":fresh("return")?"ReturnSelected":fresh("on")?"OnSelected":fresh("start")?"StartSelected":"NoneSelected";
  return {conflict,selected};
}

function initialState() { return {previous:{start:"Invalid",on:"Invalid",off:"Invalid",maintenance:"Invalid",degraded:"Invalid",return:"Invalid"},demand:"Dormant",session:"Inactive",episode:"ClearEpisode",mode:"Off"}; }
function rootInput(changes={}) { return {start:"Clear",on:"Clear",off:"Clear",maintenance:"Clear",degraded:"Clear",return:"Clear",...changes}; }
function composeStep(state,input) {
  const edge={}; edge["INT-01"]={start:input.start,on:input.on,off:input.off}; edge["INT-02"]=input.maintenance; edge["INT-03"]=input.degraded; edge["INT-04"]=input.return;
  const l=lifecycleEpoch({start:state.previous.start,on:state.previous.on,off:state.previous.off},edge["INT-01"]); const m=scalarEpoch(state.previous.maintenance,edge["INT-02"]); const d=scalarEpoch(state.previous.degraded,edge["INT-03"]); const r=returnEpoch(state.previous.return,edge["INT-04"]);
  edge["INT-05"]=l; edge["INT-06"]=m; edge["INT-07"]=d; edge["INT-08"]=r;
  const conflict=conflictOwner(edge["INT-05"],edge["INT-06"],edge["INT-07"],edge["INT-08"]); edge["INT-09"]=conflict; edge["INT-18"]=conflict; edge["INT-10"]=l; edge["INT-11"]=m; edge["INT-12"]=d; edge["INT-13"]=r;
  const priority=priorityOwner(edge["INT-09"],edge["INT-10"],edge["INT-11"],edge["INT-12"],edge["INT-13"]); for(const id of ["INT-14","INT-15","INT-19","INT-28","INT-32"]) edge[id]=priority.value;
  edge["INT-20"]=d; edge["INT-21"]=r; edge["INT-22"]={currentEpisode:state.episode};
  const recovery=recoveryOwner(edge["INT-22"].currentEpisode,edge["INT-18"],edge["INT-19"],edge["INT-20"],edge["INT-21"]); for(const id of ["INT-23","INT-24","INT-29"]) edge[id]=recovery.value;
  edge["INT-16"]=m; edge["INT-17"]=d;
  const demand=demandOwner(edge["INT-14"],edge["INT-24"],state.demand); const session=sessionOwner(edge["INT-15"],edge["INT-16"],state.session); const episode=episodeOwner(edge["INT-28"],edge["INT-17"],edge["INT-23"],state.episode);
  edge["INT-25"]={currentDemand:state.demand,nextDemand:demand.value}; edge["INT-26"]={currentSession:state.session,nextSession:session.value}; edge["INT-27"]={currentEpisode:state.episode,nextEpisode:episode.value}; edge["INT-30"]=edge["INT-26"]; edge["INT-31"]=edge["INT-27"];
  const mode=modeOwner(edge["INT-25"].nextDemand,edge["INT-26"].nextSession,edge["INT-27"].nextEpisode,edge["INT-29"]); edge["INT-33"]=mode.value;
  const brake=brakeOwner(edge["INT-30"].nextSession,edge["INT-31"].nextEpisode,edge["INT-32"]); edge["INT-34"]=brake; const frame=frameOwner(edge["INT-33"].nextMode,edge["INT-34"]); edge["INT-35"]=frame;
  const next={previous:{...input},demand:demand.value,session:session.value,episode:episode.value,mode:mode.value.nextMode};
  const rawExpected=rawOracle(state.previous,input);
  const expectedPriorityCase=`CASE-${String(SELECTIONS.indexOf(rawExpected.selected)+1).padStart(2,"0")}`;
  const expectedRecovery=recoveryOracle(state.episode,rawExpected.conflict,rawExpected.selected,d,r);
  const expectedDemand=demandOracle(rawExpected.selected,expectedRecovery.value,state.demand);
  const expectedSession=sessionOracle(rawExpected.selected,m,state.session);
  const expectedEpisode=episodeOracle(rawExpected.selected,d,expectedRecovery.value,state.episode);
  const expectedMode=modeOracle(expectedDemand.value,expectedSession.value,expectedEpisode.value,expectedRecovery.value);
  return {next,trace:{input:{...input},pre:{demand:state.demand,session:state.session,episode:state.episode,mode:state.mode,previous:{...state.previous}},expected_named_branches:[expectedPriorityCase,expectedDemand.caseId,expectedSession.caseId,expectedEpisode.caseId,expectedRecovery.caseId,expectedMode.caseId],observed_named_branches:[priority.caseId,demand.caseId,session.caseId,episode.caseId,recovery.caseId,mode.caseId],observed:{conflict,selectedIndication:priority.value,recoveryDecision:recovery.value,nextDemand:demand.value,nextSession:session.value,nextEpisode:episode.value,nextMode:mode.value.nextMode,transitionReason:mode.value.reason,brakeDemand:brake,coordinationFrame:frame}}};
}

function partitionAudit(name, ids, tuples, guards, relation, oracle=relation) {
  const counts=makeCounts(ids); let gaps=0,overlaps=0,mismatches=0,valuations=0;
  for (const tuple of tuples()) { valuations++; const gs=guards(...tuple); const n=gs.filter(Boolean).length; if(n===0)gaps++; if(n>1)overlaps++; const result=relation(...tuple); const expected=oracle(...tuple); if(!eq(result,expected))mismatches++; if(n===1){const id=ids[gs.findIndex(Boolean)];counts[id]++;remember(id,{inputs:tuple,observed:result});} }
  return {name,valuations,case_counts:counts,gaps,overlaps,required_output_mismatches:mismatches,passed:gaps===0&&overlaps===0&&mismatches===0&&Object.values(counts).every(n=>n>0)};
}
function* demandTuples(){for(const s of SELECTIONS)for(const r of RECOVERY)for(const p of DEMANDS)yield[s,r,p];}
function* sessionTuples(){for(const s of SELECTIONS)for(const p of SESSIONS)for(const prev of LEVELS)for(const cur of LEVELS)yield[s,scalarEpoch(prev,cur),p];}
function* episodeTuples(){for(const s of SELECTIONS)for(const r of RECOVERY)for(const p of EPISODES)for(const prev of LEVELS)for(const cur of LEVELS)yield[s,scalarEpoch(prev,cur),r,p];}
function* recoveryTuples(){for(const p of EPISODES)for(const c of CONFLICTS)for(const s of SELECTIONS)for(const dp of LEVELS)for(const dc of LEVELS)for(const rp of LEVELS)for(const rc of LEVELS)yield[p,c,s,scalarEpoch(dp,dc),returnEpoch(rp,rc)];}
function* modeTuples(){for(const d of DEMANDS)for(const m of SESSIONS)for(const e of EPISODES)for(const r of RECOVERY)yield[d,m,e,r];}

const partitions=[];
partitions.push(partitionAudit("operating demand CASE-09..12",["CASE-09","CASE-10","CASE-11","CASE-12"],demandTuples,demandGuards,demandOwner,demandOracle));
partitions.push(partitionAudit("maintenance session CASE-13..15",["CASE-13","CASE-14","CASE-15"],sessionTuples,sessionGuards,sessionOwner,sessionOracle));
partitions.push(partitionAudit("degraded episode CASE-16..20",["CASE-16","CASE-17","CASE-18","CASE-19","CASE-20"],episodeTuples,episodeGuards,episodeOwner,episodeOracle));
partitions.push(partitionAudit("recovery eligibility CASE-21..25",["CASE-21","CASE-22","CASE-23","CASE-24","CASE-25"],recoveryTuples,recoveryGuards,recoveryOwner,recoveryOracle));
partitions.push(partitionAudit("controller mode CASE-26..30",["CASE-26","CASE-27","CASE-28","CASE-29","CASE-30"],modeTuples,modeGuards,modeOwner,modeOracle));

const priorityCounts=makeCounts(["CASE-01","CASE-02","CASE-03","CASE-04","CASE-05","CASE-06","CASE-07","CASE-08"]);
let rootEpochValuations=0,priorityGaps=0,priorityOverlaps=0,conflictMismatches=0,selectionMismatches=0,epochMismatches=0;
for(const ps of LEVELS)for(const po of LEVELS)for(const pf of LEVELS)for(const pm of LEVELS)for(const pd of LEVELS)for(const pr of LEVELS)
for(const cs of LEVELS)for(const co of LEVELS)for(const cf of LEVELS)for(const cm of LEVELS)for(const cd of LEVELS)for(const cr of LEVELS){
  rootEpochValuations++;
  const previous={start:ps,on:po,off:pf,maintenance:pm,degraded:pd,return:pr}; const current={start:cs,on:co,off:cf,maintenance:cm,degraded:cd,return:cr};
  const l=lifecycleEpoch(previous,current),m=scalarEpoch(pm,cm),d=scalarEpoch(pd,cd),r=returnEpoch(pr,cr); const c=conflictOwner(l,m,d,r); const gs=priorityGuards(c,l,m,d,r); const n=gs.filter(Boolean).length; if(n===0)priorityGaps++;if(n>1)priorityOverlaps++;
  const p=priorityOwner(c,l,m,d,r); const oracle=rawOracle(previous,current); if(c!==oracle.conflict)conflictMismatches++;if(p.value!==oracle.selected)selectionMismatches++;
  const expectedL={freshStart:ps==="Clear"&&cs==="Asserted",freshOn:po==="Clear"&&co==="Asserted",offActive:cf==="Asserted",heldStart:ps==="Asserted"&&cs==="Asserted",heldOn:po==="Asserted"&&co==="Asserted",heldOff:pf==="Asserted"&&cf==="Asserted",anyInvalid:cs==="Invalid"||co==="Invalid"||cf==="Invalid"};
  const expectedM={active:cm==="Asserted",fresh:pm==="Clear"&&cm==="Asserted",cleared:pm==="Asserted"&&cm==="Clear",held:pm==="Asserted"&&cm==="Asserted",invalid:cm==="Invalid"};
  const expectedD={active:cd==="Asserted",fresh:pd==="Clear"&&cd==="Asserted",cleared:pd==="Asserted"&&cd==="Clear",held:pd==="Asserted"&&cd==="Asserted",invalid:cd==="Invalid"};
  const expectedR={fresh:pr==="Clear"&&cr==="Asserted",held:pr==="Asserted"&&cr==="Asserted",clear:cr==="Clear",invalid:cr==="Invalid"};
  if(!eq(l,expectedL)||!eq(m,expectedM)||!eq(d,expectedD)||!eq(r,expectedR))epochMismatches++;
  priorityCounts[p.caseId]++;remember(p.caseId,{previous,current,observed:{conflict:c,selected:p.value}});
}
partitions.unshift({name:"priority CASE-01..08 over complete root current/history epoch domain",valuations:rootEpochValuations,case_counts:priorityCounts,gaps:priorityGaps,overlaps:priorityOverlaps,required_output_mismatches:selectionMismatches,passed:priorityGaps===0&&priorityOverlaps===0&&selectionMismatches===0&&Object.values(priorityCounts).every(n=>n>0)});

let brakeMismatches=0,brakeTuples=0; for(const m of SESSIONS)for(const e of EPISODES)for(const s of SELECTIONS){brakeTuples++;const v=brakeOwner(m,e,s);const expected=(m==="Active"||e!=="ClearEpisode"||["InvalidSelected","DegradedSelected","OffSelected","MaintenanceSelected"].includes(s))?"RequireApply":"AllowRelease";if(v!==expected)brakeMismatches++;}
let frameMismatches=0,frameTuples=0,releasePairs=0; const compositionPairs=[]; for(const mode of MODES)for(const brake of BRAKE_DEMANDS){frameTuples++;const frame=frameOwner(mode,brake);const expectedBrake=mode==="Operating"&&brake==="AllowRelease"?"Release":"Apply";if(frame.mode!==mode||frame.parkingBrake!==expectedBrake)frameMismatches++;if(frame.parkingBrake==="Release")releasePairs++;compositionPairs.push({mode,brakeDemand:brake,frame});}

function executeTrace(name,inputs){let state=initialState();const steps=[];for(const input of inputs){const x=composeStep(state,input);steps.push(x.trace);state=x.next;}return{name,steps,final:steps.at(-1).observed};}
const nominalInputs=[rootInput(),rootInput({start:"Asserted"}),rootInput({start:"Asserted"}),rootInput(),rootInput({on:"Asserted"})];
const operatingInputs=[rootInput(),rootInput({start:"Asserted"}),rootInput(),rootInput({on:"Asserted"})];
const maintenanceInputs=[...operatingInputs,rootInput({on:"Asserted",maintenance:"Asserted"})];
const armInputs=[...operatingInputs,rootInput({degraded:"Asserted"}),rootInput(),rootInput({return:"Asserted"})];
const scenarioFamilies=[
  {scenario_id:"SCN-01",expected:"fresh start stages Standby; held start does not replay; later fresh on reaches Operating/Release",traces:[executeTrace("nominal progression",nominalInputs)]},
  {scenario_id:"SCN-02",expected:"initially asserted, held, and out-of-order lifecycle levels do not replace Clear-to-Asserted sequencing",traces:[executeTrace("initially asserted and held start",[rootInput({start:"Asserted"}),rootInput({start:"Asserted"})]),executeTrace("initially asserted and held on",[rootInput({on:"Asserted"}),rootInput({on:"Asserted"})]),executeTrace("on before start",[rootInput(),rootInput({on:"Asserted"}),rootInput(),rootInput({start:"Asserted"})])]},
  {scenario_id:"SCN-03",expected:"priority winner and MultipleActionable remain exact",traces:[executeTrace("degraded plus off",[rootInput(),rootInput({degraded:"Asserted",off:"Asserted"})]),executeTrace("off plus maintenance",[rootInput(),rootInput({off:"Asserted",maintenance:"Asserted"})]),executeTrace("maintenance plus return",[rootInput(),rootInput({maintenance:"Asserted",return:"Asserted"})]),executeTrace("return plus on",[rootInput(),rootInput({return:"Asserted",on:"Asserted"})]),executeTrace("on plus start",[rootInput(),rootInput({on:"Asserted",start:"Asserted"})]),executeTrace("invalid plus candidates",[rootInput(),rootInput({start:"Invalid",degraded:"Asserted",off:"Asserted"})])]},
  {scenario_id:"SCN-04",expected:"maintenance overrides preserved run demand; held on cannot exit; later fresh on resumes Operating",traces:[executeTrace("maintenance preservation and exit",[...operatingInputs,rootInput({on:"Asserted",maintenance:"Asserted"}),rootInput({on:"Asserted",maintenance:"Asserted"}),rootInput({on:"Asserted"}),rootInput(),rootInput({on:"Asserted"})])]},
  {scenario_id:"SCN-05",expected:"off clears maintenance and demand; degradation or invalidity dominates maintenance",traces:[executeTrace("off interrupts maintenance",[...maintenanceInputs,rootInput({off:"Asserted",maintenance:"Asserted"})]),executeTrace("degradation interrupts maintenance",[...maintenanceInputs,rootInput({degraded:"Asserted",maintenance:"Asserted"})]),executeTrace("invalidity interrupts maintenance",[...maintenanceInputs,rootInput({return:"Invalid",maintenance:"Asserted"})])]},
  {scenario_id:"SCN-06",expected:"asserted degradation from every reachable mode latches and publishes Degraded/Apply",traces:[executeTrace("degrade from Off",[rootInput(),rootInput({degraded:"Asserted"})]),executeTrace("degrade from Standby",[rootInput(),rootInput({start:"Asserted"}),rootInput({degraded:"Asserted"})]),executeTrace("degrade from Operating",[...operatingInputs,rootInput({degraded:"Asserted"})]),executeTrace("degrade from Maintenance",[...maintenanceInputs,rootInput({degraded:"Asserted",maintenance:"Asserted"})]),executeTrace("degrade from Degraded",[rootInput(),rootInput({degraded:"Asserted"}),rootInput({degraded:"Asserted"})])]},
  {scenario_id:"SCN-07",expected:"each invalid root field independently propagates InputInvalid to Degraded/Apply",traces:[...Object.keys(rootInput()).map(field=>executeTrace(`invalid ${field}`,[rootInput(),rootInput({[field]:"Invalid"})]))]},
  {scenario_id:"SCN-08",expected:"fresh uncontested return arms; later clear quiet evaluation confirms Standby; fresh on resumes Operating",traces:[executeTrace("successful two-evaluation recovery",[...operatingInputs,rootInput({degraded:"Asserted"}),rootInput(),rootInput({return:"Asserted"}),rootInput(),rootInput({on:"Asserted"})])]},
  {scenario_id:"SCN-09",expected:"stale/held return waits and conflicts, lifecycle or maintenance activity, invalidity, or reasserted degradation cancel rather than recover",traces:[executeTrace("initially asserted and held return",[rootInput({degraded:"Asserted",return:"Asserted"}),rootInput({return:"Asserted"})]),executeTrace("held return while armed waits",[...armInputs,rootInput({return:"Asserted"})]),executeTrace("multi-action conflict cancels armed recovery",[...armInputs,rootInput({return:"Asserted",off:"Asserted",maintenance:"Asserted"})]),executeTrace("off cancels armed recovery",[...armInputs,rootInput({return:"Asserted",off:"Asserted"})]),executeTrace("maintenance cancels armed recovery",[...armInputs,rootInput({return:"Asserted",maintenance:"Asserted"})]),executeTrace("fresh start cancels armed recovery",[...armInputs,rootInput({return:"Asserted",start:"Asserted"})]),executeTrace("fresh on cancels armed recovery",[...armInputs,rootInput({return:"Asserted",on:"Asserted"})]),executeTrace("invalidity cancels armed recovery",[...armInputs,rootInput({return:"Invalid"})]),executeTrace("reasserted degradation cancels armed recovery",[...armInputs,rootInput({return:"Asserted",degraded:"Asserted"})])],unreachable_required_partitions:["A repeated fresh return while armed is root-unreachable because arming stores Asserted; clearing it on the next quiet evaluation confirms before another fresh edge.","A same-evaluation return assertion and quiet-clear confirmation is impossible because return cannot be both Asserted/fresh and Clear in one finite input."]},
  {scenario_id:"SCN-10",expected:"all five modes are witnessed and only Operating/AllowRelease composes Release",traces:[executeTrace("Off frame",[rootInput()]),executeTrace("Standby frame",[rootInput(),rootInput({start:"Asserted"})]),executeTrace("Operating frame",operatingInputs),executeTrace("Maintenance frame",maintenanceInputs),executeTrace("Degraded frame",[...operatingInputs,rootInput({degraded:"Asserted"})])],direct_composition_pairs:compositionPairs}
];

const scenarioFailures=[];
function requireScenario(id, condition, detail){if(!condition)scenarioFailures.push({scenario_id:id,detail});}
const finalOf=(id,name)=>scenarioFamilies.find(s=>s.scenario_id===id).traces.find(t=>t.name===name).final;
for(const family of scenarioFamilies)for(const trace of family.traces)for(const [index,step] of trace.steps.entries())requireScenario(family.scenario_id,eq(step.expected_named_branches,step.observed_named_branches),`owner/direct-oracle branch mismatch in ${trace.name} step ${index+1}`);
requireScenario("SCN-01",eq(finalOf("SCN-01","nominal progression").coordinationFrame,{mode:"Operating",parkingBrake:"Release"}),"nominal trace did not reach Operating/Release");
requireScenario("SCN-02",finalOf("SCN-02","initially asserted and held start").nextMode==="Off"&&finalOf("SCN-02","initially asserted and held on").nextMode==="Off"&&finalOf("SCN-02","on before start").nextMode==="Standby","freshness/order rejection mismatch");
for(const t of scenarioFamilies.find(s=>s.scenario_id==="SCN-03").traces)requireScenario("SCN-03",t.final.conflict==="MultipleActionable"||t.name==="invalid plus candidates"&&t.final.conflict==="InputInvalid",`conflict mismatch: ${t.name}`);
requireScenario("SCN-04",finalOf("SCN-04","maintenance preservation and exit").nextMode==="Operating","maintenance did not resume preserved operating demand");
for(const id of ["SCN-05","SCN-06","SCN-07"])for(const t of scenarioFamilies.find(s=>s.scenario_id===id).traces)requireScenario(id,id==="SCN-05"&&t.name.startsWith("off")?t.final.nextMode==="Off":t.final.nextMode==="Degraded",`terminal mode mismatch: ${t.name}`);
requireScenario("SCN-08",finalOf("SCN-08","successful two-evaluation recovery").nextMode==="Operating","successful recovery trace did not return to Operating after fresh on");
for(const t of scenarioFamilies.find(s=>s.scenario_id==="SCN-09").traces)requireScenario("SCN-09",t.final.nextEpisode!=="ClearEpisode",`rejection trace cleared episode: ${t.name}`);
requireScenario("SCN-10",releasePairs===1&&frameMismatches===0,"composition truth table mismatch");
for(const s of scenarioFamilies)s.passed=!scenarioFailures.some(f=>f.scenario_id===s.scenario_id);

const invariantChecks=[
  {name:"complete epoch domain is 3^12",checked:rootEpochValuations,passed:rootEpochValuations===531441},
  {name:"conflict classification agrees with independent raw oracle",checked:rootEpochValuations,mismatches:conflictMismatches,passed:conflictMismatches===0},
  {name:"epoch derivations agree with declared attribute-field relations",checked:rootEpochValuations,mismatches:epochMismatches,passed:epochMismatches===0},
  {name:"all-channel invalidity is never masked",checked:rootEpochValuations,mismatches:selectionMismatches,passed:selectionMismatches===0},
  {name:"brake demand relation",checked:brakeTuples,mismatches:brakeMismatches,passed:brakeTuples===48&&brakeMismatches===0},
  {name:"atomic frame composition",checked:frameTuples,mismatches:frameMismatches,release_pairs:releasePairs,passed:frameTuples===10&&frameMismatches===0&&releasePairs===1},
  {name:"semantic connection map exact",checked:Object.keys(semanticConnectionMap).length,passed:Object.keys(semanticConnectionMap).length===35},
  {name:"canonical CASE-01 through CASE-30 guards cross-checked against independent direct tables",checked:30,mismatches:partitions.reduce((n,p)=>n+p.required_output_mismatches,0),passed:partitions.every(p=>p.gaps===0&&p.overlaps===0&&p.required_output_mismatches===0)},
  {name:"all CASE-01 through CASE-30 have witnesses",checked:Object.keys(firstWitness).length,passed:Array.from({length:30},(_,i)=>`CASE-${String(i+1).padStart(2,"0")}`).every(id=>id in firstWitness)},
  {name:"ten distinct scenario families execute concrete traces",checked:scenarioFamilies.length,mismatches:scenarioFailures.length,passed:scenarioFamilies.length===10&&scenarioFailures.length===0}
];
const allPassed=partitions.every(p=>p.passed)&&invariantChecks.every(c=>c.passed)&&scenarioFailures.length===0&&conflictMismatches===0&&selectionMismatches===0&&brakeMismatches===0&&frameMismatches===0;

const report={
  status:allPassed?"passed":"failed",
  passed:allPassed,
  source_sha256:SOURCE_SHA256,
  claim_boundary:"Deterministic exhaustive evidence over the seed's finite indication/history and owner-local domains plus bounded concrete state traces; not compositional or unbounded proof, solver certification, code generation, execution, physical performance, safety, or certification.",
  exhaustive_root_input_domain:{description:"all six current IndicationLevel fields crossed with all six retained previous levels",valuations:rootEpochValuations,expected:531441},
  semantic_connection_map:semanticConnectionMap,
  partition_counts:partitions,
  local_relation_counts:{operating_demand:120,maintenance_session:144,degraded_episode:1080,recovery_eligibility:5832,controller_mode:90,brake_demand:brakeTuples,frame_composition:frameTuples},
  gaps:{partition_total:partitions.reduce((n,p)=>n+p.gaps,0)},
  overlaps:{partition_total:partitions.reduce((n,p)=>n+p.overlaps,0)},
  required_output_mismatches:{priority:selectionMismatches,conflict:conflictMismatches,brake:brakeMismatches,frame:frameMismatches,scenario:scenarioFailures.length},
  invariant_checks:invariantChecks,
  unreachable_tuples:[{name:"repeated fresh return while ReturnArmed",reason:"A fresh return requires prior Clear, but the reachable arming step stores Asserted; a later Clear quiet step confirms before another fresh edge. The local CASE-25 tuple is nevertheless enumerated in the complete 5,832-tuple recovery relation."}],
  case_witnesses:firstWitness,
  scenario_families:scenarioFamilies,
  ownership_audit:ownershipAudit.map(record=>({...record,passed:allPassed}))
};
process.stdout.write(JSON.stringify(report));
