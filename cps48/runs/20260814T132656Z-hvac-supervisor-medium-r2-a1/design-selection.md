---
decision_id: DESIGN-HVAC-AIR-02
run_id: 20260814T132656Z-hvac-supervisor-medium-r2-a1
domain_seed: 20260813T233941Z-hvac-supervisor-seed-v1
selected_scope_alternative: SCOPE-ALT-03
selected_allocation_alternative: ALLOC-ALT-01
status: designer-approved
---

# Approved design selection

## Decision frame and criteria

SEL-NEED-01: The frozen seed permits six single-system scopes but establishes no architecture, finite boundary, command authority, priority, state, fault, or recovery policy. The diversity card further excludes another defrost, thermal/energy, or visibility-priority whole-cabin supervisor and permits cabin air-quality/humidity supervision or preference-acceptance coordination.

SEL-CRIT-01: Alternatives were compared for source fit, compliance with the replicate-2 diversity constraint, one coherent primary controlled purpose, implementation-independent boundary clarity, nonpadded ownership, a genuine medium-tier conflict, finite partition closure, diagnosable recovery, and realizability in the trusted SysML-AADL/GUMBO subset.

SEL-CRIT-02: Structural bounds are constraints rather than scores. A direction gains no preference for maximizing counts, and a usage or interaction that only forwards, copies, renames, bundles, or bijectively translates a value receives no semantic credit.

## Required seed scope alternatives compared

SCOPE-ALT-01: **Cabin-temperature supervisor.** It offers a narrow temperature-setting and heat/cool purpose, but temperature regulation and thermal service were principal replicate-1 material and would violate the diversity card for this run.

SCOPE-ALT-02: **Defrost supervisor.** It offers clear request and visibility policy, but defrost authorization was already a replicate-1 primary scope and is expressly excluded.

SCOPE-ALT-03: **Cabin air-quality and humidity supervisor — selected.** Its boundary can be confined to air-care preference, air quality, humidity, and treatment readiness, with filtration versus drying as a real conflict. It supports two independent proposal owners and bounded recovery without inventing temperature, defrost, or energy allocation.

SCOPE-ALT-04: **User-facing HVAC command coordinator.** It satisfies the card and would center preference acceptance, but its broader temperature/fan/preference vocabulary risks becoming parsing and routing unless downstream outcome ownership is invented. It was retained as plausible but ranked below the selected air-treatment purpose because the selected scope offers stronger condition-to-outcome validation.

SCOPE-ALT-05: **Energy- and interface-aware HVAC supervisor.** It offers eligibility and resource policy but was already principal replicate-1 material and is excluded; the seed also supplies no numeric energy policy.

SCOPE-ALT-06: **Whole-cabin HVAC supervisor.** It could combine every catalog feature but would closely extend the accepted visibility-priority baseline and would make air care one service branch rather than the primary controlled purpose.

SEL-CMP-01: SCOPE-ALT-03 best meets the card while staying source-grounded: it uses the catalog's filtration, humidity, and user-preference vocabulary and labels every validity, category, command, priority, readiness, and recovery rule as a downstream pilot choice.

## Responsibility-allocation alternatives within the selected scope

ALLOC-ALT-01: **Distributed qualification, proposal, recovery, and arbitration — selected.** Four qualification owners derive request, air, humidity, and readiness facts; filtration and humidity owners independently decide treatment applicability; a readiness-recovery owner gates a final arbiter. This gives eight cohesive owners and 21 purposeful interactions without routers.

ALLOC-ALT-02: **Central air-care supervisor with input/output adapters.** One component would classify all observations, manage both states, choose treatment, and form status while adapters normalize or route values. It was rejected because the central owner would recompute nearly all behavior and the adapters would fail semantic-owner credit.

ALLOC-ALT-03: **Independent filtration and humidity controllers issuing plant commands.** Each feature controller would own its condition and actuator request, with a late conflict resolver. It was rejected because two direct command authorities make the plant boundary ambiguous and move filtration-over-drying policy into an implementation-facing merge rather than one accountable system decision.

ALLOC-ALT-04: **Single need assessor followed by policy, recovery, and publisher pipeline.** One assessor would collapse air and humidity into a pre-ranked need before arbitration. It was rejected because the priority decision would occur upstream and erase the independently reviewable defeated proposal and degradation reason.

## Selected architecture rationale

SEL-ARCH-01: Request lifecycle is separated from treatment proposals because freshness and re-arm depend on history while filtration and drying applicability depend on current qualified conditions. PART-01 is therefore a stateful qualifier, not a user-input adapter.

SEL-ARCH-02: Air and humidity observation owners remain separate because the seed names distinct outcomes and validity can degrade independently. PART-02 and PART-03 derive different finite condition facts, and PART-05 and PART-06 combine those facts with request applicability and path readiness.

