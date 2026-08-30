---
abstract_id: SA-MCD-SM-R2-01
run_id: 20260814T132655Z-mining-cargo-docking-small-r2-a1
domain_seed: 20260813T233942Z-mining-cargo-docking-seed-v1
campaign_complexity: small
selected_scope: ore-hold-supervision-before-offload
semantic_usage_count: 6
semantic_interaction_count: 11
nontrivial_contract_case_count: 11
scenario_family_count: 5
root_system_usage_count: 1
semantic_containment_depth: [1, 2]
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
---

# Ore-Hold Mining Guard Supervisor

## Evidence and claim partition

METH-01: Handbook-derived method requires the need and operational context before decomposition, an exact monitored and controlled boundary, cohesive responsibility allocation, nominal and off-nominal scenarios, explicit assumptions, comparison of alternatives, bidirectional trace coverage, measurable pass criteria, and separate verification and validation. These are methodology obligations, not mining-frigate facts.

SRC-01: The frozen seed supports a mining frigate operated by a pilot or pilot pod; ore entering an ore hold; a nearly-full indication; asteroid depletion, mining-laser overheat, and target-lock interference observations; mining continuation, pause, or halt; pilot notification; cargo retention; and readiness for a later offload.

SRC-02: The seed does not establish a numerical hold threshold, request protocol, status validity scheme, mining-admission rule, priority order, state machine, fault meaning, recovery sequence, finite encoding, responsibility allocation, interaction topology, timing, or physical effectiveness.

ABS-01: This pilot selects one finite pre-offload supervisory abstraction. It treats a valid `NearlyFull` observation as a guard boundary, combines three source-named mining-support observations into one applicability fact, interprets pilot controls as validity-bearing levels with rising-edge freshness, and requires a cleared guard or restored support followed by a later fresh resume request. Every exact type, state, priority, case, and recovery rule below is Designer-owned beyond the source.

ARCH-01: The selected architecture uses three distinct intake and derivation owners, one principal stateful Ore-Hold Decision Owner, and two output derivation owners. This allocation is a selected pilot architecture, not a source-grounded decomposition or handbook fact.

DEF-01: Physical ore extraction and placement, hold capacity or mass, quantitative fill measurement, cargo identity, cargo retention mechanics, offload admission or completion, ship or warehouse evidence, physical mining-laser and targeting control, actuation feedback, docking, travel, timing, throughput, economics, game fidelity, reliability, safety, certification, deployment, code generation, execution, and proof beyond retained contracts and bounded analysis are deferred and shall remain out of scope or `not-run`.

## Need, purpose, and goals

NEED-01: A mining-frigate operating context needs a bounded supervisor that prevents continued logical mining authorization when the ore hold is reported nearly full or when selected mining-support evidence is unacceptable, while avoiding automatic restart from stale pilot levels after the inhibiting condition clears.

PURPOSE-01: The system will supervise whether further mining may logically continue before offload. It will own one mining-guard mode, issue a stop-or-continue disposition, indicate a nearly-full hold as ready for a later offload, and coordinate recovery; it will not perform mining, move cargo, control docking, admit offload, reconcile ship and warehouse evidence, or claim transfer completion.

GOAL-01: The system shall issue `ContinueMining` only when its owned next mode is `Mining` and the current hold and mining-support assessments are valid and acceptable.

GOAL-02: The system shall issue `StopMining` and enter a protected mode on a valid `NearlyFull` observation, an invalid boundary sample, or a valid unavailable mining-support condition according to the ordered cases below.

GOAL-03: The system shall indicate `ReadyForLaterOffload` exactly while the current evaluation resolves to `CapacityHold`; this is a nearly-full supervisory indication and not an offload request, permission, physical readiness proof, or completion finding.

GOAL-04: The system shall prevent a held or same-evaluation start or resume level from restarting mining after protection; recovery shall require an acceptable clearing evaluation and a later fresh `resume` rising edge.

## Operational context

CTX-01: The Pilot Command Authority is outside the system and supplies start, halt, and resume levels with one validity status. It is responsible for deasserting and later reasserting a level when a new fresh request is intended.

CTX-02: The Ore-Hold Observation Source is outside the system and supplies the finite room-available or nearly-full observation and its validity. It owns any sensing, threshold comparison, calibration, and physical association with the ore hold.

CTX-03: The Mining Support Observation Source is outside the system and supplies finite asteroid, mining-laser, and target-lock observations with one validity status. It owns the underlying observations and does not delegate physical mining control to this supervisor.

