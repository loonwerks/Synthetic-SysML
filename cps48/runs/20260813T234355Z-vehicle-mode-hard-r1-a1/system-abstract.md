---
abstract_id: SA-VEHICLE-START-POWER-HARD-01
domain_seed: 20260813T233941Z-vehicle-mode-seed-v1
campaign_complexity: hard
semantic_usage_count: 14
semantic_interaction_count: 35
nontrivial_contract_case_count: 29
scenario_family_count: 11
requires_multiple_state_or_decision_owners: true
requires_priority_fault_recovery_composition: true
requires_stateful_behavior: true
requires_fault_behavior: true
baseline_revision: designer-approved-02
---

# Protected Start and Power-Enablement Supervisor

## Synopsis, need, purpose, and scope

NEED-01: A vehicle supervisory boundary needs to decide when a requested start
may progress to logical power and fuel enablement, while making invalid
evidence, over-temperature, failed self-test, loss of electrical availability,
and unsafe start restraint observable and conservative.

PURPOSE-01: The system will qualify current command and readiness evidence,
retain thermal, self-test, recovery, and operating-session state, resolve
conflicting command/fault/recovery conditions by an exact priority, and control
one logical actuation disposition plus one supervisory status. It does not
control drivetrain physics or claim that a vehicle has physically started.

SCOPE-01: The finite boundary contains an external command report, brake-pedal
report, temperature report, electrical-power report, parking-brake report, and
self-test report. It controls logical fuel, electrical-power, and parking-brake
dispositions and reports the selected supervisory mode, readiness, recovery,
notice, and exact fault vector.

## Evidence and claim classes

METHOD-01: Handbook-derived method constraints require the need and boundary
before the internal allocation, explicit assumptions and owners, nominal and
off-nominal scenarios, compared alternatives, bidirectional coverage,
measurable criteria, and separate verification and validation. These are
method facts, not vehicle-domain facts.

SRC-01: Source-grounded seed facts are limited to a Vehicle and
VehicleController in road context; start/on/off, maintenance, degraded, and
return-to-normal vocabulary; brake-pedal, temperature/over-temperature,
self-test, electrical-power, parking-brake, fuel-command, and power-provision
vocabulary. The source does not supply a complete protocol or authority.

PILOT-01: The exact actors, closed types, validity meanings, threshold bands,
initial state, responsibility allocation, priority, two-observation recovery
rules, case guards, and scenario sequences below are pilot abstractions selected
for this run. They are assumptions beyond the source and are not production
vehicle requirements.

ARCH-01: The selected architecture is an implementation-independent design
decision comprising fourteen cohesive semantic usages and thirty-five typed
directed semantic interactions. It fixes responsibility and information
dependencies, but not algorithms, scheduling, deployment, encodings, user
interface, or thread structure.

DEFER-01: Torque, acceleration, braking force, fuel flow, battery behavior,
thermal units and thresholds, sensor physics, self-test implementation,
mechanical brake effect, timing, reliability, road safety, certification, and
production readiness are deferred and shall not be inferred from this model.

EVID-01: Verification means source inspection, structural and trace analysis,
contract-partition analysis, bounded finite analysis, and the run-policy tool
gates. Validation separately asks whether the retained realization preserves
this selected supervisory purpose and its claim boundary.

## Goals

GOAL-01: The system shall enable logical fuel only in the `On` session with no
current aggregate fault, and shall otherwise inhibit fuel.

GOAL-02: The system shall require qualified temperature, electrical supply,
self-test, pedal, and parking-brake evidence before accepting a fresh start.

GOAL-03: The system shall propagate six independently owned fault predicates
as an exact vector and shall derive aggregate fault as their Boolean OR without
discarding concurrent causes.

GOAL-04: The system shall enter or retain `Degraded` when a current fault has
priority, shall require clean requalification plus a fresh `ReturnToNormal`
request to leave it, and shall require a later fresh `Start` to re-enable.

GOAL-05: The logical fuel, electrical-power, parking-brake, mode, readiness,
recovery, notice, and fault outputs shall be mutually consistent with one
winning finite policy case per snapshot.

## Operational context and exact system boundary

CTX-01: The Command Authority is a pilot abstraction for the otherwise
unnamed origin of start, off, maintenance, and return-to-normal indications. It
supplies one current command report and receives supervisory status.

CTX-02: The Brake-Pedal Evidence Source supplies pedal condition and validity.
It remains responsible for the report; the supervisor does not model pedal or
braking mechanics.

CTX-03: The Temperature Evidence Source supplies a qualitative temperature
band and validity. The meaning of the selected bands is finite and logical,
not a calibrated physical threshold claim.

CTX-04: The Electrical-Power Evidence Source supplies logical availability and
validity. `Available` is permission evidence, not proof of voltage, energy, or
delivered power.

CTX-05: The Parking-Brake Evidence Source supplies logical applied/released
condition and validity. It does not prove mechanical holding force.

