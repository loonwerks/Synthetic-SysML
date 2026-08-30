// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::actuatorSafetyGate_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct actuatorSafetyGate_behavior {
}

#[verus_verify]
impl actuatorSafetyGate_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.actuatorCommand == (FlightStack::ActuatorCommand {
        rollRateTenthDegPerSec: 0,
        pitchRateTenthDegPerSec: 0,
        apOn: false,
      }),
      FlightStack_Spec::CASE_GATE_01_spec(
        false,
        FlightStack::ProposedActuatorRates {
          rollRate: 0, pitchRate: 0, proposalValid: false,
        }, api.actuatorCommand),
      FlightStack_Spec::CASE_GATE_02_spec(
        false,
        FlightStack::ProposedActuatorRates {
          rollRate: 0, pitchRate: 0, proposalValid: false,
        }, api.actuatorCommand),
  )]
  pub fn initialize<API: actuatorSafetyGate_behavior_Put_Api> (
    &mut self,
    api: &mut actuatorSafetyGate_behavior_Application_Api<API>)
  {
    api.put_actuatorCommand(FlightStack::ActuatorCommand {
      rollRateTenthDegPerSec: 0,
      pitchRateTenthDegPerSec: 0,
      apOn: false,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_GATE_01_spec(
        old(api).actuationAuthority, old(api).proposedRates,
        api.actuatorCommand),
      FlightStack_Spec::CASE_GATE_02_spec(
        old(api).actuationAuthority, old(api).proposedRates,
        api.actuatorCommand),
  )]
  pub fn timeTriggered<API: actuatorSafetyGate_behavior_Full_Api> (
    &mut self,
    api: &mut actuatorSafetyGate_behavior_Application_Api<API>)
  {
    let authority = api.get_actuationAuthority();
    let proposal = api.get_proposedRates();
    let command = if authority && proposal.proposalValid {
      FlightStack::ActuatorCommand {
        rollRateTenthDegPerSec: proposal.rollRate,
        pitchRateTenthDegPerSec: proposal.pitchRate,
        apOn: true,
      }
    } else {
      FlightStack::ActuatorCommand {
        rollRateTenthDegPerSec: 0,
        pitchRateTenthDegPerSec: 0,
        apOn: false,
      }
    };
    api.put_actuatorCommand(command);
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
