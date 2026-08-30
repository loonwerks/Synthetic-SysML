const SOURCE_SHA256 = "0378021a553d8861748f3ca3dae1b52fde0fcba8b6caaee8d06fd29ed7100601";

const NAV = ["NOMINAL_CURRENT", "DEGRADED_CURRENT", "UNAVAILABLE_CURRENT", "STALE", "INVALID"];
const OBS = ["NO_INDICATION_CURRENT", "INDICATION_CURRENT", "UNAVAILABLE_CURRENT", "STALE", "INVALID"];
const MOTION = ["STATIONARY", "TRANSLATING", "LANDING_CONTEXT", "UNKNOWN"];
const EVENTS = ["NONE", "RESET_ONLY", "FORCE_HOLD_ONLY", "FORCE_HOLD_WITH_RESET"];
const ASSESSMENTS = ["READY", "LIMITED", "REJECTED"];
const OBSTACLE_ASSESSMENTS = ["NO_INDICATION", "INDICATED", "UNAVAILABLE"];
const BASES = ["FULL_BASIS", "RELATIVE_BASIS", "LIMITED_BASIS", "UNUSABLE_BASIS"];
const AWARENESS = ["AWARENESS_CLEAR", "ACTIVE_OBSTACLE_CONFLICT", "STATIONARY_OBSTACLE_PRESENT", "ACTIVE_AWARENESS_LOSS", "STATIONARY_AWARENESS_UNAVAILABLE"];
const PROPOSALS = ["HOLD_OBSTACLE", "HOLD_AWARENESS", "HOLD_NAVIGATION", "RESTRICT_NAVIGATION", "ALLOW_FULL"];
const ACTIONS = ["APPLY_OBSTACLE_HOLD", "APPLY_AWARENESS_HOLD", "APPLY_NAV_HOLD", "APPLY_EXTERNAL_HOLD", "APPLY_RESTRICTED", "APPLY_FULL", "ACCEPT_RESET", "IGNORE_RESET"];
const PHASES = ["WAIT_RELEASE", "ARMED", "OPEN", "LATCHED"];

const INTERACTIONS = Object.freeze({
  "INT-01": ["root.gpsEvidence", "gpsEvidenceQualifier.gpsEvidence", "NavigationEvidence"],
  "INT-02": ["root.inertialEvidence", "inertialEvidenceQualifier.inertialEvidence", "NavigationEvidence"],
  "INT-03": ["root.barometricEvidence", "barometricEvidenceQualifier.barometricEvidence", "NavigationEvidence"],
  "INT-04": ["root.obstacleEvidence", "obstacleEvidenceQualifier.obstacleEvidence", "ObstacleEvidence"],
  "INT-05": ["root.motionContext", "awarenessConditionOwner.motionContext", "MotionContext"],
  "INT-06": ["root.supervisionEvent", "eventPriorityArbiter.supervisionEvent", "SupervisionEvent"],
  "INT-07": ["gpsEvidenceQualifier.gpsAssessment", "navigationBasisOwner.gpsAssessment", "EvidenceAssessment"],
  "INT-08": ["inertialEvidenceQualifier.inertialAssessment", "navigationBasisOwner.inertialAssessment", "EvidenceAssessment"],
  "INT-09": ["barometricEvidenceQualifier.barometricAssessment", "navigationBasisOwner.barometricAssessment", "EvidenceAssessment"],
  "INT-10": ["obstacleEvidenceQualifier.obstacleAssessment", "awarenessConditionOwner.obstacleAssessment", "ObstacleAssessment"],
  "INT-11": ["navigationBasisOwner.proposalBasis", "constraintProposalOwner.navigationBasis", "NavigationBasis"],
  "INT-12": ["awarenessConditionOwner.awarenessCondition", "constraintProposalOwner.awarenessCondition", "AwarenessCondition"],
  "INT-13": ["constraintProposalOwner.constraintProposal", "eventPriorityArbiter.constraintProposal", "ConstraintProposal"],
  "INT-14": ["recoveryLatchOwner.preRecoveryPhase", "eventPriorityArbiter.preRecoveryPhase", "RecoveryPhase"],
  "INT-15": ["eventPriorityArbiter.recoveryAction", "recoveryLatchOwner.acceptedAction", "AcceptedAction"],
  "INT-16": ["eventPriorityArbiter.outcomeAction", "supervisionOutcomeOwner.acceptedAction", "AcceptedAction"],
  "INT-17": ["recoveryLatchOwner.postRecoveryPhase", "supervisionOutcomeOwner.postRecoveryPhase", "RecoveryPhase"],
  "INT-18": ["navigationBasisOwner.outcomeBasis", "supervisionOutcomeOwner.navigationBasis", "NavigationBasis"],
  "INT-19": ["supervisionOutcomeOwner.navigationUseDirective", "root.navigationUseDirective", "NavigationUseDirective"],
  "INT-20": ["supervisionOutcomeOwner.obstacleAwarenessNotice", "root.obstacleAwarenessNotice", "ObstacleAwarenessNotice"],
  "INT-21": ["supervisionOutcomeOwner.supervisionStatus", "root.supervisionStatus", "SupervisionStatus"]
});

const generatedQualifier = value => value === "NOMINAL_CURRENT" ? "READY" : value === "DEGRADED_CURRENT" ? "LIMITED" : "REJECTED";
const generatedObstacleQualifier = value => value === "NO_INDICATION_CURRENT" ? "NO_INDICATION" : value === "INDICATION_CURRENT" ? "INDICATED" : "UNAVAILABLE";

function generatedBasis(gps, inertial, barometric) {
  if (gps === "READY" && inertial === "READY" && barometric === "READY") return "FULL_BASIS";
  if (gps === "REJECTED" && inertial !== "REJECTED" && barometric !== "REJECTED") return "RELATIVE_BASIS";
  if (gps !== "REJECTED" && (inertial !== "REJECTED" || barometric !== "REJECTED")) return "LIMITED_BASIS";
  return "UNUSABLE_BASIS";
}

function generatedAwareness(obstacle, motion) {
  if (motion !== "UNKNOWN" && obstacle === "NO_INDICATION") return "AWARENESS_CLEAR";
  if ((motion === "TRANSLATING" || motion === "LANDING_CONTEXT") && obstacle === "INDICATED") return "ACTIVE_OBSTACLE_CONFLICT";
  if (motion === "STATIONARY" && obstacle === "INDICATED") return "STATIONARY_OBSTACLE_PRESENT";
  if (motion === "UNKNOWN" || ((motion === "TRANSLATING" || motion === "LANDING_CONTEXT") && obstacle === "UNAVAILABLE")) return "ACTIVE_AWARENESS_LOSS";
  return "STATIONARY_AWARENESS_UNAVAILABLE";
}

