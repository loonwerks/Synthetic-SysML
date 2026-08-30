# Approved Design Selection — Vehicle Temperature and Health Supervisor

## Decision scope

DS-BASIS-01: This record approves one coherent `small` system from the frozen vehicle seed after Model review. Source facts, Designer pilot abstractions, architecture, generated-support allowances, and deferred claims remain separately classified in `system-abstract.md`.

DS-BOUNDS-01: The approved selection shall contain `5..8` responsibility-bearing semantic usages, `7..14` typed directed semantic interactions, `6..12` nontrivial contract cases, `4..6` scenario families, exactly one principal decision owner, and nominal, boundary, invalid/fault, and recovery behavior without count padding.

DS-FACT-01: The seed supports choosing one lifecycle, health, readiness, or power-related supervisory boundary, but supplies no complete protocol, authority, priority, recovery, threshold, physical effect, or safety claim.

## Scope alternatives

DS-SCOPE-01: A vehicle operating-mode supervisor is not selected because the partial start/on/off state vocabulary does not establish authorization, transition order, or readiness causality.

DS-SCOPE-02: A controller-mode coordinator is not selected because its exact controlled outcome remains ambiguous and could reduce to wrapping an indication.

DS-SCOPE-03: The temperature-and-health supervisor is selected because temperature relation, maintenance, degraded, return-to-normal, electrical-power disposition, and mode vocabulary support a coherent finite policy with explicit latching, fault response, and recovery while excluding physical effects.

DS-SCOPE-04: A start-readiness supervisor is not selected because self-test and parking-brake actions have no grounded completion or effect semantics.

DS-SCOPE-05: A standalone power-enablement supervisor is not selected because the seed supplies no fuel/power prerequisites or feedback; this design therefore controls only a logical power disposition subordinate to health policy.

## Architecture alternatives and criteria

DS-CRIT-01: Selection criteria are purpose fidelity, explicit finite boundary, owner integrity, fault/recovery clarity, cohesive responsibilities, substantive nonidentity derivations, one principal state owner, and realizability without weakening the domain policy.

DS-ALT-01: Selected Alternative A separates Temperature Evidence Qualification, Maintenance Evidence Qualification, Recovery Applicability, Health Mode Arbitration, and Boundary Outcome Derivation. It has exactly five semantic usages, thirteen semantic interactions, eleven effective policy cases, and one persistent state local to the sole principal owner.

DS-ALT-02: A centralized supervisor is rejected because it falls below the small tier and makes any added forwarding usages count padding.

DS-ALT-03: Splitting raw return qualification from recovery eligibility is rejected because the added qualifier lacks an independently evolving responsibility and risks owner-count padding.

DS-ALT-04: Splitting health-state and power authority is rejected because it creates a second consequential policy location that could contradict the health decision.

DS-ALT-05: Merging condition qualification while splitting outputs is rejected because it combines independently sourced evidence and duplicates interpretation of the committed decision.

## Approved direction and ownership

DS-DEC-01: Alternative A is approved for Model generation with exact responsibilities PART-01 through PART-05 and semantic interactions INT-01 through INT-13 from `system-abstract.md`.

DS-RATIONALE-01: PART-01 and PART-02 each own a status-dependent `4-to-3` qualification with fibers `2/1/1`; PART-03 owns a prioritized `36-to-5` three-input classification with fibers `28/4/2/1/1`; PART-04 owns consistency, priority, state, and eleven decisions; and PART-05 owns a total defensive classification over 140 two-input pairs. None is an identity wrapper.

DS-OWNER-01: PART-04 is the only state, priority, case, and principal decision owner. The remaining four usages own only their stated stateless derivations, and root, contexts, types, containment, routing, and analyzer logic receive no semantic or owner credit.

DS-CONSEQ-01: Maintenance outranks over-temperature and recovery requires a later fresh request after conditions clear. These are explicit Designer pilot decisions, not source-grounded vehicle behavior or safety requirements.

