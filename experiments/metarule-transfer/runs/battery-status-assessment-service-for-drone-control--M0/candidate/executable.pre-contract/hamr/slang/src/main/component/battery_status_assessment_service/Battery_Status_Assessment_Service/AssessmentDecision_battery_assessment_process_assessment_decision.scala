// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object AssessmentDecision_battery_assessment_process_assessment_decision {

  def initialise(api: AssessmentDecision_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decision_assessment(Battery_Status_Assessment_Service.TaggedAssessment.example())
  }

  def timeTriggered(api: AssessmentDecision_Operational_Api): Unit = {
    // example api usage

    val apiUsage_assessment_context: Option[Battery_Status_Assessment_Service.AssessmentContext.Type] = api.get_assessment_context()
    api.logInfo(s"Received on data port assessment_context: ${apiUsage_assessment_context}")
    val apiUsage_qualified_evidence: Option[Battery_Status_Assessment_Service.TaggedQualifiedEvidence] = api.get_qualified_evidence()
    api.logInfo(s"Received on data port qualified_evidence: ${apiUsage_qualified_evidence}")
  }

  def finalise(api: AssessmentDecision_Operational_Api): Unit = { }
}
