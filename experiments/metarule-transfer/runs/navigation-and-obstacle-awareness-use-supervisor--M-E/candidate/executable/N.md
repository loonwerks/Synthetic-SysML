# Navigation and Obstacle-Awareness Use Supervisor

## Selected system context

### Synopsis, need, and controlled purpose

NEED-01: Drone control needs one bounded logical supervisor to determine whether the
currently supplied navigation and obstacle-awareness evidence may be used for
motion-related control decisions, while making evidence loss, obstacle indication,
manual hold, and recovery observably distinct. This need does not assert that the
supervisor navigates, avoids obstacles, or makes an observation sortie eligible.

PURPOSE-01: The Navigation and Obstacle-Awareness Use Supervisor shall qualify GPS,
inertial, barometric, and obstacle-sensor evidence; derive a navigation basis and an
awareness condition; resolve evidence-driven holds, an external force-hold event, and
reset requests under one deterministic priority; retain one recovery phase; and control
three logical outputs to drone control.

GOAL-01: The system shall allow full or restricted use of navigation evidence only after
its selected finite policy is satisfied and the recovery gate has been opened by a fresh
reset assertion.

GOAL-02: The system shall inhibit motion-related use when navigation evidence is
unusable, obstacle awareness is unavailable in an active or unknown context, a current
obstacle indication is present, or an external force-hold is accepted.

GOAL-03: The system shall expose one consistent navigation-use directive,
obstacle-awareness notice, and supervision status without claiming physical collision
avoidance, navigation accuracy, flight safety, or observation success.

### Operational context and exact system boundary

CTX-01: `DroneControl` is outside the system. It supplies motion context and one
mutually exclusive supervision event, and it receives all controlled outputs. It remains
responsible for any physical flight, navigation, propulsion, landing, mission, or
observation decision.

CTX-02: `NavigationEquipment` is outside the system. It supplies separate GPS, inertial,
and barometric evidence values; the abstract does not model their physical production or
assume independence.

CTX-03: `ObstacleSensor` is outside the system. It supplies one obstacle evidence value;
the abstract does not model detection geometry, range, classification, or physical
obstacle truth.

MON-01: `gpsEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT,
UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied by `CTX-02` once per logical
evaluation.

MON-02: `inertialEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT,
UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied independently in the logical fixture
by `CTX-02` once per evaluation.

