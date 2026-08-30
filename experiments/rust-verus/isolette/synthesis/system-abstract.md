---
abstract_id: SA-FAA-ISOLETTE-01
source_id: faa-isolette-appendix-a
source_kind: human-curated-handbook-appendix
complexity: medium
semantic_usage_count: 8
semantic_interaction_count: 20
nontrivial_contract_obligation_count: 20
scenario_family_count: 8
containment_depth: 2
requires_stateful_behavior: true
requires_fault_behavior: true
requires_priority_conflict: true
profile: specification-only
---

# Isolette Thermostat — approved System Abstract

## Problem, purpose, and scope before architecture

NEED-01 — Premature infants cared for in an Isolette need air temperature controlled within nurse-selected bounds and an independent warning when temperature or the monitoring function is unsafe.

PURPOSE-01 — The Isolette Thermostat shall sense Current Temperature, command the Heat Source to maintain a Desired Temperature Range, independently monitor an Alarm Temperature Range, and provide status, display, and alarm feedback to the Nurse through the external Operator Interface.

SCOPE-01 — This `medium` scope includes the complete logical regulator and monitor control purpose, their independently owned modes, input-validity response, stateful heat and alarm hysteresis, internal-failure indications, startup, and power-cycle recovery. It excludes humidity, oxygen, physical plant control, door sensing, nurse workflow automation, and implementation-specific diagnostic algorithms.

GOAL-01 — The Infant should be kept at a safe and comfortable temperature. This is source goal G1 and is a validation goal rather than a claim that a finite logical model controls physical temperature.

GOAL-02 — The Nurse should be warned if the Infant becomes too hot or too cold. This is source goal G2 and is realized logically by the independent monitor and Alarm Control.

GOAL-03 — The cost of manufacturing the Thermostat should be as low as possible. This is source goal G3; it is retained as an informational design goal, but no cost model or pass claim is in this run.

FACT-01 — An Isolette is an incubator for an Infant that provides controlled temperature, humidity, and oxygen if necessary; Isolettes are used in Neonatal Intensive Care Units for premature infants.

FACT-02 — The Operator Interface is outside the Thermostat boundary, as stated by the appendix footnote; the Temperature Sensor and Heat Source are also external to the Thermostat.

## Operational context and exact logical boundary

CTX-01 — The Temperature Sensor is external and supplies Current Temperature of the Isolette air. It is responsible for the value, status, Fahrenheit unit, coverage, and sensing accuracy assumptions declared by `SRC-EA-TS-01`, `SRC-EA-TS-02`, and `SRC-EA-TS-03`.

CTX-02 — The Operator Interface is external and supplies four operator settings and receives Regulator Status, Monitor Status, Display Temperature, and Alarm Control. It is responsible for all setting and presentation assumptions declared in the retained operator-interface baseline below.

CTX-03 — The Heat Source is external and consumes Heat Control; the Thermostat does not monitor whether heat was physically produced.

CTX-04 — The Isolette physical enclosure and Air are external plant context. They are responsible for the source heating/cooling-rate assumptions; neither is simulated by the logical model.

CTX-05 — The Nurse is an indirect external actor who selects ranges, observes feedback, responds to alarms, and may remove the Infant or replace the Isolette. Nurse response is scenario context, not an automated Thermostat output.

CTX-06 — The Infant is an indirect external beneficiary warmed by Isolette air. Infant temperature is neither monitored nor controlled directly by this scope.

CTX-07 — A future implementation platform is outside this implementation-independent logical boundary and supplies two independent supervision records containing a power-epoch event, an initialization-deadline indication, and an internal-failure-detected indication. The diagnostic algorithms themselves remain deferred.

MON-01 — `CurrentTemperature` is a record from `CTX-01` with `value_dF: 680..1050` (tenths of °F, representing 68.0..105.0°F) and `status: Invalid | Valid`, initially `Invalid`.

MON-02 — `DesiredTemperatureSettings` is a record from `CTX-02` with `lower: 97..99°F`, `lower_status: Invalid | Valid`, `upper: 98..100°F`, and `upper_status: Invalid | Valid`; both statuses are initially `Invalid`.

MON-03 — `AlarmTemperatureSettings` is a record from `CTX-02` with `lower: 93..98°F`, `lower_status: Invalid | Valid`, `upper: 99..103°F`, and `upper_status: Invalid | Valid`; both statuses are initially `Invalid`.

MON-04 — `RegulatorSupervision` is a record from `CTX-07` with Boolean `power_epoch_changed`, `init_timeout_expired`, and `internal_failure_detected`; its event combinations are finite and interpreted by `PART-02`, not forwarded as an owned decision.

MON-05 — `MonitorSupervision` is a separate record from `CTX-07` with Boolean `power_epoch_changed`, `init_timeout_expired`, and `internal_failure_detected`; it must not be derived from regulator supervision.

CTRL-01 — `HeatControl: Off | On` is sent to `CTX-03`, initially `Off`; it is the sole directly controlled heat-source command.

CTRL-02 — `RegulatorStatus: Init | On | Failed` is sent to `CTX-02`, initially `Init`.

CTRL-03 — `DisplayTemperature: 68..105°F` is sent to `CTX-02`; it is required to equal rounded Current Temperature only in regulator `NORMAL`, and is intentionally unconstrained within its type in other modes.

CTRL-04 — `AlarmControl: Off | On` is sent to `CTX-02`, initially `Off`; `On` alerts the Nurse.

CTRL-05 — `MonitorStatus: Init | On | Failed` is sent to `CTX-02`, initially `Init`.

BOUND-01 — The exact root-input inventory is the five declared monitored quantities; the exact root-output inventory is the five declared controlled quantities. No door, infant-temperature, actuator-feedback, alarm-acknowledgement, humidity, oxygen, clock tick, or redundant sensor port is permitted.

TYPE-01 — All boundary domains are finite. `value_dF` uses exact tenths of a Fahrenheit degree; conversion to a tool representation is a formalization choice and does not change the environmental unit.

