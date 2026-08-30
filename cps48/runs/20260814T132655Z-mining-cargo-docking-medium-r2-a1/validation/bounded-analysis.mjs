// Deterministic finite mirror of Docked_Service_Access_Lifecycle_Supervisor.sysml.
// This program deliberately performs no I/O other than its single JSON stdout write.

const SOURCE_SHA256 = "b377601587405036824883022a900cdd5dcf1834e441a70190b27ae0cdc4e308";

const PilotIntent = ["NONE", "FRESH_DOCK", "REPEATED_DOCK", "FRESH_UNDOCK", "REPEATED_UNDOCK", "FRESH_RESET", "REPEATED_RESET", "INVALID"];
const BerthObservation = ["APPROACH_CLEAR", "DOCKED_SECURE", "DEPARTURE_CLEAR", "RELEASED", "BLOCKED", "INVALID"];
const ShipCondition = ["APPROACH_READY", "SERVICE_READY", "DEPARTURE_READY", "TRANSIT", "NOT_READY", "INVALID"];
const ServiceSignal = ["QUIESCENT", "REQUEST", "ACTIVE", "COMPLETE", "FAULT", "INVALID"];
const QualifiedIntent = ["NO_ACTION", "DOCK_REQUEST", "UNDOCK_REQUEST", "RESET_REQUEST", "INTENT_FAULT"];
const DockReadiness = ["DOCK_READY", "SERVICE_READY", "UNDOCK_READY", "RELEASE_CONFIRMED", "TEMPORARILY_BLOCKED", "READINESS_CONFLICT", "READINESS_FAULT"];
const ServiceInterlock = ["QUIESCENT", "SINGLE_DEMAND", "SINGLE_ACTIVE", "SINGLE_COMPLETION", "SERVICE_CONFLICT", "SERVICE_FAULT"];
const LifecycleState = ["IDLE_OUTSIDE", "DOCK_CLEARANCE_LATCHED", "DOCKED_ACCESS_LOCKED", "SERVICE_ACCESS_GRANTED", "SERVICE_IN_PROGRESS", "UNDOCK_CLEARANCE_LATCHED", "RECOVERY_REQUIRED"];
const OperationalAssessment = ["OUTSIDE_STABLE", "DOCK_ELIGIBLE", "DOCK_WAITING", "DOCK_CONFIRMED", "DOCKED_QUIESCENT", "SERVICE_DEMAND_READY", "SERVICE_GRANT_PENDING", "SERVICE_OCCUPIED", "SERVICE_RELEASED", "SERVICE_WITHDRAWN", "UNDOCK_ELIGIBLE", "UNDOCK_WAITING", "RELEASE_CONFIRMED", "RECOVERY_CLEARABLE", "TEMPORARILY_BLOCKED", "ASSESSMENT_CONFLICT", "ASSESSMENT_FAULT"];
const AdmittedDirective = ["ENTER_RECOVERY_FAULT", "ENTER_RECOVERY_CONFLICT", "RESET_RECOVERY", "HOLD_RECOVERY", "FINISH_SERVICE_DEFER_UNDOCK", "FINISH_SERVICE", "DEFER_UNDOCK", "HOLD_ACTIVE_SERVICE", "START_SERVICE", "HOLD_SERVICE_GRANT", "WITHDRAW_SERVICE_GRANT", "CONFIRM_RELEASE", "HOLD_UNDOCK_CLEARANCE", "CONFIRM_DOCK", "HOLD_DOCK_CLEARANCE", "AUTHORIZE_UNDOCK", "GRANT_SERVICE_ACCESS", "AUTHORIZE_DOCK", "INHIBIT_ACTION", "HOLD_STABLE"];
const LifecycleResult = ["NONE", "DOCK_ACCEPTED", "DOCK_CONFIRMED", "SERVICE_GRANTED", "SERVICE_RUNNING", "SERVICE_FINISHED", "UNDOCK_DEFERRED", "UNDOCK_ACCEPTED", "RELEASED", "INHIBITED", "RECOVERY_LATCHED", "RESET_COMPLETE"];
const MovementProposal = ["HOLD_MOVEMENT", "AUTHORIZE_DOCK", "AUTHORIZE_UNDOCK"];
const AccessProposal = ["LOCK_ACCESS", "ENABLE_ACCESS"];
const MovementDirective = ["HOLD", "PERMIT_DOCK", "PERMIT_UNDOCK"];
const ServiceAccess = ["LOCKED", "ENABLED"];

const count = (map, key) => { map[key] = (map[key] ?? 0) + 1; };
const key = (...values) => values.join("|");

function qualifyIntent(intent) {
  if (intent === "INVALID") return "INTENT_FAULT";
  if (intent === "FRESH_DOCK") return "DOCK_REQUEST";
  if (intent === "FRESH_UNDOCK") return "UNDOCK_REQUEST";
  if (intent === "FRESH_RESET") return "RESET_REQUEST";
  return "NO_ACTION";
}

function qualifyReadiness(berth, ship) {
  if (berth === "INVALID" || ship === "INVALID") return "READINESS_FAULT";
  if (berth === "APPROACH_CLEAR" && ship === "APPROACH_READY") return "DOCK_READY";
  if (berth === "DOCKED_SECURE" && ship === "SERVICE_READY") return "SERVICE_READY";
  if (berth === "DEPARTURE_CLEAR" && ship === "DEPARTURE_READY") return "UNDOCK_READY";
  if (berth === "RELEASED" && ship === "TRANSIT") return "RELEASE_CONFIRMED";
  if (berth === "BLOCKED" || ship === "NOT_READY") return "TEMPORARILY_BLOCKED";
  return "READINESS_CONFLICT";
}

function qualifyInterlock(repair, resupply) {
  if ([repair, resupply].some(x => x === "FAULT" || x === "INVALID")) return "SERVICE_FAULT";
  if (repair === "QUIESCENT" && resupply === "QUIESCENT") return "QUIESCENT";
  const sole = signal => (repair === signal && resupply === "QUIESCENT") || (repair === "QUIESCENT" && resupply === signal);
  if (sole("REQUEST")) return "SINGLE_DEMAND";
  if (sole("ACTIVE")) return "SINGLE_ACTIVE";
  if (sole("COMPLETE")) return "SINGLE_COMPLETION";
  return "SERVICE_CONFLICT";
}

