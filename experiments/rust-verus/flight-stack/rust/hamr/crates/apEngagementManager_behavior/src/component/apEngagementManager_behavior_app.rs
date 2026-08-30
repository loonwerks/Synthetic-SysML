// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::apEngagementManager_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct apEngagementManager_behavior {
  pub apMode: FlightStack::ApModeValue,
}

#[verus_verify]
impl apEngagementManager_behavior {
  pub fn new() -> Self
  {
    Self {
      apMode: FlightStack::ApModeValue::Off,
    }
  }

  #[verus_spec(
    ensures
      self.apMode == FlightStack::ApModeValue::Off,
      api.pairedApStatus == (FlightStack::PairedApStatus {
        leftStatus: 1, rightStatus: 1,
      }),
      api.apGuidanceRequest == FlightStack::ApGuidanceRequestValue::Invalid,
      !api.apActiveClearInhibit,
      !api.actuationAuthority,
      FlightStack_Spec::CASE_AP_01_spec(
        true, FlightStack::ApModeValue::Off,
        FlightStack::QualifiedApDisposition {
          apAction: FlightStack::ApAction::None,
          cwsAction: FlightStack::CwsAction::None,
          commandConflict: false,
        },
        FlightStack::QualifiedAttitude {
          classification: FlightStack::AttitudeClass::Invalid,
          rollTenthDeg: 0, pitchTenthDeg: 0,
        },
        FlightStack::ApGuidanceAndValidity {
          rollGuidance: 0, pitchGuidance: 0, guidanceValid: false,
        }, self.apMode, api.pairedApStatus,
        api.apGuidanceRequest, api.apActiveClearInhibit,
        api.actuationAuthority),
  )]
  pub fn initialize<API: apEngagementManager_behavior_Put_Api> (
    &mut self,
    api: &mut apEngagementManager_behavior_Application_Api<API>)
  {
    self.apMode = FlightStack::ApModeValue::Off;
    api.put_pairedApStatus(FlightStack::PairedApStatus {
      leftStatus: 1,
      rightStatus: 1,
    });
    api.put_apGuidanceRequest(FlightStack::ApGuidanceRequestValue::Invalid);
    api.put_apActiveClearInhibit(false);
    api.put_actuationAuthority(false);
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_AP_01_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance,
        self.apMode, api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
      FlightStack_Spec::CASE_AP_02_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance,
        self.apMode, api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
      FlightStack_Spec::CASE_AP_03_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance, self.apMode,
        api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
      FlightStack_Spec::CASE_AP_04_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance,
        self.apMode, api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
      FlightStack_Spec::CASE_AP_05_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance,
        self.apMode, api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
      FlightStack_Spec::CASE_AP_06_spec(
        false, old(self).apMode, old(api).apDisposition,
        old(api).qualifiedAttitude, old(api).apGuidance,
        self.apMode, api.pairedApStatus, api.apGuidanceRequest,
        api.apActiveClearInhibit, api.actuationAuthority),
  )]
  pub fn timeTriggered<API: apEngagementManager_behavior_Full_Api> (
    &mut self,
    api: &mut apEngagementManager_behavior_Application_Api<API>)
  {
    let ap = api.get_apDisposition();
    let attitude = api.get_qualifiedAttitude();
    let guidance = api.get_apGuidance();
    let prior = self.apMode;
    let ap_force = match ap.apAction {
      FlightStack::ApAction::ForceDisengage => true,
      _ => false,
    };
    let cws_force = match ap.cwsAction {
      FlightStack::CwsAction::ForceDisengage => true,
      _ => false,
    };
    let explicit_disengage = match ap.apAction {
      FlightStack::ApAction::Disengage => true,
      _ => false,
    };
    let disengage_selected = explicit_disengage || ap.commandConflict;
    let engage = match ap.apAction {
      FlightStack::ApAction::Engage => true,
      _ => false,
    };
    let invalid = match attitude.classification {
      FlightStack::AttitudeClass::Invalid => true,
      _ => false,
    };
    let safe = match attitude.classification {
      FlightStack::AttitudeClass::Safe => true,
      _ => false,
    };
    let unsafe_attitude = match attitude.classification {
      FlightStack::AttitudeClass::Unsafe => true,
      _ => false,
    };
    let held = match ap.cwsAction {
      FlightStack::CwsAction::Hold => true,
      _ => false,
    };
    let released = match ap.cwsAction {
      FlightStack::CwsAction::Release => true,
      _ => false,
    };
    let force_fault = ap_force || cws_force || invalid;
    let safe_guidance_fault = safe && !guidance.guidanceValid;

    let next = match prior {
      FlightStack::ApModeValue::Failed => if disengage_selected && !cws_force && safe && guidance.guidanceValid {
        FlightStack::ApModeValue::Off
      } else {
        FlightStack::ApModeValue::Failed
      },
      FlightStack::ApModeValue::Off => if force_fault {
        FlightStack::ApModeValue::Failed
      } else if disengage_selected || unsafe_attitude {
        FlightStack::ApModeValue::Off
      } else if engage && safe && guidance.guidanceValid {
        FlightStack::ApModeValue::SyncPending
      } else {
        FlightStack::ApModeValue::Off
      },
      FlightStack::ApModeValue::SyncPending => if force_fault || safe_guidance_fault {
        FlightStack::ApModeValue::Failed
      } else if disengage_selected || unsafe_attitude {
        FlightStack::ApModeValue::Off
      } else if safe && guidance.guidanceValid {
        FlightStack::ApModeValue::On
      } else {
        FlightStack::ApModeValue::Off
      },
      FlightStack::ApModeValue::On => if force_fault || safe_guidance_fault {
        FlightStack::ApModeValue::Failed
      } else if disengage_selected || unsafe_attitude {
        FlightStack::ApModeValue::Off
      } else if held && safe && guidance.guidanceValid {
        FlightStack::ApModeValue::CWS
      } else {
        FlightStack::ApModeValue::On
      },
      FlightStack::ApModeValue::CWS => if force_fault || safe_guidance_fault {
        FlightStack::ApModeValue::Failed
      } else if disengage_selected {
        FlightStack::ApModeValue::Off
      } else if unsafe_attitude && held {
        FlightStack::ApModeValue::CwsSuspended
      } else if unsafe_attitude {
        FlightStack::ApModeValue::Off
      } else if safe && guidance.guidanceValid && released {
        FlightStack::ApModeValue::On
      } else if safe && guidance.guidanceValid {
        FlightStack::ApModeValue::CWS
      } else {
        FlightStack::ApModeValue::Off
      },
      FlightStack::ApModeValue::CwsSuspended => if force_fault || safe_guidance_fault {
        FlightStack::ApModeValue::Failed
      } else if disengage_selected || unsafe_attitude && !held {
        FlightStack::ApModeValue::Off
      } else if unsafe_attitude {
        FlightStack::ApModeValue::CwsSuspended
      } else if safe && guidance.guidanceValid && released {
        FlightStack::ApModeValue::Off
      } else {
        FlightStack::ApModeValue::CwsSuspended
      },
    };

    let status_code = match next {
      FlightStack::ApModeValue::Failed => 0,
      FlightStack::ApModeValue::On | FlightStack::ApModeValue::CWS => 2,
      _ => 1,
    };
    let request = match next {
      FlightStack::ApModeValue::SyncPending | FlightStack::ApModeValue::CWS =>
        FlightStack::ApGuidanceRequestValue::Requested,
      FlightStack::ApModeValue::CwsSuspended => if held {
        FlightStack::ApGuidanceRequestValue::Requested
      } else {
        FlightStack::ApGuidanceRequestValue::NotRequested
      },
      _ => FlightStack::ApGuidanceRequestValue::NotRequested,
    };
    let inhibit = match next {
      FlightStack::ApModeValue::SyncPending |
      FlightStack::ApModeValue::On |
      FlightStack::ApModeValue::CWS => true,
      _ => false,
    };
    let authority = match next {
      FlightStack::ApModeValue::On => true,
      _ => false,
    };

    self.apMode = next;
    api.put_pairedApStatus(FlightStack::PairedApStatus {
      leftStatus: status_code,
      rightStatus: status_code,
    });
    api.put_apGuidanceRequest(request);
    api.put_apActiveClearInhibit(inhibit);
    api.put_actuationAuthority(authority);
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
