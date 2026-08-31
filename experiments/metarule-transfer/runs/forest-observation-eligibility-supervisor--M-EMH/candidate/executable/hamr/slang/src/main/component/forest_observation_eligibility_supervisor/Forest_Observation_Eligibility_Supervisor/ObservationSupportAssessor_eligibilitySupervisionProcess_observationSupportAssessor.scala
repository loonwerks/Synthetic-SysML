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
    api.put_supportVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(
      Forest_Observation_Eligibility_Supervisor.SupportVerdict.NoSupportVerdict,
      Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket))
  }

  @helper
  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    val camera = api.get_cameraEvidence()
    val radio = api.get_radioEvidence()
    val ticket = api.get_evaluationTicket()
    val noVerdict = Forest_Observation_Eligibility_Supervisor.SupportVerdict.NoSupportVerdict
    val noTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.NoTicket

    var verdict = noVerdict
    var taggedTicket = noTicket

    ticket match {
      case Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenA) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenA
        verdict = supportVerdict(camera, radio)
      case Some(Forest_Observation_Eligibility_Supervisor.EvaluationTicket.TokenB) =>
        taggedTicket = Forest_Observation_Eligibility_Supervisor.TaggedTicket.TokenB
        verdict = supportVerdict(camera, radio)
      case _ =>
    }

    api.put_supportVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict(verdict, taggedTicket))
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }

  def supportVerdict(
    camera: Option[Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type],
    radio: Option[Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type]): Forest_Observation_Eligibility_Supervisor.SupportVerdict.Type = {
    (camera, radio) match {
      case (Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.AvailableCurrent),
            Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.AvailableCurrent)) =>
        return Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportReady
      case (Some(Forest_Observation_Eligibility_Supervisor.CameraEvidence.UnavailableCurrent), _) =>
        return Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable
      case (_, Some(Forest_Observation_Eligibility_Supervisor.RadioEvidence.UnavailableCurrent)) =>
        return Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUnavailable
      case _ =>
        return Forest_Observation_Eligibility_Supervisor.SupportVerdict.SupportUntrusted
    }
  }
}
