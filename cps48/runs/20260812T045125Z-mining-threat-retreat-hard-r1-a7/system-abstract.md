---
abstract_id: SA-MTR-20260812A-R1
domain_seed: mining-threat-retreat-service-supervision-20260812-a7
campaign_complexity: hard
semantic_usage_count: 13
semantic_interaction_count: 31
nontrivial_contract_case_count: 28
scenario_family_count: 12
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
containment_depth_bounds: [1, 2]
root_system_usage_count: 1
weakly_connected_region_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
executable_profile: false
status: approved
---

# Mining-frigate threat, retreat, and service supervision

## Synopsis

NEED-01: A single mining frigate needs decision supervision so routine mining and cargo handling cannot mask defense, retreat, detected faults, or recovery.

PURPOSE-01: For each evaluation of finite intent, threat, resource, location, availability, and action-outcome inputs, the system shall publish one coherent public result containing an action, its selection cause, the observable mission mode, and the actual next recovery state.

SCOPE-01: This abstract defines bounded supervisory policy for one frigate and its observable decision result; sensing, piloting, action execution, destinations, docking stations, ore transfer, resupply, spacecraft dynamics, and fleet coordination remain outside the system boundary.

## Evidence and claim classes

BASIS-01: Domain facts cited by the frozen seed at commit `ebbb0c39f4813b059e0bf14270ec58618aa012ca` support mining, cargo and capacitor limits, threat priority, defense, navigation, docking, offload and resupply, reports, and the named stakeholder concerns; this abstract does not claim an independent rereview of those upstream sources.

BASIS-02: FAA/NASA methodology guidance governs problem-first definition, boundary control, alternatives, traceability, measurable verification, and separation of verification from validation; it does not establish mining-frigate behavior or physical correctness.

PILOT-01: The finite enumerations, conservative first-match policy, consumed-once event interpretation, deterministic evaluation boundary, and atomic public tuple are pilot abstractions frozen by the seed, not handbook facts or spacecraft-performance claims.

ARCH-01: The approved logical architecture contains five external-context/source usages and eight internal assessment, state, proposal, decision, mode, and composition owners; it prescribes responsibilities and information dependencies but not threads, scheduling, deployment, algorithms, encodings, or source-language mechanisms.

DEFER-01: Profitability, spacecraft physics, survivability or neutralization success, real timing, range, rates, safety, human performance, fleet coordination, deployment, production readiness, and certification are excluded rather than assumed satisfied.

DEFER-02: Code generation, application implementation, executable scenarios, formal proof, and claims beyond later retained typechecking, owner-local contract analysis, bounded finite analysis, trace analysis, and visualization evidence remain `not-run`; the seed declares no executable profile.

## Goals and stakeholders

GOAL-01: Emergency and recovery inhibition shall dominate productive work so unusable threat evidence or a failed action cannot be hidden by mining, defense, retreat, or service requests.

GOAL-02: Feasible retreat shall dominate defense and mining when hostility, full cargo, or explicit retreat intent requires it, while defense remains the hostile fallback when retreat is infeasible.

GOAL-03: Mining, docking service, defense, hold, and recovery behavior shall be predictable from the finite public inputs and previous recovery state.

GOAL-04: The system shall expose one internally consistent action/cause/mode/recovery result per evaluation so external consumers cannot observe a mixed decision epoch.

STAKE-01: Fleet command depends on traceable threat priority and retreat fallback.

STAKE-02: Mining operations depends on predictable mining, return, hold, and service selection.

STAKE-03: Engineering depends on visible fault propagation, work inhibition, and evidence-based recovery.

## Operational context and boundary

CTX-01: Fleet command or the frigate pilot supplies finite intent, including fresh reset intent, and consumes the public result.

CTX-02: External threat sensing supplies a threat sample whose `INVALID` value reports unusable evidence rather than a physical threat assertion.

