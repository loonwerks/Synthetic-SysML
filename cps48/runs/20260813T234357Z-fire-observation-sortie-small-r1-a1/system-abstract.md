---
abstract_id: SA-FOS-01
domain_seed: 20260813T233942Z-fire-observation-sortie-seed-v1
campaign_complexity: small
selected_scope: observation-sortie-eligibility-supervisor
semantic_usage_bounds: [5, 8]
selected_semantic_usage_count: 5
semantic_interaction_bounds: [7, 14]
selected_semantic_interaction_count: 14
internal_usage_interaction_count: 7
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
baseline_status: designer-final
status: designer-approved
revision_used: true
---

# Forest Observation Eligibility Supervisor

## Need, purpose, and goals

NEED-01: An observation requester needs a bounded, inspectable answer to whether one requested camera-and-radio observation service may proceed using the currently supplied energy and observation-support evidence. The need is permission control only; it is not control of flight, navigation, propulsion, fire response, or physical observation performance.

PURPOSE-01: The system will accept one logical observation request at a time, qualify the request and supplied evidence, issue or withhold observation-service authorization, publish the request outcome, withdraw authorization on completion, cancellation, or service fault, and require a fresh request after denial or recovery.

GOAL-01: The system shall never issue `Permit` unless a fresh request is pending and both energy evidence and camera/radio support evidence are currently trusted and ready. Rationale: permission must be based on all selected prerequisites, without claiming that the prerequisites make flight or observation physically safe.

GOAL-02: The system shall deterministically withhold authorization and publish one bounded reason for every non-permit request outcome. Rationale: a single reason makes the policy reviewable; the reason priority is a selected pilot policy, not a handbook or source fact.

GOAL-03: The system shall remove authorization on cancellation, completion, reported service failure, or inconsistent service-progress feedback, and shall not authorize again merely because evidence or service feedback later improves.

GOAL-04: The system shall distinguish a fresh request from a replay and shall prevent a second logical observation service while a request is pending or engaged.

## Evidence and claim classification

METHOD-01: [handbook-derived method; required process evidence] The abstract defines need and boundary before decomposition, assigns responsible external roles, compares alternatives, allocates cohesive responsibilities, closes nominal and off-nominal behavior, records assumptions and claims, and separates mechanical verification from contextual validation. These are methodology obligations derived from the Designer guidelines, not facts about the drone or forest-fire operations.

FACT-01: [source-grounded fact; informational] The frozen source names one forest-fire observation drone and observation-related equipment including a camera, radio communication equipment, power management, drone control, navigation equipment, obstacle sensing, landing gear, and four engines.

FACT-02: [source-grounded fact; design consequence] The source explicitly obtains and analyzes a qualitative battery-capacity status and makes that status available to drone control. This supports selecting qualitative energy evidence as a monitored input, but it does not define status literals or readiness policy.

FACT-03: [source-grounded fact; informational] The source selects a long-distance battery variant and structurally contains four engines with alternating propeller kinds. No sufficiency, redundancy, endurance, controllability, or flight-dynamics claim follows.

ABS-01: [pilot abstraction; required] One observation service is abstracted as a camera observation made deliverable through radio support. `AvailableCurrent` is evidence supplied by an external role; it is not measured or proven by this system.

ABS-02: [pilot abstraction; required] A qualitative energy vocabulary of `AdequateCurrent`, `LowCurrent`, `UnknownCurrent`, `Invalid`, and `Stale` is selected because the source does not enumerate battery status or define freshness and validity.

ABS-03: [pilot abstraction; required] Request tokens alternate between two finite values. A token unequal to the last accepted token denotes a fresh request; equality denotes a replay. This is an experiment mechanism for finite fresh-request behavior, not a physical protocol claim.

ABS-04: [representation refinement; required] Explicit `NoTicket`, `NoContext`, no-verdict, and `NoDecision` literals represent inactive values on ordinary typed data ports. They realize already-required absence and totality; they are not domain events, additional interactions, owner-local decisions, or evidence of work performed.

ARCH-01: [selected architecture; required] Five peer semantic usages beneath one root separate request lifecycle, energy assessment, observation-support assessment, eligibility arbitration, and authorization gating. Only the eligibility arbiter owns the principal permit/deny policy.

DEFER-01: [deferred claim] Fire detection, classification, localization, coverage, response, and counteraction are outside the model and shall not appear as requirements, outputs, or validation claims.

DEFER-02: [deferred claim] Flight dynamics, navigation accuracy, obstacle avoidance, endurance, charging behavior, propulsion sufficiency, landing behavior, observation quality, radio performance, physical safety, certification, and production readiness are not assessed. `Permit` means only that this abstract supervisor's logical prerequisites passed.

