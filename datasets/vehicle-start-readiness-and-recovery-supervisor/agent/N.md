# Vehicle Start-Readiness and Recovery Supervisor

## Selected system context

### Need, purpose, goals, and operational context

NEED-01: A vehicle-control environment needs a bounded supervisor that prevents an
unqualified start, makes shutdown dominate conflicting requests, exposes a degraded
disposition when qualifying evidence becomes unacceptable, and prevents stale requests
or test results from silently restarting operation.

GOAL-01: The system shall issue `Permit` only while its owned lifecycle result is `On`
following a fresh start, acceptable start qualifications, and a fresh passing result
from an armed start-test cycle.

GOAL-02: The system shall make an asserted off request dominate every simultaneous
return or start request and shall produce a fail-closed frame in the same abstract
evaluation whose lifecycle result becomes `Degraded` or `Off`.

GOAL-03: The system shall require a distinct recovery sequence after degradation:
restored qualifications, a fresh return request, a fresh passing result from an armed
recovery-test cycle, transition to `Off`, and a later fresh start request.

CTX-01: The Command Authority is an abstract external originator of start, off, and
return-to-normal levels. The seed does not identify this actor; assigning it
responsibility for deliberate request levels is a pilot assumption.

CTX-02: The Brake Observation Source is external and reports pedal condition. The system
neither measures pedal mechanics nor asserts that pedal condition proves physical brake
effectiveness.

CTX-03: The Vehicle Health Source is external and reports
temperature-relative-to-maximum and maintenance-due abstractions. It owns threshold
comparison and maintenance determination outside this boundary.

CTX-04: The Electrical Power Source is external and reports whether supervisory power
enablement is available. The system does not generate or measure electrical power.

CTX-05: The Self-Test Facility is external and accepts an initiation indication through
the control frame and later supplies at most one fresh completion event for that
initiated cycle.

CTX-06: The Vehicle Control Consumers are external recipients of the coordinated frame,
including abstract start, parking-brake, power, self-test, mode, and status consumers.
Physical realization and success feedback are outside the boundary.

CTX-07: The Road and drivetrain remain external physical context and exchange no modeled
quantity with this selected supervisory boundary.

### Exact finite monitored and controlled boundary

MON-01: The system shall monitor `request_levels: RequestLevels` from CTX-01 on each
evaluation; PART-01 is the sole owner of rising-edge recognition and request-conflict
priority.

MON-02: The system shall monitor `brake_observation: BrakeObservation` from CTX-02;
PART-02 is the sole owner of brake trust and admission-readiness facts.

MON-03: The system shall monitor `health_observation: HealthObservation` from CTX-03;
PART-03 is the sole owner of the combined thermal and maintenance qualification.

MON-04: The system shall monitor `power_observation: PowerObservation` from CTX-04;
PART-04 is the sole owner of power trust and supervisory-availability facts.

MON-05: The system shall monitor `self_test_observation: SelfTestObservation` from
CTX-05; PART-05 is the sole owner that can associate a completion event with a
previously armed test cycle.

CTRL-01: The system shall control exactly one `control_frame: ControlFrame` delivered to
CTX-05 and CTX-06. Its six fields are distinct outcomes transported as one atomic
supervisory disposition so consumers cannot observe a mixed lifecycle tuple.

### Required behaviors, risks, faults, and verification criteria

RISK-01: If a start is permitted with untrusted or not-ready brake, health, or power
evidence, the abstract vehicle can enter an operating disposition without the selected
readiness basis.

RISK-02: If start or return wins a simultaneous off conflict, the supervisor can
continue or initiate operation contrary to selected shutdown priority.

RISK-03: If retained request levels or unarmed self-test results count as fresh, a
recovered supervisor can restart without a new command or current evidence.

RISK-04: If qualifying evidence is lost in `Starting` or `On` without propagation, the
externally visible frame can remain permissive after its selected protection basis is
absent.

