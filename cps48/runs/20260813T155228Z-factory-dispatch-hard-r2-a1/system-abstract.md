---
abstract_id: SA-FD-HR2-01
seed_id: 20260813T004233Z-factory-dispatch-seed-v1
seed_version: 1
status: approved-final
complexity: hard
executable_profile: not-declared
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usages: 14
selected_semantic_interactions: 35
selected_nontrivial_contract_cases: 29
selected_scenario_families: 10
node_count: [14, 14]
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

# Factory Material Continuity Coordinator

## Evidence classes and claim boundary

BASIS-01: [Seed-grounded fact] The frozen source basis supplies Customer, Manufacturer, Supplier, procurement, production scheduling, storage, material-order, purchase-order, inventory, material provision, and production vocabulary. It does not establish a correct connection direction, a material policy, finite domains, priorities, faults, recovery, or executable behavior.

METHOD-01: [Handbook-derived engineering control] This abstract defines the need, boundary, responsible external entities, alternatives, assumptions, finite partitions, faults, recovery, traceability, verification, and validation criteria before implementation. These controls are methodology obligations, not source facts about a real factory.

PILOT-01: [Pilot abstraction] One evaluation consumes one finite logical snapshot and produces one deterministic supervisory result. Inventory bands, demand classes, availability statuses, fresh-event semantics, retained lifecycle states, strict priority, and recovery rules are introduced solely as bounded experiment assumptions.

ARCH-01: [Selected architecture] The retained design distributes acquisition, qualification, three independent state machines, three eligibility decisions, one priority decision, and atomic result composition across 14 responsibility-bearing semantic usages connected by 35 typed directed semantic interactions, including the complete logical boundary.

ABSTR-01: [Abstraction rule] The clauses fix externally observable finite relations, responsibility and ownership boundaries, and required evidence, but no algorithm, execution schedule, thread period, deployment, transport, encoding, or user-interface presentation. The later Model may choose supported realization forms only when they preserve these semantics and counts.

DEFER-01: [Deferred claim] This run does not claim inventory accuracy, procurement correctness, supplier performance, material conservation, production throughput, physical process quality, delivery performance, industrial safety, timing, deployment fitness, certification, code generation, formal proof, or executable behavior.

## Synopsis, need, purpose, and goals

NEED-01: [Pilot abstraction using seed vocabulary] A Manufacturer needs a bounded coordinator that keeps one current production-material demand coherent with aggregate Storage evidence and one Supplier-order lifecycle, so that material release and replenishment requests do not proceed through invalid or failed lifecycle evidence.

PURPOSE-01: [Pilot abstraction] For each evaluation, the system shall classify a fresh material demand, inventory evidence, and a material-lifecycle event; update demand, supplier-order, and recovery state; derive independent urgent-release, routine-release, and replenishment eligibility; select at most one controlled action; and publish one atomic result.

GOAL-01: [Pilot abstraction] The system shall deterministically cover every admitted boundary snapshot and every prior-state tuple.

GOAL-02: [Pilot abstraction] A fault or incomplete recovery shall dominate every ordinary action; otherwise an urgent material release shall dominate replenishment, and replenishment shall dominate a routine material release when both are eligible.

GOAL-03: [Pilot abstraction] A reported failure or lifecycle-inconsistent success shall propagate in the same evaluation through event qualification, recovery latching, state inhibition, eligibility, action selection, and the public result.

GOAL-04: [Pilot abstraction] Recovery shall require a fresh `RESET` followed in a later evaluation by a distinct fresh `VERIFY_OK`; neither event alone shall release a latched fault.

GOAL-05: [Selected architecture] The selected action, cause, mode, three current lifecycle states, and current-demand disposition shall be composed by one owner into one indivisible flat `MaterialCoordinationResult`.

## Operational context and finite system boundary

CTX-MAN-01: [Selected boundary] The modeled system is a logical material-continuity supervisor within the Manufacturer. Supplier transaction execution, Storage measurement, production scheduling, production material handling, dispatch, customer communication, and physical production steps remain outside it.

CTX-SCHED-01: [Seed-grounded capability with pilot responsibility] The external Production Scheduler supplies at most one fresh `DemandSignal` per evaluation and receives demand disposition through `CTX-PUB-01`; it is responsible for retrying a valid demand reported as deferred.

CTX-STOR-01: [Seed-grounded capability with pilot responsibility] The external Storage observer supplies one aggregate `InventoryBand`; it is responsible for the declared validity status and band meaning, but not for any quantity, unit, reservation, or conservation claim.

CTX-SUP-01: [Seed-grounded entity with pilot responsibility] The external Supplier-facing channel supplies `supplierAvailability`, consumes `ISSUE_MATERIAL_ORDER`, and reports fresh order or receipt events. Availability means only willingness to accept the command request.

CTX-PROD-01: [Seed-grounded capability with pilot responsibility] The external Production material handler supplies `productionAvailability`, consumes a material-release action, and later reports a fresh handoff result. Production execution and the named physical line steps are outside the boundary.

CTX-EVENT-01: [Pilot abstraction] The material-event channel presents either no event or exactly one fresh event in an evaluation and is responsible for correlating that event to this bounded coordinator's sole active demand or supplier order.

