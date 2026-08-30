# Autopilot Engagement and Guidance-Request Gate

## Selected system context

### Goals

GOAL-01: The system should enable autopilot use only for a valid current engagement
request when the autopilot is available, attitude is acceptable, and guidance is ready.

GOAL-02: The system should request guidance synchronization exactly when an otherwise
engageable valid request is waiting only for guidance readiness.

GOAL-03: The system should report a tuple that unambiguously distinguishes failed,
disengaged, waiting-for-guidance, and engaged outcomes for every allowed input snapshot.
All three controlled outputs shall be consistent and fully constrained; no output may
retain an old or unspecified value.

### Operational context and system boundary

CTX-01: Flight Crew Interface (FCI) supplies the engagement-command value and its
explicit validity status. Presentation, entry mechanics, and crew procedure are outside
the system.

CTX-02: Flight Guidance System (FGS) supplies whether guidance is ready and receives the
synchronization request. Numeric guidance and its computation are outside the system.

CTX-03: Attitude-acceptability abstraction source supplies PILOT-01. The seed identifies
no production subsystem, physical threshold, or derivation method.

CTX-04: Autopilot-availability abstraction source supplies PILOT-02. Failure detection,
diagnosis, and recovery are outside the system.

CTX-05: Control Surface Actuation system (CSA) receives the bounded `AP On`
control-plane indication. Numeric commands, actuation, and surface response are outside
the system.

CTX-06: Autopilot-status recipient receives autopilot status. The seed does not
prescribe a more specific recipient, presentation, or response.

CTX-07: Deterministic bounded-analysis harness evaluates the complete finite input
product and records case membership and outputs. It is verification context, not an
operational subsystem or additional modeled root interface.

MON-01: `engage_ap`, supplied by CTX-01, has exactly the values `Requested` and
`Not_Requested`. Trustworthiness is represented separately by MON-02.

MON-02: Engagement-command status, supplied by CTX-01, has exactly the values `Valid`
and `Invalid`. If `Invalid`, MON-01 shall not affect the output tuple.

MON-03: `guidance_valid`, supplied by CTX-02, has exactly the values `Ready` and
`Not_Ready`; no numeric guidance value is represented.

MON-04: PILOT-01, supplied by CTX-03, has exactly the values `Acceptable` and
`Not_Acceptable` and no numeric attitude or unit.

MON-05: PILOT-02, supplied by CTX-04, has exactly the values `Available` and `Failed`.

CTRL-01: `ap_guidance_request`, delivered to CTX-02, has exactly the values `Requested`
and `Not_Requested`.

CTRL-02: `ap_status`, delivered to CTX-06, has exactly the values `Failed`, `Off`, and
`On`.

CTRL-03: `ap_on`, delivered to CTX-05, has exactly the values `Enabled` and `Disabled`.
It is a control-plane indication only; physical actuation is not a controlled quantity
in this abstract.

### Selected interactions

MON-03 through MON-05 route through the Process boundary to PART-02. PART-03 through
PART-05 route CTRL-01 through CTRL-03 through the Process boundary to their root
outputs. All boundary routing traces to the associated MON, CTRL, CTX, PART, and support
rationale but does not add a domain concept.

### Hazards and risks

RISK-01: Treating a failed autopilot or invalid command as engageable could enable AP
use or report engagement without an available AP and valid command basis. FAULT-01 and
FAULT-02 are the required snapshot mitigations.

RISK-02: Bypassing the attitude guard for a valid request at a not-acceptable attitude
could enable AP use in a condition the seed requires to prevent engagement. FAULT-03 is
the required snapshot mitigation.

### Essential environmental and analysis assumptions

ASM-01: CTX-01 supplies one MON-01 value and one explicit MON-02 status per snapshot.
`Invalid` makes the command value behaviorally immaterial; the system does not infer
validity.

ASM-02: CTX-02 supplies one MON-03 value per snapshot. Readiness is accepted as a
boundary fact; its derivation and numeric guidance are not modeled.

ASM-03: CTX-03 and CTX-04 supply one value from their respective pilot domains per
snapshot. The model shall not infer attitude thresholds or failure detection behind
those values.

ASM-04: CTX-07 evaluates all 32 semantic input combinations as current snapshots. The
seed supplies no timing, sampling, freshness, latency, or cross-source synchronization
guarantee, so the result is not temporal verification.

## Detailed behavioral requirements

### Requirements for CSA Enable Delivery Thread

#### Contract clauses evaluated in the compute phase

##### `PART_05_PRESERVE_AP_ON` — Required behavior

> During contract evaluation for the compute phase, CSA Enable Delivery Thread shall set AP on out to AP on in.

### Requirements for Engagement Decision Thread

#### Contract clauses evaluated in the compute phase

##### `FAULT_01_FAILED` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Failed, Engagement Decision Thread shall set AP guidance request to Not Requested, AP status to Failed, and AP on to Disabled.

##### `FAULT_02_INVALID_COMMAND` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available and command status is Invalid, Engagement Decision Thread shall set AP guidance request to Not Requested, AP status to Off, and AP on to Disabled.

##### `BEH_01_NOT_REQUESTED` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, command status is Valid, and engage AP is Not Requested, Engagement Decision Thread shall set AP guidance request to Not Requested, AP status to Off, and AP on to Disabled.

##### `FAULT_03_ATTITUDE_NOT_ACCEPTABLE` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, command status is Valid, engage AP is Requested, and attitude acceptable is Not Acceptable, Engagement Decision Thread shall set AP guidance request to Not Requested, AP status to Off, and AP on to Disabled.

##### `BEH_02_WAITING_FOR_GUIDANCE` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, command status is Valid, engage AP is Requested, attitude acceptable is Acceptable, and guidance valid is Not Ready, Engagement Decision Thread shall set AP guidance request to Requested, AP status to Off, and AP on to Disabled.

##### `BEH_03_ENGAGED` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, command status is Valid, engage AP is Requested, attitude acceptable is Acceptable, and guidance valid is Ready, Engagement Decision Thread shall set AP guidance request to Not Requested, AP status to On, and AP on to Enabled.

### Requirements for FCI Command Intake Thread

#### Contract clauses evaluated in the compute phase

##### `PART_01_PRESERVE_ENGAGE_COMMAND` — Required behavior

> During contract evaluation for the compute phase, FCI Command Intake Thread shall set engage AP out to engage AP in.

##### `PART_01_PRESERVE_COMMAND_STATUS` — Required behavior

> During contract evaluation for the compute phase, FCI Command Intake Thread shall set command status out to command status in.

### Requirements for Guidance Request Delivery Thread

#### Contract clauses evaluated in the compute phase

##### `PART_03_PRESERVE_GUIDANCE_REQUEST` — Required behavior

> During contract evaluation for the compute phase, Guidance Request Delivery Thread shall set request out to request in.

### Requirements for Status Reporting Thread

#### Contract clauses evaluated in the compute phase

##### `PART_04_PRESERVE_AP_STATUS` — Required behavior

> During contract evaluation for the compute phase, Status Reporting Thread shall set status out to status in.
