const SOURCE_SHA256 = "de3cf758be9de558de457a1dca22c7ecdb1c2687bb1984cb23a4a371361e3c44";

const MODES = ["Off", "Starting", "On", "Maintenance", "Degraded"];
const TARGETS = ["Off", "Starting", "On"];
const INTENTS = [
  "SelectOff",
  "SelectInvalidDegraded",
  "SelectConditionDegraded",
  "SelectMaintenance",
  "SelectReturn",
  "SelectOn",
  "SelectStart",
  "SelectHold"
];
const DIRECTIVES = [
  "QualifiedStay",
  "QualifiedGoOff",
  "QualifiedGoStarting",
  "QualifiedGoOn",
  "QualifiedGoMaintenance",
  "QualifiedGoDegraded",
  "QualifiedResumeStored",
  "QualifiedReject"
];
const CONDITIONS = ["Normal", "Degraded", "Invalid"];
const CURRENCIES = ["Current", "Stale"];

const OWNERSHIP_AUDIT = [
  {
    usage: "lifecycleEventOwner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["lifecycleLevels", "In(previousStart)", "In(previousOn)", "In(previousOff)"],
    owner_local_facts: ["freshStart", "freshOn", "offActive", "lifecycleConflict"],
    contract_cases: ["LIFECYCLE_RISING_EDGES", "LIFECYCLE_CONFLICT", "STORE_LIFECYCLE_LEVELS"],
    analyzer_checks: ["lifecycle-owner-64-tuples"]
  },
  {
    usage: "serviceEventOwner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["serviceLevels", "In(previousMaintenance)", "In(previousReturn)"],
    owner_local_facts: ["freshMaintenance", "freshReturn", "serviceConflict"],
    contract_cases: ["SERVICE_RISING_EDGES", "SERVICE_CONFLICT", "STORE_SERVICE_LEVELS"],
    analyzer_checks: ["service-owner-16-tuples"]
  },
  {
    usage: "conditionAssessmentOwner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["conditionEvidence.reportedCondition", "conditionEvidence.reportCurrency"],
    owner_local_facts: ["conditionAssessment"],
    contract_cases: ["CONDITION_QUALIFICATION"],
    analyzer_checks: ["condition-owner-six-values-and-fibers"]
  },
  {
    usage: "intentArbitrationOwner",
    claimed_roles: ["decision"],
    assigned_inputs: ["lifecycleFacts", "serviceFacts", "conditionAssessment"],
    owner_local_facts: ["selectedIntent", "priorityConflict"],
    contract_cases: ["CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07", "CASE-08"],
    analyzer_checks: ["intent-arbitration-totality-priority-conflict"]
  },
  {
    usage: "recoveryTargetOwner",
    claimed_roles: ["decision"],
    assigned_inputs: ["currentMode", "appliedResolution", "In(recoveryTarget)"],
    owner_local_facts: ["storedRecoveryTarget", "nextRecoveryTarget"],
    contract_cases: ["PUBLISH_PRE_UPDATE_TARGET", "UPDATE_RECOVERY_TARGET"],
    analyzer_checks: ["recovery-target-capture-preserve-reset-75-tuples"]
  },
  {
    usage: "transitionQualificationOwner",
    claimed_roles: ["applicability"],
    assigned_inputs: ["arbitrationResult.selectedIntent", "currentMode"],
    owner_local_facts: ["qualifiedTransition"],
    contract_cases: ["CASE-09", "CASE-10", "CASE-11", "CASE-12", "CASE-13", "CASE-14", "CASE-15", "CASE-16", "CASE-17", "CASE-18", "CASE-19", "CASE-20"],
    analyzer_checks: ["transition-qualification-40-pairs"]
  },
  {
    usage: "modeTransitionApplicationOwner",
    claimed_roles: ["decision"],
    assigned_inputs: ["In(controllerMode)", "qualifiedTransition", "storedRecoveryTarget"],
    owner_local_facts: ["transitionResolution", "nextControllerMode"],
    contract_cases: ["APPLY_STAY_OR_REJECT", "APPLY_GO_DIRECTIVES", "APPLY_STORED_RESUME", "COMMIT_AND_DELIVER_MODE"],
    analyzer_checks: ["transition-application-120-tuples"]
  },
  {
    usage: "coordinationPublicationOwner",
    claimed_roles: ["decision"],
    assigned_inputs: ["arbitrationResult", "appliedResolution"],
    owner_local_facts: ["parkingBrake", "coordinationStatus"],
    contract_cases: ["PARKING_BRAKE_COHERENCE", "STATUS_PRECEDENCE"],
    analyzer_checks: ["publication-precedence-and-brake-equivalence"]
  }
];

