# Approved Design Selection — Observation-Sortie Eligibility Supervisor

## Decision framing

SEL-NEED-01: The frozen seed offers five coherent candidate scopes but leaves their boundaries and policies open. Selection uses only source-supported vocabulary and labels every exact behavior as a downstream pilot choice.

SEL-CRIT-01: Selection criteria are fit to the observation purpose; ability to exercise hard-tier priority, fault propagation, recovery, and composition without invented physics; separability of genuine state and decision owners; finite exhaustive policy coverage; and a boundary that can be represented and traced.

SEL-CONST-01: Named equipment is vocabulary, not evidence of capability, health, sufficiency, successful observation, flight safety, or mission authority.

## Scope alternatives

SEL-SCOPE-01: A battery-status assessment system is closest to the seed's one described action, but expanding it to 13 genuine owners and the required distributed hard-tier behavior would produce unrelated padding or subordinate encoders.

SEL-SCOPE-02: An observation-sortie eligibility supervisor coherently combines selected energy, navigation, communication, sensing, and propulsion evidence while controlling only permission. It supports independent readiness decisions, fault propagation, request priority, stateful recovery, one-shot release, and end-to-end composition without claiming flight performance. This scope remains selected.

SEL-SCOPE-03: An observation-and-communication coordinator was rejected because credible acquisition, delivery, retry, and quality semantics are absent from the seed.

SEL-SCOPE-04: A navigation-and-obstacle-awareness supervisor was rejected because a useful controlled result tends toward expressly unsupported navigation-accuracy or collision-avoidance claims.

SEL-SCOPE-05: A power-and-propulsion availability supervisor was rejected because structural presence of four engines does not establish propulsion sufficiency, redundancy, or controllability.

SEL-SCOPE-06: The selected controlled outcome remains only `WITHHOLD | PERMIT` under an explicit pilot eligibility policy. It is not safety approval, mission authority, or proof of physical capability.

## Responsibility-allocation alternatives

SEL-ALLOC-01: Centralizing evidence, request, fault, recovery, eligibility, release, and status in one supervisor was rejected because adapters would be forwarding usages and local ownership would be unreviewable.

SEL-ALLOC-02: Federating six evidence assessors and separating request lifecycle, fault classification, priority arbitration, recovery qualification, generic eligibility, permission release, and status-cause refinement remains selected. The Model review exposed two local owner-credit defects in the initial allocation; the approved revision repairs them without changing the external policy or campaign counts.

SEL-ALLOC-03: Grouping energy/propulsion, navigation/obstacle, and observation/communication into three clusters was rejected because it obscures which evidence caused rejection and concentrates request, recovery, release, and reporting state.

## Accepted Model-review resolution

SEL-RES-01: The PART-13 finding is accepted. PART-11 now selects only `PERMIT/NONE` or `WITHHOLD/EQUIPMENT|RECOVERY|NO_REQUEST`; PART-13 alone refines `EQUIPMENT` with PART-08's already selected primary cause. Copied status fields are required but uncredited.

SEL-RES-02: The PART-12 locality finding is accepted. INT-35 is rerouted from PART-08 -> PART-11 to PART-07 -> PART-12 carrying the published pre-evaluation request phase. The ledger combines that phase, the eligibility directive, and prior ledger state to retain an unreleased pending request, release once, retain completed-request state, and rearm only at published `IDLE`.

SEL-RES-03: The PART-08 state-owner finding is accepted. PART-08 is a stateless current decision owner mapping 15,360 assessment combinations to seven admissible Fault Summaries. Retained state remains genuinely distributed across PART-07, PART-10, and PART-12.

SEL-RES-04: The pre-state/update finding is accepted. PART-07 publishes `In(requestState)` on INT-26, INT-32, and INT-35 and commits its next state from INT-22 and INT-28. INT-20 carries only the candidate event.

SEL-RES-05: The extensional owner audit is accepted subject to final owner-local evidence. No copy, bundle, one-to-one rename, or route receives semantic or owner credit.

SEL-RES-06: The trusted-language and factorized-analysis mapping is accepted as feasibility evidence, not as final verification. Fresh source typechecking, trace evidence, local enumeration, and end-to-end analysis remain mandatory.

