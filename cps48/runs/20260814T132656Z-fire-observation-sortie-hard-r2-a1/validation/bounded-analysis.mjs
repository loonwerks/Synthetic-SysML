const SOURCE_SHA256 = "8472c1e85c443cbb1c53485c8c4c089823f3f9400a377a0d0c4161afc9dbe568";

const quality = ["ADEQUATE", "LIMITED", "DEPLETED", "UNKNOWN"];
const validity = ["VALID", "INVALID"];
const freshness = ["CURRENT", "STALE"];
const powerCondition = ["NOMINAL", "DEGRADED", "UNAVAILABLE", "UNKNOWN"];
const engineCondition = ["NOMINAL", "NON_NOMINAL", "UNAVAILABLE", "UNKNOWN"];
const engineCount = ["FOUR", "OTHER", "UNKNOWN"];
const alternatingKinds = ["MATCHES_SOURCE", "DOES_NOT_MATCH", "UNKNOWN"];
const coupling = ["DISCONNECTED", "CONNECTED_IDLE", "CHARGING", "UNKNOWN"];
const controlEvent = ["NONE", "REQUEST_ENABLE", "REQUEST_DISABLE", "ACKNOWLEDGE_RECOVERY"];
const feedback = ["DISABLED_CONFIRMED", "ENABLED_CONFIRMED", "UNKNOWN"];
const demandPhase = ["IDLE", "REQUESTED", "ACTIVE"];
const directive = ["INHIBIT", "DISABLE", "RECOVER", "ENABLE", "HOLD"];
const recoveryPhase = ["NORMAL", "QUARANTINED", "AWAITING_ACK"];
const recoveryGate = ["OPEN", "CLOSED"];
const commandPhase = ["DISABLED", "ENABLE_PENDING", "ENABLED"];

const batteryAssessmentValues = [
  "READY_NONE", "NOT_READY_INVALID", "NOT_READY_STALE",
  "NOT_READY_LIMITED", "NOT_READY_DEPLETED_OR_UNKNOWN"
];
const powerAssessmentValues = [
  "READY_NONE", "NOT_READY_INVALID", "NOT_READY_STALE", "NOT_READY_CONDITION"
];
const engineAssessmentValues = [
  "READY_NONE", "NOT_READY_INVALID", "NOT_READY_STALE",
  "NOT_READY_FIRST_POSITION", "NOT_READY_SECOND_POSITION"
];
const configurationAssessmentValues = [
  "READY_NONE", "NOT_READY_INVALID", "NOT_READY_STALE",
  "NOT_READY_ENGINE_COUNT", "NOT_READY_ALTERNATION"
];
const propulsionAssessmentValues = [
  "READY_NONE", "NOT_READY_ODD_ENGINE_GROUP",
  "NOT_READY_EVEN_ENGINE_GROUP", "NOT_READY_CONFIGURATION"
];
const chargingAssessmentValues = [
  "READY_NONE", "NOT_READY_INVALID", "NOT_READY_STALE",
  "NOT_READY_CONNECTED_IDLE", "NOT_READY_CHARGING_OR_UNKNOWN"
];
const availabilityCause = [
  "NONE", "BATTERY", "POWER_MANAGEMENT", "ODD_ENGINE_GROUP",
  "EVEN_ENGINE_GROUP", "CONFIGURATION", "CHARGER", "RECOVERY",
  "NO_DEMAND", "OPERATOR_DISABLE"
];

const product = (...domains) => domains.reduce(
  (rows, domain) => rows.flatMap(row => domain.map(value => [...row, value])),
  [[]]
);
const key = value => JSON.stringify(value);
const same = (left, right) => key(left) === key(right);
const increment = (object, name) => { object[name] = (object[name] || 0) + 1; };

function part01(observation) {
  if (observation.validity === "VALID" && observation.freshness === "CURRENT") {
    return { case: "CASE-01", value: { admission: "ADMITTED_NONE", quality: observation.quality } };
  }
  return {
    case: "CASE-02",
    value: {
      admission: observation.validity === "INVALID" ? "REJECTED_INVALID" : "REJECTED_STALE",
      quality: observation.quality
    }
  };
}

function part02(qualified) {
  if (qualified.admission === "ADMITTED_NONE" && qualified.quality === "ADEQUATE") {
    return { case: "CASE-03", value: "READY_NONE" };
  }
  let value;
  if (qualified.admission === "REJECTED_INVALID") value = "NOT_READY_INVALID";
  else if (qualified.admission === "REJECTED_STALE") value = "NOT_READY_STALE";
  else if (qualified.quality === "LIMITED") value = "NOT_READY_LIMITED";
  else value = "NOT_READY_DEPLETED_OR_UNKNOWN";
  return { case: "CASE-04", value };
}

function part03(evidence) {
  if (evidence.validity === "VALID" && evidence.freshness === "CURRENT" &&
      evidence.condition === "NOMINAL") {
    return { case: "CASE-05", value: "READY_NONE" };
  }
  let value;
  if (evidence.validity === "INVALID") value = "NOT_READY_INVALID";
  else if (evidence.freshness === "STALE") value = "NOT_READY_STALE";
  else value = "NOT_READY_CONDITION";
  return { case: "CASE-06", value };
}

function engineOwner(evidence, readyCase, rejectCase) {
  if (evidence.validity === "VALID" && evidence.freshness === "CURRENT" &&
      evidence.first === "NOMINAL" && evidence.second === "NOMINAL") {
    return { case: readyCase, value: "READY_NONE" };
  }
  let value;
  if (evidence.validity === "INVALID") value = "NOT_READY_INVALID";
  else if (evidence.freshness === "STALE") value = "NOT_READY_STALE";
  else if (evidence.first !== "NOMINAL") value = "NOT_READY_FIRST_POSITION";
  else value = "NOT_READY_SECOND_POSITION";
  return { case: rejectCase, value };
}
const part04 = evidence => engineOwner(evidence, "CASE-07", "CASE-08");
const part05 = evidence => engineOwner(evidence, "CASE-09", "CASE-10");

function part06(evidence) {
  if (evidence.validity === "VALID" && evidence.freshness === "CURRENT" &&
      evidence.engineCount === "FOUR" && evidence.alternatingKinds === "MATCHES_SOURCE") {
    return { case: "CASE-11", value: "READY_NONE" };
  }
  let value;
  if (evidence.validity === "INVALID") value = "NOT_READY_INVALID";
  else if (evidence.freshness === "STALE") value = "NOT_READY_STALE";
  else if (evidence.engineCount !== "FOUR") value = "NOT_READY_ENGINE_COUNT";
  else value = "NOT_READY_ALTERNATION";
  return { case: "CASE-12", value };
}

function part07(odd, even, configuration) {
  if (odd === "READY_NONE" && even === "READY_NONE" && configuration === "READY_NONE") {
    return { case: "CASE-13", value: "READY_NONE" };
  }
  const value = odd !== "READY_NONE" ? "NOT_READY_ODD_ENGINE_GROUP"
    : even !== "READY_NONE" ? "NOT_READY_EVEN_ENGINE_GROUP"
      : "NOT_READY_CONFIGURATION";
  return { case: "CASE-14", value };
}

function part08(evidence) {
  if (evidence.validity === "VALID" && evidence.freshness === "CURRENT" &&
      evidence.coupling === "DISCONNECTED") {
    return { case: "CASE-15", value: "READY_NONE" };
  }
  let value;
  if (evidence.validity === "INVALID") value = "NOT_READY_INVALID";
  else if (evidence.freshness === "STALE") value = "NOT_READY_STALE";
  else if (evidence.coupling === "CONNECTED_IDLE") value = "NOT_READY_CONNECTED_IDLE";
  else value = "NOT_READY_CHARGING_OR_UNKNOWN";
  return { case: "CASE-16", value };
}