CTX-REC-01: [Pilot abstraction] A Manufacturer recovery authority supplies fresh recovery events after external diagnosis and is responsible for separating `RESET` from a later `VERIFY_OK`.

CTX-PUB-01: [Selected boundary] A Manufacturer material-control integration recipient consumes one `MaterialCoordinationResult` and is responsible for conveying its demand disposition to `CTX-SCHED-01`, material-order action to `CTX-SUP-01`, and release action to `CTX-PROD-01` without changing field meaning. This system controls issuance of the logical request, not its external acceptance or physical completion.

MON-DEM-01: [Pilot abstraction] Root input `demandSignal` has finite type `DemandSignal={NONE,INVALID,A_ROUTINE,A_URGENT,B_ROUTINE,B_URGENT}` and comes from `CTX-SCHED-01`. `A` and `B` are bounded correlation classes only, not source-defined material identities.

MON-INV-01: [Pilot abstraction] Root input `inventoryBand` has finite type `InventoryBand={INVALID,EMPTY,LOW,READY}` and comes from `CTX-STOR-01`. `LOW` means material is available for one modeled handoff while replenishment is desired; `READY` means material is available without that reserve concern.

MON-SUP-01: [Pilot abstraction] Root input `supplierAvailability` has finite type `Availability={INVALID,UNAVAILABLE,AVAILABLE}` and comes from `CTX-SUP-01`.

MON-PROD-01: [Pilot abstraction] Root input `productionAvailability` has finite type `Availability` and comes from `CTX-PROD-01`; `AVAILABLE` means only that a material-release request can currently be accepted, and its qualification belongs to `PART-05`.

MON-EVT-01: [Pilot abstraction] Root input `materialEvent` has finite type `MaterialEvent={NONE,ORDER_ACCEPTED,RECEIPT_OK,HANDOFF_OK,FAILED}` and comes from `CTX-EVENT-01`; every non-`NONE` value is a fresh single-evaluation event.

MON-REC-01: [Pilot abstraction] Root input `recoveryEvent` has finite type `RecoveryEvent={NONE,RESET,VERIFY_OK}` and comes from `CTX-REC-01`; every non-`NONE` value is a fresh single-evaluation event.

CTRL-RES-01: [Selected architecture] The sole root output is the flat record `MaterialCoordinationResult=(action,cause,mode,demandState,supplyState,recoveryState,demandDisposition)`, delivered to `CTX-PUB-01`.

TYPE-ACT-01: [Pilot abstraction] `MaterialAction={HOLD,RELEASE_URGENT_MATERIAL,ISSUE_MATERIAL_ORDER,RELEASE_ROUTINE_MATERIAL}`.

TYPE-CAUSE-01: [Pilot abstraction] `DecisionCause={FAULT_OR_RECOVERY,URGENT_DEMAND,RESERVE_REPLENISHMENT,ROUTINE_DEMAND,NO_ELIGIBLE_WORK}`.

TYPE-MODE-01: [Pilot abstraction] `CoordinationMode={HOLDING,RELEASING,ORDERING,FAULT}`.

TYPE-DISP-01: [Pilot abstraction] `DemandDisposition={NO_REQUEST,REJECTED,ACCEPTED,RETAINED_DUPLICATE,DEFERRED}` describes only the current `DemandSignal`, not completion of production work.

TYPE-STATE-01: [Pilot abstraction] `DemandState={IDLE,A_ROUTINE_OPEN,A_URGENT_OPEN,B_ROUTINE_OPEN,B_URGENT_OPEN}`, `DemandUpdate={NO_CHANGE,ACCEPTED,CLEARED,DUPLICATE,BUSY}`, `SupplyState={CLEAR,ORDERED}`, and `RecoveryState={HEALTHY,LATCHED,RECOVERING}` are finite lifecycle types; only the three state types are retained.

TYPE-EVT-01: [Pilot abstraction] `EventClass={NO_EVENT,FAILURE,SUCCESS}` and `QualifiedEvent={NO_PROGRESS,ORDER_REGISTERED,RECEIPT_CONFIRMED,HANDOFF_CONFIRMED,FAULT}` separate boundary event classification from lifecycle coherence.

TYPE-GATE-01: [Pilot abstraction] `FaultTrigger={INACTIVE,ACTIVE}`, `RecoveryGate={OPEN,CLOSED}`, and `EmergencyState={INACTIVE,ACTIVE}` are derived finite control facts and are not retained state.

TYPE-FACT-01: [Selected mapping] `DemandBoundaryFacts=(signal,present)`, `DemandFacts=(signal,present,valid,urgent,materialClass)`, `InventoryBoundaryFacts=(band,usable)`, and `MaterialReadinessFacts=(band,usable,materialAvailable,reserveLow,replenishmentNeeded,productionEvidenceUsable,productionAccepting)` are flat finite records.

TYPE-DEC-01: [Selected mapping] Each eligibility owner emits `ProposalState={NOT_PROPOSED,PROPOSED}`. The arbiter emits flat `Decision=(action,cause)`. The public record shall use flat fields rather than an inspected nested status or decision part.

