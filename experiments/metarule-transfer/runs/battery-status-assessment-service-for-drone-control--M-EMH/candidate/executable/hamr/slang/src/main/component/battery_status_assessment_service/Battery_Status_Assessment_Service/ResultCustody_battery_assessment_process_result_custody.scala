// #Sireum

package battery_status_assessment_service.Battery_Status_Assessment_Service

import org.sireum._
import battery_status_assessment_service._

// This file will not be overwritten if HAMR codegen is rerun
object ResultCustody_battery_assessment_process_result_custody {
  var faultHold: B = F
  var offeredTicket: Battery_Status_Assessment_Service.ReportTicket.Type =
    Battery_Status_Assessment_Service.ReportTicket.NoTicket
  var retainedAssessment: Battery_Status_Assessment_Service.AssessmentResult.Type =
    Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
  var committedOutcome: Battery_Status_Assessment_Service.PublicationOutcome.Type =
    Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome

  def noAssessment(): Battery_Status_Assessment_Service.TaggedAssessment = {
    return Battery_Status_Assessment_Service.TaggedAssessment.example()
  }

  def clear(): Unit = {
    offeredTicket = Battery_Status_Assessment_Service.ReportTicket.NoTicket
    retainedAssessment = Battery_Status_Assessment_Service.AssessmentResult.NoAssessment
  }

  def initialise(api: ResultCustody_Initialization_Api): Unit = {
    Contract(
      Modifies(api, faultHold, offeredTicket, retainedAssessment, committedOutcome)
    )
    faultHold = F
    clear()
    committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
    api.put_publication_outcome(committedOutcome)
    api.put_battery_assessment(noAssessment())
  }

  def timeTriggered(api: ResultCustody_Operational_Api): Unit = {
    Contract(
      Modifies(api, faultHold, offeredTicket, retainedAssessment, committedOutcome)
    )
    val feedback: Battery_Status_Assessment_Service.ControlUseFeedback = api.get_control_use_feedback() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.ControlUseFeedback.example()
    }
    val directive: Battery_Status_Assessment_Service.PublicationDirective.Type = api.get_publication_directive() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective
    }
    val decision: Battery_Status_Assessment_Service.TaggedAssessment = api.get_decision_assessment() match {
      case Some(value) => value
      case _ => Battery_Status_Assessment_Service.TaggedAssessment.example()
    }
    val neutralFeedback =
      feedback.ticket == Battery_Status_Assessment_Service.FeedbackTicket.NoTicket &&
      feedback.disposition == Battery_Status_Assessment_Service.UseDisposition.NoFeedback
    val matchingPending =
      (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenA &&
        feedback.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenA &&
        feedback.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending) ||
      (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenB &&
        feedback.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenB &&
        feedback.disposition == Battery_Status_Assessment_Service.UseDisposition.Pending)
    val matchingConsumed =
      (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenA &&
        feedback.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenA &&
        feedback.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed) ||
      (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenB &&
        feedback.ticket == Battery_Status_Assessment_Service.FeedbackTicket.TokenB &&
        feedback.disposition == Battery_Status_Assessment_Service.UseDisposition.Consumed)

    // As required by PRIOR_PUBLICATION_OUTCOME, this port carries the
    // committed outcome from the preceding evaluation.
    api.put_publication_outcome(committedOutcome)

    if (directive == Battery_Status_Assessment_Service.PublicationDirective.ResetPublication) {
      faultHold = F
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationReset
      api.put_battery_assessment(noAssessment())
    } else if (faultHold) {
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
      api.put_battery_assessment(noAssessment())
    } else if (!neutralFeedback && !matchingPending && !matchingConsumed) {
      faultHold = T
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault
      api.put_battery_assessment(noAssessment())
    } else if (offeredTicket != Battery_Status_Assessment_Service.ReportTicket.NoTicket &&
      matchingConsumed) {
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.Consumed
      api.put_battery_assessment(noAssessment())
    } else if (offeredTicket != Battery_Status_Assessment_Service.ReportTicket.NoTicket &&
      (directive == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA ||
       directive == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB)) {
      faultHold = T
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.PublicationFault
      api.put_battery_assessment(noAssessment())
    } else if (offeredTicket != Battery_Status_Assessment_Service.ReportTicket.NoTicket &&
      directive == Battery_Status_Assessment_Service.PublicationDirective.Withdraw &&
      (neutralFeedback || matchingPending)) {
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.Cancelled
      api.put_battery_assessment(noAssessment())
    } else if (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenA &&
      directive == Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective &&
      (neutralFeedback || matchingPending)) {
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA
      api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment(
        Battery_Status_Assessment_Service.ReportTicket.TokenA, retainedAssessment))
    } else if (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.TokenB &&
      directive == Battery_Status_Assessment_Service.PublicationDirective.NoPublicationDirective &&
      (neutralFeedback || matchingPending)) {
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB
      api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment(
        Battery_Status_Assessment_Service.ReportTicket.TokenB, retainedAssessment))
    } else if (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.NoTicket &&
      neutralFeedback &&
      directive == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenA &&
      decision.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenA &&
      decision.result != Battery_Status_Assessment_Service.AssessmentResult.NoAssessment) {
      offeredTicket = Battery_Status_Assessment_Service.ReportTicket.TokenA
      retainedAssessment = decision.result
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenA
      api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment(
        offeredTicket, retainedAssessment))
    } else if (offeredTicket == Battery_Status_Assessment_Service.ReportTicket.NoTicket &&
      neutralFeedback &&
      directive == Battery_Status_Assessment_Service.PublicationDirective.OpenTokenB &&
      decision.ticket == Battery_Status_Assessment_Service.ReportTicket.TokenB &&
      decision.result != Battery_Status_Assessment_Service.AssessmentResult.NoAssessment) {
      offeredTicket = Battery_Status_Assessment_Service.ReportTicket.TokenB
      retainedAssessment = decision.result
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.OfferedTokenB
      api.put_battery_assessment(Battery_Status_Assessment_Service.TaggedAssessment(
        offeredTicket, retainedAssessment))
    } else {
      // Inactive or structurally incomplete open/withdraw inputs never expose
      // a stale result.  A malformed feedback was handled above as a fault.
      clear()
      committedOutcome = Battery_Status_Assessment_Service.PublicationOutcome.NoPublicationOutcome
      api.put_battery_assessment(noAssessment())
    }
  }

  def finalise(api: ResultCustody_Operational_Api): Unit = { }
}
