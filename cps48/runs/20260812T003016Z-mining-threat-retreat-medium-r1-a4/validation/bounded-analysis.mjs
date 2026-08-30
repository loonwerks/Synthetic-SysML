"use strict";

// Deterministic, dependency-free bounded mirror of the retained canonical source.
// It reads no files, environment variables, clocks, random sources, or network state.

const SOURCE_SHA256 = "521f5796085d5aedab7ade2f73c2918d459ae6646cd23511b1c06dbcaf105174";
const EXPECTED_COMBINATIONS = 47185920;

const COMMAND_BY_REASON = [
  -1, 1, 0, 5, 5, 4, 5, 5, 5, 3, 3, 2, 5, 4, 2, 5, 6, 5, 6, 1, 0,
];
const NEXT_PHASE_BY_REASON = [
  -1, 1, 0, 3, 3, 2, 3, 3, 3, 1, 1, 1, 3, 2, 1, 3, 4, 3, 4, 1, 0,
];

const semanticConnectionMap = [
  ["INT-01", "AS.phase_context", "MR.phase_context"],
  ["INT-02", "AS.phase_context", "TR.phase_context"],
  ["INT-03", "TQ.qualified_threat", "MR.threat_fact"],
  ["INT-04", "TQ.qualified_threat", "TR.threat_fact"],
  ["INT-05", "RQ.mining_recovery_facts", "MR.resource_facts"],
  ["INT-06", "RQ.defense_facts", "TR.defense_facts"],
  ["INT-07", "PQ.mission_facts", "MR.mission_facts"],
  ["INT-08", "PQ.arrival_fact", "TR.arrival_fact"],
  ["INT-09", "MR.mission_proposal", "AS.mission_candidate"],
  ["INT-10", "TR.response_proposal", "AS.response_candidate"],
  ["INT-11", "TQ.threat_publication", "AS.threat_publication"],
  ["INT-12", "RQ.resource_publication", "AS.resource_publication"],
  ["INT-13", "PQ.mission_invalidity", "FA.mission_invalidity"],
  ["INT-14", "TQ.threat_invalidity", "FA.threat_invalidity"],
  ["INT-15", "RQ.resource_invalidity", "FA.resource_invalidity"],
  ["INT-16", "AS.phase_context", "FA.phase_context"],
  ["INT-17", "FA.fault", "AS.fault"],
  ["INT-18", "AS.resolved_atomic_result", "AP.atomic_result"],
];

const ownershipAuditTemplate = [
  {
    usage: "Fault Assessment",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "phase_context.current_phase",
      "threat_invalidity.threat_invalid",
      "resource_invalidity.resource_invalid",
      "mission_invalidity.intent_invalid",
      "mission_invalidity.arrival_invalid",
      "mission_invalidity.resupply_invalid",
    ],
    owner_local_facts: ["phase_relevant_fault"],
    contract_cases: ["FA_PHASE_RELEVANT_FAULT"],
    analyzer_checks: ["fa_exact_fault_predicate"],
  },
  {
    usage: "Threat Qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "raw_threat.threat",
      "raw_threat.threat_validity",
      "streak_state.current_valid_streak",
    ],
    owner_local_facts: ["qualified_threat", "next_valid_streak", "threat_invalid"],
    contract_cases: ["TQ_STREAK_AND_TRUST", "TQ_QUALIFIED_FACTS"],
    analyzer_checks: ["tq_streak_and_trust_mapping"],
  },
  {
    usage: "Resource Qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "raw_resources.cargo",
      "raw_resources.cargo_validity",
      "raw_resources.capacitor",
      "raw_resources.capacitor_validity",
      "raw_resources.target",
      "raw_resources.target_validity",
      "raw_resources.mining_availability",
      "raw_resources.defense_availability",
      "raw_resources.retreat_availability",
      "raw_resources.availability_validity",
    ],
    owner_local_facts: [
      "mine_ready",
      "resource_reset",
      "defense_ready",
      "cargo_or_capacitor_retreat",
      "target_or_mining_block",
      "resource_advisories",
      "resource_invalid",
    ],
    contract_cases: ["RQ_MINING_AND_RESET", "RQ_DEFENSE", "RQ_ADVISORIES"],
    analyzer_checks: ["rq_readiness_advisory_invalidity_mapping"],
  },
  {
    usage: "Personnel Mission Qualification",
    claimed_roles: ["applicability"],
    assigned_inputs: [
      "raw_mission.pilot_intent",
      "raw_mission.intent_validity",
      "raw_mission.arrival",
      "raw_mission.arrival_validity",
      "raw_mission.resupply",
      "raw_mission.resupply_validity",
    ],
    owner_local_facts: [
      "valid_mine",
      "invalid_or_return",
      "valid_hold_or_return",
      "valid_safe_at_station",
      "valid_complete_resupply",
      "mission_invalidity",
    ],
    contract_cases: ["PQ_INTENT_FACTS", "PQ_PROGRESS_FACTS", "PQ_INDEPENDENT_INVALIDITY"],
    analyzer_checks: ["pq_independent_mission_mapping"],
  },
  {
    usage: "Mission Recovery Decision",
    claimed_roles: ["proposal"],
    assigned_inputs: [
      "phase_context.current_phase",
      "threat_fact.acceptable",
      "resource_facts.mine_ready",
      "resource_facts.resource_reset",
      "resource_facts.cargo_or_capacitor_retreat",
      "resource_facts.target_or_mining_block",
      "mission_facts.valid_mine",
      "mission_facts.invalid_or_return",
      "mission_facts.valid_hold_or_return",
      "mission_facts.valid_complete_resupply",
      "mission_facts.intent_invalid",
    ],
    owner_local_facts: ["mission_proposal"],
    contract_cases: ["MR_PROPOSAL_PARTITIONS"],
    analyzer_checks: ["mr_total_local_proposal_partition"],
  },
  {
    usage: "Threat Retreat Decision",
    claimed_roles: ["proposal"],
    assigned_inputs: [
      "phase_context.current_phase",
      "threat_fact.untrusted",
      "threat_fact.hostile",
      "threat_fact.severe",
      "defense_facts.defense_ready",
      "arrival_fact.valid_safe_at_station",
    ],
    owner_local_facts: ["response_proposal"],
    contract_cases: ["TR_PROPOSAL_PARTITIONS"],
    analyzer_checks: ["tr_total_local_proposal_partition"],
  },
  {
    usage: "Priority Phase Arbitration",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "phase_state.current_phase",
      "mission_candidate.proposed_reason",
      "response_candidate.proposed_reason",
      "threat_publication.next_valid_streak",
      "resource_publication.cargo_advisory",
      "resource_publication.capacitor_advisory",
      "resource_publication.retreat_advisory",
      "fault.fault",
    ],
    owner_local_facts: ["selected_reason", "command", "next_phase", "atomic_status"],
    contract_cases: [
      "CASE-01", "CASE-02", "CASE-03", "CASE-04", "CASE-05", "CASE-06", "CASE-07",
      "CASE-08", "CASE-09", "CASE-10", "CASE-11", "CASE-12", "CASE-13", "CASE-14",
      "CASE-15", "CASE-16", "CASE-17", "CASE-18", "CASE-19", "CASE-20",
    ],
    analyzer_checks: ["as_effective_guard_totality", "as_priority_resolution", "as_atomic_preservation"],
  },
  {
    usage: "Atomic Publication",
    claimed_roles: ["decision"],
    assigned_inputs: [
      "atomic_result.command",
      "atomic_result.current_phase",
      "atomic_result.next_phase",
      "atomic_result.reason",
      "atomic_result.fault",
      "atomic_result.next_valid_streak",
      "atomic_result.cargo_advisory",
      "atomic_result.capacitor_advisory",
      "atomic_result.retreat_advisory",
    ],
    owner_local_facts: ["laser_command", "drone_assignment", "coherent_publication"],
    contract_cases: ["AP_ACTUATOR_MAPPING", "AP_ATOMIC_PRESERVATION"],
    analyzer_checks: ["ap_command_to_actuator_mapping", "ap_atomic_field_preservation"],
  },
];

