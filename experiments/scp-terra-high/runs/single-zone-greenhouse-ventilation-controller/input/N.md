# Single-Zone Greenhouse Ventilation Controller

## Selected system context

### Goals

GOAL-01: Provide deterministic ventilation commands from the current valid temperature
and selected upper limit.

GOAL-02: Prevent an invalid temperature input from requesting ventilation and make that
condition visible to the status recipient.

### Operational context and system boundary

CTX-01: Greenhouse temperature sensor

CTX-02: Greenhouse operator

CTX-03: Ventilation fan

CTX-04: Sensor-status recipient

MON-01: Temperature input

MON-02: Selected upper temperature limit

CTRL-01: Ventilation fan command

CTRL-02: Sensor-fault indication

### Hazards and risks

RISK-01: If the temperature input is invalid but is treated as trustworthy, the system
could request fan operation without a valid temperature basis and could leave the status
recipient unaware of the invalid input.

### Essential environmental assumptions

ASM-01: CTX-01 is responsible for supplying a Celsius temperature in the inclusive
representable range `-20..60` together with an explicit `Valid` or `Invalid` status.

ASM-02: CTX-02 is responsible for supplying a selected upper temperature limit in the
inclusive range `10..35` degrees Celsius.

## Detailed behavioral requirements

### Requirements for Temperature Celsius

#### `REPRESENTABLE_TEMPERATURE_RANGE` — Data invariant

> Every value of Temperature Celsius shall meet the condition that degrees Celsius is between -20 [S32] and 60 [S32], inclusive.

### Requirements for Upper Temperature Limit

#### `SELECTABLE_UPPER_LIMIT_RANGE` — Data invariant

> Every value of Upper Temperature Limit shall meet the condition that degrees Celsius is between 10 [S32] and 35 [S32], inclusive.

### Requirements for Ventilation Decision

#### Contract clauses evaluated in the compute phase

##### `BEH_01_VALID_ABOVE` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius exceeds upper limit in degrees Celsius, Ventilation Decision shall set fan command to On and sensor fault to Clear.

##### `BEH_02_VALID_AT_OR_BELOW` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius is at most upper limit in degrees Celsius, Ventilation Decision shall set fan command to Off and sensor fault to Clear.

##### `FAULT_01_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Invalid, Ventilation Decision shall set fan command to Off and sensor fault to Asserted.
