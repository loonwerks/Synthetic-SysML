// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HumidityProposalOwner_airCareSupervisionProcess_humidityProposalOwner {

  def initialise(api: HumidityProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_humidityProposal(Cabin_Air_Treatment_Supervisor.HumidityProposal.None)
  }

  def timeTriggered(api: HumidityProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_humidityAssessment: Option[Cabin_Air_Treatment_Supervisor.HumidityAssessment.Type] = api.get_humidityAssessment()
    api.logInfo(s"Received on data port humidityAssessment: ${apiUsage_humidityAssessment}")
    val apiUsage_treatmentReadiness: Option[Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type] = api.get_treatmentReadiness()
    api.logInfo(s"Received on data port treatmentReadiness: ${apiUsage_treatmentReadiness}")
  }

  def finalise(api: HumidityProposalOwner_Operational_Api): Unit = { }
}
