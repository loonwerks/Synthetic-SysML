// #Sireum

package scp_candidate.Battery_Status_Assessment_Service

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AssessmentDecision_battery_assessment_process_assessment_decision {

  def initialise(api: AssessmentDecision_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DECISION_SAFE
        api.decision_assessment.ticket == ReportTicket.NoTicket &
          api.decision_assessment.result == AssessmentResult.NoAssessment
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decision_assessment(TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment))
  }

  def finalise(api: AssessmentDecision_Operational_Api): Unit = { }

  def timeTriggered(api: AssessmentDecision_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val context: AssessmentContext.Type = api.get_assessment_context().get
    val evidence: TaggedQualifiedEvidence = api.get_qualified_evidence().get
    val matched: B = (context == AssessmentContext.AssessTokenA && evidence.ticket == ReportTicket.TokenA) ||
      (context == AssessmentContext.AssessTokenB && evidence.ticket == ReportTicket.TokenB)
    val assessment: TaggedAssessment = if (matched) {
      evidence.evidence match {
        case QualifiedEvidence.TrustedHigh => TaggedAssessment(evidence.ticket, AssessmentResult.NormalUse)
        case QualifiedEvidence.TrustedModerate => TaggedAssessment(evidence.ticket, AssessmentResult.CautionUse)
        case QualifiedEvidence.TrustedLow => TaggedAssessment(evidence.ticket, AssessmentResult.RestrictUse)
        case QualifiedEvidence.TrustedCritical => TaggedAssessment(evidence.ticket, AssessmentResult.RestrictUse)
        case QualifiedEvidence.Untrusted => TaggedAssessment(evidence.ticket, AssessmentResult.Untrusted)
        case _ => TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment)
      }
    } else {
      TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment)
    }
    api.put_decision_assessment(assessment)
  }
}