CTX-04: The Mining Control Consumer is outside the system and receives the logical stop-or-continue disposition. Whether mining equipment obeys the disposition and whether ore enters the hold are outside the boundary.

CTX-05: The Pilot Status Recipient is outside the system and receives supervisory status and the later-offload readiness indication. It shall not interpret either output as a cargo-transfer or physical-capacity certification.

CTX-06: The station, warehouse, docking service, and any cargo-transfer mechanism remain external context with no modeled interaction. An external activity may cause a later valid `RoomAvailable` observation, but its request, progress, evidence, and completion are neither observed nor decided here.

## Exact finite monitored and controlled boundary

TYPE-01: `Bool` is exactly `{false, true}` and `InputStatus` is exactly `{Valid, Invalid}`.

TYPE-02: `PilotRequestSample` is exactly the product `(start: Bool, halt: Bool, resume: Bool, status: InputStatus)`, admitting all sixteen finite combinations. Levels may persist across evaluations; they are not events by themselves.

TYPE-03: `HoldObservation` is exactly `{RoomAvailable, NearlyFull}` and `HoldSample` is exactly `(observation: HoldObservation, status: InputStatus)`. `NearlyFull` is a source-named qualitative boundary and has no Designer-invented numerical capacity or unit.

TYPE-04: `AsteroidCondition` is exactly `{OreAvailable, Depleted}`, `LaserCondition` is exactly `{Ready, Overheated}`, and `TargetCondition` is exactly `{Locked, Interfered}`.

TYPE-05: `MiningSupportSample` is exactly the product `(asteroid: AsteroidCondition, laser: LaserCondition, target: TargetCondition, status: InputStatus)`, admitting all sixteen finite combinations.

TYPE-06: `RequestDisposition` is exactly `{InvalidRequest, HaltDominant, FreshResume, FreshStart, NoFreshRequest}` and `RequestAssessment` is exactly `(disposition: RequestDisposition, conflict: Bool)`.

TYPE-07: `HoldAssessment` is exactly `{SpaceAvailable, GuardReached, InvalidHold}` and `SupportAssessment` is exactly `{SupportReady, SupportBlocked, InvalidSupport}`.

TYPE-08: `GuardMode` is exactly `{Idle, Mining, CapacityHold, ConditionHold, RecoveryReady}`.

TYPE-09: `ResolutionReason` is exactly `{HaltSelected, InvalidEvidence, HoldGuardReached, SupportUnavailable, StartAdmitted, IdleWaiting, MiningMaintained, GuardCleared, EvidenceRestored, ResumeAdmitted, RecoveryWaiting}`. `GuardResolution` is exactly `(nextMode: GuardMode, reason: ResolutionReason, requestConflict: Bool)`.

TYPE-10: `MiningCommand` is exactly `{StopMining, ContinueMining}`, `GuardStatus` is exactly `{Idle, MiningAuthorized, HaltedByPilot, GuardedNearlyFull, HeldForSupport, InputFault, AwaitingFreshResume, RequestConflict}`, and `OffloadReadiness` is exactly `{NotReadyForOffload, ReadyForLaterOffload}`.

MON-01: The root shall monitor `pilot_request: PilotRequestSample` from CTX-01. PART-01 is the only usage allowed to retain prior request levels or derive validity, conflict, priority, and fresh rising-edge facts.

MON-02: The root shall monitor `hold_sample: HoldSample` from CTX-02. PART-02 is the only usage allowed to derive the qualitative hold assessment.

MON-03: The root shall monitor `mining_support: MiningSupportSample` from CTX-03. PART-03 is the only usage allowed to combine asteroid, laser, target, and validity observations into a support assessment.

CTRL-01: The root shall control `mining_command: MiningCommand` delivered to CTX-04. This is a logical supervisory disposition with no physical-effect claim.

CTRL-02: The root shall control `guard_status: GuardStatus` delivered to CTX-05. It reports the selected current resolution without reporting cargo-transfer progress or completion.

CTRL-03: The root shall control `offload_readiness: OffloadReadiness` delivered to CTX-05. `ReadyForLaterOffload` means only that the selected nearly-full guard is active.

BOUND-01: MON-01 through MON-03 and CTRL-01 through CTRL-03 are the complete modeled root boundary. No offload request, docking observation, ship-transfer progress, warehouse receipt, cargo quantity, completion evidence, actuator feedback, clock, or second command channel may be added without a revised abstract.

## Logical evaluation, state, and freshness

