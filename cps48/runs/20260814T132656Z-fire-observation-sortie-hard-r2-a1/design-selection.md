# Approved Design Selection — Power-and-Propulsion Availability Supervisor

## Decision framing

SEL-NEED-01: The frozen seed supplies a reusable vocabulary and five candidate scopes but intentionally leaves exact boundary, policy, state, interfaces, and architecture open. This decision selects one coherent hard-tier system without treating optional vocabulary as source behavior.

SEL-CRIT-01: Selection criteria are direct grounding in the assigned source, a primary controlled purpose allowed by the diversity card, capacity for 13 genuine semantic owners and 22..35 distinct interactions, finite analyzable partitions, explicit priority/fault/recovery/composition behavior, and avoidance of unsupported physical-performance or mission claims.

SEL-CONST-01: The selected system may use named battery, charger, power management, drone control, four engines, and alternating propeller kinds as vocabulary. It may not infer battery physics, propulsion sufficiency, redundancy, controllability, safety, observation success, or mission authority.

## Comparison of the seed's five candidate scopes

SEL-SCOPE-01: Battery-status assessment most directly matches the source's one described action and would make a compact small or medium system. It is not selected for this hard run because expanding one qualitative status flow to 13 behaviorally distinct owners would either import unsupported battery physics or create admission/translation layers with weak independent responsibility.

SEL-SCOPE-02: Observation-sortie eligibility is not selected because the accepted replicate-1 Small and Hard systems already control that purpose and the diversity card prohibits another governor or elaborated composition. Its navigation, observation, communications, obstacle, and request boundary would also organize the design around the prohibited outcome.

SEL-SCOPE-03: Observation and communication coordination is not selected because replicate-1 Medium already controls observation acquisition and radio delivery, and the seed supplies no observation-data, delivery, retry, or communications-performance semantics.

SEL-SCOPE-04: Navigation-and-obstacle-awareness supervision satisfies the diversity card and could support independent GPS, inertial, barometric, and obstacle-evidence owners. It is rejected here because selecting a useful controlled output without drifting into unsupported navigation-accuracy, trajectory, or collision-avoidance claims requires a narrower availability-report abstraction than the power/propulsion option.

SEL-SCOPE-05: Power-and-propulsion availability is selected. The seed directly names the selected battery, charger, power-management module, four engines, and their alternating propeller-kind structure, and expressly permits an enable/disable interpretation as downstream design. A finite evidence-admission and command-interlock policy can exercise hard-tier state, priority, fault, recovery, and composition obligations without claiming physical sufficiency.

## Responsibility-allocation alternatives within the selected scope

SEL-ALLOC-01: A centralized supervisor receiving all raw evidence, demand, and feedback was rejected. It would concentrate every meaningful decision and leave surrounding usages as forwarding adapters, contrary to the owner-credit rule and the required multiple state/decision owners.

SEL-ALLOC-02: Four per-engine assessors plus a battery assessor and one central availability controller was rejected. The four engine assessors would repeat an identical single-input rule primarily to increase usage count, while configuration, demand, recovery, and command sequencing would remain overly centralized.

SEL-ALLOC-03: The selected allocation separates battery admission from qualitative analysis; power management; odd-position and even-position engine groups; structural configuration; propulsion composition; charging interlock; demand lifecycle; fault/action priority; recovery; availability; and command interlock. Each boundary exists because its facts change for a different reason, and each owner has a nonidentity behavioral trace.

SEL-ALLOC-04: A three-cluster allocation grouping energy/charging, all propulsion evidence, and control/recovery was rejected. Although cohesive at medium scale, it hides the two-stage battery action explicitly present in the seed and places demand, priority, recovery, availability, and command state in one control cluster, weakening hard-tier ownership evidence.

## Selected trade and exact architecture

SEL-TRADE-01: Engines 1 and 3 and engines 2 and 4 are assessed as two named position groups, not as claimed redundant channels. This provides two joint evidence facts without four repetitive one-engine wrappers; structural count and alternating-kind concordance remain a separate PART-06 responsibility.

SEL-TRADE-02: Battery admission is separate from qualitative analysis because validity/freshness acceptance and capacity-policy classification are different derived facts. The admission owner carries qualitative status uncredited, while the analyzer must combine it with admission and collapse several inputs into readiness causes.

SEL-TRADE-03: Assessments reach both the fault/action resolver and the availability owner. The first path owns cross-domain cause/event priority and immediate inhibit; the second supports a compositional availability guarantee without reading raw evidence or trusting one central recomputation.

SEL-TRADE-04: Demand, recovery, and command-cycle state are intentionally independent. Demand answers whether drone control currently asks for enablement; recovery answers whether a cleared fault has been acknowledged; command state distinguishes first enable from held enable and confirmed enablement.

SEL-POLICY-01: Global fault reporting priority is charger, power management, battery, odd engine group, even engine group, then configuration. Action priority is active fault, disable, recovery acknowledgment, fresh enable, then hold. These choices provide deterministic reporting and fail-closed behavior only; they are not physical severity claims.

SEL-RECOVERY-01: Any active fault immediately clears demand and disables command. Fault clearance moves recovery to awaiting acknowledgment; acknowledgment opens recovery but does not recreate demand. A new enable request is mandatory after recovery, deliberately avoiding automatic restoration of a pre-fault control intent.

SEL-METRIC-01: The exact final semantic inventory is `13/33/29/10`: 13 semantic usages, 33 semantic interactions, 29 named nontrivial contract cases, and 10 scenario families, within hard-tier bounds `13..16/22..35/21..30/9..12`.