### Environmental assumptions and constraints

ASM-01: CTX-01 is responsible for stable Boolean request levels and allowing a level to
fall before expecting a later rise to count as fresh. Rationale: the stale-request
defense uses edges because the seed supplies no request identifier.

ASM-02: CTX-02 is responsible only for the truth and validity of reported pedal
condition. `Pressed` is a pilot readiness abstraction, not evidence of achieved
parking-brake force.

ASM-03: CTX-03 is responsible for the temperature comparison and maintenance fact. The
seed supplies no threshold value, unit, clock, or policy.

ASM-04: CTX-04 is responsible for the accuracy and validity of its power observation;
CTX-06 is responsible for acting on the disposition. The empty source analysis
establishes no delivery semantics or feedback.

ASM-05: CTX-05 is responsible for emitting a fresh pass or fail at most once and only
after completing the most recently initiated cycle. No response-time bound is claimed.

ASM-06: CTX-05 and CTX-06 consume the six-field control frame atomically at an abstract
evaluation boundary. This selects no transport or scheduling mechanism.

## Supporting contract definitions

### State `Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleRecoveryOwner::lifecycleModeMemory`

State `lifecycleModeMemory` has type `Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode`.

### State `Vehicle_Start_Readiness_Recovery_Supervisor::RequestPriorityOwner::previousStart`

State `previousStart` has type `Base_Types::Boolean`.

### State `Vehicle_Start_Readiness_Recovery_Supervisor::RequestPriorityOwner::previousOff`

State `previousOff` has type `Base_Types::Boolean`.

### State `Vehicle_Start_Readiness_Recovery_Supervisor::RequestPriorityOwner::previousReturn`

State `previousReturn` has type `Base_Types::Boolean`.

### State `Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCycleOwner::committedTestCycle`

State `committedTestCycle` has type `Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle`.

## Detailed behavioral requirements

### Requirements for BrakeQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BRAKE_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, BrakeQualificationOwner shall set brake to authorization evidenceTrusted to true exactly when F is true, brake to authorization readyForAdmission to true exactly when F is true, brake to lifecycle evidenceTrusted to true exactly when F is true, and brake to lifecycle readyForAdmission to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `BRAKE_FACT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, BrakeQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - brake observation is Pressed
>           - brake to authorization evidenceTrusted is true
>           - brake to authorization readyForAdmission is true
>       - All of the following conditions hold:
>         
>           - brake observation is Released
>           - brake to authorization evidenceTrusted is true
>           - brake to authorization readyForAdmission is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - brake observation is Invalid
>           - brake to authorization evidenceTrusted is true exactly when F is true
>           - brake to authorization readyForAdmission is true exactly when F is true
>   - brake to lifecycle evidenceTrusted is true exactly when brake to authorization evidenceTrusted is true
>   - brake to lifecycle readyForAdmission is true exactly when brake to authorization readyForAdmission is true.

### Requirements for CoordinatedOutcomeOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONTROL_FRAME_SAFE` — Required behavior

> During contract evaluation for the initialization phase, CoordinatedOutcomeOwner shall set control frame startEnable to Inhibit, control frame parkingBrake to Apply, control frame powerDisposition to Isolate, control frame selfTestCommand to None, control frame lifecycleMode to Off, and control frame status to Idle.

#### Contract clauses evaluated in the compute phase

##### `STARTING_AND_ON_FRAME_MAPPING` — Required behavior

> During contract evaluation for the compute phase, CoordinatedOutcomeOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - applied lifecycle nextMode is Starting
>       - control frame startEnable is Inhibit
>       - control frame parkingBrake is Apply
>       - control frame powerDisposition is TestOnly
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - applied lifecycle cycleDirective is BeginStart
>               - control frame selfTestCommand is Initiate
>           - All of the following conditions hold:
>             
>               - applied lifecycle cycleDirective is not BeginStart
>               - control frame selfTestCommand is None
>       - control frame lifecycleMode is Starting
>       - control frame status is Testing
>   - All of the following conditions hold:
>     
>       - applied lifecycle nextMode is On
>       - control frame startEnable is Permit
>       - control frame parkingBrake is Release
>       - control frame powerDisposition is Enable
>       - control frame selfTestCommand is None
>       - control frame lifecycleMode is On
>       - control frame status is Operating
>   - applied lifecycle nextMode is Degraded
>   - applied lifecycle nextMode is Off.