CTX-03: External resource and location observation supplies cargo band, capacitor band, and field-or-docked location.

CTX-04: External action-acceptance sources report whether mining, defense, retreat, destination, and service commands are presently acceptable.

CTX-05: External action execution reports a fresh, action-tagged outcome or no new outcome; it executes but does not select the supervisory action.

CTX-06: External retreat destinations accept retreat actions when destination and retreat availability permit them.

CTX-07: External stations, ore transfer, and resupply services accept service actions when the frigate is docked and service is available.

MON-01: `Intent={HOLD,MINE,DEFEND,RETREAT,RESET}` is supplied by CTX-01; `RESET` is a fresh, consumed-once event rather than persistent permission.

MON-02: `ThreatSample={INVALID,CLEAR,SUSPECT,HOSTILE}` is supplied by CTX-02; its values are finite status-bearing evidence and have no physical unit.

MON-03: `CargoBand={EMPTY,PARTIAL,FULL}`, `CapacitorBand={LOW,READY}`, and `Location={FIELD,DOCKED}` are supplied by CTX-03 as unitless pilot bands.

MON-04: Boolean `miningAvailable`, `defenseAvailable`, `retreatAvailable`, `destinationAvailable`, and `serviceAvailable` are supplied by CTX-04 and mean command acceptance, not guaranteed action success.

MON-05: `ActionOutcome={NONE,SUCCEEDED_HOLD,SUCCEEDED_MINE,SUCCEEDED_DEFEND,SUCCEEDED_RETREAT,SUCCEEDED_SERVICE,FAILED}` is supplied by CTX-05; each non-`NONE` value is fresh, consumed once, and identifies the completed action when successful.

CTRL-01: `PublicResult=(Action,SelectedCause,Mode,RecoveryState)` is the sole controlled boundary value and shall be delivered atomically to CTX-01 and the relevant external action or service context.

## Finite semantic vocabulary

TYPE-01: `ThreatDisposition={UNKNOWN,CLEAR,SUSPECT,HOSTILE}` is the qualified interpretation of the threat sample.

TYPE-02: `ThreatValidity={UNUSABLE,USABLE}` is the qualification owner's many-to-one assessment of whether threat evidence may support normal policy.

TYPE-03: `RecoveryState={HEALTHY,LATCHED,RECOVERING}` distinguishes normal work permission, fault/recovery inhibition, and acknowledged but uncleared recovery.

TYPE-04: `RecoveryGate={OPEN,CLOSED}` states whether work proposals may be admitted.

TYPE-05: `EmergencyState={INACTIVE,ACTIVE}` states whether arbitration must select the fault/recovery hold result.

TYPE-06: `Proposal={DENIED,PROPOSED}` is the mining or defense applicability decision.

TYPE-07: `MobilityProposal={DENIED,RETREAT,SERVICE}` is the mutually exclusive retreat/service applicability decision.

TYPE-08: `Action={HOLD,MINE,DEFEND,RETREAT,SERVICE}` is the one selected external action.

TYPE-09: `SelectedCause={FAULT_OR_RECOVERY,RETREAT_PRIORITY,DEFENSE_PRIORITY,SERVICE_REQUIRED,MINING_ALLOWED,HOLD_POLICY}` explains the priority branch that selected the action.

TYPE-10: `Mode={HOLD,MINING,DEFENDING,RETREATING,SERVICING,FAULT}` is the externally distinguishable supervisory mode.

TYPE-11: `ReadinessAssessment=(miningReady,defenseReady,retreatFeasible,cargoFull,dockServiceApplicable)` is a Boolean record of facts derived from resource, location, and availability inputs; it contains no raw-field copies, threat, intent, outcome, proposal, or selected decision.

## Approved logical usages and responsibilities

PART-01: Threat observation is an external-context/source usage that originates the monitored threat sample at the modeled boundary; it shall not be an internal receive-and-forward wrapper and is not credited as an applicability, proposal, or decision owner.