function generatedProposal(basis, awareness) {
  if (awareness === "ACTIVE_OBSTACLE_CONFLICT" || awareness === "STATIONARY_OBSTACLE_PRESENT") return "HOLD_OBSTACLE";
  if (awareness === "ACTIVE_AWARENESS_LOSS" || awareness === "STATIONARY_AWARENESS_UNAVAILABLE") return "HOLD_AWARENESS";
  if (basis === "UNUSABLE_BASIS") return "HOLD_NAVIGATION";
  if (basis === "RELATIVE_BASIS" || basis === "LIMITED_BASIS") return "RESTRICT_NAVIGATION";
  return "ALLOW_FULL";
}

function generatedArbiter(proposal, event, prePhase) {
  if (proposal === "HOLD_OBSTACLE") return "APPLY_OBSTACLE_HOLD";
  if (proposal === "HOLD_AWARENESS") return "APPLY_AWARENESS_HOLD";
  if (proposal === "HOLD_NAVIGATION") return "APPLY_NAV_HOLD";
  if (event === "FORCE_HOLD_ONLY" || event === "FORCE_HOLD_WITH_RESET") return "APPLY_EXTERNAL_HOLD";
  if (event === "RESET_ONLY" && prePhase === "ARMED") return "ACCEPT_RESET";
  if (event === "RESET_ONLY" && (prePhase === "WAIT_RELEASE" || prePhase === "LATCHED")) return "IGNORE_RESET";
  return proposal === "ALLOW_FULL" ? "APPLY_FULL" : "APPLY_RESTRICTED";
}

function generatedRecovery(prePhase, action) {
  if (["APPLY_OBSTACLE_HOLD", "APPLY_AWARENESS_HOLD", "APPLY_NAV_HOLD", "APPLY_EXTERNAL_HOLD"].includes(action)) return "LATCHED";
  if (action === "IGNORE_RESET") return "WAIT_RELEASE";
  if (action === "ACCEPT_RESET") return "OPEN";
  if (prePhase === "LATCHED" || prePhase === "WAIT_RELEASE") return "ARMED";
  return prePhase;
}

function generatedOutcome(action, postPhase, basis) {
  const obstacleAwarenessNotice = action === "APPLY_OBSTACLE_HOLD" ? "CURRENT_INDICATION" : action === "APPLY_AWARENESS_HOLD" ? "AWARENESS_UNAVAILABLE" : "NO_CURRENT_INDICATION";
  if (postPhase !== "OPEN") {
    const status = action === "APPLY_OBSTACLE_HOLD" ? "HELD_OBSTACLE_INDICATION" :
      action === "APPLY_AWARENESS_HOLD" ? "HELD_AWARENESS_LOSS" :
      action === "APPLY_NAV_HOLD" ? "HELD_NAV_EVIDENCE" :
      action === "APPLY_EXTERNAL_HOLD" ? "HELD_EXTERNAL" :
      postPhase === "WAIT_RELEASE" ? "RESET_RELEASE_REQUIRED" : "RESET_REQUIRED";
    return { navigationUseDirective: "MOTION_INHIBITED", obstacleAwarenessNotice, supervisionStatus: status };
  }
  if (basis === "FULL_BASIS") return { navigationUseDirective: "FULL_NAV_USE", obstacleAwarenessNotice, supervisionStatus: "FULL_USE" };
  return { navigationUseDirective: "RESTRICTED_NAV_USE", obstacleAwarenessNotice, supervisionStatus: "RESTRICTED_USE" };
}

const QUALIFIER_ORACLE = Object.freeze({
  NOMINAL_CURRENT: "READY", DEGRADED_CURRENT: "LIMITED", UNAVAILABLE_CURRENT: "REJECTED", STALE: "REJECTED", INVALID: "REJECTED"
});
const OBSTACLE_ORACLE = Object.freeze({
  NO_INDICATION_CURRENT: "NO_INDICATION", INDICATION_CURRENT: "INDICATED", UNAVAILABLE_CURRENT: "UNAVAILABLE", STALE: "UNAVAILABLE", INVALID: "UNAVAILABLE"
});

function oracleBasis(gps, inertial, barometric) {
  const key = `${gps}|${inertial}|${barometric}`;
  if (key === "READY|READY|READY") return "FULL_BASIS";
  if (["REJECTED|READY|READY", "REJECTED|READY|LIMITED", "REJECTED|LIMITED|READY", "REJECTED|LIMITED|LIMITED"].includes(key)) return "RELATIVE_BASIS";
  if (["REJECTED|READY|REJECTED", "REJECTED|LIMITED|REJECTED", "REJECTED|REJECTED|READY", "REJECTED|REJECTED|LIMITED", "REJECTED|REJECTED|REJECTED", "READY|REJECTED|REJECTED", "LIMITED|REJECTED|REJECTED"].includes(key)) return "UNUSABLE_BASIS";
  return "LIMITED_BASIS";
}

function oracleAwareness(obstacle, motion) {
  const key = `${motion}|${obstacle}`;
  if (["STATIONARY|NO_INDICATION", "TRANSLATING|NO_INDICATION", "LANDING_CONTEXT|NO_INDICATION"].includes(key)) return "AWARENESS_CLEAR";
  if (["TRANSLATING|INDICATED", "LANDING_CONTEXT|INDICATED"].includes(key)) return "ACTIVE_OBSTACLE_CONFLICT";
  if (key === "STATIONARY|INDICATED") return "STATIONARY_OBSTACLE_PRESENT";
  if (key === "STATIONARY|UNAVAILABLE") return "STATIONARY_AWARENESS_UNAVAILABLE";
  return "ACTIVE_AWARENESS_LOSS";
}