##### `DEGRADED_FRAME_MAPPING` — Required behavior

> During contract evaluation for the compute phase, CoordinatedOutcomeOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - applied lifecycle nextMode is Degraded
>       - control frame startEnable is Inhibit
>       - control frame parkingBrake is Apply
>       - control frame powerDisposition is Isolate
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - applied lifecycle cycleDirective is BeginRecovery
>               - control frame selfTestCommand is Initiate
>           - All of the following conditions hold:
>             
>               - applied lifecycle cycleDirective is not BeginRecovery
>               - control frame selfTestCommand is None
>       - control frame lifecycleMode is Degraded
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - At least one of the following conditions holds:
>                 
>                   - applied lifecycle cycleDirective is BeginRecovery
>                   - applied lifecycle reason is RecoveryAwaiting
>               - control frame status is RecoveryTesting
>           - All of the following conditions hold:
>             
>               - applied lifecycle cycleDirective is not BeginRecovery
>               - applied lifecycle reason is not RecoveryAwaiting
>               - control frame status is Degraded
>   - applied lifecycle nextMode is not Degraded.

##### `OFF_FRAME_MAPPING` — Required behavior

> During contract evaluation for the compute phase, CoordinatedOutcomeOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - applied lifecycle nextMode is Off
>       - control frame startEnable is Inhibit
>       - control frame parkingBrake is Apply
>       - control frame powerDisposition is Isolate
>       - control frame selfTestCommand is None
>       - control frame lifecycleMode is Off
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - applied lifecycle reason is RecoveryCompleted
>               - control frame status is RecoveredAwaitFreshStart
>           - All of the following conditions hold:
>             
>               - applied lifecycle reason is not RecoveryCompleted
>               - authorization decision is DenyInvalid
>               - control frame status is StartBlockedInvalid
>           - All of the following conditions hold:
>             
>               - applied lifecycle reason is not RecoveryCompleted
>               - authorization decision is not DenyInvalid
>               - authorization decision is DenyNotReady
>               - control frame status is StartBlockedNotReady
>           - All of the following conditions hold:
>             
>               - applied lifecycle reason is not RecoveryCompleted
>               - authorization decision is not DenyInvalid
>               - authorization decision is not DenyNotReady
>               - authorization conflict is true
>               - control frame status is RequestConflict
>           - All of the following conditions hold:
>             
>               - applied lifecycle reason is not RecoveryCompleted
>               - authorization decision is not DenyInvalid
>               - authorization decision is not DenyNotReady
>               - authorization conflict is true exactly when F is true
>               - control frame status is Idle
>   - applied lifecycle nextMode is not Off.

##### `CONTROL_FRAME_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, CoordinatedOutcomeOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - applied lifecycle nextMode is Off
>           - control frame lifecycleMode is Off
>       - All of the following conditions hold:
>         
>           - applied lifecycle nextMode is Starting
>           - control frame lifecycleMode is Starting
>       - All of the following conditions hold:
>         
>           - applied lifecycle nextMode is On
>           - control frame lifecycleMode is On
>       - All of the following conditions hold:
>         
>           - applied lifecycle nextMode is Degraded
>           - control frame lifecycleMode is Degraded
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - control frame startEnable is Permit
>           - control frame parkingBrake is Release
>           - control frame powerDisposition is Enable
>           - control frame lifecycleMode is On
>       - All of the following conditions hold:
>         
>           - control frame startEnable is Inhibit
>           - control frame parkingBrake is Apply
>           - control frame powerDisposition is not Enable
>           - control frame lifecycleMode is not On.

