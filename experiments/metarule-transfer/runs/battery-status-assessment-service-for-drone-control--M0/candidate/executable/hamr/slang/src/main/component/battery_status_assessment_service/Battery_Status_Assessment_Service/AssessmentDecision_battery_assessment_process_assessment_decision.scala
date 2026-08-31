// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object AssessmentDecision_battery_assessment_process_assessment_decision {

  def initialise(api: AssessmentDecision_Initialization_Api): Unit = {
    api.put_decision_assessment(Battery_Status_Assessment_Service.TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment))
  }

  def timeTriggered(api: AssessmentDecision_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case DECIDE_HIGH
        //   N.md#DECIDE_HIGH
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedHigh) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.NormalUse),
        // case DECIDE_MODERATE
        //   N.md#DECIDE_MODERATE
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedModerate) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.CautionUse),
        // case DECIDE_LOW_OR_CRITICAL
        //   N.md#DECIDE_LOW_OR_CRITICAL
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          (api.qualified_evidence.evidence == QualifiedEvidence.TrustedLow |
            api.qualified_evidence.evidence == QualifiedEvidence.TrustedCritical)) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.RestrictUse),
        // case DECIDE_UNTRUSTED
        //   N.md#DECIDE_UNTRUSTED
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.Untrusted) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.Untrusted),
        // case DECISION_INAPPLICABLE
        //   N.md#DECISION_INAPPLICABLE
        (!((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence != QualifiedEvidence.NoEvidence)) ___>: (api.decision_assessment.ticket == ReportTicket.NoTicket &
          api.decision_assessment.result == AssessmentResult.NoAssessment)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val context = api.get_assessment_context().get
    val evidence = api.get_qualified_evidence().get
    val matched = (context == AssessmentContext.AssessTokenA & evidence.ticket == ReportTicket.TokenA) |
      (context == AssessmentContext.AssessTokenB & evidence.ticket == ReportTicket.TokenB)
    val result: AssessmentResult.Type =
      if (matched & evidence.evidence == QualifiedEvidence.TrustedHigh) AssessmentResult.NormalUse
      else if (matched & evidence.evidence == QualifiedEvidence.TrustedModerate) AssessmentResult.CautionUse
      else if (matched & (evidence.evidence == QualifiedEvidence.TrustedLow | evidence.evidence == QualifiedEvidence.TrustedCritical)) AssessmentResult.RestrictUse
      else if (matched & evidence.evidence == QualifiedEvidence.Untrusted) AssessmentResult.Untrusted
      else AssessmentResult.NoAssessment
    val ticket: ReportTicket.Type = if (result == AssessmentResult.NoAssessment) ReportTicket.NoTicket else evidence.ticket
    api.put_decision_assessment(Battery_Status_Assessment_Service.TaggedAssessment(ticket, result))
  }

  def finalise(api: AssessmentDecision_Operational_Api): Unit = { }
}
