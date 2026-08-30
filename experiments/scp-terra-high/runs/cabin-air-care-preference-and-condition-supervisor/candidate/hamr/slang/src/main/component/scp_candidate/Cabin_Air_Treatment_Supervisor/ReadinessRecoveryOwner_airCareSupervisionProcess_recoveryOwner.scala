// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner {

  // BEGIN STATE VARS
  var recoveryMemory: Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type = Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready
  // END STATE VARS

  def initialise(api: ReadinessRecoveryOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, recoveryMemory),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_RECOVERY_SAFE
        recoveryMemory == RecoveryMemory.Ready &&
          api.recoveryGate == RecoveryMemory.Ready
        // END INITIALIZES ENSURES
      )
    )
    recoveryMemory = RecoveryMemory.Ready
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryGate(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
  }

  def timeTriggered(api: ReadinessRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryMemory)
    )
    val intent = api.get_requestIntent().get
    val context = api.get_readinessContext().get
    if (context == ReadinessContext.CriticalUnknown) {
      recoveryMemory = RecoveryMemory.FaultHeld
    } else if (recoveryMemory == RecoveryMemory.FaultHeld) {
      recoveryMemory = RecoveryMemory.AwaitFresh
    } else if (recoveryMemory == RecoveryMemory.AwaitFresh &&
               (intent == RequestIntent.FreshAuto || intent == RequestIntent.FreshPurge)) {
      recoveryMemory = RecoveryMemory.Ready
    }
    api.put_recoveryGate(recoveryMemory)
  }

  def finalise(api: ReadinessRecoveryOwner_Operational_Api): Unit = { }
}
