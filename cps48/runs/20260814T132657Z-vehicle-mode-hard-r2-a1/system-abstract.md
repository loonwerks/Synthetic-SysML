---
abstract_id: SA-VEH-HARD-R2-01
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: hard
semantic_usage_count: 13
semantic_interaction_count: 35
nontrivial_contract_case_count: 30
scenario_family_count: 10
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
---

# Vehicle Controller Operating-Mode and Parking-Brake Coordinator

## Evidence and claim partition

METH-01: The handbook-derived method requires need and context before decomposition, an explicit monitored/controlled boundary, cohesive responsibility allocation, nominal and off-nominal scenarios, recorded assumptions and alternatives, bidirectional trace coverage, measurable pass criteria, and separate verification and validation. These are methodology obligations, not facts about a production vehicle.

SRC-01: The frozen seed supports Vehicle and VehicleController context; start, on, off, maintenance, degraded, return-to-normal, parking-brake, and controller-mode vocabulary. It also permits but does not require temperature, self-test, power, fuel, road, and drivetrain concepts.

SRC-02: The seed does not define a complete indication protocol, originator, priority order, state transition system, invalid-input semantics, parking-brake effects, or recovery rule. Its state and action definitions are incomplete examples and do not establish production behavior.

ABS-01: This pilot selects a finite controller operating-mode protocol. It treats source-named indications as abstract levels with explicit validity, recognizes fresh edges, coordinates `Off`, `Standby`, `Operating`, `Maintenance`, and `Degraded`, and pairs each published mode with a conservative parking-brake command. The exact types, sequencing, priorities, state meanings, and causal rules are Designer-owned assumptions beyond the seed.

SEL-01: The selected architecture is exactly the thirteen responsibility-bearing usages in PART-01 through PART-13 and the thirty-five typed directed meanings in INT-01 through INT-35. This allocation is a selected design, not a handbook fact or a source-grounded decomposition.

DEF-01: Physical brake force, actuator success feedback, starter and power behavior, vehicle motion, road and drivetrain physics, timing, scheduling, quantitative performance, reliability, hazard likelihood or severity, certification, execution, generated application code, and proof beyond retained contracts and bounded finite analysis are deferred. Deferred checks shall remain reported as `not-run` or out of scope rather than passed.

DIV-01: The closest replicate-1 baseline is the start-readiness/protected-start supervisor. This system is not its extension or repartition: it excludes brake, temperature, maintenance-quality, self-test, and power-readiness evidence; emits no start authorization or power/status outcome; owns operating demand, maintenance-session, degraded-episode, and controller-mode state; uses an indication-epoch/conflict topology; applies `invalid/degraded > off > maintenance > return > on > start`; and recovers to `Standby` through fresh return plus a quiet confirmation rather than through a recovery self-test, `Off`, and a later fresh start.

## Need, purpose, goals, and operational context

NEED-01: A VehicleController environment needs one bounded coordinator that turns a partial and potentially conflicting set of lifecycle, maintenance, degraded, and return indications into an unambiguous operating mode and a mode-consistent parking-brake command without silently accepting stale recovery indications.

PURP-01: The system will coordinate controller operating-mode progression and parking-brake disposition for one logical controller episode. Start and on are external lifecycle context, not readiness or power authorization; the system does not qualify temperature, self-test, brake feedback, or power evidence and does not control starting or power provision.

GOAL-01: The system shall progress nominally from `Off` to `Standby` on a fresh start indication and from `Standby` to `Operating` on a later fresh on indication, while held or out-of-order indications cannot replay those transitions.

GOAL-02: The system shall apply one explicit indication priority, propagate any invalid or degraded indication into the owned degraded episode and externally visible `Degraded` mode, and prevent maintenance or lower-priority indications from masking that condition.

GOAL-03: The system shall leave `Degraded` only after the degraded indication is clear, a fresh uncontested return indication arms recovery, and a later quiet confirmation evaluation completes recovery into `Standby`.

GOAL-04: The system shall publish an atomic mode/brake frame in which parking-brake release is possible only for `Operating` when an independent brake-demand decision also permits release; every other reachable frame shall command apply.

CTX-01: The Vehicle is the external source and consumer context named by the seed. For this pilot it presents abstract controller indications and consumes the coordinated frame; this responsibility assignment is an assumption because the source does not identify the indication originator.

CTX-02: The Parking-Brake Actuation Context consumes the parking-brake command. It is outside the boundary and provides no modeled achievement feedback, so `Apply` and `Release` are requests rather than claims of physical effect.

CTX-03: The Road, drivetrain, starter, electrical-power network, self-test mechanism, temperature source, and maintenance process remain external context and exchange no modeled quantity with this selected boundary.

## Exact finite monitored and controlled boundary

TYPE-01: `IndicationLevel = {Clear, Asserted, Invalid}`. `Clear` and `Asserted` are abstract levels, not electrical encodings; `Invalid` means the source cannot provide trustworthy current indication evidence.

TYPE-02: `LifecycleIndications = (start: IndicationLevel, on: IndicationLevel, off: IndicationLevel)`, a finite product of twenty-seven values. A fresh event exists only for a `Clear -> Asserted` transition; `Asserted -> Asserted`, `Invalid -> Asserted`, and initialization with `Asserted` are not fresh.