function oracleProposal(basis, awareness) {
  const obstacleKeys = BASES.map(b => `${b}|ACTIVE_OBSTACLE_CONFLICT`).concat(BASES.map(b => `${b}|STATIONARY_OBSTACLE_PRESENT`));
  const unavailableKeys = BASES.map(b => `${b}|ACTIVE_AWARENESS_LOSS`).concat(BASES.map(b => `${b}|STATIONARY_AWARENESS_UNAVAILABLE`));
  const key = `${basis}|${awareness}`;
  if (obstacleKeys.includes(key)) return "HOLD_OBSTACLE";
  if (unavailableKeys.includes(key)) return "HOLD_AWARENESS";
  if (key === "UNUSABLE_BASIS|AWARENESS_CLEAR") return "HOLD_NAVIGATION";
  if (key === "FULL_BASIS|AWARENESS_CLEAR") return "ALLOW_FULL";
  return "RESTRICT_NAVIGATION";
}

function oracleArbiter(proposal, event, prePhase) {
  const holdTable = { HOLD_OBSTACLE: "APPLY_OBSTACLE_HOLD", HOLD_AWARENESS: "APPLY_AWARENESS_HOLD", HOLD_NAVIGATION: "APPLY_NAV_HOLD" };
  if (holdTable[proposal]) return holdTable[proposal];
  if (["FORCE_HOLD_ONLY", "FORCE_HOLD_WITH_RESET"].includes(event)) return "APPLY_EXTERNAL_HOLD";
  if (event === "NONE") return proposal === "ALLOW_FULL" ? "APPLY_FULL" : "APPLY_RESTRICTED";
  const resetTable = {
    WAIT_RELEASE: "IGNORE_RESET", ARMED: "ACCEPT_RESET", LATCHED: "IGNORE_RESET",
    OPEN: proposal === "ALLOW_FULL" ? "APPLY_FULL" : "APPLY_RESTRICTED"
  };
  return resetTable[prePhase];
}

function oracleRecovery(prePhase, action) {
  const fixed = {
    APPLY_OBSTACLE_HOLD: "LATCHED", APPLY_AWARENESS_HOLD: "LATCHED", APPLY_NAV_HOLD: "LATCHED", APPLY_EXTERNAL_HOLD: "LATCHED",
    IGNORE_RESET: "WAIT_RELEASE", ACCEPT_RESET: "OPEN"
  };
  if (fixed[action]) return fixed[action];
  return { WAIT_RELEASE: "ARMED", LATCHED: "ARMED", ARMED: "ARMED", OPEN: "OPEN" }[prePhase];
}

function oracleOutcome(action, postPhase, basis) {
  let notice = "NO_CURRENT_INDICATION";
  if (action === "APPLY_OBSTACLE_HOLD") notice = "CURRENT_INDICATION";
  if (action === "APPLY_AWARENESS_HOLD") notice = "AWARENESS_UNAVAILABLE";
  if (postPhase === "OPEN") {
    const full = basis === "FULL_BASIS";
    return { navigationUseDirective: full ? "FULL_NAV_USE" : "RESTRICTED_NAV_USE", obstacleAwarenessNotice: notice, supervisionStatus: full ? "FULL_USE" : "RESTRICTED_USE" };
  }
  const closedStatusTable = {
    APPLY_OBSTACLE_HOLD: "HELD_OBSTACLE_INDICATION", APPLY_AWARENESS_HOLD: "HELD_AWARENESS_LOSS",
    APPLY_NAV_HOLD: "HELD_NAV_EVIDENCE", APPLY_EXTERNAL_HOLD: "HELD_EXTERNAL"
  };
  return {
    navigationUseDirective: "MOTION_INHIBITED",
    obstacleAwarenessNotice: notice,
    supervisionStatus: closedStatusTable[action] ?? (postPhase === "WAIT_RELEASE" ? "RESET_RELEASE_REQUIRED" : "RESET_REQUIRED")
  };
}

function contractOutcomeCandidates(action, postPhase, basis) {
  const navigationUseDirective = [];
  const obstacleAwarenessNotice = [];
  const supervisionStatus = [];
  if (postPhase !== "OPEN") navigationUseDirective.push("MOTION_INHIBITED");
  if (postPhase === "OPEN" && basis === "FULL_BASIS" && ["APPLY_FULL", "ACCEPT_RESET"].includes(action)) {
    navigationUseDirective.push("FULL_NAV_USE");
    supervisionStatus.push("FULL_USE");
  }
  if (postPhase === "OPEN" && ["RELATIVE_BASIS", "LIMITED_BASIS"].includes(basis) && ["APPLY_RESTRICTED", "ACCEPT_RESET"].includes(action)) {
    navigationUseDirective.push("RESTRICTED_NAV_USE");
    supervisionStatus.push("RESTRICTED_USE");
  }
  const closedStatus = {
    APPLY_OBSTACLE_HOLD: "HELD_OBSTACLE_INDICATION",
    APPLY_AWARENESS_HOLD: "HELD_AWARENESS_LOSS",
    APPLY_NAV_HOLD: "HELD_NAV_EVIDENCE",
    APPLY_EXTERNAL_HOLD: "HELD_EXTERNAL"
  };
  if (postPhase !== "OPEN" && closedStatus[action]) supervisionStatus.push(closedStatus[action]);
  if (postPhase === "WAIT_RELEASE" && ["IGNORE_RESET", "APPLY_FULL", "APPLY_RESTRICTED"].includes(action)) supervisionStatus.push("RESET_RELEASE_REQUIRED");
  if (postPhase === "ARMED" && ["APPLY_FULL", "APPLY_RESTRICTED"].includes(action)) supervisionStatus.push("RESET_REQUIRED");
  if (action === "APPLY_OBSTACLE_HOLD") obstacleAwarenessNotice.push("CURRENT_INDICATION");
  if (action === "APPLY_AWARENESS_HOLD") obstacleAwarenessNotice.push("AWARENESS_UNAVAILABLE");
  if (!["APPLY_OBSTACLE_HOLD", "APPLY_AWARENESS_HOLD"].includes(action)) obstacleAwarenessNotice.push("NO_CURRENT_INDICATION");
  return {
    navigationUseDirective: [...new Set(navigationUseDirective)],
    obstacleAwarenessNotice: [...new Set(obstacleAwarenessNotice)],
    supervisionStatus: [...new Set(supervisionStatus)]
  };
}

const interactionHits = Object.fromEntries(Object.keys(INTERACTIONS).map(id => [id, 0]));
function flow(id, value) {
  if (!INTERACTIONS[id]) throw new Error(`undeclared semantic interaction ${id}`);
  interactionHits[id]++;
  return value;
}

