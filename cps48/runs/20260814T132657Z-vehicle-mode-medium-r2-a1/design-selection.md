# Approved Design Selection — Vehicle Controller Operating-Mode Coordinator

## Selection basis

DS-BASIS-01: The frozen seed offers several reusable supervisory scopes but leaves purpose, finite boundary, ownership, priority, transition, and recovery policy to the Designer. The replicate-2 diversity card excludes temperature/health supervision, start readiness, protected start, and power enablement as primary purposes.

DS-CRIT-01: A candidate must have one coherent controlled purpose, remain implementation-independent, expose a complete finite policy, fit the medium bounds, include at least two cooperating decision or qualification owners, contain an explicit priority conflict, and give every usage, interaction, case, and scenario a distinct responsibility or trace.

DS-CRIT-02: Selection favors source-recognizable vocabulary with low unsupported physical claim burden, state ownership that cannot be replaced by identity adapters, a closed fresh-request and recovery policy, one weak semantic region, objective owner-local contract evidence, and bounded end-to-end analysis. Numeric proximity to a tier limit is not a benefit.

DS-DIV-01: A viable replicate-2 design must have a different primary controlled purpose from the closest replicate-1 `Vehicle Start-Readiness and Recovery Supervisor` and differ genuinely in at least two of boundary, state ownership, interaction topology, priority policy, and recovery policy.

## Comparison of all seed candidate scopes

DS-SCOPE-01: A vehicle operating-mode supervisor can coordinate start, on, off, maintenance, degraded, and return-to-normal indications without deciding readiness or physical power. It provides the strongest match to the diversity preference and was selected in the narrower controller-boundary form.

DS-SCOPE-02: A controller-mode coordinator places the VehicleController inside the selected supervisory boundary and the Vehicle indications outside it. It creates a distinct controlled question—what logical operating mode is selected now—and supports observable maintenance handoff, degraded interruption, and recovery-target memory. This is the selected scope.

DS-SCOPE-03: A temperature and health supervisor would center temperature, over-maximum, maintenance, degraded, and return-to-normal evidence. It is coherent but prohibited by the replicate-2 diversity card and would reconstruct a replicate-1 qualification domain.

DS-SCOPE-04: A start-readiness supervisor would combine brake-pedal, self-test, and start vocabulary. It is the closest replicate-1 baseline and is prohibited because changing its names or redistributing its qualifications would not create a different controlled purpose.

DS-SCOPE-05: A vehicle power-enablement supervisor would control electrical-power, power-provision, or fuel-command outcomes. The diversity card prohibits another power-enablement supervisor, and the seed's electrical-power analysis is empty, so it would carry a larger unsupported causal claim burden.

DS-SCOPE-06: Parking-brake supervisory coordination was considered as the other diversity-preferred family. It could make brake application the primary output with start and power as context, but the seed does not define action completion or brake feedback, so a medium design would need more Designer-invented physical policy than logical operating-mode coordination.

## Responsibility-allocation alternatives and Model-review correction

DS-ALT-01: Alternative A places indication freshness, condition classification, priority, transition applicability, mode state, recovery, and publication in one coordinator surrounded by input and output adapters. It minimizes internal flows but has only one genuine decision owner; the adapters would be count padding and the medium cooperating-owner requirement would fail.

DS-ALT-02: Alternative B uses separate lifecycle-event, service-event, and condition-assessment owners feeding an intent arbiter; a recovery-target owner and mode-state owner supply distinct state; a transition-qualification owner classifies applicability; the mode-state owner applies qualified directives; and a publication owner derives diagnostic precedence and output coherence. This allocation yields eight genuine usages and sixteen typed interactions with each policy derived once.

DS-ALT-03: Alternative C gives `Off`, `Starting`, `On`, `Maintenance`, and `Degraded` independent mode handlers that each inspect all boundary inputs and propose a successor to a reconciler. It makes per-mode reasoning visible but duplicates freshness, condition, and priority policy five times and creates a reconciler only to resolve self-created disagreement.

DS-COMP-01: Alternative A is structurally compact but behaviorally centralized and cannot meet the owner requirement without wrappers. Alternative C distributes structure but not unique responsibility and multiplies consistency obligations. Revised Alternative B separates temporal facts, evidence qualification, cross-domain priority, recovery memory, applicability, state-dependent transition application, state retention, and observable publication without central recomputation.

DS-REVIEW-01: The Model correctly found that the initial PART-07 merely copied PART-06's complete next mode into retained state and could not receive owner or semantic-usage credit. The approved correction preserves PART-06's twenty-case applicability partition but changes its result to a finite `QualifiedTransition` directive; PART-07 combines that directive with its own pre-state mode and PART-05's pre-update recovery target to derive the applied `TransitionResolution` and sole mode commit.

DS-REVIEW-02: The correction is deliberately narrower than a behavioral redesign. It changes only the PART-06/PART-07 allocation and the endpoints or payloads of INT-09, INT-10, INT-12, INT-13, and INT-15; it changes no root boundary, priority predicate, case guard, acceptance meaning, scenario outcome, recovery rule, output policy, or deferred claim.