MON-03: `barometricEvidence : NavigationEvidence = {NOMINAL_CURRENT, DEGRADED_CURRENT,
UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied independently in the logical fixture
by `CTX-02` once per evaluation.

MON-04: `obstacleEvidence : ObstacleEvidence = {NO_INDICATION_CURRENT,
INDICATION_CURRENT, UNAVAILABLE_CURRENT, STALE, INVALID}` is supplied by `CTX-03` once
per evaluation. `NO_INDICATION_CURRENT` means only that the fixture supplied no
indication; it is not proof that the environment is clear.

MON-05: `motionContext : MotionContext = {STATIONARY, TRANSLATING, LANDING_CONTEXT,
UNKNOWN}` is supplied by `CTX-01`. It is context for logical awareness policy, not
measured motion or a landing-control mode.

MON-06: `supervisionEvent : SupervisionEvent = {NONE, RESET_ONLY, FORCE_HOLD_ONLY,
FORCE_HOLD_WITH_RESET}` is supplied by `CTX-01`. The atomic combined value makes the
force-hold/reset conflict observable; a fresh reset is a `NONE` evaluation followed by a
later `RESET_ONLY` evaluation while recovery is armed.

CTRL-01: `navigationUseDirective : NavigationUseDirective = {MOTION_INHIBITED,
RESTRICTED_NAV_USE, FULL_NAV_USE}` is controlled by the system and received by `CTX-01`.

CTRL-02: `obstacleAwarenessNotice : ObstacleAwarenessNotice = {NO_CURRENT_INDICATION,
CURRENT_INDICATION, AWARENESS_UNAVAILABLE}` is controlled by the system and received by
`CTX-01`; it reports only the selected abstraction of the sampled evidence.

CTRL-03: `supervisionStatus : SupervisionStatus = {STARTUP_HOLD, FULL_USE,
RESTRICTED_USE, HELD_NAV_EVIDENCE, HELD_OBSTACLE_INDICATION, HELD_AWARENESS_LOSS,
HELD_EXTERNAL, RESET_RELEASE_REQUIRED, RESET_REQUIRED}` is controlled by the system and
received by `CTX-01`.

### Risks and required logical mitigations

RISK-01: Accepting invalid, stale, or unavailable navigation evidence could cause drone
control to receive a use permission contrary to the selected policy; cases 01–08, 14,
and 20 conservatively restrict or inhibit it without asserting a physical safety
consequence.

RISK-02: Treating no obstacle indication as environmental clearance, or accepting
unavailable awareness during motion, could overstate the fixture evidence; `MON-04`,
cases 04 and 09–14, and `CTRL-02` preserve the limited logical meaning and withhold use
on awareness loss.

RISK-03: Simultaneous evidence hold, external hold, and reset could produce
contradictory cause and recovery behavior; the single proposal owner, arbiter, priority
`PRI-02`, and state owner select one action and one transition.

RISK-04: A reset held during a fault could reopen the gate automatically when evidence
improves; `FRESH-01`, cases 16 and 18–19, and scenario 07 require observed release and a
later fresh assertion.

### Essential assumptions, constraints, and deferred claims

ASM-01: `CTX-02` is responsible only for supplying one domain-valid value on each of
`MON-01` through `MON-03` per logical evaluation. The selected values do not imply
physical accuracy, timing, independence, or fault diagnosis.

ASM-02: `CTX-03` is responsible only for supplying a domain-valid `MON-04`; no sensor
coverage, detection probability, range, obstacle truth, or environmental guarantee is
assumed.

ASM-03: `CTX-01` is responsible for supplying one domain-valid motion context and one
mutually exclusive event per evaluation, and for interpreting controlled outputs only
within `ABS-03`. Authentication, authority, and physical actuation remain outside the
system.

ASM-04: `INT-14` denotes the committed pre-evaluation recovery phase and `INT-17`
denotes the post-evaluation phase. `PART-09` initializes, reads, and writes the only
retained state; the logical ordering is a pilot assumption, not a physical scheduler or
latency claim.

## Supporting contract definitions

### State `Navigation_Obstacle_Awareness_Use_Supervisor::RecoveryLatchOwner::committedRecoveryPhase`

State `committedRecoveryPhase` has type `Navigation_Obstacle_Awareness_Use_Supervisor::RecoveryPhase`.

## Detailed behavioral requirements

### Requirements for AwarenessConditionOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_AWARENESS_CONDITION` — Required behavior

> During contract evaluation for the initialization phase, AwarenessConditionOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - motionContext is not UNKNOWN
>       - obstacleAssessment is NO INDICATION
>     
>     **Then:**
>     
>     awarenessCondition is AWARENESS CLEAR
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - motionContext is TRANSLATING
>           - motionContext is LANDING CONTEXT
>       - obstacleAssessment is INDICATED
>     
>     **Then:**
>     
>     awarenessCondition is ACTIVE OBSTACLE CONFLICT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - motionContext is STATIONARY
>       - obstacleAssessment is INDICATED
>     
>     **Then:**
>     
>     awarenessCondition is STATIONARY OBSTACLE PRESENT
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - motionContext is UNKNOWN
>       - All of the following conditions hold:
>         
>           - At least one of the following conditions holds:
>             
>               - motionContext is TRANSLATING
>               - motionContext is LANDING CONTEXT
>           - obstacleAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     awarenessCondition is ACTIVE AWARENESS LOSS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - motionContext is STATIONARY
>       - obstacleAssessment is UNAVAILABLE
>     
>     **Then:**
>     
>     awarenessCondition is STATIONARY AWARENESS UNAVAILABLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_09_AWARENESS_CLEAR` — Conditional behavior

> During contract evaluation for the compute phase, if motionContext is not UNKNOWN and obstacleAssessment is NO INDICATION, AwarenessConditionOwner shall set awarenessCondition to AWARENESS CLEAR.

##### `CASE_10_ACTIVE_OBSTACLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 ACTIVE OBSTACLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - motionContext is TRANSLATING
>       - motionContext is LANDING CONTEXT
>   - obstacleAssessment is INDICATED.

> When all applicability conditions are met, AwarenessConditionOwner shall produce a result for which all of the following conditions hold:
>
> awarenessCondition is ACTIVE OBSTACLE CONFLICT.

##### `CASE_11_STATIONARY_OBSTACLE` — Conditional behavior

