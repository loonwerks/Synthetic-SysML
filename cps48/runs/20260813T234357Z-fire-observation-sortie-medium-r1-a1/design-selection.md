# Approved Design Selection — Observation Acquisition and Radio-Delivery Coordinator

## Decision basis

DS-CONTEXT-01: This record compares all five coherent scopes offered by the frozen seed before selecting responsibilities. No diversity card was supplied, so no baseline-difference constraint applies beyond ordinary architectural distinctness and anti-padding rules.

DS-CRIT-01: Source fit favors a purpose recognizable from the named camera, radio equipment, qualitative battery-status path, drone control, and forest-fire observation label while preserving the seed's explicit claim limitations.

DS-CRIT-02: Boundary coherence requires one finite controlled purpose, exact finite inputs and outputs, understandable external owners, and no takeover of flight, navigation, physical energy, fire response, or mission authority.

DS-CRIT-03: Medium-tier substance requires 8–12 semantic usages, 15–21 semantic interactions, 12–20 nontrivial cases, 6–9 scenario families, at least two cooperating decision or qualification owners, and at least one explicit priority conflict without wrappers or duplicated policy.

DS-CRIT-04: Behavioral auditability requires complete owner-local partitions, a sole state owner, explicit fresh-request, cancellation, recovery, no-request hold, retry, and reentry rules, and feasible bounded analysis.

DS-CRIT-05: Claim discipline excludes unsupported accuracy, duration, safety, authority, fire-detection, successful-observation, flight-dynamics, propulsion, and physical communications assertions.

DS-CRIT-06: Responsibility integrity rejects forwarding, bundling, renaming, field projection, one-to-one enum translation, and central recomputation as semantic usage or owner justification.

## Candidate system-scope comparison

DS-SCOPE-01: Alternative A, a battery-status assessment system, is directly grounded by the only explicit source action and remains credible, but its natural responsibility and interaction set is too narrow for this medium tier unless unrelated equipment or presentation wrappers are added.

DS-SCOPE-02: Alternative B, an observation-sortie eligibility supervisor, is coherent but rejected because a central proceed/withhold decision would require a broader invented mission-authority policy and would make named camera and radio behavior secondary evidence sources.

DS-SCOPE-03: Alternative C, the selected observation acquisition and radio-delivery coordinator, uses camera and radio equipment as the organizing purpose, uses explicit qualitative battery awareness as one qualification premise, and can expose finite acquisition, delivery, cancellation, recovery, and retry behavior without claiming physical mission success.

DS-SCOPE-04: Alternative D, a navigation-and-obstacle-awareness supervisor, is credible vocabulary-wise but rejected because the seed supplies no navigation values, fusion relation, accuracy, obstacle meaning, or controlled response; nearly every substantive rule would be newly invented.

DS-SCOPE-05: Alternative E, a power-and-propulsion availability supervisor, is structurally recognizable from the battery, power-management, and four-engine configuration but rejected because the source establishes neither per-engine evidence nor propulsion sufficiency, redundancy, controllability, or an availability policy.

DS-SCOPE-06: Alternative C best balances recognizable source vocabulary, bounded logical control, medium-tier distributed responsibility, explicit claim restraint, and end-to-end observable outcomes. The selected purpose is coordination of a logical observation offer, not fire observation success.

## Responsibility-allocation alternatives for the selected scope

DS-ALLOC-01: Allocation 1, the selected evidence-to-proposal-to-arbitration pipeline, assigns battery, sortie, camera, and radio qualification to four owners; phase and recovery proposal to one owner; intent priority to a separate arbiter; all state and commands to one controller; and recipient-specific classifications to one outcome owner.

DS-ALLOC-02: Allocation 2, a centralized observation coordinator receiving all eight boundary inputs, would simplify topology but leave surrounding parts as input adapters and output presenters, violating the owner-count rule and obscuring which qualifications are independently reviewable.

DS-ALLOC-03: Allocation 3, independent camera-session and radio-session state machines joined by a handoff, would give both sides meaningful state but create dual cancellation and recovery authority, cross-state consistency obligations, and a larger protocol than the seed or medium scope justifies.

