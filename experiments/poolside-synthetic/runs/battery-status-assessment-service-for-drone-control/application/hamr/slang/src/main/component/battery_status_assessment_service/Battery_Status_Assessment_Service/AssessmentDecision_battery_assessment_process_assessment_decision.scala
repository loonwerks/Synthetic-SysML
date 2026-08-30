// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object AssessmentDecision_battery_assessment_process_assessment_decision {

  def initialise(api: AssessmentDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES timeTriggered
        // guarantee INITIAL_DECISION_SAFE
        //   decision assessment ticket is NoTicket and decision assessment result is NoAssessment
        api.decision_assessment.ticket == ReportTicket.NoTicket &
          api.decision_assessment.result == AssessmentResult.NoAssessment
        // END INITIALIZES ENSURES timeTriggered
      )
    )
    api.put_decision_assessment(
      Battery_Status_Assessment_Service.TaggedAssessment(
        ticket = Battery_Status_Assessment_Service.ReportTicket.NoTicket,
        result = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment))
  }

  def timeTriggered(api: AssessmentDecision_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case DECIDE_HIGH
        //   token matches and evidence is TrustedHigh
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedHigh) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.NormalUse),
        // case DECIDE_MODERATE
        //   token matches and evidence is TrustedModerate
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.TrustedModerate) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.CautionUse),
        // case DECIDE_LOW_OR_CRITICAL
        //   token matches and evidence is TrustedLow or TrustedCritical
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          (api.qualified_evidence.evidence == QualifiedEvidence.TrustedLow |
            api.qualified_evidence.evidence == QualifiedEvidence.TrustedCritical)) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.RestrictUse),
        // case DECIDE_UNTRUSTED
        //   token matches and evidence is Untrusted
        ((api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB) &
          api.qualified_evidence.evidence == QualifiedEvidence.Untrusted) ___>: (api.decision_assessment.ticket == api.qualified_evidence.ticket &
          api.decision_assessment.result == AssessmentResult.Untrusted),
        // case DECISION_INAPPLICABLE
        //   token mismatch or no evidence
        (!(api.assessment_context == AssessmentContext.AssessTokenA &
          api.qualified_evidence.ticket == ReportTicket.TokenA |
          api.assessment_context == AssessmentContext.AssessTokenB &
            api.qualified_evidence.ticket == ReportTicket.TokenB |
          api.qualified_evidence.evidence == QualifiedEvidence.NoEvidence)) ___>: (api.decision_assessment.ticket == ReportTicket.NoTicket &
          api.decision_assessment.result == AssessmentResult.NoAssessment)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_assessment_context: Option[Battery_Status_Assessment_Service.AssessmentContext.Type] = api.get_assessment_context()
    api.logInfo(s"Received on data port assessment_context: ${apiUsage_assessment_context}")
    val apiUsage_qualified_evidence: Option[Battery_Status_Assessment_Service.TaggedQualifiedEvidence] = api.get_qualified_evidence()
    api.logInfo(s"Received on data port qualified_evidence: ${apiUsage_qualified_evidence}")

    val context: Battery_Status_Assessment_Service.AssessmentContext.Type = apiUsage_assessment_context.get
    val evidence: Battery_Status_Assessment_Service.TaggedQualifiedEvidence = apiUsage_qualified_evidence.get

    val tokenMatches: B = (context == Battery_Status_Assessment_Service.AssessmentContext.AssessTokenA & evidence.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA) |
      (context == Battery_Status_Assessment_Service.AssessmentContext.AssessTokenB & evidence.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB)

    val result: Battery_Status_Assessment_Service.AssessmentResult.Type =
      if (tokenMatches & evidence.evidence == Battery_Status_Assessment_Service.QualifiedEvidence.TrustedHigh) {
        Battery_Status_Assessment_Service.AssessmentResult.NormalUse
      } else if (tokenMatches & evidence.evidence == Battery_Status_Assessment_Service.QualifiedEvidence.TrustedModerate) {
        Battery_Status_Assessment_Service.AssessmentResult.CautionUse
      } else if (tokenMatches & (evidence.evidence == Battery_Status_Assessment_Service.QualifiedEvidence.TrustedLow |
        evidence.evidence == Battery_Status_Assessment_Service.QualifiedEvidence.TrustedCritical)) {
        Battery_Status_Assessment_Service.AssessmentResult.RestrictUse
      } else if (tokenMatches & evidence.evidence == Battery_Status_Assessment_Service.QualifiedEvidence.Untrusted) {
        Battery_Status_Assessment_Service.AssessmentResult.Untrusted
      } else {
        Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      }

    val outTicket: Battery_Status_Assessment_Service.ReportTicket.Type =
      if (tokenMatches) evidence.ticket else Battery_Status_Assessment_Service.ReportTicket.NoTicket

    api.put_decision_assessment(
      Battery_Status_Assessment_Service.TaggedAssessment(
        ticket = outTicket,
        result = result))
  }

  def finalise(api: AssessmentDecision_Operational_Api): Unit = { }
}
