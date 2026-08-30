---
abstract_id: SA-DRONE-BATTERY-CHARGE-HARD-02
domain_seed: drone-logical-domain-20260812t143051z
campaign_complexity: hard
semantic_usage_count: 13
semantic_interaction_count: 35
nontrivial_contract_case_count: 23
scenario_family_count: 10
requires_multiple_state_or_decision_owners: true
requires_priority_fault_recovery_composition: true
requires_stateful_behavior: true
requires_fault_behavior: true
approval_status: approved
baseline_revision: designer-resolution-02
---

# Battery Evidence and Charging Qualification Supervisor

## Synopsis, need, purpose, and scope

NEED-01: A configurable logical drone needs a bounded supervisory function that
turns qualitative battery, charger, charging-interface, and read-only lifecycle
reports into trustworthy battery awareness, charging qualification, and
audience-specific notices without assuming physical battery or flight behavior.

PURPOSE-01: The system will qualify battery evidence, remember whether that
evidence has recovered enough to be trusted, decide whether charging is
currently eligible, control a logical charge-authorization outcome, retain
attention until explicit acknowledgement is valid, and publish a battery-only
readiness advisory. It shall not command or own drone lifecycle transitions.

SCOPE-01: The selected finite boundary contains one battery report, one charger
report, one charging-interface report, one contextual lifecycle report, and one
pilot abstraction's current service request. It produces logical charge
authorization, pilot and flight-control notices, and a pilot supervisory status
tuple. Physical sensing, energy transfer, propulsion, navigation, flight
control, and lifecycle ownership are outside the boundary.

DIV-01: This is not an extension, refinement, or repartitioning of the
replicate-1 lifecycle governor. Its controlled purpose is evidence trust and
charge qualification; it never calculates a next `Off/Standby/Charging/Ready/
Flying` value. Its boundary omits lifecycle-event commands, its persistent
state is confidence/attention/charge qualification rather than drone phase,
its priority is evidence-and-authorization priority rather than transition
priority, and recovery requires requalification plus fresh charge or
acknowledgement requests rather than resumption of a lifecycle transition.

## Evidence and claim classes

METHOD-01: Handbook-derived method constraints require need and boundary before
parts, explicit assumptions and ownership, nominal and off-nominal scenarios,
alternative comparison, coverage-based traceability, measurable pass criteria,
and separate verification and validation. They guide how this abstract is
constructed; they are not drone-domain facts.

SRC-01: Source-grounded seed facts are limited to the logical drone domain,
battery and charging support, qualitative battery-capacity indication,
battery-status checking, a low-battery notification toward flight control, a
pilot who monitors remaining battery charge, the charger/charging-interface
context, and the named lifecycle vocabulary used here only as contextual input.

PILOT-01: The exact finite types, trust-recovery rule, charge eligibility
policy, request meanings, initial states, owner allocation, case order,
notification priority, and scenario sequences are pilot abstractions selected
for this generated model. They are not reported as source facts or real-drone
engineering requirements.

ARCH-01: The selected architecture is a design decision comprising thirteen
cohesive behavioral owners connected by thirty-five typed directed semantic
interactions. It is implementation-independent: no algorithm, execution order,
thread period, deployment, encoding, or user-interface presentation is fixed.

DEFER-01: Physical state of charge, energy units, discharge or charge curves,
charger electrical behavior, timing, endurance, launch/landing/return control,
flight dynamics, obstacle response, forest-fire observation performance,
radio-peer behavior, engine-count consistency, reliability, safety,
certification, and production readiness are explicitly deferred or prohibited
claims.

EVID-01: Verification in this run means source inspection, typechecking,
structural/trace analysis, contract-partition analysis, and bounded finite
analysis against the clauses below. Validation separately asks whether the
retained model preserves this battery-and-charging purpose and evidence limits.

## Goals

GOAL-01: The system shall prevent logical charge authorization unless current
battery, charger, charging-interface, and contextual evidence jointly satisfy
the selected charge-eligibility policy.

GOAL-02: The system shall make invalid battery evidence immediately untrusted
and shall require two consecutive valid reports before battery evidence becomes
trusted again.

GOAL-03: The system shall propagate distinct evidence and session conflicts to
an exact public fault vector and conservative notices without conflating a
disconnected charger with a charger fault.

GOAL-04: The system shall retain charge suspension and battery attention across
evidence recovery until the applicable fresh request is present in the current
snapshot.

GOAL-05: The system shall publish mutually consistent authorization, request
result, notice, advisory, session, and fault outcomes from one winning
composition of owner-local facts.

## Operational context and exact system boundary

CTX-01: The Pilot/Status Consumer is the seed-mentioned human abstraction. It
supplies one current service request and receives notices and supervisory
status; this does not assert a physical control station or command protocol.

CTX-02: The Battery Management Source supplies qualitative capacity and report
validity. It remains responsible for the report; the supervisor does not model
measurement physics.

CTX-03: The Charger Context supplies a finite availability report and receives
logical authorization. `Permitted` is permission, not evidence that energy is
flowing.

CTX-04: The Charging Interface Context supplies a finite report about the
preceding observation interval. `Active` means only that activity was reported,
not that electrical charging is proved.

