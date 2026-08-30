# Approved design selection

DEC-SCOPE-01: This decision selects a logical responsibility allocation for a hard-tier threat-response system; it does not select SysML syntax, execution scheduling, deployment, algorithms, physical performance, or proof mechanisms.

## Diversity constraint and decision drivers

DEC-DIV-01: The frozen replicate-2 card requires a primary controlled purpose narrower than the accepted replicate-1 combined mining-threat-retreat supervisors and prohibits another mining-versus-defense/retreat or five-way mission/action governor.

DEC-CRIT-01: Boundary fitness requires threat evidence, reporting, defense activation, and retreat-oriented departure inside, with mining represented only by an externally owned equipment-safe interlock and cargo/service absent.

DEC-CRIT-02: Ownership fitness requires separate meaningful derivations for qualification, alert state, each protective channel state, each readiness fact, each proposal, response-pattern coordination, and PART-15's four-way response stage; frame preservation, one-to-one directive mapping, construction, and fan-out remain required composition coherence but are not independent owner facts.

DEC-CRIT-03: Fault and recovery fitness requires invalid evidence to inhibit both channels, a failure to isolate only its affected channel, and independent reset-probation-confirmation-later-enable recovery without cross-clearing.

DEC-CRIT-04: Priority fitness requires confirmed-hostility departure to remain the primary response whenever feasible, while the independent defense directive may remain concurrently active instead of forcing a single mission action.

DEC-CRIT-05: Composition fitness requires one same-evaluation response frame to carry report, orthogonal directives, response stage, and both actual channel states to all consumers.

DEC-CRIT-06: Campaign compliance requires 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial contract cases, 9..12 scenario families, multiple genuine owners, and explicit priority, fault-propagation, recovery, and composition obligations.

## Seed-level scope alternatives

DEC-SCOPE-ALT-01: The seed's frigate-threat-response scope is selected because it directly serves the security and threat-response viewpoints while the diversity card permits mining, cargo, and service to remain external context.

DEC-SCOPE-ALT-02: The seed's mining-and-cargo-control scope is feasible but rejected for this run because it would place threat response and defense outside the boundary and would not exercise the selected security, evidence-validity, and partial protective-channel concerns.

DEC-SCOPE-ALT-03: The seed's navigation-and-turnaround-control scope is feasible but rejected for this run because its controlled purpose would be destination, docking, offload, and resupply progression rather than threat reporting and protective response.

DEC-SCOPE-ALT-04: The seed's threat-aware-mining and mission-level-frigate scopes are rejected by the frozen diversity card because both can reconstruct the replicate-1 combined mining-versus-defense/retreat or five-way mission governor.

## Alternatives considered

DEC-ALT-01: Alternative A, the selected evidence-led dual-channel design, separates threat qualification and retained alert from independent defense and departure recovery/readiness/proposal branches, then combines the two proposals and composes one response frame.

DEC-ALT-02: Alternative A supports partial degradation, concurrent defense and departure, local ownership evidence, fresh-request recovery, and direct tracing from invalid evidence or a channel failure to the public frame.

DEC-ALT-03: Alternative B uses one centralized threat-response supervisor with one global recovery state and a strict choice among observe, defend, and retreat.

DEC-ALT-04: Alternative B is smaller and makes one priority relation easy to inspect, but it prevents independent channel recovery, converts concurrent protection into a single selected action, and is structurally too close to the replicate-1 global arbiter and recovery topology.

DEC-ALT-05: Alternative C separates evidence reporting from a protective-action controller but lets the latter own both channel readiness, both proposals, coordination, and recovery.

DEC-ALT-06: Alternative C keeps reporting independent but concentrates nearly every consequential decision and both state transitions in one owner; additional wrappers would be needed to meet the hard multiple-owner requirement and would violate the no-padding rule.

## Selection and rationale

DEC-SEL-01: Alternative A is selected for the approved final System Abstract and authorizes Model generation in this retained run.

DEC-RAT-01: Its 15 usages each has a distinct responsibility: five originate or consume boundary context, while ten derive evidence qualification, retained alert, two state/gate transitions, two readiness facts, two proposals, a many-to-one response pattern, or a four-way response stage. PART-15's report/pattern/state preservation, one-to-one directive mappings, record construction, and fan-out are mandatory coherence work but provide no additional usage or owner credit.