PART-02: Intent acquisition is an external-context/source usage that originates current intent under the consumed-once reset assumption; it shall not be an internal receive-and-forward wrapper and is not credited as an applicability, proposal, or decision owner.

PART-03: Resource observation is an external-context/source usage that originates cargo, capacitor, and location bands; it shall not be an internal receive-and-forward wrapper and is not credited as an applicability, proposal, or decision owner.

PART-04: Availability observation is an external-context/source usage that originates five command-acceptance facts; it shall not be an internal receive-and-forward wrapper and is not credited as an applicability, proposal, or decision owner.

PART-05: Outcome observation is an external-context/source usage that originates the current action-tagged outcome under the consumed-once assumption; it shall not be an internal receive-and-forward wrapper and is not credited as an applicability, proposal, or decision owner.

PART-06: Threat qualification shall jointly derive `ThreatDisposition` and `ThreatValidity`; CASE-01 derives `(UNKNOWN,UNUSABLE)` and CASE-02 through CASE-04 derive the stated disposition with `USABLE`, making validity a genuine many-to-one owner-local fact.

PART-07: Readiness assessment shall derive `miningReady=(FIELD and cargo!=FULL and capacitor=READY and miningAvailable)`, `defenseReady=(FIELD and capacitor=READY and defenseAvailable)`, `retreatFeasible=(FIELD and retreatAvailable and destinationAvailable)`, `cargoFull=(cargo=FULL)`, and `dockServiceApplicable=(DOCKED and serviceAvailable and (cargo!=EMPTY or capacitor=LOW))`.

PART-08: Recovery control is the sole recovery-state owner and shall derive actual next recovery, recovery gate, and emergency state from previous recovery, threat validity, intent, and outcome according to CASE-05 through CASE-09.

PART-09: Mining eligibility shall derive mining applicability locally from intent, threat disposition, readiness assessment, and recovery gate according to CASE-10 and CASE-11.

PART-10: Defense eligibility shall derive defense applicability locally from intent, threat disposition, readiness assessment, and recovery gate according to CASE-12 and CASE-13.

PART-11: Mobility/service eligibility shall derive retreat, service, or denial locally using first-match behavior from intent, threat disposition, readiness assessment, and recovery gate according to CASE-14 through CASE-16.

PART-12: Priority arbitration is the sole action and selected-cause owner and shall derive both values together from emergency state and the three proposals according to CASE-17 through CASE-22.

PART-14: Mission mode and public result shall derive mode according to CASE-23 through CASE-28 and construct the sole atomic `PublicResult` from that derived mode, PART-12's paired action/cause, and PART-08's actual next recovery; it shall not recompute arbitration or recovery.

## Exact typed directed semantic interaction inventory

INT-01: Threat observation provides `threatSample: ThreatSample` to threat qualification.

INT-02: Intent acquisition provides `intent: Intent` to recovery control.

INT-03: Intent acquisition provides `intent: Intent` to mining eligibility.

INT-04: Intent acquisition provides `intent: Intent` to defense eligibility.

INT-05: Intent acquisition provides `intent: Intent` to mobility/service eligibility.

INT-06: Resource observation provides `cargoBand: CargoBand` to readiness assessment.

INT-07: Resource observation provides `capacitorBand: CapacitorBand` to readiness assessment.

INT-08: Resource observation provides `location: Location` to readiness assessment.

INT-09: Availability observation provides `miningAvailable: Boolean` to readiness assessment.

INT-10: Availability observation provides `defenseAvailable: Boolean` to readiness assessment.

INT-11: Availability observation provides `retreatAvailable: Boolean` to readiness assessment.

INT-12: Availability observation provides `destinationAvailable: Boolean` to readiness assessment.

INT-13: Availability observation provides `serviceAvailable: Boolean` to readiness assessment.

INT-14: Outcome observation provides `actionOutcome: ActionOutcome` to recovery control.

