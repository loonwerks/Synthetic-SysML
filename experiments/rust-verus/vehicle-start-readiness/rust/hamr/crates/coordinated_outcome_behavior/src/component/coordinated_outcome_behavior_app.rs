// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::coordinated_outcome_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct coordinated_outcome_behavior {
}

#[verus_verify]
impl coordinated_outcome_behavior {
  pub fn new() -> Self
  {
    Self {
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_CONTROL_FRAME_SAFE
      (((((api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit) &&
        (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply)) &&
        (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate)) &&
        (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None)) &&
        (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Off)) &&
        (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Idle),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: coordinated_outcome_behavior_Put_Api> (
    &mut self,
    api: &mut coordinated_outcome_behavior_Application_Api<API>)
  {
    api.put_control_frame(Vehicle_Start_Readiness_Recovery_Supervisor::ControlFrame {
      startEnable: Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit,
      parkingBrake: Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply,
      powerDisposition: Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate,
      selfTestCommand: Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None,
      lifecycleMode: Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Off,
      status: Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Idle,
    });
  }

  #[verus_spec(
    requires
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee STARTING_AND_ON_FRAME_MAPPING
      (((((((((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        (api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit)) &&
        (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply)) &&
        (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::TestOnly)) &&
        (((api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginStart) &&
          (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::Initiate)) ||
          ((api.applied_lifecycle.cycleDirective != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginStart) &&
            (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None)))) &&
        (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Starting)) &&
        (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Testing)) ||
        (((((((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
          (api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Permit)) &&
          (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Release)) &&
          (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Enable)) &&
          (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None)) &&
          (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::On)) &&
          (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Operating))) ||
        (api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded)) ||
        (api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off),
      // guarantee DEGRADED_FRAME_MAPPING
      (((((((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        (api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit)) &&
        (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply)) &&
        (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate)) &&
        (((api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery) &&
          (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::Initiate)) ||
          ((api.applied_lifecycle.cycleDirective != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery) &&
            (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None)))) &&
        (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Degraded)) &&
        ((((api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery) ||
          (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryAwaiting)) &&
          (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RecoveryTesting)) ||
          (((api.applied_lifecycle.cycleDirective != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery) &&
            (api.applied_lifecycle.reason != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryAwaiting)) &&
            (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Degraded)))) ||
        (api.applied_lifecycle.nextMode != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded),
      // guarantee OFF_FRAME_MAPPING
      (((((((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit)) &&
        (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply)) &&
        (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate)) &&
        (api.control_frame.selfTestCommand == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None)) &&
        (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Off)) &&
        ((((((api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted) &&
          (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RecoveredAwaitFreshStart)) ||
          (((api.applied_lifecycle.reason != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted) &&
            (api.authorization.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid)) &&
            (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::StartBlockedInvalid))) ||
          ((((api.applied_lifecycle.reason != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted) &&
            (api.authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid)) &&
            (api.authorization.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady)) &&
            (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::StartBlockedNotReady))) ||
          (((((api.applied_lifecycle.reason != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted) &&
            (api.authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid)) &&
            (api.authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady)) &&
            api.authorization.conflict) &&
            (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RequestConflict))) ||
          (((((api.applied_lifecycle.reason != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted) &&
            (api.authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid)) &&
            (api.authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady)) &&
            (api.authorization.conflict == false)) &&
            (api.control_frame.status == Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Idle)))) ||
        (api.applied_lifecycle.nextMode != Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off),
      // guarantee CONTROL_FRAME_COHERENCE
      (((((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Off)) ||
        ((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
          (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Starting))) ||
        ((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
          (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::On))) ||
        ((api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
          (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Degraded))) &&
        (((((api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Permit) &&
          (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Release)) &&
          (api.control_frame.powerDisposition == Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Enable)) &&
          (api.control_frame.lifecycleMode == Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::On)) ||
          ((((api.control_frame.startEnable == Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit) &&
            (api.control_frame.parkingBrake == Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply)) &&
            (api.control_frame.powerDisposition != Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Enable)) &&
            (api.control_frame.lifecycleMode != Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::On))),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: coordinated_outcome_behavior_Full_Api> (
    &mut self,
    api: &mut coordinated_outcome_behavior_Application_Api<API>)
  {
    let authorization = api.get_authorization();
    let lifecycle = api.get_applied_lifecycle();
    let frame = match lifecycle.nextMode {
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting =>
        Vehicle_Start_Readiness_Recovery_Supervisor::ControlFrame {
          startEnable: Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit,
          parkingBrake: Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply,
          powerDisposition: Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::TestOnly,
          selfTestCommand: match lifecycle.cycleDirective {
            Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginStart => Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::Initiate,
            _ => Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None,
          },
          lifecycleMode: Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Starting,
          status: Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Testing,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On =>
        Vehicle_Start_Readiness_Recovery_Supervisor::ControlFrame {
          startEnable: Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Permit,
          parkingBrake: Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Release,
          powerDisposition: Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Enable,
          selfTestCommand: Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None,
          lifecycleMode: Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::On,
          status: Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Operating,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded =>
        Vehicle_Start_Readiness_Recovery_Supervisor::ControlFrame {
          startEnable: Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit,
          parkingBrake: Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply,
          powerDisposition: Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate,
          selfTestCommand: match lifecycle.cycleDirective {
            Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery => Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::Initiate,
            _ => Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None,
          },
          lifecycleMode: Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Degraded,
          status: match lifecycle.cycleDirective {
            Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery => Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RecoveryTesting,
            _ => match lifecycle.reason {
              Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryAwaiting => Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RecoveryTesting,
              _ => Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Degraded,
            },
          },
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off => {
        let status = match lifecycle.reason {
          Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted =>
            Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RecoveredAwaitFreshStart,
          _ => match authorization.decision {
            Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyInvalid =>
              Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::StartBlockedInvalid,
            Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::DenyNotReady =>
              Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::StartBlockedNotReady,
            _ => if authorization.conflict {
              Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::RequestConflict
            } else {
              Vehicle_Start_Readiness_Recovery_Supervisor::SupervisoryStatus::Idle
            },
          },
        };
        Vehicle_Start_Readiness_Recovery_Supervisor::ControlFrame {
          startEnable: Vehicle_Start_Readiness_Recovery_Supervisor::StartEnable::Inhibit,
          parkingBrake: Vehicle_Start_Readiness_Recovery_Supervisor::ParkingBrakeCommand::Apply,
          powerDisposition: Vehicle_Start_Readiness_Recovery_Supervisor::PowerDisposition::Isolate,
          selfTestCommand: Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestCommand::None,
          lifecycleMode: Vehicle_Start_Readiness_Recovery_Supervisor::ControlLifecycleMode::Off,
          status,
        }
      },
    };
    api.put_control_frame(frame);
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