ASM-FRESH-01: [Pilot abstraction] `CTX-SCHED-01`, `CTX-EVENT-01`, and `CTX-REC-01` are responsible for freshness; replayed demands, material events, resets, or verifications are outside the admitted environment. Rationale: retained-state evidence otherwise could advance twice.

ASM-CAP-01: [Pilot abstraction] The coordinator retains at most one production-material demand and at most one acknowledged Supplier order. `CTX-SCHED-01` shall retry a deferred valid demand. Rationale: these are finite analysis bounds, not factory capacity claims.

ASM-LEVEL-01: [Pilot abstraction] Controlled actions are desired logical levels, not counted transaction pulses; `CTX-SUP-01` and `CTX-PROD-01` shall not interpret a repeated identical output as a second correlated transaction while the first response remains outstanding. Rationale: issuance acknowledgement is externally reported on a later evaluation.

ASM-STOCK-01: [Pilot abstraction] Inventory is independently re-observed on every evaluation. `RECEIPT_OK` does not itself change `inventoryBand`, and `HANDOFF_OK` does not decrement it. Rationale: the seed supplies no conservation or quantity semantics.

ASM-STEP-01: [Pilot abstraction] One evaluation is an ordered logical reaction with no physical duration: prior states qualify the fresh event; event qualification determines next recovery and lifecycle states; those results gate proposals; arbitration selects; composition publishes.

ASM-INIT-01: [Pilot abstraction] Before the first evaluation, demand is `IDLE`, supply is `CLEAR`, recovery is `HEALTHY`, and the public result is `(HOLD,NO_ELIGIBLE_WORK,HOLDING,IDLE,CLEAR,HEALTHY,NO_REQUEST)`.

## Risks, faults, and mitigations

RISK-01: [Pilot risk] Accepting a failed or phase-inconsistent material event as progress could clear a demand or supplier order and authorize unrelated work from untrustworthy state; `FAULT-01` requires immediate fault propagation and inhibition.

RISK-02: [Pilot risk] Treating `RESET` as recovery completion could resume material actions without independent verification; `FAULT-02` requires a distinct two-event recovery history.

RISK-03: [Pilot risk] Inconsistent resolution at `LOW` inventory could either starve an urgent production demand or consume reserve for routine work while replenishment is possible; `BEH-06` fixes a single priority relation.

FAULT-01: [Pilot requirement] `FAILED`, `ORDER_ACCEPTED` while supply is `ORDERED`, `RECEIPT_OK` while supply is `CLEAR`, or `HANDOFF_OK` while demand is `IDLE` shall derive `QualifiedEvent.FAULT`, latch recovery, freeze both ordinary lifecycle states, suppress all proposals, select `HOLD`, and publish `FAULT_OR_RECOVERY/FAULT` in the same evaluation. Verification passes only if local-contract inspection and exhaustive one-step analysis establish this chain from every applicable prior-state tuple with no stale public field.

FAULT-02: [Pilot requirement] While derived recovery is `LATCHED` or `RECOVERING`, demand and supply state shall not progress, all three eligibility owners shall derive `NOT_PROPOSED`, arbitration shall select `HOLD`, and composition shall publish fault mode regardless of inventory, availability, or demand. Verification passes only if exhaustive analysis shows closed-gate noninterference and release only after distinct `RESET` then `VERIFY_OK` evaluations.

## Selected semantic usages and ownership audit

PART-01: [Selected architecture; semantic usage] `demand_acquisition` owns the many-to-one `present` classification (`NONE` versus every other signal) and emits `DemandBoundaryFacts`; it shall not decide validity, urgency, or material class.

PART-02: [Selected architecture; semantic usage] `inventory_acquisition` owns invalid-versus-usable classification and emits `InventoryBoundaryFacts`; it shall not decide availability, reserve condition, or replenishment need.

PART-03: [Selected architecture; semantic usage] `event_acquisition` owns the many-to-one `NO_EVENT`/`FAILURE`/`SUCCESS` classification while preserving the exact `MaterialEvent`; it shall not decide lifecycle coherence.

PART-04: [Selected architecture; semantic usage] `demand_qualification` consumes received boundary facts and derives validity, urgency, and material class without recomputing presence.

PART-05: [Selected architecture; semantic usage] `material_readiness_assessment` consumes received inventory boundary facts and production availability, then derives material availability, reserve-low status, replenishment need, production-evidence usability, and production acceptance without recomputing inventory usability.

PART-06: [Selected architecture; decision owner] `event_coherence` combines the received event class and exact tag with only the two received prior lifecycle states to derive one `QualifiedEvent` and `FaultTrigger`; it shall not update retained state.

PART-07: [Selected architecture; state and decision owner] `demand_registry` is the sole `DemandState` owner and derives next demand state, owner-local `DemandUpdate`, and current `DemandDisposition` from qualified demand, qualified event, and the derived recovery gate.

PART-08: [Selected architecture; state and decision owner] `supply_lifecycle` is the sole `SupplyState` owner and derives next supply state plus its current state view from qualified event and the derived recovery gate.