## Approved direction and exact campaign point

DS-DEC-01: Revised Alternative B is approved at exactly `8 semantic usages / 16 semantic interactions / 20 nontrivial cases / 8 scenario families`, within the medium ranges `8..12 / 15..21 / 12..20 / 6..9`.

DS-DEC-02: The primary controlled purpose is logical VehicleController operating-mode coordination. The root observes lifecycle levels, service levels, and currency-tagged controller condition; it controls a logical mode disposition and a parking-brake/status coordination outcome.

DS-DEC-03: Lifecycle Event and Service Event own independent rising-edge histories; Condition Assessment owns the two-field evidence qualification; Intent Arbitration owns explicit cross-domain priority; Recovery Target owns interruption memory; Transition Qualification owns intent/mode applicability directives; Mode Transition Application owns state-dependent resolution and controller-mode state; Coordination Publication owns diagnostic precedence and output coherence.

DS-DEC-04: The explicit priority is `OFF > invalid condition > degraded condition > MAINTENANCE > RETURN > ON > START > HOLD`. A lower-priority fresh event is consumed in its originating edge owner even when it loses, so replay requires a later low-to-high episode.

DS-DEC-05: `Off -> Starting -> On` requires separate fresh indications. Maintenance can be entered from any non-degraded mode and exits to `Off`. Degradation captures `Off`, `Starting`, or `On` as a recovery target; maintenance maps to `Off`; a fresh return under current-normal evidence directly resumes that stored logical target.

DS-DEC-06: The design makes no start authorization, readiness, health-clearance, power-enablement, physical-brake-success, timing, scheduling, or execution claim. Temperature, maintenance completion, self-test, electrical power, fuel, drivetrain, road dynamics, reliability, safety classification, certification, and production suitability are outside the modeled boundary or explicitly `not-run`.

## Exact count, partition, ownership, and topology audit

DS-COUNT-01: PART-01 through PART-08 are exactly eight responsibility-bearing semantic usages. The explicit root, context actors, data types, ports, behavior-free Process, and tool-required routing receive no semantic-usage credit.

DS-COUNT-02: INT-01 through INT-16 are exactly sixteen typed directed semantic interactions: three root observations, eleven inter-owner flows, and two root outcomes. Delegation refinements never increase this inventory.

DS-COUNT-03: CASE-01 through CASE-20 are exactly twenty nontrivial owner-local cases: eight exhaustive priority cases in PART-04 and twelve exhaustive selected-intent/current-mode qualification cases in PART-06. PART-07's total application relation, initialization, mappings, edge equations, state updates, invariants, output rules, and analyzer logic are mandatory but uncounted.

DS-COUNT-04: SCN-01 through SCN-08 are exactly eight distinct scenario families covering nominal two-step lifecycle, lifecycle collision, shutdown dominance, degraded resume, unusable-evidence recovery blocking, maintenance handoff, degraded maintenance rejection, and inapplicable/hold freshness.

DS-OWN-01: PART-04, PART-06, and PART-07 are cooperating arbitration, qualification, and application owners. PART-01 through PART-03 supply nonidentity temporal or qualification facts, PART-05 owns distinct recovery state, and PART-08 derives a multi-input diagnostic fact rather than merely packaging outputs.

DS-OWN-02: No usage is credited for a one-to-one enum translation, copying, renaming, bundling, state forwarding, or routing. No downstream owner may inspect raw inputs to reproduce an upstream edge, qualification, or arbitration result, and the bounded analyzer must check rather than replace owner-local contracts.

DS-PART-01: CASE-01 through CASE-08 close all combinations through ordered predicates, including off, unusable evidence, degraded evidence, simultaneous fresh service/lifecycle requests, held nonfresh levels, and hold.

DS-PART-02: CASE-09 through CASE-20 close all forty selected-intent/current-mode pairs as directives. Return covers degraded resume, maintenance exit, and rejection elsewhere; on and start each separate their only applicable source mode; maintenance rejects in degraded; off, forced degraded, and hold cover every mode.

DS-STATE-01: Lifecycle history belongs only to PART-01, service history only to PART-02, recovery target only to PART-05, and controller mode only to PART-07. PART-06 consumes pre-mode and retains no state; PART-07 applies but does not requalify its directive; PART-05 does not reproduce application policy.

DS-TOPO-01: INT-09 is PART-05 to PART-07 carrying pre-update recovery target; INT-10 is PART-06 to PART-07 carrying the directive; INT-12 and INT-13 originate at PART-07 and carry the applied resolution; INT-15 originates at PART-07 and carries applied next mode. INT-07, INT-08, INT-11, INT-14, and all other meanings are unchanged.

DS-TOPO-02: The sixteen interactions form one weak semantic region. The feedback among Recovery Target, Transition Qualification, and Mode Transition Application is intentional: pre-state mode and recovery target are published, applicability is qualified, one transition is applied, and state owners then commit distinct updates. This is semantic data ordering, not a physical scheduler or algebraic cycle.

