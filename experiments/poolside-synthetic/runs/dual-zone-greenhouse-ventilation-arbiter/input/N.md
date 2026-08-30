# Dual-Zone Greenhouse Ventilation Arbiter

## Selected system context

### Goals

GOAL-01: The system should provide deterministic, independent eligibility treatment for
both zones from their current temperature, validity status, and the shared upper limit.

GOAL-02: The system should resolve simultaneous ventilation demand according to the
current operator preference while never commanding both fans `On`.

GOAL-03: The system should make each invalid sensor visible and keep its associated fan
`Off`.

### Operational context and system boundary

CTX-01: Zone A temperature sensor

CTX-02: Zone B temperature sensor

CTX-03: Greenhouse operator

CTX-04: Zone A ventilation fan

CTX-05: Zone B ventilation fan

CTX-06: Sensor-status recipient

MON-01: Zone A temperature input

MON-02: Zone B temperature input

MON-03: Shared upper temperature limit

MON-04: Contention preference

CTRL-01: Zone A ventilation fan command

CTRL-02: Zone B ventilation fan command

CTRL-03: Zone A sensor-fault indication

CTRL-04: Zone B sensor-fault indication

### Hazards and risks

RISK-01: If an invalid zone input is treated as eligible, its fan could be commanded
`On` without a valid temperature basis and its status recipient could remain unaware of
the invalid input.

### Essential environmental assumptions

ASM-01: CTX-01 is responsible for supplying a Zone A temperature in the inclusive
representable Celsius range `-20..60` and an explicit `Valid` or `Invalid` status.

ASM-02: CTX-02 is responsible for supplying a Zone B temperature in the inclusive
representable Celsius range `-20..60` and an explicit `Valid` or `Invalid` status.

ASM-03: CTX-03 is responsible for supplying one shared upper temperature limit in the
inclusive Celsius range `10..35`.

ASM-04: CTX-03 is responsible for supplying exactly one current selection, `Prefer_A` or
`Prefer_B`.

## Detailed behavioral requirements

### Requirements for Boundary Output Delivery

#### Contract clauses evaluated in the compute phase

##### `PART_07_PRESERVE_A_FAN_COMMAND` — Required behavior

> During contract evaluation for the compute phase, Boundary Output Delivery shall set zone a fan command out to zone a fan command in.

##### `PART_07_PRESERVE_B_FAN_COMMAND` — Required behavior

> During contract evaluation for the compute phase, Boundary Output Delivery shall set zone b fan command out to zone b fan command in.

##### `PART_07_PRESERVE_A_SENSOR_FAULT` — Required behavior

> During contract evaluation for the compute phase, Boundary Output Delivery shall set zone a sensor fault out to zone a sensor fault in.

##### `PART_07_PRESERVE_B_SENSOR_FAULT` — Required behavior

> During contract evaluation for the compute phase, Boundary Output Delivery shall set zone b sensor fault out to zone b sensor fault in.

### Requirements for Operator Configuration Intake

#### Contract clauses evaluated in the compute phase

##### `PART_03_PRESERVE_LIMIT_FOR_A` — Required behavior

> During contract evaluation for the compute phase, Operator Configuration Intake shall set upper limit for a in degrees Celsius to upper limit in in degrees Celsius.

##### `PART_03_PRESERVE_LIMIT_FOR_B` — Required behavior

> During contract evaluation for the compute phase, Operator Configuration Intake shall set upper limit for b in degrees Celsius to upper limit in in degrees Celsius.

##### `PART_03_PRESERVE_PREFERENCE` — Required behavior

> During contract evaluation for the compute phase, Operator Configuration Intake shall set preference out to preference in.

### Requirements for Shared Capacity Arbiter

#### Contract clauses evaluated in the compute phase

##### `PART_06_NEITHER_ELIGIBLE` — Conditional behavior

> During contract evaluation for the compute phase, if zone a eligibility is Ineligible and zone b eligibility is Ineligible, Shared Capacity Arbiter shall set zone a fan command to Off and zone b fan command to Off.