PART-09: [Selected architecture; state and decision owner] `recovery_supervisor` is the sole `RecoveryState` owner and derives next recovery state, `RecoveryGate={OPEN,CLOSED}`, and `EmergencyState={INACTIVE,ACTIVE}`, with a fault trigger dominant over recovery events.

PART-10: [Selected architecture; decision owner] `urgent_release_eligibility` derives an urgent-release proposal from current urgent demand, assessed material and production readiness, and an open recovery gate.

PART-11: [Selected architecture; decision owner] `routine_release_eligibility` independently derives a routine-release proposal from current routine demand, assessed material and production readiness, and an open recovery gate.

PART-12: [Selected architecture; decision owner] `replenishment_eligibility` derives an order proposal from assessed replenishment need, valid Supplier availability, current clear supply state, and an open recovery gate.

PART-13: [Selected architecture; principal decision owner] `material_action_arbitration` selects exactly one `Decision` by emergency, urgent release, replenishment, routine release, then hold priority and shall not recompute any upstream predicate.

PART-14: [Selected architecture; composition decision owner] `result_composition` derives mode and copies the received demand disposition, state, and decision values field-for-field into one flat atomic `MaterialCoordinationResult`; it owns no retained or mirror state and shall not reread demand input.

OWN-AUD-01: [Ownership audit] Retained state is divided among `PART-07`, `PART-08`, and `PART-09`; lifecycle-event coherence belongs only to `PART-06`; current-demand disposition belongs only to `PART-07`; eligibility belongs separately to `PART-10`, `PART-11`, and `PART-12`; strict action priority belongs only to `PART-13`; atomic public composition belongs only to `PART-14`.

OWN-AUD-02: [Ownership audit] Every one of `PART-01` through `PART-14` derives at least one behaviorally meaningful owner-local fact from assigned inputs. No identity copier, renamer, splitter, router, mirror-state holder, analyzer fixture, root, or support container receives semantic-usage or owner credit.

## Complete typed directed semantic interaction inventory

INT-01: [Semantic boundary interaction] `CTX-SCHED-01` shall provide root `DemandSignal` to `demand_acquisition.demand_signal`.

INT-02: [Semantic boundary interaction] `CTX-STOR-01` shall provide root `InventoryBand` to `inventory_acquisition.inventory_band`.

INT-03: [Semantic boundary interaction] `CTX-EVENT-01` shall provide root `MaterialEvent` to `event_acquisition.material_event`.

INT-04: [Semantic boundary interaction] `CTX-REC-01` shall provide root `RecoveryEvent` to `recovery_supervisor.recovery_event`.

INT-05: [Semantic boundary interaction] `CTX-SUP-01` shall provide root `Availability` to `replenishment_eligibility.supplier_availability`.

INT-06: [Semantic boundary interaction] `CTX-PROD-01` shall provide root `Availability` to `material_readiness_assessment.production_availability`.

INT-07: [Semantic boundary interaction] `result_composition.material_coordination_result` shall provide `MaterialCoordinationResult` to `CTX-PUB-01`.

INT-08: [Semantic interaction] `demand_acquisition.demand_boundary_facts` shall provide `DemandBoundaryFacts` to `demand_qualification.demand_boundary_facts`.

INT-09: [Semantic interaction] `inventory_acquisition.inventory_boundary_facts` shall provide `InventoryBoundaryFacts` to `material_readiness_assessment.inventory_boundary_facts`.

INT-10: [Semantic interaction] `event_acquisition.event_boundary_facts` shall provide `(materialEvent,eventClass)` to `event_coherence.event_boundary_facts`.

INT-11: [Semantic interaction] `demand_registry.prior_demand_state` shall provide retained prior `DemandState` to `event_coherence.prior_demand_state`.

INT-12: [Semantic interaction] `supply_lifecycle.prior_supply_state` shall provide retained prior `SupplyState` to `event_coherence.prior_supply_state`.

INT-13: [Semantic interaction] `event_coherence.qualified_event` shall provide `QualifiedEvent` to `demand_registry.qualified_event`.

INT-14: [Semantic interaction] `event_coherence.qualified_event` shall provide `QualifiedEvent` to `supply_lifecycle.qualified_event`.

INT-15: [Semantic interaction] `event_coherence.fault_trigger` shall provide `FaultTrigger` to `recovery_supervisor.fault_trigger`.

INT-16: [Semantic interaction] `recovery_supervisor.recovery_gate` shall provide `RecoveryGate` to `demand_registry.recovery_gate`.

INT-17: [Semantic interaction] `recovery_supervisor.recovery_gate` shall provide `RecoveryGate` to `supply_lifecycle.recovery_gate`.

INT-18: [Semantic interaction] `recovery_supervisor.recovery_gate` shall provide `RecoveryGate` to `urgent_release_eligibility.recovery_gate`.

INT-19: [Semantic interaction] `recovery_supervisor.recovery_gate` shall provide `RecoveryGate` to `routine_release_eligibility.recovery_gate`.

INT-20: [Semantic interaction] `recovery_supervisor.recovery_gate` shall provide `RecoveryGate` to `replenishment_eligibility.recovery_gate`.

INT-21: [Semantic interaction] `recovery_supervisor.emergency_state` shall provide `EmergencyState` to `material_action_arbitration.emergency_state`.