INT-15: Threat qualification provides `threatValidity: ThreatValidity` to recovery control.

INT-16: Threat qualification provides `threatDisposition: ThreatDisposition` to mining eligibility.

INT-17: Threat qualification provides `threatDisposition: ThreatDisposition` to defense eligibility.

INT-18: Threat qualification provides `threatDisposition: ThreatDisposition` to mobility/service eligibility.

INT-19: Readiness assessment provides `assessment: ReadinessAssessment` to mining eligibility.

INT-20: Readiness assessment provides `assessment: ReadinessAssessment` to defense eligibility.

INT-21: Readiness assessment provides `assessment: ReadinessAssessment` to mobility/service eligibility.

INT-22: Recovery control provides `recoveryGate: RecoveryGate` to mining eligibility.

INT-23: Recovery control provides `recoveryGate: RecoveryGate` to defense eligibility.

INT-24: Recovery control provides `recoveryGate: RecoveryGate` to mobility/service eligibility.

INT-25: Recovery control provides `emergencyState: EmergencyState` to priority arbitration.

INT-26: Mining eligibility provides `miningProposal: Proposal` to priority arbitration.

INT-27: Defense eligibility provides `defenseProposal: Proposal` to priority arbitration.

INT-28: Mobility/service eligibility provides `mobilityProposal: MobilityProposal` to priority arbitration.

INT-29: Priority arbitration provides `selectedAction: Action` to mission mode and public result.

INT-30: Priority arbitration provides `selectedCause: SelectedCause` to mission mode and public result.

INT-31: Recovery control provides `nextRecoveryState: RecoveryState` to mission mode and public result.

## Required behavior and exact nontrivial contract partitions

BEH-01: Threat qualification shall be total and derive exactly one disposition/validity pair for every threat sample.

CASE-01: `INVALID` shall derive `(UNKNOWN,UNUSABLE)`.

CASE-02: `CLEAR` shall derive `(CLEAR,USABLE)`.

CASE-03: `SUSPECT` shall derive `(SUSPECT,USABLE)`.

CASE-04: `HOSTILE` shall derive `(HOSTILE,USABLE)`.

VER-BEH-01: Contract inspection and bounded analysis pass only if CASE-01 through CASE-04 are complete and disjoint and validity equals `UNUSABLE` exactly for `INVALID`; the added validity projection receives no extra case credit.

FAULT-01: Recovery control shall use first-match behavior with trigger `ThreatValidity=UNUSABLE or ActionOutcome=FAILED`; it shall derive actual next recovery before gate and emergency, and a trigger shall dominate reset or success evidence in the same evaluation.

CASE-05: A trigger from any previous recovery state shall derive `LATCHED`.

CASE-06: Without a trigger, previous `HEALTHY` shall remain `HEALTHY`.

CASE-07: Without a trigger, previous `LATCHED` plus fresh `Intent=RESET` shall derive `RECOVERING`.

CASE-08: Without a trigger, previous `RECOVERING` plus `Intent=HOLD` and fresh `ActionOutcome=SUCCEEDED_HOLD` shall derive `HEALTHY`.

CASE-09: Every other nontriggering evaluation from previous `LATCHED` or `RECOVERING` shall preserve that previous recovery state.

BEH-02: Recovery control shall derive `RecoveryGate=OPEN` and `EmergencyState=INACTIVE` exactly when actual next recovery is `HEALTHY`; otherwise it shall derive `CLOSED` and `ACTIVE` in the same evaluation.

VER-FAULT-01: State-transition and bounded analysis pass only if CASE-05 through CASE-09 are first-match, complete, and disjoint, actual next recovery drives gate and emergency, stale or wrong success cannot clear recovery, and initial recovery is `HEALTHY`.

BEH-03: Mining eligibility shall derive its proposal without consulting other proposals or the selected action.

