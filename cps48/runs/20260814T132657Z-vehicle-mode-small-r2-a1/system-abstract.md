---
abstract_id: SA-VEHICLE-CONTROLLER-MODE-SMALL-R2-01
run_id: 20260814T132657Z-vehicle-mode-small-r2-a1
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: small
semantic_usage_bounds: [5, 8]
semantic_interaction_bounds: [7, 14]
nontrivial_contract_case_bounds: [6, 12]
scenario_family_bounds: [4, 6]
semantic_usage_count: 5
semantic_interaction_count: 10
nontrivial_contract_case_count: 11
scenario_family_count: 5
selected_semantic_usage_count: 5
selected_semantic_interaction_count: 10
selected_nontrivial_contract_case_count: 11
selected_scenario_family_count: 5
root_system_usage_count: 1
containment_depth: [1, 2]
semantic_containment_depth: [1, 2]
weakly_connected_semantic_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
executable_profile: false
status: designer-initial-passed
---

# Vehicle Controller Operating-Mode Coordinator

## Need, purpose, and goals

NEED-01: A vehicle controller context needs one bounded logical coordinator that turns source-named start, on, off, maintenance, degraded, and return-to-normal indications into a persistent controller operating-mode disposition without treating those indications as start-readiness or power evidence.

PURPOSE-01: The Vehicle Controller Operating-Mode Coordinator shall qualify two finite indication channels, classify cross-channel compatibility, apply one exact priority and transition partition, retain one controller mode, and publish the applied mode plus a coordination result. It shall not authorize start, enable power, assess health or temperature, execute self-test, apply a parking brake, or control vehicle dynamics.

GOAL-01: The system shall select exactly one ordered policy case for every finite boundary snapshot and pre-evaluation mode and shall publish one mode/result frame derived from that case.

GOAL-02: The system shall coordinate the nominal `Off -> Starting -> On -> Off` lifecycle while rejecting lifecycle indications that are inapplicable to the current mode.

GOAL-03: The system shall make invalid evidence, degraded and maintenance indications, cross-channel conflicts, and recovery disposition externally distinguishable through its finite outputs.

GOAL-04: The system shall leave `Maintenance` or `Degraded` only for a fresh, unopposed return-to-normal event, shall return to `Off`, and shall require a later fresh start event before entering `Starting`.

## Evidence and claim boundary

METHOD-01: Handbook-derived method requires an implementation-independent need and boundary before decomposition, explicit assumptions and owners, nominal and off-nominal scenarios, alternatives, stable trace identifiers, measurable bounds, and separate verification from validation. These are methodology obligations, not facts about vehicle behavior.

FACT-SRC-01: The frozen seed grounds a Vehicle and embedded VehicleController in road context and names start, on, off, maintenance, degraded, return-to-normal, and vehicle/controller mode-disposition vocabulary.

FACT-SRC-02: The seed identifies the initiating actor only indirectly and does not establish the origin, authority, priority, validity, sequencing, or recovery meaning of the named indications; its state definitions and illustrative configuration do not form a complete protocol.

FACT-SRC-03: The seed also names temperature, self-test, brake, electrical power, fuel, and drivetrain concepts, but none is required by the selected controller-mode-coordination boundary.

ABS-PILOT-01: This System Abstract introduces the two exact finite input samples, validity semantics, pulse discipline, five controller modes, priority order, transition partition, output-result meanings, ownership allocation, and bounded scenarios as Designer-selected pilot abstractions beyond the source.

ARCH-SEL-01: The selected architecture separates lifecycle qualification, condition qualification, cross-channel compatibility, stateful mode arbitration, and boundary-result framing. This is the retained design direction justified in `design-selection.initial.md`, not a source fact or handbook prescription.

DEFER-01: Driver or command authority, physical starting, achieved on/off condition, temperature and health policy, readiness, electrical power and fuel effects, self-test, brake mechanics, maintenance work, road and drivetrain physics, timing, quantitative risk, safety, reliability, certification, deployment, code generation, execution, and production readiness are deferred and shall not be reported as passed.

