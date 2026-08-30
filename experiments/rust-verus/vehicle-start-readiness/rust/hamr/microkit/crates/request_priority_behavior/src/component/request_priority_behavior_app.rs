// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::request_priority_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct request_priority_behavior {
  // BEGIN MARKER STATE VARS
  pub previousStart: bool,
  pub previousOff: bool,
  pub previousReturn: bool,
  // END MARKER STATE VARS
}

#[verus_verify]
impl request_priority_behavior {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      previousStart: false,
      previousOff: false,
      previousReturn: false,
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_REQUEST_HISTORY
      ((((((((((((self.previousStart == false) &&
        (self.previousOff == false)) &&
        (self.previousReturn == false)) &&
        (api.request_to_authorization.offActive == false)) &&
        (api.request_to_authorization.freshReturn == false)) &&
        (api.request_to_authorization.freshStart == false)) &&
        (api.request_to_authorization.conflict == false)) &&
        (api.request_to_authorization.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None)) &&
        (api.request_to_lifecycle.offActive == false)) &&
        (api.request_to_lifecycle.freshReturn == false)) &&
        (api.request_to_lifecycle.freshStart == false)) &&
        (api.request_to_lifecycle.conflict == false)) &&
        (api.request_to_lifecycle.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: request_priority_behavior_Put_Api> (
    &mut self,
    api: &mut request_priority_behavior_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee REQUEST_PRIORITY_DERIVATION
      ((((((((((((api.request_to_authorization.offActive == api.request_levels.off) &&
        (api.request_to_authorization.freshReturn == (api.request_levels.returnLevel && !(old(self).previousReturn)))) &&
        (api.request_to_authorization.freshStart == (api.request_levels.start && !(old(self).previousStart)))) &&
        (api.request_to_authorization.conflict == (((api.request_to_authorization.offActive && api.request_to_authorization.freshReturn) ||
          (api.request_to_authorization.offActive && api.request_to_authorization.freshStart)) ||
          (api.request_to_authorization.freshReturn && api.request_to_authorization.freshStart)))) &&
        ((((api.request_to_authorization.offActive &&
          (api.request_to_authorization.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::OffDominant)) ||
          ((!(api.request_to_authorization.offActive) && api.request_to_authorization.freshReturn) &&
            (api.request_to_authorization.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::ReturnCandidate))) ||
          (((!(api.request_to_authorization.offActive) && !(api.request_to_authorization.freshReturn)) &&
            api.request_to_authorization.freshStart) &&
            (api.request_to_authorization.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate))) ||
          (((!(api.request_to_authorization.offActive) && !(api.request_to_authorization.freshReturn)) &&
            !(api.request_to_authorization.freshStart)) &&
            (api.request_to_authorization.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None)))) &&
        (api.request_to_lifecycle.offActive == api.request_to_authorization.offActive)) &&
        (api.request_to_lifecycle.freshReturn == api.request_to_authorization.freshReturn)) &&
        (api.request_to_lifecycle.freshStart == api.request_to_authorization.freshStart)) &&
        (api.request_to_lifecycle.conflict == api.request_to_authorization.conflict)) &&
        (api.request_to_lifecycle.disposition == api.request_to_authorization.disposition)) &&
        (self.previousStart == api.request_levels.start)) &&
        (self.previousOff == api.request_levels.off)) &&
        (self.previousReturn == api.request_levels.returnLevel),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: request_priority_behavior_Full_Api> (
    &mut self,
    api: &mut request_priority_behavior_Application_Api<API>)
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