function composeGenerated(input) {
  const gpsEvidence = flow("INT-01", input.gpsEvidence);
  const inertialEvidence = flow("INT-02", input.inertialEvidence);
  const barometricEvidence = flow("INT-03", input.barometricEvidence);
  const obstacleEvidence = flow("INT-04", input.obstacleEvidence);
  const motionContext = flow("INT-05", input.motionContext);
  const supervisionEvent = flow("INT-06", input.supervisionEvent);
  const gpsAssessment = flow("INT-07", generatedQualifier(gpsEvidence));
  const inertialAssessment = flow("INT-08", generatedQualifier(inertialEvidence));
  const barometricAssessment = flow("INT-09", generatedQualifier(barometricEvidence));
  const obstacleAssessment = flow("INT-10", generatedObstacleQualifier(obstacleEvidence));
  const basisOwned = generatedBasis(gpsAssessment, inertialAssessment, barometricAssessment);
  const navigationBasisForProposal = flow("INT-11", basisOwned);
  const awarenessCondition = flow("INT-12", generatedAwareness(obstacleAssessment, motionContext));
  const constraintProposal = flow("INT-13", generatedProposal(navigationBasisForProposal, awarenessCondition));
  const preRecoveryPhase = flow("INT-14", input.preRecoveryPhase);
  const actionOwned = generatedArbiter(constraintProposal, supervisionEvent, preRecoveryPhase);
  const recoveryAction = flow("INT-15", actionOwned);
  const outcomeAction = flow("INT-16", actionOwned);
  const postRecoveryPhase = flow("INT-17", generatedRecovery(preRecoveryPhase, recoveryAction));
  const navigationBasis = flow("INT-18", basisOwned);
  const outputs = generatedOutcome(outcomeAction, postRecoveryPhase, navigationBasis);
  return {
    gpsAssessment, inertialAssessment, barometricAssessment, obstacleAssessment, navigationBasis,
    awarenessCondition, constraintProposal, acceptedAction: actionOwned, postRecoveryPhase,
    navigationUseDirective: flow("INT-19", outputs.navigationUseDirective),
    obstacleAwarenessNotice: flow("INT-20", outputs.obstacleAwarenessNotice),
    supervisionStatus: flow("INT-21", outputs.supervisionStatus)
  };
}

function composeOracle(input) {
  const gpsAssessment = QUALIFIER_ORACLE[input.gpsEvidence];
  const inertialAssessment = QUALIFIER_ORACLE[input.inertialEvidence];
  const barometricAssessment = QUALIFIER_ORACLE[input.barometricEvidence];
  const obstacleAssessment = OBSTACLE_ORACLE[input.obstacleEvidence];
  const navigationBasis = oracleBasis(gpsAssessment, inertialAssessment, barometricAssessment);
  const awarenessCondition = oracleAwareness(obstacleAssessment, input.motionContext);
  const constraintProposal = oracleProposal(navigationBasis, awarenessCondition);
  const acceptedAction = oracleArbiter(constraintProposal, input.supervisionEvent, input.preRecoveryPhase);
  const postRecoveryPhase = oracleRecovery(input.preRecoveryPhase, acceptedAction);
  return { gpsAssessment, inertialAssessment, barometricAssessment, obstacleAssessment, navigationBasis, awarenessCondition, constraintProposal, acceptedAction, postRecoveryPhase, ...oracleOutcome(acceptedAction, postRecoveryPhase, navigationBasis) };
}

const gaps = { qualifiers: [], navigationBasis: [], awarenessCondition: [], constraintProposal: [], eventPriorityArbiter: [], recoveryLatch: [], supervisionOutcome: [] };
const overlaps = { qualifiers: [], navigationBasis: [], awarenessCondition: [], constraintProposal: [], eventPriorityArbiter: [], recoveryLatch: [], supervisionOutcome: [] };
const mismatches = [];
const requiredOutputMismatches = [];
const caseWitnesses = {};

for (const value of NAV) {
  const guards = [value === "NOMINAL_CURRENT", value === "DEGRADED_CURRENT", ["UNAVAILABLE_CURRENT", "STALE", "INVALID"].includes(value)];
  const active = guards.filter(Boolean).length;
  if (!active) gaps.qualifiers.push(`NavigationEvidence|${value}`);
  if (active > 1) overlaps.qualifiers.push(`NavigationEvidence|${value}`);
  if (generatedQualifier(value) !== QUALIFIER_ORACLE[value]) mismatches.push({ owner: "navigationQualifier", value });
}
for (const value of OBS) {
  const guards = [value === "NO_INDICATION_CURRENT", value === "INDICATION_CURRENT", ["UNAVAILABLE_CURRENT", "STALE", "INVALID"].includes(value)];
  const active = guards.filter(Boolean).length;
  if (!active) gaps.qualifiers.push(`ObstacleEvidence|${value}`);
  if (active > 1) overlaps.qualifiers.push(`ObstacleEvidence|${value}`);
  if (generatedObstacleQualifier(value) !== OBSTACLE_ORACLE[value]) mismatches.push({ owner: "obstacleQualifier", value });
}

for (const gps of ASSESSMENTS) for (const inertial of ASSESSMENTS) for (const barometric of ASSESSMENTS) {
  const guards = [gps === "READY" && inertial === "READY" && barometric === "READY", gps === "REJECTED" && inertial !== "REJECTED" && barometric !== "REJECTED", gps !== "REJECTED" && (inertial !== "REJECTED" || barometric !== "REJECTED") && (gps !== "READY" || inertial !== "READY" || barometric !== "READY"), gps === "REJECTED" && (inertial === "REJECTED" || barometric === "REJECTED") || gps !== "REJECTED" && inertial === "REJECTED" && barometric === "REJECTED"];
  const key = `${gps}|${inertial}|${barometric}`;
  const active = guards.filter(Boolean).length;
  if (!active) gaps.navigationBasis.push(key);
  if (active > 1) overlaps.navigationBasis.push(key);
  if (generatedBasis(gps, inertial, barometric) !== oracleBasis(gps, inertial, barometric)) mismatches.push({ owner: "navigationBasisOwner", key });
}