TYPE-02 — A range is well formed only when `lower < upper`. For valid settings, the stronger environmental ordering in `SRC-EA-OI-04`, `SRC-EA-OI-06`, and `SRC-EA-OI-08` also applies.

## Retained handbook facts and numbered normative baseline

SRC-EA-IS-01 — [Appendix EA-IS-1, contextual/deferred physical assumption] When the Heat Source is turned on and the Isolette is properly shut, the Current Temperature will increase at a rate of no more than 1°F per minute.

SRC-EA-IS-02 — [Appendix EA-IS-2, contextual/deferred physical assumption] When the Heat Source is turned off and the Isolette is properly shut, the Current Temperature will decrease at a rate of no more than 1°F per minute.

SRC-EA-TS-01 — [Appendix EA-TS-1, modeled assumption] The Current Temperature will be provided to the Thermostat in degrees Fahrenheit.

SRC-EA-TS-02 — [Appendix EA-TS-2, contextual/deferred physical assumption] The Current Temperature will be sensed to an accuracy of ±0.1°F.

SRC-EA-TS-03 — [Appendix EA-TS-3, modeled type bound] The Current Temperature will cover the range of at least 68.0° to 105.0°F.

SRC-EA-OI-01 — [Appendix EA-OI-1, modeled assumption] All temperatures will be entered and displayed in degrees Fahrenheit.

SRC-EA-OI-02 — [Appendix label EA4-OI-2, modeled type bound] All temperatures will be set and displayed by the operators in increments of 1°F.

SRC-EA-OI-03 — [Appendix EA-OI-3, modeled assumption] The Lower Alarm Temperature will always be ≥93°F.

SRC-EA-OI-04 — [Appendix EA-OI-4, modeled assumption] The Lower Alarm Temperature will always be less than or equal to the Lower Desired Temperature minus 1°F.

SRC-EA-OI-05 — [Appendix EA-OI-5, modeled assumption] The Lower Desired Temperature will always be ≥97°F.

SRC-EA-OI-06 — [Appendix EA-OI-6, modeled assumption] The Lower Desired Temperature will always be less than or equal to the Upper Desired Temperature minus 1°F.

SRC-EA-OI-07 — [Appendix EA-OI-7, modeled assumption] The Upper Desired Temperature will always be ≤100°F.

SRC-EA-OI-08 — [Appendix EA-OI-8, modeled assumption] The Upper Alarm Temperature will always be greater than or equal to the Upper Desired Temperature plus 1°F.

SRC-EA-OI-09A — [First appendix EA-OI-9, modeled assumption] The Upper Alarm Temperature will always be ≤103°F.

SRC-EA-OI-09B — [Second duplicate appendix EA-OI-9, modeled output bound] The Display Temperature will cover the range of at least 68.0° to 105.0°F.

SRC-SR-01 — [Appendix SR-1, logically required; quantitative probability deferred] The Isolette shall include an independent regulator function that maintains the Current Temperature inside the Isolette within the Desired Temperature Range. The appendix allocates probability of failure <10^-5 per hour.

SRC-SR-02 — [Appendix SR-2, logically required; quantitative probability and physical latency proof deferred] The Isolette shall include an independent monitor function that activates an Alarm within a maximum of 5 seconds whenever the Current Temperature falls below or rises above the Alarm Temperature Range, the Current Temperature or Alarm Temperature Range is invalid, or an internal monitor failure has been detected. The appendix allocates probability of failure <10^-5 per hour.

SRC-REQ-TH-01 — [Appendix REQ-TH-1] The Thermostat shall set the value of the Heat Control.

SRC-REQ-TH-02 — [Appendix REQ-TH-2] The Thermostat Function shall set the value of the Regulator Status.

SRC-REQ-TH-03 — [Appendix REQ-TH-3] The Thermostat shall set the value of the Display Temperature.

SRC-REQ-TH-04 — [Appendix REQ-TH-4] The Thermostat shall set the value of the Alarm Control.

SRC-REQ-TH-05 — [Appendix REQ-TH-5] The Thermostat shall set the value of the Monitor Status.

SRC-REQ-RT-01 — [Appendix REQ-RT-1] The Regulate Temperature Function shall set the value of the Heat Control.

SRC-REQ-RT-02 — [Appendix REQ-RT-2] The Regulate Temperature Function shall set the value of the Regulator Status.

SRC-REQ-RT-03 — [Appendix REQ-RT-3] The Regulate Temperature Function shall set the value of the Display Temperature.

SRC-REQ-MRI-01 — [Appendix REQ-MRI-1] If the Regulator Mode is INIT, the Regulator Status shall be set to Init.

SRC-REQ-MRI-02 — [Appendix REQ-MRI-2] If the Regulator Mode is NORMAL, the Regulator Status shall be set to On.

SRC-REQ-MRI-03 — [Appendix REQ-MRI-3] If the Regulator Mode is FAILED, the Regulator Status shall be set to Failed. Latency is less than the 0.5-second Max Operator Response Time.

SRC-REQ-MRI-04 — [Appendix REQ-MRI-4] If the Regulator Mode is NORMAL, the Display Temperature shall be set to Current Temperature rounded to the nearest integer.

SRC-REQ-MRI-05 — [Appendix REQ-MRI-5] If the Regulator Mode is not NORMAL, the value of Display Temperature is UNSPECIFIED. In NORMAL its tolerance is ±0.6°F and response latency is less than 0.5 second.

SRC-REQ-MRI-06 — [Appendix REQ-MRI-6] If either Desired Temperature status is Invalid, Regulator Interface Failure shall be set to True.

SRC-REQ-MRI-07 — [Appendix REQ-MRI-7] If both Desired Temperature statuses are Valid, Regulator Interface Failure shall be set to False.

SRC-REQ-MRI-08 — [Appendix REQ-MRI-8] If Regulator Interface Failure is False, Desired Range shall be set to Desired Temperature Range.

SRC-REQ-MRI-09 — [Appendix REQ-MRI-9] If Regulator Interface Failure is True, Desired Range is UNSPECIFIED.