DEFER-03: [deferred evidence] Code generation, application execution, physical timing, formal proof beyond retained model contracts, and safety certification are `not-run`; the seed declares no executable profile.

## Operational context and boundary

CTX-01: [inferred external role] The Observation Requester supplies request commands and alternating request tokens and receives the published request outcome. It does not receive mission authority from this system.

CTX-02: [inferred external role from named equipment] The Power Evidence Source supplies one qualitative battery evidence value and is responsible for the declared meaning, validity, and freshness of that value.

CTX-03: [inferred external role from named camera] The Camera Evidence Source supplies camera-support evidence and is responsible for the declared meaning, validity, and freshness of that value.

CTX-04: [inferred external role from named radio equipment] The Radio Evidence Source supplies radio-support evidence and is responsible for the declared meaning, validity, and freshness of that value.

CTX-05: [inferred external role] The Observation Service consumes logical authorization and reports its progress. The service, its payload behavior, and any flight or communications implementation remain outside the boundary.

SCOPE-01: The system boundary contains only the five usages in `PART-01` through `PART-05`, their two owned state sets, the finite qualification and arbitration policy, and the two controlled outputs. Sensors, battery, camera, radio, drone control, propulsion, airframe, navigation, forest environment, operator organization, and physical service execution are outside.

MON-01: `RequestInput` from `CTX-01` is the finite pair `RequestCommand = {NoCommand, Begin, Cancel}` and `RequestToken = {TokenA, TokenB}`. `Begin` is fresh exactly when its token differs from the last accepted token; `Cancel` applies to the outstanding request and does not require a new token.

MON-02: `EnergyEvidence` from `CTX-02` is exactly `{AdequateCurrent, LowCurrent, UnknownCurrent, Invalid, Stale}`. Units and numeric thresholds are intentionally absent because the source establishes only a qualitative status.

MON-03: `CameraEvidence` from `CTX-03` is exactly `{AvailableCurrent, UnavailableCurrent, UnknownCurrent, Invalid, Stale}`.

MON-04: `RadioEvidence` from `CTX-04` is exactly `{AvailableCurrent, UnavailableCurrent, UnknownCurrent, Invalid, Stale}`.

MON-05: `ObservationProgress` from `CTX-05` is exactly `{Idle, Active, Completed, Failed}`. `Active` while the authorization gate is closed and regression from gate phase `Active` to reported progress `Idle` without `Completed` are inconsistent feedback and are treated as service faults; the value does not prove physical cessation or success.

CTRL-01: `ObservationAuthorization` to `CTX-05` is exactly `{Withhold, Permit}`. `Withhold` is the initialized and fail-closed value. The directly controlled effect is only whether this system grants logical permission to the external observation service.

CTRL-02: `EligibilityStatus` to `CTX-01` is exactly `{Idle, Evaluating, Authorized, Active, DeniedPower, DeniedSupport, DuplicateIgnored, Busy, Cancelled, Completed, ServiceFailed, AwaitingRecovery}`. It reports the current transition outcome and does not assert physical mission success.

## Environmental assumptions and selected logical ordering

ASM-01: `CTX-01` shall alternate `TokenA` and `TokenB` on successive genuinely new `Begin` commands and shall retain the current token for a retry of the same request. Rationale: a two-value finite token lets the model distinguish freshness without unbounded identifiers; violation fails closed as `DuplicateIgnored`.

ASM-02: `CTX-02`, `CTX-03`, and `CTX-04` are responsible for using `Current`, `Stale`, `Invalid`, and `Unknown` consistently with their own evidence. The supervisor does not independently measure age or diagnose a source.

ASM-03: The evidence values presented for an accepted evaluation ticket shall remain stable until the corresponding verdict is consumed. Rationale: this logical snapshot assumption avoids inventing physical time bounds and gives one request one coherent evidence set.

ASM-04: `CTX-05` shall honor `Withhold` as removal of logical permission and shall eventually report `Completed`, `Failed`, or `Idle` according to its own behavior. This is an environmental contract assumption, not evidence that a physical payload or aircraft stops safely.

ASM-05: A logical step processes previously committed gate feedback before a new request command, and a new permit decision takes effect after both verdicts for the same evaluation ticket exist. Rationale: deterministic abstract ordering closes simultaneous completion, failure, cancellation, and fresh-request cases without asserting a schedule or latency.

## Parts, local contracts, and cohesive responsibilities

PART-01: `RequestLifecycle` owns request freshness, the single-outstanding-request lifecycle, and `EligibilityStatus`. From request input, the last accepted token, and prior committed gate outcome it derives `RequestState`, `RequestDisposition`, the next evaluation-ticket values, and request context; it is not a forwarding or reporting-only usage.