const compatibleAssessment = new Map([
  [key("IDLE_OUTSIDE", "RELEASE_CONFIRMED", "QUIESCENT"), "OUTSIDE_STABLE"],
  [key("IDLE_OUTSIDE", "DOCK_READY", "QUIESCENT"), "DOCK_ELIGIBLE"],
  [key("DOCK_CLEARANCE_LATCHED", "DOCK_READY", "QUIESCENT"), "DOCK_WAITING"],
  [key("DOCK_CLEARANCE_LATCHED", "SERVICE_READY", "QUIESCENT"), "DOCK_CONFIRMED"],
  [key("DOCKED_ACCESS_LOCKED", "SERVICE_READY", "QUIESCENT"), "DOCKED_QUIESCENT"],
  [key("DOCKED_ACCESS_LOCKED", "SERVICE_READY", "SINGLE_DEMAND"), "SERVICE_DEMAND_READY"],
  [key("DOCKED_ACCESS_LOCKED", "UNDOCK_READY", "QUIESCENT"), "UNDOCK_ELIGIBLE"],
  [key("SERVICE_ACCESS_GRANTED", "SERVICE_READY", "SINGLE_DEMAND"), "SERVICE_GRANT_PENDING"],
  [key("SERVICE_ACCESS_GRANTED", "SERVICE_READY", "SINGLE_ACTIVE"), "SERVICE_OCCUPIED"],
  [key("SERVICE_ACCESS_GRANTED", "SERVICE_READY", "QUIESCENT"), "SERVICE_WITHDRAWN"],
  [key("SERVICE_ACCESS_GRANTED", "SERVICE_READY", "SINGLE_COMPLETION"), "SERVICE_WITHDRAWN"],
  [key("SERVICE_IN_PROGRESS", "SERVICE_READY", "SINGLE_ACTIVE"), "SERVICE_OCCUPIED"],
  [key("SERVICE_IN_PROGRESS", "SERVICE_READY", "SINGLE_COMPLETION"), "SERVICE_RELEASED"],
  [key("UNDOCK_CLEARANCE_LATCHED", "UNDOCK_READY", "QUIESCENT"), "UNDOCK_WAITING"],
  [key("UNDOCK_CLEARANCE_LATCHED", "RELEASE_CONFIRMED", "QUIESCENT"), "RELEASE_CONFIRMED"],
  [key("RECOVERY_REQUIRED", "RELEASE_CONFIRMED", "QUIESCENT"), "RECOVERY_CLEARABLE"]
]);

function assess(state, readiness, interlock) {
  if (readiness === "READINESS_FAULT" || interlock === "SERVICE_FAULT") return "ASSESSMENT_FAULT";
  if (readiness === "READINESS_CONFLICT" || interlock === "SERVICE_CONFLICT") return "ASSESSMENT_CONFLICT";
  if (readiness === "TEMPORARILY_BLOCKED") return "TEMPORARILY_BLOCKED";
  return compatibleAssessment.get(key(state, readiness, interlock)) ?? "ASSESSMENT_CONFLICT";
}