CTX-06: The Self-Test Evidence Source supplies the current logical progress or
result of a source-named self-test. The test procedure and completion
semantics are outside the boundary.

CTX-07: The Vehicle Command Recipient receives a logical actuation
disposition. It alone is responsible for any physical interpretation or
execution, which this abstract does not model.

TYPE-01: `CommandReport` is the product of command `None`, `Start`, `Off`,
`EnterMaintenance`, or `ReturnToNormal` and status `Valid` or `Invalid`.

TYPE-02: `BrakePedalReport` is the product of condition `Pressed` or
`Released` and status `Valid` or `Invalid`.

TYPE-03: `TemperatureReport` is the product of band `Nominal`, `Elevated`, or
`OverLimit` and status `Valid` or `Invalid`.

TYPE-04: `ElectricalPowerReport` is the product of availability `Available` or
`Unavailable` and status `Valid` or `Invalid`.

TYPE-05: `ParkingBrakeReport` is the product of condition `Applied` or
`Released` and status `Valid` or `Invalid`.

TYPE-06: `SelfTestReport` is the product of progress `Idle`, `Running`,
`Passed`, or `Failed` and status `Valid` or `Invalid`.

TYPE-07: `ActuationDisposition` is the product of fuel `Inhibit/Enable`,
electrical power `Isolate/Provide`, and parking brake `Apply/Release`.

TYPE-08: `SupervisoryStatus` is the product of session
`Off/Arming/On/Degraded/Maintenance`, start-ready Boolean, sustain-ready
Boolean, rearm state `Blocked/Confirming/Ready`, notice
`FaultAttention/RecoveryRequired/RecoveryConfirming/Maintenance/Starting/Enabled/Off`,
the six-bit fault vector, and aggregate-fault Boolean.

TYPE-09: `QualifiedCommandFacts` is the product of qualified command with the
same five command values and Boolean `selfTestResetRequested`; invalid input
always produces qualified `None` and reset false.

TYPE-10: `QualifiedPedalFacts` contains Boolean `pedalStartCondition`, true
exactly for valid `Pressed`.

TYPE-11: `QualifiedTemperatureObservation` is exactly `InvalidEvidence`,
`Nominal`, `Elevated`, or `OverLimit`; every invalid payload maps to the first.

TYPE-12: `QualifiedSupplyFacts` contains Boolean `supplyUsable`, true exactly
for valid `Available`.

TYPE-13: `QualifiedParkingBrakeFacts` contains Boolean
`brakeAppliedEvidence`, true exactly for valid `Applied`.

TYPE-14: `ThermalStateFacts` is the product of thermal state
`Blocked/Confirming/Clear` and Boolean `thermalClear`.

TYPE-15: `SelfTestStateFacts` is the product of self-test state
`Untested/Testing/Passed/Failed` and Boolean `selfTestPassed`.

TYPE-16: `StartRestraintFact` is one Boolean, true exactly when qualified pedal
and qualified parking-brake evidence are both asserted.

TYPE-17: `ReadinessFacts` is the product of Booleans `startReady` and
`sustainReady` with the equations assigned to PART-09.

TYPE-18: `ExactFaultSummary` is the product of the fixed-order six-bit vector
and Boolean `anyFault`.

TYPE-19: `RearmStateFacts` contains the exact new `Blocked/Confirming/Ready`
state; `RecoveryPermitFact` is a separate Boolean so PART-10 need not receive
unneeded recovery-status members.

TYPE-20: `SessionDecisionFacts` is the product of exact new session and cause
`CurrentFault/FreshRecoveryAccepted/RecoveryPending/OffAccepted/MaintenanceAccepted/StartAccepted/StartRejected/EnableCompleted/EnableAborted/OnSustained/ReadinessWithdrawn/NoApplicableRequest`.

TYPE-21: Each named command, pedal, thermal, supply, parking-brake, and
self-test `*FaultFact` interaction is Boolean. Fault fact identity is preserved
by its distinct typed port and fixed destination-vector position.

MON-01: `commandReport` from CTX-01 has exactly TYPE-01 and is a current
snapshot value; no command is implicitly queued.

MON-02: `brakePedalReport` from CTX-02 has exactly TYPE-02. A valid `Pressed`
condition contributes to start restraint; `Released` blocks start without
being a fault.

MON-03: `temperatureReport` from CTX-03 has exactly TYPE-03. Invalid payloads
have no band authority; valid `Elevated` and `OverLimit` are distinct.

MON-04: `electricalPowerReport` from CTX-04 has exactly TYPE-04. Valid
`Unavailable` blocks readiness but is not itself an evidence fault.

MON-05: `parkingBrakeReport` from CTX-05 has exactly TYPE-05. A valid `Applied`
condition contributes to start restraint; valid `Released` blocks start.

MON-06: `selfTestReport` from CTX-06 has exactly TYPE-06. Its meaning is only
the selected finite protocol below.

