---
abstract_id: SA-20260812-DRONE-GOVERNOR-HARD-R1-A1-APPROVED
domain_seed: drone-logical-domain-20260812t143051z
seed_status: frozen
campaign_complexity: hard
semantic_usage_bounds: [13, 16]
semantic_interaction_bounds: [22, 35]
nontrivial_contract_case_bounds: [21, 30]
scenario_family_bounds: [9, 12]
selected_semantic_usage_count: 13
selected_semantic_interaction_count: 35
selected_nontrivial_contract_case_count: 30
selected_scenario_family_count: 11
root_system_usage_count: 1
semantic_containment_depth: [1, 2]
semantic_region_count: 1
requires_multiple_state_or_decision_owners: true
requires_priority: true
requires_fault_propagation: true
requires_recovery: true
requires_composition: true
executable_profile: false
status: approved
---

# Logical drone lifecycle and energy governor

## Synopsis, need, purpose, and scope

NEED-01: A pilot needs one coherent logical disposition of charge, readiness,
flight-lifecycle, energy-confidence, and fault evidence instead of independent
source-named events whose authority and priority are unspecified.

PURPOSE-01: The system shall accept one finite observation/request snapshot per
logical evaluation step and issue one complete, mutually consistent supervision
tuple governing charge permission, launch permission, flight intent, propulsion
permission, public lifecycle phase, request disposition, battery notice, and
fault indications.

SCOPE-01: The selected scope is the seed's drone-lifecycle-governor alternative,
expanded coherently to include battery awareness, charger condition, abstract
navigation and flight-control support, and qualified home/touchdown evidence
only where they affect the selected lifecycle policy.

SCOPE-02: The system is a logical supervisor. The pilot, battery reporter,
charger, navigation support, flight control, home/touchdown evidence sources,
propulsion, and physical vehicle are outside its boundary. Flight dynamics,
trajectory generation, sensing performance, camera use, obstacle avoidance,
radio peers, fire detection, mapping, dispatch, suppression, and physical
charging are outside.

MISSION-01: For this pilot, “launch” means enter the logical `Flying` phase and
“stop flight” is refined into explicit `Return` and `Land` requests. These are
declared abstractions, not interpretations asserted by the frozen seed.

## Evidence and claim classes

EVID-HBK-01: Handbook-derived methodology requires an implementation-independent
need and boundary, explicit assumptions, alternatives, cohesive allocation,
bidirectional traceability, measurable verification criteria, and validation
separate from tool conformance. These are process obligations, not drone facts.

EVID-SEED-01: Source-grounded seed facts are limited to the recognizable drone
and forest-fire-observation context; lifecycle vocabulary `off`, `standby`,
`charging`, `ready`, and `flying`; battery/charging and qualitative capacity
awareness; low-battery notice toward flight control; navigation-related,
radio, camera, obstacle-sensing, flight-control, propulsion, and landing-gear
vocabulary; a pilot; and charger/charging context.

EVID-SEED-02: The seed expressly leaves event initiators, authority, exact
interfaces, state semantics, policies, priorities, faults, recovery, contracts,
scenarios, and architecture open. Its inconsistent engine configuration shall
not support an engine-count rule or invariant.

EVID-PILOT-01: The finite values, logical evaluation-step semantics, validity
statuses, `Returning` and `Landing` phases, two-step battery-confidence recovery,
eligibility rules, priorities, faults, and scenario oracles below are pilot
abstractions selected for this run. They are not handbook facts or physical
claims.

EVID-DESIGN-01: The thirteen revised `PART-*` responsibilities, thirty-five
`INT-*` directed interactions, nonidentity ownership allocation, and one-root
containment bounds are the approved architecture. They constrain realization
without selecting an algorithm, programming language, scheduler, deployment,
or physical topology.

EVID-DEFER-01: Formal proof, code generation, execution, physical validity,
real-time behavior, reliability, safety, certification, production readiness,
and forest-observation effectiveness are deferred and shall remain `not-run`.

EVID-HANDOFF-01: No Designer-targeted repair request or visualization decision
exists for this resolution. The retained Model review is the authoritative
handoff; this revision changes internal ownership and routes only and does not
modify the frozen seed or public policy.

## Goals

GOAL-01: The system shall produce exactly one value for every controlled
quantity for every reachable state pair and every admitted finite input
snapshot.

GOAL-02: The system shall resolve simultaneously applicable lifecycle,
request, energy, and fault conditions according to the explicit first-match
priority partition `CASE-L-01` through `CASE-L-26`.

GOAL-03: The system shall expose each declared local fault, propagate their
exact disjunction, apply the assigned mitigation, and recover only with the
specified correction evidence and fresh-request behavior.

