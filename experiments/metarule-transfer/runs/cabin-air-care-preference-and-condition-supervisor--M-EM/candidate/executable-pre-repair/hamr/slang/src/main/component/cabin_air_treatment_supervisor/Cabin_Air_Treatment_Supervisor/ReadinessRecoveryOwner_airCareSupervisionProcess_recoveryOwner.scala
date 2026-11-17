// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner {

  // BEGIN STATE VARS
  var recoveryMemory: Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type = Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready
  // END STATE VARS

  def initialise(api: ReadinessRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, recoveryMemory))
    recoveryMemory = Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready
    api.put_recoveryGate(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
  }

  def timeTriggered(api: ReadinessRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_REC_01_CRITICAL_UNKNOWN
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld),
        // case CASE_REC_02_RECOVER_TO_AWAIT_FRESH
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh),
        // case CASE_REC_03_FRESH_REAUTHORIZATION
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge)) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready),
        // case CASE_REC_04_RETAIN_AWAIT_FRESH
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.requestIntent != Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto &
          api.requestIntent != Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh),
        // case CASE_REC_05_RETAIN_READY
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_requestIntent(), api.get_readinessContext()) match {
      case (Some(intent), Some(context)) =>
        if (context == Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown) {
          recoveryMemory = Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld
        } else if (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) {
          recoveryMemory = Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh
        } else if (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          (intent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            intent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge)) {
          recoveryMemory = Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready
        }
        api.put_recoveryGate(recoveryMemory)
      case _ =>
        recoveryMemory = Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld
        api.put_recoveryGate(recoveryMemory)
    }
  }

  def finalise(api: ReadinessRecoveryOwner_Operational_Api): Unit = { }
}
