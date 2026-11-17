# Windshield Defrost Request Supervisor

## Selected system context

### Need, purpose, and goals

NEED-01: A vehicle user needs a bounded way to request windshield defrost while
preventing an asserted defrost enable command when the request signal is invalid, the
windshield condition is unknown, or the vehicle electrical context disallows the load.

PURPOSE-01: The Windshield Defrost Request Supervisor will qualify a user request,
assess whether the observed windshield condition calls for defrost, respect a finite
electrical eligibility decision, issue an enable or off command, and provide a compact
driver-facing status.

GOAL-01: The system shall command windshield defrost on when an actionable request, a
valid obscured-windshield observation, and electrical eligibility coexist.

GOAL-02: The system shall command windshield defrost off for a released or
non-actionable request, a valid clear-windshield observation, an invalid windshield
observation, or electrical ineligibility.

GOAL-03: After an invalid request signal, the system shall require a valid released
request before a later active request can become fresh and actionable; transient
windshield-observation or electrical faults shall recover automatically when their
classifications recover while the request remains actionable.

GOAL-04: The system shall report whether it is idle, actively requesting defrost,
complete because valid glazing is clear, or requires attention because an input or
resource blocks the request.

### Operational context and exact system boundary

CTX-01: **Vehicle user and dashboard/console interface.** This entity supplies the
finite defrost selection and its validity and receives the driver-facing status. The
interface, not the modeled system, is responsible for presenting and encoding these
categories.

CTX-02: **Windshield observation source.** This external entity supplies a
clear-or-obscured classification and a separate validity value. It is responsible for
the truthfulness and freshness represented by `Valid`; the abstract does not prescribe a
sensor or classifier.

CTX-03: **Vehicle electrical coordinator.** This external entity supplies interface
availability and whether the windshield-defrost load is currently permitted. It owns
those classifications; the supervisor does not calculate power quantity.

CTX-04: **Windshield defrost actuation equipment.** This external entity receives an
`Off` or `On` enable command. Physical execution and command-delivery confirmation are
outside the boundary.

MON-01: **DefrostSelection**, supplied by CTX-01, has the exhaustive values `{Released,
Active}` and no unit.

MON-02: **RequestValidity**, supplied by CTX-01, has the exhaustive values `{Valid,
Invalid}` and qualifies MON-01 independently of its encoded selection.

MON-03: **GlazingCondition**, supplied by CTX-02, has the exhaustive values `{Clear,
Obscured}` and denotes the external source's current windshield classification, not a
measured thickness or clearing percentage.

MON-04: **GlazingValidity**, supplied by CTX-02, has the exhaustive values `{Valid,
Invalid}` and qualifies MON-03 independently of its encoded condition.

MON-05: **ElectricalInterfaceStatus**, supplied by CTX-03, has the exhaustive values
`{Available, Unavailable}`.

MON-06: **DefrostLoadAllowance**, supplied by CTX-03, has the exhaustive values
`{Permitted, Restricted}`.

CTRL-01: **DefrostEnableCommand**, received by CTX-04, has the exhaustive values `{Off,
On}`. It is an authorization request only and does not assert physical clearing.

CTRL-02: **DriverDefrostStatus**, received by CTX-01, has the exhaustive values `{Idle,
Defrosting, Complete, AttentionRequired}`.

### Essential assumptions and constraints

ASM-01: CTX-01 is responsible for supplying exactly one value of MON-01 and MON-02 per
logical observation and for using `Invalid` whenever it cannot stand behind the
selection. **Rationale:** separate validity is necessary to distinguish release from an
unusable request signal.

ASM-02: CTX-02 is responsible for supplying exactly one value of MON-03 and MON-04 per
logical observation and for using `Invalid` whenever the clear-or-obscured
classification is not trustworthy. **Rationale:** no quantitative progress metric or
sensor behavior is source-grounded.

ASM-03: CTX-03 is responsible for supplying one value of MON-05 and MON-06 per logical
observation. `Permitted` is meaningful only as its authorization classification; the
model does not infer watts, voltage, or energy. **Rationale:** the seed mentions
electrical context but defines no bound.

ASM-04: CTX-04 is responsible for interpreting CTRL-01 as an enable request. No
assumption that an `On` command physically clears the windshield is needed for model
acceptance. **Rationale:** actuator behavior and feedback are outside the selected
boundary.

ASM-05: The logical observation order in POL-01 is deterministic and sufficiently
coherent for state and contract analysis. **Rationale:** it enables an exhaustive pilot
model while making no claim about real-time latency or scheduling.

## Supporting contract definitions

### State `Windshield_Defrost_Request_Supervisor::RequestIntentTracker::requestMemory`

State `requestMemory` has type `Windshield_Defrost_Request_Supervisor::RequestMemory`.

## Detailed behavioral requirements

### Requirements for DefrostPolicySupervisor

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_POLICY_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, DefrostPolicySupervisor shall set defrostEnableCommand to Off and policyDisposition to Inactive.

#### Contract clauses evaluated in the compute phase

##### `CC_08_NON_ACTIONABLE` — Conditional behavior

> During contract evaluation for the compute phase, if requestIntent is None, requestIntent is BlockedInvalid, or requestIntent is BlockedRearm, DefrostPolicySupervisor shall set defrostEnableCommand to Off and policyDisposition to Inactive.