GOAL-04: Multiple state and decision owners shall compose to the same result as
the direct thirty-case policy oracle, with no hidden state, central
recomputation of owner-local decisions, or identity-wrapper ownership credit.

GOAL-05: The system should expose logical readiness and lifecycle status useful
to a pilot without claiming physical flight, endurance, observation, or safety
performance.

## Operational context and exact boundary

CTX-01: The pilot supplies one lifecycle request and receives phase, request
disposition, battery notice, and fault status. The pilot is responsible for
supplying the intended current request; the governor neither authenticates the
pilot nor stores a rejected or preempted request.

CTX-02: The battery-reporting context supplies one qualitative band with an
independent validity status. It is responsible for the admitted encoding, not
for physical accuracy proven by this model.

CTX-03: The charger context supplies connection/health state and receives
charge permission. Physical charging and charge completion are outside.

CTX-04: The navigation-support context supplies abstract usability. Position,
trajectory, GPS, inertial, barometric, and obstacle computations are outside.

CTX-05: The flight-control context supplies abstract availability and receives
flight intent plus launch permission. Vehicle-control laws are outside.

CTX-06: The home-evidence context supplies value and validity for arrival at an
abstract home condition. Return-to-home control is not modeled or claimed.

CTX-07: The touchdown-evidence context supplies value and validity for an
abstract completed-touchdown condition. Landing gear does not itself satisfy
this evidence.

CTX-08: The propulsion/vehicle context receives propulsion permission. Engine
count, motor control, thrust, and physical motion are outside.

CTX-09: The logical evaluation context presents a simultaneous snapshot and
retains no state on behalf of the system. An evaluation step defines ordering
only and has no duration or real-time guarantee.

MON-01: `request`, from CTX-01, is exactly one of `None`, `SwitchOn`,
`SwitchOff`, `StartCharge`, `StopCharge`, `Activate`, `Deactivate`, `Launch`,
`Return`, or `Land`.

MON-02: `batteryReport`, from CTX-02, is the product of band `Full`, `Medium`,
`Low`, or `Critical` and status `Valid` or `Invalid`.

MON-03: `chargerReport`, from CTX-03, is exactly `Disconnected`,
`ConnectedHealthy`, or `ConnectedFaulted`.

MON-04: `navigationReport`, from CTX-04, is exactly `Usable` or `Unusable`.

MON-05: `flightControlReport`, from CTX-05, is exactly `Available` or `Faulted`.

MON-06: `homeReport`, from CTX-06, is the product of value `Away` or `Reached`
and status `Valid` or `Invalid`.

MON-07: `touchdownReport`, from CTX-07, is the product of value `NotConfirmed`
or `Confirmed` and status `Valid` or `Invalid`.

CTRL-01: `phase`, to CTX-01, is exactly `Off`, `Standby`, `Charging`, `Ready`,
`Flying`, `Returning`, or `Landing`.

CTRL-02: `requestResult`, to CTX-01, is exactly `None`, `Accepted`, `Rejected`,
or `Preempted`.

CTRL-03: `batteryNotice`, to CTX-01, is exactly `Untrusted`, `Clear`, `Low`, or
`Critical`.

CTRL-04: `faultStatus`, to CTX-01, contains battery, charger, navigation,
flight-control, home-evidence, touchdown-evidence, and aggregate fields, each
exactly `Clear` or `Asserted`.

CTRL-05: `chargePermission`, to CTX-03, is exactly `Denied` or `Permitted`.

CTRL-06: `flightIntent`, to CTX-05, is exactly `Hold`, `Launch`, `Continue`,
`Return`, or `Land`.

CTRL-07: `launchPermission`, to CTX-05, is exactly `Denied` or `Permitted`.

CTRL-08: `propulsionPermission`, to CTX-08, is exactly `Disabled` or `Enabled`.

## Essential assumptions and constraints

ASM-01: CTX-09 is responsible for presenting exactly one coherent value for
each `MON-*` per logical step. Rationale: atomic snapshot semantics are needed
to make priority and composition finite and unambiguous.

ASM-02: CTX-01 through CTX-07 are responsible for using only the closed values
declared above. Rationale: the bounded analyzer and exhaustive partitions apply
only to this finite domain.

ASM-03: CTX-02, CTX-06, and CTX-07 are responsible for pairing status with
value. `Invalid` is authoritative, while `Valid` is admitted rather than
independently diagnosed. Rationale: the governor must not silently trust a
value explicitly marked invalid.

ASM-04: CTX-02 is responsible for mapping any physical battery condition to a
qualitative band. The system assumes no unit, threshold, precision, discharge
rate, capacity, or endurance. Rationale: none is source-grounded.

