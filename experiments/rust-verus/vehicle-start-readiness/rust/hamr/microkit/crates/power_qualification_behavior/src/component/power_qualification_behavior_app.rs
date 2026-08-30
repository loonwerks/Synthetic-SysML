// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::power_qualification_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct power_qualification_behavior {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl power_qualification_behavior {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_POWER_FACTS_SAFE
      (((api.power_to_authorization.evidenceTrusted == false) &&
        (api.power_to_authorization.availableForSupervision == false)) &&
        (api.power_to_lifecycle.evidenceTrusted == false)) &&
        (api.power_to_lifecycle.availableForSupervision == false),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: power_qualification_behavior_Put_Api> (
    &mut self,
    api: &mut power_qualification_behavior_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee POWER_FACT_DERIVATION
      ((((((api.power_observation == Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Available) &&
        api.power_to_authorization.evidenceTrusted) &&
        api.power_to_authorization.availableForSupervision) ||
        (((api.power_observation == Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Unavailable) &&
          api.power_to_authorization.evidenceTrusted) &&
          (api.power_to_authorization.availableForSupervision == false))) ||
        (((api.power_observation == Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Invalid) &&
          (api.power_to_authorization.evidenceTrusted == false)) &&
          (api.power_to_authorization.availableForSupervision == false))) &&
        (api.power_to_lifecycle.evidenceTrusted == api.power_to_authorization.evidenceTrusted)) &&
        (api.power_to_lifecycle.availableForSupervision == api.power_to_authorization.availableForSupervision),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: power_qualification_behavior_Full_Api> (
    &mut self,
    api: &mut power_qualification_behavior_Application_Api<API>)
  {
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
