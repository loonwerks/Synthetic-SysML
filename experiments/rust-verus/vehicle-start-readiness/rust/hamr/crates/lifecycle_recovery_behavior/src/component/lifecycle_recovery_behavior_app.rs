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
    self.lifecycleModeMemory = Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off;
    api.put_test_cycle_directive(Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None);
    api.put_applied_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor::AppliedLifecycleSnapshot {
      cycleDirective: Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::None,
      preModeSnapshot: Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Off,
      nextMode: Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
      reason: Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary,
    });
  }

  #[verus_spec(
    requires
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
    let request = api.get_request_facts();
    let brake = api.get_brake_facts();
    let health = api.get_health_qualification();
    let power = api.get_power_facts();
    let assessment = api.get_cycle_assessment();
    let authorization = api.get_authorization();
    let pre_mode = self.lifecycleModeMemory;
    let (health_ready, health_invalid) = match health {
      Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Ready => (true, false),
      Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::NotReady => (false, false),
      Vehicle_Start_Readiness_Recovery_Supervisor::HealthQualification::Invalid => (false, true),
    };
    let (assessment_failed_or_invalid, assessment_start_passed,
         assessment_recovery_passed, assessment_awaiting_recovery) = match assessment {
      Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Failed |
      Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::Invalid => (true, false, false, false),
      Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::StartPassed => (false, true, false, false),
      Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::RecoveryPassed => (false, false, true, false),
      Vehicle_Start_Readiness_Recovery_Supervisor::CycleAssessment::AwaitingRecovery => (false, false, false, true),
      _ => (false, false, false, false),
    };
    let authorization_begins_start = match authorization.decision {
      Vehicle_Start_Readiness_Recovery_Supervisor::StartDecision::BeginStartTest => true,
      _ => false,
    };
    let qualifications_ready = brake.evidenceTrusted && brake.readyForAdmission &&
      health_ready && power.evidenceTrusted && power.availableForSupervision;
    let invalid_qualification = !brake.evidenceTrusted ||
      health_invalid ||
      !power.evidenceTrusted;

    let (next_mode, directive, reason) = match pre_mode {
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off => {
        if authorization_begins_start {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        }
      },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting => {
        if request.offActive {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if !qualifications_ready {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           if invalid_qualification {
             Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::QualificationInvalid
           } else { Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::QualificationNotReady })
        } else if assessment_failed_or_invalid {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if assessment_start_passed {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        }
      },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On => {
        if request.offActive {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if !health_ready ||
                  !power.evidenceTrusted || !power.availableForSupervision ||
                  !assessment_start_passed {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        }
      },
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded => {
        if request.offActive {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if !qualifications_ready {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if request.freshReturn {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary)
        } else if assessment_recovery_passed {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear,
           Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryCompleted)
        } else {
          (Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded,
           Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None,
           if assessment_awaiting_recovery {
             Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::RecoveryAwaiting
           } else { Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleReason::Ordinary })
        }
      },
    };
    let pre_snapshot = match pre_mode {
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Off => Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Off,
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Starting => Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Starting,
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::On => Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::On,
      Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleMode::Degraded => Vehicle_Start_Readiness_Recovery_Supervisor::LifecyclePreMode::Degraded,
    };
    let directive_snapshot = match directive {
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::None => Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::None,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginStart => Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginStart,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::BeginRecovery => Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::BeginRecovery,
      Vehicle_Start_Readiness_Recovery_Supervisor::TestCycleDirective::Clear => Vehicle_Start_Readiness_Recovery_Supervisor::LifecycleDirectiveSnapshot::Clear,
    };
    self.lifecycleModeMemory = next_mode;
    api.put_test_cycle_directive(directive);
    api.put_applied_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor::AppliedLifecycleSnapshot {
      cycleDirective: directive_snapshot,
      preModeSnapshot: pre_snapshot,
      nextMode: next_mode,
      reason,
    });
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