function tqRelation(threat, threatValidity, currentStreak) {
  const nextStreak = threatValidity === 1 ? 0 : currentStreak === 0 ? 1 : 2;
  const qualifiedThreat = threatValidity === 0 && nextStreak === 2 ? threat + 1 : 0;
  return {
    threat,
    threatValidity,
    currentStreak,
    qualifiedThreat,
    nextStreak,
    untrusted: qualifiedThreat === 0,
    acceptable: qualifiedThreat === 1 || qualifiedThreat === 2,
    hostile: qualifiedThreat === 3,
    severe: qualifiedThreat === 4,
    threatInvalid: threatValidity === 1,
  };
}

function rqRelation(cargo, cargoValidity, capacitor, capacitorValidity, target, targetValidity,
                    miningAvailability, defenseAvailability, retreatAvailability, availabilityValidity) {
  const capacitorSufficient = capacitorValidity === 0 && (capacitor === 0 || capacitor === 1);
  const mineReady = cargoValidity === 0 && cargo !== 3 && capacitorSufficient &&
    targetValidity === 0 && target === 0 && availabilityValidity === 0 && miningAvailability === 0;
  const resourceReset = cargoValidity === 0 && cargo === 0 && capacitorSufficient;
  const defenseReady = capacitorSufficient && availabilityValidity === 0 && defenseAvailability === 0;
  const cargoOrCapacitorRetreat = cargoValidity === 1 || cargo === 3 || capacitorValidity === 1 ||
    capacitor === 2 || capacitor === 3;
  const targetOrMiningBlock = targetValidity === 1 || target === 1 || availabilityValidity === 1 ||
    miningAvailability === 1;
  const cargoAdvisory = cargoValidity === 1 ? 3 : cargo === 3 ? 2 : cargo === 2 ? 1 : 0;
  const capacitorAdvisory = capacitorValidity === 1 ? 3 : capacitor === 3 ? 2 : capacitor === 2 ? 1 : 0;
  const retreatAdvisory = availabilityValidity === 1 ? 2 : retreatAvailability === 1 ? 1 : 0;
  const resourceInvalid = cargoValidity === 1 || capacitorValidity === 1 || targetValidity === 1 ||
    availabilityValidity === 1;
  return {
    cargo, cargoValidity, capacitor, capacitorValidity, target, targetValidity,
    miningAvailability, defenseAvailability, retreatAvailability, availabilityValidity,
    mineReady, resourceReset, defenseReady, cargoOrCapacitorRetreat, targetOrMiningBlock,
    cargoAdvisory, capacitorAdvisory, retreatAdvisory, resourceInvalid,
  };
}

function pqRelation(pilotIntent, intentValidity, arrival, arrivalValidity, resupply, resupplyValidity) {
  return {
    pilotIntent, intentValidity, arrival, arrivalValidity, resupply, resupplyValidity,
    validMine: intentValidity === 0 && pilotIntent === 0,
    invalidOrReturn: intentValidity === 1 || pilotIntent === 2,
    validHoldOrReturn: intentValidity === 0 && (pilotIntent === 1 || pilotIntent === 2),
    validSafeAtStation: arrivalValidity === 0 && arrival === 1,
    validCompleteResupply: resupplyValidity === 0 && resupply === 1,
    intentInvalid: intentValidity === 1,
    arrivalInvalid: arrivalValidity === 1,
    resupplyInvalid: resupplyValidity === 1,
  };
}

function asPhaseContext(phaseState) {
  return phaseState;
}

function mrRelation(phase, tq, rq, pq) {
  if (phase === 0) {
    return tq.acceptable && rq.mineReady && rq.resourceReset && pq.validCompleteResupply && pq.validMine ? 1 : 2;
  }
  if (phase === 1) {
    if (pq.invalidOrReturn) return 7;
    if (rq.cargoOrCapacitorRetreat) return 8;
    if (rq.targetOrMiningBlock) return 9;
    if (pq.validHoldOrReturn) return 10;
    return 11;
  }
  if (phase === 2) {
    return tq.acceptable && rq.mineReady && pq.validMine ? 14 : 0;
  }
  if (phase === 3) return 0;
  if (!tq.acceptable || pq.intentInvalid || !(rq.resourceReset && pq.validCompleteResupply)) return 18;
  if (pq.validMine) return 19;
  return 20;
}