CTRL-01: `actuationDisposition` to CTX-07 has exactly TYPE-07 and is a logical
command tuple; it makes no claim that a physical effect occurred.

CTRL-02: `supervisoryStatus` to CTX-01 has exactly TYPE-08 and shall publish
the exact current owner decisions without recomputing their policies.

BOUND-01: MON-01 through MON-06 are the complete root input inventory and the
two CTRL clauses are the complete root output inventory. No unlisted
external entity or hidden root input may participate in a required case.

## Essential assumptions and constraints

ASM-01: CTX-01 is responsible for one TYPE-01 value per logical snapshot. The
single command enum excludes simultaneous external commands; priority is still
required between a command, a current fault, degraded retention, and recovery.

ASM-02: CTX-02 through CTX-06 are each responsible for pairing every payload
with explicit validity. On `Invalid`, the payload remains present only for type
completeness and shall be suppressed by its qualification owner.

ASM-03: The selected start-restraint abstraction requires both a valid pressed
pedal and a valid applied parking brake. This is a pilot policy, not a physical
or safety claim from the seed.

ASM-04: A valid `OverLimit` or any invalid temperature report is a current
thermal fault. `Elevated` is not a current fault but shall reset the nominal-
clearance streak to `Blocked`; thermal clearance then requires two subsequent
consecutive valid `Nominal` observations.

ASM-05: A valid unavailable electrical supply blocks readiness without setting
the supply-evidence fault; invalid supply evidence sets the fault. This keeps
ordinary unavailability distinct from corrupt evidence.

ASM-06: Self-test state is reset only by a valid current `Off` or
`EnterMaintenance` command with a nonfailed, valid self-test report. A failed
or invalid report has higher local priority than reset.

ASM-07: Two consecutive snapshots satisfying the complete clean-candidate
predicate move rearm from `Blocked` through `Confirming` to `Ready`. The count
is an analysis abstraction, not a timing or diagnostic-coverage claim.

ASM-08: Every evaluation uses one atomic logical snapshot and each state owner
uses its own prior state. Data dependencies follow INT-01 through INT-35; no
real period, latency, concurrency, or execution-order claim follows.

ASM-09: Initial persistent states are thermal `Blocked`, self-test `Untested`,
rearm `Blocked`, and session `Off`. Before a complete evaluation, CTRL-01 is
exactly `Inhibit/Isolate/Apply`, and CTRL-02 is exactly session `Off`,
`startReady=false`, `sustainReady=false`, rearm `Blocked`, notice `Off`, fault
vector `[false,false,false,false,false,false]`, and `anyFault=false`.

CONST-01: The realization shall contain exactly fourteen credited semantic
usages, thirty-five credited semantic interactions, twenty-nine counted
nontrivial contract cases, and eleven scenario families. Containers, ports,
delegations, types, context actors, and pure routing receive no credit.

## Semantic usages and responsibility ownership

PART-01: Command Qualification Owner shall suppress every invalid command to
qualified `None`, derive `commandEvidenceFault`, and derive the many-to-one
`selfTestResetRequested` fact for valid `Off` or `EnterMaintenance`. Copying the
qualified command for downstream owners receives no ownership credit.

PART-02: Brake-Pedal Qualification Owner shall suppress invalid condition,
derive `pedalStartCondition`, and derive `pedalEvidenceFault`; the two invalid
payload combinations intentionally collapse to the same qualified result.

PART-03: Temperature Qualification Owner shall collapse all invalid payloads
to `InvalidEvidence` and otherwise derive exactly one qualified band. It owns
payload applicability, not thermal persistence or fault recovery.

PART-04: Electrical-Supply Qualification Owner shall derive exactly one of
`Usable`, `Unavailable`, or `InvalidEvidence`, plus the supply-evidence fault.
It distinguishes a valid unavailable source from invalid evidence.

PART-05: Parking-Brake Qualification Owner shall suppress invalid condition,
derive `brakeAppliedEvidence`, and derive `parkingBrakeEvidenceFault`; it does
not decide start readiness.

PART-06: Thermal Clearance State Owner shall exclusively own prior/new state
`Blocked/Confirming/Clear`, derive `thermalClear`, and derive the current
thermal fault under CASE-THERM-01 through CASE-THERM-05.

PART-07: Self-Test Campaign State Owner shall exclusively own prior/new state
`Untested/Testing/Passed/Failed`, derive `selfTestPassed`, and derive the
persistent self-test fault under CASE-TEST-01 through CASE-TEST-07.

PART-08: Start-Restraint Decision Owner shall combine qualified pedal and
parking-brake facts to derive `startRestraintSatisfied` exactly when both are
valid and asserted. It owns no evidence validity or persistent state.

PART-09: Readiness Composition Owner shall derive `startReady` from usable
supply, thermal clearance, passed self-test, and satisfied start restraint; it
shall separately derive `sustainReady` without the pedal and parking-brake
terms.