ASM-05: Initial system state is phase `Off` and battery confidence `Untrusted`.
Rationale: safe logical initialization is required for deterministic analysis,
but is a pilot choice rather than an enum-order inference.

ASM-06: A request exists only in the current snapshot. Rejected, preempted, or
completed requests are not latched; after fault correction or confidence
recovery, the requested action occurs only if a fresh applicable request is
present. Rationale: stale intent must not become an uncommanded transition.

CONSTR-01: Exactly one explicit root system usage shall contain all selected
semantic usages in one weakly connected semantic region at depth one or two.
One behavior-free support container is permitted at depth one only if every
`PART-*` remains at depth two and all routes are transparent generated support.

CONSTR-02: Routing ports, containment routes, fan-out wiring, record fields,
closed value types, the root, context actors, visualization nodes, and a
behavior-free support container receive no semantic-usage, interaction,
decision-owner, state-owner, or contract-case credit.

SUPPORT-01: Generated support is limited to one behavior-free Process at depth
one, thirteen contract-bearing Threads at depth two, required typed ports and
flat record attributes, transparent fan-out wiring, and exactly eleven
root-to-Process boundary delegations in addition to the thirty-five semantic
connections. Support shall add no guard, transformation, state, decision,
semantic interaction, contract case, or ownership credit.

## Selected semantic usages and ownership

PART-01: Request Applicability Classification Owner shall classify `MON-01`
many-to-one as `Absent` for `None`, `Power` for `SwitchOn` or `SwitchOff`,
`Charge` for `StartCharge` or `StopCharge`, `Readiness` for `Activate`,
`Deactivate`, or `Launch`, and `Airborne` for `Return` or `Land`. Exact intent
facts may be emitted as uncredited support; it owns no state or lifecycle
result.

PART-02: Battery Evidence Qualifier shall derive valid-band facts and suppress
all band applicability when status is invalid; it owns no confidence state.

PART-03: Charger Evidence Qualifier shall derive connected, healthy-connected,
and charger-fault facts from `MON-03`; these facts are not a one-to-one rename.

PART-04: Charge Eligibility Owner shall combine current qualified battery
evidence from PART-08 with charger facts from PART-03 to derive charge-entry
eligibility, charge-retention eligibility, and evidence-driven charge-exit
requirement. It owns no state.

PART-05: Flight Readiness Owner shall combine current qualified battery
evidence with raw navigation and flight-control reports to derive the single
activation/launch readiness fact. It owns no state.

PART-06: Home Evidence Qualifier shall derive `arrivalEstablished` only from
valid `Reached`, plus a separate home-evidence fault; it shall never equate an
invalid value with arrival.

PART-07: Touchdown Evidence Qualifier shall derive `touchdownEstablished` only
from valid `Confirmed`, plus a separate touchdown-evidence fault.

PART-08: Battery Confidence Owner shall own the sole `Untrusted`, `Confirming`,
or `Trusted` confidence state and derive current battery usability from the
newly updated confidence in the same step.

PART-09: Airborne Hazard Proposal Owner shall combine current qualified battery
evidence with raw navigation and flight-control reports to derive the
emergency-land proposal required by `CASE-L-01` and the forced-return proposal
required by `CASE-L-03`. It owns neither phase applicability nor final priority.

PART-10: Airborne Request Proposal Owner shall classify the ten request values
many-to-one as `ReturnRequested`, `LandRequested`, or `NoAirborneRequest`.
Exact request facts are uncredited support; it owns no arrival, touchdown,
persistent phase, or final-priority decision.

PART-11: Fault Aggregation Owner shall derive battery fault from the
three-valued confidence state and derive aggregate fault as the exact
disjunction of all six current local fields. Receiving and assembling the other
five local fields is mandatory forwarding/bundling without ownership credit;
it owns neither confidence recovery nor lifecycle mitigation.

PART-12: Lifecycle Priority Owner shall own the sole lifecycle phase state,
apply `CASE-L-01` through `CASE-L-26` in first-match order, and emit the winning
case, prior/next phase, primitive request-effect evidence, and the connected
eligibility facts needed to authorize the winning result. It receives
qualified arrival and touchdown evidence directly from PART-06 and PART-07.

PART-13: Outcome Composition Owner shall derive request disposition, battery
notice, flight intent, charge/launch/propulsion permissions, and the atomic
public tuple from PART-08, PART-11, and PART-12 outputs. Copying next phase and
the fault vector is mandatory but uncredited. It owns no persistent state and
shall not recompute a winning lifecycle case.