SRC-REQ-MRM-01 — [Figure A-4 Req MRM 1] On power-up, Regulator Mode enters INIT.

SRC-REQ-MRM-02 — [Figure A-4 Req MRM 2] From INIT, Regulator Mode enters NORMAL when Regulator health status is true.

SRC-REQ-MRM-03 — [Figure A-4 Req MRM 3] From NORMAL, Regulator Mode enters FAILED when Regulator health status becomes false.

SRC-REQ-MRM-04 — [Figure A-4 Req MRM 4] From INIT, Regulator Mode enters FAILED when time in INIT exceeds the 1.0-second Regulator Init Timeout; once FAILED, recovery requires power off and on.

SRC-REQ-MHS-01 — [Appendix REQ-MHS-1] If Regulator Mode is INIT, Heat Control shall be set to Off.

SRC-REQ-MHS-02 — [Appendix REQ-MHS-2] If Regulator Mode is NORMAL and Current Temperature is less than Lower Desired Temperature, Heat Control shall be set to On.

SRC-REQ-MHS-03 — [Appendix REQ-MHS-3] If Regulator Mode is NORMAL and Current Temperature is greater than Upper Desired Temperature, Heat Control shall be set to Off.

SRC-REQ-MHS-04 — [Appendix REQ-MHS-4] If Regulator Mode is NORMAL and Current Temperature is between the inclusive Desired Temperature bounds, Heat Control shall not be changed.

SRC-REQ-MHS-05 — [Appendix REQ-MHS-5] If Regulator Mode is FAILED, Heat Control shall be set to Off. Required response latency is less than the 6.0-second Allowed Heat Source Latency.

SRC-REQ-MT-01 — [Appendix REQ-MT-1] The Monitor Temperature Function shall set the value of Alarm Control.

SRC-REQ-MT-02 — [Appendix REQ-MT-2] The Monitor Temperature Function shall set the value of Monitor Status.

SRC-REQ-MMI-01 — [Appendix REQ-MMI-1] If the Manage Monitor Interface mode is INIT, Monitor Status shall be set to Init.

SRC-REQ-MMI-02 — [Appendix REQ-MMI-2] If the Manage Monitor Interface mode is NORMAL, Monitor Status shall be set to On.

SRC-REQ-MMI-03 — [Appendix REQ-MMI-3] If the Manage Monitor Interface mode is FAILED, Monitor Status shall be set to Failed. Latency is less than the 0.5-second Max Operator Response Time.

SRC-REQ-MMI-04 — [Appendix REQ-MMI-4] If either Alarm Temperature status is Invalid, Monitor Interface Failure shall be set to True.

SRC-REQ-MMI-05 — [Appendix REQ-MMI-5] If both Alarm Temperature statuses are Valid, Monitor Interface Failure shall be set to False.

SRC-REQ-MMI-06 — [Appendix REQ-MMI-6, ambiguity retained] If Monitor Interface Failure is False, the Alarm Range variable shall be set to the Desired Temperature Range.

SRC-REQ-MMI-07 — [Appendix REQ-MMI-7] If Monitor Interface Failure is True, Alarm Range is UNSPECIFIED.

SRC-REQ-MMM-01 — [Figure A-6 Req MMM 1] On power-up, Monitor Mode enters INIT.

SRC-REQ-MMM-02 — [Figure A-6 Req MMM 2] From INIT, Monitor Mode enters NORMAL when Monitor health status is true.

SRC-REQ-MMM-03 — [Figure A-6 Req MMM 3] From NORMAL, Monitor Mode enters FAILED when Monitor health status is not true.

SRC-REQ-MMM-04 — [Figure A-6 Req MMM 4] From INIT, Monitor Mode enters FAILED when time in INIT exceeds the 1.0-second Monitor Initialization Timeout; once FAILED, recovery requires power off and on.

SRC-REQ-MA-01 — [Appendix REQ-MA-1] If Monitor Mode is INIT, Alarm Control shall be set to Off.

SRC-REQ-MA-02 — [Appendix REQ-MA-2] If Monitor Mode is NORMAL and Current Temperature is below Lower Alarm Temperature or above Upper Alarm Temperature, Alarm Control shall be set to On.

SRC-REQ-MA-03 — [Appendix REQ-MA-3] If Monitor Mode is NORMAL and Current Temperature is in either 0.5°F inner boundary band, Alarm Control shall not be changed.

SRC-REQ-MA-04 — [Appendix REQ-MA-4] If Monitor Mode is NORMAL and Current Temperature is at least Lower Alarm Temperature +0.5°F and at most Upper Alarm Temperature -0.5°F, Alarm Control shall be set to Off.

SRC-REQ-MA-05 — [Appendix REQ-MA-5] If Monitor Mode is FAILED, Alarm Control shall be set to On. Required latency is less than 5 seconds.

SRC-DET-REG-01 — [Appendix A.5.1.4] Regulator Internal Failure is set True if an internal failure is detected; the detection requirements are implementation-specific and cannot be specified until a platform is chosen.

SRC-DET-MON-01 — [Appendix A.5.2.4] Monitor Internal Failure is set True if an internal failure is detected; the detection requirements are implementation-specific and cannot be specified until a platform is chosen.

## Necessary formalization choices, not handbook facts

FORM-01 — Fahrenheit values with 0.1°F precision are represented mathematically as integer tenths (`dF`). This makes all input/state partitions finite without asserting a Rust, SysML, wire, or sensor encoding.

FORM-02 — Rounding in `SRC-REQ-MRI-04` uses round-half-up, `floor((value_dF + 5)/10)`, because all source values are nonnegative and the appendix does not specify tie handling.

FORM-03 — `Regulator health` means `not RegulatorInterfaceFailure and not RegulatorInternalFailure and CurrentTemperature.status = Valid`; `Monitor health` means `not MonitorInterfaceFailure and not MonitorInternalFailure and CurrentTemperature.status = Valid`. This resolves the boolean/`Valid` wording inconsistency in the appendix definitions.

