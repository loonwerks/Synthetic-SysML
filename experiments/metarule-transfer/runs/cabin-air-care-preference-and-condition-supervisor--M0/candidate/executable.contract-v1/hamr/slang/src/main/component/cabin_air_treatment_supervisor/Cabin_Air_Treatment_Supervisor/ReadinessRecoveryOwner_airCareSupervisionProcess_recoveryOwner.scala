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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryGate(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
  }

  def timeTriggered(api: ReadinessRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_REC_01_CRITICAL_UNKNOWN
        //   Critical unknown readiness holds recovery
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.CriticalUnknown) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld),
        // case CASE_REC_02_RECOVER_TO_AWAIT_FRESH
        //   Recovery waits for a fresh active request
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.FaultHeld) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh),
        // case CASE_REC_03_FRESH_REAUTHORIZATION
        //   Fresh active request reauthorizes recovery
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          (api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto |
            api.requestIntent == Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge)) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready),
        // case CASE_REC_04_RETAIN_AWAIT_FRESH
        //   Recovery retains await-fresh
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.requestIntent != Cabin_Air_Treatment_Supervisor.RequestIntent.FreshAuto &
          api.requestIntent != Cabin_Air_Treatment_Supervisor.RequestIntent.FreshPurge) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.AwaitFresh),
        // case CASE_REC_05_RETAIN_READY
        //   Clear readiness retains ready
        (api.readinessContext == Cabin_Air_Treatment_Supervisor.ReadinessContext.Clear &
          In(recoveryMemory) == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready) ___>: (recoveryMemory == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready &
          api.recoveryGate == Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_readinessContext: Option[Cabin_Air_Treatment_Supervisor.ReadinessContext.Type] = api.get_readinessContext()
    api.logInfo(s"Received on data port readinessContext: ${apiUsage_readinessContext}")
  }

  def finalise(api: ReadinessRecoveryOwner_Operational_Api): Unit = { }
}
