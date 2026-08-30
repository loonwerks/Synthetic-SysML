// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::fdGuidanceHealthGenerator_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct fdGuidanceHealthGenerator_behavior {
}

#[verus_verify]
impl fdGuidanceHealthGenerator_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.pairedFdGuidance == (FlightStack::PairedFdGuidance {
        leftRollGuidance: 0, leftPitchGuidance: 0, leftFdOn: false,
        rightRollGuidance: 0, rightPitchGuidance: 0, rightFdOn: false,
      }),
      api.pairedFcsIndications == (FlightStack::PairedFcsIndications {
        leftFcsFailed: true, rightFcsFailed: true,
        leftUnsafeAttitude: false, rightUnsafeAttitude: false,
      }),
      FlightStack_Spec::CASE_FD_01_spec(
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.pairedFdGuidance, api.pairedFcsIndications),
      FlightStack_Spec::CASE_FD_02_spec(
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.pairedFdGuidance, api.pairedFcsIndications),
  )]
  pub fn initialize<API: fdGuidanceHealthGenerator_behavior_Put_Api> (
    &mut self,
    api: &mut fdGuidanceHealthGenerator_behavior_Application_Api<API>)
  {
    api.put_pairedFdGuidance(FlightStack::PairedFdGuidance {
      leftRollGuidance: 0,
      leftPitchGuidance: 0,
      leftFdOn: false,
      rightRollGuidance: 0,
      rightPitchGuidance: 0,
      rightFdOn: false,
    });
    api.put_pairedFcsIndications(FlightStack::PairedFcsIndications {
      leftFcsFailed: true,
      rightFcsFailed: true,
      leftUnsafeAttitude: false,
      rightUnsafeAttitude: false,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_FD_01_spec(
        old(api).qualifiedAttitude, old(api).referenceAndFdState,
        api.pairedFdGuidance, api.pairedFcsIndications),
      FlightStack_Spec::CASE_FD_02_spec(
        old(api).qualifiedAttitude, old(api).referenceAndFdState,
        api.pairedFdGuidance, api.pairedFcsIndications),
  )]
  pub fn timeTriggered<API: fdGuidanceHealthGenerator_behavior_Full_Api> (
    &mut self,
    api: &mut fdGuidanceHealthGenerator_behavior_Application_Api<API>)
  {
    let attitude = api.get_qualifiedAttitude();
    let reference = api.get_referenceAndFdState();
    let safe = match attitude.classification {
      FlightStack::AttitudeClass::Safe => true,
      _ => false,
    };
    let invalid = match attitude.classification {
      FlightStack::AttitudeClass::Invalid => true,
      _ => false,
    };
    let unsafe_attitude = match attitude.classification {
      FlightStack::AttitudeClass::Unsafe => true,
      _ => false,
    };
    let usable = reference.referenceValid && safe;
    if usable {
      let roll_error = reference.referenceRoll as i64 - attitude.rollTenthDeg as i64;
      let pitch_error = reference.referencePitch as i64 - attitude.pitchTenthDeg as i64;
      let roll_guidance = if roll_error < -450 {
        -450
      } else if roll_error > 450 {
        450
      } else {
        roll_error as i32
      };
      let pitch_guidance = if pitch_error < -450 {
        -450
      } else if pitch_error > 450 {
        450
      } else {
        pitch_error as i32
      };
      let fd_on = match reference.fdState {
        FlightStack::FdStateValue::Displayed => true,
        _ => false,
      };
      api.put_pairedFdGuidance(FlightStack::PairedFdGuidance {
        leftRollGuidance: roll_guidance,
        leftPitchGuidance: pitch_guidance,
        leftFdOn: fd_on,
        rightRollGuidance: roll_guidance,
        rightPitchGuidance: pitch_guidance,
        rightFdOn: fd_on,
      });
      api.put_pairedFcsIndications(FlightStack::PairedFcsIndications {
        leftFcsFailed: false,
        rightFcsFailed: false,
        leftUnsafeAttitude: false,
        rightUnsafeAttitude: false,
      });
    } else {
      let failed = !reference.referenceValid || invalid;
      api.put_pairedFdGuidance(FlightStack::PairedFdGuidance {
        leftRollGuidance: 0,
        leftPitchGuidance: 0,
        leftFdOn: false,
        rightRollGuidance: 0,
        rightPitchGuidance: 0,
        rightFdOn: false,
      });
      api.put_pairedFcsIndications(FlightStack::PairedFcsIndications {
        leftFcsFailed: failed,
        rightFcsFailed: failed,
        leftUnsafeAttitude: unsafe_attitude,
        rightUnsafeAttitude: unsafe_attitude,
      });
    }
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
