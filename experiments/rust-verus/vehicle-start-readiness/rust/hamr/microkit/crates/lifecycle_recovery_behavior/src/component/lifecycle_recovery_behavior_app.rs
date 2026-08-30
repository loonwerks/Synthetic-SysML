// This file will not be overwritten if HAMR codegen is rerun

use data::*;
use crate::bridge::lifecycle_recovery_behavior_api::*;
use vstd::prelude::*;

#[verus_verify]
pub struct lifecycle_recovery_behavior {
  // BEGIN MARKER STATE VARS
  pub lifecycleModeMemory: Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode,
  // END MARKER STATE VARS
}

#[verus_verify]
impl lifecycle_recovery_behavior {
  pub fn new() -> Self
  {
    Self {
      // BEGIN MARKER STATE VAR INIT
      lifecycleModeMemory: Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::default(),
      // END MARKER STATE VAR INIT
    }
  }

  #[verus_spec(
    ensures
      // BEGIN MARKER INITIALIZATION ENSURES
      // guarantee INITIAL_LIFECYCLE_SAFE
      (((((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
        (api.applied_lifecycle.preModeSnapshot == Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Off)) &&
        (api.applied_lifecycle.nextMode == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off)) &&
        (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)) &&
        (api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::None),
      // END MARKER INITIALIZATION ENSURES
  )]
  pub fn initialize<API: lifecycle_recovery_behavior_Put_Api> (
    &mut self,
    api: &mut lifecycle_recovery_behavior_Application_Api<API>)
  {
    log_info("initialize entrypoint invoked");
  }

  #[verus_spec(
    requires
      // PLACEHOLDER MARKER TIME TRIGGERED REQUIRES
    ensures
      // BEGIN MARKER TIME TRIGGERED ENSURES
      // guarantee APPLIED_LIFECYCLE_COHERENCE
      ((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (api.applied_lifecycle.preModeSnapshot == Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Off)) ||
        ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
          (api.applied_lifecycle.preModeSnapshot == Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Starting))) ||
        ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
          (api.applied_lifecycle.preModeSnapshot == Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::On))) ||
        ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
          (api.applied_lifecycle.preModeSnapshot == Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Degraded))) &&
        (api.applied_lifecycle.nextMode == self.lifecycleModeMemory)) &&
        (((((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None) &&
          (api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::None)) ||
          ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart) &&
            (api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginStart))) ||
          ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery) &&
            (api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery))) ||
          ((api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear) &&
            (api.applied_lifecycle.cycleDirective == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::Clear))),
      // case CASE_06_ADMIT_START
      ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (old(api).authorization.decision == Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::BeginStartTest)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_07_REMAIN_OFF
      ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
        (old(api).authorization.decision != Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::BeginStartTest)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_08_STARTING_OFF
      ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        old(api).request_facts.offActive) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_09_STARTING_QUALIFICATION_LOSS
      (((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        (old(api).request_facts.offActive == false)) &&
        (((((old(api).brake_facts.evidenceTrusted == false) ||
          (old(api).brake_facts.readyForAdmission == false)) ||
          (old(api).health_qualification != Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) ||
          (old(api).power_facts.evidenceTrusted == false)) ||
          (old(api).power_facts.availableForSupervision == false))) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (((((api.brake_facts.evidenceTrusted == false) ||
             (api.health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid)) ||
             (api.power_facts.evidenceTrusted == false)) &&
             (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::QualificationInvalid)) ||
             (((api.brake_facts.evidenceTrusted &&
               (api.health_qualification != Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid)) &&
               api.power_facts.evidenceTrusted) &&
               (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::QualificationNotReady)))),
      // case CASE_10_START_TEST_FAILURE
      ((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        ((old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed) ||
          (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid))) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_11_STARTING_WAIT
      ((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        ((((old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Idle) ||
          (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingStart)) ||
          (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery)) ||
          (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed))) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_12_START_PASS
      ((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_13_ON_OFF
      ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
        old(api).request_facts.offActive) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_14_OPERATING_PROTECTION
      (((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
        (old(api).request_facts.offActive == false)) &&
        ((((old(api).health_qualification != Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready) ||
          (old(api).power_facts.evidenceTrusted == false)) ||
          (old(api).power_facts.availableForSupervision == false)) ||
          (old(api).cycle_assessment != Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed))) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_15_RETAIN_ON
      ((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
        (old(api).request_facts.offActive == false)) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_16_DEGRADED_OFF
      ((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        old(api).request_facts.offActive) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_17_RECOVERY_PREREQUISITE_LOSS
      (((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        (old(api).request_facts.offActive == false)) &&
        (((((old(api).brake_facts.evidenceTrusted == false) ||
          (old(api).brake_facts.readyForAdmission == false)) ||
          (old(api).health_qualification != Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) ||
          (old(api).power_facts.evidenceTrusted == false)) ||
          (old(api).power_facts.availableForSupervision == false))) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_18_BEGIN_RECOVERY
      ((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        old(api).request_facts.freshReturn) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)),
      // case CASE_19_RECOVERY_COMPLETE
      (((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        (old(api).request_facts.freshReturn == false)) &&
        (old(api).cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear)) &&
           (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted)),
      // case CASE_20_RECOVERY_WAIT
      (((((((((old(self).lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
        (old(api).request_facts.offActive == false)) &&
        old(api).brake_facts.evidenceTrusted) &&
        old(api).brake_facts.readyForAdmission) &&
        (old(api).health_qualification == Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready)) &&
        old(api).power_facts.evidenceTrusted) &&
        old(api).power_facts.availableForSupervision) &&
        (old(api).request_facts.freshReturn == false)) &&
        (old(api).cycle_assessment != Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed)) ==>
        (((self.lifecycleModeMemory == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded) &&
           (api.test_cycle_directive == Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None)) &&
           (((api.cycle_assessment == Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery) &&
             (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryAwaiting)) ||
             ((api.cycle_assessment != Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery) &&
               (api.applied_lifecycle.reason == Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)))),
      // END MARKER TIME TRIGGERED ENSURES
  )]
  pub fn timeTriggered<API: lifecycle_recovery_behavior_Full_Api> (
    &mut self,
    api: &mut lifecycle_recovery_behavior_Application_Api<API>)
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