for (const obstacle of OBSTACLE_ASSESSMENTS) for (const motion of MOTION) {
  const guards = [motion !== "UNKNOWN" && obstacle === "NO_INDICATION", (motion === "TRANSLATING" || motion === "LANDING_CONTEXT") && obstacle === "INDICATED", motion === "STATIONARY" && obstacle === "INDICATED", motion === "UNKNOWN" || ((motion === "TRANSLATING" || motion === "LANDING_CONTEXT") && obstacle === "UNAVAILABLE"), motion === "STATIONARY" && obstacle === "UNAVAILABLE"];
  const key = `${motion}|${obstacle}`;
  const active = guards.filter(Boolean).length;
  if (!active) gaps.awarenessCondition.push(key);
  if (active > 1) overlaps.awarenessCondition.push(key);
  if (generatedAwareness(obstacle, motion) !== oracleAwareness(obstacle, motion)) mismatches.push({ owner: "awarenessConditionOwner", key });
}

for (const basis of BASES) for (const awareness of AWARENESS) {
  const guards = [
    ["ACTIVE_OBSTACLE_CONFLICT", "STATIONARY_OBSTACLE_PRESENT"].includes(awareness),
    ["ACTIVE_AWARENESS_LOSS", "STATIONARY_AWARENESS_UNAVAILABLE"].includes(awareness),
    awareness === "AWARENESS_CLEAR" && basis === "UNUSABLE_BASIS",
    awareness === "AWARENESS_CLEAR" && ["RELATIVE_BASIS", "LIMITED_BASIS"].includes(basis),
    awareness === "AWARENESS_CLEAR" && basis === "FULL_BASIS"
  ];
  const active = guards.filter(Boolean).length;
  const key = `${basis}|${awareness}`;
  if (!active) gaps.constraintProposal.push(key);
  if (active > 1) overlaps.constraintProposal.push(key);
  const actual = generatedProposal(basis, awareness);
  if (actual !== oracleProposal(basis, awareness)) mismatches.push({ owner: "constraintProposalOwner", key });
}

for (const proposal of PROPOSALS) for (const event of EVENTS) for (const phase of PHASES) {
  const guards = [["HOLD_OBSTACLE", "HOLD_AWARENESS", "HOLD_NAVIGATION"].includes(proposal), ["ALLOW_FULL", "RESTRICT_NAVIGATION"].includes(proposal) && event !== "NONE", ["ALLOW_FULL", "RESTRICT_NAVIGATION"].includes(proposal) && event === "NONE"];
  const key = `${proposal}|${event}|${phase}`;
  const active = guards.filter(Boolean).length;
  if (!active) gaps.eventPriorityArbiter.push(key);
  if (active > 1) overlaps.eventPriorityArbiter.push(key);
  if (generatedArbiter(proposal, event, phase) !== oracleArbiter(proposal, event, phase)) mismatches.push({ owner: "eventPriorityArbiter", key });
}

const reachableRecoveryPairs = new Set();
for (const proposal of PROPOSALS) for (const event of EVENTS) for (const phase of PHASES) reachableRecoveryPairs.add(`${phase}|${generatedArbiter(proposal, event, phase)}`);
const oracleReachableRecoveryPairs = new Set();
for (const proposal of PROPOSALS) for (const event of EVENTS) for (const phase of PHASES) oracleReachableRecoveryPairs.add(`${phase}|${oracleArbiter(proposal, event, phase)}`);
const structuralRecoveryPairs = PHASES.flatMap(phase => ACTIONS.map(action => `${phase}|${action}`));
const unreachableRecoveryPairs = structuralRecoveryPairs.filter(key => !reachableRecoveryPairs.has(key));
const recoveryReachabilityContradictions = structuralRecoveryPairs.filter(key => reachableRecoveryPairs.has(key) !== oracleReachableRecoveryPairs.has(key));
for (const key of reachableRecoveryPairs) {
  const [phase, action] = key.split("|");
  const case18 = ["APPLY_OBSTACLE_HOLD", "APPLY_AWARENESS_HOLD", "APPLY_NAV_HOLD", "APPLY_EXTERNAL_HOLD", "IGNORE_RESET"].includes(action) || (["APPLY_FULL", "APPLY_RESTRICTED"].includes(action) && ["LATCHED", "WAIT_RELEASE"].includes(phase));
  const case19 = action === "ACCEPT_RESET" || (["APPLY_FULL", "APPLY_RESTRICTED"].includes(action) && ["ARMED", "OPEN"].includes(phase));
  const active = Number(case18) + Number(case19);
  if (!active) gaps.recoveryLatch.push(key);
  if (active > 1) overlaps.recoveryLatch.push(key);
  if (generatedRecovery(phase, action) !== oracleRecovery(phase, action)) mismatches.push({ owner: "recoveryLatchOwner", key });
}

const reachableOutcomeTriples = new Set();
for (const basis of BASES) for (const awareness of AWARENESS) for (const event of EVENTS) for (const phase of PHASES) {
  const proposal = generatedProposal(basis, awareness);
  const action = generatedArbiter(proposal, event, phase);
  const post = generatedRecovery(phase, action);
  reachableOutcomeTriples.add(`${action}|${post}|${basis}`);
}
const oracleReachableOutcomeTriples = new Set();
for (const basis of BASES) for (const awareness of AWARENESS) for (const event of EVENTS) for (const phase of PHASES) {
  const proposal = oracleProposal(basis, awareness);
  const action = oracleArbiter(proposal, event, phase);
  const post = oracleRecovery(phase, action);
  oracleReachableOutcomeTriples.add(`${action}|${post}|${basis}`);
}
const structuralOutcomeTriples = ACTIONS.flatMap(action => PHASES.flatMap(phase => BASES.map(basis => `${action}|${phase}|${basis}`)));
const unreachableOutcomeTriples = structuralOutcomeTriples.filter(key => !reachableOutcomeTriples.has(key));
const outcomeReachabilityContradictions = structuralOutcomeTriples.filter(key => reachableOutcomeTriples.has(key) !== oracleReachableOutcomeTriples.has(key));
for (const key of reachableOutcomeTriples) {
  const [action, post, basis] = key.split("|");
  const candidates = contractOutcomeCandidates(action, post, basis);
  for (const [field, values] of Object.entries(candidates)) {
    if (!values.length) gaps.supervisionOutcome.push(`${key}|${field}`);
    if (values.length > 1) overlaps.supervisionOutcome.push(`${key}|${field}`);
  }
  if (JSON.stringify(generatedOutcome(action, post, basis)) !== JSON.stringify(oracleOutcome(action, post, basis))) mismatches.push({ owner: "supervisionOutcomeOwner", key });
}