DEC-RAT-02: Its 32 interactions are justified by direct typed dependencies, actual-next-state fan-out, independent authorization and context inputs, proposal composition, and delivery of the complete frame to three distinct consumers.

DEC-RAT-03: Its exact 29-case partition covers qualification, alert escalation/de-escalation, independent fault/recovery, orthogonal proposal decisions, many-to-one response priority, and public-frame staging without crediting equations, mappings, constructors, or initialization as cases.

DEC-RAT-04: Its 12 scenario families cover all four proposal combinations, invalid evidence, both partial-failure directions, both independent recovery traces, the mining interlock, and retained-alert de-escalation.

## Comparison with the closest accepted baseline

DEC-BASE-01: The closest baseline is the accepted replicate-1 Hard system, `Mining-frigate threat, retreat, and service supervision`, which combines mining, defense, retreat, service, hold, recovery, mission-mode derivation, and one selected action/cause under a common supervisor.

DEC-DIFF-01: Boundary differs: the selected system excludes mining action, cargo, docking service, offload, and resupply, observes only a mining equipment interlock, and controls threat report plus defense/departure directives rather than a five-way mission result.

DEC-DIFF-02: State ownership differs: the selected system has retained alert plus two independent protective-channel owners, whereas the closest baseline organizes policy around one global recovery owner and a derived mission mode.

DEC-DIFF-03: Interaction topology differs: the selected system has two parallel recovery-readiness-proposal branches joined by proposal composition and one frame composer, rather than three mission eligibility branches feeding a single action arbiter.

DEC-DIFF-04: Priority policy differs: departure is never suppressed when proposed and may coexist with an active defense directive; no emergency/retreat/defense/service/mining/hold first-match sequence exists.

DEC-DIFF-05: Recovery policy differs: failures isolate and recover defense and escape independently through reset, probation, later confirmation, and still-later enable, while the unaffected channel may continue; there is no shared latched/recovering mission state cleared by a successful hold.

DEC-NOT-RENAME-01: This is not an extension or renaming of the closest baseline because removing productive and station actions changes the controlled purpose and boundary, while orthogonal command outputs, partial degradation, independent state owners, concurrent defense during departure, and channel-local recovery change the policy relation and causal graph rather than relabeling its nodes or modes.

## Exact retained counts and obligations

DEC-COUNT-01: Exactly 15 semantic usages, PART-01 through PART-15, satisfy the declared 13..16 bound.

DEC-COUNT-02: Exactly 32 typed directed semantic interactions, INT-01 through INT-32, satisfy the declared 22..35 bound after complete recount.

DEC-COUNT-03: Exactly 29 nontrivial contract cases, CASE-01 through CASE-29, satisfy the declared 21..30 bound; readiness equations, mappings, initialization, and frame construction receive no case credit.

DEC-COUNT-04: Exactly 12 scenario families, SCN-01 through SCN-12, satisfy the declared 9..12 bound.

DEC-OBL-01: Multiple-owner evidence requires canonical local relations for PART-06 through PART-14 plus PART-15's four-way response-stage relation, with distinct state storage for PART-07, PART-08, and PART-09; PART-15 receives owner credit only for stage classification.

DEC-OBL-02: Priority evidence requires every proposal pair to satisfy CASE-23 through CASE-25, both departure-containing pairs to collapse to the many-to-one primary departure fact, and concurrent defense to remain independently visible.

DEC-OBL-03: Fault-propagation evidence requires invalid threat validity to isolate both channels and yield the exact evidence-fault frame, while a single executor failure affects only its own branch and remains visible as degradation.

DEC-OBL-04: Recovery evidence requires independent trigger-dominant reset, probation, later confirmation, and still-later fresh enable traces with no stale event or cross-channel clearing.

DEC-OBL-05: Composition evidence requires PART-15 to derive the four-way response stage from declared owner outputs, preserve the owner-derived report, pattern, and channel states, map proposals one-to-one to directives, and fan out the identical complete frame without raw-input recomputation or partial publication; only stage derivation is credited as an owner-local fact.

## Assumption and claim control

DEC-BASIS-01: Source-grounded vocabulary is limited to the facts named by BASIS-01; every finite type, transition, priority, recovery rule, and success criterion is recorded as a downstream pilot or architecture selection.