PART-10: Operating-Session State and Priority Owner shall exclusively own
prior/new `Off/Arming/On/Degraded/Maintenance` and select exactly one
listed CASE-SESSION case. It owns the winning mode and transition cause, not output
actuation composition.

PART-11: Fault-Vector Composition Owner shall preserve, in fixed order,
command, pedal, thermal, supply, parking-brake, and self-test fault predicates
as an uncredited coherence obligation and shall derive their Boolean OR as
`anyFault`. Its semantic-usage and owner credit rests only on that nonidentity
six-input OR derivation; vector preservation, bundling, and publication receive
no ownership credit.

PART-12: Rearm Qualification State Owner shall exclusively own prior/new
`Blocked/Confirming/Ready`, derive the clean-candidate predicate, and derive
`recoveryPermit` only from current `Ready` plus a fresh valid
`ReturnToNormal` request.

PART-13: Actuation Composition Owner shall combine the new session decision
and exact aggregate-fault fact to derive CTRL-01 under POL-ACT-01. It shall not
rederive readiness, recovery, or a next mode.

PART-14: Supervisory Status and Notice Owner shall publish the exact resolved
session, readiness, rearm, and fault fields as uncredited coherence obligations
and shall derive only the prioritized notice classification under POL-NOTICE-01.
Its semantic-usage and owner credit rests only on that nonidentity notice
derivation; copying, bundling, and publishing upstream fields receive no
ownership credit. Before the first complete evaluation it shall initialize
CTRL-02 to the exact tuple required by ASM-09.

## Complete typed directed semantic interaction inventory

INT-01: CTX-01 provides `CommandReport` MON-01 to PART-01 for command
qualification.

INT-02: CTX-02 provides `BrakePedalReport` MON-02 to PART-02 for pedal-evidence
qualification.

INT-03: CTX-03 provides `TemperatureReport` MON-03 to PART-03 for temperature
applicability.

INT-04: CTX-04 provides `ElectricalPowerReport` MON-04 to PART-04 for supply
qualification.

INT-05: CTX-05 provides `ParkingBrakeReport` MON-05 to PART-05 for parking-
brake qualification.

INT-06: CTX-06 provides `SelfTestReport` MON-06 to PART-07 for campaign-state
resolution.

INT-07: PART-01 provides `QualifiedCommandFacts` to PART-07 for start/reset
effects on the self-test campaign.

INT-08: PART-01 provides `QualifiedCommandFacts` to PART-10 for operating-
session priority.

INT-09: PART-01 provides `QualifiedCommandFacts` to PART-12 for fresh recovery
permission.

INT-10: PART-01 provides `CommandFaultFact` to PART-11 for exact fault
aggregation.

INT-11: PART-02 provides `QualifiedPedalFacts` to PART-08 for combined start-
restraint judgment.

INT-12: PART-02 provides `PedalFaultFact` to PART-11 for exact fault
aggregation.

INT-13: PART-03 provides `QualifiedTemperatureObservation` to PART-06 for
thermal state and fault resolution.

INT-14: PART-04 provides `QualifiedSupplyFacts` to PART-09 for readiness
composition.

INT-15: PART-04 provides `SupplyFaultFact` to PART-11 for exact fault
aggregation.

INT-16: PART-05 provides `QualifiedParkingBrakeFacts` to PART-08 for combined
start-restraint judgment.

INT-17: PART-05 provides `ParkingBrakeFaultFact` to PART-11 for exact fault
aggregation.

INT-18: PART-06 provides `ThermalStateFacts` to PART-09 for start and sustain
readiness.

INT-19: PART-06 provides `ThermalFaultFact` to PART-11 for exact fault
aggregation.

INT-20: PART-07 provides `SelfTestStateFacts` to PART-09 for start and sustain
readiness.

INT-21: PART-07 provides `SelfTestFaultFact` to PART-11 for exact fault
aggregation.

INT-22: PART-08 provides `StartRestraintFact` to PART-09 for start readiness.

INT-23: PART-09 provides `ReadinessFacts` to PART-10 for session priority and
transition selection.

INT-24: PART-09 provides `ReadinessFacts` to PART-12 for clean-candidate
qualification.

INT-25: PART-09 provides `ReadinessFacts` to PART-14 for public status
composition.

INT-26: PART-11 provides `ExactFaultSummary` to PART-10 for fault-priority
session resolution.

INT-27: PART-11 provides `ExactFaultSummary` to PART-12 for recovery
qualification.

INT-28: PART-11 provides `ExactFaultSummary` to PART-13 for fail-safe
actuation composition.

INT-29: PART-11 provides `ExactFaultSummary` to PART-14 for exact status and
notice composition.

INT-30: PART-12 provides `RecoveryPermitFact` to PART-10 for the only allowed
exit from degraded session.

INT-31: PART-12 provides `RearmStateFacts` to PART-14 for recovery status.

INT-32: PART-10 provides `SessionDecisionFacts` to PART-13 for actuation
composition.

