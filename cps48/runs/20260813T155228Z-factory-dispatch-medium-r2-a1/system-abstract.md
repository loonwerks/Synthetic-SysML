---
abstract_id: SA-FACTORY-FLOW-MEDIUM-R2-02
domain_seed: 20260813T004233Z-factory-dispatch-seed-v1
campaign_complexity: medium
semantic_usage_count: 9
semantic_interaction_count: 21
nontrivial_contract_case_count: 20
scenario_family_count: 8
raw_non_root_node_count: 10
containment_depth: 2
requires_stateful_behavior: true
requires_fault_behavior: true
executable_profile: false
status: designer-approved
---

# Fixed-Line Production Flow Supervisor

## Need, purpose, and goals

NEED-01: A Manufacturer operating the seed's fixed angle-production sequence needs a bounded logical supervisor that admits one work item, preserves its identity while it progresses through heating, bending, cutting, drilling, grinding, and polishing, and makes blocked, failed, recovered, and completed progress observable without controlling finished-product dispatch.

PURPOSE-01: The system will coordinate logical production flow from a scheduling request and material handoff through step release, step-to-step transfer, one bounded same-step retry, and production completion reporting. It does not execute a physical process, schedule multiple jobs, manage shipment, or certify product quality.

GOAL-01: The system shall start a well-formed work item only when its correlated material and the heating step are qualified ready.

GOAL-02: The system shall preserve one active work identity and advance it only in the source-grounded step order.

GOAL-03: The system shall make fresh-admission, material-wait, station-wait, active, recovery, completion, and failure outcomes externally distinguishable.

GOAL-04: The system shall prevent a fresh request from displacing active, transfer-pending, or recovery-pending work; a pending retry shall outrank simultaneous fresh admission.

GOAL-05: The system shall correlate process results to the active work item and step, permit at most one later retry of a failed step, and terminate rather than retry a second failure.

## Provenance and claim classes

FACT-SRC-01: The frozen seed establishes a factory context containing Customer, Manufacturer, and Supplier names and Manufacturer capabilities including production scheduling, production, and storage. This is source-grounded vocabulary, not evidence of real organizational authority.

FACT-SRC-02: The frozen seed establishes the structural production sequence `Heating -> Bending -> Cutting -> Drilling -> Grinding -> Polishing`. It does not establish dynamic progression, station readiness, completion sensing, alternate routing, retry, timing, or quality semantics.

FACT-SRC-03: The frozen seed makes product order, material provision, product production, product availability, and inventory vocabulary available, while warning that several source attributes are untyped and connections may be inconsistent. No finite values below are inferred from those source declarations.

FACT-METH-01: The implementation-independent boundary, unique trace identifiers, nominal/off-nominal scenarios, explicit assumptions, cohesive responsibility allocation, finite partitions, objective pass criteria, alternatives, and verification-versus-validation distinction are handbook-derived methodology requirements applied to this pilot.

PILOT-01: The finite identifiers, validity values, single-work capacity, readiness categories, logical process events, state machine, priority rule, transfer-wait behavior, one-retry recovery, output meanings, and bounded analyzer are selected pilot abstractions. They are not source facts or claims about an operating factory.

ARCH-SEL-01: The selected architecture uses nine responsibility-bearing semantic usages and 21 typed directed semantic interactions. One behavior-free Process may be introduced only as generated support needed for legal containment and boundary delegation.

MODEL-REV-01: The Designer accepts the Model review findings as generation-feasibility evidence for this frozen design. They do not verify the generated source, add domain behavior, change an owner, interaction, case, scenario, metric, boundary quantity, or deferred claim, or give semantic credit to generated support.

CLAIM-01: Requirements in this abstract specify logical model behavior. They do not assert physical actuation, process quality, material consumption, throughput, timing, safety, certification, or executable application behavior.

## Operational context and boundary

CTX-01: Production Scheduling is external. It supplies at most one presented production-work request per evaluation and receives logical flow status and terminal production outcome.

CTX-02: Storage Material Handoff is external. It reports whether material correlated to the presented fresh work identifier is ready, unavailable, or of unknown validity; it is not controlled by this system.

CTX-03: Fixed Angle-Production Line is external. It reports the readiness of one relevant target step and process progress for one work item and step, and receives logical start, advance, retry, or abort commands. Physical station behavior and product conformance remain outside the boundary.