PART-02: `EnergyAssessor` owns request-scoped energy qualification. For a real ticket it derives exactly one meaningful `EnergyVerdict = {EnergyReady, EnergyInsufficient, EnergyUntrusted}` from `EnergyEvidence`; for `NoTicket` it produces only the generated-totality pair `(NoTicket, NoEnergyVerdict)`. The inactive pair earns no semantic credit.

PART-03: `ObservationSupportAssessor` owns request-scoped support qualification. For a real ticket it derives exactly one meaningful `SupportVerdict = {SupportReady, SupportUnavailable, SupportUntrusted}` from both camera and radio evidence; for `NoTicket` it produces only `(NoTicket, NoSupportVerdict)`. It neither authorizes service nor forwards either raw input.

PART-04: `EligibilityArbiter` is the sole principal decision owner. From request context and the two ticket-matched verdicts it derives one meaningful `EligibilityDecision = {Permit, DenyPower, DenySupport, Withdraw}` under the priority policy; it emits `NoDecision` for inactive, absent, or mismatched evaluation data and owns no request or gate state.

PART-05: `AuthorizationGate` owns `ObservationAuthorization` and gate phase. From eligibility decision, current gate phase, and service progress it derives `GatePhase` and `GateOutcome`; `NoDecision` makes no eligibility update, but never suppresses its higher-priority completion, failure, inconsistency, ordinary-progress, or recovery rules.

OWN-01: Ownership audit result: all five semantic usages derive a distinct owner-local fact. `PART-01` owns lifecycle/freshness, `PART-02` owns non-bijective energy qualification, `PART-03` owns joint non-bijective camera/radio qualification, `PART-04` alone owns the principal eligibility decision, and `PART-05` owns authorization application and service-progress protection. Sentinel propagation is generated totality support and gives no owner or usage credit.

LOCAL-01: The canonical `PART-01` contract shall distinguish fresh, replay, busy, cancellation, no-command, feedback, and recovery-hold branches using its own pre-state and shall produce coherent ticket/context sentinels without recomputing either assessor or arbiter policy.

LOCAL-02: The canonical `PART-02` contract shall map the five energy values to the three meaningful verdicts with output-fiber sizes `1/1/3`; it shall tag every meaningful verdict with the input real ticket and allow `NoEnergyVerdict` exactly with `NoTicket`.

LOCAL-03: The canonical `PART-03` contract shall map all twenty-five camera/radio pairs to the three meaningful verdicts with output-fiber sizes `1/3/21`; it shall tag every meaningful verdict with the input real ticket and allow `NoSupportVerdict` exactly with `NoTicket`.

LOCAL-04: The canonical `PART-04` contract shall enforce context applicability, exact real-ticket agreement, and the principal priority relation locally. Only a fresh evaluation with both matched ready verdicts may produce `Permit`; inactive, absent, or mismatched values shall produce `NoDecision`.

LOCAL-05: The canonical `PART-05` contract shall combine its own pre-state, decision input, and progress input to implement fail-closed application, phase progression, completion, inconsistency detection, and recovery. It shall not copy `Permit` to authorization without phase/progress conditions and shall not recompute evidence eligibility.

## State and decision ownership

STATE-01: `RequestState = {Idle, Pending, Engaged, RecoveryHold}` and `LastAcceptedToken = {None, TokenA, TokenB}` are owned only by `PART-01`. Initialization is `(Idle, None)`; accepting a fresh `Begin` records its token.

STATE-02: `GatePhase = {Closed, Authorized, Active, FailureHold}` is owned only by `PART-05`. Initialization is `Closed`, paired with `CTRL-01 = Withhold`.

STATE-03: `PART-02`, `PART-03`, and `PART-04` are logically stateless across completed evaluations. Any same-ticket storage used to join one bounded evaluation is generated support and creates neither a policy nor a semantic usage.

CONSIST-01: The only admissible committed `(RequestState, GatePhase)` pairs are `(Idle, Closed)`, `(Pending, Closed)`, `(Engaged, Authorized)`, `(Engaged, Active)`, and `(RecoveryHold, FailureHold)`. `INIT-01` and every transition shall preserve this invariant atomically; the bounded analyzer shall reject any other pre-state pair as unreachable internal inconsistency rather than silently assigning it a normal policy result.

DEC-01: `PART-04` is the one principal decision owner. `PART-01` decides only freshness and lifecycle admission by fixed state rules, assessors derive qualification facts, and `PART-05` applies or overrides authorization for service-progress protection; none may independently recompute `Permit`, `DenyPower`, or `DenySupport`.

