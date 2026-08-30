# Flight-guidance and autopilot snapshot coordination

## Selected system context

### Goals

GOAL-01: The system shall produce one deterministic and complete set of all six
controlled outputs for every combination of the ten two-valued root inputs.

GOAL-02: The system shall preserve distinct FGS and AP decision responsibilities and
make their coordination visible.

GOAL-03: The system shall inhibit AP enablement and report the specified fault/status
outcome when attitude data is invalid or the AP is unavailable.

### Operational context and system boundary

CTX-01: Flight Control Interface (FCI); handbook-derived external entity. It is outside
the modeled system and supplies the three request/status pairs in MON-01 through MON-03.

CTX-02: AHS-related condition source; handbook-derived entity represented through pilot
abstractions. It is outside the modeled system and supplies MON-04 and MON-05. No
numeric attitude is represented.

CTX-03: Reference-coordination environment; pilot boundary abstraction. It is outside
the modeled snapshot relation, supplies MON-06, and receives CTRL-06. Any later
reference-state update is environmental behavior, not state inside this system.

CTX-04: AP availability source; pilot boundary abstraction. It is outside the modeled
decision responsibilities and supplies MON-07. No physical failure detection is
prescribed.

CTX-05: FCS indication/status recipients; handbook-derived PFD/FCI context represented
as a collective abstract recipient. They receive CTRL-01 through CTRL-03. Physical
routing and presentation are deferred.

CTX-06: Control-surface-actuator (CSA) interface; handbook-derived external entity with
pilot-limited semantics. It receives only CTRL-04; numeric actuator commands and rates
are excluded.

CTX-07: AP-guidance coordination observer/recipient; pilot boundary abstraction. It
receives root-observable CTRL-05. Root exposure supports the bounded relation and does
not assert a production external interface.

MON-01: `display_fd` request and validity from CTX-01. These are two distinct root
inputs: request is `Requested` or `Not_Requested`, and status is `Valid` or `Invalid`.
Invalid is treated as no display request.

MON-02: `sync_fd` request and validity from CTX-01. These are two distinct root inputs
with the same finite domains. Invalid is treated as no synchronization request.

MON-03: `engage_ap` request and validity from CTX-01. These are two distinct root inputs
with the same finite domains. Invalid is treated as no engagement request.

MON-04: `attitude_data` validity from CTX-02, one root input with the ABS-01 domain.

MON-05: current attitude acceptability from CTX-02, one root input with the ABS-02
domain. It is not a numeric threshold or certified envelope.

MON-06: current reference synchronization state from CTX-03, one root input with the
ABS-03 domain.

MON-07: AP availability from CTX-04, one root input with the ABS-04 domain.

CTRL-01: `fd_on`, received by CTX-05, with values `On` and `Off`.

CTRL-02: `fcs_failed`, received by CTX-05, with values `Asserted` and `Clear`.

CTRL-03: `ap_status`, received by CTX-05, with values `On`, `Off`, and `Failed`.

CTRL-04: `ap_on`, received by CTX-06, with values `Enabled` and `Disabled`. This is only
a control-plane enable indication.

CTRL-05: `ap_guidance_request`, received by CTX-07 and observed at the root, with values
`Asserted` and `Not_Asserted`.

CTRL-06: `reference_sync_request`, received by CTX-03, with values `Asserted` and
`Not_Asserted`.

### Risks and fault/degraded behavior

RISK-01: Invalid attitude data could otherwise leave an FD or AP indication active. No
likelihood, severity, or certification classification is asserted.

RISK-02: Failed AP availability could otherwise permit AP enablement or request AP
guidance. No likelihood, severity, or certification classification is asserted.

RISK-03: Partial or overlapping local contracts could leave an output unconstrained or
produce multiple results for one snapshot.

### Modes, state, and assumptions

MODE-01: None. `On`, `Off`, `Failed`, `Enabled`, and `Disabled` are snapshot values, not
persistent modes.

ASM-01: CTX-01 supplies exactly one request and one validity value for each of MON-01
through MON-03 on every evaluated snapshot. No timing or transport guarantee is
inferred.

ASM-02: CTX-02 supplies one MON-04 and one MON-05 value on every evaluated snapshot.
ABS-02 is not evidence of a physical threshold.

ASM-03: CTX-03 supplies current MON-06. Issuing CTRL-06 does not change MON-06 in the
same snapshot.

ASM-04: CTX-04 supplies one MON-07 value on every evaluated snapshot. The model does not
validate the physical correctness of that declaration.

ASM-05: The analyzer treats the ten root fields as independent two-valued inputs,
yielding exactly `2^10 = 1,024` combinations. This is a coverage assumption, not an
operational claim.

## Detailed behavioral requirements

### Requirements for AP Availability Intake

