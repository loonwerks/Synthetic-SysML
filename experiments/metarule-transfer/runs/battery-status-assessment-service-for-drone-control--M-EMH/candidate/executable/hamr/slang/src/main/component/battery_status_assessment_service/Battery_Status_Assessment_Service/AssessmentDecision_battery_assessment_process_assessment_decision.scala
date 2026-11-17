// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object AssessmentDecision_battery_assessment_process_assessment_decision {

  def initialise(api: AssessmentDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_decision_assessment(Battery_Status_Assessment_Service.TaggedAssessment(
      Battery_Status_Assessment_Service.ReportTicket.NoTicket,
      Battery_Status_Assessment_Service.AssessmentResult.NoAssessment))
  }

  def timeTriggered(api: AssessmentDecision_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val context: Battery_Status_Assessment_Service.AssessmentContext.Type = api.get_assessment_context() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.AssessmentContext.NoContext
    }
    val evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = api.get_qualified_evidence() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.TaggedQualifiedEvidence.example()
    }
    val matched =
      (context == Battery_Status_Assessment_Service.AssessmentContext.AssessTokenA &&
        evidence.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA) ||
      (context == Battery_Status_Assessment_Service.AssessmentContext.AssessTokenB &&
        evidence.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB)

    val result: Battery_Status_Assessment_Service.TaggedAssessment =
      if (!matched) {
        Battery_Status_Assessment_Service.TaggedAssessment.example()
      } else {
        val assessment: Battery_Status_Assessment_Service.AssessmentResult.Type = evidence.evidence match {
          case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedHigh =>
            Battery_Status_Assessment_Service.AssessmentResult.NormalUse
          case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedModerate =>
            Battery_Status_Assessment_Service.AssessmentResult.CautionUse
          case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedLow =>
            Battery_Status_Assessment_Service.AssessmentResult.RestrictUse
          case Battery_Status_Assessment_Service.QualifiedEvidence.TrustedCritical =>
            Battery_Status_Assessment_Service.AssessmentResult.RestrictUse
          case Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted =>
            Battery_Status_Assessment_Service.AssessmentResult.Untrusted
          case _ =>
            Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
        }
        if (assessment == Battery_Status_Assessment_Service.AssessmentResult.NoAssessment) {
          Battery_Status_Assessment_Service.TaggedAssessment.example()
        } else {
          Battery_Status_Assessment_Service.TaggedAssessment(evidence.ticket, assessment)
        }
      }
    api.put_decision_assessment(result)
  }

  def finalise(api: AssessmentDecision_Operational_Api): Unit = { }
}