## Operational context and exact finite boundary

CTX-01: The Lifecycle Indication Source is outside the system and provides current start, on, and off events. The seed does not identify this source as a driver, operator, or authoritative control station, so this abstract assigns it no such identity.

CTX-02: The Condition Indication Source is outside the system and provides current maintenance, degraded, and return-to-normal events. It is responsible for the truth and intended applicability of those indications; this coordinator does not diagnose their physical causes.

CTX-03: The Vehicle Supervisory Consumer is outside the system and receives the logical controller-mode disposition and coordination result. It alone assigns any downstream presentation or actuation meaning.

MON-01: `LifecycleSample` is a root input from CTX-01 with fields `event : LifecycleEvent` and `status : InputStatus`, where `LifecycleEvent` is exactly `{NoLifecycleEvent, Start, On, Off}` and `InputStatus` is exactly `{Valid, Invalid}`. When status is `Invalid`, the event payload has no authority.

MON-02: `ConditionSample` is a root input from CTX-02 with fields `event : ConditionEvent` and `status : InputStatus`, where `ConditionEvent` is exactly `{NoConditionEvent, Maintenance, Degraded, ReturnToNormal}` and `InputStatus` is exactly `{Valid, Invalid}`. When status is `Invalid`, the event payload has no authority.

CTRL-01: `ControllerModeDisposition` is a root output to CTX-03 with exactly `{Off, Starting, On, Maintenance, Degraded}`. It is a logical controller disposition, not evidence that the vehicle physically achieved the named condition.

CTRL-02: `CoordinationResult` is a root output to CTX-03 with exactly `{Applied, Stable, Rejected, EvidenceFault}`. `Applied` means an applicable indication won the current policy case, `Stable` means no event retained the mode, `Rejected` means an event or conflict was inapplicable, and `EvidenceFault` means invalid or internally inconsistent evidence selected the fault case.

BOUND-01: MON-01 and MON-02 are the complete root input inventory, and CTRL-01 and CTRL-02 are the complete root output inventory. Brake, temperature, self-test, readiness, power, fuel, physical-mode feedback, clock, and road quantities shall not be added without revising this abstract.

## Evaluation, state, modes, events, and assumptions

SEM-01: One logical evaluation consumes current MON-01 and MON-02 plus the pre-evaluation value of STATE-01, selects exactly one CASE-01 through CASE-11, atomically commits the selected next mode, and publishes the corresponding frame. This defines logical ordering but no scheduler, period, latency, or physical simultaneity.

STATE-01: `controllerMode : ControllerModeDisposition` is the only persistent domain state and is owned exclusively by PART-04. No other semantic usage may retain, select, override, or recompute the controller mode.

INIT-01: The initial STATE-01 and CTRL-01 shall be `Off`, and the initial CTRL-02 shall be `Stable`. Initialization is a safe logical baseline and is not a counted nontrivial contract case.

MODE-01: `Off` observably publishes CTRL-01 as `Off`; a fresh `Start` may enter `Starting`, while an applicable maintenance or degraded indication may select its named mode.

MODE-02: `Starting` observably publishes CTRL-01 as `Starting`; a fresh `On` may enter `On`, and a fresh `Off` may enter `Off`.

MODE-03: `On` observably publishes CTRL-01 as `On`; a fresh `Off` may enter `Off`, while maintenance or degraded indications may interrupt it according to priority.

MODE-04: `Maintenance` observably publishes CTRL-01 as `Maintenance` and rejects start/on progression; a fresh unopposed `ReturnToNormal` may enter `Off`.

MODE-05: `Degraded` observably publishes CTRL-01 as `Degraded` and rejects start/on progression; a fresh unopposed `ReturnToNormal` may enter `Off`.

EVENT-01: Each valid non-`No*Event` value denotes one fresh event for one evaluation, is consumed whether applied or rejected, and is never queued by the system. CTX-01 or CTX-02 shall provide its corresponding valid `No*Event` value before a later event on that channel can be considered fresh.