FORM-04 — The mode references in `SRC-REQ-MMI-01`, `SRC-REQ-MMI-02`, and `SRC-REQ-MMI-03` mean the enclosing Monitor Mode (`INIT`, `NORMAL`, or `FAILED`); no additional interface mode is invented.

FORM-05 — `SRC-REQ-MMI-06` says Alarm Range is set to Desired Temperature Range, but the surrounding function, tables, and all alarm requirements supply Alarm Temperature Range. The retained design resolves this contradiction by setting Alarm Range to `MON-03` Alarm Temperature Settings; routing Desired Temperature Settings into the independent monitor is prohibited.

FORM-06 — A `power_epoch_changed` event represents the appendix's power-off/on recovery trigger. It clears the corresponding internal-failure latch and re-enters `INIT`; a fresh valid setting or valid temperature alone never clears `FAILED`.

FORM-07 — Each `init_timeout_expired` indication represents “time in INIT exceeds 1.0 second.” The logical model must preserve the trigger and timeout value but does not claim physical clock accuracy.

FORM-08 — The two failure detectors latch an asserted `internal_failure_detected` until their own power-epoch change. This is a conservative selected recovery policy beyond the appendix's unspecified diagnostic implementation.

FORM-09 — A valid operator setting is assumed to satisfy the source cross-range ordering. Invalid status, not relational revalidation by the Thermostat, is the source-defined interface-failure trigger.

FORM-10 — When multiple inputs change in one logical evaluation, qualification and diagnostic facts are computed first, modes next, and output policies last. This deterministic ordering is specification semantics, not a scheduling or timing claim.

FORM-11 — Where the Monitor internal-variable table's Alarm Range bounds conflict with the external Alarm Temperature ranges, the retained type uses the external Table A-5 bounds (`93..98` and `99..103`) because those are the actual monitored-variable domains used by the alarm requirements.

FORM-12 — The eight semantic owners are realized as SysML-AADL Thread usages solely because the current checker admits owner-local stateful GUMBO on Threads, and they are hosted by one generated-support Process because the checker does not admit Thread usages directly under the root System. These categories are tool mappings, not execution, scheduling, deployment, or shared-failure claims.

## Selected parts and cohesive responsibilities

PART-01 — `ManageRegulatorInterface` independently qualifies the Desired Temperature statuses into Regulator Interface Failure and an optional Desired Range; it derives rounded Display Temperature and Regulator Status from Current Temperature and Regulator Mode.

PART-02 — `DetectRegulatorFailure` owns the latched Regulator Internal Failure and independently classifies regulator power-epoch and initialization-timeout supervision; it does not decide Heat Control.

PART-03 — `ManageRegulatorMode` owns Regulator Mode and derives Regulator health from regulator interface qualification, regulator diagnostic state, and Current Temperature status.

PART-04 — `ManageHeatSource` owns Heat Control state and applies the source's stateful Desired Range policy, including the retain case inside the desired band and fail-safe Off priority.

PART-05 — `ManageMonitorInterface` independently qualifies Alarm Temperature statuses into Monitor Interface Failure and an optional Alarm Range; it derives Monitor Status from Monitor Mode.

PART-06 — `DetectMonitorFailure` owns the latched Monitor Internal Failure and independently classifies monitor power-epoch and initialization-timeout supervision; it does not inspect regulator supervision.

PART-07 — `ManageMonitorMode` owns Monitor Mode and derives Monitor health from monitor interface qualification, monitor diagnostic state, and Current Temperature status.

PART-08 — `ManageAlarm` owns Alarm Control state and applies the source's alarm boundary, hysteresis, initialization, and failed-monitor policies.

OWNER-01 — `PART-01` is a qualification/feedback owner because `RegulatorInterfaceFailure = invalid(lower) or invalid(upper)` combines two statuses and rounded display is a many-to-one numeric derivation; mere range copying and enum relabeling receive no ownership credit.

OWNER-02 — `PART-02` is a state/qualification owner because it derives a resettable failure latch and timeout fact from prior latch plus supervision events.

OWNER-03 — `PART-03` is a decision/state owner because it combines three independent health causes with prior mode and reset/timeout state to select next Regulator Mode.

OWNER-04 — `PART-04` is a decision/state owner because it combines mode, qualified range, current value, and prior Heat Control to select or retain the command.

OWNER-05 — `PART-05` is a qualification owner because `MonitorInterfaceFailure = invalid(lower) or invalid(upper)` combines two statuses; the one-to-one Monitor Status label is required but earns no independent owner credit.

OWNER-06 — `PART-06` is a state/qualification owner because it derives a resettable failure latch and timeout fact independently from `PART-02`.

OWNER-07 — `PART-07` is a decision/state owner because it combines three independent health causes with prior mode and reset/timeout state to select next Monitor Mode.

OWNER-08 — `PART-08` is a decision/state owner because it combines mode, alarm range, current value, and prior Alarm Control to select, retain, or force the alarm.

## Complete typed directed interaction inventory

INT-01 — `CTX-01 -> PART-01`: `CurrentTemperature` (`MON-01`) for regulator validity and display derivation.

INT-02 — `CTX-02 -> PART-01`: `DesiredTemperatureSettings` (`MON-02`) for independent desired-range qualification.

INT-03 — `CTX-07 -> PART-02`: `RegulatorSupervision` (`MON-04`) for reset, deadline, and internal-failure latching.

INT-04 — `PART-01 -> PART-03`: `RegulatorInterfaceFacts {interface_failure, desired_range_option, current_status}`.

INT-05 — `PART-02 -> PART-03`: `RegulatorDiagnosticFacts {power_epoch_changed, init_timeout_expired, internal_failure_latched}`.

INT-06 — `PART-03 -> PART-01`: `RegulatorMode: INIT | NORMAL | FAILED` for status and display applicability.

INT-07 — `PART-01 -> CTX-02`: `RegulatorFeedback {regulator_status, display_temperature}` realizing `CTRL-02` and `CTRL-03` in one stable operator-feedback interaction.

