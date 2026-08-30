# Approved design selection

DEC-SCOPE-01: This record resolves the Model review and freezes a logical responsibility allocation, not a SysML form, execution schedule, deployment, algorithm, encoding, or proof mechanism.

## Decision drivers

DEC-CRIT-01: State ownership must make previous and actual next recovery explicit, prevent other owners from mutating recovery, and support reset followed by later fresh hold-success evidence.

DEC-CRIT-02: Priority traceability must locate the emergency, retreat, defense, service, mining, and hold order and pair every selected action with its cause.

DEC-CRIT-03: Fault propagation must remain inspectable from unusable threat evidence or failed outcome through recovery inhibition, proposal closure, emergency selection, fault mode, and publication.

DEC-CRIT-04: Atomicity must yield one public action/cause/mode/recovery result per evaluation without publication recomputing arbitration or recovery.

DEC-CRIT-05: Every credited internal assessment or decision owner must derive a behaviorally meaningful fact; a bijective rename, raw-field bundle, copy, or route is insufficient.

DEC-CRIT-06: Campaign compliance requires 13..16 semantic usages, 22..35 semantic interactions, 21..30 nontrivial cases, 9..12 scenarios, multiple genuine owners, and priority, fault-propagation, recovery, and composition obligations.

## Alternatives considered

DEC-ALT-01: Alternative A co-locates threat qualification, recovery, all action policies, and arbitration in one supervisory owner while separating observation and publication.

DEC-ALT-02: Alternative A lowers interaction burden and makes combined decision inspection direct, but it collapses qualification, state transition, applicability, fault propagation, and priority boundaries.

DEC-ALT-03: Alternative A cannot meet this hard campaign's multiple genuine-owner obligation without artificial wrappers and remains rejected.

DEC-ALT-04: Initial Alternative B separated threat qualification, readiness bundling, recovery, three eligibility owners, arbitration, mission mode, and public composition, producing 14 usages and 34 interactions.

DEC-ALT-05: Initial Alternative B exposed the desired fault and priority path, but its threat relation was a bijective enum rename, readiness merely bundled raw fields, and public composition merely copied fields; those three ownership claims fail the no-padding rule.

DEC-ALT-06: Revised Alternative B keeps separate genuine owners while qualification derives threat validity, readiness derives five policy facts, and the prior mode owner is merged with atomic publication so the combined owner derives mode before constructing the result.

## Model findings and independent disposition

DEC-FIND-01: The Model finding on initial PART-06 is accepted: `INVALID->UNKNOWN`, `CLEAR->CLEAR`, `SUSPECT->SUSPECT`, and `HOSTILE->HOSTILE` is extensionally bijective and cannot alone establish assessment ownership.

DEC-RES-01: PART-06 is narrowed to jointly derive the frozen disposition and `ThreatValidity`; three usable samples collapse to `USABLE`, invalid collapses to `UNUSABLE`, and recovery receives validity rather than disposition. This strengthens allocation evidence without changing any case or boundary outcome.

DEC-FIND-02: The Model finding on initial PART-07 is accepted: putting eight raw values into a record is pure bundling and cannot establish a composition or decision owner.

DEC-RES-02: PART-07 becomes readiness assessment and derives mining readiness, defense readiness, retreat feasibility, full-cargo classification, and dock-service applicability. The three policy fan-outs remain, and exhaustive equivalence to the frozen raw-input CASE-10 through CASE-16 relations is mandatory.

DEC-FIND-03: The Model finding on initial PART-14 is accepted: atomic field copying is required behavior but is not an owner-local derivation and cannot independently receive semantic-owner credit.

DEC-RES-03: Standalone PART-13 is removed and its CASE-23 through CASE-28 mode derivation is merged into PART-14. The merged owner derives mode, then constructs the sole atomic result from the arbitration pair and actual next recovery without recomputing either.

DEC-FIND-04: The Model's no-concern finding on current-tool realizability and bounded scale is accepted only as regeneration evidence, not as proof that a future model passes. One root, behavior-free containment support, typed fan-outs, owner-local state, one record-valued boundary result, and 161,280-value exhaustive analysis are authorized subject to all final checks.