##### `PART_06_A_ONLY` — Conditional behavior

> During contract evaluation for the compute phase, if zone a eligibility is Eligible and zone b eligibility is Ineligible, Shared Capacity Arbiter shall set zone a fan command to On and zone b fan command to Off.

##### `PART_06_B_ONLY` — Conditional behavior

> During contract evaluation for the compute phase, if zone a eligibility is Ineligible and zone b eligibility is Eligible, Shared Capacity Arbiter shall set zone a fan command to Off and zone b fan command to On.

##### `PART_06_BOTH_PREFER_A` — Conditional behavior

> During contract evaluation for the compute phase, if zone a eligibility is Eligible, zone b eligibility is Eligible, and preference is Prefer A, Shared Capacity Arbiter shall set zone a fan command to On and zone b fan command to Off.

##### `PART_06_BOTH_PREFER_B` — Conditional behavior

> During contract evaluation for the compute phase, if zone a eligibility is Eligible, zone b eligibility is Eligible, and preference is Prefer B, Shared Capacity Arbiter shall set zone a fan command to Off and zone b fan command to On.

### Requirements for Temperature Celsius

#### `REPRESENTABLE_TEMPERATURE_RANGE` — Data invariant

> Every value of Temperature Celsius shall meet the condition that degrees Celsius is between -20 [S32] and 60 [S32], inclusive.

### Requirements for Upper Temperature Limit

#### `SELECTABLE_UPPER_LIMIT_RANGE` — Data invariant

> Every value of Upper Temperature Limit shall meet the condition that degrees Celsius is between 10 [S32] and 35 [S32], inclusive.

### Requirements for Zone A Local Decision

#### Contract clauses evaluated in the compute phase

##### `PART_04_VALID_ABOVE` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius exceeds upper limit in degrees Celsius, Zone A Local Decision shall set eligibility to Eligible and sensor fault to Clear.

##### `PART_04_VALID_AT_OR_BELOW` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius is at most upper limit in degrees Celsius, Zone A Local Decision shall set eligibility to Ineligible and sensor fault to Clear.

##### `PART_04_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Invalid, Zone A Local Decision shall set eligibility to Ineligible and sensor fault to Asserted.

### Requirements for Zone A Sensor Intake

#### Contract clauses evaluated in the compute phase

##### `PART_01_PRESERVE_TEMPERATURE` — Required behavior

> During contract evaluation for the compute phase, Zone A Sensor Intake shall set temperature out in degrees Celsius to temperature in in degrees Celsius.

##### `PART_01_PRESERVE_VALIDITY` — Required behavior

> During contract evaluation for the compute phase, Zone A Sensor Intake shall set validity out to validity in.

### Requirements for Zone B Local Decision

#### Contract clauses evaluated in the compute phase

##### `PART_05_VALID_ABOVE` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius exceeds upper limit in degrees Celsius, Zone B Local Decision shall set eligibility to Eligible and sensor fault to Clear.

##### `PART_05_VALID_AT_OR_BELOW` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Valid and temperature in degrees Celsius is at most upper limit in degrees Celsius, Zone B Local Decision shall set eligibility to Ineligible and sensor fault to Clear.

##### `PART_05_INVALID` — Conditional behavior

> During contract evaluation for the compute phase, if validity is Invalid, Zone B Local Decision shall set eligibility to Ineligible and sensor fault to Asserted.

### Requirements for Zone B Sensor Intake

#### Contract clauses evaluated in the compute phase

##### `PART_02_PRESERVE_TEMPERATURE` — Required behavior

> During contract evaluation for the compute phase, Zone B Sensor Intake shall set temperature out in degrees Celsius to temperature in in degrees Celsius.

##### `PART_02_PRESERVE_VALIDITY` — Required behavior

> During contract evaluation for the compute phase, Zone B Sensor Intake shall set validity out to validity in.
