# Final design selection — battery evidence and charging qualification

## Decision frame and evidence limits

DS-FRAME-01: This decision selects one implementation-independent System
Abstract for the frozen drone logical seed at the predeclared hard tier. It
does not select algorithms, source structure, scheduling, deployment, physical
topology, code, or safety mechanisms.

DS-EVID-01: Source-grounded evidence is limited to the seed's battery and
charging support, qualitative battery indication and checking, low-battery
notification toward flight control, pilot monitoring, charger/charging-
interface context, and lifecycle vocabulary. The exact boundary, finite types,
owners, priorities, state, recovery, and contract partitions are declared pilot
choices.

DS-CRIT-01: Alternatives are compared for primary-purpose coherence, compliance
with the replicate-2 diversity card, exact boundary clarity, hard-tier semantic
substance without padding, plural local ownership, closed finite priority and
recovery, fault/composition analyzability, unsupported-claim risk, and likely
realizability in the retained SysML-AADL/GUMBO workflow.

## Comparison of all seed-required scope alternatives

DS-SCOPE-01: Alternative S1, the lifecycle governor, is not eligible for this
replicate. It would again own or derive `Off/Standby/Charging/Ready/Flying`,
organize cases around lifecycle transitions, and publish lifecycle/enablement
outcomes, directly violating the frozen diversity card.

DS-SCOPE-02: Alternative S2, a battery-awareness supervisor, can use the seed's
strongest observation chain while controlling only logical charge
qualification and audience-specific awareness. Confidence, attention, and
charge-session state provide real plural ownership and recovery without
claiming physical energy or lifecycle behavior.

DS-SCOPE-03: Alternative S3, a flight-readiness coordinator, offers a distinct
purpose but would require a broader set of navigation, inertial, barometric,
communication, sensing, and landing-gear observations to reach hard size.
Their validity, combination, and operational meaning are not grounded by the
seed, and a final launch decision risks recreating lifecycle enablement.

DS-SCOPE-04: Alternative S4, the complete logical forest-fire observation
drone, has broad capability vocabulary but no grounded fire-detection, mapping,
dispatch, radio-peer, or performance semantics. Selecting it would make a
product label substitute for one coherent supervisory problem and would expose
the seed's prohibited engine-count inconsistency.

DS-SCOPE-DEC-01: S2 is selected as a Battery Evidence and Charging
Qualification Supervisor. Lifecycle is accepted only as a validity-bearing
read-only context used to block charging in disallowed phases; the system owns
no lifecycle event, transition, phase state, launch permission, or flight
command.

## Responsibility-allocation alternatives

DS-ALT-01: Allocation A centralizes all qualification, confidence, alert,
charge-session, fault, notification, and public outcomes in one supervisor and
surrounds it with boundary adapters. It is superficially compact, but adapters
would be decoders or forwarders and only one usage would own meaningful
decisions/state, so it fails the hard tier and anti-padding rule.

DS-ALT-02: Allocation B uses a directed owner pipeline: four evidence-specific
qualifiers/applicability owners feed independent confidence, eligibility,
attention, advisory, and charge-session owners; the current request also feeds
the attention, session, and request-result owners directly. Session conflict
joins a fault aggregator, while request/advisory/attention/session facts
converge at the request-result owner before notification and authorization/
status composition. Each of thirteen usages derives a distinct nonidentity
local fact.

DS-ALT-03: Allocation C gives separate pilot-awareness and charger-control
branches their own battery trust, fault, and recovery decisions and reconciles
them at the output. This could reduce cross-branch dependencies but duplicates
the meaning of trust and blocking, permits contradictory recovery, and requires
a consensus authority unsupported by the seed.

DS-COMP-01: Allocation A is rejected for centralized ownership and padding.
Allocation C is rejected for duplicated state and conflicting authorities.
Revised Allocation B is selected because its acyclic semantic topology
preserves one owner per fact, assigns the multi-input request-result relation
to PART-01 instead of crediting an invertible request decoder, propagates a
session-local conflict into the shared current fault vector, and gives both
audiences consistent evidence without shared state duplication.

