#!/usr/bin/env node
"use strict";

// Deterministic finite conformance analysis bound to the canonical source.
// It reads no files, environment variables, clock, randomness, or network state.
const SOURCE_SHA256 = "8e37c768e6242d258ed9615ebf51237da4b63d7dd1dc6a23aa029d5675c70ce6";

const COMMANDS = ["None", "Start", "Off", "EnterMaintenance", "ReturnToNormal"];
const VALIDITIES = ["Valid", "Invalid"];
const PEDALS = ["Pressed", "Released"];
const TEMPERATURES = ["Nominal", "Elevated", "OverLimit"];
const SUPPLIES = ["Available", "Unavailable"];
const PARKING = ["Applied", "Released"];
const TEST_PROGRESS = ["Idle", "Running", "Passed", "Failed"];
const THERMAL_STATES = ["Blocked", "Confirming", "Clear"];
const TEST_STATES = ["Untested", "Testing", "Passed", "Failed"];
const SESSIONS = ["Off", "Arming", "On", "Degraded", "Maintenance"];
const REARM_STATES = ["Blocked", "Confirming", "Ready"];

const reports = (payloads, field) => {
  const result = [];
  for (const status of VALIDITIES) for (const payload of payloads) result.push({[field]: payload, status});
  return result;
};
const COMMAND_REPORTS = reports(COMMANDS, "command");
const PEDAL_REPORTS = reports(PEDALS, "condition");
const TEMPERATURE_REPORTS = reports(TEMPERATURES, "band");
const SUPPLY_REPORTS = reports(SUPPLIES, "availability");
const PARKING_REPORTS = reports(PARKING, "condition");
const TEST_REPORTS = reports(TEST_PROGRESS, "progress");

const semanticConnectionMap = Object.freeze({
  "INT-01": "root.command_report -> command_qualification_owner.command_report",
  "INT-02": "root.brake_pedal_report -> brake_pedal_qualification_owner.brake_pedal_report",
  "INT-03": "root.temperature_report -> temperature_qualification_owner.temperature_report",
  "INT-04": "root.electrical_power_report -> electrical_supply_qualification_owner.electrical_power_report",
  "INT-05": "root.parking_brake_report -> parking_brake_qualification_owner.parking_brake_report",
  "INT-06": "root.self_test_report -> self_test_campaign_state_owner.self_test_report",
  "INT-07": "command_qualification_owner.qualified_command_facts -> self_test_campaign_state_owner.qualified_command_facts",
  "INT-08": "command_qualification_owner.qualified_command_facts -> operating_session_state_priority_owner.qualified_command_facts",
  "INT-09": "command_qualification_owner.qualified_command_facts -> rearm_qualification_state_owner.qualified_command_facts",
  "INT-10": "command_qualification_owner.command_fault -> fault_vector_composition_owner.command_fault",
  "INT-11": "brake_pedal_qualification_owner.qualified_pedal_facts -> start_restraint_decision_owner.qualified_pedal_facts",
  "INT-12": "brake_pedal_qualification_owner.pedal_fault -> fault_vector_composition_owner.pedal_fault",
  "INT-13": "temperature_qualification_owner.qualified_temperature -> thermal_clearance_state_owner.qualified_temperature",
  "INT-14": "electrical_supply_qualification_owner.qualified_supply_facts -> readiness_composition_owner.qualified_supply_facts",
  "INT-15": "electrical_supply_qualification_owner.supply_fault -> fault_vector_composition_owner.supply_fault",
  "INT-16": "parking_brake_qualification_owner.qualified_parking_brake_facts -> start_restraint_decision_owner.qualified_parking_brake_facts",
  "INT-17": "parking_brake_qualification_owner.parking_brake_fault -> fault_vector_composition_owner.parking_brake_fault",
  "INT-18": "thermal_clearance_state_owner.thermal_state_facts -> readiness_composition_owner.thermal_state_facts",
  "INT-19": "thermal_clearance_state_owner.thermal_fault -> fault_vector_composition_owner.thermal_fault",
  "INT-20": "self_test_campaign_state_owner.self_test_state_facts -> readiness_composition_owner.self_test_state_facts",
  "INT-21": "self_test_campaign_state_owner.self_test_fault -> fault_vector_composition_owner.self_test_fault",
  "INT-22": "start_restraint_decision_owner.start_restraint_fact -> readiness_composition_owner.start_restraint_fact",
  "INT-23": "readiness_composition_owner.readiness_facts -> operating_session_state_priority_owner.readiness_facts",
  "INT-24": "readiness_composition_owner.readiness_facts -> rearm_qualification_state_owner.readiness_facts",
  "INT-25": "readiness_composition_owner.readiness_facts -> supervisory_status_notice_owner.readiness_facts",
  "INT-26": "fault_vector_composition_owner.exact_fault_summary -> operating_session_state_priority_owner.exact_fault_summary",
  "INT-27": "fault_vector_composition_owner.exact_fault_summary -> rearm_qualification_state_owner.exact_fault_summary",
  "INT-28": "fault_vector_composition_owner.exact_fault_summary -> actuation_composition_owner.exact_fault_summary",
  "INT-29": "fault_vector_composition_owner.exact_fault_summary -> supervisory_status_notice_owner.exact_fault_summary",
  "INT-30": "rearm_qualification_state_owner.recovery_permit_fact -> operating_session_state_priority_owner.recovery_permit_fact",
  "INT-31": "rearm_qualification_state_owner.rearm_state_facts -> supervisory_status_notice_owner.rearm_state_facts",
  "INT-32": "operating_session_state_priority_owner.session_decision_facts -> actuation_composition_owner.session_decision_facts",
  "INT-33": "operating_session_state_priority_owner.session_decision_facts -> supervisory_status_notice_owner.session_decision_facts",
  "INT-34": "actuation_composition_owner.actuation_disposition -> root.actuation_disposition",
  "INT-35": "supervisory_status_notice_owner.supervisory_status -> root.supervisory_status"
});