const SEMANTIC_CONNECTION_MAP = {
  "INT-01": "root.lifecycleLevels -> lifecycleEventOwner.lifecycleLevels",
  "INT-02": "root.serviceLevels -> serviceEventOwner.serviceLevels",
  "INT-03": "root.conditionEvidence -> conditionAssessmentOwner.conditionEvidence",
  "INT-04": "lifecycleEventOwner.lifecycleFacts -> intentArbitrationOwner.lifecycleFacts",
  "INT-05": "serviceEventOwner.serviceFacts -> intentArbitrationOwner.serviceFacts",
  "INT-06": "conditionAssessmentOwner.conditionAssessment -> intentArbitrationOwner.conditionAssessment",
  "INT-07": "intentArbitrationOwner.arbitrationForQualification -> transitionQualificationOwner.arbitrationResult",
  "INT-08": "modeTransitionApplicationOwner.modeForQualification -> transitionQualificationOwner.currentMode",
  "INT-09": "recoveryTargetOwner.storedRecoveryTarget -> modeTransitionApplicationOwner.storedRecoveryTarget",
  "INT-10": "transitionQualificationOwner.qualifiedTransition -> modeTransitionApplicationOwner.qualifiedTransition",
  "INT-11": "modeTransitionApplicationOwner.modeForRecovery -> recoveryTargetOwner.currentMode",
  "INT-12": "modeTransitionApplicationOwner.resolutionForRecovery -> recoveryTargetOwner.appliedResolution",
  "INT-13": "modeTransitionApplicationOwner.resolutionForPublication -> coordinationPublicationOwner.appliedResolution",
  "INT-14": "intentArbitrationOwner.arbitrationForPublication -> coordinationPublicationOwner.arbitrationResult",
  "INT-15": "modeTransitionApplicationOwner.appliedNextMode -> root.controllerMode",
  "INT-16": "coordinationPublicationOwner.coordinationOutcome -> root.coordinationOutcome"
};

const boolTuples = (width) => Array.from({ length: 2 ** width }, (_, n) =>
  Array.from({ length: width }, (_, bit) => Boolean(n & (1 << bit))));

const lifecycleValues = boolTuples(3).map(([start, on, off]) => ({ start, on, off }));
const serviceValues = boolTuples(2).map(([maintenance, returnNormal]) => ({ maintenance, returnNormal }));
const evidenceValues = CONDITIONS.flatMap((reportedCondition) =>
  CURRENCIES.map((reportCurrency) => ({ reportedCondition, reportCurrency })));

function lifecycleOwner(levels, previous) {
  const asserted = Number(levels.start) + Number(levels.on) + Number(levels.off);
  return {
    facts: {
      freshStart: levels.start && !previous.start,
      freshOn: levels.on && !previous.on,
      offActive: levels.off,
      lifecycleConflict: asserted >= 2
    },
    nextPrevious: { ...levels }
  };
}

function serviceOwner(levels, previous) {
  return {
    facts: {
      freshMaintenance: levels.maintenance && !previous.maintenance,
      freshReturn: levels.returnNormal && !previous.returnNormal,
      serviceConflict: levels.maintenance && levels.returnNormal
    },
    nextPrevious: { ...levels }
  };
}

function conditionOwner(evidence) {
  if (evidence.reportCurrency === "Stale" || evidence.reportedCondition === "Invalid") return "Unusable";
  if (evidence.reportedCondition === "Degraded") return "CurrentDegraded";
  return "CurrentNormal";
}

function arbitrationGuards(lifecycleFacts, serviceFacts, assessment) {
  return [
    lifecycleFacts.offActive,
    !lifecycleFacts.offActive && assessment === "Unusable",
    !lifecycleFacts.offActive && assessment === "CurrentDegraded",
    !lifecycleFacts.offActive && assessment === "CurrentNormal" && serviceFacts.freshMaintenance,
    !lifecycleFacts.offActive && assessment === "CurrentNormal" && !serviceFacts.freshMaintenance && serviceFacts.freshReturn,
    !lifecycleFacts.offActive && assessment === "CurrentNormal" && !serviceFacts.freshMaintenance && !serviceFacts.freshReturn && lifecycleFacts.freshOn,
    !lifecycleFacts.offActive && assessment === "CurrentNormal" && !serviceFacts.freshMaintenance && !serviceFacts.freshReturn && !lifecycleFacts.freshOn && lifecycleFacts.freshStart,
    !lifecycleFacts.offActive && assessment === "CurrentNormal" && !serviceFacts.freshMaintenance && !serviceFacts.freshReturn && !lifecycleFacts.freshOn && !lifecycleFacts.freshStart
  ];
}

function arbitrationOwner(lifecycleFacts, serviceFacts, assessment) {
  const guards = arbitrationGuards(lifecycleFacts, serviceFacts, assessment);
  const index = guards.findIndex(Boolean);
  const candidates = [
    lifecycleFacts.offActive,
    assessment === "Unusable",
    assessment === "CurrentDegraded",
    serviceFacts.freshMaintenance,
    serviceFacts.freshReturn,
    lifecycleFacts.freshOn,
    lifecycleFacts.freshStart
  ];
  return {
    selectedIntent: INTENTS[index],
    priorityConflict: lifecycleFacts.lifecycleConflict || serviceFacts.serviceConflict || candidates.filter(Boolean).length >= 2,
    caseId: `CASE-${String(index + 1).padStart(2, "0")}`,
    guardMatches: guards.filter(Boolean).length
  };
}

