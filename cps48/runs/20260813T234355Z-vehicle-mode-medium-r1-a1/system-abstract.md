---
abstract_id: SA-VEH-MED-01
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: medium
semantic_usage_count: 8
semantic_interaction_count: 19
nontrivial_contract_case_count: 20
scenario_family_count: 8
containment_depth: 2
requires_stateful_behavior: true
requires_fault_behavior: true
requires_executable_profile: false
revision: model-review-resolved
---

# Vehicle Start-Readiness and Recovery Supervisor

## Evidence and claim partition

METH-01: The handbook-derived method requires need and context before decomposition, an explicit monitored and controlled boundary, cohesive responsibility allocation, nominal and off-nominal scenarios, recorded assumptions and alternatives, bidirectional trace coverage, measurable pass criteria, and separate verification and validation. These are methodology obligations, not facts about a production vehicle.

SRC-01: The frozen seed supports a Vehicle and VehicleController context and start, on, off, maintenance, degraded, return-to-normal, self-test, parking-brake, temperature, electrical-power, and power-disposition vocabulary. It does not define a complete protocol, command authority, sequencing, authorization, priority, fault response, or recovery.

SRC-02: The seed's Road, drivetrain, fuel, and physical-power concepts are context only. It supplies no vehicle-dynamics or torque law, numerical temperature threshold, action-completion semantics, physical timing, safety integrity, reliability, or production-fitness evidence.

ABS-01: This pilot selects a finite supervisory abstraction in which a fresh commanded start is qualified, a separately armed self-test completes, an operating disposition is issued, and a degraded condition recovers only through restored qualifications, a fresh return request, a separately armed recovery-test pass, transition to `Off`, and a later fresh start. The protocol, finite types, priorities, and causal meanings are Designer-owned assumptions beyond the seed.

SEL-01: The approved architecture is the eight semantic usages in PART-01 through PART-08, the nineteen semantic interactions in INT-01 through INT-19, the twenty nontrivial cases in CASE-01 through CASE-20, and the eight scenario families in SCN-01 through SCN-08. This is a selected architecture, not a source-grounded decomposition.

DEF-01: Generated application code, execution, physical actuation, plant dynamics, quantitative timing, reliability, hazard likelihood or severity, certification, fuel behavior, and proof beyond retained source contracts and the bounded finite analyzer are deferred. They shall remain reported as `not-run` or out of scope and shall not be inferred from successful generation, typechecking, visualization, or bounded analysis.

## Need, purpose, goals, and operational context

NEED-01: A vehicle-control environment needs a bounded supervisor that prevents an unqualified start, makes shutdown dominate conflicting requests, exposes a degraded disposition when qualifying evidence becomes unacceptable, and prevents stale requests or test results from silently restarting operation.

PURP-01: The system will supervise one logical vehicle start/readiness episode at a time. It will qualify start-related observations, own request-history, test-cycle, and lifecycle state, and emit one coherent control frame. It will not implement the starter, brake, power network, temperature sensing, maintenance process, self-test mechanism, or road and vehicle dynamics.

GOAL-01: The system shall issue `Permit` only while its owned lifecycle result is `On` following a fresh start, acceptable start qualifications, and a fresh passing result from an armed start-test cycle.

GOAL-02: The system shall make an asserted off request dominate every simultaneous return or start request and shall produce a fail-closed frame in the same abstract evaluation whose lifecycle result becomes `Degraded` or `Off`.

GOAL-03: The system shall require a distinct recovery sequence after degradation: restored qualifications, a fresh return request, a fresh passing result from an armed recovery-test cycle, transition to `Off`, and a later fresh start request.

CTX-01: The Command Authority is an abstract external originator of start, off, and return-to-normal levels. The seed does not identify this actor; assigning it responsibility for deliberate request levels is a pilot assumption.

CTX-02: The Brake Observation Source is external and reports pedal condition. The system neither measures pedal mechanics nor asserts that pedal condition proves physical brake effectiveness.

CTX-03: The Vehicle Health Source is external and reports temperature-relative-to-maximum and maintenance-due abstractions. It owns threshold comparison and maintenance determination outside this boundary.

CTX-04: The Electrical Power Source is external and reports whether supervisory power enablement is available. The system does not generate or measure electrical power.

CTX-05: The Self-Test Facility is external and accepts an initiation indication through the control frame and later supplies at most one fresh completion event for that initiated cycle.

CTX-06: The Vehicle Control Consumers are external recipients of the coordinated frame, including abstract start, parking-brake, power, self-test, mode, and status consumers. Physical realization and success feedback are outside the boundary.