TYPE-03: `MaintenanceIndication`, `DegradedIndication`, and `ReturnIndication` each use `IndicationLevel`. Maintenance and degraded are level-sensitive after a valid assertion; return is actionable only as a fresh edge during a latched degraded episode.

TYPE-04: `ConflictClass = {InputInvalid, MultipleActionable, SingleOrNone}`. An actionable set contains level-sensitive degraded, off, or maintenance plus fresh return, on, or start; an invalid field produces `InputInvalid` regardless of the actionable count.

TYPE-05: `SelectedIndication = {InvalidSelected, DegradedSelected, OffSelected, MaintenanceSelected, ReturnSelected, OnSelected, StartSelected, NoneSelected}`.

TYPE-06: `OperatingDemand = {Dormant, Staged, RunRequested}`, `MaintenanceSession = {Inactive, Active}`, `DegradedEpisode = {ClearEpisode, Latched, ReturnArmed}`, and `RecoveryDecision = {NotApplicable, Arm, Confirm, Cancel, Wait}`.

TYPE-07: `ControllerMode = {Off, Standby, Operating, Maintenance, Degraded}`, `BrakeDemand = {RequireApply, AllowRelease}`, and `ParkingBrakeCommand = {Apply, Release}`. `CoordinationFrame = (mode: ControllerMode, parkingBrake: ParkingBrakeCommand)` is the only controlled object.

MON-01: The system shall monitor `lifecycle_indications: LifecycleIndications` from CTX-01; PART-01 alone owns lifecycle freshness and invalidity facts.

MON-02: The system shall monitor `maintenance_indication: MaintenanceIndication` from CTX-01; PART-02 alone owns maintenance active, fresh, clear-edge, and invalidity facts.

MON-03: The system shall monitor `degraded_indication: DegradedIndication` from CTX-01; PART-03 alone owns degraded active, fresh, clear-edge, and invalidity facts.

MON-04: The system shall monitor `return_indication: ReturnIndication` from CTX-01; PART-04 alone owns return fresh, held, clear, and invalidity facts.

CTRL-01: The system shall control exactly one `coordination_frame: CoordinationFrame` delivered atomically to CTX-01 and CTX-02. It directly controls only the published controller-mode disposition and requested parking-brake disposition.

BOUND-01: MON-01 through MON-04 and CTRL-01 are the complete root boundary. No readiness evidence, start authorization, power outcome, general status, physical feedback, temperature, self-test, brake-pedal, fuel, torque, speed, clock, or additional command channel may be added without a revised abstract.

## Selected semantic usages, local ownership, and state

PART-01: Lifecycle Epoch Owner shall retain the previous start, on, and off levels and derive fresh-start, fresh-on, level-sensitive off-active, held-level, and any-lifecycle-invalid facts. It performs temporal classification and shall not choose a mode.

PART-02: Maintenance Epoch Owner shall retain the previous maintenance level and derive maintenance-active, fresh-maintenance, maintenance-cleared, held-maintenance, and maintenance-invalid facts.

PART-03: Degradation Epoch Owner shall retain the previous degraded level and derive degraded-active, fresh-degraded, degraded-cleared, held-degraded, and degraded-invalid facts.

PART-04: Return Epoch Owner shall retain the previous return level and derive fresh-return, held-return, return-clear, and return-invalid facts; only `Clear -> Asserted` is fresh.

PART-05: Conflict Classification Owner shall combine the four epoch fact sets and derive `ConflictClass`, including the actionable candidate cardinality. It owns conflict recognition but shall not select a winner.

PART-06: Indication Priority Owner shall combine the epoch facts and conflict class and derive exactly one `SelectedIndication` under CASE-01 through CASE-08. It owns winner selection and preserves conflict as a separate fact; it shall not own mode or episode state.

PART-07: Operating Demand Owner shall retain `OperatingDemand` and derive its next value under CASE-09 through CASE-12 from selected lifecycle meaning and confirmed recovery. It owns the nominal two-step `Dormant -> Staged -> RunRequested` episode rather than authorizing a start.

PART-08: Maintenance Session Owner shall retain `MaintenanceSession` and derive its next value under CASE-13 through CASE-15. It owns maintenance entry, persistence, and deliberate exit independently of nominal demand.

PART-09: Degraded Episode Owner shall retain `DegradedEpisode` and derive its next value under CASE-16 through CASE-20. It alone latches active degradation or any selected invalidity and applies the Recovery Eligibility Owner's decision to arm, confirm, cancel, or retain recovery.

PART-10: Recovery Eligibility Owner shall derive `RecoveryDecision` under CASE-21 through CASE-25 from current degraded episode, indication priority, conflict, degraded epoch, and return epoch. It owns the fresh-return and quiet-confirmation decision but not the episode state.

PART-11: Controller Mode Transition Owner shall retain exactly one `ControllerMode`, derive next mode and transition reason under CASE-26 through CASE-30 from the post-decision demand, maintenance, and degraded episode facts, and consume recovery reason without recomputing it.

