# Protected Start and Power-Enablement Supervisor

## Selected system context

### Synopsis, need, purpose, and scope

NEED-01: A vehicle supervisory boundary needs to decide when a requested start may
progress to logical power and fuel enablement, while making invalid evidence,
over-temperature, failed self-test, loss of electrical availability, and unsafe start
restraint observable and conservative.

PURPOSE-01: The system will qualify current command and readiness evidence, retain
thermal, self-test, recovery, and operating-session state, resolve conflicting
command/fault/recovery conditions by an exact priority, and control one logical
actuation disposition plus one supervisory status. It does not control drivetrain
physics or claim that a vehicle has physically started.

### Goals

GOAL-01: The system shall enable logical fuel only in the `On` session with no current
aggregate fault, and shall otherwise inhibit fuel.

GOAL-02: The system shall require qualified temperature, electrical supply, self-test,
pedal, and parking-brake evidence before accepting a fresh start.

GOAL-03: The system shall propagate six independently owned fault predicates as an exact
vector and shall derive aggregate fault as their Boolean OR without discarding
concurrent causes.

GOAL-04: The system shall enter or retain `Degraded` when a current fault has priority,
shall require clean requalification plus a fresh `ReturnToNormal` request to leave it,
and shall require a later fresh `Start` to re-enable.

GOAL-05: The logical fuel, electrical-power, parking-brake, mode, readiness, recovery,
notice, and fault outputs shall be mutually consistent with one winning finite policy
case per snapshot.

### Operational context and exact system boundary

CTX-01: The Command Authority is a pilot abstraction for the otherwise unnamed origin of
start, off, maintenance, and return-to-normal indications. It supplies one current
command report and receives supervisory status.

CTX-02: The Brake-Pedal Evidence Source supplies pedal condition and validity. It
remains responsible for the report; the supervisor does not model pedal or braking
mechanics.

CTX-03: The Temperature Evidence Source supplies a qualitative temperature band and
validity. The meaning of the selected bands is finite and logical, not a calibrated
physical threshold claim.

CTX-04: The Electrical-Power Evidence Source supplies logical availability and validity.
`Available` is permission evidence, not proof of voltage, energy, or delivered power.

CTX-05: The Parking-Brake Evidence Source supplies logical applied/released condition
and validity. It does not prove mechanical holding force.

CTX-06: The Self-Test Evidence Source supplies the current logical progress or result of
a source-named self-test. The test procedure and completion semantics are outside the
boundary.

CTX-07: The Vehicle Command Recipient receives a logical actuation disposition. It alone
is responsible for any physical interpretation or execution, which this abstract does
not model.

MON-01: `commandReport` from CTX-01 has exactly TYPE-01 and is a current snapshot value;
no command is implicitly queued.

MON-02: `brakePedalReport` from CTX-02 has exactly TYPE-02. A valid `Pressed` condition
contributes to start restraint; `Released` blocks start without being a fault.

MON-03: `temperatureReport` from CTX-03 has exactly TYPE-03. Invalid payloads have no
band authority; valid `Elevated` and `OverLimit` are distinct.

MON-04: `electricalPowerReport` from CTX-04 has exactly TYPE-04. Valid `Unavailable`
blocks readiness but is not itself an evidence fault.

MON-05: `parkingBrakeReport` from CTX-05 has exactly TYPE-05. A valid `Applied`
condition contributes to start restraint; valid `Released` blocks start.

MON-06: `selfTestReport` from CTX-06 has exactly TYPE-06. Its meaning is only the
selected finite protocol below.

CTRL-01: `actuationDisposition` to CTX-07 has exactly TYPE-07 and is a logical command
tuple; it makes no claim that a physical effect occurred.

CTRL-02: `supervisoryStatus` to CTX-01 has exactly TYPE-08 and shall publish the exact
current owner decisions without recomputing their policies.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for one TYPE-01 value per logical snapshot. The single
command enum excludes simultaneous external commands; priority is still required between
a command, a current fault, degraded retention, and recovery.

ASM-02: CTX-02 through CTX-06 are each responsible for pairing every payload with
explicit validity. On `Invalid`, the payload remains present only for type completeness
and shall be suppressed by its qualification owner.

