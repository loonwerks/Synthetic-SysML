// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::manage_regulator_interface_process_manage_regulator_interface_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct manage_regulator_interface_process_manage_regulator_interface {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl manage_regulator_interface_process_manage_regulator_interface {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee generated_display_initialization
      (api.regulator_feedback.display_temperature == nominal_display_temperature()) &&
        (api.regulator_feedback.regulator_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Init),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: manage_regulator_interface_process_manage_regulator_interface_Put_Api> (
    &mut self,
    api: &mut manage_regulator_interface_process_manage_regulator_interface_Application_Api<API>)
  {
    api.put_regulator_feedback(Isolette_Thermostat_Rust::RegulatorFeedback {
      regulator_status: Isolette_Thermostat_Rust::ThermostatStatusValue::Init,
      display_temperature: 68,
    });
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // Source CurrentTemperature invariant, made explicit because the
      // current Rust generator does not lift data invariants to API specs.
      old(api).current_temperature.value_dF >= 680,
      old(api).current_temperature.value_dF <= 1050,
      // Source DesiredTemperatureSettings invariant, made explicit because
      // the current Rust generator does not lift data invariants to API specs.
      old(api).desired_settings.lower >= 97,
      old(api).desired_settings.lower <= 99,
      old(api).desired_settings.upper >= 98,
      old(api).desired_settings.upper <= 100,
      old(api).desired_settings.lower < old(api).desired_settings.upper,
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_01_desired_status_qualification
      (api.interface_facts.interface_failure == (!(api.desired_settings.lower_valid) || !(api.desired_settings.upper_valid))) &&
        (api.interface_facts.current_valid == api.current_temperature.temperature_valid),
      // guarantee CASE_02_desired_range_availability
      ((api.interface_facts.range_available == !(api.interface_facts.interface_failure)) &&
        (api.control_basis.range_available == api.interface_facts.range_available)) &&
        (api.interface_facts.range_available ==>
          ((((api.interface_facts.lower_dF == regulator_to_tenths(api.desired_settings.lower)) &&
            (api.interface_facts.upper_dF == regulator_to_tenths(api.desired_settings.upper))) &&
            (api.control_basis.lower_dF == api.interface_facts.lower_dF)) &&
            (api.control_basis.upper_dF == api.interface_facts.upper_dF))),
      // guarantee CASE_03_regulator_feedback
      (((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::INIT) ==>
        (api.regulator_feedback.regulator_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Init)) &&
        ((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) ==>
          ((api.regulator_feedback.regulator_status == Isolette_Thermostat_Rust::ThermostatStatusValue::On) &&
            (api.regulator_feedback.display_temperature == rounded_display_temperature(api.control_basis.current_value_dF))))) &&
        ((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::FAILED) ==>
          (api.regulator_feedback.regulator_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Failed)),
      // guarantee preserve_regulator_control_basis
      (api.control_basis.current_value_dF == api.current_temperature.value_dF) &&
        (api.control_basis.current_valid == api.interface_facts.current_valid),
      // guarantee preserve_display_temperature_domain
      (api.regulator_feedback.display_temperature >= nominal_display_temperature()) &&
        (api.regulator_feedback.display_temperature <= maximum_display_temperature()),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: manage_regulator_interface_process_manage_regulator_interface_Full_Api> (
    &mut self,
    api: &mut manage_regulator_interface_process_manage_regulator_interface_Application_Api<API>)
  {
    let current_temperature = api.get_current_temperature();
    let desired_settings = api.get_desired_settings();
    let regulator_mode = api.get_regulator_mode();
    let interface_failure = !desired_settings.lower_valid || !desired_settings.upper_valid;
    let range_available = !interface_failure;
    let lower_dF = desired_settings.lower * 10;
    let upper_dF = desired_settings.upper * 10;

    api.put_interface_facts(Isolette_Thermostat_Rust::RegulatorInterfaceFacts {
      interface_failure,
      range_available,
      lower_dF,
      upper_dF,
      current_valid: current_temperature.temperature_valid,
    });
    api.put_control_basis(Isolette_Thermostat_Rust::RegulatorControlBasis {
      current_value_dF: current_temperature.value_dF,
      current_valid: current_temperature.temperature_valid,
      range_available,
      lower_dF,
      upper_dF,
    });
    let regulator_status = match regulator_mode {
      Isolette_Thermostat_Rust::ThermostatMode::INIT =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::Init,
      Isolette_Thermostat_Rust::ThermostatMode::NORMAL =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::On,
      Isolette_Thermostat_Rust::ThermostatMode::FAILED =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::Failed,
    };
    let display_temperature = (current_temperature.value_dF + 5) / 10;
    api.put_regulator_feedback(Isolette_Thermostat_Rust::RegulatorFeedback {
      regulator_status,
      display_temperature,
    });
    log_info("compute entrypoint invoked");
  }

  pub fn notify(
    &mut self,
    channel: microkit_channel)
  {
    // this method is called when the monitor does not handle the passed in channel
    match channel {
      _ => {
        log_warn_channel(channel)
      }
    }
  }
}

#[verus_verify(external_body)]
pub fn log_info(msg: &str)
{
  log::info!("{0}", msg);
}

#[verus_verify(external_body)]
pub fn log_warn_channel(channel: u32)
{
  log::warn!("Unexpected channel: {0}", channel);
}

verus! {
  pub open spec fn nominal_display_temperature__developer_verus() -> i32
  {
    68
  }

  #[verifier::external_body]
  pub exec fn nominal_display_temperature__developer_gumbox() -> i32
  {
    68
  }

  pub open spec fn maximum_display_temperature__developer_verus() -> i32
  {
    105
  }

  #[verifier::external_body]
  pub exec fn maximum_display_temperature__developer_gumbox() -> i32
  {
    105
  }

  pub open spec fn regulator_to_tenths__developer_verus(value: i32) -> i32
  {
    (value * 10) as i32
  }

  #[verifier::external_body]
  pub exec fn regulator_to_tenths__developer_gumbox(value: i32) -> i32
  {
    value.saturating_mul(10)
  }

  pub open spec fn rounded_display_temperature__developer_verus(value: i32) -> i32
  {
    let shifted = value as int + 5;
    (if shifted >= 0 {
      shifted / 10
    } else {
      -((-shifted) / 10)
    }) as i32
  }

  #[verifier::external_body]
  pub exec fn rounded_display_temperature__developer_gumbox(value: i32) -> i32
  {
    ((value as i64 + 5) / 10) as i32
  }

// BEGIN MARKER GUMBO METHODS
  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn nominal_display_temperature__developer_verus() -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn nominal_display_temperature() -> i32
  {
    nominal_display_temperature__developer_verus()
  }

  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn maximum_display_temperature__developer_verus() -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn maximum_display_temperature() -> i32
  {
    maximum_display_temperature__developer_verus()
  }

  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn regulator_to_tenths__developer_verus(value: i32) -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn regulator_to_tenths(value: i32) -> i32
  {
    regulator_to_tenths__developer_verus(value)
  }

  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn rounded_display_temperature__developer_verus(value: i32) -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn rounded_display_temperature(value: i32) -> i32
  {
    rounded_display_temperature__developer_verus(value)
  }
  // END MARKER GUMBO METHODS
}