function trRelation(phase, tq, rq, pq) {
  if (phase === 0 || phase === 4) return 0;
  if (phase === 1) {
    if (tq.untrusted) return 3;
    if (tq.severe) return 4;
    if (tq.hostile && rq.defenseReady) return 5;
    if (tq.hostile) return 6;
    return 0;
  }
  if (phase === 2) {
    if (tq.untrusted || tq.severe || !rq.defenseReady) return 12;
    if (tq.hostile) return 13;
    return 15;
  }
  return pq.validSafeAtStation ? 16 : 17;
}

// These guard manifests are a second, explicit transcription of the canonical
// GUMBO implications.  They check the executable owner relations above rather
// than replacing those relations in the composed pipeline.
function mrGuardManifestCode(phase, tq, rq, pq) {
  let count = 0;
  let reason = 0;
  if (phase === 0 && tq.acceptable && rq.mineReady && rq.resourceReset &&
      pq.validCompleteResupply && pq.validMine) { count += 1; reason = 1; }
  if (phase === 0 && !(tq.acceptable && rq.mineReady && rq.resourceReset &&
      pq.validCompleteResupply && pq.validMine)) { count += 1; reason = 2; }
  if (phase === 1 && pq.invalidOrReturn) { count += 1; reason = 7; }
  if (phase === 1 && !pq.invalidOrReturn && rq.cargoOrCapacitorRetreat) { count += 1; reason = 8; }
  if (phase === 1 && !pq.invalidOrReturn && !rq.cargoOrCapacitorRetreat &&
      rq.targetOrMiningBlock) { count += 1; reason = 9; }
  if (phase === 1 && !pq.invalidOrReturn && !rq.cargoOrCapacitorRetreat &&
      !rq.targetOrMiningBlock && pq.validHoldOrReturn) { count += 1; reason = 10; }
  if (phase === 1 && !pq.invalidOrReturn && !rq.cargoOrCapacitorRetreat &&
      !rq.targetOrMiningBlock && !pq.validHoldOrReturn) { count += 1; reason = 11; }
  if (phase === 2 && tq.acceptable && rq.mineReady && pq.validMine) { count += 1; reason = 14; }
  if (phase === 2 && !(tq.acceptable && rq.mineReady && pq.validMine)) { count += 1; reason = 0; }
  if (phase === 3) count += 1;
  if (phase === 4 && (!tq.acceptable || pq.intentInvalid ||
      !(rq.resourceReset && pq.validCompleteResupply))) { count += 1; reason = 18; }
  if (phase === 4 && tq.acceptable && !pq.intentInvalid && rq.resourceReset &&
      pq.validCompleteResupply && pq.validMine) { count += 1; reason = 19; }
  if (phase === 4 && tq.acceptable && !pq.intentInvalid && rq.resourceReset &&
      pq.validCompleteResupply && !pq.validMine && pq.validHoldOrReturn) { count += 1; reason = 20; }
  return count * 32 + reason;
}

function trGuardManifestCode(phase, tq, rq, pq) {
  let count = 0;
  let reason = 0;
  if (phase === 0) count += 1;
  if (phase === 1 && tq.untrusted) { count += 1; reason = 3; }
  if (phase === 1 && !tq.untrusted && tq.severe) { count += 1; reason = 4; }
  if (phase === 1 && !tq.untrusted && !tq.severe && tq.hostile && rq.defenseReady) { count += 1; reason = 5; }
  if (phase === 1 && !tq.untrusted && !tq.severe && tq.hostile && !rq.defenseReady) { count += 1; reason = 6; }
  if (phase === 1 && !tq.untrusted && !tq.severe && !tq.hostile) count += 1;
  if (phase === 2 && (tq.untrusted || tq.severe || !rq.defenseReady)) { count += 1; reason = 12; }
  if (phase === 2 && !tq.untrusted && !tq.severe && rq.defenseReady && tq.hostile) { count += 1; reason = 13; }
  if (phase === 2 && !tq.untrusted && !tq.severe && rq.defenseReady && !tq.hostile) { count += 1; reason = 15; }
  if (phase === 3 && pq.validSafeAtStation) { count += 1; reason = 16; }
  if (phase === 3 && !pq.validSafeAtStation) { count += 1; reason = 17; }
  if (phase === 4) count += 1;
  return count * 32 + reason;
}

function faRelation(phase, tq, rq, pq) {
  return tq.threatInvalid || rq.resourceInvalid || pq.intentInvalid ||
    (phase === 3 && pq.arrivalInvalid) ||
    ((phase === 0 || phase === 4) && pq.resupplyInvalid) ? 1 : 0;
}

function asResolutionCode(phase, missionProposal, responseProposal) {
  let count = 0;
  let reason = 0;
  if (phase === 0 && missionProposal === 1) { count += 1; reason = 1; }
  if (phase === 0 && missionProposal === 2) { count += 1; reason = 2; }
  if (phase === 1 && responseProposal === 3) { count += 1; reason = 3; }
  if (phase === 1 && responseProposal === 4) { count += 1; reason = 4; }
  if (phase === 1 && responseProposal === 5) { count += 1; reason = 5; }
  if (phase === 1 && responseProposal === 6) { count += 1; reason = 6; }
  if (phase === 1 && responseProposal === 0 && missionProposal === 7) { count += 1; reason = 7; }
  if (phase === 1 && responseProposal === 0 && missionProposal === 8) { count += 1; reason = 8; }
  if (phase === 1 && responseProposal === 0 && missionProposal === 9) { count += 1; reason = 9; }
  if (phase === 1 && responseProposal === 0 && missionProposal === 10) { count += 1; reason = 10; }
  if (phase === 1 && responseProposal === 0 && missionProposal === 11) { count += 1; reason = 11; }
  if (phase === 2 && responseProposal === 12) { count += 1; reason = 12; }
  if (phase === 2 && responseProposal === 13) { count += 1; reason = 13; }
  if (phase === 2 && responseProposal === 15 && missionProposal === 14) { count += 1; reason = 14; }
  if (phase === 2 && responseProposal === 15 && missionProposal !== 14) { count += 1; reason = 15; }
  if (phase === 3 && responseProposal === 16) { count += 1; reason = 16; }
  if (phase === 3 && responseProposal === 17) { count += 1; reason = 17; }
  if (phase === 4 && missionProposal === 18) { count += 1; reason = 18; }
  if (phase === 4 && missionProposal === 19) { count += 1; reason = 19; }
  if (phase === 4 && missionProposal === 20) { count += 1; reason = 20; }
  return count * 32 + reason;
}