## Selected design point and tier rationale

DS-POINT-01: The selected point is exactly thirteen semantic usages,
thirty-five semantic interactions, twenty-three nontrivial contract cases, and
ten scenario families, all inside the hard bounds `13..16`, `22..35`,
`21..30`, and `9..12`.

DS-POINT-02: Thirteen usages are necessary for current request-result decision,
four independent evidence/applicability qualifications, confidence state,
eligibility, attention state, battery advisory, current fault aggregation,
charge-session priority state, differentiated notification composition, and
authorization/status composition. None exists only to reach the lower bound.

DS-POINT-03: Thirty-five interactions are the complete recount after revision:
seven boundary-to-owner input flows, twenty-four internal owner flows, and four
boundary outputs. The boundary still has exactly five distinct root input ports
and four distinct root output ports. Fan-out is present only where distinct
owners need the same current request or owner-derived fact; nine root/Process
delegations are support and are excluded.

DS-POINT-04: Twenty-three cases are exactly the complete state partitions: four
battery-confidence cases, six attention-latch cases, and thirteen charge-
session priority cases. Other local equations are composition obligations and
are deliberately not padded into the case count.

DS-POINT-05: Ten scenario families separately exercise confidence establishment,
nominal authorization, ending authorization, automatic not-needed withdrawal,
battery recovery, charger recovery, unexpected activity, airborne attention,
acknowledgement priority, and concurrent-fault composition.

## Ownership, priority, recovery, and composition audit

DS-OWN-01: Persistent state is plural and non-overlapping: PART-06 alone owns
`Untrusted/Confirming/Trusted`, PART-08 alone owns `Clear/Attention`, and
PART-11 alone owns `Idle/Eligible/Authorized/Suspended`. The external lifecycle
context remains owned by CTX-05.

DS-OWN-02: Decision ownership is also plural: PART-01 owns the multi-input
request-result equation; PART-07 owns eligibility; PART-09 owns the battery-only
advisory; PART-10 owns the five-bit fault vector and OR; PART-11 owns final
session priority; PART-12 owns audience-specific notices; and PART-13 owns the
authorization equation and status composition. Direct request routes and
copied result fields receive no ownership credit.

DS-PRI-01: PART-11's effective priority is unexpected interface activity,
blocked evidence, current end request, automatic not-needed withdrawal,
retained authorization, fresh suspended recovery, retained suspension, fresh
eligible begin, then stable eligible/idle behavior. Guard exclusions, not text
order, shall establish a single winner.

DS-PRI-02: PART-12 has a separate notification priority: untrusted evidence,
critical, low, other charge attention, recovery pending, then clear. It cannot
change session or confidence state, so notification severity cannot override
authorization policy.

DS-FAULT-01: Fault propagation is owner-local then aggregated. Battery,
charger, interface, lifecycle-context, and unexpected-activity predicates each
own one bit; PART-10 preserves the exact vector and derives only its OR;
PART-12/13 must publish consistent effects without collapsing concurrent bits.

DS-FAULT-02: Root-level composition shall cover every fault vector reachable
through the five declared monitored domains. Because `MON-04` is one enum,
interface fault (`Faulted/Unknown`) and unexpected-activity conflict (`Active`)
cannot coexist in one root snapshot. PART-10 nevertheless retains an exact
owner-local all-32-vector check over its five independent Boolean inputs.

DS-REC-01: Recovery is intentionally split across owners. PART-06 requires two
valid battery reports, PART-08 requires trusted recovered band plus fresh
acknowledgement, current evidence clears local fault bits, and PART-11 retains
suspension until fresh eligible `BeginCharge` or applicable `EndCharge`.

DS-REC-02: Requests are current-snapshot values rather than stored intents.
Thus no begin or acknowledgement observed before evidence recovery can trigger
a later transition, and evidence correction alone never restores logical
authorization.