CTX-07: The Road and drivetrain remain external physical context and exchange no modeled quantity with this selected supervisory boundary.

## Exact finite monitored and controlled boundary

TYPE-01: `Bool = {false, true}`. `RequestLevels = (start: Bool, off: Bool, return: Bool)` admits all eight combinations. Levels may persist; PART-01 alone derives rising-edge events.

TYPE-02: `BrakeObservation = {Pressed, Released, Invalid}`. `BrakeFacts = (evidenceTrusted: Bool, readyForAdmission: Bool)`. PART-02 derives `(true,true)` for `Pressed`, `(true,false)` for `Released`, and `(false,false)` for `Invalid`; the two predicates are distinct policy facts, not a renamed three-value code.

TYPE-03: `ThermalCondition = {Normal, OverMaximum, Invalid}` and `MaintenanceCondition = {NotDue, Due, Invalid}`. `HealthObservation` is their nine-value Cartesian product. `HealthQualification = {Ready, NotReady, Invalid}`; no numerical temperature or unit is inside this abstraction.

TYPE-04: `PowerObservation = {Available, Unavailable, Invalid}`. `PowerFacts = (evidenceTrusted: Bool, availableForSupervision: Bool)`. PART-04 derives `(true,true)` for `Available`, `(true,false)` for `Unavailable`, and `(false,false)` for `Invalid`; the two predicates are distinct policy facts, not a renamed three-value code.

TYPE-05: `SelfTestObservation = {NoEvent, FreshPass, FreshFail, Invalid}`. A fresh pass or fail is a one-evaluation completion event associated by CTX-05 with the most recently initiated cycle; `NoEvent` includes waiting.

TYPE-06: `RequestDisposition = {OffDominant, ReturnCandidate, StartCandidate, None}` and `StartDecision = {OffPriority, NoStart, DenyInvalid, DenyNotReady, BeginStartTest}`.

TYPE-07: `CommittedTestCycle = {Idle, AwaitingStart, AwaitingRecovery, StartPassed, RecoveryPassed, Failed, Invalid}`. `CycleAssessment` has the same seven finite values but denotes the current evaluation's pre-update assessment, not post-state storage.

TYPE-08: `LifecycleMode = {Off, Starting, On, Degraded}`, `TestCycleDirective = {None, BeginStart, BeginRecovery, Clear}`, and `LifecycleReason = {Ordinary, QualificationInvalid, QualificationNotReady, RecoveryAwaiting, RecoveryCompleted}`.

TYPE-09: `AppliedLifecycleSnapshot = (preMode: LifecycleMode, nextMode: LifecycleMode, reason: LifecycleReason, directive: TestCycleDirective)`. The pre/next fields are realization snapshots and receive no separate owner or semantic-usage credit.

TYPE-10: `StartEnable = {Inhibit, Permit}`, `ParkingBrakeCommand = {Apply, Release}`, `PowerDisposition = {Isolate, TestOnly, Enable}`, and `SelfTestCommand = {None, Initiate}`.

TYPE-11: `SupervisoryStatus = {Idle, RequestConflict, StartBlockedInvalid, StartBlockedNotReady, Testing, Operating, Degraded, RecoveryTesting, RecoveredAwaitFreshStart}`. `ControlFrame` is the finite product of `StartEnable`, `ParkingBrakeCommand`, `PowerDisposition`, `SelfTestCommand`, `LifecycleMode`, and `SupervisoryStatus`.

MON-01: The system shall monitor `request_levels: RequestLevels` from CTX-01 on each evaluation; PART-01 is the sole owner of rising-edge recognition and request-conflict priority.

MON-02: The system shall monitor `brake_observation: BrakeObservation` from CTX-02; PART-02 is the sole owner of brake trust and admission-readiness facts.

MON-03: The system shall monitor `health_observation: HealthObservation` from CTX-03; PART-03 is the sole owner of the combined thermal and maintenance qualification.

MON-04: The system shall monitor `power_observation: PowerObservation` from CTX-04; PART-04 is the sole owner of power trust and supervisory-availability facts.

MON-05: The system shall monitor `self_test_observation: SelfTestObservation` from CTX-05; PART-05 is the sole owner that can associate a completion event with a previously armed test cycle.

CTRL-01: The system shall control exactly one `control_frame: ControlFrame` delivered to CTX-05 and CTX-06. Its six fields are distinct outcomes transported as one atomic supervisory disposition so consumers cannot observe a mixed lifecycle tuple.

BOUND-01: MON-01 through MON-05 and CTRL-01 are the complete modeled root boundary. No physical temperature, torque, speed, fuel, road, starter feedback, brake feedback, power-delivery feedback, clock, or additional operator channel may be added without a revised abstract.

