// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::start_authorization_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct start_authorization_behavior {
}

#[verus_verify]
impl start_authorization_behavior {
  pub fn new() -> Self
  {
    Self {
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
    let safe = Vehicle_Start_Readiness_Recovery_Supervisor::StartAuthorizationFacts {
      decision: Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::NoStart,
      conflict: false,
    };
    api.put_authorization_to_lifecycle(safe);
    api.put_authorization_to_outcome(safe);
  }

  #[verus_spec(
    requires
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
    let request = api.get_request_facts();
    let brake = api.get_brake_facts();
    let health = api.get_health_qualification();
    let power = api.get_power_facts();
    let decision = match request.disposition {
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::OffDominant =>
        Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::OffPriority,
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::ReturnCandidate |
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::None =>
        Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::NoStart,
      Vehicle_Start_Readiness_Recovery_Supervisor::RequestDisposition::StartCandidate => {
        match health {
          Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid =>
            Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid,
          Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::NotReady => {
            if !brake.evidenceTrusted || !power.evidenceTrusted {
              Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid
            } else {
              Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady
            }
          },
          Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready => {
            if !brake.evidenceTrusted || !power.evidenceTrusted {
              Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid
            } else if !brake.readyForAdmission || !power.availableForSupervision {
              Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady
            } else {
              Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::BeginStartTest
            }
          },
        }
      },
    };
    let result = Vehicle_Start_Readiness_Recovery_Supervisor::StartAuthorizationFacts {
      decision,
      conflict: request.conflict,
    };
    api.put_authorization_to_lifecycle(result);
    api.put_authorization_to_outcome(result);
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
