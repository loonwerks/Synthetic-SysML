// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::health_qualification_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct health_qualification_behavior {
}

#[verus_verify]
impl health_qualification_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_HEALTH_QUALIFICATION_SAFE
      (api.health_to_authorization == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid) &&
        (api.health_to_lifecycle == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: health_qualification_behavior_Put_Api> (
    &mut self,
    api: &mut health_qualification_behavior_Application_Api<API>)
  {
    api.put_health_to_authorization(Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid);
    api.put_health_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid);
  }

  #[verus_spec(
    requires
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee HEALTH_QUALIFICATION_DERIVATION
      (((((api.health_observation.thermal == Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::Invalid) ||
        (api.health_observation.maintenance == Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::Invalid)) &&
        (api.health_to_authorization == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid)) ||
        ((((api.health_observation.thermal != Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::Invalid) &&
          (api.health_observation.maintenance != Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::Invalid)) &&
          ((api.health_observation.thermal == Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::OverMaximum) ||
            (api.health_observation.maintenance == Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::Due))) &&
          (api.health_to_authorization == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::NotReady))) ||
        (((api.health_observation.thermal == Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::Normal) &&
          (api.health_observation.maintenance == Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::NotDue)) &&
          (api.health_to_authorization == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready))) &&
        (api.health_to_lifecycle == api.health_to_authorization),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: health_qualification_behavior_Full_Api> (
    &mut self,
    api: &mut health_qualification_behavior_Application_Api<API>)
  {
    let observation = api.get_health_observation();
    let qualification = match (observation.thermal, observation.maintenance) {
      (Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::Invalid, _) |
      (_, Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::Invalid) =>
        Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid,
      (Vehicle_Start_Readiness_Recovery_Supervisor::ThermalCondition::OverMaximum, _) |
      (_, Vehicle_Start_Readiness_Recovery_Supervisor::MaintenanceCondition::Due) =>
        Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::NotReady,
      _ => Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready,
    };
    api.put_health_to_authorization(qualification);
    api.put_health_to_lifecycle(qualification);
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