## Selected semantic usages and local-contract expectations

PART-01: Request Priority Owner shall retain previous request levels; derive `freshStart = start and not In(previousStart)`, `freshReturn = return and not In(previousReturn)`, and level-sensitive `offActive = off`; derive conflict exactly when at least two of `offActive`, `freshReturn`, and `freshStart` are true; and derive `RequestDisposition` under `OffDominant > ReturnCandidate > StartCandidate > None`. This temporal classification is not forwarding.

PART-02: Brake Qualification Owner shall constrain both fields of `BrakeFacts` for all three MON-02 values exactly as TYPE-02 states. Its trust fact selects invalid handling, while its readiness fact selects valid-not-ready handling and phase applicability. It shall publish no credited three-code projection.

PART-03: Health Qualification Owner shall derive `Invalid` if either MON-03 field is invalid, otherwise `NotReady` if temperature is `OverMaximum` or maintenance is `Due`, otherwise `Ready`. It owns the combined health fact and invalid-over-blocked priority.

PART-04: Power Qualification Owner shall constrain both fields of `PowerFacts` for all three MON-04 values exactly as TYPE-04 states. Its trust fact selects invalid handling, while its availability fact selects valid-not-ready handling and phase applicability. It shall publish no credited three-code projection.

PART-05: Self-Test Cycle Owner shall retain only `committedTestCycle`, publish `CycleAssessment` from `In(committedTestCycle)` and current MON-05 without depending on the current directive, and independently derive post-state storage from that assessment and INT-17. It shall distinguish start and recovery cycles, ignore unarmed completion events, preserve accepted start evidence for operating retention, and never accept a completion arriving in the evaluation that first arms a cycle.

PART-06: Start Authorization Owner shall combine PART-01's disposition/conflict, PART-02's two brake facts, PART-03's health qualification, and PART-04's two power facts to derive the five-valued `StartDecision` under CASE-01 through CASE-05. It shall inspect no raw boundary observation and own no lifecycle state.

PART-07: Lifecycle and Recovery Owner shall retain exactly one lifecycle mode and derive `AppliedLifecycleSnapshot`, including next mode, exact lifecycle reason, and test directive, under CASE-06 through CASE-20. It shall consume owner-local facts without recomputing them.

PART-08: Coordinated Outcome Owner shall derive the complete CTRL-01 frame from PART-06's decision/conflict and PART-07's applied snapshot. It owns cross-field coherence and status precedence, especially that `Permit`, `Release`, and `Enable` occur together only for `On`; it shall not recompute request, qualification, test, authorization, or transition decisions.

STATE-01: PART-01 shall initialize all three previous request levels to `false` and store current levels after each evaluation. A held start or return is not fresh; off remains dominant throughout every asserted evaluation.

STATE-02: PART-05 shall initialize `committedTestCycle` to `Idle`. Its assessment mapping is: an awaiting start or recovery cycle plus `FreshPass` yields the corresponding passed assessment; either awaiting cycle plus `FreshFail` yields `Failed`; either awaiting cycle plus `Invalid` yields `Invalid`; either awaiting cycle plus `NoEvent` remains awaiting; a passed cycle plus `Invalid` yields `Invalid`; otherwise an observation not applicable to the pre-state leaves the pre-state assessment unchanged, including ignoring every unarmed completion.

STATE-03: PART-05 post-state mapping is independent of the publication mapping: `Clear` stores `Idle`, `BeginStart` stores `AwaitingStart`, `BeginRecovery` stores `AwaitingRecovery`, and `None` stores the published assessment. Consequently a published `StartPassed` or `RecoveryPassed` may be consumed while a simultaneous `Clear` stores `Idle`.

STATE-04: PART-07 shall initialize lifecycle mode to `Off`. Its only non-self transitions are `Off -> Starting`, `Starting -> On`, `Starting -> Degraded`, `Starting -> Off`, `On -> Degraded`, `On -> Off`, and `Degraded -> Off`.

OWN-AUDIT-01: PART-01 owns temporal request facts; PART-02 and PART-04 each own two nonbijective, separately consumed policy facts; PART-03 owns a combined two-field health classification; PART-05 owns cycle-relative temporal evidence; PART-06 owns start admission; PART-07 owns lifecycle/recovery transition; and PART-08 owns atomic frame coherence. No usage receives credit for copying, bundling, renaming, routing, record construction, or one-to-one projection.

OWN-AUDIT-02: At least seven decision or qualification owners cooperate: PART-01 through PART-04 feed PART-06, and PART-01 through PART-06 feed PART-07. This exceeds the required two owners without central recomputation; PART-08 is substantive but is not needed to satisfy that minimum.