function part09(preDemand, acceptedDirective, actuationFeedback, candidateEvent) {
  let nextDemand;
  let caseId;
  if (["INHIBIT", "DISABLE", "RECOVER"].includes(acceptedDirective)) {
    nextDemand = "IDLE";
    caseId = "CASE-17";
  } else if (
    ((preDemand === "REQUESTED" || preDemand === "ACTIVE") &&
      actuationFeedback === "ENABLED_CONFIRMED") ||
    (preDemand === "ACTIVE" && actuationFeedback !== "DISABLED_CONFIRMED")
  ) {
    nextDemand = "ACTIVE";
    caseId = "CASE-18";
  } else {
    nextDemand = preDemand !== "IDLE" || acceptedDirective === "ENABLE" ? "REQUESTED" : "IDLE";
    caseId = "CASE-19";
  }
  return {
    case: caseId,
    requestContext: { demand: preDemand, candidateEvent },
    demandView: preDemand,
    nextDemand
  };
}

function part10(battery, power, propulsion, charging, requestContext) {
  let fault = "CLEAR";
  let cause = "NONE";
  let acceptedDirective;
  let caseId;
  if (battery !== "READY_NONE" || power !== "READY_NONE" ||
      propulsion !== "READY_NONE" || charging !== "READY_NONE") {
    fault = "ACTIVE";
    acceptedDirective = "INHIBIT";
    caseId = "CASE-20";
    if (charging !== "READY_NONE") cause = "CHARGER";
    else if (power !== "READY_NONE") cause = "POWER_MANAGEMENT";
    else if (battery !== "READY_NONE") cause = "BATTERY";
    else if (propulsion === "NOT_READY_ODD_ENGINE_GROUP") cause = "ODD_ENGINE_GROUP";
    else if (propulsion === "NOT_READY_EVEN_ENGINE_GROUP") cause = "EVEN_ENGINE_GROUP";
    else cause = "CONFIGURATION";
  } else if (requestContext.candidateEvent === "REQUEST_DISABLE") {
    acceptedDirective = "DISABLE";
    caseId = "CASE-21";
  } else if (requestContext.candidateEvent === "ACKNOWLEDGE_RECOVERY") {
    acceptedDirective = "RECOVER";
    caseId = "CASE-22";
  } else if (requestContext.candidateEvent === "REQUEST_ENABLE") {
    acceptedDirective = requestContext.demand === "IDLE" ? "ENABLE" : "HOLD";
    caseId = "CASE-23";
  } else {
    acceptedDirective = "HOLD";
    caseId = "CASE-24";
  }
  return {
    case: caseId,
    acceptedDirective,
    summary: { fault, cause, directive: acceptedDirective }
  };
}

function part11(preRecovery, summary) {
  let nextRecovery;
  let caseId;
  if (summary.fault === "ACTIVE") {
    nextRecovery = "QUARANTINED";
    caseId = "CASE-25";
  } else if (
    preRecovery === "QUARANTINED" ||
    (preRecovery === "AWAITING_ACK" && summary.directive !== "RECOVER")
  ) {
    nextRecovery = "AWAITING_ACK";
    caseId = "CASE-26";
  } else {
    nextRecovery = "NORMAL";
    caseId = "CASE-27";
  }
  const gate = nextRecovery === "NORMAL" ? "OPEN" : "CLOSED";
  return {
    case: caseId,
    nextRecovery,
    recoveryFrame: { phase: nextRecovery, gate },
    recoveryGate: gate
  };
}

function part12(battery, power, propulsion, charging, demand, summary, recoveryFrame) {
  const available = battery === "READY_NONE" && power === "READY_NONE" &&
    propulsion === "READY_NONE" && charging === "READY_NONE" &&
    demand !== "IDLE" && summary.fault === "CLEAR" &&
    recoveryFrame.phase === "NORMAL" && recoveryFrame.gate === "OPEN" &&
    (summary.directive === "ENABLE" || summary.directive === "HOLD");
  if (available) {
    return {
      case: "CASE-28",
      decision: { decision: "AVAILABLE_FOR_ENABLE", cause: "NONE" },
      report: {
        decision: "AVAILABLE_FOR_ENABLE", cause: "NONE",
        demand, recovery: recoveryFrame.phase
      }
    };
  }
  let cause;
  if (charging !== "READY_NONE") cause = "CHARGER";
  else if (power !== "READY_NONE") cause = "POWER_MANAGEMENT";
  else if (battery !== "READY_NONE") cause = "BATTERY";
  else if (propulsion === "NOT_READY_ODD_ENGINE_GROUP") cause = "ODD_ENGINE_GROUP";
  else if (propulsion === "NOT_READY_EVEN_ENGINE_GROUP") cause = "EVEN_ENGINE_GROUP";
  else if (propulsion === "NOT_READY_CONFIGURATION") cause = "CONFIGURATION";
  else if (summary.fault === "ACTIVE") cause = summary.cause;
  else if (summary.directive === "DISABLE") cause = "OPERATOR_DISABLE";
  else if (recoveryFrame.gate === "CLOSED" || summary.directive === "RECOVER") cause = "RECOVERY";
  else cause = "NO_DEMAND";
  return {
    case: "CASE-29",
    decision: { decision: "UNAVAILABLE", cause },
    report: { decision: "UNAVAILABLE", cause, demand, recovery: recoveryFrame.phase }
  };
}

function part13(preCommand, availability, demand, gate, acceptedDirective, actuationFeedback) {
  const admitted = availability.decision === "AVAILABLE_FOR_ENABLE" &&
    demand !== "IDLE" && gate === "OPEN" &&
    (acceptedDirective === "ENABLE" || acceptedDirective === "HOLD");
  if (!admitted) {
    return { branch: "BEH-01-DISABLE", nextCommand: "DISABLED", command: "DISABLE" };
  }
  if (preCommand === "DISABLED") {
    return { branch: "BEH-01-ENABLE-NEW", nextCommand: "ENABLE_PENDING", command: "ENABLE_NEW" };
  }
  let nextCommand = preCommand;
  if (actuationFeedback === "ENABLED_CONFIRMED") nextCommand = "ENABLED";
  else if (actuationFeedback === "DISABLED_CONFIRMED") nextCommand = "ENABLE_PENDING";
  return { branch: "BEH-01-ENABLE-HOLD", nextCommand, command: "ENABLE_HOLD" };
}

// These oracles compare the boundary result only; no ownership credit is derived from them.
function boundaryAvailabilityOracle(battery, power, propulsion, charging, demand, summary, recovery) {
  const ready = battery === "READY_NONE" && power === "READY_NONE" &&
    propulsion === "READY_NONE" && charging === "READY_NONE";
  if (ready && demand !== "IDLE" && summary.fault === "CLEAR" &&
      recovery.phase === "NORMAL" && recovery.gate === "OPEN" &&
      ["ENABLE", "HOLD"].includes(summary.directive)) {
    return { decision: "AVAILABLE_FOR_ENABLE", cause: "NONE" };
  }
  const ordered = [
    [charging !== "READY_NONE", "CHARGER"],
    [power !== "READY_NONE", "POWER_MANAGEMENT"],
    [battery !== "READY_NONE", "BATTERY"],
    [propulsion === "NOT_READY_ODD_ENGINE_GROUP", "ODD_ENGINE_GROUP"],
    [propulsion === "NOT_READY_EVEN_ENGINE_GROUP", "EVEN_ENGINE_GROUP"],
    [propulsion === "NOT_READY_CONFIGURATION", "CONFIGURATION"],
    [summary.fault === "ACTIVE", summary.cause],
    [summary.directive === "DISABLE", "OPERATOR_DISABLE"],
    [recovery.gate === "CLOSED" || summary.directive === "RECOVER", "RECOVERY"],
    [true, "NO_DEMAND"]
  ];
  return { decision: "UNAVAILABLE", cause: ordered.find(entry => entry[0])[1] };
}