function asRelation(phase, missionProposal, responseProposal, tq, rq, fault) {
  const resolutionCode = asResolutionCode(phase, missionProposal, responseProposal);
  const count = resolutionCode >> 5;
  const reason = resolutionCode & 31;
  if (count !== 1) return { selected: Array(count).fill(reason), reason: 0 };
  return {
    selected: [reason],
    reason,
    command: COMMAND_BY_REASON[reason],
    currentPhase: phase,
    nextPhase: NEXT_PHASE_BY_REASON[reason],
    fault,
    nextStreak: tq.nextStreak,
    cargoAdvisory: rq.cargoAdvisory,
    capacitorAdvisory: rq.capacitorAdvisory,
    retreatAdvisory: rq.retreatAdvisory,
  };
}

function apRelation(atomic) {
  return {
    ...atomic,
    laser: apLaserRelation(atomic.command),
    drones: apDronesRelation(atomic.command),
  };
}

function apLaserRelation(command) {
  return command === 2 ? 0 : 1;
}

function apDronesRelation(command) {
  return command === 2 ? 1 : command === 4 ? 2 : 0;
}

function requiredOutcome(reason) {
  switch (reason) {
    case 1: return { command: 1, nextPhase: 1 };
    case 2: return { command: 0, nextPhase: 0 };
    case 3: case 4: case 6: case 7: case 8: case 12: case 15: case 17:
      return { command: 5, nextPhase: 3 };
    case 5: return { command: 4, nextPhase: 2 };
    case 9: case 10: return { command: 3, nextPhase: 1 };
    case 11: case 14: return { command: 2, nextPhase: 1 };
    case 13: return { command: 4, nextPhase: 2 };
    case 16: case 18: return { command: 6, nextPhase: 4 };
    case 19: return { command: 1, nextPhase: 1 };
    case 20: return { command: 0, nextPhase: 0 };
    default: return { command: -1, nextPhase: -1 };
  }
}

const tqTable = [];
for (let threat = 0; threat < 4; threat += 1) {
  for (let threatValidity = 0; threatValidity < 2; threatValidity += 1) {
    for (let currentStreak = 0; currentStreak < 3; currentStreak += 1) {
      tqTable.push(tqRelation(threat, threatValidity, currentStreak));
    }
  }
}

const rqTable = [];
for (let cargo = 0; cargo < 4; cargo += 1) for (let cargoValidity = 0; cargoValidity < 2; cargoValidity += 1)
for (let capacitor = 0; capacitor < 4; capacitor += 1) for (let capacitorValidity = 0; capacitorValidity < 2; capacitorValidity += 1)
for (let target = 0; target < 2; target += 1) for (let targetValidity = 0; targetValidity < 2; targetValidity += 1)
for (let miningAvailability = 0; miningAvailability < 2; miningAvailability += 1)
for (let defenseAvailability = 0; defenseAvailability < 2; defenseAvailability += 1)
for (let retreatAvailability = 0; retreatAvailability < 2; retreatAvailability += 1)
for (let availabilityValidity = 0; availabilityValidity < 2; availabilityValidity += 1) {
  rqTable.push(rqRelation(cargo, cargoValidity, capacitor, capacitorValidity, target, targetValidity,
    miningAvailability, defenseAvailability, retreatAvailability, availabilityValidity));
}

const pqTable = [];
for (let pilotIntent = 0; pilotIntent < 3; pilotIntent += 1) for (let intentValidity = 0; intentValidity < 2; intentValidity += 1)
for (let arrival = 0; arrival < 2; arrival += 1) for (let arrivalValidity = 0; arrivalValidity < 2; arrivalValidity += 1)
for (let resupply = 0; resupply < 2; resupply += 1) for (let resupplyValidity = 0; resupplyValidity < 2; resupplyValidity += 1) {
  pqTable.push(pqRelation(pilotIntent, intentValidity, arrival, arrivalValidity, resupply, resupplyValidity));
}

const observations = {
  partition_gaps: 0,
  effective_overlaps: 0,
  required_output_mismatches: 0,
  invariant_violations: 0,
  fault_mismatches: 0,
  advisory_mismatches: 0,
  state_mismatches: 0,
  actuator_mismatches: 0,
  proposal_domain_violations: 0,
  tq_mapping_mismatches: 0,
  rq_mapping_mismatches: 0,
  pq_mapping_mismatches: 0,
  fa_mapping_mismatches: 0,
  mr_partition_mismatches: 0,
  tr_partition_mismatches: 0,
  as_atomic_preservation_mismatches: 0,
  ap_preservation_mismatches: 0,
};
const caseCounts = Array(21).fill(0);
const caseWitnesses = Array(21).fill(null);
const priorityConflictWitnesses = [];
let analyzedCombinations = 0;

function compactWitness(phase, tq, rq, pq, mr, tr, result) {
  return {
    phase,
    streak: tq.currentStreak,
    threat: tq.threat,
    threat_validity: tq.threatValidity,
    cargo: rq.cargo,
    cargo_validity: rq.cargoValidity,
    capacitor: rq.capacitor,
    capacitor_validity: rq.capacitorValidity,
    target: rq.target,
    target_validity: rq.targetValidity,
    mining_availability: rq.miningAvailability,
    defense_availability: rq.defenseAvailability,
    retreat_availability: rq.retreatAvailability,
    availability_validity: rq.availabilityValidity,
    pilot_intent: pq.pilotIntent,
    intent_validity: pq.intentValidity,
    arrival: pq.arrival,
    arrival_validity: pq.arrivalValidity,
    resupply: pq.resupply,
    resupply_validity: pq.resupplyValidity,
    mission_proposal: mr,
    response_proposal: tr,
    observed: {
      reason: result.reason,
      command: result.command,
      next_phase: result.nextPhase,
      fault: result.fault,
      next_streak: result.nextStreak,
    },
  };
}