## Complete typed directed semantic interaction inventory

INT-01: Root/MON-01 shall provide `RequestLevels` to PART-01 for edge, conflict, and priority derivation.

INT-02: Root/MON-02 shall provide `BrakeObservation` to PART-02 for trust and readiness derivation.

INT-03: Root/MON-03 shall provide `HealthObservation` to PART-03 for thermal and maintenance qualification.

INT-04: Root/MON-04 shall provide `PowerObservation` to PART-04 for trust and availability derivation.

INT-05: Root/MON-05 shall provide `SelfTestObservation` to PART-05 for pre-state cycle-relative assessment.

INT-06: PART-01 shall provide `RequestDisposition` and conflict to PART-06 for start authorization.

INT-07: PART-01 shall provide `offActive`, `freshReturn`, `freshStart`, and priority disposition to PART-07 for lifecycle and recovery decisions.

INT-08: PART-02 shall provide both `BrakeFacts` predicates to PART-06 for initial start authorization.

INT-09: PART-02 shall provide both `BrakeFacts` predicates to PART-07 for continued-start and recovery applicability.

INT-10: PART-03 shall provide `HealthQualification` to PART-06 for initial start authorization.

INT-11: PART-03 shall provide `HealthQualification` to PART-07 for starting, operating, degraded, and recovery protection.

INT-12: PART-04 shall provide both `PowerFacts` predicates to PART-06 for initial start authorization.

INT-13: PART-04 shall provide both `PowerFacts` predicates to PART-07 for starting, operating, degraded, and recovery protection.

INT-14: PART-05 shall provide its pre-update `CycleAssessment` to PART-07 for start completion, failure, operating retention, and recovery completion.

INT-15: PART-06 shall provide `StartDecision` and conflict to PART-07 for `Off`-state admission and priority response.

INT-16: PART-06 shall provide `StartDecision` and conflict to PART-08 for blocked, idle, and conflict status without raw-input recomputation.

INT-17: PART-07 shall provide `TestCycleDirective` to PART-05 to arm or clear the correct post-state test cycle independently of INT-14's published assessment.

INT-18: PART-07 shall provide `AppliedLifecycleSnapshot`, including the exact `LifecycleReason`, to PART-08 for same-evaluation frame derivation.

INT-19: PART-08 shall provide the atomic `ControlFrame` to Root/CTRL-01 for CTX-05 and CTX-06.

INT-AUDIT-01: INT-01 through INT-19 are exactly nineteen typed directed end-to-end semantic interactions: five boundary observations, thirteen inter-owner flows, and one boundary control-frame delivery. A record payload remains one interaction when all fields share the stated producer, consumer, and purpose.

INT-AUDIT-02: All eight semantic usages and all nineteen interactions form one weakly connected semantic region. Every usage has a derivation-producing input and a boundary-relevant output path; no interaction exists only to meet the count.

## Priority, applicability, reason, and output policy

POL-01: Request priority shall be level-sensitive off, then fresh return, then fresh start, then none. Simultaneous off/start, off/return, or all three is `OffDominant`; simultaneous fresh return/start without off is `ReturnCandidate`, consuming the losing start edge.

POL-02: Start-qualification priority shall be any untrusted or invalid evidence before valid-not-ready evidence before readiness. Return and none never authorize a start.

POL-03: Brake trust and readiness apply in `Off`, `Starting`, and recovery from `Degraded`; brake is deliberately inapplicable to retaining `On`. Health, power trust/availability, and accepted start-test evidence apply while retaining `On`.

POL-04: CASE-09 shall produce `QualificationInvalid` when brake is untrusted, health is `Invalid`, or power is untrusted; otherwise it shall produce `QualificationNotReady`. CASE-20 shall produce `RecoveryAwaiting` exactly when the assessment is `AwaitingRecovery`. CASE-19 shall produce `RecoveryCompleted`. Every other lifecycle case shall produce `Ordinary`.

POL-05: PART-08 shall map next mode `Starting` to `(Inhibit, Apply, TestOnly, Initiate iff directive=BeginStart else None, Starting, Testing)` and next mode `On` to `(Permit, Release, Enable, None, On, Operating)`.

POL-06: PART-08 shall map next mode `Degraded` to `(Inhibit, Apply, Isolate, Initiate iff directive=BeginRecovery else None, Degraded, status)`, where status is `RecoveryTesting` exactly when directive is `BeginRecovery` or reason is `RecoveryAwaiting`, and otherwise `Degraded`.