CTX-05: The External Lifecycle Context Owner supplies the current named drone
phase and its validity. It alone owns that phase; no output from this system can
change it.

CTX-06: The Flight-Control Notice Recipient receives battery attention only.
It supplies no input and this abstract assigns it no flight-control behavior.

MON-01: `serviceRequest`, from CTX-01, is exactly one of `None`, `Assess`,
`BeginCharge`, `EndCharge`, or `AcknowledgeNotice`. A request has effect only in
the snapshot in which that value is present.

MON-02: `batteryReport`, from CTX-02, is the product of band `Full`, `Nominal`,
`Low`, or `Critical` and status `Valid` or `Invalid`. Units and physical
thresholds are intentionally unspecified because the seed grounds only a
qualitative indication.

MON-03: `chargerReport`, from CTX-03, is exactly `Disconnected`, `Ready`,
`Faulted`, or `Unknown`. `Disconnected` blocks charging but is not itself a
fault; `Faulted` and `Unknown` assert the charger-evidence fault.

MON-04: `chargeInterfaceReport`, from CTX-04, is exactly `Idle`, `Active`,
`Faulted`, or `Unknown`. `Faulted` and `Unknown` assert an interface-evidence
fault; `Active` is compared with the prior charge-session authorization.

MON-05: `lifecycleReport`, from CTX-05, is the product of phase `Off`,
`Standby`, `Charging`, `Ready`, or `Flying` and status `Valid` or `Invalid`.
Charging context is allowed only for valid `Off`, `Standby`, or `Charging`;
this policy reads but never transitions the phase.

CTRL-01: `chargeAuthorization`, to CTX-03, is exactly `Denied` or `Permitted`.
It shall be `Permitted` exactly when the new charge-session state is
`Authorized` and the current aggregate fault is false.

CTRL-02: `pilotNotice`, to CTX-01, is exactly `EvidenceUntrusted`, `Critical`,
`Low`, `ChargeAttention`, `RecoveryPending`, or `Clear`, selected by the
notification priority in `POL-NOTICE-01`.

CTRL-03: `flightControlNotice`, to CTX-06, is exactly `EvidenceUntrusted`,
`Critical`, `Low`, `RecoveryPending`, or `Clear`. Charger, interface, context,
and session faults alone do not create a flight-control battery notice.

CTRL-04: `pilotStatus`, to CTX-01, is the finite product of battery advisory
`Unknown/BatteryReady/ChargeQualified/ChargeBlocked/AirborneAttention`, charge
session `Idle/Eligible/Authorized/Suspended`, request result
`None/Accepted/Rejected/Deferred/NoEffect`, the five-bit fault vector, and
aggregate fault.

BOUND-01: The five `MON-*` values are the complete root input inventory and the
four `CTRL-*` values are the complete root output inventory. No part may reread
an external value except through its listed `INT-*` interaction, and no
unlisted external entity participates in a required scenario.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for providing exactly one `MON-01` value per
logical snapshot. The single enum makes concurrent pilot requests impossible;
this is a deterministic pilot abstraction, not a claim about a real operator.

ASM-02: CTX-02 is responsible for pairing every qualitative band with explicit
validity. On `Invalid`, the band is present for type completeness but shall
have no behavioral authority.

ASM-03: CTX-03 is responsible for the four-valued `MON-03` report. The selected
policy treats `Ready` as usable, `Disconnected` as unavailable without fault,
and `Faulted/Unknown` as unavailable with fault.

ASM-04: CTX-04 is responsible for the four-valued `MON-04` report about the
preceding observation interval. Comparing `Active` with the prior session state
avoids assuming instantaneous physical response to the current output.

ASM-05: CTX-05 is responsible for a phase/status pair. Valid `Ready` and
`Flying` block charging but are not lifecycle faults; only invalid status
asserts the context-evidence fault.

ASM-06: The selected charge-need abstraction is `Full -> NotNeeded` and
`Nominal/Low/Critical -> needed` once battery evidence is trusted. This is a
finite policy choice without physical threshold or safety significance.

ASM-07: Two consecutive valid battery reports restore trust regardless of
whether their qualitative bands match. The purpose is to exercise bounded
recovery ownership, not to claim sensor-validation adequacy.

ASM-08: Every contract evaluation uses one atomic logical snapshot and the
three owners' prior states. No real period, latency, concurrency, or scheduling
claim follows from this assumption.

ASM-09: The logical initial states are battery confidence `Untrusted`, attention
`Attention`, and charge session `Idle`; all public authorization is safely
`Denied` before the first complete evaluation.

CONST-01: Exactly thirteen semantic usages, thirty-five semantic interactions,
twenty-three counted nontrivial cases, and ten scenario families shall be
realized. Support containers, delegations, ports, types, fan-out wiring, and
context actors receive no semantic or ownership credit.

## Selected semantic usages and ownership

PART-01: Current Request Result Decision Owner shall combine the current
`MON-01` service request with PART-08 `attentionClearedNow`, the exact PART-09
battery advisory, and the PART-11 charge-session resolution to derive
`requestResult` under `POL-REQ-01`. It shall emit one `PublicDecisionFacts`
record containing that derived result plus exact copies of the advisory and new
session needed downstream. Every record member shall be an inspectable
`attribute`; the copied members are mandatory but receive no ownership credit.