CTX-04: Downstream Storage or Dispatch is context only. A successful production outcome may later become product availability, but no shipment request, shipment state, dispatch release, or shipping confirmation crosses this system boundary.

MON-01: `PresentedWorkRequest` from CTX-01 is a finite record `{presence, validity, workId, product}` where `presence = None | Present`, `validity = Valid | Invalid`, `workId = NoWork | W1 | W2`, and `product = AngleProduct | UnsupportedProduct`. A fresh request is eligible exactly when it is present, valid, has `W1` or `W2`, and names `AngleProduct`.

MON-02: `MaterialHandoffObservation` from CTX-02 is a finite record `{validity, workId, disposition}` where `validity = Valid | Invalid`, `workId = NoWork | W1 | W2`, and `disposition = Ready | Unavailable`. It qualifies as ready only when valid and correlated to the eligible presented work identifier; invalid or mismatched observations are `Unknown`.

MON-03: `StepReadinessObservation` from CTX-03 is a finite record `{validity, step, disposition}` where `validity = Valid | Invalid`, `step = Heating | Bending | Cutting | Drilling | Grinding | Polishing`, and `disposition = Ready | Blocked`. The relevant target is heating in idle/fresh context, the successor of the active non-polishing step during progress, polishing as an ignored readiness target while active at polishing, the held successor for transfer, and the failed current step for recovery.

MON-04: `ProcessResultObservation` from CTX-03 is a finite record `{validity, workId, step, event}` where `validity = Valid | Invalid`, `workId = NoWork | W1 | W2`, `step` uses the six-value sequence, and `event = NoEvent | InProgress | Completed | Failed`. Only a valid observation correlated to both active work identifier and active step can complete or fail that step.

CTRL-01: `LineFlowCommand` to CTX-03 is a finite record `{action, workId, step}` where `action = NoCommand | Start | Advance | Retry | Abort`. Every non-`NoCommand` output shall carry the retained active or newly admitted identifier and the exact commanded step; `Abort` terminates logical supervision and does not claim physical stoppage.

CTRL-02: `ProductionOutcome` to CTX-01 is a finite record `{result, workId}` where `result = None | ProductionComplete | ProductionFailed`. It is emitted once on entry to the corresponding terminal state and is suppressed during the following deterministic reset.

CTRL-03: `ProductionFlowStatus` to CTX-01 is one of `Idle | Rejected | WaitingMaterial | WaitingStation | Started | Processing | Busy | Recovering | Advanced | Completed | Failed`. It reports the current logical disposition and does not promise a duration or delivery date.

BOUND-01: Inputs are observations rather than commands to external entities; outputs are logical authorization/status values rather than evidence that a physical process occurred. Customer, Supplier, Sales, Procurement, finished-product dispatch, shipment execution, and shipping confirmation are outside the controlled boundary.

## Finite state and policy

STATE-01: The Flow Ledger owns `phase = Idle | Active | TransferPending | RecoveryPending | TerminalComplete | TerminalFailed`, `activeWork = NoWork | W1 | W2`, `activeStep` from the six-step sequence, and `attempt = First | Retry`. Safe initialization is `Idle`, `NoWork`, `Heating`, and `First`; the sentinel step is irrelevant while idle but explicitly initialized.

STATE-02: `TransferPending` means the preceding step has completed and `activeStep` already names the held successor awaiting an `Advance` command. `RecoveryPending` means `activeStep` names the failed step awaiting a later `Retry`; neither phase admits replacement work.

POL-01: Step succession is total except after polishing: `Heating -> Bending -> Cutting -> Drilling -> Grinding -> Polishing`; completion of polishing enters `TerminalComplete`. No skip, reverse transition, or alternate route is allowed.

POL-02: A fresh start has the lowest protected-work rank. Existing `Active`, `TransferPending`, or `RecoveryPending` state outranks every presented fresh request, and `RecoveryPending` specifically selects the stored work and failed step even when a different eligible fresh request is present.

POL-03: The explicit priority conflict is `pending same-step retry > simultaneous fresh admission`. Resolution shall retain stored identity and step; the presented competitor may affect public status only where the case partition explicitly permits it and shall never become a command payload.

POL-04: A matching first-attempt failure enters `RecoveryPending` and shall not retry in that same evaluation. A later ready observation may issue one retry. A matching failure while `attempt = Retry` enters terminal failure, emits `Abort`, and cannot create another recovery opportunity.