SEM-01: One logical evaluation shall qualify the current MON-01 through MON-03 samples, read PART-01 and PART-04 pre-state, select exactly one ordered CASE-01 through CASE-11, atomically update both state owners, and derive all three root outputs from the resulting `GuardResolution`. This ordering is an analysis abstraction, not a physical period, latency, scheduler, or execution claim.

STATE-01: PART-01 shall exclusively own `previousStart`, `previousHalt`, and `previousResume`, initialize all three to `false`, derive rising edges from the current levels and pre-state, and then store all three current raw levels after every evaluation, including one with `status = Invalid`.

STATE-02: PART-04 shall exclusively own `guardMode`, initialize it to `Idle`, and update it only to the `nextMode` selected by CASE-01 through CASE-11.

INIT-01: Initial controlled values shall be `StopMining`, `Idle`, and `NotReadyForOffload`. Initial intake-owner outputs shall be `InvalidRequest` with `conflict = false`, `InvalidHold`, and `InvalidSupport` until their first qualification evaluation; these startup values add no case or interaction credit.

FRESH-01: For a valid request sample, `freshStart` shall mean `start = true and previousStart = false`, and `freshResume` shall mean `resume = true and previousResume = false`. `halt` is deliberately level-sensitive rather than edge-sensitive.

FRESH-02: Because PART-01 stores current levels even when request status is invalid, a level held high across invalid-to-valid restoration is not fresh. A new request requires that level to be observed low and then high on a later valid evaluation.

FRESH-03: CASE-08 and CASE-09 shall use the first acceptable evaluation only to enter `RecoveryReady`; any fresh start or resume on that same evaluation is discarded. Only CASE-10 on a later evaluation may resume mining, and it requires `FreshResume`, not `FreshStart`.

## Exact six semantic usages and ownership

PART-01: Request Freshness and Priority Owner shall retain STATE-01, determine request validity, derive `freshStart` and `freshResume`, detect whether at least two valid current request levels are asserted, and produce the complete `RequestAssessment` under QUAL-REQ-01. These are temporal and priority facts, not forwarding or enum renaming.

PART-02: Hold Guard Qualification Owner shall derive `HoldAssessment` under QUAL-HOLD-01 by combining observation and validity. It owns the selected qualitative guard fact but no numerical threshold, physical capacity claim, system mode, or mining decision.

PART-03: Mining Support Qualification Owner shall derive `SupportAssessment` under QUAL-SUPPORT-01 by combining four input fields. It owns the applicability fact used by PART-04 but no physical support-system control or mode decision.

PART-04: Ore-Hold Decision Owner shall be the sole principal decision owner and sole `guardMode` owner. It shall consume, not recompute, the three upstream assessments, apply PRIORITY-01, select exactly one CASE-01 through CASE-11, and publish one complete `GuardResolution`.

PART-05: Mining Command Derivation Owner shall derive CTRL-01 from `GuardResolution` under OUTPUT-01. Its many-to-one mapping is a local control fact; it shall not inspect raw boundary inputs or recompute a case.

PART-06: Guard Reporting Derivation Owner shall jointly derive CTRL-02 and CTRL-03 from `GuardResolution` under OUTPUT-02 and OUTPUT-03. Its status and readiness classification is a local nonidentity derivation; it shall not inspect raw inputs or own decision state.

OWN-AUDIT-01: PART-04 is the required one principal decision owner and owns all eleven nontrivial cases. PART-01 is a subordinate stateful request-fact owner, PART-02 and PART-03 are distinct qualification owners, PART-05 owns the command relation, and PART-06 owns status/readiness classification.

OWN-AUDIT-02: No usage receives credit for preserving, copying, bundling, routing, or bijectively renaming an input. PART-01 derives temporal freshness and priority, PART-02 collapses invalid raw pairs, PART-03 reduces sixteen raw combinations into three semantic classes, PART-04 owns cross-input stateful resolution, and PART-05 and PART-06 each perform many-to-one output derivations.

OWN-AUDIT-03: PART-04 shall not inspect MON-01 through MON-03 directly; PART-05 and PART-06 shall not reproduce request, hold, support, priority, or case logic. A generated analyzer shall compare with these owner-local relations rather than substitute for them.

QUAL-REQ-01: PART-01 shall output `InvalidRequest` and `conflict = false` when request status is invalid. Otherwise it shall set `conflict = true` exactly when at least two current levels are true and choose disposition in descending order: asserted `halt` gives `HaltDominant`; otherwise `freshResume` gives `FreshResume`; otherwise `freshStart` gives `FreshStart`; otherwise `NoFreshRequest`.