function boundaryCommandOracle(preCommand, availability, demand, gate, acceptedDirective, actuationFeedback) {
  if (availability.decision !== "AVAILABLE_FOR_ENABLE" || demand === "IDLE" ||
      gate !== "OPEN" || !["ENABLE", "HOLD"].includes(acceptedDirective)) {
    return { nextCommand: "DISABLED", command: "DISABLE" };
  }
  if (preCommand === "DISABLED") {
    return { nextCommand: "ENABLE_PENDING", command: "ENABLE_NEW" };
  }
  return {
    nextCommand: actuationFeedback === "ENABLED_CONFIRMED" ? "ENABLED"
      : actuationFeedback === "DISABLED_CONFIRMED" ? "ENABLE_PENDING" : preCommand,
    command: "ENABLE_HOLD"
  };
}

const connectionMap = [
  ["INT-01", "CTX-02.batteryObservation", "PART-01.battery_observation", "BatteryObservation"],
  ["INT-02", "PART-01.qualified_battery", "PART-02.qualified_battery", "QualifiedBatteryObservation"],
  ["INT-03", "CTX-02.powerManagementEvidence", "PART-03.power_evidence", "PowerEvidence"],
  ["INT-04", "CTX-03.oddEngineGroupEvidence", "PART-04.odd_engine_evidence", "EnginePairEvidence"],
  ["INT-05", "CTX-03.evenEngineGroupEvidence", "PART-05.even_engine_evidence", "EnginePairEvidence"],
  ["INT-06", "CTX-03.configurationEvidence", "PART-06.configuration_evidence", "ConfigurationEvidence"],
  ["INT-07", "PART-04.odd_engine_assessment", "PART-07.odd_engine_assessment", "EnginePairAssessment"],
  ["INT-08", "PART-05.even_engine_assessment", "PART-07.even_engine_assessment", "EnginePairAssessment"],
  ["INT-09", "PART-06.configuration_assessment", "PART-07.configuration_assessment", "ConfigurationAssessment"],
  ["INT-10", "CTX-04.chargerEvidence", "PART-08.charger_evidence", "ChargerEvidence"],
  ["INT-11", "CTX-01.controlEvent", "PART-09.control_event", "ControlEvent"],
  ["INT-12", "CTX-05.actuationFeedback", "PART-09.actuation_feedback", "ActuationFeedback"],
  ["INT-13", "PART-09.request_context", "PART-10.request_context", "RequestContext"],
  ["INT-14", "PART-02.battery_assessment", "PART-10.battery_assessment", "BatteryAssessment"],
  ["INT-15", "PART-03.power_assessment", "PART-10.power_assessment", "PowerAssessment"],
  ["INT-16", "PART-07.propulsion_assessment", "PART-10.propulsion_assessment", "PropulsionAssessment"],
  ["INT-17", "PART-08.charging_assessment", "PART-10.charging_assessment", "ChargingAssessment"],
  ["INT-18", "PART-10.accepted_directive", "PART-09.accepted_directive", "PriorityDirective"],
  ["INT-19", "CTX-05.actuationFeedback", "PART-13.actuation_feedback", "ActuationFeedback"],
  ["INT-20", "PART-10.fault_action_summary", "PART-11.fault_action_summary", "FaultActionSummary"],
  ["INT-21", "PART-02.battery_assessment", "PART-12.battery_assessment", "BatteryAssessment"],
  ["INT-22", "PART-03.power_assessment", "PART-12.power_assessment", "PowerAssessment"],
  ["INT-23", "PART-07.propulsion_assessment", "PART-12.propulsion_assessment", "PropulsionAssessment"],
  ["INT-24", "PART-08.charging_assessment", "PART-12.charging_assessment", "ChargingAssessment"],
  ["INT-25", "PART-09.demand_view", "PART-12.demand_view", "DemandPhase"],
  ["INT-26", "PART-10.fault_action_summary", "PART-12.fault_action_summary", "FaultActionSummary"],
  ["INT-27", "PART-11.recovery_frame", "PART-12.recovery_frame", "RecoveryFrame"],
  ["INT-28", "PART-12.availability_decision", "PART-13.availability_decision", "AvailabilityDecision"],
  ["INT-29", "PART-09.demand_view", "PART-13.demand_view", "DemandPhase"],
  ["INT-30", "PART-11.recovery_gate", "PART-13.recovery_gate", "RecoveryGate"],
  ["INT-31", "PART-10.accepted_directive", "PART-13.accepted_directive", "PriorityDirective"],
  ["INT-32", "PART-13.power_command", "CTX-05.propulsionPowerCommand", "PowerCommand"],
  ["INT-33", "PART-12.availability_report", "CTX-01.availabilityReport", "AvailabilityReport"]
].map(([id, source, destination, value]) => ({ id, source, destination, value }));

