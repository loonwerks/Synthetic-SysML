# Approved final design selection for the EIT monitoring and acquisition supervisor

## Evidence and selection criteria

SEL-BASIS-01: The seed provides actors, use-case vocabulary, actor associations, and an ambiguous `EITSystem`/`EITSystemBoundary` relationship; it does not select a system boundary, responsibility allocation, sequence, validity policy, state, priority, fault handling, or recovery behavior.

SEL-CRIT-01: Boundary coherence requires one controlled purpose whose external inputs and outputs can be stated without asserting physical acquisition, reconstruction correctness, diagnosis, treatment, or clinical efficacy.

SEL-CRIT-02: Hard-tier conformance requires 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial cases, 9..12 scenario families, multiple genuine state or decision owners, and explicit priority, fault propagation, recovery, and composition.

SEL-CRIT-03: Responsibility cohesion requires every credited usage to derive a many-to-one classification, multi-input fact, retained transition, feasibility decision, priority result, or public relation. Copying, renaming, bundling, splitting, or routing earns no semantic credit.

SEL-CRIT-04: Fault observability requires each local invalid or failed observation to propagate through a named composition and recovery path to both boundary outputs in the same logical evaluation.

SEL-CRIT-05: Recovery testability requires distinct latched and verifying phases, fresh reset and verification events, fault dominance, and an explicit post-recovery fresh-request path.

SEL-CRIT-06: Priority testability requires reachable ordinary conflicts, not merely a prose ordering over mutually exclusive proposals.

SEL-CRIT-07: Composition testability requires one stateless public writer whose complete output relation can be checked without making that writer a duplicate state or policy owner.

SEL-CRIT-08: Bounded analyzability favors small finite enums, one represented session/cycle/image, and an exact raw product while preserving explicit invalid-status concepts.

## Scope alternatives from the reusable seed

SEL-SCOPE-01: A belt-preparation and calibration support system is coherent and closely follows the EngineerTechnician associations, but the seed supplies no concrete placement or calibration semantics. Reaching hard size would require a larger invented calibration policy than the source vocabulary supports.

SEL-SCOPE-02: A monitoring-start and impedance-acquisition supervisor is coherent around Doctor intent, preparation evidence, external equipment readiness, acquisition feedback, fault inhibition, and recovery. It supports meaningful state and priority without claiming physical sensing behavior.

SEL-SCOPE-03: An impedance-to-image generator would have a clear machine boundary, but any actual reconstruction relation, sample representation, image correctness rule, or quality metric would be unsupported. A finite status-only generator would risk overstating `GENERATED` as an image transformation implemented by this model.

SEL-SCOPE-04: An image-analysis support system would preserve Doctor involvement but offers too little source-grounded policy for a hard finite controller unless it invents review, diagnosis, or quality semantics expressly prohibited by the seed claim boundary.

SEL-SCOPE-05: The selected scope extends `SEL-SCOPE-02` only through coordination of abstract image-generation feedback and image availability, not reconstruction or analysis. Its primary controlled purpose remains supervising monitoring and acquisition; image availability closes the selected acquisition trace without claiming an image algorithm.

## Responsibility-allocation alternatives

SEL-ALT-01: Alternative A places qualification, session state, recovery, action selection, and publication in one supervisory governor, with thin input and output adapters around it.

SEL-ALT-02: Alternative A minimizes interactions, but it obscures local fault propagation, creates one dominant state/decision owner, and cannot reach the hard usage tier without wrappers that fail the no-padding rule.

SEL-ALT-03: Alternative B mirrors the six named use cases and gives belt application, calibration, monitoring, collection, generation, and analysis each a peer component and local state.

SEL-ALT-04: Alternative B appears source-shaped but mistakes use-case containment and actor association for required component allocation. It would also put physical application and analysis inside the boundary and require an unspecified distributed consistency protocol.

SEL-ALT-05: Alternative C qualifies five evidence classes locally, composes faults once, retains independent session, cycle, image, and recovery states, derives start/collection/release feasibility in separate owners, selects one action in a strict arbiter, and maps the result through one stateless publisher.

SEL-ALT-06: Alternative C is selected because all 15 usages have distinct behavioral responsibility, failure travels through a visible acyclic chain, four owners expose real state transitions, ordinary conflicts are reachable, recovery and fresh restart are explicit, and the public writer does not become a second decision owner.

## Exact selected boundary and policy

SEL-BOUND-01: The supervisor receives `DoctorSignal`, `PreparationObservation`, `EquipmentObservation`, `BatchSignal`, `ImageFeedback`, and `RecoveryEvent`; it emits one `ControlFrame` to the external `EITSystem` viewpoint and one flat `StatusFrame` to Doctor/EngineerTechnician recipients.

SEL-BOUND-02: `Patient` remains external noninteracting context. Belt application, calibration execution, physical acquisition, impedance calculation, image reconstruction, and Doctor analysis are outside; availability is not quality or diagnosis.

SEL-STATE-01: Only `SessionState`, `CycleState`, `ImageState`, and `RecoveryState` persist, owned respectively by `PART-07`, `PART-08`, `PART-09`, and `PART-10`. No publisher, arbiter, analyzer, or support element may mirror them.

SEL-FAULT-01: `PART-01` through `PART-05` own local evidence facts, `PART-06` owns simultaneous and dominant local-fault composition, and `PART-10` owns latching recovery, recovery-input validation, and the effective fault cause/multiplicity that includes that input. The propagation path is local qualifier to fault composer to recovery owner to operational owners/decision gates to arbiter to publisher.

SEL-PRIO-01: Effective priority is recovery/fault, Doctor stop, Doctor start, image release, image generation, impedance collection, then hold. Release-over-generation/collection and generation-over-collection conflicts are required reachable witnesses.