CASE-10: Mining shall be `PROPOSED` exactly when the gate is open, intent is `MINE`, threat disposition is `CLEAR`, and `miningReady` is true.

CASE-11: Every other mining input combination shall derive `DENIED`.

VER-BEH-03: Local contract and bounded analysis pass only if CASE-10 and CASE-11 are exact complements and extensionally equal the frozen raw-input mining relation.

BEH-04: Defense eligibility shall derive its proposal without consulting other proposals or the selected action.

CASE-12: Defense shall be `PROPOSED` exactly when the gate is open, `defenseReady` is true, and either threat is `SUSPECT` or `HOSTILE`, or threat is `CLEAR` with `Intent=DEFEND`.

CASE-13: Every other defense input combination shall derive `DENIED`.

VER-BEH-04: Local contract and bounded analysis pass only if CASE-12 and CASE-13 are exact complements and extensionally equal the frozen raw-input defense relation.

BEH-05: Mobility/service eligibility shall use first-match behavior so retreat applicability is assessed before service applicability.

CASE-14: Mobility/service shall derive `RETREAT` exactly when the gate is open, `retreatFeasible` is true, and at least one of hostile threat, `cargoFull`, or `Intent=RETREAT` holds.

CASE-15: If CASE-14 does not hold, mobility/service shall derive `SERVICE` exactly when the gate is open and `dockServiceApplicable` is true.

CASE-16: Every remaining mobility/service input combination shall derive `DENIED`.

VER-BEH-05: Local contract and bounded analysis pass only if CASE-14 through CASE-16 are ordered, complete, mutually exclusive after first match, and extensionally equal the frozen raw-input mobility/service relation.

BEH-06: Priority arbitration shall use strict first-match priority and derive selected action and selected cause together from emergency state and the three proposals.

CASE-17: Active emergency shall derive `(HOLD,FAULT_OR_RECOVERY)` regardless of every proposal.

CASE-18: Otherwise a retreat proposal shall derive `(RETREAT,RETREAT_PRIORITY)`.

CASE-19: Otherwise a defense proposal shall derive `(DEFEND,DEFENSE_PRIORITY)`.

CASE-20: Otherwise a service proposal shall derive `(SERVICE,SERVICE_REQUIRED)`.

CASE-21: Otherwise a mining proposal shall derive `(MINE,MINING_ALLOWED)`.

CASE-22: Otherwise arbitration shall derive `(HOLD,HOLD_POLICY)`.

VER-BEH-06: Contract and bounded analysis pass only if CASE-17 through CASE-22 are ordered and complete, preserve each action/cause pair, and implement emergency, retreat, defense, service, mining, then hold priority.

BEH-07: Mission mode and public result shall derive mode from actual next recovery and selected action, with nonhealthy recovery dominating action mapping.

CASE-23: Any nonhealthy actual next recovery shall derive `Mode=FAULT`.

CASE-24: With healthy actual next recovery, selected `HOLD` shall derive `Mode=HOLD`.

CASE-25: With healthy actual next recovery, selected `MINE` shall derive `Mode=MINING`.

CASE-26: With healthy actual next recovery, selected `DEFEND` shall derive `Mode=DEFENDING`.

CASE-27: With healthy actual next recovery, selected `RETREAT` shall derive `Mode=RETREATING`.

CASE-28: With healthy actual next recovery, selected `SERVICE` shall derive `Mode=SERVICING`.

VER-BEH-07: Contract and bounded analysis pass only if CASE-23 through CASE-28 cover every recovery/action combination and nonhealthy recovery always yields `FAULT`.

BEH-08: Mission mode and public result shall atomically construct the public tuple from same-evaluation action/cause, locally derived mode, and actual next recovery without recomputation; every nonhealthy result shall be `(HOLD,FAULT_OR_RECOVERY,FAULT,actual-next-recovery)`.