QUAL-HOLD-01: PART-02 shall map either invalid-status raw hold pair to `InvalidHold`, valid `RoomAvailable` to `SpaceAvailable`, and valid `NearlyFull` to `GuardReached`.

QUAL-SUPPORT-01: PART-03 shall map every invalid-status raw support combination to `InvalidSupport`; otherwise it shall map exactly `(OreAvailable, Ready, Locked)` to `SupportReady` and every other valid combination to `SupportBlocked`.

## Complete typed directed semantic interaction inventory

INT-01: Root/MON-01 shall provide `PilotRequestSample` to PART-01 for request validity, conflict, priority, and freshness derivation.

INT-02: Root/MON-02 shall provide `HoldSample` to PART-02 for qualitative guard assessment.

INT-03: Root/MON-03 shall provide `MiningSupportSample` to PART-03 for support applicability assessment.

INT-04: PART-01 shall provide `RequestAssessment` to PART-04 for ordered admission, halt, and recovery decisions.

INT-05: PART-02 shall provide `HoldAssessment` to PART-04 for capacity protection and guard-clear decisions.

INT-06: PART-03 shall provide `SupportAssessment` to PART-04 for mining applicability, protection, and evidence-restoration decisions.

INT-07: PART-04 shall provide one `GuardResolution` to PART-05 for mining-command derivation.

INT-08: PART-04 shall independently provide one `GuardResolution` to PART-06 for status and readiness derivation.

INT-09: PART-05 shall provide `MiningCommand` to Root/CTRL-01 for CTX-04.

INT-10: PART-06 shall provide `GuardStatus` to Root/CTRL-02 for CTX-05.

INT-11: PART-06 shall provide `OffloadReadiness` to Root/CTRL-03 for CTX-05.

INT-AUDIT-01: INT-01 through INT-11 are exactly eleven typed directed end-to-end semantic interactions: three boundary-input deliveries, five inter-usage fact or resolution flows, and three boundary-output deliveries. Two independent resolution deliveries serve different local output responsibilities and are not duplicate count padding.

INT-AUDIT-02: All six semantic usages participate in a derivation-producing incoming flow and a boundary-relevant outgoing path. The complete inventory forms one weakly connected semantic region; tool-required delegation hops may refine an INT meaning but shall receive no additional semantic-interaction credit.

## Priority and exactly eleven nontrivial contract cases

PRIORITY-01: PART-04 shall apply strict descending case priority: any invalid assessment; valid level-sensitive halt; valid nearly-full guard; valid unavailable mining support; then a total current-mode partition under valid nonhalt, space-available, support-ready conditions. Every lower-priority generated guard shall explicitly exclude all earlier conditions.

PRIORITY-02: Within PART-01, valid request priority shall be level-sensitive halt before fresh resume before fresh start before no fresh request. Thus halt with either other level is `HaltDominant`; simultaneous fresh resume and fresh start without halt is `FreshResume`; conflict remains separately recorded.

PRIORITY-03: A valid `GuardReached` condition outranks a simultaneous valid `SupportBlocked` condition after invalidity and halt have been excluded. Both stop mining, but the capacity guard preserves `ReadyForLaterOffload`; this diagnostic and readiness priority is a pilot policy, not a source fact.

CASE-01: If any of `RequestAssessment.disposition = InvalidRequest`, `HoldAssessment = InvalidHold`, or `SupportAssessment = InvalidSupport`, PART-04 shall resolve `nextMode = ConditionHold`, `reason = InvalidEvidence`, and preserve the request conflict supplied by PART-01. This case outranks every other input and state.

CASE-02: Otherwise, if request disposition is `HaltDominant`, PART-04 shall resolve `Idle` and `HaltSelected`, regardless of current mode, valid hold assessment, or valid support assessment. A halt abandons the protected episode, but held start or resume levels have already been recorded and cannot become fresh merely when halt is released.

CASE-03: Otherwise, if hold assessment is `GuardReached`, PART-04 shall resolve `CapacityHold` and `HoldGuardReached`, regardless of current mode, valid support assessment, or nonhalt request disposition.

CASE-04: Otherwise, if support assessment is `SupportBlocked`, PART-04 shall resolve `ConditionHold` and `SupportUnavailable`, regardless of current mode or nonhalt request disposition.

CASE-05: Otherwise, when current mode is `Idle` and request disposition is `FreshStart`, PART-04 shall resolve `Mining` and `StartAdmitted`.

