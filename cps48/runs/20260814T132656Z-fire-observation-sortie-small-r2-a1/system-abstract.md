---
abstract_id: SA-FOS-SM-R2-02
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
campaign_complexity: small
selected_primary_scope: battery-status-assessment-for-drone-control-use
semantic_usage_bounds: [5, 8]
selected_semantic_usage_count: 5
semantic_interaction_bounds: [7, 14]
selected_semantic_interaction_count: 14
internal_usage_interaction_count: 8
nontrivial_contract_case_bounds: [6, 12]
selected_nontrivial_contract_case_count: 12
scenario_family_bounds: [4, 6]
selected_scenario_family_count: 5
semantic_containment_depth: 1
root_system_usage_count: 1
weakly_connected_regions: 1
principal_decision_owner_count: 1
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: designer-final-approved
supersedes: SA-FOS-SM-R2-01
---

# Battery Status Assessment Service for Drone Control

## Evidence and claim partition

METH-01: [handbook-derived method] The abstract defines need and boundary before decomposition, compares alternatives, allocates cohesive owner-local facts, closes nominal and off-nominal finite behavior, states assumptions and deferred evidence, and separates verification from validation. These are method obligations, not facts about the drone.

SRC-01: [source-grounded fact; design consequence] The frozen source names a forest-fire observation drone, selects a long-distance battery variant, describes obtaining and analyzing a qualitative battery-capacity status, and makes that status available to drone control. This supports the selected battery-assessment boundary but supplies no status literals, trust semantics, request protocol, priority, fault behavior, or recovery rule.

SRC-02: [source-grounded fact; informational] The source also names a charger, power-management module, drone-control unit, navigation and communication equipment, camera, obstacle sensor, landing gear, and four engines with alternating propeller kinds. Those names and structural facts do not establish health, sufficiency, accuracy, endurance, controllability, or performance.

ABS-01: [pilot abstraction; required] One bounded check transaction obtains one qualitative report from the external power-management role and produces one tagged assessment for drone-control use. The exact finite levels, trust statuses, request tokens, feedback, and logical evaluation ordering are Designer-selected abstractions beyond the source.

ABS-02: [pilot abstraction; required] Two alternating tokens represent fresh checks. A `Start` is fresh only when its token differs from the last admitted token; the same token denotes replay even after completion, cancellation, or reset.

ABS-03: [pilot abstraction; required] `NormalUse`, `CautionUse`, and `RestrictUse` are logical interpretations of trusted qualitative battery levels, not permissions to fly and not physical energy or endurance guarantees. `Untrusted` is an assessment result rather than a guessed capacity.

ABS-04: [representation refinement; required] Explicit `No*` sentinels make all typed-data-port relations total. They add no semantic usage, interaction, case, scenario, event, owner, or domain claim.

ARCH-01: [selected architecture; required] Five peer semantic usages beneath one root separate check admission, report acquisition, report qualification, assessment decision, and result custody. Only `PART-04` owns the principal battery-assessment policy.

DEFER-01: [deferred claims] Sortie eligibility, observation acquisition, camera or radio delivery, mission authority, fire detection or response, navigation, obstacle avoidance, propulsion control, landing, charging behavior, flight dynamics, endurance, battery physics, and physical safety remain outside the system.

DEFER-02: [deferred evidence] Code generation, application execution, physical timing, quantitative battery accuracy, formal proof beyond retained contracts and bounded analysis, certification, and production readiness are `not-run`; the frozen seed declares no executable profile.

## Need, purpose, goals, and operating context

NEED-01: Drone control needs a bounded, inspectable qualitative battery assessment whose trustworthiness is explicit, whose result cannot be confused with a replay or another check, and whose stale publication is removed after consumption, cancellation, or interface fault.

PURPOSE-01: The system will accept at most one logical battery check at a time, request and qualify one report, derive one assessment for the admitted token, make that result available to drone control, and recover from acquisition or publication faults only through explicit reset followed by a fresh alternate-token check.

GOAL-01: The system shall publish a trusted level-derived assessment only from a current, structurally coherent report tagged for the admitted check; stale, invalid, incomplete, or malformed present reports shall produce `Untrusted`.

