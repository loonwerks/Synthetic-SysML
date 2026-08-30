# Frigate threat-response coordination system

## Selected system context

### Synopsis

PURPOSE-01: The system will qualify two sources of threat evidence, determine defense
and retreat readiness, own one response commitment, command defense or retreat-oriented
navigation, and compose an acknowledged threat report. It controls requested responses
only; sensors, drones, navigation execution, report transport, hostile behavior, and
mission outcomes remain external.

### Goals and controlled scope

GOAL-01: The system shall determine exactly one defense command, one retreat-navigation
command, one response record, and the next values of its two principal state items for
every admissible decision snapshot.

GOAL-02: The system shall distinguish clear, suspect, hostile, contradictory, and
invalid threat evidence and shall make invalid or contradictory response-support
evidence observable without presenting it as a confirmed hostile contact.

GOAL-03: An established retreat commitment shall persist through a blocked route and
shall close only on valid retreat-completion evidence; a consumed pilot retreat request
shall not start another retreat episode until a valid non-retreat request rearms it.

GOAL-04: Exactly one principal response owner shall select defense versus retreat versus
hold, own the response commitment and request-arm state, and select the eight
command-policy cases; other usages may derive local facts or reporting priority but
shall not select or override the response disposition.

### Operational context and system boundary

CTX-01: The pilot and fleet-reporting interface supplies an identification report, a
response request, and report acknowledgment, and receives the composed threat report. It
does not directly set the principal owner's internal commitment.

CTX-02: The frigate contact-sensing environment supplies contact-signature evidence. The
abstraction neither specifies sensing technology nor assumes that a valid signature
alone proves hostility.

CTX-03: The defense environment supplies defense and drone readiness evidence and
receives a defense-activation command. Command receipt does not establish target lock,
engagement, neutralization, or success.

CTX-04: The retreat-navigation environment supplies destination and warp-progress
evidence and receives a retreat-navigation command. Command receipt and progress
evidence do not establish physical safety, correct destination, docking, or return to
station.

CTX-05: Mining, cargo, station service, hostile ships, and the wider mission supervisor
are external context with no root flow in this abstract. They may change the external
evidence providers, but no mining, cargo, or service state is reconstructed inside the
boundary.

MON-01: `contact_evidence`, supplied by CTX-02, contains `signature` exactly `None` or
`Contact` and an independent `signature_status` exactly `Valid` or `Invalid`.

MON-02: `identification_evidence`, supplied by CTX-01, contains `identity` exactly
`No_Hostile` or `Hostile` and an independent `identity_status` exactly `Valid` or
`Invalid`.

MON-03: `defense_evidence`, supplied by CTX-03, contains `defense_available` exactly
`Available` or `Unavailable`, `drone_readiness` exactly `Ready` or `Not_Ready`, and an
independent `Valid` or `Invalid` status for each field.

MON-04: `retreat_navigation_evidence`, supplied by CTX-04, contains `destination`
exactly `Identified` or `Absent`, `warp_progress` exactly `Ready`, `In_Progress`,
`Complete`, or `Unavailable`, and an independent `Valid` or `Invalid` status for each
field.

MON-05: `response_request`, supplied by CTX-01, is exactly `Observe`,
`Defend_If_Hostile`, or `Retreat` and has independent status exactly `Valid` or
`Invalid`.

MON-06: `report_acknowledgment`, supplied by CTX-01, is exactly `Not_Acknowledged` or
`Acknowledged` and has independent status exactly `Valid` or `Invalid`. Its validity
affects reporting priority only and shall not inhibit otherwise valid defense or retreat
commands.

CTRL-01: `defense_activation`, delivered to CTX-03, is exactly `Stand_Down` or
`Activate` and controls requested defensive activation only.

CTRL-02: `retreat_navigation_command`, delivered to CTX-04, is exactly `Hold` or
`Retreat` and controls requested retreat-oriented navigation only.