OWN-AUDIT-01: Persistent state ownership is exactly PART-08 for confidence and
PART-12 for phase. Decision ownership is plural and non-overlapping: PART-01
owns request-family classification; PART-02, PART-03, PART-06, and PART-07 own
qualified evidence facts; PART-04 owns charge eligibility; PART-05 owns flight
readiness; PART-09 owns airborne-hazard proposals; PART-10 owns airborne-request
classification; PART-11 owns battery-fault classification and aggregate
disjunction; PART-12 owns priority/case selection; and PART-13 owns the
nonidentity public-output equations.

OWN-AUDIT-02: Every `PART-*` derives at least one owner-local nonidentity
behavioral fact from assigned inputs. Exact intent decoding, raw binary report
decoding, local-fault forwarding, next-phase copying, fault-vector copying,
bundling, renaming, or central recomputation receives no ownership credit and
fails the audit if it is the usage's only claimed behavior.

LOCAL-CON-01: Each PART contract shall expose its declared local relation over
only incoming `INT-*` values, with PART-08 and PART-12 alone referring to their
owned prior state. PART-04, PART-05, PART-09, and PART-10 shall expose the
revised substantive relations; no downstream owner or analyzer may recreate
them from sibling or root inputs.

LOCAL-CON-02: The analyzer ownership record shall credit PART-01 only for
request-family classification, PART-11 only for confidence-to-battery-fault
classification and aggregate disjunction, and PART-13 only for request result,
battery notice, flight intent, and permission equations. Uncredited support
relations shall remain visible and testable but shall not be reported as
semantic ownership.

## Complete typed directed semantic interaction inventory

INT-01: CTX-01 provides the `request` value to PART-01.

INT-02: CTX-02 provides the band/status `batteryReport` to PART-02.

INT-03: CTX-03 provides `chargerReport` to PART-03.

INT-04: CTX-04 provides `navigationReport` to PART-05 for readiness.

INT-05: CTX-05 provides `flightControlReport` to PART-05 for readiness.

INT-06: CTX-06 provides the value/status `homeReport` to PART-06.

INT-07: CTX-07 provides the value/status `touchdownReport` to PART-07.

INT-08: CTX-04 provides `navigationReport` to PART-09 for airborne-hazard
policy.

INT-09: PART-01 provides request semantics to PART-10 for airborne-request
classification.

INT-10: PART-01 provides exact request semantics and request family to PART-12.

INT-11: PART-02 provides qualified battery-band evidence to PART-08.

INT-12: PART-08 provides qualified band, new confidence, and battery usability
to PART-04.

INT-13: PART-08 provides qualified band, new confidence, and battery usability
to PART-05.

INT-14: PART-08 provides new confidence to PART-11 for battery-fault
classification.

INT-15: PART-08 provides qualified band and new confidence to PART-13 for the
battery-notice composition rule.

INT-16: PART-03 provides connected, healthy-connected, and charger-fault facts
to PART-04.

INT-17: PART-03 provides the charger-fault fact to PART-11.

INT-18: CTX-04 provides `navigationReport` to PART-11 for the current local
fault.

INT-19: CTX-05 provides `flightControlReport` to PART-09 for airborne-hazard
policy.

INT-20: CTX-05 provides `flightControlReport` to PART-11 for the current local
fault.

INT-21: PART-08 provides qualified band, new confidence, and battery usability
to PART-09.

INT-22: PART-04 provides charge-entry, charge-retention, and charge-exit facts
to PART-12.

INT-23: PART-05 provides activation/launch readiness to PART-12.

INT-24: PART-06 provides arrival-established and validity facts to PART-12.

INT-25: PART-06 provides the home-evidence-fault fact to PART-11.

INT-26: PART-07 provides touchdown-established and validity facts to PART-12.

INT-27: PART-07 provides the touchdown-evidence-fault fact to PART-11.

INT-28: PART-09 provides emergency-land and forced-return proposals to PART-12.

INT-29: PART-10 provides the airborne-request proposal to PART-12.

INT-30: PART-11 provides the six-fault vector and aggregate fault to PART-13.

INT-31: PART-12 provides winning case, prior/next phase, primitive
request-effect evidence, and connected charge/launch eligibility facts to
PART-13.

INT-32: PART-13 provides phase, request result, battery notice, and fault status
to CTX-01.

INT-33: PART-13 provides charge permission to CTX-03.

INT-34: PART-13 provides flight intent and launch permission to CTX-05.

INT-35: PART-13 provides propulsion permission to CTX-08.

INT-AUDIT-01: The complete inventory is exactly `INT-01` through `INT-35`:
eleven boundary-input fan-out interactions, twenty internal owner-to-owner
flows, and four boundary outputs. Each has one source, one destination, and a
distinct required domain trace; eleven root-to-Process delegations are
transparent generated support and do not change this semantic count.

## Policy, priority, and complete contract partitions

POL-01: Battery confidence shall update before all other current-step decisions;
the newly updated confidence and not the prior confidence determines current
battery usability.