> During contract evaluation for the compute phase, if motionContext is STATIONARY and obstacleAssessment is INDICATED, AwarenessConditionOwner shall set awarenessCondition to STATIONARY OBSTACLE PRESENT.

##### `CASE_12_ACTIVE_AWARENESS_LOSS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 ACTIVE AWARENESS LOSS applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - motionContext is UNKNOWN
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - motionContext is TRANSLATING
>           - motionContext is LANDING CONTEXT
>       - obstacleAssessment is UNAVAILABLE.

> When all applicability conditions are met, AwarenessConditionOwner shall produce a result for which all of the following conditions hold:
>
> awarenessCondition is ACTIVE AWARENESS LOSS.

##### `CASE_13_STATIONARY_AWARENESS_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if motionContext is STATIONARY and obstacleAssessment is UNAVAILABLE, AwarenessConditionOwner shall set awarenessCondition to STATIONARY AWARENESS UNAVAILABLE.

### Requirements for BarometricEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_BAROMETRIC_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, BarometricEvidenceQualifier shall produce a result for which if barometricEvidence is NOMINAL CURRENT, then barometricAssessment is READY, if barometricEvidence is DEGRADED CURRENT, then barometricAssessment is LIMITED, and if barometricEvidence is UNAVAILABLE CURRENT, barometricEvidence is STALE, or barometricEvidence is INVALID, then barometricAssessment is REJECTED.

#### Contract clauses evaluated in the compute phase

##### `CASE_03_BAROMETRIC_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, BarometricEvidenceQualifier shall produce a result for which if barometricEvidence is NOMINAL CURRENT, then barometricAssessment is READY, if barometricEvidence is DEGRADED CURRENT, then barometricAssessment is LIMITED, and if barometricEvidence is UNAVAILABLE CURRENT, barometricEvidence is STALE, or barometricEvidence is INVALID, then barometricAssessment is REJECTED.

### Requirements for ConstraintProposalOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_CONSTRAINT_PROPOSAL` — Required behavior

> During contract evaluation for the initialization phase, ConstraintProposalOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - awarenessCondition is ACTIVE OBSTACLE CONFLICT
>       - awarenessCondition is STATIONARY OBSTACLE PRESENT
>     
>     **Then:**
>     
>     constraintProposal is HOLD OBSTACLE
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - awarenessCondition is ACTIVE AWARENESS LOSS
>       - awarenessCondition is STATIONARY AWARENESS UNAVAILABLE
>     
>     **Then:**
>     
>     constraintProposal is HOLD AWARENESS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - navigationBasis is UNUSABLE BASIS
>     
>     **Then:**
>     
>     constraintProposal is HOLD NAVIGATION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - At least one of the following conditions holds:
>         
>           - navigationBasis is RELATIVE BASIS
>           - navigationBasis is LIMITED BASIS
>     
>     **Then:**
>     
>     constraintProposal is RESTRICT NAVIGATION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - navigationBasis is FULL BASIS
>     
>     **Then:**
>     
>     constraintProposal is ALLOW FULL.

#### Contract clauses evaluated in the compute phase

##### `CASE_14_PROPOSAL_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, ConstraintProposalOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - awarenessCondition is ACTIVE OBSTACLE CONFLICT
>       - awarenessCondition is STATIONARY OBSTACLE PRESENT
>     
>     **Then:**
>     
>     constraintProposal is HOLD OBSTACLE
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - awarenessCondition is ACTIVE AWARENESS LOSS
>       - awarenessCondition is STATIONARY AWARENESS UNAVAILABLE
>     
>     **Then:**
>     
>     constraintProposal is HOLD AWARENESS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - navigationBasis is UNUSABLE BASIS
>     
>     **Then:**
>     
>     constraintProposal is HOLD NAVIGATION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - At least one of the following conditions holds:
>         
>           - navigationBasis is RELATIVE BASIS
>           - navigationBasis is LIMITED BASIS
>     
>     **Then:**
>     
>     constraintProposal is RESTRICT NAVIGATION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - awarenessCondition is AWARENESS CLEAR
>       - navigationBasis is FULL BASIS
>     
>     **Then:**
>     
>     constraintProposal is ALLOW FULL.