CTRL-03: `threat_report`, delivered to CTX-01, contains the qualified threat class,
selected response disposition, and report priority. Threat class is exactly `Clear`,
`Suspect`, `Hostile`, or `Unknown`; disposition is exactly `Observed`, `Defense_Active`,
`Retreat_Active`, `Retreat_Blocked`, `Retreat_Complete`, or `Input_Fault`; and priority
is exactly `Communication_Fault`, `Closed`, `Urgent`, or `Routine`.

### Selected pilot assumptions and constraints

ASM-01: CTX-01 through CTX-04 are responsible for pairing each supplied field with its
status in one stable logical snapshot. This no-tearing assumption permits finite
analysis; it is not a physical timing or synchronization claim.

ASM-02: CTX-04 is responsible for asserting `Complete` only after the externally
executed retreat movement has completed according to its own criteria. The system
consumes that indication but does not validate position or safety.

### Risks, state, and transitions

RISK-01: Invalid or contradictory evidence could otherwise be presented as confirmed
hostility and trigger an unsupported command. FAULT-01 inhibits both commands and
exposes `Input_Fault`; no probability or physical severity is claimed.

RISK-02: Clearing a retreat commitment when navigation is merely unavailable could
suppress later progress after the route recovers. FAULT-02 and FAULT-03 retain
`Retreat_Committed` until BEH-02 receives valid completion evidence.

RISK-03: A report-acknowledgment fault could otherwise suppress a valid response or be
confused with decision-input invalidity. FAULT-04 confines that fault to report priority
while leaving command policy unchanged.

MODE-01: The system has no published mission phase or operational mode.
`response_commitment` is internal decision memory whose observable consequence is
limited to command persistence and response disposition; it does not describe mining,
docking, service, or whole-frigate lifecycle state.

## Supporting contract definitions

### State `Frigate_Threat_Response_Coordinator::PrincipalResponseCoordinator::responseCommitment`

State `responseCommitment` has type `Frigate_Threat_Response_Coordinator::ResponseCommitment`.

### State `Frigate_Threat_Response_Coordinator::PrincipalResponseCoordinator::retreatRequestArmed`

State `retreatRequestArmed` has type `Base_Types::Boolean`.

## Detailed behavioral requirements

### Requirements for DefenseReadinessAssessor

#### Contract clauses evaluated in the compute phase

##### `DERIVE_DEFENSE_CONDITION` — Required behavior

> During contract evaluation for the compute phase, DefenseReadinessAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - defenseEvidence defenseStatus is INVALID
>       - defenseEvidence droneStatus is INVALID
>     
>     **Then:**
>     
>     defenseCondition is UNKNOWN
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - defenseEvidence defenseStatus is VALID
>       - defenseEvidence droneStatus is VALID
>       - defenseEvidence defenseAvailable is AVAILABLE
>       - defenseEvidence droneReadiness is READY
>     
>     **Then:**
>     
>     defenseCondition is READY
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - defenseEvidence defenseStatus is VALID
>       - defenseEvidence droneStatus is VALID
>       - At least one of the following conditions holds:
>         
>           - defenseEvidence defenseAvailable is UNAVAILABLE
>           - defenseEvidence droneReadiness is NOT READY
>     
>     **Then:**
>     
>     defenseCondition is UNAVAILABLE.

### Requirements for PrincipalResponseCoordinator

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_RESPONSE_STATE` — Required behavior

> During contract evaluation for the initialization phase, PrincipalResponseCoordinator shall set responseCommitment to OPEN, retreatRequestArmed to true exactly when T is true, defenseActivation to STAND DOWN, retreatNavigationCommand to HOLD, responseRecord qualifiedThreat to UNKNOWN, and responseRecord disposition to INPUT FAULT.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INPUT_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreat is UNKNOWN, defenseCondition is UNKNOWN, retreatCondition is UNKNOWN, or responseRequest requestStatus is INVALID, PrincipalResponseCoordinator shall produce a result for which defenseActivation is STAND DOWN, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is INPUT FAULT, if the value of responseCommitment on entry is RETREAT COMMITTED, then responseCommitment is RETREAT COMMITTED, if the value of responseCommitment on entry is not RETREAT COMMITTED, then responseCommitment is OPEN, if responseRequest requestStatus is VALID and responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true, and if responseRequest requestStatus is INVALID or responseRequest request is RETREAT, then retreatRequestArmed is true exactly when the value of retreatRequestArmed on entry is true.

##### `CASE_02_COMMITTED_RETREAT_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreat is not UNKNOWN, defenseCondition is not UNKNOWN, retreatCondition is not UNKNOWN, responseRequest requestStatus is VALID, the value of responseCommitment on entry is RETREAT COMMITTED, and retreatCondition is AVAILABLE, PrincipalResponseCoordinator shall produce a result for which defenseActivation is STAND DOWN, retreatNavigationCommand is RETREAT, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is RETREAT ACTIVE, responseCommitment is RETREAT COMMITTED, if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true, and if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when the value of retreatRequestArmed on entry is true.