SEL-ARCH-03: Readiness classification is separated from readiness recovery because current path capability and authorization after an unknown status change for different reasons. PART-04 owns the multi-field classification; PART-07 alone owns the recovery state.

SEL-ARCH-04: PART-08 receives both proposals instead of a pre-ranked bundle so the explicit simultaneous-demand conflict remains visible and analyzable. It solely owns the final command and consistent status, preventing competing plant command authorities.

SEL-STATE-01: PART-01 retains `Released/AcceptedActive/RearmRequired`; PART-07 independently retains `Ready/FaultHeld/AwaitFresh`. Cooperation is explicit: PART-07 may leave `AwaitFresh` only when PART-01 publishes a fresh active intent after a valid release.

SEL-PRIO-01: The selected service policy is `recovery gate > request applicability > actionable filtration > actionable drying > Off`. Its explicit conflict is filtration versus drying under automatic air care, with filtration winning and `AirPriority` reported.

SEL-REC-01: Invalid treatment-readiness status causes a fault hold. Valid readiness moves to `AwaitFresh`; no acknowledgment boundary is added. The active preference must be released with valid `Off` and then newly asserted before treatment resumes.

## Diversity determination

DIV-BASE-01: The closest accepted replicate-1 baseline is the **visibility-priority whole-cabin HVAC supervisor**, because it included a cabin-air proposal branch alongside thermal, visibility, electrical, recovery, and whole-plan composition.

DIV-PURP-01: The selected primary controlled purpose is different: it decides preference-qualified cabin filtration or excess-humidity drying and reports air-care outcomes. It never decides whether visibility, thermal service, energy, or a whole-cabin plan should be authorized.

DIV-BOUND-01: The boundary is genuinely different. It excludes temperature target/relation, glazing condition, defrost request, electrical tier, waste heat, broad equipment feedback, and whole-plan actuation, while admitting a dedicated `Off/Auto/Purge` air-care preference, independent air/humidity validity, and a two-path air-treatment readiness record.

DIV-TOPO-01: The interaction topology is genuinely different. Two treatment-specific proposal branches converge directly on one air-care arbiter and a readiness-only recovery gate. There is no visibility or thermal proposal, service-selection spine, energy-safe composer, critical-cause owner, or atomic whole-cabin publisher.

DIV-PRIO-01: The priority policy is genuinely different. The selected conflict is `filtration > excess-humidity drying`; no visibility observation overrides user `Off`, no defrost priority exists, and no electrical tier reshapes a selected service.

DIV-REC-01: The recovery policy is genuinely different. Only unknown air-treatment readiness triggers the recovery state; there is no external acknowledgment or healthy-pending phase. Recovery authority is obtained through the request owner's valid-release/new-active sequence.

DIV-NOT-01: These differences change the root boundary, control objective, graph branches, arbitration operands, and recovery protocol. Removing the replicate-1 whole-cabin supervisor's other branches would not yield this system: it would still lack the air-care request lifecycle, explicit Purge applicability, independent air/humidity diagnostic continuity, and treatment-specific readiness cross-product.

## Assumptions introduced by selection

SEL-ASM-01: The qualitative observation bands, validity values, Auto/Purge meanings, readiness record, command set, and all mappings are pilot abstractions beyond the source.

SEL-ASM-02: Filtration priority over drying and local continuation under a defeated branch's invalidity or unavailability are deterministic experiment policy, not automotive safety or health guidance.

SEL-ASM-03: Invalid readiness is critical for this supervisor, while a valid unavailable path is local degradation. This classification has no claimed likelihood, severity, diagnostic coverage, or production pedigree.

SEL-ASM-04: The valid-Off/new-active re-arm protocol and current-evaluation pipeline semantics are finite contract choices, not physical time, debounce, scheduling, or interface claims.

## Count and coverage audit

SEL-AUD-01: Exactly eight semantic usages are selected, within `8..12`. Each derives an owner-local state, classification, proposal, recovery, or arbitration fact; no behavior-free support element is credited.

SEL-AUD-02: Exactly 21 typed directed semantic interactions are selected, within `15..21`: seven boundary inputs, twelve internal exchanges, and two boundary outputs. The expected depth-two SysML mapping has 30 raw directed connections after 18 boundary delegations are included.

SEL-AUD-03: Exactly twenty nontrivial cases are selected, within `12..20`: five request, one air, one humidity, two readiness, one filtration proposal, one humidity proposal, five recovery, and four arbitration cases. Every finite owner input space has an ordered, total, mutually exclusive result.

SEL-AUD-04: Exactly seven scenario families are selected, within `6..9`. They cover nominal no-need, two filtration severities, explicit Purge, humidity-only service, simultaneous conflict, local degradation continuity, and multi-evaluation fault/re-arm recovery.