PART-12: Parking-Brake Demand Owner shall independently derive `BrakeDemand`. It shall require apply for invalid/degraded/off/maintenance selections, an active maintenance session, or any nonclear degraded episode; otherwise it may allow release, but it shall not publish the final command or relax a mode constraint.

PART-13: Outcome Coherence Owner shall derive the atomic `CoordinationFrame` from PART-11's next mode and PART-12's brake demand. It shall publish `Release` only for `(Operating, AllowRelease)` and `Apply` for every other pair, a two-input conservative composition rather than copying, bundling, or bijectively renaming either input.

STATE-01: PART-01 through PART-04 shall initialize every retained previous indication level to `Invalid`, then store the current level after each evaluation. Therefore an initially asserted indication is not fresh and must first become `Clear` before a later assertion can create a fresh event.

STATE-02: PART-07 shall initialize `OperatingDemand` to `Dormant`; PART-08 shall initialize `MaintenanceSession` to `Inactive`; PART-09 shall initialize `DegradedEpisode` to `ClearEpisode`; and PART-11 shall initialize `ControllerMode` to `Off`.

STATE-03: PART-09 shall retain `Latched` after a degraded or invalid condition clears until PART-10 issues `Arm` and later `Confirm`. A held return, a return asserted directly after invalid, or a same-evaluation quiet claim cannot complete recovery.

OWN-AUDIT-01: PART-01 through PART-04 own four distinct temporal facts; PART-05 owns concurrent-conflict classification; PART-06 owns winner priority; PART-07, PART-08, PART-09, and PART-11 own four distinct state dimensions; PART-10 owns recovery eligibility; PART-12 owns independent brake demand; and PART-13 owns conservative cross-output composition.

OWN-AUDIT-02: Every PART usage derives a behaviorally meaningful owner-local fact. None earns credit for preserving, copying, routing, bundling, renaming, or one-to-one translation, and no downstream owner may inspect root inputs to recompute an upstream fact.

## Complete typed directed semantic interaction inventory

INT-01: Root/MON-01 shall provide `LifecycleIndications` to PART-01 for lifecycle epoch derivation.

INT-02: Root/MON-02 shall provide `MaintenanceIndication` to PART-02 for maintenance epoch derivation.

INT-03: Root/MON-03 shall provide `DegradedIndication` to PART-03 for degradation epoch derivation.

INT-04: Root/MON-04 shall provide `ReturnIndication` to PART-04 for return epoch derivation.

INT-05: PART-01 shall provide lifecycle epoch facts to PART-05 for invalidity and actionable-count classification.

INT-06: PART-02 shall provide maintenance epoch facts to PART-05 for invalidity and actionable-count classification.

INT-07: PART-03 shall provide degradation epoch facts to PART-05 for invalidity and actionable-count classification.

INT-08: PART-04 shall provide return epoch facts to PART-05 for invalidity and actionable-count classification.

INT-09: PART-05 shall provide `ConflictClass` to PART-06 for conflict-preserving priority selection.

INT-10: PART-01 shall provide lifecycle epoch facts to PART-06 for off/on/start candidate selection.

INT-11: PART-02 shall provide maintenance epoch facts to PART-06 for maintenance candidate selection.

INT-12: PART-03 shall provide degradation epoch facts to PART-06 for degraded candidate selection.

INT-13: PART-04 shall provide return epoch facts to PART-06 for return candidate selection.

INT-14: PART-06 shall provide `SelectedIndication` to PART-07 for nominal demand progression or clearing.

INT-15: PART-06 shall provide `SelectedIndication` to PART-08 for maintenance entry, exit, or clearing.

INT-16: PART-02 shall provide maintenance-cleared and maintenance-active facts to PART-08 for session persistence and deliberate exit.

INT-17: PART-03 shall provide degraded-active and degraded-invalid facts to PART-09 for episode latching.

INT-18: PART-05 shall provide `ConflictClass` to PART-10 for uncontested recovery checks.

INT-19: PART-06 shall provide `SelectedIndication` to PART-10 for recovery applicability and cancellation.

INT-20: PART-03 shall provide degraded-clear/active/invalid facts to PART-10 for recovery prerequisites.

INT-21: PART-04 shall provide fresh, held, clear, and invalid return facts to PART-10 for arming and quiet confirmation.

INT-22: PART-09 shall provide current `DegradedEpisode` to PART-10 for phase-relative recovery decisions.

INT-23: PART-10 shall provide `RecoveryDecision` to PART-09 for episode-state update.

INT-24: PART-10 shall provide confirmed-recovery meaning to PART-07 for restaging nominal demand without a fresh start.

INT-25: PART-07 shall provide current/next `OperatingDemand` to PART-11 for nominal mode selection.

INT-26: PART-08 shall provide current/next `MaintenanceSession` to PART-11 for maintenance-mode selection.

INT-27: PART-09 shall provide current/next `DegradedEpisode` to PART-11 for degraded-mode dominance and recovery completion.

INT-28: PART-06 shall provide `SelectedIndication` to PART-09 so invalidity in any monitored field and active degradation can latch one degraded episode without raw-input recomputation.

INT-29: PART-10 shall provide `RecoveryDecision` to PART-11 for explicit recovery-to-standby transition reason.

