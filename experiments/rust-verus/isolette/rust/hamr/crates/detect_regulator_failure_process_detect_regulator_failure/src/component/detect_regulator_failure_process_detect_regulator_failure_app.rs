// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::detect_regulator_failure_process_detect_regulator_failure_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct detect_regulator_failure_process_detect_regulator_failure {
  // BEGIN MARKER STATE VARS
  pub regulator_internal_failure_latched: bool,
  // END MARKER STATE VARS
}

#[verus_verify]
impl detect_regulator_failure_process_detect_regulator_failure {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      regulator_internal_failure_latched: false,
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee initialize_regulator_failure_latch
      (self.regulator_internal_failure_latched == false) &&
        (api.diagnostic_facts.internal_failure_latched == false),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: detect_regulator_failure_process_detect_regulator_failure_Put_Api> (
    &mut self,
    api: &mut detect_regulator_failure_process_detect_regulator_failure_Application_Api<API>)
  {
    self.regulator_internal_failure_latched = false;
    api.put_diagnostic_facts(Isolette_Thermostat_Rust::RegulatorDiagnosticFacts {
      power_epoch_changed: false,
      init_timeout_expired: false,
      internal_failure_latched: false,
    });
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee CASE_04_regulator_epoch_reset
      api.supervision.power_epoch_changed ==>
        ((self.regulator_internal_failure_latched == false) &&
          (api.diagnostic_facts.internal_failure_latched == false)),
      // guarantee CASE_05_regulator_failure_latch
      !(api.supervision.power_epoch_changed) ==>
        ((self.regulator_internal_failure_latched == (old(self).regulator_internal_failure_latched || api.supervision.internal_failure_detected)) &&
          (api.diagnostic_facts.internal_failure_latched == self.regulator_internal_failure_latched)),
      // guarantee preserve_regulator_supervision_classification
      (api.diagnostic_facts.power_epoch_changed == api.supervision.power_epoch_changed) &&
        (api.diagnostic_facts.init_timeout_expired == api.supervision.init_timeout_expired),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: detect_regulator_failure_process_detect_regulator_failure_Full_Api> (
    &mut self,
    api: &mut detect_regulator_failure_process_detect_regulator_failure_Application_Api<API>)
  {
    let supervision = api.get_supervision();
    if supervision.power_epoch_changed {
      self.regulator_internal_failure_latched = false;
    } else {
      self.regulator_internal_failure_latched =
        self.regulator_internal_failure_latched || supervision.internal_failure_detected;
    }
    api.put_diagnostic_facts(Isolette_Thermostat_Rust::RegulatorDiagnosticFacts {
      power_epoch_changed: supervision.power_epoch_changed,
      init_timeout_expired: supervision.init_timeout_expired,
      internal_failure_latched: self.regulator_internal_failure_latched,
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

// PLACEHOLDER MARKER GUMBO METHODS