GOAL-02: The system shall never publish an assessment for a replay, busy request, unmatched response, acquisition failure, inactive context, or mismatched decision token.

GOAL-03: The system shall clear an offered assessment upon matching consumption, cancellation, rejected use, inconsistent feedback, or reset, and shall fail closed into recovery hold after acquisition or publication faults.

GOAL-04: The system shall not leave recovery hold because inputs become favorable; one applicable reset shall clear both component fault latches, and only a subsequent alternate-token fresh `Start` shall reopen work.

CTX-01: [inferred external role] The Check Requester is part of the drone-control environment. It supplies check commands and alternating tokens and receives diagnostic check status; the source does not define this protocol.

CTX-02: [inferred external role from named power management] The Power Management Reporter receives a logical read request and supplies a qualitative battery report. It is responsible for intended token association and qualitative meanings, while the system classifies all violations.

CTX-03: [inferred external role from named drone control] The Drone Control Consumer receives the tagged battery assessment and reports whether the offer remains pending, was consumed, or was rejected. Consumption means only acceptance at this logical interface; the source defines no human or organizational actor.

CTX-04: [external context only] The battery, charger, aircraft, forest environment, observation payload, navigation, communications, landing gear, and propulsion equipment are outside the boundary and exchange no other modeled quantity with it.

SCOPE-01: The boundary contains exactly `PART-01` through `PART-05`, their owner-local finite policies and state, and the six boundary interactions `INT-01` through `INT-03` and `INT-12` through `INT-14`. It contains no sortie, observation, radio-delivery, propulsion, or flight decision.

## Exact finite boundary and internal vocabulary

TYPE-01: `CheckCommand = {NoCommand, Start, Cancel, Reset}` and `CheckToken = {TokenA, TokenB}`. `CheckRequest` is their Cartesian product; token is ignored for `NoCommand`, `Cancel`, and `Reset` but remains finite and present.

TYPE-02: `ReportTicket = {NoTicket, TokenA, TokenB}`, `ReportAvailability = {Absent, Present, Unavailable}`, `CapacityLevel = {NoLevel, High, Moderate, Low, Critical}`, and `ReportQuality = {NoQuality, Current, Stale, Invalid}`. `BatteryReport` is the full `3*3*5*4 = 180` Cartesian product, including deliberately incoherent values.

TYPE-03: The only coherent inactive report is `(NoTicket, Absent, NoLevel, NoQuality)`. A coherent unavailable response has a real matching ticket, `Unavailable`, `NoLevel`, and `NoQuality`. A coherent present report has a real matching ticket, `Present`, a non-`NoLevel` level, and a non-`NoQuality` quality. Every other combination is malformed.

TYPE-04: `FeedbackTicket = {NoTicket, TokenA, TokenB}` and `UseDisposition = {NoFeedback, Pending, Consumed, Rejected}`. `ControlUseFeedback` is the full `3*4 = 12` Cartesian product. `(NoTicket, NoFeedback)` is the only coherent inactive pair; every meaningful disposition requires a real ticket.

TYPE-05: `AssessmentResult = {NoAssessment, NormalUse, CautionUse, RestrictUse, Untrusted}`. `TaggedAssessment` combines `ReportTicket` and `AssessmentResult`; `(NoTicket, NoAssessment)` is the only inactive pair, and every meaningful result requires a real ticket.

TYPE-06: `CheckStatus = {Idle, Checking, Available, DuplicateIgnored, Busy, Cancelled, AcquisitionFailed, Completed, PublicationFailed, RecoveryRequired, ResetCompleted}`. Status is diagnostic. Under `ASM-04`, an owner may clear `CTRL-01` or `CTRL-02` in one evaluation while `CTRL-03` recognizes its committed outcome in the next evaluation; specifically, consumption clears `CTRL-02` before `Completed` appears.

MON-01: Root input `check_request: CheckRequest` comes from `CTX-01`; `PART-01` alone owns freshness, single-check admission, cancellation applicability, and reset applicability.

MON-02: Root input `battery_report: BatteryReport` comes from `CTX-02`; it is evaluated only against a real acquisition directive and otherwise is inapplicable.