DS-ALLOC-04: Allocation 4, an observation-session controller with per-input validators, was rejected because finite validation or direct enum translation would not derive distinct domain facts and would pad nodes and cases.

DS-ALLOC-05: Allocation 5, combining proposal derivation and intent arbitration, would remain behaviorally possible but would hide the required explicit conflict between operator cancellation, qualification recovery, automatic progress, and a fresh start inside one broad policy owner.

## Selected boundary and architecture rationale

DS-BOUND-01: The selected eight inputs separate operator intent, battery capacity and check validity, read-only sortie context, camera condition and result, and radio condition and result. Each independently changes at least one qualified fact or scenario trace.

DS-BOUND-02: The four outputs separate camera acquisition intent, radio delivery intent, operator-facing status, and drone-control awareness. They have distinct recipients or controlled meanings and are not multiple encodings of one result.

DS-ARCH-01: The exact semantic architecture is eight usages and 21 interactions. Four qualification branches converge on `SessionProposalOwner`; its result and operator intent converge on `ObservationIntentArbiter`; the sole state controller feeds pre-state back to proposal derivation and publishes a snapshot to one outcome owner.

DS-ARCH-02: This topology makes owner cooperation explicit: qualification owners constrain `SessionProposalOwner`, proposal and intent constrain `ObservationIntentArbiter`, and only the controller commits state. Neither the root nor any optional support container may reproduce those relations.

DS-ARCH-03: Model review established the trusted System-to-Process-to-Thread form as the supported realization. The approved mapping therefore uses one behavior-free support Process, eight contract-bearing semantic Threads at depth two, and 12 transparent root/Process delegations. The support Process and delegations are predeclared, `@generated-support`, and uncredited.

## Policy and alternative-policy comparison

DS-POL-01: Selected priority is cancellation over qualification recovery over automatic phase progress over a qualified fresh start over no request. This guarantees a single result when operator termination and environmental invalidation coincide.

DS-POL-02: Recovery enters `SUSPENDED`, holds after the cause clears, and requires a later qualified fresh start. An automatic-resume alternative was rejected because clearing an input should not silently recreate an operator request.

DS-POL-03: Delivery rejection returns to `QUEUED` for automatic retry while qualification loss enters `SUSPENDED`. Treating both as the same failure was rejected because an explicit negative delivery result and loss of the delivery premise require distinct behavioral traces.

DS-POL-04: Radio availability is required continuously from session start. A late-binding alternative that permits acquisition while radio is unavailable was rejected because it would require buffering age, capacity, replacement, and expiry policies absent from the seed.

DS-POL-05: Invalid battery evidence outranks low energy, which outranks contextual, camera, and radio blockers. This is deterministic pilot policy for single-valued contracts, not a source-grounded hazard ranking.

DS-POL-06: Camera availability is required to start and through `ACQUIRING`, but camera condition and capture result cease to govern after a capture enters `QUEUED`; this phase boundary prevents later camera changes from invalidating an already queued logical observation.

## Count, owner, and partition audit

DS-AUDIT-01: The selected campaign tuple is exactly `8/21/20/8`: eight semantic usages, 21 typed semantic interactions, 20 owner-local nontrivial cases, and eight scenario families, all within the declared medium bounds.

DS-AUDIT-02: Cases 01–03 belong to battery qualification, 04–06 to sortie applicability, 07–09 to camera evidence, 10–12 to radio evidence, 13–15 to proposal derivation, 16–18 to intent arbitration, 19 to the sole state owner, and 20 to the outcome policy.

DS-AUDIT-03: Complete local products are 4 battery combinations, 6 sortie combinations, 6 camera combinations, 6 radio combinations, 320 proposal combinations, 48 arbiter combinations, 85 state-controller combinations, and 3,675 structurally valid outcome-policy combinations.

DS-AUDIT-04: The complete boundary product is 864 valuations; combined with five pre-session states, the end-to-end one-evaluation obligation is 4,320 combinations. Sequence evidence additionally covers all eight scenario families.