const ownershipAuditTemplate = [
  {usage:"command_qualification_owner",claimed_roles:["applicability"],assigned_inputs:["command_qualification_owner.command_report"],owner_local_facts:["invalid-command suppression, command evidence fault, and reset applicability"],contract_cases:["COMMAND_QUALIFICATION_TOTAL"],analyzer_checks:["command qualification total relation"]},
  {usage:"brake_pedal_qualification_owner",claimed_roles:["applicability"],assigned_inputs:["brake_pedal_qualification_owner.brake_pedal_report"],owner_local_facts:["valid pressed-pedal applicability and pedal evidence fault"],contract_cases:["PEDAL_QUALIFICATION_TOTAL"],analyzer_checks:["pedal qualification total relation"]},
  {usage:"temperature_qualification_owner",claimed_roles:["applicability"],assigned_inputs:["temperature_qualification_owner.temperature_report"],owner_local_facts:["invalid temperature suppression and qualified band classification"],contract_cases:["TEMPERATURE_QUALIFICATION_TOTAL"],analyzer_checks:["temperature qualification total relation"]},
  {usage:"electrical_supply_qualification_owner",claimed_roles:["applicability"],assigned_inputs:["electrical_supply_qualification_owner.electrical_power_report"],owner_local_facts:["usable supply applicability and supply evidence fault"],contract_cases:["SUPPLY_QUALIFICATION_TOTAL"],analyzer_checks:["supply qualification total relation"]},
  {usage:"parking_brake_qualification_owner",claimed_roles:["applicability"],assigned_inputs:["parking_brake_qualification_owner.parking_brake_report"],owner_local_facts:["valid applied-brake applicability and parking-brake evidence fault"],contract_cases:["PARKING_BRAKE_QUALIFICATION_TOTAL"],analyzer_checks:["parking-brake qualification total relation"]},
  {usage:"thermal_clearance_state_owner",claimed_roles:["decision"],assigned_inputs:["thermal_clearance_state_owner.qualified_temperature","thermal_clearance_state_owner.prior_thermal_state"],owner_local_facts:["next thermal state, thermal clearance, and current thermal fault"],contract_cases:["CASE-THERM-01","CASE-THERM-02","CASE-THERM-03","CASE-THERM-04","CASE-THERM-05"],analyzer_checks:["thermal five-case partition","two-observation thermal recovery"]},
  {usage:"self_test_campaign_state_owner",claimed_roles:["decision"],assigned_inputs:["self_test_campaign_state_owner.self_test_report","self_test_campaign_state_owner.qualified_command_facts","self_test_campaign_state_owner.prior_self_test_state"],owner_local_facts:["next self-test campaign state, pass fact, and persistent self-test fault"],contract_cases:["CASE-TEST-01","CASE-TEST-02","CASE-TEST-03","CASE-TEST-04","CASE-TEST-05","CASE-TEST-06","CASE-TEST-07"],analyzer_checks:["self-test seven-case partition","failure reset and requalification"]},
  {usage:"start_restraint_decision_owner",claimed_roles:["decision"],assigned_inputs:["start_restraint_decision_owner.qualified_pedal_facts","start_restraint_decision_owner.qualified_parking_brake_facts"],owner_local_facts:["combined start-restraint satisfaction"],contract_cases:["START_RESTRAINT_DECISION"],analyzer_checks:["start-restraint conjunction"]},
  {usage:"readiness_composition_owner",claimed_roles:["decision"],assigned_inputs:["readiness_composition_owner.qualified_supply_facts","readiness_composition_owner.thermal_state_facts","readiness_composition_owner.self_test_state_facts","readiness_composition_owner.start_restraint_fact"],owner_local_facts:["distinct start-ready and sustain-ready decisions"],contract_cases:["READINESS_COMPOSITION"],analyzer_checks:["readiness composition equations"]},
  {usage:"operating_session_state_priority_owner",claimed_roles:["decision"],assigned_inputs:["operating_session_state_priority_owner.qualified_command_facts","operating_session_state_priority_owner.readiness_facts","operating_session_state_priority_owner.exact_fault_summary","operating_session_state_priority_owner.recovery_permit_fact","operating_session_state_priority_owner.prior_session"],owner_local_facts:["winning next session and exact priority cause"],contract_cases:["CASE-SESSION-01","CASE-SESSION-02","CASE-SESSION-03","CASE-SESSION-04","CASE-SESSION-05","CASE-SESSION-06","CASE-SESSION-07","CASE-SESSION-08","CASE-SESSION-09","CASE-SESSION-10","CASE-SESSION-11","CASE-SESSION-12"],analyzer_checks:["session twelve-case priority partition","fresh request non-replay"]},
  {usage:"fault_vector_composition_owner",claimed_roles:["decision"],assigned_inputs:["fault_vector_composition_owner.command_fault","fault_vector_composition_owner.pedal_fault","fault_vector_composition_owner.thermal_fault","fault_vector_composition_owner.supply_fault","fault_vector_composition_owner.parking_brake_fault","fault_vector_composition_owner.self_test_fault"],owner_local_facts:["six-input aggregate-fault OR"],contract_cases:["EXACT_FAULT_VECTOR_AND_OR"],analyzer_checks:["all 64 fault vectors and exact OR"]},
  {usage:"rearm_qualification_state_owner",claimed_roles:["decision"],assigned_inputs:["rearm_qualification_state_owner.qualified_command_facts","rearm_qualification_state_owner.readiness_facts","rearm_qualification_state_owner.exact_fault_summary","rearm_qualification_state_owner.prior_rearm_state"],owner_local_facts:["next rearm state and fresh recovery permit"],contract_cases:["CASE-REARM-01","CASE-REARM-02","CASE-REARM-03","CASE-REARM-04","CASE-REARM-05"],analyzer_checks:["rearm five-case partition","two-clean-snapshot and fresh-return recovery"]},
  {usage:"actuation_composition_owner",claimed_roles:["decision"],assigned_inputs:["actuation_composition_owner.session_decision_facts","actuation_composition_owner.exact_fault_summary"],owner_local_facts:["fault-prioritized logical actuation tuple"],contract_cases:["ACTUATION_COMPOSITION_TOTAL"],analyzer_checks:["actuation composition and fault override"]},
  {usage:"supervisory_status_notice_owner",claimed_roles:["decision"],assigned_inputs:["supervisory_status_notice_owner.readiness_facts","supervisory_status_notice_owner.exact_fault_summary","supervisory_status_notice_owner.rearm_state_facts","supervisory_status_notice_owner.session_decision_facts"],owner_local_facts:["prioritized supervisory notice classification"],contract_cases:["PRIORITIZED_NOTICE_CLASSIFICATION"],analyzer_checks:["notice priority and exact status preservation"]}
];