PART-02: Battery Evidence Qualifier shall suppress the band of an invalid
`MON-02` report and derive either one qualified band or invalid evidence. It
owns no persistence or charge decision.

PART-03: Charger Evidence Qualifier shall derive `chargerUsable`,
`chargerConnected`, and `chargerFault` from `MON-03`; the four-to-three-fact
relation distinguishes disconnection from fault.

PART-04: Charging Interface Evidence Qualifier shall derive
`interfaceHealthy`, `activityObserved`, and `interfaceFault` from `MON-04`.
It shall not infer authorization or session state.

PART-05: Lifecycle Context Applicability Owner shall derive
`chargeContextAllowed`, `airborneContext`, and `contextFault` from the ten
phase/status combinations without deriving or owning a next lifecycle phase.

PART-06: Battery Confidence State Owner shall exclusively own prior/new
`Untrusted/Confirming/Trusted` state and shall derive current battery usability,
qualified band, charge-needed, and battery-fault facts using `CASE-CONF-*`.

PART-07: Charge Eligibility Decision Owner shall combine current outputs of
PART-03, PART-04, PART-05, and PART-06 into exactly one of `Blocked`,
`NotNeeded`, or `Permitted`. It owns the current eligibility decision but no
state or public authorization.

PART-08: Attention Latch State Owner shall exclusively own prior/new
`Clear/Attention` state, an attention cause, and `attentionClearedNow` using
`CASE-ATTN-*`. Acknowledgement is effective only on trusted `Full/Nominal`
evidence.

PART-09: Battery Advisory Decision Owner shall combine lifecycle context,
battery confidence/band, and charge eligibility into the five-valued
`CTRL-04` battery advisory. It is explicitly not a flight-readiness or launch
permission owner.

PART-10: Fault Aggregation Owner shall derive the exact five-bit current fault
vector `(battery, charger, interface, context, sessionConflict)` and its OR.
It shall neither invent persistent faults nor treat disconnection as fault.

PART-11: Charge Session Priority State Owner shall exclusively own prior/new
`Idle/Eligible/Authorized/Suspended` state, unexpected-activity conflict, and
one winning `CASE-SESS-*` identifier. It is the sole final priority owner for
charge-session qualification.

PART-12: Notification Composition Owner shall combine PART-08 attention cause,
PART-10 fault vector, and PART-11 session resolution into differentiated pilot
and flight-control notices. It may not recompute confidence, eligibility,
attention transition, or session state.

PART-13: Authorization and Status Composition Owner shall combine PART-01
`PublicDecisionFacts` with PART-10's exact fault vector and aggregate fault,
derive `chargeAuthorization` under `POL-AUTH-01`, and publish the complete
`pilotStatus` tuple. Copies of the owned request result, advisory, new session,
and fault fields are mandatory but uncredited; PART-13 shall not derive or
recompute `requestResult`.

OWN-AUDIT-01: Persistent state ownership is exactly PART-06 for confidence,
PART-08 for attention, and PART-11 for charge session. Current decision
ownership is non-overlapping: PART-01 owns request result; PART-02 through
PART-05 own their stated qualification/applicability facts; PART-07 owns
eligibility; PART-09 owns advisory; PART-10 owns the fault vector and OR;
PART-12 owns notices; and PART-13 owns authorization and status composition.

OWN-AUDIT-02: Every `PART-*` derives a nonidentity owner-local fact from its
assigned inputs. A model that replaces an owner with forwarding, centralizes
its relation, or credits a decoder/copy/bundle shall fail even if node counts
and end-to-end outputs still match.

## Complete typed directed semantic interaction inventory

INT-01: CTX-01 provides the current `serviceRequest` to PART-01 for the
request-result decision.

INT-02: CTX-02 provides band/status `batteryReport` to PART-02.

INT-03: CTX-03 provides `chargerReport` to PART-03.

INT-04: CTX-04 provides `chargeInterfaceReport` to PART-04.

INT-05: CTX-05 provides phase/status `lifecycleReport` to PART-05.

INT-06: CTX-01 provides the current `serviceRequest` directly to PART-08 for
acknowledgement applicability.

INT-07: CTX-01 provides the current `serviceRequest` directly to PART-11 for
begin/end charge-session policy.

INT-08: PART-01 provides `PublicDecisionFacts` to PART-13.

INT-09: PART-02 provides qualified-band-or-invalid evidence to PART-06.

INT-10: PART-03 provides charger usability and availability facts to PART-07.

INT-11: PART-03 provides `chargerFault` to PART-10.

INT-12: PART-04 provides interface health and activity facts to PART-07.

INT-13: PART-04 provides interface health and activity facts to PART-11.

INT-14: PART-04 provides `interfaceFault` to PART-10.

INT-15: PART-05 provides charging-context applicability to PART-07.

INT-16: PART-05 provides valid-context and airborne-context facts to PART-09.

INT-17: PART-05 provides `contextFault` to PART-10.

INT-18: PART-06 provides confidence, qualified band, and charge-needed facts to
PART-07.

INT-19: PART-06 provides confidence and qualified band to PART-08.

INT-20: PART-06 provides confidence and qualified band to PART-09.