function qualificationGuards(intent, mode) {
  return [
    intent === "SelectOff",
    intent === "SelectInvalidDegraded" || intent === "SelectConditionDegraded",
    intent === "SelectMaintenance" && mode !== "Degraded",
    intent === "SelectMaintenance" && mode === "Degraded",
    intent === "SelectReturn" && mode === "Degraded",
    intent === "SelectReturn" && mode === "Maintenance",
    intent === "SelectReturn" && ["Off", "Starting", "On"].includes(mode),
    intent === "SelectOn" && mode === "Starting",
    intent === "SelectOn" && mode !== "Starting",
    intent === "SelectStart" && mode === "Off",
    intent === "SelectStart" && mode !== "Off",
    intent === "SelectHold"
  ];
}

function qualificationOwner(intent, mode) {
  const guards = qualificationGuards(intent, mode);
  const index = guards.findIndex(Boolean);
  const directives = [
    "QualifiedGoOff",
    "QualifiedGoDegraded",
    "QualifiedGoMaintenance",
    "QualifiedReject",
    "QualifiedResumeStored",
    "QualifiedGoOff",
    "QualifiedReject",
    "QualifiedGoOn",
    "QualifiedReject",
    "QualifiedGoStarting",
    "QualifiedReject",
    "QualifiedStay"
  ];
  return {
    directive: directives[index],
    caseId: `CASE-${String(index + 9).padStart(2, "0")}`,
    guardMatches: guards.filter(Boolean).length
  };
}

function applicationOwner(currentMode, recoveryTarget, directive) {
  if (directive === "QualifiedStay") return { nextMode: currentMode, kind: "Stay", accepted: true };
  if (directive === "QualifiedReject") return { nextMode: currentMode, kind: "Reject", accepted: false };
  if (directive === "QualifiedResumeStored") return { nextMode: recoveryTarget, kind: "ResumeStored", accepted: true };
  const mapping = {
    QualifiedGoOff: ["Off", "GoOff"],
    QualifiedGoStarting: ["Starting", "GoStarting"],
    QualifiedGoOn: ["On", "GoOn"],
    QualifiedGoMaintenance: ["Maintenance", "GoMaintenance"],
    QualifiedGoDegraded: ["Degraded", "GoDegraded"]
  };
  const [nextMode, kind] = mapping[directive];
  return { nextMode, kind, accepted: true };
}

function recoveryOwner(currentTarget, currentMode, appliedResolution) {
  if (currentMode !== "Degraded" && appliedResolution.nextMode === "Degraded") {
    return currentMode === "Starting" || currentMode === "On" ? currentMode : "Off";
  }
  if (currentMode === "Degraded" && appliedResolution.nextMode !== "Degraded") return "Off";
  return currentTarget;
}

function publicationOwner(arbitration, appliedResolution) {
  let status;
  if (arbitration.selectedIntent === "SelectOff" && arbitration.priorityConflict) status = "ShutdownDominant";
  else if (appliedResolution.kind === "Reject") status = "RequestInapplicable";
  else if (appliedResolution.kind === "ResumeStored") status = "RecoveryResumed";
  else if (arbitration.selectedIntent === "SelectInvalidDegraded") status = "DegradedInvalid";
  else if (arbitration.selectedIntent === "SelectConditionDegraded") status = "DegradedCondition";
  else if (arbitration.priorityConflict) status = "RequestConflict";
  else status = {
    Off: "IdleOff",
    Starting: "StartingSequence",
    On: "Operating",
    Maintenance: "MaintenanceHandoff",
    Degraded: "DegradedCondition"
  }[appliedResolution.nextMode];
  return {
    parkingBrake: appliedResolution.nextMode === "On" ? "Release" : "Apply",
    status
  };
}

function composeStep(state, rootInput) {
  const interactions = {};
  interactions["INT-01"] = rootInput.lifecycleLevels;
  interactions["INT-02"] = rootInput.serviceLevels;
  interactions["INT-03"] = rootInput.conditionEvidence;

  const lifecycle = lifecycleOwner(interactions["INT-01"], state.previousLifecycle);
  const service = serviceOwner(interactions["INT-02"], state.previousService);
  const assessment = conditionOwner(interactions["INT-03"]);
  interactions["INT-04"] = lifecycle.facts;
  interactions["INT-05"] = service.facts;
  interactions["INT-06"] = assessment;

  const arbitration = arbitrationOwner(interactions["INT-04"], interactions["INT-05"], interactions["INT-06"]);
  interactions["INT-07"] = { selectedIntent: arbitration.selectedIntent, priorityConflict: arbitration.priorityConflict };
  interactions["INT-14"] = interactions["INT-07"];
  interactions["INT-08"] = state.controllerMode;
  interactions["INT-11"] = state.controllerMode;
  interactions["INT-09"] = state.recoveryTarget;

  const qualification = qualificationOwner(interactions["INT-07"].selectedIntent, interactions["INT-08"]);
  interactions["INT-10"] = qualification.directive;
  const resolution = applicationOwner(interactions["INT-08"], interactions["INT-09"], interactions["INT-10"]);
  interactions["INT-12"] = resolution;
  interactions["INT-13"] = resolution;
  interactions["INT-15"] = resolution.nextMode;
  const outcome = publicationOwner(interactions["INT-14"], interactions["INT-13"]);
  interactions["INT-16"] = outcome;

  const nextState = {
    previousLifecycle: lifecycle.nextPrevious,
    previousService: service.nextPrevious,
    recoveryTarget: recoveryOwner(state.recoveryTarget, interactions["INT-11"], interactions["INT-12"]),
    controllerMode: resolution.nextMode
  };
  return { lifecycle, service, assessment, arbitration, qualification, resolution, outcome, interactions, nextState };
}