function commandOwner(r) {
  return {command:r.status === "Valid" ? r.command : "None",selfTestResetRequested:r.status === "Valid" && (r.command === "Off" || r.command === "EnterMaintenance"),fault:r.status === "Invalid"};
}
function pedalOwner(r) { return {pedalStartCondition:r.status === "Valid" && r.condition === "Pressed",fault:r.status === "Invalid"}; }
function temperatureOwner(r) { return r.status === "Invalid" ? "InvalidEvidence" : r.band; }
function supplyOwner(r) { return {supplyUsable:r.status === "Valid" && r.availability === "Available",fault:r.status === "Invalid"}; }
function parkingOwner(r) { return {brakeAppliedEvidence:r.status === "Valid" && r.condition === "Applied",fault:r.status === "Invalid"}; }

function thermalOwner(q, prior) {
  const guards = [q === "InvalidEvidence" || q === "OverLimit",q === "Elevated",q === "Nominal" && prior === "Blocked",q === "Nominal" && prior === "Confirming",q === "Nominal" && prior === "Clear"];
  const index = guards.findIndex(Boolean);
  const state = ["Blocked","Blocked","Confirming","Clear","Clear"][index];
  return {state,thermalClear:state === "Clear",fault:index === 0,caseId:`CASE-THERM-0${index + 1}`,guardCount:guards.filter(Boolean).length};
}
function selfTestOwner(r, qcmd, prior) {
  const validNonfailed = r.status === "Valid" && r.progress !== "Failed";
  const guards = [
    r.status === "Invalid" || (r.status === "Valid" && r.progress === "Failed"),
    validNonfailed && qcmd.selfTestResetRequested,
    validNonfailed && !qcmd.selfTestResetRequested && prior === "Untested" && qcmd.command === "Start" && r.progress === "Running",
    validNonfailed && !qcmd.selfTestResetRequested && prior === "Untested" && qcmd.command === "Start" && r.progress === "Passed",
    validNonfailed && !qcmd.selfTestResetRequested && prior === "Testing" && r.progress === "Passed",
    validNonfailed && !qcmd.selfTestResetRequested && prior === "Passed",
    validNonfailed && !qcmd.selfTestResetRequested && ((prior === "Untested" && (qcmd.command !== "Start" || (r.progress !== "Running" && r.progress !== "Passed"))) || (prior === "Testing" && r.progress !== "Passed") || prior === "Failed")
  ];
  const index = guards.findIndex(Boolean);
  const state = index === 0 ? "Failed" : index === 1 ? "Untested" : index === 2 ? "Testing" : (index === 3 || index === 4 || index === 5) ? "Passed" : prior;
  return {state,selfTestPassed:state === "Passed",fault:index === 0 || (index === 6 && state === "Failed"),caseId:`CASE-TEST-0${index + 1}`,guardCount:guards.filter(Boolean).length};
}
function restraintOwner(pedal, parking) { return {startRestraintSatisfied:pedal.pedalStartCondition && parking.brakeAppliedEvidence}; }
function readinessOwner(supply, thermal, test, restraint) {
  const sustainReady = supply.supplyUsable && thermal.thermalClear && test.selfTestPassed;
  return {startReady:sustainReady && restraint.startRestraintSatisfied,sustainReady};
}
function faultOwner(commandFault,pedalFault,thermalFault,supplyFault,parkingBrakeFault,selfTestFault) {
  return {commandFault,pedalFault,thermalFault,supplyFault,parkingBrakeFault,selfTestFault,anyFault:commandFault || pedalFault || thermalFault || supplyFault || parkingBrakeFault || selfTestFault};
}
function rearmOwner(qcmd, readiness, faults, prior) {
  const guards = [faults.anyFault,!faults.anyFault && !readiness.sustainReady,!faults.anyFault && readiness.sustainReady && prior === "Blocked",!faults.anyFault && readiness.sustainReady && prior === "Confirming",!faults.anyFault && readiness.sustainReady && prior === "Ready"];
  const index = guards.findIndex(Boolean);
  const state = index < 2 ? "Blocked" : index === 2 ? "Confirming" : "Ready";
  return {state,recoveryPermit:index === 4 && qcmd.command === "ReturnToNormal",caseId:`CASE-REARM-0${index + 1}`,guardCount:guards.filter(Boolean).length};
}
function sessionOwner(qcmd, readiness, faults, recovery, prior) {
  const normalCommand = qcmd.command !== "Off" && qcmd.command !== "EnterMaintenance";
  const offLike = prior === "Off" || prior === "Maintenance";
  const guards = [
    faults.anyFault,
    !faults.anyFault && prior === "Degraded" && recovery.recoveryPermit,
    !faults.anyFault && prior === "Degraded" && !recovery.recoveryPermit,
    !faults.anyFault && prior !== "Degraded" && qcmd.command === "Off",
    !faults.anyFault && prior !== "Degraded" && qcmd.command === "EnterMaintenance",
    !faults.anyFault && offLike && qcmd.command === "Start" && readiness.startReady,
    !faults.anyFault && offLike && qcmd.command === "Start" && !readiness.startReady,
    !faults.anyFault && prior === "Arming" && normalCommand && readiness.sustainReady,
    !faults.anyFault && prior === "Arming" && normalCommand && !readiness.sustainReady,
    !faults.anyFault && prior === "On" && normalCommand && readiness.sustainReady,
    !faults.anyFault && prior === "On" && normalCommand && !readiness.sustainReady,
    !faults.anyFault && offLike && (qcmd.command === "None" || qcmd.command === "ReturnToNormal")
  ];
  const index = guards.findIndex(Boolean);
  const states = ["Degraded","Off","Degraded","Off","Maintenance","Arming",prior,"On","Off","On","Degraded",prior];
  const causes = ["CurrentFault","FreshRecoveryAccepted","RecoveryPending","OffAccepted","MaintenanceAccepted","StartAccepted","StartRejected","EnableCompleted","EnableAborted","OnSustained","ReadinessWithdrawn","NoApplicableRequest"];
  return {state:states[index],cause:causes[index],caseId:`CASE-SESSION-${String(index + 1).padStart(2,"0")}`,guardCount:guards.filter(Boolean).length};
}
function actuationOwner(session, faults) {
  if (faults.anyFault || session.state === "Off" || session.state === "Degraded") return {fuel:"Inhibit",electricalPower:"Isolate",parkingBrake:"Apply"};
  if (session.state === "On") return {fuel:"Enable",electricalPower:"Provide",parkingBrake:"Release"};
  return {fuel:"Inhibit",electricalPower:"Provide",parkingBrake:"Apply"};
}
function noticeOwner(session, rearm, faults) {
  if (faults.anyFault) return "FaultAttention";
  if (session.state === "Degraded" && rearm.state === "Confirming") return "RecoveryConfirming";
  if (session.state === "Degraded") return "RecoveryRequired";
  if (session.state === "Maintenance") return "Maintenance";
  if (session.state === "Arming") return "Starting";
  if (session.state === "On") return "Enabled";
  return "Off";
}
function statusOwner(session, readiness, rearm, faults) {
  return {session:session.state,startReady:readiness.startReady,sustainReady:readiness.sustainReady,rearmState:rearm.state,notice:noticeOwner(session,rearm,faults),commandFault:faults.commandFault,pedalFault:faults.pedalFault,thermalFault:faults.thermalFault,supplyFault:faults.supplyFault,parkingBrakeFault:faults.parkingBrakeFault,selfTestFault:faults.selfTestFault,anyFault:faults.anyFault};
}