##### `CC_09_OBSERVATION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, case CC 09 OBSERVATION FAULT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - requestIntent is Fresh
>       - requestIntent is Held
>   - visibilityAssessment is Unknown.

> When all applicability conditions are met, DefrostPolicySupervisor shall produce a result for which all of the following conditions hold:
>
> defrostEnableCommand is Off and policyDisposition is ObservationFault.

##### `CC_10_ELECTRICAL_BLOCK` — Conditional behavior

> During contract evaluation for the compute phase, case CC 10 ELECTRICAL BLOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - requestIntent is Fresh
>       - requestIntent is Held
>   - visibilityAssessment is not Unknown
>   - defrostEligibility is not Eligible.

> When all applicability conditions are met, DefrostPolicySupervisor shall produce a result for which all of the following conditions hold:
>
> defrostEnableCommand is Off and policyDisposition is ElectricalBlocked.

##### `CC_11_ELIGIBLE_VISIBILITY` — Conditional behavior

> During contract evaluation for the compute phase, case CC 11 ELIGIBLE VISIBILITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - requestIntent is Fresh
>       - requestIntent is Held
>   - defrostEligibility is Eligible
>   - visibilityAssessment is not Unknown.

> When all applicability conditions are met, DefrostPolicySupervisor shall produce a result for which all of the following conditions hold:
>
> if visibilityAssessment is NeedsDefrost, then defrostEnableCommand is On and policyDisposition is Defrosting and if visibilityAssessment is Clear, then defrostEnableCommand is Off and policyDisposition is Complete.

### Requirements for DriverFeedbackReporter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_DRIVER_STATUS` — Required behavior

> During contract evaluation for the initialization phase, DriverFeedbackReporter shall set driverDefrostStatus to Idle.

#### Contract clauses evaluated in the compute phase

##### `CC_12_DRIVER_REPORTING` — Conditional behavior

> During contract evaluation for the compute phase, DriverFeedbackReporter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - requestIntent is BlockedInvalid
>       - requestIntent is BlockedRearm
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - requestIntent is Fresh
>               - requestIntent is Held
>           - At least one of the following conditions holds:
>             
>               - policyDisposition is ObservationFault
>               - policyDisposition is ElectricalBlocked
>     
>     **Then:**
>     
>     driverDefrostStatus is AttentionRequired
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is Fresh
>           - requestIntent is Held
>       - policyDisposition is Defrosting
>     
>     **Then:**
>     
>     driverDefrostStatus is Defrosting
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - requestIntent is Fresh
>           - requestIntent is Held
>       - policyDisposition is Complete
>     
>     **Then:**
>     
>     driverDefrostStatus is Complete
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - requestIntent is None
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - requestIntent is Fresh
>               - requestIntent is Held
>           - policyDisposition is Inactive
>     
>     **Then:**
>     
>     driverDefrostStatus is Idle.

### Requirements for ElectricalEligibilityAssessor

#### Contract clauses evaluated in the compute phase

##### `CC_07_ELIGIBILITY_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, ElectricalEligibilityAssessor shall produce a result for which if electricalInterfaceStatus is Unavailable, then defrostEligibility is BlockedUnavailable, if electricalInterfaceStatus is Available and defrostLoadAllowance is Restricted, then defrostEligibility is BlockedRestricted, and if electricalInterfaceStatus is Available and defrostLoadAllowance is Permitted, then defrostEligibility is Eligible.

### Requirements for GlazingConditionAssessor

#### Contract clauses evaluated in the compute phase

##### `CC_06_VISIBILITY_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, GlazingConditionAssessor shall produce a result for which if glazingValidity is Invalid, then visibilityAssessment is Unknown, if glazingValidity is Valid and glazingCondition is Clear, then visibilityAssessment is Clear, and if glazingValidity is Valid and glazingCondition is Obscured, then visibilityAssessment is NeedsDefrost.

### Requirements for RequestIntentTracker

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_REQUEST_STATE` — Required behavior

> During contract evaluation for the initialization phase, RequestIntentTracker shall set requestMemory to Released and requestIntent to None.

#### Contract clauses evaluated in the compute phase

##### `CC_01_FRESH_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid, defrostSelection is Active, and the value of requestMemory on entry is Released, RequestIntentTracker shall set requestIntent to Fresh and requestMemory to AcceptedActive.

##### `CC_02_HELD_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid, defrostSelection is Active, and the value of requestMemory on entry is AcceptedActive, RequestIntentTracker shall set requestIntent to Held and requestMemory to AcceptedActive.

##### `CC_03_RELEASE_REARM` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid and defrostSelection is Released, RequestIntentTracker shall set requestIntent to None and requestMemory to Released.

##### `CC_04_INVALID_REQUEST` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Invalid, RequestIntentTracker shall set requestIntent to BlockedInvalid and requestMemory to RearmRequired.

##### `CC_05_ACTIVE_BEFORE_REARM` — Conditional behavior

> During contract evaluation for the compute phase, if requestValidity is Valid, defrostSelection is Active, and the value of requestMemory on entry is RearmRequired, RequestIntentTracker shall set requestIntent to BlockedRearm and requestMemory to RearmRequired.
