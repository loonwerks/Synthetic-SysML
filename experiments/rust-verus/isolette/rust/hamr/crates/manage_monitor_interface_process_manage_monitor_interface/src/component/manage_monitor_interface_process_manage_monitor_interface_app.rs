// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::manage_monitor_interface_process_manage_monitor_interface_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct manage_monitor_interface_process_manage_monitor_interface {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl manage_monitor_interface_process_manage_monitor_interface {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee initialize_monitor_status
      api.monitor_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Init,
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: manage_monitor_interface_process_manage_monitor_interface_Put_Api> (
    &mut self,
    api: &mut manage_monitor_interface_process_manage_monitor_interface_Application_Api<API>)
  {
    api.put_monitor_status(Isolette_Thermostat_Rust::ThermostatStatusValue::Init);
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // Source CurrentTemperature invariant, made explicit because the
      // current Rust generator does not lift data invariants to API specs.
      old(api).current_temperature.value_dF >= 680,
      old(api).current_temperature.value_dF <= 1050,
      // Source AlarmTemperatureSettings invariant, made explicit because the
      // current Rust generator does not lift data invariants to API specs.
      old(api).alarm_settings.lower >= 93,
      old(api).alarm_settings.lower <= 98,
      old(api).alarm_settings.upper >= 99,
      old(api).alarm_settings.upper <= 103,
      old(api).alarm_settings.lower < old(api).alarm_settings.upper,
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_11_alarm_status_qualification
      (api.interface_facts.interface_failure == (!(api.alarm_settings.lower_valid) || !(api.alarm_settings.upper_valid))) &&
        (api.interface_facts.current_valid == api.current_temperature.temperature_valid),
      // guarantee CASE_12_alarm_range_availability
      ((api.interface_facts.range_available == !(api.interface_facts.interface_failure)) &&
        (api.control_basis.range_available == api.interface_facts.range_available)) &&
        (api.interface_facts.range_available ==>
          ((((api.interface_facts.lower_dF == monitor_to_tenths(api.alarm_settings.lower)) &&
            (api.interface_facts.upper_dF == monitor_to_tenths(api.alarm_settings.upper))) &&
            (api.control_basis.lower_dF == api.interface_facts.lower_dF)) &&
            (api.control_basis.upper_dF == api.interface_facts.upper_dF))),
      // guarantee CASE_13_monitor_basis_and_status
      ((((api.control_basis.current_value_dF == api.current_temperature.value_dF) &&
        (api.control_basis.current_valid == api.interface_facts.current_valid)) &&
        ((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::INIT) ==>
          (api.monitor_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Init))) &&
        ((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) ==>
          (api.monitor_status == Isolette_Thermostat_Rust::ThermostatStatusValue::On))) &&
        ((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::FAILED) ==>
          (api.monitor_status == Isolette_Thermostat_Rust::ThermostatStatusValue::Failed)),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: manage_monitor_interface_process_manage_monitor_interface_Full_Api> (
    &mut self,
    api: &mut manage_monitor_interface_process_manage_monitor_interface_Application_Api<API>)
  {
    let current_temperature = api.get_current_temperature();
    let alarm_settings = api.get_alarm_settings();
    let monitor_mode = api.get_monitor_mode();
    let interface_failure = !alarm_settings.lower_valid || !alarm_settings.upper_valid;
    let range_available = !interface_failure;
    let lower_dF = alarm_settings.lower * 10;
    let upper_dF = alarm_settings.upper * 10;

    api.put_interface_facts(Isolette_Thermostat_Rust::MonitorInterfaceFacts {
      interface_failure,
      range_available,
      lower_dF,
      upper_dF,
      current_valid: current_temperature.temperature_valid,
    });
    api.put_control_basis(Isolette_Thermostat_Rust::MonitorControlBasis {
      current_value_dF: current_temperature.value_dF,
      current_valid: current_temperature.temperature_valid,
      range_available,
      lower_dF,
      upper_dF,
    });
    let monitor_status = match monitor_mode {
      Isolette_Thermostat_Rust::ThermostatMode::INIT =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::Init,
      Isolette_Thermostat_Rust::ThermostatMode::NORMAL =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::On,
      Isolette_Thermostat_Rust::ThermostatMode::FAILED =>
        Isolette_Thermostat_Rust::ThermostatStatusValue::Failed,
    };
    api.put_monitor_status(monitor_status);
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
  pub open spec fn monitor_to_tenths__developer_verus(value: i32) -> i32
  {
    (value * 10) as i32
  }

  #[verifier::external_body]
  pub exec fn monitor_to_tenths__developer_gumbox(value: i32) -> i32
  {
    value.saturating_mul(10)
  }

// BEGIN MARKER GUMBO METHODS
  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn monitor_to_tenths__developer_verus(value: i32) -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn monitor_to_tenths(value: i32) -> i32
  {
    monitor_to_tenths__developer_verus(value)
  }
  // END MARKER GUMBO METHODS
}