POL-05: Invalid, stale, mismatched, `NoEvent`, and `InProgress` results cannot advance, complete, fail, or reset work. Invalid or mismatched readiness cannot authorize start, advance, or retry.

POL-06: `TerminalComplete` and `TerminalFailed` are one-evaluation observable states. On the next evaluation they reset unconditionally to `Idle`, clear `activeWork`, emit no command or repeated outcome, and report `Idle`, regardless of boundary inputs.

## Semantic usages and responsibilities

PART-01: Work Request Qualifier owns the nonidentity classification `NoRequest | Eligible | Malformed` from all fields of MON-01. Payload preservation for an eligible work item is uncredited support within this usage.

PART-02: Material Correlation Qualifier owns `MaterialReady | MaterialUnavailable | MaterialUnknown` by combining PART-01 admission and eligible work identifier with all fields of MON-02. `NoRequest` or `Malformed` admission yields `MaterialUnknown`; a direct disposition rename or correlation performed elsewhere does not satisfy this responsibility.

PART-03: Target-Step Readiness Qualifier owns `TargetReady | TargetBlocked | TargetUnknown` by deriving the relevant target from Flow Ledger pre-state and combining it with all fields of MON-03. It independently covers fresh heating, an active step's successor, a held successor, and a held recovery-step context; final polishing completion has outcome precedence over its readiness result.

PART-04: Process Outcome Correlator owns `Preserve | IntermediateCompleted | FinalCompleted | FirstFailure | RetryFailure` by combining MON-04 with Flow Ledger pre-state identity, step, phase, and attempt. Distinguishing polishing completion from intermediate completion is part of this owner-local derivation; copying an already-correlated event would not earn owner credit.

PART-05: Protected-Work Priority Resolver owns a finite `FlowIntent` containing `kind = NoIntent | FreshIntent | ActiveIntent | TransferIntent | RecoveryIntent | ResetIntent` and `eligibleCompetitor = Absent | Present` by combining PART-01 admission with Flow Ledger pre-state. It alone resolves the recovery-versus-fresh and protected-work-versus-fresh conflicts; `ResetIntent` distinguishes terminal reset from idle no-work, while the competitor fact distinguishes CASE-03 from CASE-04 without passing through raw presence.

PART-06: Flow Authorization Owner owns the case-complete `FlowDecision` and reason by combining priority intent, material qualification, target-step readiness, and correlated process outcome. It consumes owner facts and shall not recompute request validity, correlation, step readiness, outcome correlation, or priority.

PART-07: Flow Ledger is the sole persistent-state and CTRL-01 owner. It applies PART-06 decisions to phase, identity, step, and attempt; derives step succession; retains or clears context; and produces the corresponding logical line command.

PART-08: Production Outcome Determiner owns CTRL-02 by combining PART-04's correlated outcome with PART-07's applied state. It maps terminal completion and terminal failure to distinct outcomes while suppressing every nonterminal and reset valuation; identifier copying is uncredited.

PART-09: Flow Status Determiner owns CTRL-03 by combining PART-06's reason with PART-07's applied state under terminal, recovery, busy, wait, rejection, transition, processing, and idle precedence. It shall not merely rename either input.

OWN-01: Cooperating qualification and decision owners are PART-01 through PART-06. PART-03 and PART-04 depend on PART-07 pre-state, PART-05 resolves protection, and PART-06 authorizes transitions from their independently derived facts; this satisfies the required multiple-owner cooperation without identity wrappers.

OWN-02: State ownership is closed at PART-07. Other usages may consume `In(...)` pre-state context or applied-state snapshots but shall not retain a duplicate work identifier, step, phase, or attempt across evaluations.

OWN-03: Output ownership is closed: PART-07 alone owns CTRL-01, PART-08 alone owns CTRL-02, and PART-09 alone owns CTRL-03. Boundary delegation does not create an additional output owner.

OWN-04: Case ownership is closed: PART-06 owns the complete decision/reason selection for CASE-01 through CASE-20; PART-07 alone owns each resulting state transition and line command; PART-08 alone owns the outcome effect; and PART-09 alone owns the status effect. PART-01 through PART-05 own only their named qualifying, correlating, or priority facts and may not apply case effects.

## Typed directed semantic interaction inventory

INT-01: The root delivers `PresentedWorkRequest` from MON-01 to PART-01.