DS-AUDIT-05: `SessionProposalOwner` and `ObservationIntentArbiter` are the required cooperating decision owners. Four upstream qualification owners derive independent facts, `ObservationSessionController` is the sole state owner, and `CoordinationOutcomePolicy` derives two recipient-specific classifications.

DS-AUDIT-06: The explicit priority conflict is observable in the cancellation scenario: `CANCEL_OBSERVATION` defeats a simultaneous recovery or progress proposal. With `START_OBSERVATION`, recovery or automatic progress defeats the fresh start.

DS-AUDIT-07: Fresh-request closure is explicit: nonactive startable plus fresh start enters acquisition; nonactive blocked plus fresh start is rejected; no request holds; cancellation enters idle; suspended cause clearing holds; and qualified fresh reentry is required.

DS-AUDIT-08: Recovery closure is explicit for invalid evidence, low energy, context loss, phase-applicable camera loss or failure, and radio loss. Delivery rejection follows the separately closed retry path, and accepted delivery closes to idle.

DS-AUDIT-09: No semantic usage is justified by routing, projection, or renaming. The four qualifiers derive precedence-bearing many-input facts; the proposal owner combines qualifications and phase; the arbiter resolves priority; the controller commits state; and the outcome policy combines snapshot and battery semantics.

## Independent Model-finding resolution

DS-MODEL-01: The localized-mapping finding is accepted and narrowed to this logical profile. Generation shall select exactly one support Process, eight semantic Threads, 21 semantic interactions declared once inside the Process, 12 transparent boundary delegations, nine non-root nodes, 33 raw declarations, and semantic containment depth two.

DS-MODEL-02: The GUMBO-locality and record-field finding is accepted. PART-07 remains the sole state owner and may publish pre-evaluation state using retained-state semantics; PART-08 retains advisory and notice classification; repeated enum classifiers are allowed; and any representation-only projection remains generated support without semantic credit.

DS-MODEL-03: The extensional ownership finding is accepted for all eight usages. Their canonical local expectations remain the exact complete products and CASE allocation in `DS-AUDIT-02` and `DS-AUDIT-03`; copied fields, command encodings, routing, and one-to-one conversions remain excluded from owner credit.

DS-MODEL-04: The bounded-analysis finding is accepted as feasible and narrowed to a future evidence obligation. Generation and checking must retain separate owner-local relations and a separately structured raw-input reference evaluator, enumerate the exact local and 4,320 end-to-end products, exercise all eight state-carrying scenario families, record reachable and unreachable structurally valid inputs, and bind results to the canonical-source hash. The review did not itself satisfy those checks.

## Objective selection result and deferred evidence

DS-RESULT-01: Alternative C with Allocation 1 is selected because it best satisfies source recognizability, boundary coherence, medium-tier substance, explicit owner cooperation, priority and recovery auditability, and claim discipline.

DS-RESULT-02: Model generation shall preserve the exact finite boundary, `8/21/20/8` semantic tuple, selected `9 non-root nodes/33 raw declarations/depth two` support realization, sole state owner, phase-sensitive stale-result handling, cancellation/recovery/progress/start priority, suspension reentry, delivery retry, generated-support accounting, bounded analysis obligations, and all objective pass criteria in the System Abstract.

DS-DEFER-01: Physical flight, navigation, obstacle avoidance, camera behavior, observation quality, fire detection or mapping, radio performance, energy or endurance, propulsion, landing, charging, mission authority, safety, certification, deployment, and production readiness remain outside the selected design.

DS-DEFER-02: Code generation, application implementation, execution, physical validation, compositional proof, unbounded temporal proof, and formal semantic correctness beyond actual retained checks remain deferred or `not-run`.

DS-DISP-01: The final design passes Designer resolution and authorizes Model generation. No semantic revision was used: selecting the already permitted support realization resolves the initial mapping question without changing purpose, boundary, ownership, policy, metric tuple, contract partition, scenario outcomes, or deferred claims.