POL-02: Charge entry requires trusted battery, band other than `Full`, and a
healthy-connected charger. Activation and launch require trusted `Medium` or
`Full`, usable navigation, and available flight control.

POL-03: First-match lifecycle priority is: airborne emergency landing; forced
landing while returning; forced return while flying; explicit airborne land;
explicit airborne return; qualified arrival; qualified touchdown; ground
battery fallback; ready low/critical fallback; then phase-specific switch,
charge, activation, launch, and retention behavior in the order below.

BEH-01: PART-08 shall implement exactly the following four mutually exclusive
and exhaustive confidence-state cases.

CASE-A-01: Any prior confidence with an invalid battery report yields new
`Untrusted` and battery unusable.

CASE-A-02: Prior `Untrusted` with a valid report yields new `Confirming` and
battery unusable.

CASE-A-03: Prior `Confirming` with a valid report yields new `Trusted` and
battery usable.

CASE-A-04: Prior `Trusted` with a valid report retains `Trusted` and battery
usable.

BEH-02: PART-12 shall implement exactly the following twenty-six effective
guards in listed order. Each later effective guard excludes every earlier
matching guard; the first match alone owns next phase.

CASE-L-01: Prior `Flying`, `Returning`, or `Landing` with unusable battery,
trusted `Critical`, or faulted flight control yields `Landing`.

CASE-L-02: Other prior `Returning` with unusable navigation yields `Landing`.

CASE-L-03: Other prior `Flying` with unusable navigation or trusted `Low` yields
`Returning`.

CASE-L-04: Other prior `Flying` or `Returning` with current request `Land` yields
`Landing`.

CASE-L-05: Other prior `Flying` with current request `Return` yields `Returning`.

CASE-L-06: Other prior `Returning` with qualified arrival established yields
`Landing`.

CASE-L-07: Other prior `Landing` with qualified touchdown established and
current activation/launch readiness yields `Ready`.

CASE-L-08: Other prior `Landing` with qualified touchdown established yields
`Standby`.

CASE-L-09: Other prior `Standby`, `Charging`, or `Ready` with unusable battery
yields `Standby`.

CASE-L-10: Other prior `Ready` with trusted `Low` or `Critical` yields `Standby`.

CASE-L-11: Prior `Off` with current request `SwitchOn` yields `Standby`.

CASE-L-12: Other prior `Off` remains `Off`.

CASE-L-13: Other prior `Standby` with current request `SwitchOff` yields `Off`.

CASE-L-14: Other prior `Standby` with current request `StartCharge` and charge
entry eligible yields `Charging`.

CASE-L-15: Other prior `Standby` with current request `Activate` and current
activation readiness yields `Ready`.

CASE-L-16: Other prior `Standby` remains `Standby`.

CASE-L-17: Other prior `Charging` with current request `SwitchOff` yields `Off`.

CASE-L-18: Other prior `Charging` with current request `StopCharge`, charger not
healthy-connected, or trusted `Full` yields `Standby`.

CASE-L-19: Other prior `Charging` remains `Charging`.

CASE-L-20: Other prior `Ready` with current request `SwitchOff` yields `Off`.

CASE-L-21: Other prior `Ready` with current request `Deactivate` yields
`Standby`.

CASE-L-22: Other prior `Ready` with current request `Launch` and current launch
readiness yields `Flying`.

CASE-L-23: Other prior `Ready` remains `Ready`.

CASE-L-24: Other prior `Flying` remains `Flying`.

CASE-L-25: Other prior `Returning` remains `Returning`.

CASE-L-26: Other prior `Landing` remains `Landing`.

CASE-AUDIT-01: The counted contract partition is exactly thirty nontrivial
cases: `CASE-A-01` through `CASE-A-04`, owned by PART-08, and `CASE-L-01` through
`CASE-L-26`, owned by PART-12. Qualification, proposal, fault, composition,
initialization, and routing clauses are mandatory but shall not be relabeled as
additional counted cases.

BEH-03: PART-13 shall map the winning resolution to outputs atomically. Entry to
`Flying` commands `Launch`; retained `Flying` commands `Continue`; next
`Returning` commands `Return`; next `Landing` commands `Land`; all other next
phases command `Hold`. Propulsion is enabled exactly when intent is not `Hold`.
Charge is permitted exactly when next phase is `Charging` and charge retention
remains eligible. Launch is permitted exactly when next phase is `Ready` and
current launch readiness holds.

BEH-04: PART-13 shall set `batteryNotice` to `Untrusted` unless new confidence
is `Trusted`; under trusted confidence, band `Low` maps to `Low`, `Critical` to
`Critical`, and `Medium` or `Full` to `Clear`.

