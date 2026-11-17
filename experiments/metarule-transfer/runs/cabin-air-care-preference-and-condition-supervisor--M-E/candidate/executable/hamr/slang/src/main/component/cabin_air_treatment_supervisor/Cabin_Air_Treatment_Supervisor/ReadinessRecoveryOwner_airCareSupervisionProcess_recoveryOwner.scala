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
    recoveryMemory = RecoveryMemory.Ready
    api.put_recoveryGate(RecoveryMemory.Ready)
  }

  def timeTriggered(api: ReadinessRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, recoveryMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_REC_01_CRITICAL_UNKNOWN
        (api.readinessContext == ReadinessContext.CriticalUnknown) ___>: (recoveryMemory == RecoveryMemory.FaultHeld &
          api.recoveryGate == RecoveryMemory.FaultHeld),
        // case CASE_REC_02_RECOVER_TO_AWAIT_FRESH
        (api.readinessContext == ReadinessContext.Clear &
          In(recoveryMemory) == RecoveryMemory.FaultHeld) ___>: (recoveryMemory == RecoveryMemory.AwaitFresh &
          api.recoveryGate == RecoveryMemory.AwaitFresh),
        // case CASE_REC_03_FRESH_REAUTHORIZATION
        (api.readinessContext == ReadinessContext.Clear &
          In(recoveryMemory) == RecoveryMemory.AwaitFresh &
          (api.requestIntent == RequestIntent.FreshAuto |
            api.requestIntent == RequestIntent.FreshPurge)) ___>: (recoveryMemory == RecoveryMemory.Ready &
          api.recoveryGate == RecoveryMemory.Ready),
        // case CASE_REC_04_RETAIN_AWAIT_FRESH
        (api.readinessContext == ReadinessContext.Clear &
          In(recoveryMemory) == RecoveryMemory.AwaitFresh &
          api.requestIntent != RequestIntent.FreshAuto &
          api.requestIntent != RequestIntent.FreshPurge) ___>: (recoveryMemory == RecoveryMemory.AwaitFresh &
          api.recoveryGate == RecoveryMemory.AwaitFresh),
        // case CASE_REC_05_RETAIN_READY
        (api.readinessContext == ReadinessContext.Clear &
          In(recoveryMemory) == RecoveryMemory.Ready) ___>: (recoveryMemory == RecoveryMemory.Ready &
          api.recoveryGate == RecoveryMemory.Ready)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val intent = api.get_requestIntent().get
    val context = api.get_readinessContext().get
    if (context == ReadinessContext.CriticalUnknown) {
      recoveryMemory = RecoveryMemory.FaultHeld
    } else if (recoveryMemory == RecoveryMemory.FaultHeld) {
      recoveryMemory = RecoveryMemory.AwaitFresh
    } else if (recoveryMemory == RecoveryMemory.AwaitFresh &
      (intent == RequestIntent.FreshAuto | intent == RequestIntent.FreshPurge)) {
      recoveryMemory = RecoveryMemory.Ready
    }
    api.put_recoveryGate(recoveryMemory)
  }

  def finalise(api: ReadinessRecoveryOwner_Operational_Api): Unit = { }
}