INT-30: PART-08 shall provide current/next `MaintenanceSession` to PART-12 for independent brake demand.

INT-31: PART-09 shall provide current/next `DegradedEpisode` to PART-12 for independent brake demand.

INT-32: PART-06 shall provide `SelectedIndication` to PART-12 for immediate invalid, degraded, off, and maintenance brake demand.

INT-33: PART-11 shall provide next `ControllerMode` and transition reason to PART-13 for frame composition.

INT-34: PART-12 shall provide `BrakeDemand` to PART-13 for conservative command composition.

INT-35: PART-13 shall provide the atomic `CoordinationFrame` to Root/CTRL-01 for CTX-01 and CTX-02.

INT-AUDIT-01: INT-01 through INT-35 are exactly thirty-five typed directed end-to-end semantic interactions: four root observations, thirty inter-owner facts or decisions, and one root controlled delivery. Any profile-required delegation hop shall trace to one listed meaning, derive no fact, and receive no additional semantic credit.

INT-AUDIT-02: All thirteen usages lie in one weakly connected semantic region. Every usage has a derivation-producing incoming flow and a boundary-relevant outgoing path; none of the thirty-five interactions duplicates another source, destination, type meaning, or behavioral trace merely to meet the hard bound.

## Priority, applicability, recovery, and composition policy

POL-01: Input invalidity has highest priority, followed by level-sensitive degraded, level-sensitive off, level-sensitive maintenance, fresh return, fresh on, fresh start, and none. Thus the complete order is `invalid > degraded > off > maintenance > return > on > start > none`.

POL-02: `MultipleActionable` shall remain observable to downstream contracts even though PART-06 selects one winner. It shall block recovery arming and confirmation; outside recovery, the priority winner still determines behavior.

POL-03: Start and on are applicable only to nominal demand progression. Start stages a dormant episode; a later fresh on requests operation. Neither qualifies readiness, enables power, or directly releases the parking brake.

POL-04: Maintenance is level-sensitive and overrides nominal demand without erasing it. A maintenance session exits to the preserved nominal demand only after maintenance is clear and a fresh on wins priority; degraded, invalid, or off clears the session.

POL-05: Any invalid field or asserted degraded indication shall latch the degraded episode in the same abstract evaluation, dominate mode selection, and require parking-brake apply. Clearing the initiating input alone shall not clear the episode.

POL-06: Recovery shall arm only from `Latched` when degraded is clear, return is fresh, return wins priority, and conflict is `SingleOrNone`. On a later evaluation, confirmation requires return clear, degraded clear, no actionable indication, and `SingleOrNone`; it clears the episode, stages demand, and moves to `Standby`.

POL-07: While `ReturnArmed`, invalidity, reasserted degradation, a conflicting actionable set, or a winning off, maintenance, on, or start indication shall cancel the attempt to `Latched`. A held return or repeated return edge shall wait and cannot confirm.

POL-08: PART-12 shall derive `RequireApply` whenever the next maintenance session is active, the next degraded episode is nonclear, or PART-06 selected invalid, degraded, off, or maintenance; otherwise it shall derive `AllowRelease`.

POL-09: PART-13 shall publish `(Operating, Release)` only from next mode `Operating` and `AllowRelease`. All `Off`, `Standby`, `Maintenance`, and `Degraded` frames shall command `Apply`; `Operating` with `RequireApply` shall also command `Apply` rather than weakening the independent brake demand.

POL-10: Initialization shall publish `(Off, Apply)`. Epoch equations, state initialization, conflict cardinality, brake-demand mapping, composition mapping, frame invariants, and transition-reason equations are mandatory but are not counted among CASE-01 through CASE-30.

## Exactly thirty ordered nontrivial contract cases

CASE-01: PART-06, when PART-05 reports `InputInvalid`, shall derive `InvalidSelected` regardless of all actionable indications.

CASE-02: PART-06, when inputs are valid and degraded is active, shall derive `DegradedSelected` regardless of off, maintenance, return, on, or start.

CASE-03: PART-06, when inputs are valid, degraded is not active, and off is active, shall derive `OffSelected` regardless of all lower-priority candidates.

CASE-04: PART-06, when inputs are valid, degraded and off are inactive, and maintenance is active, shall derive `MaintenanceSelected` regardless of fresh return, on, or start.

CASE-05: PART-06, when all higher-priority candidates are absent and return is fresh, shall derive `ReturnSelected` regardless of fresh on or start.

CASE-06: PART-06, when all higher-priority candidates are absent and return is not fresh but on is fresh, shall derive `OnSelected` regardless of fresh start.

CASE-07: PART-06, when all higher-priority candidates and fresh on are absent and start is fresh, shall derive `StartSelected`.

CASE-08: PART-06, when no priority candidate is present, shall derive `NoneSelected`. CASE-01 through CASE-08 are mutually exclusive and exhaustive over all finite PART-06 inputs.

CASE-09: PART-07, when selection is `InvalidSelected`, `DegradedSelected`, or `OffSelected`, shall set next demand to `Dormant` regardless of current demand or recovery decision.

CASE-10: PART-07, when CASE-09 does not apply and recovery is `Confirm`, or when selection is `StartSelected` and current demand is `Dormant`, shall set next demand to `Staged`.