CASE-06: Otherwise, when current mode is `Idle` and request disposition is `FreshResume`, `NoFreshRequest`, or any remaining valid nonhalt disposition, PART-04 shall resolve `Idle` and `IdleWaiting`. A resume is not a start admission, and a simultaneous fresh resume/start has already selected resume priority.

CASE-07: Otherwise, when current mode is `Mining`, PART-04 shall resolve `Mining` and `MiningMaintained`; fresh start or resume requests are inapplicable and do not create another episode.

CASE-08: Otherwise, when current mode is `CapacityHold`, PART-04 shall resolve `RecoveryReady` and `GuardCleared`. The current acceptable hold and support facts establish only recovery readiness; all same-evaluation request edges are discarded.

CASE-09: Otherwise, when current mode is `ConditionHold`, PART-04 shall resolve `RecoveryReady` and `EvidenceRestored`. Restoration establishes only recovery readiness; all same-evaluation request edges are discarded.

CASE-10: Otherwise, when current mode is `RecoveryReady` and request disposition is `FreshResume`, PART-04 shall resolve `Mining` and `ResumeAdmitted`.

CASE-11: Otherwise, when current mode is `RecoveryReady` and request disposition is `FreshStart`, `NoFreshRequest`, or any remaining valid nonhalt disposition, PART-04 shall resolve `RecoveryReady` and `RecoveryWaiting`. A fresh start is deliberately inapplicable to protected recovery.

CASE-AUDIT-01: CASE-01 through CASE-04 are ordered global guards. After their exclusions, request, hold, and support are valid, halt is absent, hold is `SpaceAvailable`, and support is `SupportReady`; CASE-05 through CASE-11 then form a total, mutually exclusive partition over all five `GuardMode` values and the applicable request disposition.

CASE-AUDIT-02: The eleven cases close invalid input, valid halt, simultaneous request conflicts, nearly-full boundary protection, support blockage, fresh-start admission, idle rejection of resume, mining persistence, guard clearing, evidence restoration, same-evaluation recovery-request rejection, fresh-resume recovery, held-request nonfreshness, and recovery waiting. Qualification equations, initialization, output mappings, invariants, and scenario witnesses are required but receive no nontrivial-case credit.

RESOLUTION-01: In every CASE-01 through CASE-11 result, `GuardResolution.requestConflict` shall equal `RequestAssessment.conflict`. Each case shall constrain all three resolution fields; conflict may be diagnostically masked by a higher-priority reason but shall never be left unconstrained.

## Complete output policy

OUTPUT-01: PART-05 shall output `ContinueMining` exactly when `GuardResolution.nextMode = Mining`; it shall output `StopMining` for every other next mode. No resolution may leave CTRL-01 unconstrained.

OUTPUT-02: PART-06 shall map `InvalidEvidence` to `InputFault`, `HaltSelected` to `HaltedByPilot`, `HoldGuardReached` to `GuardedNearlyFull`, `SupportUnavailable` to `HeldForSupport`, each of `StartAdmitted`, `MiningMaintained`, and `ResumeAdmitted` to `MiningAuthorized`, and each of `GuardCleared`, `EvidenceRestored`, and `RecoveryWaiting` to `AwaitingFreshResume`. It shall map `IdleWaiting` to `RequestConflict` when `requestConflict = true` and otherwise to `Idle`.

OUTPUT-03: PART-06 shall output `ReadyForLaterOffload` exactly when `GuardResolution.nextMode = CapacityHold`; it shall output `NotReadyForOffload` for every other next mode. No station, warehouse, or transfer evidence participates in this mapping.

OUTPUT-04: The three outputs shall describe the same next-mode resolution in each logical evaluation. Every `ContinueMining` output shall coincide with `MiningAuthorized` and `NotReadyForOffload`; every `ReadyForLaterOffload` output shall coincide with `StopMining` and `GuardedNearlyFull`.

## Required behaviors, risks, faults, and recovery

BEH-01: From initial `Idle`, a valid fresh start with `SpaceAvailable` and `SupportReady` shall select CASE-05, enter `Mining`, and output `ContinueMining`, `MiningAuthorized`, and `NotReadyForOffload`. A held start level shall not be needed to retain mining under CASE-07.

VER-BEH-01: Owner-local contract inspection and bounded state/input analysis shall pass only if every CASE-05 valuation produces the exact BEH-01 result and every reachable `ContinueMining` output has `nextMode = Mining` with current valid acceptable hold and support assessments.