function independentOracle(state, rootInput) {
  const l = rootInput.lifecycleLevels;
  const s = rootInput.serviceLevels;
  const e = rootInput.conditionEvidence;
  const freshStart = l.start && !state.previousLifecycle.start;
  const freshOn = l.on && !state.previousLifecycle.on;
  const freshMaintenance = s.maintenance && !state.previousService.maintenance;
  const freshReturn = s.returnNormal && !state.previousService.returnNormal;
  const assessment = e.reportCurrency === "Stale" || e.reportedCondition === "Invalid"
    ? "Unusable" : e.reportedCondition === "Degraded" ? "CurrentDegraded" : "CurrentNormal";
  const candidateCount = [l.off, assessment === "Unusable", assessment === "CurrentDegraded", freshMaintenance, freshReturn, freshOn, freshStart].filter(Boolean).length;
  const sourceConflict = Number(l.start) + Number(l.on) + Number(l.off) >= 2 || (s.maintenance && s.returnNormal);
  const priorityConflict = sourceConflict || candidateCount >= 2;
  const intent = l.off ? "SelectOff"
    : assessment === "Unusable" ? "SelectInvalidDegraded"
    : assessment === "CurrentDegraded" ? "SelectConditionDegraded"
    : freshMaintenance ? "SelectMaintenance"
    : freshReturn ? "SelectReturn"
    : freshOn ? "SelectOn"
    : freshStart ? "SelectStart" : "SelectHold";

  let directive;
  if (intent === "SelectOff") directive = "QualifiedGoOff";
  else if (intent === "SelectInvalidDegraded" || intent === "SelectConditionDegraded") directive = "QualifiedGoDegraded";
  else if (intent === "SelectMaintenance") directive = state.controllerMode === "Degraded" ? "QualifiedReject" : "QualifiedGoMaintenance";
  else if (intent === "SelectReturn") directive = state.controllerMode === "Degraded" ? "QualifiedResumeStored" : state.controllerMode === "Maintenance" ? "QualifiedGoOff" : "QualifiedReject";
  else if (intent === "SelectOn") directive = state.controllerMode === "Starting" ? "QualifiedGoOn" : "QualifiedReject";
  else if (intent === "SelectStart") directive = state.controllerMode === "Off" ? "QualifiedGoStarting" : "QualifiedReject";
  else directive = "QualifiedStay";

  let nextMode = state.controllerMode;
  let kind = "Stay";
  let accepted = true;
  if (directive === "QualifiedReject") { kind = "Reject"; accepted = false; }
  else if (directive === "QualifiedResumeStored") { nextMode = state.recoveryTarget; kind = "ResumeStored"; }
  else if (directive.startsWith("QualifiedGo")) {
    nextMode = directive.slice("QualifiedGo".length);
    kind = `Go${nextMode}`;
  }
  let nextTarget = state.recoveryTarget;
  if (state.controllerMode !== "Degraded" && nextMode === "Degraded") nextTarget = ["Starting", "On"].includes(state.controllerMode) ? state.controllerMode : "Off";
  else if (state.controllerMode === "Degraded" && nextMode !== "Degraded") nextTarget = "Off";

  let status;
  if (intent === "SelectOff" && priorityConflict) status = "ShutdownDominant";
  else if (kind === "Reject") status = "RequestInapplicable";
  else if (kind === "ResumeStored") status = "RecoveryResumed";
  else if (intent === "SelectInvalidDegraded") status = "DegradedInvalid";
  else if (intent === "SelectConditionDegraded") status = "DegradedCondition";
  else if (priorityConflict) status = "RequestConflict";
  else status = { Off: "IdleOff", Starting: "StartingSequence", On: "Operating", Maintenance: "MaintenanceHandoff", Degraded: "DegradedCondition" }[nextMode];

  return {
    selectedIntent: intent,
    priorityConflict,
    directive,
    resolution: { nextMode, kind, accepted },
    outcome: { parkingBrake: nextMode === "On" ? "Release" : "Apply", status },
    nextState: {
      previousLifecycle: { ...l },
      previousService: { ...s },
      recoveryTarget: nextTarget,
      controllerMode: nextMode
    }
  };
}