CASE-11: PART-07, when CASE-09 and CASE-10 do not apply, selection is `OnSelected`, and current demand is `Staged`, shall set next demand to `RunRequested`.

CASE-12: PART-07, for every remaining combination, shall retain current demand. CASE-09 through CASE-12 are mutually exclusive and exhaustive.

CASE-13: PART-08, when selection is `MaintenanceSelected`, shall set next maintenance session to `Active`.

CASE-14: PART-08, when CASE-13 does not apply and selection is `InvalidSelected`, `DegradedSelected`, or `OffSelected`, or when current session is `Active`, maintenance is clear, and selection is `OnSelected`, shall set next session to `Inactive`.

CASE-15: PART-08, for every remaining combination, shall retain current session. CASE-13 through CASE-15 are mutually exclusive and exhaustive.

CASE-16: PART-09, when the degraded epoch is active or invalid or selection is `InvalidSelected` or `DegradedSelected`, shall set next episode to `Latched` regardless of current episode or recovery decision.

CASE-17: PART-09, when CASE-16 does not apply, current episode is `Latched`, and recovery decision is `Arm`, shall set next episode to `ReturnArmed`.

CASE-18: PART-09, when CASE-16 does not apply, current episode is `ReturnArmed`, and recovery decision is `Confirm`, shall set next episode to `ClearEpisode`.

CASE-19: PART-09, when CASE-16 does not apply, current episode is `ReturnArmed`, and recovery decision is `Cancel`, shall set next episode to `Latched`.

CASE-20: PART-09, for every remaining combination, shall retain current episode. CASE-16 through CASE-20 are mutually exclusive and exhaustive.

CASE-21: PART-10, when current degraded episode is `ClearEpisode`, shall derive `NotApplicable` regardless of return behavior.

CASE-22: PART-10, when current episode is `Latched`, degraded is valid and clear, return is fresh, selection is `ReturnSelected`, and conflict is `SingleOrNone`, shall derive `Arm`.

CASE-23: PART-10, when current episode is `ReturnArmed`, degraded and return are valid and clear, selection is `NoneSelected`, and conflict is `SingleOrNone`, shall derive `Confirm`.

CASE-24: PART-10, when current episode is `ReturnArmed`, CASE-23 does not apply, and any input is invalid, degraded is active, conflict is `MultipleActionable`, or selection is `InvalidSelected`, `DegradedSelected`, `OffSelected`, `MaintenanceSelected`, `OnSelected`, or `StartSelected`, shall derive `Cancel`.

CASE-25: PART-10, for every remaining latched or armed combination, including held return and a repeated fresh return while armed, shall derive `Wait`. CASE-21 through CASE-25 are mutually exclusive and exhaustive.

CASE-26: PART-11, when the post-decision degraded episode is not `ClearEpisode`, shall set next mode to `Degraded` regardless of demand or maintenance session.

CASE-27: PART-11, when CASE-26 does not apply and the post-decision maintenance session is `Active`, shall set next mode to `Maintenance` regardless of nominal demand.

CASE-28: PART-11, when CASE-26 and CASE-27 do not apply and post-decision demand is `Staged`, shall set next mode to `Standby`.

CASE-29: PART-11, when CASE-26 through CASE-28 do not apply and post-decision demand is `RunRequested`, shall set next mode to `Operating`.

CASE-30: PART-11, when CASE-26 through CASE-29 do not apply, shall set next mode to `Off`; the only remaining demand is `Dormant`. CASE-26 through CASE-30 are mutually exclusive and exhaustive.

CASE-AUDIT-01: CASE-01 through CASE-30 are exactly thirty nontrivial, owner-local cases: eight priority-selection cases, four operating-demand cases, three maintenance-session cases, five degraded-episode cases, five recovery-decision cases, and five controller-mode cases. No case is a duplicate, initialization clause, type invariant, output equation, frame mapping, analyzer branch, or scenario restatement.

## Required nominal, priority, fault, recovery, and composition behavior

BEH-01: From initialized `Off`, after all inputs have first been observed `Clear`, a fresh start shall produce `Staged` and `Standby`; a later fresh on shall produce `RunRequested` and `Operating` while the frame remains mode/brake coherent.

VER-BEH-01: Contract inspection and finite trace analysis shall pass only if the ordered trace reaches `(Standby, Apply)` and then `(Operating, Release)`, while an initially asserted, held, or out-of-order on/start indication cannot substitute for either required fresh step.

BEH-02: A maintenance assertion during nominal operation shall produce `Maintenance` and `Apply`, preserve nominal demand, remain active while maintenance is asserted, and return to the preserved nominal mode only after maintenance is clear and a fresh on wins priority.

VER-BEH-02: Contract and bounded-state analysis shall pass only if every maintenance-entry and persistence valuation follows CASE-13, CASE-27, POL-04, and POL-09, and if held on cannot exit maintenance.

BEH-03: For every simultaneous actionable set, the system shall select the unique winner defined by POL-01, preserve `MultipleActionable`, and prevent that conflict from arming or confirming recovery.

