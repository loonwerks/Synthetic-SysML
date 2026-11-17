// #Sireum

package cabin_air_treatment_supervisor.Cabin_Air_Treatment_Supervisor

import org.sireum._
import cabin_air_treatment_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object FiltrationProposalOwner_airCareSupervisionProcess_filtrationProposalOwner {

  def initialise(api: FiltrationProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_airProposal(Cabin_Air_Treatment_Supervisor.AirProposal.None)
  }

  def timeTriggered(api: FiltrationProposalOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIntent: Option[Cabin_Air_Treatment_Supervisor.RequestIntent.Type] = api.get_requestIntent()
    api.logInfo(s"Received on data port requestIntent: ${apiUsage_requestIntent}")
    val apiUsage_airAssessment: Option[Cabin_Air_Treatment_Supervisor.AirAssessment.Type] = api.get_airAssessment()
    api.logInfo(s"Received on data port airAssessment: ${apiUsage_airAssessment}")
    val apiUsage_treatmentReadiness: Option[Cabin_Air_Treatment_Supervisor.TreatmentReadiness.Type] = api.get_treatmentReadiness()
    api.logInfo(s"Received on data port treatmentReadiness: ${apiUsage_treatmentReadiness}")
  }

  def finalise(api: FiltrationProposalOwner_Operational_Api): Unit = { }
}