let rootValuations = 0;
for (const gpsEvidence of NAV) for (const inertialEvidence of NAV) for (const barometricEvidence of NAV) for (const obstacleEvidence of OBS) for (const motionContext of MOTION) for (const supervisionEvent of EVENTS) for (const preRecoveryPhase of PHASES) {
  rootValuations++;
  const input = { gpsEvidence, inertialEvidence, barometricEvidence, obstacleEvidence, motionContext, supervisionEvent, preRecoveryPhase };
  const actual = composeGenerated(input);
  const expected = composeOracle(input);
  for (const field of Object.keys(expected)) {
    if (actual[field] !== expected[field]) {
      const entry = { input, field, actual: actual[field], expected: expected[field] };
      if (mismatches.length < 20) mismatches.push(entry);
      if (["navigationUseDirective", "obstacleAwarenessNotice", "supervisionStatus"].includes(field) && requiredOutputMismatches.length < 20) requiredOutputMismatches.push(entry);
    }
  }
}

function scenarioStep(phase, input, expectedCase, expected) {
  const observed = composeGenerated({ ...input, preRecoveryPhase: phase });
  const checks = Object.entries(expected).map(([field, value]) => observed[field] === value);
  return { input: { ...input, preRecoveryPhase: phase }, expected_branch_or_case: expectedCase, expected, observed, passed: checks.every(Boolean) };
}
const nominal = { gpsEvidence: "NOMINAL_CURRENT", inertialEvidence: "NOMINAL_CURRENT", barometricEvidence: "NOMINAL_CURRENT", obstacleEvidence: "NO_INDICATION_CURRENT", motionContext: "STATIONARY", supervisionEvent: "NONE" };
const scenarioSpecs = [
  ["SCN-01", [
    ["WAIT_RELEASE", nominal, "CASE-17/CASE-18", { acceptedAction: "APPLY_FULL", postRecoveryPhase: "ARMED", navigationUseDirective: "MOTION_INHIBITED", supervisionStatus: "RESET_REQUIRED" }],
    ["ARMED", { ...nominal, supervisionEvent: "RESET_ONLY" }, "CASE-16/CASE-19/CASE-20", { acceptedAction: "ACCEPT_RESET", postRecoveryPhase: "OPEN", navigationUseDirective: "FULL_NAV_USE", obstacleAwarenessNotice: "NO_CURRENT_INDICATION", supervisionStatus: "FULL_USE" }]
  ]],
  ["SCN-02", [["OPEN", { ...nominal, gpsEvidence: "INVALID" }, "CASE-06/CASE-14/CASE-17/CASE-20", { navigationBasis: "RELATIVE_BASIS", acceptedAction: "APPLY_RESTRICTED", postRecoveryPhase: "OPEN", navigationUseDirective: "RESTRICTED_NAV_USE", supervisionStatus: "RESTRICTED_USE" }]]],
  ["SCN-03", [["OPEN", { ...nominal, obstacleEvidence: "INDICATION_CURRENT", motionContext: "TRANSLATING", supervisionEvent: "FORCE_HOLD_WITH_RESET" }, "CASE-10/CASE-14/CASE-15/CASE-18/CASE-20", { acceptedAction: "APPLY_OBSTACLE_HOLD", postRecoveryPhase: "LATCHED", navigationUseDirective: "MOTION_INHIBITED", obstacleAwarenessNotice: "CURRENT_INDICATION", supervisionStatus: "HELD_OBSTACLE_INDICATION" }]]],
  ["SCN-04", [
    ["OPEN", { ...nominal, gpsEvidence: "INVALID", inertialEvidence: "INVALID", barometricEvidence: "INVALID", supervisionEvent: "FORCE_HOLD_WITH_RESET" }, "CASE-08/CASE-14/CASE-15", { acceptedAction: "APPLY_NAV_HOLD", supervisionStatus: "HELD_NAV_EVIDENCE" }],
    ["OPEN", { ...nominal, supervisionEvent: "FORCE_HOLD_WITH_RESET" }, "CASE-16", { acceptedAction: "APPLY_EXTERNAL_HOLD", supervisionStatus: "HELD_EXTERNAL" }]
  ]],
  ["SCN-05", [
    ["OPEN", { ...nominal, gpsEvidence: "INVALID", inertialEvidence: "INVALID", barometricEvidence: "INVALID" }, "CASE-08/CASE-15/CASE-18", { acceptedAction: "APPLY_NAV_HOLD", postRecoveryPhase: "LATCHED" }],
    ["LATCHED", nominal, "CASE-17/CASE-18", { postRecoveryPhase: "ARMED", navigationUseDirective: "MOTION_INHIBITED" }],
    ["ARMED", { ...nominal, supervisionEvent: "RESET_ONLY" }, "CASE-16/CASE-19", { postRecoveryPhase: "OPEN", navigationUseDirective: "FULL_NAV_USE" }]
  ]],
  ["SCN-06", [["OPEN", { ...nominal, obstacleEvidence: "STALE", motionContext: "TRANSLATING" }, "CASE-04/CASE-12/CASE-14/CASE-15", { awarenessCondition: "ACTIVE_AWARENESS_LOSS", acceptedAction: "APPLY_AWARENESS_HOLD", postRecoveryPhase: "LATCHED", obstacleAwarenessNotice: "AWARENESS_UNAVAILABLE", supervisionStatus: "HELD_AWARENESS_LOSS" }]]],
  ["SCN-07", [
    ["OPEN", { ...nominal, obstacleEvidence: "INDICATION_CURRENT", motionContext: "TRANSLATING", supervisionEvent: "RESET_ONLY" }, "CASE-15/CASE-18", { acceptedAction: "APPLY_OBSTACLE_HOLD", postRecoveryPhase: "LATCHED" }],
    ["LATCHED", { ...nominal, supervisionEvent: "RESET_ONLY" }, "CASE-16/CASE-18", { acceptedAction: "IGNORE_RESET", postRecoveryPhase: "WAIT_RELEASE", supervisionStatus: "RESET_RELEASE_REQUIRED" }],
    ["WAIT_RELEASE", nominal, "CASE-17/CASE-18", { postRecoveryPhase: "ARMED" }],
    ["ARMED", { ...nominal, supervisionEvent: "RESET_ONLY" }, "CASE-16/CASE-19", { postRecoveryPhase: "OPEN", navigationUseDirective: "FULL_NAV_USE" }]
  ]],
  ["SCN-08", [
    ["WAIT_RELEASE", { ...nominal, obstacleEvidence: "INDICATION_CURRENT" }, "CASE-11/CASE-14/CASE-15", { awarenessCondition: "STATIONARY_OBSTACLE_PRESENT", postRecoveryPhase: "LATCHED", navigationUseDirective: "MOTION_INHIBITED" }],
    ["LATCHED", nominal, "CASE-17/CASE-18", { postRecoveryPhase: "ARMED", navigationUseDirective: "MOTION_INHIBITED" }],
    ["ARMED", { ...nominal, supervisionEvent: "RESET_ONLY" }, "CASE-16/CASE-19", { postRecoveryPhase: "OPEN", navigationUseDirective: "FULL_NAV_USE" }]
  ]]
];
const scenarios = scenarioSpecs.map(([scenario_id, rawSteps]) => ({ scenario_id, steps: rawSteps.map(step => scenarioStep(...step)) }));
for (const scenario of scenarios) scenario.passed = scenario.steps.every(step => step.passed);