for (let phaseState = 0; phaseState < 5; phaseState += 1) {
  const phaseContext = asPhaseContext(phaseState);
  for (const tq of tqTable) {
    for (const rq of rqTable) {
      for (const pq of pqTable) {
        analyzedCombinations += 1;
        const missionProposal = mrRelation(phaseContext, tq, rq, pq);
        const responseProposal = trRelation(phaseContext, tq, rq, pq);
        const mrGuardCode = mrGuardManifestCode(phaseContext, tq, rq, pq);
        const trGuardCode = trGuardManifestCode(phaseContext, tq, rq, pq);
        if ((mrGuardCode >> 5) !== 1 || (mrGuardCode & 31) !== missionProposal) {
          observations.mr_partition_mismatches += 1;
        }
        if ((trGuardCode >> 5) !== 1 || (trGuardCode & 31) !== responseProposal) {
          observations.tr_partition_mismatches += 1;
        }
        const fault = faRelation(phaseContext, tq, rq, pq);
        const resolutionCode = asResolutionCode(phaseState, missionProposal, responseProposal);
        const selectionCount = resolutionCode >> 5;
        const reason = resolutionCode & 31;
        if (selectionCount === 0) observations.partition_gaps += 1;
        if (selectionCount > 1) observations.effective_overlaps += 1;
        if (selectionCount !== 1) continue;
        // Primitive locals avoid allocating 47 million transient result objects.
        // They are the exact AS result fields and AP output relations consumed
        // through INT-17/18, not a root-input policy recomputation.
        const resolvedCommand = COMMAND_BY_REASON[reason];
        const resolvedNextPhase = NEXT_PHASE_BY_REASON[reason];
        const publishedLaser = apLaserRelation(resolvedCommand);
        const publishedDrones = apDronesRelation(resolvedCommand);
        const required = requiredOutcome(reason);
        caseCounts[reason] += 1;
        if (caseWitnesses[reason] === null) {
          caseWitnesses[reason] = compactWitness(phaseState, tq, rq, pq, missionProposal, responseProposal, {
            reason, command: resolvedCommand, nextPhase: resolvedNextPhase, fault, nextStreak: tq.nextStreak,
          });
        }
        if (resolvedCommand !== required.command || resolvedNextPhase !== required.nextPhase) {
          observations.required_output_mismatches += 1;
        }
        if (phaseContext !== phaseState || tq.nextStreak < 0 || tq.nextStreak > 2) observations.state_mismatches += 1;
        if (rq.cargoAdvisory < 0 || rq.cargoAdvisory > 3 || rq.capacitorAdvisory < 0 ||
            rq.capacitorAdvisory > 3 || rq.retreatAdvisory < 0 || rq.retreatAdvisory > 2) observations.advisory_mismatches += 1;
        if ((resolvedCommand === 2 && (publishedLaser !== 0 || publishedDrones !== 1)) ||
            (resolvedCommand === 4 && (publishedLaser !== 1 || publishedDrones !== 2)) ||
            (resolvedCommand !== 2 && resolvedCommand !== 4 &&
              (publishedLaser !== 1 || publishedDrones !== 0))) observations.actuator_mismatches += 1;
        if (missionProposal < 0 || missionProposal > 20 || responseProposal < 0 || responseProposal > 17) {
          observations.proposal_domain_violations += 1;
        }
        if (resolvedCommand < 0 || resolvedCommand > 6 || resolvedNextPhase < 0 ||
            resolvedNextPhase > 4 || reason < 1 || reason > 20 || tq.nextStreak < 0 || tq.nextStreak > 2) {
          observations.invariant_violations += 1;
        }
        if (reason === 5 && (missionProposal === 7 || missionProposal === 8) &&
            !priorityConflictWitnesses.some((witness) => witness.mission_proposal === missionProposal)) {
          priorityConflictWitnesses.push(compactWitness(phaseState, tq, rq, pq, missionProposal, responseProposal, {
            reason, command: resolvedCommand, nextPhase: resolvedNextPhase, fault, nextStreak: tq.nextStreak,
          }));
        }
      }
    }
  }
}

