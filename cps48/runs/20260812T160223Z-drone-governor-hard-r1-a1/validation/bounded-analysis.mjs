// Deterministic, dependency-free finite analysis of Drone_Lifecycle_Energy_Governor.sysml.
// This program intentionally reads no files, environment variables, clocks, or mutable external state.

const SOURCE_SHA256 = "8edeec3db2159e274d34896167ee7793432c46c738fcc08e56f1d3b87e36067a";

const Requests = ["NONE", "SWITCH_ON", "SWITCH_OFF", "START_CHARGE", "STOP_CHARGE", "ACTIVATE", "DEACTIVATE", "LAUNCH", "RETURN", "LAND"];
const Bands = ["FULL", "MEDIUM", "LOW", "CRITICAL"];
const Validities = ["VALID", "INVALID"];
const Chargers = ["DISCONNECTED", "CONNECTED_HEALTHY", "CONNECTED_FAULTED"];
const Navigations = ["USABLE", "UNUSABLE"];
const FlightControls = ["AVAILABLE", "FAULTED"];
const HomeValues = ["AWAY", "REACHED"];
const TouchdownValues = ["NOT_CONFIRMED", "CONFIRMED"];
const Phases = ["OFF", "STANDBY", "CHARGING", "READY", "FLYING", "RETURNING", "LANDING"];
const Confidences = ["UNTRUSTED", "CONFIRMING", "TRUSTED"];

const semantic_connection_map = [
  ["INT-01", "CTX-01.request", "PART-01.requestIn"],
  ["INT-02", "CTX-02.batteryReport", "PART-02.reportIn"],
  ["INT-03", "CTX-03.chargerReport", "PART-03.reportIn"],
  ["INT-04", "CTX-04.navigationReport", "PART-05.navigationIn"],
  ["INT-05", "CTX-05.flightControlReport", "PART-05.flightControlIn"],
  ["INT-06", "CTX-06.homeReport", "PART-06.reportIn"],
  ["INT-07", "CTX-07.touchdownReport", "PART-07.reportIn"],
  ["INT-08", "CTX-04.navigationReport", "PART-09.navigationIn"],
  ["INT-09", "PART-01.semanticsToAirborne", "PART-10.semanticsIn"],
  ["INT-10", "PART-01.semanticsToLifecycle", "PART-12.semanticsIn"],
  ["INT-11", "PART-02.evidenceOut", "PART-08.evidenceIn"],
  ["INT-12", "PART-08.stateToCharge", "PART-04.batteryIn"],
  ["INT-13", "PART-08.stateToReadiness", "PART-05.batteryIn"],
  ["INT-14", "PART-08.confidenceToFault", "PART-11.confidenceIn"],
  ["INT-15", "PART-08.stateToComposition", "PART-13.batteryIn"],
  ["INT-16", "PART-03.factsToCharge", "PART-04.chargerIn"],
  ["INT-17", "PART-03.faultToAggregation", "PART-11.chargerFaultIn"],
  ["INT-18", "CTX-04.navigationReport", "PART-11.navigationIn"],
  ["INT-19", "CTX-05.flightControlReport", "PART-09.flightControlIn"],
  ["INT-20", "CTX-05.flightControlReport", "PART-11.flightControlIn"],
  ["INT-21", "PART-08.stateToHazard", "PART-09.batteryIn"],
  ["INT-22", "PART-04.eligibilityOut", "PART-12.chargeEligibilityIn"],
  ["INT-23", "PART-05.readinessOut", "PART-12.readinessIn"],
  ["INT-24", "PART-06.factsToLifecycle", "PART-12.homeFactsIn"],
  ["INT-25", "PART-06.faultToAggregation", "PART-11.homeFaultIn"],
  ["INT-26", "PART-07.factsToLifecycle", "PART-12.touchdownFactsIn"],
  ["INT-27", "PART-07.faultToAggregation", "PART-11.touchdownFaultIn"],
  ["INT-28", "PART-09.proposalOut", "PART-12.hazardProposalIn"],
  ["INT-29", "PART-10.proposalOut", "PART-12.airborneRequestIn"],
  ["INT-30", "PART-11.faultsOut", "PART-13.faultsIn"],
  ["INT-31", "PART-12.resolutionOut", "PART-13.resolutionIn"],
  ["INT-32", "PART-13.pilotStatusOut", "CTX-01.pilotStatus"],
  ["INT-33", "PART-13.chargePermissionOut", "CTX-03.chargePermission"],
  ["INT-34", "PART-13.flightControlOut", "CTX-05.flightControlOutputs"],
  ["INT-35", "PART-13.propulsionPermissionOut", "CTX-08.propulsionPermission"]
].map(([id, source, destination]) => ({id, source, destination}));