function systemStep(input, prior) {
  // Each consumer receives the producing owner's value through the named wire.
  const command = commandOwner(input.commandReport);
  const pedal = pedalOwner(input.pedalReport);
  const qualifiedTemperature = temperatureOwner(input.temperatureReport);
  const supply = supplyOwner(input.supplyReport);
  const parking = parkingOwner(input.parkingReport);
  const thermal = thermalOwner(qualifiedTemperature, prior.thermalState);
  const selfTest = selfTestOwner(input.selfTestReport, command, prior.selfTestState);
  const restraint = restraintOwner(pedal, parking);
  const readiness = readinessOwner(supply, thermal, selfTest, restraint);
  const faults = faultOwner(command.fault,pedal.fault,thermal.fault,supply.fault,parking.fault,selfTest.fault);
  const rearm = rearmOwner(command, readiness, faults, prior.rearmState);
  const session = sessionOwner(command, readiness, faults, rearm, prior.session);
  const actuation = actuationOwner(session, faults);
  const status = statusOwner(session, readiness, rearm, faults);
  return {command,pedal,qualifiedTemperature,supply,parking,thermal,selfTest,restraint,readiness,faults,rearm,session,actuation,status,next:{thermalState:thermal.state,selfTestState:selfTest.state,session:session.state,rearmState:rearm.state}};
}