MON-03: Root input `control_use_feedback: ControlUseFeedback` comes from `CTX-03`; it applies only to the token already offered by `PART-05`, while mismatched, malformed, or unexpected meaningful feedback is a publication fault.

CTRL-01: Root output `status_read_request: StatusReadRequest = {NoRead, ReadTokenA, ReadTokenB}` goes to `CTX-02`; it requests one logical report and makes no physical sampling or timing claim.

CTRL-02: Root output `battery_assessment: TaggedAssessment` goes to `CTX-03`. It is exactly `(offered token, retained assessment)` while `PART-05` is offered and `(NoTicket, NoAssessment)` otherwise.

CTRL-03: Root output `check_status: CheckStatus` goes to `CTX-01`. It initializes to `Idle`, reports the lifecycle owner's latest committed outcome, and cannot authorize drone behavior.

BOUND-01: `MON-01` through `MON-03` and `CTRL-01` through `CTRL-03` are the complete root boundary. Numeric voltage, state of charge, age, clock, flight demand, sortie state, camera/radio state, motor state, charger commands, and acknowledgements shall not be added without a revised abstract.

## Environmental assumptions and logical ordering

ASM-01: `CTX-01` shall alternate tokens for genuinely new checks and retain the token for retries or replays. Violation fails closed as `DuplicateIgnored` and never creates a read.

ASM-02: `CTX-02` is responsible for intended report association and qualitative meanings. The system makes no quantitative accuracy claim and classifies every unmatched, unavailable, absent, or malformed response.

ASM-03: `CTX-03` shall use a meaningful disposition only with the offered token. Mismatch is analyzed rather than assumed impossible and causes fail-closed publication recovery.

ASM-04: One logical evaluation observes prior committed acquisition and publication outcome registers, evaluates the current request, performs the current acyclic acquisition/qualification/assessment/custody path, and commits new owner outcomes for the next evaluation. This is an experiment ordering assumption, not a scheduler, period, deadline, or latency claim.

ASM-05: Feedback in the same evaluation as a newly opened assessment applies only to a previously committed offer; `CTX-03` is expected to supply the inactive pair when no prior offer exists. All violations remain in the bounded input product and shall cause publication fault.

ASM-06: `Reset` clears only this abstraction's acquisition and publication latches. It claims no repair of physical equipment or software, and recurring external faults are detected again on a later fresh check.

## Parts, local contracts, and owner audit

PART-01: `CheckLifecycle` owns freshness, one-outstanding-check state, the last admitted token, reset coordination, and `CTRL-03`. From the request, pre-state, and prior committed outcomes it derives admission, three directives, next lifecycle state, and status.

PART-02: `ReportAcquisition` owns response applicability, `CTRL-01`, and the acquisition fault latch. It derives capture, fault, or reset outcome from its directive, pre-state, report ticket, availability, and structural relation; raw fields copied on successful capture receive no owner credit.

PART-03: `ReportQualification` owns report-content trust. For a captured present report it derives exactly one tagged `QualifiedEvidence = {TrustedHigh, TrustedModerate, TrustedLow, TrustedCritical, Untrusted}`; it never decides the controlled assessment.

PART-04: `AssessmentDecision` is the sole principal decision owner. Exact applicable token matching yields one assessment under `POL-04`; inactive or mismatched applicability yields only the inactive tagged assessment.

PART-05: `ResultCustody` owns `CTRL-02`, offer phase, retained offered result, consumption/cancellation outcome, and the publication fault latch. It derives open, preserve, consume, withdraw, fault, or reset from its directive, assessment, feedback, and pre-state without recomputing trust or assessment policy.

LOCAL-01: `PART-01` shall cover every command in every lifecycle state, with prior faults above commands, publication fault above acquisition fault, recovery-only reset applicability, alternate-token freshness, and inactive directives when no work is admitted.

LOCAL-02: `PART-02` shall acquire only for a real directive: exact-ticket `Present` is captured; absent, unavailable, mismatched, or incoherent response faults. `FailureHold` permits only reset and keeps `CTRL-01 = NoRead`.

LOCAL-03: `PART-03` shall classify all captured-present payloads. Exactly a non-`NoLevel` level with `Current` quality is trusted; stale, invalid, no-quality, no-level, or structurally incoherent content is `Untrusted`.