Object.assign(caseWitnesses, {
  "CASE-01": { input: "NOMINAL_CURRENT", output: generatedQualifier("NOMINAL_CURRENT") },
  "CASE-02": { input: "DEGRADED_CURRENT", output: generatedQualifier("DEGRADED_CURRENT") },
  "CASE-03": { input: "INVALID", output: generatedQualifier("INVALID") },
  "CASE-04": { input: "STALE", output: generatedObstacleQualifier("STALE") },
  "CASE-05": { input: "READY|READY|READY", output: generatedBasis("READY", "READY", "READY") },
  "CASE-06": { input: "REJECTED|LIMITED|READY", output: generatedBasis("REJECTED", "LIMITED", "READY") },
  "CASE-07": { input: "LIMITED|READY|REJECTED", output: generatedBasis("LIMITED", "READY", "REJECTED") },
  "CASE-08": { input: "READY|REJECTED|REJECTED", output: generatedBasis("READY", "REJECTED", "REJECTED") },
  "CASE-09": { input: "NO_INDICATION|STATIONARY", output: generatedAwareness("NO_INDICATION", "STATIONARY") },
  "CASE-10": { input: "INDICATED|TRANSLATING", output: generatedAwareness("INDICATED", "TRANSLATING") },
  "CASE-11": { input: "INDICATED|STATIONARY", output: generatedAwareness("INDICATED", "STATIONARY") },
  "CASE-12": { input: "UNAVAILABLE|LANDING_CONTEXT", output: generatedAwareness("UNAVAILABLE", "LANDING_CONTEXT") },
  "CASE-13": { input: "UNAVAILABLE|STATIONARY", output: generatedAwareness("UNAVAILABLE", "STATIONARY") },
  "CASE-14": { input: "FULL_BASIS|ACTIVE_OBSTACLE_CONFLICT", output: generatedProposal("FULL_BASIS", "ACTIVE_OBSTACLE_CONFLICT") },
  "CASE-15": { input: "HOLD_NAVIGATION|FORCE_HOLD_WITH_RESET|OPEN", output: generatedArbiter("HOLD_NAVIGATION", "FORCE_HOLD_WITH_RESET", "OPEN") },
  "CASE-16": { input: "ALLOW_FULL|RESET_ONLY|ARMED", output: generatedArbiter("ALLOW_FULL", "RESET_ONLY", "ARMED") },
  "CASE-17": { input: "RESTRICT_NAVIGATION|NONE|OPEN", output: generatedArbiter("RESTRICT_NAVIGATION", "NONE", "OPEN") },
  "CASE-18": { input: "LATCHED|APPLY_FULL", output: generatedRecovery("LATCHED", "APPLY_FULL") },
  "CASE-19": { input: "ARMED|ACCEPT_RESET", output: generatedRecovery("ARMED", "ACCEPT_RESET") },
  "CASE-20": { input: "ACCEPT_RESET|OPEN|FULL_BASIS", output: generatedOutcome("ACCEPT_RESET", "OPEN", "FULL_BASIS") }
});

const analyzerChecks = {
  "gps-qualifier-five-values": NAV.every(v => generatedQualifier(v) === QUALIFIER_ORACLE[v]),
  "inertial-qualifier-five-values": NAV.every(v => generatedQualifier(v) === QUALIFIER_ORACLE[v]),
  "barometric-qualifier-five-values": NAV.every(v => generatedQualifier(v) === QUALIFIER_ORACLE[v]),
  "obstacle-qualifier-five-values": OBS.every(v => generatedObstacleQualifier(v) === OBSTACLE_ORACLE[v]),
  "navigation-basis-27-tuples": gaps.navigationBasis.length === 0 && overlaps.navigationBasis.length === 0,
  "awareness-condition-12-tuples": gaps.awarenessCondition.length === 0 && overlaps.awarenessCondition.length === 0,
  "constraint-proposal-20-tuples": gaps.constraintProposal.length === 0 && overlaps.constraintProposal.length === 0,
  "event-priority-80-tuples": gaps.eventPriorityArbiter.length === 0 && overlaps.eventPriorityArbiter.length === 0,
  "recovery-reachable-27-pairs": reachableRecoveryPairs.size === 27 && unreachableRecoveryPairs.length === 5 && recoveryReachabilityContradictions.length === 0 && gaps.recoveryLatch.length === 0 && overlaps.recoveryLatch.length === 0,
  "outcome-reachable-24-triples": reachableOutcomeTriples.size === 24 && unreachableOutcomeTriples.length === 104 && outcomeReachabilityContradictions.length === 0 && gaps.supervisionOutcome.length === 0 && overlaps.supervisionOutcome.length === 0
};