##### `CASE_03_COMMITTED_RETREAT_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreat is not UNKNOWN, defenseCondition is not UNKNOWN, retreatCondition is not UNKNOWN, responseRequest requestStatus is VALID, the value of responseCommitment on entry is RETREAT COMMITTED, and retreatCondition is UNAVAILABLE, PrincipalResponseCoordinator shall produce a result for which defenseActivation is STAND DOWN, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is RETREAT BLOCKED, responseCommitment is RETREAT COMMITTED, if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true, and if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when the value of retreatRequestArmed on entry is true.

##### `CASE_04_RETREAT_COMPLETE` — Conditional behavior

> During contract evaluation for the compute phase, if qualifiedThreat is not UNKNOWN, defenseCondition is not UNKNOWN, retreatCondition is not UNKNOWN, responseRequest requestStatus is VALID, the value of responseCommitment on entry is RETREAT COMMITTED, and retreatCondition is COMPLETE, PrincipalResponseCoordinator shall produce a result for which defenseActivation is STAND DOWN, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is RETREAT COMPLETE, responseCommitment is OPEN, if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true, and if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when the value of retreatRequestArmed on entry is true.

##### `CASE_05_FRESH_RETREAT_ACTIVE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 FRESH RETREAT ACTIVE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreat is not UNKNOWN
>   - defenseCondition is not UNKNOWN
>   - retreatCondition is not UNKNOWN
>   - responseRequest requestStatus is VALID
>   - the value of responseCommitment on entry is not RETREAT COMMITTED
>   - retreatCondition is AVAILABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - responseRequest request is RETREAT
>           - the value of retreatRequestArmed on entry is true exactly when T is true
>       - All of the following conditions hold:
>         
>           - responseRequest request is DEFEND IF HOSTILE
>           - qualifiedThreat is HOSTILE
>           - defenseCondition is UNAVAILABLE.

> When all applicability conditions are met, PrincipalResponseCoordinator shall produce a result for which all of the following conditions hold:
>
> defenseActivation is STAND DOWN, retreatNavigationCommand is RETREAT, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is RETREAT ACTIVE, responseCommitment is RETREAT COMMITTED, if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when F is true, and if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true.

##### `CASE_06_FRESH_RETREAT_BLOCKED` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 FRESH RETREAT BLOCKED applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreat is not UNKNOWN
>   - defenseCondition is not UNKNOWN
>   - retreatCondition is not UNKNOWN
>   - responseRequest requestStatus is VALID
>   - the value of responseCommitment on entry is not RETREAT COMMITTED
>   - retreatCondition is UNAVAILABLE
>   - At least one of the following conditions holds:
>     
>       - All of the following conditions hold:
>         
>           - responseRequest request is RETREAT
>           - the value of retreatRequestArmed on entry is true exactly when T is true
>       - All of the following conditions hold:
>         
>           - responseRequest request is DEFEND IF HOSTILE
>           - qualifiedThreat is HOSTILE
>           - defenseCondition is UNAVAILABLE.

> When all applicability conditions are met, PrincipalResponseCoordinator shall produce a result for which all of the following conditions hold:
>
> defenseActivation is STAND DOWN, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is RETREAT BLOCKED, responseCommitment is RETREAT COMMITTED, if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when F is true, and if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true.