BEH-02: While in `Mining`, a valid `NearlyFull` observation shall select CASE-03 in the same abstract evaluation, enter `CapacityHold`, and output `StopMining`, `GuardedNearlyFull`, and `ReadyForLaterOffload`.

VER-BEH-02: Exhaustive case analysis shall pass only if every valid `GuardReached` valuation not preempted by invalidity or halt selects CASE-03, no such valuation continues mining, and readiness is asserted in no other next mode.

BEH-03: With valid space, support, and no halt, `Mining` shall persist under CASE-07 regardless of stale or inapplicable start/resume levels; the supervisor shall not require a repeated start event during an uninterrupted mining episode.

VER-BEH-03: Contract and analyzer evidence shall pass only if every matching pre-state/input snapshot selects CASE-07 and produces the complete state-coherent output tuple.

BEH-04: A valid halt shall select CASE-02 from every mode after invalidity is excluded, stop mining, and enter `Idle`; a simultaneous asserted start or resume shall not defeat halt or become fresh merely after halt release.

VER-BEH-04: Exhaustive request-combination and two-step trace analysis shall pass only if every valid halt valuation selects CASE-02 and no held competing level can select CASE-05 or CASE-10 on the following evaluation.

RISK-01: If a nearly-full or invalid hold observation permits mining to continue, additional logical mining can be authorized after the selected capacity protection basis is reached or lost.

FAULT-01: CASE-01 and CASE-03 shall fail closed to `StopMining`; CASE-03 alone shall assert the advisory later-offload readiness indication, while invalid evidence shall never assert it.

VER-FAULT-01: Exhaustive finite analysis shall pass only if every applicable invalid or guard valuation produces the specified protected next mode and output tuple, with zero `ContinueMining` results and no `ReadyForLaterOffload` result from invalid evidence.

RISK-02: If asteroid depletion, laser overheat, or target interference is ignored, the supervisor can continue mining when its selected support applicability basis is absent.

FAULT-02: QUAL-SUPPORT-01 and CASE-04 shall reduce every valid nonready support combination to `SupportBlocked`, enter `ConditionHold`, and output `StopMining` with `HeldForSupport`.

VER-FAULT-02: Analysis shall pass only if all seven valid nonready field combinations select `SupportBlocked`, all applicable snapshots select CASE-04 after higher-priority exclusions, and none outputs `ContinueMining`.

RISK-03: If clearing or restoration accepts a retained request, the system can restart mining without a deliberate post-protection resume action.

FAULT-03: STATE-01, FRESH-02, FRESH-03, CASE-08, CASE-09, and CASE-11 shall prevent invalid-to-valid, guard-clear, support-restoration, same-evaluation, held-start, and held-resume paths from directly restarting mining.

VER-FAULT-03: Multi-step bounded analysis shall pass only if no trace from `CapacityHold` or `ConditionHold` reaches `Mining` without first reaching `RecoveryReady` on an acceptable evaluation and then observing a later valid `FreshResume` selected by CASE-10.

RECOVERY-01: Recovery from `CapacityHold` shall require a valid `SpaceAvailable` and `SupportReady` evaluation selecting CASE-08; recovery from `ConditionHold` shall require all three assessments valid, `SpaceAvailable`, and `SupportReady` selecting CASE-09. Both paths shall then wait in `RecoveryReady` until a later `FreshResume` selects CASE-10. A valid halt may instead abandon either episode to `Idle` under CASE-02.

VER-RECOVERY-01: Scenario and state-sequence analysis shall pass only if both protected modes have witnesses for clearing, waiting, rejected same-evaluation or held requests, and later fresh-resume recovery, and if reappearance of a guard, support block, or invalid input returns to the appropriate higher-priority protected mode.

## Exactly five scenario families

SCN-01: Nominal admission and persistence shall begin in `Idle` with valid space and support, observe a valid fresh start, enter `Mining`, and retain `Mining` on later acceptable evaluations even when the start level is held and therefore no longer fresh.

SCN-02: Nearly-full boundary protection shall begin in `Mining`, observe valid `NearlyFull`, enter and retain `CapacityHold` with `StopMining` and `ReadyForLaterOffload`, and make no cargo-transfer request or completion claim.

SCN-03: Invalid and support-fault protection shall cover an invalid request, invalid hold, and invalid support variant plus each source-named valid support-block class; every variant shall enter or retain `ConditionHold`, stop mining, and report the appropriate `InputFault` or `HeldForSupport` status.

