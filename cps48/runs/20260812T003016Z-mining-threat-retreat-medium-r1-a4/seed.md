---
seed_id: mining-threat-retreat-supervision-20260812-r1-a4
version: 1
status: frozen
complexity: medium
---

# Mining threat-response and retreat supervision

NEED-01: A mining-frigate pilot and commander need deterministic mining,
defense, retreat, and recovery despite invalid data.

PURPOSE-01: Resolve command, phase, reason, fault, and advisories across
nominal, conflict, and recovery paths.

STAKE-01: Pilot, Fleet Command, Operations/Engineering, and allocation reviewers
own intent, response, resources/recovery, and comparison concerns.

CTX-01: External actors perform mining, combat, travel, docking, offload, and
resupply; the boundary observes and commands.

CTX-02: Five drones, 5,000 m3 cargo, and 20 AU detection motivate bands only.

## Finite domain and boundary

MON-01: State: `phase=Docked|Mining|Defending|Retreating|Recovery` (initial
Docked); threat `valid_streak=0|1|2` (initial 0).

MON-02: Tick inputs: `threat=Clear|Caution|Hostile|Severe`; `cargo=Empty|Partial|
NearlyFull|Full`; `capacitor=High|Adequate|Low|Critical`; `target=Available|
Depleted`; each has independent `Valid|Invalid` validity.

MON-03: `mining_availability`, `defense_availability`, and
`retreat_availability` are `Available|Unavailable` under one
`availability_validity=Valid|Invalid`.

MON-04: `pilot_intent=Mine|Hold|Return`, `arrival=EnRoute|SafeAtStation`, and
`resupply=Incomplete|Complete` have independent `Valid|Invalid` validity;
arrival is Retreating-only, resupply Docked/Recovery-only.

CTRL-01: Outputs: command `StayDocked|Depart|Mine|HoldAtSite|Defend|
Retreat|Recover`, current/next phase, reason `C01|...|C20`.

CTRL-02: Also output laser `Enabled|Disabled`; drones `Stowed|Mining|Defense`;
cargo `Normal|NearlyFull|Full|Unknown`, capacitor `Normal|Low|Critical|Unknown`,
and retreat `Ready|Unavailable|Unknown` advisories; fault `Clear|Asserted`; and
`next_valid_streak=0|1|2`.

## Assumptions

ASM-01: A tick consumes one classified snapshot; no stale event or hidden
provenance.

ASM-02: Invalid threat gives next streak 0; Valid gives
`min(2,valid_streak+1)`. Threat is `Untrusted` until next streak 2, then the
current band; trust needs two fresh Valid ticks, and Invalid is not Clear.

ASM-03: `mine_ready` needs valid non-Full cargo, High/Adequate capacitor,
Available target/availability/mining. `defense_ready` needs valid High/Adequate
capacitor and Available defense/availability. `resource_reset` needs valid Empty
cargo and High/Adequate capacitor; `recovery_complete` also needs valid Complete
resupply. These are logical only.

ASM-04: Clear/Caution is `acceptable`; others are not. Retreat may be requested
with invalid/unavailable capability without claiming escape.

ASM-05: Invalid intent blocks departure/recovery and retreats Mining; invalid
inputs cannot prove readiness; only fresh valid SafeAtStation leaves Retreating.

## Behavioral requirements

REQ-01: Fault is Asserted for any invalid MON-02/03 input or intent, relevant
invalid arrival, or Docked/Recovery-invalid resupply; else Clear.

REQ-02: Invalid cargo/capacitor maps Unknown; otherwise cargo maps Full/
NearlyFull/Normal and capacitor Critical/Low/Normal. Retreat maps invalid
availability to Unknown, else Ready/Unavailable.

REQ-03: Mission/recovery proposes `None|C01|C02|C07..C11|C14|C18..C20`;
threat/retreat `None|C03..C06|C12|C13|C15..C17`. Arbitration selects the first
phase-local row and publishes its identifier as reason.

