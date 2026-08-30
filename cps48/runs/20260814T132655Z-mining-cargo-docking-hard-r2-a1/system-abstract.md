---
abstract_id: SA-MCD-HR2-01
seed_id: 20260813T233942Z-mining-cargo-docking-seed-v1
seed_version: 1
status: approved-final
revision: designer-resolution-1
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 15
selected_semantic_interactions: 35
selected_nontrivial_contract_cases: 29
selected_scenario_families: 11
node_count: [15, 16]
edge_count: [35, 41]
reachable_semantic_node_count: [15, 15]
reachable_total_node_count: [15, 16]
semantic_edge_count: [35, 35]
reachable_total_edge_count: [35, 41]
containment_depth: [1, 2]
requires_stateful_behavior: true
requires_fault_behavior: true
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
---

# Docking and Service-Access Supervisor

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen seed supports a mining frigate, pilot, station, docking and undocking, ship and station commands or reports, docked repair or resupply services, and readiness or completion vocabulary. It does not supply a complete docking lifecycle, service-access semantics, correlation rules, readiness, inhibition, priority, invalid-report handling, fault interpretation, or recovery policy.

METHOD-01: [Handbook-derived engineering control] This abstract defines the need and boundary before internal responsibilities, distinguishes monitored from controlled quantities, records assumptions and deferred claims, compares alternatives, allocates cohesive owners, closes finite nominal and off-nominal partitions, and states separate verification and validation criteria. These controls are methodology obligations, not claims about the source frigate.

PILOT-01: [Pilot abstraction] One evaluation consumes one finite logical snapshot and produces one deterministic supervisory result. Two alternating correlation tokens, finite report classes, retained logical state, strict priority, same-evaluation fault propagation, desired-level commands, and a reset-then-anchor-verification recovery protocol are bounded experiment assumptions.

ARCH-01: [Selected architecture] The retained design distributes four boundary classifications, request admission, cross-evidence coherence, four retained-state responsibilities, three independent action proposals, one priority decision, and atomic public composition across exactly 15 semantic usages and exactly 35 typed directed semantic interactions.

ABSTR-01: [Abstraction rule] The clauses fix observable finite relations, responsibility and state ownership, interaction meanings, policy partitions, and evidence obligations without selecting algorithms, schedules, periods, deployment, transport, data encodings, user-interface presentation, physical docking mechanisms, or a SysML decomposition form.

DEFER-01: [Deferred claim] This run does not claim physical docking or undocking, berth integrity, collision avoidance, service effectiveness, cargo movement, warehouse reconciliation, repair or resupply completion, timing performance, game fidelity, vessel safety, certification, production readiness, code generation, formal proof, or executable behavior.

## Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A pilot and station need one bounded supervisor to govern logical docking approach authorization, docked-service access, and undocking release so that access is not opened before concordant vessel and station evidence and departure is not authorized while docked services remain active.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a pilot access request, vessel lifecycle status, station berth report, docked-service activity, and supervisory control event; update request, lifecycle, berth, access-gate, and recovery state; select at most one logical action; and publish one coherent docking-access result.

MISSION-01: [Selected controlled purpose] The organizing lifecycle begins with a dock or docked-access request and ends with logical departure completion or a verified recovery anchor. Cargo transfer may occur outside the boundary while service access is open, but cargo request, evidence, reconciliation, and completion are neither inputs nor controlled outcomes.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every finite boundary snapshot and every admitted prior-state tuple with no unconstrained next owner state or public output field.

GOAL-02: [Pilot abstraction] A newly detected emergency, invalid or contradictory evidence, phase or token fault, or closed recovery shall dominate all ordinary actions and shall revoke logical service access in the same evaluation.

GOAL-03: [Pilot abstraction] In healthy operation, a fresh dock request may lead to clearance and approach authorization; concordant docked and secured evidence may lead to service access; an undock request shall wait for quiescent services and a closed access gate before release and departure authorization.

GOAL-04: [Pilot abstraction] Fault recovery shall abandon the active authorization in quarantine, require a fresh reset, and then require a later evidence-concordant `VERIFY_CLEAR` or `VERIFY_DOCKED` anchor; it shall never resume an old authorization token.

GOAL-05: [Selected architecture] The selected action, cause, public mode, correlation, request disposition, access status, and outcome shall be composed into one indivisible flat `DockingAccessResult` solely from transmitted owner-local decisions.

## Operational context and finite system boundary

CTX-SYS-01: [Selected boundary] The modeled system is a logical docking and service-access supervisor. Physical docking and undocking, vessel motion, berth hardware, station service execution, cargo transfer, warehouse storage, mining, repair, resupply, travel, combat, and whole-vessel lifecycle governance remain outside it.

CTX-PILOT-01: [Seed-grounded entity with pilot responsibility] The external pilot supplies at most one `AccessRequest` event per evaluation and consumes the public result through `CTX-PUB-01`; the pilot is responsible for resubmitting a deferred request and following the bounded token rule in `ASM-TAG-01`.

CTX-VESSEL-01: [Seed-grounded context with pilot responsibility] An external vessel-lifecycle authority supplies one `VesselStatus` snapshot. It is responsible for the declared status and token association, not for proving physical position or docking effectiveness.

CTX-STATION-01: [Seed-grounded entity with pilot responsibility] An external station docking authority consumes logical clearance, approach, release, and departure requests and supplies a later `StationReport`; it is responsible for freshness and token association, not for berth hardware effectiveness.

CTX-SERVICE-01: [Seed-grounded capability with pilot responsibility] An external docked-service aggregator supplies `ServiceActivity` across repair, resupply, or other station services. It is responsible for reporting `QUIESCENT` only when no docked service requires continued logical access; individual service semantics and completion remain outside the system.

CTX-CTRL-01: [Pilot external authority] A station supervisory authority supplies emergency and recovery events after external diagnosis. It is responsible for separating reset from later anchor verification and for issuing an anchor event only with the concordant boundary evidence required by `CASE-24`.

CTX-PUB-01: [Selected boundary] A pilot-and-station integration recipient consumes one `DockingAccessResult` and conveys its logical action to the appropriate external authority without changing its meaning. The supervisor controls authorization requests and an access indication, not external acceptance or physical motion.