INT-33: PART-10 provides `SessionDecisionFacts` to PART-14 for mode and notice
composition.

INT-34: PART-13 provides `ActuationDisposition` CTRL-01 to CTX-07.

INT-35: PART-14 provides `SupervisoryStatus` CTRL-02 to CTX-01.

## Closed policy and contract partitions

POL-EVAL-01: Qualification and state outputs in a snapshot are the owner-local
facts consumed downstream in the same directed acyclic interaction graph.
Every prior-state reference is local to PART-06, PART-07, PART-10, or PART-12;
no other usage may retain or reconstruct those states.

CASE-THERM-01: If temperature evidence is invalid or valid `OverLimit`, PART-06
shall set new thermal state `Blocked`, set `thermalClear=false`, and set the
current thermal fault true, regardless of prior thermal state.

CASE-THERM-02: Otherwise, if the valid band is `Elevated`, PART-06 shall set new
thermal state `Blocked`, set `thermalClear=false`, and set current thermal
fault false, regardless of prior thermal state.

CASE-THERM-03: Otherwise, for valid `Nominal` with prior `Blocked`, PART-06
shall set new state `Confirming`, thermal clear false, and fault false.

CASE-THERM-04: Otherwise, for valid `Nominal` with prior `Confirming`, PART-06
shall set new state `Clear`, thermal clear true, and fault false.

CASE-THERM-05: Otherwise, for valid `Nominal` with prior `Clear`, PART-06 shall
retain `Clear`, thermal clear true, and fault false. CASE-THERM-01 through
the fifth thermal case are mutually exclusive and exhaustive over TYPE-03 and prior
thermal state.

CASE-TEST-01: If the self-test report is invalid or valid `Failed`, PART-07
shall set new state `Failed`, `selfTestPassed=false`, and self-test fault true,
regardless of command or prior test state.

CASE-TEST-02: Otherwise, if `selfTestResetRequested` is true, PART-07 shall set
new state `Untested`, passed false, and fault false.

CASE-TEST-03: Otherwise, if prior state is `Untested`, a fresh valid `Start` is
present, and the report is `Running`, PART-07 shall set new state `Testing`,
passed false, and fault false.

CASE-TEST-04: Otherwise, if prior state is `Untested`, a fresh valid `Start` is
present, and the report is `Passed`, PART-07 shall set new state `Passed`,
passed true, and fault false.

CASE-TEST-05: Otherwise, if prior state is `Testing` and the report is
`Passed`, PART-07 shall set new state `Passed`, passed true, and fault false.

CASE-TEST-06: Otherwise, if prior state is `Passed`, PART-07 shall retain
`Passed`, passed true, and fault false.

CASE-TEST-07: Otherwise, PART-07 shall retain its prior `Untested`, `Testing`,
or `Failed` state, set passed false, and set fault true exactly when it is
`Failed`. This final case covers
nonqualifying/no-request progress and prevents a fresh report from silently
clearing a failed campaign. CASE-TEST-01 through CASE-TEST-07 are exclusive and
exhaustive.

CASE-REARM-01: If `anyFault` is true, PART-12 shall set new rearm state
`Blocked` and recovery permit false.

CASE-REARM-02: Otherwise, if `sustainReady` is false, PART-12 shall set new
rearm state `Blocked` and recovery permit false.

CASE-REARM-03: Otherwise, with prior `Blocked`, PART-12 shall set new state
`Confirming`; a current `ReturnToNormal` is too early and permit remains false.

CASE-REARM-04: Otherwise, with prior `Confirming`, PART-12 shall set new state
`Ready`; permit remains false unless a later snapshot supplies a fresh request.

CASE-REARM-05: Otherwise, with prior `Ready`, PART-12 shall retain `Ready` and
set recovery permit true exactly when the current qualified command is
`ReturnToNormal`. CASE-REARM-01 through CASE-REARM-05 are exclusive and
exhaustive; requests in earlier cases are not stored.

POL-SESSION-01: PART-10 shall apply CASE-SESSION-01 through CASE-SESSION-12 in
the stated priority. Guard exclusions shall make exactly one case true; textual
order alone is not sufficient evidence of exclusivity.

CASE-SESSION-01: If `anyFault` is true, PART-10 shall set new session
`Degraded` with cause `CurrentFault`, regardless of request, readiness,
recovery permit, or prior session.

CASE-SESSION-02: Otherwise, if prior session is `Degraded` and recovery permit
is true, PART-10 shall set new session `Off` with cause `FreshRecoveryAccepted`.

CASE-SESSION-03: Otherwise, if prior session is `Degraded`, PART-10 shall
retain `Degraded` with cause `RecoveryPending`; `Off`, maintenance, start, and
premature return requests cannot bypass recovery.

CASE-SESSION-04: Otherwise, if the current qualified command is `Off`, PART-10
shall set new session `Off` with cause `OffAccepted`.