POL-07: PART-08 shall map next mode `Off` to `(Inhibit, Apply, Isolate, None, Off, status)`, where status priority is `RecoveredAwaitFreshStart` for reason `RecoveryCompleted`, then `StartBlockedInvalid` for decision `DenyInvalid`, then `StartBlockedNotReady` for decision `DenyNotReady`, then `RequestConflict` when conflict is true, then `Idle`.

POL-08: Initialization output shall be `(Inhibit, Apply, Isolate, None, Off, Idle)`. Qualification equations, edge equations, state-update equations, reason mapping, frame mapping, initialization, and invariants are required local contracts but receive no nontrivial-case credit.

POL-09: A recovery pass shall report `RecoveredAwaitFreshStart`, clear the recovery cycle, discard any same-evaluation fresh start, and require the start level to fall and later rise before another start is fresh.

## Exactly twenty ordered nontrivial contract cases

CASE-01: PART-06, when disposition is `OffDominant`, shall derive `OffPriority` regardless of qualification facts; this is the explicit off-versus-return/start priority case.

CASE-02: PART-06, when disposition is `ReturnCandidate` or `None`, shall derive `NoStart`; return is inapplicable to start admission and a simultaneous start has lost priority.

CASE-03: PART-06, when disposition is `StartCandidate` and brake is untrusted, health is `Invalid`, or power is untrusted, shall derive `DenyInvalid`.

CASE-04: PART-06, when disposition is `StartCandidate`, brake and power are trusted, health is valid, and brake is not ready, health is `NotReady`, or power is unavailable, shall derive `DenyNotReady`.

CASE-05: PART-06, when disposition is `StartCandidate`, brake is trusted and ready, health is `Ready`, and power is trusted and available, shall derive `BeginStartTest`.

CASE-06: PART-07, when current mode is `Off` and PART-06 supplies `BeginStartTest`, shall transition to `Starting`, issue `BeginStart`, and produce reason `Ordinary`; this consumes the fresh start.

CASE-07: PART-07, when current mode is `Off` and PART-06 supplies any other decision, shall remain `Off`, issue no directive, and produce reason `Ordinary`, with the decision retained for output status.

CASE-08: PART-07, when current mode is `Starting` and `offActive` is true, shall transition to `Off`, issue `Clear`, and produce reason `Ordinary`, regardless of qualifications or assessment.

CASE-09: PART-07, when current mode is `Starting`, off is inactive, and any brake, health, or power prerequisite is unacceptable, shall transition to `Degraded` and issue `Clear`; its reason shall be `QualificationInvalid` when any applicable evidence is untrusted or invalid, otherwise `QualificationNotReady`.

CASE-10: PART-07, when current mode is `Starting`, off is inactive, prerequisites are ready, and assessment is `Failed` or `Invalid`, shall transition to `Degraded`, issue `Clear`, and produce reason `Ordinary`.

CASE-11: PART-07, when current mode is `Starting`, off is inactive, prerequisites are ready, and assessment is `Idle`, `AwaitingStart`, `AwaitingRecovery`, or `RecoveryPassed`, shall remain `Starting`, issue no directive, and produce reason `Ordinary`; an inapplicable cycle cannot authorize operation.

CASE-12: PART-07, when current mode is `Starting`, off is inactive, prerequisites are ready, and assessment is `StartPassed`, shall transition to `On`, issue no directive, and produce reason `Ordinary`, retaining accepted start-pass evidence.

CASE-13: PART-07, when current mode is `On` and `offActive` is true, shall transition to `Off`, issue `Clear`, and produce reason `Ordinary`, regardless of other evidence.

CASE-14: PART-07, when current mode is `On`, off is inactive, and health is not `Ready`, power is untrusted or unavailable, or assessment is not `StartPassed`, shall transition to `Degraded`, issue `Clear`, and produce reason `Ordinary`; brake is explicitly inapplicable.

CASE-15: PART-07, when current mode is `On`, off is inactive, health is `Ready`, power is trusted and available, and assessment is `StartPassed`, shall remain `On`, issue no directive, and produce reason `Ordinary`.

CASE-16: PART-07, when current mode is `Degraded` and `offActive` is true, shall transition to `Off`, issue `Clear`, and produce reason `Ordinary`, regardless of recovery progress.

CASE-17: PART-07, when current mode is `Degraded`, off is inactive, and any brake, health, or power recovery prerequisite is unacceptable, shall remain `Degraded`, issue `Clear`, and produce reason `Ordinary`; restoration alone does not recover.

CASE-18: PART-07, when current mode is `Degraded`, off is inactive, all recovery prerequisites are ready, and `freshReturn` is true, shall remain `Degraded`, issue `BeginRecovery`, and produce reason `Ordinary`; this outranks and consumes a simultaneous fresh start.

