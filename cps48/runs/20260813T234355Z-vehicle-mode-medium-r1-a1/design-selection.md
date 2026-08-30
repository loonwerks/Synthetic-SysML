# Approved Design Selection — Vehicle Start-Readiness and Recovery Supervisor

## Selection basis

DS-BASIS-01: The frozen seed offers lifecycle, controller-coordination, health, start-readiness, and power-enablement vocabulary but leaves purpose, boundary, policy, ownership, priority, and recovery to the Designer. The selected purpose is start admission with fault-locked recovery, not general vehicle control.

DS-CRIT-01: A candidate must remain implementation-independent, expose a complete finite boundary and policy, fit the generated-seed campaign's medium bounds, contain at least two genuine cooperating decision or qualification owners, preserve an explicit priority conflict, and avoid identity adapters or duplicate decisions.

DS-CRIT-02: Selection favors source/assumption separation, one owner per stable domain fact, independently checkable local contracts, one weak semantic region, and a traceable reason for every usage and interaction. Numeric compliance alone is insufficient.

## Alternatives considered

DS-ALT-01: Alternative A centralizes request priority, all qualifications, lifecycle state, recovery, and outputs in one supervisor surrounded by boundary adapters. It was rejected because only one element would own a genuine decision and the adapters could not receive semantic or owner credit.

DS-ALT-02: Alternative B separates request priority; brake, health, power, and self-test qualification; start authorization; lifecycle/recovery; and coordinated outcomes. It was selected because each fact is derived once and composed through distinct admission, lifecycle, and output decisions.

DS-ALT-03: Alternative C duplicates complete qualification on start-admission and operating-protection channels before reconciling their proposed modes. It was rejected because it recomputes the same observations and creates a reconciler chiefly to resolve self-created disagreement.

DS-COMP-01: Alternative B is preferred to A because it supplies genuine cooperating owners without wrappers, and preferred to C because it avoids duplicated policy and unnecessary reconciliation while retaining one coherent end-to-end purpose.

## Model-review finding dispositions

DS-REV-01: The finding that initial PART-02 and PART-04 were bijective enum renamings is accepted. PART-02 now derives `brakeEvidenceTrusted` and `brakeReadyForAdmission`; PART-04 now derives `powerEvidenceTrusted` and `powerAvailableForSupervision`. Each pair contains separately constrained, separately consumed predicates with non-singleton fibers, and no renamed three-code projection receives credit.

DS-REV-02: The requested change is narrowed to internal policy facts and their existing consumers. MON-02, MON-04, the nineteen interaction identities and endpoints, all case outcomes, lifecycle transitions, boundary values, fault responses, recovery rules, and scenario outcomes are unchanged; only INT-08, INT-09, INT-12, and INT-13 payload schemas and consuming guards are revised.

DS-REV-03: The finding that INT-18 lacked a closed reason interface is accepted. `LifecycleReason = {Ordinary, QualificationInvalid, QualificationNotReady, RecoveryAwaiting, RecoveryCompleted}` is now exact: CASE-09 selects the two qualification reasons, CASE-20 selects `RecoveryAwaiting` only while its assessment is `AwaitingRecovery`, CASE-19 selects `RecoveryCompleted`, and every other lifecycle case selects `Ordinary`.

DS-REV-04: The pre-state feedback mapping is accepted as a required realization constraint, not as evidence that this run has already passed. INT-14 publishes an assessment derived from `In(committedTestCycle)` and the current observation; INT-17 independently determines post-state storage, so a pass remains visible while `Clear` stores `Idle`, and a completion arriving on the arming evaluation is ignored.

DS-REV-05: The containment mapping is accepted. One behavior-free support Process contains the eight semantic Threads at physical depth two. Nineteen Process-local connections realize INT-01 through INT-19, while six uncredited root/Process delegations produce twenty-five raw port connections. Support owns no behavior and changes no semantic count.

