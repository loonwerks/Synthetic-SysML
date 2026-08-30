# Mining-frigate threat, defense, and retreat supervisor

## Selected system context

### Synopsis

PURPOSE-01: The system will own a finite operational phase and issue one complete set of
commands, phase report, and input-fault indication for each logical input snapshot. It
will supervise command intent and command acceptance only; physical execution and
mission outcome remain outside the boundary.

### Goals and scope

GOAL-01: The supervisor shall make exactly one deterministic disposition per admissible
logical snapshot and shall completely determine all five controlled values.

GOAL-02: The supervisor shall preserve the priority order invalid input, established
retreat or service progression, new retreat trigger, hostile defense, mining, then idle
inhibition.

GOAL-03: The supervisor shall expose invalid input separately from valid capability loss
and shall provide a deterministic recovery path through retreat and service to
availability.

GOAL-04: The responsibility allocation should localize input qualification and
command-delivery obligations while preserving one principal owner for phase, priority,
case selection, and every controlled decision.

### Operational context and system boundary

CTX-01: The pilot and fleet-command interface supplies the operator request and receives
the phase and input-fault reports. It does not choose the supervisor's disposition.

CTX-02: Frigate monitoring and availability providers supply threat, cargo band,
capacitor band, three command-acceptance availabilities, and service progress, each with
an independent validity status.

CTX-03: The frigate command-acceptance and execution environment receives mining,
defense, and movement/service commands. Acceptance availability does not predict
successful physical execution, and no physical result is controlled or observed by this
abstract.

MON-01: `threat`, supplied by CTX-02, is exactly `Clear`, `Suspect`, or `Hostile` and
has independent status `Valid` or `Invalid`.

MON-02: `cargo_band`, supplied by CTX-02, is exactly `Partial`, `Near_Full`, or `Full`
and has independent status `Valid` or `Invalid`.

MON-03: `capacitor_band`, supplied by CTX-02, is exactly `Critical`, `Reserve`, or
`Ready` and has independent status `Valid` or `Invalid`.

MON-04: `operator_request`, supplied by CTX-01, is exactly `Idle`, `Mine`, or `Retreat`
and has independent status `Valid` or `Invalid`.

MON-05: `mining_available`, supplied by CTX-02, is `Available` or `Unavailable` and has
independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-06: `defense_available`, supplied by CTX-02, is `Available` or `Unavailable` and has
independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-07: `retreat_available`, supplied by CTX-02, is `Available` or `Unavailable` and has
independent status `Valid` or `Invalid`; availability means command acceptance only.

MON-08: `service_progress`, supplied by CTX-02, is exactly `Away`, `At_Station`,
`Docked_Loaded`, `Offload_Confirmed`, or `Resupply_Confirmed` and has independent status
`Valid` or `Invalid`.

CTRL-01: `mining_command`, delivered to CTX-03, is exactly `Stop` or `Mine` and controls
requested mining activity only.

CTRL-02: `defense_command`, delivered to CTX-03, is exactly `Stand_Down` or `Engage` and
controls requested defense activity only.

CTRL-03: `movement_service_command`, delivered to CTX-03, is exactly `Hold`, `Retreat`,
`Dock`, `Offload`, `Resupply`, or `Acknowledge_Ready` and controls requested movement or
service activity only.

CTRL-04: `phase_report`, delivered to CTX-01, is exactly `Idle`, `Mining`, `Defending`,
`Retreating`, `Servicing`, or `Fault_Hold` and reports the selected next operational
phase.

CTRL-05: `input_fault`, delivered to CTX-01, is exactly `Clear` or `Asserted` and
reports monitored-input validity, not command availability or physical success.

### Frozen pilot constraints and assumptions

ASM-01: CTX-01 is responsible for pairing the operator request with its status, and
CTX-02 is responsible for pairing each of the other seven monitored values with its
status in one stable logical snapshot. The abstraction assumes no value/status tearing
within a tick because real timing is excluded.

### Risks and mitigations

RISK-01: If an invalid monitored value were used as trustworthy, the supervisor could
issue mining, defense, retreat, or service intent without a valid decision basis;
FAULT-01 and FAULT-02 mitigate this consequence by inhibiting mining and defense,
asserting the fault, and permitting retreat only under their explicit valid-availability
condition. No likelihood or severity is claimed.

RISK-02: If required or persistent retreat were reported as progressing while retreat
command acceptance was unavailable, observers could mistake capability loss for
successful retreat; FAULT-03 mitigates this consequence by holding and reporting
`Fault_Hold` while leaving `input_fault` clear. No physical safety outcome is claimed.

### Observable modes and transitions