TRANS-01: `PART-01` transitions `Idle -> Pending` on a fresh `Begin`; `Pending -> Engaged` on `Authorized` or `Active`; `Pending|Engaged -> Idle` on `DeniedPower|DeniedSupport|Cancelled|Completed`; any non-recovery state goes to `RecoveryHold` on `Failed`; and `RecoveryHold -> Idle` only on `Recovered`. Replay, busy, and `NoCommand` cases do not create a second request.

TRANS-02: `PART-05` transitions `Closed -> Authorized` on `Permit` with progress `Idle`; `Authorized -> Active` on progress `Active`; `Authorized|Active -> Closed` on `Withdraw`, denial, or `Completed`; any phase goes to `FailureHold` on `Failed`, `Closed` also goes to `FailureHold` on inconsistent `Active`, and `Active` goes to `FailureHold` on an `Idle` regression; `FailureHold -> Closed` only when progress becomes `Idle`.

MODE-01: The externally distinguishable system conditions are quiescent (`Withhold`, `Idle`), evaluating (`Withhold`, `Evaluating`), engaged (`Permit`, `Authorized|Active`), denied (`Withhold`, one denial status), and recovery hold (`Withhold`, `ServiceFailed|AwaitingRecovery`). These are observable combinations of owned state and outputs, not an additional state owner.

## Complete typed directed interaction inventory

INT-01: Root boundary `MON-01 -> PART-01`, type `RequestInput`. This delivers the command/token pair to its sole freshness and lifecycle owner.

INT-02: Root boundary `MON-02 -> PART-02`, type `EnergyEvidence`. This delivers qualitative energy evidence to its sole qualification owner.

INT-03: Root boundary `MON-03 -> PART-03`, type `CameraEvidence`. This is one of two distinct evidence inputs used for joint observation-support qualification.

INT-04: Root boundary `MON-04 -> PART-03`, type `RadioEvidence`. This is the other distinct evidence input used for joint observation-support qualification.

INT-05: Root boundary `MON-05 -> PART-05`, type `ObservationProgress`. This provides service progress only to the authorization and recovery state owner.

INT-06: `PART-01 -> PART-02`, type `EvaluationTicket = {NoTicket, TokenA, TokenB}`. A real token initiates energy qualification; `NoTicket` is the inactive data-port value and does not initiate semantic work.

INT-07: `PART-01 -> PART-03`, type `EvaluationTicket = {NoTicket, TokenA, TokenB}`. A real token initiates joint camera/radio support qualification; `NoTicket` is inactive.

INT-08: `PART-01 -> PART-04`, type `RequestContext = {NoContext, EvaluateTokenA, EvaluateTokenB, CancelOutstanding}`. It identifies lifecycle-authorized evaluation or withdrawal; replay, busy, safe idle cancellation, recovery hold, and no-command branches produce `NoContext`.

INT-09: `PART-02 -> PART-04`, flat record `TaggedEnergyVerdict` with `attribute ticket : EvaluationTicket` and `attribute verdict : EnergyVerdict`, where `EnergyVerdict = {NoEnergyVerdict, EnergyReady, EnergyInsufficient, EnergyUntrusted}`. Exactly `(NoTicket, NoEnergyVerdict)` represents inactivity; a real ticket shall have a meaningful verdict, and no-verdict shall never accompany a real ticket.

INT-10: `PART-03 -> PART-04`, flat record `TaggedSupportVerdict` with `attribute ticket : EvaluationTicket` and `attribute verdict : SupportVerdict`, where `SupportVerdict = {NoSupportVerdict, SupportReady, SupportUnavailable, SupportUntrusted}`. Exactly `(NoTicket, NoSupportVerdict)` represents inactivity; a real ticket shall have a meaningful verdict, and no-verdict shall never accompany a real ticket.

INT-11: `PART-04 -> PART-05`, type `EligibilityDecision = {NoDecision, Permit, DenyPower, DenySupport, Withdraw}`. `NoDecision` is the inactive value and cannot open, reapply, or close authorization by eligibility policy; it does not inhibit higher-priority gate rules.

INT-12: `PART-05 -> PART-01`, type `GateOutcome = {None, DeniedPower, DeniedSupport, Authorized, Active, Cancelled, Completed, Failed, Recovered}`. This is prior committed feedback that closes lifecycle, fault, and recovery paths without returning raw service progress.

INT-13: `PART-05 -> CTRL-01` at the root boundary, type `ObservationAuthorization`. The gate is the sole semantic producer of logical permission.

INT-14: `PART-01 -> CTRL-02` at the root boundary, type `EligibilityStatus`. The lifecycle owner is the sole semantic producer of requester-facing outcome.

INT-AUD-01: Interaction recount is exactly fourteen directed semantic interactions, `INT-01` through `INT-14`: five boundary-input deliveries, seven usage-to-usage deliveries, and two boundary-output deliveries. The five-usage graph has one weakly connected region. Sentinel refinements alter payload values only; they add no endpoint or interaction.