INT-22: [Semantic interaction] `demand_qualification.demand_facts` shall provide `DemandFacts` to `demand_registry.demand_facts`.

INT-23: [Semantic interaction] `demand_registry.current_demand_state` shall provide derived current `DemandState` to `urgent_release_eligibility.demand_state`.

INT-24: [Semantic interaction] `demand_registry.current_demand_state` shall provide derived current `DemandState` to `routine_release_eligibility.demand_state`.

INT-25: [Semantic interaction] `demand_registry.demand_transition` shall provide flat `(currentDemandState,demandUpdate,demandDisposition)` to `result_composition.demand_transition`.

INT-26: [Semantic interaction] `material_readiness_assessment.material_readiness_facts` shall provide `MaterialReadinessFacts` to `urgent_release_eligibility.material_readiness_facts`.

INT-27: [Semantic interaction] `material_readiness_assessment.material_readiness_facts` shall provide `MaterialReadinessFacts` to `routine_release_eligibility.material_readiness_facts`.

INT-28: [Semantic interaction] `material_readiness_assessment.material_readiness_facts` shall provide `MaterialReadinessFacts` to `replenishment_eligibility.material_readiness_facts`.

INT-29: [Semantic interaction] `supply_lifecycle.current_supply_state` shall provide derived current `SupplyState` to `replenishment_eligibility.supply_state`.

INT-30: [Semantic interaction] `supply_lifecycle.current_supply_state` shall provide derived current `SupplyState` to `result_composition.supply_state`.

INT-31: [Semantic interaction] `urgent_release_eligibility.proposal` shall provide `ProposalState` to `material_action_arbitration.urgent_proposal`.

INT-32: [Semantic interaction] `routine_release_eligibility.proposal` shall provide `ProposalState` to `material_action_arbitration.routine_proposal`.

INT-33: [Semantic interaction] `replenishment_eligibility.proposal` shall provide `ProposalState` to `material_action_arbitration.replenishment_proposal`.

INT-34: [Semantic interaction] `material_action_arbitration.decision` shall provide flat `Decision` to `result_composition.decision`.

INT-35: [Semantic interaction] `recovery_supervisor.recovery_state` shall provide derived current `RecoveryState` to `result_composition.recovery_state`.

INT-AUD-01: [Inventory audit] The complete semantic interaction inventory is exactly `INT-01` through `INT-35`: six boundary inputs, one boundary output, and 28 internal owner-to-owner flows. Every edge transfers a distinct boundary or owner-local fact to a consumer that uses it in a different responsibility.

BND-INT-01: [Generated-support allowance] The seven logical boundary interactions `INT-01` through `INT-07` may each lower through a transparent root-to-container delegation. Those seven delegations preserve type, direction, and meaning, receive no second semantic-interaction credit, and raise the permitted raw connection total from 35 to exactly 42.

BND-INT-02: [Boundary audit] No semantic part may reread an external input except through `INT-01` through `INT-06`, and the sole externally controlled value is `INT-07`. Context depictions and containment wiring are not additional interactions.

## Canonical owner-local relations

REL-DEM-01: [Required local relation] `PART-01` shall derive `present=false` exactly for `NONE`. `PART-04` shall preserve received presence, derive `valid=true` exactly for the four valid signals, `urgent=true` exactly for the two urgent signals, and the matching `A` or `B` material class only for a valid signal.

REL-INV-01: [Required local relation] `PART-02` shall derive `usable=false` exactly for `INVALID`. `PART-05` shall preserve usability, derive material available exactly for usable `LOW` or `READY`, reserve low exactly for usable `LOW`, replenishment needed exactly for usable `EMPTY` or `LOW`, production-evidence usable exactly when production availability is not `INVALID`, and production accepting exactly for `AVAILABLE`.

REL-EVT-01: [Required local relation] `PART-03` shall map `NONE` to `NO_EVENT`, `FAILED` to `FAILURE`, and the other three exact tags to `SUCCESS` while preserving the tag. `PART-06` shall consume both received fields and shall not reclassify the raw tag independently.

REL-STATE-01: [Required state-boundary relation] `PART-07` and `PART-08` shall expose the prior evaluation's state only to `PART-06` and shall expose their post-transition current state only to downstream eligibility or composition. No consumer may substitute prior for current state.

REL-DISP-01: [Required fresh-request relation] `PART-07` shall derive `NO_REQUEST` for `NONE`, `REJECTED` for `INVALID`, `ACCEPTED` for a valid signal with update `ACCEPTED`, `RETAINED_DUPLICATE` for a valid signal with update `DUPLICATE`, and `DEFERRED` for every other valid signal. This mutually exclusive owner-local relation covers every fresh-request, completion-coincidence, and busy-request path; `PART-14` shall only place the received disposition into the result.

REL-COMP-01: [Composition obligation] `PART-14` shall derive `FAULT` mode exactly when received recovery state is not `HEALTHY`; otherwise it shall map order action to `ORDERING`, either release action to `RELEASING`, and hold to `HOLDING`. It shall copy the two fields of received `Decision` and all three received current states into one flat atomic result without recomputation or cross-evaluation mixing.