BEH-05: From PART-12's primitive request-effect evidence, PART-13 shall classify
a current request that causes the winning transition as `Accepted`, an
otherwise-applicable request defeated by an earlier priority case as
`Preempted`, a non-`None` wrong-phase or failed-gate request as `Rejected`, and
request `None` as result `None`. PART-12 shall not preselect the four-valued
result. No rejected or preempted request shall change the winning command or be
retained for a later step.

BEH-06: PART-11 shall classify battery fault as new confidence not `Trusted`,
receive charger fault as `ConnectedFaulted`, derive navigation fault as
`Unusable` from the raw navigation report, derive flight-control fault as
`Faulted` from the raw flight-control report, and receive home and touchdown
faults as status `Invalid`; aggregate fault is exactly their disjunction.
Only battery classification and aggregate disjunction receive PART-11 owner
credit.

BEH-07: The composed owner-to-owner relation across `INT-01` through `INT-35`
shall equal a separately expressed direct thirty-case oracle for every admitted
snapshot and reachable state pair. The oracle is checking evidence and shall
not become a second architecture or a central implementation that erases local
ownership.

## Fault propagation, risks, and recovery

RISK-01: Invalid battery evidence, trusted `Critical`, or flight-control fault
while airborne could otherwise permit continued flight contrary to the pilot
policy.

FAULT-01: The assigned evidence, confidence, hazard-proposal, priority, and
fault owners shall propagate each initiating condition to PART-11 and/or
PART-12 as required; `CASE-L-01` shall select `Landing`. Battery usability shall
recover only after the two consecutive valid transitions `CASE-A-02` then
`CASE-A-03`; trusted `Critical` is a lifecycle trigger but is not itself one of
PART-11's six faults.

RISK-02: Navigation loss could otherwise leave an airborne phase without a
deterministic mitigation sequence.

FAULT-02: Navigation loss in `Flying` shall select `Returning`; continued loss
in `Returning` shall select `Landing`. Later correction shall clear the local
fault but shall not reverse a selected `Returning` or `Landing` phase.

RISK-03: Invalid home or touchdown evidence could otherwise falsely complete
return or landing.

FAULT-03: Invalid evidence shall assert its local and aggregate faults and
establish neither arrival nor touchdown. Correction clears the local fault
immediately, but completion requires current valid affirmative evidence.

RISK-04: Charger disconnect or fault could otherwise permit entry to or
retention of logical charging.

FAULT-04: A charger that is not healthy-connected shall block `CASE-L-14` and
force `CASE-L-18` from `Charging`; only `ConnectedFaulted` asserts charger fault.
After a blocked entry or forced exit, correction alone shall not enter
`Charging`; a fresh current `StartCharge` request is required.

RISK-05: Independently derived fault and command paths could otherwise publish
an inconsistent tuple or stale aggregate fault.

FAULT-05: PART-13 shall publish PART-11's exact current fault vector together
with the same-step PART-12 resolution. Every corrected non-battery local fault
clears immediately; battery fault clears only when new confidence becomes
`Trusted`; aggregate clears exactly when all six locals clear.

REC-01: Recovery never implies automatic resumption of a prior request. A
restored gate may permit retention already selected by the state partition,
but any new charge, activate, or launch transition requires the corresponding
fresh current request.

## Observable modes and transitions

MODE-01: `Off` holds all permissions disabled and accepts only current
`SwitchOn` through `CASE-L-11`.

MODE-02: `Standby` may accept eligible charge or activation and otherwise
holds; `SwitchOff` is observable through transition to `Off`.

MODE-03: `Charging` permits charge only while current retention eligibility
holds and exits on stop, switch-off, full band, disconnect, or charger fault.

MODE-04: `Ready` may accept eligible launch or deactivate and otherwise holds;
loss of usable/sufficient battery selects `Standby`.

MODE-05: `Flying` distinguishes launch entry from continued flight and can be
preempted by emergency landing, forced/requested return, or requested land.

MODE-06: `Returning` commands `Return` until emergency landing, navigation
loss, requested land, or valid arrival selects `Landing`.

MODE-07: `Landing` commands `Land` until valid touchdown selects `Ready` when
currently ready-eligible, otherwise `Standby`.

TRANS-01: All allowed transitions are exactly those selected by
`CASE-L-01` through `CASE-L-26`; no model transition may bypass or supplement
that partition.

## Required bounded scenario families

SCN-01: Nominal startup and launch shall witness `Off --SwitchOn--> Standby
--Activate--> Ready --Launch--> Flying` after confidence becomes trusted and
all readiness gates hold; all three action requests are accepted.

SCN-02: Nominal charging shall witness eligible entry, retained charging, and
exit on trusted `Full`, with charge permission permitted only during the
eligible `Charging` result.