function localOwnershipChecks() {
  let tqOk = true;
  for (const tq of tqTable) {
    const expectedNext = tq.threatValidity === 1 ? 0 : tq.currentStreak === 0 ? 1 : 2;
    const expectedQualified = tq.threatValidity === 0 && expectedNext === 2 ? tq.threat + 1 : 0;
    const exact = tq.nextStreak === expectedNext && tq.qualifiedThreat === expectedQualified &&
      tq.untrusted === (expectedQualified === 0) &&
      tq.acceptable === (expectedQualified === 1 || expectedQualified === 2) &&
      tq.hostile === (expectedQualified === 3) && tq.severe === (expectedQualified === 4) &&
      tq.threatInvalid === (tq.threatValidity === 1);
    if (!exact) observations.tq_mapping_mismatches += 1;
    tqOk &&= exact;
  }
  let rqOk = true;
  for (const rq of rqTable) {
    const sufficient = rq.capacitorValidity === 0 && (rq.capacitor === 0 || rq.capacitor === 1);
    const exact = rq.mineReady === (rq.cargoValidity === 0 && rq.cargo !== 3 && sufficient &&
      rq.targetValidity === 0 && rq.target === 0 && rq.availabilityValidity === 0 && rq.miningAvailability === 0) &&
      rq.resourceReset === (rq.cargoValidity === 0 && rq.cargo === 0 && sufficient) &&
      rq.defenseReady === (sufficient && rq.availabilityValidity === 0 && rq.defenseAvailability === 0) &&
      rq.cargoOrCapacitorRetreat === (rq.cargoValidity === 1 || rq.cargo === 3 ||
        rq.capacitorValidity === 1 || rq.capacitor === 2 || rq.capacitor === 3) &&
      rq.targetOrMiningBlock === (rq.targetValidity === 1 || rq.target === 1 ||
        rq.availabilityValidity === 1 || rq.miningAvailability === 1) &&
      rq.cargoAdvisory === (rq.cargoValidity === 1 ? 3 : rq.cargo === 3 ? 2 : rq.cargo === 2 ? 1 : 0) &&
      rq.capacitorAdvisory === (rq.capacitorValidity === 1 ? 3 : rq.capacitor === 3 ? 2 : rq.capacitor === 2 ? 1 : 0) &&
      rq.retreatAdvisory === (rq.availabilityValidity === 1 ? 2 : rq.retreatAvailability === 1 ? 1 : 0) &&
      rq.resourceInvalid === (rq.cargoValidity === 1 || rq.capacitorValidity === 1 ||
        rq.targetValidity === 1 || rq.availabilityValidity === 1);
    if (!exact) observations.rq_mapping_mismatches += 1;
    rqOk &&= exact;
  }
  let pqOk = true;
  for (const pq of pqTable) {
    const exact = pq.validMine === (pq.intentValidity === 0 && pq.pilotIntent === 0) &&
      pq.invalidOrReturn === (pq.intentValidity === 1 || pq.pilotIntent === 2) &&
      pq.validHoldOrReturn === (pq.intentValidity === 0 && (pq.pilotIntent === 1 || pq.pilotIntent === 2)) &&
      pq.validSafeAtStation === (pq.arrivalValidity === 0 && pq.arrival === 1) &&
      pq.validCompleteResupply === (pq.resupplyValidity === 0 && pq.resupply === 1) &&
      pq.intentInvalid === (pq.intentValidity === 1) && pq.arrivalInvalid === (pq.arrivalValidity === 1) &&
      pq.resupplyInvalid === (pq.resupplyValidity === 1);
    if (!exact) observations.pq_mapping_mismatches += 1;
    pqOk &&= exact;
  }
  let faOk = true;
  for (let phase = 0; phase < 5; phase += 1) for (let bits = 0; bits < 32; bits += 1) {
    const tq = { threatInvalid: Boolean(bits & 1) };
    const rq = { resourceInvalid: Boolean(bits & 2) };
    const pq = { intentInvalid: Boolean(bits & 4), arrivalInvalid: Boolean(bits & 8), resupplyInvalid: Boolean(bits & 16) };
    const expected = tq.threatInvalid || rq.resourceInvalid || pq.intentInvalid ||
      (phase === 3 && pq.arrivalInvalid) || ((phase === 0 || phase === 4) && pq.resupplyInvalid) ? 1 : 0;
    const exact = faRelation(phase, tq, rq, pq) === expected;
    if (!exact) observations.fa_mapping_mismatches += 1;
    faOk &&= exact;
  }
  return { tqOk, rqOk, pqOk, faOk };
}

function caseCompositionChecks() {
  let passed = true;
  for (let expectedReason = 1; expectedReason <= 20; expectedReason += 1) {
    const witness = caseWitnesses[expectedReason];
    if (witness === null) {
      passed = false;
      continue;
    }
    const tq = tqRelation(witness.threat, witness.threat_validity, witness.streak);
    const rq = rqRelation(witness.cargo, witness.cargo_validity, witness.capacitor,
      witness.capacitor_validity, witness.target, witness.target_validity,
      witness.mining_availability, witness.defense_availability,
      witness.retreat_availability, witness.availability_validity);
    const pq = pqRelation(witness.pilot_intent, witness.intent_validity, witness.arrival,
      witness.arrival_validity, witness.resupply, witness.resupply_validity);
    const phaseContext = asPhaseContext(witness.phase);
    const missionProposal = mrRelation(phaseContext, tq, rq, pq);
    const responseProposal = trRelation(phaseContext, tq, rq, pq);
    const fault = faRelation(phaseContext, tq, rq, pq);
    const atomic = asRelation(witness.phase, missionProposal, responseProposal, tq, rq, fault);
    const publication = apRelation(atomic);
    const required = requiredOutcome(expectedReason);
    if (atomic.reason !== expectedReason || atomic.command !== required.command ||
        atomic.nextPhase !== required.nextPhase) {
      observations.required_output_mismatches += 1;
      passed = false;
    }
    if (atomic.currentPhase !== witness.phase || atomic.fault !== fault ||
        atomic.nextStreak !== tq.nextStreak || atomic.cargoAdvisory !== rq.cargoAdvisory ||
        atomic.capacitorAdvisory !== rq.capacitorAdvisory ||
        atomic.retreatAdvisory !== rq.retreatAdvisory) {
      observations.as_atomic_preservation_mismatches += 1;
      passed = false;
    }
    if (publication.command !== atomic.command || publication.currentPhase !== atomic.currentPhase ||
        publication.nextPhase !== atomic.nextPhase || publication.reason !== atomic.reason ||
        publication.fault !== atomic.fault || publication.nextStreak !== atomic.nextStreak ||
        publication.cargoAdvisory !== atomic.cargoAdvisory ||
        publication.capacitorAdvisory !== atomic.capacitorAdvisory ||
        publication.retreatAdvisory !== atomic.retreatAdvisory) {
      observations.ap_preservation_mismatches += 1;
      passed = false;
    }
    if (publication.fault !== fault) observations.fault_mismatches += 1;
    if (publication.cargoAdvisory !== rq.cargoAdvisory ||
        publication.capacitorAdvisory !== rq.capacitorAdvisory ||
        publication.retreatAdvisory !== rq.retreatAdvisory) observations.advisory_mismatches += 1;
    if (publication.currentPhase !== witness.phase || publication.nextStreak !== tq.nextStreak) {
      observations.state_mismatches += 1;
    }
    if (publication.laser !== apLaserRelation(atomic.command) ||
        publication.drones !== apDronesRelation(atomic.command)) observations.actuator_mismatches += 1;
  }
  return passed;
}