### Requirements for HealthQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_HEALTH_QUALIFICATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, HealthQualificationOwner shall set health to authorization to Invalid and health to lifecycle to Invalid.

#### Contract clauses evaluated in the compute phase

##### `HEALTH_QUALIFICATION_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, HealthQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - health observation thermal is Invalid
>               - health observation maintenance is Invalid
>           - health to authorization is Invalid
>       - All of the following conditions hold:
>         
>           - health observation thermal is not Invalid
>           - health observation maintenance is not Invalid
>           - At least one of the following conditions holds:
>             
>               - health observation thermal is OverMaximum
>               - health observation maintenance is Due
>           - health to authorization is NotReady
>       - All of the following conditions hold:
>         
>           - health observation thermal is Normal
>           - health observation maintenance is NotDue
>           - health to authorization is Ready
>   - health to lifecycle is health to authorization.

### Requirements for LifecycleRecoveryOwner

#### Contract clauses evaluated in the initialization phase

May modify: lifecycleModeMemory

##### `INITIAL_LIFECYCLE_SAFE` — Required behavior

> During contract evaluation for the initialization phase, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to None, applied lifecycle preModeSnapshot to Off, applied lifecycle nextMode to Off, applied lifecycle reason to Ordinary, and applied lifecycle cycleDirective to None.

#### Contract clauses evaluated in the compute phase

May modify: lifecycleModeMemory

##### `APPLIED_LIFECYCLE_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - the value of lifecycleModeMemory on entry is Off
>           - applied lifecycle preModeSnapshot is Off
>       - All of the following conditions hold:
>         
>           - the value of lifecycleModeMemory on entry is Starting
>           - applied lifecycle preModeSnapshot is Starting
>       - All of the following conditions hold:
>         
>           - the value of lifecycleModeMemory on entry is On
>           - applied lifecycle preModeSnapshot is On
>       - All of the following conditions hold:
>         
>           - the value of lifecycleModeMemory on entry is Degraded
>           - applied lifecycle preModeSnapshot is Degraded
>   - applied lifecycle nextMode is lifecycleModeMemory
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - test cycle directive is None
>           - applied lifecycle cycleDirective is None
>       - All of the following conditions hold:
>         
>           - test cycle directive is BeginStart
>           - applied lifecycle cycleDirective is BeginStart
>       - All of the following conditions hold:
>         
>           - test cycle directive is BeginRecovery
>           - applied lifecycle cycleDirective is BeginRecovery
>       - All of the following conditions hold:
>         
>           - test cycle directive is Clear
>           - applied lifecycle cycleDirective is Clear.

##### `CASE_06_ADMIT_START` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Off and authorization decision is BeginStartTest, LifecycleRecoveryOwner shall set lifecycleModeMemory to Starting, test cycle directive to BeginStart, and applied lifecycle reason to Ordinary.

##### `CASE_07_REMAIN_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Off and authorization decision is not BeginStartTest, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to None, and applied lifecycle reason to Ordinary.

##### `CASE_08_STARTING_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Starting and request facts offActive is true, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to Clear, and applied lifecycle reason to Ordinary.

##### `CASE_09_STARTING_QUALIFICATION_LOSS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 STARTING QUALIFICATION LOSS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleModeMemory on entry is Starting
>   - request facts offActive is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - brake facts evidenceTrusted is true exactly when F is true
>       - brake facts readyForAdmission is true exactly when F is true
>       - health qualification is not Ready
>       - power facts evidenceTrusted is true exactly when F is true
>       - power facts availableForSupervision is true exactly when F is true.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - lifecycleModeMemory is Degraded
>   - test cycle directive is Clear
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - brake facts evidenceTrusted is true exactly when F is true
>               - health qualification is Invalid
>               - power facts evidenceTrusted is true exactly when F is true
>           - applied lifecycle reason is QualificationInvalid
>       - All of the following conditions hold:
>         
>           - brake facts evidenceTrusted is true
>           - health qualification is not Invalid
>           - power facts evidenceTrusted is true
>           - applied lifecycle reason is QualificationNotReady.

