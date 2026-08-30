// #Sireum

package scp_candidate.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object LifecycleRecoveryOwner_vehicle_supervisor_process_lifecycle_recovery_owner {

  // BEGIN STATE VARS
  var lifecycleModeMemory: Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Type = Vehicle_Start_Readiness_Recovery_Supervisor.LifecycleMode.Off
  // END STATE VARS

  def initialise(api: LifecycleRecoveryOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(lifecycleModeMemory, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee c29
        lifecycleModeMemory == LifecycleMode.Off &&
          api.test_cycle_directive == TestCycleDirective.None &&
          api.applied_lifecycle.preModeSnapshot == LifecyclePreMode.Off &&
          api.applied_lifecycle.nextMode == LifecycleMode.Off &&
          api.applied_lifecycle.reason == LifecycleReason.Ordinary &&
          api.applied_lifecycle.cycleDirective == LifecycleDirectiveSnapshot.None
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    lifecycleModeMemory = LifecycleMode.Off
    api.put_test_cycle_directive(TestCycleDirective.None)
    api.put_applied_lifecycle(AppliedLifecycleSnapshot(
      LifecycleDirectiveSnapshot.None, LifecyclePreMode.Off, LifecycleMode.Off, LifecycleReason.Ordinary))
  }

  def compute(api: LifecycleRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(lifecycleModeMemory, api))
    val request = api.get_request_facts().getOrElse(RequestFacts(F, F, F, F, RequestDisposition.None))
    val brake = api.get_brake_facts().getOrElse(BrakeFacts(F, F))
    val health = api.get_health_qualification().getOrElse(HealthQualification.Invalid)
    val power = api.get_power_facts().getOrElse(PowerFacts(F, F))
    val cycle = api.get_cycle_assessment().getOrElse(CycleAssessment.Invalid)
    val authorization = api.get_authorization().getOrElse(StartAuthorizationFacts(StartDecision.NoStart, F))
    var preMode: LifecyclePreMode.Type = LifecyclePreMode.Off
    if (lifecycleModeMemory == LifecycleMode.Starting) {
      preMode = LifecyclePreMode.Starting
    } else if (lifecycleModeMemory == LifecycleMode.On) {
      preMode = LifecyclePreMode.On
    } else if (lifecycleModeMemory == LifecycleMode.Degraded) {
      preMode = LifecyclePreMode.Degraded
    }
    val qualified = brake.evidenceTrusted && brake.readyForAdmission &&
      health == HealthQualification.Ready && power.evidenceTrusted && power.availableForSupervision
    var directive: TestCycleDirective.Type = TestCycleDirective.None
    var reason: LifecycleReason.Type = LifecycleReason.Ordinary
    if (lifecycleModeMemory == LifecycleMode.Off) {
      if (authorization.decision == StartDecision.BeginStartTest) {
        lifecycleModeMemory = LifecycleMode.Starting
        directive = TestCycleDirective.BeginStart
      }
    } else if (lifecycleModeMemory == LifecycleMode.Starting) {
      if (request.offActive) {
        lifecycleModeMemory = LifecycleMode.Off
        directive = TestCycleDirective.Clear
      } else if (!qualified) {
        lifecycleModeMemory = LifecycleMode.Degraded
        directive = TestCycleDirective.Clear
        if (!brake.evidenceTrusted || health == HealthQualification.Invalid || !power.evidenceTrusted) {
          reason = LifecycleReason.QualificationInvalid
        } else {
          reason = LifecycleReason.QualificationNotReady
        }
      } else if (cycle == CycleAssessment.StartPassed) {
        lifecycleModeMemory = LifecycleMode.On
      } else if (cycle == CycleAssessment.Failed || cycle == CycleAssessment.Invalid) {
        lifecycleModeMemory = LifecycleMode.Degraded
        directive = TestCycleDirective.Clear
      }
    } else if (lifecycleModeMemory == LifecycleMode.On) {
      if (request.offActive) {
        lifecycleModeMemory = LifecycleMode.Off
        directive = TestCycleDirective.Clear
      } else if (health != HealthQualification.Ready || !power.evidenceTrusted ||
                 !power.availableForSupervision || cycle != CycleAssessment.StartPassed) {
        lifecycleModeMemory = LifecycleMode.Degraded
        directive = TestCycleDirective.Clear
      }
    } else {
      if (request.offActive) {
        lifecycleModeMemory = LifecycleMode.Off
        directive = TestCycleDirective.Clear
      } else if (!qualified) {
        directive = TestCycleDirective.Clear
      } else if (request.freshReturn) {
        directive = TestCycleDirective.BeginRecovery
      } else if (cycle == CycleAssessment.RecoveryPassed) {
        lifecycleModeMemory = LifecycleMode.Off
        directive = TestCycleDirective.Clear
        reason = LifecycleReason.RecoveryCompleted
      } else if (cycle == CycleAssessment.AwaitingRecovery) {
        reason = LifecycleReason.RecoveryAwaiting
      }
    }
    var snapshotDirective: LifecycleDirectiveSnapshot.Type = LifecycleDirectiveSnapshot.None
    if (directive == TestCycleDirective.BeginStart) {
      snapshotDirective = LifecycleDirectiveSnapshot.BeginStart
    } else if (directive == TestCycleDirective.BeginRecovery) {
      snapshotDirective = LifecycleDirectiveSnapshot.BeginRecovery
    } else if (directive == TestCycleDirective.Clear) {
      snapshotDirective = LifecycleDirectiveSnapshot.Clear
    }
    api.put_test_cycle_directive(directive)
    api.put_applied_lifecycle(AppliedLifecycleSnapshot(
      snapshotDirective, preMode, lifecycleModeMemory, reason))
  }

  def timeTriggered(api: LifecycleRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(lifecycleModeMemory, api))
    compute(api)
  }

  def finalise(api: LifecycleRecoveryOwner_Operational_Api): Unit = { }
}
