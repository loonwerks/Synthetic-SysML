// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::pilot_notice_derivation_process_pilot_notice_derivation_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct pilot_notice_derivation_process_pilot_notice_derivation {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl pilot_notice_derivation_process_pilot_notice_derivation {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_NOTICE_NONE
      //   Pilot notice initializes to None
      api.pilot_notice == Drone_Lifecycle_Governor::Pilot_Notice::None,
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: pilot_notice_derivation_process_pilot_notice_derivation_Put_Api> (
    &mut self,
    api: &mut pilot_notice_derivation_process_pilot_notice_derivation_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
    api.put_pilot_notice(Drone_Lifecycle_Governor::Pilot_Notice::None);
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee NOTICE_PRIORITY_TOTAL
      //   Disposition and battery evidence determine the ordered pilot notice
      api.pilot_notice == notice_for(api.decision_disposition, api.battery_evidence),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: pilot_notice_derivation_process_pilot_notice_derivation_Full_Api> (
    &mut self,
    api: &mut pilot_notice_derivation_process_pilot_notice_derivation_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let battery = api.get_battery_evidence();
    let disposition = api.get_decision_disposition();
    let notice = if disposition.input_fault_detected {
      Drone_Lifecycle_Governor::Pilot_Notice::Input_Fault
    } else if disposition.recovery_pending {
      Drone_Lifecycle_Governor::Pilot_Notice::Recovery_Awaiting_Neutral
    } else {
      match disposition.rejection_reason {
        Drone_Lifecycle_Governor::Rejection_Reason::Charger_Unavailable =>
          Drone_Lifecycle_Governor::Pilot_Notice::Charger_Unavailable,
        _ => match battery {
          Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery =>
            Drone_Lifecycle_Governor::Pilot_Notice::Low_Battery,
          _ => match disposition.rejection_reason {
            Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection =>
              Drone_Lifecycle_Governor::Pilot_Notice::None,
            _ => Drone_Lifecycle_Governor::Pilot_Notice::Request_Rejected,
          },
        },
      }
    };

    api.put_pilot_notice(notice);
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
  pub open spec fn notice_for(
    disposition: Drone_Lifecycle_Governor::Decision_Disposition,
    battery: Drone_Lifecycle_Governor::Battery_Evidence) -> Drone_Lifecycle_Governor::Pilot_Notice
  {
    if (disposition.input_fault_detected) {
      Drone_Lifecycle_Governor::Pilot_Notice::Input_Fault
    } else {
      if (disposition.recovery_pending) {
        Drone_Lifecycle_Governor::Pilot_Notice::Recovery_Awaiting_Neutral
      } else {
        if (disposition.rejection_reason == Drone_Lifecycle_Governor::Rejection_Reason::Charger_Unavailable) {
          Drone_Lifecycle_Governor::Pilot_Notice::Charger_Unavailable
        } else {
          if (battery == Drone_Lifecycle_Governor::Battery_Evidence::Low_Battery) {
            Drone_Lifecycle_Governor::Pilot_Notice::Low_Battery
          } else {
            if (disposition.rejection_reason != Drone_Lifecycle_Governor::Rejection_Reason::No_Rejection) {
              Drone_Lifecycle_Governor::Pilot_Notice::Request_Rejected
            } else {
              Drone_Lifecycle_Governor::Pilot_Notice::None
            }
          }
        }
      }
    }
  }
  // END MARKER GUMBO METHODS

}