LOCAL-04: `PART-04` shall own the non-bijective five-to-four meaningful relation and exact ticket/context matching. No other owner or analyzer routine may reproduce its assessment choice from report fields.

LOCAL-05: `PART-05` shall set retained assessment from the exact matching meaningful `INT-10` only when opening an offer, preserve that exact value only while offered for coherent inactive or matching `Pending` feedback, and clear it on consumption, withdrawal, rejection, mismatch, malformed feedback, fault hold, and reset. It shall constrain `CTRL-02` exactly from offer phase, token, and retained value.

OWN-AUD-01: The five usages derive distinct facts: `PART-01` temporal admission/recovery coordination, `PART-02` token-relative acquisition applicability and fault latch, `PART-03` trust collapse, `PART-04` the principal assessment, and `PART-05` stateful custody and feedback consistency. Copying, bundling, routing, and one-to-one renaming receive no credit.

DEC-01: `PART-04` is the one principal decision owner. Other owners derive protocol, applicability, qualification, or custody facts and shall not inspect raw inputs to duplicate the assessment relation.

## State ownership, initialization, and consistency

STATE-01: `PART-01` alone owns `LifecycleState = {Idle, Checking, AwaitingUse, RecoveryHold}` and `LastAdmittedToken = {None, TokenA, TokenB}`. Only a fresh admitted `Start` updates the token; reset never erases it.

STATE-02: `PART-02` alone owns `AcquisitionState = {Ready, FailureHold}`. Requested acquisition fault enters `FailureHold`; only reset returns it to `Ready`.

STATE-03: `PART-05` alone owns `PublicationState = {Empty, OfferedTokenA, OfferedTokenB, FaultHold}` and `RetainedAssessment: AssessmentResult`. A meaningful retained result exists if and only if publication state is offered; its ticket is the offered-state token. `Empty` and `FaultHold` require `NoAssessment`.

INIT-01: Initialization shall set lifecycle to `(Idle, None)`, acquisition to `Ready`, publication to `(Empty, NoAssessment)`, `CTRL-01 = NoRead`, `CTRL-02 = (NoTicket, NoAssessment)`, `CTRL-03 = Idle`, `committedAcquisitionOutcome = NoAcquisitionOutcome`, and `committedPublicationOutcome = NoPublicationOutcome`.

CONSIST-01: The complete committed owner-state families are `(Idle, Ready, Empty)`; `(Checking, Ready, Offered(T))`; `(AwaitingUse, Ready, Offered(T))`; consumption recognition `(AwaitingUse, Ready, Empty)`; acquisition-fault recognition `(Checking, FailureHold, Empty)` then `(RecoveryHold, FailureHold, Empty)`; publication-fault recognition `(Idle|Checking|AwaitingUse, Ready, FaultHold)` then `(RecoveryHold, Ready, FaultHold)`; combined-fault recognition `(Checking, FailureHold, FaultHold)` then `(RecoveryHold, FailureHold, FaultHold)`; and reset confirmation `(RecoveryHold, Ready, Empty)` then `(Idle, Ready, Empty)`. Every offered token equals `LastAdmittedToken`, every offered state has a meaningful retained result, every non-offered state has `NoAssessment`, and every omitted tuple is unreachable.

TRANS-01: `PART-01` transitions `Idle -> Checking` only on a fresh `Start`; `Checking -> AwaitingUse` on prior matching captured/offered outcomes; `Checking|AwaitingUse -> Idle` on cancellation or committed matching consumption; any non-hold state enters `RecoveryHold` on prior fault, with `PublicationFailed` priority; `RecoveryHold` remains until both reset confirmations commit and then returns to `Idle` without starting a check.

TRANS-02: `PART-02` transitions `Ready -> FailureHold` only on requested acquisition fault and `FailureHold -> Ready` only on reset. `PART-05` transitions `Empty -> OfferedTokenX` only on exact matching meaningful open; offered returns to `Empty` on consumption or withdrawal; any non-hold state enters `FaultHold` on publication inconsistency; and `FaultHold -> Empty` only on reset. One applicable reset directive pair clears both latches, including combined hold.