ASM-03: The selected start-restraint abstraction requires both a valid pressed pedal and
a valid applied parking brake. This is a pilot policy, not a physical or safety claim
from the seed.

ASM-04: A valid `OverLimit` or any invalid temperature report is a current thermal
fault. `Elevated` is not a current fault but shall reset the nominal- clearance streak
to `Blocked`; thermal clearance then requires two subsequent consecutive valid `Nominal`
observations.

ASM-05: A valid unavailable electrical supply blocks readiness without setting the
supply-evidence fault; invalid supply evidence sets the fault. This keeps ordinary
unavailability distinct from corrupt evidence.

ASM-06: Self-test state is reset only by a valid current `Off` or `EnterMaintenance`
command with a nonfailed, valid self-test report. A failed or invalid report has higher
local priority than reset.

ASM-07: Two consecutive snapshots satisfying the complete clean-candidate predicate move
rearm from `Blocked` through `Confirming` to `Ready`. The count is an analysis
abstraction, not a timing or diagnostic-coverage claim.

ASM-08: Every evaluation uses one atomic logical snapshot and each state owner uses its
own prior state. Data dependencies follow INT-01 through INT-35; no real period,
latency, concurrency, or execution-order claim follows.

ASM-09: Initial persistent states are thermal `Blocked`, self-test `Untested`, rearm
`Blocked`, and session `Off`. Before a complete evaluation, CTRL-01 is exactly
`Inhibit/Isolate/Apply`, and CTRL-02 is exactly session `Off`, `startReady=false`,
`sustainReady=false`, rearm `Blocked`, notice `Off`, fault vector
`[false,false,false,false,false,false]`, and `anyFault=false`.

### Observable modes and transitions

MODE-01: `Off` is externally observable as fuel inhibited, electrical power isolated,
parking brake applied, and status mode `Off`.

MODE-02: `Arming` is externally observable as fuel inhibited, electrical power provided,
parking brake applied, and status mode `Arming`.

MODE-03: `On` is externally observable as fuel enabled, electrical power provided,
parking brake released, and status mode `On`.

MODE-04: `Degraded` is externally observable as the safe actuation tuple plus
recovery-related or fault-attention status; ordinary commands cannot exit it.

MODE-05: `Maintenance` is externally observable as fuel inhibited, electrical power
provided, parking brake applied, and status mode `Maintenance`.

## Supporting contract definitions

### State `Protected_Start_Power_Supervisor::OperatingSessionStatePriorityOwner::sessionMemory`

State `sessionMemory` has type `Protected_Start_Power_Supervisor::Session`.

### State `Protected_Start_Power_Supervisor::RearmQualificationStateOwner::rearmMemory`

State `rearmMemory` has type `Protected_Start_Power_Supervisor::RearmState`.

### State `Protected_Start_Power_Supervisor::SelfTestCampaignStateOwner::selfTestMemory`

State `selfTestMemory` has type `Protected_Start_Power_Supervisor::SelfTestState`.

### State `Protected_Start_Power_Supervisor::ThermalClearanceStateOwner::thermalMemory`

State `thermalMemory` has type `Protected_Start_Power_Supervisor::ThermalState`.

## Detailed behavioral requirements

### Requirements for ActuationCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SAFE_ACTUATION` — Required behavior

> During contract evaluation for the initialization phase, ActuationCompositionOwner shall set actuation disposition fuel to Inhibit, actuation disposition electricalPower to Isolate, and actuation disposition parkingBrake to Apply.

#### Contract clauses evaluated in the compute phase

##### `ACTUATION_COMPOSITION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, ActuationCompositionOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true
>       - actuation disposition fuel is Inhibit
>       - actuation disposition electricalPower is Isolate
>       - actuation disposition parkingBrake is Apply
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is On
>       - actuation disposition fuel is Enable
>       - actuation disposition electricalPower is Provide
>       - actuation disposition parkingBrake is Release
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - session decision facts session is Arming
>           - session decision facts session is Maintenance
>       - actuation disposition fuel is Inhibit
>       - actuation disposition electricalPower is Provide
>       - actuation disposition parkingBrake is Apply
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - At least one of the following conditions holds:
>         
>           - session decision facts session is Off
>           - session decision facts session is Degraded
>       - actuation disposition fuel is Inhibit
>       - actuation disposition electricalPower is Isolate
>       - actuation disposition parkingBrake is Apply.