SEL-RES-07: Designer review adds one count-preserving correction required by the frozen cancellation policy: INT-25 also carries PART-09's already accepted directive from PART-10 to PART-11 without credit. CASE-28 through CASE-30 therefore withhold on same-evaluation `CANCEL` or `INHIBIT`; this closes the permit-on-cancel path created by pre-state publication. SCN-01 is clarified to five steps so the post-feedback `RELEASED/WITHHOLD` publication is actually observed.

## Final trade and exact architecture

SEL-TRADE-01: Each readiness result intentionally reaches both PART-08 and PART-11 because fault diagnosis/priority and generic eligibility are distinct decisions. Raw evidence remains local to PART-01 through PART-06.

SEL-TRADE-02: Separating request, recovery, and release state exposes fresh/duplicate submit, cancel, release feedback, quarantine, acknowledgment, recurrent fault, and rearm paths. The generic/detail split makes PART-11 and PART-13 nonoverlapping owners.

SEL-METRIC-01: The exact approved semantic inventory is 13 semantic Thread usages, 35 directed semantic interactions, 30 nontrivial named contract cases, and 10 scenario families: `13/35/30/10`, inside hard bounds `13..16/22..35/21..30/9..12`. There are three retained-state owners, multiple stateless decision owners, one semantic responsibility layer, one root System, and one weakly connected semantic region.

SEL-SUPPORT-01: The exact approved physical allowance is one behavior-free generated-support Process containing the 13 semantic Threads at depth two, 14 reachable non-root usages, 18 uncredited boundary delegations for seven inputs and two outputs, and 53 raw PortConnection declarations comprising 35 semantic connections plus 18 delegations. No other support usage or route is authorized; root, Process, delegations, finite types, trace annotations, source-bound overview, and analyzer scaffolding earn no semantic credit and may add no behavior.

## Local-contract and bounded-analysis expectations

SEL-CONTRACT-01: The six assessors shall exhaustively cover local domains of 16, 256, 16, 16, 16, and 2,048 valuations with the frozen readiness and cause priorities. PART-07 covers 30 state/directive/feedback combinations; PART-08 covers 15,360 assessment tuples; PART-09 covers 28 fault/event tuples; PART-10 covers 105 recovery/fault/directive tuples; PART-11 covers 460,800 assessment/request/gate/directive tuples; PART-12 covers all 24 producer-admissible request/decision/ledger tuples plus identifies inadmissible eligibility tuples; and PART-13 covers 252 individually admissible request/fault/recovery/decision tuples while marking cross-owner inconsistencies unreachable.

SEL-CONTRACT-02: Each local relation shall be total, disjoint, deterministic, and nonidentity on its admitted domain; record gaps, overlaps, producer-reachable and producer-unreachable values, result counts, and bounded witnesses. PART-12 must prove exactly one release transition. PART-13's only credited derivation is generic-to-detailed cause refinement.

SEL-ANALYSIS-01: The analyzer shall factor at the complete 15,360 assessment product, execute owner relations through all 35 semantic flows, and compare both controlled outputs against an independently structured raw-policy reference over representative raw-evidence equivalence classes. Central recomputation of only the root outputs is not ownership evidence.

SEL-ANALYSIS-02: Acceptance requires all 30 cases reached; all 10 multi-step scenario families passed; zero unexpected gaps, overlaps, mismatches, or invariant violations; explicit witnesses for fault propagation, priority, recovery, same-evaluation cancellation inhibition, one-shot release, feedback-delayed request publication, and rearm; successful analyzer exit; and evidence bound to the final source hash.

## Final decision and deferred claims

SEL-DECISION-01: Alternative B as repaired above is the approved final design. Model generation is authorized only against `system-abstract.md` and this file; the initial files remain provenance, not generation authority.

SEL-DEFER-01: Flight dynamics, thrust sufficiency, controllability, redundancy, navigation accuracy, endurance, battery physics, charging, physical timing, sensor truth, obstacle performance, observation quality, radio performance, landing control, return-to-home, fire detection/classification/localization/response, mission authority, operational safety, certification, and production readiness remain excluded.

SEL-DEFER-02: Application code generation, executable simulation, scheduling, deployment bindings, physical integration, formal semantic proof, probabilistic reliability, quantitative severity or likelihood, performance validation, and environmental validation remain not-run. Typechecking and bounded analysis shall not be relabeled as evidence for those claims.