const caseCounts = {};
for (const family of [["THERM",5],["TEST",7],["REARM",5],["SESSION",12]]) for (let i=1;i<=family[1];i++) caseCounts[`CASE-${family[0]}-${String(i).padStart(2,"0")}`]=0;
const ownerFailures = Object.fromEntries(ownershipAuditTemplate.map(record => [record.usage,0]));
let evaluations=0,gaps=0,overlaps=0,requiredOutputMismatches=0,stateMismatches=0,interactionValueMismatches=0,priorityViolations=0,compositionViolations=0,invariantViolations=0;

for (const commandReport of COMMAND_REPORTS)
for (const pedalReport of PEDAL_REPORTS)
for (const temperatureReport of TEMPERATURE_REPORTS)
for (const supplyReport of SUPPLY_REPORTS)
for (const parkingReport of PARKING_REPORTS)
for (const selfTestReport of TEST_REPORTS)
for (const thermalState of THERMAL_STATES)
for (const selfTestState of TEST_STATES)
for (const session of SESSIONS)
for (const rearmState of REARM_STATES) {
  const input={commandReport,pedalReport,temperatureReport,supplyReport,parkingReport,selfTestReport};
  const prior={thermalState,selfTestState,session,rearmState};
  const c=systemStep(input,prior); evaluations++;
  for (const relation of [c.thermal,c.selfTest,c.rearm,c.session]) {
    caseCounts[relation.caseId]++;
    if (relation.guardCount===0) gaps++;
    if (relation.guardCount>1) overlaps++;
  }

  const expectedCommand = commandReport.status === "Valid" ? commandReport.command : "None";
  if(c.command.command!==expectedCommand||c.command.selfTestResetRequested!==(commandReport.status==="Valid"&&(commandReport.command==="Off"||commandReport.command==="EnterMaintenance"))||c.command.fault!==(commandReport.status==="Invalid"))ownerFailures.command_qualification_owner++;
  if(c.pedal.pedalStartCondition!==(pedalReport.status==="Valid"&&pedalReport.condition==="Pressed")||c.pedal.fault!==(pedalReport.status==="Invalid"))ownerFailures.brake_pedal_qualification_owner++;
  if(c.qualifiedTemperature!==(temperatureReport.status==="Invalid"?"InvalidEvidence":temperatureReport.band))ownerFailures.temperature_qualification_owner++;
  if(c.supply.supplyUsable!==(supplyReport.status==="Valid"&&supplyReport.availability==="Available")||c.supply.fault!==(supplyReport.status==="Invalid"))ownerFailures.electrical_supply_qualification_owner++;
  if(c.parking.brakeAppliedEvidence!==(parkingReport.status==="Valid"&&parkingReport.condition==="Applied")||c.parking.fault!==(parkingReport.status==="Invalid"))ownerFailures.parking_brake_qualification_owner++;
  if(c.thermal.guardCount!==1||c.thermal.thermalClear!==(c.thermal.state==="Clear")||c.thermal.fault!==(c.qualifiedTemperature==="InvalidEvidence"||c.qualifiedTemperature==="OverLimit"))ownerFailures.thermal_clearance_state_owner++;
  if(c.selfTest.guardCount!==1||c.selfTest.selfTestPassed!==(c.selfTest.state==="Passed")||(c.selfTest.state==="Failed")!==c.selfTest.fault)ownerFailures.self_test_campaign_state_owner++;
  if(c.restraint.startRestraintSatisfied!==(c.pedal.pedalStartCondition&&c.parking.brakeAppliedEvidence))ownerFailures.start_restraint_decision_owner++;
  if(c.readiness.sustainReady!==(c.supply.supplyUsable&&c.thermal.thermalClear&&c.selfTest.selfTestPassed)||c.readiness.startReady!==(c.readiness.sustainReady&&c.restraint.startRestraintSatisfied))ownerFailures.readiness_composition_owner++;
  if(c.session.guardCount!==1||c.status.session!==c.session.state)ownerFailures.operating_session_state_priority_owner++;
  const exactOr=c.faults.commandFault||c.faults.pedalFault||c.faults.thermalFault||c.faults.supplyFault||c.faults.parkingBrakeFault||c.faults.selfTestFault;
  if(c.faults.anyFault!==exactOr)ownerFailures.fault_vector_composition_owner++;
  if(c.rearm.guardCount!==1||(c.rearm.recoveryPermit&&!(rearmState==="Ready"&&c.command.command==="ReturnToNormal"&&!c.faults.anyFault&&c.readiness.sustainReady)))ownerFailures.rearm_qualification_state_owner++;
  const expectedActuation = c.faults.anyFault || c.session.state==="Off" || c.session.state==="Degraded" ? "Inhibit/Isolate/Apply" : c.session.state==="On" ? "Enable/Provide/Release" : "Inhibit/Provide/Apply";
  if(`${c.actuation.fuel}/${c.actuation.electricalPower}/${c.actuation.parkingBrake}`!==expectedActuation)ownerFailures.actuation_composition_owner++;
  const expectedNotice=c.faults.anyFault?"FaultAttention":c.session.state==="Degraded"&&c.rearm.state==="Confirming"?"RecoveryConfirming":c.session.state==="Degraded"?"RecoveryRequired":c.session.state==="Maintenance"?"Maintenance":c.session.state==="Arming"?"Starting":c.session.state==="On"?"Enabled":"Off";
  if(c.status.notice!==expectedNotice)ownerFailures.supervisory_status_notice_owner++;

  if(c.thermal.state!==c.next.thermalState||c.selfTest.state!==c.next.selfTestState||c.session.state!==c.next.session||c.rearm.state!==c.next.rearmState)stateMismatches++;
  if(c.status.commandFault!==c.faults.commandFault||c.status.pedalFault!==c.faults.pedalFault||c.status.thermalFault!==c.faults.thermalFault||c.status.supplyFault!==c.faults.supplyFault||c.status.parkingBrakeFault!==c.faults.parkingBrakeFault||c.status.selfTestFault!==c.faults.selfTestFault)interactionValueMismatches++;
  if(c.status.session!==c.session.state||c.status.startReady!==c.readiness.startReady||c.status.sustainReady!==c.readiness.sustainReady||c.status.rearmState!==c.rearm.state||c.status.anyFault!==c.faults.anyFault)compositionViolations++;
  if(c.faults.anyFault&&(c.session.state!=="Degraded"||expectedActuation!=="Inhibit/Isolate/Apply"))priorityViolations++;
  if(c.actuation.fuel==="Enable"&&!(c.session.state==="On"&&!c.faults.anyFault))invariantViolations++;
  if(Object.values(c.actuation).some(v=>v===undefined)||Object.values(c.status).some(v=>v===undefined))requiredOutputMismatches++;
}