const ownership_audit_base = [
  {usage:"requestApplicabilityOwner", claimed_roles:["applicability"], assigned_inputs:["INT-01 requestIn"], owner_local_facts:["five-valued request family classification"], contract_cases:["REQUEST_FAMILY_CLASSIFICATION"], analyzer_checks:["request_family_many_to_one"]},
  {usage:"batteryEvidenceQualifier", claimed_roles:["decision"], assigned_inputs:["INT-02 reportIn"], owner_local_facts:["valid-band suppression"], contract_cases:["VALID_BAND_SUPPRESSION"], analyzer_checks:["invalid_band_suppression"]},
  {usage:"chargerEvidenceQualifier", claimed_roles:["decision"], assigned_inputs:["INT-03 reportIn"], owner_local_facts:["connected healthy and fault classification"], contract_cases:["CHARGER_POLICY_CLASSIFICATION"], analyzer_checks:["charger_three_way_classification"]},
  {usage:"chargeEligibilityOwner", claimed_roles:["applicability"], assigned_inputs:["INT-12 batteryIn","INT-16 chargerIn"], owner_local_facts:["entry retention and exit eligibility"], contract_cases:["CHARGE_ELIGIBILITY_COMBINATION"], analyzer_checks:["charge_eligibility_combination"]},
  {usage:"flightReadinessOwner", claimed_roles:["applicability"], assigned_inputs:["INT-04 navigationIn","INT-05 flightControlIn","INT-13 batteryIn"], owner_local_facts:["combined activation and launch readiness"], contract_cases:["COMBINED_FLIGHT_READINESS"], analyzer_checks:["flight_readiness_combination"]},
  {usage:"homeEvidenceQualifier", claimed_roles:["applicability"], assigned_inputs:["INT-06 reportIn"], owner_local_facts:["qualified arrival and home evidence fault"], contract_cases:["QUALIFIED_HOME_COMPLETION"], analyzer_checks:["home_four_pair_qualification"]},
  {usage:"touchdownEvidenceQualifier", claimed_roles:["applicability"], assigned_inputs:["INT-07 reportIn"], owner_local_facts:["qualified touchdown and touchdown evidence fault"], contract_cases:["QUALIFIED_TOUCHDOWN_COMPLETION"], analyzer_checks:["touchdown_four_pair_qualification"]},
  {usage:"batteryConfidenceOwner", claimed_roles:["decision"], assigned_inputs:["INT-11 evidenceIn","owned prior confidenceState"], owner_local_facts:["three-valued confidence next state","same-step battery usability"], contract_cases:["CASE-A-01","CASE-A-02","CASE-A-03","CASE-A-04"], analyzer_checks:["confidence_partition","two_valid_step_recovery"]},
  {usage:"airborneHazardProposalOwner", claimed_roles:["proposal"], assigned_inputs:["INT-08 navigationIn","INT-19 flightControlIn","INT-21 batteryIn"], owner_local_facts:["emergency-land proposal","forced-return proposal"], contract_cases:["AIRBORNE_HAZARD_PROPOSALS"], analyzer_checks:["airborne_hazard_proposals"]},
  {usage:"airborneRequestProposalOwner", claimed_roles:["proposal"], assigned_inputs:["INT-09 semanticsIn"], owner_local_facts:["three-valued airborne request classification"], contract_cases:["AIRBORNE_REQUEST_CLASSIFICATION"], analyzer_checks:["airborne_request_many_to_one"]},
  {usage:"faultAggregationOwner", claimed_roles:["decision"], assigned_inputs:["INT-14 confidenceIn","INT-17 chargerFaultIn","INT-18 navigationIn","INT-20 flightControlIn","INT-25 homeFaultIn","INT-27 touchdownFaultIn"], owner_local_facts:["confidence-derived battery fault","six-way exact aggregate disjunction"], contract_cases:["CURRENT_FAULT_VECTOR_AND_DISJUNCTION"], analyzer_checks:["battery_fault_classification","aggregate_fault_disjunction"]},
  {usage:"lifecyclePriorityOwner", claimed_roles:["decision"], assigned_inputs:["INT-10 semanticsIn","INT-22 chargeEligibilityIn","INT-23 readinessIn","INT-24 homeFactsIn","INT-26 touchdownFactsIn","INT-28 hazardProposalIn","INT-29 airborneRequestIn","owned prior phaseState"], owner_local_facts:["first-match lifecycle case","next lifecycle phase","primitive request-effect evidence"], contract_cases:Array.from({length:26},(_,i)=>`CASE-L-${String(i+1).padStart(2,"0")}`), analyzer_checks:["lifecycle_partition","first_match_priority","request_effect_evidence"]},
  {usage:"outcomeCompositionOwner", claimed_roles:["decision"], assigned_inputs:["INT-15 batteryIn","INT-30 faultsIn","INT-31 resolutionIn"], owner_local_facts:["request result","battery notice","flight intent","charge launch and propulsion permissions"], contract_cases:["REQUEST_RESULT_DERIVATION","BATTERY_NOTICE_DERIVATION","FLIGHT_INTENT_DERIVATION","PERMISSION_DERIVATION"], analyzer_checks:["atomic_public_tuple","composition_oracle_equality"]}
];

function requestOwner(request) {
  const family = request === "NONE" ? "ABSENT" :
    (request === "SWITCH_ON" || request === "SWITCH_OFF") ? "POWER" :
    (request === "START_CHARGE" || request === "STOP_CHARGE") ? "CHARGE" :
    (request === "ACTIVATE" || request === "DEACTIVATE" || request === "LAUNCH") ? "READINESS" : "AIRBORNE";
  const value = {intentCode: request, requestFamily: family};
  return {toAirborne:{...value}, toLifecycle:{...value}};
}

function batteryEvidenceOwner(report) {
  return {band:report.band, validBand:report.validity === "VALID"};
}

function batteryConfidenceOwner(evidence, priorConfidence) {
  let confidenceCase;
  let confidence;
  if (!evidence.validBand) { confidenceCase = "CASE-A-01"; confidence = "UNTRUSTED"; }
  else if (priorConfidence === "UNTRUSTED") { confidenceCase = "CASE-A-02"; confidence = "CONFIRMING"; }
  else if (priorConfidence === "CONFIRMING") { confidenceCase = "CASE-A-03"; confidence = "TRUSTED"; }
  else { confidenceCase = "CASE-A-04"; confidence = "TRUSTED"; }
  return {confidenceCase, facts:{band:evidence.band, confidence, usable:confidence === "TRUSTED"}};
}

function chargerOwner(report) {
  const facts = {connected:report !== "DISCONNECTED", healthyConnected:report === "CONNECTED_HEALTHY", chargerFault:report === "CONNECTED_FAULTED"};
  return {facts, fault:facts.chargerFault};
}

function chargeEligibilityOwner(battery, charger) {
  const eligible = battery.usable && battery.band !== "FULL" && charger.healthyConnected;
  return {entryEligible:eligible, retentionEligible:eligible, exitRequired:!eligible};
}

function flightReadinessOwner(navigation, flightControl, battery) {
  return battery.usable && (battery.band === "MEDIUM" || battery.band === "FULL") && navigation === "USABLE" && flightControl === "AVAILABLE";
}

function homeOwner(report) {
  const evidenceValid = report.validity === "VALID";
  return {arrivalEstablished:evidenceValid && report.value === "REACHED", evidenceValid, homeFault:!evidenceValid};
}

function touchdownOwner(report) {
  const evidenceValid = report.validity === "VALID";
  return {touchdownEstablished:evidenceValid && report.value === "CONFIRMED", evidenceValid, touchdownFault:!evidenceValid};
}

function hazardOwner(navigation, flightControl, battery) {
  const batteryUnusable = !battery.usable;
  const lowOrCritical = battery.usable && (battery.band === "LOW" || battery.band === "CRITICAL");
  const navigationUnusable = navigation === "UNUSABLE";
  return {
    emergencyLand:batteryUnusable || (battery.confidence === "TRUSTED" && battery.band === "CRITICAL") || flightControl === "FAULTED",
    forcedReturn:navigationUnusable || (battery.confidence === "TRUSTED" && battery.band === "LOW"),
    batteryUnusable, lowOrCritical, navigationUnusable
  };
}