| Case | Current phase; ordered guard | Command | Next phase |
|---|---|---|---|
| C01 | Docked; acceptable, mine_ready, recovery_complete, valid Mine | Depart | Mining |
| C02 | Docked; otherwise | StayDocked | Docked |
| C03 | Mining; Untrusted | Retreat | Retreating |
| C04 | Mining; Severe | Retreat | Retreating |
| C05 | Mining; Hostile and defense_ready | Defend | Defending |
| C06 | Mining; Hostile otherwise | Retreat | Retreating |
| C07 | Mining; invalid intent or Return | Retreat | Retreating |
| C08 | Mining; invalid/Full cargo or invalid/Low/Critical capacitor | Retreat | Retreating |
| C09 | Mining; invalid/Depleted target or invalid/unavailable mining | HoldAtSite | Mining |
| C10 | Mining; valid Hold | HoldAtSite | Mining |
| C11 | Mining; otherwise | Mine | Mining |
| C12 | Defending; Untrusted/Severe or not defense_ready | Retreat | Retreating |
| C13 | Defending; Hostile | Defend | Defending |
| C14 | Defending; acceptable, mine_ready, valid Mine | Mine | Mining |
| C15 | Defending; otherwise | Retreat | Retreating |
| C16 | Retreating; valid SafeAtStation | Recover | Recovery |
| C17 | Retreating; otherwise | Retreat | Retreating |
| C18 | Recovery; not acceptable, invalid intent, or not recovery_complete | Recover | Recovery |
| C19 | Recovery; acceptable, recovery_complete, mine_ready, valid Mine | Depart | Mining |
| C20 | Recovery; otherwise (valid Hold/Return) | StayDocked | Docked |

REQ-04: C03/C04 lead; C05 precedes C07/C08, so ready defense beats coincident
Hostile plus Return/Full/resource retreat; failed readiness gives C06. This
invented priority is not a safety claim.

REQ-05: Mine enables laser/Mining drones; Defend gives disabled laser/Defense
drones; otherwise laser is disabled and drones stowed. Outputs are atomic.

REQ-06: C01 is fresh Docked request; C16 alone enters Recovery; C18 holds for
fresh trust/intent/reset/resupply; C19 redeploys on readiness/Mine; C20
deliberately settles completed Hold/Return. No exit is triggerless.

REQ-07: Every input/state selects one case; qualifier mappings close
independently. Only its row and ASM-02 update state.

## Scenario families

SCN-01: Docked varies first/second Valid threat, resupply, intent, mining
availability.

SCN-02: Mining varies Mine/Hold/NearlyFull, target depletion/invalidity, and
mining availability.

SCN-03: Cargo/capacitor boundaries/invalidity exercise C08, advisories, and
reset.

SCN-04: Hostile plus Return/Full, defense, and capacitor exposes C05/C06/C13.

SCN-05: Severe/Untrusted and unavailable/invalid retreat exercise request and
advisories without success claims.

SCN-06: Retreat varies EnRoute/invalid/SafeAtStation; Recovery varies resupply,
reset, redeployment, and settlement.

SCN-07: Threat invalidation resets streak; two Valid ticks release Clear/Caution
or renew Hostile in Defending/Recovery.

## Required design consideration

Retain cooperating threat/retreat and mission/recovery policies, threat
qualification, and priority/state ownership. Compare (a) signal-centered
qualifiers feeding both policies and (b) phase-centered qualification with
shared arbitration. Compare state, invalidity, C05 visibility, contracts, and
interactions; select no algorithm, topology, or profile.

Connect observation through decisions to one atomic result, give each state one
owner, preserve order/reason, and orphan no duty. Require one weakly connected
region at depth `1..2`; wrappers/routing do not count.

## Structural bounds

Inclusive medium bounds: `8..12` responsibility-bearing usages, `15..21` typed
interactions, `12..20` nontrivial cases, `6..9` scenario families. Calibration:
8 usages, 17 interactions, 20 cases, 7 families.

