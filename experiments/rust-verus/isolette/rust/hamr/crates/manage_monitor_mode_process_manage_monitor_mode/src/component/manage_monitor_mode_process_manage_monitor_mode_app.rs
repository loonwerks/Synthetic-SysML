// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::manage_monitor_mode_process_manage_monitor_mode_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct manage_monitor_mode_process_manage_monitor_mode {
  // BEGIN MARKER STATE VARS
  pub monitor_mode_state: Isolette_Thermostat_Rust::ThermostatMode,
  // END MARKER STATE VARS
}

#[verus_verify]
impl manage_monitor_mode_process_manage_monitor_mode {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      monitor_mode_state: Isolette_Thermostat_Rust::ThermostatMode::default(),
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee initialize_monitor_mode
      ((self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT) &&
        (api.mode_for_interface == Isolette_Thermostat_Rust::ThermostatMode::INIT)) &&
        (api.mode_for_alarm == Isolette_Thermostat_Rust::ThermostatMode::INIT),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: manage_monitor_mode_process_manage_monitor_mode_Put_Api> (
    &mut self,
    api: &mut manage_monitor_mode_process_manage_monitor_mode_Application_Api<API>)
  {
    self.monitor_mode_state = Isolette_Thermostat_Rust::ThermostatMode::INIT;
    api.put_mode_for_interface(self.monitor_mode_state);
    api.put_mode_for_alarm(self.monitor_mode_state);
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_16_monitor_health_decision
      (((((!(api.diagnostic_facts.power_epoch_changed) && !(api.interface_facts.interface_failure)) &&
        !(api.diagnostic_facts.internal_failure_latched)) &&
        api.interface_facts.current_valid) &&
        (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT)) ==>
        (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::NORMAL)) &&
        (((((!(api.diagnostic_facts.power_epoch_changed) && !(api.interface_facts.interface_failure)) &&
          !(api.diagnostic_facts.internal_failure_latched)) &&
          api.interface_facts.current_valid) &&
          (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::NORMAL)) ==>
          (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::NORMAL)),
      // guarantee CASE_17_monitor_mode_transition
      ((((((api.diagnostic_facts.power_epoch_changed ==>
        (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT)) &&
        ((!(api.diagnostic_facts.power_epoch_changed) &&
          (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::FAILED)) ==>
          (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::FAILED))) &&
        ((((!(api.diagnostic_facts.power_epoch_changed) &&
          (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT)) &&
          ((api.interface_facts.interface_failure || api.diagnostic_facts.internal_failure_latched) ||
            !(api.interface_facts.current_valid))) &&
          api.diagnostic_facts.init_timeout_expired) ==>
          (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::FAILED))) &&
        ((((!(api.diagnostic_facts.power_epoch_changed) &&
          (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT)) &&
          ((api.interface_facts.interface_failure || api.diagnostic_facts.internal_failure_latched) ||
            !(api.interface_facts.current_valid))) &&
          !(api.diagnostic_facts.init_timeout_expired)) ==>
          (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::INIT))) &&
        (((!(api.diagnostic_facts.power_epoch_changed) &&
          (old(self).monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::NORMAL)) &&
          ((api.interface_facts.interface_failure || api.diagnostic_facts.internal_failure_latched) ||
            !(api.interface_facts.current_valid))) ==>
          (self.monitor_mode_state == Isolette_Thermostat_Rust::ThermostatMode::FAILED))) &&
        (api.mode_for_interface == self.monitor_mode_state)) &&
        (api.mode_for_alarm == self.monitor_mode_state),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: manage_monitor_mode_process_manage_monitor_mode_Full_Api> (
    &mut self,
    api: &mut manage_monitor_mode_process_manage_monitor_mode_Application_Api<API>)
  {
    let interface_facts = api.get_interface_facts();
    let diagnostic_facts = api.get_diagnostic_facts();
    let healthy = !interface_facts.interface_failure &&
      !diagnostic_facts.internal_failure_latched && interface_facts.current_valid;

    self.monitor_mode_state = if diagnostic_facts.power_epoch_changed {
      Isolette_Thermostat_Rust::ThermostatMode::INIT
    } else {
      match self.monitor_mode_state {
        Isolette_Thermostat_Rust::ThermostatMode::FAILED =>
          Isolette_Thermostat_Rust::ThermostatMode::FAILED,
        Isolette_Thermostat_Rust::ThermostatMode::INIT => {
          if healthy {
            Isolette_Thermostat_Rust::ThermostatMode::NORMAL
          } else if diagnostic_facts.init_timeout_expired {
            Isolette_Thermostat_Rust::ThermostatMode::FAILED
          } else {
            Isolette_Thermostat_Rust::ThermostatMode::INIT
          }
        },
        Isolette_Thermostat_Rust::ThermostatMode::NORMAL => {
          if healthy {
            Isolette_Thermostat_Rust::ThermostatMode::NORMAL
          } else {
            Isolette_Thermostat_Rust::ThermostatMode::FAILED
          }
        },
      }
    };
    api.put_mode_for_interface(self.monitor_mode_state);
    api.put_mode_for_alarm(self.monitor_mode_state);
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