INT-02: The root delivers `MaterialHandoffObservation` from MON-02 to PART-02.

INT-03: The root delivers `StepReadinessObservation` from MON-03 to PART-03.

INT-04: The root delivers `ProcessResultObservation` from MON-04 to PART-04.

INT-05: PART-01 sends `AdmissionAssessment` and the uncredited eligible payload to PART-02 for correlated material qualification.

INT-06: PART-01 sends `AdmissionAssessment` and the uncredited eligible payload to PART-05 for protected-work priority resolution.

INT-07: PART-02 sends `MaterialAssessment` to PART-06.

INT-08: PART-03 sends `TargetReadinessAssessment` and its derived target step to PART-06.

INT-09: PART-04 sends `CorrelatedOutcomePlan` to PART-06.

INT-10: PART-05 sends `FlowIntent` and the selected uncredited payload source to PART-06.

INT-11: PART-06 sends `FlowDecision` and `DecisionReason` to PART-07.

INT-12: PART-07 sends pre-state `FlowContext` to PART-03 so it can derive the fresh, transfer, or recovery target.

INT-13: PART-07 sends pre-state `FlowContext` to PART-04 for work, step, phase, and attempt correlation.

INT-14: PART-07 sends pre-state `ProtectionContext` to PART-05 for active, transfer, and recovery priority.

INT-15: PART-04 sends `CorrelatedOutcomePlan` to PART-08 for terminal-outcome discrimination.

INT-16: PART-06 sends `DecisionReason` to PART-09 for rejection, wait, busy, and transition status derivation.

INT-17: PART-07 sends applied `FlowSnapshot` to PART-08 for entry-only outcome generation and reset suppression.

INT-18: PART-07 sends applied `FlowSnapshot` to PART-09 for lifecycle-aware status precedence.

INT-19: PART-07 delivers `LineFlowCommand` to the root as CTRL-01.

INT-20: PART-08 delivers `ProductionOutcome` to the root as CTRL-02.

INT-21: PART-09 delivers `ProductionFlowStatus` to the root as CTRL-03.

INT-AUD-01: The semantic inventory is exactly INT-01 through INT-21: four boundary-input deliveries, fourteen inter-usage exchanges, and three boundary-output deliveries. All nine semantic usages lie in one weakly connected boundary-relevant region, and no interaction exists only to reach the bound.

## Complete nontrivial contract-case partition

CASE-01: If pre-state is `TerminalComplete`, every boundary valuation shall reset to `Idle`, clear the work identity, emit `NoCommand` and no repeated production outcome, and report `Idle`.

CASE-02: If pre-state is `TerminalFailed`, every boundary valuation shall reset to `Idle`, clear the work identity, emit `NoCommand` and no repeated production outcome, and report `Idle`.

CASE-03: In `Active`, if PART-04 derives `Preserve` and no eligible fresh competitor is presented, state and identity shall stutter, output shall be `NoCommand`/no outcome, and status shall be `Processing`.

CASE-04: In `Active`, if PART-04 derives `Preserve` and an eligible fresh competitor is presented, state and identity shall stutter, output shall be `NoCommand`/no outcome, and status shall be `Busy`; the competitor cannot replace the active work.

CASE-05: In `Active`, a correlated `FinalCompleted` at `Polishing` shall enter `TerminalComplete`, emit no further line command, emit exactly one `ProductionComplete` for the active work, and report `Completed`.

CASE-06: In `Active`, a correlated `IntermediateCompleted` before polishing with the successor `TargetReady` shall retain identity, set `activeStep` to the successor, set `attempt = First`, remain `Active`, emit `Advance` for that successor, emit no outcome, and report `Advanced`.

CASE-07: In `Active`, a correlated `IntermediateCompleted` before polishing with successor `TargetBlocked` or `TargetUnknown` shall retain identity, set `activeStep` to the successor, set `attempt = First`, enter `TransferPending`, emit no command/outcome, and report `WaitingStation`.

CASE-08: In `Active` with `attempt = First`, a correlated `FirstFailure` shall retain identity and step, enter `RecoveryPending`, emit no same-evaluation retry or outcome, and report `Recovering` regardless of a fresh competitor.

CASE-09: In `Active` with `attempt = Retry`, a correlated `RetryFailure` shall retain terminal identity, enter `TerminalFailed`, emit `Abort` for the active step, emit exactly one `ProductionFailed`, and report `Failed`; no second retry is permitted.

