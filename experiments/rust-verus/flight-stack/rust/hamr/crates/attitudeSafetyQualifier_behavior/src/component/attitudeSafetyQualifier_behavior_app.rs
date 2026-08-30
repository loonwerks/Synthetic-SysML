// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::attitudeSafetyQualifier_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct attitudeSafetyQualifier_behavior {
}

#[verus_verify]
impl attitudeSafetyQualifier_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.qualifiedAttitude == (FlightStack::QualifiedAttitude {
        classification: FlightStack::AttitudeClass::Invalid,
        rollTenthDeg: 0,
        pitchTenthDeg: 0,
      }),
      FlightStack_Spec::CASE_ATT_01_spec(
        FlightStack::AircraftAttitude {
          rollTenthDeg: 0, rollStatus: false,
          pitchTenthDeg: 0, pitchStatus: false,
        }, api.qualifiedAttitude),
      FlightStack_Spec::CASE_ATT_02_spec(
        FlightStack::AircraftAttitude {
          rollTenthDeg: 0, rollStatus: false,
          pitchTenthDeg: 0, pitchStatus: false,
        }, api.qualifiedAttitude),
  )]
  pub fn initialize<API: attitudeSafetyQualifier_behavior_Put_Api> (
    &mut self,
    api: &mut attitudeSafetyQualifier_behavior_Application_Api<API>)
  {
    api.put_qualifiedAttitude(FlightStack::QualifiedAttitude {
      classification: FlightStack::AttitudeClass::Invalid,
      rollTenthDeg: 0,
      pitchTenthDeg: 0,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_ATT_01_spec(
        old(api).aircraftAttitude, api.qualifiedAttitude),
      FlightStack_Spec::CASE_ATT_02_spec(
        old(api).aircraftAttitude, api.qualifiedAttitude),
  )]
  pub fn timeTriggered<API: attitudeSafetyQualifier_behavior_Full_Api> (
    &mut self,
    api: &mut attitudeSafetyQualifier_behavior_Application_Api<API>)
  {
    let raw = api.get_aircraftAttitude();
    let qualified = if !raw.rollStatus || !raw.pitchStatus {
      FlightStack::QualifiedAttitude {
        classification: FlightStack::AttitudeClass::Invalid,
        rollTenthDeg: 0,
        pitchTenthDeg: 0,
      }
    } else if -450 <= raw.rollTenthDeg && raw.rollTenthDeg <= 450 &&
      -450 <= raw.pitchTenthDeg && raw.pitchTenthDeg <= 450 {
      FlightStack::QualifiedAttitude {
        classification: FlightStack::AttitudeClass::Safe,
        rollTenthDeg: raw.rollTenthDeg,
        pitchTenthDeg: raw.pitchTenthDeg,
      }
    } else {
      FlightStack::QualifiedAttitude {
        classification: FlightStack::AttitudeClass::Unsafe,
        rollTenthDeg: raw.rollTenthDeg,
        pitchTenthDeg: raw.pitchTenthDeg,
      }
    };
    api.put_qualifiedAttitude(qualified);
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