##### `CASE_10_START_TEST_FAILURE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 START TEST FAILURE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleModeMemory on entry is Starting
>   - request facts offActive is true exactly when F is true
>   - brake facts evidenceTrusted is true
>   - brake facts readyForAdmission is true
>   - health qualification is Ready
>   - power facts evidenceTrusted is true
>   - power facts availableForSupervision is true
>   - At least one of the following conditions holds:
>     
>       - cycle assessment is Failed
>       - cycle assessment is Invalid.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> lifecycleModeMemory is Degraded, test cycle directive is Clear, and applied lifecycle reason is Ordinary.

##### `CASE_11_STARTING_WAIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 STARTING WAIT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleModeMemory on entry is Starting
>   - request facts offActive is true exactly when F is true
>   - brake facts evidenceTrusted is true
>   - brake facts readyForAdmission is true
>   - health qualification is Ready
>   - power facts evidenceTrusted is true
>   - power facts availableForSupervision is true
>   - At least one of the following conditions holds:
>     
>       - cycle assessment is Idle
>       - cycle assessment is AwaitingStart
>       - cycle assessment is AwaitingRecovery
>       - cycle assessment is RecoveryPassed.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> lifecycleModeMemory is Starting, test cycle directive is None, and applied lifecycle reason is Ordinary.

##### `CASE_12_START_PASS` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Starting, request facts offActive is true exactly when F is true, brake facts evidenceTrusted is true, brake facts readyForAdmission is true, health qualification is Ready, power facts evidenceTrusted is true, power facts availableForSupervision is true, and cycle assessment is StartPassed, LifecycleRecoveryOwner shall set lifecycleModeMemory to On, test cycle directive to None, and applied lifecycle reason to Ordinary.

##### `CASE_13_ON_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is On and request facts offActive is true, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to Clear, and applied lifecycle reason to Ordinary.

##### `CASE_14_OPERATING_PROTECTION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 14 OPERATING PROTECTION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleModeMemory on entry is On
>   - request facts offActive is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - health qualification is not Ready
>       - power facts evidenceTrusted is true exactly when F is true
>       - power facts availableForSupervision is true exactly when F is true
>       - cycle assessment is not StartPassed.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> lifecycleModeMemory is Degraded, test cycle directive is Clear, and applied lifecycle reason is Ordinary.

##### `CASE_15_RETAIN_ON` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is On, request facts offActive is true exactly when F is true, health qualification is Ready, power facts evidenceTrusted is true, power facts availableForSupervision is true, and cycle assessment is StartPassed, LifecycleRecoveryOwner shall set lifecycleModeMemory to On, test cycle directive to None, and applied lifecycle reason to Ordinary.

##### `CASE_16_DEGRADED_OFF` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Degraded and request facts offActive is true, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to Clear, and applied lifecycle reason to Ordinary.

##### `CASE_17_RECOVERY_PREREQUISITE_LOSS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 RECOVERY PREREQUISITE LOSS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - the value of lifecycleModeMemory on entry is Degraded
>   - request facts offActive is true exactly when F is true
>   - At least one of the following conditions holds:
>     
>       - brake facts evidenceTrusted is true exactly when F is true
>       - brake facts readyForAdmission is true exactly when F is true
>       - health qualification is not Ready
>       - power facts evidenceTrusted is true exactly when F is true
>       - power facts availableForSupervision is true exactly when F is true.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> lifecycleModeMemory is Degraded, test cycle directive is Clear, and applied lifecycle reason is Ordinary.

