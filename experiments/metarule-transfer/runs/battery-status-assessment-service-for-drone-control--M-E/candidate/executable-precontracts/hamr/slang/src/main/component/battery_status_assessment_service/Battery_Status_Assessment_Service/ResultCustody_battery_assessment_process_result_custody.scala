// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ResultCustody_battery_assessment_process_result_custody {

  def initialise(api: ResultCustody_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_publication_outcome(Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome)
    api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment.example())
  }

  def timeTriggered(api: ResultCustody_Operational_Api): Unit = {
    // example api usage

    val apiUsage_control_use_feedback: Option[Battery_Status_Assessment_Service.ControlUseFeedback] = api.get_control_use_feedback()
    api.logInfo(s"Received on data port control_use_feedback: ${apiUsage_control_use_feedback}")
    val apiUsage_publication_directive: Option[Battery_Status_Assessment_Service.PublicationDirective.Type] = api.get_publication_directive()
    api.logInfo(s"Received on data port publication_directive: ${apiUsage_publication_directive}")
    val apiUsage_decision_assessment: Option[Battery_Status_Assessment_Service.TaggedAssessment] = api.get_decision_assessment()
    api.logInfo(s"Received on data port decision_assessment: ${apiUsage_decision_assessment}")
  }

  def finalise(api: ResultCustody_Operational_Api): Unit = { }
}