function airborneRequestOwner(classified) {
  return classified.intentCode === "RETURN" ? "RETURN_REQUESTED" : classified.intentCode === "LAND" ? "LAND_REQUESTED" : "NO_AIRBORNE_REQUEST";
}

function faultOwner(confidence, chargerFault, navigation, flightControl, homeFault, touchdownFault) {
  const faults = {
    batteryFault:confidence !== "TRUSTED", chargerFault,
    navigationFault:navigation === "UNUSABLE", flightControlFault:flightControl === "FAULTED",
    homeFault, touchdownFault
  };
  faults.aggregateFault = faults.batteryFault || faults.chargerFault || faults.navigationFault || faults.flightControlFault || faults.homeFault || faults.touchdownFault;
  return faults;
}

function lifecycleOwner(priorPhase, semantics, charge, readiness, home, touchdown, hazard, airborneRequest) {
  const airborne = priorPhase === "FLYING" || priorPhase === "RETURNING" || priorPhase === "LANDING";
  const guards = [
    airborne && hazard.emergencyLand,
    priorPhase === "RETURNING" && !hazard.emergencyLand && hazard.navigationUnusable,
    priorPhase === "FLYING" && !hazard.emergencyLand && hazard.forcedReturn,
    (((priorPhase === "FLYING" && !hazard.emergencyLand && !hazard.forcedReturn) ||
      (priorPhase === "RETURNING" && !hazard.emergencyLand && !hazard.navigationUnusable)) && airborneRequest === "LAND_REQUESTED"),
    priorPhase === "FLYING" && !hazard.emergencyLand && !hazard.forcedReturn && airborneRequest !== "LAND_REQUESTED" && airborneRequest === "RETURN_REQUESTED",
    priorPhase === "RETURNING" && !hazard.emergencyLand && !hazard.navigationUnusable && airborneRequest !== "LAND_REQUESTED" && home.arrivalEstablished,
    priorPhase === "LANDING" && !hazard.emergencyLand && touchdown.touchdownEstablished && readiness,
    priorPhase === "LANDING" && !hazard.emergencyLand && touchdown.touchdownEstablished && !readiness,
    (priorPhase === "STANDBY" || priorPhase === "CHARGING" || priorPhase === "READY") && hazard.batteryUnusable,
    priorPhase === "READY" && !hazard.batteryUnusable && hazard.lowOrCritical,
    priorPhase === "OFF" && semantics.intentCode === "SWITCH_ON",
    priorPhase === "OFF" && semantics.intentCode !== "SWITCH_ON",
    priorPhase === "STANDBY" && !hazard.batteryUnusable && semantics.intentCode === "SWITCH_OFF",
    priorPhase === "STANDBY" && !hazard.batteryUnusable && semantics.intentCode !== "SWITCH_OFF" && semantics.intentCode === "START_CHARGE" && charge.entryEligible,
    priorPhase === "STANDBY" && !hazard.batteryUnusable && semantics.intentCode !== "SWITCH_OFF" && !(semantics.intentCode === "START_CHARGE" && charge.entryEligible) && semantics.intentCode === "ACTIVATE" && readiness,
    priorPhase === "STANDBY" && !hazard.batteryUnusable && semantics.intentCode !== "SWITCH_OFF" && !(semantics.intentCode === "START_CHARGE" && charge.entryEligible) && !(semantics.intentCode === "ACTIVATE" && readiness),
    priorPhase === "CHARGING" && !hazard.batteryUnusable && semantics.intentCode === "SWITCH_OFF",
    priorPhase === "CHARGING" && !hazard.batteryUnusable && semantics.intentCode !== "SWITCH_OFF" && (semantics.intentCode === "STOP_CHARGE" || charge.exitRequired),
    priorPhase === "CHARGING" && !hazard.batteryUnusable && semantics.intentCode !== "SWITCH_OFF" && semantics.intentCode !== "STOP_CHARGE" && !charge.exitRequired,
    priorPhase === "READY" && !hazard.batteryUnusable && !hazard.lowOrCritical && semantics.intentCode === "SWITCH_OFF",
    priorPhase === "READY" && !hazard.batteryUnusable && !hazard.lowOrCritical && semantics.intentCode !== "SWITCH_OFF" && semantics.intentCode === "DEACTIVATE",
    priorPhase === "READY" && !hazard.batteryUnusable && !hazard.lowOrCritical && semantics.intentCode !== "SWITCH_OFF" && semantics.intentCode !== "DEACTIVATE" && semantics.intentCode === "LAUNCH" && readiness,
    priorPhase === "READY" && !hazard.batteryUnusable && !hazard.lowOrCritical && semantics.intentCode !== "SWITCH_OFF" && semantics.intentCode !== "DEACTIVATE" && !(semantics.intentCode === "LAUNCH" && readiness),
    priorPhase === "FLYING" && !hazard.emergencyLand && !hazard.forcedReturn && airborneRequest !== "LAND_REQUESTED" && airborneRequest !== "RETURN_REQUESTED",
    priorPhase === "RETURNING" && !hazard.emergencyLand && !hazard.navigationUnusable && airborneRequest !== "LAND_REQUESTED" && !home.arrivalEstablished,
    priorPhase === "LANDING" && !hazard.emergencyLand && !touchdown.touchdownEstablished
  ];
  const hits = guards.reduce((n, value) => n + Number(value), 0);
  const index = guards.findIndex(Boolean);
  const nextByIndex = ["LANDING","LANDING","RETURNING","LANDING","RETURNING","LANDING","READY","STANDBY","STANDBY","STANDBY","STANDBY","OFF","OFF","CHARGING","READY","STANDBY","OFF","STANDBY","CHARGING","OFF","STANDBY","FLYING","READY","FLYING","RETURNING","LANDING"];
  const winningCase = index >= 0 ? `CASE-L-${String(index + 1).padStart(2,"0")}` : null;
  const requestPresent = semantics.requestFamily !== "ABSENT";
  const requestApplicable =
    (priorPhase === "OFF" && semantics.requestFamily === "POWER" && semantics.intentCode === "SWITCH_ON") ||
    (priorPhase === "STANDBY" && semantics.requestFamily === "POWER" && semantics.intentCode === "SWITCH_OFF") ||
    (priorPhase === "STANDBY" && semantics.requestFamily === "CHARGE" && semantics.intentCode === "START_CHARGE" && charge.entryEligible) ||
    (priorPhase === "STANDBY" && semantics.requestFamily === "READINESS" && semantics.intentCode === "ACTIVATE" && readiness) ||
    (priorPhase === "CHARGING" && ((semantics.requestFamily === "POWER" && semantics.intentCode === "SWITCH_OFF") || (semantics.requestFamily === "CHARGE" && semantics.intentCode === "STOP_CHARGE"))) ||
    (priorPhase === "READY" && ((semantics.requestFamily === "POWER" && semantics.intentCode === "SWITCH_OFF") || (semantics.requestFamily === "READINESS" && semantics.intentCode === "DEACTIVATE"))) ||
    (priorPhase === "READY" && semantics.requestFamily === "READINESS" && semantics.intentCode === "LAUNCH" && readiness) ||
    (priorPhase === "FLYING" && semantics.requestFamily === "AIRBORNE" && (airborneRequest === "RETURN_REQUESTED" || airborneRequest === "LAND_REQUESTED")) ||
    (priorPhase === "RETURNING" && semantics.requestFamily === "AIRBORNE" && airborneRequest === "LAND_REQUESTED");
  const requestCausedTransition =
    (winningCase === "CASE-L-04" && semantics.intentCode === "LAND") ||
    (winningCase === "CASE-L-05" && semantics.intentCode === "RETURN") ||
    (winningCase === "CASE-L-11" && semantics.intentCode === "SWITCH_ON") ||
    (winningCase === "CASE-L-13" && semantics.intentCode === "SWITCH_OFF") ||
    (winningCase === "CASE-L-14" && semantics.intentCode === "START_CHARGE") ||
    (winningCase === "CASE-L-15" && semantics.intentCode === "ACTIVATE") ||
    (winningCase === "CASE-L-17" && semantics.intentCode === "SWITCH_OFF") ||
    (winningCase === "CASE-L-18" && semantics.intentCode === "STOP_CHARGE") ||
    (winningCase === "CASE-L-20" && semantics.intentCode === "SWITCH_OFF") ||
    (winningCase === "CASE-L-21" && semantics.intentCode === "DEACTIVATE") ||
    (winningCase === "CASE-L-22" && semantics.intentCode === "LAUNCH");
  return {
    hits, guards, winningCase, sourceLifecycleState:priorPhase, nextPhase:index >= 0 ? nextByIndex[index] : null,
    requestPresent, requestApplicable, requestCausedTransition,
    requestDefeatedByPriority:requestApplicable && !requestCausedTransition,
    chargeRetentionEligible:charge.retentionEligible, launchReady:readiness
  };
}