### Requirements for BrakePedalQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PEDAL_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, BrakePedalQualificationOwner shall set qualified pedal facts pedalStartCondition to true exactly when F is true and pedal fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PEDAL_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, BrakePedalQualificationOwner shall set qualified pedal facts pedalStartCondition to true exactly when brake pedal report status is Valid and brake pedal report condition is Pressed and pedal fault to true exactly when brake pedal report status is Invalid.

### Requirements for CommandQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_COMMAND_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, CommandQualificationOwner shall set qualified command facts command to None, qualified command facts selfTestResetRequested to true exactly when F is true, and command fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `COMMAND_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, CommandQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - command report status is Invalid
>           - qualified command facts command is None
>       - All of the following conditions hold:
>         
>           - command report status is Valid
>           - qualified command facts command is command report command
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     qualified command facts selfTestResetRequested is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - command report status is Valid
>       - At least one of the following conditions holds:
>         
>           - command report command is Off
>           - command report command is EnterMaintenance
>   - command fault is command report status is Invalid.

### Requirements for ElectricalSupplyQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SUPPLY_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, ElectricalSupplyQualificationOwner shall set qualified supply facts supplyUsable to true exactly when F is true and supply fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `SUPPLY_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, ElectricalSupplyQualificationOwner shall set qualified supply facts supplyUsable to true exactly when electrical power report status is Valid and electrical power report availability is Available and supply fault to true exactly when electrical power report status is Invalid.

### Requirements for FaultVectorCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_FAULT_VECTOR_CLEAR` — Required behavior

> During contract evaluation for the initialization phase, FaultVectorCompositionOwner shall set exact fault summary commandFault to true exactly when F is true, exact fault summary pedalFault to true exactly when F is true, exact fault summary thermalFault to true exactly when F is true, exact fault summary supplyFault to true exactly when F is true, exact fault summary parkingBrakeFault to true exactly when F is true, exact fault summary selfTestFault to true exactly when F is true, and exact fault summary anyFault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `EXACT_FAULT_VECTOR_AND_OR` — Required behavior

> During contract evaluation for the compute phase, FaultVectorCompositionOwner shall set exact fault summary commandFault to true exactly when command fault is true, exact fault summary pedalFault to true exactly when pedal fault is true, exact fault summary thermalFault to true exactly when thermal fault is true, exact fault summary supplyFault to true exactly when supply fault is true, exact fault summary parkingBrakeFault to true exactly when parking brake fault is true, exact fault summary selfTestFault to true exactly when self test fault is true, and exact fault summary anyFault to true exactly when command fault is true, pedal fault is true, thermal fault is true, supply fault is true, parking brake fault is true, or self test fault is true.

### Requirements for OperatingSessionStatePriorityOwner

#### Contract clauses evaluated in the initialization phase

May modify: sessionMemory

##### `INITIAL_SESSION_OFF` — Required behavior

> During contract evaluation for the initialization phase, OperatingSessionStatePriorityOwner shall set sessionMemory to Off, session decision facts session to Off, and session decision facts cause to NoApplicableRequest.

#### Contract clauses evaluated in the compute phase

May modify: sessionMemory

##### `SESSION_OUTPUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, OperatingSessionStatePriorityOwner shall set session decision facts session to sessionMemory.

##### `SESSION_CURRENT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true, OperatingSessionStatePriorityOwner shall set sessionMemory to Degraded and session decision facts cause to CurrentFault.

##### `SESSION_FRESH_RECOVERY_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is Degraded, and recovery permit fact recoveryPermit is true, OperatingSessionStatePriorityOwner shall set sessionMemory to Off and session decision facts cause to FreshRecoveryAccepted.

##### `SESSION_DEGRADED_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is Degraded, and recovery permit fact recoveryPermit is true exactly when F is true, OperatingSessionStatePriorityOwner shall set sessionMemory to Degraded and session decision facts cause to RecoveryPending.