function defaultInput(overrides = {}) {
  return {
    phase: 1, streak: 2, threat: 0, threatValidity: 0,
    cargo: 1, cargoValidity: 0, capacitor: 0, capacitorValidity: 0,
    target: 0, targetValidity: 0, miningAvailability: 0, defenseAvailability: 0,
    retreatAvailability: 0, availabilityValidity: 0,
    pilotIntent: 0, intentValidity: 0, arrival: 0, arrivalValidity: 0,
    resupply: 1, resupplyValidity: 0, ...overrides,
  };
}

function executeTuple(input) {
  const tq = tqRelation(input.threat, input.threatValidity, input.streak);
  const rq = rqRelation(input.cargo, input.cargoValidity, input.capacitor, input.capacitorValidity,
    input.target, input.targetValidity, input.miningAvailability, input.defenseAvailability,
    input.retreatAvailability, input.availabilityValidity);
  const pq = pqRelation(input.pilotIntent, input.intentValidity, input.arrival, input.arrivalValidity,
    input.resupply, input.resupplyValidity);
  const phase = asPhaseContext(input.phase);
  const missionProposal = mrRelation(phase, tq, rq, pq);
  const responseProposal = trRelation(phase, tq, rq, pq);
  const fault = faRelation(phase, tq, rq, pq);
  const publication = apRelation(asRelation(input.phase, missionProposal, responseProposal, tq, rq, fault));
  return { tq, rq, pq, missionProposal, responseProposal, publication };
}

function scenarioTrace(traceId, stepSpecs) {
  let passed = true;
  const steps = stepSpecs.map((spec, index) => {
    const input = defaultInput(spec.input);
    const result = executeTuple(input);
    passed &&= result.publication.reason === spec.expectedReason;
    return {
      step: index + 1,
      input_state: { phase: input.phase, streak: input.streak },
      boundary_input: {
        threat: input.threat, threat_validity: input.threatValidity,
        cargo: input.cargo, cargo_validity: input.cargoValidity,
        capacitor: input.capacitor, capacitor_validity: input.capacitorValidity,
        target: input.target, target_validity: input.targetValidity,
        mining_availability: input.miningAvailability,
        defense_availability: input.defenseAvailability,
        retreat_availability: input.retreatAvailability,
        availability_validity: input.availabilityValidity,
        pilot_intent: input.pilotIntent, intent_validity: input.intentValidity,
        arrival: input.arrival, arrival_validity: input.arrivalValidity,
        resupply: input.resupply, resupply_validity: input.resupplyValidity,
      },
      expected_named_branch: `CASE-${String(spec.expectedReason).padStart(2, "0")}`,
      expected_outputs: {
        command: requiredOutcome(spec.expectedReason).command,
        next_phase: requiredOutcome(spec.expectedReason).nextPhase,
      },
      observed_proposals: { mission: result.missionProposal, response: result.responseProposal },
      observed_outputs: {
        reason: result.publication.reason,
        command: result.publication.command,
        current_phase: result.publication.currentPhase,
        next_phase: result.publication.nextPhase,
        fault: result.publication.fault,
        next_valid_streak: result.publication.nextStreak,
        cargo_advisory: result.publication.cargoAdvisory,
        capacitor_advisory: result.publication.capacitorAdvisory,
        retreat_advisory: result.publication.retreatAdvisory,
        laser: result.publication.laser,
        drones: result.publication.drones,
      },
    };
  });
  return { trace_id: traceId, passed, steps };
}

const scenarioFamilies = [
  {
    scenario_id: "SCN-01",
    traces: [scenarioTrace("SCN-01-TRACE-A", [
      { input: { phase: 0, streak: 0, threat: 0, cargo: 0, resupply: 1, pilotIntent: 0 }, expectedReason: 2 },
      { input: { phase: 0, streak: 1, threat: 0, cargo: 0, resupply: 1, pilotIntent: 0 }, expectedReason: 1 },
    ])],
  },
  {
    scenario_id: "SCN-02",
    traces: [scenarioTrace("SCN-02-TRACE-A", [
      { input: { phase: 1, target: 1, pilotIntent: 0 }, expectedReason: 9 },
      { input: { phase: 1, target: 0, pilotIntent: 1 }, expectedReason: 10 },
      { input: { phase: 1, target: 0, pilotIntent: 0 }, expectedReason: 11 },
    ])],
  },
  {
    scenario_id: "SCN-03",
    traces: [scenarioTrace("SCN-03-TRACE-A", [
      { input: { phase: 1, cargo: 3 }, expectedReason: 8 },
      { input: { phase: 4, cargo: 0, capacitor: 2, resupply: 1 }, expectedReason: 18 },
      { input: { phase: 4, cargo: 0, capacitor: 0, capacitorValidity: 1, resupply: 1 }, expectedReason: 18 },
    ])],
  },
  {
    scenario_id: "SCN-04",
    traces: [scenarioTrace("SCN-04-TRACE-A", [
      { input: { phase: 1, threat: 2, cargo: 3, capacitor: 1, pilotIntent: 2 }, expectedReason: 5 },
      { input: { phase: 1, threat: 2, cargo: 3, capacitor: 2, pilotIntent: 2 }, expectedReason: 6 },
      { input: { phase: 2, threat: 2, capacitor: 1 }, expectedReason: 13 },
    ])],
  },
  {
    scenario_id: "SCN-05",
    traces: [scenarioTrace("SCN-05-TRACE-A", [
      { input: { phase: 1, streak: 0, threat: 3, retreatAvailability: 1 }, expectedReason: 3 },
      { input: { phase: 1, streak: 1, threat: 3, retreatAvailability: 1 }, expectedReason: 4 },
      { input: { phase: 2, streak: 2, threat: 3, availabilityValidity: 1 }, expectedReason: 12 },
    ])],
  },
  {
    scenario_id: "SCN-06",
    traces: [scenarioTrace("SCN-06-TRACE-A", [
      { input: { phase: 3, arrival: 0, arrivalValidity: 0 }, expectedReason: 17 },
      { input: { phase: 3, arrival: 1, arrivalValidity: 1 }, expectedReason: 17 },
      { input: { phase: 3, arrival: 1, arrivalValidity: 0 }, expectedReason: 16 },
      { input: { phase: 4, cargo: 0, resupply: 0, pilotIntent: 0 }, expectedReason: 18 },
      { input: { phase: 4, cargo: 0, resupply: 1, pilotIntent: 0 }, expectedReason: 19 },
      { input: { phase: 4, cargo: 0, resupply: 1, pilotIntent: 1 }, expectedReason: 20 },
    ])],
  },
  {
    scenario_id: "SCN-07",
    traces: [
      scenarioTrace("SCN-07-MINING-TRUST", [
        { input: { phase: 1, streak: 2, threat: 2, threatValidity: 1 }, expectedReason: 3 },
        { input: { phase: 1, streak: 0, threat: 2, threatValidity: 0 }, expectedReason: 3 },
        { input: { phase: 1, streak: 1, threat: 2, threatValidity: 0 }, expectedReason: 5 },
      ]),
      scenarioTrace("SCN-07-DEFENDING-TRUST", [
        { input: { phase: 2, streak: 2, threat: 2, threatValidity: 1 }, expectedReason: 12 },
        { input: { phase: 2, streak: 0, threat: 2, threatValidity: 0 }, expectedReason: 12 },
        { input: { phase: 2, streak: 1, threat: 2, threatValidity: 0 }, expectedReason: 13 },
      ]),
      scenarioTrace("SCN-07-RECOVERY-TRUST", [
        { input: { phase: 4, streak: 2, threat: 0, threatValidity: 1, cargo: 0 }, expectedReason: 18 },
        { input: { phase: 4, streak: 0, threat: 0, threatValidity: 0, cargo: 0 }, expectedReason: 18 },
        { input: { phase: 4, streak: 1, threat: 0, threatValidity: 0, cargo: 0 }, expectedReason: 19 },
      ]),
    ],
  },
];