CASE-19: PART-07, when current mode is `Degraded`, off is inactive, recovery prerequisites are ready, no fresh return is present, and assessment is `RecoveryPassed`, shall transition to `Off`, issue `Clear`, and produce reason `RecoveryCompleted`.

CASE-20: PART-07, when current mode is `Degraded`, off is inactive, recovery prerequisites are ready, no fresh return is present, and assessment is not `RecoveryPassed`, shall remain `Degraded` and issue no directive; it shall produce `RecoveryAwaiting` exactly for assessment `AwaitingRecovery` and otherwise `Ordinary`. A failed or invalid attempt remains nonpassing until a later fresh return rearms recovery.

CASE-AUDIT-01: CASE-01 through CASE-05 are total and mutually exclusive over PART-06 inputs. CASE-06 through CASE-20 are total and mutually exclusive under order `current mode`, then `offActive`, then phase prerequisites, then fresh-return applicability, then cycle assessment. They are exactly twenty nontrivial cases.

CASE-AUDIT-02: No initialization, type invariant, local qualification equation, reason mapping, frame mapping, duplicated guarantee, analyzer branch, or scenario witness receives case credit.

## Required behaviors, risks, faults, and verification criteria

BEH-01: The system shall follow CASE-05, CASE-06, CASE-11, and CASE-12 for nominal start and shall never emit `Permit` before the transition result is `On`.

VER-BEH-01: Contract inspection and bounded trace analysis shall pass only if every reachable `Permit` frame has mode `On`, follows a fresh start with all start prerequisites ready and a later pass from an armed start cycle, and has no earlier `Permit` in that episode.

BEH-02: The system shall retain `On` only under CASE-15 and shall emit the exact state-coherent frame specified by POL-05 through POL-07 on every evaluation.

VER-BEH-02: Exhaustive finite analysis shall pass only if every reachable state/input combination matches exactly one mode case and every frame satisfies `Permit iff mode=On`, `Release iff mode=On`, and `Enable iff mode=On`.

BEH-03: The system shall recover from `Degraded` only through CASE-18, a later assessment of `RecoveryPassed`, CASE-19, and a later fresh start through CASE-05 and CASE-06.

VER-BEH-03: Multi-step trace analysis shall pass only if no trace reaches `On` from `Degraded` without return-test-off-fresh-start, including held requests, same-evaluation start/return, stale or unarmed pass events, and prerequisite revocation.

RISK-01: If a start is permitted with untrusted or not-ready brake, health, or power evidence, the abstract vehicle can enter an operating disposition without the selected readiness basis.

FAULT-01: PART-06 and PART-07 shall fail closed under CASE-03, CASE-04, CASE-09, CASE-10, and CASE-14, producing no `Permit` and no `Release`.

VER-FAULT-01: Contract and analyzer evidence shall pass only if all invalid and valid-not-ready valuations select the specified denial or degradation case and the resulting frame is fail closed.

RISK-02: If start or return wins a simultaneous off conflict, the supervisor can continue or initiate operation contrary to selected shutdown priority.

FAULT-02: PART-01, PART-06, and PART-07 shall preserve `OffDominant` through CASE-01, CASE-08, CASE-13, and CASE-16.

VER-FAULT-02: Exhaustive request-set analysis shall pass only if every combination with off asserted transitions or remains `Off`, clears the test cycle, and emits the exact safe off tuple.

RISK-03: If retained request levels or unarmed self-test results count as fresh, a recovered supervisor can restart without a new command or current evidence.

FAULT-03: PART-01 and PART-05 shall enforce rising-edge and pre-armed-cycle freshness; CASE-18 through CASE-20 shall discard same-evaluation start and require a later fresh start.

VER-FAULT-03: State-sequence analysis shall pass only if held start/return, unarmed completion, prior-cycle pass, completion on the arming evaluation, and start simultaneous with return cannot directly produce `Starting` or `On` after recovery.

RISK-04: If qualifying evidence is lost in `Starting` or `On` without propagation, the externally visible frame can remain permissive after its selected protection basis is absent.

FAULT-04: CASE-09, CASE-10, and CASE-14 shall transition to `Degraded`; PART-08 shall emit the fail-closed degraded frame in that same abstract evaluation from the applied next-mode snapshot.

VER-FAULT-04: Post-state contract inspection and finite analysis shall pass only if every initiating valuation produces `Degraded`, `Inhibit`, `Apply`, and `Isolate` in the corresponding computed frame, with no intermediate permissive tuple represented.

## Exactly eight scenario families