const ownershipAudit = [
  {
    usage: "battery_observation_admission",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-01.battery_observation"],
    owner_local_facts: ["prioritized battery admission"],
    contract_cases: ["CASE-01", "CASE-02"],
    analyzer_checks: ["part01_admission_partition"]
  },
  {
    usage: "battery_capacity_assessment",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-02.qualified_battery"],
    owner_local_facts: ["qualified qualitative battery readiness"],
    contract_cases: ["CASE-03", "CASE-04"],
    analyzer_checks: ["part02_capacity_partition"]
  },
  {
    usage: "power_management_assessment",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-03.power_evidence"],
    owner_local_facts: ["prioritized power-management readiness"],
    contract_cases: ["CASE-05", "CASE-06"],
    analyzer_checks: ["part03_power_partition"]
  },
  {
    usage: "odd_engine_group_assessor",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-04.odd_engine_evidence"],
    owner_local_facts: ["joint odd-position group readiness"],
    contract_cases: ["CASE-07", "CASE-08"],
    analyzer_checks: ["part04_odd_group_partition"]
  },
  {
    usage: "even_engine_group_assessor",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-05.even_engine_evidence"],
    owner_local_facts: ["joint even-position group readiness"],
    contract_cases: ["CASE-09", "CASE-10"],
    analyzer_checks: ["part05_even_group_partition"]
  },
  {
    usage: "four_engine_configuration_assessor",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-06.configuration_evidence"],
    owner_local_facts: ["four-engine structural concordance"],
    contract_cases: ["CASE-11", "CASE-12"],
    analyzer_checks: ["part06_configuration_partition"]
  },
  {
    usage: "propulsion_evidence_composer",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-07.odd_engine_assessment", "PART-07.even_engine_assessment", "PART-07.configuration_assessment"],
    owner_local_facts: ["prioritized propulsion evidence composition"],
    contract_cases: ["CASE-13", "CASE-14"],
    analyzer_checks: ["part07_propulsion_partition"]
  },
  {
    usage: "charging_interlock_assessor",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-08.charger_evidence"],
    owner_local_facts: ["prioritized charger interlock readiness"],
    contract_cases: ["CASE-15", "CASE-16"],
    analyzer_checks: ["part08_charging_partition"]
  },
  {
    usage: "enable_demand_lifecycle",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-09.control_event", "PART-09.actuation_feedback", "PART-09.accepted_directive", "PART-09.In(demandMemory)"],
    owner_local_facts: ["fresh/requested/active demand transition"],
    contract_cases: ["CASE-17", "CASE-18", "CASE-19"],
    analyzer_checks: ["part09_demand_transition_partition"]
  },
  {
    usage: "fault_action_priority_resolver",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-10.request_context", "PART-10.battery_assessment", "PART-10.power_assessment", "PART-10.propulsion_assessment", "PART-10.charging_assessment"],
    owner_local_facts: ["charger-first fault cause and action priority"],
    contract_cases: ["CASE-20", "CASE-21", "CASE-22", "CASE-23", "CASE-24"],
    analyzer_checks: ["part10_fault_action_partition"]
  },
  {
    usage: "recovery_qualification",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-11.fault_action_summary", "PART-11.In(recoveryMemory)"],
    owner_local_facts: ["fault-latched acknowledgment-gated recovery"],
    contract_cases: ["CASE-25", "CASE-26", "CASE-27"],
    analyzer_checks: ["part11_recovery_transition_partition"]
  },
  {
    usage: "availability_decision_owner",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-12.battery_assessment", "PART-12.power_assessment", "PART-12.propulsion_assessment", "PART-12.charging_assessment", "PART-12.demand_view", "PART-12.fault_action_summary", "PART-12.recovery_frame"],
    owner_local_facts: ["composed availability and prioritized report cause"],
    contract_cases: ["CASE-28", "CASE-29"],
    analyzer_checks: ["part12_availability_partition"]
  },
  {
    usage: "power_command_interlock",
    claimed_roles: ["decision"],
    assigned_inputs: ["PART-13.availability_decision", "PART-13.demand_view", "PART-13.recovery_gate", "PART-13.accepted_directive", "PART-13.actuation_feedback", "PART-13.In(commandMemory)"],
    owner_local_facts: ["first-versus-held command sequencing"],
    contract_cases: ["BEH-01"],
    analyzer_checks: ["part13_command_transition_partition"]
  }
];

const reports = {};
const allCaseHits = Object.fromEntries(
  Array.from({ length: 29 }, (_, index) => ["CASE-" + String(index + 1).padStart(2, "0"), 0])
);
const caseWitnesses = {};
const failures = [];

function auditDomain(name, tuples, guards, owner, outputOf, producerReachable = () => true) {
  const report = {
    domain_size: tuples.length,
    gaps: 0,
    overlaps: 0,
    output_fibers: {},
    case_hits: {},
    producer_unreachable: 0,
    executed_function: owner.name || name
  };
  for (const tuple of tuples) {
    const hits = guards.filter(entry => entry.guard(tuple)).map(entry => entry.case);
    if (hits.length === 0) report.gaps++;
    if (hits.length > 1) report.overlaps++;
    const result = owner(tuple);
    if (hits.length === 1 && result.case !== hits[0]) {
      failures.push({ check: name, tuple, expected_case: hits[0], observed_case: result.case });
    }
    increment(report.case_hits, result.case);
    if (allCaseHits[result.case] !== undefined) allCaseHits[result.case]++;
    if (!caseWitnesses[result.case]) caseWitnesses[result.case] = { owner: name, input: tuple, output: outputOf(result) };
    increment(report.output_fibers, key(outputOf(result)));
    if (!producerReachable(tuple)) report.producer_unreachable++;
  }
  report.nonidentity_witness = {
    input: tuples[0],
    output: outputOf(owner(tuples[0])),
    distinct_output_count: Object.keys(report.output_fibers).length
  };
  reports[name] = report;
}

const batteryDomain = product(quality, validity, freshness)
  .map(([q, v, f]) => ({ quality: q, validity: v, freshness: f }));
auditDomain(
  "part01_admission_partition",
  batteryDomain,
  [
    { case: "CASE-01", guard: t => t.validity === "VALID" && t.freshness === "CURRENT" },
    { case: "CASE-02", guard: t => t.validity === "INVALID" || t.freshness === "STALE" }
  ],
  t => part01(t),
  result => result.value
);

const qualifiedDomain = product(
  ["ADMITTED_NONE", "REJECTED_INVALID", "REJECTED_STALE"], quality
).map(([admission, q]) => ({ admission, quality: q }));
auditDomain(
  "part02_capacity_partition",
  qualifiedDomain,
  [
    { case: "CASE-03", guard: t => t.admission === "ADMITTED_NONE" && t.quality === "ADEQUATE" },
    { case: "CASE-04", guard: t => t.admission !== "ADMITTED_NONE" || t.quality !== "ADEQUATE" }
  ],
  t => part02(t),
  result => result.value
);

const powerDomain = product(powerCondition, validity, freshness)
  .map(([condition, v, f]) => ({ condition, validity: v, freshness: f }));
auditDomain(
  "part03_power_partition",
  powerDomain,
  [
    { case: "CASE-05", guard: t => t.validity === "VALID" && t.freshness === "CURRENT" && t.condition === "NOMINAL" },
    { case: "CASE-06", guard: t => t.validity === "INVALID" || t.freshness === "STALE" || t.condition !== "NOMINAL" }
  ],
  t => part03(t),
  result => result.value
);

const engineDomain = product(engineCondition, engineCondition, validity, freshness)
  .map(([first, second, v, f]) => ({ first, second, validity: v, freshness: f }));
const engineGuards = (readyCase, rejectCase) => [
  {
    case: readyCase,
    guard: t => t.validity === "VALID" && t.freshness === "CURRENT" &&
      t.first === "NOMINAL" && t.second === "NOMINAL"
  },
  {
    case: rejectCase,
    guard: t => t.validity === "INVALID" || t.freshness === "STALE" ||
      t.first !== "NOMINAL" || t.second !== "NOMINAL"
  }
];
auditDomain("part04_odd_group_partition", engineDomain, engineGuards("CASE-07", "CASE-08"),
  t => part04(t), result => result.value);
auditDomain("part05_even_group_partition", engineDomain, engineGuards("CASE-09", "CASE-10"),
  t => part05(t), result => result.value);

const configurationDomain = product(engineCount, alternatingKinds, validity, freshness)
  .map(([count, kinds, v, f]) => ({
    engineCount: count, alternatingKinds: kinds, validity: v, freshness: f
  }));
auditDomain(
  "part06_configuration_partition",
  configurationDomain,
  [
    {
      case: "CASE-11",
      guard: t => t.validity === "VALID" && t.freshness === "CURRENT" &&
        t.engineCount === "FOUR" && t.alternatingKinds === "MATCHES_SOURCE"
    },
    {
      case: "CASE-12",
      guard: t => t.validity === "INVALID" || t.freshness === "STALE" ||
        t.engineCount !== "FOUR" || t.alternatingKinds !== "MATCHES_SOURCE"
    }
  ],
  t => part06(t),
  result => result.value
);

const propulsionDomain = product(
  engineAssessmentValues, engineAssessmentValues, configurationAssessmentValues
).map(([odd, even, configuration]) => ({ odd, even, configuration }));
auditDomain(
  "part07_propulsion_partition",
  propulsionDomain,
  [
    {
      case: "CASE-13",
      guard: t => t.odd === "READY_NONE" && t.even === "READY_NONE" &&
        t.configuration === "READY_NONE"
    },
    {
      case: "CASE-14",
      guard: t => t.odd !== "READY_NONE" || t.even !== "READY_NONE" ||
        t.configuration !== "READY_NONE"
    }
  ],
  t => part07(t.odd, t.even, t.configuration),
  result => result.value
);