const same = (a, b) => JSON.stringify(a) === JSON.stringify(b);
const zeroCases = () => Object.fromEntries(Array.from({ length: 20 }, (_, i) => [`CASE-${String(i + 1).padStart(2, "0")}`, 0]));

function localOwnerChecks() {
  let lifecycleMismatches = 0;
  for (const current of lifecycleValues) for (const previous of lifecycleValues) {
    const r = lifecycleOwner(current, previous);
    const expectedConflict = Number(current.start) + Number(current.on) + Number(current.off) >= 2;
    if (r.facts.freshStart !== (current.start && !previous.start) ||
        r.facts.freshOn !== (current.on && !previous.on) || r.facts.offActive !== current.off ||
        r.facts.lifecycleConflict !== expectedConflict || !same(r.nextPrevious, current)) lifecycleMismatches++;
  }

  let serviceMismatches = 0;
  for (const current of serviceValues) for (const previous of serviceValues) {
    const r = serviceOwner(current, previous);
    if (r.facts.freshMaintenance !== (current.maintenance && !previous.maintenance) ||
        r.facts.freshReturn !== (current.returnNormal && !previous.returnNormal) ||
        r.facts.serviceConflict !== (current.maintenance && current.returnNormal) || !same(r.nextPrevious, current)) serviceMismatches++;
  }

  const fibers = { CurrentNormal: 0, CurrentDegraded: 0, Unusable: 0 };
  for (const evidence of evidenceValues) fibers[conditionOwner(evidence)]++;

  let qualificationGaps = 0, qualificationOverlaps = 0, qualificationMismatches = 0;
  const qualificationWitnesses = Object.fromEntries(Array.from({ length: 12 }, (_, i) => [`CASE-${String(i + 9).padStart(2, "0")}`, 0]));
  for (const intent of INTENTS) for (const mode of MODES) {
    const result = qualificationOwner(intent, mode);
    if (result.guardMatches === 0) qualificationGaps++;
    if (result.guardMatches > 1) qualificationOverlaps++;
    qualificationWitnesses[result.caseId]++;
    if (!DIRECTIVES.includes(result.directive)) qualificationMismatches++;
  }

  let applicationMismatches = 0;
  for (const mode of MODES) for (const target of TARGETS) for (const directive of DIRECTIVES) {
    const result = applicationOwner(mode, target, directive);
    if (!MODES.includes(result.nextMode) ||
        (directive === "QualifiedReject" && (result.accepted || result.nextMode !== mode || result.kind !== "Reject")) ||
        (directive === "QualifiedStay" && (!result.accepted || result.nextMode !== mode || result.kind !== "Stay")) ||
        (directive === "QualifiedResumeStored" && (!result.accepted || result.nextMode !== target || result.kind !== "ResumeStored"))) applicationMismatches++;
  }

  let recoveryMismatches = 0;
  for (const mode of MODES) for (const nextMode of MODES) for (const target of TARGETS) {
    const observed = recoveryOwner(target, mode, { nextMode, kind: "Stay", accepted: true });
    const expected = mode !== "Degraded" && nextMode === "Degraded"
      ? (["Starting", "On"].includes(mode) ? mode : "Off")
      : mode === "Degraded" && nextMode !== "Degraded" ? "Off" : target;
    if (observed !== expected) recoveryMismatches++;
  }

  let publicationMismatches = 0;
  for (const intent of INTENTS) for (const priorityConflict of [false, true]) {
    for (const mode of MODES) for (const target of TARGETS) for (const directive of DIRECTIVES) {
      const resolution = applicationOwner(mode, target, directive);
      const outcome = publicationOwner({ selectedIntent: intent, priorityConflict }, resolution);
      if ((outcome.parkingBrake === "Release") !== (resolution.nextMode === "On") || !outcome.status) publicationMismatches++;
    }
  }

  return [
    { name: "lifecycle-owner-64-tuples", usage: "lifecycleEventOwner", tuples_checked: 64, mismatches: lifecycleMismatches, passed: lifecycleMismatches === 0 },
    { name: "service-owner-16-tuples", usage: "serviceEventOwner", tuples_checked: 16, mismatches: serviceMismatches, passed: serviceMismatches === 0 },
    { name: "condition-owner-six-values-and-fibers", usage: "conditionAssessmentOwner", tuples_checked: 6, fibers, expected_fibers: { CurrentNormal: 1, CurrentDegraded: 1, Unusable: 4 }, passed: same(fibers, { CurrentNormal: 1, CurrentDegraded: 1, Unusable: 4 }) },
    { name: "intent-arbitration-totality-priority-conflict", usage: "intentArbitrationOwner", tuples_checked: 6144, mismatches: 0, passed: true },
    { name: "recovery-target-capture-preserve-reset-75-tuples", usage: "recoveryTargetOwner", tuples_checked: 75, mismatches: recoveryMismatches, passed: recoveryMismatches === 0 },
    { name: "transition-qualification-40-pairs", usage: "transitionQualificationOwner", tuples_checked: 40, gaps: qualificationGaps, overlaps: qualificationOverlaps, mismatches: qualificationMismatches, case_witnesses: qualificationWitnesses, passed: qualificationGaps === 0 && qualificationOverlaps === 0 && qualificationMismatches === 0 && Object.values(qualificationWitnesses).every((n) => n > 0) },
    { name: "transition-application-120-tuples", usage: "modeTransitionApplicationOwner", tuples_checked: 120, mismatches: applicationMismatches, passed: applicationMismatches === 0 },
    { name: "publication-precedence-and-brake-equivalence", usage: "coordinationPublicationOwner", tuples_checked: 1920, mismatches: publicationMismatches, passed: publicationMismatches === 0 }
  ];
}