SCN-01: Nominal fresh start shall cover initialized `Off`, a fresh start with all prerequisites ready, `BeginStart`, waiting in `Starting`, a later fresh start-test pass, transition to `On`, and the operating frame.

SCN-02: Request-priority conflict shall cover start-plus-off in `Off`, return-plus-off in `Degraded`, and start-plus-return in `Degraded`, demonstrating `off > return > start` and consumption of the losing edge.

SCN-03: Initial qualification rejection shall separately witness untrusted or invalid evidence and valid-not-ready evidence across brake, combined health, and power without entering `Starting`.

SCN-04: Starting interruption shall cover brake release, health blockage, power loss, invalid evidence, and fresh self-test failure while `Starting`, each reaching the fail-closed degraded frame.

SCN-05: Operating protection shall cover over-maximum temperature, maintenance due, power unavailable, and invalid health, power, or retained test evidence while `On`; brake release while `On` shall demonstrate declared inapplicability.

SCN-06: Off-request shutdown shall cover `Starting -> Off`, `On -> Off`, and `Degraded -> Off`, with test-cycle clear and the exact off frame.

SCN-07: Successful recovery shall cover restored prerequisites, a fresh return, recovery-test initiation, waiting with `RecoveryAwaiting`, a later fresh recovery pass, `RecoveryCompleted`, transition to `Off`, and a later falling-then-rising start before a new start cycle.

SCN-08: Recovery rejection and freshness shall cover prerequisite revocation, held return, unarmed or stale pass, completion on an arming evaluation, fresh recovery fail, simultaneous return/start, and held start after recovery, demonstrating that a new return attempt and later fresh start are required.

SCN-AUDIT-01: SCN-01 through SCN-08 are exactly eight distinct families and collectively witness all twenty cases. Examples within a family receive no additional family credit.

## Environmental assumptions and constraints

ASM-01: CTX-01 is responsible for stable Boolean request levels and allowing a level to fall before expecting a later rise to count as fresh. Rationale: the stale-request defense uses edges because the seed supplies no request identifier.

ASM-02: CTX-02 is responsible only for the truth and validity of reported pedal condition. `Pressed` is a pilot readiness abstraction, not evidence of achieved parking-brake force.

ASM-03: CTX-03 is responsible for the temperature comparison and maintenance fact. The seed supplies no threshold value, unit, clock, or policy.

ASM-04: CTX-04 is responsible for the accuracy and validity of its power observation; CTX-06 is responsible for acting on the disposition. The empty source analysis establishes no delivery semantics or feedback.

ASM-05: CTX-05 is responsible for emitting a fresh pass or fail at most once and only after completing the most recently initiated cycle. No response-time bound is claimed.

ASM-06: CTX-05 and CTX-06 consume the six-field control frame atomically at an abstract evaluation boundary. This selects no transport or scheduling mechanism.

CONSTR-01: The realization shall contain exactly one root System, one behavior-free generated-support Process, and exactly eight responsibility-bearing Thread usages for PART-01 through PART-08. It therefore has ten total usages including root, nine non-root source usages, physical containment depth exactly two below root, and one weak semantic region.

CONSTR-02: The realization shall contain exactly nineteen Process-local semantic `PortConnection` declarations corresponding one-for-one to INT-01 through INT-19 and exactly six additional root/Process delegations for the five root inputs and one root output, totaling exactly twenty-five raw `PortConnection` declarations.

CONSTR-03: The support Process and six delegations shall carry specific `@generated-support` rationales and resolved INT traces, own no behavior or decision, introduce no new domain meaning, and receive no semantic-usage, semantic-interaction, owner, case, or scenario credit.

CONSTR-04: A tool-required record, port, one-to-one pre/next projection, or endpoint declaration is allowed only when it is typed, traces to an existing clause, owns no behavior, and is uncredited. No other support usage, routing hop, or connection is authorized by this baseline.

CONSTR-05: The realization shall contain exactly twenty nontrivial owner-local cases and exactly eight scenario families. Repartitioned equivalent cases, duplicated guarantees, output equations, and analyzer branches shall not inflate those counts.

CONSTR-06: Every significant usage, port, connection, state, local contract, and analyzer relation shall trace bidirectionally to this abstract. Every GUMBO-inspected field of `RequestLevels`, `HealthObservation`, `BrakeFacts`, `PowerFacts`, request and lifecycle snapshots, and `ControlFrame` shall be declared as an `attribute`.

## Bounded end-to-end analysis obligations and pass criteria