MODE-01: No separate SysML mode is required. Observable conditions are idle, checking, offered, consumption recognition, fault recognition, and recovery hold. During consumption recognition `CTRL-02` is already inactive while lifecycle remains `AwaitingUse`; `CTRL-03 = Completed` appears only when committed `INT-11 = Consumed` is evaluated one logical step later. Fault outputs likewise fail closed before lifecycle diagnosis can catch up.

## Complete typed directed semantic interaction inventory

INT-01: Root `MON-01 -> PART-01`, type `CheckRequest`, delivers command/token data to the admission owner.

INT-02: Root `MON-02 -> PART-02`, type `BatteryReport`, delivers the full finite report to the acquisition-applicability owner.

INT-03: Root `MON-03 -> PART-05`, type `ControlUseFeedback`, delivers feedback to the custody owner.

INT-04: `PART-01 -> PART-02`, type `AcquisitionDirective = {NoAcquisition, AcquireTokenA, AcquireTokenB, ResetAcquisition}`, initiates one read or resets acquisition.

INT-05: `PART-01 -> PART-04`, type `AssessmentContext = {NoContext, AssessTokenA, AssessTokenB}`, supplies assessment applicability without report fields.

INT-06: `PART-01 -> PART-05`, type `PublicationDirective = {NoPublicationDirective, OpenTokenA, OpenTokenB, Withdraw, ResetPublication}`, controls custody without carrying an assessment result.

INT-07: `PART-02 -> PART-03`, type `CapturedReport`, carries either the inactive report or the exact captured real-ticket present report.

INT-08: `PART-02 -> PART-01`, type `AcquisitionOutcome = {NoAcquisitionOutcome, CapturedTokenA, CapturedTokenB, AcquisitionFault, AcquisitionReset}`, exposes `In(committedAcquisitionOutcome)` and is prior-committed feedback, not a second assessment.

INT-09: `PART-03 -> PART-04`, type `TaggedQualifiedEvidence`, carries captured ticket and one qualification; inactive input yields only `(NoTicket, NoEvidence)`.

INT-10: `PART-04 -> PART-05`, type `TaggedAssessment`, carries the sole principal assessment or the coherent inactive pair.

INT-11: `PART-05 -> PART-01`, type `PublicationOutcome = {NoPublicationOutcome, OfferedTokenA, OfferedTokenB, Consumed, Cancelled, PublicationFault, PublicationReset}`, exposes `In(committedPublicationOutcome)` and is prior-committed lifecycle feedback.

INT-12: `PART-02 -> Root CTRL-01`, type `StatusReadRequest`, exposes the token-specific logical read.

INT-13: `PART-05 -> Root CTRL-02`, type `TaggedAssessment`, exposes only the currently offered token and retained assessment.

INT-14: `PART-01 -> Root CTRL-03`, type `CheckStatus`, exposes lifecycle diagnostic status.

INT-AUD-01: `INT-01` through `INT-14` are exactly fourteen directed semantic meanings: three boundary inputs, eight owner-to-owner meanings, and three boundary outputs. All five usages form one weakly connected semantic region.

INT-AUD-02: Tool-required delegation may refine a boundary meaning into concrete hops, but each hop shall trace to exactly one `INT` and add no semantic-interaction credit.

## Complete priority and policy partitions

POL-01: At `PART-01`, prior `PublicationFault` outranks prior `AcquisitionFault`; faults outrank matching prior `Consumed`; cancellation precedes current `Start`; and `Reset` applies only in `RecoveryHold` and never starts a check.

POL-02: In `Idle`, unequal-token `Start` is fresh and emits matching acquisition, assessment, and publication directives; equal-token `Start` is `DuplicateIgnored`. In `Checking` or `AwaitingUse`, every `Start` is `Busy` and creates no new work.

POL-03: At `PART-02`, acquire emits a matching read. Exact-ticket `Present` is captured regardless of content quality; absent, unavailable, nonmatching, or incoherent no-ticket response faults. No-acquisition ignores reports; hold is fail-closed until reset.

