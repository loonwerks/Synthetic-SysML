# Approved Design Selection — Battery Evidence and Charge Qualification Supervisor

## Decision basis

DS-CONTEXT-01: This final record compares all four seed-provided scopes, responsibility allocations for the selected scope, and the three Model-review findings. It preserves the immutable run and the replicate-2 constraint against another lifecycle or mission governor.

DS-CRIT-01: Source fit requires qualitative battery indication, status checking, low-battery notification, charger context, charging support, and lifecycle vocabulary to remain inside the frozen seed's claim limits.

DS-CRIT-02: Diversity requires a principal controlled purpose other than lifecycle transition governance and a genuine difference from the closest replicate-1 baseline in boundary, state ownership, topology, priority, and recovery.

DS-CRIT-03: Boundary coherence requires one finite supervisory purpose whose six inputs, four outputs, state, priority, recovery, and recipients are understandable without implementation vocabulary.

DS-CRIT-04: Medium-tier substance requires 8–12 semantic usages, 15–21 semantic interactions, 12–20 nontrivial cases, 6–9 scenario families, at least two cooperating qualification or decision owners, and an explicit priority conflict without padding.

DS-CRIT-05: Auditability requires every finite owner-local partition to close, including invalid evidence, ineligible requests, cancellation conflicts, recovery, no-request holding, fresh re-entry, and structurally type-valid inputs unreachable from the producer.

DS-CRIT-06: Claim discipline excludes inconsistent engine counts, physical charging and flight behavior, mission invention, timing, endurance, safety severity, certification, execution, and formal proof.

DS-CRIT-07: Responsibility integrity rejects routing, renaming, copying, bundling, and one-to-one enum projection as owner, interaction, case, or semantic-usage justification.

## Candidate system-scope comparison

DS-SCOPE-01: Alternative A, the battery-awareness and charge-qualification supervisor, remains selected. It directly uses the seed's battery indication, battery-status check, low-battery notification, charger context, and charging support while allowing finite qualification, logical permission, priority, recovery, and status behavior without claiming physical charging.

DS-SCOPE-02: Alternative B, a flight-readiness coordinator, remains credible but rejected because the seed does not define a joint battery, navigation, communication, and sensing readiness rule; medium scope would require unsupported policy and make charging peripheral.

DS-SCOPE-03: Alternative C, a drone lifecycle governor, remains rejected because it would again organize state and contracts around `OFF/STANDBY/CHARGING/READY/FLYING`, violating the replicate-2 controlled-purpose constraint.

DS-SCOPE-04: Alternative D, a complete logical forest-fire observation drone, remains rejected because the seed provides only a product label rather than operational fire-observation behavior and contains inconsistent engine-count selections.

DS-SCOPE-05: Alternative A best meets the criteria because battery evidence and charge permission remain meaningful with lifecycle as read-only applicability context, and its outputs are battery/charging outcomes rather than lifecycle, power, or flight authorization.

## Responsibility-allocation alternatives

DS-ALLOC-01: Allocation 1, the selected distributed evidence-to-permission pipeline, assigns battery evidence, charger path, contextual applicability, eligibility/recovery, priority arbitration, sole charge-session state, flight-control notice, and pilot advisory to eight cohesive owners connected by exactly 21 semantic interactions.

DS-ALLOC-02: Allocation 2, a centralized battery supervisor, remains rejected because other components would mainly deliver outputs and would become medium-tier wrappers.

DS-ALLOC-03: Allocation 3, separate battery-monitor and charger-session subsystems with duplicate policy, remains rejected because simultaneous invalid evidence and charger loss could create conflicting recovery authority unless decisions were recentralized.

DS-ALLOC-04: Allocation 4, a lifecycle-adjacent charging mode owner, remains rejected as an extension or repartition of the prohibited baseline because lifecycle transitions would organize state and cases.

DS-ALLOC-05: Allocation 5, per-input adapters feeding one decision owner, remains rejected because finite validation or enum renaming would add nodes and edges without independently derived domain facts.

## Model-review adjudication

DS-REVIEW-01: The physical containment finding is accepted. Current retained tool evidence supports exactly one behavior-free generated-support Process between the sole root System and the eight semantic Threads. The selected exact raw metrics are nine non-root architecture nodes, containment depth two, one support usage, ten root/Process support routes, and 31 source `PortConnection` declarations. The support Process, its ports, and delegations receive no semantic, owner, interaction, or case credit.

DS-REVIEW-02: The repeated-classifier finding is accepted and narrowed to representation only. Snapshot pre-session, snapshot next-session, pilot session, snapshot disposition, and pilot disposition use five distinct field-specific enum classifiers with literals and meanings extensionally identical to the canonical state and disposition domains. Every GUMBO-inspected record field is an `attribute`; the projections receive no owner, usage, interaction, or case credit.

DS-REVIEW-03: The case-20 totality finding is accepted. The recovery-advisory branch applies only to `RECOVERY_APPLIED` paired with `EVIDENCE_UNAVAILABLE`, `CHARGER_UNAVAILABLE`, or `CONTEXT_INELIGIBLE`; pairings with `NONE` or `CANCELLED` fall through activity-without-permission, low-battery, rejected-request, and `NONE` priority. Case 17 shall prove the producer invariant that only the three recovery reasons accompany `RECOVERY_APPLIED`.

