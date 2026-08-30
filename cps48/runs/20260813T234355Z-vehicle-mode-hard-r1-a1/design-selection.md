# Approved design selection — protected start and power enablement

## Decision frame and evidence limits

DS-FRAME-01: This record selects one implementation-independent hard-tier
System Abstract for the frozen vehicle-mode seed. It selects a problem boundary,
responsibility allocation, finite policy, and evidence plan, not source forms,
algorithms, scheduling, deployment, or physical vehicle behavior.

DS-EVID-01: The seed grounds only the general vehicle/controller/road context
and the optional lifecycle, health, readiness, power, temperature, self-test,
parking-brake, and fuel vocabulary. Exact interfaces, authority, validity,
state, priority, recovery, cases, and controlled meaning are pilot choices.

DS-CRIT-01: Alternatives are compared for one coherent controlled purpose,
source-claim discipline, exact boundary clarity, hard-tier substance without
padding, plural state/decision ownership, analyzable fault/priority/recovery/
composition behavior, and likely realization in the retained SysML-AADL and
GUMBO workflow.

## Comparison of the seed's five candidate scopes

DS-SCOPE-01: A broad vehicle operating-mode supervisor could own start, on,
off, maintenance, degraded, and return-to-normal disposition. It is coherent
but underspecifies what makes start or recovery acceptable unless readiness and
power evidence are added; unconstrained breadth would invite invented policy.

DS-SCOPE-02: A controller-mode coordinator places the Vehicle outside the
boundary and can coordinate the same indications and outcomes. It is nearly the
selected system boundary, but by itself names an allocation perspective rather
than a primary controlled purpose, so it is not selected as the top-level need.

DS-SCOPE-03: A temperature and health supervisor has strong fault and recovery
potential, but a temperature-only controlled outcome would leave the source's
start, self-test, brake, fuel, and power vocabulary unused or require a broad
health score whose meaning the seed does not establish.

DS-SCOPE-04: A start-readiness supervisor gives the clearest coherent need:
qualify pedal, self-test, temperature, parking-brake, and power evidence before
a fresh start and handle degraded recovery. It supports multiple real owners
without claiming drivetrain behavior.

DS-SCOPE-05: A vehicle power-enablement supervisor can coherently control fuel
and electrical-power disposition, but treating power alone as primary would
leave start restraint and self-test as unexplained gates. It is best retained
as the controlled outcome of a start-readiness decision rather than a separate
system.

DS-SCOPE-DEC-01: The selected scope combines candidate 4's primary controlled
purpose with candidate 5's logical outcome: a Protected Start and Power-
Enablement Supervisor. Candidate 2 supplies the boundary perspective—the
Vehicle and evidence providers are external—but not a second system purpose.

## Responsibility-allocation alternatives

DS-ALT-01: Allocation A centralizes evidence qualification, state, priority,
faults, recovery, and all outputs in one supervisor surrounded by input/output
adapters. It is compact, but the adapters would be forwarding or renaming
usages and one owner would contain nearly all semantic behavior; it fails the
hard-tier plurality and anti-padding rule.

DS-ALT-02: Allocation B uses an acyclic evidence pipeline. Five nonidentity
qualification owners feed three independent evidence/state decisions;
readiness and exact faults converge separately; a rearm state owner and an
operating-session owner resolve recovery and priority; independent actuation
and public-status composers consume only resolved facts.

DS-ALT-03: Allocation C duplicates a complete readiness/fault path for fuel
enablement and electrical enablement, then reconciles both at the boundary.
This provides apparent redundancy, but it duplicates truth ownership, can
produce contradictory recovery, and would require an unsupported consensus or
independence claim.

DS-ALLOC-DEC-01: Allocation B is selected. Allocation A is rejected for
centralized semantics and padding risk. Allocation C is rejected for duplicated
authority and invented redundancy. Allocation B gives every usage a cohesive
local fact, keeps persistent states exclusive, and remains a directed acyclic
composition graph.

## Selected design point and tier rationale

DS-POINT-01: The selected design point is exactly fourteen semantic usages,
thirty-five semantic interactions, twenty-nine nontrivial contract cases, and
eleven scenario families, all within hard bounds `13..16`, `22..35`, `21..30`,
and `9..12`.

