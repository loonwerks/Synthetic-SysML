// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::manage_heat_source_process_manage_heat_source_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct manage_heat_source_process_manage_heat_source {
  // BEGIN MARKER STATE VARS
  pub heat_control_state: Isolette_Thermostat_Rust::HeatCommand,
  // END MARKER STATE VARS
}

#[verus_verify]
impl manage_heat_source_process_manage_heat_source {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      heat_control_state: Isolette_Thermostat_Rust::HeatCommand::default(),
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee initialize_heat_control
      (self.heat_control_state == Isolette_Thermostat_Rust::HeatCommand::Off) &&
        (api.heat_control == Isolette_Thermostat_Rust::HeatCommand::Off),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: manage_heat_source_process_manage_heat_source_Put_Api> (
    &mut self,
    api: &mut manage_heat_source_process_manage_heat_source_Application_Api<API>)
  {
    self.heat_control_state = Isolette_Thermostat_Rust::HeatCommand::Off;
    api.put_heat_control(self.heat_control_state);
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // The interface owner guarantees an ordered available range.
      old(api).control_basis.range_available ==>
        old(api).control_basis.lower_dF <= old(api).control_basis.upper_dF,
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_08_heat_safe_off_priority
      ((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::INIT) ||
        (api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::FAILED)) ==>
        (self.heat_control_state == Isolette_Thermostat_Rust::HeatCommand::Off),
      // guarantee CASE_09_heat_numeric_partition
      (((((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
        api.control_basis.range_available) &&
        (api.control_basis.current_value_dF < api.control_basis.lower_dF)) ==>
        (self.heat_control_state == Isolette_Thermostat_Rust::HeatCommand::On)) &&
        ((((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF > api.control_basis.upper_dF)) ==>
          (self.heat_control_state == Isolette_Thermostat_Rust::HeatCommand::Off))) &&
        (((((api.regulator_mode == Isolette_Thermostat_Rust::ThermostatMode::NORMAL) &&
          api.control_basis.range_available) &&
          (api.control_basis.current_value_dF >= api.control_basis.lower_dF)) &&
          (api.control_basis.current_value_dF <= api.control_basis.upper_dF)) ==>
          (self.heat_control_state == old(self).heat_control_state)),
      // guarantee CASE_10_heat_owner_local_output
      api.heat_control == self.heat_control_state,
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: manage_heat_source_process_manage_heat_source_Full_Api> (
    &mut self,
    api: &mut manage_heat_source_process_manage_heat_source_Application_Api<API>)
  {
    let control_basis = api.get_control_basis();
    let regulator_mode = api.get_regulator_mode();
    match regulator_mode {
      Isolette_Thermostat_Rust::ThermostatMode::INIT |
      Isolette_Thermostat_Rust::ThermostatMode::FAILED => {
        self.heat_control_state = Isolette_Thermostat_Rust::HeatCommand::Off;
      },
      Isolette_Thermostat_Rust::ThermostatMode::NORMAL => {
        if control_basis.range_available {
          if control_basis.current_value_dF < control_basis.lower_dF {
            self.heat_control_state = Isolette_Thermostat_Rust::HeatCommand::On;
          } else if control_basis.current_value_dF > control_basis.upper_dF {
            self.heat_control_state = Isolette_Thermostat_Rust::HeatCommand::Off;
          }
        }
      },
    }
    api.put_heat_control(self.heat_control_state);
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

// PLACEHOLDER MARKER GUMBO METHODS