### Requirements for EventPriorityArbiter

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_ACCEPTED_ACTION` — Required behavior

> During contract evaluation for the initialization phase, EventPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - recoveryAction is outcomeAction
>   - **If:**
>     
>     constraintProposal is HOLD OBSTACLE
>     
>     **Then:**
>     
>     recoveryAction is APPLY OBSTACLE HOLD
>   - **If:**
>     
>     constraintProposal is HOLD AWARENESS
>     
>     **Then:**
>     
>     recoveryAction is APPLY AWARENESS HOLD
>   - **If:**
>     
>     constraintProposal is HOLD NAVIGATION
>     
>     **Then:**
>     
>     recoveryAction is APPLY NAV HOLD
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - constraintProposal is ALLOW FULL
>       - constraintProposal is RESTRICT NAVIGATION
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - **If:**
>         
>         At least one of the following conditions holds:
>         
>           - supervisionEvent is FORCE HOLD ONLY
>           - supervisionEvent is FORCE HOLD WITH RESET
>         
>         **Then:**
>         
>         recoveryAction is APPLY EXTERNAL HOLD
>       - **If:**
>         
>         All of the following conditions hold:
>         
>           - supervisionEvent is RESET ONLY
>           - preRecoveryPhase is ARMED
>         
>         **Then:**
>         
>         recoveryAction is ACCEPT RESET
>       - **If:**
>         
>         All of the following conditions hold:
>         
>           - supervisionEvent is RESET ONLY
>           - At least one of the following conditions holds:
>             
>               - preRecoveryPhase is WAIT RELEASE
>               - preRecoveryPhase is LATCHED
>         
>         **Then:**
>         
>         recoveryAction is IGNORE RESET
>       - **If:**
>         
>         At least one of the following conditions holds:
>         
>           - supervisionEvent is NONE
>           - All of the following conditions hold:
>             
>               - supervisionEvent is RESET ONLY
>               - preRecoveryPhase is OPEN
>         
>         **Then:**
>         
>         All of the following conditions hold:
>         
>           - **If:**
>             
>             constraintProposal is ALLOW FULL
>             
>             **Then:**
>             
>             recoveryAction is APPLY FULL
>           - **If:**
>             
>             constraintProposal is RESTRICT NAVIGATION
>             
>             **Then:**
>             
>             recoveryAction is APPLY RESTRICTED.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_ACTION_PUBLICATIONS` — Required behavior

> During contract evaluation for the compute phase, EventPriorityArbiter shall set outcomeAction to recoveryAction.

##### `CASE_15_EVIDENCE_HOLD_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, if constraintProposal is HOLD OBSTACLE, constraintProposal is HOLD AWARENESS, or constraintProposal is HOLD NAVIGATION, EventPriorityArbiter shall produce a result for which if constraintProposal is HOLD OBSTACLE, then recoveryAction is APPLY OBSTACLE HOLD, if constraintProposal is HOLD AWARENESS, then recoveryAction is APPLY AWARENESS HOLD, and if constraintProposal is HOLD NAVIGATION, then recoveryAction is APPLY NAV HOLD.

##### `CASE_16_EVENT_AND_RESET_PRIORITY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 16 EVENT AND RESET PRIORITY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - constraintProposal is ALLOW FULL
>       - constraintProposal is RESTRICT NAVIGATION
>   - supervisionEvent is not NONE.

> When all applicability conditions are met, EventPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - supervisionEvent is FORCE HOLD ONLY
>       - supervisionEvent is FORCE HOLD WITH RESET
>     
>     **Then:**
>     
>     recoveryAction is APPLY EXTERNAL HOLD
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - supervisionEvent is RESET ONLY
>       - preRecoveryPhase is ARMED
>     
>     **Then:**
>     
>     recoveryAction is ACCEPT RESET
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - supervisionEvent is RESET ONLY
>       - At least one of the following conditions holds:
>         
>           - preRecoveryPhase is WAIT RELEASE
>           - preRecoveryPhase is LATCHED
>     
>     **Then:**
>     
>     recoveryAction is IGNORE RESET
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - supervisionEvent is RESET ONLY
>       - preRecoveryPhase is OPEN
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - **If:**
>         
>         constraintProposal is ALLOW FULL
>         
>         **Then:**
>         
>         recoveryAction is APPLY FULL
>       - **If:**
>         
>         constraintProposal is RESTRICT NAVIGATION
>         
>         **Then:**
>         
>         recoveryAction is APPLY RESTRICTED.

##### `CASE_17_SAFE_USE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 17 SAFE USE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - constraintProposal is ALLOW FULL
>       - constraintProposal is RESTRICT NAVIGATION
>   - supervisionEvent is NONE.