#### Contract clauses evaluated in the compute phase

##### `PART_04_PRESERVE_AP_AVAILABILITY` — Required behavior

> During contract evaluation for the compute phase, AP Availability Intake shall set AP availability out to AP availability in.

### Requirements for Attitude Condition Intake

#### Contract clauses evaluated in the compute phase

##### `PART_02_PRESERVE_ATTITUDE_DATA` — Required behavior

> During contract evaluation for the compute phase, Attitude Condition Intake shall set attitude data out to attitude data in.

##### `PART_02_PRESERVE_ATTITUDE_ACCEPTABILITY` — Required behavior

> During contract evaluation for the compute phase, Attitude Condition Intake shall set attitude acceptable out to attitude acceptable in.

### Requirements for Autopilot Coordination

#### Contract clauses evaluated in the compute phase

##### `PART_06_REFERENCE_SYNC_TRIGGER` — Required behavior

> During contract evaluation for the compute phase, Autopilot Coordination shall set reference sync trigger to Asserted exactly when attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and reference state is Not Synchronized.

##### `PART_06_AP_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Failed, Autopilot Coordination shall set AP status to Failed, AP on to Disabled, and AP guidance request to Not Asserted.

##### `PART_06_AP_ENGAGED_SYNCHRONIZED` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Synchronized, Autopilot Coordination shall set AP status to On, AP on to Enabled, and AP guidance request to Not Asserted.

##### `PART_06_AP_WAITING_FOR_REFERENCE` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available, attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, FD on is On, and reference state is Not Synchronized, Autopilot Coordination shall set AP status to Off, AP on to Disabled, and AP guidance request to Asserted.

##### `PART_06_AP_AVAILABLE_OTHERWISE` — Conditional behavior

> During contract evaluation for the compute phase, if AP availability is Available and it is not the case that attitude data is Valid, qualified engage request is Requested, attitude acceptable is Acceptable, and FD on is On, Autopilot Coordination shall set AP status to Off, AP on to Disabled, and AP guidance request to Not Asserted.

### Requirements for FCI Command Intake

#### Contract clauses evaluated in the compute phase

##### `PART_01_QUALIFY_DISPLAY` — Required behavior

> During contract evaluation for the compute phase, FCI Command Intake shall set qualified display request to Requested exactly when display FD request in is Requested and display FD validity in is Valid.

##### `PART_01_QUALIFY_SYNC` — Required behavior

> During contract evaluation for the compute phase, FCI Command Intake shall set qualified sync request to Requested exactly when sync FD request in is Requested and sync FD validity in is Valid.

##### `PART_01_QUALIFY_ENGAGE` — Required behavior

> During contract evaluation for the compute phase, FCI Command Intake shall set qualified engage request to Requested exactly when engage AP request in is Requested and engage AP validity in is Valid.

### Requirements for FCS Snapshot Publication

#### Contract clauses evaluated in the compute phase

##### `PART_07_PRESERVE_FD_ON` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set FD on out to FD on in.

##### `PART_07_PRESERVE_FCS_FAILED` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set FCS failed out to FCS failed in.

##### `PART_07_PRESERVE_AP_STATUS` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set AP status out to AP status in.

##### `PART_07_PRESERVE_AP_ON` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set AP on out to AP on in.

##### `PART_07_PRESERVE_AP_GUIDANCE_REQUEST` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set AP guidance request out to AP guidance request in.

##### `PART_07_PRESERVE_REFERENCE_SYNC_REQUEST` — Required behavior

> During contract evaluation for the compute phase, FCS Snapshot Publication shall set reference sync request out to reference sync request in.

### Requirements for Flight Guidance Coordination

#### Contract clauses evaluated in the compute phase

##### `PART_05_FD_ON_POLICY` — Required behavior

> During contract evaluation for the compute phase, Flight Guidance Coordination shall set FD on to On exactly when attitude data is Valid and qualified display request is Requested.

##### `PART_05_FCS_FAILED_POLICY` — Required behavior

> During contract evaluation for the compute phase, Flight Guidance Coordination shall set FCS failed to Asserted exactly when attitude data is Invalid.

##### `PART_05_REFERENCE_SYNC_POLICY` — Required behavior

> During contract evaluation for the compute phase, Flight Guidance Coordination shall set reference sync request to Asserted exactly when All of the following conditions hold:
>
>   - attitude data is Valid
>   - At least one of the following conditions holds:
>     
>       - qualified sync request is Requested
>       - reference sync trigger is Asserted.

### Requirements for Reference State Intake

#### Contract clauses evaluated in the compute phase

##### `PART_03_PRESERVE_REFERENCE_STATE` — Required behavior

> During contract evaluation for the compute phase, Reference State Intake shall set reference state out to reference state in.