## Local-contract and bounded-analysis obligations

DS-LCON-01: PART-01 shall check all 64 current/previous lifecycle tuples; PART-02 all 16 current/previous service tuples; PART-03 all six evidence values with `1/1/4` assessment fibers; PART-04 its total eight-way priority plus independently derived conflict.

DS-LCON-02: PART-05 shall check capture, map, preserve, and reset behavior without reproducing application; PART-06 shall check all `8 x 5 = 40` intent/mode pairs; PART-07 shall check all `5 x 3 x 8 = 120` current-mode/recovery-target/directive tuples; PART-08 shall check diagnostic precedence and parking-brake equivalence without recomputing upstream policy.

DS-LCON-03: The PART-06/PART-07 composition shall be extensionally identical to the initial twenty-case transition triples: stored-target resume remains exact; rejection in CASE-15, CASE-17, and CASE-19 preserves current mode; accepted hold in CASE-20 preserves current mode; and every go directive selects its named constant mode.

DS-ANALYSIS-01: The independent bounded analyzer shall execute the full `8 x 4 x 6 x 8 x 4 x 3 x 5 = 92,160` raw single-evaluation valuation product, establish reachable-state closure, directly evaluate every owner relation, witness all twenty cases and eight scenario families, and check required multi-step freshness and recovery traces.

DS-ANALYSIS-02: Acceptance requires matching metrics and ownership records, all owner checks passed, zero gaps, overlaps, or mismatches, coherent outputs, equivalence to an independent end-to-end oracle, `status=passed`, and completion within the retained 180-second watchdog. Listing owners or duplicating a centralized transition oracle is insufficient.

## Generated-support allowance

DS-SUPPORT-01: The approved realization mapping is one explicit root `System` containing one behavior-free `@generated-support` `Process`, which contains the eight contract-bearing `Thread` usages. Semantic depth is exactly two, with one uncredited support usage and nine non-root source usages.

DS-SUPPORT-02: Exactly five root/Process delegation routes may refine the three root inputs and two root outputs. Alongside the sixteen Process-local semantic connections, this permits exactly twenty-one raw `PortConnection` declarations. Each support route must carry its refined INT trace and a specific rationale and receives no semantic usage, interaction, owner, case, or scenario credit.

DS-SUPPORT-03: Every record field inspected by GUMBO shall be an `attribute` member. Pre-state publication using `In(state)` and a separate post-state constraint are permitted profile mappings; they do not authorize an additional semantic interaction, scheduler, latency, executable application, or claim change.

## Diversity comparison with the closest replicate-1 baseline

DS-DIFF-01: The closest baseline is the replicate-1 medium `Vehicle Start-Readiness and Recovery Supervisor`, whose primary question is whether a fresh start may progress using brake, health, power, and armed self-test qualifications.

DS-DIFF-02: The controlled purpose differs because this design sequences and publishes logical controller modes. It has no start permit, readiness verdict, test initiation, power disposition, or health clearance.

DS-DIFF-03: The boundary differs because this design observes lifecycle levels, service levels, and currency-tagged controller condition, and controls mode plus coordination outcome. It excludes the baseline's brake, thermal/maintenance readiness, power, and self-test observations and its six-field start/power/test frame.

DS-DIFF-04: State ownership and interaction topology differ because this design splits lifecycle and service freshness, gives recovery target its own state owner, and separates applicability directives from state-dependent transition application. The baseline instead fans multiple readiness qualifications and an armed self-test cycle into start authorization and lifecycle/recovery.

DS-DIFF-05: Priority and recovery differ because this design arbitrates maintenance, on confirmation, condition invalidity/degradation, and lifecycle requests in one ordered domain, then directly resumes the stored interrupted logical mode after a fresh return under current-normal evidence. The baseline recovers to `Off` and requires a later fresh start with readiness and test qualification.

DS-DIFF-06: The selected design is not an extension, repartition, or rename: removing readiness, self-test, and power qualification removes the baseline's central decision and outputs, while the new on-confirmation transition, maintenance handoff, independent service freshness, recovery-target state, qualification/application split, and direct logical resume cannot be obtained by renaming baseline elements.

## Final authorization

DS-REAL-01: The Model shall preserve one root, one uncredited support Process, exactly eight semantic usages, sixteen semantic interactions, twenty credited cases, eight scenario families, depth two, one weak semantic region, all finite types, owner-local state and decisions, ordered priority, complete qualification and application relations, recovery-target rules, coherent outputs, bidirectional traces, Sireum/HAMR gates, and the independent bounded analyzer.

DS-REAL-02: No revision may add raw-input recomputation, a forwarding-only owner, a twenty-first case, semantic support credit, an executable claim, or any deferred physical, readiness, health, power, timing, safety, reliability, or certification claim.

DS-DISP-01: The revised design passes Designer review. Model generation is authorized against `system-abstract.md` and this approved selection; any later limitation shall return as a localized repair request in the same immutable run rather than alter the seed, weaken policy, or start a replacement attempt.