ASM-01: CTX-01 is responsible for the validity and pulse discipline of MON-01. This event abstraction is selected because the seed supplies no request identifier, held-level rule, or command protocol.

ASM-02: CTX-02 is responsible for the validity and pulse discipline of MON-02 and for originating `ReturnToNormal` only when its external basis is satisfied. The coordinator does not independently prove repair, maintenance completion, or physical recovery.

ASM-03: CTX-01 and CTX-02 each provide exactly one complete finite sample per logical evaluation. Arrival timing, transport, synchronization, and event-source implementation are outside scope.

ASM-04: CTX-03 consumes both root outputs as one logical frame from the selected next-mode decision. It provides no acknowledgement or physical-effect feedback to this system.

ASM-05: A return-to-normal event changes only `Maintenance` or `Degraded` to `Off`; it never starts the controller, completes `Starting`, or enables power. A later lifecycle event is required for further progression.

## Exactly five semantic usages and one principal decision owner

PART-01: Lifecycle Indication Qualification shall derive `LifecycleAssessment` exactly in `{InvalidLifecycle, NoLifecycle, StartRequested, OnRequested, OffRequested}` from both MON-01 fields. It owns payload applicability and no state, compatibility, priority, transition, or output decision.

PART-02: Condition Indication Qualification shall derive `ConditionAssessment` exactly in `{InvalidCondition, NoCondition, MaintenanceRequested, DegradedReported, ReturnRequested}` from both MON-02 fields. It owns payload applicability and no state, compatibility, priority, transition, or output decision.

PART-03: Cross-Channel Compatibility shall combine PART-01 and PART-02 assessments to derive `CoordinationClass` exactly in `{InvalidEvidence, Quiet, LifecycleOnly, ConditionOnly, OffDominantConflict, ConditionDominantConflict, RecoveryConflict}`. It owns the finite conflict/applicability classification but no persistent state or transition selection.

PART-04: Controller Mode Arbitration is the sole principal decision owner. It shall exclusively own STATE-01, CONSIST-01, PRIORITY-01, and CASE-01 through CASE-11 and derive one `ModeDecision` containing `nextMode : ControllerModeDisposition` and `reason : DecisionReason`, where `DecisionReason` is exactly `{InvalidEvidence, OffAccepted, DegradedAccepted, MaintenanceAccepted, ConflictingRequestsRejected, ReturnAccepted, ReturnNotApplicable, OnAccepted, StartAccepted, NoRequest, TransitionRejected}`.

PART-05: Coordination Frame Derivation shall consume PART-04's applied `ModeDecision`, project its `nextMode` to CTRL-01, and many-to-one classify its `reason` into CTRL-02. Its semantic credit comes only from the non-bijective result classification; it owns no mode state, transition, priority, compatibility, or evidence decision.

OWNER-01: The ownership audit shall report PART-04 as the only persistent-state, priority, case, and principal decision owner; PART-01 and PART-02 as stateless qualification owners; PART-03 as the stateless compatibility owner; and PART-05 as the stateless result-classification owner. Root, contexts, types, ports, containers, routing, and generated support receive no owner or semantic-usage credit.

## Exactly ten typed directed semantic interactions

INT-01: The root boundary shall provide `LifecycleSample` from MON-01 to PART-01.

INT-02: The root boundary shall provide `ConditionSample` from MON-02 to PART-02.

INT-03: PART-01 shall provide `LifecycleAssessment` to PART-03 for cross-channel classification.

INT-04: PART-02 shall provide `ConditionAssessment` to PART-03 for cross-channel classification.

INT-05: PART-01 shall provide `LifecycleAssessment` to PART-04 for transition arbitration independently of INT-03 because PART-04 is a distinct consumer.

INT-06: PART-02 shall provide `ConditionAssessment` to PART-04 for transition arbitration independently of INT-04 because PART-04 is a distinct consumer.

INT-07: PART-03 shall provide `CoordinationClass` to PART-04 for priority and consistency handling.

INT-08: PART-04 shall provide the applied `ModeDecision` to PART-05.