DEC-GUARD-01: A generated design that adds cargo, service, mining selection, a general action enum, a mission phase, or a combined five-way arbiter violates the selected boundary even if its graph counts pass.

DEC-GUARD-02: A generated design that centralizes the two channel states, readiness facts, proposals, or alert transition while leaving nominal owner usages as forwarders violates ownership and is Alternative C with padding.

DEC-GUARD-03: Tool compatibility may influence only generated support allowed by SUPPORT-01 and SUPPORT-02; changing any finite domain, case, scenario, owner, interaction, or exact count requires a new Designer resolution.

DEC-DEFER-01: Physical performance, threat truth or defeat, route safety, survivability, timing, probability, certification, and production claims remain excluded.

DEC-DEFER-02: Application execution, code generation, formal proof, and correctness claims beyond the explicitly retained checks remain not run.

## Final verification envelope

DEC-LOCAL-01: Local-contract evidence shall expose and check the exact relations of PART-06 through PART-14 and PART-15's stage classification; PART-08 and PART-09 shall own distinct state and gate relations, downstream owners shall consume declared outputs, and no central analyzer or composer may substitute for absent local contracts.

DEC-LOCAL-02: PART-15 shall consume only INT-24 through INT-29, including PART-07's report rather than undeclared PART-06 validity; its preservation, one-to-one mappings, frame construction, and fan-out remain required but uncredited.

DEC-ANALYSIS-01: Bounded end-to-end analysis shall exhaust exactly `6*3*3*2*2*2*4*2*2*4*2*3*3*3 = 1,492,992` valuations and compare qualification, alert/report, both state/gate branches, readiness, proposals, pattern, directives, stage, and the complete frame with all 29 cases and 12 scenario families.

DEC-ANALYSIS-02: Analysis passes only with zero gaps, overlaps, owner mismatches, cross-channel interference, readiness/proposal/pattern/composition mismatches, stale-request recoveries, frame mismatches, and scenario failures, under the independent 180-second source-bound watchdog.

DEC-SUPPORT-01: Generated support may include one behavior-free containment element if required, finite type declarations, record constructors, helper predicates, initialization support, and root exposure of the complete frame; none receives semantic usage, semantic interaction, owner, or case credit.

DEC-SUPPORT-02: Generated support may not add partial public outputs, duplicate inputs, semantic routing usages, state or decision ownership, reconstructed owner relations, changed finite domains, or any semantic usage, interaction, case, or scenario beyond the exact retained inventories.

DEC-DEFER-03: Application execution, code generation, formal proof, and correctness beyond retained typechecking, local-contract inspection, bounded analysis, trace analysis, visualization evidence, and later Designer fitness review remain deferred; the abstract retains `executable_profile: false`.

## Audit and disposition

DEC-AUDIT-01: The ownership audit identifies three state owners, four proposal/coordination decision owners, one qualification owner, two readiness owners, and one stage-decision/composition usage; PART-15 is credited only for its nonidentity four-way stage classification, and no credited owner is an identity map, one-to-one rename, raw-field bundle, constructor, or router.

DEC-AUDIT-02: The finite audit closes invalid and valid evidence, all previous alert states, all previous channel states, trigger-dominant failures, reset, probation confirmation, later fresh enable, all proposal pairs, and every public response stage.

DEC-AUDIT-03: The interaction recount is exactly 32 after including the three complete-frame consumer fan-outs and excluding root exposure, type declarations, helpers, constructors, and any generated containment support.

DEC-MODEL-01: The Model review established that trusted local GUMBO state, actual-next-state outputs, and same-evaluation downstream composition can realize PART-07 through PART-09 independently without semantic centralization.

DEC-MODEL-02: The Model review established that one flat record-valued response-frame producer can fan out directly to three consumers as INT-30 through INT-32 without partial boundary outputs or a routing-only semantic usage.

DEC-MODEL-03: The Model review established that exhaustive checking of exactly 1,492,992 valuations is feasible within the 180-second watchdog; deterministic precomputed owner-local tables or streaming remain allowable only if every valuation and all ownership and end-to-end checks are preserved.

DEC-STATUS-01: `approved` — the final selection is source-bounded, diversity-compliant, implementation-independent, within every hard-tier bound, completely partitioned, corrected for the two localized Model findings, and authorized for Model generation in this retained run.