REL-COUNT-01: [Case-count rule] Acquisition maps, initialization, prior/current state equations, current-demand disposition, mode mapping, tuple equality, and generated-support delegation are mandatory canonical relations but do not add campaign cases. The complete counted nontrivial case inventory is `CASE-01` through `CASE-29` below.

## Complete finite contract partitions and required behavior

REQ-01 / BEH-01: Event coherence shall implement `CASE-01` through `CASE-06` over all five exact material events and every prior demand/supply state pair. Contract inspection and exhaustive analysis pass only if exactly one case applies and produces one `QualifiedEvent` and one fault trigger.

CASE-01: Received `NO_EVENT` with exact `NONE` shall derive `NO_PROGRESS` and no fault.

CASE-02: Received `FAILURE` with exact `FAILED` shall derive `FAULT` and an active fault trigger from every prior state.

CASE-03: Received `SUCCESS/ORDER_ACCEPTED` with prior supply `CLEAR` shall derive `ORDER_REGISTERED` and no fault.

CASE-04: Received `SUCCESS/RECEIPT_OK` with prior supply `ORDERED` shall derive `RECEIPT_CONFIRMED` and no fault.

CASE-05: Received `SUCCESS/HANDOFF_OK` with any non-`IDLE` prior demand shall derive `HANDOFF_CONFIRMED` and no fault.

CASE-06: Every remaining received event-class, exact-tag, and prior-state combination shall derive `FAULT` and an active fault trigger.

REQ-02 / BEH-02: Recovery shall apply fault priority before recovery events and implement `CASE-07` through `CASE-12`. State-contract inspection and exhaustive one-step plus sequence analysis pass only if the cases are total and exclusive and the gate is open exactly when derived recovery is healthy.

CASE-07: From any prior recovery state, an active fault trigger shall derive `LATCHED`, `CLOSED`, and `ACTIVE` regardless of recovery event.

CASE-08: From prior `HEALTHY` without fault, recovery shall remain `HEALTHY` with gate `OPEN` and emergency `INACTIVE`; `RESET` and `VERIFY_OK` have no special effect.

CASE-09: From prior `LATCHED` without fault, fresh `RESET` shall derive `RECOVERING`, gate `CLOSED`, and emergency `ACTIVE`.

CASE-10: Every other nonfault input from prior `LATCHED` shall retain `LATCHED`, gate `CLOSED`, and emergency `ACTIVE`.

CASE-11: From prior `RECOVERING` without fault, fresh `VERIFY_OK` shall derive `HEALTHY`, gate `OPEN`, and emergency `INACTIVE`.

CASE-12: Every other nonfault input from prior `RECOVERING` shall retain `RECOVERING`, gate `CLOSED`, and emergency `ACTIVE`.

REQ-03 / BEH-03: Demand-state transition shall implement `CASE-13` through `CASE-16` using qualified inputs only. Contract inspection and exhaustive analysis pass only if every recovery-gate, qualified-event, prior-state, and fresh-demand combination selects exactly one case.

CASE-13: A closed recovery gate shall preserve prior demand state and derive `NO_CHANGE` regardless of qualified event or fresh demand.

CASE-14: With an open gate, `HANDOFF_CONFIRMED` shall clear demand to `IDLE` and derive `CLEARED`; any simultaneous fresh demand is not admitted and its public disposition shall be deferred.

CASE-15: With an open gate, no handoff confirmation, prior demand `IDLE`, and a valid fresh demand, next demand state shall encode exactly its `A/B` class and routine/urgent class and the update shall be `ACCEPTED`.

CASE-16: Every other open-gate combination shall preserve prior demand state and derive `DUPLICATE` for an exact valid match, `BUSY` for a different valid demand while occupied, or `NO_CHANGE` otherwise; invalid demand cannot create state and valid demand cannot preempt open demand.

REQ-04 / BEH-04: Supply-state transition shall implement `CASE-17` and `CASE-18`. Contract inspection and exhaustive analysis pass only if the relation is total and exclusive and recovery closure freezes state.

CASE-17: With an open gate, qualified supply progress shall map `ORDER_REGISTERED` to `ORDERED` and `RECEIPT_CONFIRMED` to `CLEAR`.

CASE-18: Every other supply input, including a closed gate, shall preserve prior supply state.

REQ-05 / BEH-05: The three eligibility owners shall implement `CASE-19` through `CASE-24` independently and without priority logic. Three local-contract inspections plus exhaustive analysis pass only if each paired partition is total and exclusive and gate closure falsifies every proposal.

CASE-19: Urgent release shall be `PROPOSED` exactly when the gate is open, current demand is an urgent open state, assessed material is available, and assessed production evidence is usable and accepting.

CASE-20: Every other urgent-release input shall derive `NOT_PROPOSED`.

CASE-21: Routine release shall be `PROPOSED` exactly when the gate is open, current demand is a routine open state, assessed material is available, and assessed production evidence is usable and accepting.

CASE-22: Every other routine-release input shall derive `NOT_PROPOSED`.

CASE-23: Replenishment shall be `PROPOSED` exactly when the gate is open, assessed replenishment is needed, current supply is `CLEAR`, and Supplier availability is valid `AVAILABLE`.