##### `CASE_07_CONFIRMED_DEFENSE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 CONFIRMED DEFENSE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreat is not UNKNOWN
>   - defenseCondition is not UNKNOWN
>   - retreatCondition is not UNKNOWN
>   - responseRequest requestStatus is VALID
>   - the value of responseCommitment on entry is not RETREAT COMMITTED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - retreatCondition is not COMPLETE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - responseRequest request is RETREAT
>               - the value of retreatRequestArmed on entry is true exactly when T is true
>           - All of the following conditions hold:
>             
>               - responseRequest request is DEFEND IF HOSTILE
>               - qualifiedThreat is HOSTILE
>               - defenseCondition is UNAVAILABLE
>   - qualifiedThreat is HOSTILE
>   - responseRequest request is DEFEND IF HOSTILE
>   - defenseCondition is READY.

> When all applicability conditions are met, PrincipalResponseCoordinator shall produce a result for which all of the following conditions hold:
>
> defenseActivation is ACTIVATE, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is DEFENSE ACTIVE, responseCommitment is DEFENSE COMMITTED, and retreatRequestArmed is true exactly when T is true.

##### `CASE_08_OBSERVATION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 OBSERVATION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - qualifiedThreat is not UNKNOWN
>   - defenseCondition is not UNKNOWN
>   - retreatCondition is not UNKNOWN
>   - responseRequest requestStatus is VALID
>   - the value of responseCommitment on entry is not RETREAT COMMITTED
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - retreatCondition is not COMPLETE
>       - At least one of the following conditions holds:
>         
>           - All of the following conditions hold:
>             
>               - responseRequest request is RETREAT
>               - the value of retreatRequestArmed on entry is true exactly when T is true
>           - All of the following conditions hold:
>             
>               - responseRequest request is DEFEND IF HOSTILE
>               - qualifiedThreat is HOSTILE
>               - defenseCondition is UNAVAILABLE
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - qualifiedThreat is HOSTILE
>       - responseRequest request is DEFEND IF HOSTILE
>       - defenseCondition is READY.

> When all applicability conditions are met, PrincipalResponseCoordinator shall produce a result for which all of the following conditions hold:
>
> defenseActivation is STAND DOWN, retreatNavigationCommand is HOLD, responseRecord qualifiedThreat is qualifiedThreat, responseRecord disposition is OBSERVED, responseCommitment is OPEN, if responseRequest request is not RETREAT, then retreatRequestArmed is true exactly when T is true, and if responseRequest request is RETREAT, then retreatRequestArmed is true exactly when the value of retreatRequestArmed on entry is true.

### Requirements for RetreatReadinessAssessor

#### Contract clauses evaluated in the compute phase

##### `DERIVE_RETREAT_CONDITION` — Required behavior

> During contract evaluation for the compute phase, RetreatReadinessAssessor shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - retreatNavigationEvidence destinationStatus is INVALID
>       - retreatNavigationEvidence warpStatus is INVALID
>     
>     **Then:**
>     
>     retreatCondition is UNKNOWN
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - retreatNavigationEvidence destinationStatus is VALID
>       - retreatNavigationEvidence warpStatus is VALID
>       - retreatNavigationEvidence warpProgress is COMPLETE
>     
>     **Then:**
>     
>     retreatCondition is COMPLETE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - retreatNavigationEvidence destinationStatus is VALID
>       - retreatNavigationEvidence warpStatus is VALID
>       - retreatNavigationEvidence destination is IDENTIFIED
>       - At least one of the following conditions holds:
>         
>           - retreatNavigationEvidence warpProgress is READY
>           - retreatNavigationEvidence warpProgress is IN PROGRESS
>     
>     **Then:**
>     
>     retreatCondition is AVAILABLE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - retreatNavigationEvidence destinationStatus is VALID
>       - retreatNavigationEvidence warpStatus is VALID
>       - retreatNavigationEvidence warpProgress is not COMPLETE
>       - At least one of the following conditions holds:
>         
>           - retreatNavigationEvidence destination is ABSENT
>           - retreatNavigationEvidence warpProgress is UNAVAILABLE
>     
>     **Then:**
>     
>     retreatCondition is UNAVAILABLE.

