# Approved Design Selection — Small Station Cargo-Transfer Verification Supervisor

## Decision basis and evidence boundary

DS-BASIS-01: This record compares every candidate system boundary offered by the frozen mining-cargo-docking seed and three plausible allocations for the selected boundary before freezing the initial System Abstract.

DS-BOUND-01: The campaign requires `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, `4..6` scenario families, exactly one principal decision owner, and distinct nominal, boundary, invalid/fault, and recovery traces without padding.

DS-FACT-01: Source-grounded evidence is limited to mining-frigate, pilot or pilot pod, station, warehouse or storage, ore or cargo, docking, transfer, verification, and docked-service vocabulary. The source does not select a finite boundary, policy, validity scheme, state machine, priority, fault interpretation, or recovery rule.

DS-METHOD-01: Selection favors a coherent implementation-independent purpose, observable boundary closure, distinct owner-local responsibilities, one unambiguous policy owner, finite total contracts, bounded verification feasibility, and disciplined separation of logical evidence from physical achievement.

## Comparison of the seed's four scope alternatives

DS-SCOPE-01: **Station cargo-transfer verification is selected.** One offload request, docking admission, ship-side progress, warehouse evidence, a logical transfer command, and verification reporting form a closed supervisory thread with two independent evidence sources. It supports meaningful state, applicability, invalid-input, and recovery behavior while excluding physical cargo motion.

DS-SCOPE-02: **Ore-hold supervision is rejected for this run.** Nearly-full awareness and ore retention are recognizable, but choosing finite capacity boundaries, extraction admission, depletion interaction, and continuation or halt policy would either import the other mining-control scope or make most behavior an unsupported threshold policy.

DS-SCOPE-03: **Docking-service supervision is rejected for this run.** The source names docking and undocking unevenly and does not establish readiness, sequencing, docking status authority, or service-access policy. A small model would be dominated by invented lifecycle semantics or collapse into report routing.

DS-SCOPE-04: **Capacitor and support-system resupply verification is rejected for this run.** The source conflates general ship-status verification and capacitor recharge and supplies no finite sufficiency, completion, or failure semantics. Selecting it would require a broader unsupported energy/readiness policy than cargo evidence coordination.

DS-SCOPE-05: The selected scope does not absorb mining activation, ore-hold control, travel, physical docking, repair, or resupply. Those are separate seed alternatives or excluded vessel concerns, not extensions added to reach the small-tier counts.

## Responsibility-allocation alternatives within the selected scope

DS-ALT-01: **Selected Alternative A — four qualification owners, one stateful decision owner, and two output derivation owners.** Request, docking, ship progress, and warehouse evidence each receive a distinct validity-aware semantic classification before the sole Transfer Decision Owner applies one ordered policy. Command derivation and status/finding derivation remain separate downstream responsibilities.

DS-ALT-02: **Alternative B — one combined input assessor plus admission, progress, and verification proposal owners.** This could produce several facts for a final arbiter, but the combined assessor would mix four independently changing contexts while proposal owners would overlap on invalidity, phase, and evidence applicability. The final arbiter would need to recompute or reconcile their policy, weakening ownership clarity.

DS-ALT-03: **Alternative C — one consolidated transfer governor plus command and reporting.** This is interface-economical but naturally yields only three meaningful usages. Reaching the required `5..8` usages would require routers, pass-through adapters, or bijective enum translators, which would violate the no-padding ownership rule.

DS-CRIT-01: Alternative A is preferred because every nonprincipal usage derives a reviewable nonidentity fact, the four external validity responsibilities stay separate, all cross-input priority and state remain atomic in one owner, and the resulting `7/13/12/5` tuple fits the declared tier without count-driven structure.

DS-DEC-01: The approved initial allocation is PART-01 Request Qualification, PART-02 Docking Assessment, PART-03 Ship Progress Qualification, PART-04 Warehouse Evidence Qualification, PART-05 sole Transfer Decision Owner, PART-06 Transfer Command Derivation, and PART-07 Transfer Report Derivation.

DS-RATIONALE-01: PART-01 and PART-02 each map four raw value/status pairs to three semantic facts; PART-03 maps eight pairs to five facts; PART-04 maps six pairs to four facts; PART-06 maps the complete disposition domain to two commands; and PART-07 maps disposition plus next phase to status and finding. None is a copier, bundle-only owner, or one-to-one rename.

DS-RATIONALE-02: PART-05 alone needs request freshness, docking admission, active-phase consistency, ship-completion memory, receipt applicability, priority, and recovery/rearm context. Keeping these mutually dependent decisions together prevents incompatible partial policies and leaves exactly one principal owner.

## Selected finite policy and tradeoffs

DS-POLICY-01: The selected pilot admits a fresh request only when docking is validly reported `Docked`, issues one logical begin command, remembers ship completion while awaiting receipt, and verifies either simultaneous applicable dual evidence or a later valid receipt after remembered completion.

DS-POLICY-02: Invalid input outranks all other behavior; uncleared rearm outranks transfer admission; active docking or evidence conflict outranks progress; unexpected idle evidence outranks a simultaneous request; and verification is phase-sensitive. This ordering is a Designer abstraction, not a source-grounded operational rule.

DS-POLICY-03: Any invalid sample, active evidence fault, unexpected idle evidence, denied not-docked request, or successful verification returns to idle with rearm required. A valid neutral step clears rearm, and a later fresh request is necessary. The extra neutral step trades responsiveness for bounded nonreplay semantics.

DS-POLICY-04: Cargo identity and quantity are deliberately absent, so the policy assumes external contexts associate all reports with the one logical active transfer. This supports a coherent small finite model but prevents claims about multi-cargo matching, inventory correctness, or physical offload completeness.

## Structural and evidence decision

DS-COUNT-01: The exact selected campaign tuple is seven semantic usages, thirteen typed directed semantic interactions, twelve nontrivial owner-local contract cases, and five scenario families, with one explicit root, semantic depth two, one weak semantic region, and one principal decision owner.

DS-SUPPORT-01: One behavior-free Process and fourteen boundary-delegation routes are preauthorized generated support. Together with six sibling semantic connections they may produce exactly twenty concrete connection declarations while preserving thirteen end-to-end INT meanings; support receives no campaign or ownership credit.

DS-ANALYSIS-01: Exhaustive analysis over 3,072 admissible raw snapshots is selected because the finite product is small enough to check qualification, ordered case closure, state invariant, all outputs, and witnesses without claiming formal or physical proof.

DS-TRACE-01: All significant model elements shall trace to the approved abstract or carry a narrow generated-support justification. A typechecking model with missing abstract coverage, irrelevant trace parents, unexplained architecture, centralized recomputation, or identity-owner padding is not an acceptable realization.

DS-DEFER-01: Physical docking, extraction, hold capacity, cargo matching, quantities, transfer machinery, storage mutation, timing, energy, repair, resupply, concurrent jobs, safety, certification, execution, and formal proof remain deferred and cannot be introduced as verified claims.

DS-AUTH-01: Model generation is authorized against the approved `system-abstract.md`. Authorization is limited to the selected boundary, exact policy, counts, ownership, local contracts, support allowances, analysis obligations, and claim boundary; any needed change returns to Designer resolution in this same retained run.

## Final disposition

DS-PASS-01: The design selection passes final Designer review because it compares all seed alternatives, freezes a coherent finite boundary, assigns every state, decision, case, output, and interaction, closes nominal through recovery behavior, meets the small-tier counts without padding, resolves all Model-realizability questions without changing domain intent, and now provides relevant canonical parents for every required qualifier initialization contract.

## Model-review finding dispositions

DS-MR-01: Finding 1 is accepted: the extensional owner audit shows all seven semantic usages perform nonidentity local behavior, with PART-05 remaining the sole principal decision and state owner.

DS-MR-02: Finding 2 is accepted and narrowed to realization evidence: trusted state, initialization, pre-state, structured-Data, port, and connection mechanisms may be used only to realize the frozen contracts and do not authorize new behavior or architecture.

DS-MR-03: Finding 3 is accepted and narrowed to two identically constrained PART-05 resolution output ports for distinct INT-09 and INT-10 deliveries, structured attribute access, PART-07-local output derivation, and explicit exclusions for every earlier-priority guard. No tuple dependency, recomputation, extra case, or second owner is authorized.

DS-MR-04: Finding 4 is accepted and narrowed to exactly one uncredited behavior-free Process, fourteen marked boundary-delegation routes, six sibling connections, and twenty concrete connection declarations. The semantic inventory remains exactly INT-01 through INT-13 with unchanged endpoints.

DS-MR-05: Finding 5 is accepted as feasibility evidence only. The reported 3,072-snapshot witness distribution does not substitute for the retained analyzer, which must independently check every local contract, ordered case, state and output result, invariant, witness, and all five scenario families.

DS-MR-06: Finding 6 is accepted: the thirteen finite directed interfaces are coherent. Separate trace parents for INT-09 and INT-10 and generated-support annotations on only the fourteen routing declarations are mandatory; all deferred physical, timing, execution, proof, safety, and certification claims remain prohibited.

DS-VIS-01: The resumed visualization finding is accepted. The four qualifier initialization contracts are semantically useful startup defaults but `INIT-01` states only PART-05 state and root-output initialization, so it is an irrelevant parent for those contracts. The approved revised abstract declares INIT-QUAL-REQ-01, INIT-QUAL-DOCK-01, INIT-QUAL-SHIP-01, and INIT-QUAL-WH-01 with the exact four startup values. Regeneration shall retag each qualifier initialization contract to its corresponding new parent and shall leave `INIT-01` for PART-05 and root-output initialization only.

DS-REV-01: A narrow System Abstract revision is used to resolve the authoritative resumed traceability diagnostic. It adds four owner-specific qualifier initialization clauses and changes no boundary, raw or qualified domain, policy, priority, state, PART, INT, output mapping, campaign count, support allowance, scenario, or deferred claim; therefore `revision_used` is true.