##### `SESSION_OFF_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is not Degraded, and qualified command facts command is Off, OperatingSessionStatePriorityOwner shall set sessionMemory to Off and session decision facts cause to OffAccepted.

##### `SESSION_MAINTENANCE_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is not Degraded, and qualified command facts command is EnterMaintenance, OperatingSessionStatePriorityOwner shall set sessionMemory to Maintenance and session decision facts cause to MaintenanceAccepted.

##### `SESSION_START_ACCEPTED` — Conditional behavior

> During contract evaluation for the compute phase, case SESSION START ACCEPTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - exact fault summary anyFault is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - the value of sessionMemory on entry is Off
>       - the value of sessionMemory on entry is Maintenance
>   - qualified command facts command is Start
>   - readiness facts startReady is true.

> When all applicability conditions are met, OperatingSessionStatePriorityOwner shall produce a result for which all of the following conditions hold:
>
> sessionMemory is Arming and session decision facts cause is StartAccepted.

##### `SESSION_START_REJECTED` — Conditional behavior

> During contract evaluation for the compute phase, case SESSION START REJECTED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - exact fault summary anyFault is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - the value of sessionMemory on entry is Off
>       - the value of sessionMemory on entry is Maintenance
>   - qualified command facts command is Start
>   - readiness facts startReady is true exactly when F is true.

> When all applicability conditions are met, OperatingSessionStatePriorityOwner shall produce a result for which all of the following conditions hold:
>
> sessionMemory is the value of sessionMemory on entry and session decision facts cause is StartRejected.

##### `SESSION_ENABLE_COMPLETED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is Arming, qualified command facts command is not Off, qualified command facts command is not EnterMaintenance, and readiness facts sustainReady is true, OperatingSessionStatePriorityOwner shall set sessionMemory to On and session decision facts cause to EnableCompleted.

##### `SESSION_ENABLE_ABORTED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is Arming, qualified command facts command is not Off, qualified command facts command is not EnterMaintenance, and readiness facts sustainReady is true exactly when F is true, OperatingSessionStatePriorityOwner shall set sessionMemory to Off and session decision facts cause to EnableAborted.

##### `SESSION_ON_SUSTAINED` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is On, qualified command facts command is not Off, qualified command facts command is not EnterMaintenance, and readiness facts sustainReady is true, OperatingSessionStatePriorityOwner shall set sessionMemory to On and session decision facts cause to OnSustained.

##### `SESSION_READINESS_WITHDRAWN` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, the value of sessionMemory on entry is On, qualified command facts command is not Off, qualified command facts command is not EnterMaintenance, and readiness facts sustainReady is true exactly when F is true, OperatingSessionStatePriorityOwner shall set sessionMemory to Degraded and session decision facts cause to ReadinessWithdrawn.

##### `SESSION_NO_APPLICABLE_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, case SESSION NO APPLICABLE REQUEST applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - exact fault summary anyFault is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - the value of sessionMemory on entry is Off
>       - the value of sessionMemory on entry is Maintenance
>   - At least one of the following conditions holds:
>     
>       - qualified command facts command is None
>       - qualified command facts command is ReturnToNormal.

> When all applicability conditions are met, OperatingSessionStatePriorityOwner shall produce a result for which all of the following conditions hold:
>
> sessionMemory is the value of sessionMemory on entry and session decision facts cause is NoApplicableRequest.

### Requirements for ParkingBrakeQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PARKING_BRAKE_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, ParkingBrakeQualificationOwner shall set qualified parking brake facts brakeAppliedEvidence to true exactly when F is true and parking brake fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `PARKING_BRAKE_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, ParkingBrakeQualificationOwner shall set qualified parking brake facts brakeAppliedEvidence to true exactly when parking brake report status is Valid and parking brake report condition is Applied and parking brake fault to true exactly when parking brake report status is Invalid.

### Requirements for ReadinessCompositionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NOT_READY` — Required behavior

> During contract evaluation for the initialization phase, ReadinessCompositionOwner shall set readiness facts startReady to true exactly when F is true and readiness facts sustainReady to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `READINESS_COMPOSITION` — Required behavior

