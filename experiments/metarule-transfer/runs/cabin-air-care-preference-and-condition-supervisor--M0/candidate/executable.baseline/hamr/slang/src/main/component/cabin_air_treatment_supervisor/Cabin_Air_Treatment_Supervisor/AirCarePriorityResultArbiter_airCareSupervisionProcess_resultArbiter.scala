// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AirCarePriorityResultArbiter_airCareSupervisionProcess_resultArbiter {

  def initialise(api: AirCarePriorityResultArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airTreatmentCommand(Cabin_Air_Treatment_Supervisor.AirTreatmentCommand.Off)
    api.put_airCareSupervisorStatus(Cabin_Air_Treatment_Supervisor.AirCareSupervisorStatus.example())
  }

  def timeTriggered(api: AirCarePriorityResultArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_airProposal: Option[Cabin_Air_Treatment_Supervisor.AirProposal.Type] = api.get_airProposal()
    api.logInfo(s"Received on data port airProposal: ${apiUsage_airProposal}")
    val apiUsage_humidityProposal: Option[Cabin_Air_Treatment_Supervisor.HumidityProposal.Type] = api.get_humidityProposal()
    api.logInfo(s"Received on data port humidityProposal: ${apiUsage_humidityProposal}")
    val apiUsage_recoveryGate: Option[Cabin_Air_Treatment_Supervisor.RecoveryMemory.Type] = api.get_recoveryGate()
    api.logInfo(s"Received on data port recoveryGate: ${apiUsage_recoveryGate}")
  }

  def finalise(api: AirCarePriorityResultArbiter_Operational_Api): Unit = { }
}