MODE-01: `Idle` observably reports no active mining, defense, retreat, or service phase
and is the initial phase.

MODE-02: `Mining` observably reports the selected mining phase; continuation still
requires CASE-10 on each tick.

MODE-03: `Defending` observably reports the selected hostile-defense phase; continuation
still requires CASE-09 on each tick.

MODE-04: `Retreating` observably reports retreat or docking progression governed by
CASE-01, CASE-03, and CASE-05.

MODE-05: `Servicing` observably reports offload or resupply progression governed by
CASE-06 and CASE-07.

MODE-06: `Fault_Hold` observably distinguishes inhibited progress caused by invalid
input or valid retreat-capability loss from ordinary `Idle` inhibition.

## Supporting contract definitions

### State `Mining_Threat_Retreat_Supervisor::Principal_Decision_Owner::current_phase`

State `current_phase` has type `Mining_Threat_Retreat_Supervisor::Operational_Phase`.

## Detailed behavioral requirements

### Requirements for Defense Command Delivery

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_DEFENSE_COMMAND` — Required behavior

> During contract evaluation for the compute phase, Defense Command Delivery shall set defense out to defense in.

### Requirements for Mining Command Delivery

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_MINING_COMMAND` — Required behavior

> During contract evaluation for the compute phase, Mining Command Delivery shall set mining out to mining in.

### Requirements for Movement Service Command Delivery

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_MOVEMENT_SERVICE_COMMAND` — Required behavior

> During contract evaluation for the compute phase, Movement Service Command Delivery shall set movement service out to movement service in.

### Requirements for Principal Decision Owner

#### Contract clauses evaluated in the initialization phase

##### `INITIAL_PHASE_IDLE` — Required behavior

> During contract evaluation for the initialization phase, Principal Decision Owner shall set current phase to Idle.

#### Contract clauses evaluated in the compute phase

##### `CASE_01_INVALID_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 01 INVALID RETREAT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - threat input threat status is Invalid
>       - cargo input cargo status is Invalid
>       - capacitor input capacitor status is Invalid
>       - request input request status is Invalid
>       - mining availability input mining availability status is Invalid
>       - defense availability input defense availability status is Invalid
>       - retreat availability input retreat availability status is Invalid
>       - service progress input service progress status is Invalid
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Mining
>       - the value of current phase on entry is Defending
>       - the value of current phase on entry is Retreating
>   - retreat availability input retreat availability status is Valid
>   - retreat availability input retreat available is Available.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Retreat, phase decision is Retreating, fault decision is Asserted, and current phase is Retreating.

##### `CASE_02_INVALID_HOLD` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 02 INVALID HOLD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - At least one of the following conditions holds:
>     
>       - threat input threat status is Invalid
>       - cargo input cargo status is Invalid
>       - capacitor input capacitor status is Invalid
>       - request input request status is Invalid
>       - mining availability input mining availability status is Invalid
>       - defense availability input defense availability status is Invalid
>       - retreat availability input retreat availability status is Invalid
>       - service progress input service progress status is Invalid
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - At least one of the following conditions holds:
>         
>           - the value of current phase on entry is Mining
>           - the value of current phase on entry is Defending
>           - the value of current phase on entry is Retreating
>       - retreat availability input retreat availability status is Valid
>       - retreat availability input retreat available is Available.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Hold, phase decision is Fault Hold, fault decision is Asserted, and current phase is Fault Hold.

##### `CASE_03_VALID_RETREAT` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 03 VALID RETREAT applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is Away
>   - retreat availability input retreat available is Available
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Retreating
>       - the value of current phase on entry is Fault Hold
>       - request input operator request is Retreat
>       - cargo input cargo band is Full
>       - capacitor input capacitor band is Critical
>       - All of the following conditions hold:
>         
>           - threat input threat is Hostile
>           - defense availability input defense available is Unavailable.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Retreat, phase decision is Retreating, fault decision is Clear, and current phase is Retreating.

##### `CASE_04_VALID_RETREAT_UNAVAILABLE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 04 VALID RETREAT UNAVAILABLE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is Away
>   - retreat availability input retreat available is Unavailable
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Retreating
>       - the value of current phase on entry is Fault Hold
>       - request input operator request is Retreat
>       - cargo input cargo band is Full
>       - capacitor input capacitor band is Critical
>       - All of the following conditions hold:
>         
>           - threat input threat is Hostile
>           - defense availability input defense available is Unavailable.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Hold, phase decision is Fault Hold, fault decision is Clear, and current phase is Fault Hold.

##### `CASE_05_DOCK` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 05 DOCK applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is At Station
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Retreating
>       - the value of current phase on entry is Fault Hold.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Dock, phase decision is Retreating, fault decision is Clear, and current phase is Retreating.