> During contract evaluation for the compute phase, ReadinessCompositionOwner shall set readiness facts startReady to true exactly when qualified supply facts supplyUsable is true, thermal state facts thermalClear is true, self test state facts selfTestPassed is true, and start restraint fact startRestraintSatisfied is true and readiness facts sustainReady to true exactly when qualified supply facts supplyUsable is true, thermal state facts thermalClear is true, and self test state facts selfTestPassed is true.

### Requirements for RearmQualificationStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: rearmMemory

##### `INITIAL_REARM_BLOCKED` — Required behavior

> During contract evaluation for the initialization phase, RearmQualificationStateOwner shall set rearmMemory to Blocked, rearm state facts rearmState to Blocked, and recovery permit fact recoveryPermit to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: rearmMemory

##### `REARM_OUTPUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, RearmQualificationStateOwner shall set rearm state facts rearmState to rearmMemory.

##### `REARM_CURRENT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true, RearmQualificationStateOwner shall set rearmMemory to Blocked and recovery permit fact recoveryPermit to true exactly when F is true.

##### `REARM_NOT_SUSTAIN_READY` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true and readiness facts sustainReady is true exactly when F is true, RearmQualificationStateOwner shall set rearmMemory to Blocked and recovery permit fact recoveryPermit to true exactly when F is true.

##### `REARM_FIRST_CLEAN_SNAPSHOT` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, readiness facts sustainReady is true, and the value of rearmMemory on entry is Blocked, RearmQualificationStateOwner shall set rearmMemory to Confirming and recovery permit fact recoveryPermit to true exactly when F is true.

##### `REARM_SECOND_CLEAN_SNAPSHOT` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, readiness facts sustainReady is true, and the value of rearmMemory on entry is Confirming, RearmQualificationStateOwner shall set rearmMemory to Ready and recovery permit fact recoveryPermit to true exactly when F is true.

##### `REARM_READY_FRESH_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if exact fault summary anyFault is true exactly when F is true, readiness facts sustainReady is true, and the value of rearmMemory on entry is Ready, RearmQualificationStateOwner shall set rearmMemory to Ready and recovery permit fact recoveryPermit to true exactly when qualified command facts command is ReturnToNormal.

### Requirements for SelfTestCampaignStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: selfTestMemory

##### `INITIAL_SELF_TEST_UNTESTED` — Required behavior

> During contract evaluation for the initialization phase, SelfTestCampaignStateOwner shall set selfTestMemory to Untested, self test state facts selfTestState to Untested, self test state facts selfTestPassed to true exactly when F is true, and self test fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: selfTestMemory

##### `SELF_TEST_OUTPUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, SelfTestCampaignStateOwner shall set self test state facts selfTestState to selfTestMemory and self test state facts selfTestPassed to true exactly when selfTestMemory is Passed.

##### `SELF_TEST_FAILURE_DOMINATES` — Conditional behavior

> During contract evaluation for the compute phase, case SELF TEST FAILURE DOMINATES applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - self test report status is Invalid
>   - All of the following conditions hold:
>     
>       - self test report status is Valid
>       - self test report progress is Failed.

> When all applicability conditions are met, SelfTestCampaignStateOwner shall produce a result for which all of the following conditions hold:
>
> selfTestMemory is Failed, self test state facts selfTestPassed is true exactly when F is true, and self test fault is T.

##### `SELF_TEST_VALID_RESET` — Conditional behavior

> During contract evaluation for the compute phase, if self test report status is Valid, self test report progress is not Failed, and qualified command facts selfTestResetRequested is true, SelfTestCampaignStateOwner shall set selfTestMemory to Untested, self test state facts selfTestPassed to true exactly when F is true, and self test fault to true exactly when F is true.

##### `SELF_TEST_START_RUNNING` — Conditional behavior

> During contract evaluation for the compute phase, if self test report status is Valid, self test report progress is not Failed, qualified command facts selfTestResetRequested is true exactly when F is true, the value of selfTestMemory on entry is Untested, qualified command facts command is Start, and self test report progress is Running, SelfTestCampaignStateOwner shall set selfTestMemory to Testing, self test state facts selfTestPassed to true exactly when F is true, and self test fault to true exactly when F is true.

##### `SELF_TEST_FRESH_START_PASS` — Conditional behavior