SCN-03: Emergency priority shall combine an airborne emergency with a current
otherwise-applicable `Return` or `Land` request and show `CASE-L-01`, `Landing`,
the losing request preempted, and no losing-request command leak.

SCN-04: Low-battery sortie recovery shall show trusted `Low` in `Flying`
selecting `Returning`, valid `Reached` selecting `Landing`, and valid touchdown
selecting the correct readiness-dependent ground destination.

SCN-05: Navigation fault escalation shall show `Flying -> Returning -> Landing`
across persistent loss, then correction clearing navigation fault without
phase reversal.

SCN-06: Battery invalidity and recovery shall show immediate `Untrusted`, two
consecutive valid reports to `Confirming` then `Trusted`, and no activation or
launch from a stale pre-fault request; a fresh request is required.

SCN-07: Charger fault propagation and recovery shall separately show blocked
entry, forced charging exit, charger/aggregate assertion, correction clearing,
and a fresh `StartCharge` requirement.

SCN-08: Home-evidence qualification shall cover all four value/status pairs,
prove invalid or valid-away evidence cannot complete return, and show only
valid-reached selecting landing.

SCN-09: Touchdown qualification shall cover all four value/status pairs and
both valid-confirmed destinations (`Ready` and `Standby`) under different
current readiness evidence.

SCN-10: Concurrent-fault recovery shall introduce at least three local faults,
correct them in staggered order, and show exact local fields plus aggregate
remaining asserted until the last current local fault clears.

SCN-11: Composition and fresh-request disposition shall exercise an ineligible
current launch, a later gate recovery without launch request, then a fresh
eligible launch; owner-by-owner values and public tuple shall match the direct
oracle at every step.

SCN-AUDIT-01: The required family inventory is exactly `SCN-01` through
`SCN-11`. Each family has a distinct behavioral trace: nominal lifecycle,
charge lifecycle, priority, low-energy recovery, navigation escalation,
battery-confidence recovery, charger recovery, home qualification, touchdown
qualification, concurrent-fault composition, and fresh-request composition.

## Verification, bounded analysis, and trace obligations

VERIFY-01: Source inspection shall confirm exactly one root, thirteen reachable
`PART-*` semantic usages, all and only thirty-five `INT-*` semantic
interactions, depth one or two, one weakly connected semantic region, and no
credited wrapper. Pass criterion: exact counts and zero untraced usages or
interactions.

VERIFY-02: Contract inspection and bounded analysis shall prove the four
confidence effective guards and twenty-six lifecycle effective guards are each
mutually exclusive and exhaustive under first-match semantics. Pass criterion:
zero uncovered inputs, zero effective overlaps, and a reachability witness for
every counted case.

VERIFY-03: The finite raw snapshot domain is exactly `10 * 8 * 3 * 2 * 2 * 4 *
4 = 15,360`. The analyzer shall compute state-pair reachability from
`Off/Untrusted`, evaluate every raw snapshot for every reachable
phase/confidence pair, and report the reachable-pair count `R` rather than
assuming all 21 pairs. The exhaustive end-to-end bound is exactly `15,360 * R`
with `R <= 21`, hence no more than 322,560 snapshot/state-pair evaluations.

VERIFY-04: The analyzer shall compose the explicit revised `INT-*` owner
relations and compare them with a separately represented direct oracle. Pass
criterion: zero case, next-state, output, priority, request-result, local-fault,
aggregate-disjunction, charge/propulsion-exclusion, recovery, stale-request,
and composed-versus-oracle mismatches.

VERIFY-05: Scenario analysis shall retain at least one bounded step-by-step
witness for every `SCN-*` family. Pass criterion: all eleven families pass all
stated outcomes with no missing recovery or fresh-request step.

VERIFY-06: The ownership audit shall name every state, decision, case, and
credited output equation and cite owner-local contracts plus analyzer
relations. Pass criterion: exactly two persistent state owners, all thirty
cases assigned as in `CASE-AUDIT-01`, all thirteen usages exhibiting an
explicit nonidentity local relation, zero duplicate owners, zero central
recomputation, and zero decoder, forwarding, bundling, or copy credits.

VERIFY-07: Architecture-stage and final Sireum checks required by run policy
shall exit successfully; every endpoint shall resolve with compatible
direction/kind/type, and every controlled output shall be constrained. These
are future Model-stage gates, not current evidence.

VERIFY-08: Bidirectional trace analysis shall cover every actionable abstract
ID and every significant model element. Pass criterion: zero missing abstract
coverage and zero unexplained generated elements; transparent support must use
an explicit generated-support rationale.