MON-REQ-01: [Pilot abstraction] Root input `accessRequest` has finite type `AccessRequest={NONE,INVALID,DOCK_A,DOCK_B,ACCESS_A,ACCESS_B,UNDOCK_A,UNDOCK_B}` and comes from `CTX-PILOT-01`; `A` and `B` are bounded authorization tokens, not berth or cargo identities.

MON-VES-01: [Pilot abstraction] Root input `vesselStatus` has finite type `VesselStatus={INVALID,ON_WARP,IN_GRID,DOCKED_A,DOCKED_B,DEPARTED_A,DEPARTED_B}` and comes from `CTX-VESSEL-01`.

MON-STA-01: [Pilot abstraction] Root input `stationReport` has finite type `StationReport={NONE,INVALID,AVAILABLE,CLEAR_A,CLEAR_B,SECURED_A,SECURED_B,DENIED,RELEASED_A,RELEASED_B}` and comes from `CTX-STATION-01`; every value other than `NONE` is fresh evidence for one evaluation.

MON-SVC-01: [Pilot abstraction] Root input `serviceActivity` has finite type `ServiceActivity={INVALID,QUIESCENT,ACTIVE}` and comes from `CTX-SERVICE-01`; it is a current logical level, not a service count or completion certificate.

MON-CTL-01: [Pilot abstraction] Root input `controlEvent` has finite type `ControlEvent={NONE,EMERGENCY_STOP,RESET,VERIFY_CLEAR,VERIFY_DOCKED}` and comes from `CTX-CTRL-01`; every value other than `NONE` is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record `DockingAccessResult=(action,cause,mode,correlation,requestDisposition,accessStatus,outcome)`, delivered to `CTX-PUB-01`.

TYPE-TOK-01: [Pilot abstraction] `Correlation={NONE,A,B}` identifies a bounded authorization; `NONE` denotes no current authorization-bearing action.

TYPE-ACT-01: [Pilot abstraction] `SupervisoryAction={HOLD,REQUEST_DOCK_CLEARANCE,AUTHORIZE_DOCK_APPROACH,OPEN_SERVICE_ACCESS,CLOSE_SERVICE_ACCESS,REQUEST_UNDOCK_RELEASE,AUTHORIZE_UNDOCK,REVOKE_SERVICE_ACCESS}` contains only logical desired actions.

TYPE-CAUSE-01: [Pilot abstraction] `DecisionCause={FAULT_OR_RECOVERY,DEPARTURE_CONFIRMATION,UNDOCK_SEQUENCE,DOCKING_PROGRESS,ACCESS_REQUEST,NEW_DOCK_REQUEST,NO_ELIGIBLE_ACTION}` records the highest-priority reason selected in an evaluation.

TYPE-MODE-01: [Pilot abstraction] `PublicMode={HOLDING,DOCKING,ACCESSIBLE,UNDOCKING,QUARANTINED}` is derived from the selected decision and is not retained state.

TYPE-DISP-01: [Pilot abstraction] `RequestDisposition={NO_REQUEST,ACCEPTED,DUPLICATE,REJECTED,DEFERRED}` describes only the current request event.

TYPE-ACC-01: [Pilot abstraction] `AccessStatus={CLOSED,OPEN,REVOKED}` is the public logical access claim for the current evaluation; it does not establish physical isolation.

TYPE-OUT-01: [Pilot abstraction] `DockingOutcome={NONE,DOCKING_ACTIVE,DOCKED_ACCESS_READY,ACCESS_ACTIVE,UNDOCKING_ACTIVE,DEPARTURE_COMPLETE,RECOVERY_REQUIRED}` is a supervisory outcome, not physical proof.

TYPE-PHASE-01: [Pilot abstraction] `DecisionContext={CLEAR,DOCKING,DOCKED_CLOSED,ACCESS_OPEN,UNDOCKING,QUARANTINED}` carries the selected observable context needed to make `HOLD` composition total; it is derived from transmitted owner facts and is not retained state.

TYPE-STATE-01: [Pilot abstraction] `RequestLedger={NO_HISTORY,A_LAST,B_LAST}` is retained request-freshness state. `LifecycleState={CLEAR_IDLE,AWAIT_CLEAR_A,AWAIT_CLEAR_B,AWAIT_DOCK_A,AWAIT_DOCK_B,AWAIT_SECURE_A,AWAIT_SECURE_B,DOCKED_CLOSED_A,DOCKED_CLOSED_B,ACCESS_OPEN_A,ACCESS_OPEN_B,AWAIT_RELEASE_A,AWAIT_RELEASE_B,AWAIT_DEPART_A,AWAIT_DEPART_B,DOCKED_REBASE,QUARANTINED}` is retained supervisory lifecycle state and embeds a token only for ordinary authorizations.

TYPE-STATE-02: [Pilot abstraction] `BerthState={UNKNOWN,AVAILABLE,RESERVED,SECURED,RELEASED}`, `GateState={CLOSED,OPEN}`, and `RecoveryState={HEALTHY,LATCHED,RECONCILING}` are independently retained finite state types.

TYPE-FACT-01: [Selected mapping] `RequestFacts`, `VesselFacts`, `StationFacts`, and `ServiceFacts` are flat owner-derived records containing presence, usability, class, exact token where applicable, and the distinct readiness or activity facts assigned below.

TYPE-DEC-01: [Selected mapping] `AdmissionDecision`, `CoordinationFrame`, `BerthTransitionEvidence`, `RecoveryTransition`, three typed action proposals, and `PriorityDirective` are finite flat records. `BerthTransitionEvidence` carries a qualified event class drawn from dominant fault, verified clear anchor, verified docked anchor, station availability, station clearance, station secured, station released, departure completion, or no berth event, plus only the correlation and qualification facts needed to preserve coherence; it shall contain neither `nextBerthState` nor a one-to-one surrogate for every `BerthState`. `DockingDecision=(action,cause,correlation,decisionContext)` preserves the selected owner-local result; none of these records serves as hidden state.

ASM-FRESH-01: [Pilot abstraction] `CTX-PILOT-01`, `CTX-STATION-01`, and `CTX-CTRL-01` are responsible for event freshness. Rationale: replayed requests, station reports, or recovery events could otherwise advance a retained owner more than once.

ASM-TAG-01: [Pilot abstraction] `CTX-PILOT-01` shall alternate `A` and `B` between accepted authorization starts. `ACCESS_*` and `UNDOCK_*` shall use the active token except that `ACCESS_*` after `DOCKED_REBASE` shall use the token opposite the last accepted ledger value. Rationale: two tokens bound analysis while distinguishing duplicate and stale requests.