DS-COMP-02: The selected topology is an acyclic owner DAG. PART-12 receives
resolved attention, fault, and session facts. PART-01 receives the current
request plus resolved attention-clear, advisory, and session facts and emits
`PublicDecisionFacts`; PART-13 combines that record with the exact fault
vector/OR. No downstream owner needs a root reread or upstream-policy
reproduction.

## Diversity-card compliance

DS-DIV-01: The selected primary scope is battery evidence trust and charging
qualification, not lifecycle governance or mission governance. Its controlled
outcomes are charge authorization and battery/charge awareness; lifecycle is
one read-only monitored context among five inputs.

DS-DIV-02: The closest baseline is the replicate-1 lifecycle transition
governor described by the card. The controlled purpose differs categorically:
that baseline owns next drone phase and lifecycle enablement, while this system
owns confidence, attention, and charge qualification and cannot emit a next
phase.

DS-DIV-03: Boundary differs because lifecycle event requests and controlled
phase/propulsion/launch outcomes are absent. New primary boundary concepts are
qualitative battery validity, charger availability, prior-interval interface
activity, charge authorization, and audience-specific battery notice/status.

DS-DIV-04: State ownership differs because no part owns drone lifecycle state.
Three independent owners instead retain battery confidence, attention latch,
and charge-session qualification, all with purposes and values that cannot be
renamed one-to-one into `Off/Standby/Charging/Ready/Flying`.

DS-DIV-05: Interaction topology differs because a five-source evidence DAG
converges on eligibility/session/fault/notification/public composition and
splits only at the pilot, charger, and flight-control recipients; it is not a
request-to-lifecycle-transition arbiter with peripheral evidence gates.

DS-DIV-06: Priority and recovery differ because priority resolves unexpected
charging activity and authorization eligibility, not lifecycle event
conflicts. Recovery separately requires two valid battery reports, fresh
charge begin after suspension, and fresh acknowledgement after recovered band;
none resumes or selects a lifecycle transition.

DS-DIV-07: These boundary, state-ownership, interaction-topology, priority, and
recovery differences are structural and behavioral. Adding this supervisor to
a lifecycle governor would require an explicit external interface between two
different systems; it cannot be obtained by renaming or repartitioning the
baseline lifecycle cases.

## Structural realization and evidence plan

DS-STRUCT-01: The authorized realization has exactly one root System, one
uncredited behavior-free Process at depth one, and thirteen contract-bearing
semantic usages at depth two in one weakly connected semantic region.

DS-STRUCT-02: Generated support is limited to transparent containment routing,
closed types, typed ports, fan-out, context/visual nodes, and nine root/Process
boundary delegations. At most forty-four raw port connections are authorized:
thirty-five semantic connections plus nine delegations.

DS-LOCAL-01: Canonical local-contract evidence is required at all thirteen
semantic usages: PART-02..05 qualification/applicability; PART-06/08/11 their
respective four/six/thirteen effective state partitions; PART-07 eligibility;
PART-09 advisory; PART-10 exact fault OR; PART-12 differentiated notices;
PART-01 request result; and PART-13 authorization/status composition. PART-01's
advisory/session copies, PART-10's source-bit copies, and PART-13's public-field
copies are mandatory but uncredited.

DS-LOCAL-02: Only PART-06, PART-08, and PART-11 may use their own prior state.
Typed winning-case and `PublicDecisionFacts` fields shall be inspectable
attributes; consumers may compare/copy them but shall not duplicate effective
guards or centralize an owner relation.

DS-VER-01: Architecture inspection shall require exact semantic counts,
resolved typed endpoints/directions, one root, depth two, one region, and
nonidentity owner-local contract evidence for every usage.

DS-VER-02: A deterministic analyzer shall compute all state triples reachable
from `(Untrusted, Attention, Idle)`, enumerate every five-input snapshot for
each reachable triple, execute explicit owner relations, and compare them with
an independently represented direct oracle.

DS-VER-02A: The exact finite snapshot domain is 6,400 combinations and the
three prior-state domains admit at most twenty-four triples, establishing a
153,600-evaluation upper bound before scenario checks. The analyzer shall
report exact reachable triples and evaluation count, retain all twenty-three
case and ten scenario witnesses, and shall not call generated contract
predicates as its oracle.

