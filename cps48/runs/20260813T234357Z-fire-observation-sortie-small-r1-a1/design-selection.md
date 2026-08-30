# Approved design selection — Forest Observation Eligibility Supervisor

## Decision framing

SEL-01: This final decision retains the initial observation-sortie eligibility scope and distributed five-owner allocation. The Model review required one representation repair, not a boundary, policy, ownership, topology, or campaign-complexity change.

SEL-02: The controlled purpose remains granting or withholding logical permission for one requested camera-and-radio observation service using qualitative energy, camera, and radio evidence, then withdrawing and recovering that permission deterministically. Flight, navigation, propulsion, fire response, payload implementation, and physical performance remain external.

SEL-03: No diversity card or named baseline is present. Selection remains constrained by source grounding, the small-tier bounds, ownership integrity, complete finite behavior, and realizability in the retained typed-data-port subset.

## Selection criteria

CRIT-01: Source-grounding fit favors use of the explicit qualitative battery-status flow and named camera/radio vocabulary without claiming unprovided performance, health, or mission semantics.

CRIT-02: Boundary clarity favors five finite monitored inputs and two directly controlled logical outputs, with physical drone behavior explicitly outside.

CRIT-03: Small-tier fit requires `5..8` genuine semantic usages, `7..14` distinct interactions, `6..12` nontrivial cases, `4..6` scenario families, one principal decision owner, and no count padding.

CRIT-04: Behavioral value favors meaningful nominal, boundary, invalid/fault, cancellation, and recovery behavior without invented numeric thresholds or physical timing.

CRIT-05: Ownership integrity favors cohesive local derivations, one visible permit/deny owner, explicit state owners, and no usage credited for forwarding, renaming, sentinel propagation, or reporting.

CRIT-06: Assurance honesty favors exhaustive finite analysis while limiting validation claims to logical permission control.

CRIT-07: Representation fit favors explicit finite inactive literals on ordinary typed data ports because the retained trusted evidence does not establish event-port occurrence/absence semantics for this pipeline.

## Candidate-scope comparison

ALT-SCOPE-01: A battery-status assessment system is the most directly grounded option but risks collapsing into intake, mapping, and forwarding wrappers at the small tier; meaningful recovery would also require selected policy.

ALT-SCOPE-02: The observation-sortie eligibility supervisor remains selected. It uses explicit battery awareness plus named camera/radio vocabulary, has a crisp logical authorization boundary and one principal decision owner, and supports freshness, invalid-evidence, service-fault, and recovery cases without claiming flight or observation success.

ALT-SCOPE-03: An observation and communication coordinator remains unselected because it would need observation data, delivery completion, message semantics, and sequencing absent from the seed and could imply communications performance.

ALT-SCOPE-04: A navigation-and-obstacle-awareness supervisor remains unselected because the seed provides no data types, fusion rule, hazard threshold, validity semantics, or controlled awareness outcome.

ALT-SCOPE-05: A power-and-propulsion availability supervisor remains unselected because four engines and propeller kinds are structural facts, not evidence of propulsion sufficiency, redundancy, or controllability.

SEL-04: `ALT-SCOPE-02` still best balances the criteria. Camera/radio readiness remains an explicit boundary abstraction, and authorization remains a logical result rather than evidence of a safe or successful sortie.

## Responsibility-allocation alternatives

ALT-ARCH-01: The selected allocation has separate request lifecycle, energy assessment, joint camera/radio support assessment, sole eligibility arbitration, and stateful authorization gating. The arbiter combines only derived verdicts; the gate owns fail-closed application and progress-based recovery.

ALT-ARCH-02: A centralized supervisor with thin adapters remains rejected because the adapters would not earn semantic-usage credit and the five-usage lower bound could be met only by padding.

ALT-ARCH-03: A gate-centric allocation remains rejected because it conflates principal eligibility policy with fault-containment state and weakens auditability of the sole decision owner.

ALT-ARCH-04: Separate camera and radio assessors remain rejected because their identical single-input classifications would add owners and flows without a distinct enough responsibility; the selected joint assessor owns the nontrivial conjunctive relation.

## Model-finding dispositions

RES-01: The required inactive-pipeline finding is accepted and narrowed to a representation refinement. `INT-06/07` add `NoTicket`; `INT-08` adds `NoContext`; `INT-09/10` become flat attribute-based tagged records with coherent no-verdict pairs; and `INT-11` adds `NoDecision`. These values realize already-required absence on ordinary data ports and add no domain behavior or metric credit.

RES-02: The allocation/identity-wrapper audit is accepted as no concern and promoted to a generation obligation. `PART-02` credit rests on its `5 -> 3` relation with fibers `1/1/3`; `PART-03` on its `25 -> 3` relation with fibers `1/3/21`; `PART-04` on matched-ticket priority arbitration; `PART-01` on stateful freshness/admission; and `PART-05` on phase/progress fault containment. Sentinel propagation earns no credit.