const chargerDomain = product(coupling, validity, freshness)
  .map(([c, v, f]) => ({ coupling: c, validity: v, freshness: f }));
auditDomain(
  "part08_charging_partition",
  chargerDomain,
  [
    {
      case: "CASE-15",
      guard: t => t.validity === "VALID" && t.freshness === "CURRENT" &&
        t.coupling === "DISCONNECTED"
    },
    {
      case: "CASE-16",
      guard: t => t.validity === "INVALID" || t.freshness === "STALE" ||
        t.coupling !== "DISCONNECTED"
    }
  ],
  t => part08(t),
  result => result.value
);

const demandDomain = product(demandPhase, directive, feedback)
  .map(([preDemand, acceptedDirective, actuationFeedback]) => ({
    preDemand, acceptedDirective, actuationFeedback, candidateEvent: "NONE"
  }));
auditDomain(
  "part09_demand_transition_partition",
  demandDomain,
  [
    {
      case: "CASE-17",
      guard: t => ["INHIBIT", "DISABLE", "RECOVER"].includes(t.acceptedDirective)
    },
    {
      case: "CASE-18",
      guard: t => ["ENABLE", "HOLD"].includes(t.acceptedDirective) &&
        ((((t.preDemand === "REQUESTED" || t.preDemand === "ACTIVE") &&
          t.actuationFeedback === "ENABLED_CONFIRMED")) ||
         (t.preDemand === "ACTIVE" && t.actuationFeedback !== "DISABLED_CONFIRMED"))
    },
    {
      case: "CASE-19",
      guard: t => ["ENABLE", "HOLD"].includes(t.acceptedDirective) &&
        (t.preDemand === "IDLE" ||
         (t.preDemand === "REQUESTED" && t.actuationFeedback !== "ENABLED_CONFIRMED") ||
         (t.preDemand === "ACTIVE" && t.actuationFeedback === "DISABLED_CONFIRMED"))
    }
  ],
  t => part09(t.preDemand, t.acceptedDirective, t.actuationFeedback, t.candidateEvent),
  result => result.nextDemand
);

const requestContextDomain = product(demandPhase, controlEvent)
  .map(([demand, candidateEvent]) => ({ demand, candidateEvent }));
const priorityDomain = product(
  batteryAssessmentValues, powerAssessmentValues, propulsionAssessmentValues,
  chargingAssessmentValues, requestContextDomain
).map(([battery, power, propulsion, charging, requestContext]) => ({
  battery, power, propulsion, charging, requestContext
}));
const allAssessmentsReady = t => t.battery === "READY_NONE" && t.power === "READY_NONE" &&
  t.propulsion === "READY_NONE" && t.charging === "READY_NONE";
auditDomain(
  "part10_fault_action_partition",
  priorityDomain,
  [
    { case: "CASE-20", guard: t => !allAssessmentsReady(t) },
    { case: "CASE-21", guard: t => allAssessmentsReady(t) && t.requestContext.candidateEvent === "REQUEST_DISABLE" },
    { case: "CASE-22", guard: t => allAssessmentsReady(t) && t.requestContext.candidateEvent === "ACKNOWLEDGE_RECOVERY" },
    { case: "CASE-23", guard: t => allAssessmentsReady(t) && t.requestContext.candidateEvent === "REQUEST_ENABLE" },
    { case: "CASE-24", guard: t => allAssessmentsReady(t) && t.requestContext.candidateEvent === "NONE" }
  ],
  t => part10(t.battery, t.power, t.propulsion, t.charging, t.requestContext),
  result => ({ acceptedDirective: result.acceptedDirective, summary: result.summary })
);

const faultCausePairs = [
  { fault: "CLEAR", cause: "NONE" },
  ...["BATTERY", "POWER_MANAGEMENT", "ODD_ENGINE_GROUP", "EVEN_ENGINE_GROUP", "CONFIGURATION", "CHARGER"]
    .map(cause => ({ fault: "ACTIVE", cause }))
];
const recoveryDomain = product(recoveryPhase, faultCausePairs, directive)
  .map(([preRecovery, pair, d]) => ({
    preRecovery, summary: { fault: pair.fault, cause: pair.cause, directive: d }
  }));
const summaryProducerReachable = summary =>
  (summary.fault === "ACTIVE" && summary.directive === "INHIBIT") ||
  (summary.fault === "CLEAR" && summary.directive !== "INHIBIT");
auditDomain(
  "part11_recovery_transition_partition",
  recoveryDomain,
  [
    { case: "CASE-25", guard: t => t.summary.fault === "ACTIVE" },
    {
      case: "CASE-26",
      guard: t => t.summary.fault === "CLEAR" &&
        (t.preRecovery === "QUARANTINED" ||
         (t.preRecovery === "AWAITING_ACK" && t.summary.directive !== "RECOVER"))
    },
    {
      case: "CASE-27",
      guard: t => t.summary.fault === "CLEAR" &&
        (t.preRecovery === "NORMAL" ||
         (t.preRecovery === "AWAITING_ACK" && t.summary.directive === "RECOVER"))
    }
  ],
  t => part11(t.preRecovery, t.summary),
  result => ({ nextRecovery: result.nextRecovery, gate: result.recoveryGate }),
  t => summaryProducerReachable(t.summary)
);

const producerSummaries = [
  ...["BATTERY", "POWER_MANAGEMENT", "ODD_ENGINE_GROUP", "EVEN_ENGINE_GROUP", "CONFIGURATION", "CHARGER"]
    .map(cause => ({ fault: "ACTIVE", cause, directive: "INHIBIT" })),
  ...["DISABLE", "RECOVER", "ENABLE", "HOLD"]
    .map(d => ({ fault: "CLEAR", cause: "NONE", directive: d }))
];
const recoveryFrames = [
  { phase: "NORMAL", gate: "OPEN" },
  { phase: "QUARANTINED", gate: "CLOSED" },
  { phase: "AWAITING_ACK", gate: "CLOSED" }
];
const availabilityDomain = product(
  batteryAssessmentValues, powerAssessmentValues, propulsionAssessmentValues,
  chargingAssessmentValues, demandPhase, producerSummaries, recoveryFrames
).map(([battery, power, propulsion, charging, demand, summary, recoveryFrame]) => ({
  battery, power, propulsion, charging, demand, summary, recoveryFrame
}));

function part10CanProduce(tuple) {
  return controlEvent.some(candidateEvent => {
    const result = part10(
      tuple.battery, tuple.power, tuple.propulsion, tuple.charging,
      { demand: tuple.demand, candidateEvent }
    );
    return same(result.summary, tuple.summary);
  });
}
function part11CanProduce(tuple) {
  return recoveryPhase.some(pre => same(part11(pre, tuple.summary).recoveryFrame, tuple.recoveryFrame));
}

