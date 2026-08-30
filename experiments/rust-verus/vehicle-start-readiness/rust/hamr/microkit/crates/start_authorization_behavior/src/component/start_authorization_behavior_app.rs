// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::start_authorization_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct start_authorization_behavior {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl start_authorization_behavior {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_START_AUTHORIZATION_SAFE
      (((api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::NoStart) &&
        (api.authorization_to_lifecycle.conflict == false)) &&
        (api.authorization_to_outcome.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::NoStart)) &&
        (api.authorization_to_outcome.conflict == false),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: start_authorization_behavior_Put_Api> (
    &mut self,
    api: &mut start_authorization_behavior_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee AUTHORIZATION_PUBLICATION_COHERENCE
      ((api.authorization_to_lifecycle.conflict == api.request_facts.conflict) &&
        (api.authorization_to_outcome.conflict == api.authorization_to_lifecycle.conflict)) &&
        (api.authorization_to_outcome.decision == api.authorization_to_lifecycle.decision),
      // case CASE_01_OFF_PRIORITY
      (old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::OffDominant) ==>
        (api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::OffPriority),
      // case CASE_02_NO_START_APPLICABILITY
      ((old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::ReturnCandidate) ||
        (old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None)) ==>
        (api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::NoStart),
      // case CASE_03_DENY_INVALID
      ((old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate) &&
        (((old(api).brake_facts.evidenceTrusted == false) ||
          (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid)) ||
          (old(api).power_facts.evidenceTrusted == false))) ==>
        (api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid),
      // case CASE_04_DENY_NOT_READY
      (((((old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).power_facts.evidenceTrusted) &&
        (old(api).health_qualification != Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid)) &&
        (((old(api).brake_facts.readyForAdmission == false) ||
          (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::NotReady)) ||
          (old(api).power_facts.availableForSupervision == false))) ==>
        (api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady),
      // case CASE_05_BEGIN_START_TEST
      ((((((old(api).request_facts.disposition == Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) ==>
        (api.authorization_to_lifecycle.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::BeginStartTest),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: start_authorization_behavior_Full_Api> (
    &mut self,
    api: &mut start_authorization_behavior_Application_Api<API>)
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
