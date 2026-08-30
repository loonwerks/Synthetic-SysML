# Final Design Selection — Battery Status Assessment Service for Drone Control

## Selection basis and alternatives

DS-BASIS-01: The frozen seed provides the qualitative battery-status flow but leaves scale, types, policy, ownership, fault handling, and recovery to the Designer. The replicate-2 diversity constraint excludes another sortie-eligibility governor, observation/data-delivery coordinator, or renamed/repartitioned form of those systems.

DS-CRIT-01: A selectable direction must have one implementation-independent controlled purpose, remain within the small bounds, use qualitative battery status without inventing quantitative battery physics, contain one principal decision owner, and cover nominal, boundary, invalid/fault, and recovery behavior.

DS-CRIT-02: Selection favors an exhaustively finite boundary, nonidentity owner-local derivations, necessary interaction paths, fail-closed publication, explicit state closure, and strict separation of source facts, pilot abstractions, architecture choices, and deferred claims.

DS-SCOPE-01: The battery-status assessment scope is selected because it directly realizes the source-described obtain/analyze/make-available flow and supports trust, token association, result custody, acquisition faults, and publication recovery without creating flight permission.

DS-SCOPE-02: Observation-sortie eligibility is rejected because replicate 1 already used it and because it changes the controlled result from battery assessment to mission permission.

DS-SCOPE-03: Observation/communication coordination is rejected because replicate 1 used it and the seed supplies no observation-data, message, completion, or communication-performance semantics.

DS-SCOPE-04: Navigation/obstacle awareness is rejected because the seed supplies no measurement domains, validity meanings, fusion policy, awareness result, or performance bound.

DS-SCOPE-05: Power/propulsion availability is rejected because named engines and battery structure do not establish engine health, propulsion sufficiency, redundancy, controllability, or an enable policy.

DS-ALT-01: A centralized assessor with boundary adapters is rejected because the adapters would be forwarding-only and could not legitimately receive semantic-usage or owner credit.

DS-ALT-02: The selected allocation separates `CheckLifecycle`, `ReportAcquisition`, `ReportQualification`, sole `AssessmentDecision`, and `ResultCustody`. Each derives a distinct temporal, applicability, trust, assessment, or custody fact.

DS-ALT-03: Parallel assessment owners plus a reconciler are rejected because they duplicate applicability, create competing principal decisions, and add policy solely to resolve architecture-induced disagreement.

DS-ALT-04: Battery, power-management, and drone-control wrappers are rejected because source names do not establish separate internal behavior; copying reports between them would pad owner count.

DS-DEC-01: `DS-SCOPE-01` with `DS-ALT-02` remains selected. The final campaign point is exactly `5 usages / 14 interactions / 12 cases / 5 scenario families`, with one principal assessment owner.

## Diversity and claim boundary

DS-DIV-01: Relative to the closest replicate-1 eligibility baseline, this design changes controlled purpose from observation-service permission to temporary availability of a token-specific qualitative battery assessment.

DS-DIV-02: Its boundary monitors a check request, one structured battery report, and use feedback and controls a read request, tagged assessment, and diagnostic status; it has no camera, radio, observation-progress, or authorization port.

DS-DIV-03: It has three semantic state owners for lifecycle/freshness, acquisition fault, and result custody/publication fault; no state represents observation engagement or permission.

DS-DIV-04: Its topology is serial admission/acquisition/qualification/assessment/custody plus prior-committed acquisition and publication outcomes, rather than parallel evidence fan-out and eligibility convergence.

DS-DIV-05: Its policy prioritizes applicability, trust classification, non-bijective battery interpretation, and publication consistency; its result is never permit/deny.

DS-DIV-06: Recovery requires one explicit reset of both latches, retained freshness, same-token rejection, and alternate-token restart; favorable values or observation state cannot release recovery.

DS-CLAIM-01: Sortie eligibility, observation acquisition/delivery, mission authority, fire detection/response, navigation, obstacle avoidance, propulsion, landing, charging, flight dynamics, endurance, battery physics, physical safety, certification, and production readiness remain deferred.

## Selected ownership, policy, and state refinements

DS-OWN-01: `AssessmentDecision` (`PART-04`) is the sole principal decision owner. Lifecycle, acquisition, qualification, and custody owners derive only prerequisite, applicability, trust, or publication facts.

DS-OWN-02: Each usage has a nonidentity canonical local contract. Raw-field preservation on successful capture, ticket relabeling, support storage, delegation, and inactive sentinels receive no owner or semantic credit.

DS-POL-01: The pilot mapping is `High -> NormalUse`, `Moderate -> CautionUse`, `Low|Critical -> RestrictUse`; every untrusted content class yields `Untrusted`, which outranks encoded level. This is a Designer abstraction, not a physical battery claim.

DS-POL-02: Prior publication fault outranks acquisition fault and both outrank commands; matching consumption and cancellation clear output; active starts are busy; idle same-token starts are replays.