const reachablePart13InputKeys = new Set();
let availabilityOracleMismatches = 0;
auditDomain(
  "part12_availability_partition",
  availabilityDomain,
  [
    {
      case: "CASE-28",
      guard: t => t.battery === "READY_NONE" && t.power === "READY_NONE" &&
        t.propulsion === "READY_NONE" && t.charging === "READY_NONE" &&
        t.demand !== "IDLE" && t.summary.fault === "CLEAR" &&
        t.recoveryFrame.phase === "NORMAL" && t.recoveryFrame.gate === "OPEN" &&
        ["ENABLE", "HOLD"].includes(t.summary.directive)
    },
    {
      case: "CASE-29",
      guard: t => t.battery !== "READY_NONE" || t.power !== "READY_NONE" ||
        t.propulsion !== "READY_NONE" || t.charging !== "READY_NONE" ||
        t.demand === "IDLE" || t.summary.fault === "ACTIVE" ||
        t.recoveryFrame.phase !== "NORMAL" || t.recoveryFrame.gate === "CLOSED" ||
        ["INHIBIT", "DISABLE", "RECOVER"].includes(t.summary.directive)
    }
  ],
  t => {
    const result = part12(
      t.battery, t.power, t.propulsion, t.charging,
      t.demand, t.summary, t.recoveryFrame
    );
    const oracle = boundaryAvailabilityOracle(
      t.battery, t.power, t.propulsion, t.charging,
      t.demand, t.summary, t.recoveryFrame
    );
    if (!same(result.decision, oracle)) availabilityOracleMismatches++;
    if (part10CanProduce(t) && part11CanProduce(t)) {
      reachablePart13InputKeys.add(key([
        result.decision, t.demand, t.recoveryFrame.gate, t.summary.directive
      ]));
    }
    return result;
  },
  result => result.decision,
  t => part10CanProduce(t) && part11CanProduce(t)
);

const availabilityDecisionValues = [
  { decision: "AVAILABLE_FOR_ENABLE", cause: "NONE" },
  ...availabilityCause.filter(cause => cause !== "NONE")
    .map(cause => ({ decision: "UNAVAILABLE", cause }))
];
const commandDomain = product(
  commandPhase, availabilityDecisionValues, demandPhase,
  recoveryGate, directive, feedback
).map(([preCommand, availability, demand, gate, acceptedDirective, actuationFeedback]) => ({
  preCommand, availability, demand, gate, acceptedDirective, actuationFeedback
}));
let commandOracleMismatches = 0;
const commandReport = {
  domain_size: commandDomain.length,
  gaps: 0,
  overlaps: 0,
  output_fibers: {},
  branch_hits: {},
  producer_unreachable: 0,
  executed_function: "part13",
  one_new_per_admitted_cycle_violations: 0
};
for (const tuple of commandDomain) {
  const admitted = tuple.availability.decision === "AVAILABLE_FOR_ENABLE" &&
    tuple.demand !== "IDLE" && tuple.gate === "OPEN" &&
    ["ENABLE", "HOLD"].includes(tuple.acceptedDirective);
  const guards = [
    !admitted,
    admitted && tuple.preCommand === "DISABLED",
    admitted && tuple.preCommand !== "DISABLED"
  ];
  const hitCount = guards.filter(Boolean).length;
  if (hitCount === 0) commandReport.gaps++;
  if (hitCount > 1) commandReport.overlaps++;
  const result = part13(
    tuple.preCommand, tuple.availability, tuple.demand, tuple.gate,
    tuple.acceptedDirective, tuple.actuationFeedback
  );
  increment(commandReport.output_fibers, key({ nextCommand: result.nextCommand, command: result.command }));
  increment(commandReport.branch_hits, result.branch);
  if (result.command === "ENABLE_NEW" && tuple.preCommand !== "DISABLED") {
    commandReport.one_new_per_admitted_cycle_violations++;
  }
  const oracle = boundaryCommandOracle(
    tuple.preCommand, tuple.availability, tuple.demand, tuple.gate,
    tuple.acceptedDirective, tuple.actuationFeedback
  );
  if (!same({ nextCommand: result.nextCommand, command: result.command }, oracle)) {
    commandOracleMismatches++;
  }
  if (!reachablePart13InputKeys.has(key([
    tuple.availability, tuple.demand, tuple.gate, tuple.acceptedDirective
  ]))) {
    commandReport.producer_unreachable++;
  }
}
commandReport.nonidentity_witness = {
  input: {
    preCommand: "DISABLED",
    availability: { decision: "AVAILABLE_FOR_ENABLE", cause: "NONE" },
    demand: "REQUESTED",
    gate: "OPEN",
    acceptedDirective: "HOLD",
    actuationFeedback: "UNKNOWN"
  },
  output: part13(
    "DISABLED", { decision: "AVAILABLE_FOR_ENABLE", cause: "NONE" },
    "REQUESTED", "OPEN", "HOLD", "UNKNOWN"
  ),
  distinct_output_count: Object.keys(commandReport.output_fibers).length
};
reports.part13_command_transition_partition = commandReport;

const executedConnections = new Set();
const consume = (id, value) => {
  executedConnections.add(id);
  return value;
};

function readySnapshot(event = "NONE", actuationFeedback = "DISABLED_CONFIRMED", changes = {}) {
  const snapshot = {
    battery: { quality: "ADEQUATE", validity: "VALID", freshness: "CURRENT" },
    power: { condition: "NOMINAL", validity: "VALID", freshness: "CURRENT" },
    odd: { first: "NOMINAL", second: "NOMINAL", validity: "VALID", freshness: "CURRENT" },
    even: { first: "NOMINAL", second: "NOMINAL", validity: "VALID", freshness: "CURRENT" },
    configuration: {
      engineCount: "FOUR", alternatingKinds: "MATCHES_SOURCE",
      validity: "VALID", freshness: "CURRENT"
    },
    charger: { coupling: "DISCONNECTED", validity: "VALID", freshness: "CURRENT" },
    event,
    feedback: actuationFeedback
  };
  for (const [name, value] of Object.entries(changes)) {
    snapshot[name] = typeof value === "object" && !Array.isArray(value)
      ? { ...snapshot[name], ...value } : value;
  }
  return snapshot;
}

function systemStep(preState, input) {
  const p01 = part01(consume("INT-01", input.battery));
  const p02 = part02(consume("INT-02", p01.value));
  const p03 = part03(consume("INT-03", input.power));
  const p04 = part04(consume("INT-04", input.odd));
  const p05 = part05(consume("INT-05", input.even));
  const p06 = part06(consume("INT-06", input.configuration));
  const p07 = part07(
    consume("INT-07", p04.value),
    consume("INT-08", p05.value),
    consume("INT-09", p06.value)
  );
  const p08 = part08(consume("INT-10", input.charger));
  const event = consume("INT-11", input.event);
  const lifecycleFeedback = consume("INT-12", input.feedback);
  const publication = part09(preState.demand, "HOLD", lifecycleFeedback, event);
  const p10 = part10(
    consume("INT-14", p02.value),
    consume("INT-15", p03.value),
    consume("INT-16", p07.value),
    consume("INT-17", p08.value),
    consume("INT-13", publication.requestContext)
  );
  const p09 = part09(
    preState.demand,
    consume("INT-18", p10.acceptedDirective),
    lifecycleFeedback,
    event
  );
  const p11 = part11(preState.recovery, consume("INT-20", p10.summary));
  const p12 = part12(
    consume("INT-21", p02.value),
    consume("INT-22", p03.value),
    consume("INT-23", p07.value),
    consume("INT-24", p08.value),
    consume("INT-25", p09.demandView),
    consume("INT-26", p10.summary),
    consume("INT-27", p11.recoveryFrame)
  );
  const p13 = part13(
    preState.command,
    consume("INT-28", p12.decision),
    consume("INT-29", p09.demandView),
    consume("INT-30", p11.recoveryGate),
    consume("INT-31", p10.acceptedDirective),
    consume("INT-19", input.feedback)
  );
  const command = consume("INT-32", p13.command);
  const report = consume("INT-33", p12.report);
  return {
    nextState: {
      demand: p09.nextDemand,
      recovery: p11.nextRecovery,
      command: p13.nextCommand
    },
    outputs: { command, report },
    branches: [
      p01.case, p02.case, p03.case, p04.case, p05.case, p06.case,
      p07.case, p08.case, p09.case, p10.case, p11.case, p12.case, p13.branch
    ],
    local: {
      battery: p02.value, power: p03.value, odd: p04.value, even: p05.value,
      configuration: p06.value, propulsion: p07.value, charging: p08.value,
      directive: p10.acceptedDirective, faultSummary: p10.summary
    }
  };
}