INT-21: PART-06 provides `batteryFault` to PART-10.

INT-22: PART-07 provides current eligibility to PART-09.

INT-23: PART-07 provides current eligibility to PART-11.

INT-24: PART-08 provides new attention state, attention cause, and winning
attention-case identifier to PART-12.

INT-25: PART-09 provides the five-valued battery advisory to PART-01.

INT-26: PART-10 provides fault vector and aggregate fault to PART-12.

INT-27: PART-10 provides fault vector and aggregate fault to PART-13.

INT-28: PART-11 provides current `sessionConflict` to PART-10.

INT-29: PART-11 provides prior/new session and winning session case to PART-12.

INT-30: PART-11 provides prior/new session and winning session case to PART-01.

INT-31: PART-08 provides `attentionClearedNow` to PART-01 for current
acknowledgement disposition.

INT-32: PART-12 provides `pilotNotice` to CTX-01.

INT-33: PART-12 provides `flightControlNotice` to CTX-06.

INT-34: PART-13 provides `pilotStatus` to CTX-01.

INT-35: PART-13 provides `chargeAuthorization` to CTX-03.

INT-AUDIT-01: The complete semantic inventory is exactly `INT-01..INT-35`:
seven boundary-to-owner input flows, twenty-four internal owner-to-owner flows,
and four boundary outputs. It contains thirty-five distinct typed directed
responsibilities, five distinct root input ports, four distinct root output
ports, and one weakly connected semantic region.

INT-AUDIT-02: After all design revisions the recount remains exactly 35. Root
or containment delegations that realize the nine boundary ports are generated
support and shall not be counted again as semantic interactions.

## State semantics, policy, and complete contract partitions

STATE-01: PART-06 confidence is initially `Untrusted`; `Confirming` records one
consecutive valid report and `Trusted` records at least two. Invalid evidence
has immediate priority over every prior state.

STATE-02: PART-08 attention is initially `Attention`. `Clear` means no retained
battery-attention obligation; `Attention` persists until trusted
`Full/Nominal` evidence and a fresh acknowledgement coincide.

STATE-03: PART-11 charge session is initially `Idle`. `Eligible` means current
evidence permits a begin request, `Authorized` owns retained logical
authorization, and `Suspended` requires a fresh recovery request even after
evidence becomes eligible.

POL-ELIG-01: PART-07 shall select `Blocked` if confidence is not `Trusted`, the
charger is not `Ready`, the interface is not healthy, or lifecycle context is
invalid/disallowed; otherwise it shall select `NotNeeded` for `Full` and
`Permitted` for `Nominal/Low/Critical`.

POL-ADV-01: PART-09 shall select `Unknown` when confidence or lifecycle context
is invalid, `AirborneAttention` for trusted `Low/Critical` in valid `Flying`,
`BatteryReady` for trusted `Full/Nominal`, `ChargeQualified` for other trusted
`Low/Critical` with `Permitted`, and `ChargeBlocked` otherwise. These effective
guards are mutually exclusive in that order.

POL-NOTICE-01: PART-12 pilot-notice priority is battery fault
`EvidenceUntrusted`, attention cause `Critical`, attention cause `Low`, any
other aggregate fault or suspended session `ChargeAttention`, retained
attention `RecoveryPending`, then `Clear`. Flight-control notice uses only
battery fault/cause priority `EvidenceUntrusted > Critical > Low >
RecoveryPending > Clear`.

POL-AUTH-01: PART-13 shall publish `Permitted` exactly for the new session in
PART-01 `PublicDecisionFacts` being
`Authorized` with aggregate fault false; every other combination shall publish
`Denied`. This equation prevents copied prior authorization from bypassing a
current conflict.

POL-REQ-01: PART-01 shall derive current request result as follows: `None ->
None`; `Assess -> Accepted` unless advisory is `Unknown`, then `Deferred`;
`BeginCharge -> Accepted` only for `CASE-SESS-07/09`, `Deferred` for
`CASE-SESS-01/02/08`, `NoEffect` for retained `CASE-SESS-06`, and `Rejected`
otherwise; `EndCharge -> Accepted` only for `CASE-SESS-03/04` and `NoEffect`
otherwise; `AcknowledgeNotice -> Accepted` only when PART-08 reports
`attentionClearedNow`, and `NoEffect` otherwise.

CASE-CONF-01: For any prior confidence and an invalid battery report, PART-06
shall select new `Untrusted`, suppress the band, and assert battery fault.

CASE-CONF-02: For prior `Untrusted` and a valid report, PART-06 shall select new
`Confirming`, retain the qualified band for awareness, and keep battery
usability false.

CASE-CONF-03: For prior `Confirming` and a valid report, PART-06 shall select new
`Trusted`, expose the qualified band, and make battery usability true.

CASE-CONF-04: For prior `Trusted` and a valid report, PART-06 shall retain
`Trusted`, expose the qualified band, and keep battery usability true.

CASE-ATTN-01: When new confidence is not `Trusted`, PART-08 shall select
`Attention` with cause `Untrusted` regardless of prior attention or request.

CASE-ATTN-02: Otherwise, trusted `Critical` shall select `Attention` with cause
`Critical` regardless of prior attention or request.

