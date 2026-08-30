# Initial Design Selection — Vehicle Controller Operating-Mode and Parking-Brake Coordinator

## Selection basis

DS-BASIS-01: The frozen seed offers operating-mode, controller coordination, temperature/health, start-readiness, and power-enablement scopes but leaves exact purpose, boundary, policy, ownership, priority, and recovery to the Designer. The replicate-2 diversity card prohibits another temperature/health supervisor, readiness gate, protected-start controller, power-enablement supervisor, or renamed elaboration of those systems.

DS-CRIT-01: A candidate must form one coherent controlled purpose, remain implementation-independent, expose a complete finite boundary and policy, fit the hard bounds, contain multiple genuine state and decision owners, and make priority, fault propagation, recovery, and composition independently reviewable.

DS-CRIT-02: Selection favors source-recognizable vocabulary with few unsupported physical claims, single ownership of each derived fact, a topology driven by the selected purpose, explicit freshness, one connected semantic region, and an objective reason for every usage, interaction, case, and scenario family.

DS-DIV-01: A viable candidate must differ from the closest replicate-1 start-readiness/protected-start baseline in controlled purpose and at least two architectural dimensions. Mere renaming, splitting its qualification gate, adding controller modes around its authorization, or moving the same decisions across parts is unacceptable.

## Comparison of the seed candidate scopes

DS-SCOPE-01: A vehicle operating-mode supervisor can coordinate start, on, off, maintenance, degraded, and return-to-normal indications and publish mode/brake outcomes. It is source-recognizable, supports genuine lifecycle and recovery state, and can avoid readiness and power policy. This direction was selected and bounded to the VehicleController context.

DS-SCOPE-02: A controller-mode coordinator is the boundary placement variant of DS-SCOPE-01. It was combined with that direction because naming VehicleController as the system boundary clarifies that Vehicle, brake actuation, power, and drivetrain physics remain external; boundary placement alone was not treated as a separate controlled purpose.

DS-SCOPE-03: A temperature and health supervisor was rejected because the diversity card expressly reserves replicate 2 from reconstructing replicate-1 thermal/health supervision. Adding operating modes around thermal clearance would still be an elaboration of that baseline.

DS-SCOPE-04: A start-readiness supervisor was rejected because it would again qualify brake, self-test, temperature/maintenance, or power evidence and publish an authorization or start outcome. That is the closest replicate-1 baseline and conflicts directly with the required controlled-purpose difference.

DS-SCOPE-05: A vehicle power-enablement supervisor was rejected because it would repeat the protected-start/power-enablement family and require unsupported causal meaning from the seed's empty electrical-power analysis.

DS-SCOPE-06: A parking-brake-only supervisor was considered. It would clearly differ from replicate 1, but with no actuator feedback or physical completion meaning in the seed it either becomes a thin mode-to-command mapping or invents a braking protocol. Parking-brake coordination is retained as a composed secondary outcome of the selected mode purpose instead.

## Responsibility-allocation alternatives

DS-ALT-01: Alternative A centralizes indication freshness, priority, mode, recovery, brake policy, and output in one coordinator surrounded by adapters. It minimizes flows but has one genuine decision/state owner; the adapters would be identity wrappers and cannot satisfy the hard owner or usage obligations.

DS-ALT-02: Alternative B gives each indication family a temporal epoch owner, separates conflict classification from priority selection, assigns nominal demand, maintenance session, degraded episode, recovery eligibility, and controller mode to distinct owners, then composes an independent brake demand with mode. It yields thirteen semantic usages and thirty-five typed directed interactions without duplicated policy.

DS-ALT-03: Alternative C uses peer mode proposers for lifecycle, maintenance, degradation, and recovery, followed by a central reconciler. It appears distributed but duplicates state-transition knowledge across proposers, creates conflicts by construction, and would make the reconciler the true centralized mode owner.

DS-ALT-04: Alternative D makes parking-brake disposition the primary state and derives controller mode from it. It provides a different topology but turns the five-valued controller mode into a many-to-one elaboration of a two-valued command and cannot explain maintenance versus standby without reintroducing hidden mode state.

DS-COMP-01: Alternative A fails behavioral ownership; Alternative C duplicates decisions and weakens traceability; Alternative D makes mode meaning subordinate to an insufficient brake abstraction. Alternative B assigns each temporal, priority, episode, transition, brake, and composition fact exactly once and directly supports finite contract partitions.

## Selected direction and exact hard-tier point

DS-DEC-01: Alternative B is selected at exactly `13 semantic usages / 35 semantic interactions / 30 nontrivial cases / 10 scenario families`, within the inclusive hard bounds `13..16 / 22..35 / 21..30 / 9..12`.

DS-DEC-02: The primary controlled purpose is VehicleController operating-mode coordination with parking-brake safing composition. Start and on are lifecycle context only; the system does not decide readiness, authorize start, enable power, supervise thermal health, or control starter, power, self-test, or vehicle dynamics.

DS-DEC-03: The complete boundary is four monitored indication objects—lifecycle, maintenance, degraded, and return—and one controlled atomic `(ControllerMode, ParkingBrakeCommand)` frame. This excludes replicate-1 qualification inputs and authorization, power, and general status outputs.

DS-DEC-04: The explicit priority is `invalid > degraded > off > maintenance > return > on > start > none`, with conflict classification retained independently. Recovery conflicts fail by blocking or cancellation rather than allowing a selected winner to hide concurrency.