> When all applicability conditions are met, EventPriorityArbiter shall produce a result for which all of the following conditions hold:
>
> if constraintProposal is ALLOW FULL, then recoveryAction is APPLY FULL and if constraintProposal is RESTRICT NAVIGATION, then recoveryAction is APPLY RESTRICTED.

### Requirements for GpsEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_GPS_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, GpsEvidenceQualifier shall produce a result for which if gpsEvidence is NOMINAL CURRENT, then gpsAssessment is READY, if gpsEvidence is DEGRADED CURRENT, then gpsAssessment is LIMITED, and if gpsEvidence is UNAVAILABLE CURRENT, gpsEvidence is STALE, or gpsEvidence is INVALID, then gpsAssessment is REJECTED.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_GPS_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, GpsEvidenceQualifier shall produce a result for which if gpsEvidence is NOMINAL CURRENT, then gpsAssessment is READY, if gpsEvidence is DEGRADED CURRENT, then gpsAssessment is LIMITED, and if gpsEvidence is UNAVAILABLE CURRENT, gpsEvidence is STALE, or gpsEvidence is INVALID, then gpsAssessment is REJECTED.

### Requirements for InertialEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_INERTIAL_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, InertialEvidenceQualifier shall produce a result for which if inertialEvidence is NOMINAL CURRENT, then inertialAssessment is READY, if inertialEvidence is DEGRADED CURRENT, then inertialAssessment is LIMITED, and if inertialEvidence is UNAVAILABLE CURRENT, inertialEvidence is STALE, or inertialEvidence is INVALID, then inertialAssessment is REJECTED.

#### Contract clauses evaluated in the compute phase

##### `CASE_02_INERTIAL_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, InertialEvidenceQualifier shall produce a result for which if inertialEvidence is NOMINAL CURRENT, then inertialAssessment is READY, if inertialEvidence is DEGRADED CURRENT, then inertialAssessment is LIMITED, and if inertialEvidence is UNAVAILABLE CURRENT, inertialEvidence is STALE, or inertialEvidence is INVALID, then inertialAssessment is REJECTED.

### Requirements for NavigationBasisOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_NAVIGATION_BASIS` — Required behavior

> During contract evaluation for the initialization phase, NavigationBasisOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - proposalBasis is outcomeBasis
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - gpsAssessment is READY
>       - inertialAssessment is READY
>       - barometricAssessment is READY
>     
>     **Then:**
>     
>     proposalBasis is FULL BASIS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - gpsAssessment is REJECTED
>       - inertialAssessment is not REJECTED
>       - barometricAssessment is not REJECTED
>     
>     **Then:**
>     
>     proposalBasis is RELATIVE BASIS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - gpsAssessment is not REJECTED
>       - At least one of the following conditions holds:
>         
>           - inertialAssessment is not REJECTED
>           - barometricAssessment is not REJECTED
>       - At least one of the following conditions holds:
>         
>           - gpsAssessment is not READY
>           - inertialAssessment is not READY
>           - barometricAssessment is not READY
>     
>     **Then:**
>     
>     proposalBasis is LIMITED BASIS
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - gpsAssessment is REJECTED
>           - At least one of the following conditions holds:
>             
>               - inertialAssessment is REJECTED
>               - barometricAssessment is REJECTED
>       - All of the following conditions hold:
>         
>           - gpsAssessment is not REJECTED
>           - inertialAssessment is REJECTED
>           - barometricAssessment is REJECTED
>     
>     **Then:**
>     
>     proposalBasis is UNUSABLE BASIS.

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_BASIS_PUBLICATIONS` — Required behavior

> During contract evaluation for the compute phase, NavigationBasisOwner shall set outcomeBasis to proposalBasis.

##### `CASE_05_FULL_BASIS` — Conditional behavior

> During contract evaluation for the compute phase, if gpsAssessment is READY, inertialAssessment is READY, and barometricAssessment is READY, NavigationBasisOwner shall set proposalBasis to FULL BASIS.

##### `CASE_06_RELATIVE_BASIS` — Conditional behavior

> During contract evaluation for the compute phase, if gpsAssessment is REJECTED, inertialAssessment is not REJECTED, and barometricAssessment is not REJECTED, NavigationBasisOwner shall set proposalBasis to RELATIVE BASIS.

##### `CASE_07_LIMITED_BASIS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 LIMITED BASIS applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - gpsAssessment is not REJECTED
>   - At least one of the following conditions holds:
>     
>       - inertialAssessment is not REJECTED
>       - barometricAssessment is not REJECTED
>   - At least one of the following conditions holds:
>     
>       - gpsAssessment is not READY
>       - inertialAssessment is not READY
>       - barometricAssessment is not READY.