SCN-04: Command priority and freshness shall cover valid simultaneous halt/start/resume, valid simultaneous fresh resume/start without halt, and a competing level held across halt release; it shall witness `HaltDominant`, resume-before-start priority, the reachable `RequestConflict` idle diagnostic, and nonreplay of held levels.

SCN-05: Protected recovery shall cover both `CapacityHold` clearing and `ConditionHold` restoration, discard a same-evaluation resume, wait in `RecoveryReady`, reject `FreshStart`, and resume mining only on a later valid `FreshResume`; a variant shall reassert a guard or support block before resume and return to protection.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five distinct families: nominal operation, qualitative boundary behavior, invalid/fault behavior, request-priority behavior, and recovery behavior. Each has a distinct behavioral trace and no family exists only to meet the count.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for the truth of request status and for lowering then reasserting a level when a new request is intended. Storing invalid raw levels to prevent replay is a conservative pilot choice, not a source fact.

ASM-02: CTX-02 is responsible for the validity and meaning of `RoomAvailable` and `NearlyFull`. The system assumes only that the two values are mutually exclusive per sample; it makes no claim about threshold magnitude, sensor accuracy, or physical remaining capacity.

ASM-03: CTX-03 is responsible for each support field and their shared validity. The selected rule that all three positive values are required for `SupportReady` is a pilot policy and not a source-established mining requirement.

ASM-04: CTX-04 is responsible for consuming the latest logical mining command. The abstract assumes no command acknowledgement and therefore claims neither physical stopping nor cargo retention effectiveness.

ASM-05: One logical evaluation observes one coherent sample from each input and publishes one coherent next-state outcome. No physical simultaneity, latency, periodicity, scheduler order, or execution rate is claimed.

ASM-06: The supervisor covers one ore hold and one logical mining episode at a time. Cargo removal may be one environmental cause of a later `RoomAvailable` observation, but concurrency, transfer identity, warehouse evidence, and offload completion remain outside the boundary.

CONSTRAINT-01: The retained model shall use finite types with exactly the members in TYPE-01 through TYPE-10, one root, one principal decision owner, and owner-local state and contracts. It shall not add a second policy owner or broaden readiness into a transfer-completion assertion.

## Structural, trace, and analysis obligations

STRUCT-01: The retained architecture shall contain exactly six responsibility-bearing semantic usages, exactly eleven end-to-end semantic interactions, one explicit root system usage, semantic containment depth from one through two beneath the root, and one weakly connected semantic region.

STRUCT-02: Context actors, the root, finite data definitions, ports, behavior-free containment support, and tool-required delegation routes receive no semantic-usage credit. A support hop may refine one INT meaning but shall not increase the eleven-interaction inventory.

STRUCT-03: Every semantic usage shall realize its PART responsibility and owner-local derivation. Any identity adapter, pass-through owner, bijective enum translator, duplicate decision, or analyzer-only derivation shall fail the usage and ownership gate even if structural counts appear within range.

STRUCT-04: The exact campaign tuple is `6 semantic usages / 11 semantic interactions / 11 nontrivial contract cases / 5 scenario families`, within the inclusive small bounds `5..8 / 7..14 / 6..12 / 4..6`. Numeric compliance shall not compensate for a missing responsibility, trace, case branch, or behavioral witness.

TRACE-01: Every actionable canonical identifier shall trace to one or more retained model elements, owner-local contracts, analyzer checks, or scenario witnesses; every significant generated usage, port, connection, state value, and contract clause shall trace back to an abstract identifier or carry a narrow `@generated-support <reason>` justification. Missing parents, unexplained children, or reused identifiers fail acceptance.

ANALYSIS-01: A dependency-free deterministic bounded analyzer shall enumerate exactly `5 * 8 * 16 * 4 * 16 = 40,960` one-step snapshots: five PART-04 pre-modes, eight PART-01 previous-level states, sixteen current request samples, four hold samples, and sixteen support samples.

ANALYSIS-02: For every snapshot the analyzer shall independently perform QUAL-REQ-01, QUAL-HOLD-01, and QUAL-SUPPORT-01; calculate next request state; apply the ordered case partition; identify exactly one effective case; derive next guard mode and all outputs; and compare them with the retained owner-local contracts. Pass requires zero gaps, zero effective overlaps, zero state or output mismatches, and at least one witness for every CASE-01 through CASE-11.

ANALYSIS-03: The analyzer shall separately execute SCN-01 through SCN-05 as multi-step traces and check invalid-to-valid nonfreshness, halt conflict, resume-before-start priority, capacity and condition clearing, same-evaluation discard, recovery waiting, re-protection, and later fresh resume. This is bounded conformance evidence, not physical validation, formal proof, or execution evidence.