INT-09: PART-05 shall provide `ControllerModeDisposition` to CTRL-01 at the root boundary.

INT-10: PART-05 shall provide `CoordinationResult` to CTRL-02 at the root boundary.

INT-AUDIT-01: The complete inventory is exactly ten semantic interactions: two boundary-input deliveries, five inter-usage fact deliveries, one applied-decision delivery, and two boundary-output deliveries. Every interaction has a distinct producer-consumer purpose; routing or delegation hops receive no semantic credit.

## Owner-local contracts and closed policy partition

QUAL-LIFE-01: PART-01 shall map all eight MON-01 values: all four invalid-status values to `InvalidLifecycle`, valid `NoLifecycleEvent` to `NoLifecycle`, valid `Start` to `StartRequested`, valid `On` to `OnRequested`, and valid `Off` to `OffRequested`. The four invalid payloads collapse to one result, so this is not a bijective rename.

QUAL-COND-01: PART-02 shall map all eight MON-02 values: all four invalid-status values to `InvalidCondition`, valid `NoConditionEvent` to `NoCondition`, valid `Maintenance` to `MaintenanceRequested`, valid `Degraded` to `DegradedReported`, and valid `ReturnToNormal` to `ReturnRequested`. The four invalid payloads collapse to one result, so this is not a bijective rename.

COMPAT-01: PART-03 shall classify all 25 assessment pairs exactly: any pair containing an invalid assessment gives `InvalidEvidence`; the two no-assessment values give `Quiet`; one nonempty lifecycle assessment with `NoCondition` gives `LifecycleOnly`; `NoLifecycle` with one nonempty condition assessment gives `ConditionOnly`; `OffRequested` with any nonempty valid condition gives `OffDominantConflict`; `StartRequested` or `OnRequested` with `MaintenanceRequested` or `DegradedReported` gives `ConditionDominantConflict`; and `StartRequested` or `OnRequested` with `ReturnRequested` gives `RecoveryConflict`.

CONSIST-01: PART-04 shall regard an internal tuple as consistent exactly when its `CoordinationClass` equals COMPAT-01 for its two assessments. Any direct-input tuple with a different class is malformed and enters CASE-01; this defensive partition may not be moved to PART-05 or only to the analyzer.

PRIORITY-01: PART-04 shall apply strict descending priority: invalid or internally inconsistent evidence; valid off; valid degraded; valid maintenance; start/on conflict with return; applicable or inapplicable unopposed return; applicable on; applicable start; no request; then remaining inapplicable lifecycle transition. The first matching case excludes all lower cases in the same evaluation.

OUT-01: PART-05 shall map PART-04 reasons exactly: `InvalidEvidence` gives `EvidenceFault`; `OffAccepted`, `DegradedAccepted`, `MaintenanceAccepted`, `ReturnAccepted`, `OnAccepted`, and `StartAccepted` give `Applied`; `NoRequest` gives `Stable`; and `ConflictingRequestsRejected`, `ReturnNotApplicable`, and `TransitionRejected` give `Rejected`. CTRL-01 shall equal `ModeDecision.nextMode` for every value.

LOCAL-CONTRACT-01: PART-01, PART-02, PART-03, and PART-05 shall each retain one exhaustive owner-local derivation for its credited fact. PART-04 shall retain state, consistency, priority, and all eleven effective cases in one owner-local contract; no downstream usage or bounded analyzer may recompute or override mode arbitration.

CASE-AUDIT-01: CASE-01 through CASE-11 below are exactly eleven ordered, mutually exclusive, and collectively exhaustive nontrivial policy cases over every pre-mode and qualified snapshot. Qualification equations, COMPAT-01, CONSIST-01, OUT-01, initialization, invariants, scenario witnesses, and analyzer branches are required but receive no additional case credit.

## Exactly eleven ordered nontrivial contract cases

CASE-01: If either assessment is invalid or CONSIST-01 is false, then the next mode shall be `Degraded` and the reason shall be `InvalidEvidence`, regardless of pre-mode or the other payload.