VER-BEH-03: Exhaustive finite analysis over the complete actionable power set shall pass only if the selected indication equals the ordered maximum, conflict cardinality is exact, and no `MultipleActionable` valuation yields `Arm` or `Confirm`.

BEH-04: For every reachable next mode and brake demand, the system shall produce a complete atomic frame under POL-09 with no unconstrained field or mixed observation.

VER-BEH-04: Composition analysis shall enumerate all ten mode/brake-demand pairs and pass only if exactly `(Operating, AllowRelease)` maps to release and the other nine pairs map to apply, with the published mode equal to PART-11's next mode.

## Hazards, fault propagation, and recovery

RISK-01: If competing indications are resolved inconsistently, lower-priority maintenance, return, on, or start behavior can mask a degraded or off condition and publish an unintended mode.

FAULT-01: PART-05 and PART-06 shall classify conflict separately and apply CASE-01 through CASE-08 so invalidity and degraded/off conditions dominate all lower-priority candidates.

VER-FAULT-01: Exhaustive priority analysis shall pass only if every finite combination has one selected winner, invalidity is never masked, and each conflict witness preserves `MultipleActionable` downstream.

RISK-02: If an invalid or degraded indication is not propagated through episode, mode, brake demand, and composition, the system can retain an operating frame using untrustworthy context.

FAULT-02: CASE-01, CASE-09, CASE-16, CASE-26, POL-08, and POL-09 shall propagate any invalid field or active degradation to a latched episode and the `(Degraded, Apply)` frame in the same abstract evaluation's post-state result.

VER-FAULT-02: For each invalid field and for degraded assertion from every reachable mode, post-state analysis shall pass only if next episode is `Latched`, next mode is `Degraded`, brake demand is `RequireApply`, and the frame is `(Degraded, Apply)`.

RISK-03: If a held, stale, conflicted, or same-evaluation return indication clears degradation, the controller can leave its degraded disposition without an observable recovery sequence.

FAULT-03: CASE-21 through CASE-25 shall require a fresh uncontested return to arm and a later clear, quiet evaluation to confirm; every specified abort shall cancel to `Latched`, and held or repeated return shall only wait.

VER-FAULT-03: Multi-step finite analysis shall pass only if no one-evaluation trace, initially asserted return, held return, invalid-to-asserted return, competing indication, or reasserted degradation reaches `ClearEpisode`; successful recovery must follow `Latched -> ReturnArmed -> ClearEpisode`.

RISK-04: If controller mode and parking-brake decisions are published independently without conservative composition, consumers can observe brake release in a nonoperating or fault-dominated mode.

FAULT-04: PART-12 and PART-13 shall compose independent brake demand with next mode such that any nonoperating mode or required-apply demand produces `Apply`.

VER-FAULT-04: Reachability and composition analysis shall pass only if no reachable `Off`, `Standby`, `Maintenance`, or `Degraded` frame contains `Release` and no `RequireApply` input to PART-13 is weakened.

## Modes and allowed transitions

MODE-01: `Off` is externally distinguishable by published mode `Off` and parking-brake `Apply`; nominal demand is dormant and no operating disposition exists.

MODE-02: `Standby` is externally distinguishable by published mode `Standby` and parking-brake `Apply`; it records a staged lifecycle episode awaiting a later fresh on indication.

MODE-03: `Operating` is externally distinguishable by published mode `Operating`; it is the only mode in which parking-brake release may be published, subject to independent brake demand.

MODE-04: `Maintenance` is externally distinguishable by published mode `Maintenance` and parking-brake `Apply`; it overrides but may preserve nominal demand while the maintenance session is active.

MODE-05: `Degraded` is externally distinguishable by published mode `Degraded` and parking-brake `Apply`; it remains dominant while the degraded episode is latched or return-armed.

TRANS-01: `Off -> Standby` is triggered by CASE-10 and CASE-28 after a fresh start from dormant demand.

TRANS-02: `Standby -> Operating` is triggered by CASE-11 and CASE-29 after a later fresh on.

TRANS-03: `Operating` or `Standby -> Maintenance` is triggered by maintenance selection and session activation under CASE-13 and CASE-27.

TRANS-04: `Maintenance -> Operating` or `Standby` is triggered only after maintenance clears and a fresh on deactivates the session; preserved demand selects the destination.

TRANS-05: Any mode `-> Off` is triggered by off selection, except degraded episode dominance retains `Degraded` until recovery; off still clears nominal demand and maintenance session.

TRANS-06: Any mode `-> Degraded` is triggered by invalid selection or active degradation latching the episode.

TRANS-07: `Degraded -> Standby` is triggered only by CASE-23 confirmation causing CASE-18 clear, CASE-10 staged demand, and CASE-28 mode selection in the same post-state result.

TRANS-08: `Off`, `Standby`, `Operating`, `Maintenance`, and `Degraded` self-transitions occur whenever their ordered CASE partition retains or re-derives the same effective state.

TRANS-AUDIT-01: No direct `Off -> Operating`, `Degraded -> Operating`, `Degraded -> Off`, maintenance-clear-only exit, or return-to-normal single-step transition is allowed. Every reachable mode transition is covered by TRANS-01 through TRANS-08 and has an explicit trigger.