DS-POL-03: One applicable reset in recovery directs both latches to clear, keeps outputs fail-closed, retains the last token, and requires the alternate token for a new check. Reset claims only logical recovery.

DS-REV-01: The Model's consumption-state finding is accepted. Prior-committed feedback necessarily admits `(AwaitingUse, Ready, Empty)` after custody clears the assessment and before lifecycle reports `Completed` on the following evaluation.

DS-REV-02: The Model's independent combined-fault finding is accepted. The admitted families now include `(Checking, FailureHold, FaultHold)` and its following `(RecoveryHold, FailureHold, FaultHold)` state, with `PublicationFailed` priority and no cross-owner interaction.

DS-REV-03: The Model's retained-result finding is accepted. `PART-05` now owns `RetainedAssessment`, sets it only on a matching meaningful open, preserves it only while offered, and clears it on consume, withdrawal, fault, or reset; a meaningful retained value exists exactly when publication state is offered.

DS-REV-04: The prior-feedback mapping is accepted as generated support. `PART-02.committedAcquisitionOutcome` and `PART-05.committedPublicationOutcome` are initialized registers; `INT-08` and `INT-11` expose `In(register)`, and each register's post-state depends only on its owner's current local relation.

DS-REV-05: The owner audit is accepted without architectural revision. The containment/flat-record finding is accepted as a generation constraint and realizability rationale, but prior typechecking of another model is not evidence that the source to be generated has passed.

## Exact counts and local-contract expectations

DS-COUNT-01: `PART-01` through `PART-05` are exactly five semantic usages. Root, context, types, ports, sentinels, support process, commit registers, and delegations receive zero usage credit.

DS-COUNT-02: `INT-01` through `INT-14` are exactly fourteen semantic interactions: three boundary inputs, eight owner-to-owner meanings, and three boundary outputs. Routing hops do not increase the inventory.

DS-COUNT-03: `CASE-01` through `CASE-12` are exactly twelve nontrivial contract cases. Initialization, invariants, sentinels, status mapping, commit storage, and ordinary branches are mandatory and uncredited.

DS-COUNT-04: `SCN-01` through `SCN-05` are exactly five families covering nominal/consumption, capacity boundaries, request boundaries, invalid/fault including simultaneous faults, and recovery including combined hold.

DS-METRIC-01: The remaining exact metrics are one root system, semantic depth one after support collapse, one weakly connected semantic region, eight internal semantic meanings, and one principal decision owner.

DS-LOCAL-01: Lifecycle contracts must be total and exclusive over every command/state/prior-outcome combination, retain freshness, honor status priority, and emit coherent inactive directives when work is not admitted.

DS-LOCAL-02: Acquisition must distinguish ignore, exact capture, acquisition fault, held failure, and reset; qualification must collapse every captured payload into exactly one trust class; assessment alone must perform the five-to-four meaningful mapping.

DS-LOCAL-03: Custody must distinguish open, exact preserve, consume, withdraw, fault, held fault, and reset; `CTRL-02` must equal offered token plus retained result exactly while offered and the inactive pair otherwise.

DS-LOCAL-04: Consumption clearing is immediate at custody, while `Completed` is delayed until committed `Consumed` is evaluated. Simultaneous acquisition/publication faults must latch independently; one reset must clear both without suppressing either owner's fault.

## Bounded analysis and generated-support allowances

DS-ANALYSIS-01: The independent analyzer shall exhaust `8*180*12 = 17,280` raw boundary snapshots before state, plus all applicable internal values, retained assessments, commit-register values, and every admitted state/token family. Owner-factored enumeration is allowed; centralized policy recomputation is prohibited.

DS-ANALYSIS-02: It shall prove totality, mutual exclusivity, token coherence, initialization, state/output/retained-result invariants, unreachable-state rejection, trusted provenance, fail-closed faults, and execution of all five ordered scenario families.

DS-ANALYSIS-03: It shall include explicit witnesses for consumption recognition, simultaneous fault entry, combined recovery hold, reset confirmation, same-token rejection, and alternate-token recovery.

DS-SUPPORT-01: The permitted generated realization is one root `System`, one behavior-free support `Process`, and five sibling semantic `Thread` usages. It may use flat direct-attribute `Data`, closed enums, ordinary ports, inactive sentinels, commit registers, and six root/process delegation connections.

DS-SUPPORT-02: Expected raw inventory, if the support process is used, is five semantic threads, one support process, six non-root usages, raw depth two, semantic depth one, fourteen process-local semantic connections, six delegations, and twenty raw `PortConnection` declarations. Support elements trace to parent meanings and receive zero semantic credit.

DS-EVIDENCE-01: Architecture-stage, retained-final, and independent-harness typechecking, trace/metric gates, and bounded analysis remain required. Existing library and vehicle-model checks establish only that the selected idioms appear realizable.

DS-DISP-01: Final Designer disposition is `approved`. Model regeneration is authorized against `system-abstract.md` and this selection only; no policy, boundary, count, owner, recovery rule, or claim boundary may be weakened for tool compatibility.
