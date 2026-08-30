// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::self_test_cycle_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct self_test_cycle_behavior {
  // BEGIN MARKER STATE VARS
  pub committedTestCycle: Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle,
  // END MARKER STATE VARS
}

#[verus_verify]
impl self_test_cycle_behavior {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      committedTestCycle: Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::default(),
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_TEST_CYCLE
      (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle) &&
        (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: self_test_cycle_behavior_Put_Api> (
    &mut self,
    api: &mut self_test_cycle_behavior_Application_Api<API>)
  {
    self.committedTestCycle = Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle;
    api.put_cycle_assessment(Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle);
  }

  #[verus_spec(
    requires
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee PRE_UPDATE_CYCLE_ASSESSMENT
      (((((((((((((((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart) &&
        (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::NoEvent)) &&
        (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingStart)) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshPass)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshFail)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::NoEvent)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshPass)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshFail)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid))) ||
        ((((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::StartPassed) ||
          (old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::RecoveryPassed)) &&
          (api.self_test_observation == Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid))) ||
        ((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::StartPassed) &&
          (api.self_test_observation != Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed))) ||
        (((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::RecoveryPassed) &&
          (api.self_test_observation != Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid)) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed))) ||
        ((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Failed) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed))) ||
        ((old(self).committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Invalid) &&
          (api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid)),
      // guarantee INDEPENDENT_TEST_CYCLE_STORAGE
      ((((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear) &&
        (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle)) ||
        ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart) &&
          (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart))) ||
        ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery) &&
          (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery))) ||
        ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None) &&
          ((((((((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle) &&
            (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle)) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingStart) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart))) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery))) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::StartPassed))) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::RecoveryPassed))) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Failed))) ||
            ((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid) &&
              (self.committedTestCycle == Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Invalid)))),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: self_test_cycle_behavior_Full_Api> (
    &mut self,
    api: &mut self_test_cycle_behavior_Application_Api<API>)
  {
    let observation = api.get_self_test_observation();
    let directive = api.get_test_cycle_directive();
    let assessment = match self.committedTestCycle {
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart =>
        match observation {
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::NoEvent =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingStart,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshPass =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshFail =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery =>
        match observation {
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::NoEvent =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshPass =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::FreshFail =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed,
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid =>
            Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle,
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::StartPassed =>
        match observation {
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid => Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid,
          _ => Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::RecoveryPassed =>
        match observation {
          Vehicle_Start_Readiness_Recovery_Supervisor::SelfTestObservation::Invalid => Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid,
          _ => Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed,
        },
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Failed =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed,
      Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Invalid =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid,
    };
    self.committedTestCycle = match directive {
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery =>
        Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None => match assessment {
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Idle,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingStart => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingStart,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::AwaitingRecovery,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::StartPassed,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::RecoveryPassed,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Failed,
        Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid => Vehicle_Start_Readiness_Recovery_Supervisor::CommittedTestCycle::Invalid,
      },
    };
    api.put_cycle_assessment(assessment);
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
