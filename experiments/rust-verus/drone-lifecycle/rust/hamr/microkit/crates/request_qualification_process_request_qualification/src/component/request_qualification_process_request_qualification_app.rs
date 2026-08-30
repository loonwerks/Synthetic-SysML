// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::request_qualification_process_request_qualification_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct request_qualification_process_request_qualification {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl request_qualification_process_request_qualification {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_REQUEST_INVALID
      //   Request qualification starts in an explicitly untrusted state
      api.qualified_request == Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request,
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: request_qualification_process_request_qualification_Put_Api> (
    &mut self,
    api: &mut request_qualification_process_request_qualification_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
    api.put_qualified_request(Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request);
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee REQUEST_QUALIFICATION_TOTAL
      //   Both request fields determine the validity-aware qualified request
      api.qualified_request == qualify_request(api.request_sample),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: request_qualification_process_request_qualification_Full_Api> (
    &mut self,
    api: &mut request_qualification_process_request_qualification_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let sample = api.get_request_sample();
    let qualified_request = match sample.status {
      Drone_Lifecycle_Governor::Input_Status::Invalid =>
        Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request,
      Drone_Lifecycle_Governor::Input_Status::Valid => match sample.request {
        Drone_Lifecycle_Governor::Lifecycle_Request::No_Request =>
          Drone_Lifecycle_Governor::Qualified_Request::No_Request,
        Drone_Lifecycle_Governor::Lifecycle_Request::Switch_On =>
          Drone_Lifecycle_Governor::Qualified_Request::Switch_On,
        Drone_Lifecycle_Governor::Lifecycle_Request::Switch_Off =>
          Drone_Lifecycle_Governor::Qualified_Request::Switch_Off,
        Drone_Lifecycle_Governor::Lifecycle_Request::Begin_Charge =>
          Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge,
        Drone_Lifecycle_Governor::Lifecycle_Request::End_Charge =>
          Drone_Lifecycle_Governor::Qualified_Request::End_Charge,
        Drone_Lifecycle_Governor::Lifecycle_Request::Activate =>
          Drone_Lifecycle_Governor::Qualified_Request::Activate,
        Drone_Lifecycle_Governor::Lifecycle_Request::Begin_Flight =>
          Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight,
        Drone_Lifecycle_Governor::Lifecycle_Request::End_Flight =>
          Drone_Lifecycle_Governor::Qualified_Request::End_Flight,
      },
    };

    api.put_qualified_request(qualified_request);
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
  pub open spec fn qualify_request(value: Drone_Lifecycle_Governor::Lifecycle_Request_Sample) -> Drone_Lifecycle_Governor::Qualified_Request
  {
    if (value.status == Drone_Lifecycle_Governor::Input_Status::Invalid) {
      Drone_Lifecycle_Governor::Qualified_Request::Invalid_Request
    } else {
      if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::No_Request) {
        Drone_Lifecycle_Governor::Qualified_Request::No_Request
      } else {
        if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::Switch_On) {
          Drone_Lifecycle_Governor::Qualified_Request::Switch_On
        } else {
          if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::Switch_Off) {
            Drone_Lifecycle_Governor::Qualified_Request::Switch_Off
          } else {
            if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::Begin_Charge) {
              Drone_Lifecycle_Governor::Qualified_Request::Begin_Charge
            } else {
              if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::End_Charge) {
                Drone_Lifecycle_Governor::Qualified_Request::End_Charge
              } else {
                if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::Activate) {
                  Drone_Lifecycle_Governor::Qualified_Request::Activate
                } else {
                  if (value.request == Drone_Lifecycle_Governor::Lifecycle_Request::Begin_Flight) {
                    Drone_Lifecycle_Governor::Qualified_Request::Begin_Flight
                  } else {
                    Drone_Lifecycle_Governor::Qualified_Request::End_Flight
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  // END MARKER GUMBO METHODS

}