DS-USAGE-01: Fourteen usages are necessary for five evidence qualifications,
thermal and self-test state, combined start restraint, readiness composition,
operating-session state/priority, exact fault aggregation, rearm state,
actuation composition, and public status/notice composition.

DS-USAGE-02: None of the fourteen is credited as a pure copier. The five
qualifiers collapse invalid payload alternatives or derive a many-to-one
applicability fact; four owners retain disjoint state; PART-08 and PART-09 make
multi-input decisions; PART-11 is credited only for its six-input OR; PART-13
makes a many-to-one actuation decision; and PART-14 is credited only for its
prioritized notice classification.

DS-INT-01: The complete revised interaction count is six boundary-to-owner
inputs, twenty-seven internal owner flows, and two owner-to-boundary outputs.
The resulting thirty-five flows are individually typed and responsibility-
necessary; delegations and diagram-only links are excluded.

DS-CASE-01: Twenty-nine cases are exactly the closed state/priority partitions:
five thermal, seven self-test, five rearm, and twelve operating-session cases.
Other required Boolean and output compositions are not used to pad this count.

DS-SCN-01: Eleven families exercise different traces: nominal start, restraint
rejection, self-test failure retention, thermal fault/recovery, supply invalid,
concurrent fault propagation, early recovery rejection, successful fresh
recovery/restart, fault-versus-off priority, maintenance reset, and arming
abort on ordinary power unavailability.

## Ownership, priority, fault, recovery, and composition audit

DS-OWN-01: Persistent state has four exclusive owners: thermal clearance is
owned by PART-06, self-test campaign by PART-07, operating session by PART-10,
and rearm qualification by PART-12. No state is mirrored or recomputed.

DS-OWN-02: Decision ownership is plural and nonoverlapping: evidence
applicability belongs to PART-01..05, start restraint to PART-08, readiness to
PART-09, session priority to PART-10, aggregate-fault OR derivation to PART-11,
actuation to PART-13, and prioritized notice classification to PART-14. Exact
vector preservation by PART-11 and publication of upstream status fields by
PART-14 are uncredited coherence obligations, not owner-local derivations.

DS-PRI-01: Session priority is current fault, degraded recovery acceptance,
degraded retention, off, maintenance, fresh start acceptance/rejection, arming
completion/abort, on sustain/withdrawal, then stable no-request behavior.
Mutually exclusive guards, not textual case order alone, must prove one winner.

DS-PRI-02: Notice priority is separate: current fault, degraded recovery,
rearm confirmation, maintenance, arming, on, then off. Notification severity
cannot change mode or actuation, and actuation separately gives current fault a
final fail-safe override.

DS-FAULT-01: Six local owners contribute command, pedal, thermal, supply,
parking-brake, and self-test bits. PART-11 shall preserve their fixed-order
vector as an uncredited coherence obligation and receives owner credit only for
deriving its six-input OR; it may not collapse concurrent causes or reinterpret
a valid ordinary unavailable/released condition as invalid evidence.

DS-FAULT-02: Fault propagation reaches session priority and both output
composers. Thus any current fault independently produces degraded status and
safe actuation, while PART-14 publishes the exact upstream vector and OR as an
uncredited coherence obligation and derives only the notice classification.

DS-REC-01: Thermal recovery requires two consecutive valid nominal observations
after a blocked condition, and every `Elevated` observation resets that streak
to `Blocked` without asserting the thermal fault. Self-test failure requires a
valid reset context and a later fresh-start campaign. System rearm requires two
complete clean-candidate snapshots, then a fresh return request.

DS-REC-02: Commands are current snapshot values, never queued intents. A start
issued before readiness or during degraded operation is not replayed; a return
request issued before prior rearm `Ready` is not replayed; successful recovery
ends `Off` and requires a later fresh start.

DS-COMP-01: The selected graph is acyclic: boundary qualifiers precede local
state/decisions; readiness and fault aggregation precede rearm/session;
session precedes actuation/status. Output composers consume exact owner facts
and never reread boundary inputs.

## Structural realization and evidence plan

DS-STRUCT-01: The authorized realization has one root System, optionally one
behavior-free Process support container, and fourteen contract-bearing
semantic usages in one weakly connected region at containment depth no greater
than two below the root.