const ownershipTemplate = [
  ["gpsEvidenceQualifier", ["applicability"], ["gpsEvidenceQualifier.gpsEvidence"], ["gpsAssessment"], ["CASE-01"], ["gps-qualifier-five-values"]],
  ["inertialEvidenceQualifier", ["applicability"], ["inertialEvidenceQualifier.inertialEvidence"], ["inertialAssessment"], ["CASE-02"], ["inertial-qualifier-five-values"]],
  ["barometricEvidenceQualifier", ["applicability"], ["barometricEvidenceQualifier.barometricEvidence"], ["barometricAssessment"], ["CASE-03"], ["barometric-qualifier-five-values"]],
  ["obstacleEvidenceQualifier", ["applicability"], ["obstacleEvidenceQualifier.obstacleEvidence"], ["obstacleAssessment"], ["CASE-04"], ["obstacle-qualifier-five-values"]],
  ["navigationBasisOwner", ["applicability"], ["navigationBasisOwner.gpsAssessment", "navigationBasisOwner.inertialAssessment", "navigationBasisOwner.barometricAssessment"], ["navigationBasis"], ["CASE-05", "CASE-06", "CASE-07", "CASE-08"], ["navigation-basis-27-tuples"]],
  ["awarenessConditionOwner", ["applicability"], ["awarenessConditionOwner.obstacleAssessment", "awarenessConditionOwner.motionContext"], ["awarenessCondition"], ["CASE-09", "CASE-10", "CASE-11", "CASE-12", "CASE-13"], ["awareness-condition-12-tuples"]],
  ["constraintProposalOwner", ["proposal"], ["constraintProposalOwner.navigationBasis", "constraintProposalOwner.awarenessCondition"], ["constraintProposal"], ["CASE-14"], ["constraint-proposal-20-tuples"]],
  ["eventPriorityArbiter", ["decision"], ["eventPriorityArbiter.constraintProposal", "eventPriorityArbiter.supervisionEvent", "eventPriorityArbiter.preRecoveryPhase"], ["acceptedAction"], ["CASE-15", "CASE-16", "CASE-17"], ["event-priority-80-tuples"]],
  ["recoveryLatchOwner", ["decision"], ["recoveryLatchOwner.acceptedAction", "state.committedRecoveryPhase"], ["postRecoveryPhase"], ["CASE-18", "CASE-19"], ["recovery-reachable-27-pairs"]],
  ["supervisionOutcomeOwner", ["decision"], ["supervisionOutcomeOwner.acceptedAction", "supervisionOutcomeOwner.postRecoveryPhase", "supervisionOutcomeOwner.navigationBasis"], ["navigationUseDirective", "obstacleAwarenessNotice", "supervisionStatus"], ["CASE-20"], ["outcome-reachable-24-triples"]]
];
const ownershipAudit = ownershipTemplate.map(([usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks]) => ({ usage, claimed_roles, assigned_inputs, owner_local_facts, contract_cases, analyzer_checks, passed: analyzer_checks.every(name => analyzerChecks[name]) }));

const invariantChecks = {
  exact_root_domain_size: rootValuations === 40000,
  exact_interaction_inventory: Object.keys(INTERACTIONS).length === 21,
  every_interaction_consumed_per_valuation: Object.values(interactionHits).every(count => count === rootValuations + scenarios.reduce((n, s) => n + s.steps.length, 0)),
  no_gaps: Object.values(gaps).every(entries => entries.length === 0),
  no_overlaps: Object.values(overlaps).every(entries => entries.length === 0),
  no_relation_mismatches: mismatches.length === 0,
  no_required_output_mismatches: requiredOutputMismatches.length === 0,
  all_twenty_cases_witnessed: Object.keys(caseWitnesses).length === 20,
  exact_recovery_reachability: reachableRecoveryPairs.size === 27 && unreachableRecoveryPairs.length === 5,
  exact_outcome_reachability: reachableOutcomeTriples.size === 24 && unreachableOutcomeTriples.length === 104,
  every_structural_recovery_pair_contradiction_checked: structuralRecoveryPairs.length === 32 && recoveryReachabilityContradictions.length === 0,
  every_structural_outcome_triple_contradiction_checked: structuralOutcomeTriples.length === 128 && outcomeReachabilityContradictions.length === 0,
  evidence_hold_defeats_combined_event: generatedArbiter("HOLD_NAVIGATION", "FORCE_HOLD_WITH_RESET", "ARMED") === "APPLY_NAV_HOLD",
  combined_event_is_external_hold_when_evidence_safe: generatedArbiter("ALLOW_FULL", "FORCE_HOLD_WITH_RESET", "ARMED") === "APPLY_EXTERNAL_HOLD",
  improved_evidence_does_not_open_latched_recovery: generatedRecovery("LATCHED", "APPLY_FULL") === "ARMED",
  fresh_reset_opens_only_from_armed: generatedArbiter("ALLOW_FULL", "RESET_ONLY", "ARMED") === "ACCEPT_RESET" && generatedArbiter("ALLOW_FULL", "RESET_ONLY", "LATCHED") === "IGNORE_RESET",
  all_scenarios_pass: scenarios.length === 8 && scenarios.every(s => s.passed),
  all_owners_execute_local_checks: ownershipAudit.length === 10 && ownershipAudit.every(owner => owner.passed)
};
const passed = Object.values(invariantChecks).every(Boolean);

const result = {
  status: passed ? "passed" : "failed",
  passed,
  source: "model/Navigation_Obstacle_Awareness_Use_Supervisor.sysml",
  source_sha256: SOURCE_SHA256,
  claim_boundary: "Exhaustive only over the frozen finite logical domains and bounded traces; this is not compositional proof, solver certification, generated-code correctness, execution evidence, physical-performance evidence, safety certification, or unbounded temporal proof.",
  semantic_connection_map: INTERACTIONS,
  partition_counts: {
    gps_qualifier: 5, inertial_qualifier: 5, barometric_qualifier: 5, obstacle_qualifier: 5,
    navigation_basis: 27, awareness_condition: 12, constraint_proposal: 20, event_priority_arbiter: 80,
    recovery_structural_pairs: 32, recovery_producer_reachable_pairs: reachableRecoveryPairs.size,
    outcome_structural_triples: 128, outcome_producer_reachable_triples: reachableOutcomeTriples.size,
    root_input_prestate_valuations: rootValuations, scenario_families: scenarios.length
  },
  gaps,
  overlaps,
  mismatches,
  required_output_mismatches: requiredOutputMismatches,
  invariant_checks: invariantChecks,
  case_witnesses: caseWitnesses,
  contradiction_checks: {
    recovery_structural_pairs_checked: structuralRecoveryPairs.length,
    recovery_reachability_mismatches: recoveryReachabilityContradictions,
    outcome_structural_triples_checked: structuralOutcomeTriples.length,
    outcome_reachability_mismatches: outcomeReachabilityContradictions
  },
  recovery_reachability: { reachable: [...reachableRecoveryPairs].sort(), unreachable: unreachableRecoveryPairs.sort() },
  outcome_reachability: { reachable: [...reachableOutcomeTriples].sort(), unreachable: unreachableOutcomeTriples.sort() },
  scenarios,
  ownership_audit: ownershipAudit
};

console.log(JSON.stringify(result));