> When all applicability conditions are met, NavigationBasisOwner shall produce a result for which all of the following conditions hold:
>
> proposalBasis is LIMITED BASIS.

##### `CASE_08_UNUSABLE_BASIS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 UNUSABLE BASIS applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - All of the following conditions hold:
>     
>       - gpsAssessment is REJECTED
>       - At least one of the following conditions holds:
>         
>           - inertialAssessment is REJECTED
>           - barometricAssessment is REJECTED
>   - All of the following conditions hold:
>     
>       - gpsAssessment is not REJECTED
>       - inertialAssessment is REJECTED
>       - barometricAssessment is REJECTED.

> When all applicability conditions are met, NavigationBasisOwner shall produce a result for which all of the following conditions hold:
>
> proposalBasis is UNUSABLE BASIS.

### Requirements for ObstacleEvidenceQualifier

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_OBSTACLE_ASSESSMENT` — Required behavior

> During contract evaluation for the initialization phase, ObstacleEvidenceQualifier shall produce a result for which if obstacleEvidence is NO INDICATION CURRENT, then obstacleAssessment is NO INDICATION, if obstacleEvidence is INDICATION CURRENT, then obstacleAssessment is INDICATED, and if obstacleEvidence is UNAVAILABLE CURRENT, obstacleEvidence is STALE, or obstacleEvidence is INVALID, then obstacleAssessment is UNAVAILABLE.

#### Contract clauses evaluated in the compute phase

##### `CASE_04_OBSTACLE_CLASSIFICATION` — Conditional behavior

> During contract evaluation for the compute phase, ObstacleEvidenceQualifier shall produce a result for which if obstacleEvidence is NO INDICATION CURRENT, then obstacleAssessment is NO INDICATION, if obstacleEvidence is INDICATION CURRENT, then obstacleAssessment is INDICATED, and if obstacleEvidence is UNAVAILABLE CURRENT, obstacleEvidence is STALE, or obstacleEvidence is INVALID, then obstacleAssessment is UNAVAILABLE.

### Requirements for RecoveryLatchOwner

#### Contract clauses evaluated in the initialization phase

May modify: committedRecoveryPhase

##### `INITIAL_RECOVERY_CLOSED` — Required behavior

> During contract evaluation for the initialization phase, RecoveryLatchOwner shall set committedRecoveryPhase to WAIT RELEASE, preRecoveryPhase to WAIT RELEASE, and postRecoveryPhase to WAIT RELEASE.

#### Contract clauses evaluated in the compute phase

May modify: committedRecoveryPhase

##### `PUBLISH_PRE_EVALUATION_PHASE` — Required behavior

> During contract evaluation for the compute phase, RecoveryLatchOwner shall set preRecoveryPhase to the value of committedRecoveryPhase on entry.

##### `PUBLISH_POST_EVALUATION_PHASE` — Required behavior

> During contract evaluation for the compute phase, RecoveryLatchOwner shall set postRecoveryPhase to committedRecoveryPhase.

##### `CASE_18_CLOSED_RECOVERY_TRANSITIONS` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 18 CLOSED RECOVERY TRANSITIONS applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - acceptedAction is APPLY OBSTACLE HOLD
>   - acceptedAction is APPLY AWARENESS HOLD
>   - acceptedAction is APPLY NAV HOLD
>   - acceptedAction is APPLY EXTERNAL HOLD
>   - acceptedAction is IGNORE RESET
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>       - At least one of the following conditions holds:
>         
>           - the value of committedRecoveryPhase on entry is LATCHED
>           - the value of committedRecoveryPhase on entry is WAIT RELEASE.

> When all applicability conditions are met, RecoveryLatchOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - acceptedAction is APPLY OBSTACLE HOLD
>       - acceptedAction is APPLY AWARENESS HOLD
>       - acceptedAction is APPLY NAV HOLD
>       - acceptedAction is APPLY EXTERNAL HOLD
>     
>     **Then:**
>     
>     committedRecoveryPhase is LATCHED
>   - **If:**
>     
>     acceptedAction is IGNORE RESET
>     
>     **Then:**
>     
>     committedRecoveryPhase is WAIT RELEASE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>       - At least one of the following conditions holds:
>         
>           - the value of committedRecoveryPhase on entry is LATCHED
>           - the value of committedRecoveryPhase on entry is WAIT RELEASE
>     
>     **Then:**
>     
>     committedRecoveryPhase is ARMED.

##### `CASE_19_OPEN_OR_RETAIN_RECOVERY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 19 OPEN OR RETAIN RECOVERY applies under all of the following conditions:
>
> At least one of the following conditions holds:
>
>   - acceptedAction is ACCEPT RESET
>   - All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>       - At least one of the following conditions holds:
>         
>           - the value of committedRecoveryPhase on entry is ARMED
>           - the value of committedRecoveryPhase on entry is OPEN.

