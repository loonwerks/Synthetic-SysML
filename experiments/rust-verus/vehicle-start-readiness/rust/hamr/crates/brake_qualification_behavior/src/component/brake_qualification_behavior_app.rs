// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::brake_qualification_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct brake_qualification_behavior {
}

#[verus_verify]
impl brake_qualification_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_BRAKE_FACTS_SAFE
      (((api.brake_to_authorization.evidenceTrusted == false) &&
        (api.brake_to_authorization.readyForAdmission == false)) &&
        (api.brake_to_lifecycle.evidenceTrusted == false)) &&
        (api.brake_to_lifecycle.readyForAdmission == false),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: brake_qualification_behavior_Put_Api> (
    &mut self,
    api: &mut brake_qualification_behavior_Application_Api<API>)
  {
    let safe = Vehicle_Start_Readiness_Recovery_Supervisor::BrakeFacts {
      evidenceTrusted: false,
      readyForAdmission: false,
    };
    api.put_brake_to_authorization(safe);
    api.put_brake_to_lifecycle(safe);
  }

  #[verus_spec(
    requires
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee BRAKE_FACT_DERIVATION
      ((((((api.brake_observation == Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Pressed) &&
        api.brake_to_authorization.evidenceTrusted) &&
        api.brake_to_authorization.readyForAdmission) ||
        (((api.brake_observation == Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Released) &&
          api.brake_to_authorization.evidenceTrusted) &&
          (api.brake_to_authorization.readyForAdmission == false))) ||
        (((api.brake_observation == Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Invalid) &&
          (api.brake_to_authorization.evidenceTrusted == false)) &&
          (api.brake_to_authorization.readyForAdmission == false))) &&
        (api.brake_to_lifecycle.evidenceTrusted == api.brake_to_authorization.evidenceTrusted)) &&
        (api.brake_to_lifecycle.readyForAdmission == api.brake_to_authorization.readyForAdmission),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: brake_qualification_behavior_Full_Api> (
    &mut self,
    api: &mut brake_qualification_behavior_Application_Api<API>)
  {
    let observation = api.get_brake_observation();
    let facts = match observation {
      Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Pressed =>
        Vehicle_Start_Readiness_Recovery_Supervisor::BrakeFacts {
          evidenceTrusted: true, readyForAdmission: true,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Released =>
        Vehicle_Start_Readiness_Recovery_Supervisor::BrakeFacts {
          evidenceTrusted: true, readyForAdmission: false,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::BrakeObservation::Invalid =>
        Vehicle_Start_Readiness_Recovery_Supervisor::BrakeFacts {
          evidenceTrusted: false, readyForAdmission: false,
        },
    };
    api.put_brake_to_authorization(facts);
    api.put_brake_to_lifecycle(facts);
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