ASM-CAP-01: [Pilot abstraction] The supervisor retains at most one authorization and one berth commitment and stores no cargo, service manifest, or physical geometry. `CTX-PILOT-01` shall retry a valid request reported `DEFERRED`. Rationale: these are finite experiment bounds, not station-capacity claims.

ASM-CONC-01: [Pilot abstraction] `CTX-STATION-01` and `CTX-VESSEL-01` may provide station and vessel evidence in either order. If both are progress-bearing in one evaluation, they shall carry the same active token; contradiction, mistagging, or phase inconsistency is a fault rather than an assumed ordering.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not transaction counts. `CTX-STATION-01` and `CTX-SERVICE-01` shall not interpret a repeated identical action as a second docking, access, or departure transaction while its prerequisite state remains unchanged.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no physical duration: prior owner states and current boundary facts determine admission and coherence; state owners determine their own next state; proposal owners derive candidates; arbitration selects one; composition publishes one result.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, request history is `NO_HISTORY`, lifecycle is `CLEAR_IDLE`, berth is `AVAILABLE`, gate is `CLOSED`, recovery is `HEALTHY`, and the result is `(HOLD,NO_ELIGIBLE_ACTION,HOLDING,NONE,NO_REQUEST,CLOSED,NONE)`.

## Risks, faults, and mitigations

RISK-01: [Pilot risk] Opening service access without concordant docked-vessel and secured-berth evidence could expose station services during an unconfirmed lifecycle phase; `FAULT-01` requires phase and token inconsistencies to revoke access and quarantine the authorization.

RISK-02: [Pilot risk] Authorizing undocking while service activity is `ACTIVE` or the access gate remains logically open could conflict with docked-service use; `FAULT-02` requires admission inhibition and dominant gate closure before release progression.

RISK-03: [Pilot risk] Resuming the pre-fault authorization after ambiguous vessel or berth evidence could reuse a stale clearance; `FAULT-03` requires token abandonment and an independently verified clear or docked recovery anchor.

FAULT-01: [Pilot requirement] An emergency, invalid vessel, station, or service evidence, station denial, mistagged progress, phase-inconsistent progress, contradictory vessel and station evidence, active service while the gate is closed, or an inconsistent prior owner-state tuple shall derive a fault trigger, latch recovery, set lifecycle to `QUARANTINED`, berth to `UNKNOWN`, gate to `CLOSED`, select `REVOKE_SERVICE_ACCESS`, and publish `FAULT_OR_RECOVERY/QUARANTINED/REVOKED/RECOVERY_REQUIRED` in the same evaluation. An invalid pilot request remains the rejection case in `CASE-15`. Verification passes only if local-contract inspection and bounded analysis establish the full chain for every initiating class with zero ordinary-action leaks.

FAULT-02: [Pilot requirement] A healthy matching `UNDOCK_*` received while service activity is `ACTIVE` shall be `DEFERRED` and shall not issue release or departure authorization; once resubmitted with `QUIESCENT`, access closure shall precede release request, and release shall precede departure authorization. Verification passes only if ordered witnesses establish the three distinct steps and exhaustive conflict checks find no bypass.

FAULT-03: [Pilot requirement] While recovery is `LATCHED` or `RECONCILING`, ordinary admission and proposals shall remain inhibited. Only fresh `RESET` from `LATCHED` shall enter `RECONCILING`; only a later concordant anchor verification shall return `HEALTHY`; the abandoned token shall never be restored. Verification passes only if sequences reject reset alone, early or contradictory verification, repeated controls, and same-evaluation restart.

## Selected semantic usages and ownership audit

PART-01: [Selected architecture; semantic usage] `request_classification` owns the many-to-one derivation of request presence, validity, operation kind, exact correlation, and whether the request starts or continues an authorization; it shall not decide freshness or admission.

PART-02: [Selected architecture; semantic usage] `vessel_status_assessment` owns usability, lifecycle class, approach readiness, docked or departed status, and exact correlation from `VesselStatus`; it shall not decide station concordance.

PART-03: [Selected architecture; semantic usage] `station_report_assessment` owns report presence, usability, berth-progress class, station availability, denial status, and exact correlation from `StationReport`; it shall not decide phase coherence.

PART-04: [Selected architecture; semantic usage] `service_activity_assessment` owns usability, quiescence, activity, and whether service status permits an access or undock request; it shall not own the access gate.

PART-05: [Selected architecture; state and decision owner] `request_admission` is the sole `RequestLedger` owner and derives freshness, active-token matching, disposition, admitted operation, and next ledger from request facts, received readiness facts, and the received coordination guard.

PART-06: [Selected architecture; decision owner] `access_coherence` combines vessel, station, and service facts, control event, and received prior owner-state views to derive concordance, phase- and token-qualified progress, fault trigger, recovery intent, admission guard, lifecycle and gate directives, qualified `BerthTransitionEvidence`, and a dominant priority directive without updating retained state or selecting the next `BerthState`.

PART-07: [Selected architecture; state and decision owner] `docking_lifecycle` is the sole `LifecycleState` owner and derives its next lifecycle and active-session view from the received frame and admission decision, including loss of the active token on quarantine.

PART-08: [Selected architecture; state and decision owner] `berth_commitment` is the sole `BerthState` owner and combines received `BerthTransitionEvidence` with its own `In(berthState)` to select the next state under the retained precedence. It owns the prior-state-dependent transition among `UNKNOWN`, `AVAILABLE`, `RESERVED`, `SECURED`, `RELEASED`, and retention; it shall not repeat phase or token coherence.

PART-09: [Selected architecture; state and decision owner] `service_access_gate` is the sole `GateState` owner and derives opening, ordered closure, forced revocation, or retention from its retained gate, received safety frame, and received admitted operation.

PART-10: [Selected architecture; state and decision owner] `recovery_supervisor` is the sole `RecoveryState` owner and derives latch, reconcile, verified reopen, or retention from the received fault and anchor transition; it shall not reclassify boundary evidence.

PART-11: [Selected architecture; decision owner] `docking_action_eligibility` derives a clearance-request or approach-authorization proposal from the received admission and qualified docking frame; it shall not infer service or undocking eligibility.

PART-12: [Selected architecture; decision owner] `access_action_eligibility` derives an open-access or close-access proposal from the received admission and qualified access frame; it shall not issue station release or departure actions.