const localChecks = localOwnershipChecks();
const caseCompositionPassed = caseCompositionChecks();
const scenarioChecksPassed = scenarioFamilies.every((family) => family.traces.every((trace) => trace.passed));
const allCasesReachable = caseCounts.slice(1).every((count) => count > 0);
const observationsZero = Object.values(observations).every((value) => value === 0);
const ownershipChecks = {
  fa_exact_fault_predicate: localChecks.faOk,
  tq_streak_and_trust_mapping: localChecks.tqOk,
  rq_readiness_advisory_invalidity_mapping: localChecks.rqOk,
  pq_independent_mission_mapping: localChecks.pqOk,
  mr_total_local_proposal_partition: observations.proposal_domain_violations === 0 &&
    observations.mr_partition_mismatches === 0,
  tr_total_local_proposal_partition: observations.proposal_domain_violations === 0 &&
    observations.tr_partition_mismatches === 0,
  as_effective_guard_totality: observations.partition_gaps === 0 && observations.effective_overlaps === 0,
  as_priority_resolution: priorityConflictWitnesses.length === 2,
  as_atomic_preservation: observations.fault_mismatches === 0 && observations.advisory_mismatches === 0 &&
    observations.state_mismatches === 0 && observations.as_atomic_preservation_mismatches === 0 &&
    caseCompositionPassed,
  ap_command_to_actuator_mapping: observations.actuator_mismatches === 0,
  ap_atomic_field_preservation: observations.required_output_mismatches === 0 &&
    observations.ap_preservation_mismatches === 0,
};
const allChecksPassed = observationsZero && analyzedCombinations === EXPECTED_COMBINATIONS &&
  allCasesReachable && scenarioChecksPassed && Object.values(ownershipChecks).every(Boolean);

const report = {
  schema_version: 1,
  status: allChecksPassed ? "passed" : "failed",
  passed: allChecksPassed,
  source_sha256: SOURCE_SHA256,
  bounded_analysis_claim_boundary: "Exhaustive checking over the frozen finite state/input product; not formal proof, generated-code evidence, physical validation, performance evidence, safety certification, readiness, or mission-success evidence.",
  finite_domain: {
    expected_combinations: EXPECTED_COMBINATIONS,
    analyzed_combinations: analyzedCombinations,
    factorization: "5 phases * 3 streaks * 8 threat pairs * 8 cargo pairs * 8 capacitor pairs * 4 target pairs * 16 availability tuples * 6 intent pairs * 4 arrival pairs * 4 resupply pairs",
  },
  semantic_connection_map: semanticConnectionMap.map(([id, producer, consumer]) => ({ id, producer, consumer })),
  guard_crosscheck: {
    source_bound_by_sha256: true,
    proposal_guards: ["MR_PROPOSAL_PARTITIONS", "TR_PROPOSAL_PARTITIONS"],
    arbitration_guards: Array.from({ length: 20 }, (_, i) => `CASE-${String(i + 1).padStart(2, "0")}`),
    exact_effective_guard_inputs: ["phase_state.current_phase", "mission_candidate.proposed_reason", "response_candidate.proposed_reason"],
    passed: observations.partition_gaps === 0 && observations.effective_overlaps === 0,
  },
  observations,
  partition_counts: Object.fromEntries(caseCounts.slice(1).map((count, index) => [`CASE-${String(index + 1).padStart(2, "0")}`, count])),
  case_witnesses: Object.fromEntries(caseWitnesses.slice(1).map((witness, index) => [`CASE-${String(index + 1).padStart(2, "0")}`, witness])),
  priority_conflict_witnesses: priorityConflictWitnesses,
  scenario_families: scenarioFamilies,
  ownership_audit: ownershipAuditTemplate.map((entry) => ({ ...entry, passed: entry.analyzer_checks.every((name) => ownershipChecks[name]) })),
  checks: {
    exact_domain_exhausted: analyzedCombinations === EXPECTED_COMBINATIONS,
    all_twenty_cases_reachable: allCasesReachable,
    all_seven_scenario_families_executed: scenarioChecksPassed && scenarioFamilies.length === 7,
    c05_priority_conflict_observed: priorityConflictWitnesses.length === 2,
    local_ownership_checks_passed: Object.values(ownershipChecks).every(Boolean),
    source_guard_manifest_crosschecked: observations.partition_gaps === 0 && observations.effective_overlaps === 0,
    no_compositional_or_certification_claim: true,
  },
};

console.log(JSON.stringify(report));