## Exactly ten scenario families

SCN-01: Nominal lifecycle progression shall cover initial invalid history, observation of all-clear, fresh start, `Off -> Standby`, a held start with no replay, fresh on, and `Standby -> Operating` with `(Operating, Release)`.

SCN-02: Lifecycle ordering and freshness shall cover on before start, initially asserted start/on, held start/on, and `Invalid -> Asserted`, demonstrating that only a later `Clear -> Asserted` edge advances the required nominal sequence.

SCN-03: Priority and conflict shall cover degraded-plus-off, off-plus-maintenance, maintenance-plus-return, return-plus-on, on-plus-start, and invalid-plus-any candidates, demonstrating the complete ordered priority and exact conflict classification.

SCN-04: Maintenance entry and nominal resumption shall cover `Operating -> Maintenance`, maintenance hold, maintenance clear with held on, and a later fresh on returning to the preserved `Operating` demand.

SCN-05: Maintenance interruption shall cover off during maintenance and degraded or invalid input during maintenance, demonstrating session clearing, dormant demand after off, and degraded dominance after fault propagation.

SCN-06: Degraded propagation shall separately inject asserted degradation from every mode and show `Latched`, `Degraded`, `RequireApply`, and `(Degraded, Apply)` in the post-state result.

SCN-07: Invalid-input propagation shall separately inject invalid start, on, off, maintenance, degraded, and return fields, demonstrating `InputInvalid`, `InvalidSelected`, latched degradation, and the degraded frame.

SCN-08: Successful recovery shall cover degradation clear, a later fresh uncontested return, `Latched -> ReturnArmed`, return clear, a quiet confirmation evaluation, `ReturnArmed -> ClearEpisode`, `Degraded -> Standby`, and a later fresh on returning to `Operating` without self-test or fresh start.

SCN-09: Recovery rejection and freshness shall cover initially asserted return, held return, repeated return while armed, same-evaluation return/quiet claim, multi-action conflict, off, maintenance, start, or on during arming, invalidity, and reasserted degradation, demonstrating wait or cancel rather than recovery.

SCN-10: Mode/brake composition shall witness all five modes, both brake-demand values where reachable or directly enumerable, maintenance and degraded overrides of preserved run demand, and the rule that only `(Operating, AllowRelease)` publishes `Release`.

SCN-AUDIT-01: SCN-01 through SCN-10 are exactly ten distinct families: nominal progression, freshness/order rejection, priority conflict, maintenance resumption, maintenance interruption, degraded propagation, invalid propagation, successful recovery, recovery rejection, and cross-mode composition. Their witnesses collectively cover CASE-01 through CASE-30; multiple examples inside a family receive no extra family credit.

## Essential environmental assumptions and constraints

ASM-01: CTX-01 is responsible for supplying one stable `IndicationLevel` value per field per abstract evaluation and for presenting `Clear` before expecting a later assertion to count as fresh. Rationale: the seed provides no request identifiers, pulse protocol, originator, or sampling semantics.

ASM-02: CTX-01 is responsible for marking an indication `Invalid` whenever its current level is untrustworthy. Rationale: explicit validity is a pilot abstraction required to make fault propagation finite and reviewable; it is not source evidence that a production signal uses this status set.

ASM-03: CTX-01 and CTX-02 are responsible for consuming the two-field frame atomically at the abstract evaluation boundary. Rationale: atomic observation defines composition without selecting transport, thread scheduling, or physical timing.

ASM-04: CTX-02 is responsible for acting on the parking-brake request and for any physical achievement monitoring outside this boundary. Rationale: the seed names application but defines neither actuator effects nor completion feedback.

ASM-05: A quiet recovery confirmation is an ordering abstraction, not a time-duration claim. CTX-01 must present valid clear degraded and return indications and no actionable lifecycle/maintenance indication on an evaluation after arming; no milliseconds, deadlines, debounce, or reliability claim is implied.

CONSTR-01: The model shall contain exactly one explicit root system usage, exactly thirteen responsibility-bearing semantic usages corresponding to PART-01 through PART-13, semantic containment depth `1..2` below the root, and one weakly connected semantic region.

CONSTR-02: The model shall realize exactly thirty-five typed directed end-to-end semantic interactions corresponding to INT-01 through INT-35. Tool-required delegation or routing may refine one interaction into concrete hops only when every hop traces to that interaction, derives no local fact, and receives no semantic count.

CONSTR-03: The model shall realize exactly thirty counted nontrivial owner-local cases corresponding to CASE-01 through CASE-30 and exactly ten scenario families corresponding to SCN-01 through SCN-10. It shall not count initialization, type invariants, epoch equations, conflict cardinality, brake/output mappings, duplicated guarantees, or analyzer branches as additional cases.

CONSTR-04: Significant usages, ports, connections, states, decisions, local contracts, analyzer relations, and composition clauses shall trace bidirectionally to this abstract. Any necessary uncounted support element shall carry a specific `@generated-support` rationale and shall own no behavior.

CONSTR-05: The Model Agent shall not add readiness qualification, temperature/health supervision, self-test, start authorization, power enablement or disposition, or a recovery-to-Off-plus-fresh-start policy. Such additions would violate the diversity selection and require Designer revision.