VER-BEH-08: Composition inspection and end-to-end analysis pass only if the sole public value contains all four same-evaluation fields, action/cause equal PART-12's pair, recovery equals PART-08's actual next value, mode is locally derived by CASE-23 through CASE-28, and no partial public output exists.

FAULT-02: Invalid threat evidence or a failed action shall propagate through validity and recovery to closed proposals, emergency arbitration, fault mode, and the atomic hold/fault result in the same logical evaluation; individual unavailability shall deny only its affected proposal and shall not change recovery.

VER-FAULT-02: End-to-end bounded analysis passes only if each invalid-threat or failed-outcome valuation yields the required nonhealthy atomic result, all three proposal owners deny under the closed gate, and toggling one availability cannot itself alter next recovery.

BEH-09: Feasible retreat shall outrank defense and mining for hostile threat, full cargo, or retreat intent; infeasible hostile retreat shall fall to feasible defense; needed dock service shall precede mining but not emergency.

VER-BEH-09: Priority-composition analysis passes only if every applicable overlap selects the CASE-17 through CASE-22 branch in the declared order and the retreat-fallback and dock-service scenarios reach their required result.

## Risks, state, modes, assumptions, and constraints

RISK-01: Unusable threat evidence or a failed external action could be masked by productive proposals; FAULT-01 and FAULT-02 mitigate this with latching, gate closure, emergency hold, and fault publication.

RISK-02: Hostility or full cargo could be masked by defense or mining; BEH-05, BEH-06, and BEH-09 mitigate this with retreat applicability and priority.

RISK-03: Reset or stale/wrong success could clear recovery without later successful hold evidence; CASE-07 through CASE-09 mitigate this with a two-stage fresh-event trace.

RISK-04: Separately published fields could describe different decision epochs; BEH-08 mitigates this with one same-evaluation tuple.

STATE-01: Recovery state initializes to `HEALTHY`, is owned only by recovery control, and changes only according to CASE-05 through CASE-09.

MODE-01: Healthy evaluations expose `HOLD`, `MINING`, `DEFENDING`, `RETREATING`, or `SERVICING` according to selected action; these modes differ in the boundary action.

MODE-02: Every nonhealthy evaluation exposes `FAULT`, `HOLD`, and `FAULT_OR_RECOVERY`, observably inhibiting productive action regardless of proposals.

TRANS-01: Receipt of the next coherent finite input set triggers one logical evaluation and a transition to the mode derived by CASE-23 through CASE-28; no physical period or latency is claimed.

TRANS-02: `UNUSABLE` threat validity or fresh `FAILED` triggers `LATCHED`; later fresh `RESET` under usable threat triggers `LATCHED` to `RECOVERING`; only a still-later fresh `SUCCEEDED_HOLD` paired with `Intent=HOLD` under usable threat triggers `RECOVERING` to `HEALTHY`.

ASM-01: CTX-01 is responsible for presenting `RESET` as a fresh consumed-once event and issuing a new work intent after recovery clears; persistent or replayed reset is outside the pilot contract.

ASM-02: CTX-02 is responsible for using `INVALID` only for unusable threat evidence; the supervisor makes no physical claim from that value.

ASM-03: CTX-04 is responsible for availability meaning command acceptance, while CTX-06 additionally supplies destination availability for retreat; availability does not promise completion.

ASM-04: CTX-05 is responsible for presenting each non-`NONE` outcome once and tagging success with the completed action; stale, duplicated, or mistagged outcomes are outside the pilot contract.

CONSTR-01: Initial recovery and observable mode shall be `HEALTHY` and `HOLD`; this is a pilot initialization constraint, not an environmental assumption.

CONSTR-02: Each logical evaluation shall select at most one action and publish exactly one `PublicResult`; deterministic ordering does not assert real-time scheduling or physical simultaneity.

## Bounded public scenario families

SCN-01: From healthy recovery, `MINE`, clear threat, field location, nonfull cargo, ready capacitor, and mining availability with no higher proposal shall produce `(MINE,MINING_ALLOWED,MINING,HEALTHY)`.

