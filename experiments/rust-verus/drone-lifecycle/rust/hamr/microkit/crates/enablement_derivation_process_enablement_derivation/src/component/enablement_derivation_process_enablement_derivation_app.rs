// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::enablement_derivation_process_enablement_derivation_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct enablement_derivation_process_enablement_derivation {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl enablement_derivation_process_enablement_derivation {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_ENABLEMENT_DISABLED
      //   Enablement starts with all logical permissions disabled
      ((api.lifecycle_enablement.power == Drone_Lifecycle_Governor::Power_Permission::Disabled) &&
        (api.lifecycle_enablement.charging_permitted == false)) &&
        (api.lifecycle_enablement.flight_permitted == false),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: enablement_derivation_process_enablement_derivation_Put_Api> (
    &mut self,
    api: &mut enablement_derivation_process_enablement_derivation_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
    api.put_lifecycle_enablement(Drone_Lifecycle_Governor::Lifecycle_Enablement {
      power: Drone_Lifecycle_Governor::Power_Permission::Disabled,
      charging_permitted: false,
      flight_permitted: false,
    });
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee ENABLEMENT_TOTAL
      //   The selected phase determines three independently meaningful permission fields
      ((api.lifecycle_enablement.power == power_for(api.selected_phase)) &&
        (api.lifecycle_enablement.charging_permitted == charging_for(api.selected_phase))) &&
        (api.lifecycle_enablement.flight_permitted == flight_for(api.selected_phase)),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: enablement_derivation_process_enablement_derivation_Full_Api> (
    &mut self,
    api: &mut enablement_derivation_process_enablement_derivation_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let phase = api.get_selected_phase();
    let enablement = match phase {
      Drone_Lifecycle_Governor::Lifecycle_Phase::Off =>
        Drone_Lifecycle_Governor::Lifecycle_Enablement {
          power: Drone_Lifecycle_Governor::Power_Permission::Disabled,
          charging_permitted: false,
          flight_permitted: false,
        },
      Drone_Lifecycle_Governor::Lifecycle_Phase::Standby =>
        Drone_Lifecycle_Governor::Lifecycle_Enablement {
          power: Drone_Lifecycle_Governor::Power_Permission::Standby_Enabled,
          charging_permitted: false,
          flight_permitted: false,
        },
      Drone_Lifecycle_Governor::Lifecycle_Phase::Charging =>
        Drone_Lifecycle_Governor::Lifecycle_Enablement {
          power: Drone_Lifecycle_Governor::Power_Permission::Operational_Enabled,
          charging_permitted: true,
          flight_permitted: false,
        },
      Drone_Lifecycle_Governor::Lifecycle_Phase::Ready =>
        Drone_Lifecycle_Governor::Lifecycle_Enablement {
          power: Drone_Lifecycle_Governor::Power_Permission::Operational_Enabled,
          charging_permitted: false,
          flight_permitted: false,
        },
      Drone_Lifecycle_Governor::Lifecycle_Phase::Flying =>
        Drone_Lifecycle_Governor::Lifecycle_Enablement {
          power: Drone_Lifecycle_Governor::Power_Permission::Operational_Enabled,
          charging_permitted: false,
          flight_permitted: true,
        },
    };

    api.put_lifecycle_enablement(enablement);
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
  pub open spec fn power_for(value: Drone_Lifecycle_Governor::Lifecycle_Phase) -> Drone_Lifecycle_Governor::Power_Permission
  {
    if (value == Drone_Lifecycle_Governor::Lifecycle_Phase::Off) {
      Drone_Lifecycle_Governor::Power_Permission::Disabled
    } else {
      if (value == Drone_Lifecycle_Governor::Lifecycle_Phase::Standby) {
        Drone_Lifecycle_Governor::Power_Permission::Standby_Enabled
      } else {
        Drone_Lifecycle_Governor::Power_Permission::Operational_Enabled
      }
    }
  }

  pub open spec fn charging_for(value: Drone_Lifecycle_Governor::Lifecycle_Phase) -> bool
  {
    value == Drone_Lifecycle_Governor::Lifecycle_Phase::Charging
  }

  pub open spec fn flight_for(value: Drone_Lifecycle_Governor::Lifecycle_Phase) -> bool
  {
    value == Drone_Lifecycle_Governor::Lifecycle_Phase::Flying
  }
  // END MARKER GUMBO METHODS

}
