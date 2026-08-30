// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::apGuidanceGenerator_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct apGuidanceGenerator_behavior {
}

#[verus_verify]
impl apGuidanceGenerator_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.apGuidance == (FlightStack::ApGuidanceAndValidity {
        rollGuidance: 0,
        pitchGuidance: 0,
        guidanceValid: false,
      }),
      FlightStack_Spec::CASE_APG_01_spec(
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.apGuidance),
      FlightStack_Spec::CASE_APG_02_spec(
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.apGuidance),
  )]
  pub fn initialize<API: apGuidanceGenerator_behavior_Put_Api> (
    &mut self,
    api: &mut apGuidanceGenerator_behavior_Application_Api<API>)
  {
    api.put_apGuidance(FlightStack::ApGuidanceAndValidity {
      rollGuidance: 0,
      pitchGuidance: 0,
      guidanceValid: false,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_APG_01_spec(
        old(api).qualifiedAttitude, old(api).referenceAndFdState,
        api.apGuidance),
      FlightStack_Spec::CASE_APG_02_spec(
        old(api).qualifiedAttitude, old(api).referenceAndFdState,
        api.apGuidance),
  )]
  pub fn timeTriggered<API: apGuidanceGenerator_behavior_Full_Api> (
    &mut self,
    api: &mut apGuidanceGenerator_behavior_Application_Api<API>)
  {
    let attitude = api.get_qualifiedAttitude();
    let reference = api.get_referenceAndFdState();
    let safe = match attitude.classification {
      FlightStack::AttitudeClass::Safe => true,
      _ => false,
    };
    let displayed = match reference.fdState {
      FlightStack::FdStateValue::Displayed => true,
      _ => false,
    };
    let available = reference.referenceValid && safe && displayed;
    let guidance = if available {
      FlightStack::ApGuidanceAndValidity {
        rollGuidance: reference.referenceRoll,
        pitchGuidance: reference.referencePitch,
        guidanceValid: true,
      }
    } else {
      FlightStack::ApGuidanceAndValidity {
        rollGuidance: 0,
        pitchGuidance: 0,
        guidanceValid: false,
      }
    };
    api.put_apGuidance(guidance);
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