CASE-10: In `TransferPending`, `TargetReady` shall retain identity, enter `Active` at the held successor with `attempt = First`, emit `Advance`, emit no outcome, and report `Advanced` regardless of a fresh competitor.

CASE-11: In `TransferPending`, `TargetBlocked` or `TargetUnknown` shall preserve the held successor and identity, emit no command/outcome, and report `WaitingStation` regardless of a fresh competitor.

CASE-12: In `RecoveryPending`, `TargetReady` shall select `RecoveryIntent` over any fresh competitor, retain stored identity and step, enter `Active` with `attempt = Retry`, emit `Retry` for the stored work, emit no outcome, and report `Recovering`.

CASE-13: In `RecoveryPending`, `TargetBlocked` or `TargetUnknown` shall select `RecoveryIntent` over any fresh competitor, preserve stored identity and step, emit no command/outcome, and report `Recovering`.

CASE-14: In `Idle`, PART-01's `NoRequest` shall preserve empty idle state, emit no command/outcome, and report `Idle`.

CASE-15: In `Idle`, PART-01's `Malformed` shall preserve empty idle state, emit no command/outcome, and report `Rejected` for that evaluation.

CASE-16: In `Idle` with `Eligible` work, PART-02's `MaterialUnavailable` shall preserve empty idle state, emit no command/outcome, and report `WaitingMaterial`.

CASE-17: In `Idle` with `Eligible` work, PART-02's `MaterialUnknown` shall preserve empty idle state, emit no command/outcome, and report `WaitingMaterial`; readiness from any differently identified work is prohibited.

CASE-18: In `Idle` with eligible work and `MaterialReady`, PART-03's heating result `TargetBlocked` shall preserve empty idle state, emit no command/outcome, and report `WaitingStation`.

CASE-19: In `Idle` with eligible work and `MaterialReady`, PART-03's heating result `TargetUnknown` shall preserve empty idle state, emit no command/outcome, and report `WaitingStation`; a readiness report for any other step cannot authorize start.

CASE-20: In `Idle` with eligible work, `MaterialReady`, and heating `TargetReady`, the system shall retain that work, set step to `Heating` and attempt to `First`, enter `Active`, emit `Start`, emit no production outcome, and report `Started`.

PARTITION-01: CASE-01 and CASE-02 have unconditional terminal-pre-state precedence; CASE-03 through CASE-09 close `Active`; CASE-10 and CASE-11 close `TransferPending`; CASE-12 and CASE-13 close `RecoveryPending`; CASE-14 through CASE-20 close `Idle`. Within each phase, the owner-local finite classifications make the cases exhaustive and mutually exclusive.

PARTITION-02: PART-04 shall classify every observation outside `Active` as `Preserve`; while `Active`, it shall classify every invalid, mismatched, `NoEvent`, or `InProgress` observation as `Preserve`, valid matching non-polishing completion as `IntermediateCompleted`, valid matching polishing completion as `FinalCompleted`, valid matching failure with `First` as `FirstFailure`, and valid matching failure with `Retry` as `RetryFailure`. This closes stale, progress, intermediate/final completion, first-failure, and retry-failure paths without allowing a late result to disturb transfer, recovery, terminal, or idle state.

PARTITION-03: Fresh admission is closed by CASE-14 through CASE-20. Recovery is closed by CASE-08, CASE-12, CASE-13, and CASE-09, with terminal reset in CASE-02. A recovery decision may use only PART-07's stored identity/step and PART-03's readiness for that step, never a presented fresh payload or MON-02 material observation.

## Nominal, boundary, fault, and recovery behavior

BEH-01: The system shall implement CASE-20 followed by one CASE-06 for each completed nonfinal step in source order and CASE-05 at polishing, without skipping or reversing a step. Verification: bounded sequence analysis passes only if the commanded sequence is exactly `Start Heating`, then `Advance Bending`, `Advance Cutting`, `Advance Drilling`, `Advance Grinding`, `Advance Polishing`, then one production completion.

BEH-02: The system shall implement the wait partitions CASE-16 through CASE-19 and CASE-07, CASE-10, and CASE-11 without accepting mismatched readiness or losing retained identity. Verification: exhaustive owner-local analysis must produce witnesses for ready, blocked/unavailable, and unknown/mismatched classifications in fresh and held-step contexts with zero inconsistent command.