function arbiterGuards(intent, state, assessment) {
  const safePrefix = intent !== "INTENT_FAULT" && assessment !== "ASSESSMENT_FAULT" && assessment !== "ASSESSMENT_CONFLICT";
  return [
    intent === "INTENT_FAULT" || assessment === "ASSESSMENT_FAULT",
    intent !== "INTENT_FAULT" && assessment !== "ASSESSMENT_FAULT" && assessment === "ASSESSMENT_CONFLICT",
    safePrefix && state === "RECOVERY_REQUIRED" && intent === "RESET_REQUEST" && assessment === "RECOVERY_CLEARABLE",
    safePrefix && state === "RECOVERY_REQUIRED" && !(intent === "RESET_REQUEST" && assessment === "RECOVERY_CLEARABLE"),
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_IN_PROGRESS" && assessment === "SERVICE_RELEASED" && intent === "UNDOCK_REQUEST",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_IN_PROGRESS" && assessment === "SERVICE_RELEASED" && intent !== "UNDOCK_REQUEST",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_IN_PROGRESS" && assessment === "SERVICE_OCCUPIED" && intent === "UNDOCK_REQUEST",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_IN_PROGRESS" && assessment !== "SERVICE_RELEASED" && intent === "NO_ACTION",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_OCCUPIED",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_GRANT_PENDING" && intent === "NO_ACTION",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_WITHDRAWN",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "UNDOCK_CLEARANCE_LATCHED" && assessment === "RELEASE_CONFIRMED",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "UNDOCK_CLEARANCE_LATCHED" && assessment !== "RELEASE_CONFIRMED" && intent === "NO_ACTION",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "DOCK_CLEARANCE_LATCHED" && assessment === "DOCK_CONFIRMED",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "DOCK_CLEARANCE_LATCHED" && assessment !== "DOCK_CONFIRMED" && intent === "NO_ACTION",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "DOCKED_ACCESS_LOCKED" && intent === "UNDOCK_REQUEST" && assessment === "UNDOCK_ELIGIBLE",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "DOCKED_ACCESS_LOCKED" && assessment === "SERVICE_DEMAND_READY",
    safePrefix && state !== "RECOVERY_REQUIRED" && state === "IDLE_OUTSIDE" && intent === "DOCK_REQUEST" && assessment === "DOCK_ELIGIBLE",
    safePrefix && state !== "RECOVERY_REQUIRED" && ["DOCK_REQUEST", "UNDOCK_REQUEST", "RESET_REQUEST"].includes(intent) &&
      !(state === "SERVICE_IN_PROGRESS" && assessment === "SERVICE_RELEASED") &&
      !(state === "SERVICE_IN_PROGRESS" && assessment === "SERVICE_OCCUPIED" && intent === "UNDOCK_REQUEST") &&
      !(state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_OCCUPIED") &&
      !(state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_WITHDRAWN") &&
      !(state === "UNDOCK_CLEARANCE_LATCHED" && assessment === "RELEASE_CONFIRMED") &&
      !(state === "DOCK_CLEARANCE_LATCHED" && assessment === "DOCK_CONFIRMED") &&
      !(state === "DOCKED_ACCESS_LOCKED" && intent === "UNDOCK_REQUEST" && assessment === "UNDOCK_ELIGIBLE") &&
      !(state === "DOCKED_ACCESS_LOCKED" && assessment === "SERVICE_DEMAND_READY") &&
      !(state === "IDLE_OUTSIDE" && intent === "DOCK_REQUEST" && assessment === "DOCK_ELIGIBLE"),
    intent === "NO_ACTION" && assessment !== "ASSESSMENT_FAULT" && assessment !== "ASSESSMENT_CONFLICT" && state !== "RECOVERY_REQUIRED" &&
      state !== "SERVICE_IN_PROGRESS" &&
      !(state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_OCCUPIED") &&
      !(state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_GRANT_PENDING") &&
      !(state === "SERVICE_ACCESS_GRANTED" && assessment === "SERVICE_WITHDRAWN") &&
      !(state === "UNDOCK_CLEARANCE_LATCHED" && assessment === "RELEASE_CONFIRMED") &&
      state !== "UNDOCK_CLEARANCE_LATCHED" &&
      !(state === "DOCK_CLEARANCE_LATCHED" && assessment === "DOCK_CONFIRMED") &&
      state !== "DOCK_CLEARANCE_LATCHED" &&
      !(state === "DOCKED_ACCESS_LOCKED" && assessment === "SERVICE_DEMAND_READY")
  ];
}

function arbitrate(intent, state, assessment) {
  const hits = arbiterGuards(intent, state, assessment).flatMap((applies, i) => applies ? [i] : []);
  return { case_id: hits.length === 0 ? null : `CASE-${String(hits[0] + 1).padStart(2, "0")}`, directive: hits.length === 0 ? null : AdmittedDirective[hits[0]], guard_hits: hits.length };
}

function proposalFor(nextState) {
  if (nextState === "DOCK_CLEARANCE_LATCHED") return { movement: "AUTHORIZE_DOCK", access: "LOCK_ACCESS" };
  if (nextState === "UNDOCK_CLEARANCE_LATCHED") return { movement: "AUTHORIZE_UNDOCK", access: "LOCK_ACCESS" };
  if (nextState === "SERVICE_ACCESS_GRANTED" || nextState === "SERVICE_IN_PROGRESS") return { movement: "HOLD_MOVEMENT", access: "ENABLE_ACCESS" };
  return { movement: "HOLD_MOVEMENT", access: "LOCK_ACCESS" };
}

function control(preState, directive) {
  const fixed = {
    ENTER_RECOVERY_FAULT: ["RECOVERY_REQUIRED", "RECOVERY_LATCHED"],
    ENTER_RECOVERY_CONFLICT: ["RECOVERY_REQUIRED", "RECOVERY_LATCHED"],
    RESET_RECOVERY: ["IDLE_OUTSIDE", "RESET_COMPLETE"],
    HOLD_RECOVERY: ["RECOVERY_REQUIRED", "RECOVERY_LATCHED"],
    FINISH_SERVICE_DEFER_UNDOCK: ["DOCKED_ACCESS_LOCKED", "UNDOCK_DEFERRED"],
    FINISH_SERVICE: ["DOCKED_ACCESS_LOCKED", "SERVICE_FINISHED"],
    DEFER_UNDOCK: ["SERVICE_IN_PROGRESS", "UNDOCK_DEFERRED"],
    HOLD_ACTIVE_SERVICE: ["SERVICE_IN_PROGRESS", "NONE"],
    START_SERVICE: ["SERVICE_IN_PROGRESS", "SERVICE_RUNNING"],
    HOLD_SERVICE_GRANT: ["SERVICE_ACCESS_GRANTED", "SERVICE_GRANTED"],
    WITHDRAW_SERVICE_GRANT: ["DOCKED_ACCESS_LOCKED", "INHIBITED"],
    CONFIRM_RELEASE: ["IDLE_OUTSIDE", "RELEASED"],
    HOLD_UNDOCK_CLEARANCE: ["UNDOCK_CLEARANCE_LATCHED", "NONE"],
    CONFIRM_DOCK: ["DOCKED_ACCESS_LOCKED", "DOCK_CONFIRMED"],
    HOLD_DOCK_CLEARANCE: ["DOCK_CLEARANCE_LATCHED", "NONE"],
    AUTHORIZE_UNDOCK: ["UNDOCK_CLEARANCE_LATCHED", "UNDOCK_ACCEPTED"],
    GRANT_SERVICE_ACCESS: ["SERVICE_ACCESS_GRANTED", "SERVICE_GRANTED"],
    AUTHORIZE_DOCK: ["DOCK_CLEARANCE_LATCHED", "DOCK_ACCEPTED"]
  };
  const [nextState, result] = fixed[directive] ?? [preState, directive === "INHIBIT_ACTION" ? "INHIBITED" : "NONE"];
  return { next_state: nextState, result, proposal: proposalFor(nextState) };
}

function gate(proposal, readiness, interlock) {
  const movement = proposal.movement === "AUTHORIZE_DOCK" && readiness === "DOCK_READY" && interlock === "QUIESCENT" ? "PERMIT_DOCK" :
    proposal.movement === "AUTHORIZE_UNDOCK" && readiness === "UNDOCK_READY" && interlock === "QUIESCENT" ? "PERMIT_UNDOCK" : "HOLD";
  const access = proposal.access === "ENABLE_ACCESS" && readiness === "SERVICE_READY" && ["SINGLE_DEMAND", "SINGLE_ACTIVE"].includes(interlock) ? "ENABLED" : "LOCKED";
  return { movement, access };
}

function report(snapshot, gated) {
  const result = snapshot.result;
  const state = snapshot.next_state;
  if (result === "RECOVERY_LATCHED") return { pilot: "RECOVERY_REQUIRED", station: "RECOVERY_REQUIRED" };
  if (result === "RESET_COMPLETE") return { pilot: "RESET_COMPLETE", station: "NO_ACCESS" };
  if (result === "RELEASED") return { pilot: "RELEASE_CONFIRMED", station: "NO_ACCESS" };
  if (result === "DOCK_ACCEPTED") return gated.movement === "PERMIT_DOCK" ? { pilot: "DOCK_PERMITTED", station: "DOCK_EXPECTED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (result === "DOCK_CONFIRMED") return { pilot: "DOCKED_READY", station: "ACCESS_AVAILABLE" };
  if (result === "SERVICE_GRANTED") return gated.access === "ENABLED" ? { pilot: "SERVICE_GRANTED", station: "ACCESS_RESERVED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (result === "SERVICE_RUNNING") return gated.access === "ENABLED" ? { pilot: "SERVICE_ACTIVE", station: "ACCESS_OCCUPIED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (result === "SERVICE_FINISHED") return { pilot: "SERVICE_FINISHED", station: "ACCESS_AVAILABLE" };
  if (result === "UNDOCK_DEFERRED") return { pilot: "UNDOCK_DEFERRED", station: gated.access === "ENABLED" ? "ACCESS_OCCUPIED" : state === "DOCKED_ACCESS_LOCKED" ? "ACCESS_AVAILABLE" : "ACCESS_INHIBITED" };
  if (result === "UNDOCK_ACCEPTED") return gated.movement === "PERMIT_UNDOCK" ? { pilot: "UNDOCK_PERMITTED", station: "DEPARTURE_EXPECTED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (result === "INHIBITED") {
    if (gated.access === "ENABLED" && state === "SERVICE_ACCESS_GRANTED") return { pilot: "INHIBITED", station: "ACCESS_RESERVED" };
    if (gated.access === "ENABLED" && state === "SERVICE_IN_PROGRESS") return { pilot: "INHIBITED", station: "ACCESS_OCCUPIED" };
    if (gated.movement === "PERMIT_DOCK") return { pilot: "INHIBITED", station: "DOCK_EXPECTED" };
    if (gated.movement === "PERMIT_UNDOCK") return { pilot: "INHIBITED", station: "DEPARTURE_EXPECTED" };
    return { pilot: "INHIBITED", station: state === "DOCKED_ACCESS_LOCKED" ? "ACCESS_AVAILABLE" : "ACCESS_INHIBITED" };
  }
  if (state === "IDLE_OUTSIDE") return { pilot: "OUTSIDE_IDLE", station: "NO_ACCESS" };
  if (state === "DOCK_CLEARANCE_LATCHED") return gated.movement === "PERMIT_DOCK" ? { pilot: "DOCK_PERMITTED", station: "DOCK_EXPECTED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (state === "DOCKED_ACCESS_LOCKED") return { pilot: "DOCKED_READY", station: "ACCESS_AVAILABLE" };
  if (state === "SERVICE_ACCESS_GRANTED") return gated.access === "ENABLED" ? { pilot: "SERVICE_GRANTED", station: "ACCESS_RESERVED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (state === "SERVICE_IN_PROGRESS") return gated.access === "ENABLED" ? { pilot: "SERVICE_ACTIVE", station: "ACCESS_OCCUPIED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  if (state === "UNDOCK_CLEARANCE_LATCHED") return gated.movement === "PERMIT_UNDOCK" ? { pilot: "UNDOCK_PERMITTED", station: "DEPARTURE_EXPECTED" } : { pilot: "INHIBITED", station: "ACCESS_INHIBITED" };
  return { pilot: "RECOVERY_REQUIRED", station: "RECOVERY_REQUIRED" };
}

function evaluate(preState, input) {
  const qualifiedIntent = qualifyIntent(input.pilot_intent);
  const dockReadiness = qualifyReadiness(input.berth_observation, input.ship_condition);
  const serviceInterlock = qualifyInterlock(input.repair_signal, input.resupply_signal);
  const operationalAssessment = assess(preState, dockReadiness, serviceInterlock);
  const admitted = arbitrate(qualifiedIntent, preState, operationalAssessment);
  const lifecycle = control(preState, admitted.directive);
  const gatedControl = gate(lifecycle.proposal, dockReadiness, serviceInterlock);
  const reports = report({ next_state: lifecycle.next_state, result: lifecycle.result }, gatedControl);
  return { qualified_intent: qualifiedIntent, dock_readiness: dockReadiness, service_interlock: serviceInterlock, operational_assessment: operationalAssessment, case_id: admitted.case_id, guard_hits: admitted.guard_hits, admitted_directive: admitted.directive, next_state: lifecycle.next_state, lifecycle_result: lifecycle.result, control_proposal: lifecycle.proposal, gated_control: gatedControl, movement_directive: gatedControl.movement, service_access: gatedControl.access, pilot_report: reports.pilot, station_report: reports.station };
}

const semanticConnectionMap = [
  ["INT-01", "Pilot.pilotIntent", "IntentQualifier.pilotIntent", "PilotIntent"],
  ["INT-02", "StationBerthInterface.berthObservation", "DockReadinessQualifier.berthObservation", "BerthObservation"],
  ["INT-03", "FrigateStatusInterface.shipCondition", "DockReadinessQualifier.shipCondition", "ShipCondition"],
  ["INT-04", "RepairService.repairSignal", "ServiceInterlockQualifier.repairSignal", "ServiceSignal"],
  ["INT-05", "ResupplyService.resupplySignal", "ServiceInterlockQualifier.resupplySignal", "ServiceSignal"],
  ["INT-06", "IntentQualifier.qualifiedIntent", "PriorityArbiter.qualifiedIntent", "QualifiedIntent"],
  ["INT-07", "DockReadinessQualifier.monitorReadiness", "LifecycleConsistencyMonitor.dockReadiness", "DockReadiness"],
  ["INT-08", "ServiceInterlockQualifier.monitorInterlock", "LifecycleConsistencyMonitor.serviceInterlock", "ServiceInterlock"],
  ["INT-09", "LifecycleController.monitorPrestate", "LifecycleConsistencyMonitor.lifecyclePrestate", "LifecycleState"],
  ["INT-10", "LifecycleConsistencyMonitor.operationalAssessment", "PriorityArbiter.operationalAssessment", "OperationalAssessment"],
  ["INT-11", "LifecycleController.arbiterPrestate", "PriorityArbiter.lifecyclePrestate", "LifecycleState"],
  ["INT-12", "PriorityArbiter.admittedDirective", "LifecycleController.admittedDirective", "AdmittedDirective"],
  ["INT-13", "LifecycleController.controlProposal", "MovementAndAccessSafetyGate.controlProposal", "ControlProposal"],
  ["INT-14", "DockReadinessQualifier.gateReadiness", "MovementAndAccessSafetyGate.dockReadiness", "DockReadiness"],
  ["INT-15", "ServiceInterlockQualifier.gateInterlock", "MovementAndAccessSafetyGate.serviceInterlock", "ServiceInterlock"],
  ["INT-16", "LifecycleController.lifecycleSnapshot", "LifecycleReporter.lifecycleSnapshot", "LifecycleSnapshot"],
  ["INT-17", "MovementAndAccessSafetyGate.gatedControl", "LifecycleReporter.gatedControl", "GatedControl"],
  ["INT-18", "MovementAndAccessSafetyGate.movementDirective", "DockingControlInterface.movementDirective", "MovementDirective"],
  ["INT-19", "MovementAndAccessSafetyGate.serviceAccess", "DockingControlInterface.serviceAccess", "ServiceAccess"],
  ["INT-20", "LifecycleReporter.pilotReport", "Pilot.pilotReport", "PilotLifecycleReport"],
  ["INT-21", "LifecycleReporter.stationReport", "StationBerthInterface.stationReport", "StationAccessReport"]
].map(([id, source, destination, type]) => ({ id, source, destination, type }));

const ownershipBase = [
  { usage: "intentQualifier", claimed_roles: ["applicability"], assigned_inputs: ["intentQualifier.pilotIntent"], owner_local_facts: ["qualifiedIntentFreshnessAndValidityClass"], contract_cases: ["INTENT_INVALID", "INTENT_FRESH_DOCK", "INTENT_FRESH_UNDOCK", "INTENT_FRESH_RESET", "INTENT_NO_ACTION"], analyzer_checks: ["intent-owner-8-inputs"] },
  { usage: "dockReadinessQualifier", claimed_roles: ["applicability"], assigned_inputs: ["dockReadinessQualifier.berthObservation", "dockReadinessQualifier.shipCondition"], owner_local_facts: ["jointDockReadinessCompatibilityClass"], contract_cases: ["READINESS_INVALID", "READINESS_DOCK", "READINESS_SERVICE", "READINESS_UNDOCK", "READINESS_RELEASED", "READINESS_BLOCKED", "READINESS_CONTRADICTION"], analyzer_checks: ["readiness-owner-36-pairs"] },
  { usage: "serviceInterlockQualifier", claimed_roles: ["applicability"], assigned_inputs: ["serviceInterlockQualifier.repairSignal", "serviceInterlockQualifier.resupplySignal"], owner_local_facts: ["mutuallyExclusiveServiceOccupancyClass"], contract_cases: ["INTERLOCK_FAULT", "INTERLOCK_QUIESCENT", "INTERLOCK_SINGLE_DEMAND", "INTERLOCK_SINGLE_ACTIVE", "INTERLOCK_SINGLE_COMPLETION", "INTERLOCK_CONFLICT"], analyzer_checks: ["interlock-owner-36-pairs"] },
  { usage: "lifecycleConsistencyMonitor", claimed_roles: ["applicability"], assigned_inputs: ["lifecycleConsistencyMonitor.lifecyclePrestate", "lifecycleConsistencyMonitor.dockReadiness", "lifecycleConsistencyMonitor.serviceInterlock"], owner_local_facts: ["lifecycleRelativeOperationalAssessment"], contract_cases: ["ASSESSMENT_TOTAL_RELATION"], analyzer_checks: ["assessment-owner-294-triples"] },
  { usage: "priorityArbiter", claimed_roles: ["decision"], assigned_inputs: ["priorityArbiter.qualifiedIntent", "priorityArbiter.lifecyclePrestate", "priorityArbiter.operationalAssessment"], owner_local_facts: ["firstApplicableOrderedCase", "admittedDirective"], contract_cases: Array.from({ length: 20 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`), analyzer_checks: ["arbiter-owner-595-exclusive-valuations"] },
  { usage: "lifecycleController", claimed_roles: ["proposal"], assigned_inputs: ["lifecycleController.admittedDirective", "lifecycleController.In(lifecycleMemory)"], owner_local_facts: ["nextLifecycleState", "lifecycleResult", "stateConsistentControlProposal"], contract_cases: ["SNAPSHOT_AND_PROPOSAL_COHERENCE", ...Array.from({ length: 20 }, (_, i) => `APPLY_CASE_${String(i + 1).padStart(2, "0")}`)], analyzer_checks: ["controller-owner-140-transitions"] },
  { usage: "movementAndAccessSafetyGate", claimed_roles: ["decision"], assigned_inputs: ["movementAndAccessSafetyGate.controlProposal", "movementAndAccessSafetyGate.dockReadiness", "movementAndAccessSafetyGate.serviceInterlock"], owner_local_facts: ["currentConditionMovementGate", "currentConditionAccessGate", "mutuallyExclusiveGatedControl"], contract_cases: ["MOVEMENT_GATE", "ACCESS_GATE", "GATED_CONTROL_COHERENCE"], analyzer_checks: ["gate-owner-252-combinations"] },
  { usage: "lifecycleReporter", claimed_roles: ["decision"], assigned_inputs: ["lifecycleReporter.lifecycleSnapshot", "lifecycleReporter.gatedControl"], owner_local_facts: ["pilotLifecycleInterpretation", "stationAccessInterpretation", "suppressedPermissionVisibility"], contract_cases: ["LOCAL-09", "LOCAL-10"], analyzer_checks: ["reporter-owner-504-combinations"] }
];

const ownerChecks = {};
const ownerFibers = {};

const intentFibers = {};
for (const intent of PilotIntent) count(intentFibers, qualifyIntent(intent));
ownerFibers.intentQualifier = intentFibers;
ownerChecks["intent-owner-8-inputs"] = Object.values(intentFibers).reduce((a, b) => a + b, 0) === 8 && intentFibers.NO_ACTION === 4;

const readinessFibers = {};
for (const berth of BerthObservation) for (const ship of ShipCondition) count(readinessFibers, qualifyReadiness(berth, ship));
ownerFibers.dockReadinessQualifier = readinessFibers;
ownerChecks["readiness-owner-36-pairs"] = JSON.stringify(readinessFibers) === JSON.stringify({ DOCK_READY: 1, READINESS_CONFLICT: 12, TEMPORARILY_BLOCKED: 9, READINESS_FAULT: 11, SERVICE_READY: 1, UNDOCK_READY: 1, RELEASE_CONFIRMED: 1 });

const interlockFibers = {};
for (const repair of ServiceSignal) for (const resupply of ServiceSignal) count(interlockFibers, qualifyInterlock(repair, resupply));
ownerFibers.serviceInterlockQualifier = interlockFibers;
ownerChecks["interlock-owner-36-pairs"] = Object.values(interlockFibers).reduce((a, b) => a + b, 0) === 36 && interlockFibers.SERVICE_FAULT === 20 && interlockFibers.SERVICE_CONFLICT === 9 && interlockFibers.QUIESCENT === 1 && interlockFibers.SINGLE_DEMAND === 2 && interlockFibers.SINGLE_ACTIVE === 2 && interlockFibers.SINGLE_COMPLETION === 2;

const assessmentFibers = {};
for (const state of LifecycleState) for (const readiness of DockReadiness) for (const interlock of ServiceInterlock) count(assessmentFibers, assess(state, readiness, interlock));
ownerFibers.lifecycleConsistencyMonitor = assessmentFibers;
ownerChecks["assessment-owner-294-triples"] = Object.values(assessmentFibers).reduce((a, b) => a + b, 0) === 294 && assessmentFibers.ASSESSMENT_FAULT === 84 && assessmentFibers.ASSESSMENT_CONFLICT === 166 && assessmentFibers.TEMPORARILY_BLOCKED === 28;

const arbiterDirectCounts = Array(20).fill(0);
let arbiterDirectGaps = 0;
let arbiterDirectOverlaps = 0;
for (const intent of QualifiedIntent) for (const state of LifecycleState) for (const assessment of OperationalAssessment) {
  const hits = arbiterGuards(intent, state, assessment).flatMap((applies, i) => applies ? [i] : []);
  if (hits.length === 0) arbiterDirectGaps++;
  if (hits.length > 1) arbiterDirectOverlaps++;
  if (hits.length === 1) arbiterDirectCounts[hits[0]]++;
}
ownerFibers.priorityArbiter = Object.fromEntries(arbiterDirectCounts.map((n, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, n]));
ownerChecks["arbiter-owner-595-exclusive-valuations"] = arbiterDirectGaps === 0 && arbiterDirectOverlaps === 0 && arbiterDirectCounts.every(n => n > 0);

let controllerCombinations = 0;
let controllerMismatches = 0;
for (const state of LifecycleState) for (const directive of AdmittedDirective) {
  controllerCombinations++;
  const next = control(state, directive);
  if (!LifecycleState.includes(next.next_state) || !LifecycleResult.includes(next.result) || !MovementProposal.includes(next.proposal.movement) || !AccessProposal.includes(next.proposal.access) || JSON.stringify(next.proposal) !== JSON.stringify(proposalFor(next.next_state))) controllerMismatches++;
}
ownerChecks["controller-owner-140-transitions"] = controllerCombinations === 140 && controllerMismatches === 0;

let gateCombinations = 0;
let gateInvariantFailures = 0;
for (const movement of MovementProposal) for (const access of AccessProposal) for (const readiness of DockReadiness) for (const interlock of ServiceInterlock) {
  gateCombinations++;
  const actual = gate({ movement, access }, readiness, interlock);
  if (actual.movement !== "HOLD" && actual.access === "ENABLED") gateInvariantFailures++;
}
ownerChecks["gate-owner-252-combinations"] = gateCombinations === 252 && gateInvariantFailures === 0;

let reporterCombinations = 0;
let reporterMismatches = 0;
for (const next_state of LifecycleState) for (const result of LifecycleResult) for (const movement of MovementDirective) for (const access of ServiceAccess) {
  reporterCombinations++;
  const actual = report({ next_state, result }, { movement, access });
  if (!actual.pilot || !actual.station) reporterMismatches++;
}
ownerChecks["reporter-owner-504-combinations"] = reporterCombinations === 504 && reporterMismatches === 0;

const partitionCounts = Array(20).fill(0);
const caseWitnesses = {};
let snapshots = 0;
let partitionGaps = 0;
let partitionOverlaps = 0;
let requiredOutputMismatches = 0;
let semanticConnectionMismatches = 0;
let movementAccessInvariantFailures = 0;
let recoveryInvariantFailures = 0;
let resetSeparationFailures = 0;
let priorityConflictFailures = 0;

for (const pilot_intent of PilotIntent) for (const berth_observation of BerthObservation) for (const ship_condition of ShipCondition) for (const repair_signal of ServiceSignal) for (const resupply_signal of ServiceSignal) for (const preState of LifecycleState) {
  snapshots++;
  const input = { pilot_intent, berth_observation, ship_condition, repair_signal, resupply_signal };
  const result = evaluate(preState, input);
  if (result.guard_hits === 0) partitionGaps++;
  if (result.guard_hits > 1) partitionOverlaps++;
  if (result.case_id) {
    const index = Number(result.case_id.slice(5)) - 1;
    partitionCounts[index]++;
    caseWitnesses[result.case_id] ??= { pre_state: preState, input, owner_values: { qualified_intent: result.qualified_intent, dock_readiness: result.dock_readiness, service_interlock: result.service_interlock, operational_assessment: result.operational_assessment }, admitted_directive: result.admitted_directive, next_state: result.next_state, outputs: { movement_directive: result.movement_directive, service_access: result.service_access, pilot_report: result.pilot_report, station_report: result.station_report } };
  }
  const expectedMovement = result.control_proposal.movement === "AUTHORIZE_DOCK" && result.dock_readiness === "DOCK_READY" && result.service_interlock === "QUIESCENT" ? "PERMIT_DOCK" : result.control_proposal.movement === "AUTHORIZE_UNDOCK" && result.dock_readiness === "UNDOCK_READY" && result.service_interlock === "QUIESCENT" ? "PERMIT_UNDOCK" : "HOLD";
  const expectedAccess = result.control_proposal.access === "ENABLE_ACCESS" && result.dock_readiness === "SERVICE_READY" && ["SINGLE_DEMAND", "SINGLE_ACTIVE"].includes(result.service_interlock) ? "ENABLED" : "LOCKED";
  if (result.movement_directive !== expectedMovement || result.service_access !== expectedAccess) requiredOutputMismatches++;
  if (result.movement_directive !== "HOLD" && result.service_access === "ENABLED") movementAccessInvariantFailures++;
  if (result.next_state === "RECOVERY_REQUIRED" && (result.movement_directive !== "HOLD" || result.service_access !== "LOCKED" || result.pilot_report !== "RECOVERY_REQUIRED")) recoveryInvariantFailures++;
  if (result.case_id === "CASE-03" && (result.next_state !== "IDLE_OUTSIDE" || result.movement_directive !== "HOLD" || result.service_access !== "LOCKED" || result.lifecycle_result !== "RESET_COMPLETE")) resetSeparationFailures++;
  if (["CASE-05", "CASE-07"].includes(result.case_id) && (result.movement_directive !== "HOLD" || result.pilot_report !== "UNDOCK_DEFERRED")) priorityConflictFailures++;
  if (result.qualified_intent !== qualifyIntent(pilot_intent) || result.dock_readiness !== qualifyReadiness(berth_observation, ship_condition) || result.service_interlock !== qualifyInterlock(repair_signal, resupply_signal) || result.operational_assessment !== assess(preState, result.dock_readiness, result.service_interlock)) semanticConnectionMismatches++;
}

function scenarioStep(preState, input, expected) {
  const observed = evaluate(preState, input);
  const expectedSubset = { case_id: expected.case_id, next_state: expected.next_state, movement_directive: expected.movement_directive, service_access: expected.service_access, pilot_report: expected.pilot_report, station_report: expected.station_report };
  const observedSubset = { case_id: observed.case_id, next_state: observed.next_state, movement_directive: observed.movement_directive, service_access: observed.service_access, pilot_report: observed.pilot_report, station_report: observed.station_report };
  return { pre_state: preState, input, expected: expectedSubset, observed: { ...observedSubset, owner_values: { qualified_intent: observed.qualified_intent, dock_readiness: observed.dock_readiness, service_interlock: observed.service_interlock, operational_assessment: observed.operational_assessment, admitted_directive: observed.admitted_directive, lifecycle_result: observed.lifecycle_result, control_proposal: observed.control_proposal, gated_control: observed.gated_control } }, passed: JSON.stringify(expectedSubset) === JSON.stringify(observedSubset) };
}

const I = (pilot_intent, berth_observation, ship_condition, repair_signal = "QUIESCENT", resupply_signal = "QUIESCENT") => ({ pilot_intent, berth_observation, ship_condition, repair_signal, resupply_signal });
const E = (case_id, next_state, movement_directive, service_access, pilot_report, station_report) => ({ case_id, next_state, movement_directive, service_access, pilot_report, station_report });

function buildTrace(traceId, initialState, specs) {
  let state = initialState;
  const steps = specs.map(([input, expected]) => {
    const step = scenarioStep(state, input, expected);
    state = step.observed.next_state;
    return step;
  });
  return { trace_id: traceId, initial_state: initialState, steps, passed: steps.every(step => step.passed) };
}

const scenarioTraces = [
  { scenario_id: "SCN-01", family: "nominal-dock-service-undock", traces: [buildTrace("SCN-01-NOMINAL", "IDLE_OUTSIDE", [
    [I("FRESH_DOCK", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-18", "DOCK_CLEARANCE_LATCHED", "PERMIT_DOCK", "LOCKED", "DOCK_PERMITTED", "DOCK_EXPECTED")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY"), E("CASE-14", "DOCKED_ACCESS_LOCKED", "HOLD", "LOCKED", "DOCKED_READY", "ACCESS_AVAILABLE")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY", "REQUEST"), E("CASE-17", "SERVICE_ACCESS_GRANTED", "HOLD", "ENABLED", "SERVICE_GRANTED", "ACCESS_RESERVED")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY", "ACTIVE"), E("CASE-09", "SERVICE_IN_PROGRESS", "HOLD", "ENABLED", "SERVICE_ACTIVE", "ACCESS_OCCUPIED")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY", "COMPLETE"), E("CASE-06", "DOCKED_ACCESS_LOCKED", "HOLD", "LOCKED", "SERVICE_FINISHED", "ACCESS_AVAILABLE")],
    [I("FRESH_UNDOCK", "DEPARTURE_CLEAR", "DEPARTURE_READY"), E("CASE-16", "UNDOCK_CLEARANCE_LATCHED", "PERMIT_UNDOCK", "LOCKED", "UNDOCK_PERMITTED", "DEPARTURE_EXPECTED")],
    [I("NONE", "RELEASED", "TRANSIT"), E("CASE-12", "IDLE_OUTSIDE", "HOLD", "LOCKED", "RELEASE_CONFIRMED", "NO_ACCESS")]
  ])] },
  { scenario_id: "SCN-02", family: "resupply-and-mutual-exclusion", traces: [buildTrace("SCN-02-RESUPPLY-CONFLICT", "DOCKED_ACCESS_LOCKED", [
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY", "QUIESCENT", "REQUEST"), E("CASE-17", "SERVICE_ACCESS_GRANTED", "HOLD", "ENABLED", "SERVICE_GRANTED", "ACCESS_RESERVED")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY", "REQUEST", "ACTIVE"), E("CASE-02", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")]
  ])] },
  { scenario_id: "SCN-03", family: "readiness-and-freshness-inhibition", traces: [buildTrace("SCN-03-FRESHNESS", "IDLE_OUTSIDE", [
    [I("FRESH_DOCK", "BLOCKED", "APPROACH_READY"), E("CASE-19", "IDLE_OUTSIDE", "HOLD", "LOCKED", "INHIBITED", "ACCESS_INHIBITED")],
    [I("REPEATED_DOCK", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-20", "IDLE_OUTSIDE", "HOLD", "LOCKED", "OUTSIDE_IDLE", "NO_ACCESS")],
    [I("FRESH_DOCK", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-18", "DOCK_CLEARANCE_LATCHED", "PERMIT_DOCK", "LOCKED", "DOCK_PERMITTED", "DOCK_EXPECTED")]
  ])] },
  { scenario_id: "SCN-04", family: "service-over-undock-priority", traces: [buildTrace("SCN-04-PRIORITY", "SERVICE_IN_PROGRESS", [
    [I("FRESH_UNDOCK", "DOCKED_SECURE", "SERVICE_READY", "ACTIVE"), E("CASE-07", "SERVICE_IN_PROGRESS", "HOLD", "ENABLED", "UNDOCK_DEFERRED", "ACCESS_OCCUPIED")],
    [I("FRESH_UNDOCK", "DOCKED_SECURE", "SERVICE_READY", "COMPLETE"), E("CASE-05", "DOCKED_ACCESS_LOCKED", "HOLD", "LOCKED", "UNDOCK_DEFERRED", "ACCESS_AVAILABLE")],
    [I("FRESH_UNDOCK", "DEPARTURE_CLEAR", "DEPARTURE_READY"), E("CASE-16", "UNDOCK_CLEARANCE_LATCHED", "PERMIT_UNDOCK", "LOCKED", "UNDOCK_PERMITTED", "DEPARTURE_EXPECTED")]
  ])] },
  { scenario_id: "SCN-05", family: "clearance-persistence-and-gating", traces: [buildTrace("SCN-05-GATE-WITHDRAW-RESTORE", "IDLE_OUTSIDE", [
    [I("FRESH_DOCK", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-18", "DOCK_CLEARANCE_LATCHED", "PERMIT_DOCK", "LOCKED", "DOCK_PERMITTED", "DOCK_EXPECTED")],
    [I("NONE", "BLOCKED", "NOT_READY"), E("CASE-15", "DOCK_CLEARANCE_LATCHED", "HOLD", "LOCKED", "INHIBITED", "ACCESS_INHIBITED")],
    [I("NONE", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-15", "DOCK_CLEARANCE_LATCHED", "PERMIT_DOCK", "LOCKED", "DOCK_PERMITTED", "DOCK_EXPECTED")],
    [I("NONE", "DOCKED_SECURE", "SERVICE_READY"), E("CASE-14", "DOCKED_ACCESS_LOCKED", "HOLD", "LOCKED", "DOCKED_READY", "ACCESS_AVAILABLE")],
    [I("FRESH_UNDOCK", "DEPARTURE_CLEAR", "DEPARTURE_READY"), E("CASE-16", "UNDOCK_CLEARANCE_LATCHED", "PERMIT_UNDOCK", "LOCKED", "UNDOCK_PERMITTED", "DEPARTURE_EXPECTED")],
    [I("NONE", "BLOCKED", "NOT_READY"), E("CASE-13", "UNDOCK_CLEARANCE_LATCHED", "HOLD", "LOCKED", "INHIBITED", "ACCESS_INHIBITED")],
    [I("NONE", "DEPARTURE_CLEAR", "DEPARTURE_READY"), E("CASE-13", "UNDOCK_CLEARANCE_LATCHED", "PERMIT_UNDOCK", "LOCKED", "UNDOCK_PERMITTED", "DEPARTURE_EXPECTED")]
  ])] },
  { scenario_id: "SCN-06", family: "contradiction-containment", traces: [
    buildTrace("SCN-06-INVALID-SHIP", "IDLE_OUTSIDE", [[I("NONE", "APPROACH_CLEAR", "INVALID"), E("CASE-01", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")]]),
    buildTrace("SCN-06-MISMATCHED-READINESS", "IDLE_OUTSIDE", [[I("NONE", "APPROACH_CLEAR", "SERVICE_READY"), E("CASE-02", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")]]),
    buildTrace("SCN-06-UNEXPECTED-SERVICE", "IDLE_OUTSIDE", [[I("NONE", "APPROACH_CLEAR", "APPROACH_READY", "ACTIVE"), E("CASE-02", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")]])
  ] },
  { scenario_id: "SCN-07", family: "recovery-reset-and-fresh-reentry", traces: [buildTrace("SCN-07-RECOVERY", "RECOVERY_REQUIRED", [
    [I("REPEATED_RESET", "RELEASED", "TRANSIT"), E("CASE-04", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")],
    [I("FRESH_RESET", "BLOCKED", "NOT_READY"), E("CASE-04", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")],
    [I("FRESH_RESET", "RELEASED", "TRANSIT", "REQUEST"), E("CASE-02", "RECOVERY_REQUIRED", "HOLD", "LOCKED", "RECOVERY_REQUIRED", "RECOVERY_REQUIRED")],
    [I("FRESH_RESET", "RELEASED", "TRANSIT"), E("CASE-03", "IDLE_OUTSIDE", "HOLD", "LOCKED", "RESET_COMPLETE", "NO_ACCESS")],
    [I("FRESH_DOCK", "APPROACH_CLEAR", "APPROACH_READY"), E("CASE-18", "DOCK_CLEARANCE_LATCHED", "PERMIT_DOCK", "LOCKED", "DOCK_PERMITTED", "DOCK_EXPECTED")]
  ])] }
].map(family => ({ ...family, passed: family.traces.every(trace => trace.passed) }));

const expectedPipelineCounts = [52976, 16359, 1, 447, 2, 12, 2, 260, 14, 8, 21, 7, 256, 7, 256, 1, 14, 1, 1160, 772];
const expectedDirectCounts = [147, 28, 1, 59, 1, 3, 1, 14, 4, 1, 4, 4, 14, 4, 14, 1, 4, 1, 249, 41];
const caseCountsMatch = JSON.stringify(partitionCounts) === JSON.stringify(expectedPipelineCounts);
const directCountsMatch = JSON.stringify(arbiterDirectCounts) === JSON.stringify(expectedDirectCounts);
const scenariosPassed = scenarioTraces.every(family => family.passed);
const allOwnerChecksPassed = Object.values(ownerChecks).every(Boolean);
const passed = snapshots === 72576 && semanticConnectionMap.length === 21 && partitionGaps === 0 && partitionOverlaps === 0 && requiredOutputMismatches === 0 && semanticConnectionMismatches === 0 && movementAccessInvariantFailures === 0 && recoveryInvariantFailures === 0 && resetSeparationFailures === 0 && priorityConflictFailures === 0 && caseCountsMatch && directCountsMatch && Object.keys(caseWitnesses).length === 20 && scenariosPassed && allOwnerChecksPassed;

const ownershipAudit = ownershipBase.map(record => ({ ...record, passed: passed && record.analyzer_checks.every(name => ownerChecks[name] === true) }));

const output = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive finite conformance over 72,576 declared root-input/pre-state snapshots and seven bounded scenario families only; not compositional proof, solver certification, generated-code correctness, execution, physical performance, external-report truth, safety certification, or unbounded temporal verification.",
  domain: { root_input_prestate_snapshots: snapshots, expected_snapshots: 72576, root_input_domain_sizes: { pilot_intent: 8, berth_observation: 6, ship_condition: 6, repair_signal: 6, resupply_signal: 6, lifecycle_prestate: 7 } },
  semantic_connection_map: semanticConnectionMap,
  partition_counts: Object.fromEntries(partitionCounts.map((n, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, n])),
  direct_owner_partition_counts: Object.fromEntries(arbiterDirectCounts.map((n, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, n])),
  canonical_guard_cross_check: { status: caseCountsMatch && directCountsMatch && arbiterDirectGaps === 0 && arbiterDirectOverlaps === 0 ? "passed" : "failed", clauses: Array.from({ length: 20 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`), expected_direct_owner_counts: expectedDirectCounts, observed_direct_owner_counts: arbiterDirectCounts, expected_composed_counts: expectedPipelineCounts, observed_composed_counts: partitionCounts },
  partition_gaps: partitionGaps,
  partition_overlaps: partitionOverlaps,
  required_output_mismatches: requiredOutputMismatches,
  mismatch_counts: { semantic_connection_mismatches: semanticConnectionMismatches, controller_mismatches: controllerMismatches, reporter_mismatches: reporterMismatches, pipeline_case_count_mismatches: caseCountsMatch ? 0 : 1, direct_case_count_mismatches: directCountsMatch ? 0 : 1, scenario_failures: scenarioTraces.filter(family => !family.passed).length },
  invariant_checks: { movement_and_access_mutually_exclusive: movementAccessInvariantFailures === 0 && gateInvariantFailures === 0, recovery_is_hold_locked_and_visible: recoveryInvariantFailures === 0, reset_is_separate_from_reentry: resetSeparationFailures === 0, service_completion_or_activity_precedes_fresh_undock: priorityConflictFailures === 0, all_twenty_cases_reachable: Object.keys(caseWitnesses).length === 20, all_owner_local_products_executed: allOwnerChecksPassed, all_scenarios_passed: scenariosPassed },
  owner_product_counts: { intent_inputs: 8, readiness_pairs: 36, interlock_pairs: 36, assessment_triples: 294, arbiter_valuations: 595, controller_transitions: controllerCombinations, gate_combinations: gateCombinations, reporter_combinations: reporterCombinations },
  owner_fibers: ownerFibers,
  case_witnesses: caseWitnesses,
  ownership_audit: ownershipAudit,
  scenario_traces: scenarioTraces
};

console.log(JSON.stringify(output));