DS-CONSEQ-02: Initialization at `Unavailable/Withhold/SubmitFreshReturnRequest` is a bounded logical hold, not a physical startup or certification claim.

DS-CONSEQ-03: The external Return-Indication Source owns pulse freshness; a blocked event is consumed and the system stores no request-edge history.

## Model findings and revision disposition

DS-FINDING-01: The bounded-analysis-gap finding is accepted. The final baseline adds exhaustive direct enumeration of `28 HealthDecision × 5 RecoveryProposal = 140` PART-05 pairs, with zero uncovered or multiple mappings, correct fail-closed output for all producer-inconsistent pairs, and witnesses for every OUT-01 output tuple.

DS-FINDING-02: The owner-allocation finding is accepted as confirmation and needs no architecture revision: every counted usage has a behaviorally meaningful nonidentity local derivation, and PART-04 remains the sole principal owner.

DS-FINDING-03: The containment finding is accepted as a generated-support allowance and narrowed against semantic inflation: one behavior-free Process may contain the five Threads; twelve boundary delegation declarations plus seven direct internal declarations yield nineteen raw connections, while only thirteen end-to-end interactions receive semantic credit.

DS-FINDING-04: The finite-contract realizability finding is accepted. Attribute-based inspected fields, finite enum comparisons, helper functions, `In(healthState)`, initialization, and multi-field guarantees are allowed; totality and exclusivity are established by bounded analysis, not claimed as GUMBO proofs.

DS-REVISION-01: Revision is limited to the PART-05 audit obligation and related acceptance wording. It changes no PART, INT, case, scenario, policy priority, recovery semantics, boundary quantity, metric, owner claim, or deferred claim.

## Exact metrics, analysis, support, and claims

DS-COUNT-01: The final campaign tuple is exactly `5 semantic usages / 13 typed directed semantic interactions / 11 nontrivial contract cases / 5 scenario families`, within all inclusive `small` bounds, with one root, semantic depth `1..2`, one weak semantic region, and one principal decision owner.

DS-INT-01: The thirteen semantic interactions are three boundary-input deliveries, seven inter-usage deliveries, and three boundary-output deliveries; distinct consumer fan-outs remain intentional and traceable.

DS-CONTRACT-01: Required local contracts are the two four-value evidence qualifications, the 36-value recovery classification, the 180-tuple stateful arbitration partition with eleven ordered cases, and the 140-pair defensive output classification. Each remains local to its assigned owner.

DS-ANALYSIS-01: Required bounded end-to-end evidence exhaustively covers 256 raw-boundary/pre-state evaluations, while defensive local evidence separately covers 180 direct PART-04 tuples and 140 direct PART-05 pairs. Acceptance requires totality, exclusivity, zero mismatches, all case/output/scenario witnesses, invalid-status combinations, and blocked-request nonreplay.

DS-SUPPORT-01: Generated support may include one behavior-free Process, root/process/thread containment, types and attributes, and exactly twelve boundary delegation declarations; with seven direct internal connections the raw total is nineteen. None changes the semantic count or ownership audit.

DS-DEFER-01: Numeric/physical temperature, calibration, sensing, power actuation or achieved power, lifecycle and drivetrain behavior, maintenance scheduling, timing, quantitative risk, safety, certification, deployment, code generation, execution, compositional proof, and production readiness remain deferred and shall be recorded `not-run` or out of scope, never passed.

## Final approval

DS-PASS-01: The final selection passes because the finite boundary is closed, each responsibility is substantive, one owner closes state and effective decisions, every interaction has distinct meaning, all policy/output partitions are total by stated obligations, and five scenarios cover nominal, boundary, invalid/fault, priority, and recovery behavior.

DS-AUTH-01: Model generation is authorized in this immutable run against the approved final baseline only. The Model shall preserve the exact `5 / 13 / 11 / 5` tuple, all three enumerated analysis spaces, sole ownership by PART-04, the generated-support exclusions, and the complete claim boundary.