CASE-ATTN-03: Otherwise, trusted `Low` shall select `Attention` with cause `Low`
regardless of prior attention or request.

CASE-ATTN-04: Otherwise, prior `Attention` with current
`AcknowledgeNotice` shall select `Clear`, cause `Clear`, and assert the
one-snapshot `attentionClearedNow` fact.

CASE-ATTN-05: Otherwise, prior `Attention` shall retain `Attention` with cause
`RecoveryPending`; an old acknowledgement has no effect.

CASE-ATTN-06: Otherwise, prior `Clear` shall retain `Clear` with cause `Clear`.

CASE-SESS-01: Highest priority: current interface `Active` with prior session
other than `Authorized` shall select `Suspended` and assert `sessionConflict`.

CASE-SESS-02: Otherwise, current eligibility `Blocked` shall select
`Suspended` without inventing a session conflict.

CASE-SESS-03: Otherwise, prior `Authorized` or `Suspended`, current
`EndCharge`, and eligibility `Permitted` shall select `Eligible`.

CASE-SESS-04: Otherwise, prior `Authorized` or `Suspended`, current
`EndCharge`, and eligibility `NotNeeded` shall select `Idle`.

CASE-SESS-05: Otherwise, prior `Authorized` with eligibility `NotNeeded` shall
select `Idle` and withdraw authorization without a request.

CASE-SESS-06: Otherwise, prior `Authorized` shall retain `Authorized`.

CASE-SESS-07: Otherwise, prior `Suspended`, current fresh `BeginCharge`, and
eligibility `Permitted` shall select `Authorized`.

CASE-SESS-08: Otherwise, prior `Suspended` shall retain `Suspended`; evidence
recovery alone shall not restore authorization.

CASE-SESS-09: Otherwise, prior `Eligible`, current fresh `BeginCharge`, and
eligibility `Permitted` shall select `Authorized`.

CASE-SESS-10: Otherwise, prior `Eligible` with eligibility `NotNeeded` shall
select `Idle`.

CASE-SESS-11: Otherwise, prior `Eligible` shall retain `Eligible`.

CASE-SESS-12: Otherwise, prior `Idle` with eligibility `Permitted` shall select
`Eligible`.

CASE-SESS-13: Otherwise, prior `Idle` shall retain `Idle`.

CASE-AUDIT-01: The counted nontrivial contract inventory is exactly twenty-three
cases: `CASE-CONF-01..04`, `CASE-ATTN-01..06`, and
`CASE-SESS-01..13`. Eligibility, advisory, fault, notification, authorization,
and request-result equations are necessary local composition contracts but are
not padded into the counted case total.

CASE-AUDIT-02: Confidence cases partition every prior-confidence/report-validity
class while preserving the selected valid band; attention cases partition every
prior-attention/new-confidence/qualified-band/request combination admitted by
PART-06; session cases partition all `4 x 3 x 2 x 5` prior/eligibility/activity/
request classes through explicit exclusion of earlier guards. Every finite
combination selects exactly one case in each owner.

PRI-01: `CASE-SESS-01..13` shall be encoded as effective guards, not reliance
on textual evaluation order. Unexpected activity outranks blocked evidence;
blocked evidence outranks end/begin requests; current end and automatic
not-needed withdrawal outrank authorization retention; fresh recovery begin
outranks suspended retention.

COMP-01: PART-01 shall consume the current request and the listed PART-08/09/11
owner outputs without rereading sibling state or recomputing their policies,
and PART-13 shall consume only PART-01 `PublicDecisionFacts` and PART-10 fault
facts. The published tuple shall contain the exact PART-01 request result,
advisory, and new session and the exact PART-10 fault vector, with PART-13
locally deriving authorization from the same winning snapshot.

CONTRACT-LOCAL-01: Canonical local contracts shall expose exactly these
credited relations: qualification/applicability at PART-02..05; the four, six,
and thirteen effective state-case partitions at PART-06, PART-08, and PART-11;
eligibility at PART-07; advisory at PART-09; exact fault OR at PART-10;
audience-specific notice composition at PART-12; request result at PART-01;
and authorization/status composition at PART-13. Direct request routes and
copied record/status/fault fields are necessary wiring but uncredited.

CONTRACT-LOCAL-02: Each contract-bearing usage shall constrain only its direct
typed inputs, and only PART-06, PART-08, and PART-11 may reference their own
prior state through `In(...)`. Winning-case identifiers and all
`PublicDecisionFacts` members shall be closed typed `attribute` fields;
downstream owners may compare or copy them but shall not reproduce upstream
effective guards.

## Nominal required behavior

BEH-01: The system shall suppress invalid battery bands, advance confidence
only by `CASE-CONF-*`, and expose trusted band semantics only after two
consecutive valid reports.

VFY-BEH-01: Contract inspection plus bounded enumeration shall pass only if
every prior-confidence/report pair selects exactly one confidence case and the
new state/usability/fault outputs equal that case.

BEH-02: The system shall calculate current charge eligibility from all four
qualified evidence domains and shall never treat `Disconnected` as a fault.

VFY-BEH-02: Bounded enumeration shall pass only if the eligibility equation
matches `POL-ELIG-01` for every finite input and charger fault is false exactly
for `Disconnected` and `Ready`.