SCN-02: From healthy recovery, full cargo in the field with feasible retreat shall produce `(RETREAT,RETREAT_PRIORITY,RETREATING,HEALTHY)` even when defense or mining is requested or proposed.

SCN-03: From healthy recovery, suspect threat in the field with ready capacitor and defense available shall produce `(DEFEND,DEFENSE_PRIORITY,DEFENDING,HEALTHY)` ahead of mining.

SCN-04: From healthy recovery, hostile threat in the field with feasible retreat and defense shall produce `(RETREAT,RETREAT_PRIORITY,RETREATING,HEALTHY)`.

SCN-05: From healthy recovery, hostile threat in the field with retreat or destination unavailable but feasible defense shall produce `(DEFEND,DEFENSE_PRIORITY,DEFENDING,HEALTHY)`.

SCN-06: From healthy recovery, clear threat, field location, `MINE`, nonfull cargo, low capacitor, and no retreat condition shall produce `(HOLD,HOLD_POLICY,HOLD,HEALTHY)`.

SCN-07: From healthy recovery, clear threat, field location, `DEFEND`, ready capacitor, defense availability, and no retreat condition shall produce `(DEFEND,DEFENSE_PRIORITY,DEFENDING,HEALTHY)`.

SCN-08: From healthy recovery while docked, nonempty cargo or low capacitor with service available shall produce `(SERVICE,SERVICE_REQUIRED,SERVICING,HEALTHY)`.

SCN-09: From healthy recovery while docked with a service need but service unavailable shall produce `(HOLD,HOLD_POLICY,HOLD,HEALTHY)` without changing recovery.

SCN-10: Any evaluation with invalid threat shall derive `LATCHED`, close every proposal, and publish `(HOLD,FAULT_OR_RECOVERY,FAULT,LATCHED)`.

SCN-11: Any evaluation with fresh `FAILED` outcome shall derive `LATCHED`, close every proposal, and publish `(HOLD,FAULT_OR_RECOVERY,FAULT,LATCHED)`.

SCN-12: Starting latched under usable threat, fresh `RESET` shall first publish recovering fault hold; missing or wrong success, another reset, invalidity, or failure shall not clear it; only a later usable-threat evaluation with `Intent=HOLD` and fresh `SUCCEEDED_HOLD` shall publish healthy hold, after which work requires a new request.

## Local-contract and end-to-end analysis obligations

LOCAL-01: PART-06's canonical contract shall expose both disposition and validity and prove validity many-to-one; PART-07's canonical contract shall prove each of its five derived Boolean equations extensionally from raw fields.

LOCAL-02: PART-08 through PART-12 and PART-14 shall each expose a canonical owner-local contract for their allocated relation; no owner may rely on central recomputation, analyzer-only semantics, identity mapping, or forwarding for ownership credit.

LOCAL-03: The analyzer shall check PART-07 facts from raw inputs and prove that CASE-10 through CASE-16 using those facts are extensionally identical to the frozen raw-input policy; these equivalences add no credited contract cases.

ANALYSIS-01: The retained deterministic analyzer shall exhaust all `5*4*3*2*2*2^5*7*3 = 161,280` raw-input/previous-recovery valuations and compare actual next recovery, all three proposals, paired action/cause, mode, and `PublicResult` with the approved relation.

ANALYSIS-02: Bounded analysis passes only with zero gaps, overlaps, owner mismatches, readiness-equivalence mismatches, priority violations, recovery violations, composition mismatches, and scenario failures; a self-reported summary cannot replace the extensional checks.

ANALYSIS-03: The independent harness shall rerun the retained Sireum typechecking gates and analyzer under its 180-second watchdog, require one result bound to the canonical source hash, and confirm `status=passed`, zero defect counters, and exact ownership-audit arrays.