INT-08 — `PART-01 -> PART-04`: `RegulatorControlBasis {current_value_dF, current_status, desired_range_option}`; it is a qualified record, not an owner-credit identity route.

INT-09 — `PART-03 -> PART-04`: `RegulatorMode` for heat-policy priority.

INT-10 — `PART-04 -> CTX-03`: `HeatControl` (`CTRL-01`).

INT-11 — `CTX-01 -> PART-05`: an independent `CurrentTemperature` connection; no regulator-derived validity is shared.

INT-12 — `CTX-02 -> PART-05`: `AlarmTemperatureSettings` (`MON-03`) for independent alarm-range qualification.

INT-13 — `CTX-07 -> PART-06`: `MonitorSupervision` (`MON-05`) for independent reset, deadline, and internal-failure latching.

INT-14 — `PART-05 -> PART-07`: `MonitorInterfaceFacts {interface_failure, alarm_range_option, current_status}`.

INT-15 — `PART-06 -> PART-07`: `MonitorDiagnosticFacts {power_epoch_changed, init_timeout_expired, internal_failure_latched}`.

INT-16 — `PART-07 -> PART-05`: `MonitorMode: INIT | NORMAL | FAILED` for Monitor Status.

INT-17 — `PART-05 -> CTX-02`: `MonitorStatus` (`CTRL-05`).

INT-18 — `PART-05 -> PART-08`: `MonitorControlBasis {current_value_dF, current_status, alarm_range_option}`.

INT-19 — `PART-07 -> PART-08`: `MonitorMode` for alarm-policy priority.

INT-20 — `PART-08 -> CTX-02`: `AlarmControl` (`CTRL-04`).

## State, modes, transitions, priority, and recovery

STATE-01 — `PART-02` owns `regulator_internal_failure_latched: Bool`, initially `False`; only `power_epoch_changed` clears it.

STATE-02 — `PART-03` owns `regulator_mode: INIT | NORMAL | FAILED`, initially `INIT`.

STATE-03 — `PART-04` owns `heat_control: Off | On`, initially `Off`.

STATE-04 — `PART-06` owns `monitor_internal_failure_latched: Bool`, initially `False`; only its `power_epoch_changed` clears it.

STATE-05 — `PART-07` owns `monitor_mode: INIT | NORMAL | FAILED`, initially `INIT`.

STATE-06 — `PART-08` owns `alarm_control: Off | On`, initially `Off`.

MODE-01 — Regulator `INIT` is externally visible as Regulator Status `Init` and Heat Control `Off`; it ends on healthy initialization, timeout failure, or a new power epoch.

MODE-02 — Regulator `NORMAL` is externally visible as Regulator Status `On`, meaningful rounded Display Temperature, and stateful heat control; loss of Regulator health triggers `FAILED`.

MODE-03 — Regulator `FAILED` is externally visible as Regulator Status `Failed` and Heat Control `Off`; it is latched until a power-epoch change.

MODE-04 — Monitor `INIT` is externally visible as Monitor Status `Init` and Alarm Control `Off`; it ends on healthy initialization, timeout failure, or a new power epoch.

MODE-05 — Monitor `NORMAL` is externally visible as Monitor Status `On` and temperature-dependent alarm behavior; loss of Monitor health triggers `FAILED`.

MODE-06 — Monitor `FAILED` is externally visible as Monitor Status `Failed` and Alarm Control `On`; it is latched until a power-epoch change.

TRANS-01 — Regulator: power-epoch change from any mode -> `INIT`; `INIT` and healthy -> `NORMAL`; `INIT` and unhealthy with expired timeout -> `FAILED`; `NORMAL` and unhealthy -> `FAILED`; otherwise retain mode.

TRANS-02 — Monitor: power-epoch change from any mode -> `INIT`; `INIT` and healthy -> `NORMAL`; `INIT` and unhealthy with expired timeout -> `FAILED`; `NORMAL` and unhealthy -> `FAILED`; otherwise retain mode.

PRIO-01 — Regulator priority is `power epoch/reset` > `FAILED or INIT safe-off` > `NORMAL temperature policy`. Thus a simultaneous low temperature and regulator failure commands Heat Control `Off`, not `On`.

PRIO-02 — Monitor priority is `power epoch/reset` > `FAILED alarm-on` > `INIT alarm-off` > `NORMAL alarm policy`. Thus a simultaneous safe temperature and monitor failure commands Alarm Control `On`, not `Off`.

PRIO-03 — Interface invalidity and Current Temperature invalidity contribute equally to the relevant health predicate; any one false health factor is sufficient to enter or retain failure behavior.

REC-01 — A fresh valid Desired Temperature request while Regulator Mode is `NORMAL` is used in the next policy evaluation; a fresh valid request after `FAILED` does not recover the regulator.

REC-02 — A fresh valid Alarm Temperature request while Monitor Mode is `NORMAL` is used in the next policy evaluation; a fresh valid request after `FAILED` does not recover the monitor.

REC-03 — A fresh valid Current Temperature after either mode has entered `FAILED` does not recover that mode; only its power-epoch change enters `INIT`, after which healthy inputs may enter `NORMAL`.

REC-04 — Regulator and monitor recovery are independent: one side's power/failure record cannot reset or fail the other side.

## Required local contract obligations and closed partitions

CASE-01 — `PART-01` shall derive Regulator Interface Failure exactly as the disjunction of invalid Lower Desired and invalid Upper Desired statuses; the four status pairs are exhaustively covered with no gap or overlap.

CASE-02 — `PART-01` shall make Desired Range equal `MON-02` exactly when Regulator Interface Failure is False and otherwise leave the range semantically unavailable; this is a qualification, not a credited copy.

CASE-03 — `PART-01` shall map `INIT/NORMAL/FAILED` to Regulator Status `Init/On/Failed`, and shall constrain Display Temperature to `FORM-02` exactly in `NORMAL`; non-NORMAL display values remain unconstrained within type.

CASE-04 — `PART-02` shall clear Regulator Internal Failure and begin a new diagnostic epoch whenever `power_epoch_changed` is True, regardless of the prior latch or simultaneous stale failure evidence.

