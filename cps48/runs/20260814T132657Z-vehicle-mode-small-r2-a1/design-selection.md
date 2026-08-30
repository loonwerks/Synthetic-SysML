---
decision_id: DS-VEHICLE-CONTROLLER-MODE-SMALL-R2-01
run_id: 20260814T132657Z-vehicle-mode-small-r2-a1
selected_direction: qualified-dual-channel-controller-mode-coordination
status: selected
---

# Initial design selection

## Decision scope and evidence classes

DEC-SCOPE-01: This decision selects one small implementation-independent vehicle-controller supervisory purpose and one responsibility allocation before SysML generation. The frozen seed, the declared small-tier bounds, and the replicate-2 diversity card constrain the choice.

DEC-METHOD-01: Handbook guidance supplies the method of defining need and boundary, comparing alternatives, allocating cohesive responsibilities, recording assumptions, and retaining objective evidence. It does not select a vehicle policy or architecture.

DEC-SOURCE-01: Source-grounded evidence is limited to the Vehicle/VehicleController context and the optional start, on, off, maintenance, degraded, return-to-normal, mode, health, brake, self-test, power, fuel, and road vocabulary summarized by the frozen seed.

DEC-ASSUME-01: Exact actors, finite interfaces, validity, event freshness, modes, transitions, priority, recovery, contracts, scenarios, and ownership are pilot abstractions. They are not attributed to the corpus source.

DEC-DEFER-01: Physical vehicle behavior, start authorization, power enablement, thermal or health assessment, readiness, self-test, parking-brake control, timing, safety, certification, and execution evidence remain deferred.

## Comparison of the seed's candidate scopes

SCOPE-ALT-01: A vehicle operating-mode supervisor is plausible from the seed, but a vehicle-level boundary would invite physical vehicle-state or power/readiness outcomes that this small run cannot substantiate. It was not selected.

SCOPE-ALT-02: A controller-mode coordinator treating the Vehicle as environment is directly supported as a vocabulary-level choice and permits a closed logical purpose around start/on/off/maintenance/degraded/return indications without claiming readiness or achieved physical state. It was selected.

SCOPE-ALT-03: A temperature and health supervisor is source-plausible but prohibited by the replicate-2 diversity card because replicate 1 already accepted that primary purpose. It was excluded rather than renamed.

SCOPE-ALT-04: A start-readiness supervisor is source-plausible but prohibited by the diversity card and would repeat replicate-1 brake, health, power, and self-test qualification. It was excluded.

SCOPE-ALT-05: A vehicle power-enablement supervisor is source-plausible but prohibited by the diversity card and would repeat protected-start/power outcomes. It was excluded.

SCOPE-SELECT-01: SCOPE-ALT-02 is retained because its primary controlled purpose is the coordination of controller operating-mode dispositions, not qualification or authorization. Its root boundary is limited to two indication samples and two logical coordination outputs.

## Responsibility-allocation alternatives within the selected scope

ARCH-ALT-01: A centralized stateful coordinator could qualify both samples, detect conflicts, select transitions, retain state, and publish outputs in one usage. It is compact, but it hides distinct validity and cross-channel compatibility obligations inside the principal owner and gives weak local evidence when a partition fails.

ARCH-ALT-02: A split-state architecture could give lifecycle progression and exception/recovery progression separate state owners and add a merger. It makes each state machine smaller, but concurrent state reconciliation becomes a second mode decision and weakens the required single principal decision owner.

ARCH-ALT-03: The selected qualified dual-channel architecture uses separate lifecycle and condition qualification owners, one stateless cross-channel compatibility owner, one sole stateful mode arbiter, and one many-to-one boundary-result owner. It keeps raw validity and conflict classification reviewable while leaving all priority, state, and transition cases with one principal owner.

## Selection criteria and trade

CRIT-01: Purpose fidelity is highest priority: the allocation must coordinate controller modes without reconstructing temperature/health, readiness, protected-start, or power-enablement policy.

CRIT-02: Ownership clarity requires every credited usage to derive a distinct owner-local fact and requires one exclusive owner for mode state, priority, and the complete case partition.

CRIT-03: Behavioral closure requires total finite qualification, compatibility, transition, invalid/fault, fresh-event, and recovery paths with deterministic outputs.

CRIT-04: Small-tier economy requires 5..8 semantic usages, 7..14 distinct semantic interactions, 6..12 nontrivial cases, and 4..6 distinct scenario families without padding.