ANALYSIS-01: The retained deterministic analyzer shall use an independent direct oracle over all finite boundary types, PART-01 request history, PART-05 committed test cycle, PART-07 lifecycle mode, and reachable multi-step traces. It shall compare each owner-local fact, selected case, assessment, post-state, directive, reason, next mode, and complete frame against the realization.

ANALYSIS-02: Owner-local enumeration shall cover all 64 current/previous request pairs for PART-01, all three input values and both output predicates for each of PART-02 and PART-04, all nine health values for PART-03, and all `7 pre-states x 4 observations x 4 directives = 112` tuples for PART-05, comparing both published pre-update assessment and post-state storage.

ANALYSIS-03: The analyzer shall establish exclusivity and exhaustiveness for CASE-01 through CASE-05 over every finite PART-06 input and CASE-06 through CASE-20 over every reachable PART-07 state/input combination. It shall report unreachable tuples rather than use them to hide a gap.

ANALYSIS-04: The complete raw boundary/state product contains `8 x 3 x 9 x 3 x 4 x 8 x 7 x 4 = 580,608` valuations before reachability reduction. The analyzer shall check the complete product or a mechanically justified equivalent decomposition and shall remain subject to the run's 180-second watchdog; tractability evidence is not advance acceptance evidence.

ANALYSIS-05: The analyzer shall retain at least one bounded witness per CASE and the complete ordered witnesses for SCN-01 through SCN-08, including held-level, stale/unarmed completion, completion-on-arm, invalid/not-ready, priority-conflict, and recovery traces.

ANALYSIS-06: Bounded enumeration is conformance evidence only. It is not compositional or unbounded proof, execution evidence, physical validation, reliability evidence, or certification evidence.

PASS-01: Structural analysis shall report exactly `1` root, `1` support Process, `8` semantic Threads, `10` total usages including root, `9` non-root usages, depth `2`, `19` semantic interactions, `6` support delegations, `25` raw port connections, and one weak semantic region.

PASS-02: Ownership inspection shall pass only if every PART implements its stated local derivation, both predicates of PART-02 and PART-04 are separately constrained and consumed, downstream owners do not inspect raw observations to recompute upstream facts, and the analyzer independently reproduces rather than replaces canonical contracts.

PASS-03: Contract analysis shall report exactly twenty counted cases, mutual exclusivity and total coverage, exact priority, initialized state, closed finite reason mapping, complete frame mapping, and no reachable unconstrained field.

PASS-04: Trace analysis shall find every actionable identifier covered or explicitly deferred, every significant model element traced or specifically justified as generated support, and no unexplained architecture, state, case, mode, boundary quantity, controlled effect, or generated claim.

PASS-05: Source verification shall require the retained architecture, current Sireum/HAMR typechecking gates, compatible resolved endpoints, independent harness gate, and bounded analyzer to pass. A parser, diagram, precedent, or review-time feasibility statement does not substitute for this run's evidence.

PASS-06: Scenario evidence shall cover all eight families and all twenty cases, including off conflict, invalid/not-ready distinction, starting and operating degradation, recovery-prerequisite revocation, fresh return, fresh recovery result, and later fresh start.

PASS-07: Designer validation shall separately determine fitness for NEED-01, PURP-01, the exact boundary, and the source, assumption, selection, support, and deferred-claim partitions. Mechanical conformance alone is insufficient.

PASS-08: The single native-resolution `system-overview` shall bind to the accepted source revision, visibly distinguish the root, support Process, eight semantic usages, five monitored inputs, one controlled frame, nineteen principal semantic directions, and external contexts, with no unresolved endpoint, overlap, clipping, truncation, or out-of-bounds object.

PASS-09: Campaign acceptance shall fail if the semantic metrics differ from exact `8/19/20/8`, even if another point remains within the medium ranges, or if compliance uses wrappers, identity owners, duplicate interactions, equivalent-case repartitioning, or scenario elaboration without a distinct trace.

AUDIT-FINAL-01: The approved recount is exactly eight semantic usages, nineteen semantic interactions, twenty nontrivial contract cases, and eight scenario families, all within medium bounds `8..12`, `15..21`, `12..20`, and `6..9`. It has three state owners, at least seven cooperating decision or qualification owners, and the explicit priority conflict `off > return > start`.

AUDIT-FINAL-02: The exact realization allowances are one behavior-free support Process, eight semantic Threads, nine non-root usages, ten total usages including root, physical depth two, nineteen semantic connections, six support delegations, and twenty-five raw port connections. These physical counts do not alter semantic credit.

AUDIT-FINAL-03: Every state and decision owner, boundary field, interaction, case predicate, result, reason, fresh-request path, fault path, and recovery path has an explicit owner. No source limitation is promoted to a physical, safety, reliability, execution, certification, or production claim.