CASE-05 — With no power-epoch change, `PART-02` shall set or retain Regulator Internal Failure exactly when prior failure is latched or new internal-failure evidence is detected, and otherwise derive False; timeout is carried separately and earns no ownership credit.

CASE-06 — `PART-03` shall derive Regulator health exactly as `FORM-03`; this owner-local conjunction must not be recomputed centrally or by `PART-04`.

CASE-07 — `PART-03` shall implement the complete `TRANS-01` next-mode relation, including healthy startup, pre-timeout waiting, timeout failure, normal-operation failure, failed-mode latch, and reset recovery.

CASE-08 — `PART-04` shall set Heat Control `Off` in `INIT` or `FAILED`, regardless of temperature demand.

CASE-09 — `PART-04` in `NORMAL` shall set `On` below Lower Desired, set `Off` above Upper Desired, and retain prior Heat Control within the inclusive Desired Range; these three numeric regions are exhaustive and disjoint under `ASM-04`.

CASE-10 — `PART-04` shall never read Alarm Range, Monitor Mode, Monitor diagnostics, or prior Alarm Control; its only decision inputs are `INT-08`, `INT-09`, and prior Heat Control.

CASE-11 — `PART-05` shall derive Monitor Interface Failure exactly as the disjunction of invalid Lower Alarm and invalid Upper Alarm statuses; the four status pairs are exhaustively covered with no gap or overlap.

CASE-12 — `PART-05` shall make Alarm Range equal `MON-03` exactly when Monitor Interface Failure is False and otherwise leave the range semantically unavailable, implementing `FORM-05`.

CASE-13 — `PART-05` shall produce a Monitor Control Basis whose Alarm Range is available exactly under its locally derived interface qualification and which contains no Desired Temperature setting; the additionally required `INIT/NORMAL/FAILED` to `Init/On/Failed` status mapping earns no owner credit.

CASE-14 — `PART-06` shall clear Monitor Internal Failure and begin a new diagnostic epoch whenever its `power_epoch_changed` is True, regardless of the prior latch or simultaneous stale failure evidence.

CASE-15 — With no power-epoch change, `PART-06` shall set or retain Monitor Internal Failure exactly when prior failure is latched or new internal-failure evidence is detected, and otherwise derive False; timeout is carried separately and earns no ownership credit.

CASE-16 — `PART-07` shall derive Monitor health exactly as `FORM-03`; this owner-local conjunction must not be recomputed centrally or by `PART-08`.

CASE-17 — `PART-07` shall implement the complete `TRANS-02` next-mode relation, including healthy startup, pre-timeout waiting, timeout failure, normal-operation failure, failed-mode latch, and reset recovery.

CASE-18 — `PART-08` shall set Alarm Control `Off` in `INIT` and `On` in `FAILED`, with `FAILED` priority over an otherwise safe temperature.

CASE-19 — `PART-08` in `NORMAL` shall set `On` outside Alarm Range, retain prior Alarm Control in the two 0.5°F inner boundary bands, and set `Off` in the closed inner range; the low-outside, low-band, inner, high-band, and high-outside numeric regions are exhaustive and disjoint under `ASM-04`.

CASE-20 — The behavioral owners `PART-03`, `PART-04`, `PART-07`, and `PART-08` shall compose without cross-failure: a regulator-only internal failure forces Heat Control Off without forcing Monitor Mode failed, and a monitor-only internal failure forces Alarm Control On without forcing Regulator Mode failed; a root check may observe but shall not re-derive these facts.

COUNT-01 — The medium contract count is exactly 20 obligations, namely all consecutively declared `CASE` clauses. Each obligation owns a distinct derived fact, next-state relation, output restriction, noninterference rule, or finite partition; source-level restatements and identity status relabeling are not counted again.

CONTRACT-01 — Each `CASE-01` through `CASE-19` obligation shall be stated in canonical owner-local GUMBO attached to the responsible Thread, using local state and `In(state)` where prior-state retention is required; `CASE-20` shall be a composed noninterference check over owner-produced facts. No Process or root contract may replace, duplicate, or recompute an owner-local relation.

CONTRACT-02 — Generated initialization shall establish the six declared initial states and type-valid outputs without adding a contract-case credit. In particular, a type-valid initial Display Temperature is generated support only; after initialization it is constrained by the source behavior only while Regulator Mode is `NORMAL` and remains semantically unconstrained within type otherwise.

## Nominal and off-nominal behavior

BEH-01 — On a healthy power epoch with valid Current Temperature and valid well-ordered settings, the system shall leave both sides in `INIT` until their initialization conditions are healthy, then independently enter `NORMAL`. Verification: bounded transition analysis must exhibit this trace and the expected statuses.

BEH-02 — In Regulator `NORMAL`, Current Temperature below Lower Desired shall turn heat On; above Upper Desired shall turn heat Off; inside the inclusive Desired Range shall retain the prior heat command. Verification: exhaustive analysis must report zero gaps, overlaps, or mismatches for all finite current values, valid desired settings, and both prior heat states.

BEH-03 — In Monitor `NORMAL`, temperature outside Alarm Range shall turn Alarm On, the two inner 0.5°F bands shall retain the prior alarm, and the inner range shall turn Alarm Off. Verification: exhaustive analysis must report zero gaps, overlaps, or mismatches for all finite current values, valid alarm settings, and both prior alarm states.

BEH-04 — In Regulator `NORMAL`, Regulator Status shall be On and Display Temperature shall be the nearest whole °F under `FORM-02`; in other modes status shall reflect the mode and display is not semantically constrained. Verification: contract analysis covers all three modes and every `MON-01` value.

BEH-05 — Regulator and monitor shall consume independent setting, supervision, health, mode, and control paths while sharing only the external Current Temperature source and Operator Interface endpoint. Verification: structural inspection finds exactly the 20 declared interactions and no forbidden cross-path connection.

RISK-01 — If unsafe temperature is not independently detected, the Infant may experience prolonged unsafe heat or cold (appendix hazard H1, classified catastrophic with probability <10^-9 per hour of operation). That classification and probability are retained source context, not re-established by this run.

