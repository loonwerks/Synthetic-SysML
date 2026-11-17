// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor {

  def initialise(api: ObservationSupportAssessor_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_supportVerdictOut(
      Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
        Forest_Observation_Eligibility_Supervisor.SupportVerdict.NoSupportVerdict,
        Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket))
  }

  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val ticket = api.get_evaluationTicket()
    val camera = api.get_cameraEvidence()
    val radio = api.get_radioEvidence()
    val output: Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict = (ticket, camera, radio) match {
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.AvailableCurrent),
            Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.AvailableCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.AvailableCurrent),
            Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.AvailableCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA),
            Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.UnavailableCurrent), _) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB),
            Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.UnavailableCurrent), _) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA), _,
            Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.UnavailableCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB), _,
            Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.UnavailableCurrent)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA), Some(_), Some(_)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA)
      case (Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB), Some(_), Some(_)) =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB)
      case _ =>
        Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
          Forest_Observation_Eligibility_Supervisor.SupportVerdict.NoSupportVerdict,
          Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket)
    }
    api.put_supportVerdictOut(output)
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }
}