CASE-24: Every other replenishment input shall derive `NOT_PROPOSED`.

REQ-06 / BEH-06: Arbitration shall implement `CASE-25` through `CASE-29` and derive exactly one flat decision. Arbiter-contract inspection and exhaustive proposal analysis pass only if the cases are exclusive and exhaustive and a winning higher branch is insensitive to every lower proposal.

CASE-25: Active emergency shall select `HOLD/FAULT_OR_RECOVERY` regardless of ordinary proposals.

CASE-26: Without emergency, an urgent-release proposal shall select `RELEASE_URGENT_MATERIAL/URGENT_DEMAND` regardless of replenishment or routine proposals.

CASE-27: Without emergency or urgent proposal, a replenishment proposal shall select `ISSUE_MATERIAL_ORDER/RESERVE_REPLENISHMENT` regardless of a routine proposal.

CASE-28: Without a higher-priority condition, a routine-release proposal shall select `RELEASE_ROUTINE_MATERIAL/ROUTINE_DEMAND`.

CASE-29: With no emergency and no proposal, arbitration shall select `HOLD/NO_ELIGIBLE_WORK`.

REQ-07 / BEH-07: [Composition obligation] Owner-to-owner behavior shall follow the transmitted values on `INT-01` through `INT-35`: no downstream owner or bounded analyzer shall centrally recompute acquisition, qualification, state, eligibility, arbitration, or composition policy. Dependency and analyzer inspection pass only with zero bypasses and agreement between independent reference and composed owner-local results.

REQ-08 / BEH-08: [Freshness obligation] Lifecycle progress shall be driven only by one fresh qualified event, never by selected action, inventory, availability, or event replay. Paired-step analysis passes only if `NONE` stutters, each admitted progress tag changes its intended state once, and each state remains frozen during a faulted evaluation.

## Exactly ten bounded scenario families

SCN-01: [Routine demand and handoff] From `IDLE/CLEAR/HEALTHY` with `A_ROUTINE`, `READY` inventory, and production available, the demand is admitted and routine material is released in the same evaluation; a later fresh `HANDOFF_OK` clears demand exactly once.

SCN-02: [Urgent release over replenishment] From healthy idle demand at `LOW` inventory with both external capabilities available, a fresh urgent demand makes urgent release and replenishment simultaneously proposed, and urgent release wins.

SCN-03: [Replenishment over routine release] From healthy idle demand at `LOW` inventory with both external capabilities available, a fresh routine demand makes routine release and replenishment simultaneously proposed, and replenishment wins without clearing the demand.

SCN-04: [Empty-stock procurement] With healthy recovery, clear supply, and `EMPTY` inventory, Supplier availability produces `ISSUE_MATERIAL_ORDER`; production availability and demand urgency do not manufacture material-release eligibility.

SCN-05: [Supplier-order lifecycle] A fresh phase-valid `ORDER_ACCEPTED` moves supply from `CLEAR` to `ORDERED`; a later `RECEIPT_OK` returns it to `CLEAR`, while inventory changes only when separately re-observed.

SCN-06: [Fresh-demand capacity and identity] An exact valid duplicate of an open demand is retained without preemption, a different valid demand is deferred, and an invalid demand is rejected without changing state.

SCN-07: [Invalid evidence inhibition] Invalid inventory suppresses all ordinary proposals; invalid production availability suppresses both release proposals; invalid Supplier availability suppresses replenishment. Each witness selects no action unless an independent valid higher-priority proposal exists.

SCN-08: [Reported failure propagation] From every healthy demand/supply state pair, fresh `FAILED` produces same-evaluation `LATCHED`, closed gate, frozen ordinary state, no proposals, `HOLD`, and fault public mode.

SCN-09: [Phase-inconsistent success propagation] `ORDER_ACCEPTED` from `ORDERED`, `RECEIPT_OK` from `CLEAR`, and `HANDOFF_OK` from `IDLE` each follow the same latch-and-hold fault chain as a reported failure.

SCN-10: [Two-event recovery and resumed work] From `LATCHED`, fresh `RESET` yields blocked `RECOVERING`; only a later nonfault fresh `VERIFY_OK` yields `HEALTHY`, opens the gate, and permits otherwise eligible work in that evaluation.

SCN-AUD-01: [Scenario audit] `SCN-01` through `SCN-10` are exactly ten distinct families: routine handoff, urgent priority conflict, reserve priority conflict, empty-stock procurement, supplier lifecycle, fresh-demand capacity/identity, invalid evidence, reported failure, phase inconsistency, and two-event recovery.

## Structural, trace, analysis, and acceptance obligations

BOUND-01: [Hard gate] The model shall contain exactly one explicit root System usage, exactly 14 reachable responsibility-bearing semantic usages `PART-01` through `PART-14`, exactly one behavior-free generated-support Process containing them, one semantic responsibility layer, physical containment depth two below the root, and one weakly connected raw architectural region.

BOUND-02: [Hard gate] The model shall realize exactly 35 semantic interactions `INT-01` through `INT-35`, exactly seven transparent root-to-container boundary delegations described by `BND-INT-01`, and exactly 42 raw connection declarations. No other support or semantic connection is authorized.