PART-13: [Selected architecture; decision owner] `undocking_action_eligibility` derives a release-request or departure-authorization proposal from the received admission and qualified undocking frame; it shall not open service access.

PART-14: [Selected architecture; principal decision owner] `docking_action_arbitration` selects exactly one `DockingDecision` by the strict priority in `CASE-28` from one dominant directive and the three received proposals; it shall not recompute acquisition, admission, coherence, or state-owner predicates.

PART-15: [Selected architecture; composition decision owner] `result_composition` derives public mode, access status, correlation consistency, and outcome from the received docking decision and request disposition, then emits one atomic `DockingAccessResult`; it owns no retained or mirror state.

OWN-AUD-01: [Ownership audit] Retained state is divided among `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10`; cross-evidence phase and token qualification belongs only to `PART-06`; the prior-state-dependent berth transition relation belongs only to `PART-08`; proposals belong separately to `PART-11`, `PART-12`, and `PART-13`; strict priority belongs only to `PART-14`; public composition belongs only to `PART-15`.

OWN-AUD-02: [Ownership audit] Every `PART-01` through `PART-15` derives at least one behaviorally meaningful owner-local fact. `PART-08` receives qualified event evidence rather than a desired next-state code and earns credit only for combining that evidence with prior berth state; copied prior-state publication and carried qualification fields earn no credit. No identity copier, one-to-one renamer, splitter, router, mirror-state holder, root, support container, visualization actor, or analyzer fixture receives semantic-usage or owner credit.

## Complete typed directed semantic interaction inventory

INT-01: [Semantic boundary interaction] `CTX-PILOT-01` shall provide root `AccessRequest` to `request_classification.access_request`.

INT-02: [Semantic boundary interaction] `CTX-VESSEL-01` shall provide root `VesselStatus` to `vessel_status_assessment.vessel_status`.

INT-03: [Semantic boundary interaction] `CTX-STATION-01` shall provide root `StationReport` to `station_report_assessment.station_report`.

INT-04: [Semantic boundary interaction] `CTX-SERVICE-01` shall provide root `ServiceActivity` to `service_activity_assessment.service_activity`.

INT-05: [Semantic boundary interaction] `CTX-CTRL-01` shall provide root `ControlEvent` to `access_coherence.control_event`.

INT-06: [Semantic boundary interaction] `result_composition.docking_access_result` shall provide `DockingAccessResult` to `CTX-PUB-01`.

INT-07: [Semantic interaction] `request_classification.request_facts` shall provide `RequestFacts` to `request_admission.request_facts`.

INT-08: [Semantic interaction] `vessel_status_assessment.vessel_facts` shall provide approach and dock readiness facts to `request_admission.vessel_readiness`.

INT-09: [Semantic interaction] `service_activity_assessment.service_facts` shall provide quiescence and request-permission facts to `request_admission.service_readiness`.

INT-10: [Semantic interaction] `vessel_status_assessment.vessel_facts` shall provide exact classified vessel evidence to `access_coherence.vessel_facts`.

INT-11: [Semantic interaction] `station_report_assessment.station_facts` shall provide exact classified station evidence to `access_coherence.station_facts`.

INT-12: [Semantic interaction] `service_activity_assessment.service_facts` shall provide exact classified service evidence to `access_coherence.service_facts`.

INT-13: [Semantic state-view interaction] `docking_lifecycle.prior_lifecycle_view` shall provide retained prior lifecycle and active token to `access_coherence.prior_lifecycle_view`.

INT-14: [Semantic state-view interaction] `berth_commitment.prior_berth_state` shall provide retained prior `BerthState` to `access_coherence.prior_berth_state`.

INT-15: [Semantic state-view interaction] `service_access_gate.prior_gate_state` shall provide retained prior `GateState` to `access_coherence.prior_gate_state`.

INT-16: [Semantic state-view interaction] `recovery_supervisor.prior_recovery_state` shall provide retained prior `RecoveryState` to `access_coherence.prior_recovery_state`.

INT-17: [Semantic interaction] `access_coherence.recovery_transition` shall provide fault, reset, and verified-anchor intent to `recovery_supervisor.recovery_transition`.

INT-18: [Semantic interaction] `access_coherence.admission_guard` shall provide health, phase class, active token, berth availability, and ordinary-inhibition facts to `request_admission.admission_guard`.

INT-19: [Semantic interaction] `access_coherence.lifecycle_frame` shall provide qualified progress, quarantine, anchor, or retention directive to `docking_lifecycle.lifecycle_frame`.

INT-20: [Semantic interaction] `access_coherence.berth_transition_evidence` shall provide phase- and token-qualified fault, recovery-anchor, station-progress, departure-completion, or no-event `BerthTransitionEvidence` to `berth_commitment.berth_transition_evidence`; the payload shall not encode a desired next `BerthState` or an extensionally equivalent code.

INT-21: [Semantic interaction] `access_coherence.gate_safety_frame` shall provide forced-close, access-safe, or retain directive to `service_access_gate.gate_safety_frame`.

INT-22: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `docking_lifecycle.admission_decision`.

INT-23: [Semantic interaction] `request_admission.admission_decision` shall provide `AdmissionDecision` to `service_access_gate.admission_decision`.

INT-24: [Semantic interaction] `request_admission.admission_decision` shall provide admitted docking intent to `docking_action_eligibility.admission_decision`.

INT-25: [Semantic interaction] `request_admission.admission_decision` shall provide admitted access intent to `access_action_eligibility.admission_decision`.

INT-26: [Semantic interaction] `request_admission.admission_decision` shall provide admitted undocking intent to `undocking_action_eligibility.admission_decision`.

INT-27: [Semantic interaction] `access_coherence.docking_frame` shall provide qualified docking progress and active token to `docking_action_eligibility.docking_frame`.

INT-28: [Semantic interaction] `access_coherence.access_frame` shall provide qualified secured, gate, and service facts to `access_action_eligibility.access_frame`.

INT-29: [Semantic interaction] `access_coherence.undocking_frame` shall provide qualified gate-closed, release, departure, and token facts to `undocking_action_eligibility.undocking_frame`.

INT-30: [Semantic interaction] `docking_action_eligibility.docking_proposal` shall provide its typed proposal to `docking_action_arbitration.docking_proposal`.

INT-31: [Semantic interaction] `access_action_eligibility.access_proposal` shall provide its typed proposal to `docking_action_arbitration.access_proposal`.