DS-REV-06: The review's no-concern finding for PART-01, PART-03, and PART-05 through PART-08 is accepted subject to generation evidence. Their allocation is preserved; typechecking precedent and tractability estimates establish feasibility only and do not count as this run's verification result.

## Approved architecture and policy

DS-DEC-01: Alternative B, revised by DS-REV-01 through DS-REV-05, is approved as the final Designer baseline. Model generation is authorized against `system-abstract.md`; silent changes to ownership, priority, boundary behavior, timing semantics, counts, or claim scope are not authorized.

DS-DEC-02: The exact semantic campaign point is `8 usages / 19 interactions / 20 nontrivial cases / 8 scenario families`, within medium bounds `8..12 / 15..21 / 12..20 / 6..9`.

DS-DEC-03: The exact physical realization is one root System, one uncredited support Process, eight semantic Threads, ten total usages including root, nine non-root usages, containment depth two, nineteen semantic connections, six support delegations, twenty-five raw port connections, and one weak semantic region.

DS-DEC-04: The controlled purpose is start admission with fault-locked recovery. The boundary has five monitored inputs and one atomic six-field control frame; physical actuation, feedback, fuel behavior, power delivery, and road or drivetrain dynamics remain external or deferred.

DS-DEC-05: The explicit request conflict is `level-sensitive OFF > fresh RETURN > fresh START > none`. Invalid evidence outranks valid-not-ready evidence for start diagnostics; a recovery return consumes any simultaneous fresh start; recovery reaches `Off` and requires a later fresh start.

DS-DEC-06: At least seven cooperating decision or qualification owners are credited: PART-01 through PART-04 feed PART-06, and PART-01 through PART-06 feed PART-07. PART-08 separately owns multi-input frame coherence and status precedence but is not needed to meet the minimum owner count.

## Local contracts and evidence obligations

DS-LOCAL-01: PART-01 shall own request history, fresh edges, conflict, and priority; PART-02 and PART-04 shall each constrain two separately consumed predicates; PART-03 shall combine the nine health observations; PART-05 shall own pre-state cycle assessment and independent post-state update; PART-06 shall own five-way admission; PART-07 shall own the fifteen lifecycle cases and exact reason mapping; PART-08 shall own the complete atomic frame.

DS-LOCAL-02: Downstream owners shall consume published facts without raw-observation recomputation. Record construction, enum renaming, one-to-one snapshots, routing, delegation, and analyzer logic receive no owner, semantic-usage, interaction, or case credit.

DS-LOCAL-03: The bounded analyzer shall independently check all owner products, including PART-01's 64 current/previous request pairs, each three-value/two-predicate PART-02 and PART-04 mapping, PART-03's nine health inputs, and PART-05's `7 x 4 x 4 = 112` pre-state/observation/directive tuples.

DS-LOCAL-04: End-to-end analysis shall cover the raw `580,608`-valuation boundary/state product or a mechanically justified equivalent decomposition, reachable-state closure, exact exclusivity and exhaustiveness of all twenty cases, every case witness, and all eight ordered scenario witnesses under the 180-second watchdog.

DS-LOCAL-05: Required verification remains source inspection, structural and trace analysis, current Sireum/HAMR typechecking, resolved endpoints, the independent harness gate, canonical local-contract comparison, and bounded analyzer success. Review-time feasibility, parsing, or visualization is not a substitute.

## Generated support and deferred claims

DS-SUP-01: The support Process, six root/Process delegations, typed endpoints, attributed record fields, and pre/next snapshots are allowed only as behavior-free, trace-resolved `@generated-support`. No other support usage, hop, or raw connection is authorized without returning to Designer resolution.

DS-DEF-01: Generated application code, execution, physical timing and actuation, plant and drivetrain behavior, quantitative thermal behavior, power-delivery success, reliability, hazard probability or severity, safety integrity, certification, production fitness, and unbounded or compositional proof are deferred and shall remain `not-run` or out of scope.

DS-DISP-01: The approved baseline resolves every Model finding without weakening the frozen domain policy or leaving the medium campaign bounds. Generation is authorized for this retained immutable run.