> During contract evaluation for the compute phase, if self test report status is Valid, self test report progress is not Failed, qualified command facts selfTestResetRequested is true exactly when F is true, the value of selfTestMemory on entry is Untested, qualified command facts command is Start, and self test report progress is Passed, SelfTestCampaignStateOwner shall set selfTestMemory to Passed, self test state facts selfTestPassed to true exactly when T is true, and self test fault to true exactly when F is true.

##### `SELF_TEST_RUNNING_TO_PASS` — Conditional behavior

> During contract evaluation for the compute phase, if self test report status is Valid, self test report progress is not Failed, qualified command facts selfTestResetRequested is true exactly when F is true, the value of selfTestMemory on entry is Testing, and self test report progress is Passed, SelfTestCampaignStateOwner shall set selfTestMemory to Passed, self test state facts selfTestPassed to true exactly when T is true, and self test fault to true exactly when F is true.

##### `SELF_TEST_PASS_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if self test report status is Valid, self test report progress is not Failed, qualified command facts selfTestResetRequested is true exactly when F is true, and the value of selfTestMemory on entry is Passed, SelfTestCampaignStateOwner shall set selfTestMemory to Passed, self test state facts selfTestPassed to true exactly when T is true, and self test fault to true exactly when F is true.

##### `SELF_TEST_OTHER_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, case SELF TEST OTHER RETENTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - self test report status is Valid
>   - self test report progress is not Failed
>   - qualified command facts selfTestResetRequested is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of selfTestMemory on entry is Untested
>           - At least one of the following conditions holds:
>             
>               - qualified command facts command is not Start
>               - All of the following conditions hold:
>                 
>                   - self test report progress is not Running
>                   - self test report progress is not Passed
>       - All of the following conditions hold:
>         
>           - the value of selfTestMemory on entry is Testing
>           - self test report progress is not Passed
>       - the value of selfTestMemory on entry is Failed.

> When all applicability conditions are met, SelfTestCampaignStateOwner shall produce a result for which all of the following conditions hold:
>
> selfTestMemory is the value of selfTestMemory on entry, self test state facts selfTestPassed is true exactly when F is true, and self test fault is selfTestMemory is Failed.

### Requirements for StartRestraintDecisionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESTRAINT_UNSATISFIED` — Required behavior

> During contract evaluation for the initialization phase, StartRestraintDecisionOwner shall set start restraint fact startRestraintSatisfied to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `START_RESTRAINT_DECISION` — Required behavior

> During contract evaluation for the compute phase, StartRestraintDecisionOwner shall set start restraint fact startRestraintSatisfied to true exactly when qualified pedal facts pedalStartCondition is true and qualified parking brake facts brakeAppliedEvidence is true.

### Requirements for SupervisoryStatusNoticeOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PUBLIC_STATUS_EXACT` — Required behavior

> During contract evaluation for the initialization phase, SupervisoryStatusNoticeOwner shall set supervisory status session to Off, supervisory status startReady to true exactly when F is true, supervisory status sustainReady to true exactly when F is true, supervisory status rearmState to Blocked, supervisory status notice to Off, supervisory status commandFault to true exactly when F is true, supervisory status pedalFault to true exactly when F is true, supervisory status thermalFault to true exactly when F is true, supervisory status supplyFault to true exactly when F is true, supervisory status parkingBrakeFault to true exactly when F is true, supervisory status selfTestFault to true exactly when F is true, and supervisory status anyFault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `STATUS_PRESERVES_OWNER_FACTS` — Required behavior

> During contract evaluation for the compute phase, SupervisoryStatusNoticeOwner shall set supervisory status session to session decision facts session, supervisory status startReady to true exactly when readiness facts startReady is true, supervisory status sustainReady to true exactly when readiness facts sustainReady is true, supervisory status rearmState to rearm state facts rearmState, supervisory status commandFault to true exactly when exact fault summary commandFault is true, supervisory status pedalFault to true exactly when exact fault summary pedalFault is true, supervisory status thermalFault to true exactly when exact fault summary thermalFault is true, supervisory status supplyFault to true exactly when exact fault summary supplyFault is true, supervisory status parkingBrakeFault to true exactly when exact fault summary parkingBrakeFault is true, supervisory status selfTestFault to true exactly when exact fault summary selfTestFault is true, and supervisory status anyFault to true exactly when exact fault summary anyFault is true.