INT-32: [Semantic interaction] `undocking_action_eligibility.undocking_proposal` shall provide its typed proposal to `docking_action_arbitration.undocking_proposal`.

INT-33: [Semantic interaction] `access_coherence.priority_directive` shall provide fault, recovery, departure-completion, or ordinary priority to `docking_action_arbitration.priority_directive`.

INT-34: [Semantic interaction] `docking_action_arbitration.docking_decision` shall provide `DockingDecision` to `result_composition.docking_decision`.

INT-35: [Semantic interaction] `request_admission.request_disposition` shall provide current `RequestDisposition` to `result_composition.request_disposition`.

INT-AUD-01: [Interaction audit] `INT-01` through `INT-35` are the complete semantic inventory: six boundary interactions, six classified-fact deliveries, four prior-state views, five coherence or admission effects into state owners, five admission deliveries, three specialized coherence frames, three proposals, one dominant directive, and two arbitration or composition deliveries. Every interaction has one typed direction and a distinct behavioral trace.

## Finite policy and nontrivial contract cases

PARTITION-01: [Coverage rule] `CASE-01` through `CASE-29` are exactly 29 counted nontrivial cases. Within each named owner relation they are total and mutually exclusive under the stated precedence; finite enum maps, initialization, state-consistency invariants, record field equalities, and analyzer plumbing do not add counted cases.

CASE-01: [Request classification] `NONE` shall derive not present, usable, no operation, `NONE` correlation, and no authorization-start fact.

CASE-02: [Request classification] Each `DOCK_A`, `DOCK_B`, `ACCESS_A`, `ACCESS_B`, `UNDOCK_A`, or `UNDOCK_B` shall derive present, usable, its exact operation, its exact token, and an authorization-start fact only for `DOCK_*`.

CASE-03: [Request classification] `INVALID` shall derive present, unusable, no admissible operation, and `NONE` correlation.

CASE-04: [Vessel assessment] `INVALID` shall derive unusable, neither approach-ready nor docked nor departed, and `NONE` correlation.

CASE-05: [Vessel assessment] `ON_WARP` and `IN_GRID` shall derive usable untagged lifecycle classes, with approach readiness true only for `IN_GRID`.

CASE-06: [Vessel assessment] Each `DOCKED_A`, `DOCKED_B`, `DEPARTED_A`, or `DEPARTED_B` shall derive usable exact docked-or-departed class and exact token.

CASE-07: [Station assessment] `NONE` shall derive no station event, usable, no progress, no denial, and `NONE` correlation.

CASE-08: [Station assessment] `AVAILABLE` shall derive a usable availability event with no authorization token.

CASE-09: [Station assessment] Each `CLEAR_*`, `SECURED_*`, or `RELEASED_*` shall derive its exact usable progress class and exact token.

CASE-10: [Station assessment] `INVALID` and `DENIED` shall derive an unusable-or-denied fault class, no admissible progress, and `NONE` correlation.

CASE-11: [Service assessment] `INVALID` shall derive unusable, not quiescent, not active, and no request permission.

CASE-12: [Service assessment] `QUIESCENT` shall derive usable, quiescent, not active, and permission for otherwise eligible access or undock requests.

CASE-13: [Service assessment] `ACTIVE` shall derive usable, active, not quiescent, and inhibition of new undock admission without itself claiming a service fault when the gate is open.

CASE-14: [Request admission] No present request shall derive `NO_REQUEST`, no admitted operation, and no ledger update.

CASE-15: [Request admission] An unusable request shall derive `REJECTED`, no admitted operation, and no ledger update regardless of other readiness facts.

CASE-16: [Request admission] With healthy open coordination, prior `CLEAR_IDLE`, berth available, vessel `IN_GRID`, and a `DOCK_*` token different from the ledger, the request shall derive `ACCEPTED`, admit dock, and update the ledger to that token.

CASE-17: [Request admission] With an open admission guard, a `DOCK_*` whose token equals the last accepted ledger token shall derive `DUPLICATE`, preserve the request ledger, admit no operation, and enable no request proposal.

CASE-18: [Request admission] With an open admission guard, a fresh `DOCK_*` in healthy `CLEAR_IDLE` with a usable non-faulting vessel status other than `IN_GRID` or a berth state other than available shall derive `REJECTED`, preserve the ledger, and enable no proposal; invalid or phase-inconsistent evidence is instead governed by `CASE-22`.

CASE-19: [Request admission] Any usable `DOCK_*` while the received admission guard is closed by a current fault, closed recovery, or recovery-control evaluation, and any fresh `DOCK_*` while an authorization is active, shall derive `DEFERRED`, preserve the ledger, and require resubmission.

CASE-20: [Request admission] With healthy open coordination, `ACCESS_*` shall be `ACCEPTED` only when its token matches `DOCKED_CLOSED_*` with quiescent service, or when prior lifecycle is `DOCKED_REBASE`, service is quiescent, and its token differs from the ledger; the rebase branch updates the ledger and establishes the new token. Any usable access request while the received admission guard is closed shall be `DEFERRED`; every other access request shall be `REJECTED`.

CASE-21: [Request admission] With healthy open coordination, matching `UNDOCK_*` in `ACCESS_OPEN_*` with quiescent service shall be `ACCEPTED`; a matching request with active service and any usable undock request while the received admission guard is closed shall be `DEFERRED`; every healthy idle, wrong-token, gate-closed, or wrong-phase undock request shall be `REJECTED`.

CASE-22: [Evidence coherence and fault propagation] Any `FAULT-01` initiator shall derive fault trigger, latch intent, ordinary inhibition, token abandonment, lifecycle quarantine, berth unknown, forced gate close, dominant revocation, and `RECOVERY_REQUIRED`; all ordinary progress and request proposals are suppressed in the same evaluation.

CASE-23: [Evidence coherence and ordinary progress] With healthy recovery, `NONE` control, a consistent prior tuple, and no fault, matching phase-valid `CLEAR_*`, `DOCKED_*`, `SECURED_*`, `RELEASED_*`, or `DEPARTED_*` evidence shall derive only its qualified docking, berth, access, release, or completion updates. Vessel-docked and station-secured evidence may arrive in either order; no event retains state; mismatched, contradictory, or phase-invalid progress is governed by `CASE-22`.