CASE-SESSION-05: Otherwise, if the current qualified command is
`EnterMaintenance`, PART-10 shall set new session `Maintenance` with cause
`MaintenanceAccepted`.

CASE-SESSION-06: Otherwise, if prior session is `Off` or `Maintenance`, the
current command is fresh `Start`, and `startReady` is true, PART-10 shall set
new session `Arming` with cause `StartAccepted`.

CASE-SESSION-07: Otherwise, if prior session is `Off` or `Maintenance`, the
current command is fresh `Start`, and `startReady` is false, PART-10 shall
retain its prior session with cause `StartRejected`.

CASE-SESSION-08: Otherwise, if prior session is `Arming` and `sustainReady` is
true, PART-10 shall set new session `On` with cause `EnableCompleted`.

CASE-SESSION-09: Otherwise, if prior session is `Arming` and `sustainReady` is
false, PART-10 shall set new session `Off` with cause `EnableAborted`.

CASE-SESSION-10: Otherwise, if prior session is `On` and `sustainReady` is
true, PART-10 shall retain `On` with cause `OnSustained`.

CASE-SESSION-11: Otherwise, if prior session is `On` and `sustainReady` is
false, PART-10 shall set new session `Degraded` with cause
`ReadinessWithdrawn`.

CASE-SESSION-12: Otherwise, prior session is `Off` or `Maintenance` and the
current command is `None` or `ReturnToNormal`; PART-10 shall retain its prior
session with cause `NoApplicableRequest`. Together the twelve cases cover all
five prior sessions, all qualified commands, both readiness values, both fault
values, and both recovery-permit values.

POL-FAULT-01: PART-11 shall output the vector in order
`[command,pedal,thermal,supply,parkingBrake,selfTest]` and `anyFault` shall be
true exactly when at least one bit is true. All 64 Boolean vectors are within
the owner-local contract domain even if some root combinations are unreachable.

POL-ACT-01: PART-13 shall first force `Inhibit/Isolate/Apply` whenever
`anyFault` is true. Otherwise `On` maps to `Enable/Provide/Release`, `Arming`
or `Maintenance` maps to `Inhibit/Provide/Apply`, and `Off` or `Degraded` maps
to `Inhibit/Isolate/Apply`; these guards are exclusive and exhaustive.

POL-NOTICE-01: PART-14 shall select notice by priority: any fault yields
`FaultAttention`; otherwise `Degraded` with rearm `Confirming` yields
`RecoveryConfirming`; otherwise `Degraded` yields `RecoveryRequired`;
otherwise modes `Maintenance`, `Arming`, and `On` yield their like-named
notices; all remaining `Off` states yield `Off`.

POL-COMP-01: CTRL-02 shall copy the exact new session from PART-10, exact
readiness from PART-09, exact rearm state from PART-12, and exact vector/OR from
the PART-11 output before adding only the PART-14 notice. Any mismatch is a composition
failure even if individual local contracts pass.

## Required behavior, fault, recovery, and composition obligations

BEH-01: On a fault-free snapshot with prior `Off` or `Maintenance`, a fresh
valid `Start`, and start readiness true, the system shall enter `Arming`; on the
next fault-free sustain-ready snapshot it shall enter `On` and publish
`Enable/Provide/Release`.

VER-BEH-01: Contract and bounded analysis pass only if every valuation of the
nominal-start guards produces the stated sessions and CTRL-01 tuple, with no second
session case true.

BEH-02: A fresh `Start` when start readiness is false shall not leave `Off` or
`Maintenance`, and that start shall not be replayed after readiness later
becomes true.

VER-BEH-02: Bounded two-snapshot analysis pass only if a denied start is
followed by no transition to `Arming` on a later `None` request, even when all
readiness facts become true.

BEH-03: A valid `Off` outside degraded recovery shall command `Off` and safe
actuation; a valid maintenance request outside degraded recovery shall command
`Maintenance` with maintenance power only.

VER-BEH-03: Exhaustive session/actuation composition passes only if all
fault-free applicable off and maintenance valuations yield the exact tuples in
the actuation policy.

FAULT-01: Any current command, pedal, thermal, supply, parking-brake, or
self-test fault shall propagate its exact bit, assert aggregate fault, dominate
the session as `Degraded`, and force `Inhibit/Isolate/Apply`.

VER-FAULT-01: All 64 owner-local fault vectors and every root-reachable vector
pass only if the published vector is identical, OR is exact, mode is degraded
for any nonzero vector, and CTRL-01 is safe.

FAULT-02: A valid unavailable supply, valid released pedal, or valid released
parking brake shall block the applicable readiness predicate without being
misreported as an evidence fault.

VER-FAULT-02: Boundary enumeration passes only if each stated valid condition
has aggregate fault false while producing the specified readiness block.

FAULT-03: A valid over-limit or invalid temperature shall immediately block
thermal clearance and assert the thermal fault; later correction alone shall
not immediately restore clearance.

