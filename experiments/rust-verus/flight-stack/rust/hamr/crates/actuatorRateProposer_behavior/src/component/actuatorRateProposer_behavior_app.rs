// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::actuatorRateProposer_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct actuatorRateProposer_behavior {
}

#[verus_verify]
impl actuatorRateProposer_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.proposedRates == (FlightStack::ProposedActuatorRates {
        rollRate: 0,
        pitchRate: 0,
        proposalValid: false,
      }),
      FlightStack_Spec::CASE_PROP_01_spec(
        FlightStack::ApGuidanceAndValidity {
          rollGuidance: 0, pitchGuidance: 0, guidanceValid: false,
        },
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        }, api.proposedRates),
  )]
  pub fn initialize<API: actuatorRateProposer_behavior_Put_Api> (
    &mut self,
    api: &mut actuatorRateProposer_behavior_Application_Api<API>)
  {
    api.put_proposedRates(FlightStack::ProposedActuatorRates {
      rollRate: 0,
      pitchRate: 0,
      proposalValid: false,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_PROP_01_spec(
        old(api).apGuidance, old(api).qualifiedAttitude,
        api.proposedRates),
  )]
  pub fn timeTriggered<API: actuatorRateProposer_behavior_Full_Api> (
    &mut self,
    api: &mut actuatorRateProposer_behavior_Application_Api<API>)
  {
    let guidance = api.get_apGuidance();
    let attitude = api.get_qualifiedAttitude();
    let safe = match attitude.classification {
      FlightStack::AttitudeClass::Safe => true,
      _ => false,
    };
    let usable = guidance.guidanceValid && safe;
    let proposal = if usable {
      let roll_error = guidance.rollGuidance as i64 - attitude.rollTenthDeg as i64;
      let pitch_error = guidance.pitchGuidance as i64 - attitude.pitchTenthDeg as i64;
      FlightStack::ProposedActuatorRates {
        rollRate: if roll_error < -1 {
          -50
        } else if roll_error > 1 {
          50
        } else {
          0
        },
        pitchRate: if pitch_error < -1 {
          -50
        } else if pitch_error > 1 {
          50
        } else {
          0
        },
        proposalValid: true,
      }
    } else {
      FlightStack::ProposedActuatorRates {
        rollRate: 0,
        pitchRate: 0,
        proposalValid: false,
      }
    };
    api.put_proposedRates(proposal);
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