## Total finite policy partitions and priority

POL-01: Request admission is total. After prior gate feedback is applied: `NoCommand` preserves state and publishes state-consistent status; `Cancel` creates `CancelOutstanding` only in `Pending|Engaged`, is a safe no-op in `Idle`, and retains recovery hold; `Begin` in recovery hold yields `AwaitingRecovery`; `Begin` with the last accepted token yields `DuplicateIgnored`; a fresh `Begin` in `Idle` yields `Pending` and both real evaluation tickets with matching evaluation context; and a fresh `Begin` in `Pending|Engaged` yields `Busy`. Every branch that initiates neither evaluation nor cancellation produces `NoTicket` on `INT-06` and `INT-07` and `NoContext` on `INT-08`.

POL-02: Energy qualification is total: `NoTicket -> (NoTicket, NoEnergyVerdict)`; for each real ticket, `AdequateCurrent -> EnergyReady`, `LowCurrent -> EnergyInsufficient`, and `UnknownCurrent|Invalid|Stale -> EnergyUntrusted`, with the same real ticket in the output tag. No other ticket/verdict combination is valid.

POL-03: Observation-support qualification is total: `NoTicket -> (NoTicket, NoSupportVerdict)`; for each real ticket, both evidence values `AvailableCurrent -> SupportReady`; otherwise any `UnknownCurrent|Invalid|Stale -> SupportUntrusted`; otherwise at least one `UnavailableCurrent -> SupportUnavailable`, with the same real ticket in the output tag. No other ticket/verdict combination is valid.

POL-04: Eligibility arbitration is total. `CancelOutstanding -> Withdraw`; an evaluation context produces a meaningful decision only when both verdict tags equal its real token and both verdicts are meaningful; then energy insufficient or untrusted yields `DenyPower`, else support unavailable or untrusted yields `DenySupport`, else the all-ready pair yields `Permit`. `NoContext`, either coherent inactive tagged verdict, any no-verdict on a real ticket, or any real-ticket mismatch yields `NoDecision`, never `Permit`.

POL-05: Principal decision priority is `withdrawal > power denial > support denial > permit`. Overall same-step outcome priority is `reported failure or inconsistent progress > withdrawal > valid completion > denial or permit > ordinary progress`. This ordering chooses one observable reason; it does not rank physical hazards.

POL-06: Gate application is total under `POL-05`. In `FailureHold`, every decision including `NoDecision` is ignored and authorization stays `Withhold`; `Idle` progress emits `Recovered` and closes the gate, while other progress retains failure hold. Outside failure hold, failure or inconsistent progress enters failure hold; `Withdraw` closes any nonfailed phase; valid `Completed` closes an authorized or active phase; denial closes any nonfailed phase; `Permit` with `Idle` opens a closed gate or retains an authorized/active gate; ordinary `Active` progresses or retains an authorized/active phase; and `Idle` preserves a closed or authorized phase. `NoDecision` makes no eligibility update while all failure, inconsistency, completion, ordinary-progress, and recovery clauses retain their stated precedence.

POL-07: Recovery is total and non-spontaneous. Improved evidence does not leave `Idle`, reopen a closed gate, or clear `RecoveryHold`. After denial, a fresh token is required for reevaluation. After service fault, `ObservationProgress = Idle` must first produce `Recovered`, and only a subsequent fresh `Begin` may be evaluated.

## Required nontrivial contract cases

INIT-01: [owners `PART-01` and `PART-05`; required initialization outside the nontrivial case count] Gate phase shall initialize to `Closed`, authorization to `Withhold`, request lifecycle to `(Idle, None)`, status to `Idle`, both ticket outputs to `NoTicket`, request context to `NoContext`, both tagged verdicts to their coherent inactive pairs, and decision to `NoDecision`. Verification: initialization and contract inspection. Pass criterion: every fact is explicit and no unconstrained initial permit path exists.

CASE-01: [owner `PART-04`; nominal permit] For a fresh admitted request with ticket-matched `EnergyReady` and `SupportReady`, gate phase `Closed`, and progress `Idle`, the arbiter shall produce `Permit`, the gate shall become `Authorized`, and status shall become `Authorized`. Verification: local contracts plus bounded end-to-end scenario. Pass criterion: the exact premise implies these outputs and no denial.

CASE-02: [owner `PART-04`; energy boundary] For a fresh admitted request with gate phase `Closed`, progress `Idle`, and `EnergyInsufficient`, regardless of support verdict, the arbiter shall produce `DenyPower`, authorization shall remain `Withhold`, status shall be `DeniedPower`, and request state shall return to `Idle`. Verification: finite contract analysis. Pass criterion: all three meaningful support classes are subsumed without a permit case.