DS-REVIEW-04: The identity-wrapper audit is accepted without revision to the semantic allocation. All eight usages retain substantive owner-local relations; readiness projection, snapshot projection, copied pilot-status fields, routing, and field-specific enum mappings remain excluded from credit.

DS-REVIEW-05: The state-feedback and bounded-workload findings are accepted as realizability evidence, not as proof. `INT-14` publishes the committed pre-state using `In(state)` semantics, the root and Process only route, and the analyzer must still independently compose and check all eight relations.

DS-REVIEW-06: The resumed visualization traceability finding is accepted and localized to the approved baseline's declaration syntax. Each counted behavior clause now begins with the canonical two-anchor form `BEH-* / CASE-*:` or `FAULT-* / CASE-*:` so `CASE-01` through `CASE-20` are exact, unique System Abstract anchors as well as counted case identifiers. The previously reported `INT-17`/`INT-20` route crossing is a downstream presentation defect, not an architecture or policy defect; regenerated visualization shall remove it without changing endpoints, interaction count, or semantics.

## Final selected architecture and behavior

DS-RESULT-01: The final semantic campaign tuple is exactly `8/21/20/7`: eight semantic Thread usages, 21 semantic interactions, 20 nontrivial owner-local cases, and seven scenario families, all within the declared medium bounds.

DS-RESULT-02: Exact physical metrics are one root System, one uncredited support Process, eight credited semantic Threads, nine non-root architecture nodes, ten usages including root, depth two beneath root, ten support routes, 21 semantic connections, 31 raw connection declarations, and one weakly connected semantic region.

DS-RESULT-03: `BatteryEvidenceQualifier`, `ChargeContextQualifier`, `ChargerPathQualifier`, `ChargeEligibilityRecoveryOwner`, and `ChargeIntentArbiter` are cooperating qualification or decision owners; `ChargeSessionController` alone owns the three-valued charge-session state. The remaining two owners derive contextual notice and advisory precedence.

DS-RESULT-04: The explicit priority conflict is `CANCEL_CHARGE` over qualification recovery over `REQUEST_CHARGE` over `NO_REQUEST`; reason precedence is invalid evidence over charger loss over contextual inapplicability.

DS-RESULT-05: Recovery changes only logical charge-session state from `ENABLED` to `SUSPENDED`, disables permission, holds after the cause clears, and requires a later eligible fresh request for re-entry. It never changes lifecycle and claims no physical stop action.

DS-RESULT-06: The six root inputs have a raw finite product of 240 values; combined with three pre-session states, the end-to-end obligation is exactly 720 one-evaluation combinations. The analyzer shall compose the eight named local relations through the explicit interaction map and compare them with a separately stated abstract relation.

DS-RESULT-07: Exact complete owner-local products are 4 battery, 4 charger path, 15 context, 27 eligibility/recovery, 21 arbitration, 27 state control, 15 notice, and 1,620 status-policy combinations. Status analysis shall be single-valued and total, shall report producer reachability separately, and shall retain the 108 unreachable recovery/reason pairings as fall-through tests.

DS-RESULT-08: The 21 semantic interactions comprise seven boundary-to-owner flows, ten owner-to-owner or owner-to-output semantic flows before root egress, and four owner-to-boundary outputs. The ten root/Process delegations are separate generated support.

DS-RESULT-09: Cases 01–03 belong to battery evidence, 04–06 to charger path, 07–09 to context/readiness, 10–13 to eligibility/recovery, 14–16 to arbitration, 17–18 to the sole state owner, 19 to flight-control notice, and 20 to pilot advisory. Projection and initialization clauses do not change the count.

## Diversity and claim boundary

DS-DIV-01: The closest baseline owns `OFF/STANDBY/CHARGING/READY/FLYING` transitions and publishes lifecycle, power, charging, and flight-authorization outcomes; the selected system instead owns only `IDLE/ENABLED/SUSPENDED` logical charge permission.

DS-DIV-02: Boundary, topology, priority, and recovery all differ: battery and charger evidence branches converge on charge eligibility while feeding separate status consumers; cancellation outranks revocation and request; and recovery suspends permission until fresh eligible re-entry without changing lifecycle.

DS-DIV-03: This is not a rename or extension because lifecycle is neither owned state nor a controlled output and does not organize the contract partition. Its battery/charger evidence and charge-session purpose remains recognizable without the read-only lifecycle-context input.

DS-DEFER-01: Engine configuration, physical charging, battery chemistry, percentages, endurance, propulsion, navigation, communication performance, landing, return-to-home, fire detection or mapping, timing, safety, certification, deployment, and production behavior remain outside the selected system.

DS-DEFER-02: Code generation, application implementation, execution, physical validation, compositional proof, formal semantic correctness beyond executed bounded checks, and unbounded temporal proof remain `not-run` or deferred.

DS-DISP-01: The revised final baseline is approved and Model generation is authorized in this retained run. Generation shall preserve all semantic metrics, exact support metrics, ownership restrictions, total partitions, analyzer obligations, scenarios, and deferred claims stated above.
