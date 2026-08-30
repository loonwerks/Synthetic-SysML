// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::power_qualification_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct power_qualification_behavior {
}

#[verus_verify]
impl power_qualification_behavior {
  pub fn new() -> Self
  {
    Self {
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
    let safe = Vehicle_Start_Readiness_Recovery_Supervisor::PowerFacts {
      evidenceTrusted: false,
      availableForSupervision: false,
    };
    api.put_power_to_authorization(safe);
    api.put_power_to_lifecycle(safe);
  }

  #[verus_spec(
    requires
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
    let observation = api.get_power_observation();
    let facts = match observation {
      Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Available =>
        Vehicle_Start_Readiness_Recovery_Supervisor::PowerFacts {
          evidenceTrusted: true, availableForSupervision: true,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Unavailable =>
        Vehicle_Start_Readiness_Recovery_Supervisor::PowerFacts {
          evidenceTrusted: true, availableForSupervision: false,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::PowerObservation::Invalid =>
        Vehicle_Start_Readiness_Recovery_Supervisor::PowerFacts {
          evidenceTrusted: false, availableForSupervision: false,
        },
    };
    api.put_power_to_authorization(facts);
    api.put_power_to_lifecycle(facts);
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