BOUND-03: [Hard gate] The model shall realize exactly 29 counted nontrivial contract cases `CASE-01` through `CASE-29` and exactly ten scenario families `SCN-01` through `SCN-10`; canonical maps and support relations shall not inflate either count.

BOUND-04: [Hard gate] `PART-07`, `PART-08`, and `PART-09` shall remain distinct retained-state owners, and every owner in `OWN-AUD-01` shall expose its owner-local derivation. Identity forwarding, central recomputation, mirror state, analyzer-only policy, or support credit fails this gate.

PRIORITY-01: [Priority gate] Exhaustive proposal analysis shall establish `emergency > urgent release > replenishment > routine release > hold`, including reachable simultaneous urgent/replenishment and routine/replenishment witnesses at `LOW` inventory.

COMPOSE-01: [Composition gate] Exhaustive end-to-end analysis shall establish that event failure changes recovery, recovery closes eligibility, arbitration holds, and the composer publishes mutually consistent received decision, demand disposition, mode, and all three post-transition states in the same result and evaluation.

TRACE-01: [Coverage gate] Every abstract identifier shall trace to retained model elements, owner-local contracts, bounded assertions, scenario witnesses, or an explicit informational/deferred disposition. Every significant model element shall trace back to an abstract identifier or carry a narrow `@generated-support <reason>` annotation.

TRACE-02: [Grammar gate] Adjacent model trace comments shall use only IDs declared by this abstract. A source element may trace one-to-many or many-to-one, but missing parents, reused declaration IDs, and unexplained children fail acceptance.

ANA-01: [Bounded-analysis gate] The root snapshot has exactly `6*4*3*3*5*3=3,240` finite input combinations. Crossing five demand states, two supply states, and three recovery states yields exactly 97,200 exhaustive one-step evaluations.

ANA-02: [Ownership-analysis gate] A reference evaluator independent of production owner predicates shall be compared with separate acquisition, qualification, state, eligibility, arbitration, and composition evaluators for every snapshot. Passing requires zero partition gaps, effective overlaps, state mismatches, output mismatches, interaction-value mismatches, priority violations, or composition violations and at least one witness for every `CASE-01` through `CASE-29`.

ANA-03: [Sequence-analysis gate] The analyzer shall execute `SCN-01` through `SCN-10`, including handoff clearing, order acceptance then receipt, reported and phase-inconsistent faults, and distinct-step reset then verification. It shall not receive semantic credit, call retained owner predicates as an oracle, or be cited as formal proof.

VERIFY-01: [Verification gate] Mechanical verification shall include library/source conformance, exactly one root, compatible resolved endpoints, exact usage/interaction/case/scenario/raw counts, owner-local contract inspection, bidirectional trace coverage, bounded analysis, source-hash binding, and architecture-stage plus final Sireum typechecking. Every check shall pass or remain explicitly `not-run`.

VALID-01: [Validation gate] Designer validation shall separately confirm fidelity to the material-continuity purpose, boundary, assumptions, priority, faults, recovery, scenarios, seed limitations, and deferred claims. Mechanical conformance alone does not establish domain fitness.

PASS-01: [Objective pass criterion] Structural acceptance requires the exact `14/35/29/10` campaign tuple, one root, one support Process, one semantic layer, depth two, one weak region, three state owners, one principal arbiter, seven support delegations, and 42 raw connections with no counted padding.

PASS-02: [Objective pass criterion] Behavioral acceptance requires total and exclusive finite partitions, fully constrained retained next states and public fields, all 29 case witnesses, all ten ordered scenario families, strict priority conflicts, same-evaluation fault propagation, and two-event recovery.

PASS-03: [Objective pass criterion] Composition acceptance requires every downstream result to be derived from transmitted owner-local facts, with zero central recomputation, stale prior/current substitution, action/state disagreement, or cross-evaluation field mixing.

PASS-04: [Objective pass criterion] Evidence acceptance requires all mandatory deterministic gates to be green and the later Designer review to find the realized model semantically fit. Typechecking, visualization, or bounded enumeration alone is insufficient.

SUPPORT-01: [Generated-support allowance] The Model may add only finite enum and flat record definitions, safe initialization, one behavior-free containment usage, the seven tagged root-to-container boundary delegations, tuple-consistency clauses, static inventories, analyzer fixtures, and visualization-only context. None receives campaign credit or may alter a semantic endpoint, direction, type, or meaning.

EXCL-01: [Explicit exclusion] No shipment request, dispatch release, shipping confirmation, Customer order, quotation, product queue, numeric inventory, automatic reservation, multiple active demands, material decrement, timing deadline, physical station control, alternate routing, or unsupported supplier transaction is required or authorized.

DEFER-02: [Evidence status] Code generation, application implementation, execution, Logika proof, real-time performance, probabilistic safety analysis, physical validation, and certification remain deferred and shall be reported `not-run`, not inferred from static or bounded evidence.

AUTH-MODEL-01: [Designer authorization] Model generation is authorized only against this approved final baseline. Any changed boundary, owner, state, interaction, case, priority, recovery, composition, structural count, generated-support allowance, or deferred claim requires an explicit Designer revision in this retained run.