## Objective pass criteria and final audit

PASS-01: Need and boundary acceptance requires faithful realization of PURPOSE-01, exactly MON-01 through MON-03 and CTRL-01 through CTRL-03, and no offload transaction, docking, ship-progress, warehouse-evidence, or transfer-completion interface or claim.

PASS-02: Structural acceptance requires the exact `6/11/11/5` tuple, one explicit root, semantic depth `1..2`, one weak semantic region, one principal decision owner, and no credited support or padding.

PASS-03: Ownership acceptance requires PART-01 and PART-04 to retain only their declared state; PART-04 alone to select all eleven cases; PART-01 through PART-03 to derive their assigned facts; PART-05 and PART-06 to derive outputs without raw-input inspection or policy recomputation; and the analyzer to remain evidence rather than an owner.

PASS-04: Partition acceptance requires CASE-01 through CASE-11 to be total, effectively mutually exclusive under PRIORITY-01, owner-local to PART-04, reachable by witness, and complete over `nextMode`, `reason`, and `requestConflict`.

PASS-05: Behavioral acceptance requires the exact nominal, boundary, invalid/fault, priority, and recovery traces in SCN-01 through SCN-05, complete output constraints, no mining continuation under a protected next mode, and no protected recovery without a later fresh resume.

PASS-06: Mechanical verification acceptance requires architecture-stage and final Sireum/HAMR typechecking, compatible typed directed endpoints, complete bidirectional trace coverage, successful 40,960-snapshot analysis, successful five-family scenario analysis, and exact reporting of semantic versus support structure. Any unrun check shall remain `not-run`.

PASS-07: Designer validation shall separately require fitness for pre-offload ore-hold supervision, clear distinction between an advisory nearly-full indication and cargo-transfer evidence, consistency with the seed limitations, and preservation of every pilot assumption and deferred claim. Mechanical conformance alone is insufficient.

PASS-08: Visualization acceptance requires exactly one native-resolution `system-overview` bound to the retained source revision and visibly distinguishing the three external input contexts, six semantic usages, PART-04 as sole principal owner, eleven directed semantic meanings, and two output consumers without presenting context or support as semantic usage.

PASS-09: Diversity acceptance requires the model to remain outside station cargo-transfer verification: it shall contain no transfer phase, offload admission state, ship/warehouse reconciliation, cancellation/service-fault transaction, transfer command, or verification finding. Any such organizing behavior is a System Abstract drift and fails acceptance.

AUDIT-FINAL-01: The complete recount is six semantic usages, eleven typed directed semantic interactions, eleven ordered nontrivial cases, five scenario families, two state owners, and one principal decision owner. Every counted item has a distinct responsibility or behavioral trace.

AUDIT-FINAL-02: Every decision, state, case, output, and interaction has exactly one declared owner. PART-01 owns request memory and request facts; PART-02 owns hold assessment; PART-03 owns support assessment; PART-04 owns guard mode and all cases; PART-05 owns the mining-command relation; and PART-06 owns both reporting relations.

AUDIT-FINAL-03: The final partition closes initialization, fresh start, held start, fresh resume, held resume, simultaneous requests, valid halt, invalid input, nearly-full boundary, support blockage, mining persistence, both protected states, guard clearing, evidence restoration, same-evaluation request discard, recovery waiting, re-protection, recovery resume, and halt abandonment. INT-01 through INT-11 remain the complete interaction inventory after this closure.

AUDIT-FINAL-04: The abstract distinguishes method obligations in METH-01, source-grounded facts and limitations in SRC-01 through SRC-02, Designer-selected abstractions and architecture in ABS-01 and ARCH-01, and deferred claims in DEF-01. None is presented as evidence for another class.

REVIEW-Q-01: Can PART-01's three previous-level values and PART-04's independent guard-mode state be initialized and constrained in owner-local GUMBO contracts while downstream usages consume rather than recompute their facts?

REVIEW-Q-02: Can the eleven ordered cases be expressed with explicit higher-priority exclusions and a same-evaluation next-mode output policy so that `ContinueMining` is equivalent to `nextMode = Mining`?

REVIEW-Q-03: Can the accepted SysML-AADL containment and port-delegation forms realize exactly six semantic usages and eleven end-to-end interaction meanings at semantic depth `1..2` while any required support remains behavior-free, traced, and uncredited?