RES-03: The localized mapping finding is accepted. One behavior-free generated-support `Process`, five sibling owner `Thread`s, and twenty-one raw `PortConnection` declarations may realize the fourteen semantic interactions: two delegation hops for each of seven boundary flows and one direct hop for each of seven internal flows. The support container and delegation hops collapse from semantic metrics.

RES-04: The state/feedback realizability finding is accepted as no concern with a constraint. `INT-12` is prior committed feedback under `ASM-05`; bounded composition uses previous-state/next-state semantics and shall not introduce an instantaneous algebraic cycle, physical schedule, sixth owner, or nonlocal owner guarantee.

## Selected direction and rationale

SEL-05: `ALT-ARCH-01` remains selected because request protocol, energy qualification, camera/radio support qualification, principal eligibility priority, and external-progress fault containment have separate coherent reasons to change and can be reviewed through owner-local contracts.

SEL-06: The fourteen interactions remain necessary: five boundary-input deliveries, two assessor tickets, one request context, two tagged verdicts, one principal decision, one committed gate outcome, and two boundary-output deliveries. Inactive literals change payload domains only.

SEL-07: The lifecycle/gate split remains deliberately stateful. Lifecycle owns freshness, admission, and requester status; gate owns authorization phase and service-progress protection; the feedback closes completion, cancellation, fault, and recovery.

SEL-08: Priority remains withdrawal, power denial, support denial, then permit, with reported failure or inconsistent progress as the gate's higher-priority fail-closed override. `NoDecision` makes no eligibility update and cannot mask those gate rules.

SEL-09: Recovery remains request-driven. Denial requires an alternate fresh token; service failure additionally requires progress to return to `Idle` before a subsequent fresh request. Evidence changes never authorize spontaneously.

## Assumptions introduced by selection

SEL-ASM-01: Camera and radio readiness are boundary assertions from inferred external evidence roles; the system does not derive physical health.

SEL-ASM-02: Two alternating request tokens are sufficient only for the bounded one-outstanding-request experiment and are not a production identifier design.

SEL-ASM-03: Evaluation uses a stable logical evidence snapshot and committed-state ordering; no sample rate, deadline, latency, or scheduler is selected.

SEL-ASM-04: The external service honors logical `Withhold` and reports progress; the model cannot demonstrate physical cessation, delivery, safety, or mission success.

SEL-ASM-05: Ordinary typed data ports are retained. Their explicit inactive values model the absence required by lifecycle policy; no event-delivery semantics are claimed.

## Final architecture and contract audit

SEL-AUD-01: Exact final metrics are five semantic usages, fourteen directed semantic interactions including seven internal usage-to-usage flows, twelve nontrivial contract cases plus initialization, five scenario families, one root, semantic depth one after support collapse, one weakly connected region, and one principal decision owner. All values remain inside the declared small bounds.

SEL-AUD-02: Principal ownership remains singular: only `PART-04` derives `Permit`, `DenyPower`, `DenySupport`, or `Withdraw`. `NoDecision` is an inactive representation, not a second policy outcome owner.

SEL-AUD-03: Persistent state remains owned only by `PART-01` for request state/last token and `PART-05` for gate phase. Assessors and arbiter remain stateless across completed evaluations; any one-evaluation join storage is generated support.

SEL-AUD-04: Local-contract expectations are fixed: lifecycle owns total admission and coherent sentinels; energy assessment owns the non-bijective five-value qualification; support assessment owns the prioritized twenty-five-pair qualification; arbitration owns exact ticket/context matching and eligibility priority; gate owns phase/progress application and fail-closed recovery. No downstream owner or analyzer may recompute another owner's fact.

SEL-AUD-05: The finite partitions cover every request command/token over every admissible committed state pair, every energy value, every camera/radio pair, coherent and incoherent tagged verdicts, every context and decision including inactive values, and every gate phase/progress pair. Inactive or mismatched data cannot permit.

SEL-AUD-06: Bounded end-to-end analysis shall execute prior feedback, admission, assessment, matching/arbitration, gate application, and committed next state in order; prove totality, exclusivity, sentinel coherence, ticket coherence, invariant preservation, priority, and no invalid-to-permit path; and run all five ordered scenario families.

SEL-AUD-07: Generated-support allowance is limited to one behavior-free support process, boundary delegation hops, flat types and enums, behavior-free ports, coherent sentinel values, and same-ticket join/committed-feedback storage. Each support element needs `@generated-support` and abstract trace; none earns semantic credit or changes a claim.

SEL-AUD-08: Deferred claims remain fire detection/response, flight dynamics, navigation and obstacle-avoidance performance, endurance, charging and propulsion sufficiency, landing behavior, observation quality, radio performance, physical safety, certification, production readiness, code generation, execution, physical timing, and formal proof beyond retained contracts.

## Decision

SEL-DEC-01: Status is `approved` with `revision_used = true`. The narrow typed-interface totality repair is incorporated, every Model finding is independently disposed, the frozen domain policy is unchanged, and source generation is authorized only against `system-abstract.md` and this approved selection.