POL-04: At `PART-04`, exact matched applicability maps `TrustedHigh -> NormalUse`, `TrustedModerate -> CautionUse`, `TrustedLow|TrustedCritical -> RestrictUse`, and `Untrusted -> Untrusted`. Inactive or mismatched applicability produces only `(NoTicket, NoAssessment)`.

POL-05: At `PART-05`, reset has priority in fault hold. Otherwise rejected, mismatched, malformed, or unexpected meaningful feedback causes fault and clearing; matching `Consumed` clears and commits consumption; `Withdraw` clears and cancels; exact matching open stores and offers the assessment; coherent inactive or matching `Pending` preserves the exact retained result. No meaningful result may persist outside offered state.

POL-06: Applicable status priority is `PublicationFailed` over `AcquisitionFailed` over `ResetCompleted` over `Completed` over `Cancelled` over `Busy` over `DuplicateIgnored` over `Available` over `Checking` over `RecoveryRequired` over `Idle`. Offered `Untrusted` still uses `Available`; only `CTRL-02` distinguishes the assessment.

POL-07: Recovery is request-driven: `Reset` in `RecoveryHold` emits both reset directives, clears both latches when applicable, and performs no acquisition; only committed reset confirmations return lifecycle to `Idle`. Retained freshness rejects the same token; only the alternate token can start work.

## Exactly twelve nontrivial contract cases

CASE-01: Exact matched current `High` shall derive `TrustedHigh` then `NormalUse` for the admitted token.

CASE-02: Exact matched current `Moderate` shall derive `TrustedModerate` then `CautionUse`.

CASE-03: Exact matched current `Low` or `Critical` shall derive corresponding trusted evidence then `RestrictUse`.

CASE-04: Captured stale, invalid, no-quality, no-level, or malformed present content shall derive `Untrusted`, never a level-derived result.

CASE-05: Requested absent, unavailable, or nonmatching response shall capture nothing, clear the read after the transaction, enter `FailureHold`, and commit `AcquisitionFault`; no assessment may be offered.

CASE-06: Equal-token `Start` in `Idle` shall be `DuplicateIgnored` with inactive directives and no state/output change.

CASE-07: Any `Start` in `Checking` or `AwaitingUse` shall be `Busy`, preserve the admitted token, and create no second acquisition or assessment.

CASE-08: `Cancel` in `Checking` or `AwaitingUse` shall withdraw and clear any offer, return lifecycle to `Idle`, retain last token, and report `Cancelled` under prior-commit ordering.

CASE-09: For an offered result, matching `Pending` shall preserve the exact retained result. Matching `Consumed` shall clear `CTRL-02`, publication phase, and retained result in the custody evaluation and commit `Consumed`; the resulting one-step state is `(AwaitingUse, Ready, Empty)`, and only the following lifecycle evaluation returns to `Idle` with `CTRL-03 = Completed`. Clearing shall not be delayed.

CASE-10: Rejected, mismatched, malformed, or unexpected meaningful feedback shall clear output and retained result, enter `FaultHold`, commit `PublicationFault`, and move lifecycle to recovery on the following evaluation; it shall never count as consumption.

CASE-11: `Reset` outside recovery shall have no effect. In recovery, one applicable reset shall direct and clear both latches, including combined hold, keep outputs fail-closed, commit both confirmations, and return lifecycle to idle only when they are evaluated.

CASE-12: In recovery, `Start`, `Cancel`, and favorable values shall not initiate work. After reset completion, same-token `Start` remains duplicate and alternate-token `Start` is the only new-acquisition path.

CASE-AUD-01: `CASE-01` through `CASE-12` are exactly twelve credited nontrivial cases spanning trusted mappings, invalid content, acquisition faults, replay, busy, cancellation, publication custody/fault, reset, and alternate-token recovery.

CASE-AUD-02: Owner contracts shall additionally be total over every uncredited ordinary branch, including no command, ignored fields, inactive inputs, offer hold, state self-transitions, support-register transitions, and unreachable-state rejection; no default may leave a controlled output unconstrained.

## Risks, fault behavior, and recovery

RISK-01: Stale, invalid, incomplete, or malformed content could otherwise be interpreted as favorable capacity and mislead logical drone-control use; no quantitative likelihood, severity, or physical consequence is asserted.