BEH-03: The system shall preserve protected work under CASE-04, CASE-08, and CASE-10 through CASE-13. Verification: bounded competing-request sequences pass only when the active identifier and step remain unchanged and no command names the competitor.

FAULT-01: Invalid or mismatched material, station, or process observations shall fail closed under CASE-17, CASE-19, PARTITION-02, and CASE-03 or CASE-04. Verification: exhaustive invalid/mismatch products produce no unauthorized start, advance, retry, completion, or failure.

FAULT-02: A first matching step failure shall produce CASE-08 and only a later evaluation may produce CASE-12 or CASE-13. Verification: sequence analysis rejects same-evaluation retry, identity or step substitution, and any recovery branch that consults fresh material readiness.

FAULT-03: A matching retry failure shall produce CASE-09 followed by CASE-02. Verification: sequence analysis passes only with one `Abort`, one failure outcome, deterministic clearing, and no path to a second retry or repeated outcome.

RISK-01: Accepting stale or mismatched progress could advance or complete the wrong work item; FAULT-01 and PART-04 correlation mitigate this logical consequence. Likelihood and severity are not asserted.

RISK-02: Letting a fresh request displace a held transfer or recovery could lose the original work identity or apply a retry to the wrong step; POL-02, POL-03, BEH-03, and stored-context ownership mitigate this consequence.

RISK-03: Retrying repeatedly after a step fault could prevent terminal disposition; POL-04 and FAULT-03 bound recovery to one same-step retry. No physical safety or recovery-time claim is made.

## Required scenario families

SCN-01: Fresh admission traces eligible `W1`, correlated ready material, and ready heating through CASE-20 to one `Start Heating`, retained `W1`, and `Started`.

SCN-02: Fresh boundary rejection traces no request through CASE-14, then invalid, sentinel-identifier, and unsupported-product requests through CASE-15, with no retained work or command.

SCN-03: Material qualification traces unavailable material through CASE-16, then invalid and mismatched material through CASE-17, and finally correlated ready material into the station partition without a premature start.

SCN-04: Station and transfer waiting traces a blocked heating start through CASE-18, a mismatched heating observation through CASE-19, and a completed intermediate step through CASE-07, CASE-11, then CASE-10 while preserving work identity and the exact successor.

SCN-05: Six-step nominal production traces CASE-20, five ordered CASE-06 advances, CASE-05 at polishing, and CASE-01 reset; pass requires exactly one completion outcome and no dispatch or shipment event.

SCN-06: Protected-work priority traces `W1` active plus eligible `W2` under CASE-04 and traces `W1` transfer-pending plus eligible `W2` under CASE-10 or CASE-11; `W1` remains the only retained and commanded identity.

SCN-07: One-retry recovery traces a matching first failure through CASE-08, then two independent CASE-12 witnesses—one with no presented request and one with eligible competing `W2`—and requires retry of stored `W1` at the same step without consulting fresh material.

SCN-08: Correlation and terminal recovery traces invalid, progress, and mismatched results through CASE-03 or CASE-04, then a matching retry failure through CASE-09 and unconditional CASE-02 reset despite a presented fresh request; CTX-01 re-presents that fresh request on the following idle evaluation and CASE-20 may admit it. The trace requires one failure outcome, no second retry, and no loss of the fresh-request path after recovery.

SCN-AUD-01: The scenario inventory is exactly SCN-01 through SCN-08. The families respectively exercise fresh admission, input rejection, material qualification, station/transfer waiting, full nominal progression, protected-work conflict, successful retry release, and stale-result plus exhausted-retry termination; none is a renamed duplicate.

## Essential environmental assumptions

ASM-01: CTX-01 is responsible for presenting at most one request record per evaluation, treating repeated presentation as a new candidate rather than an acknowledgement protocol, and re-presenting a request on an idle evaluation if it was intentionally ignored during terminal reset. Rationale: the pilot has no queue, latch for boundary arrivals, or request-withdrawal interface.

ASM-02: CTX-02 is responsible for associating a valid material observation with the stated work identifier. Rationale: correlation is necessary to prevent one work item's material report from authorizing another; the model does not reserve or consume material.

ASM-03: CTX-03 is responsible for reporting only the finite readiness and process-result values defined by MON-03 and MON-04. Rationale: the logical supervisor cannot infer physical completion, quality, or station availability beyond those reports.