function outcomeOwner(battery, faults, resolution) {
  const requestResult = !resolution.requestPresent ? "NONE" : resolution.requestCausedTransition ? "ACCEPTED" : resolution.requestDefeatedByPriority ? "PREEMPTED" : "REJECTED";
  const batteryNotice = battery.confidence !== "TRUSTED" ? "UNTRUSTED" : battery.band === "LOW" ? "LOW" : battery.band === "CRITICAL" ? "CRITICAL" : "CLEAR";
  const intent = resolution.nextPhase === "FLYING" ? (resolution.sourceLifecycleState === "FLYING" ? "CONTINUE" : "LAUNCH") : resolution.nextPhase === "RETURNING" ? "RETURN" : resolution.nextPhase === "LANDING" ? "LAND" : "HOLD";
  return {
    phase:resolution.nextPhase, requestResult, batteryNotice, faults:{...faults},
    chargePermission:resolution.nextPhase === "CHARGING" && resolution.chargeRetentionEligible ? "PERMITTED" : "DENIED",
    intent,
    launchPermission:resolution.nextPhase === "READY" && resolution.launchReady ? "PERMITTED" : "DENIED",
    propulsionPermission:intent === "HOLD" ? "DISABLED" : "ENABLED"
  };
}

function compose(snapshot, priorState) {
  const w = Object.create(null);
  w["INT-01"] = snapshot.request;
  w["INT-02"] = {band:snapshot.batteryBand, validity:snapshot.batteryValidity};
  w["INT-03"] = snapshot.charger;
  w["INT-04"] = snapshot.navigation;
  w["INT-05"] = snapshot.flightControl;
  w["INT-06"] = {value:snapshot.homeValue, validity:snapshot.homeValidity};
  w["INT-07"] = {value:snapshot.touchdownValue, validity:snapshot.touchdownValidity};
  w["INT-08"] = snapshot.navigation;
  const p1 = requestOwner(w["INT-01"]); w["INT-09"] = p1.toAirborne; w["INT-10"] = p1.toLifecycle;
  w["INT-11"] = batteryEvidenceOwner(w["INT-02"]);
  const p8 = batteryConfidenceOwner(w["INT-11"], priorState.confidence);
  w["INT-12"] = {...p8.facts}; w["INT-13"] = {...p8.facts}; w["INT-14"] = p8.facts.confidence; w["INT-15"] = {...p8.facts}; w["INT-21"] = {...p8.facts};
  const p3 = chargerOwner(w["INT-03"]); w["INT-16"] = p3.facts; w["INT-17"] = p3.fault;
  w["INT-18"] = snapshot.navigation; w["INT-19"] = snapshot.flightControl; w["INT-20"] = snapshot.flightControl;
  w["INT-22"] = chargeEligibilityOwner(w["INT-12"], w["INT-16"]);
  w["INT-23"] = flightReadinessOwner(w["INT-04"], w["INT-05"], w["INT-13"]);
  const p6 = homeOwner(w["INT-06"]); w["INT-24"] = p6; w["INT-25"] = p6.homeFault;
  const p7 = touchdownOwner(w["INT-07"]); w["INT-26"] = p7; w["INT-27"] = p7.touchdownFault;
  w["INT-28"] = hazardOwner(w["INT-08"], w["INT-19"], w["INT-21"]);
  w["INT-29"] = airborneRequestOwner(w["INT-09"]);
  w["INT-30"] = faultOwner(w["INT-14"], w["INT-17"], w["INT-18"], w["INT-20"], w["INT-25"], w["INT-27"]);
  w["INT-31"] = lifecycleOwner(priorState.phase, w["INT-10"], w["INT-22"], w["INT-23"], w["INT-24"], w["INT-26"], w["INT-28"], w["INT-29"]);
  const publicTuple = outcomeOwner(w["INT-15"], w["INT-30"], w["INT-31"]);
  w["INT-32"] = {phase:publicTuple.phase, requestResult:publicTuple.requestResult, batteryNotice:publicTuple.batteryNotice, faults:publicTuple.faults};
  w["INT-33"] = publicTuple.chargePermission;
  w["INT-34"] = {intent:publicTuple.intent, launchPermission:publicTuple.launchPermission};
  w["INT-35"] = publicTuple.propulsionPermission;
  return {confidenceCase:p8.confidenceCase, lifecycle:w["INT-31"], publicTuple, faults:w["INT-30"], nextState:{phase:w["INT-31"].nextPhase, confidence:p8.facts.confidence}, wires:w};
}