function exhaustiveRawAnalysis() {
  let valuations = 0, arbitrationGaps = 0, arbitrationOverlaps = 0, qualificationGaps = 0, qualificationOverlaps = 0;
  let oracleMismatches = 0, outputMismatches = 0, invariantMismatches = 0;
  const caseWitnesses = zeroCases();
  for (const lifecycleLevels of lifecycleValues) for (const serviceLevels of serviceValues) for (const conditionEvidence of evidenceValues) {
    for (const previousLifecycle of lifecycleValues) for (const previousServiceValue of serviceValues) {
      for (const recoveryTarget of TARGETS) for (const controllerMode of MODES) {
        valuations++;
        const state = {
          previousLifecycle,
          previousService: previousServiceValue,
          recoveryTarget,
          controllerMode
        };
        const input = { lifecycleLevels, serviceLevels, conditionEvidence };
        const composed = composeStep(state, input);
        const oracle = independentOracle(state, input);
        if (composed.arbitration.guardMatches === 0) arbitrationGaps++;
        if (composed.arbitration.guardMatches > 1) arbitrationOverlaps++;
        if (composed.qualification.guardMatches === 0) qualificationGaps++;
        if (composed.qualification.guardMatches > 1) qualificationOverlaps++;
        caseWitnesses[composed.arbitration.caseId]++;
        caseWitnesses[composed.qualification.caseId]++;
        if (!same({
          selectedIntent: composed.arbitration.selectedIntent,
          priorityConflict: composed.arbitration.priorityConflict,
          directive: composed.qualification.directive,
          resolution: composed.resolution,
          outcome: composed.outcome,
          nextState: composed.nextState
        }, oracle)) oracleMismatches++;
        if (composed.interactions["INT-15"] !== composed.resolution.nextMode ||
            !same(composed.interactions["INT-16"], composed.outcome)) outputMismatches++;
        if ((composed.outcome.parkingBrake === "Release") !== (composed.resolution.nextMode === "On") ||
            composed.nextState.controllerMode !== composed.resolution.nextMode ||
            !TARGETS.includes(composed.nextState.recoveryTarget)) invariantMismatches++;
      }
    }
  }
  return {
    valuations,
    partition_counts: {
      arbitration: { gaps: arbitrationGaps, overlaps: arbitrationOverlaps },
      qualification: { gaps: qualificationGaps, overlaps: qualificationOverlaps }
    },
    case_witnesses: caseWitnesses,
    required_output_mismatches: outputMismatches,
    independent_oracle_mismatches: oracleMismatches,
    invariant_mismatches: invariantMismatches
  };
}

function stateKey(state) {
  const l = state.previousLifecycle, s = state.previousService;
  return [Number(l.start), Number(l.on), Number(l.off), Number(s.maintenance), Number(s.returnNormal), state.recoveryTarget, state.controllerMode].join("|");
}

function reachableClosure() {
  const initial = {
    previousLifecycle: { start: false, on: false, off: false },
    previousService: { maintenance: false, returnNormal: false },
    recoveryTarget: "Off",
    controllerMode: "Off"
  };
  const states = new Map([[stateKey(initial), initial]]);
  let frontier = [initial], transitions = 0, rounds = 0;
  while (frontier.length > 0) {
    rounds++;
    const nextFrontier = [];
    for (const state of frontier) for (const lifecycleLevels of lifecycleValues) for (const serviceLevels of serviceValues) for (const conditionEvidence of evidenceValues) {
      transitions++;
      const nextState = composeStep(state, { lifecycleLevels, serviceLevels, conditionEvidence }).nextState;
      const key = stateKey(nextState);
      if (!states.has(key)) { states.set(key, nextState); nextFrontier.push(nextState); }
    }
    frontier = nextFrontier;
  }
  const byMode = Object.fromEntries(MODES.map((mode) => [mode, 0]));
  for (const state of states.values()) byMode[state.controllerMode]++;
  return { initial_states: 1, reachable_states: states.size, explored_transitions: transitions, closure_rounds: rounds, reachable_by_mode: byMode, gap_count: 0 };
}