SEL-AUD-05: The required cooperation is structural and behavioral: PART-05 and PART-06 independently decide treatment applicability, PART-07 independently decides recovery eligibility, and PART-08 applies final priority. The explicit conflict and its defeated proposal remain observable to contracts and scenarios.

## Initial disposition and Model review questions

SEL-PASS-01: ALLOC-ALT-01 with SCOPE-ALT-03 passes Designer initial review as the retained medium-tier design. It is coherent, diversity-compliant, implementation-independent, within all declared bounds, and fully partitions current, invalid, recovery, release, fresh, conflict, and residual behavior.

SEL-PASS-02: Model generation shall preserve the exact `8 usages / 21 semantic interactions / 20 cases / 7 scenario families / depth 2 / 30 raw connections / one root / one weak region` tuple and shall expose every credited local owner fact without central recomputation.

SEL-Q-01: **Resolved.** Flat finite equipment-status and supervisor-status records can be represented and inspected in the trusted subset without semantic adapters or a counted-topology change; this run must still pass its own type, contract, and field-inspection gates.

SEL-Q-02: **Resolved.** The two independent pre-state/next-state owners and the six-step recovery witness can be expressed compositionally through local GUMBO contracts and the bounded analyzer while remaining a logical contract model, not an execution or scheduling claim.

## Designer resolution of Model findings

MODEL-FIND-01: **Accepted without narrowing.** The extensional audit establishes a behaviorally meaningful complete relation for each of PART-01 through PART-08: state/history discrimination, validity collapse, many-to-one classification, readiness cross-product classification, multi-input proposal applicability, recovery transition, or ordered arbitration. No credited usage merely copies, bundles, reroutes, or bijectively renames its inputs.

MODEL-FIND-02: **Accepted without narrowing.** The approved mapping is exactly one root System usage containing one behavior-free generated-support Process, which contains eight credited Thread usages. Seven inputs and two outputs require 18 boundary-delegation declarations; twelve internal semantic exchanges require twelve declarations; therefore the exact raw directed connection count is 30 while the semantic interaction count remains 21 and physical containment depth below the root remains two.

MODEL-FIND-03: **Accepted with evidence-boundary clarification.** Existing library and retained-model evidence supports flat attribute-based records, local state, initialization, compute cases, and pre-state references as a generation basis. That precedent authorizes generation but does not count as this model's verification: architecture-stage and final Sireum checks, local-contract inspection, and bounded witnesses remain mandatory for this run.

MODEL-FIND-04: **Accepted without design change.** The ownership-audit and bounded analyzer shall execute the eight owner-local relations and retain witnesses; labels, ports, or nonempty audit fields alone are insufficient. Central analysis may compose and check published facts but shall neither replace nor recompute semantic ownership.

## Approved final baseline and generation authorization

FINAL-METRIC-01: The final architecture is exactly `8 semantic usages / 21 semantic interactions / 20 nontrivial contract cases / 7 scenario families / physical containment depth 2 below one root / 30 raw directed connections / one weakly connected semantic region`. These values remain within the frozen medium bounds of `8..12 / 15..21 / 12..20 / 6..9`.

FINAL-CONTRACT-01: Each of the eight credited usages shall expose its assigned owner-local fact and implement the total, mutually exclusive partition allocated in CASE-RQ-01 through CASE-ARB-04. PART-01 and PART-07 alone retain state; PART-05 and PART-06 remain cooperating proposal owners; PART-08 alone derives the final command/status pair; no central recomputation or identity wrapper receives semantic credit.

FINAL-ANALYSIS-01: Bounded end-to-end analysis shall execute all twenty local cases, all seven scenario families, every priority and diagnostic residual, both recovery gates, and the ordered six-evaluation SCN-REC-01 witness with retained results. It shall confirm exact metrics, connection/type agreement, command/status consistency, one-command exclusivity, filtration-over-drying conflict resolution, local degradation continuity, and valid-Off/new-active reauthorization.

FINAL-SUPPORT-01: Generated support is limited to the behavior-free Process container, type and attribute declarations, root and Process boundary ports, 18 boundary delegations, contract/analyzer scaffolding, trace annotations, and exactly one policy-compliant system-overview view. Such elements receive no semantic usage or interaction credit and require an explicit `@generated-support` rationale when significant.

FINAL-DEFER-01: Plant execution, physical filtration or drying effect, pollutant or humidity thresholds, real thermodynamics, timing and scheduling, deployment, code generation and application execution, exact energy or response performance, comfort or usability, acoustics, safety, regulation, certification, reliability, and production readiness remain deferred or `not-run`; generation and later mechanical success shall not report them as passed.

FINAL-AUTH-01: No System Abstract behavior, boundary, allocation, metric, priority, recovery rule, support allowance, or claim boundary requires revision. The Designer approves the explicit final baselines in `system-abstract.md` and `design-selection.md` and authorizes the Model to generate within them.