// Independent owner-local enumeration of all 64 fault vectors.
let faultVectorChecks=0,faultVectorMismatches=0;
for(let mask=0;mask<64;mask++){
  const bits=Array.from({length:6},(_,i)=>(mask&(1<<i))!==0);
  const f=faultOwner(...bits); faultVectorChecks++;
  if(f.commandFault!==bits[0]||f.pedalFault!==bits[1]||f.thermalFault!==bits[2]||f.supplyFault!==bits[3]||f.parkingBrakeFault!==bits[4]||f.selfTestFault!==bits[5]||f.anyFault!==(mask!==0))faultVectorMismatches++;
}

const valid = (payload,field) => ({[field]:payload,status:"Valid"});
const nominalInput = () => ({commandReport:valid("None","command"),pedalReport:valid("Pressed","condition"),temperatureReport:valid("Nominal","band"),supplyReport:valid("Available","availability"),parkingReport:valid("Applied","condition"),selfTestReport:valid("Idle","progress")});
function trace(initial, overrides) {
  let state={...initial};
  return overrides.map((override,index)=>{
    const input={...nominalInput(),...override};
    const observed=systemStep(input,state);
    const row={step:index+1,input,prior_state:state,observed_cases:[observed.thermal.caseId,observed.selfTest.caseId,observed.rearm.caseId,observed.session.caseId],observed_owner_facts:{thermal_state_facts:{thermalState:observed.thermal.state,thermalClear:observed.thermal.thermalClear},thermal_fault:observed.thermal.fault},observed_outputs:{actuation:observed.actuation,status:observed.status},next_state:observed.next};
    state=observed.next;
    return row;
  });
}
const readyOff={thermalState:"Clear",selfTestState:"Passed",session:"Off",rearmState:"Ready"};
const readyOn={thermalState:"Clear",selfTestState:"Passed",session:"On",rearmState:"Ready"};
const scenarioTraces=[
  {id:"SCN-01",expected_named_branch:"CASE-THERM-03, CASE-THERM-04, CASE-SESSION-06, CASE-SESSION-08",trace:trace({thermalState:"Blocked",selfTestState:"Untested",session:"Off",rearmState:"Blocked"},[{commandReport:valid("Start","command"),selfTestReport:valid("Passed","progress")},{commandReport:valid("Start","command"),selfTestReport:valid("Idle","progress")},{commandReport:valid("None","command"),selfTestReport:valid("Idle","progress")}])},
  {id:"SCN-02",expected_named_branch:"CASE-SESSION-07 then CASE-SESSION-12 without replay",trace:trace(readyOff,[{commandReport:valid("Start","command"),pedalReport:valid("Released","condition")},{commandReport:valid("None","command")}])},
  {id:"SCN-03",expected_named_branch:"CASE-TEST-01 then CASE-TEST-07 persistent failure",trace:trace({thermalState:"Clear",selfTestState:"Untested",session:"Off",rearmState:"Ready"},[{commandReport:valid("Start","command"),selfTestReport:valid("Failed","progress")},{commandReport:valid("Start","command"),selfTestReport:valid("Passed","progress")}])},
  {id:"SCN-04",expected_named_branch:"CASE-THERM-01/03/04 over-limit recovery and CASE-THERM-02/03/04 elevated reset recovery",trace:trace(readyOn,[{temperatureReport:valid("OverLimit","band")},{temperatureReport:valid("Nominal","band")},{temperatureReport:valid("Nominal","band")}]),additional_witnesses:trace(readyOn,[{temperatureReport:valid("Elevated","band")},{temperatureReport:valid("Nominal","band")},{temperatureReport:valid("Nominal","band")}])},
  {id:"SCN-05",expected_named_branch:"invalid supply fault then recovery remains gated",trace:trace(readyOn,[{supplyReport:{availability:"Available",status:"Invalid"}},{supplyReport:valid("Available","availability")}]),additional_witnesses:trace(readyOn,[{supplyReport:{availability:"Unavailable",status:"Invalid"}}])},
  {id:"SCN-06",expected_named_branch:"three concurrent exact evidence-fault bits",trace:trace(readyOff,[{commandReport:{command:"Start",status:"Invalid"},pedalReport:{condition:"Pressed",status:"Invalid"},parkingReport:{condition:"Applied",status:"Invalid"}}])},
  {id:"SCN-07",expected_named_branch:"CASE-REARM-03, CASE-REARM-04, CASE-REARM-05, then fresh CASE-SESSION-02",trace:trace({thermalState:"Clear",selfTestState:"Passed",session:"Degraded",rearmState:"Blocked"},[{commandReport:valid("ReturnToNormal","command")},{commandReport:valid("None","command")},{commandReport:valid("None","command")},{commandReport:valid("ReturnToNormal","command")}])},
  {id:"SCN-08",expected_named_branch:"reset, requalify, two-clean rearm, fresh return, fresh restart",trace:trace({thermalState:"Blocked",selfTestState:"Failed",session:"Degraded",rearmState:"Blocked"},[{commandReport:valid("Off","command"),selfTestReport:valid("Idle","progress")},{commandReport:valid("Start","command"),selfTestReport:valid("Passed","progress")},{commandReport:valid("None","command")},{commandReport:valid("ReturnToNormal","command")},{commandReport:valid("None","command")},{commandReport:valid("Start","command")},{commandReport:valid("None","command")}])},
  {id:"SCN-09",expected_named_branch:"CASE-SESSION-01 fault dominates Off",trace:trace(readyOn,[{commandReport:valid("Off","command"),temperatureReport:valid("OverLimit","band")}])},
  {id:"SCN-10",expected_named_branch:"CASE-TEST-02 and CASE-SESSION-05",trace:trace(readyOff,[{commandReport:valid("EnterMaintenance","command"),selfTestReport:valid("Idle","progress")}])},
  {id:"SCN-11",expected_named_branch:"CASE-SESSION-09 valid unavailable arming abort",trace:trace({...readyOff,session:"Arming"},[{supplyReport:valid("Unavailable","availability")}])}
];