DEC-RES-04: The boundary intake clarification is accepted: PART-01 through PART-05 are external-context/source usages that originate monitored facts at the modeled boundary. An internal receive-and-forward realization loses usage credit and fails the exact architecture.

## Approved selection

DEC-SEL-01: Revised Alternative B is selected as the approved final baseline.

DEC-RAT-01: It preserves the frozen finite policy while making every credited internal owner extensionally meaningful, retaining separate recovery, eligibility, arbitration, mode/composition, priority, fault-propagation, and recovery evidence.

DEC-RAT-02: Its 31 interactions are justified by exact raw-input intake, qualified/assessed fan-out, recovery inhibition, proposal arbitration, and final same-evaluation composition dependencies.

DEC-GUARD-01: A hybrid that centralizes readiness, proposals, recovery, arbitration, or mode computation while retaining nominal separate usages is Alternative A with padding and shall fail ownership review.

DEC-GUARD-02: Source-level constructs may vary only within the generated-support allowances in the approved System Abstract; tool compatibility shall not change domain policy, ownership, assumptions, or claim boundaries.

## Exact approved metrics and obligations

DEC-COUNT-01: The architecture has exactly 13 semantic usages, within 13..16: five external-context/source usages plus threat qualification, readiness assessment, recovery control, three eligibility owners, priority arbitration, and mission-mode/public-result composition.

DEC-COUNT-02: The architecture has exactly 31 typed directed semantic interactions, within 22..35, fixed by INT-01 through INT-31.

DEC-COUNT-03: The policy has exactly 28 nontrivial cases, within 21..30, fixed by CASE-01 through CASE-28; readiness equations, helper predicates, equivalence checks, typing, initialization, and record construction add no case credit.

DEC-COUNT-04: Validation has exactly 12 scenario families, within 9..12, fixed by SCN-01 through SCN-12; recovery variants remain one family.

DEC-OBL-01: Multiple ownership requires canonical local contracts in PART-06 through PART-12 and PART-14, with recovery state owned only by PART-08 and action/cause owned only by PART-12.

DEC-OBL-02: Priority requires the exact emergency, retreat, defense, service, mining, then policy-hold first-match order and paired causes.

DEC-OBL-03: Fault propagation requires invalid evidence or failure to latch actual next recovery, close all proposals, select emergency hold, derive fault mode, and publish actual next recovery atomically in the same evaluation.

DEC-OBL-04: Recovery requires reset to enter recovering and only a later fresh hold success under usable threat to clear; missing, wrong, stale, invalid, or failed evidence cannot clear it.

DEC-OBL-05: Composition requires PART-14 to derive mode from PART-12's action and PART-08's actual next recovery and to construct one public tuple without recomputing upstream decisions.

## Local, end-to-end, support, and claim boundaries

DEC-LOCAL-01: Threat validity and all five readiness facts must be checked extensionally; policy-owner contracts must use assigned facts only; the analyzer must prove CASE-10 through CASE-16 remain identical to the frozen raw-input relations.

DEC-ANALYSIS-01: End-to-end analysis must exhaust exactly 161,280 raw-input/previous-recovery valuations and compare next recovery, three proposals, action/cause, mode, and public result, with zero partition, ownership, equivalence, priority, recovery, fault, composition, or scenario defect.

DEC-SUPPORT-01: Allowed generated support is limited to one behavior-free containment Process if required, nonsemantic types, record constructors, helper predicates, and the sole `PublicResult` boundary connection; it receives no semantic or case credit and may not route, own state, select, or recompute policy.

DEC-DEFER-01: Profitability, physics, survivability, neutralization success, real timing/range/rates, safety, human performance, fleet coordination, deployment, production readiness, and certification remain excluded.

DEC-DEFER-02: Application code, executable scenarios, formal proof, and every correctness claim beyond retained typechecking, contract analysis, exhaustive bounded analysis, trace analysis, visualization evidence, and later Designer fitness review remain not run or deferred.

## Authorization and disposition

DEC-AUTH-01: Model regeneration is authorized against `system-abstract.md` and this selection, subject to exact metrics and extensional preservation of all frozen behavior.

DEC-STATUS-01: `approved-with-revision` — all three ownership defects are resolved locally, the no-concern evidence is accepted within a narrowed claim boundary, and the final architecture remains inside every hard-tier bound.
