---
abstract_id: SA-VEH-MED-201
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: medium
semantic_usage_count: 8
semantic_interaction_count: 16
nontrivial_contract_case_count: 20
scenario_family_count: 8
containment_depth: [2, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
---

# Vehicle Controller Operating-Mode Coordinator

## Evidence and claim partition

METH-01: Handbook-derived methodology requires the need and context to precede decomposition, an explicit monitored and controlled boundary, cohesive responsibility allocation, nominal and off-nominal scenarios, recorded assumptions and alternatives, bidirectional trace coverage, objective pass criteria, and separate verification and validation. These are method obligations, not vehicle facts.

SRC-01: The frozen seed supports a Vehicle and embedded VehicleController context; start, on, off, maintenance, degraded, return-to-normal, parking-brake, and controller-mode vocabulary. It does not establish a complete protocol, indication authority, sequencing, priority, fault handling, recovery, or action-completion meaning.

SRC-02: The source names temperature, self-test, electrical power, fuel, road, and drivetrain concepts, but none is required by this selected scope. The empty state and action definitions do not support claims about physical actuation, dynamics, readiness, health clearance, power enablement, safety, reliability, or production behavior.

ABS-01: This pilot introduces a finite abstraction in which persistent indication levels are converted to fresh events, competing lifecycle and service intents are arbitrated, mode-applicable transitions are qualified, a distinct state owner applies each qualified directive, an interrupted logical mode is remembered across degradation, and mode plus coordination outcomes are published. The exact types, priority, transition, freshness, parking-brake, and recovery policies are Designer-owned assumptions beyond the seed.

SEL-01: The approved architecture is the eight-usage allocation in PART-01 through PART-08 and the sixteen-flow inventory in INT-01 through INT-16, revised after Model review so PART-06 owns transition qualification and PART-07 owns state-dependent transition application and mode retention. It is a selected pilot architecture, not a source-grounded decomposition or handbook fact.

DEF-01: Temperature and health supervision, start readiness, self-test qualification, power enablement, fuel command, physical parking-brake effectiveness, plant dynamics, quantitative timing, generated application code, execution, formal proof beyond retained contracts and bounded analysis, reliability, certification, and hazard likelihood or severity are deferred and shall remain out of scope or reported `not-run`.

## Need, purpose, goals, and operational context

NEED-01: A vehicle control environment needs one bounded coordinator to turn potentially simultaneous start, on, off, maintenance, degraded, and return-to-normal indications into an unambiguous controller operating-mode disposition without allowing held indications or inapplicable transitions to masquerade as new commands.

PURP-01: The system will coordinate the logical operating mode of one VehicleController and publish the associated parking-brake coordination and diagnostic outcome. It will not determine whether a vehicle is ready to start, clear temperature or health evidence, enable electrical power, perform self-test, or claim that commanded physical effects occurred.

GOAL-01: The system shall publish exactly one of `Off`, `Starting`, `On`, `Maintenance`, or `Degraded` on every abstract evaluation and shall admit `Off -> Starting -> On` only through distinct fresh start and fresh on indications.

GOAL-02: The system shall resolve every simultaneous-intent conflict with the declared priority `OFF > invalid condition > degraded condition > MAINTENANCE > RETURN > ON > START > HOLD` and shall expose either suppression of a lower-priority intent or an incompatible persistent source-level combination.

GOAL-03: The system shall enter `Degraded` on current invalid or degraded condition evidence unless level-sensitive off wins, remember the interrupted logical mode, and resume that stored mode only after condition evidence is current-normal and a fresh return-to-normal indication is selected.

GOAL-04: The system shall reject state-inapplicable start, on, maintenance, and return intents without silently changing the controlled mode and shall publish an observable rejection status.

CTX-01: The Vehicle Indication Source is an abstract external originator of start, on, and off levels. The seed does not identify the human or automated authority, so this actor and its responsibility for deliberate levels are pilot assumptions.

CTX-02: The Service Indication Source is an abstract external originator of maintenance and return-to-normal levels. It does not perform maintenance or prove restoration; it supplies requests only.

CTX-03: The Controller Condition Source is external and reports a finite condition plus whether that report is current. The system does not sense temperature, execute self-test, locate a fault, or establish physical health.

CTX-04: The VehicleController Mode Consumer receives the selected logical mode disposition and may use it outside this boundary. No downstream implementation or acknowledgement is modeled.

CTX-05: The Parking-Brake and Status Consumers receive the coordination outcome. `Apply` and `Release` are supervisory dispositions only; physical brake motion, effectiveness, and feedback remain outside the boundary.

CTX-06: The Road, drivetrain, electrical-power network, fuel system, temperature sensing, and maintenance execution remain external context and exchange no modeled quantity with this selected boundary.

## Exact finite monitored and controlled boundary

TYPE-01: `Bool = {false, true}`. `LifecycleLevels = (start: Bool, on: Bool, off: Bool)` admits all eight combinations; levels may persist across evaluations, and only PART-01 derives their fresh events.

TYPE-02: `ServiceLevels = (maintenance: Bool, returnNormal: Bool)` admits all four combinations; levels may persist, and only PART-02 derives their fresh events.

TYPE-03: `ReportedCondition = {Normal, Degraded, Invalid}` and `ReportCurrency = {Current, Stale}`. `ConditionEvidence` is their six-value Cartesian product; `Invalid` is a source-reported invalid value, while `Stale` is a separate currency failure.

TYPE-04: `ConditionAssessment = {CurrentNormal, CurrentDegraded, Unusable}`. PART-03 shall derive `Unusable` for every stale report or a current `Invalid`, `CurrentDegraded` only for current `Degraded`, and `CurrentNormal` only for current `Normal`.

TYPE-05: `ControllerMode = {Off, Starting, On, Maintenance, Degraded}` and `RecoveryTarget = {Off, Starting, On}`. Maintenance is never a recovery target; degradation entered from maintenance records `Off`.

TYPE-06: `ParkingBrakeDisposition = {Apply, Release}` and `CoordinationStatus = {IdleOff, StartingSequence, Operating, MaintenanceHandoff, DegradedCondition, DegradedInvalid, RecoveryResumed, ShutdownDominant, RequestConflict, RequestInapplicable}`. `CoordinationOutcome` is their finite product.

TYPE-07: `SelectedIntent = {SelectOff, SelectInvalidDegraded, SelectConditionDegraded, SelectMaintenance, SelectReturn, SelectOn, SelectStart, SelectHold}`. `QualifiedTransition = {QualifiedStay, QualifiedGoOff, QualifiedGoStarting, QualifiedGoOn, QualifiedGoMaintenance, QualifiedGoDegraded, QualifiedResumeStored, QualifiedReject}` is PART-06's finite directive. `TransitionKind = {Stay, GoOff, GoStarting, GoOn, GoMaintenance, GoDegraded, ResumeStored, Reject}` and `TransitionResolution = (nextMode: ControllerMode, kind: TransitionKind, accepted: Bool)` are PART-07's applied result.

MON-01: The system shall monitor `lifecycle_levels: LifecycleLevels` from CTX-01 on each evaluation; PART-01 is the sole owner of lifecycle rising-edge recognition and lifecycle-level conflict classification.

MON-02: The system shall monitor `service_levels: ServiceLevels` from CTX-02 on each evaluation; PART-02 is the sole owner of service rising-edge recognition and service-level conflict classification.

MON-03: The system shall monitor `condition_evidence: ConditionEvidence` from CTX-03 on each evaluation; PART-03 is the sole owner of the currency-sensitive condition assessment.

CTRL-01: The system shall control exactly one `controller_mode: ControllerMode` delivered to CTX-04. It is PART-07's applied next mode for the current abstract evaluation, not a claim about physical vehicle state.

CTRL-02: The system shall control exactly one `coordination_outcome: CoordinationOutcome` delivered to CTX-05. Its parking-brake and status fields are derived together from the selected intent and applied transition result.

BOUND-01: MON-01 through MON-03 and CTRL-01 through CTRL-02 are the complete modeled root boundary. No brake-pedal evidence, temperature, maintenance-due evidence, self-test result, electrical-power evidence, start permit, power disposition, fuel command, actuator feedback, clock, or additional command authority may be added without a revised abstract.

## Selected semantic usages, local ownership, and state

PART-01: Lifecycle Event Owner shall retain the previous three lifecycle levels, derive `freshStart = start and not previousStart` and `freshOn = on and not previousOn`, preserve level-sensitive `offActive = off`, and derive `lifecycleConflict` when at least two lifecycle levels are simultaneously true. It produces temporal facts, not renamed inputs.

PART-02: Service Event Owner shall retain the previous two service levels, derive `freshMaintenance = maintenance and not previousMaintenance` and `freshReturn = returnNormal and not previousReturn`, and derive `serviceConflict` when both service levels are true. It produces temporal facts, not renamed inputs.

PART-03: Condition Assessment Owner shall combine reported condition and currency under TYPE-04 and derive one reviewable assessment. The two independent evidence fields and unusable-over-degraded priority make this a qualification, not a bijective translation.

PART-04: Intent Arbitration Owner shall combine the lifecycle events, service events, source-owner conflict facts, and condition assessment to derive one `SelectedIntent`, a `priorityConflict` fact whenever two or more non-hold candidates coexist or a source owner reports incompatible persistent levels, and the identity of the winning priority class under CASE-01 through CASE-08. It shall not inspect mode state or admit transitions.

PART-05: Recovery Target Owner shall retain exactly one `RecoveryTarget`, capture the logical mode interrupted by a newly applied degradation, preserve it while degradation continues, publish its pre-update value for transition application, and reset it after leaving `Degraded`. It shall not select requests, qualify directives, apply transitions, or own current mode.

PART-06: Transition Qualification Owner shall combine PART-04's selected intent and PART-07's pre-evaluation current mode to derive exactly one `QualifiedTransition` under CASE-09 through CASE-20. It owns the exhaustive intent/mode applicability classification but shall not inspect `RecoveryTarget`, choose a concrete resume mode, retain mode state, or recompute freshness, condition assessment, or arbitration.

PART-07: Mode Transition Application Owner shall retain exactly one `ControllerMode`, initialize it to `Off`, and combine its pre-evaluation current mode, PART-06's `QualifiedTransition`, and PART-05's pre-update `RecoveryTarget` to derive exactly one `TransitionResolution`. It shall choose the current mode for stay or reject, the stored target for resume, and the directive's constant mode for each go directive, then commit `controllerMode = nextMode`. This state-dependent total relation and sole mode commit are its owner-local facts; a tool-level state projection receives no independent credit.

PART-08: Coordination Publication Owner shall combine PART-04's arbitration result and PART-07's applied transition resolution to derive the ordered diagnostic status and parking-brake disposition in POL-05 through POL-07. Its owner-local fact is the conflict/rejection/recovery diagnostic precedence; it shall not receive semantic credit merely for packaging the two output fields.

STATE-01: PART-01 shall initialize all previous lifecycle levels to `false`, derive fresh events from current versus previous values, publish those facts, and then store all current levels. A held start or on level is not fresh; off remains active on every asserted evaluation.

STATE-02: PART-02 shall initialize both previous service levels to `false`, derive fresh events from current versus previous values, publish those facts, and then store both current levels. Held maintenance or return levels are not fresh and must fall through to lower-priority candidates or hold.

STATE-03: PART-05 shall initialize `RecoveryTarget` to `Off` and publish `In(recoveryTarget)` before its update. When PART-07 newly applies a transition from a non-degraded current mode to `Degraded`, PART-05 shall capture `Starting` or `On` unchanged and map interrupted `Off` or `Maintenance` to `Off`; while current and next modes are both `Degraded` it shall preserve the target; when current is `Degraded` and next mode is not, it shall reset the target to `Off` after its pre-update value has served that evaluation; otherwise it shall preserve its value.

STATE-04: PART-07 shall initialize `ControllerMode` to `Off`, publish `In(controllerMode)` to PART-05 and PART-06, derive one applied resolution from that pre-state, the pre-update recovery target, and the current directive, publish the resolution and next mode, and only then constrain its post-state to the derived next mode. This is a logical data-dependency convention, not a physical scheduling or latency claim.

OWN-AUDIT-01: PART-01 and PART-02 own distinct temporal event facts, PART-03 owns evidence qualification, PART-04 owns cross-domain priority, PART-05 owns interruption memory, PART-06 owns transition applicability directives, PART-07 owns state-dependent application plus mode retention, and PART-08 owns diagnostic and output coherence. Every usage derives or retains a behaviorally meaningful local fact; none exists only to copy, bundle, rename, route, or bijectively translate.

OWN-AUDIT-02: The cooperating decision chain is PART-01 through PART-03 into PART-04, then PART-04 plus PART-07 pre-state into PART-06, and PART-06 plus PART-05 recovery memory and PART-07 pre-state into PART-07's application relation. PART-04, PART-06, and PART-07 own distinct arbitration, qualification, and application decisions.

## Complete typed directed semantic interaction inventory

INT-01: Root/MON-01 shall provide `LifecycleLevels` to PART-01 for fresh-event and lifecycle-conflict derivation.

INT-02: Root/MON-02 shall provide `ServiceLevels` to PART-02 for fresh-event and service-conflict derivation.

INT-03: Root/MON-03 shall provide `ConditionEvidence` to PART-03 for currency-sensitive qualification.

INT-04: PART-01 shall provide its lifecycle event facts and conflict fact to PART-04 for intent arbitration.

INT-05: PART-02 shall provide its service event facts and conflict fact to PART-04 for intent arbitration.

INT-06: PART-03 shall provide `ConditionAssessment` to PART-04 for condition-priority arbitration.

INT-07: PART-04 shall provide `SelectedIntent`, winner class, and conflict facts to PART-06 for applicability qualification.

INT-08: PART-07 shall provide the pre-evaluation `ControllerMode` to PART-06 for state-dependent transition qualification.

INT-09: PART-05 shall provide the pre-update stored `RecoveryTarget` to PART-07 for state-dependent transition application.

INT-10: PART-06 shall provide `QualifiedTransition` to PART-07 for transition application and the sole mode-state update.

INT-11: PART-07 shall provide the pre-evaluation `ControllerMode` to PART-05 so a newly interrupted logical mode can be captured without reconstruction.

INT-12: PART-07 shall provide the applied `TransitionResolution` to PART-05 so entry to and exit from degradation update recovery memory exactly once.

INT-13: PART-07 shall provide the applied `TransitionResolution` to PART-08 for accepted, rejected, resumed, and next-mode outcome derivation.

INT-14: PART-04 shall provide the selected priority class and conflict facts to PART-08 for diagnostic precedence without raw-input recomputation.

INT-15: PART-07 shall provide applied `nextMode` to Root/CTRL-01 for delivery to CTX-04.

INT-16: PART-08 shall provide `CoordinationOutcome` to Root/CTRL-02 for delivery to CTX-05.

INT-AUDIT-01: INT-01 through INT-16 are exactly sixteen typed directed semantic interactions: three boundary observations, eleven inter-owner fact/state/directive flows, and two boundary outcomes. Any tool-required delegation hop shall refine one of these meanings and receive no additional semantic credit.

INT-AUDIT-02: Every PART usage participates in a derivation-producing incoming flow and a boundary-relevant outgoing path. The sixteen interactions form one weakly connected semantic region; the PART-05/PART-06/PART-07 feedback is ordered pre-state, qualification, application, then state commit, not duplicated combinational policy or an algebraic cycle.

## Priority, qualification, application, recovery, and output policy

POL-01: PART-04 shall use the total ordered priority `offActive > Unusable > CurrentDegraded > freshMaintenance > freshReturn > freshOn > freshStart > hold`. The explicit conflict includes simultaneous off and any lower request, simultaneous maintenance and return, and simultaneous fresh on and fresh start.

POL-02: `lifecycleConflict`, `serviceConflict`, or coexistence of any two candidates in POL-01 shall set `priorityConflict`; the selected intent still follows POL-01. Persistent nonfresh levels may remain visible in the source-owner conflict facts but cannot create a fresh candidate.

POL-03: PART-06 shall apply CASE-09 through CASE-20 only to PART-04's selected intent and PART-07's pre-evaluation mode, producing a directive rather than a concrete next mode. A losing fresh event is consumed because its event owner records the current level after that evaluation; it cannot reappear until the external level becomes false and rises again.

POL-04: Recovery from `Degraded` shall require `CurrentNormal` implicitly because any `Unusable` or `CurrentDegraded` assessment outranks return in PART-04, plus a fresh selected return. PART-06 shall qualify that combination as `QualifiedResumeStored`; PART-07 shall apply PART-05's pre-update target to resume `Starting`, `On`, or `Off` directly. Recovery does not require a later fresh start and does not claim physical restart or readiness.

POL-05: PART-08 shall derive `ParkingBrakeDisposition = Release` exactly when PART-07's applied next mode is `On`; it shall derive `Apply` in `Off`, `Starting`, `Maintenance`, and `Degraded`. This is a coordination policy only, with no assertion of physical effectiveness.

POL-06: PART-08 shall derive `CoordinationStatus` in this ordered diagnostic precedence: `ShutdownDominant` when `SelectOff` wins a priority conflict; `RequestInapplicable` when applied transition kind is `Reject`; `RecoveryResumed` when applied transition kind is `ResumeStored`; `DegradedInvalid` for `SelectInvalidDegraded`; `DegradedCondition` for `SelectConditionDegraded`; `RequestConflict` for any remaining priority conflict; otherwise `IdleOff`, `StartingSequence`, `Operating`, `MaintenanceHandoff`, or `DegradedCondition` according to applied next mode.

POL-07: On initialization, CTRL-01 shall be `Off` and CTRL-02 shall be `(Apply, IdleOff)`. On every evaluation, both outputs shall correspond to PART-07's one applied `TransitionResolution`; `Release` shall be equivalent to `controller_mode = On`.

POL-08: Qualification mappings, directive-application mappings, rising-edge equations, state initialization and update equations, conflict equations, output equations, and invariants are mandatory contracts but are not counted among the twenty nontrivial contract cases.

APPLY-01: PART-07 shall map `QualifiedStay` to `(currentMode, Stay, true)` and `QualifiedReject` to `(currentMode, Reject, false)` for every current mode and recovery target.

APPLY-02: PART-07 shall map `QualifiedResumeStored` to `(recoveryTarget, ResumeStored, true)` and shall map `QualifiedGoOff`, `QualifiedGoStarting`, `QualifiedGoOn`, `QualifiedGoMaintenance`, and `QualifiedGoDegraded` to their named constant modes, matching transition kinds, and `accepted = true` for every current mode and recovery target.

APPLY-03: The composed PART-06-to-PART-07 relation shall be extensionally identical to the initial CASE-09 through CASE-20 transition triples. In particular, CASE-13 applies the stored `Off`, `Starting`, or `On`; CASE-15, CASE-17, and CASE-19 preserve current mode with rejection; and CASE-20 preserves current mode with accepted hold.

## Observable modes and allowed transitions

MODE-01: `Off` publishes controller mode `Off`, commands parking-brake `Apply`, and accepts only a selected fresh start as progress toward operation; it is externally distinct as `IdleOff` unless a higher diagnostic status applies.

MODE-02: `Starting` publishes controller mode `Starting`, commands parking-brake `Apply`, and accepts only a selected fresh on indication as progress to `On`; it is externally distinct as `StartingSequence` unless a higher diagnostic status applies.

MODE-03: `On` publishes controller mode `On`, uniquely commands parking-brake `Release`, and remains operating on hold; it is externally distinct as `Operating` unless a higher diagnostic status applies.

MODE-04: `Maintenance` publishes controller mode `Maintenance`, commands parking-brake `Apply`, rejects start and on as inapplicable, and uses a selected fresh return to leave for `Off`; it is externally distinct as `MaintenanceHandoff` unless a higher diagnostic status applies.

MODE-05: `Degraded` publishes controller mode `Degraded`, commands parking-brake `Apply`, rejects maintenance, start, and on as inapplicable, and uses only a selected fresh return under current-normal evidence to resume the stored target; invalid or degraded evidence prevents return from being selected.

TRANS-01: The nominal operating sequence is `Off -> Starting` only through CASE-18 and APPLY-02 and `Starting -> On` only through CASE-16 and APPLY-02; the two triggers must occur as distinct fresh events.

TRANS-02: Every mode may transition or self-transition to `Off` through CASE-09 and every mode may transition or self-transition to `Degraded` through CASE-10, with off winning a simultaneous condition conflict.

TRANS-03: Every non-degraded mode may transition or self-transition to `Maintenance` through CASE-11, while `Maintenance -> Off` occurs only through CASE-14; a maintenance request in `Degraded` is rejected through CASE-12.

TRANS-04: `Degraded -> Off`, `Degraded -> Starting`, or `Degraded -> On` occurs only through CASE-13 and PART-07's application of PART-05's stored target; maintenance is not a recovery target.

TRANS-05: CASE-15, CASE-17, and CASE-19 qualify rejected self-transitions, while CASE-20 qualifies the accepted hold self-transition in every mode. No other transition is allowed.

## Exactly twenty ordered nontrivial contract cases

CASE-01: PART-04, when `offActive` is true, shall derive `SelectOff` regardless of condition or fresh requests.

CASE-02: PART-04, when off is inactive and condition assessment is `Unusable`, shall derive `SelectInvalidDegraded` regardless of fresh requests.

CASE-03: PART-04, when off is inactive and condition assessment is `CurrentDegraded`, shall derive `SelectConditionDegraded` regardless of fresh requests.

CASE-04: PART-04, when off is inactive, condition is `CurrentNormal`, and `freshMaintenance` is true, shall derive `SelectMaintenance` regardless of return, on, or start freshness.

CASE-05: PART-04, when the predicates of CASE-01 through CASE-04 are false and `freshReturn` is true, shall derive `SelectReturn` regardless of fresh on or start.

CASE-06: PART-04, when the predicates of CASE-01 through CASE-05 are false and `freshOn` is true, shall derive `SelectOn` regardless of fresh start.

CASE-07: PART-04, when the predicates of CASE-01 through CASE-06 are false and `freshStart` is true, shall derive `SelectStart`.

CASE-08: PART-04, when no predicate in CASE-01 through CASE-07 holds, shall derive `SelectHold`.

CASE-09: PART-06, when selected intent is `SelectOff`, shall derive `QualifiedGoOff` from every current mode; PART-07 shall apply `(Off, GoOff, true)`.

CASE-10: PART-06, when selected intent is `SelectInvalidDegraded` or `SelectConditionDegraded`, shall derive `QualifiedGoDegraded` from every current mode; PART-07 shall apply `(Degraded, GoDegraded, true)`, and PART-05 separately distinguishes new entry from continued degradation for target capture.

CASE-11: PART-06, when selected intent is `SelectMaintenance` and current mode is not `Degraded`, shall derive `QualifiedGoMaintenance`; PART-07 shall apply `(Maintenance, GoMaintenance, true)`.

CASE-12: PART-06, when selected intent is `SelectMaintenance` and current mode is `Degraded`, shall derive `QualifiedReject`; PART-07 shall apply `(Degraded, Reject, false)` so a maintenance request cannot bypass degraded recovery.

CASE-13: PART-06, when selected intent is `SelectReturn` and current mode is `Degraded`, shall derive `QualifiedResumeStored`; PART-07 shall apply `(stored RecoveryTarget, ResumeStored, true)`.

CASE-14: PART-06, when selected intent is `SelectReturn` and current mode is `Maintenance`, shall derive `QualifiedGoOff`; PART-07 shall apply `(Off, GoOff, true)`, so leaving maintenance never resumes a prior operating mode.

CASE-15: PART-06, when selected intent is `SelectReturn` and current mode is `Off`, `Starting`, or `On`, shall derive `QualifiedReject`; PART-07 shall preserve current mode and apply `(current, Reject, false)`.

CASE-16: PART-06, when selected intent is `SelectOn` and current mode is `Starting`, shall derive `QualifiedGoOn`; PART-07 shall apply `(On, GoOn, true)`.

CASE-17: PART-06, when selected intent is `SelectOn` and current mode is not `Starting`, shall derive `QualifiedReject`; PART-07 shall preserve current mode and apply `(current, Reject, false)`.

CASE-18: PART-06, when selected intent is `SelectStart` and current mode is `Off`, shall derive `QualifiedGoStarting`; PART-07 shall apply `(Starting, GoStarting, true)`.

CASE-19: PART-06, when selected intent is `SelectStart` and current mode is not `Off`, shall derive `QualifiedReject`; PART-07 shall preserve current mode and apply `(current, Reject, false)`.

CASE-20: PART-06, when selected intent is `SelectHold`, shall derive `QualifiedStay`; PART-07 shall preserve current mode and apply `(current, Stay, true)`.

CASE-AUDIT-01: CASE-01 through CASE-08 are a total, mutually exclusive, priority-ordered partition over the finite lifecycle events, service events, and condition assessment. They explicitly cover all fresh-request combinations, held nonfresh levels, level-sensitive off, current-normal, current-degraded, unusable evidence, and no-request hold.

CASE-AUDIT-02: CASE-09 through CASE-20 are a total, mutually exclusive partition over all eight selected intents and all five current modes. Return is partitioned across degraded recovery, maintenance exit, and three inapplicable modes; on and start each partition their sole applicable mode from all others; degraded, off, and hold cover every mode.

CASE-AUDIT-03: Together CASE-01 through CASE-20 are exactly twenty nontrivial owner-local cases, credited only to PART-04 and PART-06. PART-07's mandatory total application relation, mappings, initialization, state updates, invariants, output rules, scenario witnesses, and analyzer oracle receive no case credit.

## Local-contract expectations and bounded analysis

LCON-01: PART-01's local contracts shall cover all `8 current x 8 previous = 64` lifecycle tuples and derive two rising edges, level-sensitive off, and lifecycle conflict; PART-02's shall cover all `4 current x 4 previous = 16` service tuples and derive two rising edges plus service conflict.

LCON-02: PART-03's local contracts shall cover all six condition/currency values with assessment fibers `CurrentNormal/CurrentDegraded/Unusable = 1/1/4`; PART-04's eight ordered cases shall be total and mutually exclusive and shall derive conflict independently of the winning intent.

LCON-03: PART-05's local contracts shall capture, map, preserve, or reset recovery memory from pre-mode and PART-07's applied resolution without reproducing qualification; PART-06's local contracts shall directly cover all `8 intents x 5 modes = 40` applicability pairs.

LCON-04: PART-07's local contracts shall directly cover all `5 current modes x 3 recovery targets x 8 directives = 120` application tuples, derive one resolution, and commit the same next mode; PART-08's shall derive status precedence and the many-to-one parking-brake policy from arbitration and applied-resolution facts without raw-input or transition-policy recomputation.

ANALYSIS-01: The bounded analyzer shall exhaust the complete raw single-evaluation product `8 lifecycle x 4 service x 6 condition x 8 previous-lifecycle x 4 previous-service x 3 recovery-target x 5 mode = 92,160` valuations and establish reachable-state closure under the state-update rules.

ANALYSIS-02: The analyzer shall execute, not merely list, each owner-local relation; report matching ownership records; witness every CASE-01 through CASE-20 and SCN-01 through SCN-08; check gaps, overlaps, mismatches, output coherence, and required multi-step freshness/recovery traces; and compare the composed end-to-end behavior with an independent oracle that does not duplicate or replace forwarding logic.

ANALYSIS-03: Analyzer acceptance requires `status=passed`, every owner check passed, zero gaps, overlaps, or mismatches, exact metric agreement, and completion within the retained 180-second watchdog. The analyzer may compare the PART-06/PART-07 composition to the independent oracle but shall not receive semantic-owner or contract-case credit.

## Required behavior, risks, faults, and objective evidence

BEH-01: The system shall follow CASE-07 and CASE-18 for a fresh start from `Off`, remain `Starting` through CASE-20 while no winning intent exists, and follow CASE-06 and CASE-16 only on a later fresh on indication.

VER-BEH-01: Contract inspection and bounded multi-step analysis shall pass only if no trace reaches `On` from `Off` without an accepted fresh start followed in a later evaluation by an accepted fresh on, including traces with held start or on levels.

BEH-02: The system shall follow CASE-04 and CASE-11 to enter `Maintenance` from any non-degraded mode and CASE-05 plus CASE-14 to leave maintenance for `Off`; maintenance shall never be a degraded recovery target.

VER-BEH-02: Exhaustive finite analysis shall pass only if maintenance entry and exit match those cases, `RecoveryTarget` is never `Maintenance`, and a fresh return in `Maintenance` cannot produce `Starting` or `On`.

BEH-03: The system shall follow CASE-10 to enter degradation, STATE-03 to capture the interrupted logical mode, CASE-20 to remain degraded without a winning fresh return, and CASE-13 to resume only when a fresh return wins under current-normal evidence.

VER-BEH-03: State-sequence analysis shall pass only if degraded traces resume exactly the stored `Off`, `Starting`, or `On` target; held return, stale evidence, current degraded evidence, fresh maintenance, and a simultaneous higher-priority off cannot resume the target.

BEH-04: The system shall publish CTRL-01 and CTRL-02 from PART-07's one applied transition resolution and preserve the equivalence `Release if and only if controller_mode = On`.

VER-BEH-04: Exhaustive output analysis shall pass only if every reachable state/input valuation produces one defined mode and outcome, follows the status precedence in POL-06, and satisfies the parking-brake equivalence without a mixed result.

RISK-01: If stale or invalid condition evidence is treated as current-normal, the coordinator can retain or resume an operating mode without usable evidence under this pilot policy.

FAULT-01: CASE-02 and CASE-10 shall force `Degraded` for unusable evidence whenever off is inactive, and CASE-13 shall be unreachable until PART-03 reports `CurrentNormal` and a fresh return wins.

VER-FAULT-01: Exhaustive six-value condition analysis and multi-step recovery analysis shall pass only if every stale valuation and current `Invalid` valuation produces the specified degraded response and cannot satisfy recovery.

RISK-02: If simultaneous requests are resolved inconsistently, a lower-priority transition can replace shutdown, service handoff, or recovery intent.

FAULT-02: CASE-01 through CASE-08 shall implement the single priority in POL-01, and PART-08 shall expose suppression through `ShutdownDominant` or `RequestConflict`.

VER-FAULT-02: Exhaustive analysis over all lifecycle and service level combinations and all condition assessments shall pass only if exactly one arbitration case matches, its selected intent equals POL-01, and every multiple-candidate valuation sets `priorityConflict`.

RISK-03: If a held start, on, maintenance, or return level is repeatedly treated as fresh, the mode can transition without a new indication episode.

FAULT-03: PART-01 and PART-02 shall enforce STATE-01 and STATE-02, and a losing fresh event shall require a false level followed by a later rise before it can be selected again.

VER-FAULT-03: Multi-step trace analysis shall pass only if held levels cannot repeat an event, losing events are consumed, and every later accepted event is preceded by an observed low-to-high transition after the prior evaluation.

RISK-04: If state applicability or directive application is omitted, fresh on, start, maintenance, or return indications can jump to an unsupported mode or bypass degraded recovery.

FAULT-04: CASE-11 through CASE-20 and APPLY-01 through APPLY-03 shall admit only the defined transitions and shall apply `Reject` with current mode unchanged for every inapplicable selected intent.

VER-FAULT-04: Exhaustive intent-by-mode qualification and application analysis shall pass only if all forty PART-06 pairs match exactly one case, all 120 PART-07 tuples match exactly one application result, every accepted directive has the specified next mode, and every rejected directive preserves current mode and yields `RequestInapplicable`.

## Exactly eight bounded scenario families

SCN-01: Nominal lifecycle sequence starts from initialized `Off` with current-normal evidence and all request levels false; one fresh start produces `Starting`, a held start produces `Starting` with no new event, and after start falls, one fresh on produces `On` with `(Release, Operating)`. Pass when the three observed modes are exactly `Starting`, `Starting`, and `On` and no earlier output releases the brake.

SCN-02: Lifecycle priority conflict starts in `Off`; start and on rise together under current-normal evidence. `SelectOn` wins, CASE-17 rejects it as inapplicable, and mode remains `Off`; the simultaneous start is consumed. Pass when status is `RequestInapplicable`, no subsequent held level starts the sequence, and a later low-to-high start is required.

SCN-03: Shutdown dominance starts in `On`; off is asserted while maintenance and return rise and condition is degraded. CASE-01 and CASE-09 produce `Off` and `(Apply, ShutdownDominant)`. Pass when no degraded, maintenance, return, or operating outcome wins that evaluation.

SCN-04: Degraded interruption and direct logical recovery starts in `On`; current-degraded evidence produces `Degraded` and captures target `On`. A held return under degraded evidence does not recover; after return falls, evidence becomes current-normal and a fresh return resumes `On`. Pass when the sequence is exactly `Degraded`, `Degraded`, `On` and final status is `RecoveryResumed` without a new start.

SCN-05: Invalid-evidence recovery blocking starts in `Starting`; stale-normal evidence produces `Degraded` and captures `Starting`. Fresh return while evidence remains stale is suppressed, and a held return after evidence becomes current-normal is not fresh. Pass when mode remains `Degraded` until return falls and rises again under current-normal evidence, then resumes `Starting`.

SCN-06: Maintenance handoff starts in `On`; a fresh maintenance request under current-normal evidence produces `Maintenance` and `(Apply, MaintenanceHandoff)`. A later fresh return produces `Off`, not `On`. Pass when leaving maintenance does not use or create an operating recovery target.

SCN-07: Degraded maintenance rejection starts in `Degraded` with stored target `On` and current-normal evidence; a fresh maintenance request selects maintenance but CASE-12 rejects it. Pass when mode remains `Degraded`, status is `RequestInapplicable`, target remains `On`, and a later fresh return can still resume `On`.

SCN-08: Off-state inapplicable and hold behavior starts in initialized `Off`; a fresh return is rejected, then held return and no other candidates select hold, then a fresh start is accepted after return and start were low. Pass when the observed sequence is `Off`, `Off`, `Starting` with statuses `RequestInapplicable`, `IdleOff`, and `StartingSequence`.

SCN-AUDIT-01: SCN-01 through SCN-08 are exactly eight distinct families: nominal two-step lifecycle, lifecycle collision, shutdown dominance, degraded resume, invalid/stale recovery blocking, maintenance handoff, degraded maintenance rejection, and inapplicable/hold freshness. No family is a renamed input valuation of another.

## Structural, generated-support, trace, verification, and validation acceptance

STRUCT-01: The realization shall contain exactly one explicit root `System` usage, exactly eight reachable responsibility-bearing semantic `Thread` usages tracing PART-01 through PART-08, semantic containment depth exactly two from root through support Process to Threads, and exactly one weakly connected semantic region.

STRUCT-02: The realization shall contain exactly sixteen semantic directed interactions tracing INT-01 through INT-16 and exactly twenty nontrivial owner-local contract cases tracing CASE-01 through CASE-20, with the cases credited only to PART-04 and PART-06.

STRUCT-03: The realization shall contain exactly eight bounded scenario witnesses tracing SCN-01 through SCN-08. Mandatory initialization, equations, mappings, application relation, invariants, state updates, and output consistency remain uncounted.

SUPPORT-01: Generated support is allowed only as one behavior-free `Process` inside the root, containing the eight contract-bearing Threads, plus five root/Process delegation routes refining the three root inputs and two root outputs. This yields one uncredited support usage, nine non-root source usages, and exactly twenty-one raw `PortConnection` declarations for sixteen semantic connections plus five support routes.

SUPPORT-02: Every support route shall refine one existing INT meaning, carry its refined trace and a specific `@generated-support` rationale, and receive no semantic-usage, semantic-interaction, owner, case, or scenario credit. Every record field inspected by GUMBO shall be an `attribute` member. No other support topology is preauthorized.

TRACE-01: Every actionable abstract identifier shall trace to one or more model elements, contract clauses, analyzer checks, or scenario witnesses, or be explicitly marked informational or deferred. Every significant model element shall trace back or carry a specific `@generated-support` rationale; missing parents and unexplained children fail acceptance.

VERIFY-01: Mechanical verification shall pass only if retained architecture-stage and final Sireum/HAMR type checks pass, endpoints and types resolve, the bounded analyzer satisfies ANALYSIS-01 through ANALYSIS-03, exact counts pass, owner-local contracts agree with the analyzer, and trace coverage is complete.

VALID-01: Designer validation shall separately pass only if the realized model still coordinates operating modes rather than start readiness, health, temperature, or power enablement; preserves the exact boundary, ownership, priority, qualification, application, state, recovery, output, and scenario meanings; and makes no deferred physical or safety claim.

METRIC-01: The approved final architecture point is exactly `8 semantic usages / 16 semantic interactions / 20 nontrivial contract cases / 8 scenario families`, with one root, one uncredited support Process, eight semantic Threads, depth two, one weak semantic region, five uncredited delegation routes, and twenty-one raw port connections.

PASS-01: The approved baseline authorizes Model generation only against this revision. A later tool limitation or negative realizability finding shall return as a localized repair request in this immutable run rather than trigger silent redesign, owner padding, policy weakening, or replacement of the seed.

## Assumptions, source limitations, and resolved Model questions

ASM-01: CTX-01 is responsible for stable Boolean lifecycle levels during each abstract evaluation and for lowering a level before expecting another fresh event. Rationale: the source does not define event encoding, so level plus rising-edge semantics make freshness finite and reviewable.

ASM-02: CTX-02 is responsible for stable Boolean service levels during each evaluation and for lowering them before a new service event. Rationale: this prevents a held return or maintenance request from acting as an implicit repeated command.

ASM-03: CTX-03 is responsible for the truth of the reported finite condition and its currency flag for the current evaluation. Rationale: the selected coordinator consumes an abstraction and does not own sensing, diagnosis, thresholding, or maintenance proof.

ASM-04: CTX-04 and CTX-05 interpret outputs from one abstract evaluation coherently; no physical latency or scheduling bound is claimed. Rationale: atomic logical evaluation is a pilot abstraction needed for contract and scenario review.

ASM-05: Direct resume from `Degraded` restores only the coordinator's remembered logical mode; it does not restart machinery, re-enable power, clear health, or prove readiness. Rationale: this recovery distinguishes logical mode coordination from replicate-1 start authorization and avoids importing physical causal claims.

RESOLVE-01: Model review established that PART-01 and PART-02 can publish locally derived rising-edge facts from `In(state)` before storing current levels, so PART-04 may consume those facts without raw-input recomputation.

RESOLVE-02: Model review established the PART-05/PART-06/PART-07 feedback as realizable by publishing pre-update recovery target and mode, qualifying a directive, applying one resolution, and constraining state commits separately. This ordering is semantic and asserts no physical scheduler.

RESOLVE-03: Model review correctly rejected semantic-owner credit for a copy-only mode register. This revision makes PART-06's forty-pair directive partition and PART-07's 120-tuple application relation distinct local contracts while retaining exactly twenty credited cases.

RESOLVE-04: Model review established that one uncredited Process and five traced delegations can preserve the sixteen end-to-end meanings, eight credited usages, exact support allowances, and accepted profile mapping.

## Diversity audit against replicate 1

DIV-01: The selected primary scope is controller operating-mode coordination around fresh start/on/off/maintenance/return indications and degraded-condition arbitration. The closest accepted replicate-1 baseline is the medium `Vehicle Start-Readiness and Recovery Supervisor`.

DIV-02: The controlled purpose differs: this system publishes and sequences a logical controller mode; it never qualifies readiness, performs or awaits self-test, authorizes start, enables power, or clears temperature/maintenance health evidence.

DIV-03: The boundary differs: this system has three monitored aggregates for lifecycle levels, service levels, and currency-tagged controller condition, plus logical mode and coordination outcomes. It excludes replicate 1's brake, thermal/maintenance readiness, power, and self-test observations and its start-enable/test/power control frame.

DIV-04: State ownership and topology differ: freshness is split between lifecycle and service owners, recovery memory has its own owner, transition applicability is separated from state-dependent application and sole mode retention. Replicate 1 instead owns request priority, an armed self-test cycle, start authorization, and lifecycle/recovery around qualification fan-in.

DIV-05: Priority and recovery differ: this system explicitly arbitrates off, invalid/degraded condition, maintenance, return, on, and start, and a fresh return under current-normal evidence directly resumes the stored interrupted logical mode. Replicate 1 sends successful recovery to `Off`, discards a simultaneous start, and requires a later fresh start plus readiness and test qualification.

DIV-06: This is not an extension, repartition, or rename of the baseline because removing all readiness/test/power qualifications would eliminate the baseline's controlled question and decision chain, while adding this design's on-confirmation transition, maintenance handoff, independent service-event ownership, recovery-target memory, and direct logical resume would introduce a different boundary, state machine, interaction topology, priority domain, and recovery semantics.