VER-FAULT-03: Bounded thermal traces pass only if an invalid or over-limit
snapshot is degraded and requires two later consecutive valid nominal
observations to move `Blocked -> Confirming -> Clear`, and if the explicit
`Elevated -> Nominal -> Nominal` witness produces `Blocked -> Confirming ->
Clear` with thermal-clear values `false,false,true` and no thermal fault.

REC-01: Leaving `Degraded` shall require `anyFault=false`, sustain readiness,
two consecutive clean-candidate snapshots, and a fresh `ReturnToNormal` only
after rearm is already `Ready`.

VER-REC-01: Bounded analysis passes only if early return requests have no later
effect, `Confirming` never permits recovery, and only a current request with
prior `Ready` moves the session to `Off`.

REC-02: Recovery to `Off` shall not replay any start observed during degraded
operation; a later fresh start and current readiness are required to enter
`Arming` again.

VER-REC-02: A recovery-plus-two-snapshot trace passes only if `ReturnToNormal`
moves to `Off`, a following `None` remains `Off`, and only a following fresh
`Start` may enter `Arming`.

COMP-01: Status and actuation shall compose only resolved owner facts; no
downstream part may reread root inputs or reproduce an upstream state or
priority decision.

VER-COMP-01: Source/trace inspection passes only if INT-01 through INT-35 are
the complete semantic graph, PART-13 and PART-14 consume only listed resolved
facts, and bounded outputs equal their source-owner facts for all valuations.

## Observable modes and transitions

MODE-01: `Off` is externally observable as fuel inhibited, electrical power
isolated, parking brake applied, and status mode `Off`.

MODE-02: `Arming` is externally observable as fuel inhibited, electrical power
provided, parking brake applied, and status mode `Arming`.

MODE-03: `On` is externally observable as fuel enabled, electrical power
provided, parking brake released, and status mode `On`.

MODE-04: `Degraded` is externally observable as the safe actuation tuple plus
recovery-related or fault-attention status; ordinary commands cannot exit it.

MODE-05: `Maintenance` is externally observable as fuel inhibited, electrical
power provided, parking brake applied, and status mode `Maintenance`.

TRANS-01: Allowed transitions are exactly those produced by CASE-SESSION-01
through CASE-SESSION-12. No other mode transition or implicit resumption is
authorized.

## Required scenario families

SCN-01: Cold qualification and nominal start begins `Off`, obtains two valid
nominal thermal observations, supplies valid power, applied brake, pressed
pedal, and a fresh-start self-test pass, then observes `Arming` followed by
`On` and `Enable/Provide/Release`.

PASS-SCN-01: The family passes only if each intermediate state and final output
matches BEH-01 and no fault bit is set.

SCN-02: Start-restraint rejection supplies otherwise ready evidence but a
valid released pedal or valid released parking brake with a fresh `Start`.

PASS-SCN-02: The family passes only if start readiness is false, fault remains
false, session does not enter `Arming`, and later readiness with command `None`
does not replay the start.

SCN-03: Self-test failure supplies valid `Failed` during a start campaign and
then attempts a start without a valid reset sequence.

PASS-SCN-03: The family passes only if self-test remains `Failed`, its exact
fault bit propagates, mode is `Degraded`, and actuation remains safe.

SCN-04: Thermal protection and requalification while on includes an over-limit
variant followed by valid nominal observations and an explicit
`Elevated -> Nominal -> Nominal` variant.

PASS-SCN-04: The family passes only if over-limit immediately degrades and
forces safe actuation, the first nominal yields thermal `Confirming`, and the
second yields `Clear` without automatically leaving `Degraded`; in the elevated
variant, `Elevated` resets thermal state to `Blocked` with thermal fault false,
and only the second subsequent consecutive nominal yields `Clear`.

SCN-05: Invalid electrical evidence while on supplies `Invalid` with either
payload and later valid `Available`.

PASS-SCN-05: The family passes only if both invalid payloads collapse to the
same supply fault, degrade immediately, and later availability does not bypass
rearm and fresh recovery.

SCN-06: Concurrent evidence faults supplies invalid command, invalid pedal,
and invalid parking-brake evidence in one snapshot.

PASS-SCN-06: The family passes only if all three exact bits remain set, the
other three remain clear when their evidence is nominal, aggregate fault is
true, and no output collapses the vector to a single cause.

SCN-07: Early recovery request supplies `ReturnToNormal` while rearm is
`Blocked` or `Confirming`, then later reaches `Ready` under command `None`.

PASS-SCN-07: The family passes only if the early request is forgotten and the
session stays `Degraded` until a new `ReturnToNormal` arrives while prior rearm
is `Ready`.

SCN-08: Complete recovery and restart clears evidence, completes self-test
reset/requalification, reaches rearm `Ready`, supplies fresh return, and later
supplies a fresh start.

PASS-SCN-08: The family passes only if recovery ends in `Off`, the return
request never enables fuel, and only the later start produces `Arming` then
`On`.