##### `CASE_18_BEGIN_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Degraded, request facts offActive is true exactly when F is true, brake facts evidenceTrusted is true, brake facts readyForAdmission is true, health qualification is Ready, power facts evidenceTrusted is true, power facts availableForSupervision is true, and request facts freshReturn is true, LifecycleRecoveryOwner shall set lifecycleModeMemory to Degraded, test cycle directive to BeginRecovery, and applied lifecycle reason to Ordinary.

##### `CASE_19_RECOVERY_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, if the value of lifecycleModeMemory on entry is Degraded, request facts offActive is true exactly when F is true, brake facts evidenceTrusted is true, brake facts readyForAdmission is true, health qualification is Ready, power facts evidenceTrusted is true, power facts availableForSupervision is true, request facts freshReturn is true exactly when F is true, and cycle assessment is RecoveryPassed, LifecycleRecoveryOwner shall set lifecycleModeMemory to Off, test cycle directive to Clear, and applied lifecycle reason to RecoveryCompleted.

##### `CASE_20_RECOVERY_WAIT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 20 RECOVERY WAIT applies under all of the following conditions:
>
> the value of lifecycleModeMemory on entry is Degraded, request facts offActive is true exactly when F is true, brake facts evidenceTrusted is true, brake facts readyForAdmission is true, health qualification is Ready, power facts evidenceTrusted is true, power facts availableForSupervision is true, request facts freshReturn is true exactly when F is true, and cycle assessment is not RecoveryPassed.

> When all applicability conditions are met, LifecycleRecoveryOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - lifecycleModeMemory is Degraded
>   - test cycle directive is None
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - cycle assessment is AwaitingRecovery
>           - applied lifecycle reason is RecoveryAwaiting
>       - All of the following conditions hold:
>         
>           - cycle assessment is not AwaitingRecovery
>           - applied lifecycle reason is Ordinary.

### Requirements for PowerQualificationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_POWER_FACTS_SAFE` — Required behavior