ASM-04: CTX-03 is responsible for interpreting repeated logical commands idempotently at the boundary; the supervisor itself emits a command only on a transition authorized by the cases. Rationale: command acknowledgement and physical actuation are outside scope.

ASM-05: The six-step successor relation is treated as a fixed pilot constraint, and a completed step does not need to be repeated after entering `TransferPending`. Rationale: the seed provides structural order but not transfer semantics.

ASM-06: Evaluation order is a logical discrete sequence sufficient to distinguish failure entry from later retry and terminal entry from later reset. It is not a physical clock, deadline, latency, or throughput claim; CTX-01 through CTX-03 are responsible for supplying one coherent snapshot per evaluation.

## Structural bounds and generated-support allowance

STRUCT-01: The model shall contain exactly one explicit root System usage, exactly one behavior-free generated-support Process at depth one, and exactly nine reachable semantic Thread usages realizing PART-01 through PART-09 at depth two. The root and Process receive no semantic-usage or ownership credit.

STRUCT-02: The exact semantic campaign tuple is `9 usages / 21 interactions / 20 nontrivial contract cases / 8 scenario families`, within the declared medium bounds `8..12 / 15..21 / 12..20 / 6..9`.

STRUCT-03: The architecture shall have exactly ten non-root raw component usages, containment depth exactly two beneath the root, one weakly connected semantic region, and no nested semantic usage.

SUPPORT-01: The generated-support Process may mirror the four root inputs and three root outputs through exactly seven unchanged delegation connections. These routes are not INT items and carry no owner, semantic interaction, contract-case, or scenario credit.

SUPPORT-02: The exact source target is 28 `PortConnection` declarations: 21 semantic interactions plus seven generated-support delegations. Context actors may appear only in visualization and do not count as component usages.

SUPPORT-03: Closed enums, flat data records, explicit initialization, tuple well-formedness, analyzer fixtures, trace annotations, and visualization metadata may be added as generated support only when they do not introduce domain policy or earn campaign credit.

STRUCT-AUD-01: Every PART item derives a distinct owner-local fact or state/output effect, every INT item carries a fact needed by a downstream owner or a boundary value, every CASE item occupies a distinct phase/condition/result branch, and every SCN item has a distinct trace purpose. Identity copying, bundling, delegation, and context publication are explicitly uncredited.

## Representation, verification, and objective pass criteria

REP-01: Every finite domain named in MON-01 through CTRL-03 and STATE-01 shall lower to a closed enumeration or flat data record with GUMBO-visible fields. Enum ordering shall not be used to encode the six-step successor relation; POL-01 shall be explicit.

REP-02: PART-07 shall own separate finite state variables for phase, work identifier, step, and attempt and shall initialize each explicitly. INT-12 through INT-14 shall expose PART-07 `In(...)` pre-state values so feedback paths are state-broken rather than combinational cycles.

REP-03: Canonical local contracts shall express the nonidentity relations in PART-01 through PART-09. The bounded analyzer shall call owner-local functions and compare them with separately written oracles rather than centrally reproducing or bypassing the allocation.

ANALYSIS-01: The analyzer shall exhaust every legal owner-local finite input product, report the evaluated count for each owner, and retain witnesses for all three request classes, three material classes including inapplicable admission, three target-readiness classes in fresh/active/transfer/recovery contexts, five outcome classes, all six intent kinds with both applicable competitor facts, and all CASE-01 through CASE-20.

ANALYSIS-02: Bounded end-to-end sequences shall cover SCN-01 through SCN-08, all six ordered steps, both work identifiers, terminal reset under varied fresh inputs followed by idle re-presentation and admission, first failure without same-evaluation retry, recovery with no request, recovery with a differently identified eligible competitor, blocked recovery, and retry failure without a second retry.

ANALYSIS-03: Analyzer pass requires zero oracle mismatches, zero owner-local gaps, zero unintended overlaps within each phase partition, at least one retained witness per CASE and SCN, and completion within a 180-second watchdog. Timeout or omitted products fail closed; bounded results are not formal proof or execution evidence.

PASS-01: Structural conformance passes only with one root, one uncredited support Process, nine semantic usages, ten non-root raw usages, depth two, one weak semantic region, 21 semantic interactions, seven support delegations, 28 total connection declarations, 20 cases, eight scenarios, and no padded owner or interaction.

