// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::manage_alarm_process_manage_alarm_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct manage_alarm_process_manage_alarm {
  // BEGIN MARKER STATE VARS
  pub alarm_control_state: Isolette_Thermostat_Rust::AlarmCommand,
  // END MARKER STATE VARS
}

#[verus_verify]
impl manage_alarm_process_manage_alarm {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      alarm_control_state: Isolette_Thermostat_Rust::AlarmCommand::default(),
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee initialize_alarm_control
      (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::Off) &&
        (api.alarm_control == Isolette_Thermostat_Rust::AlarmCommand::Off),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: manage_alarm_process_manage_alarm_Put_Api> (
    &mut self,
    api: &mut manage_alarm_process_manage_alarm_Application_Api<API>)
  {
    self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::Off;
    api.put_alarm_control(self.alarm_control_state);
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // The monitor interface owner derives an ordered range from the source
      // AlarmTemperatureSettings invariant (93..98, 99..103 degrees).
      old(api).control_basis.range_available ==>
        old(api).control_basis.lower_dF <= 2147483642,
      old(api).control_basis.range_available ==>
        old(api).control_basis.upper_dF >= -2147483643,
      old(api).control_basis.range_available ==>
        old(api).control_basis.lower_dF + 5 <= old(api).control_basis.upper_dF - 5,
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_18_alarm_mode_priority
      ((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::INIT) ==>
        (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::Off)) &&
        ((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::FAILED) ==>
          (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::On)),
      // guarantee CASE_19_alarm_numeric_partition
      (((((((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
        api.control_basis.range_available) &&
        (api.control_basis.current_value_dF < api.control_basis.lower_dF)) ==>
        (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::On)) &&
        (((((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF >= api.control_basis.lower_dF)) &&
          (api.control_basis.current_value_dF < add_alarm_margin(api.control_basis.lower_dF))) ==>
          (self.alarm_control_state == old(self).alarm_control_state))) &&
        (((((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF >= add_alarm_margin(api.control_basis.lower_dF))) &&
          (api.control_basis.current_value_dF <= subtract_alarm_margin(api.control_basis.upper_dF))) ==>
          (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::Off))) &&
        (((((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF > subtract_alarm_margin(api.control_basis.upper_dF))) &&
          (api.control_basis.current_value_dF <= api.control_basis.upper_dF)) ==>
          (self.alarm_control_state == old(self).alarm_control_state))) &&
        ((((api.monitor_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF > api.control_basis.upper_dF)) ==>
          (self.alarm_control_state == Isolette_Thermostat_Rust::AlarmCommand::On)),
      // guarantee preserve_alarm_owner_output
      api.alarm_control == self.alarm_control_state,
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: manage_alarm_process_manage_alarm_Full_Api> (
    &mut self,
    api: &mut manage_alarm_process_manage_alarm_Application_Api<API>)
  {
    let control_basis = api.get_control_basis();
    let monitor_mode = api.get_monitor_mode();
    match monitor_mode {
      Isolette_Thermostat_Rust::ThermostatMode::INIT => {
        self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::Off;
      },
      Isolette_Thermostat_Rust::ThermostatMode::FAILED => {
        self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::On;
      },
      Isolette_Thermostat_Rust::ThermostatMode::NORMAL => {
        if control_basis.range_available {
          if control_basis.current_value_dF < control_basis.lower_dF {
            self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::On;
          } else if control_basis.current_value_dF < control_basis.lower_dF + 5 {
            // Hysteresis: preserve the previous command.
          } else if control_basis.current_value_dF <= control_basis.upper_dF - 5 {
            self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::Off;
          } else if control_basis.current_value_dF <= control_basis.upper_dF {
            // Hysteresis: preserve the previous command.
          } else {
            self.alarm_control_state = Isolette_Thermostat_Rust::AlarmCommand::On;
          }
        }
      },
    }
    api.put_alarm_control(self.alarm_control_state);
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
  pub open spec fn add_alarm_margin__developer_verus(value: i32) -> i32
  {
    (value + 5) as i32
  }

  #[verifier::external_body]
  pub exec fn add_alarm_margin__developer_gumbox(value: i32) -> i32
  {
    value.saturating_add(5)
  }

  pub open spec fn subtract_alarm_margin__developer_verus(value: i32) -> i32
  {
    (value - 5) as i32
  }

  #[verifier::external_body]
  pub exec fn subtract_alarm_margin__developer_gumbox(value: i32) -> i32
  {
    value.saturating_sub(5)
  }

// BEGIN MARKER GUMBO METHODS
  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn add_alarm_margin__developer_verus(value: i32) -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn add_alarm_margin(value: i32) -> i32
  {
    add_alarm_margin__developer_verus(value)
  }

  /// Verus wrapper for the GUMBO spec function `test` that delegates to the developer-supplied Verus
  /// specification function that must have the following signature:
  /// 
  ///   pub open spec fn subtract_alarm_margin__developer_verus(value: i32) -> (res: i32) { ... }
  /// 
  /// The semantics of the GUMBO spec function are entirely defined by the developer-supplied implementation.
  pub open spec fn subtract_alarm_margin(value: i32) -> i32
  {
    subtract_alarm_margin__developer_verus(value)
  }
  // END MARKER GUMBO METHODS
}