RISK-02 — If an invalid or failed regulator continues heating, temperature may rise while regulation is untrustworthy; `FAULT-01` mitigates the logical command consequence.

RISK-03 — If an invalid or failed monitor clears the alarm, the Nurse may not be warned; `FAULT-02` mitigates the logical alarm consequence.

FAULT-01 — Invalid Current Temperature, invalid Desired Temperature status, or Regulator Internal Failure shall make Regulator health false, lead to latched `FAILED`, report Failed, and force Heat Control Off. Verification: bounded traces cover each initiating cause, priority conflict, latch, fresh-valid non-recovery, and power-cycle recovery.

FAULT-02 — Invalid Current Temperature, invalid Alarm Temperature status, or Monitor Internal Failure shall make Monitor health false, lead to latched `FAILED`, report Failed, and force Alarm Control On. Verification: bounded traces cover each initiating cause, priority conflict, latch, fresh-valid non-recovery, and power-cycle recovery.

FAULT-03 — Failure or reset on one path shall not directly change the other path's failure latch or mode. Verification: paired regulator-only and monitor-only fault traces satisfy `CASE-20`.

FAULT-04 — If initialization remains unhealthy until the applicable timeout expires, only that path shall enter `FAILED`; prior to expiry it remains `INIT`. Verification: analysis checks before-deadline and expired-deadline partitions for both paths.

## Essential assumptions and constraints

ASM-01 — `CTX-01` is responsible for the accuracy, unit, range-coverage, and truthful status assumptions on `MON-01`; rationale: the Thermostat cannot establish physical sensor accuracy internally.

ASM-02 — `CTX-02` is responsible for the unit, increments, type ranges, cross-range separation, and truthful status assumptions on `MON-02` and `MON-03`; rationale: the appendix deliberately assumes a strong Operator Interface.

ASM-03 — `CTX-07` is responsible for asserting each power-epoch, timeout, and internal-failure indication truthfully and independently; rationale: the appendix defers failure detection until a platform is selected.

ASM-04 — Whenever all four setting statuses are Valid, `93 <= lowerAlarm <= lowerDesired - 1`, `97 <= lowerDesired <= upperDesired - 1`, `upperDesired + 1 <= upperAlarm <= 103`; rationale: this makes desired and alarm policy partitions coherent and preserves the retained operator-interface ordering assumptions.

ASM-05 — A logical evaluation observes one coherent snapshot of all five root inputs and the prior owned state; rationale: without snapshot semantics, simultaneous priority cases are undefined.

ASM-06 — Regulator and monitor supervision power-epoch indications refer to the same physical Thermostat power cycle but remain separately routed; rationale: recovery should be coordinated by the environment without sharing diagnostic state.

## Required bounded scenario families

SCN-01 — Healthy startup: start with both modes `INIT`, valid temperature/settings, no internal failures, and unexpired deadlines; observe independent transitions to `NORMAL`, Heat Off initially, Alarm Off, statuses On, and rounded display.

SCN-02 — Heating and desired-band hold: in Regulator `NORMAL`, step from below Lower Desired to within Desired Range; observe Heat On then retained On.

SCN-03 — Cooling and desired-band hold: in Regulator `NORMAL`, step from above Upper Desired to within Desired Range; observe Heat Off then retained Off.

SCN-04 — Alarm activation and hysteretic recovery: in Monitor `NORMAL`, visit low-outside and high-outside variants, an inner boundary band, and the central inner range; observe On, retained prior alarm, then Off.

SCN-05 — Desired-setting invalidity and fresh request: invalidate either Desired status, observe Regulator `FAILED` and Heat Off, restore a valid fresh setting and observe no recovery, then change power epoch and observe `INIT` followed by healthy `NORMAL`.

SCN-06 — Alarm-setting invalidity and fresh request: invalidate either Alarm status, observe Monitor `FAILED` and Alarm On, restore a valid fresh setting and observe no recovery, then change power epoch and observe `INIT` followed by healthy `NORMAL`.

SCN-07 — Invalid Current Temperature common stimulus: invalidate Current Temperature, observe independent failure of both modes, Heat Off, and Alarm On; a later valid reading does not recover either side without a power epoch.

SCN-08 — Independent internal failures and timeout variants: inject regulator-only failure, monitor-only failure, regulator init timeout, and monitor init timeout in separate traces; observe only the affected mode and its source-required safe output response.

COUNT-02 — The scenario-family count is exactly eight, namely all consecutively declared `SCN` clauses; variants inside `SCN-04`, `SCN-05`, `SCN-06`, and `SCN-08` are mandatory branch coverage, not extra family-count padding.

ANALYSIS-01 — The bounded end-to-end analyzer shall execute the owner-local next-state and output relations through the `INT-01` through `INT-20` semantic map using finite tenths-degree, enum, Boolean, prior-state, status, and supervision partitions. It shall report zero guard gaps, zero guard overlaps, and zero output or next-state mismatches for the complete partitions named by `CASE-01` through `CASE-20`.

ANALYSIS-02 — The analyzer shall execute at least one concrete multi-step trace for every `SCN-01` through `SCN-08` family and every mandatory variant, including both priority conflicts, both fresh-valid non-recovery cases, both power-epoch recoveries, both unilateral internal failures, both timeout paths, and `CASE-20` cross-failure noninterference. It may observe Process delegations but shall neither count them as semantic interactions nor treat the Process or root as a behavioral owner.

## Structural bounds and trace obligations

STRUCT-01 — The canonical model shall contain exactly one root system usage and exactly eight reachable semantic component usages corresponding one-for-one to the eight declared parts; the root is not a semantic usage.

STRUCT-02 — The root System shall contain exactly one generated-support Process, and that Process shall contain all eight semantic Thread usages as direct children, for containment depth exactly 2. No other Process, nested subsystem, deployment binding, support usage, or behavior-free adapter is permitted.

