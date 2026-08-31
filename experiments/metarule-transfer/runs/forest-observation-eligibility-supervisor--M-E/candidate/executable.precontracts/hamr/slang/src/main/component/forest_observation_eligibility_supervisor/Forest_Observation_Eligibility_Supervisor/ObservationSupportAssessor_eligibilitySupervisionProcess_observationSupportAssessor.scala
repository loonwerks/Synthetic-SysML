// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor {

  def initialise(api: ObservationSupportAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supportVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict.example())
  }

  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_cameraEvidence: Option[Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type] = api.get_cameraEvidence()
    api.logInfo(s"Received on data port cameraEvidence: ${apiUsage_cameraEvidence}")
    val apiUsage_radioEvidence: Option[Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type] = api.get_radioEvidence()
    api.logInfo(s"Received on data port radioEvidence: ${apiUsage_radioEvidence}")
    val apiUsage_evaluationTicket: Option[Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type] = api.get_evaluationTicket()
    api.logInfo(s"Received on data port evaluationTicket: ${apiUsage_evaluationTicket}")
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }
}