## Bounded analysis and objective pass criteria

ANALYSIS-01: The retained deterministic analyzer shall implement an independent direct oracle over all finite root inputs, owner states, and reachable multi-step traces. It shall compare epoch facts, conflict class, selected indication, each state update, recovery decision, next mode, brake demand, and complete frame against the canonical owner-local contracts.

ANALYSIS-02: The analyzer shall establish mutual exclusivity and exhaustiveness for CASE-01 through CASE-30 over all finite owner inputs and reachable states, report unreachable state tuples rather than using them to hide a missing case, and verify the composition obligation over all ten mode/brake-demand pairs.

ANALYSIS-03: The analyzer shall retain at least one bounded witness per CASE and complete ordered witnesses for SCN-01 through SCN-10, including initialization, held levels, invalid-to-asserted edges, conflicts, fault propagation, cancellation, and quiet-confirmation recovery. Bounded enumeration is conformance evidence, not unbounded proof, execution, physical validation, or certification.

PASS-01: Structural analysis shall report exactly one root, thirteen semantic usages, thirty-five semantic interactions, semantic depth within `1..2`, one weak semantic region, and no usage or interaction without its distinct responsibility or behavioral path.

PASS-02: Ownership inspection shall pass only if every PART implements its stated owner-local derivation, downstream owners consume rather than recompute upstream facts, PART-13's two-input safing composition is non-bijective, and the analyzer independently reproduces rather than replaces canonical contracts.

PASS-03: Contract analysis shall report exactly thirty counted nontrivial cases, mutual exclusivity and total coverage for every stated finite partition, exact priority, initialized state, same-evaluation fault propagation, recovery freshness, composition completeness, and no reachable unconstrained output field.

PASS-04: Scenario evidence shall cover all ten families and every CASE, including fresh nominal sequencing, each priority stratum, maintenance preservation/exit, all-channel invalid propagation, degraded propagation, return arming, quiet confirmation, recovery cancellation, and every mode/brake composition class.

PASS-05: Trace analysis shall find every actionable identifier covered or explicitly deferred, every significant model element traced or specifically justified as generated support, and no unexplained boundary, architecture, owner, state, interaction, case, mode, transition, output, or scenario.

PASS-06: Source verification shall require retained architecture and final Sireum/HAMR typechecking gates, compatible resolved endpoints, the independent harness gate, and the bounded analyzer to pass. A parser, visualization, or bounded witness does not substitute for source verification.

PASS-07: Designer validation shall separately determine that the verified model remains fit for NEED-01, PURP-01, the exact boundary, claim partitions, operating-mode purpose, diversity constraint, priority, fault propagation, recovery, and composition obligations. Mechanical conformance alone is insufficient.

PASS-08: The single native-resolution `system-overview` shall bind to the accepted source revision; visibly distinguish the root, thirteen semantic usages, four monitored inputs, one two-field controlled frame, thirty-five principal directions, and external contexts; and have no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object.

PASS-09: Campaign acceptance shall fail if the exact `13/35/30/10` point changes despite remaining inside `13..16/22..35/21..30/9..12`, or if compliance is achieved through a wrapper, identity owner, duplicate interaction, equivalent case repartition, or scenario elaboration without a distinct trace.

PASS-10: Diversity review shall pass only if the model excludes replicate-1 readiness and thermal-clearance evidence, owns the selected mode/session/episode state, preserves the selected topology and priority, emits only mode/brake outcomes, and implements the fresh-return/quiet-confirmation recovery to `Standby`.

AUDIT-FINAL-01: The retained initial design recount is exactly thirteen semantic usages (PART-01..PART-13), thirty-five semantic interactions (INT-01..INT-35), thirty nontrivial cases (CASE-01..CASE-30), ten scenario families (SCN-01..SCN-10), eight explicit state owners (PART-01, PART-02, PART-03, PART-04, PART-07, PART-08, PART-09, PART-11), at least nine cooperating fact/decision owners before outcome composition, one explicit multi-stratum priority conflict, one root, depth `1..2`, and one weak semantic region.

AUDIT-FINAL-02: Every decision, state, case, boundary field, interaction, priority stratum, fault path, fresh-request path, maintenance path, recovery path, and composition result has an explicit owner. The finite partitions close all values and reachable modes, and no seed limitation is promoted to a physical or production claim.

## Questions preserved for Model review

Q-MODEL-01: Can the accepted GUMBO state semantics express four local previous-level epoch owners plus demand, session, episode, and mode state without downstream recomputation; if not, which exact owner boundary or post-state reference is unrealizable?

Q-MODEL-02: Can CASE-16 fault latching, CASE-21 through CASE-25 recovery decision, CASE-18 episode clearing, CASE-10 restaging, and CASE-28 recovery-to-`Standby` be constrained as one deterministic post-state pipeline without a combinational cycle; if not, what concrete tool timing rule requires Designer resolution?

Q-MODEL-03: Can one explicit root realize thirteen semantic usages and thirty-five end-to-end meanings at depth `1..2`, with profile-required delegation hops explicitly uncredited, while preserving PART-13's two-input composition and exact ownership recount?