CASE-24: [Evidence coherence and recovery] In the absence of a new fault, `LATCHED` plus fresh `RESET` shall yield `RECONCILING`. A later `VERIFY_CLEAR` shall yield `HEALTHY/CLEAR_IDLE/AVAILABLE/CLOSED` only with vessel `IN_GRID`, station `AVAILABLE`, and service `QUIESCENT`; a later `VERIFY_DOCKED` shall yield `HEALTHY/DOCKED_REBASE/SECURED/CLOSED` only with token-concordant `DOCKED_*` and `SECURED_*` plus quiescent service. Every other closed-recovery or non-`NONE` control combination remains inhibited and retains the appropriate closed state.

CASE-25: [State-owner transition partition] Each retained owner shall apply exactly this precedence using only received evidence or directives and its own `In(...)` state: fault quarantine or forced close; valid recovery anchor; accepted ordinary operation assigned to that owner; qualified evidence progress; then retention. In the berth owner specifically, dominant fault selects `UNKNOWN`; verified clear anchor selects `AVAILABLE`; verified docked anchor selects `SECURED`; qualified clearance selects `RESERVED` only from the applicable available commitment; qualified secured progress selects `SECURED` only from the applicable reservation; qualified release selects `RELEASED` only from the applicable secured commitment; departure completion selects `AVAILABLE` only from the applicable released commitment; and every other combination retains `In(berthState)`. Departure completion shall also return lifecycle to `CLEAR_IDLE` and gate to `CLOSED`; `PART-06` retains phase and token contradiction detection, and no state owner may recreate another owner's guard.

CASE-26: [Docking proposal partition] Docking eligibility shall propose `REQUEST_DOCK_CLEARANCE` only for an accepted dock and shall propose `AUTHORIZE_DOCK_APPROACH` only after a matching qualified clearance in the active await-clear phase; all other inputs shall produce no docking proposal.

CASE-27: [Access and undocking proposal partition] Access eligibility shall propose `OPEN_SERVICE_ACCESS` only for accepted access at a qualified docked-secured state and `CLOSE_SERVICE_ACCESS` only for accepted undock while the gate is open. Undocking eligibility shall propose `REQUEST_UNDOCK_RELEASE` only in await-release with the gate closed and `AUTHORIZE_UNDOCK` only after matching qualified release; all other inputs to each owner shall produce no proposal.

CASE-28: [Priority partition] Arbitration shall select exactly one decision using `fault or closed-recovery revocation > departure completion hold > access closure > undock departure authorization > undock release request > docking approach authorization > access opening > fresh dock clearance > ordinary hold`. A higher selection shall suppress lower proposals without altering their owner-local values.

CASE-29: [Composition partition] Composition shall map every selected action and cause to exactly one public tuple: fault or recovery to `QUARANTINED/REVOKED/RECOVERY_REQUIRED`; departure completion to `HOLDING/CLOSED/DEPARTURE_COMPLETE`; dock clearance or approach to `DOCKING/CLOSED/DOCKING_ACTIVE`; access opening to `ACCESSIBLE/OPEN/ACCESS_ACTIVE`; and access closure, release request, or departure authorization to `UNDOCKING/CLOSED/UNDOCKING_ACTIVE`. For `HOLD`, received decision contexts map exactly as follows: `CLEAR` to `HOLDING/CLOSED/NONE`, `DOCKING` to `DOCKING/CLOSED/DOCKING_ACTIVE`, `DOCKED_CLOSED` to `HOLDING/CLOSED/DOCKED_ACCESS_READY`, `ACCESS_OPEN` to `ACCESSIBLE/OPEN/ACCESS_ACTIVE`, `UNDOCKING` to `UNDOCKING/CLOSED/UNDOCKING_ACTIVE`, and `QUARANTINED` to `QUARANTINED/REVOKED/RECOVERY_REQUIRED`. Correlation and disposition shall equal the received values.

CASE-AUD-01: [Case audit] Cases 1-3 own request classification, 4-6 vessel assessment, 7-10 station assessment, 11-13 service assessment, 14-21 admission including fresh and recovery-time requests, 22-24 coherence qualification and recovery, 25 state-owner transitions including `PART-08`'s prior-state-dependent berth relation, 26-27 independent proposal relations, 28 strict priority, and 29 composition. Copied state views and carried qualification fields are uncredited, and no case exists only to increase the count.

## Required nominal, degraded, and recovery behavior

BEH-01: [Nominal requirement] From healthy clear state, a fresh dock request at `IN_GRID` with berth available shall select clearance request; later matching clearance shall select approach authorization; vessel-docked and station-secured evidence in either order shall establish docked-closed state; matching access shall open the logical gate; after services become quiescent, matching undock shall close access, then request release, authorize departure after matching release, and publish completion after matching departure.

VER-BEH-01: [Verification criterion] Source and owner-local contract inspection plus ordered analyzer witnesses shall show both docked-evidence orderings, exact token preservation, all state transitions, and no physical docking or service-completion claim.

BEH-02: [Readiness requirement] A fresh dock request shall be rejected when the usable vessel status is on warp or the berth is not available and shall be deferred rather than replace another authorization or pass a closed guard. Invalid or phase-inconsistent docked evidence shall follow the dominant fault path and shall not select clearance.

VER-BEH-02: [Verification criterion] Exhaustive analysis shall show zero clearance requests outside healthy `CLEAR_IDLE` with `IN_GRID`, available berth, and a fresh token.

BEH-03: [Fresh-request requirement] A same-token dock repeat shall remain duplicate; an alternate dock while busy shall be deferred; after departure or verified clear recovery, only the alternate token shall begin a new authorization; every request deferred during recovery shall require resubmission after the recovery anchor.

VER-BEH-03: [Verification criterion] Ordered analysis shall witness duplicate, busy defer, alternate-token restart, recovery-time defer, and post-recovery resubmission without an implicit queued request.

BEH-04: [Priority requirement] New fault or emergency shall dominate every simultaneous request and progress item; closed recovery shall dominate all proposals; access closure shall precede release; departure completion shall dominate an otherwise stale ordinary proposal; and no access opening shall occur in the same evaluation as a higher-priority undocking or revocation decision.

VER-BEH-04: [Verification criterion] Exhaustive proposal analysis shall produce a reachable witness for each stated conflict and zero inversions of `CASE-28`.

BEH-05: [Composition requirement] The public action, cause, mode, token, disposition, access status, and outcome shall all reflect values transmitted in one evaluation; composition shall not reread a root input, owner state, or another owner's private predicate.