function executeTrace(family, traceId, initialState, inputSteps, expectedBranch) {
  let state = { ...initialState };
  const steps = [];
  for (let index = 0; index < inputSteps.length; index++) {
    const preState = { ...state };
    const observed = systemStep(state, inputSteps[index]);
    state = observed.nextState;
    steps.push({
      step: index + 1,
      input: inputSteps[index],
      pre_state: preState,
      expected_named_branch: expectedBranch[index],
      observed_branches: observed.branches,
      observed_owner_outputs: observed.local,
      observed_outputs: observed.outputs,
      observed_next_state: observed.nextState
    });
  }
  return { family, trace_id: traceId, initial_state: initialState, steps };
}

const INIT = { demand: "IDLE", recovery: "AWAITING_ACK", command: "DISABLED" };
const OPEN_IDLE = { demand: "IDLE", recovery: "NORMAL", command: "DISABLED" };
const scenarioTraces = [
  executeTrace("SCN-01", "SCN-01-startup", INIT, [
    readySnapshot("NONE"), readySnapshot("ACKNOWLEDGE_RECOVERY"), readySnapshot("NONE")
  ], ["CASE-29/BEH-01-DISABLE", "CASE-22/CASE-29/BEH-01-DISABLE", "CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-02", "SCN-02-fresh-enable", OPEN_IDLE, [
    readySnapshot("REQUEST_ENABLE"),
    readySnapshot("NONE", "DISABLED_CONFIRMED"),
    readySnapshot("NONE", "ENABLED_CONFIRMED")
  ], ["CASE-23/CASE-29/BEH-01-DISABLE", "CASE-28/BEH-01-ENABLE-NEW", "CASE-18/CASE-28/BEH-01-ENABLE-HOLD"]),
  executeTrace("SCN-03", "SCN-03-no-demand", OPEN_IDLE, [
    readySnapshot("NONE"), readySnapshot("NONE")
  ], ["CASE-29/BEH-01-DISABLE", "CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-04", "SCN-04-duplicate-request", {
    demand: "REQUESTED", recovery: "NORMAL", command: "ENABLE_PENDING"
  }, [
    readySnapshot("REQUEST_ENABLE"), readySnapshot("REQUEST_ENABLE")
  ], ["CASE-23/CASE-28/BEH-01-ENABLE-HOLD", "CASE-23/CASE-28/BEH-01-ENABLE-HOLD"]),
  executeTrace("SCN-05", "SCN-05-operator-disable", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("REQUEST_DISABLE", "ENABLED_CONFIRMED")],
  ["CASE-21/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-06", "SCN-06A-battery-invalid", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    battery: { validity: "INVALID" }
  })], ["CASE-02/CASE-04/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-06", "SCN-06B-power-condition", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    power: { condition: "DEGRADED" }
  })], ["CASE-06/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-07", "SCN-07A-odd-first", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    odd: { first: "NON_NOMINAL" }
  })], ["CASE-08/CASE-14/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-07", "SCN-07B-even-second", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    even: { second: "UNAVAILABLE" }
  })], ["CASE-10/CASE-14/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-07", "SCN-07C-configuration", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    configuration: { engineCount: "OTHER" }
  })], ["CASE-12/CASE-14/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-08", "SCN-08A-connected-idle", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    charger: { coupling: "CONNECTED_IDLE" }
  })], ["CASE-16/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-08", "SCN-08B-charging", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    charger: { coupling: "CHARGING" }
  })], ["CASE-16/CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-08", "SCN-08C-concurrent-priority", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [readySnapshot("NONE", "ENABLED_CONFIRMED", {
    battery: { quality: "DEPLETED" },
    power: { condition: "UNAVAILABLE" },
    odd: { first: "NON_NOMINAL" },
    charger: { coupling: "CHARGING" }
  })], ["CASE-20-CHARGER-PRIORITY/CASE-29/BEH-01-DISABLE"]),
  executeTrace("SCN-09", "SCN-09-clear-without-ack", {
    demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED"
  }, [
    readySnapshot("NONE", "ENABLED_CONFIRMED", { charger: { coupling: "CHARGING" } }),
    readySnapshot("NONE"),
    readySnapshot("NONE")
  ], ["CASE-25/BEH-01-DISABLE", "CASE-26/BEH-01-DISABLE", "CASE-26/BEH-01-DISABLE"]),
  executeTrace("SCN-10", "SCN-10A-ack-fresh-request", {
    demand: "IDLE", recovery: "QUARANTINED", command: "DISABLED"
  }, [
    readySnapshot("NONE"),
    readySnapshot("ACKNOWLEDGE_RECOVERY"),
    readySnapshot("REQUEST_ENABLE"),
    readySnapshot("NONE")
  ], ["CASE-26/BEH-01-DISABLE", "CASE-27/BEH-01-DISABLE", "CASE-23/BEH-01-DISABLE", "CASE-28/BEH-01-ENABLE-NEW"]),
  executeTrace("SCN-10", "SCN-10B-recurrent-fault", {
    demand: "IDLE", recovery: "AWAITING_ACK", command: "DISABLED"
  }, [readySnapshot("ACKNOWLEDGE_RECOVERY", "DISABLED_CONFIRMED", {
    charger: { coupling: "CHARGING" }
  })], ["CASE-20/CASE-25/CASE-29/BEH-01-DISABLE"])
];

