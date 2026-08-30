# Structured natural-language view of resolved GUMBO

- `SNL_STYLE_VERSION`: `2`
- `SIREUM_VERSION`: `4.20260630.386eac9f`
- `HAMR_SYSML_PARSER_VERSION`: `4.20260626.332fb27`
- `SEMANTIC_INPUT`: `FrontEnd.typeCheck` → `GclAnnexClauseInfo` / Slang AST
- `TRACE_ATTACHMENT`: immediately preceding contiguous `//` comment block
- `NUMERIC_LITERAL_NOTATION`: `value [family]`; exact family semantics are documented in `README.md`
- `COVERAGE`: all executable families successfully resolved by the pinned FrontEnd; see `GUMBO_GRAMMAR_COVERAGE.tsv` for upstream gaps and defensive-only rules

## Contract owner `Greenhouse_Ventilation::Temperature_Celsius`
- Source: line 11, column 7

### Invariant `REPRESENTABLE_TEMPERATURE_RANGE`
- Authored description: A temperature value is representable from -20 through 60 degrees Celsius, inclusive
- Trace IDs: `MON-01`, `ASM-01`
- Source: line 13, column 9

> Every value of `Temperature_Celsius` shall meet the condition that `degrees_celsius` is between -20 [S32] and 60 [S32], inclusive.

## Contract owner `Greenhouse_Ventilation::Upper_Temperature_Limit`
- Source: line 38, column 7

### Invariant `SELECTABLE_UPPER_LIMIT_RANGE`
- Authored description: An operator-selected upper limit is from 10 through 35 degrees Celsius, inclusive
- Trace IDs: `MON-02`, `ASM-02`
- Source: line 40, column 9

> Every value of `Upper_Temperature_Limit` shall meet the condition that `degrees_celsius` is between 10 [S32] and 35 [S32], inclusive.

## Contract owner `Greenhouse_Ventilation::Ventilation_Decision_i`
- Source: line 89, column 7

### Compute phase
#### Case `BEH_01_VALID_ABOVE`
- Authored description: A valid temperature above the selected limit commands ventilation on and clears the sensor-fault indication
- Trace IDs: `BEH-01`, `CTRL-01`, `CTRL-02`
- Source: line 92, column 11
- Quality note: The source clause coordinates 2 assignments under one formal identifier; review whether it expresses one verifiable thought.

> During contract evaluation for the compute phase, if `validity` is `Temperature_Validity.Valid` and `temperature.degrees_celsius` exceeds `upper_limit.degrees_celsius`, `Ventilation_Decision_i` shall set `fan_command` to `Fan_Command.On` and `sensor_fault` to `Sensor_Fault_Indication.Clear`.

#### Case `BEH_02_VALID_AT_OR_BELOW`
- Authored description: A valid temperature at or below the selected limit commands ventilation off and clears the sensor-fault indication
- Trace IDs: `BEH-02`, `CTRL-01`, `CTRL-02`
- Source: line 99, column 11
- Quality note: The source clause coordinates 2 assignments under one formal identifier; review whether it expresses one verifiable thought.

> During contract evaluation for the compute phase, if `validity` is `Temperature_Validity.Valid` and `temperature.degrees_celsius` is at most `upper_limit.degrees_celsius`, `Ventilation_Decision_i` shall set `fan_command` to `Fan_Command.Off` and `sensor_fault` to `Sensor_Fault_Indication.Clear`.

#### Case `FAULT_01_INVALID`
- Authored description: An invalid temperature commands ventilation off and asserts the sensor-fault indication
- Trace IDs: `FAULT-01`, `CTRL-01`, `CTRL-02`, `RISK-01`
- Source: line 106, column 11
- Quality note: The source clause coordinates 2 assignments under one formal identifier; review whether it expresses one verifiable thought.

> During contract evaluation for the compute phase, if `validity` is `Temperature_Validity.Invalid`, `Ventilation_Decision_i` shall set `fan_command` to `Fan_Command.Off` and `sensor_fault` to `Sensor_Fault_Indication.Asserted`.