VER-BEH-05: [Verification criterion] Local-contract inspection and end-to-end analyzer comparison shall show zero stale-field, token, action-mode, access-status, disposition, outcome, or cross-evaluation mismatches.

## Scenario families

SCN-01: [Nominal docking-access-undocking family] Fresh `DOCK_A` at clear readiness is followed by `CLEAR_A`, vessel `DOCKED_A` and station `SECURED_A` in either order, `ACCESS_A`, active then quiescent services, `UNDOCK_A`, gate closure, `RELEASED_A`, and `DEPARTED_A`, ending in public departure completion and clear owner states.

SCN-02: [Dock-readiness exclusion family] Fresh dock requests with vessel on warp or berth unavailable are rejected without ledger or lifecycle change; invalid or phase-inconsistent already-docked evidence instead revokes and quarantines without selecting clearance.

SCN-03: [Freshness and single-authorization family] A same-token dock repeat is duplicate, an alternate dock while the first authorization is active is deferred, and the alternate token becomes fresh only after departure or verified-clear recovery.

SCN-04: [Dock-evidence ordering family] Vessel-docked evidence before station-secured evidence and station-secured evidence before vessel-docked evidence both reach docked-closed state; neither item alone opens service access.

SCN-05: [Service-access family] Matching access opens the gate only from docked-closed with secured berth and quiescent service; a wrong-token, wrong-phase, invalid-service, or premature access request cannot open it.

SCN-06: [Undock-quiescence and ordering family] Matching undock during active service is deferred; resubmission after quiescence closes access first, a later evaluation requests release, matching release authorizes departure, and matching departure completes.

SCN-07: [Emergency and invalid-evidence propagation family] Emergency, invalid vessel, invalid station, invalid service, station denial, or an inconsistent prior tuple each follows the same immediate revoke-quarantine-latch-publication chain.

SCN-08: [Correlation and phase fault family] Wrong-token clearance, secured, docked, released, or departed evidence; mutually contradictory simultaneous evidence; active service with a closed gate; and progress in the wrong phase each produce recovery-required rather than ordinary progress.

SCN-09: [Incomplete recovery family] Verification while latched, reset while healthy or reconciling, repeated reset, contradictory anchor evidence, and no control while closed all remain inhibited and cannot restore an abandoned token.

SCN-10: [Clear-anchor recovery family] From a faulted authorization, fresh reset yields reconciling; only later `VERIFY_CLEAR` with `IN_GRID`, station available, and quiescent service yields healthy clear idle; a request during either control evaluation is deferred and must be resubmitted afterward with the alternate token.

SCN-11: [Docked-anchor recovery family] From a fault with the vessel externally docked, fresh reset followed later by `VERIFY_DOCKED` with token-concordant docked and secured evidence plus quiescent service yields untagged docked-rebase with access closed; a later fresh alternate-token access request establishes a new authorization rather than resuming the abandoned one.

SCN-AUD-01: [Scenario audit] `SCN-01` through `SCN-11` are exactly eleven distinct families: nominal end-to-end access, readiness rejection, request freshness, evidence ordering, access admission, quiescent undock ordering, emergency or invalid propagation, correlation or phase faults, incomplete recovery, clear-anchor recovery, and docked-anchor recovery.

## Structural, trace, analysis, diversity, and acceptance obligations

BOUND-01: [Hard gate] The model shall contain exactly one explicit root System usage and exactly 15 reachable responsibility-bearing semantic usages `PART-01` through `PART-15`. It may realize them flat at depth one or beneath exactly one behavior-free generated-support container at depth two; no additional semantic or support usage is authorized.

BOUND-02: [Hard gate] The model shall realize exactly 35 semantic interactions `INT-01` through `INT-35` in one weakly connected semantic region. A flat realization has exactly 35 raw connections; a one-container realization may add exactly six transparent uncredited root boundary delegations for exactly 41 raw connections. No other connection is authorized without Designer revision.

BOUND-03: [Hard gate] The model shall realize exactly 29 counted nontrivial contract cases `CASE-01` through `CASE-29` and exactly eleven scenario families `SCN-01` through `SCN-11`; canonical maps, initialization, invariants, tuple consistency, and generated support shall not inflate either count.

BOUND-04: [Hard gate] `PART-05`, `PART-07`, `PART-08`, `PART-09`, and `PART-10` shall remain distinct retained-state owners, and every decision owner in `OWN-AUD-01` shall expose its owner-local derivation. Identity forwarding, centralized recomputation, mirror state, analyzer-only policy, or support credit fails this gate.

LOCAL-01: [Owner-local contract gate] Each `PART-01` through `PART-15` shall expose a total and mutually exclusive finite local relation over only its assigned inputs and, for a state owner, its own `In(...)` state; it shall constrain every published fact and retained post-state without rereading roots or recreating another owner's predicate. `INT-13` through `INT-16` shall publish prior views from `In(ownerState)` while post-state is constrained separately. `PART-08` shall implement the `CASE-25` berth relation locally from `BerthTransitionEvidence` and `In(berthState)`, and the later ownership audit shall credit only that transition decision.

PRIORITY-01: [Priority gate] Exhaustive proposal analysis shall establish the complete `CASE-28` order, including emergency with dock request, fault with release evidence, access closure versus access opening, and departure completion versus a stale lower proposal.

PROP-01: [Fault-propagation gate] Exhaustive one-step analysis shall establish that every `FAULT-01` initiator changes coherence, recovery next state, lifecycle next state, berth next state, gate next state, selected action, and public result in the same evaluation with zero ordinary-action leaks.

RECOV-01: [Recovery gate] Ordered analysis shall establish reset then later concordant anchor verification as the only recovery-opening sequences, permanent abandonment of the old token, inhibition during both control evaluations, and a separately resubmitted alternate-token request after recovery.

COMPOSE-01: [Composition gate] End-to-end analysis shall establish that arbitration consumes only transmitted proposals and the dominant directive and that composition consumes only the transmitted decision and disposition, with mutually consistent action, cause, mode, token, access status, and outcome.

TRACE-01: [Coverage gate] Every abstract identifier shall trace to retained model elements, owner-local contracts, bounded assertions, scenario witnesses, or an explicit informational or deferred disposition. Every significant model element shall trace back to an abstract identifier or carry a narrow `@generated-support <reason>` annotation.