CASE-02: Otherwise, if lifecycle is `OffRequested`, then the next mode shall be `Off` and the reason shall be `OffAccepted`, regardless of any valid condition assessment.

CASE-03: Otherwise, if condition is `DegradedReported`, then the next mode shall be `Degraded` and the reason shall be `DegradedAccepted`, regardless of a simultaneous valid start or on assessment.

CASE-04: Otherwise, if condition is `MaintenanceRequested`, then the next mode shall be `Maintenance` and the reason shall be `MaintenanceAccepted`, regardless of a simultaneous valid start or on assessment.

CASE-05: Otherwise, if `CoordinationClass` is `RecoveryConflict`, then the next mode shall equal the pre-mode and the reason shall be `ConflictingRequestsRejected`; both events are consumed.

CASE-06: Otherwise, if condition is `ReturnRequested` and the pre-mode is `Maintenance` or `Degraded`, then the next mode shall be `Off` and the reason shall be `ReturnAccepted`.

CASE-07: Otherwise, if condition is `ReturnRequested` and the pre-mode is `Off`, `Starting`, or `On`, then the next mode shall equal the pre-mode and the reason shall be `ReturnNotApplicable`.

CASE-08: Otherwise, if lifecycle is `OnRequested` and the pre-mode is `Starting` or `On`, then the next mode shall be `On` and the reason shall be `OnAccepted`.

CASE-09: Otherwise, if lifecycle is `StartRequested` and the pre-mode is `Off` or `Starting`, then the next mode shall be `Starting` and the reason shall be `StartAccepted`.

CASE-10: Otherwise, if lifecycle is `NoLifecycle` and condition is `NoCondition`, then the next mode shall equal the pre-mode and the reason shall be `NoRequest`.

CASE-11: Otherwise, the remaining valid lifecycle request is inapplicable to the pre-mode; the next mode shall equal the pre-mode and the reason shall be `TransitionRejected`.

## Required behavior, risks, faults, and objective criteria

BEH-01: Under valid unopposed events, the system shall realize `Off -> Starting` only through CASE-09, `Starting -> On` only through CASE-08, and any-mode `-> Off` through CASE-02; no readiness or power evidence shall participate.

VER-BEH-01: Contract inspection and exhaustive finite analysis pass only if every one-step lifecycle transition equals CASE-02, CASE-08, CASE-09, CASE-10, or CASE-11 as applicable and no other case reaches `Starting` or reaches `On` from a different pre-mode.

BEH-02: Valid degraded and maintenance indications shall follow CASE-03 and CASE-04, and recovery shall follow CASE-06 or CASE-07 without implicitly entering `Starting` or `On`.

VER-BEH-02: Contract and multi-step trace analysis pass only if `Maintenance` or `Degraded` recovery reaches exactly `Off`, a simultaneous return plus start/on is rejected under CASE-05, and a later fresh start is required to reach `Starting`.

BEH-03: For each logical evaluation, PART-04 shall select exactly one next mode and reason, and PART-05 shall publish the exact OUT-01 frame from that applied decision.

VER-BEH-03: Exhaustive analysis pass only if all 320 combinations of the 64 raw boundary snapshots and five pre-modes select exactly one CASE-01 through CASE-11, all consistent internal tuples select the same result, all inconsistent class tuples select CASE-01, and every output frame satisfies OUT-01.

RISK-01: If invalid indication evidence or incompatible internal classification were allowed to retain an apparently nominal mode/result, CTX-03 could treat an untrusted coordination decision as valid.

FAULT-01: PART-01 through PART-04 shall suppress invalid payload authority and select CASE-01 before every valid-event case; PART-05 shall publish `Degraded/EvidenceFault` from that decision.

VER-FAULT-01: Qualification-contract inspection and exhaustive analysis pass only if every raw snapshot containing either invalid status, and every malformed internal compatibility tuple, selects `Degraded/InvalidEvidence` and publishes `Degraded/EvidenceFault` independent of payload and pre-mode.