FAULT-01: `PART-03` and `PART-04` shall force `Untrusted` for every untrusted captured-present content class and make trusted assessments unreachable from those classes. Contract inspection and exhaustive analysis pass only if every such valuation yields `Untrusted` or no assessment.

RISK-02: Unavailable or mismatched acquisition and inconsistent feedback could otherwise leave stale assessment available or associate it with the wrong check; the source supplies no physical fail-safe claim.

FAULT-02: Acquisition fault shall prevent publication; publication fault shall clear the offer and retained result; simultaneous faults shall latch both; all holds shall force `NoRead/NoAssessment`; favorable evidence shall not recover; and one reset plus alternate fresh request shall be the only reopening sequence.

## Five scenario families

SCN-01: [nominal family] From initialization, start `TokenA` with matching present/high/current report; observe one read, tagged `NormalUse`, and `Available`; send matching `Pending` and preserve the exact offer; send matching `Consumed` and observe `CTRL-02` clear while the committed tuple is `(AwaitingUse, Ready, Empty)`; on the next lifecycle evaluation observe `Completed` and idle. Pass: exactly one acquisition and offer occur and completion does not delay clearing.

SCN-02: [capacity-boundary family] Run alternate-token checks with current `Moderate`, `Low`, and `Critical`, consuming each before the next. Pass: results are `CautionUse`, `RestrictUse`, and `RestrictUse`, with one principal owner.

SCN-03: [request-boundary family] After completing `TokenA`, replay `TokenA` and observe no read plus duplicate; admit `TokenB`, issue another start while active and observe busy; cancel and observe cleared output plus cancellation. Pass: no extra transaction is created and freshness history remains.

SCN-04: [invalid/fault family] Exercise all untrusted content classes; separately exercise acquisition faults, publication faults, and simultaneous acquisition plus unexpected-feedback fault on a fresh start. Pass: invalid content never yields trusted output; fault outputs clear; simultaneous entry reaches `(Checking, FailureHold, FaultHold)` then combined recovery hold with `PublicationFailed` priority.

SCN-05: [recovery family] From acquisition-only, publication-only, and combined hold, improve inputs and attempt start without reset; observe no read. Apply one reset, witness both confirmations and fail-closed outputs, replay the retained token and observe duplicate, then use the alternate token for a coherent consumed assessment. Pass: only this sequence reopens work.

SCN-AUD-01: The scenario count is exactly five: nominal/consumption, capacity boundaries, request boundaries, invalid/fault including simultaneous faults, and recovery including combined hold. Together they cover `CASE-01` through `CASE-12` and initialization.

## Structural, analysis, trace, and pass obligations

STRUCT-01: The model shall contain exactly one root system and five reachable semantic owner usages for `PART-01` through `PART-05`, all at semantic depth one after generated-support collapse.

STRUCT-02: The model shall realize exactly fourteen directed end-to-end semantic interactions for `INT-01` through `INT-14`, including eight internal owner-to-owner meanings, in one weakly connected region.

STRUCT-03: Every owner shall expose its canonical local derivation. Forwarding, bundling, one-to-one renaming, analyzer recomputation, or assigning assessment literals outside `PART-04` fails owner credit.

TRACE-01: Every required abstract item shall trace to model elements, contracts, bounded-analysis evidence, or review evidence as appropriate; `SRC` remains classified context and `DEFER` remains explicitly deferred.

TRACE-02: Every significant usage, port, connection, state variable, initialization, transition, and contract clause shall trace here or carry a specific `@generated-support` justification. Missing parents, unexplained children, new mission outputs, and silent policy changes fail acceptance.

ANALYSIS-01: The independent bounded analyzer shall compose prior commit-register values, lifecycle admission, current acyclic acquisition/qualification/assessment/custody, owner-local post-state/outcome updates, and output commit in the order of `ASM-04`, without centralizing or reproducing owner policy.

ANALYSIS-02: The analyzer shall exhaust all `8` requests, `180` reports, `12` feedback values, applicable inactive/tagged internal values, retained-assessment values, commit-register values, and every admitted state/token family in `CONSIST-01`. The raw boundary product is `17,280` snapshots before state; owner-factored enumeration is allowed but coverage may not be pruned.