BEH-03: The system shall select one charge-session case per snapshot, retain
authorization only through PART-11, and require fresh `BeginCharge` after
`Suspended` recovery.

VFY-BEH-03: Partition and transition analysis shall pass only with zero gaps,
zero overlaps, all thirteen session witnesses, and no `Suspended -> Authorized`
transition except `CASE-SESS-07` with current `BeginCharge`.

BEH-04: The system shall latch battery attention for untrusted/low/critical
evidence and clear it only with trusted `Full/Nominal` plus current
`AcknowledgeNotice`.

VFY-BEH-04: Enumeration shall pass only with all six attention witnesses and no
clear transition under stale acknowledgement, untrusted, `Low`, or `Critical`.

BEH-05: The system shall derive a battery-only advisory without granting flight
permission and shall distinguish airborne low/critical attention from grounded
charge qualification.

VFY-BEH-05: Contract analysis shall pass only if PART-09 realizes the ordered
five-way equation in `POL-ADV-01` and no controlled lifecycle or launch output
exists.

BEH-06: The system shall publish an atomic composition whose authorization,
request result, notices, session, advisory, and fault fields agree with their
single winning owner results.

VFY-BEH-06: An independently expressed direct oracle shall pass only with zero
differences from explicit owner composition for every bounded reachable-state
snapshot and with no untraced output field.

BEH-07: Initialization shall publish `Denied`, an untrusted/unknown battery
condition, no accepted request, the exact initialized states, and no invented
valid evidence.

VFY-BEH-07: Initialization contract inspection shall pass only if confidence is
`Untrusted`, attention is `Attention`, session is `Idle`, authorization is
`Denied`, and no output implies trusted battery evidence.

## Fault propagation, risks, and recovery

RISK-01: Invalid battery evidence accepted as trustworthy could permit charging
or clear attention from an ungrounded band; mitigation is immediate confidence
loss, blocking, notices, and two-valid-snapshot recovery.

RISK-02: Reported interface activity without prior authorization could remain
unreported or be mistaken for authorized operation; mitigation is highest-
priority session conflict, suspension, fault propagation, and denial.

RISK-03: Clearing local evidence faults could silently restore a prior charge
authorization or clear attention; mitigation is independent state retention and
fresh-request recovery.

FAULT-01: Invalid battery evidence shall cause PART-06 battery fault, PART-07
`Blocked`, PART-11 `Suspended`, PART-10 exact battery/aggregate fault, PART-12
untrusted notices, and PART-13 `Denied` in the same logical evaluation.

VFY-FAULT-01: End-to-end bounded analysis shall pass only if every invalid
battery snapshot produces that complete propagation chain with no authority
from the accompanying band.

FAULT-02: `Faulted/Unknown` charger or interface reports and invalid lifecycle
context shall assert only their assigned local fault bits, join the aggregate
OR, block eligibility, suspend the session, and deny authorization.

VFY-FAULT-02: Single- and multi-fault enumeration shall pass only if every
five-bit vector equals the exact local predicates, the aggregate equals their
OR, and unrelated bits remain false.

FAULT-03: Interface `Active` with prior session not `Authorized` shall select
`CASE-SESS-01`, assert session conflict, publish aggregate fault and
`ChargeAttention`, suspend the session, and deny authorization.

VFY-FAULT-03: Transition analysis shall pass only if all three unauthorized
prior states witness this response and prior `Authorized` activity does not
assert session conflict.

FAULT-04: PART-12 and PART-13 shall never mask concurrent faults, replace the
five-bit vector with a single cause, or publish `Permitted` while any aggregate
fault is true.

VFY-FAULT-04: Composition analysis shall pass only with exact vector
preservation for all 32 fault vectors and zero aggregate-fault/permission
conflicts.

REC-01: After battery invalidity, two consecutive valid reports are necessary
to regain trust; the session remains `Suspended` until a current eligible
`BeginCharge`, and attention remains until trusted `Full/Nominal` coincides
with current `AcknowledgeNotice`.

VFY-REC-01: A bounded recovery trace shall pass only if it demonstrates all
three independent gates and shows that no earlier request is remembered.

REC-02: After charger, interface, or context evidence becomes usable, its
current local fault and aggregate contribution shall clear immediately, but a
prior `Suspended` session shall not leave suspension without current
`BeginCharge` or `EndCharge` under the corresponding session cases.

VFY-REC-02: Recovery enumeration shall pass only if fault clearing and session
retention are independently observable and no automatic reauthorization occurs.

REC-03: After unexpected activity stops, `sessionConflict` shall clear because
it is current, not latched; the session shall remain `Suspended` and shall
require a fresh eligible `BeginCharge` to authorize again.

VFY-REC-03: The required scenario shall pass only if conflict clearing does not
clear suspension or restore permission in the same or a later no-request
snapshot.

## Required bounded scenario families

SCN-01: Confidence establishment shall begin from `Untrusted` with otherwise
usable context, apply valid `Nominal` twice, and observe `Confirming` then
`Trusted`; `Assess` is `Deferred` before trust and `Accepted` after trust. A
third valid report shall witness trusted retention in `CASE-CONF-04`.