DS-VER-02B: End-to-end scenario and fault coverage shall require only vectors
reachable through the root domains and reachable prior states, including both
SCN-10 variants. PART-10 shall separately be checked directly for exact vector
and OR behavior over all 32 local Boolean combinations. The retained pre-repair
run found 11 reachable triples, 70,400 exhaustive pipeline evaluations, and 24
root-reachable vectors; regeneration shall recompute these values.

DS-VER-03: Passing requires zero partition gaps/overlaps, oracle differences,
state/output mismatches, priority violations, fault-vector/OR mismatches,
permission-under-fault results, stale-request recovery, ownership violations,
or unexplained traces, plus witnesses for all twenty-three cases and ten
root-reachable scenario families, coverage of every root-reachable fault
vector, and the separate all-32-vector PART-10 local check.

DS-AUDIT-01: Designer finite-guard enumeration covered all six confidence
prior/validity classes, 120 attention prior/confidence/band/request
combinations, and 120 session prior/eligibility/activity/request combinations.
Each combination selected exactly one effective case, every one of the
twenty-three cases had a witness, and `Suspended -> Authorized` occurred only
with current `BeginCharge`, `Permitted`, and no unexpected activity. This is a
design sanity check, not a substitute for the retained Model analyzer.

DS-VAL-01: Designer validation remains separate and shall reject a mechanically
valid model that starts controlling lifecycle, centralizes state/decisions,
weakens recovery or priority, hides concurrent faults, or asserts physical,
mission, safety, or certification claims.

## Assumptions, uncertainty, and retained Model questions

DS-ASM-01: All finite domains, state initializations, effective priorities,
two-valid-report recovery, acknowledgement behavior, and charge-need mapping
are recorded pilot choices. The seed does not validate them as real-drone
behavior.

DS-UNC-01: Model generation subsequently demonstrated Well-formed results at
both retained SysML gates and zero owner, case-partition, oracle, state/output,
priority, fault-vector/OR, authorization-under-fault, stale-request, and
ownership mismatches. Those results apply to the preserved canonical source;
the gates, trace, metrics, and bounded analyzer shall be rerun against this
revised baseline before acceptance and do not constitute execution, generated-
code correctness, physical validation, or proof.

DS-QUESTION-01: The supported subset can represent all three owner-local prior
states and the atomic declarative owner DAG without claiming a scheduler order;
generation shall still be rejected if state is centralized.

DS-QUESTION-02: Typed winning-case identifiers and `PublicDecisionFacts` can
cross the revised PART-11/PART-12, PART-11/PART-01, and PART-01/PART-13
interfaces while keeping each local contract authoritative; downstream guard
recomputation remains prohibited.

DS-QUESTION-03: The bounded analyzer can encode a genuinely independent oracle,
reachable-state closure, and per-case/per-scenario witnesses within the exact
6,400-snapshot and 153,600-evaluation bounds. Retained evidence found 11
reachable triples and 70,400 pipeline evaluations without calling generated
contract predicates; the repaired analyzer must distinguish 24 root-reachable
fault vectors from PART-10's direct all-32-vector local contract check.

## Final disposition

DS-PASS-01: Revised Allocation B and scope S2 pass final Designer selection at
exact metrics `13/35/23/10`. They meet multiple-owner, priority, fault
propagation, recovery, composition, fresh-request, finite-partition, diversity,
local-contract, bounded-analysis, generated-support, and claim-boundary
obligations and authorize Model regeneration in this retained run. The resumed
repair changes only SCN-10 and behavioral acceptance to require root-reachable
end-to-end vectors; no frozen domain policy or local owner contract is weakened.

DS-DEFER-01: Physical battery/charging/flight behavior, timing, generated-code
correctness, operational execution, formal proof, safety, reliability,
certification, and production fitness remain `not-run`, deferred, or prohibited
claims; no omitted check is reported as passed. Retained SysML typechecking and
finite analyzer execution establish only their stated model-conformance scope.