VERIFY-09: Designer validation shall separately judge fitness against the need,
boundary, scenarios, priority, faults, recovery, composition, and claim limits.
Mechanical success alone does not satisfy validation.

TRACE-01: `NEED-01 -> PURPOSE-01 -> GOAL-01..GOAL-05`; `SCOPE-01`, `SCOPE-02`,
and `MISSION-01` constrain the selected boundary and validation judgment.

TRACE-02: `MON-01 -> INT-01`; `MON-02 -> INT-02`; `MON-03 -> INT-03`;
`MON-04 -> INT-04, INT-08, INT-18`; `MON-05 -> INT-05, INT-19, INT-20`;
`MON-06 -> INT-06`; `MON-07 -> INT-07`; `CTRL-01..CTRL-04 -> INT-32`;
`CTRL-05 -> INT-33`; `CTRL-06..CTRL-07 -> INT-34`; `CTRL-08 -> INT-35`.

TRACE-03: `PART-01..PART-13` are realized only through the revised owner-local
responsibilities and connected endpoints in `INT-01..INT-35`;
`OWN-AUDIT-01..OWN-AUDIT-02` govern nonidentity credit and prohibit credit for
support decoding, forwarding, bundling, or copying.

TRACE-04: `GOAL-02 -> POL-01..POL-03, CASE-A-01..CASE-A-04,
CASE-L-01..CASE-L-26`; `GOAL-03 -> FAULT-01..FAULT-05, REC-01`; `GOAL-04 ->
BEH-07, SCN-10..SCN-11`.

TRACE-05: `MODE-01..MODE-07` and `TRANS-01` are the observable projection of
the lifecycle cases; no independent transition source is authorized.

## Structural bounds and objective pass criteria

PASS-STR-01: The realization shall contain exactly thirteen semantic usages,
within `13..16`; exactly thirty-five semantic interactions, within `22..35`;
one explicit root; semantic containment depth `1..2`; and one weakly connected
semantic region.

PASS-CON-01: The realization shall contain exactly thirty counted nontrivial
contract cases, within `21..30`, with the owners and partition in
`CASE-AUDIT-01`; no vacuous, duplicate, split, or padded case receives credit.

PASS-SCN-01: The retained evidence shall cover exactly eleven scenario
families, within `9..12`, each with its distinct trace and objective outcomes.

PASS-OWN-01: PART-08 and PART-12 shall be the only persistent state owners;
PART-01, PART-04, PART-05, PART-09, PART-10, PART-11, PART-12, and PART-13 shall
retain their revised distinct classification, applicability, proposal,
aggregation, priority, and composition ownership, and every usage shall pass
the nonidentity behavioral-owner audit.

PASS-PRI-01: Every snapshot/reachable-state pair shall select exactly one
effective lifecycle case, and every simultaneous-condition witness shall obey
the declared priority without a losing-request command leak.

PASS-FLT-01: All six local faults and exact aggregate propagation, assigned
mitigations, staggered correction, confidence recovery, non-reversal, and
fresh-request rules shall pass bounded checks.

PASS-COMP-01: Explicit interaction-by-interaction composition shall produce a
complete atomic tuple equal to the direct oracle for the entire analyzed finite
domain, with no output inconsistency or charge/propulsion conflict.

PASS-TRC-01: Every actionable clause shall have model coverage or an explicit
deferred status, and every significant model element shall trace back or carry
a justified generated-support annotation.

PASS-TOOL-01: Retained architecture/final gates and the independent harness
Sireum gate shall pass against the same source revision. Tool success verifies
model conformance only within the declared scope.

PASS-VIZ-01: Exactly one native-resolution `system-overview` shall faithfully
show the root boundary, all thirteen semantic responsibilities, principal
flows, external actors as context, and both state owners without counting
support/routing as semantic content.

PASS-VAL-01: Final Designer review shall find the result faithful and plausible
as a logical lifecycle governor while rejecting any unsupported physical,
forest-fire, safety, engine-count, or executable claim.

## Explicitly deferred and prohibited claims

DEFER-01: Engine count/configuration consistency, flight dynamics, trajectory,
obstacle response, camera/radio behavior, payload, endurance, capacity,
discharge, charge rate, physical propulsion, landing behavior, and observation
performance are `not-run` and prohibited as acceptance claims.

DEFER-02: Real timing, concurrency, scheduling, deployment, code generation,
application behavior, simulation, and execution are `not-run`. The frozen seed
and run configuration declare no executable profile.

DEFER-03: Formal proof, universal correctness outside the finite domain,
physical validity, reliability, hazard classification, safety certification,
and production readiness are `not-run`.

DEFER-04: Typechecking, bounded enumeration, finite scenarios, and visualization
shall not be represented as physical validation, formal proof, or evidence
outside the declared logical boundary.