SEL-SUPPORT-01: The authorized physical mapping is one root System containing one behavior-free generated-support Process, with 13 sibling semantic Threads at depth two. Ten unique root quantities map through ten System-to-Process boundary segments and eleven Process-to-Thread boundary segments because `actuationFeedback` fans out to PART-09 and PART-13. Together with 22 sibling-Thread segments, this produces 14 reachable non-root usages, exactly 21 uncredited generated-support boundary segments, and exactly 43 raw `PortConnection` declarations without duplicate endpoint pairs or route padding.

## Diversity determination against replicate 1

SEL-DIV-01: The closest baseline is the accepted replicate-1 Hard `Observation-Sortie Eligibility Supervisor`. That system accepts observation-related equipment evidence and an observation request, controls `WITHHOLD | PERMIT`, retains request/recovery/release state, and may release a retained pending request after recovery.

SEL-DIV-02: The selected system is not an extension or repartition of that baseline. It excludes observation, sortie, navigation, radio, camera, obstacle, and permission semantics from its policy and instead controls a sequenced propulsion-power command using battery admission, power-management, charger, explicit engine-group/configuration evidence, enable demand, and actuation acknowledgment.

SEL-DIV-03: Boundary differs because the selected inputs add charger coupling and command acknowledgment while removing navigation, radio, camera, obstacle, and observation-request evidence; outputs are a three-valued power command plus power/propulsion availability report rather than sortie permission/status.

SEL-DIV-04: State ownership and topology differ because the three state owners are demand lifecycle, recovery qualification, and command interlock, connected to a battery two-stage chain and an engine-group/configuration composition fan-in. The baseline's request lifecycle, one-shot permission ledger, and limiting-cause refinement topology are absent.

SEL-DIV-05: Priority and recovery differ because charger-first power-context priority and feedback-aware command interlocking replace observation-equipment/request-release priority, and a fault destroys demand so recovery requires acknowledgment plus a fresh request. The baseline can retain a pending request through quarantine and release it after acknowledgment; this system explicitly cannot.

## Contract, analysis, and acceptance rationale

SEL-CONTRACT-01: The 29 cases are responsibility-driven rather than count padding: sixteen local ready/complement partitions across eight assessors, three demand-state cases, five fault/action-priority cases, three recovery cases, and two availability cases. PART-13 has a separately named full transition relation rather than artificial extra CASE labels.

SEL-CONTRACT-02: Every owner relation must be total, disjoint, deterministic, and nonidentity on its admitted finite domain. The analyzer must distinguish producer-reachable tuples from structurally expressible inconsistencies, show priority and state witnesses, and execute actual owner relations rather than duplicate them centrally.

SEL-ANALYSIS-01: Local exhaustive domains are bounded and factorable: raw sizes `16,16,64,64,36,16`; qualified-battery size 12; propulsion-product size 125; demand-state size 45; and recovery-state size 105. Downstream analysis operates over owner outputs and need not claim exhaustive physical behavior.

SEL-ANALYSIS-02: Acceptance requires all 29 cases and 10 scenarios reached, zero unexpected gaps/overlaps/mismatches/invariant violations, exact structural counts, explicit fault/priority/recovery/composition and first-versus-held-command witnesses, successful analyzer exit, and evidence bound to final source.

SEL-VERIFY-01: Architecture/final Sireum-HAMR typechecking, trace/metric inspection, contract inspection, and bounded analysis are verification of the generated specification. Designer review of purpose, boundary, assumptions, and scenario fitness is separate validation.

## Resolved Model findings and realization boundaries

SEL-QMODEL-01: Accept the Model's physical-accounting correction. The single root and Process `ActuationFeedback` input shall fan out through distinct Process-to-Thread declarations to PART-09 and PART-13, preserving INT-12 and INT-19 within the exact `13/33/29/10` semantic tuple and the corrected `21/43` support/raw inventory.

SEL-QMODEL-02: Accept the state mapping with a semantic limitation: PART-09 publishes pre-state demand independently of the returning directive, and PART-11/PART-13 guard on owner-local `In(state)` while constraining their post-state. This is a non-executable synchronous contract relation, not a scheduler, latency, or execution claim, and it adds no state owner.

SEL-QMODEL-03: Accept direct-attribute finite records and factorized analysis as generation obligations. Owner evidence shall execute separately named PART-01 through PART-13 relations in INT dependency order and retain domain, fiber, case, priority, nonidentity, and producer-unreachable evidence; the independent boundary oracle may compare only CTRL outputs and may not confer owner credit or advance proof.

## Final decision and deferred claims

SEL-DECISION-01: Approve the federated 13-owner power-and-propulsion availability architecture and authorize Model generation against the final `system-abstract.md` and `design-selection.md`. The exact final semantic metrics are 13 usages, 33 interactions, 29 nontrivial contract cases, and 10 scenario families; the physical mapping is exactly one root System, one behavior-free Process, 13 sibling Threads, 14 reachable non-root usages, depth two, 21 generated-support boundary segments, and 43 raw connections.

SEL-DEFER-01: Battery physics, endurance, charging performance, electrical behavior, thrust, controllability, redundancy, flight dynamics, navigation, obstacle response, observation, communications, landing, fire analysis, mission authority, safety, certification, and production readiness remain excluded.

SEL-DEFER-02: Code generation, application implementation, execution, scheduling, deployment, physical integration, formal semantic proof, probabilistic reliability, quantitative severity/likelihood, and environmental or hardware validation remain not-run and cannot be inferred from typechecking or bounded analysis.