STRUCT-03 — The canonical architecture shall contain exactly 20 semantic directed end-to-end interactions corresponding one-for-one to `INT-01` through `INT-20`, realized by exactly 30 resolved port connections. The ten owner-to-owner interactions (`INT-04`, `INT-05`, `INT-06`, `INT-08`, `INT-09`, `INT-14`, `INT-15`, `INT-16`, `INT-18`, and `INT-19`) each use one connection; the ten root-boundary interactions (`INT-01`, `INT-02`, `INT-03`, `INT-07`, `INT-10`, `INT-11`, `INT-12`, `INT-13`, `INT-17`, and `INT-20`) each use a root-to-Process plus Process-to-owner delegation pair. With root boundary routes and their delegations excluded from the semantic component graph, it shall have exactly two weakly connected regions: the four regulator parts and the four monitor parts; each region has meaningful root input and output paths.

STRUCT-04 — Every part shall own the fact or state identified by its corresponding declared ownership clause; an analyzer or root contract may consume those facts but shall not recompute them from root inputs.

STRUCT-05 — Every abstract declaration shall be traced to one or more semantically relevant model elements, explicitly marked informational/deferred, or recorded as a formalization/validation-only item; every significant model element shall trace to declared IDs or carry one of the exact generated-support justifications in `SUPPORT-01` through `SUPPORT-03`.

METRIC-01 — Final architecture metrics are exactly: 1 root System, 1 nonsemantic generated-support Process, 8 semantic Thread usages, containment depth 2, 20 semantic end-to-end interactions, 30 resolved port connections, 20 nontrivial contract obligations, 8 scenario families, 6 owned state variables, 6 externally distinguishable path modes, 2 priority conflicts, and 2 independently boundary-anchored weak semantic regions after boundary/delegation edges are excluded.

SUPPORT-01 — Exactly one behavior-free Process container is allowed as generated tool support. It shall own no domain behavior, state, contract applicability, proposal, decision, or semantic interaction; receive no semantic-usage or ownership credit; and provide no evidence of execution, scheduling, deployment, or shared failure.

SUPPORT-02 — Exactly ten additional boundary-delegation connections are allowed as generated tool support so the ten root-boundary semantic interactions cross the Process boundary. They shall be type- and direction-preserving, introduce no transformation or state, receive no semantic-interaction credit, and add no end-to-end meaning beyond their associated `INT` clauses.

SUPPORT-03 — Thread hosting categories and a type-valid generated initialization value for Display Temperature are allowed generated support. Thread categorization does not establish executable behavior, and the Display Temperature initialization shall not be traced as source behavior, counted as a contract obligation, or used to constrain the non-`NORMAL` branch prohibited by `SRC-REQ-MRI-05`.

## Objective verification and validation pass criteria

PASS-01 — Source/type verification passes only if architecture-stage and final `hamr sysml tipe` both exit 0 with `Well-formed!`, all endpoints resolve, and directions/types match the exact boundary, all 20 semantic end-to-end interactions, and all 30 resolved port connections.

PASS-02 — Structural verification passes only if the bounded report finds exactly the full `METRIC-01` inventory, classifies only the Process and ten boundary delegations as structural generated support, and finds no padding usage or interaction.

PASS-03 — Contract verification passes only if each of the 20 declared contract obligations satisfies `CONTRACT-01`, every finite guard partition has zero gaps and zero overlaps, all output/next-state mismatches are zero, and neither the Process nor root recomputes a local owner relation.

PASS-04 — Ownership verification passes only if canonical contracts and bounded checks agree for all eight declared ownership records and no credited fact is identity forwarding, one-to-one enum renaming, bundling, or central recomputation.

PASS-05 — Scenario verification passes only if the bounded analyzer satisfies `ANALYSIS-01` and `ANALYSIS-02`, reporting each expected named case, owner-produced intermediate fact, observed output, and next state through the 20 semantic end-to-end interactions.

PASS-06 — Trace verification passes only if every declared ID is covered or explicitly classified informational/deferred, every nonsemantic generated element is justified by `SUPPORT-01`, `SUPPORT-02`, or `SUPPORT-03`, and there are no missing IDs, unexplained IDs, unannotated significant elements, or semantically irrelevant associations.

PASS-07 — Designer validation passes only if source inspection confirms regulator/monitor independence, exact source threshold and hysteresis meaning, failed-output priorities, power-cycle-only recovery, all explicit formalization resolutions, and absence of a generic single thermostat decision abstraction.

PASS-08 — Timing review passes only as specification presence: the source values 0.5 second, 1.0 second, 5 seconds, and 6.0 seconds must be retained in traceable declarations/properties. No physical timing-compliance claim may be marked passed.

PASS-09 — Claim-boundary review passes only if physical plant performance, sensor accuracy, human response, failure probabilities, manufacturing cost, diagnostic coverage, code generation, application execution, solver proof, and safety certification remain unclaimed.

## Explicitly deferred and prohibited claims

DEF-01 — The heating/cooling rate, sensing accuracy, response latency in physical seconds, infant outcome, Nurse response time, and hazard/failure probabilities are not verified by this logical model.

DEF-02 — Internal memory checks, watchdogs, diagnostic coverage, failure probabilities, and the algorithms that produce `internal_failure_detected` are deferred until an implementation platform is selected.

DEF-03 — HAMR/GumboX code generation, Rust/Verus realization, application execution, scheduling, deployment, physical simulation, compositional proof, solver certification, production suitability, and safety certification are not required and shall remain `not-run` or unclaimed.

PROHIBIT-01 — The Model Agent shall not merge regulator and monitor mode, settings, diagnostic, or output-decision ownership; add a shared decision arbiter; route Desired Temperature Settings into the monitor; or route Alarm Temperature Settings into the regulator.

PROHIBIT-02 — The Model Agent shall not add an alarm acknowledgement/reset, extra sensor, actuator feedback, plant model, clock thread, output aggregator, pass-through adapter, or any support usage beyond the single Process and exact delegations allowed by `SUPPORT-01` and `SUPPORT-02`; generated support shall never be used to meet a semantic count.
