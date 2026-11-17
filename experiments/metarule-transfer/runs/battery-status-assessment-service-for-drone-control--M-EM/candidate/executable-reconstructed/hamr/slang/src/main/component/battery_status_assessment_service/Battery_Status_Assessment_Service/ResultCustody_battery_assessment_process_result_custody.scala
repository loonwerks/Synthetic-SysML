// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ResultCustody_battery_assessment_process_result_custody {

  // BEGIN STATE VARS
  var publicationState: Battery_Status_Assessment_Service.PublicationState.Type = Battery_Status_Assessment_Service.PublicationState.Empty

  var retainedAssessment: Battery_Status_Assessment_Service.AssessmentResult.Type = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment

  var committedPublicationOutcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
  // END STATE VARS

  def initialise(api: ResultCustody_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_publication_outcome(Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome)
    api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment.example())
  }

  def timeTriggered(api: ResultCustody_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRIOR_PUBLICATION_OUTCOME
        api.publication_outcome == committedPublicationOutcome,
        // case PUBLICATION_RESET
        (api.publication_directive == PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.PublicationReset &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case PUBLICATION_HELD
        (api.publication_directive != PublicationDirective.ResetPublication &
          In(publicationState) == PublicationState.FaultHold) ___>: (publicationState == PublicationState.FaultHold &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case UNEXPECTED_OPEN_WHILE_OFFERED
        ((In(publicationState) == PublicationState.OfferedTokenA |
          In(publicationState) == PublicationState.OfferedTokenB) &
          (api.publication_directive == PublicationDirective.OpenTokenA |
            api.publication_directive == PublicationDirective.OpenTokenB) &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            In(publicationState) == PublicationState.OfferedTokenA &
              api.control_use_feedback.ticket == FeedbackTicket.TokenA &
              api.control_use_feedback.disposition == UseDisposition.Pending |
            In(publicationState) == PublicationState.OfferedTokenB &
              api.control_use_feedback.ticket == FeedbackTicket.TokenB &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.FaultHold &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.PublicationFault &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case FEEDBACK_FAULT
        (api.publication_directive != PublicationDirective.ResetPublication &
          In(publicationState) != PublicationState.FaultHold &
          !(api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            In(publicationState) == PublicationState.OfferedTokenA &
              api.control_use_feedback.ticket == FeedbackTicket.TokenA &
              (api.control_use_feedback.disposition == UseDisposition.Pending |
                api.control_use_feedback.disposition == UseDisposition.Consumed) |
            In(publicationState) == PublicationState.OfferedTokenB &
              api.control_use_feedback.ticket == FeedbackTicket.TokenB &
              (api.control_use_feedback.disposition == UseDisposition.Pending |
                api.control_use_feedback.disposition == UseDisposition.Consumed))) ___>: (publicationState == PublicationState.FaultHold &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.PublicationFault &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case CONSUME_TOKEN_A
        (In(publicationState) == PublicationState.OfferedTokenA &
          api.control_use_feedback.ticket == FeedbackTicket.TokenA &
          api.control_use_feedback.disposition == UseDisposition.Consumed &
          api.publication_directive != PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.Consumed &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case CONSUME_TOKEN_B
        (In(publicationState) == PublicationState.OfferedTokenB &
          api.control_use_feedback.ticket == FeedbackTicket.TokenB &
          api.control_use_feedback.disposition == UseDisposition.Consumed &
          api.publication_directive != PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.Consumed &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case WITHDRAW_COHERENT_OFFER
        ((In(publicationState) == PublicationState.OfferedTokenA |
          In(publicationState) == PublicationState.OfferedTokenB) &
          api.publication_directive == PublicationDirective.Withdraw &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            In(publicationState) == PublicationState.OfferedTokenA &
              api.control_use_feedback.ticket == FeedbackTicket.TokenA &
              api.control_use_feedback.disposition == UseDisposition.Pending |
            In(publicationState) == PublicationState.OfferedTokenB &
              api.control_use_feedback.ticket == FeedbackTicket.TokenB &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.Cancelled &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case PRESERVE_TOKEN_A
        (In(publicationState) == PublicationState.OfferedTokenA &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            api.control_use_feedback.ticket == FeedbackTicket.TokenA &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.OfferedTokenA &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenA &
          api.battery_assessment.ticket == ReportTicket.TokenA &
          api.battery_assessment.result == retainedAssessment),
        // case PRESERVE_TOKEN_B
        (In(publicationState) == PublicationState.OfferedTokenB &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            api.control_use_feedback.ticket == FeedbackTicket.TokenB &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.OfferedTokenB &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenB &
          api.battery_assessment.ticket == ReportTicket.TokenB &
          api.battery_assessment.result == retainedAssessment),
        // case OPEN_TOKEN_A
        (In(publicationState) == PublicationState.Empty &
          api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
          api.control_use_feedback.disposition == UseDisposition.NoFeedback &
          api.publication_directive == PublicationDirective.OpenTokenA &
          api.decision_assessment.ticket == ReportTicket.TokenA &
          api.decision_assessment.result != AssessmentResult.NoAssessment) ___>: (publicationState == PublicationState.OfferedTokenA &
          retainedAssessment == api.decision_assessment.result &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenA &
          api.battery_assessment.ticket == ReportTicket.TokenA &
          api.battery_assessment.result == api.decision_assessment.result),
        // case OPEN_TOKEN_B
        (In(publicationState) == PublicationState.Empty &
          api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
          api.control_use_feedback.disposition == UseDisposition.NoFeedback &
          api.publication_directive == PublicationDirective.OpenTokenB &
          api.decision_assessment.ticket == ReportTicket.TokenB &
          api.decision_assessment.result != AssessmentResult.NoAssessment) ___>: (publicationState == PublicationState.OfferedTokenB &
          retainedAssessment == api.decision_assessment.result &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenB &
          api.battery_assessment.ticket == ReportTicket.TokenB &
          api.battery_assessment.result == api.decision_assessment.result),
        // case CUSTODY_INACTIVE
        (In(publicationState) == PublicationState.Empty &
          api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
          api.control_use_feedback.disposition == UseDisposition.NoFeedback &
          api.publication_directive != PublicationDirective.ResetPublication &
          !(api.publication_directive == PublicationDirective.OpenTokenA &
            api.decision_assessment.ticket == ReportTicket.TokenA &
            api.decision_assessment.result != AssessmentResult.NoAssessment) &
          !(api.publication_directive == PublicationDirective.OpenTokenB &
            api.decision_assessment.ticket == ReportTicket.TokenB &
            api.decision_assessment.result != AssessmentResult.NoAssessment)) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment)
        // END COMPUTE ENSURES timeTriggered
      )
    )
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