ANALYSIS-03: Analysis shall prove totality, exclusivity, exact token coherence, initialized state and registers, output/state/retained-result invariants, unreachable-state rejection, trusted provenance, no invalid route to meaningful output, and all five ordered scenarios. Required explicit witnesses are consumption recognition, simultaneous fault entry, combined hold, reset confirmations, same-token rejection, and alternate-token recovery.

GEN-SUP-01: One behavior-free process may contain the five sibling semantic threads if the SysML-AADL profile requires it. It shall be marked `@generated-support`, collapse from semantic usage/depth metrics, and own no state, behavior, decision, or output.

GEN-SUP-02: `PART-02` may have `committedAcquisitionOutcome`, initialized to `NoAcquisitionOutcome`, and `PART-05` may have `committedPublicationOutcome`, initialized to `NoPublicationOutcome`. `INT-08` and `INT-11` shall expose only `In` of those registers. The acquisition register's post-state shall be matching `CapturedTokenX` for exact present capture, `AcquisitionFault` for current requested acquisition fault, `AcquisitionReset` for current reset, and `NoAcquisitionOutcome` otherwise. The publication register's post-state shall be matching `OfferedTokenX` for current opening or preservation, `Consumed` for matching consumption, `Cancelled` for withdrawal, `PublicationFault` for current feedback inconsistency, `PublicationReset` for current reset, and `NoPublicationOutcome` otherwise. Each update shall use only its owner's current directive/input/pre-state relation; current `INT-07`, `INT-09`, and `INT-10` remain the acyclic feed-forward path. These registers receive no semantic usage, interaction, owner, case, or scenario credit.

GEN-SUP-03: Flat data records with direct attributes, closed enums, inactive sentinels, ordinary ports, six root/process delegation connections, and other storage strictly necessary to realize prior commitment are permitted. Every support element shall trace to its parent clause and receive zero semantic credit.

METRIC-01: The exact final architecture metrics are `5` semantic usages, `14` semantic interactions including `8` internal meanings, `12` nontrivial contract cases, `5` scenario families, `1` principal decision owner, `1` root system, semantic containment depth `1`, and `1` weakly connected semantic region.

METRIC-02: The expected generated realization is five semantic threads, one behavior-free support process, six non-root usages including support, raw containment depth two, fourteen process-local semantic connections, six support delegations, and twenty raw `PortConnection` declarations. Only `METRIC-01` receives campaign credit.

PASS-01: Structural analysis passes only at the exact values in `METRIC-01`; support inventory must also match `METRIC-02` if that allowance is used.

PASS-02: Boundary and local-contract analysis pass only if exact finite types and sentinels are preserved; all local relations are total and exclusive; `PART-04` alone derives assessment; `CTRL-02` equals offered token plus retained result exactly; consumption clears it before delayed completion; and no fault lag leaves a controlled output active after its owner enters hold.

PASS-03: Fault/recovery analysis passes only if untrusted present data yields `Untrusted`, acquisition fault yields no assessment, publication fault clears retained result, combined faults latch together with publication-fault priority, one reset clears both, favorable evidence cannot recover, reset retains freshness, same token is rejected, and alternate-token fresh start alone reopens work.

PASS-04: Scenario validation passes only if all five families produce their stated boundary-visible outcomes without method calls, physical timing assumptions, sortie state, observation state, or delivery claims.

PASS-05: Mechanical verification passes only if architecture-stage, retained-final, and independent-harness typechecking succeed; endpoint/type/direction, metrics, and trace gates pass; and bounded analysis proves `ANALYSIS-01` through `ANALYSIS-03`. Prior vehicle-model evidence is realizability evidence only, not a pass for this source.

PASS-06: Designer validation passes only if the retained model remains a battery-status assessment service for drone-control use, preserves the fact/abstraction/architecture/deferred partitions, and is not transformed into sortie eligibility, observation coordination, data delivery, propulsion availability, or flight control.

AUTH-01: Designer-final disposition is `approved`. Model regeneration is authorized only against this final abstract and `design-selection.md`; any tool limitation affecting prior commitment, retained-result custody, state closure, exact counts, ownership, priority, or recovery shall return as a localized Model blocker and shall not weaken the policy.
