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
    Contract(
      Modifies(
        api,
        publicationState,
        retainedAssessment,
        committedPublicationOutcome
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES timeTriggered
        // guarantee INITIAL_CUSTODY_SAFE
        //   publicationState is Empty, retainedAssessment is NoAssessment,
        //   committedPublicationOutcome is NoPublicationOutcome,
        //   publication outcome is NoPublicationOutcome, battery assessment
        //   ticket is NoTicket, and battery assessment result is NoAssessment
        publicationState == Battery_Status_Assessment_Service.PublicationState.Empty &
          retainedAssessment == Battery_Status_Assessment_Service.AssessmentResult.NoAssessment &
          committedPublicationOutcome == Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome &
          api.publication_outcome == Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome &
          api.battery_assessment.ticket == Battery_Status_Assessment_Service.ReportTicket.NoTicket &
          api.battery_assessment.result == Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
        // END INITIALIZES ENSURES timeTriggered
      )
    )
    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    publicationState = Battery_Status_Assessment_Service.PublicationState.Empty
    retainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    committedPublicationOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
    api.put_publication_outcome(Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome)
    api.put_battery_assessment(
      Battery_Status_Assessment_Service.TaggedAssessment(
        ticket = Battery_Status_Assessment_Service.ReportTicket.NoTicket,
        result = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment))
  }

  def timeTriggered(api: ResultCustody_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        api,
        publicationState,
        retainedAssessment,
        committedPublicationOutcome
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PRIOR_PUBLICATION_OUTCOME
        //   publish committed publication outcome
        api.publication_outcome == In(committedPublicationOutcome),
        // case PUBLICATION_RESET
        //   reset publication directive
        (api.publication_directive == PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.PublicationReset &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case PUBLICATION_HELD
        //   retained in publication fault hold
        (api.publication_directive != PublicationDirective.ResetPublication &
          In(publicationState) == PublicationState.FaultHold) ___>: (publicationState == PublicationState.FaultHold &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case UNEXPECTED_OPEN_WHILE_OFFERED
        //   unexpected open while offered
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
        //   inconsistent feedback
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
        //   consume offered token A
        (In(publicationState) == PublicationState.OfferedTokenA &
          api.control_use_feedback.ticket == FeedbackTicket.TokenA &
          api.control_use_feedback.disposition == UseDisposition.Consumed &
          api.publication_directive != PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.Consumed &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case CONSUME_TOKEN_B
        //   consume offered token B
        (In(publicationState) == PublicationState.OfferedTokenB &
          api.control_use_feedback.ticket == FeedbackTicket.TokenB &
          api.control_use_feedback.disposition == UseDisposition.Consumed &
          api.publication_directive != PublicationDirective.ResetPublication) ___>: (publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.Consumed &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment),
        // case WITHDRAW_COHERENT_OFFER
        //   withdraw coherent offer
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
        //   preserve offered token A
        (In(publicationState) == PublicationState.OfferedTokenA &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            api.control_use_feedback.ticket == FeedbackTicket.TokenA &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.OfferedTokenA &
          retainedAssessment == In(retainedAssessment) &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenA &
          api.battery_assessment.ticket == ReportTicket.TokenA &
          api.battery_assessment.result == In(retainedAssessment)),
        // case PRESERVE_TOKEN_B
        //   preserve offered token B
        (In(publicationState) == PublicationState.OfferedTokenB &
          api.publication_directive == PublicationDirective.NoPublicationDirective &
          (api.control_use_feedback.ticket == FeedbackTicket.NoTicket &
            api.control_use_feedback.disposition == UseDisposition.NoFeedback |
            api.control_use_feedback.ticket == FeedbackTicket.TokenB &
              api.control_use_feedback.disposition == UseDisposition.Pending)) ___>: (publicationState == PublicationState.OfferedTokenB &
          retainedAssessment == In(retainedAssessment) &
          committedPublicationOutcome == PublicationOutcome.OfferedTokenB &
          api.battery_assessment.ticket == ReportTicket.TokenB &
          api.battery_assessment.result == In(retainedAssessment)),
        // case OPEN_TOKEN_A
        //   open token A offer
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
        //   open token B offer
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
        //   inactive custody
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

    // guarantee PRIOR_PUBLICATION_OUTCOME: publish committed publication outcome
    api.put_publication_outcome(committedPublicationOutcome)

    val cf: Battery_Status_Assessment_Service.ControlUseFeedback = apiUsage_control_use_feedback.get
    val pubDirective: Battery_Status_Assessment_Service.PublicationDirective.Type = apiUsage_publication_directive.get
    val decisionAssessment: Battery_Status_Assessment_Service.TaggedAssessment = apiUsage_decision_assessment.get
    val entryPubState: Battery_Status_Assessment_Service.PublicationState.Type = publicationState

    var newPubState: Battery_Status_Assessment_Service.PublicationState.Type = entryPubState
    var newRetainedAssessment: Battery_Status_Assessment_Service.AssessmentResult.Type = retainedAssessment
    var newCommittedOutcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
    var newAcqTicket: Battery_Status_Assessment_Service.ReportTicket.Type = Battery_Status_Assessment_Service.ReportTicket.NoTicket
    var newAcqResult: Battery_Status_Assessment_Service.AssessmentResult.Type = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment

    val coherentFeedback: B =
      (cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.NoTicket &
        cf.disposition == Battery_Status_Assessment_Service.UseDisposition.NoFeedback) |
      (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA &
        cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenA &
        (cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending |
          cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed)) |
      (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB &
        cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenB &
        (cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending |
          cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed))

    val coherentPending: B =
      (cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.NoTicket &
        cf.disposition == Battery_Status_Assessment_Service.UseDisposition.NoFeedback) |
      (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA &
        cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenA &
        cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending) |
      (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB &
        cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenB &
        cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending)

    if (pubDirective == Battery_Status_Assessment_Service.PublicationDirective.ResetPublication) {
      // case PUBLICATION_RESET
      newPubState = Battery_Status_Assessment_Service.PublicationState.Empty
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if (pubDirective != Battery_Status_Assessment_Service.PublicationDirective.ResetPublication &
      entryPubState == Battery_Status_Assessment_Service.PublicationState.FaultHold) {
      // case PUBLICATION_HELD
      newPubState = Battery_Status_Assessment_Service.PublicationState.FaultHold
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if ((entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA |
      entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB) &
      (pubDirective == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA |
        pubDirective == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB) &
      coherentPending) {
      // case UNEXPECTED_OPEN_WHILE_OFFERED
      newPubState = Battery_Status_Assessment_Service.PublicationState.FaultHold
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if (pubDirective != Battery_Status_Assessment_Service.PublicationDirective.ResetPublication &
      entryPubState != Battery_Status_Assessment_Service.PublicationState.FaultHold &
      !coherentFeedback) {
      // case FEEDBACK_FAULT
      newPubState = Battery_Status_Assessment_Service.PublicationState.FaultHold
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA &
      cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenA &
      cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed &
      pubDirective != Battery_Status_Assessment_Service.PublicationDirective.ResetPublication) {
      // case CONSUME_TOKEN_A
      newPubState = Battery_Status_Assessment_Service.PublicationState.Empty
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.Consumed
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB &
      cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenB &
      cf.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed &
      pubDirective != Battery_Status_Assessment_Service.PublicationDirective.ResetPublication) {
      // case CONSUME_TOKEN_B
      newPubState = Battery_Status_Assessment_Service.PublicationState.Empty
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.Consumed
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if ((entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA |
      entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB) &
      pubDirective == Battery_Status_Assessment_Service.PublicationDirective.Withdraw &
      coherentPending) {
      // case WITHDRAW_COHERENT_OFFER
      newPubState = Battery_Status_Assessment_Service.PublicationState.Empty
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.Cancelled
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenA &
      pubDirective == Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective &
      coherentPending) {
      // case PRESERVE_TOKEN_A
      newPubState = Battery_Status_Assessment_Service.PublicationState.OfferedTokenA
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.TokenA
      newAcqResult = newRetainedAssessment
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.OfferedTokenB &
      pubDirective == Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective &
      coherentPending) {
      // case PRESERVE_TOKEN_B
      newPubState = Battery_Status_Assessment_Service.PublicationState.OfferedTokenB
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.TokenB
      newAcqResult = newRetainedAssessment
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.Empty &
      cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.NoTicket &
      cf.disposition == Battery_Status_Assessment_Service.UseDisposition.NoFeedback &
      pubDirective == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA &
      decisionAssessment.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA &
      decisionAssessment.result != Battery_Status_Assessment_Service.AssessmentResult.NoAssessment) {
      // case OPEN_TOKEN_A
      newPubState = Battery_Status_Assessment_Service.PublicationState.OfferedTokenA
      newRetainedAssessment = decisionAssessment.result
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.TokenA
      newAcqResult = decisionAssessment.result
    } else if (entryPubState == Battery_Status_Assessment_Service.PublicationState.Empty &
      cf.ticket == Battery_Status_Assessment_Service.FeedbackTicket.NoTicket &
      cf.disposition == Battery_Status_Assessment_Service.UseDisposition.NoFeedback &
      pubDirective == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB &
      decisionAssessment.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB &
      decisionAssessment.result != Battery_Status_Assessment_Service.AssessmentResult.NoAssessment) {
      // case OPEN_TOKEN_B
      newPubState = Battery_Status_Assessment_Service.PublicationState.OfferedTokenB
      newRetainedAssessment = decisionAssessment.result
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.TokenB
      newAcqResult = decisionAssessment.result
    } else {
      // case CUSTODY_INACTIVE
      newPubState = Battery_Status_Assessment_Service.PublicationState.Empty
      newRetainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
      newCommittedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
      newAcqTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
      newAcqResult = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
    }

    publicationState = newPubState
    retainedAssessment = newRetainedAssessment
    committedPublicationOutcome = newCommittedOutcome
    api.put_battery_assessment(
      Battery_Status_Assessment_Service.TaggedAssessment(
        ticket = newAcqTicket,
        result = newAcqResult))
  }

  def finalise(api: ResultCustody_Operational_Api): Unit = { }
}
