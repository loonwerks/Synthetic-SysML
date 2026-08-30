# Designer-Approved Design Selection — Small Drone Battery Charge Qualification Supervisor

## Decision scope and evidence boundary

DS-BASIS-01: This decision approves one coherent `small` system from the reusable drone seed before SysML realization. Source facts, handbook-derived method, pilot abstractions, selected architecture, and deferred claims remain separately identified in `system-abstract.md`.

DS-BOUNDS-01: A viable selection must contain `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, and `4..6` distinct scenario families; retain one principal decision owner; and cover nominal, boundary, invalid/fault, and recovery behavior without count padding.

DS-DIVERSITY-01: A viable replicate-2 selection must not govern, rename, extend, or repartition the replicate-1 `Off/Standby/Charging/Ready/Flying` lifecycle state machine. Lifecycle may only be contextual evidence or advisory output, and at least two architectural dimensions must genuinely differ.

DS-FACT-01: The seed supports battery awareness, qualitative capacity indication, battery checking, low-battery notification toward flight control, a monitoring pilot, a charger and charging interface, charging events, lifecycle vocabulary, navigation, communication, sensing, and a configurable product context. It leaves exact boundary, authority, thresholds, policy, priorities, recovery, and physical meaning open and prohibits an engine-count premise.

## Comparison of seed candidate scopes

DS-SCOPE-01: The battery-awareness-supervisor scope is selected. Qualitative battery evidence, charging context, the pilot monitor, low-battery evidence toward flight control, and begin/end charging vocabulary support a closed finite question: whether logical charge delivery is presently permitted and what battery evidence should be reported. The policy is explicitly a pilot abstraction and needs no physical charge or lifecycle claim.

DS-SCOPE-02: The lifecycle-governor scope is rejected for this replicate because it is the named closest baseline and would repeat the baseline's principal purpose, state vocabulary, transition priority, and lifecycle outputs even if its parts or case labels changed.

DS-SCOPE-03: The flight-readiness-coordinator scope is plausible but not selected. Navigation, inertial, barometric, communication, camera, obstacle, and landing-gear vocabulary could supply readiness evidence, but the seed supplies no validity or combination policy for those observations. A small realization would invent a broader evidence oracle than the chosen battery/charger boundary.

DS-SCOPE-04: The logical forest-fire-observation-drone product scope is rejected. The product label does not ground detection, mapping, dispatch, suppression, autonomous mission behavior, physical endurance, or consistent engine topology, so it cannot support a bounded operational mission without unsupported claims.

## Architecture selection criteria

DS-CRIT-01: Primary-purpose fidelity favors a boundary whose only controlled decision is charge authorization and whose reports are battery evidence, with no lifecycle request, phase state, or lifecycle output.

DS-CRIT-02: Owner integrity requires exactly one principal owner for authorization, recovery, eligibility application, priority, and final case selection. Other usages must derive meaningful owner-local facts and may not decide eligibility on the principal owner's behalf.

DS-CRIT-03: Fault and recovery clarity favors independently qualified battery, combined charging context, and intent facts so each invalid source and the fresh-intent path remain traceable into the sole principal owner.

DS-CRIT-04: Cohesion favors separating pilot attention and flight-readiness evidence because they have different recipients and different output partitions, while combining charger availability with flight activity because together they classify one immediate charging context.

DS-CRIT-05: Realizability favors finite types, an ordered total contract partition, one explicit root, semantic depth `1..2`, one weak region, and a deterministic bounded analyzer, while preserving concrete Model questions about the trusted language subset.

## Responsibility-allocation alternatives

DS-ALT-01: Alternative A, selected, uses Battery Evidence Qualification, joint Charge Context Qualification, Charge Intent Qualification, one stateful Charge Qualification Owner, Pilot Attention Derivation, and Readiness Evidence Derivation. It has exactly six semantic usages and fourteen typed directed semantic interactions; all twelve policy cases and both state variables remain local to the sole principal owner.

DS-ALT-02: Alternative B separates battery, charger, flight-activity, and intent qualification; adds an Eligibility Composer; retains a stateful authorization owner; and combines both reports in one Reporting usage. It can fit seven usages and fourteen interactions only if the composer derives `eligible/ineligible/invalid` before the authorization owner.

DS-ALT-03: Alternative B is coherent but rejected because its Eligibility Composer would own the decisive low-battery, charger-available, flight-inactive conjunction and invalidity collapse. That creates a competing applicability decision location, weakens the required single-owner audit, and hides which prerequisite caused a normal revocation unless more flows are added beyond the tier maximum.

DS-ALT-04: Alternative C sends four separately qualified inputs directly to one stateful owner and lets that owner emit all three root outputs. It fits five semantic usages and eleven interactions and preserves one principal owner, but it concentrates charging policy, pilot presentation, and flight-control evidence in one change-uncoupled responsibility.

DS-ALT-05: Alternative C is rejected because its principal owner would have to duplicate the advisory and readiness partitions inside the twelve transition cases or leave those outputs under-specified. Separate result derivations make full output coverage explicit without adding another decision owner.

## Selection and rationale

DS-DEC-01: Alternative A is approved for Model generation. Its exact usages are PART-01 through PART-06, and its exact interaction inventory is INT-01 through INT-14 in `system-abstract.md`.

DS-RATIONALE-01: Alternative A preserves independent validity evidence for battery and intent while assigning charger availability and flight activity to one cohesive charge-context classifier. The principal owner receives every fact needed to own invalidity priority, recovery, eligibility, and retained authorization.

DS-RATIONALE-02: PART-05 and PART-06 earn semantic credit through different nonidentity two-input derivations for different external consumers. Their shared inputs are intentional fan-out, not publishers, routers, or count-only wrappers.

DS-RATIONALE-03: The selected twelve-case partition is the smallest reviewed partition that separately closes invalidity, retained nonneutral recovery, neutral recovery, awaiting-fresh recovery, fresh end, fresh qualified begin, fresh denied begin, normal end, normal qualified begin, normal denied begin, retained permission, and remaining inhibition.

DS-CONSEQ-01: The selected policy permits charge only for low-battery evidence with an available charger and inactive flight context, retains permission only while those facts remain valid, and revokes otherwise. These are explicit pilot decisions rather than source-grounded physical rules.

DS-CONSEQ-02: The system does not decide whether the drone is `Off`, `Standby`, `Charging`, `Ready`, or `Flying`. Its `FlightActivity` input is external context, its state is authorization/recovery state, and its readiness output is evidence for another decision rather than a lifecycle command.

## Diversity determination

DS-DIFF-01: Boundary genuinely differs from the closest lifecycle baseline: this system accepts battery, charger, flight-activity, and charge-intent samples and emits charge authorization, pilot battery attention, and battery-readiness evidence, while accepting no general lifecycle request and emitting no phase or lifecycle enablement outcome.

DS-DIFF-02: State ownership genuinely differs: the sole owner stores `authorizationState` and `recoveryPhase`; no usage stores or derives the five lifecycle phases.

DS-DIFF-03: Interaction topology genuinely differs: three qualified evidence paths converge on the charge owner, whose decision then branches into separate pilot-attention and readiness-evidence derivations. There is no selected-phase fan-out or phase-to-permission mapping.

DS-DIFF-04: Priority policy genuinely differs: invalid evidence and recovery gate charge-specific `EndCharge`, `BeginCharge`, and `NoIntent` behavior plus retained eligibility. It has no `SwitchOff` priority and no phase-transition applicability relation.

DS-NOT-EXT-01: The selection is not a lifecycle-baseline extension or rename because its complete owner state and outputs are insufficient to reconstruct a lifecycle phase, and none of its cases selects a lifecycle transition. Combining it with a lifecycle governor would require an additional architectural allocation deciding how that separate governor consumes charge authorization or readiness evidence.

## Model-finding dispositions

DS-REVIEW-01: The Designer accepts the Model's allocation and identity-wrapper audit. PART-01 and PART-03 receive owner credit only for their complete status-dependent invalidity collapses, PART-02 for its joint prioritized classification, PART-04 for the stateful decision partition, and PART-05 and PART-06 for their distinct two-input result derivations. Generation shall preserve those local bases and may not substitute valid-label renaming or routing evidence.

DS-REVIEW-02: The Designer accepts the owner-state and local-contract realizability finding, narrowed to feasibility rather than verification. Trusted precedent supports attempting two owner-local state variables and exhaustive local cases, but only retained source typechecking and bounded analysis can establish conformance for this run; no temporal or compositional proof is inferred.

DS-REVIEW-03: The Designer accepts the containment mapping as an exact generated-support allowance: one uncounted behavior-free Process, fourteen boundary delegation connections, seven direct sibling-Thread connections, and therefore twenty-one raw connections realizing exactly fourteen semantic interactions. No other support topology or semantic credit is authorized without a new same-run diagnostic.

DS-REVIEW-04: The Designer accepts the checker and bounded-analysis finding, narrowed because structural ownership strings cannot establish substantive ownership. The analyzer shall cover exactly 288 qualified snapshots, raw-boundary invalidity combinations, reachable state and scenario traces, and every case witness; the source-local contracts and executed analysis shall provide the ownership evidence.

## Objective selection audit and handoff

DS-COUNT-01: The selected exact campaign tuple is `6` semantic usages, `14` typed directed semantic interactions, `12` nontrivial contract cases, and `5` scenario families. Every value lies within the inclusive `small` bounds and excludes root, context, types, support routes, initialization, invariants, equations, and witnesses.

DS-OWNER-01: The ownership audit names PART-04 as the only principal decision and state owner; PART-01 through PART-03 as stateless qualification owners; and PART-05 and PART-06 as stateless derived-result owners. No decision, state, or case has an unassigned or competing owner.

DS-COVER-01: The selected ordered partition covers every finite owner snapshot, including normal start, continuation, termination, each eligibility failure, automatic revocation, all individual and combined invalidity, a retained nonneutral intent, neutral recovery, repeated neutral waiting, and every fresh-intent disposition.

DS-PASS-01: Final selection passes because the Model review found the owner-local state and contracts realizable without duplicating the decision, distinguished the fourteen semantic interactions from the twenty-one allowed raw routes, and identified trusted-subset forms for all qualification and result derivations. These are generation-feasibility findings only; the retained generated source must still satisfy all mechanical and bounded-analysis checks.

DS-AUTH-01: Model generation is authorized from `system-abstract.md` and this approved selection record. Any incompatibility shall return a precise diagnostic to the Designer in this same immutable run and shall not narrow the purpose, reintroduce lifecycle governance, add count-only structure, silently weaken fault and recovery behavior, discard the frozen seed, or start a replacement attempt.