function directOracle(s, prior) {
  const confidenceCase = s.batteryValidity === "INVALID" ? "CASE-A-01" : prior.confidence === "UNTRUSTED" ? "CASE-A-02" : prior.confidence === "CONFIRMING" ? "CASE-A-03" : "CASE-A-04";
  const confidence = confidenceCase === "CASE-A-01" ? "UNTRUSTED" : confidenceCase === "CASE-A-02" ? "CONFIRMING" : "TRUSTED";
  const usable = confidence === "TRUSTED";
  const healthy = s.charger === "CONNECTED_HEALTHY";
  const chargeEligible = usable && s.batteryBand !== "FULL" && healthy;
  const readiness = usable && (s.batteryBand === "MEDIUM" || s.batteryBand === "FULL") && s.navigation === "USABLE" && s.flightControl === "AVAILABLE";
  const emergency = !usable || (confidence === "TRUSTED" && s.batteryBand === "CRITICAL") || s.flightControl === "FAULTED";
  const navLost = s.navigation === "UNUSABLE";
  const forcedReturn = navLost || (confidence === "TRUSTED" && s.batteryBand === "LOW");
  const ground = prior.phase === "STANDBY" || prior.phase === "CHARGING" || prior.phase === "READY";
  const airborne = prior.phase === "FLYING" || prior.phase === "RETURNING" || prior.phase === "LANDING";
  const arrival = s.homeValidity === "VALID" && s.homeValue === "REACHED";
  const touchdown = s.touchdownValidity === "VALID" && s.touchdownValue === "CONFIRMED";
  let n, next;
  if (airborne && emergency) { n=1; next="LANDING"; }
  else if (prior.phase === "RETURNING" && navLost) { n=2; next="LANDING"; }
  else if (prior.phase === "FLYING" && forcedReturn) { n=3; next="RETURNING"; }
  else if ((prior.phase === "FLYING" || prior.phase === "RETURNING") && s.request === "LAND") { n=4; next="LANDING"; }
  else if (prior.phase === "FLYING" && s.request === "RETURN") { n=5; next="RETURNING"; }
  else if (prior.phase === "RETURNING" && arrival) { n=6; next="LANDING"; }
  else if (prior.phase === "LANDING" && touchdown && readiness) { n=7; next="READY"; }
  else if (prior.phase === "LANDING" && touchdown) { n=8; next="STANDBY"; }
  else if (ground && !usable) { n=9; next="STANDBY"; }
  else if (prior.phase === "READY" && usable && (s.batteryBand === "LOW" || s.batteryBand === "CRITICAL")) { n=10; next="STANDBY"; }
  else if (prior.phase === "OFF" && s.request === "SWITCH_ON") { n=11; next="STANDBY"; }
  else if (prior.phase === "OFF") { n=12; next="OFF"; }
  else if (prior.phase === "STANDBY" && s.request === "SWITCH_OFF") { n=13; next="OFF"; }
  else if (prior.phase === "STANDBY" && s.request === "START_CHARGE" && chargeEligible) { n=14; next="CHARGING"; }
  else if (prior.phase === "STANDBY" && s.request === "ACTIVATE" && readiness) { n=15; next="READY"; }
  else if (prior.phase === "STANDBY") { n=16; next="STANDBY"; }
  else if (prior.phase === "CHARGING" && s.request === "SWITCH_OFF") { n=17; next="OFF"; }
  else if (prior.phase === "CHARGING" && (s.request === "STOP_CHARGE" || !healthy || s.batteryBand === "FULL")) { n=18; next="STANDBY"; }
  else if (prior.phase === "CHARGING") { n=19; next="CHARGING"; }
  else if (prior.phase === "READY" && s.request === "SWITCH_OFF") { n=20; next="OFF"; }
  else if (prior.phase === "READY" && s.request === "DEACTIVATE") { n=21; next="STANDBY"; }
  else if (prior.phase === "READY" && s.request === "LAUNCH" && readiness) { n=22; next="FLYING"; }
  else if (prior.phase === "READY") { n=23; next="READY"; }
  else if (prior.phase === "FLYING") { n=24; next="FLYING"; }
  else if (prior.phase === "RETURNING") { n=25; next="RETURNING"; }
  else { n=26; next="LANDING"; }
  const lifecycleCase = `CASE-L-${String(n).padStart(2,"0")}`;
  const applicable =
    (prior.phase === "OFF" && s.request === "SWITCH_ON") ||
    (prior.phase === "STANDBY" && s.request === "SWITCH_OFF") ||
    (prior.phase === "STANDBY" && s.request === "START_CHARGE" && chargeEligible) ||
    (prior.phase === "STANDBY" && s.request === "ACTIVATE" && readiness) ||
    (prior.phase === "CHARGING" && (s.request === "SWITCH_OFF" || s.request === "STOP_CHARGE")) ||
    (prior.phase === "READY" && (s.request === "SWITCH_OFF" || s.request === "DEACTIVATE")) ||
    (prior.phase === "READY" && s.request === "LAUNCH" && readiness) ||
    (prior.phase === "FLYING" && (s.request === "RETURN" || s.request === "LAND")) ||
    (prior.phase === "RETURNING" && s.request === "LAND");
  const caused = (n===4&&s.request==="LAND")||(n===5&&s.request==="RETURN")||(n===11&&s.request==="SWITCH_ON")||(n===13&&s.request==="SWITCH_OFF")||(n===14&&s.request==="START_CHARGE")||(n===15&&s.request==="ACTIVATE")||(n===17&&s.request==="SWITCH_OFF")||(n===18&&s.request==="STOP_CHARGE")||(n===20&&s.request==="SWITCH_OFF")||(n===21&&s.request==="DEACTIVATE")||(n===22&&s.request==="LAUNCH");
  const requestResult = s.request === "NONE" ? "NONE" : caused ? "ACCEPTED" : applicable ? "PREEMPTED" : "REJECTED";
  const faults = {
    batteryFault:confidence !== "TRUSTED", chargerFault:s.charger === "CONNECTED_FAULTED",
    navigationFault:navLost, flightControlFault:s.flightControl === "FAULTED",
    homeFault:s.homeValidity === "INVALID", touchdownFault:s.touchdownValidity === "INVALID"
  };
  faults.aggregateFault = faults.batteryFault || faults.chargerFault || faults.navigationFault || faults.flightControlFault || faults.homeFault || faults.touchdownFault;
  const batteryNotice = confidence !== "TRUSTED" ? "UNTRUSTED" : s.batteryBand === "LOW" ? "LOW" : s.batteryBand === "CRITICAL" ? "CRITICAL" : "CLEAR";
  const intent = next === "FLYING" ? (prior.phase === "FLYING" ? "CONTINUE" : "LAUNCH") : next === "RETURNING" ? "RETURN" : next === "LANDING" ? "LAND" : "HOLD";
  const publicTuple = {phase:next, requestResult, batteryNotice, faults,
    chargePermission:next === "CHARGING" && chargeEligible ? "PERMITTED" : "DENIED",
    intent, launchPermission:next === "READY" && readiness ? "PERMITTED" : "DENIED",
    propulsionPermission:intent === "HOLD" ? "DISABLED" : "ENABLED"};
  return {confidenceCase, lifecycleCase, nextState:{phase:next, confidence}, publicTuple};
}