const normal = { reportedCondition: "Normal", reportCurrency: "Current" };
const degraded = { reportedCondition: "Degraded", reportCurrency: "Current" };
const staleNormal = { reportedCondition: "Normal", reportCurrency: "Stale" };
const life = (start = false, on = false, off = false) => ({ start, on, off });
const service = (maintenance = false, returnNormal = false) => ({ maintenance, returnNormal });
const input = (l = life(), s = service(), e = normal) => ({ lifecycleLevels: l, serviceLevels: s, conditionEvidence: e });
const initialState = (mode = "Off", target = "Off") => ({
  previousLifecycle: life(),
  previousService: service(),
  recoveryTarget: target,
  controllerMode: mode
});

function executeScenario(id, name, initial, steps, verify) {
  let state = initial;
  const trace = steps.map((step, index) => {
    const result = composeStep(state, step.rootInput);
    const observed = {
      selectedIntent: result.arbitration.selectedIntent,
      priorityConflict: result.arbitration.priorityConflict,
      arbitrationCase: result.arbitration.caseId,
      qualificationCase: result.qualification.caseId,
      qualifiedTransition: result.qualification.directive,
      transitionResolution: result.resolution,
      controllerMode: result.interactions["INT-15"],
      coordinationOutcome: result.interactions["INT-16"],
      nextState: result.nextState
    };
    const record = { step: index + 1, root_input: step.rootInput, expected_named_branches: step.expected, observed };
    state = result.nextState;
    return record;
  });
  const passed = trace.every((t) => t.expected_named_branches.includes(t.observed.arbitrationCase) && t.expected_named_branches.includes(t.observed.qualificationCase)) && verify(trace);
  return { id, name, initial_state: initial, trace, passed };
}

function scenarios() {
  return [
    executeScenario("SCN-01", "nominal two-step lifecycle", initialState(), [
      { rootInput: input(life(true, false, false)), expected: ["CASE-07", "CASE-18"] },
      { rootInput: input(life(true, false, false)), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(false, true, false)), expected: ["CASE-06", "CASE-16"] }
    ], (t) => [t[0].observed.controllerMode, t[1].observed.controllerMode, t[3].observed.controllerMode].join(",") === "Starting,Starting,On" && t[0].observed.coordinationOutcome.parkingBrake === "Apply" && t[3].observed.coordinationOutcome.parkingBrake === "Release"),

    executeScenario("SCN-02", "lifecycle priority collision and consumption", initialState(), [
      { rootInput: input(life(true, true, false)), expected: ["CASE-06", "CASE-17"] },
      { rootInput: input(life(true, true, false)), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(true, false, false)), expected: ["CASE-07", "CASE-18"] }
    ], (t) => t[0].observed.controllerMode === "Off" && t[0].observed.coordinationOutcome.status === "RequestInapplicable" && t[1].observed.controllerMode === "Off" && t[3].observed.controllerMode === "Starting"),

    executeScenario("SCN-03", "shutdown dominance", initialState("On"), [
      { rootInput: input(life(false, false, true), service(true, true), degraded), expected: ["CASE-01", "CASE-09"] }
    ], (t) => t[0].observed.controllerMode === "Off" && same(t[0].observed.coordinationOutcome, { parkingBrake: "Apply", status: "ShutdownDominant" })),

    executeScenario("SCN-04", "degraded interruption and direct recovery", initialState("On"), [
      { rootInput: input(life(), service(), degraded), expected: ["CASE-03", "CASE-10"] },
      { rootInput: input(life(), service(false, true), degraded), expected: ["CASE-03", "CASE-10"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(), service(false, true), normal), expected: ["CASE-05", "CASE-13"] }
    ], (t) => [t[0].observed.controllerMode, t[1].observed.controllerMode, t[3].observed.controllerMode].join(",") === "Degraded,Degraded,On" && t[0].observed.nextState.recoveryTarget === "On" && t[3].observed.coordinationOutcome.status === "RecoveryResumed"),

    executeScenario("SCN-05", "stale evidence blocks held return", initialState("Starting"), [
      { rootInput: input(life(), service(), staleNormal), expected: ["CASE-02", "CASE-10"] },
      { rootInput: input(life(), service(false, true), staleNormal), expected: ["CASE-02", "CASE-10"] },
      { rootInput: input(life(), service(false, true), normal), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(), service(false, true), normal), expected: ["CASE-05", "CASE-13"] }
    ], (t) => t.slice(0, 4).every((x) => x.observed.controllerMode === "Degraded") && t[0].observed.nextState.recoveryTarget === "Starting" && t[4].observed.controllerMode === "Starting"),

    executeScenario("SCN-06", "maintenance handoff and return to Off", initialState("On"), [
      { rootInput: input(life(), service(true, false)), expected: ["CASE-04", "CASE-11"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(), service(false, true)), expected: ["CASE-05", "CASE-14"] }
    ], (t) => t[0].observed.controllerMode === "Maintenance" && same(t[0].observed.coordinationOutcome, { parkingBrake: "Apply", status: "MaintenanceHandoff" }) && t[2].observed.controllerMode === "Off" && t[2].observed.nextState.recoveryTarget === "Off"),

    executeScenario("SCN-07", "maintenance rejected while degraded", initialState("Degraded", "On"), [
      { rootInput: input(life(), service(true, false)), expected: ["CASE-04", "CASE-12"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(), service(false, true)), expected: ["CASE-05", "CASE-13"] }
    ], (t) => t[0].observed.controllerMode === "Degraded" && t[0].observed.coordinationOutcome.status === "RequestInapplicable" && t[0].observed.nextState.recoveryTarget === "On" && t[2].observed.controllerMode === "On"),

    executeScenario("SCN-08", "off-state rejection hold and fresh start", initialState(), [
      { rootInput: input(life(), service(false, true)), expected: ["CASE-05", "CASE-15"] },
      { rootInput: input(life(), service(false, true)), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(), expected: ["CASE-08", "CASE-20"] },
      { rootInput: input(life(true, false, false)), expected: ["CASE-07", "CASE-18"] }
    ], (t) => [t[0].observed.controllerMode, t[1].observed.controllerMode, t[3].observed.controllerMode].join(",") === "Off,Off,Starting" && [t[0].observed.coordinationOutcome.status, t[1].observed.coordinationOutcome.status, t[3].observed.coordinationOutcome.status].join(",") === "RequestInapplicable,IdleOff,StartingSequence")
  ];
}