SEL-REC-01: Any fault latches recovery. Fresh reset moves only latched to verifying; later fresh verification reopens. Operational owners leave recovery for neutral state on that reopening step and ignore concurrent work, so the external source must provide a later fresh start.

SEL-COMP-01: The arbiter composes a `DecisionFrame` from received owner results without recomputation. The publisher alone maps that frame to both root outputs and constrains every field; only release publishes image availability.

## Exact counts and ownership audit

SEL-COUNT-01: The selected architecture contains exactly 15 semantic usages, `PART-01` through `PART-15`, satisfying the hard bound 13..16. There is no support-only usage in the selected semantic inventory.

SEL-COUNT-02: The complete cross-usage semantic inventory contains exactly 33 interactions, `INT-01` through `INT-33`, satisfying the hard bound 22..35. Root delegations and containment plumbing are support connections and are not included.

SEL-COUNT-03: Five ordered owner-local partitions contain exactly 30 nontrivial cases: 5 recovery, 6 session, 6 cycle, 6 image, and 7 arbitration cases. This satisfies 21..30; mapping equations, feasibility predicates, initialization, invariants, and scenario witnesses add no count.

SEL-COUNT-04: Exactly ten scenario families cover nominal start/collection, the image lifecycle, two readiness denials, stop dominance, ordinary priority, invalid faults, reported failures, two-event recovery/fresh restart, and benign persistence, satisfying 9..12.

SEL-OWN-01: State owners are `PART-07` through `PART-10`; local decision owners are `PART-11` through `PART-14`; `PART-06` is the sole fault-composition owner; and `PART-15` is the sole output-composition owner. Each owns a nonidentity relation over its declared inputs.

SEL-OWN-02: `PART-01` and `PART-03` through `PART-05` collapse at least two invalid raw values, `PART-02` combines preparation meanings, `PART-06` detects multiplicity and dominant source, state owners use prior state plus received facts, feasibility owners use conjunctions across independently owned facts, the arbiter applies ordered suppression, and the publisher derives two coordinated outputs. None is a copier, enum rename, raw bundle, or router.

SEL-INT-AUD-01: The final recount is 33: `INT-01..14` qualification and state inputs, `INT-15` fault composition to recovery, `INT-16..22` recovery propagation, `INT-23..30` feasibility/state coordination, `INT-31..32` proposals to arbitration, and `INT-33` arbitration to publication.

SEL-PART-AUD-01: Recovery cases cover every prior recovery state and valid/invalid event after fault priority; session cases cover recovery, release, idle start/no-start, monitoring stop/no-stop; cycle cases cover recovery, release, usable batch, busy, ready, and fallthrough; image cases cover recovery, release, generated, acknowledged, new batch, and stutter; arbitration covers every effective priority outcome.

## Evidence, risk, and realization constraints

SEL-ANA-01: The raw input product is exactly 32,400 snapshots and the four pre-state product is exactly 180, yielding 5,832,000 one-step combinations. Owner-local execution and ten retained multi-step scenario traces are required; a central oracle is prohibited.

SEL-RISK-01: The principal abstract risk is semantic overclaim: a finite `READY`, `USABLE`, `GENERATED`, or `AVAILABLE_FOR_ANALYSIS` value could be read as physical or clinical truth. Type descriptions, status fields, context responsibility, exclusions, and validation criteria explicitly constrain those meanings.

SEL-SUPPORT-01: The Model may add only traced finite enum/flat-record definitions, one root and cohesive process layer if needed, root delegations, connection plumbing, initialization, local tuple-consistency clauses, and deterministic analyzer support. Such additions receive no semantic, interaction, case, state-owner, decision-owner, or scenario credit.

SEL-DEFER-01: Code generation, execution, formal proof, physical timing, electrical safety, image quality, diagnosis, treatment, patient outcome, regulatory compliance, certification, and production readiness remain deferred or excluded and must be reported `not-run` where applicable.

## Final disposition and generation authorization

SEL-PASS-FINAL-01: The approved design passes because the boundary remains coherent, alternatives were compared before allocation was frozen, all finite partitions and fresh/recovery paths are closed, every owner has a distinct nonidentity local relation, and the exact `15/33/30/10` point satisfies the hard tier without padding.

SEL-RES-01: The Model's state-locality finding is accepted. Four independent Thread-local state owners and the same-evaluation propagation chain are realizable without cyclic dependencies or central recomputation.

SEL-RES-02: The Model's data-locality finding is accepted. Flat finite records with direct attributes, explicit initialization, owner-local pre-state references, and exhaustive `compute_cases` exclusions provide the required complete local guarantees and one public writer.

SEL-RES-03: The Model's bounded-analysis finding is accepted. The exact 5,832,000-point product remains mandatory and is authorized for direct enumeration with aggregate counters under the 180-second watchdog; execution, coverage, and result checks remain required evidence rather than assumed passes.

SEL-SUPPORT-FINAL-01: Approved generated support is one root `System`, one behavior-free support `Process`, 15 sibling semantic `Thread` usages, 33 direct typed semantic sibling connections, exactly 16 boundary-delegation support connections for six inputs and two outputs, finite enum and flat-record definitions, initialization, owner-local tuple consistency, trace declarations, one source-bound overview, and deterministic analyzer code. None receives semantic, interaction, case, owner, or scenario credit beyond the declared 15/33/30/10 inventory.

SEL-AUTH-GEN-01: No semantic revision is used. Model generation is authorized against `system-abstract.md` and this approved final selection while preserving the selected boundary, exact counts, all owners, local contracts, priority, fault propagation, recovery, composition, support limits, exclusions, and deferred claims.