RISK-02: If a rejected or losing event were queued, or a return event directly progressed the lifecycle, the coordinator could change mode later without a new boundary event.

FAULT-02: EVENT-01 and CASE-05 through CASE-11 shall consume every event in its evaluation, retain no pending request, return recovery only to `Off`, and require a later fresh lifecycle event for further progress.

VER-FAULT-02: Contract and bounded sequence analysis pass only if a rejected, overridden, or inapplicable event causes no later transition during valid no-event snapshots and if recovery traces cannot reach `Starting` or `On` without a later fresh `Start` and then a fresh `On`.

## Exactly five scenario families

SCN-01: Nominal lifecycle coordination shall cover initialized `Off`, a valid fresh `Start` reaching `Starting`, a later valid fresh `On` reaching `On`, and a later valid fresh `Off` reaching `Off`, with no readiness, self-test, or power premise.

SCN-02: Lifecycle boundary handling shall cover no-event retention in every mode, repeated-mode requests, `On` while `Off`, and `Start` while `On`, `Maintenance`, or `Degraded`, distinguishing `Stable`, `Applied`, and `Rejected` results.

SCN-03: Maintenance coordination and recovery shall cover a valid maintenance indication interrupting `On`, start/on rejection in `Maintenance`, a fresh unopposed return reaching `Off`, and a later fresh start beginning a new lifecycle progression.

SCN-04: Degraded and invalid-evidence behavior shall cover a valid degraded indication, invalid lifecycle evidence, invalid condition evidence, no-event retention in `Degraded`, and a fresh unopposed return reaching `Off` without entering `Starting` or `On`.

SCN-05: Priority, conflict, and freshness shall cover invalid evidence with valid off, off with each nonempty condition event, degraded or maintenance with start/on, return with start/on, and a rejected or losing event followed by no-event snapshots, demonstrating `invalid > off > degraded > maintenance > recovery-conflict > return > on > start` and no queued transition.

SCN-AUDIT-01: SCN-01 through SCN-05 are exactly five distinct scenario families: nominal progression, boundary transition rejection, maintenance recovery, invalid/degraded recovery, and simultaneous-priority/freshness behavior. Examples within a family receive no additional family credit.

## Structural, trace, verification, and validation pass criteria

STRUCT-01: The realization shall contain exactly one explicit root system usage, exactly five credited semantic usages corresponding to PART-01 through PART-05, semantic containment depth one or two below the root, and exactly one weakly connected semantic region.

STRUCT-02: The realization shall contain exactly ten credited typed directed interactions corresponding to INT-01 through INT-10. Every credited usage shall derive its owner-local fact and participate in at least one boundary-connected behavioral path.

COUNT-01: The campaign count shall be exactly eleven nontrivial contract cases and exactly five scenario families. No type invariant, initialization, local equation, duplicated guarantee, routing hop, scenario example, or analyzer branch shall inflate these counts.

TRACE-01: Trace analysis passes only if every actionable identifier in this abstract maps to one or more model elements or is explicitly marked informational/deferred, and every significant model element traces back here or has an explicit `@generated-support` justification. Missing abstract coverage or unexplained additions fail.

VERIFY-01: Mechanical verification passes only if the retained architecture and final source pass the run-policy Sireum type gates, endpoints and types resolve, structural and count criteria pass, owner-local contracts and the complete partition are present, the deterministic bounded analyzer passes, and trace coverage is complete.

VALIDATE-01: Designer validation remains separate and passes only if the retained model still coordinates controller operating modes from the exact boundary and scenarios above without importing replicate-1 temperature/health supervision, start readiness, protected start, power enablement, or unsupported physical claims.

EVID-STATUS-01: Code generation, application execution, compositional proof, physical timing, safety validation, and production suitability are `not-run` and cannot be used as evidence for this initial abstract.

QUESTION-01: Model review shall determine whether the retained SysML-AADL/GUMBO subset can make PART-05 observe PART-04's applied next-mode decision in the same logical evaluation without an unintended one-cycle delay; if not, it shall report the exact realizability limitation rather than silently change CASE-01 through CASE-11.