CASE-03: [owner `PART-04`; invalid energy] For a fresh admitted request with gate phase `Closed`, progress `Idle`, and `EnergyUntrusted`, regardless of support verdict, the arbiter shall produce `DenyPower`, authorization shall remain `Withhold`, status shall be `DeniedPower`, and request state shall return to `Idle`. Verification: analysis over `UnknownCurrent`, `Invalid`, and `Stale`. Pass criterion: every listed literal reaches this result.

CASE-04: [owner `PART-04`; support boundary] For a fresh admitted request with gate phase `Closed`, progress `Idle`, `EnergyReady`, and `SupportUnavailable`, the arbiter shall produce `DenySupport`, authorization shall remain `Withhold`, status shall be `DeniedSupport`, and request state shall return to `Idle`. Verification: contract analysis. Pass criterion: either known camera or radio unavailability reaches this result.

CASE-05: [owner `PART-04`; invalid support] For a fresh admitted request with gate phase `Closed`, progress `Idle`, `EnergyReady`, and `SupportUntrusted`, the arbiter shall produce `DenySupport`, authorization shall remain `Withhold`, status shall be `DeniedSupport`, and request state shall return to `Idle`. Verification: contract analysis. Pass criterion: unknown, invalid, or stale camera or radio evidence reaches this result and cannot permit.

CASE-06: [owner `PART-01`; replay boundary] After higher-priority gate feedback is applied, a `Begin` using the last accepted token shall yield `DuplicateIgnored`, produce `NoTicket/NoTicket/NoContext`, and leave resulting gate authorization unchanged. Verification: local state/contract inspection and sentinel-path analysis. Pass criterion: a replay creates no semantic evaluation and cannot produce a meaningful decision or second permit.

CASE-07: [owner `PART-01`; concurrency boundary] After higher-priority gate feedback is applied, a fresh `Begin` while request state remains `Pending|Engaged` shall yield `Busy`, produce `NoTicket/NoTicket/NoContext`, retain the existing request token, and leave resulting authorization unchanged. Verification: local state/contract inspection. Pass criterion: exactly one outstanding request remains and the inactive pipeline cannot produce a meaningful decision.

CASE-08: [owner `PART-04`; cancellation] In the absence of a concurrent service fault, `Cancel` while `Pending|Engaged` shall take withdrawal priority, produce `Withdraw`, close the gate with `Withhold`, publish `Cancelled`, and return lifecycle to `Idle`. Verification: transition and contract analysis. Pass criterion: cancellation cannot be masked by ready evidence, completion, or pending permit.

CASE-09: [owner `PART-05`; completion] In the absence of concurrent service fault or cancellation, `Completed` while gate phase is `Authorized|Active` shall override retained permit or `NoDecision`, set `Withhold`, close the gate, publish `Completed`, and return lifecycle to `Idle`. Verification: transition and contract analysis. Pass criterion: no completed request retains authorization.

CASE-10: [owner `PART-05`; reported service failure] `Failed` in any gate phase shall set `Withhold`, enter `FailureHold`, publish `ServiceFailed`, and drive lifecycle to `RecoveryHold`, regardless of eligibility input including `NoDecision`. Verification: fault-contract analysis. Pass criterion: all four gate phases fail closed and block permit while held.

CASE-11: [owner `PART-05`; inconsistent service progress] `Active` while gate phase is `Closed`, or `Idle` while gate phase is `Active` without intervening `Completed`, shall set `Withhold`, enter `FailureHold`, publish `ServiceFailed`, and drive lifecycle to `RecoveryHold`, including when decision is `NoDecision`. Verification: fault-contract analysis. Pass criterion: both inconsistencies fail closed.

CASE-12: [owner `PART-01`; recovery and fresh request] While in `RecoveryHold`, any `Begin` before idle recovery shall publish `AwaitingRecovery`, keep the evaluation pipeline inactive, and cannot authorize. Progress `Idle` shall emit `Recovered`, close the gate, return request state to `Idle`, and publish `Idle`; a subsequent fresh `Begin` may reach `Permit` only through `CASE-01`. Verification: two-request bounded scenario. Pass criterion: recovery requires idle feedback and a fresh token, with no spontaneous reauthorization.

CASE-AUD-01: Nontrivial contract-case recount is exactly twelve, `CASE-01` through `CASE-12`, in addition to required initialization `INIT-01`. Sentinel branches refine the existing cases and total policies; they do not add a thirteenth semantic case.

## Risks and fault mitigations