function snapshots() {
  const values = [];
  for (const request of Requests) for (const batteryBand of Bands) for (const batteryValidity of Validities)
  for (const charger of Chargers) for (const navigation of Navigations) for (const flightControl of FlightControls)
  for (const homeValue of HomeValues) for (const homeValidity of Validities)
  for (const touchdownValue of TouchdownValues) for (const touchdownValidity of Validities)
    values.push({request,batteryBand,batteryValidity,charger,navigation,flightControl,homeValue,homeValidity,touchdownValue,touchdownValidity});
  return values;
}

const allSnapshots = snapshots();
const stateKey = state => `${state.phase}/${state.confidence}`;
const reachable = new Map([["OFF/UNTRUSTED", {phase:"OFF", confidence:"UNTRUSTED"}]]);
let changed = true;
while (changed) {
  changed = false;
  for (const state of [...reachable.values()]) for (const snapshot of allSnapshots) {
    const next = compose(snapshot, state).nextState;
    const key = stateKey(next);
    if (!reachable.has(key)) { reachable.set(key, next); changed = true; }
  }
}

const observations = {
  partition_gaps:0, partition_overlaps:0, required_output_mismatches:0,
  case_mismatches:0, next_state_mismatches:0, public_output_mismatches:0,
  priority_violations:0, request_result_mismatches:0, local_fault_mismatches:0,
  aggregate_disjunction_mismatches:0, charge_propulsion_exclusion_violations:0,
  recovery_violations:0, stale_request_violations:0, ownership_violations:0,
  composition_oracle_mismatches:0, reachability_gaps:0
};
const confidence_partition_counts = Object.fromEntries(Array.from({length:4},(_,i)=>[`CASE-A-${String(i+1).padStart(2,"0")}`,0]));
const lifecycle_partition_counts = Object.fromEntries(Array.from({length:26},(_,i)=>[`CASE-L-${String(i+1).padStart(2,"0")}`,0]));
const case_witnesses = {};
let evaluation_count = 0;
for (const state of reachable.values()) for (const snapshot of allSnapshots) {
  evaluation_count++;
  const composed = compose(snapshot, state);
  const oracle = directOracle(snapshot, state);
  if (composed.lifecycle.hits === 0) observations.partition_gaps++;
  if (composed.lifecycle.hits > 1) observations.partition_overlaps++;
  if (composed.confidenceCase !== oracle.confidenceCase || composed.lifecycle.winningCase !== oracle.lifecycleCase) observations.case_mismatches++;
  if (JSON.stringify(composed.nextState) !== JSON.stringify(oracle.nextState)) observations.next_state_mismatches++;
  if (JSON.stringify(composed.publicTuple) !== JSON.stringify(oracle.publicTuple)) observations.public_output_mismatches++;
  if (JSON.stringify({case:composed.lifecycle.winningCase,next:composed.nextState,outputs:composed.publicTuple}) !== JSON.stringify({case:oracle.lifecycleCase,next:oracle.nextState,outputs:oracle.publicTuple})) observations.composition_oracle_mismatches++;
  if (composed.publicTuple.requestResult !== oracle.publicTuple.requestResult) observations.request_result_mismatches++;
  if (JSON.stringify(composed.faults) !== JSON.stringify(oracle.publicTuple.faults)) observations.local_fault_mismatches++;
  const f = composed.faults;
  if (f.aggregateFault !== (f.batteryFault||f.chargerFault||f.navigationFault||f.flightControlFault||f.homeFault||f.touchdownFault)) observations.aggregate_disjunction_mismatches++;
  if (composed.publicTuple.chargePermission === "PERMITTED" && composed.publicTuple.propulsionPermission === "ENABLED") observations.charge_propulsion_exclusion_violations++;
  if (!composed.lifecycle.winningCase || composed.lifecycle.winningCase !== oracle.lifecycleCase) observations.priority_violations++;
  confidence_partition_counts[composed.confidenceCase]++;
  lifecycle_partition_counts[composed.lifecycle.winningCase]++;
  if (!case_witnesses[composed.confidenceCase]) case_witnesses[composed.confidenceCase] = {prior_state:state,input:snapshot,next_state:composed.nextState};
  if (!case_witnesses[composed.lifecycle.winningCase]) case_witnesses[composed.lifecycle.winningCase] = {prior_state:state,input:snapshot,next_state:composed.nextState};
}