Duties: observation intake (OI); threat qualification/streak (TQ); resource
qualification (RQ); intent/arrival/resupply qualification (PQ); mission/recovery
decision (MR); threat/retreat decision (TR); priority/phase arbitration (AS);
atomic publication (AP). Labels are responsibilities, not components.

## Source basis

Basis: `GfSE/SysML-v2-Models` commit
`ebbb0c39f4813b059e0bf14270ec58618aa012ca`; brief-cited
`DomainModel/{BusinessCaseOpsCon,Concerns,Domain,MiningFrigate,
MiningFrigateRequirementsDef}.sysml` and
`UseCases/OperationalUseCaseActions.sysml` under
`models/example_EveOnlineMiningFrigate/`. They ground stakeholders, mining,
defense/threat priority, resources, phases, offload/resupply. Bands, validity,
recovery, and cases are conservative additions.

EXCL-01: Exclude profit, markets, yield, fleet scale, scheduling.

EXCL-02: Exclude physics, survivability, successful defense/retreat, navigation,
real timing/range/rates, docking, and human performance.

EXCL-03: Exclude equipment sufficiency, selected allocation, code, production,
reliability, safety argument, and certification.

## Claim boundary

EXCL-04: Supports allocation comparison, visualization, finite scenarios, and
bounded checking; claims no proof, physical validity, mission success,
profitability, survivability, safety, readiness, or certification.

## Pre-freeze realizability audit

AUDIT-OWNERS: passed - TQ owns streak and threat/validity/state mapping; MR owns C01/C02/C07..C11/C14/C18..C20 from phase/threat/resources/intent/resupply; TR owns C03..C06/C12/C13/C15..C17 from phase/threat/defense/arrival; AS owns phase, finite proposal resolution, command/next-phase/reason; stateless OI/RQ/PQ/AP dependencies are INT-01..17.

AUDIT-PARTITIONS: passed - ASM-02, readiness/advisories, and final otherwise rows close all domains; fresh C01/C16/C19 and deliberate C20 use only current enumerated inputs/owned state, without stale events, hidden provenance, or triggerless exit.

AUDIT-INTERACTIONS: passed - recounted 17 - all producer-consumer dependencies, including selected reason in AS-to-AP atomic result, occur once below with separate fan-out and no containment, fields, or routing hops.

## Exact interaction inventory

INT-01: OI.raw_threat_snapshot -> TQ.raw_threat_input : ThreatObservation
INT-02: OI.raw_resource_snapshot -> RQ.raw_resource_input : ResourceObservation
INT-03: OI.raw_mission_snapshot -> PQ.raw_mission_input : MissionObservation
INT-04: AS.current_phase -> MR.phase_context : Phase
INT-05: AS.current_phase -> TR.phase_context : Phase
INT-06: TQ.qualified_threat -> MR.threat_fact : QualifiedThreat
INT-07: TQ.qualified_threat -> TR.threat_fact : QualifiedThreat
INT-08: RQ.mining_recovery_facts -> MR.resource_facts : MiningRecoveryFacts
INT-09: RQ.defense_facts -> TR.defense_facts : DefenseFacts
INT-10: PQ.intent_resupply_facts -> MR.mission_facts : MissionFacts
INT-11: PQ.arrival_fact -> TR.arrival_fact : ArrivalFact
INT-12: MR.mission_proposal -> AS.mission_candidate : MissionProposal
INT-13: TR.response_proposal -> AS.response_candidate : ResponseProposal
INT-14: TQ.threat_status -> AS.threat_status : ThreatStatus
INT-15: RQ.resource_status -> AS.resource_status : ResourceStatus
INT-16: PQ.mission_status -> AS.mission_status : MissionStatus
INT-17: AS.resolved_atomic_result -> AP.atomic_result : AtomicSupervisorResult
