// #Sireum

package scp_candidate.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor {

  def initialise(api: ObservationSupportAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_SUPPORT_VERDICT
        api.supportVerdictOut.ticket == TaggedTicket.NoTicket &
          api.supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supportVerdictOut(TaggedSupportVerdict(
      SupportVerdict.NoSupportVerdict,
      TaggedTicket.NoTicket))
  }

  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    Contract(Modifies(api))
    val ticket: Option[EvaluationTicket.Type] = api.get_evaluationTicket()
    val camera: Option[CameraEvidence.Type] = api.get_cameraEvidence()
    val radio: Option[RadioEvidence.Type] = api.get_radioEvidence()
    val result: TaggedSupportVerdict = (ticket, camera, radio) match {
      case (Some(EvaluationTicket.TokenA), Some(CameraEvidence.AvailableCurrent), Some(RadioEvidence.AvailableCurrent)) =>
        TaggedSupportVerdict(SupportVerdict.SupportReady, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), Some(CameraEvidence.AvailableCurrent), Some(RadioEvidence.AvailableCurrent)) =>
        TaggedSupportVerdict(SupportVerdict.SupportReady, TaggedTicket.TokenB)
      case (Some(EvaluationTicket.TokenA), Some(CameraEvidence.UnavailableCurrent), _) =>
        TaggedSupportVerdict(SupportVerdict.SupportUnavailable, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenA), _, Some(RadioEvidence.UnavailableCurrent)) =>
        TaggedSupportVerdict(SupportVerdict.SupportUnavailable, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), Some(CameraEvidence.UnavailableCurrent), _) =>
        TaggedSupportVerdict(SupportVerdict.SupportUnavailable, TaggedTicket.TokenB)
      case (Some(EvaluationTicket.TokenB), _, Some(RadioEvidence.UnavailableCurrent)) =>
        TaggedSupportVerdict(SupportVerdict.SupportUnavailable, TaggedTicket.TokenB)
      case (Some(EvaluationTicket.TokenA), _, _) =>
        TaggedSupportVerdict(SupportVerdict.SupportUntrusted, TaggedTicket.TokenA)
      case (Some(EvaluationTicket.TokenB), _, _) =>
        TaggedSupportVerdict(SupportVerdict.SupportUntrusted, TaggedTicket.TokenB)
      case _ => TaggedSupportVerdict(SupportVerdict.NoSupportVerdict, TaggedTicket.NoTicket)
    }
    api.put_supportVerdictOut(result)
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }
}
