// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::referenceManager_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct referenceManager_behavior {
  pub referenceRoll: i32,
  pub referencePitch: i32,
  pub referenceValid: bool,
  pub fdState: FlightStack::FdStateValue,
}

#[verus_verify]
impl referenceManager_behavior {
  pub fn new() -> Self
  {
    Self {
      referenceRoll: 0,
      referencePitch: 0,
      referenceValid: false,
      fdState: FlightStack::FdStateValue::Cleared,
    }
  }

  #[verus_spec(
    ensures
      self.referenceRoll == 0,
      self.referencePitch == 0,
      !self.referenceValid,
      self.fdState == FlightStack::FdStateValue::Cleared,
      api.referenceAndFdState == (FlightStack::ReferenceAndFdState {
        referenceRoll: 0,
        referencePitch: 0,
        referenceValid: false,
        fdState: FlightStack::FdStateValue::Cleared,
      }),
      FlightStack_Spec::CASE_REF_01_spec(
        true,
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.referenceAndFdState),
      FlightStack_Spec::CASE_REF_02_spec(
        true,
        FlightStack::QualifiedFdAndSyncDisposition {
          fdAction: FlightStack::FdAction::None,
          syncRequested: false, commandConflict: false,
        },
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        }, FlightStack::ApGuidanceRequestValue::Invalid, false,
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        },
        api.referenceAndFdState),
      FlightStack_Spec::CASE_REF_03_spec(
        true,
        FlightStack::QualifiedFdAndSyncDisposition {
          fdAction: FlightStack::FdAction::None,
          syncRequested: false, commandConflict: false,
        },
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        }, FlightStack::ApGuidanceRequestValue::Invalid, false,
        FlightStack::ReferenceAndFdState {
          referenceRoll: 0, referencePitch: 0,
          referenceValid: false,
          fdState: FlightStack::FdStateValue::Cleared,
        }, api.referenceAndFdState),
  )]
  pub fn initialize<API: referenceManager_behavior_Put_Api> (
    &mut self,
    api: &mut referenceManager_behavior_Application_Api<API>)
  {
    self.referenceRoll = 0;
    self.referencePitch = 0;
    self.referenceValid = false;
    self.fdState = FlightStack::FdStateValue::Cleared;
    api.put_referenceAndFdState(FlightStack::ReferenceAndFdState {
      referenceRoll: 0,
      referencePitch: 0,
      referenceValid: false,
      fdState: FlightStack::FdStateValue::Cleared,
    });
  }

  #[verus_spec(
    ensures
      api.referenceAndFdState == (FlightStack::ReferenceAndFdState {
        referenceRoll: self.referenceRoll,
        referencePitch: self.referencePitch,
        referenceValid: self.referenceValid,
        fdState: self.fdState,
      }),
      FlightStack_Spec::CASE_REF_01_spec(
        false, old(api).qualifiedAttitude,
        FlightStack::ReferenceAndFdState {
          referenceRoll: old(self).referenceRoll,
          referencePitch: old(self).referencePitch,
          referenceValid: old(self).referenceValid,
          fdState: old(self).fdState,
        }, api.referenceAndFdState),
      FlightStack_Spec::CASE_REF_02_spec(
        false,
        old(api).fdDisposition, old(api).qualifiedAttitude,
        old(api).apGuidanceRequest, old(api).apActiveClearInhibit,
        FlightStack::ReferenceAndFdState {
          referenceRoll: old(self).referenceRoll,
          referencePitch: old(self).referencePitch,
          referenceValid: old(self).referenceValid,
          fdState: old(self).fdState,
        }, api.referenceAndFdState),
      FlightStack_Spec::CASE_REF_03_spec(
        false,
        old(api).fdDisposition, old(api).qualifiedAttitude,
        old(api).apGuidanceRequest, old(api).apActiveClearInhibit,
        FlightStack::ReferenceAndFdState {
          referenceRoll: old(self).referenceRoll,
          referencePitch: old(self).referencePitch,
          referenceValid: old(self).referenceValid,
          fdState: old(self).fdState,
        }, api.referenceAndFdState),
  )]
  pub fn timeTriggered<API: referenceManager_behavior_Full_Api> (
    &mut self,
    api: &mut referenceManager_behavior_Application_Api<API>)
  {
    let fd = api.get_fdDisposition();
    let attitude = api.get_qualifiedAttitude();
    let request = api.get_apGuidanceRequest();
    let clear_inhibit = api.get_apActiveClearInhibit();

    let prior_roll = self.referenceRoll;
    let prior_pitch = self.referencePitch;
    let prior_valid = self.referenceValid;
    let prior_fd_state = self.fdState;
    let safe = match attitude.classification {
      FlightStack::AttitudeClass::Safe => true,
      _ => false,
    };
    let invalid = match attitude.classification {
      FlightStack::AttitudeClass::Invalid => true,
      _ => false,
    };
    let display = match fd.fdAction {
      FlightStack::FdAction::Display => true,
      _ => false,
    };
    let clear = match fd.fdAction {
      FlightStack::FdAction::Clear => true,
      _ => false,
    };
    let requested = match request {
      FlightStack::ApGuidanceRequestValue::Requested => true,
      _ => false,
    };
    let synchronize = !fd.commandConflict && safe &&
      (fd.syncRequested || display || requested);

    let next = if invalid {
      FlightStack::ReferenceAndFdState {
        referenceRoll: prior_roll,
        referencePitch: prior_pitch,
        referenceValid: false,
        fdState: FlightStack::FdStateValue::Cleared,
      }
    } else if synchronize {
      FlightStack::ReferenceAndFdState {
        referenceRoll: attitude.rollTenthDeg,
        referencePitch: attitude.pitchTenthDeg,
        referenceValid: true,
        fdState: if display {
          FlightStack::FdStateValue::Displayed
        } else if clear && !clear_inhibit {
          FlightStack::FdStateValue::Cleared
        } else {
          prior_fd_state
        },
      }
    } else {
      FlightStack::ReferenceAndFdState {
        referenceRoll: prior_roll,
        referencePitch: prior_pitch,
        referenceValid: prior_valid,
        fdState: if fd.commandConflict || (clear && !clear_inhibit) {
          FlightStack::FdStateValue::Cleared
        } else {
          prior_fd_state
        },
      }
    };
    self.referenceRoll = next.referenceRoll;
    self.referencePitch = next.referencePitch;
    self.referenceValid = next.referenceValid;
    self.fdState = next.fdState;
    api.put_referenceAndFdState(next);
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