DS-DEC-05: Recovery is `Latched -> ReturnArmed -> ClearEpisode` after a fresh uncontested return and a later quiet confirmation. It returns mode to `Standby`, stages nominal demand without a fresh start, requires a later fresh on for operation, and uses no self-test, readiness evidence, or power clearance.

DS-DEC-06: Parking-Brake Demand derives independently from fault, maintenance, and priority context. Outcome Coherence releases only when both next mode is `Operating` and brake demand permits, so composition is a conservative two-input decision rather than a wrapper around mode.

## Diversity comparison with the closest replicate-1 baseline

DS-DIFF-01: The closest baseline is the replicate-1 start-readiness/protected-start supervisor because both mention start and degraded context. The controlled purposes differ: that baseline decides whether a start/power episode is qualified, while the selected system coordinates externally visible controller operating modes and a parking-brake disposition after source-named indications.

DS-DIFF-02: Boundary differs. The selected inputs are validity-bearing lifecycle, maintenance, degraded, and return indications, and the only output is a mode/brake frame. It excludes brake observation, temperature/health, self-test, and power readiness and emits no authorization, power, or general status outcome.

DS-DIFF-03: State ownership differs. Four epoch owners retain indication history; separate owners retain operating demand, maintenance session, degraded episode, and controller mode. There is no readiness state, self-test cycle, start-authorization owner, or power-qualification owner.

DS-DIFF-04: Interaction topology differs. Four temporal streams converge on conflict and priority owners, then branch into three orthogonal state dimensions and recovery before reconverging through mode, independent brake demand, and safing composition. It is not the replicate-1 qualification fan-in followed by an authorization/lifecycle gate.

DS-DIFF-05: Priority policy differs. The selected order includes invalid, degraded, maintenance, on, and separate conflict semantics around the order `invalid > degraded > off > maintenance > return > on > start`; it is not the replicate-1 `off > return > start` admission policy.

DS-DIFF-06: Recovery policy differs. The selected design uses no recovery self-test and does not recover to `Off` followed by a later fresh start. A fresh return arms a separate episode, a later quiet evaluation confirms it into `Standby`, and a fresh on resumes operation.

DS-DIFF-07: These five differences alter the system boundary, owned state, interaction graph, priority semantics, and recovery trace. Adding this coordinator to the replicate-1 baseline would leave two incompatible owners for degradation, lifecycle, and recovery rather than extend one decomposition, so the selected architecture is neither a rename nor a repartition.

## Count and ownership audit

DS-COUNT-01: PART-01 through PART-13 are exactly thirteen responsibility-bearing semantic usages. Root, context actors, types, ports, behavior-free delegation, and any profile-required support receive no semantic credit.

DS-COUNT-02: INT-01 through INT-35 are exactly thirty-five typed directed semantic interactions: four boundary observations, thirty inter-owner facts or decisions, and one atomic boundary delivery. Concrete routing hops may refine but never increase this semantic inventory.

DS-COUNT-03: CASE-01 through CASE-30 are exactly thirty nontrivial cases: eight priority, four demand, three maintenance-session, five degraded-episode, five recovery, and five mode cases. Epoch equations, conflict cardinality, initialization, brake/output mappings, invariants, duplicated guarantees, and analyzer branches are mandatory but uncounted.

DS-COUNT-04: SCN-01 through SCN-10 are exactly ten distinct scenario families covering nominal progression, order/freshness rejection, priority conflict, maintenance resumption, maintenance interruption, degraded propagation, invalid propagation, successful recovery, recovery rejection, and composition.

DS-OWN-01: The four Epoch Owners, Conflict Classification, Indication Priority, Operating Demand, Maintenance Session, Degraded Episode, Recovery Eligibility, Mode Transition, Parking-Brake Demand, and Outcome Coherence each derive a distinct local fact. Eight usages own state and the remaining five own nonidentity decisions.

DS-OWN-02: The audit found no usage whose only behavior is copying, preserving, routing, bundling, renaming, or bijective mapping. In particular, PART-13 combines two independent decisions conservatively, and the bounded analyzer must compare against rather than substitute for the owner-local contracts.

## Realization constraints and review questions

DS-REAL-01: One explicit root, semantic depth `1..2`, and one weak semantic region are required. A behavior-free support container or delegation hop is permitted only if required by the SysML-AADL profile, specifically justified as generated support, and excluded from the exact `13/35/30/10` counts.

DS-REAL-02: The model must preserve the finite types, local state initialization, edge semantics, exact priority, all six closed case partitions, same-evaluation fault propagation, two-evaluation recovery, mode/brake composition, bidirectional trace coverage, source gates, bounded analyzer, and scenario witnesses stated in the System Abstract.

DS-QUESTION-01: Can four previous-level epoch owners and four higher-level state owners be expressed with local GUMBO contracts while every downstream decision consumes owner facts rather than raw inputs?

DS-QUESTION-02: Can the recovery decision and post-state pipeline deterministically clear the degraded episode, restage demand, select `Standby`, and publish `(Standby, Apply)` in one confirmation evaluation without a forbidden combinational cycle?

DS-QUESTION-03: Can thirteen semantic usages and thirty-five end-to-end meanings be realized under one explicit root at depth `1..2`, with any concrete delegation refinement uncredited and PART-13's two-input composition preserved?

DS-DISP-01: The initial design passes Designer review. The Model Agent shall answer the three realizability questions explicitly and return any negative answer as a localized blocker rather than silently changing boundary, ownership, count, priority, fault timing, recovery, composition, or diversity.