## Structural, trace, generated-support, and objective pass criteria

STR-01: The realization shall contain exactly 13 reachable semantic usages corresponding to PART-01 through PART-12 and PART-14, within 13..16; no usage may exist only to copy, rename, route, bundle, decorate, or satisfy the count.

STR-02: The realization shall contain exactly the 31 typed directed semantic interactions INT-01 through INT-31, within 22..35; fan-outs count separately and no routing-only flow receives semantic credit.

STR-03: The realization shall contain one explicit root system usage; all 13 semantic usages shall be reachable beneath it at containment depth 1 or 2; the exact interaction inventory shall form one weakly connected semantic region.

STR-04: The contract realization shall retain exactly 28 nontrivial partitions CASE-01 through CASE-28, within 21..30; initialization, typing, helper predicates, assessment equations, equivalence checks, field construction, or forwarding shall not inflate the count.

STR-05: Validation shall retain exactly 12 distinct scenario families SCN-01 through SCN-12, within 9..12; recovery variants inside SCN-12 remain one family.

OWN-01: Ownership audit passes only if PART-06 through PART-12 and PART-14 each derive a behaviorally meaningful owner-local fact; PART-01 through PART-05 receive usage credit only as external-context/source usages and lose it if realized as internal pass-through components.

SUPPORT-01: `@generated-support` may justify one behavior-free Process required solely for Thread containment, nonsemantic type declarations, record constructors, helper predicates, and the sole controlled boundary connection carrying `PublicResult`; none receives semantic-usage, semantic-interaction, owner, or contract-case credit.

SUPPORT-02: Generated support shall be traceable, behavior-free except for definitional typing/construction, and shall not add ports visible as partial publication, duplicate a boundary input, route semantic flows through extra usages, own state, select policy, or recompute owner results.

TRACE-01: Trace analysis passes only if every actionable canonical ID maps to one or more model elements or is explicitly informational/deferred, every significant element maps back to a canonical ID or justified `@generated-support`, and no parent is missing or child unexplained.

PASS-01: Architecture verification passes only if retained and independent-harness Sireum gates succeed, endpoints resolve with compatible direction/kind/type, STR-01 through STR-03 hold, and no responsibility is decorative.

PASS-02: Behavioral verification passes only if all 28 cases and canonical local contracts are present and the exhaustive analysis satisfies BEH-01 through BEH-09 and FAULT-01 through FAULT-02.

PASS-03: Scenario validation passes only if each SCN-01 through SCN-12 has at least one bounded public trace with stated inputs, prior recovery where relevant, and exact observable `PublicResult` without using internal methods as evidence.

PASS-04: Composition verification passes only if PART-12 owns the action/cause pair, PART-08 owns actual next recovery, PART-14 derives mode from those values and exposes exactly one atomic public tuple.

PASS-05: Priority, fault propagation, recovery, and composition each pass their dedicated local and end-to-end criteria; aggregate counts cannot substitute for semantic evidence.

PASS-06: Final Designer validation passes only if the model is faithful to the need, purpose, goals, boundary, and all scenarios and makes no claim deferred by DEFER-01 or DEFER-02; verification and domain fitness shall be reviewed separately.

PASS-07: Visualization acceptance passes only if one named `system-overview` covers the accepted root and all 13 semantic usages, distinguishes external context from the system, faithfully shows principal direction and ownership, has no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object, and matches this approved revision.

## Model regeneration authorization

AUTH-01: Model regeneration is authorized against this approved baseline only; the Model shall preserve the extensional public and intermediate policy over all 161,280 valuations while realizing 13 semantic usages, 31 semantic interactions, 28 cases, and 12 scenario families.

AUTH-02: Tool compatibility may influence only source-level constructs allowed by SUPPORT-01 and SUPPORT-02; any change to domain policy, cases, scenarios, assumptions, exclusions, ownership, or exact metrics requires a new explicit Designer review.
