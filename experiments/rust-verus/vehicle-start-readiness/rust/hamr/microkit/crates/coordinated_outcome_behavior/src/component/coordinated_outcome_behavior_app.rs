// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::coordinated_outcome_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct coordinated_outcome_behavior {
  // PLACEHOLDER MARKER STATE VARS
}

#[verus_verify]
impl coordinated_outcome_behavior {
  pub fn new() -> Self
  {
    Self {
      // PLACEHOLDER MARKER STATE VAR INIT
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
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
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
    log_info("compute entrypoint invoked");
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

// PLACEHOLDER MARKER GUMBO METHODS