TRACE-02: [Grammar gate] Adjacent model trace comments shall use only IDs declared by this abstract. A source element may trace one-to-many or many-to-one, but missing parents, reused declaration IDs, and unexplained children fail acceptance.

ANA-01: [Bounded-analysis gate] The root snapshot has exactly `8*7*10*3*5=8,400` finite input combinations. Crossing three ledger states, seventeen lifecycle states, five berth states, two gate states, and three recovery states yields exactly 12,852,000 exhaustive one-step evaluations before consistency filtering; the analyzer shall either enumerate that full product or prove and report an equivalent partition-preserving reduction without weakening any case.

ANA-02: [Ownership-analysis gate] A reference evaluator independent of production owner predicates shall be compared with separate classification, admission, coherence, state, proposal, arbitration, and composition evaluators for every analyzed snapshot. Passing requires zero partition gaps, effective overlaps, next-state mismatches, output mismatches, interaction-value mismatches, priority violations, or composition violations and at least one witness for every `CASE-01` through `CASE-29`.

ANA-03: [Sequence-analysis gate] The analyzer shall execute `SCN-01` through `SCN-11`, including both docking-evidence orders, deferred undock and resubmission, access-close-before-release, each fault class, both recovery anchors, token abandonment, and alternate-token restart. It receives no semantic credit, calls no retained owner predicate as an oracle, and supports no formal-proof claim.

DIV-01: [Diversity gate] The closest baseline is replicate-1 Hard `Station Cargo-Transfer Evidence Coordinator`. This system differs in boundary, state ownership, interaction topology, priority policy, and recovery policy: it has no cargo request, ship-transfer report, warehouse report, reconciliation state, or transfer outcome; it owns docking lifecycle, berth commitment, service gate, and anchor recovery; and it controls access and release sequencing rather than offload verification.

DIV-02: [Diversity rationale] This is not an extension, repartition, or rename of the baseline because cargo transfer cannot be initiated, reconciled, verified, or completed anywhere in its finite boundary or state machine. The baseline's two-party ship/warehouse evidence join and frozen-session recovery are replaced by vessel/berth/service concordance, an independently stateful access gate, quiescence-before-release priority, token abandonment, and clear-or-docked recovery rebasing.

VERIFY-01: [Verification gate] Mechanical verification shall include library and source conformance, exactly one root, compatible resolved endpoints, exact semantic usage, interaction, case, and scenario counts, allowed raw counts and depth, owner-local contract inspection, bidirectional trace coverage, bounded analysis, source-hash binding, and architecture-stage plus final Sireum typechecking. Every mandatory check shall pass or remain explicitly `not-run`.

VALID-01: [Validation gate] Designer validation shall separately confirm fidelity to docking and service-access purpose, finite boundary, assumptions, priority, fault propagation, recovery, scenario traces, seed limitations, diversity obligations, and deferred claims. Mechanical conformance alone does not establish domain fitness.

PASS-01: [Objective pass criterion] Structural acceptance requires the exact campaign tuple `15/35/29/11`, one root, one weak semantic region, five distinct retained-state owners, three proposal owners, one principal arbiter, and either the authorized flat `15 nodes/35 raw edges/depth 1` realization or the authorized one-container `16 nodes/41 raw edges/depth 2` realization, with no counted padding.

PASS-02: [Objective pass criterion] Behavioral acceptance requires total and exclusive finite owner partitions, fully constrained retained next states and public fields, witnesses for all 29 cases and all eleven scenario families, priority conflict witnesses, same-evaluation fault propagation, ordered access-close-before-release, and both reset-then-anchor recovery paths.

PASS-03: [Objective pass criterion] Ownership and composition acceptance requires every downstream result to be derived from transmitted owner-local facts with zero centralized recomputation, stale prior/current substitution, restored abandoned token, action-mode-access-outcome disagreement, or cross-evaluation field mixing.

PASS-04: [Objective pass criterion] Diversity acceptance requires cargo transfer to remain external context only and requires the realized boundary, state owners, topology, priority, and recovery to retain the specific differences in `DIV-01` and `DIV-02`.

PASS-05: [Objective pass criterion] Evidence acceptance requires all mandatory deterministic gates to be green and later Designer review to find the realized model semantically fit. Typechecking, visualization, or bounded enumeration alone is insufficient.

AUD-PASS-01: [Designer final-baseline audit] After the Designer resolution, the complete inventories recount to exactly 15 semantic usages, 35 semantic interactions, 29 nontrivial cases, and eleven scenarios. `OWN-AUD-01` and `OWN-AUD-02` cover every state and decision owner, including the corrected `PART-08` transition boundary; `CASE-AUD-01` assigns every counted case to one local relation; `CASE-14` through `CASE-21` close no-request, invalid, fresh, duplicate, busy, wrong-phase, active-service, and recovery-time admission; and `CASE-22` through `CASE-25` close fault, ordinary progress, reset, both verified anchors, unsuccessful recovery controls, and owner-local transitions. No padding or unassigned finite branch was found.

SUPPORT-01: [Generated-support allowance] The Model may add only finite enum and flat record definitions whose contract-inspected members are declared as attributes, safe initialization, at most one behavior-free container, at most six transparent root delegations, tuple-consistency clauses, static inventories, analyzer fixtures, and visualization-only context. None receives campaign credit or may alter a semantic endpoint, direction, type, or meaning.

EXCL-01: [Explicit exclusion] No cargo request or quantity, ship-transfer evidence, warehouse evidence, transfer reconciliation, transfer completion, physical docking control, berth geometry, docking-duration target, service-specific repair or resupply policy, mining control, travel physics, combat, timing deadline, or safety claim is required or authorized.

DEFER-02: [Evidence status] Code generation, application implementation, execution, Logika proof, physical validation, probabilistic safety analysis, real-time performance, game fidelity, certification, and production readiness remain deferred and shall be reported `not-run`, not inferred from static or bounded evidence.

AUTH-MODEL-01: [Designer authorization] Model generation is authorized against this approved final baseline after acceptance of the Model review's local berth-ownership finding and incorporation of the `PART-06`/`INT-20`/`PART-08` correction. Generation shall preserve the exact `15/35/29/11` tuple, boundary, finite domains, priority, fault propagation, recovery, composition, diversity dimensions, support allowance, and deferred claim boundary; any further change requires another explicit Designer resolution in this retained run.