##### `PRIORITIZED_NOTICE_CLASSIFICATION` — Required behavior

> During contract evaluation for the compute phase, SupervisoryStatusNoticeOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true
>       - supervisory status notice is FaultAttention
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is Degraded
>       - rearm state facts rearmState is Confirming
>       - supervisory status notice is RecoveryConfirming
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is Degraded
>       - rearm state facts rearmState is not Confirming
>       - supervisory status notice is RecoveryRequired
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is Maintenance
>       - supervisory status notice is Maintenance
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is Arming
>       - supervisory status notice is Starting
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is On
>       - supervisory status notice is Enabled
>   - All of the following conditions hold:
>     
>       - exact fault summary anyFault is true exactly when F is true
>       - session decision facts session is Off
>       - supervisory status notice is Off.

### Requirements for TemperatureQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_TEMPERATURE_QUALIFICATION` — Required behavior

> During contract evaluation for the initialization phase, TemperatureQualificationOwner shall set qualified temperature to InvalidEvidence.

#### Contract clauses evaluated in the compute phase

##### `TEMPERATURE_QUALIFICATION_TOTAL` — Required behavior

> During contract evaluation for the compute phase, TemperatureQualificationOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - temperature report status is Invalid
>       - qualified temperature is InvalidEvidence
>   - All of the following conditions hold:
>     
>       - temperature report status is Valid
>       - temperature report band is Nominal
>       - qualified temperature is Nominal
>   - All of the following conditions hold:
>     
>       - temperature report status is Valid
>       - temperature report band is Elevated
>       - qualified temperature is Elevated
>   - All of the following conditions hold:
>     
>       - temperature report status is Valid
>       - temperature report band is OverLimit
>       - qualified temperature is OverLimit.

### Requirements for ThermalClearanceStateOwner

#### Contract clauses evaluated in the initialization phase

May modify: thermalMemory

##### `INITIAL_THERMAL_BLOCKED` — Required behavior

> During contract evaluation for the initialization phase, ThermalClearanceStateOwner shall set thermalMemory to Blocked, thermal state facts thermalState to Blocked, thermal state facts thermalClear to true exactly when F is true, and thermal fault to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

May modify: thermalMemory

##### `THERMAL_OUTPUT_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, ThermalClearanceStateOwner shall set thermal state facts thermalState to thermalMemory and thermal state facts thermalClear to true exactly when thermalMemory is Clear.

##### `THERMAL_BLOCK_CURRENT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if qualified temperature is InvalidEvidence or qualified temperature is OverLimit, ThermalClearanceStateOwner shall set thermalMemory to Blocked, thermal state facts thermalClear to true exactly when F is true, and thermal fault to true exactly when T is true.

##### `THERMAL_ELEVATED_RESET_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if qualified temperature is Elevated, ThermalClearanceStateOwner shall set thermalMemory to Blocked, thermal state facts thermalClear to true exactly when F is true, and thermal fault to true exactly when F is true.

##### `THERMAL_FIRST_NOMINAL` — Conditional behavior

> During contract evaluation for the compute phase, if qualified temperature is Nominal and the value of thermalMemory on entry is Blocked, ThermalClearanceStateOwner shall set thermalMemory to Confirming, thermal state facts thermalClear to true exactly when F is true, and thermal fault to true exactly when F is true.

##### `THERMAL_SECOND_NOMINAL` — Conditional behavior

> During contract evaluation for the compute phase, if qualified temperature is Nominal and the value of thermalMemory on entry is Confirming, ThermalClearanceStateOwner shall set thermalMemory to Clear, thermal state facts thermalClear to true exactly when T is true, and thermal fault to true exactly when F is true.

##### `THERMAL_CLEAR_RETENTION` — Conditional behavior

> During contract evaluation for the compute phase, if qualified temperature is Nominal and the value of thermalMemory on entry is Clear, ThermalClearanceStateOwner shall set thermalMemory to Clear, thermal state facts thermalClear to true exactly when T is true, and thermal fault to true exactly when F is true.