RISK-01: If stale, invalid, unknown, absent, or mismatched energy/camera/radio evaluation data were treated as ready, the supervisor could authorize service without its selected logical prerequisites being established. Likelihood and physical severity are unknown and intentionally unclassified.

FAULT-01: The system shall mitigate `RISK-01` by mapping untrusted evidence to non-ready verdicts, representing inactivity coherently, rejecting absent or mismatched tagged data with `NoDecision`, and allowing only a fresh all-ready matched combination to reach `Permit`. Verification: exhaustive finite analysis. Pass criterion: no untrusted, inactive, incoherent, or mismatched path reaches permit.

RISK-02: If authorization remained asserted after cancellation, completion, service failure, or inconsistent progress, the external service could retain this system's logical permission after the request ended or became inconsistent.

FAULT-02: The gate shall mitigate `RISK-02` by applying withdrawal, completion, failure, unauthorized-active, and active-to-idle regression rules before ordinary decision application, always producing `Withhold` before recovery. Verification: state-transition and fault-contract analysis. Pass criterion: each initiator has a direct fail-closed transition and no recovery transition produces `Permit`.

## Bounded scenario families

SCN-01: [nominal family] From initialized idle, submit fresh `Begin/TokenA` with all current-ready evidence; matched verdicts cause `Permit`; progress becomes `Active` then `Completed`; outcome returns to `Withhold/Completed/Idle`. Pass criterion: evaluating, authorized/active, and completed occur once for one request.

SCN-02: [boundary family] Complete `TokenA`, replay `TokenA`, and observe `DuplicateIgnored` with the sentinel pipeline and `NoDecision`; then admit `TokenB`, and while engaged send `TokenA`, observing `Busy` without replacement or authorization change. Pass criterion: neither variant creates a second semantic evaluation or decision.

SCN-03: [qualification boundary and invalid-evidence family] Run four sequential fresh requests: low energy with ready support yields `DeniedPower`; adequate energy with known camera unavailability yields `DeniedSupport`; adequate energy with stale camera yields `DeniedSupport`; invalid energy with otherwise ready support yields priority `DeniedPower`. Pass criterion: known-not-ready and untrusted classes are denied and each denial returns idle.

SCN-04: [service-fault family] Authorize, become active, then report `Failed`; observe `Withhold`, `ServiceFailed`, and recovery hold. Separately test `Active` while closed and active-to-`Idle` regression without completion, including `NoDecision` inputs; observe the same fail-closed result. Pass criterion: all initiators enter recovery hold and block permit.

SCN-05: [recovery family] From recovery hold, improve evidence and attempt `Begin`; observe inactive pipeline and no permit. Report service `Idle`, observe recovery, submit alternate fresh token, obtain one ready permit, cancel, and observe `Withhold/Cancelled`. Pass criterion: ordering is idle feedback, fresh request, new decision; evidence alone never authorizes.

SCN-AUD-01: Scenario-family recount is exactly five, `SCN-01` through `SCN-05`, covering nominal, boundary, invalid/fault, and recovery behavior. `SCN-01` covers `CASE-01/09`; `SCN-02` covers `CASE-06/07`; `SCN-03` covers `CASE-02..05`; `SCN-04` covers `CASE-10/11`; `SCN-05` covers `CASE-08/12`; `INIT-01` precedes every family.

## Structural, local-contract, and trace obligations

STRUCT-01: The model shall contain exactly one root system and exactly five reachable semantic owner usages corresponding to `PART-01` through `PART-05`, all at semantic containment depth one after generated-support collapse. No context actor or behavior-free container is a semantic usage.

STRUCT-02: The model shall realize exactly fourteen end-to-end semantic flows corresponding to `INT-01` through `INT-14`: five boundary inputs, seven internal usage-to-usage flows, and two boundary outputs, in one weakly connected semantic region. Payload sentinels and concrete delegation hops create no new semantic flow.

STRUCT-03: Every owner shall have canonical owner-local contract or state derivation for `OWN-01`; forwarding, one-to-one renaming, bundling, routing, or centralized recomputation fails semantic-usage credit.

TRACE-01: Every required `NEED`, `PURPOSE`, `GOAL`, `METHOD`, `ABS`, `ARCH`, `CTX`, `SCOPE`, `MON`, `CTRL`, `ASM`, `PART`, `OWN`, `LOCAL`, `STATE`, `CONSIST`, `DEC`, `TRANS`, `MODE`, `INT`, `POL`, `INIT`, `CASE`, `RISK`, `FAULT`, `SCN`, `STRUCT`, `ANALYSIS`, `GEN-SUP`, `PASS`, and `AUTH` item shall trace to model elements, local contract clauses, analyzer evidence, or review evidence as appropriate. Informational facts remain context and all `DEFER` items remain explicitly deferred.

