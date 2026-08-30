// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::crewCommandQualifier_behavior_api::*;
use vstd::prelude::*;
use ::FlightStack as FlightStack_Spec;

#[verus_verify]
pub struct crewCommandQualifier_behavior {
}

#[verus_verify]
impl crewCommandQualifier_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      api.fdDisposition == (FlightStack::QualifiedFdAndSyncDisposition {
        fdAction: FlightStack::FdAction::None,
        syncRequested: false,
        commandConflict: false,
      }),
      api.apDisposition == (FlightStack::QualifiedApDisposition {
        apAction: FlightStack::ApAction::ForceDisengage,
        cwsAction: FlightStack::CwsAction::ForceDisengage,
        commandConflict: false,
      }),
      FlightStack_Spec::CASE_CMD_01_spec(
        FlightStack::CrewRequests {
          displayFdWanted: false, displayFdStatus: false,
          syncFd: false, syncFdStatus: false,
          engageApWanted: false, engageApStatus: false,
          cwsHeld: false, cwsStatus: false,
        }, api.fdDisposition, api.apDisposition),
      FlightStack_Spec::CASE_CMD_02_spec(
        FlightStack::CrewRequests {
          displayFdWanted: false, displayFdStatus: false,
          syncFd: false, syncFdStatus: false,
          engageApWanted: false, engageApStatus: false,
          cwsHeld: false, cwsStatus: false,
        }, api.fdDisposition, api.apDisposition),
  )]
  pub fn initialize<API: crewCommandQualifier_behavior_Put_Api> (
    &mut self,
    api: &mut crewCommandQualifier_behavior_Application_Api<API>)
  {
    api.put_fdDisposition(FlightStack::QualifiedFdAndSyncDisposition {
      fdAction: FlightStack::FdAction::None,
      syncRequested: false,
      commandConflict: false,
    });
    api.put_apDisposition(FlightStack::QualifiedApDisposition {
      apAction: FlightStack::ApAction::ForceDisengage,
      cwsAction: FlightStack::CwsAction::ForceDisengage,
      commandConflict: false,
    });
  }

  #[verus_spec(
    ensures
      FlightStack_Spec::CASE_CMD_01_spec(
        old(api).crewRequests, api.fdDisposition, api.apDisposition),
      FlightStack_Spec::CASE_CMD_02_spec(
        old(api).crewRequests, api.fdDisposition, api.apDisposition),
  )]
  pub fn timeTriggered<API: crewCommandQualifier_behavior_Full_Api> (
    &mut self,
    api: &mut crewCommandQualifier_behavior_Application_Api<API>)
  {
    let crew = api.get_crewRequests();
    let fd_action = if !crew.displayFdStatus {
      FlightStack::FdAction::None
    } else if crew.displayFdWanted {
      FlightStack::FdAction::Display
    } else {
      FlightStack::FdAction::Clear
    };
    let sync_requested = crew.syncFdStatus && crew.syncFd;
    let force_disengage = !crew.engageApStatus || !crew.cwsStatus;
    let ap_action = if force_disengage {
      FlightStack::ApAction::ForceDisengage
    } else if crew.engageApWanted {
      FlightStack::ApAction::Engage
    } else {
      FlightStack::ApAction::Disengage
    };
    let cws_action = if !crew.engageApStatus || !crew.cwsStatus {
      FlightStack::CwsAction::ForceDisengage
    } else if crew.cwsHeld {
      FlightStack::CwsAction::Hold
    } else {
      FlightStack::CwsAction::Release
    };
    let conflict = crew.engageApStatus && !crew.engageApWanted &&
      ((crew.cwsStatus && crew.cwsHeld) ||
       (crew.syncFdStatus && crew.syncFd) ||
       (crew.displayFdStatus && crew.displayFdWanted));
    let fd = FlightStack::QualifiedFdAndSyncDisposition {
      fdAction: fd_action,
      syncRequested: sync_requested,
      commandConflict: conflict,
    };
    let ap = FlightStack::QualifiedApDisposition {
      apAction: ap_action,
      cwsAction: cws_action,
      commandConflict: conflict,
    };
    api.put_fdDisposition(fd);
    api.put_apDisposition(ap);
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