### Requirements for ThreatEvidenceInterpreter

#### Contract clauses evaluated in the compute phase

##### `DERIVE_QUALIFIED_THREAT` — Required behavior

> During contract evaluation for the compute phase, ThreatEvidenceInterpreter shall produce a result for which all of the following conditions hold:
>
> All of the following conditions hold:
>
>   - **If:**
>     
>     At least one of the following conditions holds:
>     
>       - contactEvidence signatureStatus is INVALID
>       - identificationEvidence identityStatus is INVALID
>       - All of the following conditions hold:
>         
>           - contactEvidence signature is NONE
>           - identificationEvidence identity is HOSTILE
>     
>     **Then:**
>     
>     qualifiedThreat is UNKNOWN
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - contactEvidence signatureStatus is VALID
>       - identificationEvidence identityStatus is VALID
>       - contactEvidence signature is CONTACT
>       - identificationEvidence identity is HOSTILE
>     
>     **Then:**
>     
>     qualifiedThreat is HOSTILE
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - contactEvidence signatureStatus is VALID
>       - identificationEvidence identityStatus is VALID
>       - contactEvidence signature is CONTACT
>       - identificationEvidence identity is NO HOSTILE
>     
>     **Then:**
>     
>     qualifiedThreat is SUSPECT
>   - **If:**
>     
>     All of the following conditions hold:
>     
>       - contactEvidence signatureStatus is VALID
>       - identificationEvidence identityStatus is VALID
>       - contactEvidence signature is NONE
>       - identificationEvidence identity is NO HOSTILE
>     
>     **Then:**
>     
>     qualifiedThreat is CLEAR.

### Requirements for ThreatReportComposer

#### Contract clauses evaluated in the compute phase

##### `CASE_09_COMMUNICATION_FAULT` — Conditional behavior

> During contract evaluation for the compute phase, if reportAcknowledgment acknowledgmentStatus is INVALID, ThreatReportComposer shall set threatReport qualifiedThreat to responseRecord qualifiedThreat, threatReport disposition to responseRecord disposition, and threatReport priority to COMMUNICATION FAULT.

##### `CASE_10_ACKNOWLEDGED` — Conditional behavior

> During contract evaluation for the compute phase, if reportAcknowledgment acknowledgmentStatus is VALID and reportAcknowledgment acknowledgment is ACKNOWLEDGED, ThreatReportComposer shall set threatReport qualifiedThreat to responseRecord qualifiedThreat, threatReport disposition to responseRecord disposition, and threatReport priority to CLOSED.

##### `CASE_11_UNACKNOWLEDGED_URGENT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 UNACKNOWLEDGED URGENT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - reportAcknowledgment acknowledgmentStatus is VALID
>   - reportAcknowledgment acknowledgment is NOT ACKNOWLEDGED
>   - At least one of the following conditions holds:
>     
>       - responseRecord disposition is INPUT FAULT
>       - responseRecord disposition is RETREAT BLOCKED.

> When all applicability conditions are met, ThreatReportComposer shall produce a result for which all of the following conditions hold:
>
> threatReport qualifiedThreat is responseRecord qualifiedThreat, threatReport disposition is responseRecord disposition, and threatReport priority is URGENT.

##### `CASE_12_UNACKNOWLEDGED_ROUTINE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 12 UNACKNOWLEDGED ROUTINE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - reportAcknowledgment acknowledgmentStatus is VALID
>   - reportAcknowledgment acknowledgment is NOT ACKNOWLEDGED
>   - At least one of the following conditions holds:
>     
>       - responseRecord disposition is OBSERVED
>       - responseRecord disposition is DEFENSE ACTIVE
>       - responseRecord disposition is RETREAT ACTIVE
>       - responseRecord disposition is RETREAT COMPLETE.

> When all applicability conditions are met, ThreatReportComposer shall produce a result for which all of the following conditions hold:
>
> threatReport qualifiedThreat is responseRecord qualifiedThreat, threatReport disposition is responseRecord disposition, and threatReport priority is ROUTINE.
