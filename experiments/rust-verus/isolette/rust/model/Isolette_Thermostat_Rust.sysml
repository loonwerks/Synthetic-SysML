// @trace PURPOSE-01
// Deployment/codegen projection of the accepted Appendix A logical source.
// Audited changes are limited to the Rust namespace, HAMR component categories,
// one-thread-per-process Microkit hosting, periodic dispatch, domains, processor,
// and processor bindings. Owner GUMBO and source traces remain substantive.
package Isolette_Thermostat_Rust {
  public import AADL::*;
  public import HAMR_Time_Units::*;

  // @trace TYPE-01
  enum def ThermostatMode { enum INIT; enum NORMAL; enum FAILED; }
  // @trace CTRL-01
  enum def HeatCommand { enum Off; enum On; }
  // @trace CTRL-04
  enum def AlarmCommand { enum Off; enum On; }
  // @trace CTRL-02
  enum def ThermostatStatusValue { enum Init; enum On; enum Failed; }

  // Every record field inspected by GUMBO is an attribute, never a nested part.
  // @trace MON-01
  part def CurrentTemperature :> Data {
    attribute value_dF : Base_Types::Integer_32;
    attribute temperature_valid : Base_Types::Boolean;

    language "GUMBO" /*{
      invariants
        // @trace MON-01
        inv current_temperature_domain:
          value_dF >= (680 as Base_Types::Integer_32) &
          value_dF <= (1050 as Base_Types::Integer_32);
    }*/
  }

  // @trace MON-02
  part def DesiredTemperatureSettings :> Data {
    attribute lower : Base_Types::Integer_32;
    attribute lower_valid : Base_Types::Boolean;
    attribute upper : Base_Types::Integer_32;
    attribute upper_valid : Base_Types::Boolean;

    language "GUMBO" /*{
      invariants
        // @trace MON-02
        inv desired_settings_domain:
          lower >= (97 as Base_Types::Integer_32) &
          lower <= (99 as Base_Types::Integer_32) &
          upper >= (98 as Base_Types::Integer_32) &
          upper <= (100 as Base_Types::Integer_32) & lower < upper;
    }*/
  }

  // @trace MON-03
  part def AlarmTemperatureSettings :> Data {
    attribute lower : Base_Types::Integer_32;
    attribute lower_valid : Base_Types::Boolean;
    attribute upper : Base_Types::Integer_32;
    attribute upper_valid : Base_Types::Boolean;

    language "GUMBO" /*{
      invariants
        // @trace MON-03
        inv alarm_settings_domain:
          lower >= (93 as Base_Types::Integer_32) &
          lower <= (98 as Base_Types::Integer_32) &
          upper >= (99 as Base_Types::Integer_32) &
          upper <= (103 as Base_Types::Integer_32) & lower < upper;
    }*/
  }

  // @trace MON-04
  part def RegulatorSupervision :> Data {
    attribute power_epoch_changed : Base_Types::Boolean;
    attribute init_timeout_expired : Base_Types::Boolean;
    attribute internal_failure_detected : Base_Types::Boolean;
  }

  // @trace MON-05
  part def MonitorSupervision :> Data {
    attribute power_epoch_changed : Base_Types::Boolean;
    attribute init_timeout_expired : Base_Types::Boolean;
    attribute internal_failure_detected : Base_Types::Boolean;
  }

  // @trace INT-04
  part def RegulatorInterfaceFacts :> Data {
    attribute interface_failure : Base_Types::Boolean;
    attribute range_available : Base_Types::Boolean;
    attribute lower_dF : Base_Types::Integer_32;
    attribute upper_dF : Base_Types::Integer_32;
    attribute current_valid : Base_Types::Boolean;
  }

  // @trace INT-05
  part def RegulatorDiagnosticFacts :> Data {
    attribute power_epoch_changed : Base_Types::Boolean;
    attribute init_timeout_expired : Base_Types::Boolean;
    attribute internal_failure_latched : Base_Types::Boolean;
  }

  // @trace INT-07
  part def RegulatorFeedback :> Data {
    attribute regulator_status : ThermostatStatusValue;
    // @trace CTRL-03
    attribute display_temperature : Base_Types::Integer_32;

    language "GUMBO" /*{
      invariants
        // @trace CTRL-03
        inv display_temperature_domain:
          display_temperature >= (68 as Base_Types::Integer_32) &
          display_temperature <= (105 as Base_Types::Integer_32);
    }*/
  }

  // @trace INT-08
  part def RegulatorControlBasis :> Data {
    attribute current_value_dF : Base_Types::Integer_32;
    attribute current_valid : Base_Types::Boolean;
    attribute range_available : Base_Types::Boolean;
    attribute lower_dF : Base_Types::Integer_32;
    attribute upper_dF : Base_Types::Integer_32;
  }

  // @trace INT-14
  part def MonitorInterfaceFacts :> Data {
    attribute interface_failure : Base_Types::Boolean;
    attribute range_available : Base_Types::Boolean;
    attribute lower_dF : Base_Types::Integer_32;
    attribute upper_dF : Base_Types::Integer_32;
    attribute current_valid : Base_Types::Boolean;
  }

  // @trace INT-15
  part def MonitorDiagnosticFacts :> Data {
    attribute power_epoch_changed : Base_Types::Boolean;
    attribute init_timeout_expired : Base_Types::Boolean;
    attribute internal_failure_latched : Base_Types::Boolean;
  }

  // @trace INT-18
  part def MonitorControlBasis :> Data {
    attribute current_value_dF : Base_Types::Integer_32;
    attribute current_valid : Base_Types::Boolean;
    attribute range_available : Base_Types::Boolean;
    attribute lower_dF : Base_Types::Integer_32;
    attribute upper_dF : Base_Types::Integer_32;
  }

  // @trace PART-01
  part def ManageRegulatorInterface :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MRI-03
    attribute max_operator_response : AADL_Project::Time = 500 [ms];
    // @trace INT-01
    port current_temperature : DataPort { in :>> type : CurrentTemperature; }
    // @trace INT-02
    port desired_settings : DataPort { in :>> type : DesiredTemperatureSettings; }
    // @trace INT-06
    port regulator_mode : DataPort { in :>> type : ThermostatMode; }
    // @trace INT-04
    port interface_facts : DataPort { out :>> type : RegulatorInterfaceFacts; }
    // @trace INT-07
    port regulator_feedback : DataPort { out :>> type : RegulatorFeedback; }
    // @trace INT-08
    port control_basis : DataPort { out :>> type : RegulatorControlBasis; }

    language "GUMBO" /*{
      // Generator compatibility: VerusVCSerializer currently emits SysML
      // Integer_32 casts as invalid Rust `.asInstanceOf` selections. These
      // exact operations are supplied and verified in the preserved app.
      functions
        @spec def nominal_display_temperature(): Base_Types::Integer_32;
        @spec def maximum_display_temperature(): Base_Types::Integer_32;
        @spec def regulator_to_tenths(value: Base_Types::Integer_32): Base_Types::Integer_32;
        @spec def rounded_display_temperature(value: Base_Types::Integer_32): Base_Types::Integer_32;

      initialize
        // @generated-support SUPPORT-03
        guarantee generated_display_initialization:
          regulator_feedback.display_temperature == nominal_display_temperature() &
          regulator_feedback.regulator_status == ThermostatStatusValue::Init;

      compute
        // @trace CASE-01
        guarantee CASE_01_desired_status_qualification:
          interface_facts.interface_failure ==
            (not (desired_settings.lower_valid) |
             not (desired_settings.upper_valid)) &
          interface_facts.current_valid == current_temperature.temperature_valid;

        // @trace CASE-02
        guarantee CASE_02_desired_range_availability:
          interface_facts.range_available == not (interface_facts.interface_failure) &
          control_basis.range_available == interface_facts.range_available &
          (interface_facts.range_available implies
            (interface_facts.lower_dF == regulator_to_tenths(desired_settings.lower) &
             interface_facts.upper_dF == regulator_to_tenths(desired_settings.upper) &
             control_basis.lower_dF == interface_facts.lower_dF &
             control_basis.upper_dF == interface_facts.upper_dF));

        // @trace CASE-03
        guarantee CASE_03_regulator_feedback:
          (regulator_mode == ThermostatMode::INIT implies
            regulator_feedback.regulator_status == ThermostatStatusValue::Init) &
          (regulator_mode == ThermostatMode::NORMAL implies
            (regulator_feedback.regulator_status == ThermostatStatusValue::On &
             regulator_feedback.display_temperature ==
               rounded_display_temperature(control_basis.current_value_dF))) &
          (regulator_mode == ThermostatMode::FAILED implies
            regulator_feedback.regulator_status == ThermostatStatusValue::Failed);

        // @trace INT-08
        guarantee preserve_regulator_control_basis:
          control_basis.current_value_dF == current_temperature.value_dF &
          control_basis.current_valid == interface_facts.current_valid;

        // @trace CTRL-03
        guarantee preserve_display_temperature_domain:
          regulator_feedback.display_temperature >= nominal_display_temperature() &
          regulator_feedback.display_temperature <= maximum_display_temperature();
    }*/
  }

  // @trace PART-02
  part def DetectRegulatorFailure :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MRM-04
    attribute regulator_init_timeout : AADL_Project::Time = 1 [s];
    // @trace INT-03
    port supervision : DataPort { in :>> type : RegulatorSupervision; }
    // @trace INT-05
    port diagnostic_facts : DataPort { out :>> type : RegulatorDiagnosticFacts; }

    language "GUMBO" /*{
      // @trace STATE-01
      state regulator_internal_failure_latched: Base_Types::Boolean;

      initialize
        modifies regulator_internal_failure_latched;
        // @trace STATE-01
        guarantee initialize_regulator_failure_latch:
          regulator_internal_failure_latched == false &
          diagnostic_facts.internal_failure_latched == false;

      compute
        modifies regulator_internal_failure_latched;

        // @trace CASE-04
        guarantee CASE_04_regulator_epoch_reset:
          supervision.power_epoch_changed implies
            (regulator_internal_failure_latched == false &
             diagnostic_facts.internal_failure_latched == false);

        // @trace CASE-05
        guarantee CASE_05_regulator_failure_latch:
          not (supervision.power_epoch_changed) implies
            (regulator_internal_failure_latched ==
               (In(regulator_internal_failure_latched) |
                supervision.internal_failure_detected) &
             diagnostic_facts.internal_failure_latched ==
               regulator_internal_failure_latched);

        // @trace INT-05
        guarantee preserve_regulator_supervision_classification:
          diagnostic_facts.power_epoch_changed == supervision.power_epoch_changed &
          diagnostic_facts.init_timeout_expired == supervision.init_timeout_expired;
    }*/
  }

  // @trace PART-03
  part def ManageRegulatorMode :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace INT-04
    port interface_facts : DataPort { in :>> type : RegulatorInterfaceFacts; }
    // @trace INT-05
    port diagnostic_facts : DataPort { in :>> type : RegulatorDiagnosticFacts; }
    // @trace INT-06
    port mode_for_interface : DataPort { out :>> type : ThermostatMode; }
    // @trace INT-09
    port mode_for_heat : DataPort { out :>> type : ThermostatMode; }

    language "GUMBO" /*{
      // @trace STATE-02
      state regulator_mode_state: ThermostatMode;

      initialize
        modifies regulator_mode_state;
        // @trace STATE-02
        guarantee initialize_regulator_mode:
          regulator_mode_state == ThermostatMode::INIT &
          mode_for_interface == ThermostatMode::INIT &
          mode_for_heat == ThermostatMode::INIT;

      compute
        modifies regulator_mode_state;

        // @trace CASE-06
        guarantee CASE_06_regulator_health_decision:
          ((not (diagnostic_facts.power_epoch_changed) &
           not (interface_facts.interface_failure) &
           not (diagnostic_facts.internal_failure_latched) &
           interface_facts.current_valid &
           In(regulator_mode_state) == ThermostatMode::INIT) implies
             regulator_mode_state == ThermostatMode::NORMAL) &
          ((not (diagnostic_facts.power_epoch_changed) &
           not (interface_facts.interface_failure) &
           not (diagnostic_facts.internal_failure_latched) &
           interface_facts.current_valid &
           In(regulator_mode_state) == ThermostatMode::NORMAL) implies
             regulator_mode_state == ThermostatMode::NORMAL);

        // @trace CASE-07
        guarantee CASE_07_regulator_mode_transition:
          (diagnostic_facts.power_epoch_changed implies
            regulator_mode_state == ThermostatMode::INIT) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(regulator_mode_state) == ThermostatMode::FAILED implies
            regulator_mode_state == ThermostatMode::FAILED) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(regulator_mode_state) == ThermostatMode::INIT &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) &
           diagnostic_facts.init_timeout_expired implies
            regulator_mode_state == ThermostatMode::FAILED) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(regulator_mode_state) == ThermostatMode::INIT &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) &
           not (diagnostic_facts.init_timeout_expired) implies
            regulator_mode_state == ThermostatMode::INIT) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(regulator_mode_state) == ThermostatMode::NORMAL &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) implies
            regulator_mode_state == ThermostatMode::FAILED) &
          mode_for_interface == regulator_mode_state &
          mode_for_heat == regulator_mode_state;
    }*/
  }

  // @trace PART-04
  part def ManageHeatSource :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MHS-05
    attribute allowed_heat_source_latency : AADL_Project::Time = 6 [s];
    // @trace INT-08
    port control_basis : DataPort { in :>> type : RegulatorControlBasis; }
    // @trace INT-09
    port regulator_mode : DataPort { in :>> type : ThermostatMode; }
    // @trace INT-10
    port heat_control : DataPort { out :>> type : HeatCommand; }

    language "GUMBO" /*{
      // @trace STATE-03
      state heat_control_state: HeatCommand;

      initialize
        modifies heat_control_state;
        // @trace STATE-03
        guarantee initialize_heat_control:
          heat_control_state == HeatCommand::Off &
          heat_control == HeatCommand::Off;

      compute
        modifies heat_control_state;

        // @trace CASE-08
        guarantee CASE_08_heat_safe_off_priority:
          (regulator_mode == ThermostatMode::INIT |
           regulator_mode == ThermostatMode::FAILED) implies
            heat_control_state == HeatCommand::Off;

        // @trace CASE-09
        guarantee CASE_09_heat_numeric_partition:
          (regulator_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF < control_basis.lower_dF implies
            heat_control_state == HeatCommand::On) &
          (regulator_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF > control_basis.upper_dF implies
            heat_control_state == HeatCommand::Off) &
          (regulator_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF >= control_basis.lower_dF &
           control_basis.current_value_dF <= control_basis.upper_dF implies
            heat_control_state == In(heat_control_state));

        // @trace CASE-10
        guarantee CASE_10_heat_owner_local_output:
          heat_control == heat_control_state;
    }*/
  }

  // @trace PART-05
  part def ManageMonitorInterface :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MMI-03
    attribute max_operator_response : AADL_Project::Time = 500 [ms];
    // @trace INT-11
    port current_temperature : DataPort { in :>> type : CurrentTemperature; }
    // @trace INT-12
    port alarm_settings : DataPort { in :>> type : AlarmTemperatureSettings; }
    // @trace INT-16
    port monitor_mode : DataPort { in :>> type : ThermostatMode; }
    // @trace INT-14
    port interface_facts : DataPort { out :>> type : MonitorInterfaceFacts; }
    // @trace INT-17
    port monitor_status : DataPort { out :>> type : ThermostatStatusValue; }
    // @trace INT-18
    port control_basis : DataPort { out :>> type : MonitorControlBasis; }

    language "GUMBO" /*{
      // See the generator-compatibility audit on ManageRegulatorInterface.
      functions
        @spec def monitor_to_tenths(value: Base_Types::Integer_32): Base_Types::Integer_32;

      initialize
        // @trace CTRL-05
        guarantee initialize_monitor_status:
          monitor_status == ThermostatStatusValue::Init;

      compute
        // @trace CASE-11
        guarantee CASE_11_alarm_status_qualification:
          interface_facts.interface_failure ==
            (not (alarm_settings.lower_valid) |
             not (alarm_settings.upper_valid)) &
          interface_facts.current_valid == current_temperature.temperature_valid;

        // @trace CASE-12
        guarantee CASE_12_alarm_range_availability:
          interface_facts.range_available == not (interface_facts.interface_failure) &
          control_basis.range_available == interface_facts.range_available &
          (interface_facts.range_available implies
            (interface_facts.lower_dF == monitor_to_tenths(alarm_settings.lower) &
             interface_facts.upper_dF == monitor_to_tenths(alarm_settings.upper) &
             control_basis.lower_dF == interface_facts.lower_dF &
             control_basis.upper_dF == interface_facts.upper_dF));

        // @trace CASE-13
        guarantee CASE_13_monitor_basis_and_status:
          control_basis.current_value_dF == current_temperature.value_dF &
          control_basis.current_valid == interface_facts.current_valid &
          (monitor_mode == ThermostatMode::INIT implies
            monitor_status == ThermostatStatusValue::Init) &
          (monitor_mode == ThermostatMode::NORMAL implies
            monitor_status == ThermostatStatusValue::On) &
          (monitor_mode == ThermostatMode::FAILED implies
            monitor_status == ThermostatStatusValue::Failed);
    }*/
  }

  // @trace PART-06
  part def DetectMonitorFailure :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MMM-04
    attribute monitor_init_timeout : AADL_Project::Time = 1 [s];
    // @trace INT-13
    port supervision : DataPort { in :>> type : MonitorSupervision; }
    // @trace INT-15
    port diagnostic_facts : DataPort { out :>> type : MonitorDiagnosticFacts; }

    language "GUMBO" /*{
      // @trace STATE-04
      state monitor_internal_failure_latched: Base_Types::Boolean;

      initialize
        modifies monitor_internal_failure_latched;
        // @trace STATE-04
        guarantee initialize_monitor_failure_latch:
          monitor_internal_failure_latched == false &
          diagnostic_facts.internal_failure_latched == false;

      compute
        modifies monitor_internal_failure_latched;

        // @trace CASE-14
        guarantee CASE_14_monitor_epoch_reset:
          supervision.power_epoch_changed implies
            (monitor_internal_failure_latched == false &
             diagnostic_facts.internal_failure_latched == false);

        // @trace CASE-15
        guarantee CASE_15_monitor_failure_latch:
          not (supervision.power_epoch_changed) implies
            (monitor_internal_failure_latched ==
               (In(monitor_internal_failure_latched) |
                supervision.internal_failure_detected) &
             diagnostic_facts.internal_failure_latched ==
               monitor_internal_failure_latched);

        // @trace INT-15
        guarantee preserve_monitor_supervision_classification:
          diagnostic_facts.power_epoch_changed == supervision.power_epoch_changed &
          diagnostic_facts.init_timeout_expired == supervision.init_timeout_expired;
    }*/
  }

  // @trace PART-07
  part def ManageMonitorMode :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace INT-14
    port interface_facts : DataPort { in :>> type : MonitorInterfaceFacts; }
    // @trace INT-15
    port diagnostic_facts : DataPort { in :>> type : MonitorDiagnosticFacts; }
    // @trace INT-16
    port mode_for_interface : DataPort { out :>> type : ThermostatMode; }
    // @trace INT-19
    port mode_for_alarm : DataPort { out :>> type : ThermostatMode; }

    language "GUMBO" /*{
      // @trace STATE-05
      state monitor_mode_state: ThermostatMode;

      initialize
        modifies monitor_mode_state;
        // @trace STATE-05
        guarantee initialize_monitor_mode:
          monitor_mode_state == ThermostatMode::INIT &
          mode_for_interface == ThermostatMode::INIT &
          mode_for_alarm == ThermostatMode::INIT;

      compute
        modifies monitor_mode_state;

        // @trace CASE-16
        guarantee CASE_16_monitor_health_decision:
          ((not (diagnostic_facts.power_epoch_changed) &
           not (interface_facts.interface_failure) &
           not (diagnostic_facts.internal_failure_latched) &
           interface_facts.current_valid &
           In(monitor_mode_state) == ThermostatMode::INIT) implies
             monitor_mode_state == ThermostatMode::NORMAL) &
          ((not (diagnostic_facts.power_epoch_changed) &
           not (interface_facts.interface_failure) &
           not (diagnostic_facts.internal_failure_latched) &
           interface_facts.current_valid &
           In(monitor_mode_state) == ThermostatMode::NORMAL) implies
             monitor_mode_state == ThermostatMode::NORMAL);

        // @trace CASE-17
        guarantee CASE_17_monitor_mode_transition:
          (diagnostic_facts.power_epoch_changed implies
            monitor_mode_state == ThermostatMode::INIT) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(monitor_mode_state) == ThermostatMode::FAILED implies
            monitor_mode_state == ThermostatMode::FAILED) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(monitor_mode_state) == ThermostatMode::INIT &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) &
           diagnostic_facts.init_timeout_expired implies
            monitor_mode_state == ThermostatMode::FAILED) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(monitor_mode_state) == ThermostatMode::INIT &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) &
           not (diagnostic_facts.init_timeout_expired) implies
            monitor_mode_state == ThermostatMode::INIT) &
          (not (diagnostic_facts.power_epoch_changed) &
           In(monitor_mode_state) == ThermostatMode::NORMAL &
           (interface_facts.interface_failure |
            diagnostic_facts.internal_failure_latched |
            not (interface_facts.current_valid)) implies
            monitor_mode_state == ThermostatMode::FAILED) &
          mode_for_interface == monitor_mode_state &
          mode_for_alarm == monitor_mode_state;
    }*/
  }

  // @trace PART-08
  part def ManageAlarm :> HAMR_AADL::Thread {
    attribute :>> Dispatch_Protocol = AADL_Project::Periodic;
    attribute :>> Period = 1000 [ms];
    attribute :>> Implementation_Language = HAMR::Rust;
    // @trace SRC-REQ-MA-05
    attribute alarm_latency : AADL_Project::Time = 5 [s];
    // @trace INT-18
    port control_basis : DataPort { in :>> type : MonitorControlBasis; }
    // @trace INT-19
    port monitor_mode : DataPort { in :>> type : ThermostatMode; }
    // @trace INT-20
    port alarm_control : DataPort { out :>> type : AlarmCommand; }

    language "GUMBO" /*{
      // @trace STATE-06
      state alarm_control_state: AlarmCommand;

      // See the generator-compatibility audit on ManageRegulatorInterface.
      functions
        @spec def add_alarm_margin(value: Base_Types::Integer_32): Base_Types::Integer_32;
        @spec def subtract_alarm_margin(value: Base_Types::Integer_32): Base_Types::Integer_32;

      initialize
        modifies alarm_control_state;
        // @trace STATE-06
        guarantee initialize_alarm_control:
          alarm_control_state == AlarmCommand::Off &
          alarm_control == AlarmCommand::Off;

      compute
        modifies alarm_control_state;

        // @trace CASE-18
        guarantee CASE_18_alarm_mode_priority:
          (monitor_mode == ThermostatMode::INIT implies
            alarm_control_state == AlarmCommand::Off) &
          (monitor_mode == ThermostatMode::FAILED implies
            alarm_control_state == AlarmCommand::On);

        // @trace CASE-19
        guarantee CASE_19_alarm_numeric_partition:
          (monitor_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF < control_basis.lower_dF implies
            alarm_control_state == AlarmCommand::On) &
          (monitor_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF >= control_basis.lower_dF &
           control_basis.current_value_dF < add_alarm_margin(control_basis.lower_dF) implies
            alarm_control_state == In(alarm_control_state)) &
          (monitor_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF >= add_alarm_margin(control_basis.lower_dF) &
           control_basis.current_value_dF <= subtract_alarm_margin(control_basis.upper_dF) implies
            alarm_control_state == AlarmCommand::Off) &
          (monitor_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF > subtract_alarm_margin(control_basis.upper_dF) &
           control_basis.current_value_dF <= control_basis.upper_dF implies
            alarm_control_state == In(alarm_control_state)) &
          (monitor_mode == ThermostatMode::NORMAL &
           control_basis.range_available &
           control_basis.current_value_dF > control_basis.upper_dF implies
            alarm_control_state == AlarmCommand::On);

        // @trace INT-20
        guarantee preserve_alarm_owner_output:
          alarm_control == alarm_control_state;
    }*/
  }

  // @generated-support RUST-SUPPORT-01
  // Microkit Rust currently requires one Thread per Process. These eight
  // behavior-free wrappers retain the eight independent owner Threads.
  part def ManageRegulatorInterfaceProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 2;
    port current_temperature : DataPort { in :>> type : CurrentTemperature; }
    port desired_settings : DataPort { in :>> type : DesiredTemperatureSettings; }
    port regulator_mode : DataPort { in :>> type : ThermostatMode; }
    port interface_facts : DataPort { out :>> type : RegulatorInterfaceFacts; }
    port regulator_feedback : DataPort { out :>> type : RegulatorFeedback; }
    port control_basis : DataPort { out :>> type : RegulatorControlBasis; }
    // @trace PART-01
    part manage_regulator_interface : ManageRegulatorInterface;
    connection in_current : PortConnection connect current_temperature to manage_regulator_interface.current_temperature;
    connection in_settings : PortConnection connect desired_settings to manage_regulator_interface.desired_settings;
    connection in_mode : PortConnection connect regulator_mode to manage_regulator_interface.regulator_mode;
    connection out_facts : PortConnection connect manage_regulator_interface.interface_facts to interface_facts;
    connection out_feedback : PortConnection connect manage_regulator_interface.regulator_feedback to regulator_feedback;
    connection out_basis : PortConnection connect manage_regulator_interface.control_basis to control_basis;
  }

  part def DetectRegulatorFailureProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 3;
    port supervision : DataPort { in :>> type : RegulatorSupervision; }
    port diagnostic_facts : DataPort { out :>> type : RegulatorDiagnosticFacts; }
    // @trace PART-02
    part detect_regulator_failure : DetectRegulatorFailure;
    connection in_supervision : PortConnection connect supervision to detect_regulator_failure.supervision;
    connection out_diagnostics : PortConnection connect detect_regulator_failure.diagnostic_facts to diagnostic_facts;
  }

  part def ManageRegulatorModeProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 4;
    port interface_facts : DataPort { in :>> type : RegulatorInterfaceFacts; }
    port diagnostic_facts : DataPort { in :>> type : RegulatorDiagnosticFacts; }
    port mode_for_interface : DataPort { out :>> type : ThermostatMode; }
    port mode_for_heat : DataPort { out :>> type : ThermostatMode; }
    // @trace PART-03
    part manage_regulator_mode : ManageRegulatorMode;
    connection in_interface : PortConnection connect interface_facts to manage_regulator_mode.interface_facts;
    connection in_diagnostics : PortConnection connect diagnostic_facts to manage_regulator_mode.diagnostic_facts;
    connection out_interface_mode : PortConnection connect manage_regulator_mode.mode_for_interface to mode_for_interface;
    connection out_heat_mode : PortConnection connect manage_regulator_mode.mode_for_heat to mode_for_heat;
  }

  part def ManageHeatSourceProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 5;
    port control_basis : DataPort { in :>> type : RegulatorControlBasis; }
    port regulator_mode : DataPort { in :>> type : ThermostatMode; }
    port heat_control : DataPort { out :>> type : HeatCommand; }
    // @trace PART-04
    part manage_heat_source : ManageHeatSource;
    connection in_basis : PortConnection connect control_basis to manage_heat_source.control_basis;
    connection in_mode : PortConnection connect regulator_mode to manage_heat_source.regulator_mode;
    connection out_heat : PortConnection connect manage_heat_source.heat_control to heat_control;
  }

  part def ManageMonitorInterfaceProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 6;
    port current_temperature : DataPort { in :>> type : CurrentTemperature; }
    port alarm_settings : DataPort { in :>> type : AlarmTemperatureSettings; }
    port monitor_mode : DataPort { in :>> type : ThermostatMode; }
    port interface_facts : DataPort { out :>> type : MonitorInterfaceFacts; }
    port monitor_status : DataPort { out :>> type : ThermostatStatusValue; }
    port control_basis : DataPort { out :>> type : MonitorControlBasis; }
    // @trace PART-05
    part manage_monitor_interface : ManageMonitorInterface;
    connection in_current : PortConnection connect current_temperature to manage_monitor_interface.current_temperature;
    connection in_settings : PortConnection connect alarm_settings to manage_monitor_interface.alarm_settings;
    connection in_mode : PortConnection connect monitor_mode to manage_monitor_interface.monitor_mode;
    connection out_facts : PortConnection connect manage_monitor_interface.interface_facts to interface_facts;
    connection out_status : PortConnection connect manage_monitor_interface.monitor_status to monitor_status;
    connection out_basis : PortConnection connect manage_monitor_interface.control_basis to control_basis;
  }

  part def DetectMonitorFailureProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 7;
    port supervision : DataPort { in :>> type : MonitorSupervision; }
    port diagnostic_facts : DataPort { out :>> type : MonitorDiagnosticFacts; }
    // @trace PART-06
    part detect_monitor_failure : DetectMonitorFailure;
    connection in_supervision : PortConnection connect supervision to detect_monitor_failure.supervision;
    connection out_diagnostics : PortConnection connect detect_monitor_failure.diagnostic_facts to diagnostic_facts;
  }

  part def ManageMonitorModeProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 8;
    port interface_facts : DataPort { in :>> type : MonitorInterfaceFacts; }
    port diagnostic_facts : DataPort { in :>> type : MonitorDiagnosticFacts; }
    port mode_for_interface : DataPort { out :>> type : ThermostatMode; }
    port mode_for_alarm : DataPort { out :>> type : ThermostatMode; }
    // @trace PART-07
    part manage_monitor_mode : ManageMonitorMode;
    connection in_interface : PortConnection connect interface_facts to manage_monitor_mode.interface_facts;
    connection in_diagnostics : PortConnection connect diagnostic_facts to manage_monitor_mode.diagnostic_facts;
    connection out_interface_mode : PortConnection connect manage_monitor_mode.mode_for_interface to mode_for_interface;
    connection out_alarm_mode : PortConnection connect manage_monitor_mode.mode_for_alarm to mode_for_alarm;
  }

  part def ManageAlarmProcess :> HAMR_AADL::Process {
    attribute :>> Domain = 9;
    port control_basis : DataPort { in :>> type : MonitorControlBasis; }
    port monitor_mode : DataPort { in :>> type : ThermostatMode; }
    port alarm_control : DataPort { out :>> type : AlarmCommand; }
    // @trace PART-08
    part manage_alarm : ManageAlarm;
    connection in_basis : PortConnection connect control_basis to manage_alarm.control_basis;
    connection in_mode : PortConnection connect monitor_mode to manage_alarm.monitor_mode;
    connection out_alarm : PortConnection connect manage_alarm.alarm_control to alarm_control;
  }

  // @generated-support RUST-SUPPORT-02
  part def IsoletteProcessor :> HAMR_AADL::Processor {
    attribute :>> Clock_Period = 1 [ms];
    attribute :>> Frame_Period = 1000 [ms];
    attribute :>> Max_Domain = 9;
  }

  // @trace CASE-20
  // Composed noninterference remains structural: the root only routes the
  // owner-produced facts and does not recompute regulator or monitor policy.
  // @trace STRUCT-01
  part def IsoletteThermostatSystem :> HAMR_AADL::System {
    attribute :>> Scheduling = HAMR_Microkit::Domain_Scheduling;
    // One source-bounded Current Temperature sample fans out to both independent
    // regions; neither region can substitute a separately sampled value.
    // @trace MON-01
    port current_temperature : DataPort { in :>> type : CurrentTemperature; }
    // @trace INT-02
    port desired_settings : DataPort { in :>> type : DesiredTemperatureSettings; }
    // @trace INT-03
    port regulator_supervision : DataPort { in :>> type : RegulatorSupervision; }
    // @trace INT-07
    port regulator_feedback : DataPort { out :>> type : RegulatorFeedback; }
    // @trace INT-10
    port heat_control : DataPort { out :>> type : HeatCommand; }
    // @trace INT-12
    port alarm_settings : DataPort { in :>> type : AlarmTemperatureSettings; }
    // @trace INT-13
    port monitor_supervision : DataPort { in :>> type : MonitorSupervision; }
    // @trace INT-17
    port monitor_status : DataPort { out :>> type : ThermostatStatusValue; }
    // @trace INT-20
    port alarm_control : DataPort { out :>> type : AlarmCommand; }

    part cpu : IsoletteProcessor;
    part manage_regulator_interface_process : ManageRegulatorInterfaceProcess;
    part detect_regulator_failure_process : DetectRegulatorFailureProcess;
    part manage_regulator_mode_process : ManageRegulatorModeProcess;
    part manage_heat_source_process : ManageHeatSourceProcess;
    part manage_monitor_interface_process : ManageMonitorInterfaceProcess;
    part detect_monitor_failure_process : DetectMonitorFailureProcess;
    part manage_monitor_mode_process : ManageMonitorModeProcess;
    part manage_alarm_process : ManageAlarmProcess;

    // Ten unchanged root-boundary semantic routes.
    // @trace INT-01
    connection int01 : PortConnection connect current_temperature to manage_regulator_interface_process.current_temperature;
    // @trace INT-02
    connection int02 : PortConnection connect desired_settings to manage_regulator_interface_process.desired_settings;
    // @trace INT-03
    connection int03 : PortConnection connect regulator_supervision to detect_regulator_failure_process.supervision;
    // @trace INT-07
    connection int07 : PortConnection connect manage_regulator_interface_process.regulator_feedback to regulator_feedback;
    // @trace INT-10
    connection int10 : PortConnection connect manage_heat_source_process.heat_control to heat_control;
    // @trace INT-11
    connection int11 : PortConnection connect current_temperature to manage_monitor_interface_process.current_temperature;
    // @trace INT-12
    connection int12 : PortConnection connect alarm_settings to manage_monitor_interface_process.alarm_settings;
    // @trace INT-13
    connection int13 : PortConnection connect monitor_supervision to detect_monitor_failure_process.supervision;
    // @trace INT-17
    connection int17 : PortConnection connect manage_monitor_interface_process.monitor_status to monitor_status;
    // @trace INT-20
    connection int20 : PortConnection connect manage_alarm_process.alarm_control to alarm_control;

    // Ten unchanged owner-to-owner semantic routes across wrapper boundaries.
    // @trace INT-04
    connection int04 : PortConnection connect manage_regulator_interface_process.interface_facts to manage_regulator_mode_process.interface_facts;
    // @trace INT-05
    connection int05 : PortConnection connect detect_regulator_failure_process.diagnostic_facts to manage_regulator_mode_process.diagnostic_facts;
    // @trace INT-06
    connection int06 : PortConnection connect manage_regulator_mode_process.mode_for_interface to manage_regulator_interface_process.regulator_mode;
    // @trace INT-08
    connection int08 : PortConnection connect manage_regulator_interface_process.control_basis to manage_heat_source_process.control_basis;
    // @trace INT-09
    connection int09 : PortConnection connect manage_regulator_mode_process.mode_for_heat to manage_heat_source_process.regulator_mode;
    // @trace INT-14
    connection int14 : PortConnection connect manage_monitor_interface_process.interface_facts to manage_monitor_mode_process.interface_facts;
    // @trace INT-15
    connection int15 : PortConnection connect detect_monitor_failure_process.diagnostic_facts to manage_monitor_mode_process.diagnostic_facts;
    // @trace INT-16
    connection int16 : PortConnection connect manage_monitor_mode_process.mode_for_interface to manage_monitor_interface_process.monitor_mode;
    // @trace INT-18
    connection int18 : PortConnection connect manage_monitor_interface_process.control_basis to manage_alarm_process.control_basis;
    // @trace INT-19
    connection int19 : PortConnection connect manage_monitor_mode_process.mode_for_alarm to manage_alarm_process.monitor_mode;

    // @generated-support RUST-SUPPORT-03
    allocation bind_manage_regulator_interface : Deployment_Properties::Actual_Processor_Binding allocate manage_regulator_interface_process to cpu;
    allocation bind_detect_regulator_failure : Deployment_Properties::Actual_Processor_Binding allocate detect_regulator_failure_process to cpu;
    allocation bind_manage_regulator_mode : Deployment_Properties::Actual_Processor_Binding allocate manage_regulator_mode_process to cpu;
    allocation bind_manage_heat_source : Deployment_Properties::Actual_Processor_Binding allocate manage_heat_source_process to cpu;
    allocation bind_manage_monitor_interface : Deployment_Properties::Actual_Processor_Binding allocate manage_monitor_interface_process to cpu;
    allocation bind_detect_monitor_failure : Deployment_Properties::Actual_Processor_Binding allocate detect_monitor_failure_process to cpu;
    allocation bind_manage_monitor_mode : Deployment_Properties::Actual_Processor_Binding allocate manage_monitor_mode_process to cpu;
    allocation bind_manage_alarm : Deployment_Properties::Actual_Processor_Binding allocate manage_alarm_process to cpu;
  }
}