function scenario(family, predicate, description) {
  const traces = scenarioTraces.filter(trace => trace.family === family);
  const passed = traces.length > 0 && predicate(traces);
  if (!passed) failures.push({ check: family, description });
  return { id: family, passed, description, trace_ids: traces.map(trace => trace.trace_id) };
}
const last = trace => trace.steps[trace.steps.length - 1];
const scenarioResults = [
  scenario("SCN-01", traces => traces[0].steps.every(step => step.observed_outputs.command === "DISABLE"),
    "Startup and acknowledgment remain fail closed without demand."),
  scenario("SCN-02", traces => traces[0].steps.map(step => step.observed_outputs.command).join(",") ===
    "DISABLE,ENABLE_NEW,ENABLE_HOLD" &&
    same(last(traces[0]).observed_next_state, { demand: "ACTIVE", recovery: "NORMAL", command: "ENABLED" }),
    "Fresh request produces disabled, one new command, then held enabled state."),
  scenario("SCN-03", traces => traces[0].steps.every(step =>
    step.observed_outputs.command === "DISABLE" && step.observed_outputs.report.cause === "NO_DEMAND"),
    "Ready evidence without demand remains unavailable."),
  scenario("SCN-04", traces => traces[0].steps.every(step =>
    step.observed_outputs.command === "ENABLE_HOLD" &&
    step.observed_outputs.report.decision === "AVAILABLE_FOR_ENABLE"),
    "Repeated requests do not create another ENABLE_NEW."),
  scenario("SCN-05", traces => last(traces[0]).observed_outputs.command === "DISABLE" &&
    last(traces[0]).observed_outputs.report.cause === "OPERATOR_DISABLE" &&
    last(traces[0]).observed_next_state.demand === "IDLE",
    "Operator disable wins in the same evaluation."),
  scenario("SCN-06", traces => {
    const causes = traces.map(trace => last(trace).observed_outputs.report.cause).sort();
    return same(causes, ["BATTERY", "POWER_MANAGEMENT"]) &&
      traces.every(trace => last(trace).observed_outputs.command === "DISABLE");
  }, "Battery and power-management faults propagate from their local owners."),
  scenario("SCN-07", traces => {
    const causes = traces.map(trace => last(trace).observed_outputs.report.cause).sort();
    return same(causes, ["CONFIGURATION", "EVEN_ENGINE_GROUP", "ODD_ENGINE_GROUP"]) &&
      traces.every(trace => last(trace).observed_outputs.command === "DISABLE");
  }, "Engine-position and configuration faults preserve owner distinctions."),
  scenario("SCN-08", traces => {
    const concurrent = last(traces.find(trace => trace.trace_id.endsWith("concurrent-priority")));
    return traces.every(trace => last(trace).observed_outputs.command === "DISABLE" &&
      last(trace).observed_outputs.report.cause === "CHARGER") &&
      concurrent.observed_owner_outputs.charging !== "READY_NONE" &&
      concurrent.observed_owner_outputs.power !== "READY_NONE" &&
      concurrent.observed_owner_outputs.battery !== "READY_NONE" &&
      concurrent.observed_owner_outputs.odd !== "READY_NONE";
  }, "Charging faults disable and charger wins while losing owner faults remain visible."),
  scenario("SCN-09", traces => traces[0].steps.every(step =>
    step.observed_outputs.command === "DISABLE") &&
    last(traces[0]).observed_next_state.recovery === "AWAITING_ACK" &&
    last(traces[0]).observed_next_state.demand === "IDLE",
    "Fault clearance alone cannot reopen recovery or restore demand."),
  scenario("SCN-10", traces => {
    const nominal = traces.find(trace => trace.trace_id.includes("10A"));
    const recurrent = traces.find(trace => trace.trace_id.includes("10B"));
    return last(nominal).observed_outputs.command === "ENABLE_NEW" &&
      nominal.steps.slice(0, 3).every(step => step.observed_outputs.command === "DISABLE") &&
      last(recurrent).observed_outputs.command === "DISABLE" &&
      last(recurrent).observed_next_state.recovery === "QUARANTINED";
  }, "Acknowledgment requires a later fresh request and recurrent fault re-quarantines.")
];

const scn08Concurrent = scenarioTraces.find(trace => trace.trace_id === "SCN-08C-concurrent-priority");

const requiredOutputMismatches = {
  availability_oracle: availabilityOracleMismatches,
  command_oracle: commandOracleMismatches,
  scenario: scenarioResults.filter(result => !result.passed).length
};

const invariantChecks = [
  {
    name: "safe_initialization",
    passed: INIT.demand === "IDLE" && INIT.recovery === "AWAITING_ACK" &&
      INIT.command === "DISABLED" && scenarioTraces[0].steps[0].observed_outputs.command === "DISABLE"
  },
  {
    name: "invalid_before_stale",
    passed: part01({ quality: "ADEQUATE", validity: "INVALID", freshness: "STALE" }).value.admission === "REJECTED_INVALID"
  },
  {
    name: "engine_first_position_priority",
    passed: part04({ first: "NON_NOMINAL", second: "NON_NOMINAL", validity: "VALID", freshness: "CURRENT" }).value ===
      "NOT_READY_FIRST_POSITION"
  },
  {
    name: "charger_global_priority",
    passed: scn08Concurrent.steps[0].observed_outputs.report.cause === "CHARGER"
  },
  {
    name: "same_evaluation_fault_disable",
    passed: scenarioTraces.filter(trace => ["SCN-06", "SCN-07", "SCN-08"].includes(trace.family))
      .every(trace => last(trace).observed_outputs.command === "DISABLE")
  },
  {
    name: "fresh_post_recovery_request",
    passed: scenarioResults.find(result => result.id === "SCN-10").passed
  },
  {
    name: "single_enable_new_per_uninterrupted_demand",
    passed: scenarioTraces.filter(trace => trace.family === "SCN-02" || trace.family === "SCN-04")
      .every(trace => trace.steps.filter(step => step.observed_outputs.command === "ENABLE_NEW").length <= 1) &&
      commandReport.one_new_per_admitted_cycle_violations === 0
  },
  {
    name: "composition_boundary_oracle_agreement",
    passed: availabilityOracleMismatches === 0 && commandOracleMismatches === 0
  },
  {
    name: "all_semantic_connections_executed",
    passed: connectionMap.every(connection => executedConnections.has(connection.id))
  },
  {
    name: "all_owner_local_cases_executed",
    passed: Object.values(allCaseHits).every(hits => hits > 0)
  }
];

for (const check of invariantChecks) {
  if (!check.passed) failures.push({ check: check.name });
}
for (const [name, report] of Object.entries(reports)) {
  if (report.gaps !== 0 || report.overlaps !== 0) {
    failures.push({ check: name, gaps: report.gaps, overlaps: report.overlaps });
  }
}
if (Object.values(requiredOutputMismatches).some(count => count !== 0)) {
  failures.push({ check: "required_output_mismatches", counts: requiredOutputMismatches });
}
for (const audit of ownershipAudit) {
  audit.passed = audit.analyzer_checks.every(check =>
    Object.hasOwn(reports, check) && !failures.some(failure => failure.check === check)
  );
  if (!audit.passed) failures.push({ check: "ownership_audit", usage: audit.usage });
}

const result = {
  status: failures.length === 0 ? "passed" : "failed",
  passed: failures.length === 0,
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Deterministic finite-domain conformance evidence for the retained SysML policy only; not compositional proof, solver certification, generated-code correctness, execution evidence, physical-performance evidence, or safety certification.",
  root_input_domain_exhaustion: {
    method: "campaign-v1 factorized exhaustive enumeration of every finite root alphabet through its declared producing owner; downstream products consume only owner outputs through the explicit semantic connection map",
    batteryObservation: 16,
    powerManagementEvidence: 16,
    oddEngineGroupEvidence: 64,
    evenEngineGroupEvidence: 64,
    configurationEvidence: 36,
    chargerEvidence: 16,
    controlEvent: 4,
    actuationFeedback: 3
  },
  partition_counts: {
    PART_01: 16,
    PART_02: 12,
    PART_03: 16,
    PART_04: 64,
    PART_05: 64,
    PART_06: 36,
    PART_07: 125,
    PART_08: 16,
    PART_09: 45,
    PART_10: 4800,
    PART_11: 105,
    PART_12: 36000,
    PART_13: 2700
  },
  gaps: Object.values(reports).reduce((sum, report) => sum + report.gaps, 0),
  overlaps: Object.values(reports).reduce((sum, report) => sum + report.overlaps, 0),
  required_output_mismatches: requiredOutputMismatches,
  invariant_checks: invariantChecks,
  owner_reports: reports,
  case_hits: allCaseHits,
  case_witnesses: caseWitnesses,
  scenario_family_count: new Set(scenarioTraces.map(trace => trace.family)).size,
  scenario_results: scenarioResults,
  scenario_traces: scenarioTraces,
  semantic_connection_map: connectionMap,
  executed_semantic_connections: [...executedConnections].sort(),
  ownership_audit: ownershipAudit,
  failures
};

console.log(JSON.stringify(result));