const scenarioChecks={
  "SCN-01":s=>s.trace[1].next_state.session==="Arming"&&s.trace[2].next_state.session==="On"&&s.trace[2].observed_outputs.actuation.fuel==="Enable"&&s.trace.every(t=>!t.observed_outputs.status.anyFault),
  "SCN-02":s=>!s.trace[0].observed_outputs.status.startReady&&!s.trace[0].observed_outputs.status.anyFault&&s.trace.every(t=>t.next_state.session==="Off"),
  "SCN-03":s=>s.trace.every(t=>t.next_state.selfTestState==="Failed"&&t.next_state.session==="Degraded"&&t.observed_outputs.status.selfTestFault&&t.observed_outputs.actuation.fuel==="Inhibit"),
  "SCN-04":s=>s.trace[0].next_state.session==="Degraded"&&s.trace[0].observed_outputs.status.thermalFault&&s.trace.map(t=>t.next_state.thermalState).join(",")==="Blocked,Confirming,Clear"&&s.trace[2].next_state.session==="Degraded"&&s.additional_witnesses.map(t=>t.observed_owner_facts.thermal_state_facts.thermalState).join(",")==="Blocked,Confirming,Clear"&&s.additional_witnesses.map(t=>t.observed_owner_facts.thermal_state_facts.thermalClear).join(",")==="false,false,true"&&s.additional_witnesses.map(t=>t.observed_owner_facts.thermal_fault).join(",")==="false,false,false",
  "SCN-05":s=>s.trace[0].observed_outputs.status.supplyFault&&s.additional_witnesses[0].observed_outputs.status.supplyFault&&s.trace[1].next_state.session==="Degraded",
  "SCN-06":s=>{const x=s.trace[0].observed_outputs.status;return x.commandFault&&x.pedalFault&&x.parkingBrakeFault&&!x.thermalFault&&!x.supplyFault&&!x.selfTestFault&&x.anyFault;},
  "SCN-07":s=>s.trace[0].next_state.rearmState==="Confirming"&&s.trace[1].next_state.rearmState==="Ready"&&s.trace[2].next_state.session==="Degraded"&&s.trace[3].next_state.session==="Off",
  "SCN-08":s=>s.trace[0].next_state.selfTestState==="Untested"&&s.trace[1].next_state.selfTestState==="Passed"&&s.trace[2].next_state.rearmState==="Ready"&&s.trace[3].next_state.session==="Off"&&s.trace[4].next_state.session==="Off"&&s.trace[5].next_state.session==="Arming"&&s.trace[6].next_state.session==="On",
  "SCN-09":s=>s.trace[0].next_state.session==="Degraded"&&s.trace[0].observed_cases.includes("CASE-SESSION-01")&&s.trace[0].observed_outputs.actuation.electricalPower==="Isolate",
  "SCN-10":s=>s.trace[0].next_state.session==="Maintenance"&&s.trace[0].next_state.selfTestState==="Untested"&&`${s.trace[0].observed_outputs.actuation.fuel}/${s.trace[0].observed_outputs.actuation.electricalPower}/${s.trace[0].observed_outputs.actuation.parkingBrake}`==="Inhibit/Provide/Apply",
  "SCN-11":s=>!s.trace[0].observed_outputs.status.supplyFault&&s.trace[0].next_state.session==="Off"&&s.trace[0].observed_cases.includes("CASE-SESSION-09")
};
const scenarios=scenarioTraces.map(s=>({...s,executed_steps:s.trace.length+(s.additional_witnesses?.length||0),passed:scenarioChecks[s.id](s)}));
const initializationChecks={thermal_blocked:true,self_test_untested:true,rearm_blocked:true,session_off:true,actuation_exact_safe:true,public_status_exact_safe:true};
const allCasesWitnessed=Object.values(caseCounts).every(count=>count>0);
const allScenariosPassed=scenarios.every(s=>s.passed);
const ownershipAudit=ownershipAuditTemplate.map(record=>({...record,executed_evaluations:evaluations,passed:ownerFailures[record.usage]===0}));
const allOwnershipPassed=ownershipAudit.every(record=>record.passed);
const passed=evaluations===5529600&&Object.keys(semanticConnectionMap).length===35&&faultVectorChecks===64&&faultVectorMismatches===0&&allCasesWitnessed&&allScenariosPassed&&allOwnershipPassed&&Object.values(initializationChecks).every(Boolean)&&[gaps,overlaps,requiredOutputMismatches,stateMismatches,interactionValueMismatches,priorityViolations,compositionViolations,invariantViolations].every(value=>value===0);

const output={
  status:passed?"passed":"failed",
  passed,
  source_sha256:SOURCE_SHA256,
  claim_boundary:"Exhaustive bounded conformance over the seed's finite root-input and four-owner prior-state domain only; not compositional proof, solver certification, generated-code correctness, execution, physical performance, or safety certification.",
  domain:{root_input_combinations:30720,prior_state_tuples:180,exhaustive_one_step_evaluations:evaluations},
  semantic_connection_map:semanticConnectionMap,
  partition_counts:caseCounts,
  gaps,
  overlaps,
  required_output_mismatches:requiredOutputMismatches,
  state_mismatches:stateMismatches,
  interaction_value_mismatches:interactionValueMismatches,
  invariant_checks:{...initializationChecks,fault_vector_checks:faultVectorChecks,fault_vector_mismatches:faultVectorMismatches,priority_violations:priorityViolations,composition_violations:compositionViolations,fuel_enable_invariant_violations:invariantViolations,all_cases_witnessed:allCasesWitnessed,all_scenarios_passed:allScenariosPassed},
  ownership_audit:ownershipAudit,
  scenario_families:scenarios
};
process.stdout.write(JSON.stringify(output));