PASS-02: Boundary conformance passes only when all four root inputs trace to MON-01 through MON-04, all three root outputs trace to CTRL-01 through CTRL-03, and dispatch/shipment concepts do not become state, commands, or principal behavior.

PASS-03: Behavioral conformance passes only when the finite partition is exhaustive; POL-01 through POL-06 hold; all outputs are initialized and constrained in every case; fresh and recovery paths are closed; stored identity survives all protected-work conflicts; and one retry is the maximum.

PASS-04: Ownership conformance passes only when canonical local contracts and analyzer ownership records show substantive derivations for PART-01 through PART-09, no state duplication outside PART-07, no central recomputation, and no credit for routed payload or context.

PASS-05: Mechanical verification passes only when architecture-stage and final Sireum/HAMR typechecking succeed, all endpoints resolve with compatible directions/kinds/types, the retained bounded analyzer satisfies ANALYSIS-01 through ANALYSIS-03, and bidirectional trace coverage has no missing actionable clause or unexplained significant model element.

PASS-06: Visualization passes only when exactly one source-bound `system-overview` shows the root boundary, nine semantic responsibilities, principal directed flows, fixed six-step purpose, state/decision ownership, and production—not dispatch—outcomes without presenting context or support as semantic usages.

PASS-07: Designer validation remains separate from PASS-01 through PASS-06 and passes only if the retained model is fit for NEED-01, preserves the implementation-independent production-flow purpose, realizes all eight scenarios and the explicit conflict, respects the source/assumption/deferred-claim boundary, and has no silent design drift.

TRACE-01: Every actionable identifier in this abstract shall map to one or more generated elements or contract/analyzer evidence. Every significant generated component, port, connection, state, and contract clause shall trace back or carry a narrow `@generated-support` justification; missing parents and unexplained children fail acceptance.

## Explicitly deferred and prohibited claims

DEFER-01: Multiple concurrent work items, queues, capacity above one, scheduling optimization, due dates, fairness, starvation, preemption, request withdrawal, material reservation/decrement, and inventory mutation are unspecified and shall not be reported as passed.

DEFER-02: Physical temperature, duration, angle, length, hole location, grain size, tool settings, station control, quality inspection, scrap handling, alternate routing, maintenance, and industrial safety are outside scope.

DEFER-03: Procurement, commercial inquiry/quotation, sales-order confirmation, Customer and Supplier transactions, finished-product dispatch, shipment, shipping confirmation, and delivery performance are outside scope.

DEFER-04: Quantitative timing, latency, throughput, reliability, availability, physical recovery success, and certification are unsupported. No probabilities, severities, performance bounds, or safety classifications may be inferred.

DEFER-05: The seed does not declare an executable profile. Code generation, application implementation, executable simulation, deployment bindings, compositional proof, solver certification beyond actual retained evidence, and physical validation remain `not-run`.

## Resolved Model review findings and generation authorization

QUESTION-01: Resolved as realizable but not yet verified: PART-07 shall publish INT-12 through INT-14 only from canonical `In(phase)`, `In(activeWork)`, `In(activeStep)`, and `In(attempt)` pre-state values. Current-evaluation state updates shall not feed those publications, so the feedback is state-broken and the semantic interaction count remains exactly 21.

QUESTION-02: Resolved as realizable but not yet verified: POL-01 shall use an explicit conditional successor helper over the six enum literals with no ordinal dependence, and PART-08 shall combine PART-04's correlated outcome with PART-07's applied snapshot so terminal entry emits once while the following applied-`Idle` reset suppresses repetition.

QUESTION-03: Resolved as tractable but not yet executed: the deterministic analyzer shall exhaust the owner-local products and required bounded sequences within the 180-second watchdog while keeping independently written oracle relations separate from the architecture's owner functions. Harness schema acceptance or ownership labels alone do not establish substantive ownership.

GEN-01: Model generation is authorized only from this Designer-approved abstract and `design-selection.md`. Generation shall preserve the exact `9/21/20/8` semantic tuple, owner-local contracts, bounded end-to-end obligations, seven-delegation generated-support allowance, 28-connection raw target, production-not-dispatch purpose, and DEFER-01 through DEFER-05 claim boundary. Any incompatibility shall return a precise diagnostic to this retained run and shall not weaken policy, alter counts, centralize ownership, discard the frozen seed, or start a replacement attempt.
