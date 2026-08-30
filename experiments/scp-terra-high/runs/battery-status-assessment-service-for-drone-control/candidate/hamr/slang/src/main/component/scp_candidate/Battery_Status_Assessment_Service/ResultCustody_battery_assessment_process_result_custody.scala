// #Sireum

package scp_candidate.Battery_Status_Assessment_Service

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResultCustody_battery_assessment_process_result_custody {

  // BEGIN STATE VARS
  var publicationState: Battery_Status_Assessment_Service.PublicationState.Type = Battery_Status_Assessment_Service.PublicationState.Empty

  var retainedAssessment: Battery_Status_Assessment_Service.AssessmentResult.Type = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment

  var committedPublicationOutcome: Battery_Status_Assessment_Service.PublicationOutcome.Type = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
  // END STATE VARS

  def initialise(api: ResultCustody_Initialization_Api): Unit = {
    Contract(
      Modifies(publicationState, retainedAssessment, committedPublicationOutcome, api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_CUSTODY_SAFE
        publicationState == PublicationState.Empty &
          retainedAssessment == AssessmentResult.NoAssessment &
          committedPublicationOutcome == PublicationOutcome.NoPublicationOutcome &
          api.publication_outcome == PublicationOutcome.NoPublicationOutcome &
          api.battery_assessment.ticket == ReportTicket.NoTicket &
          api.battery_assessment.result == AssessmentResult.NoAssessment
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    publicationState = PublicationState.Empty
    retainedAssessment = AssessmentResult.NoAssessment
    committedPublicationOutcome = PublicationOutcome.NoPublicationOutcome
    api.put_publication_outcome(Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome)
    api.put_battery_assessment(TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment))
  }

  def finalise(api: ResultCustody_Operational_Api): Unit = { }

  def timeTriggered(api: ResultCustody_Operational_Api): Unit = {
    Contract(
      Modifies(publicationState, retainedAssessment, committedPublicationOutcome, api)
    )
    val feedback: ControlUseFeedback = api.get_control_use_feedback().get
    val directive: PublicationDirective.Type = api.get_publication_directive().get
    val decision: TaggedAssessment = api.get_decision_assessment().get
    val empty: TaggedAssessment = TaggedAssessment(ReportTicket.NoTicket, AssessmentResult.NoAssessment)

    api.put_publication_outcome(committedPublicationOutcome)

    val inactiveFeedback: B = feedback.ticket == FeedbackTicket.NoTicket && feedback.disposition == UseDisposition.NoFeedback
    val pendingA: B = publicationState == PublicationState.OfferedTokenA && feedback.ticket == FeedbackTicket.TokenA && feedback.disposition == UseDisposition.Pending
    val pendingB: B = publicationState == PublicationState.OfferedTokenB && feedback.ticket == FeedbackTicket.TokenB && feedback.disposition == UseDisposition.Pending
    val consumedA: B = publicationState == PublicationState.OfferedTokenA && feedback.ticket == FeedbackTicket.TokenA && feedback.disposition == UseDisposition.Consumed
    val consumedB: B = publicationState == PublicationState.OfferedTokenB && feedback.ticket == FeedbackTicket.TokenB && feedback.disposition == UseDisposition.Consumed
    val coherentFeedback: B = inactiveFeedback || pendingA || pendingB || consumedA || consumedB

    if (directive == PublicationDirective.ResetPublication) {
      publicationState = PublicationState.Empty
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.PublicationReset
      api.put_battery_assessment(empty)
    } else if (publicationState == PublicationState.FaultHold) {
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.NoPublicationOutcome
      api.put_battery_assessment(empty)
    } else if (!coherentFeedback) {
      publicationState = PublicationState.FaultHold
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.PublicationFault
      api.put_battery_assessment(empty)
    } else if (consumedA || consumedB) {
      publicationState = PublicationState.Empty
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.Consumed
      api.put_battery_assessment(empty)
    } else if ((publicationState == PublicationState.OfferedTokenA || publicationState == PublicationState.OfferedTokenB) && (directive == PublicationDirective.OpenTokenA || directive == PublicationDirective.OpenTokenB)) {
      publicationState = PublicationState.FaultHold
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.PublicationFault
      api.put_battery_assessment(empty)
    } else if ((publicationState == PublicationState.OfferedTokenA || publicationState == PublicationState.OfferedTokenB) && directive == PublicationDirective.Withdraw) {
      publicationState = PublicationState.Empty
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.Cancelled
      api.put_battery_assessment(empty)
    } else if (publicationState == PublicationState.OfferedTokenA && directive == PublicationDirective.NoPublicationDirective) {
      committedPublicationOutcome = PublicationOutcome.OfferedTokenA
      api.put_battery_assessment(TaggedAssessment(ReportTicket.TokenA, retainedAssessment))
    } else if (publicationState == PublicationState.OfferedTokenB && directive == PublicationDirective.NoPublicationDirective) {
      committedPublicationOutcome = PublicationOutcome.OfferedTokenB
      api.put_battery_assessment(TaggedAssessment(ReportTicket.TokenB, retainedAssessment))
    } else if (publicationState == PublicationState.Empty && inactiveFeedback && directive == PublicationDirective.OpenTokenA && decision.ticket == ReportTicket.TokenA && decision.result != AssessmentResult.NoAssessment) {
      publicationState = PublicationState.OfferedTokenA
      retainedAssessment = decision.result
      committedPublicationOutcome = PublicationOutcome.OfferedTokenA
      api.put_battery_assessment(TaggedAssessment(ReportTicket.TokenA, retainedAssessment))
    } else if (publicationState == PublicationState.Empty && inactiveFeedback && directive == PublicationDirective.OpenTokenB && decision.ticket == ReportTicket.TokenB && decision.result != AssessmentResult.NoAssessment) {
      publicationState = PublicationState.OfferedTokenB
      retainedAssessment = decision.result
      committedPublicationOutcome = PublicationOutcome.OfferedTokenB
      api.put_battery_assessment(TaggedAssessment(ReportTicket.TokenB, retainedAssessment))
    } else {
      publicationState = PublicationState.Empty
      retainedAssessment = AssessmentResult.NoAssessment
      committedPublicationOutcome = PublicationOutcome.NoPublicationOutcome
      api.put_battery_assessment(empty)
    }
  }
}
