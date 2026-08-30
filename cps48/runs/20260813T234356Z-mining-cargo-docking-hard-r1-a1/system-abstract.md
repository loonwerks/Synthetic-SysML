---
abstract_id: SA-MCD-HR-01
seed_id: 20260813T233942Z-mining-cargo-docking-seed-v1
seed_version: 1
status: approved-final
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 15
selected_semantic_interactions: 35
selected_nontrivial_contract_cases: 28
selected_scenario_families: 11
node_count: [15, 15]
edge_count: [35, 35]
containment_depth: [2, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
---

# Station Cargo-Transfer Evidence Coordinator

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen seed supports a mining frigate, pilot, station, warehouse or storage, docking context, cargo transfer, ship-side transfer status, warehouse evidence, and transfer completion reporting or verification. It does not supply a complete transfer state machine, uniform command semantics, correlation rules, priority, invalid-report behavior, fault interpretation, or recovery policy.

METHOD-01: [Handbook-derived engineering control] This abstract establishes the need, external boundary, assumptions, alternatives, cohesive responsibility owners, finite partitions, nominal and off-nominal scenarios, traceability, and separate verification and validation criteria before implementation. These controls are methodology obligations and are not facts about the source frigate.

PILOT-01: [Pilot abstraction] One evaluation consumes one finite logical snapshot and produces one deterministic supervisory result. Two alternating correlation tokens, finite evidence classes, freshness rules, retained logical state, strict priority, same-evaluation fault propagation, and two-step recovery are bounded experiment assumptions.

ARCH-01: [Selected architecture] The retained design distributes four boundary classifications, request admission, evidence coherence, five retained-state responsibilities, three independent action proposals, one priority decision, and atomic result composition across exactly 15 semantic usages connected by exactly 35 typed directed semantic interactions.

ABSTR-01: [Abstraction rule] The clauses fix observable finite relations, responsibility and state ownership, interaction meanings, and evidence obligations without selecting algorithms, schedules, periods, deployment, transport, data encodings, user-interface presentation, physical transfer mechanisms, or a SysML decomposition form.

DEFER-01: [Deferred claim] This run does not claim physical cargo movement, cargo conservation, warehouse accuracy, docking effectiveness, transaction durability, timing performance, game fidelity, vessel safety, certification, production readiness, code generation, formal proof, or executable behavior.

## Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A pilot and station need one bounded coordinator to supervise a single frigate-to-warehouse cargo-transfer attempt so that logical transfer commands and completion reports are based on dock-ready context, matching ship and warehouse evidence, and an explicitly recoverable evidence history.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a transfer request, dock context, ship report, warehouse report, and supervisory control event; update request, session, evidence, and recovery state; select at most one logical action; and publish one coherent transfer result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every finite boundary snapshot and every admitted prior-state tuple with no unconstrained next state or output field.

GOAL-02: [Pilot abstraction] A newly detected fault, emergency stop, or incomplete recovery shall dominate cancellation and ordinary transfer progress; otherwise a matching cancellation shall dominate warehouse verification, ship progress, and a fresh start.

GOAL-03: [Pilot abstraction] Invalid, failed, rejected, conflicting, mistagged, or phase-inconsistent evidence shall propagate in the same evaluation through coherence classification, recovery latching, state inhibition, priority selection, and the public result.

GOAL-04: [Pilot abstraction] Recovery shall require a fresh `RESET` while latched followed in a later evaluation by a distinct fresh `VERIFY_OK`; neither event alone nor an out-of-order event shall reopen ordinary action selection.

GOAL-05: [Selected architecture] The selected action, cause, mode, correlation token, request disposition, and transfer outcome shall be composed into one indivisible flat `TransferCoordinationResult` from transmitted owner-local decisions.

## Operational context and finite system boundary

CTX-SYS-01: [Selected boundary] The modeled system is a logical station cargo-transfer evidence coordinator. Physical docking, undocking, cargo motion, frigate actuation, warehouse storage, pilot display, station service execution, repair, resupply, mining, travel, combat, and whole-vessel lifecycle governance remain outside it.

CTX-PILOT-01: [Seed-grounded entity with pilot responsibility] The external pilot supplies at most one `TransferRequest` per evaluation and consumes the public result through `CTX-PUB-01`; the pilot is responsible for resubmitting a deferred request and alternating bounded correlation tokens as specified by `ASM-TAG-01`.

CTX-DOCK-01: [Seed-grounded context with pilot responsibility] An external dock-context authority supplies one `DockContext` that summarizes the frigate lifecycle and station permission relevant to logical cargo transfer. It is responsible for the declared validity and meaning, not for physical docking effectiveness.

CTX-SHIP-01: [Seed-grounded capability with pilot responsibility] The external ship transfer controller consumes `BEGIN_TRANSFER`, `CONTINUE_TRANSFER`, or `CANCEL_TRANSFER` actions and supplies a later correlated `ShipReport`; it is responsible for report freshness and correlation, not for proving physical cargo movement.

CTX-WARE-01: [Seed-grounded entity with pilot responsibility] The external warehouse interface consumes `REQUEST_WAREHOUSE_VERIFY` and supplies a later correlated `WarehouseReport`; it is responsible for report freshness and correlation, not for the truth of physical inventory.

CTX-CTRL-01: [Pilot external authority] A station supervisory authority supplies fresh emergency and recovery events after external diagnosis and is responsible for separating `RESET` from a later `VERIFY_OK`.

CTX-PUB-01: [Selected boundary] A pilot-and-station integration recipient consumes one `TransferCoordinationResult` and conveys the contained logical action to `CTX-SHIP-01` or `CTX-WARE-01` without changing its meaning. The coordinator controls issuance of a logical request, not external acceptance or physical completion.

MON-REQ-01: [Pilot abstraction] Root input `transferRequest` has finite type `TransferRequest={NONE,INVALID,START_A,START_B,CANCEL_A,CANCEL_B}` and comes from `CTX-PILOT-01`; `A` and `B` are correlation tokens, not cargo identities.

MON-DOCK-01: [Pilot abstraction] Root input `dockContext` has finite type `DockContext={INVALID,IN_GRID,ON_WARP,DOCKED_WITHHELD,DOCKED_READY}` and comes from `CTX-DOCK-01`. Only `DOCKED_READY` permits a new logical transfer attempt.

MON-SHIP-01: [Pilot abstraction] Root input `shipReport` has finite type `ShipReport={NONE,INVALID,ACCEPTED_A,ACCEPTED_B,MOVING_A,MOVING_B,COMPLETE_A,COMPLETE_B,FAILED_A,FAILED_B}` and comes from `CTX-SHIP-01`; every non-`NONE` value is a fresh single-evaluation report.

MON-WARE-01: [Pilot abstraction] Root input `warehouseReport` has finite type `WarehouseReport={NONE,INVALID,PENDING_A,PENDING_B,STORED_A,STORED_B,REJECTED_A,REJECTED_B}` and comes from `CTX-WARE-01`; every non-`NONE` value is a fresh single-evaluation report.

MON-CTRL-01: [Pilot abstraction] Root input `controlEvent` has finite type `ControlEvent={NONE,EMERGENCY_STOP,RESET,VERIFY_OK}` and comes from `CTX-CTRL-01`; every non-`NONE` value is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record `TransferCoordinationResult=(action,cause,mode,correlation,requestDisposition,outcome)`, delivered to `CTX-PUB-01`.

TYPE-TOK-01: [Pilot abstraction] `Correlation={NONE,A,B}` identifies the bounded active attempt; the `NONE` value denotes no controlled action or active outcome requiring correlation.

TYPE-ACT-01: [Pilot abstraction] `TransferAction={HOLD,BEGIN_TRANSFER,CONTINUE_TRANSFER,REQUEST_WAREHOUSE_VERIFY,CANCEL_TRANSFER}` contains only logical supervisory requests.

TYPE-CAUSE-01: [Pilot abstraction] `DecisionCause={FAULT_OR_RECOVERY,CANCEL_REQUEST,WAREHOUSE_CONFIRMATION,SHIP_PROGRESS,NEW_TRANSFER,NO_ELIGIBLE_ACTION}` records the highest-priority reason selected in an evaluation.

TYPE-MODE-01: [Pilot abstraction] `CoordinationMode={HOLDING,COMMANDING_SHIP,VERIFYING_WAREHOUSE,FAULT}` is derived from the selected action and cause and is not retained state.

TYPE-DISP-01: [Pilot abstraction] `RequestDisposition={NO_REQUEST,ACCEPTED,DUPLICATE,REJECTED,DEFERRED,CANCEL_ACCEPTED}` describes only the current request signal.

TYPE-OUT-01: [Pilot abstraction] `TransferOutcome={NONE,ACTIVE,COMPLETED,CANCELLED,RECOVERY_REQUIRED}` is the current evaluation outcome and is not evidence of physical storage.

TYPE-STATE-01: [Pilot abstraction] `RequestLedger={NO_HISTORY,A_LAST,B_LAST}` is retained request-history state. `SessionState={IDLE,AWAIT_SHIP_A,AWAIT_SHIP_B,TRANSFERRING_A,TRANSFERRING_B,AWAIT_WAREHOUSE_A,AWAIT_WAREHOUSE_B}` is retained transfer-session state and embeds its active token.

TYPE-EVID-01: [Pilot abstraction] `ShipEvidenceState={CLEAR,ACKNOWLEDGED,MOVING,COMPLETE}`, `WarehouseEvidenceState={CLEAR,PENDING}`, and `RecoveryState={HEALTHY,LATCHED,RECOVERING}` are independently retained finite state types.

TYPE-FACT-01: [Selected mapping] `RequestFacts=(kind,correlation,valid,present)`, `DockFacts=(usable,docked,permissionGranted,startReady,reason)`, `ShipReportFacts=(class,correlation,usable,exactReport)`, and `WarehouseReportFacts=(class,correlation,usable,exactReport)` are flat owner-derived facts.

TYPE-DEC-01: [Selected mapping] `AdmissionDecision=(kind,correlation,disposition,updateLedger)`, `CoordinationFrame=(progress,correlation,faultTrigger,recoveryIntent,inhibitOrdinary,outcomePulse)`, each proposal, and `TransferDecision=(action,cause,correlation,outcome)` are finite flat decision records.

ASM-FRESH-01: [Pilot abstraction] `CTX-PILOT-01`, `CTX-SHIP-01`, `CTX-WARE-01`, and `CTX-CTRL-01` are responsible for event freshness. Rationale: replayed reports or recovery events could otherwise advance retained state more than once.

ASM-TAG-01: [Pilot abstraction] `CTX-PILOT-01` shall alternate `A` and `B` between accepted new attempts and shall retain the active token on cancellation. Rationale: two tokens bound the analyzer while letting the coordinator distinguish a duplicate from the next fresh request.

ASM-CAP-01: [Pilot abstraction] The coordinator retains at most one active transfer session and no cargo quantity or manifest. `CTX-PILOT-01` shall retry a valid request reported `DEFERRED`. Rationale: these are finite scope bounds, not frigate or warehouse capacity claims.

ASM-EVENT-01: [Pilot abstraction] At most one of `shipReport` and `warehouseReport` should be non-`NONE` in a valid environment; if both are non-`NONE`, the coordinator shall treat the snapshot as conflicting evidence rather than assume an ordering. `CTX-SHIP-01` and `CTX-WARE-01` share this responsibility.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not transaction counts. `CTX-SHIP-01` and `CTX-WARE-01` shall not interpret a repeated identical action as a second transaction while the correlated response remains outstanding.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no physical duration: prior owner states and current boundary facts determine a coordination frame and admission; state owners determine next state; proposals are selected by priority; composition publishes the result.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, request history is `NO_HISTORY`, session is `IDLE`, ship and warehouse evidence are `CLEAR`, recovery is `HEALTHY`, and the public result is `(HOLD,NO_ELIGIBLE_ACTION,HOLDING,NONE,NO_REQUEST,NONE)`.

## Risks, faults, and mitigations

RISK-01: [Pilot risk] Accepting mistagged or phase-inconsistent ship or warehouse evidence could report completion for the wrong attempt; `FAULT-01` requires correlation and phase faults to latch recovery and inhibit progress.

RISK-02: [Pilot risk] Acting on an emergency, explicit failure, invalid report, rejection, or simultaneous ship and warehouse report as if it were ordinary progress could leave controlled actions inconsistent with retained state; `FAULT-02` requires same-evaluation propagation to a fault result.

RISK-03: [Pilot risk] Treating reset as completed recovery could resume a transfer without an independent post-reset verification event; `FAULT-03` requires a distinct ordered recovery sequence.

FAULT-01: [Pilot requirement] A usable non-`NONE` report whose token differs from the active session token, or whose class is inconsistent with the active phase and evidence state, shall derive a fault trigger, latch recovery, freeze all ordinary owner states, select `HOLD`, and publish `FAULT_OR_RECOVERY/FAULT/RECOVERY_REQUIRED` in the same evaluation. Verification passes only if local-contract inspection and exhaustive analysis establish the chain for every applicable tuple.

FAULT-02: [Pilot requirement] `EMERGENCY_STOP`, either invalid report, `FAILED_*`, `REJECTED_*`, both report channels non-`NONE`, or an internally inconsistent prior session/evidence tuple shall produce the same latch-freeze-hold-publication chain as `FAULT-01`. Verification passes only with one witness per initiating class and zero same-evaluation ordinary-action leaks.

FAULT-03: [Pilot requirement] While recovery is `LATCHED` or `RECOVERING`, ordinary admission, progress, and proposals shall remain inhibited. Only `RESET` from `LATCHED` shall yield `RECOVERING`, and only a later `VERIFY_OK` from `RECOVERING` shall yield `HEALTHY`; the control evaluation itself shall still select `HOLD`. Verification passes only if exhaustive sequences reject reset alone, early verification, repeated controls, and same-evaluation restart.

## Selected semantic usages and ownership audit

PART-01: [Selected architecture; semantic usage] `request_acquisition` owns the classification of `TransferRequest` into presence, validity, request kind, and correlation; it shall not decide freshness, context readiness, or admission.

PART-02: [Selected architecture; semantic usage] `dock_context_assessment` owns the many-to-one derivation of context usability, docked status, permission status, start readiness, and a readiness reason from `DockContext`.

PART-03: [Selected architecture; semantic usage] `ship_report_acquisition` owns ship-report usability, report class, exact token, and exact-report preservation; it shall not decide phase or correlation coherence.

PART-04: [Selected architecture; semantic usage] `warehouse_report_acquisition` owns warehouse-report usability, report class, exact token, and exact-report preservation; it shall not decide phase or correlation coherence.

PART-05: [Selected architecture; state and decision owner] `request_admission` is the sole `RequestLedger` owner and derives request freshness, admission kind, disposition, and next ledger from request facts, dock facts, the received prior session, and the received coordination guard.

PART-06: [Selected architecture; decision owner] `evidence_coherence` combines acquired reports, control event, and received prior owner states to derive phase and token coherence, one progress classification, fault trigger, recovery intent, ordinary-inhibition fact, and terminal outcome pulse without updating retained state.

PART-07: [Selected architecture; state and decision owner] `transfer_session` is the sole `SessionState` owner and derives its next phase and current active-session view from admission and the received coordination frame.

PART-08: [Selected architecture; state and decision owner] `ship_evidence_lifecycle` is the sole `ShipEvidenceState` owner and derives its next evidence stage from its retained prior evidence, the received coordination frame, and the received admission decision; accepted cancellation clears to `CLEAR`, accepted start initializes or retains `CLEAR`, and fault or closed-recovery inhibition remains dominant.

PART-09: [Selected architecture; state and decision owner] `warehouse_evidence_lifecycle` is the sole `WarehouseEvidenceState` owner and derives its next evidence stage from its retained prior evidence, the received coordination frame, and the received admission decision; accepted cancellation clears to `CLEAR`, accepted start initializes or retains `CLEAR`, and fault or closed-recovery inhibition remains dominant.

PART-10: [Selected architecture; state and decision owner] `recovery_supervisor` is the sole `RecoveryState` owner and derives next recovery state from the received fault trigger and recovery intent; it shall not reclassify boundary reports.

PART-11: [Selected architecture; decision owner] `request_action_eligibility` derives either a start proposal, a cancellation proposal, or no request action solely from the received admission decision.

PART-12: [Selected architecture; decision owner] `ship_progress_eligibility` derives a correlated ship-progress proposal from the received prior session and prior ship-evidence state; it shall not infer warehouse readiness or reread reports.

PART-13: [Selected architecture; decision owner] `warehouse_verification_eligibility` derives a correlated verification proposal from the received prior session, ship-evidence state, and warehouse-evidence state; it shall not infer request admission.

PART-14: [Selected architecture; principal decision owner] `transfer_action_arbitration` selects exactly one `TransferDecision` by coordination directive, cancellation, warehouse verification, ship progress, new transfer, then hold priority and shall not recompute any upstream predicate.

PART-15: [Selected architecture; composition decision owner] `result_composition` derives public mode and correlation consistency from the received transfer decision and request disposition, then emits one atomic `TransferCoordinationResult`; it owns no retained or mirror state.

OWN-AUD-01: [Ownership audit] Retained state is divided among `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10`; report coherence belongs only to `PART-06`; proposals belong separately to `PART-11`, `PART-12`, and `PART-13`; strict priority belongs only to `PART-14`; public composition belongs only to `PART-15`.

OWN-AUD-02: [Ownership audit] Every `PART-01` through `PART-15` derives at least one behaviorally meaningful owner-local fact. No identity copier, one-to-one renamer, splitter, router, mirror-state holder, root, support container, visualization actor, or analyzer fixture receives semantic-usage or owner credit.

## Complete typed directed semantic interaction inventory

INT-01: [Semantic boundary interaction] `CTX-PILOT-01` shall provide root `TransferRequest` to `request_acquisition.transfer_request`.

INT-02: [Semantic boundary interaction] `CTX-DOCK-01` shall provide root `DockContext` to `dock_context_assessment.dock_context`.

INT-03: [Semantic boundary interaction] `CTX-SHIP-01` shall provide root `ShipReport` to `ship_report_acquisition.ship_report`.

INT-04: [Semantic boundary interaction] `CTX-WARE-01` shall provide root `WarehouseReport` to `warehouse_report_acquisition.warehouse_report`.

INT-05: [Semantic boundary interaction] `CTX-CTRL-01` shall provide root `ControlEvent` to `evidence_coherence.control_event`.

INT-06: [Semantic boundary interaction] `result_composition.transfer_result` shall provide `TransferCoordinationResult` to `CTX-PUB-01`.

INT-07: [Semantic interaction] `request_acquisition.request_facts` shall provide `RequestFacts` to `request_admission.request_facts`.

INT-08: [Semantic interaction] `dock_context_assessment.dock_facts` shall provide `DockFacts` to `request_admission.dock_facts`.

INT-09: [Semantic interaction] `ship_report_acquisition.ship_report_facts` shall provide `ShipReportFacts` to `evidence_coherence.ship_report_facts`.

INT-10: [Semantic interaction] `warehouse_report_acquisition.warehouse_report_facts` shall provide `WarehouseReportFacts` to `evidence_coherence.warehouse_report_facts`.

INT-11: [Semantic state-view interaction] `transfer_session.prior_session_view` shall provide the retained prior `SessionState` and active token to `request_admission.prior_session_view`.

INT-12: [Semantic state-view interaction] `recovery_supervisor.prior_recovery_state` shall provide retained prior `RecoveryState` to `evidence_coherence.prior_recovery_state`.

INT-13: [Semantic state-view interaction] `transfer_session.prior_session_view` shall provide the retained prior session phase and token to `evidence_coherence.prior_session_view`.

INT-14: [Semantic state-view interaction] `ship_evidence_lifecycle.prior_ship_evidence` shall provide retained prior `ShipEvidenceState` to `evidence_coherence.prior_ship_evidence`.

INT-15: [Semantic state-view interaction] `warehouse_evidence_lifecycle.prior_warehouse_evidence` shall provide retained prior `WarehouseEvidenceState` to `evidence_coherence.prior_warehouse_evidence`.

INT-16: [Semantic interaction] `evidence_coherence.recovery_transition` shall provide fault trigger and recovery intent to `recovery_supervisor.recovery_transition`.

INT-17: [Semantic interaction] `evidence_coherence.coordination_guard` shall provide ordinary-inhibition and fault facts to `request_admission.coordination_guard`.

INT-18: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `transfer_session.admission_decision`.

INT-19: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `request_action_eligibility.admission_decision`.

INT-20: [Semantic interaction] `evidence_coherence.coordination_frame` shall provide qualified progress, inhibition, and outcome pulse to `transfer_session.coordination_frame`.

INT-21: [Semantic interaction] `evidence_coherence.ship_update` shall provide qualified ship-evidence update or freeze to `ship_evidence_lifecycle.ship_update`.

INT-22: [Semantic interaction] `evidence_coherence.warehouse_update` shall provide qualified warehouse-evidence update or freeze to `warehouse_evidence_lifecycle.warehouse_update`.

INT-23: [Semantic state-view interaction] `transfer_session.prior_session_view` shall provide retained prior session phase and token to `ship_progress_eligibility.prior_session_view`.

INT-24: [Semantic state-view interaction] `ship_evidence_lifecycle.prior_ship_evidence` shall provide retained prior `ShipEvidenceState` to `ship_progress_eligibility.prior_ship_evidence`.

INT-25: [Semantic state-view interaction] `transfer_session.prior_session_view` shall provide retained prior session phase and token to `warehouse_verification_eligibility.prior_session_view`.

INT-26: [Semantic state-view interaction] `ship_evidence_lifecycle.prior_ship_evidence` shall provide retained prior `ShipEvidenceState` to `warehouse_verification_eligibility.prior_ship_evidence`.

INT-27: [Semantic state-view interaction] `warehouse_evidence_lifecycle.prior_warehouse_evidence` shall provide retained prior `WarehouseEvidenceState` to `warehouse_verification_eligibility.prior_warehouse_evidence`.

INT-28: [Semantic interaction] `request_action_eligibility.request_proposal` shall provide its correlated request proposal to `transfer_action_arbitration.request_proposal`.

INT-29: [Semantic interaction] `ship_progress_eligibility.ship_proposal` shall provide its correlated progress proposal to `transfer_action_arbitration.ship_proposal`.

INT-30: [Semantic interaction] `warehouse_verification_eligibility.warehouse_proposal` shall provide its correlated verification proposal to `transfer_action_arbitration.warehouse_proposal`.

INT-31: [Semantic interaction] `evidence_coherence.priority_directive` shall provide fault, recovery, completion, or ordinary directive to `transfer_action_arbitration.priority_directive`.

INT-32: [Semantic interaction] `transfer_action_arbitration.transfer_decision` shall provide `TransferDecision` to `result_composition.transfer_decision`.

INT-33: [Semantic interaction] `request_admission.request_disposition` shall provide current `RequestDisposition` to `result_composition.request_disposition`.

INT-34: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `ship_evidence_lifecycle.admission_decision`.

INT-35: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `warehouse_evidence_lifecycle.admission_decision`.

INT-AUD-01: [Interaction audit] `INT-01` through `INT-35` are the complete semantic inventory: six boundary interactions, four acquisition or assessment flows, five prior-state views into admission or coherence, nine coherence or admission effects, five prior-state views into proposal owners, and six proposal, arbitration, or composition flows. Every interaction has one typed direction and a distinct behavioral trace.

## Finite policy and nontrivial contract cases

PARTITION-01: [Coverage rule] `CASE-01` through `CASE-28` are exactly 28 counted nontrivial cases. Within each named owner relation they are total and mutually exclusive under the stated precedence; canonical finite maps, consistency invariants, initialization, and field-equality support clauses do not add counted cases.

CASE-01: [Request acquisition] `NONE` shall derive not-present, valid, no kind, and `NONE` correlation.

CASE-02: [Request acquisition] Each `START_A`, `START_B`, `CANCEL_A`, or `CANCEL_B` shall derive present, valid, the exact start-or-cancel kind, and its exact token without deciding admission.

CASE-03: [Request acquisition] `INVALID` shall derive present, invalid, no admissible kind, and `NONE` correlation.

CASE-04: [Dock assessment] `DOCKED_READY` shall derive usable, docked, permission granted, and start ready.

CASE-05: [Dock assessment] `IN_GRID`, `ON_WARP`, or `DOCKED_WITHHELD` shall derive usable and not start ready, with a distinct not-docked or permission-withheld reason.

CASE-06: [Dock assessment] `INVALID` shall derive unusable, not start ready, and invalid-context reason.

CASE-07: [Ship acquisition] `NONE` shall derive no ship event, usable, and `NONE` correlation.

CASE-08: [Ship acquisition] Each accepted, moving, or complete report shall derive its exact progress class and token while preserving the exact report.

CASE-09: [Ship acquisition] `INVALID` or either failed report shall derive an unusable-or-failure class with the exact failure token when present.

CASE-10: [Warehouse acquisition] `NONE` shall derive no warehouse event, usable, and `NONE` correlation.

CASE-11: [Warehouse acquisition] Each pending or stored report shall derive its exact progress class and token while preserving the exact report.

CASE-12: [Warehouse acquisition] `INVALID` or either rejected report shall derive an unusable-or-rejection class with the exact rejection token when present.

CASE-13: [Request admission] No present request shall derive `NO_REQUEST`, no ledger update, and no request action.

CASE-14: [Request admission] An invalid request shall derive `REJECTED`, no ledger update, and no request action regardless of dock context.

CASE-15: [Request admission] While the received guard is open and prior session is `IDLE`, a valid start with ready dock context and token different from the last accepted token shall derive `ACCEPTED`, update the ledger to that token, and enable a correlated start proposal.

CASE-16: [Request admission] While the received guard is open, a valid start whose token equals the last accepted token shall derive `DUPLICATE`, preserve the ledger and session, and enable no action.

CASE-17: [Request admission] While the received guard is open and prior session is `IDLE`, a fresh valid start with unusable or not-ready dock context shall derive `REJECTED`, preserve the ledger, and enable no action.

CASE-18: [Request admission] A fresh valid start received while a session is active, or any otherwise valid request received while the coordination guard is closed or a recovery-control evaluation is in progress, shall derive `DEFERRED`, preserve the ledger, and enable no request action.

CASE-19: [Request admission] With an open guard, a cancel whose token matches an active session shall derive `CANCEL_ACCEPTED`, preserve the ledger, and enable a correlated cancellation proposal irrespective of current dock context.

CASE-20: [Request admission] With an open guard, a cancel received in `IDLE` or with a nonmatching token shall derive `REJECTED`, preserve the ledger, and enable no action.

CASE-21: [Evidence coherence and fault propagation] `EMERGENCY_STOP`; invalid, failed, or rejected evidence; both report channels non-`NONE`; a report token mismatch; a phase-inconsistent report; or a prior session/evidence invariant violation shall derive fault trigger, latch intent, ordinary inhibition, freeze updates, `FAULT_OR_RECOVERY`, and `RECOVERY_REQUIRED`. These initiating predicates share one deliberately dominant fault response and are distinguished by analyzer witnesses.

CASE-22: [Evidence coherence and recovery control] In the absence of a new fault, prior `LATCHED` plus `RESET` shall request `RECOVERING`, and prior `RECOVERING` plus `VERIFY_OK` shall request `HEALTHY`; every other closed-recovery or non-`NONE` recovery-control combination shall retain the appropriate state. All such evaluations inhibit ordinary progress and action.

CASE-23: [Evidence coherence and ship progress] With healthy recovery, `NONE` control, no warehouse event, a consistent prior tuple, and one matching phase-valid ship report, accepted or moving shall qualify transfer progress and complete shall qualify transition to warehouse verification; no fault or recovery intent shall be produced.

CASE-24: [Evidence coherence and warehouse progress] With healthy recovery, `NONE` control, no ship event, and a consistent prior tuple, matching pending or stored warehouse evidence in the warehouse-await phase shall qualify pending or completion respectively; when both reports are `NONE`, the frame shall explicitly qualify no progress.

CASE-25: [State-owner transitions] The session and two evidence state owners shall apply exactly this precedence from owner-local inputs: fault or inhibited recovery freezes ordinary state; then an admission decision carrying accepted cancellation clears session and both evidence states; then an admission decision carrying accepted start initializes a correlated await-ship session with clear evidence; then qualified progress advances only its assigned owner; then no progress retains state. Stored completion shall atomically return the session and evidence owners to idle or clear while emitting a completion pulse; request-ledger and recovery transitions remain governed by `CASE-13` through `CASE-22`.

CASE-26: [Proposal-owner partition] Request eligibility proposes start only for `ACCEPTED` and cancel only for `CANCEL_ACCEPTED`; ship eligibility proposes continue only for an active await-ship or transferring prior session with phase-consistent ship evidence; warehouse eligibility proposes verification only for an await-warehouse prior session with complete ship evidence and clear or pending warehouse evidence. Every other input tuple shall derive no proposal.

CASE-27: [Priority partition] Arbitration shall select exactly one decision using `fault-or-recovery hold > completion hold > matching cancellation > warehouse verification > ship progress > fresh start > ordinary hold`. A higher-priority selection shall suppress all lower proposals without altering their owner-local values.

CASE-28: [Composition partition] Composition shall map every selected action and cause to exactly one mode and outcome: fault or recovery to `FAULT/RECOVERY_REQUIRED`; completion to `HOLDING/COMPLETED`; cancellation to `COMMANDING_SHIP/CANCELLED`; start or continue to `COMMANDING_SHIP/ACTIVE`; verification to `VERIFYING_WAREHOUSE/ACTIVE`; and ordinary hold to `HOLDING/NONE`. Correlation shall equal the selected decision token, and request disposition shall equal the independently received admission value.

CASE-AUD-01: [Case audit] Cases 1-3 own request classification, 4-6 dock assessment, 7-9 ship classification, 10-12 warehouse classification, 13-20 admission, 21-24 coherence and recovery, 25 state transitions, 26 proposals, 27 priority, and 28 composition. No case exists only to increase the count.

## Required nominal, degraded, and recovery behavior

BEH-01: [Nominal requirement] From healthy idle state, a fresh start at `DOCKED_READY` shall be accepted and select correlated `BEGIN_TRANSFER`; later matching ship accepted or moving evidence shall maintain active transfer, matching ship complete shall move to warehouse verification, and matching warehouse stored shall publish `COMPLETED` and clear the active session.

VER-BEH-01: [Verification criterion] Source and local-contract inspection plus an ordered analyzer witness shall show the entire `BEH-01` trace with exact token preservation, correct owner-state sequence, and no physical-transfer claim.

BEH-02: [Readiness requirement] A fresh start in invalid, in-grid, on-warp, or permission-withheld context shall not change request history or session state and shall publish `REJECTED` with `HOLD`.

VER-BEH-02: [Verification criterion] Exhaustive analysis shall show zero start selections outside `DOCKED_READY` for every prior idle evidence tuple admitted as consistent.

BEH-03: [Fresh-request requirement] After completion or accepted cancellation returns the session to idle, the alternate token shall be treated as fresh, while immediate reuse of the last accepted token shall remain a duplicate; a request deferred during recovery shall require resubmission after recovery opens.

VER-BEH-03: [Verification criterion] Ordered scenario analysis shall witness completion-to-alternate-start, same-token duplicate, recovery-time defer, and post-recovery resubmission.

BEH-04: [Priority requirement] New fault or emergency shall dominate every simultaneous request or progress; closed recovery shall dominate cancellation and progress; stored completion shall dominate cancellation; and a matching cancellation under healthy recovery shall dominate simultaneous nonterminal phase-valid report progress.

VER-BEH-04: [Verification criterion] Exhaustive proposal analysis shall produce at least one reachable witness for each stated conflict and zero inversions of the `CASE-27` order.

BEH-05: [Composition requirement] The public action, cause, mode, token, request disposition, and outcome shall all reflect values transmitted in the same evaluation; no composer field may be obtained by rereading a boundary input or recomputing owner policy.

VER-BEH-05: [Verification criterion] Contract inspection and end-to-end analyzer comparison shall show zero stale-field, prior/post-state, token, mode, disposition, or outcome mismatches.

## Scenario families

SCN-01: [Nominal transfer family] Fresh `START_A` at dock-ready context is followed on separate evaluations by `ACCEPTED_A`, `MOVING_A`, `COMPLETE_A`, `PENDING_A`, and `STORED_A`, ending in public completion and idle or clear owner states.

SCN-02: [Dock-readiness rejection family] Fresh starts in each of invalid, in-grid, on-warp, and permission-withheld context are rejected without ledger or session change.

SCN-03: [Freshness and capacity family] A same-token repeat is duplicate, an alternate-token start while the first session is active is deferred, and the alternate token becomes fresh after terminal clearing.

SCN-04: [Cancellation-priority family] A matching cancel coincident with nonterminal phase-valid ship progress or warehouse pending evidence selects cancellation and clears the active session; stored completion remains terminally dominant, and an idle or mistagged cancel is rejected.

SCN-05: [Emergency propagation family] `EMERGENCY_STOP` coincident with otherwise admissible start, cancel, or progress latches recovery, freezes ordinary states, and publishes a fault hold in the same evaluation.

SCN-06: [Ship-evidence fault family] Invalid or failed ship evidence during an active attempt follows the same latch-freeze-hold chain and cannot be mistaken for completion.

SCN-07: [Warehouse-evidence fault family] Invalid or rejected warehouse evidence during verification follows the latch-freeze-hold chain and cannot publish stored completion.

SCN-08: [Correlation and phase fault family] A wrong-token report, ship completion in idle, warehouse evidence before the await-warehouse phase, or simultaneous ship and warehouse reports each produce a fault rather than progress.

SCN-09: [Incomplete recovery family] `VERIFY_OK` while latched, `RESET` while healthy or recovering, repeated reset, and no control while closed all remain inhibited and cannot select ordinary work.

SCN-10: [Two-event recovery and resume family] From a faulted active transfer, fresh `RESET` yields blocked `RECOVERING`; only later `VERIFY_OK` yields `HEALTHY`, and ordinary progress resumes on a subsequent evaluation without losing the frozen active session.

SCN-11: [Fresh request after recovery family] A request presented during reset or verification is deferred; after recovery is healthy and any active attempt is cancelled or completed, resubmission with the alternate token is accepted at dock-ready context.

SCN-AUD-01: [Scenario audit] `SCN-01` through `SCN-11` are exactly eleven distinct families: nominal evidence sequence, readiness rejection, request freshness and capacity, cancellation priority, emergency propagation, ship fault, warehouse fault, correlation or phase fault, incomplete recovery, valid recovery and resume, and fresh request after recovery.

## Structural, trace, analysis, and acceptance obligations

BOUND-01: [Hard gate] The model shall contain exactly one explicit root System usage, exactly 15 reachable responsibility-bearing semantic usages `PART-01` through `PART-15`, exactly one behavior-free generated-support containment usage, one semantic responsibility layer, physical containment depth two below the root, and one weakly connected raw architectural region.

BOUND-02: [Hard gate] The model shall realize exactly 35 semantic interactions `INT-01` through `INT-35` and exactly six transparent uncredited root-to-container boundary delegations, yielding exactly 41 raw connections. No other support or semantic connection is authorized without Designer revision.

BOUND-03: [Hard gate] The model shall realize exactly 28 counted nontrivial contract cases `CASE-01` through `CASE-28` and exactly eleven scenario families `SCN-01` through `SCN-11`; canonical maps, initialization, invariants, tuple consistency, and generated support shall not inflate either count.

BOUND-04: [Hard gate] `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10` shall remain distinct retained-state owners, and every decision owner in `OWN-AUD-01` shall expose its owner-local derivation. Identity forwarding, centralized recomputation, mirror state, analyzer-only policy, or support credit fails this gate.

LOCAL-01: [Owner-local contract gate] Each `PART-01` through `PART-15` shall expose a total and mutually exclusive finite local relation over only its assigned inputs and `In(...)` state, constrain every published fact and retained post-state, and avoid rereading root inputs, recomputing another owner's predicate, or using current/post-state values as prior-state views.

LOCAL-02: [Revised evidence-owner gate] `PART-08` and `PART-09` shall each receive `AdmissionDecision` directly through `INT-34` or `INT-35`; their local precedence shall be inhibition or fault freeze, accepted-cancellation clear, accepted-start clear initialization, qualified owner-specific progress, then retention. The new inputs may not be routed through or recomputed by `PART-06` or `PART-07`.

PRIORITY-01: [Priority gate] Exhaustive proposal analysis shall establish `fault or closed recovery > completion > matching cancel > warehouse verification > ship progress > fresh start > ordinary hold`, including simultaneous emergency/start, fault/cancel, and cancel/progress witnesses.

PROP-01: [Fault-propagation gate] Exhaustive one-step analysis shall establish that every `FAULT-01` or `FAULT-02` initiator changes the coherence frame, recovery next state, state update permissions, selected action, and public result in the same evaluation with zero ordinary-action leaks.

RECOV-01: [Recovery gate] Ordered analysis shall establish reset-then-later-verification as the sole recovery-opening sequence, retention of the active session through recovery, inhibition during both control evaluations, and a separate post-recovery evaluation before resumed work.

COMPOSE-01: [Composition gate] End-to-end analysis shall establish that arbitration consumes only transmitted proposals and directives and that composition consumes only transmitted decision and disposition values, with mutually consistent action, cause, mode, token, disposition, and outcome.

TRACE-01: [Coverage gate] Every abstract identifier shall trace to retained model elements, owner-local contracts, bounded assertions, scenario witnesses, or an explicit informational or deferred disposition. Every significant model element shall trace back to an abstract identifier or carry a narrow `@generated-support <reason>` annotation.

TRACE-02: [Grammar gate] Adjacent model trace comments shall use only IDs declared by this abstract. A source element may trace one-to-many or many-to-one, but missing parents, reused declaration IDs, and unexplained children fail acceptance.

ANA-01: [Bounded-analysis gate] The root snapshot has exactly `6*5*10*8*4=9,600` finite input combinations. Crossing three request-ledger states, seven session states, four ship-evidence states, two warehouse-evidence states, and three recovery states yields exactly 4,838,400 exhaustive one-step evaluations.

ANA-02: [Ownership-analysis gate] A reference evaluator independent of production owner predicates shall be compared with separate acquisition, assessment, admission, coherence, state, proposal, arbitration, and composition evaluators for every snapshot. Passing requires zero partition gaps, effective overlaps, next-state mismatches, output mismatches, interaction-value mismatches, priority violations, or composition violations and at least one witness for every `CASE-01` through `CASE-28`.

ANA-03: [Sequence-analysis gate] The analyzer shall execute `SCN-01` through `SCN-11`, including nominal completion, alternate-token freshness, simultaneous cancellation and progress, each fault family, reset then later verification, resumed active work, and fresh request after recovery. It shall receive no semantic credit, call no retained owner predicate as an oracle, and support no formal-proof claim.

VERIFY-01: [Verification gate] Mechanical verification shall include library and source conformance, exactly one root, compatible resolved endpoints, exact usage, interaction, case, scenario, and raw-connection counts, owner-local contract inspection, bidirectional trace coverage, bounded analysis, source-hash binding, and architecture-stage plus final Sireum typechecking. Every mandatory check shall pass or remain explicitly `not-run`.

VALID-01: [Validation gate] Designer validation shall separately confirm fidelity to cargo-transfer verification purpose, boundary, assumptions, priority, fault propagation, recovery, scenarios, seed limitations, and deferred claims. Mechanical conformance alone does not establish domain fitness.

PASS-01: [Objective pass criterion] Structural acceptance requires the exact campaign tuple `15/35/28/11`, one root, one behavior-free support container, one semantic layer, depth two, one weak region, five distinct retained-state owners, one principal arbiter, exactly six support delegations, exactly 41 raw connections, and exactly 35 semantic connections with no counted padding.

PASS-02: [Objective pass criterion] Behavioral acceptance requires total and exclusive finite owner partitions, fully constrained retained next states and public fields, witnesses for all 28 cases and all eleven ordered scenario families, priority conflict witnesses, same-evaluation fault propagation, and two-event recovery with a later resumption step.

PASS-03: [Objective pass criterion] Composition acceptance requires every downstream result to be derived from transmitted owner-local facts with zero centralized recomputation, stale prior/current substitution, token disagreement, action/mode/outcome disagreement, or cross-evaluation field mixing.

PASS-04: [Objective pass criterion] Evidence acceptance requires all mandatory deterministic gates to be green and later Designer review to find the realized model semantically fit. Typechecking, visualization, or bounded enumeration alone is insufficient.

SUPPORT-01: [Generated-support allowance] The Model may add only finite enum and flat record definitions, safe initialization, one behavior-free containment usage, exactly six tagged root-to-container boundary delegations, tuple-consistency clauses, static inventories, analyzer fixtures, and visualization-only context. None receives campaign credit or may alter a semantic endpoint, direction, type, or meaning.

EXCL-01: [Explicit exclusion] No physical docking command, undocking control, cargo quantity, manifest, cargo conservation, multiple simultaneous sessions, mining control, repair, resupply, capacitor policy, warehouse mutation, timing deadline, travel physics, combat, or source docking-duration target is required or authorized.

DEFER-02: [Evidence status] Code generation, application implementation, execution, Logika proof, physical validation, probabilistic safety analysis, real-time performance, game fidelity, and certification remain deferred and shall be reported `not-run`, not inferred from static or bounded evidence.

AUTH-MODEL-01: [Designer authorization] Model generation is authorized only against this approved final baseline. Any changed boundary, owner, state, interaction, case, priority, recovery, composition, structural count, support allowance, or deferred claim requires a new explicit Designer resolution in this retained run.