SCN-02: Nominal charge qualification shall use valid `Standby`, charger
`Ready`, interface `Idle`, and trusted `Low`; it shall observe `Idle ->
Eligible`, retain `Eligible` for one `None` snapshot, then apply fresh
`BeginCharge` and observe `Authorized`, `Permitted`, and an accepted request.

SCN-03: Authorized charge ending shall first retain prior `Authorized` with
expected interface `Active` and `None`, then apply current `EndCharge` and
observe authorization withdrawal without session conflict. Its two bounded
variants shall end in `Eligible` for `Permitted` and `Idle` for `NotNeeded`.

SCN-04: Automatic not-needed withdrawal shall move prior `Authorized` to
`Idle` when trusted band becomes `Full`, publish `Denied`, and require no
`EndCharge`; bounded variants shall also show prior `Eligible -> Idle` and
prior `Idle -> Idle` under `NotNeeded`. This is qualification policy, not
physical charge completion.

SCN-05: Battery invalidity and full recovery shall show immediate untrusted
propagation, two valid snapshots to regain trust, retained suspension until a
fresh eligible `BeginCharge`, and retained attention until a later valid
`Full/Nominal` plus fresh acknowledgement.

SCN-06: Charger evidence fault recovery shall distinguish `Faulted` from
`Disconnected`, show the exact charger fault bit clearing on `Ready`, retain
session suspension, and authorize only on a fresh eligible begin request.

SCN-07: Unexpected interface activity shall start from prior `Eligible`, report
`Active`, observe conflict/suspension/denial, then report `Idle`, observe the
conflict bit clear while suspension remains, and recover only with fresh begin.

SCN-08: Airborne battery attention shall use valid contextual `Flying` with
trusted `Low` or `Critical`, observe charging blocked and
`AirborneAttention`, deliver the corresponding flight-control notice, and
produce no lifecycle transition or flight command.

SCN-09: Attention acknowledgement shall show that acknowledgement during
`Low`, `Critical`, or untrusted evidence has `NoEffect`; trusted `Full/Nominal`
without acknowledgement shall retain `RecoveryPending`; only a current
acknowledgement clears attention and is `Accepted`, after which a no-request
snapshot shall retain `Clear`.

SCN-10: Concurrent-fault composition shall use two root-reachable variants. The
interface-fault variant shall assert battery invalid, charger fault, interface
`Unknown`, and invalid lifecycle context and shall observe exactly those four
fault bits with session conflict false. The unauthorized-activity variant shall
start from a prior session other than `Authorized`, assert battery invalid,
charger fault, interface `Active`, and invalid lifecycle context, and shall
observe battery, charger, context, and session-conflict bits with interface
fault false. Each variant shall observe aggregate true, highest-priority
notices, `Suspended`, and `Denied`, then clear its independent root sources one
at a time without masking the remaining reachable bits. No end-to-end snapshot
shall be required to assert interface fault and session conflict together,
because the single `MON-04` enum makes `Faulted/Unknown` and `Active` mutually
exclusive.

SCN-AUDIT-01: The required scenario-family inventory is exactly
`SCN-01..SCN-10`. Each family has a distinct behavioral trace and jointly
witnesses nominal qualification, priority, propagation, independent recovery,
fresh requests, contextual composition, and all twenty-three counted cases.

SCN-COVER-01: Counted-case witnesses are explicit: `SCN-01/05` cover all
`CASE-CONF-*`; `SCN-05/08/09` cover all `CASE-ATTN-*`; and `SCN-02..07/10`
cover `CASE-SESS-01..13`, including the bounded variants in `SCN-03/04`.

## Trace, structural, and bounded-analysis obligations

TRACE-01: Required downward trace is `GOAL-01 -> BEH-02/03/06,
FAULT-02/03`; `GOAL-02 -> BEH-01, FAULT-01, REC-01`; `GOAL-03 -> BEH-05/06,
FAULT-01..04`; `GOAL-04 -> BEH-03/04, REC-01..03`; and `GOAL-05 -> BEH-06,
COMP-01`. The Model shall retain coverage rather than force one-to-one links.

TRACE-02: Every significant model part, port, connection, state, initialization,
contract, case, and output field shall trace to one or more abstract IDs or bear
an explicit `@generated-support` reason. Missing abstract coverage or
unexplained additions shall fail acceptance.

TRACE-03: Revised request/outcome trace is `MON-01 -> INT-01/06/07`,
`POL-REQ-01 -> PART-01` using `INT-25/30/31`, `PART-01 -> INT-08 -> PART-13`,
and `POL-AUTH-01 -> PART-13` using `INT-27`. `CTRL-04` request result,
advisory, session, and fault fields shall trace to their respective PART-01,
PART-09, PART-11, and PART-10 owners; copied publication fields receive no
independent owner trace.

STRUCT-01: The authorized structure has exactly one root System usage, one
behavior-free Process usage at depth one, and all thirteen semantic
contract-bearing usages at depth two. The Process and root receive no semantic
usage credit; containment depth shall be exactly two beneath the root.

STRUCT-02: The semantic graph shall have exactly thirteen reachable
responsibility-bearing usages, thirty-five resolved directed semantic
connections, and one weakly connected semantic region. Every usage shall have
owner-local contract evidence and participate in a boundary-involving path.