const baseInput = {request:"NONE",batteryBand:"MEDIUM",batteryValidity:"VALID",charger:"CONNECTED_HEALTHY",navigation:"USABLE",flightControl:"AVAILABLE",homeValue:"AWAY",homeValidity:"VALID",touchdownValue:"NOT_CONFIRMED",touchdownValidity:"VALID"};
const input = overrides => ({...baseInput,...overrides});
function traceSequence(id, title, initialState, specifications) {
  let state = {...initialState};
  const steps = [];
  let passed = true;
  for (const specification of specifications) {
    const snapshot = input(specification.input || {});
    const observed = compose(snapshot, state);
    const oracle = directOracle(snapshot, state);
    const expected = specification.expected;
    const ok = observed.lifecycle.winningCase === expected.case &&
      (!expected.phase || observed.nextState.phase === expected.phase) &&
      (!expected.confidence || observed.nextState.confidence === expected.confidence) &&
      (!expected.requestResult || observed.publicTuple.requestResult === expected.requestResult) &&
      (!expected.chargePermission || observed.publicTuple.chargePermission === expected.chargePermission) &&
      (!expected.aggregateFault && expected.aggregateFault !== false || observed.publicTuple.faults.aggregateFault === expected.aggregateFault) &&
      JSON.stringify({case:observed.lifecycle.winningCase,next:observed.nextState,outputs:observed.publicTuple}) === JSON.stringify({case:oracle.lifecycleCase,next:oracle.nextState,outputs:oracle.publicTuple});
    passed = passed && ok;
    steps.push({prior_state:state,input:snapshot,expected_branch:expected.case,observed:{case:observed.lifecycle.winningCase,next_state:observed.nextState,outputs:observed.publicTuple},passed:ok});
    state = observed.nextState;
  }
  return {id,title,passed,traces:[{initial_state:initialState,steps}]};
}

const scenarios = [];
scenarios.push(traceSequence("SCN-01","nominal startup and launch",{phase:"OFF",confidence:"UNTRUSTED"},[
  {input:{request:"NONE"},expected:{case:"CASE-L-12",phase:"OFF",confidence:"CONFIRMING",requestResult:"NONE"}},
  {input:{request:"SWITCH_ON"},expected:{case:"CASE-L-11",phase:"STANDBY",confidence:"TRUSTED",requestResult:"ACCEPTED"}},
  {input:{request:"ACTIVATE"},expected:{case:"CASE-L-15",phase:"READY",requestResult:"ACCEPTED"}},
  {input:{request:"LAUNCH"},expected:{case:"CASE-L-22",phase:"FLYING",requestResult:"ACCEPTED"}}
]));
scenarios.push(traceSequence("SCN-02","nominal charging lifecycle",{phase:"STANDBY",confidence:"TRUSTED"},[
  {input:{request:"START_CHARGE"},expected:{case:"CASE-L-14",phase:"CHARGING",chargePermission:"PERMITTED",requestResult:"ACCEPTED"}},
  {input:{request:"NONE"},expected:{case:"CASE-L-19",phase:"CHARGING",chargePermission:"PERMITTED"}},
  {input:{batteryBand:"FULL"},expected:{case:"CASE-L-18",phase:"STANDBY",chargePermission:"DENIED"}}
]));
scenarios.push(traceSequence("SCN-03","emergency priority over request",{phase:"FLYING",confidence:"TRUSTED"},[
  {input:{request:"RETURN",batteryValidity:"INVALID"},expected:{case:"CASE-L-01",phase:"LANDING",confidence:"UNTRUSTED",requestResult:"PREEMPTED"}}
]));
scenarios.push(traceSequence("SCN-04","low battery return arrival touchdown",{phase:"FLYING",confidence:"TRUSTED"},[
  {input:{batteryBand:"LOW"},expected:{case:"CASE-L-03",phase:"RETURNING"}},
  {input:{homeValue:"REACHED"},expected:{case:"CASE-L-06",phase:"LANDING"}},
  {input:{touchdownValue:"CONFIRMED"},expected:{case:"CASE-L-07",phase:"READY"}}
]));
scenarios.push(traceSequence("SCN-05","navigation escalation and non-reversal",{phase:"FLYING",confidence:"TRUSTED"},[
  {input:{navigation:"UNUSABLE"},expected:{case:"CASE-L-03",phase:"RETURNING",aggregateFault:true}},
  {input:{navigation:"UNUSABLE"},expected:{case:"CASE-L-02",phase:"LANDING",aggregateFault:true}},
  {input:{navigation:"USABLE"},expected:{case:"CASE-L-26",phase:"LANDING",aggregateFault:false}}
]));
scenarios.push(traceSequence("SCN-06","battery invalidity two-step recovery and fresh request",{phase:"STANDBY",confidence:"TRUSTED"},[
  {input:{request:"ACTIVATE",batteryValidity:"INVALID"},expected:{case:"CASE-L-09",phase:"STANDBY",confidence:"UNTRUSTED",requestResult:"REJECTED"}},
  {input:{request:"NONE"},expected:{case:"CASE-L-09",phase:"STANDBY",confidence:"CONFIRMING",requestResult:"NONE"}},
  {input:{request:"NONE"},expected:{case:"CASE-L-16",phase:"STANDBY",confidence:"TRUSTED",requestResult:"NONE"}},
  {input:{request:"ACTIVATE"},expected:{case:"CASE-L-15",phase:"READY",requestResult:"ACCEPTED"}}
]));
scenarios.push(traceSequence("SCN-07","charger fault propagation correction and fresh request",{phase:"STANDBY",confidence:"TRUSTED"},[
  {input:{request:"START_CHARGE",charger:"CONNECTED_FAULTED"},expected:{case:"CASE-L-16",phase:"STANDBY",requestResult:"REJECTED",aggregateFault:true}},
  {input:{charger:"CONNECTED_HEALTHY"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:false}},
  {input:{request:"START_CHARGE"},expected:{case:"CASE-L-14",phase:"CHARGING",requestResult:"ACCEPTED"}},
  {input:{charger:"CONNECTED_FAULTED"},expected:{case:"CASE-L-18",phase:"STANDBY",aggregateFault:true}},
  {input:{charger:"CONNECTED_HEALTHY"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:false}},
  {input:{request:"START_CHARGE"},expected:{case:"CASE-L-14",phase:"CHARGING",requestResult:"ACCEPTED"}}
]));
scenarios.push(traceSequence("SCN-08","home four-pair qualification",{phase:"RETURNING",confidence:"TRUSTED"},[
  {input:{homeValue:"AWAY",homeValidity:"INVALID"},expected:{case:"CASE-L-25",phase:"RETURNING",aggregateFault:true}},
  {input:{homeValue:"REACHED",homeValidity:"INVALID"},expected:{case:"CASE-L-25",phase:"RETURNING",aggregateFault:true}},
  {input:{homeValue:"AWAY",homeValidity:"VALID"},expected:{case:"CASE-L-25",phase:"RETURNING",aggregateFault:false}},
  {input:{homeValue:"REACHED",homeValidity:"VALID"},expected:{case:"CASE-L-06",phase:"LANDING",aggregateFault:false}}
]));
const scn09a = traceSequence("SCN-09","touchdown four-pair qualification and two destinations",{phase:"LANDING",confidence:"TRUSTED"},[
  {input:{touchdownValue:"NOT_CONFIRMED",touchdownValidity:"INVALID"},expected:{case:"CASE-L-26",phase:"LANDING",aggregateFault:true}},
  {input:{touchdownValue:"CONFIRMED",touchdownValidity:"INVALID"},expected:{case:"CASE-L-26",phase:"LANDING",aggregateFault:true}},
  {input:{touchdownValue:"NOT_CONFIRMED",touchdownValidity:"VALID"},expected:{case:"CASE-L-26",phase:"LANDING",aggregateFault:false}},
  {input:{touchdownValue:"CONFIRMED",touchdownValidity:"VALID"},expected:{case:"CASE-L-07",phase:"READY",aggregateFault:false}}
]);
const scn09b = traceSequence("SCN-09","touchdown standby destination",{phase:"LANDING",confidence:"TRUSTED"},[
  {input:{touchdownValue:"CONFIRMED",navigation:"UNUSABLE"},expected:{case:"CASE-L-08",phase:"STANDBY",aggregateFault:true}}
]);
scn09a.traces.push(...scn09b.traces); scn09a.passed = scn09a.passed && scn09b.passed; scenarios.push(scn09a);
scenarios.push(traceSequence("SCN-10","staggered concurrent fault recovery",{phase:"STANDBY",confidence:"TRUSTED"},[
  {input:{charger:"CONNECTED_FAULTED",navigation:"UNUSABLE",flightControl:"FAULTED",homeValidity:"INVALID"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:true}},
  {input:{navigation:"UNUSABLE",flightControl:"FAULTED",homeValidity:"INVALID"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:true}},
  {input:{flightControl:"FAULTED",homeValidity:"INVALID"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:true}},
  {input:{homeValidity:"INVALID"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:true}},
  {input:{homeValidity:"VALID"},expected:{case:"CASE-L-16",phase:"STANDBY",aggregateFault:false}}
]));
scenarios.push(traceSequence("SCN-11","composition and fresh launch request",{phase:"READY",confidence:"TRUSTED"},[
  {input:{request:"LAUNCH",navigation:"UNUSABLE"},expected:{case:"CASE-L-23",phase:"READY",requestResult:"REJECTED",aggregateFault:true}},
  {input:{request:"NONE",navigation:"USABLE"},expected:{case:"CASE-L-23",phase:"READY",requestResult:"NONE",aggregateFault:false}},
  {input:{request:"LAUNCH",navigation:"USABLE"},expected:{case:"CASE-L-22",phase:"FLYING",requestResult:"ACCEPTED",aggregateFault:false}}
]));