> When all applicability conditions are met, RecoveryLatchOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     acceptedAction is ACCEPT RESET
>     
>     **Then:**
>     
>     committedRecoveryPhase is OPEN
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>       - the value of committedRecoveryPhase on entry is ARMED
>     
>     **Then:**
>     
>     committedRecoveryPhase is ARMED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>       - the value of committedRecoveryPhase on entry is OPEN
>     
>     **Then:**
>     
>     committedRecoveryPhase is OPEN.

### Requirements for SupervisionOutcomeOwner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_SAFE_OUTPUTS` — Required behavior

> During contract evaluation for the initialization phase, SupervisionOutcomeOwner shall set navigationUseDirective to MOTION INHIBITED, obstacleAwarenessNotice to AWARENESS UNAVAILABLE, and supervisionStatus to STARTUP HOLD.

#### Contract clauses evaluated in the compute phase

##### `CASE_20_JOINT_OUTCOME` — Conditional behavior

> During contract evaluation for the compute phase, SupervisionOutcomeOwner shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     postRecoveryPhase is not OPEN
>     
>     **Then:**
>     
>     navigationUseDirective is MOTION INHIBITED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is OPEN
>       - navigationBasis is FULL BASIS
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is ACCEPT RESET
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - navigationUseDirective is FULL NAV USE
>       - supervisionStatus is FULL USE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is OPEN
>       - At least one of the following conditions holds:
>         
>           - navigationBasis is RELATIVE BASIS
>           - navigationBasis is LIMITED BASIS
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY RESTRICTED
>           - acceptedAction is ACCEPT RESET
>     
>     **Then:**
>     
>     All of the following conditions hold:
>     
>       - navigationUseDirective is RESTRICTED NAV USE
>       - supervisionStatus is RESTRICTED USE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is not OPEN
>       - acceptedAction is APPLY OBSTACLE HOLD
>     
>     **Then:**
>     
>     supervisionStatus is HELD OBSTACLE INDICATION
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is not OPEN
>       - acceptedAction is APPLY AWARENESS HOLD
>     
>     **Then:**
>     
>     supervisionStatus is HELD AWARENESS LOSS
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is not OPEN
>       - acceptedAction is APPLY NAV HOLD
>     
>     **Then:**
>     
>     supervisionStatus is HELD NAV EVIDENCE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is not OPEN
>       - acceptedAction is APPLY EXTERNAL HOLD
>     
>     **Then:**
>     
>     supervisionStatus is HELD EXTERNAL
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is WAIT RELEASE
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is IGNORE RESET
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>     
>     **Then:**
>     
>     supervisionStatus is RESET RELEASE REQUIRED
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - postRecoveryPhase is ARMED
>       - At least one of the following conditions holds:
>         
>           - acceptedAction is APPLY FULL
>           - acceptedAction is APPLY RESTRICTED
>     
>     **Then:**
>     
>     supervisionStatus is RESET REQUIRED
>   - **If:**
>     
>     acceptedAction is APPLY OBSTACLE HOLD
>     
>     **Then:**
>     
>     obstacleAwarenessNotice is CURRENT INDICATION
>   - **If:**
>     
>     acceptedAction is APPLY AWARENESS HOLD
>     
>     **Then:**
>     
>     obstacleAwarenessNotice is AWARENESS UNAVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - acceptedAction is not APPLY OBSTACLE HOLD
>       - acceptedAction is not APPLY AWARENESS HOLD
>     
>     **Then:**
>     
>     obstacleAwarenessNotice is NO CURRENT INDICATION.