STRUCT-03: Generated support is limited to transparent containment routing,
typed ports/data, closed enums/records, fan-out wires, context/visual nodes, and
exactly nine root-to-Process boundary delegations. With thirty-five semantic
connections, at most forty-four raw `PortConnection` declarations are
authorized; support may add no behavior, state, semantic interaction, or case.

ANALYSIS-01: A deterministic bounded analyzer shall enumerate all values of
five finite root inputs for every reachable triple of prior confidence,
attention, and session states, execute each owner-local relation, and compare
the composed result with an independently represented direct oracle.

ANALYSIS-02: Reachability shall begin at `(Untrusted, Attention, Idle)` and be
closed under all input snapshots before end-to-end comparison. The analyzer
shall report the reachable state triples and exact evaluation count rather than
assuming every Cartesian state triple is reachable.

ANALYSIS-03: The exact snapshot domain is
`5 * 8 * 4 * 4 * 10 = 6,400` combinations. The three prior-state domains admit
at most `3 * 2 * 4 = 24` triples, so reachability closure and owner/oracle
comparison require at most 153,600 pipeline evaluations before scenario
checks; the retained analyzer shall report the smaller exact count if some
triples are unreachable and shall retain witnesses for every counted case and
scenario family.

ANALYSIS-04: The bounded ownership audit shall execute the thirteen canonical
owner-local relations separately, including PART-01 request-result derivation
and PART-13 authorization/status composition. It shall reject forwarding,
invertible decoding, credited copies/bundles, central recomputation, or any
owner/analyzer mismatch even when end-to-end public outputs happen to agree.

ANALYSIS-05: End-to-end fault-vector coverage shall quantify and check every
vector reachable through the declared root input domains and reachable prior
states; it shall not demand an impossible root snapshot. Separately, PART-10's
owner-local contract shall be exercised directly over all 32 combinations of
its five Boolean inputs, with exact vector preservation and aggregate OR. The
retained evidence before this revision observed 24 root-reachable vectors over
11 reachable state triples and 70,400 pipeline evaluations; Model regeneration
shall recompute and report those exact results rather than treat them as
assumptions.

PASS-01: Structural acceptance requires exact metrics `13/35/23/10`, one root,
depth two, one semantic region, exactly nine boundary delegations, resolved
typed directions, thirteen nonidentity owner-local relations, and no credited
support element.

PASS-02: Behavioral acceptance requires zero partition gaps or overlaps, zero
owner-composition/oracle differences, zero state/output mismatches, zero
priority violations, zero fault-vector/OR mismatches, zero authorization under
aggregate fault, zero stale-request recoveries, witnesses for all twenty-three
cases, witnesses for all ten scenario families using only root-reachable fault
vectors, coverage of every root-reachable fault vector, and a separate exact
all-32-vector local check of PART-10. It shall not require interface fault and
session conflict to be true in the same root snapshot.

PASS-03: Trace acceptance requires complete coverage of all actionable IDs,
all significant model elements explained, exact interaction recount after
repairs, and no centralized recomputation of PART-01, PART-06, PART-08,
PART-10, PART-11, or PART-13 ownership.

PASS-04: Validation acceptance requires the realized system to remain a
battery-evidence and charging-qualification supervisor, keep lifecycle as
read-only context, preserve source/pilot/architecture/deferred distinctions,
and make none of the prohibited claims in `DEFER-01`.

PASS-05: Mechanical success does not establish physical validity, safety, or
fitness for a real drone. Designer validation shall remain separate from
typechecking, bounded enumeration, and contract conformance.

## Resolved Model-review findings

MODEL-RES-01: The supported declarative subset is sufficient in principle for
three owner-local states, `initialize`, prior-state references through
`In(...)`, effective Boolean case guards, typed ports, closed enums, and
attribute-bearing records. This resolves realizability for generation but does
not claim an execution schedule or a completed typecheck.

MODEL-RES-02: Typed winning-case identifiers may cross the PART-11/PART-12 and
PART-11/PART-01 boundaries, and `PublicDecisionFacts` may cross the
PART-01/PART-13 boundary. Downstream contracts may inspect exact identifiers
and fields but shall not reproduce upstream effective guards.

MODEL-RES-03: Independent owner-pipeline and direct-oracle representations,
reachable-state closure, and retained case/scenario witnesses are required and
bounded as stated in `ANALYSIS-01..04`; no generated contract predicate may be
called as the oracle. The resumed bounded evidence narrows end-to-end fault
coverage to root-reachable vectors under `ANALYSIS-05` while preserving direct
all-32-vector verification of PART-10.

## Explicit disposition

DISP-01: This revised System Abstract is the explicitly approved final baseline
at the declared hard tier. Model regeneration is authorized only within this
exact boundary, ownership allocation, `13/35/23/10` metric point, interaction
inventory, local-contract partition, priority, fault propagation, recovery,
composition, bounded-analysis, generated-support, trace, and deferred-claim
boundary. This second Designer resolution changes only the reachability terms
of `SCN-10` and `PASS-02`; it does not weaken or change any owner relation,
policy truth table, state case, root domain, or frozen seed constraint.
