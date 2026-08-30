---
seed_id: mining-threat-retreat-service-supervision-20260812-a7
version: 1
status: frozen
complexity: hard
title: Mining-frigate threat, retreat, and service supervision
source_commit: ebbb0c39f4813b059e0bf14270ec58618aa012ca
---

# Mining-frigate threat, retreat, and service supervision

NEED-01: A mining frigate needs supervision so mining and cargo handling cannot mask defense, retreat, faults, or recovery.

PURPOSE-01: From finite intent, threat, resource, location, availability, and outcome inputs, atomically publish one action, reason, mode, and recovery state.

STAKE-01: Fleet command needs threat priority and retreat fallback. STAKE-02: Operations needs predictable mining, return, and service. STAKE-03: Engineering needs faults to propagate to inhibition and recovery.

## Source basis

At commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca`, sources are `models/example_EveOnlineMiningFrigate/DomainModel/{BusinessCaseOpsCon,Concerns,Domain,MiningFrigate,MiningFrigateRequirementsDef}.sysml` and `models/example_EveOnlineMiningFrigate/UseCases/OperationalUseCaseActions.sysml`. They ground mining, cargo/capacitor limits, threat priority, defense, navigation, docking, offload/resupply, reports, and stakeholder concerns; finite policy is conservatively added.

## Context and boundary

CTX-01: One-frigate decision supervision is in scope. Pilot, sensing, observations, execution, destinations, stations, ore transfer, and resupply are external; each evaluation selects at most one action.

MON-01: Inputs: `Intent={HOLD,MINE,DEFEND,RETREAT,RESET}`; `ThreatSample={INVALID,CLEAR,SUSPECT,HOSTILE}`; `CargoBand={EMPTY,PARTIAL,FULL}`; `CapacitorBand={LOW,READY}`; `Location={FIELD,DOCKED}`; Booleans `miningAvailable,defenseAvailable,retreatAvailable,destinationAvailable,serviceAvailable`; `ActionOutcome={NONE,SUCCEEDED_HOLD,SUCCEEDED_MINE,SUCCEEDED_DEFEND,SUCCEEDED_RETREAT,SUCCEEDED_SERVICE,FAILED}`.

CTRL-01: Domains: `ThreatDisposition={UNKNOWN,CLEAR,SUSPECT,HOSTILE}`; `RecoveryState={HEALTHY,LATCHED,RECOVERING}`; `RecoveryGate={OPEN,CLOSED}`; `EmergencyState={INACTIVE,ACTIVE}`; `Proposal={DENIED,PROPOSED}`; `MobilityProposal={DENIED,RETREAT,SERVICE}`; `Action={HOLD,MINE,DEFEND,RETREAT,SERVICE}`; `SelectedCause={FAULT_OR_RECOVERY,RETREAT_PRIORITY,DEFENSE_PRIORITY,SERVICE_REQUIRED,MINING_ALLOWED,HOLD_POLICY}`; `Mode={HOLD,MINING,DEFENDING,RETREATING,SERVICING,FAULT}`; `ReadinessSnapshot=CargoBand x CapacitorBand x Location x Boolean^5`; `PublicResult=(Action,SelectedCause,Mode,RecoveryState)`.

ASM-01: `RESET` and non-`NONE` outcomes are fresh, consumed-once events; success tags identify the completed action. ASM-02: `INVALID` means unusable evidence, not a physical claim. ASM-03: availability means command acceptance; retreat also needs a destination. Initial recovery/mode are `HEALTHY/HOLD`.

## Behavioral requirements and contract cases

REQ-01: Threat qualification is total: CASE-01 `INVALID -> UNKNOWN`; CASE-02 `CLEAR -> CLEAR`; CASE-03 `SUSPECT -> SUSPECT`; CASE-04 `HOSTILE -> HOSTILE`.

REQ-02: Recovery is first-match; trigger=`UNKNOWN` or `FAILED`. CASE-05 trigger from any state -> `LATCHED`; CASE-06 nontriggering `HEALTHY -> HEALTHY`; CASE-07 nontriggering `LATCHED` + fresh `RESET -> RECOVERING`; CASE-08 nontriggering `RECOVERING` + `Intent=HOLD` + fresh `SUCCEEDED_HOLD -> HEALTHY`; CASE-09 other nontriggering `LATCHED/RECOVERING` inputs preserve state. Next `HEALTHY` emits `OPEN/INACTIVE`; otherwise `CLOSED/ACTIVE`.

REQ-03: Mining: CASE-10 `PROPOSED` iff gate open + `MINE` + clear + field + nonfull cargo + ready capacitor + mining available; CASE-11 otherwise `DENIED`.

REQ-04: Defense: CASE-12 `PROPOSED` iff gate open + field + ready capacitor + defense available + (suspect/hostile or clear with `DEFEND`); CASE-13 otherwise `DENIED`.

REQ-05: Mobility/service is first-match: CASE-14 `RETREAT` iff gate open + field + retreat/destination available + (hostile or full cargo or `RETREAT`); CASE-15 otherwise `SERVICE` iff gate open + docked + service available + (nonempty cargo or low capacitor); CASE-16 otherwise `DENIED`.

REQ-06: Strict arbitration: CASE-17 emergency -> `(HOLD,FAULT_OR_RECOVERY)`; CASE-18 else retreat -> `(RETREAT,RETREAT_PRIORITY)`; CASE-19 else defense -> `(DEFEND,DEFENSE_PRIORITY)`; CASE-20 else service -> `(SERVICE,SERVICE_REQUIRED)`; CASE-21 else mining -> `(MINE,MINING_ALLOWED)`; CASE-22 else `(HOLD,HOLD_POLICY)`.

REQ-07: Mode: CASE-23 nonhealthy recovery -> `FAULT`; when healthy, CASE-24 hold -> `HOLD`; CASE-25 mine -> `MINING`; CASE-26 defend -> `DEFENDING`; CASE-27 retreat -> `RETREATING`; CASE-28 service -> `SERVICING`.

REQ-08: Atomically publish action, cause, mode, and actual next recovery. Every nonhealthy result is `(HOLD,FAULT_OR_RECOVERY,FAULT,actual-next-recovery)`.

REQ-09: Invalid threat or failed action latches immediately and closes all proposals. Individual unavailability only denies its proposal and never changes recovery.

REQ-10: Feasible retreat outranks defense/mining for full cargo or hostility; defense is hostile fallback. Needed dock service precedes mining but not emergency.

## Scenario families

SCN-01: Clear/field/ready/nonfull/available fresh mining. SCN-02: Full cargo retreats before requested defense/mining. SCN-03: Suspect defense beats mining. SCN-04: Hostile retreat beats defense. SCN-05: Infeasible hostile retreat falls to defense. SCN-06: Low capacitor denies mining/defense to hold. SCN-07: Clear requested defense. SCN-08: Docked resource need selects service. SCN-09: Unavailable needed service holds without fault. SCN-10: Invalid threat latches atomic hold/fault. SCN-11: Fresh failure does likewise. SCN-12: Known-threat reset enters recovery; only a later fresh hold success with `HOLD` clears it; missing/wrong success, reset, invalidity, or failure cannot, and work needs a new request.

## Required design consideration

Compare (A) co-located qualification/recovery/policy/arbitration with separate observation/publication and (B) separate threat, recovery, and action-policy owners composed at one priority/publication boundary. Assess state ownership, priority traceability, fault propagation, recovery evidence, atomicity, and interaction burden.

## Structural bounds

Hard bounds: 13..16 semantic usages, 22..35 typed directed interactions, 21..30 nontrivial contract cases, 9..12 scenario families, with multiple owners, priority, fault propagation, recovery, and composition. Realized: 14 usages (five inputs plus nine assessment/state/decision/composition owners), 34 interactions, 28 cases, and 12 scenarios. Allocations must remain in bounds without decoration or routing flows.

## Exact interaction inventory

INT-01: threat_observation.threat_sample -> threat_qualification.threat_sample : ThreatSample
INT-02: intent_acquisition.intent -> recovery_control.intent : Intent
INT-03: intent_acquisition.intent -> mining_eligibility.intent : Intent
INT-04: intent_acquisition.intent -> defense_eligibility.intent : Intent
INT-05: intent_acquisition.intent -> mobility_service_eligibility.intent : Intent
INT-06: resource_observation.cargo_band -> readiness_snapshot.cargo_band : CargoBand
INT-07: resource_observation.capacitor_band -> readiness_snapshot.capacitor_band : CapacitorBand
INT-08: resource_observation.location -> readiness_snapshot.location : Location
INT-09: availability_observation.mining_available -> readiness_snapshot.mining_available : Boolean
INT-10: availability_observation.defense_available -> readiness_snapshot.defense_available : Boolean
INT-11: availability_observation.retreat_available -> readiness_snapshot.retreat_available : Boolean
INT-12: availability_observation.destination_available -> readiness_snapshot.destination_available : Boolean
INT-13: availability_observation.service_available -> readiness_snapshot.service_available : Boolean
INT-14: outcome_observation.action_outcome -> recovery_control.action_outcome : ActionOutcome
INT-15: threat_qualification.threat_disposition -> recovery_control.threat_disposition : ThreatDisposition
INT-16: threat_qualification.threat_disposition -> mining_eligibility.threat_disposition : ThreatDisposition
INT-17: threat_qualification.threat_disposition -> defense_eligibility.threat_disposition : ThreatDisposition
INT-18: threat_qualification.threat_disposition -> mobility_service_eligibility.threat_disposition : ThreatDisposition
INT-19: readiness_snapshot.snapshot -> mining_eligibility.snapshot : ReadinessSnapshot
INT-20: readiness_snapshot.snapshot -> defense_eligibility.snapshot : ReadinessSnapshot
INT-21: readiness_snapshot.snapshot -> mobility_service_eligibility.snapshot : ReadinessSnapshot
INT-22: recovery_control.recovery_gate -> mining_eligibility.recovery_gate : RecoveryGate
INT-23: recovery_control.recovery_gate -> defense_eligibility.recovery_gate : RecoveryGate
INT-24: recovery_control.recovery_gate -> mobility_service_eligibility.recovery_gate : RecoveryGate
INT-25: recovery_control.emergency_state -> priority_arbitration.emergency_state : EmergencyState
INT-26: mining_eligibility.mining_proposal -> priority_arbitration.mining_proposal : Proposal
INT-27: defense_eligibility.defense_proposal -> priority_arbitration.defense_proposal : Proposal
INT-28: mobility_service_eligibility.mobility_proposal -> priority_arbitration.mobility_proposal : MobilityProposal
INT-29: priority_arbitration.selected_action -> mission_mode.selected_action : Action
INT-30: recovery_control.next_recovery_state -> mission_mode.next_recovery_state : RecoveryState
INT-31: mission_mode.next_mode -> public_result_composition.next_mode : Mode
INT-32: priority_arbitration.selected_action -> public_result_composition.selected_action : Action
INT-33: priority_arbitration.selected_cause -> public_result_composition.selected_cause : SelectedCause
INT-34: recovery_control.next_recovery_state -> public_result_composition.next_recovery_state : RecoveryState

## Pre-freeze realizability audit

AUDIT-OWNERS: passed - acquisitions O:intent,sample,cargo/capacitor/location,five availabilities,outcome; qualification I:sample O:disposition; readiness I:resources/location/availabilities O:snapshot; recovery I:state,intent,disposition,outcome O:state,gate,emergency; three policies I:intent,disposition,snapshot,gate O:proposals; arbitration I:emergency,proposals O:action,cause; mode I:action,recovery O:mode; composition I:action,cause,mode,recovery O:result.
AUDIT-PARTITIONS: passed - CASE-01..28 close all finite domains under first-match rules; fresh events prevent stale/implicit exits, and recovery needs later `HOLD` success before a new work request.
AUDIT-INTERACTIONS: passed - recounted 34 from zero; every guard/result dependency and each fan-out is listed separately, including selected cause into the atomic public result.

## Claim boundary

EXCL-01: Exclude profitability, spacecraft physics, survivability/neutralization success, real timing/range/rates, safety, human performance, fleet coordination, and deployment. EXCL-02: Bounded modeling, checking, visualization, or later execution inherits no proof, correctness, physical validity, certification, or production readiness.