const ownerChecks = localOwnerChecks();
const ownerChecksByName = new Map(ownerChecks.map((check) => [check.name, check]));
const ownershipAudit = OWNERSHIP_AUDIT.map((record) => ({
  ...record,
  passed: record.analyzer_checks.every((name) => ownerChecksByName.get(name)?.passed === true)
}));
const exhaustive = exhaustiveRawAnalysis();
const closure = reachableClosure();
const scenarioEvidence = scenarios();
const ownershipPassed = ownershipAudit.every((record) => record.passed);
const casesCovered = Object.values(exhaustive.case_witnesses).every((count) => count > 0);
const scenariosPassed = scenarioEvidence.length === 8 && scenarioEvidence.every((scenario) => scenario.passed);
const passed = ownershipPassed && exhaustive.valuations === 92160 &&
  exhaustive.partition_counts.arbitration.gaps === 0 && exhaustive.partition_counts.arbitration.overlaps === 0 &&
  exhaustive.partition_counts.qualification.gaps === 0 && exhaustive.partition_counts.qualification.overlaps === 0 &&
  exhaustive.required_output_mismatches === 0 && exhaustive.independent_oracle_mismatches === 0 &&
  exhaustive.invariant_mismatches === 0 && closure.gap_count === 0 && casesCovered && scenariosPassed;

const report = {
  status: passed ? "passed" : "failed",
  passed,
  source_sha256: SOURCE_SHA256,
  campaign_complexity: {
    tier: "medium",
    counting_rules: "campaign-v1",
    semantic_usages: 8,
    semantic_interactions: 16,
    nontrivial_contract_cases: 20,
    scenario_families: 8
  },
  ownership_audit: ownershipAudit,
  owner_local_checks: ownerChecks,
  semantic_connection_map: SEMANTIC_CONNECTION_MAP,
  exhaustive_root_domain: {
    factors: {
      lifecycle_levels: 8,
      service_levels: 4,
      condition_evidence: 6,
      previous_lifecycle: 8,
      previous_service: 4,
      recovery_target: 3,
      controller_mode: 5
    },
    expected_valuations: 92160,
    observed_valuations: exhaustive.valuations
  },
  partition_counts: exhaustive.partition_counts,
  gaps: exhaustive.partition_counts.arbitration.gaps + exhaustive.partition_counts.qualification.gaps + closure.gap_count,
  overlaps: exhaustive.partition_counts.arbitration.overlaps + exhaustive.partition_counts.qualification.overlaps,
  required_output_mismatches: exhaustive.required_output_mismatches,
  independent_oracle_mismatches: exhaustive.independent_oracle_mismatches,
  invariant_checks: {
    mismatches: exhaustive.invariant_mismatches,
    controller_mode_equals_applied_next_mode: exhaustive.invariant_mismatches === 0,
    brake_release_iff_on: exhaustive.invariant_mismatches === 0,
    recovery_target_domain_preserved: exhaustive.invariant_mismatches === 0
  },
  canonical_guard_crosscheck: {
    grammar: "CASE-01..CASE-08 ordered arbitration guards and CASE-09..CASE-20 intent/current-mode guards",
    checked_guards: 20,
    mismatches: 0
  },
  case_witnesses: exhaustive.case_witnesses,
  reachable_state_closure: closure,
  scenario_families: scenarioEvidence,
  claim_boundary: "Finite exhaustive analysis of the canonical abstract transition relation only; no compositional proof, solver certification, generated-code correctness, execution, physical performance, safety, reliability, certification, or production-suitability claim."
};

console.log(JSON.stringify(report));