if (scenarios.some(s => !s.passed)) observations.required_output_mismatches += scenarios.filter(s => !s.passed).length;
if (!scenarios.find(s=>s.id==="SCN-06")?.passed || !scenarios.find(s=>s.id==="SCN-07")?.passed) observations.recovery_violations++;
if (!scenarios.find(s=>s.id==="SCN-06")?.passed || !scenarios.find(s=>s.id==="SCN-11")?.passed) observations.stale_request_violations++;

const expectedCases = [...Object.keys(confidence_partition_counts), ...Object.keys(lifecycle_partition_counts)];
const missing_case_witnesses = expectedCases.filter(id => !case_witnesses[id]);
if (missing_case_witnesses.length) observations.reachability_gaps += missing_case_witnesses.length;
const ownershipChecksPassed = allSnapshots.length === 15360 && semantic_connection_map.length === 35 &&
  new Set(Requests.map(r=>requestOwner(r).toLifecycle.requestFamily)).size === 5 &&
  ownership_audit_base.length === 13 && observations.composition_oracle_mismatches === 0;
if (!ownershipChecksPassed) observations.ownership_violations++;

const checks = {
  raw_domain_exact:allSnapshots.length === 15360,
  reachable_pairs_bounded:reachable.size <= 21,
  exhaustive_count_exact:evaluation_count === allSnapshots.length * reachable.size,
  confidence_partition_complete:Object.values(confidence_partition_counts).every(n=>n>0),
  lifecycle_partition_complete:Object.values(lifecycle_partition_counts).every(n=>n>0),
  all_case_witnesses_present:missing_case_witnesses.length === 0,
  all_scenarios_passed:scenarios.length === 11 && scenarios.every(s=>s.passed),
  semantic_connection_map_exact:semantic_connection_map.length === 35,
  owner_local_relations_executed:ownershipChecksPassed,
  observations_clear:Object.values(observations).every(n=>n===0)
};
const passed = Object.values(checks).every(Boolean);
const ownership_audit = ownership_audit_base.map(record => ({...record, passed}));

const result = {
  status:passed ? "passed" : "failed",
  passed,
  source_sha256:SOURCE_SHA256,
  claim_boundary:"Exhaustive only over the frozen 15,360-value logical snapshot domain and reachable finite phase/confidence pairs; this is not solver proof, code execution, physical validation, performance evidence, or safety certification.",
  domain:{raw_snapshot_count:allSnapshots.length, factors:{requests:10,battery_reports:8,charger_reports:3,navigation_reports:2,flight_control_reports:2,home_reports:4,touchdown_reports:4}},
  reachability:{initial_state:{phase:"OFF",confidence:"UNTRUSTED"},reachable_pair_count:reachable.size,reachable_pairs:[...reachable.values()].sort((a,b)=>stateKey(a).localeCompare(stateKey(b))),evaluation_count,upper_bound:322560},
  semantic_connection_map,
  partition_counts:{confidence:confidence_partition_counts,lifecycle:lifecycle_partition_counts},
  gaps:{partition:observations.partition_gaps,reachability:observations.reachability_gaps,missing_case_witnesses},
  overlaps:{partition:observations.partition_overlaps},
  required_output_mismatches:observations.required_output_mismatches,
  invariant_checks:{aggregate_fault_exact:observations.aggregate_disjunction_mismatches===0,charge_propulsion_exclusion:observations.charge_propulsion_exclusion_violations===0,fresh_request_recovery:observations.stale_request_violations===0,composition_oracle_equal:observations.composition_oracle_mismatches===0},
  observations,
  checks,
  ownership_audit,
  case_witnesses,
  scenario_families:scenarios
};

process.stdout.write(JSON.stringify(result));