> During contract evaluation for the initialization phase, PowerQualificationOwner shall set power to authorization evidenceTrusted to true exactly when F is true, power to authorization availableForSupervision to true exactly when F is true, power to lifecycle evidenceTrusted to true exactly when F is true, and power to lifecycle availableForSupervision to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `POWER_FACT_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, PowerQualificationOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - power observation is Available
>           - power to authorization evidenceTrusted is true
>           - power to authorization availableForSupervision is true
>       - All of the following conditions hold:
>         
>           - power observation is Unavailable
>           - power to authorization evidenceTrusted is true
>           - power to authorization availableForSupervision is true exactly when F is true
>       - All of the following conditions hold:
>         
>           - power observation is Invalid
>           - power to authorization evidenceTrusted is true exactly when F is true
>           - power to authorization availableForSupervision is true exactly when F is true
>   - power to lifecycle evidenceTrusted is true exactly when power to authorization evidenceTrusted is true
>   - power to lifecycle availableForSupervision is true exactly when power to authorization availableForSupervision is true.

### Requirements for RequestPriorityOwner

#### Contract clauses evaluated in the initialization phase

May modify: previousStart, previousOff, previousReturn

##### `INITIAL_REQUEST_HISTORY` — Required behavior

> During contract evaluation for the initialization phase, RequestPriorityOwner shall set previousStart to true exactly when F is true, previousOff to true exactly when F is true, previousReturn to true exactly when F is true, request to authorization offActive to true exactly when F is true, request to authorization freshReturn to true exactly when F is true, request to authorization freshStart to true exactly when F is true, request to authorization conflict to true exactly when F is true, request to authorization disposition to None, request to lifecycle offActive to true exactly when F is true, request to lifecycle freshReturn to true exactly when F is true, request to lifecycle freshStart to true exactly when F is true, request to lifecycle conflict to true exactly when F is true, and request to lifecycle disposition to None.

#### Contract clauses evaluated in the compute phase

May modify: previousStart, previousOff, previousReturn

##### `REQUEST_PRIORITY_DERIVATION` — Required behavior

> During contract evaluation for the compute phase, RequestPriorityOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - request to authorization offActive is true exactly when request levels off is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     request to authorization freshReturn is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - request levels returnLevel is true
>       - It is not the case that:
>         
>         the value of previousReturn on entry is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     request to authorization freshStart is true
>     
>     **Second condition:**
>     
>     All of the following conditions hold:
>     
>       - request levels start is true
>       - It is not the case that:
>         
>         the value of previousStart on entry is true
>   - The first condition holds exactly when the second condition holds:
>     
>     **First condition:**
>     
>     request to authorization conflict is true
>     
>     **Second condition:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is true
>           - request to authorization freshReturn is true
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is true
>           - request to authorization freshStart is true
>       - All of the following conditions hold:
>         
>           - request to authorization freshReturn is true
>           - request to authorization freshStart is true
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is true
>           - request to authorization disposition is OffDominant
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is false
>           - request to authorization freshReturn is true
>           - request to authorization disposition is ReturnCandidate
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is false
>           - request to authorization freshReturn is false
>           - request to authorization freshStart is true
>           - request to authorization disposition is StartCandidate
>       - All of the following conditions hold:
>         
>           - request to authorization offActive is false
>           - request to authorization freshReturn is false
>           - request to authorization freshStart is false
>           - request to authorization disposition is None
>   - request to lifecycle offActive is true exactly when request to authorization offActive is true
>   - request to lifecycle freshReturn is true exactly when request to authorization freshReturn is true
>   - request to lifecycle freshStart is true exactly when request to authorization freshStart is true
>   - request to lifecycle conflict is true exactly when request to authorization conflict is true
>   - request to lifecycle disposition is request to authorization disposition
>   - previousStart is true exactly when request levels start is true
>   - previousOff is true exactly when request levels off is true
>   - previousReturn is true exactly when request levels returnLevel is true.

### Requirements for SelfTestCycleOwner

#### Contract clauses evaluated in the initialization phase

May modify: committedTestCycle

##### `INITIAL_TEST_CYCLE` — Required behavior

> During contract evaluation for the initialization phase, SelfTestCycleOwner shall set committedTestCycle to Idle and cycle assessment to Idle.

#### Contract clauses evaluated in the compute phase

May modify: committedTestCycle

##### `PRE_UPDATE_CYCLE_ASSESSMENT` — Required behavior

> During contract evaluation for the compute phase, SelfTestCycleOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingStart
>       - self test observation is NoEvent
>       - cycle assessment is AwaitingStart
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingStart
>       - self test observation is FreshPass
>       - cycle assessment is StartPassed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingStart
>       - self test observation is FreshFail
>       - cycle assessment is Failed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingStart
>       - self test observation is Invalid
>       - cycle assessment is Invalid
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingRecovery
>       - self test observation is NoEvent
>       - cycle assessment is AwaitingRecovery
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingRecovery
>       - self test observation is FreshPass
>       - cycle assessment is RecoveryPassed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingRecovery
>       - self test observation is FreshFail
>       - cycle assessment is Failed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is AwaitingRecovery
>       - self test observation is Invalid
>       - cycle assessment is Invalid
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of committedTestCycle on entry is StartPassed
>           - the value of committedTestCycle on entry is RecoveryPassed
>       - self test observation is Invalid
>       - cycle assessment is Invalid
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is Idle
>       - cycle assessment is Idle
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is StartPassed
>       - self test observation is not Invalid
>       - cycle assessment is StartPassed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is RecoveryPassed
>       - self test observation is not Invalid
>       - cycle assessment is RecoveryPassed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is Failed
>       - cycle assessment is Failed
>   - All of the following conditions hold:
>     
>       - the value of committedTestCycle on entry is Invalid
>       - cycle assessment is Invalid.

##### `INDEPENDENT_TEST_CYCLE_STORAGE` — Required behavior

> During contract evaluation for the compute phase, SelfTestCycleOwner shall produce a result for which all of the following conditions hold:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - test cycle directive is Clear
>       - committedTestCycle is Idle
>   - All of the following conditions hold:
>     
>       - test cycle directive is BeginStart
>       - committedTestCycle is AwaitingStart
>   - All of the following conditions hold:
>     
>       - test cycle directive is BeginRecovery
>       - committedTestCycle is AwaitingRecovery
>   - All of the following conditions hold:
>     
>       - test cycle directive is None
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - cycle assessment is Idle
>               - committedTestCycle is Idle
>           - All of the following conditions hold:
>             
>               - cycle assessment is AwaitingStart
>               - committedTestCycle is AwaitingStart
>           - All of the following conditions hold:
>             
>               - cycle assessment is AwaitingRecovery
>               - committedTestCycle is AwaitingRecovery
>           - All of the following conditions hold:
>             
>               - cycle assessment is StartPassed
>               - committedTestCycle is StartPassed
>           - All of the following conditions hold:
>             
>               - cycle assessment is RecoveryPassed
>               - committedTestCycle is RecoveryPassed
>           - All of the following conditions hold:
>             
>               - cycle assessment is Failed
>               - committedTestCycle is Failed
>           - All of the following conditions hold:
>             
>               - cycle assessment is Invalid
>               - committedTestCycle is Invalid.

### Requirements for StartAuthorizationOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_START_AUTHORIZATION_SAFE` — Required behavior

