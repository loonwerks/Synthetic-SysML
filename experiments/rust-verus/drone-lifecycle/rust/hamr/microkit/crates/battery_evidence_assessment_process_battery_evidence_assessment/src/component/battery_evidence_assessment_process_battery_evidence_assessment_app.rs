// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::battery_evidence_assessment_process_battery_evidence_assessment_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct battery_evidence_assessment_process_battery_evidence_assessment {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl battery_evidence_assessment_process_battery_evidence_assessment {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_BATTERY_INVALID
      //   Battery assessment starts in an explicitly untrusted state
      (api.battery_evidence_for_governor == Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery) &&
        (api.battery_evidence_for_notice == Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: battery_evidence_assessment_process_battery_evidence_assessment_Put_Api> (
    &mut self,
    api: &mut battery_evidence_assessment_process_battery_evidence_assessment_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
    api.put_battery_evidence_for_governor(Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery);
    api.put_battery_evidence_for_notice(Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery);
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee BATTERY_ASSESSMENT_TOTAL
      //   Both battery fields determine one assessment supplied to both distinct consumers
      (api.battery_evidence_for_governor == assess_battery(api.battery_sample)) &&
        (api.battery_evidence_for_notice == assess_battery(api.battery_sample)),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: battery_evidence_assessment_process_battery_evidence_assessment_Full_Api> (
    &mut self,
    api: &mut battery_evidence_assessment_process_battery_evidence_assessment_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let sample = api.get_battery_sample();
    let evidence = match (sample.status, sample.indication) {
      (Drone_Lifecycle_Governor::Input_Status::Invalid, _) =>
        Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery,
      (Drone_Lifecycle_Governor::Input_Status::Valid,
       Drone_Lifecycle_Governor::Battery_Indication::Adequate) =>
        Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery,
      (Drone_Lifecycle_Governor::Input_Status::Valid,
       Drone_Lifecycle_Governor::Battery_Indication::Low) =>
        Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery,
    };

    api.put_battery_evidence_for_governor(evidence);
    api.put_battery_evidence_for_notice(evidence);
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

verus! {

  // BEGIN MARKER GUMBO METHODS
  pub open spec fn assess_battery(value: Drone_Lifecycle_Governor::Battery_Sample) -> Drone_Lifecycle_Governor::Battery_Evidence
  {
    if (value.status == Drone_Lifecycle_Governor::Input_Status::Invalid) {
      Drone_Lifecycle_Governor::Battery_Evidence::Invalid_Battery
    } else {
      if (value.indication == Drone_Lifecycle_Governor::Battery_Indication::Adequate) {
        Drone_Lifecycle_Governor::Battery_Evidence::Adequate_Battery
      } else {
        Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery
      }
    }
  }
  // END MARKER GUMBO METHODS

}