##### `CASE_06_OFFLOAD` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 06 OFFLOAD applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is Docked Loaded
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Retreating
>       - the value of current phase on entry is Servicing
>       - the value of current phase on entry is Fault Hold.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Offload, phase decision is Servicing, fault decision is Clear, and current phase is Servicing.

##### `CASE_07_RESUPPLY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 07 RESUPPLY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is Offload Confirmed
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Servicing
>       - the value of current phase on entry is Fault Hold.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Resupply, phase decision is Servicing, fault decision is Clear, and current phase is Servicing.

##### `CASE_08_ACKNOWLEDGE_READY` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 08 ACKNOWLEDGE READY applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - service progress input service progress is Resupply Confirmed
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Servicing
>       - the value of current phase on entry is Fault Hold.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Acknowledge Ready, phase decision is Idle, fault decision is Clear, and current phase is Idle.

##### `CASE_09_HOSTILE_DEFENSE` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 09 HOSTILE DEFENSE applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Idle
>       - the value of current phase on entry is Mining
>       - the value of current phase on entry is Defending
>   - service progress input service progress is Away
>   - threat input threat is Hostile
>   - request input operator request is not Retreat
>   - cargo input cargo band is not Full
>   - capacitor input capacitor band is not Critical
>   - defense availability input defense available is Available.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Engage, movement service decision is Hold, phase decision is Defending, fault decision is Clear, and current phase is Defending.

##### `CASE_10_MINING` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 10 MINING applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Idle
>       - the value of current phase on entry is Mining
>       - the value of current phase on entry is Defending
>   - service progress input service progress is Away
>   - threat input threat is Clear
>   - request input operator request is Mine
>   - cargo input cargo band is Partial
>   - At least one of the following conditions holds:
>     
>       - capacitor input capacitor band is Reserve
>       - capacitor input capacitor band is Ready
>   - mining availability input mining available is Available.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Mine, defense decision is Stand Down, movement service decision is Hold, phase decision is Mining, fault decision is Clear, and current phase is Mining.

##### `CASE_11_VALID_IDLE_INHIBITION` — Conditional behavior

> During contract evaluation for the compute phase, case CASE 11 VALID IDLE INHIBITION applies under all of the following conditions:
>
> All of the following conditions hold:
>
>   - threat input threat status is Valid
>   - cargo input cargo status is Valid
>   - capacitor input capacitor status is Valid
>   - request input request status is Valid
>   - mining availability input mining availability status is Valid
>   - defense availability input defense availability status is Valid
>   - retreat availability input retreat availability status is Valid
>   - service progress input service progress status is Valid
>   - At least one of the following conditions holds:
>     
>       - the value of current phase on entry is Idle
>       - the value of current phase on entry is Mining
>       - the value of current phase on entry is Defending
>   - service progress input service progress is Away
>   - It is not the case that:
>     
>     At least one of the following conditions holds:
>     
>       - request input operator request is Retreat
>       - cargo input cargo band is Full
>       - capacitor input capacitor band is Critical
>       - All of the following conditions hold:
>         
>           - threat input threat is Hostile
>           - defense availability input defense available is Unavailable
>   - threat input threat is not Hostile
>   - It is not the case that:
>     
>     All of the following conditions hold:
>     
>       - threat input threat is Clear
>       - request input operator request is Mine
>       - cargo input cargo band is Partial
>       - At least one of the following conditions holds:
>         
>           - capacitor input capacitor band is Reserve
>           - capacitor input capacitor band is Ready
>       - mining availability input mining available is Available.

> When all applicability conditions are met, Principal Decision Owner shall produce a result for which all of the following conditions hold:
>
> mining decision is Stop, defense decision is Stand Down, movement service decision is Hold, phase decision is Idle, fault decision is Clear, and current phase is Idle.

### Requirements for Request Availability Qualification

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_REQUEST_AND_AVAILABILITY` — Required behavior

> During contract evaluation for the compute phase, Request Availability Qualification shall set qualified request to raw request, qualified mining availability to raw mining availability, qualified defense availability to raw defense availability, and qualified retreat availability to raw retreat availability.

### Requirements for Resource Qualification

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_RESOURCES` — Required behavior

> During contract evaluation for the compute phase, Resource Qualification shall set qualified cargo to raw cargo and qualified capacitor to raw capacitor.

### Requirements for Threat Qualification

#### Contract clauses evaluated in the compute phase

##### `PRESERVE_THREAT` — Required behavior

> During contract evaluation for the compute phase, Threat Qualification shall set qualified threat to raw threat.
