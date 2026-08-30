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
    self.previousStart = false;
    self.previousOff = false;
    self.previousReturn = false;
    let initial = Vehicle_Start_Readiness_Recovery_Supervisor::RequestFacts {
      offActive: false,
      freshReturn: false,
      freshStart: false,
      conflict: false,
      disposition: Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None,
    };
    api.put_request_to_authorization(initial);
    api.put_request_to_lifecycle(initial);
  }

  #[verus_spec(
    requires
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
    let levels = api.get_request_levels();
    let fresh_return = levels.returnLevel && !self.previousReturn;
    let fresh_start = levels.start && !self.previousStart;
    let conflict = (levels.off && fresh_return) ||
      (levels.off && fresh_start) || (fresh_return && fresh_start);
    let disposition = if levels.off {
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::OffDominant
    } else if fresh_return {
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::ReturnCandidate
    } else if fresh_start {
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate
    } else {
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None
    };
    let facts = Vehicle_Start_Readiness_Recovery_Supervisor::RequestFacts {
      offActive: levels.off,
      freshReturn: fresh_return,
      freshStart: fresh_start,
      conflict,
      disposition,
    };
    api.put_request_to_authorization(facts);
    api.put_request_to_lifecycle(facts);
    self.previousStart = levels.start;
    self.previousOff = levels.off;
    self.previousReturn = levels.returnLevel;
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