CRIT-05: Realizability favors finite types, typed directed facts, one persistent mode, and contracts that can be checked by bounded enumeration while preserving a concrete Model-review question about same-evaluation post-state publication.

TRADE-01: ARCH-ALT-01 is structurally simplest but scores lower on qualification and compatibility traceability; ARCH-ALT-02 exposes subprotocols but violates the intended single decision center; ARCH-ALT-03 best balances cohesive local facts, exclusive arbitration, total contracts, and the frozen diversity constraint.

DECISION-01: ARCH-ALT-03 is selected with exactly five semantic usages, ten typed semantic interactions, eleven ordered nontrivial cases, five scenario families, one persistent state, and one principal decision owner.

## Diversity decision

DIVERSE-BASE-01: The closest replicate-1 baseline is the medium `Vehicle Start-Readiness and Recovery Supervisor` because it also includes lifecycle and recovery sequencing; the small temperature/health and hard protected-start/power baselines are farther from the selected controlled purpose.

DIVERSE-PURPOSE-01: The selected system controls the controller's operating-mode disposition and coordination result. It does not decide whether start is ready or authorized, whether power is enabled, or whether temperature/health evidence is acceptable.

DIVERSE-BOUND-01: Its boundary contains only lifecycle and condition indication samples plus mode/result outputs; it excludes replicate-1 brake, temperature, maintenance-time qualification, self-test, power, readiness, authorization, and actuation interfaces.

DIVERSE-STATE-01: Its only state is the five-valued controller operating mode owned by one arbiter. It has no request-edge memory, test-cycle state, readiness state, health-clearance state, start-authorization state, or power state.

DIVERSE-TOPO-01: Its topology is two parallel indication qualifiers feeding a cross-channel compatibility classifier and one mode arbiter, followed by result framing. It has no readiness aggregation, self-test cycle, start authorization, or power/actuation branch.

DIVERSE-PRIORITY-01: Its priority is `invalid/inconsistent > off > degraded > maintenance > recovery-conflict > return > on > start`; unlike the closest baseline's readiness/test sequencing and `OffDominant > ReturnCandidate > StartCandidate` request classifier, invalid indication evidence remains externally dominant and `On` is an explicit mode-completion event rather than readiness proof.

DIVERSE-RECOVERY-01: A fresh unopposed return directly changes `Maintenance` or `Degraded` to `Off`, never to an authorized or powered mode; a later fresh start and then on event are separate coordination steps. No clean-evidence streak, self-test cycle, readiness requalification, or power enablement is part of recovery.

DIVERSE-JUST-01: These are genuine changes in controlled purpose, boundary, state ownership, interaction topology, priority, and recovery policy. Adding this coordinator to a replicate-1 baseline would remove rather than elaborate its principal qualification and authorization responsibilities, so the result is neither an extension, repartitioning, nor renamed baseline.

## Retained audits and pass basis

AUDIT-OWNER-01: The owner audit retains exactly four stateless local-fact owners and one sole state/decision owner: qualification owners derive two many-to-one assessments, the compatibility owner derives a seven-valued cross-channel fact, the arbiter owns the only mode and all cases, and the frame owner derives a four-valued many-to-one result.

AUDIT-PART-01: The transition partition is closed for invalid/malformed input, valid off, degraded, maintenance, recovery conflict, applicable return, inapplicable return, applicable on, applicable start, no event, and every remaining invalid transition. No fallback is unspecified.

AUDIT-FRESH-01: Every nonempty input is a one-evaluation event, applied and rejected events are consumed, no request is queued, accepted recovery reaches only `Off`, and later lifecycle progression requires a fresh event after the source's declared no-event separator.

AUDIT-COUNT-01: The retained recount is 5 semantic usages, 10 complete typed directed semantic interactions, 11 nontrivial cases, and 5 scenario families. Each credited item has a distinct responsibility, producer-consumer purpose, policy guard/result, or behavioral trace.

PASS-01: Initial Designer status is `passed` because the selected abstract satisfies the declared small tier, closes nominal/boundary/invalid/recovery behavior, has one principal decision owner, distinguishes facts/abstractions/selection/deferred claims, and meets the diversity card without count padding.

MODEL-QUESTION-01: Model review shall answer whether PART-05 can consume PART-04's applied next-mode decision in the same abstract evaluation in the retained SysML-AADL/GUMBO subset; an exact tool limitation must be returned for Designer resolution rather than hidden by adding delay or moving arbitration.