> During contract evaluation for the initialization phase, StartAuthorizationOwner shall set authorization to lifecycle decision to NoStart, authorization to lifecycle conflict to true exactly when F is true, authorization to outcome decision to NoStart, and authorization to outcome conflict to true exactly when F is true.

#### Contract clauses evaluated in the compute phase

##### `AUTHORIZATION_PUBLICATION_COHERENCE` — Required behavior

> During contract evaluation for the compute phase, StartAuthorizationOwner shall set authorization to lifecycle conflict to true exactly when request facts conflict is true, authorization to outcome conflict to true exactly when authorization to lifecycle conflict is true, and authorization to outcome decision to authorization to lifecycle decision.

##### `CASE_01_OFF_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if request facts disposition is OffDominant, StartAuthorizationOwner shall set authorization to lifecycle decision to OffPriority.

##### `CASE_02_NO_START_APPLICABILITY` — Conditional behavior

> During contract evaluation for the compute phase, if request facts disposition is ReturnCandidate or request facts disposition is None, StartAuthorizationOwner shall set authorization to lifecycle decision to NoStart.

##### `CASE_03_DENY_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 DENY INVALID applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts disposition is StartCandidate
>   - At least one of the following conditions holds:
>     
>       - brake facts evidenceTrusted is true exactly when F is true
>       - health qualification is Invalid
>       - power facts evidenceTrusted is true exactly when F is true.

> When all applicability conditions are met, StartAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization to lifecycle decision is DenyInvalid.

##### `CASE_04_DENY_NOT_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 DENY NOT READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - request facts disposition is StartCandidate
>   - brake facts evidenceTrusted is true
>   - power facts evidenceTrusted is true
>   - health qualification is not Invalid
>   - At least one of the following conditions holds:
>     
>       - brake facts readyForAdmission is true exactly when F is true
>       - health qualification is NotReady
>       - power facts availableForSupervision is true exactly when F is true.

> When all applicability conditions are met, StartAuthorizationOwner shall produce a result for which all of the following conditions hold:
>
> authorization to lifecycle decision is DenyNotReady.

##### `CASE_05_BEGIN_START_TEST` — Conditional behavior

> During contract evaluation for the compute phase, if request facts disposition is StartCandidate, brake facts evidenceTrusted is true, brake facts readyForAdmission is true, health qualification is Ready, power facts evidenceTrusted is true, and power facts availableForSupervision is true, StartAuthorizationOwner shall set authorization to lifecycle decision to BeginStartTest.
