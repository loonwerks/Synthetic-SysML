// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::Flight_Guidance_System_Function_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct Flight_Guidance_System_Function_behavior {
  pub reference_roll_tenth_degree: i32,
  pub reference_pitch_tenth_degree: i32,
  pub reference_valid: bool,
  pub fd_displayed: bool,
}

#[verus_verify]
impl Flight_Guidance_System_Function_behavior {
  pub fn new() -> Self
  {
    Self {
      reference_roll_tenth_degree: 0,
      reference_pitch_tenth_degree: 0,
      reference_valid: false,
      fd_displayed: false,
    }
  }

  #[verus_spec(
    ensures
      self.reference_roll_tenth_degree == 0,
      self.reference_pitch_tenth_degree == 0,
      !self.reference_valid,
      !self.fd_displayed,
      api.AP_Guidance.rollGuidanceTenthDegree == 0,
      api.AP_Guidance.pitchGuidanceTenthDegree == 0,
      !api.AP_Guidance.guidanceValid,
      api.FD_Guidance.rollGuidanceTenthDegree == 0,
      api.FD_Guidance.pitchGuidanceTenthDegree == 0,
      !api.FD_Guidance.fdOn,
      api.FCS_Failed,
  )]
  pub fn initialize<API: Flight_Guidance_System_Function_behavior_Put_Api> (
    &mut self,
    api: &mut Flight_Guidance_System_Function_behavior_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
    self.reference_roll_tenth_degree = 0;
    self.reference_pitch_tenth_degree = 0;
    self.reference_valid = false;
    self.fd_displayed = false;

    api.put_AP_Guidance(FAA_Flight_Guidance_System::AP_Guidance_Data {
      rollGuidanceTenthDegree: 0,
      pitchGuidanceTenthDegree: 0,
      guidanceValid: false,
    });
    api.put_FD_Guidance(FAA_Flight_Guidance_System::FD_Guidance_Data {
      rollGuidanceTenthDegree: 0,
      pitchGuidanceTenthDegree: 0,
      fdOn: false,
    });
    api.put_FCS_Failed(true);
  }

  #[verus_spec(
    ensures
      (!api.Aircraft_Attitude.rollStatus || !api.Aircraft_Attitude.pitchStatus) ==>
        (!self.reference_valid && !self.fd_displayed),
      (api.Aircraft_Attitude.rollStatus && api.Aircraft_Attitude.pitchStatus &&
       ((api.Display_FD.displayFdStatus && api.Display_FD.displayFd) ||
        (api.Sync_FD.syncFdStatus && api.Sync_FD.syncFd) ||
        (api.AP_Guidance_Request.apGuidanceRequestStatus &&
         api.AP_Guidance_Request.apGuidanceRequest))) ==>
        (self.reference_roll_tenth_degree == api.Aircraft_Attitude.rollTenthDegree &&
         self.reference_pitch_tenth_degree == api.Aircraft_Attitude.pitchTenthDegree &&
         self.reference_valid),
      api.FCS_Failed ==
        !(self.reference_valid && api.Aircraft_Attitude.rollStatus &&
          api.Aircraft_Attitude.pitchStatus),
      api.FD_Guidance.fdOn ==
        (self.reference_valid && api.Aircraft_Attitude.rollStatus &&
         api.Aircraft_Attitude.pitchStatus && self.fd_displayed),
      api.AP_Guidance.guidanceValid ==
        (self.reference_valid && api.Aircraft_Attitude.rollStatus &&
         api.Aircraft_Attitude.pitchStatus &&
         api.AP_Guidance_Request.apGuidanceRequestStatus &&
         api.AP_Guidance_Request.apGuidanceRequest),
      !api.FD_Guidance.fdOn ==>
        (api.FD_Guidance.rollGuidanceTenthDegree == 0 &&
         api.FD_Guidance.pitchGuidanceTenthDegree == 0),
      !api.AP_Guidance.guidanceValid ==>
        (api.AP_Guidance.rollGuidanceTenthDegree == 0 &&
         api.AP_Guidance.pitchGuidanceTenthDegree == 0),
      -450 <= api.AP_Guidance.rollGuidanceTenthDegree <= 450,
      -450 <= api.AP_Guidance.pitchGuidanceTenthDegree <= 450,
      -450 <= api.FD_Guidance.rollGuidanceTenthDegree <= 450,
      -450 <= api.FD_Guidance.pitchGuidanceTenthDegree <= 450,
      api.FCS_Failed ==> !api.FD_Guidance.fdOn,
      api.AP_Guidance.guidanceValid ==> !api.FCS_Failed,
      api.FD_Guidance.fdOn ==> !api.FCS_Failed,
  )]
  pub fn timeTriggered<API: Flight_Guidance_System_Function_behavior_Full_Api> (
    &mut self,
    api: &mut Flight_Guidance_System_Function_behavior_Application_Api<API>)
  {
    log_info("compute entrypoint invoked");

    let display_fd = api.get_Display_FD();
    let sync_fd = api.get_Sync_FD();
    let aircraft_attitude = api.get_Aircraft_Attitude();
    let ap_guidance_request = api.get_AP_Guidance_Request();

    let attitude_valid = aircraft_attitude.rollStatus && aircraft_attitude.pitchStatus;
    if !attitude_valid {
      self.reference_valid = false;
      self.fd_displayed = false;
    } else {
      let synchronize_reference =
        (display_fd.displayFdStatus && display_fd.displayFd) ||
        (sync_fd.syncFdStatus && sync_fd.syncFd) ||
        (ap_guidance_request.apGuidanceRequestStatus &&
          ap_guidance_request.apGuidanceRequest);

      if synchronize_reference {
        self.reference_roll_tenth_degree = aircraft_attitude.rollTenthDegree;
        self.reference_pitch_tenth_degree = aircraft_attitude.pitchTenthDegree;
        self.reference_valid = true;
      }

      if display_fd.displayFdStatus {
        self.fd_displayed = display_fd.displayFd;
      }
    }

    let guidance_usable = self.reference_valid && attitude_valid;
    let fd_on = guidance_usable && self.fd_displayed;
    let ap_valid = guidance_usable &&
      ap_guidance_request.apGuidanceRequestStatus &&
      ap_guidance_request.apGuidanceRequest;

    let fd_roll = if fd_on {
      clamp_guidance_difference(
        self.reference_roll_tenth_degree,
        aircraft_attitude.rollTenthDegree)
    } else { 0 };
    let fd_pitch = if fd_on {
      clamp_guidance_difference(
        self.reference_pitch_tenth_degree,
        aircraft_attitude.pitchTenthDegree)
    } else { 0 };
    let ap_roll = if ap_valid {
      clamp_guidance(self.reference_roll_tenth_degree)
    } else { 0 };
    let ap_pitch = if ap_valid {
      clamp_guidance(self.reference_pitch_tenth_degree)
    } else { 0 };

    api.put_AP_Guidance(FAA_Flight_Guidance_System::AP_Guidance_Data {
      rollGuidanceTenthDegree: ap_roll,
      pitchGuidanceTenthDegree: ap_pitch,
      guidanceValid: ap_valid,
    });
    api.put_FD_Guidance(FAA_Flight_Guidance_System::FD_Guidance_Data {
      rollGuidanceTenthDegree: fd_roll,
      pitchGuidanceTenthDegree: fd_pitch,
      fdOn: fd_on,
    });
    api.put_FCS_Failed(!guidance_usable);
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

#[verus_verify]
#[verus_spec(result =>
  ensures
    -450 <= result <= 450,
)]
fn clamp_guidance(value: i32) -> i32
{
  if value < -450 { -450 }
  else if value > 450 { 450 }
  else { value }
}

#[verus_verify]
#[verus_spec(result =>
  ensures
    -450 <= result <= 450,
)]
fn clamp_guidance_difference(reference: i32, attitude: i32) -> i32
{
  let difference: i64 = reference as i64 - attitude as i64;
  if difference < -450 { -450 }
  else if difference > 450 { 450 }
  else { difference as i32 }
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