DS-STRUCT-02: Exactly thirty-five semantic connections are authorized. If the
library pattern requires root/Process delegation for all six inputs and two
outputs, those eight transparent support connections are uncredited and the
raw connection ceiling is forty-three.

DS-LOCAL-01: Canonical local contract evidence is required at every usage:
PART-01..05 total qualification relations; PART-06/07/10/12 initialization and
next-state relations; PART-08 restraint; PART-09 readiness; PART-11 exact-vector
coherence plus credited OR derivation; PART-13 actuation; and PART-14 exact
initialization/status coherence plus credited notice classification. Only the
five thermal, seven self-test, five rearm, and twelve session `compute_cases`
receive the twenty-nine case credits; the other equations remain mandatory and
uncounted.

DS-BOUND-01: The deterministic bounded analyzer must cover the complete raw
boundary/prior-state product of `5,529,600` valuations, all sixty-four
owner-local fault vectors, all twenty-nine counted guards, the exact initial
CTRL tuples, every one-step owner relation, and the multi-step fresh-request,
thermal, self-test, rearm, degraded-recovery, and restart traces. Thermal
evidence shall include an explicit `Elevated -> Nominal -> Nominal` witness
whose state sequence is `Blocked -> Confirming -> Clear`. Factorization is
allowed, but the analyzer must compare the transmitted owner-local facts end to
end and report zero gaps, overlaps, mismatches, padding owners, or unconstrained
output fields; centralized analyzer recomputation is not ownership evidence.

DS-TRACE-01: Acceptance requires coverage from every System Abstract ID to
source/contracts/analyzer evidence and back from every significant generated
element, with only specific informational, deferred, or generated-support
exceptions.

DS-SUPPORT-01: Generated support is limited to the one root System, one
optional behavior-free Process, typed finite record/enum declarations with
`attribute` members where inspected by GUMBO, ports, at most eight transparent
root/Process boundary delegations, trace annotations, and independent analyzer
plumbing. Each significant support element requires a specific
`@generated-support` rationale and receives no semantic-usage, interaction,
case, scenario, state, or decision-owner credit.

DS-DEFER-01: Deferred claims remain torque, acceleration, braking force, fuel
flow, battery behavior, thermal units or thresholds, sensor physics, self-test
implementation, mechanical brake effect, real timing or concurrency,
reliability, road safety, certification, code generation, execution, formal or
unbounded proof, and production readiness. They shall remain out of scope or
`not-run`, never reported as passed.

## Objective selection disposition

DS-PASS-01: The approved design passes selection because it fixes one coherent
source-compatible controlled purpose, exact finite boundary, fourteen
substantive owners, a complete typed topology, plural state and decision
ownership, explicit priority/fault/recovery/composition policy, closed finite
partitions including fresh requests, and objective structural and behavioral
criteria.

DS-RES-01: Model review established that the owner-local new-state facts and
same-snapshot downstream composition are realizable without a combinational
cycle in the retained SysML-AADL/GUMBO forms; state remains local to PART-06,
PART-07, PART-10, and PART-12.

DS-RES-02: Model review established that the twenty-nine counted cases shall be
the four trace-tagged owner-local `compute_cases` partitions, while
qualification and POL-FAULT/POL-ACT/POL-NOTICE/POL-COMP remain named uncounted
guarantees evaluated from the same retained local relations.

DS-RES-03: Model review established that product-valued ports with GUMBO-
inspectable `attribute` members can preserve all individually constrained
CTRL-01 and CTRL-02 members. ASM-09 and PART-14 now fully constrain the initial
public status; any later tool limitation must be reported rather than silently
redesigning the policy.

DS-RES-04: The resumed designer-final diagnostic is accepted: the earlier
`Elevated -> Confirming` thermal transition allowed clearance after only one
following nominal observation. CASE-THERM-02 now resets the state to `Blocked`,
and the bounded evidence obligation now includes the explicit
`Elevated -> Nominal -> Nominal` witness. This correction changes no usage,
interaction, counted-case, scenario-family, priority, fault, recovery, or
composition total.

DS-GEN-01: Model generation is authorized only against this approved baseline.
If the retained subset cannot realize a frozen clause within DS-SUPPORT-01,
the Model shall checkpoint this same run with the exact diagnostic and shall
not weaken policy, alter metrics, discard the seed, or start a replacement
attempt.
