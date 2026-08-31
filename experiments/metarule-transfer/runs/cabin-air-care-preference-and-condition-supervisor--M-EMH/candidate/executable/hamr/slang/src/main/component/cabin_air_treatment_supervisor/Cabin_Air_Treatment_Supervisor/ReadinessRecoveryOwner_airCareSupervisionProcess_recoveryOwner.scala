// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ReadinessRecoveryOwner_airCareSupervisionProcess_recoveryOwner {

  def initialise(api: ReadinessRecoveryOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryGate(Cabin_Air_Treatment_Supervisor.RecoveryMemory.Ready)
  }

  def timeTriggered(api: ReadinessRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_readinessContext: Option[Cabin_Air_Treatment_Supervisor.ReadinessContext.Type] = api.get_readinessContext()
    api.logInfo(s"Received on data port readinessContext: ${apiUsage_readinessContext}")
  }

  def finalise(api: ReadinessRecoveryOwner_Operational_Api): Unit = { }
}