SCN-09: Fault-versus-off priority supplies a current fault and a valid `Off`
request together while in `On`.

PASS-SCN-09: The family passes only if fault priority selects `Degraded`, the
safe tuple is commanded, and the off request does not bypass the rearm gate.

SCN-10: Maintenance and self-test reset supplies a valid maintenance request,
no current fault, and a nonfailed valid self-test report outside degraded mode.

PASS-SCN-10: The family passes only if session becomes `Maintenance`, self-test
becomes `Untested`, and output is `Inhibit/Provide/Apply`.

SCN-11: Arming abort supplies accepted `Arming` followed by fault-free loss of
sustain readiness through valid power unavailability.

PASS-SCN-11: The family passes only if valid unavailability sets no fault bit,
the arming-abort case returns session to `Off`, and actuation becomes
`Inhibit/Isolate/Apply`.

## Ownership, closure, structural, and acceptance audit

AUD-OWN-01: Persistent state ownership is nonoverlapping: PART-06 alone owns
thermal clearance, PART-07 alone owns self-test campaign, PART-10 alone owns
operating session, and PART-12 alone owns rearm qualification.

AUD-OWN-02: Decision ownership is plural: PART-01 through PART-05 qualify
distinct evidence, PART-08 owns restraint, PART-09 owns readiness, PART-10 owns
session priority, PART-11 owns only aggregate-fault OR derivation, PART-13 owns
actuation, and PART-14 owns only prioritized notice classification. PART-11
vector preservation and PART-14 publication of upstream status fields remain
exact but uncredited coherence obligations.

AUD-PAD-01: Every credited usage derives a nonidentity local fact or state.
Invalid payload combinations collapse in PART-01 through PART-05; PART-06,
PART-07, PART-10, and PART-12 own history; PART-08 and PART-09 make multi-input
Boolean decisions; PART-11 derives the six-input OR; PART-13 maps session and
fault combinations many-to-one; and PART-14 derives the prioritized notice.
Exact vector preservation and copied status publication are required but
uncredited. No pure copier, bundle, router, container, or bijective renamer
receives credit.

AUD-CASE-01: The counted nontrivial cases are exactly five thermal cases,
seven self-test cases, five rearm cases, and twelve session cases: `5+7+5+12 =
29`. Qualification equations and POL-FAULT/POL-ACT/POL-NOTICE/POL-COMP are
required obligations but are not padded into this case count.

AUD-INT-01: The final interaction recount is six boundary inputs, twenty-seven
internal owner-to-owner flows, and two boundary outputs: `6+27+2 = 35`.
Every INT identifier names one typed directed responsibility dependency; root
delegations or visual context links are excluded.

AUD-SCN-01: SCN-01 through SCN-11 are eleven distinct families: nominal start,
restraint rejection, persistent self-test failure, thermal degradation,
invalid supply, concurrent faults, premature recovery, complete fresh recovery,
fault/off priority, maintenance reset, and fault-free arming abort.

STRUCT-01: The realization shall have exactly one root System usage, one
behavior-free support Process if required by the library pattern, and exactly
fourteen credited semantic usages reachable beneath the root in one weakly
connected semantic region.

STRUCT-02: Containment depth shall be at most two below the root. If a support
Process is used, all semantic usages shall be siblings beneath it; nested
semantic subsystems, deployment bindings, and context actors inside the
semantic count are prohibited.

STRUCT-03: The model shall realize exactly thirty-five semantic connections.
Transparent root-to-Process delegations for the eight boundary ports are
uncredited support, so at most forty-three raw connections are authorized when
that support layer is used.

TRACE-01: Every identifier in this abstract shall map to one or more retained
model elements, be explicitly marked informational, or be explicitly deferred.
Every significant model element shall trace back or carry a specific
`@generated-support` rationale; missing or unexplained coverage fails.

PASS-01: Structural acceptance requires semantic usages `14`, semantic
interactions `35`, containment depth `<=2`, exactly one root, and one weakly
connected semantic region, with no owner-count or interaction padding.

PASS-02: Contract acceptance requires exactly twenty-nine counted cases,
mutual exclusion and exhaustiveness of each four partition families, safe
initialization, complete fresh-request and recovery traces, and no unconstrained
member of CTRL-01 or CTRL-02.

PASS-03: Behavioral acceptance requires all eleven scenario families and all
BEH/FAULT/REC/COMP objective criteria to pass the deterministic bounded
analyzer, including all 64 fault vectors and multi-snapshot recovery paths.

PASS-04: Mechanical verification requires architecture-stage and final Sireum
typechecking, resolved compatible connection endpoints, complete traceability,
campaign-v1 metrics, and the run-policy gates. An unrun check is not a pass.

PASS-05: Designer validation separately requires that the generated model
preserve protected start and power enablement, the exact external boundary,
state/decision ownership, priority, fault, recovery, composition, and deferred
claim boundary; metric conformance alone is insufficient.