TRACE-02: Every significant model usage, port, connection, state variable, transition, and contract clause shall trace to this abstract or carry a specific `@generated-support` justification. An unexplained component, output, policy case, or state fails even when counts remain in range.

## Bounded end-to-end analysis obligations

ANALYSIS-01: The bounded analyzer shall compose one logical transition in this order: prior committed `INT-12` feedback, request admission and sentinel selection, ticketed assessment, exact ticket/context match and arbitration, gate application, then committed next-state/output pair. This is analysis ordering, not a physical schedule or latency claim.

ANALYSIS-02: The analyzer shall exhaust every request command/token over every admissible committed state pair, every energy literal, all twenty-five camera/radio pairs, every coherent and deliberately incoherent tagged-verdict combination, every request context, every eligibility decision including `NoDecision`, and every gate phase/progress pair.

ANALYSIS-03: Owner checks shall execute each local relation at its owning usage and consume downstream values only through `INT-06` through `INT-12`; the analyzer shall not recompute freshness, evidence verdicts, eligibility, gate outcomes, or status from root evidence at a downstream owner.

ANALYSIS-04: End-to-end checks shall establish ticket coherence, inactivity propagation, the five admissible committed state pairs, totality without overlaps or gaps, the exact priority rules, no inactive/mismatched/untrusted-to-permit path, and execution of all five ordered scenario families.

## Generated-support allowances

GEN-SUP-01: One behavior-free `Process` may appear beneath the sole root `System` to contain the five sibling contract-bearing owner `Thread`s. It shall carry `@generated-support`, trace to `ARCH-01/STRUCT-01`, and collapse from semantic usage and depth metrics.

GEN-SUP-02: The seven boundary semantic interactions may each use two concrete delegation hops and the seven internal interactions one direct sibling connection, yielding exactly twenty-one raw `PortConnection` declarations. Every delegation hop shall carry `@generated-support` and its corresponding `INT` trace; raw hops receive no semantic-interaction credit.

GEN-SUP-03: Flat records, enum declarations, inactive sentinel literals, behavior-free ports, and same-ticket join storage may be generated only as needed to type and analyze the approved fourteen interactions. They shall not introduce an owner, policy, endpoint, scenario, case, or claim.

GEN-SUP-04: `INT-12` shall be represented as prior committed feedback under `ASM-05`, never as an instantaneous algebraic fixed point. Any support needed to retain the committed value shall be behaviorally neutral and shall not receive state-owner or usage credit.

## Acceptance and authorization

PASS-01: Structural analysis passes only at exactly five semantic usages, fourteen semantic interactions with exactly seven internal flows, twelve nontrivial contract cases, five scenario families, one root, semantic depth one, one weakly connected region, and one principal decision owner.

PASS-02: Boundary inspection passes only if all five monitored inputs and two controlled outputs use their exact declared finite sets, compatible directions/types, and `Withhold` as the safe initial/fault value; internal sentinel refinements shall not alter the boundary.

PASS-03: Ownership analysis passes only if `PART-04` is the sole principal decision owner, `PART-01` and `PART-05` are the sole persistent state owners, all five facts are derived locally, and neither generated support nor analyzer recomputation earns owner credit.

PASS-04: Contract analysis passes only if `POL-01` through `POL-07` are consistent and total over declared finite values and admissible pre-states; sentinel coherence, invariant preservation, all twelve cases, and absence of invalid, stale, inactive, mismatched, replay, busy, completion, cancellation, fault, inconsistency, or recovery paths to unauthorized permit are explicit.

PASS-05: Behavioral validation passes only if all five scenario families produce their stated observable outcomes and demonstrate nominal, boundary, invalid/fault, and recovery behavior without internal method calls or unstated timing.

PASS-06: Mechanical verification passes only if architecture-stage, retained-final, and independent-harness SysML-AADL typechecking succeed; every endpoint resolves; types/directions match; and local-contract, analyzer, metrics, and trace checks are green. These verify conformance, not physical mission fitness.

PASS-07: Designer validation passes only if the retained model still controls observation-service eligibility, respects source/abstraction/design/deferred distinctions, introduces no fire-response or flight-performance claim, and preserves fail-closed and fresh-request recovery behavior.

PASS-08: Visualization passes only if one `system-overview` shows the root boundary, all five semantic usages, all fourteen semantic flows including seven internal flows, and two controlled outcomes without treating context actors, generated support, or deferred claims as semantic capabilities.

AUTH-FINAL-01: The Model Agent is authorized to generate from this approved revised baseline. It shall implement the explicit inactive-value refinement and all retained obligations without changing scope, endpoint inventory, metrics, ownership, priority, recovery, generated-support limits, or deferred-claim boundary.
