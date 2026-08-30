# Approved Design Selection — Small Drone Lifecycle Governor

## Decision scope and evidence boundary

DS-BASIS-01: This decision selects one coherent `small` scope from the reusable drone seed and compares responsibility allocations before freezing the System Abstract. Source-grounded vocabulary and limitations are held separate from pilot policy, architecture choices, and deferred claims.

DS-BOUND-01: A viable selection must fit `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, and `4..6` scenario families; retain one principal decision owner; cover nominal, boundary, invalid/fault, and recovery behavior; and avoid count-only wrappers.

DS-FACT-01: The source supports lifecycle, battery-awareness, charging, pilot-monitoring, navigation, communication, sensing, and configurable-product vocabulary but leaves exact boundaries, command authority, transition policy, priorities, recovery, and physical meaning open. The inconsistent engine counts prohibit an engine-count premise.

## Candidate scope comparison

DS-SCOPE-01: The lifecycle-governor scope is selected because five source-named phases and lifecycle events support a closed finite state-and-policy problem, while qualitative battery awareness supplies a meaningful admissibility and attention input. The scope can express nominal, boundary, fault, and recovery traces without asserting physical flight success.

DS-SCOPE-02: A battery-awareness supervisor was not selected for this run. It is coherent and source-grounded, but the reusable seed supplies no charge thresholds, timing, discharge behavior, or mandatory consequence of low battery; a tier-specific design would have to invent most of its policy while exercising less lifecycle vocabulary.

DS-SCOPE-03: A flight-readiness coordinator was not selected for this run. Navigation, radio, sensing, and landing-gear observations are available vocabulary, but their validity, combination, priorities, and readiness effect are wholly open and would broaden a small run or invite unsupported operational claims.

DS-SCOPE-04: The whole forest-fire-observation product boundary was not selected. That label is recognizable context but does not ground detection, mapping, dispatch, suppression, autonomy, physical endurance, or a consistent engine topology, so treating it as a mission specification would exceed the source evidence.

## Architecture selection criteria

DS-CRIT-01: Semantic fidelity favors stable lifecycle-request, battery-assessment, state-decision, logical-enablement, and pilot-attention responsibilities with explicit source-versus-abstraction labels.

DS-CRIT-02: Owner integrity requires exactly one principal owner for lifecycle and recovery state, strict priority, and final case selection; any other usage must derive a meaningful local fact rather than mirror the principal decision.

DS-CRIT-03: Fault and recovery clarity favors an allocation in which request invalidity, battery invalidity, recovery gating, and fresh-request behavior remain independently traceable into the principal owner and advisory result.

DS-CRIT-04: Interface economy favors fewer stable domain flows, but only after responsibility cohesion and local contract evidence are preserved. Hiding multiple facts in an opaque bundle is not economy.

DS-CRIT-05: Realizability requires finite types, total owner-local contracts, one explicit root, semantic depth `1..2`, one weak region, and a bounded analyzer without assuming a specific SysML encoding before Model review.

## Responsibility-allocation alternatives

DS-ALT-01: Alternative A separates request qualification and battery assessment, sends both facts to one Lifecycle Decision Owner, and separates controlled-outcome from attention derivation. It has exactly five semantic usages and ten typed directed semantic interactions. The principal owner alone holds phase and recovery state and owns all twelve ordered transition cases.

DS-ALT-02: Alternative B consolidates request and battery qualification, adds a stateless Transition Applicability Proposer, retains one principal state-and-priority owner, and retains separate outcome and advisory derivation. It has five meaningful usages but fourteen semantic interactions because the proposer needs qualified request, battery assessment, and read-only current-state context, while the principal owner must independently receive qualification facts to validate fault and recovery priority before accepting or rejecting a proposal.

DS-ALT-03: Alternative B is plausible and not padding: its proposer derives an enabled-transition candidate rather than renaming a value. It was not selected because exporting owner state to the proposer, returning a proposal, and duplicating qualification facts across proposal and final-resolution paths increases coupling and creates a second location whose contracts must remain consistent with the twelve-case partition.

DS-ALT-04: A fully consolidated governor with only output and advisory derivation was considered but rejected as a tier allocation because it naturally produces fewer than five responsibility-bearing usages. Adding pass-through publishers or routers merely to reach five would violate the owner-count and no-padding rules.

## Selection and rationale

DS-DEC-01: Alternative A is approved. Its exact usages are Request Qualification, Battery Assessment, Lifecycle Decision Owner, Controlled Outcome Derivation, and Attention Derivation. Its exact interaction inventory is INT-01 through INT-10 in `system-abstract.md`.

DS-RATIONALE-01: Alternative A gives invalid request and invalid battery distinct qualification evidence, keeps all state and priority in one auditable principal owner, gives controlled permissions and pilot attention separate change-cohesive derivations, and uses four fewer interactions than Alternative B.

DS-RATIONALE-02: The selected outcome and advisory usages earn semantic credit through nonidentity local derivations: the outcome owner maps five phases to a three-field permission combination, and the advisory owner evaluates a priority expression over decision disposition and battery assessment. Neither is a bundle, router, or renamed copy.

DS-RATIONALE-03: Centralizing the twelve transition cases in one owner is appropriate for this small tier because the seed requires one principal owner and does not require cooperating proposal owners. Qualification remains distributed only where each part derives a separately meaningful validity-aware domain fact.

DS-CONSEQ-01: The chosen policy has exactly five phases, two finite monitored samples, three finite controlled outputs, two owner-local state variables, twelve ordered transition cases, and five scenario families. Low battery is valid information, not a fault; invalidity has top priority; recovery requires a neutral sample and a later fresh request.

DS-CONSEQ-02: The selected lifecycle phase is a commanded logical state. The decision does not add achieved-state feedback, physical actuation, timing, numeric battery thresholds, navigation, radio, sensing, landing, return-to-home, forest-fire mission behavior, engine counts, or safety claims.

## Objective selection audit

DS-COUNT-01: The selected exact campaign tuple is `5` semantic usages, `10` typed directed semantic interactions, `12` nontrivial contract cases, and `5` scenario families. Each value lies within the inclusive `small` bounds and excludes root, context, types, support routing, initialization, invariants, equations, and witnesses.

DS-OWNER-01: The selected ownership audit names Lifecycle Decision Owner as the only principal decision and state owner; Request Qualification and Battery Assessment as stateless qualification owners; and Controlled Outcome Derivation and Attention Derivation as stateless derived-result owners. No case or state has an unassigned or competing owner.

DS-COVER-01: The selected ordered partition covers every finite state/input snapshot, including normal transitions, `NoRequest`, inapplicable events, low-versus-adequate boundaries, valid `SwitchOff` priority, individual and combined invalidity, recovery with a still-present request, neutral recovery clearance, and the later fresh-request transition.

DS-PASS-01: Model review found the selection realizable: local state and post-state output semantics need no duplicated decision, the ten semantic flows can remain fixed while tool-required routing is identified separately, and owner-local contracts plus a bounded analyzer can cover all twelve cases and five scenario families. Generation remains conditional on preserving those conclusions exactly.

DS-REVIEW-01: The Designer independently accepts all six Model findings: local state realizability; the Process/Thread mapping with generated-support delegation; nonidentity request and battery qualification; meaningful local derivation in PART-03 through PART-05; direct phase and battery fan-out without publisher credit; and exhaustive enumeration of the 720-snapshot finite space. None requires narrowing or rejection because each preserves the frozen policy, owner allocation, exact counts, scenario set, and claim boundary.

DS-SUPPORT-01: The permitted concrete realization is one uncounted behavior-free Process containing the five responsibility-bearing Threads, ten `@generated-support` boundary-delegation connections, and five direct inter-Thread semantic connections. Fifteen raw connection declarations are therefore allowed while the semantic inventory remains exactly ten; support elements receive no semantic, interaction, or owner credit.

DS-AUTH-01: This final baseline uses no semantic revision from the retained initial selection. Model generation is authorized from `system-abstract.md` and `design-selection.md`; any incompatibility shall return to this same retained run and shall not weaken the policy, discard the seed, or start a replacement attempt.
