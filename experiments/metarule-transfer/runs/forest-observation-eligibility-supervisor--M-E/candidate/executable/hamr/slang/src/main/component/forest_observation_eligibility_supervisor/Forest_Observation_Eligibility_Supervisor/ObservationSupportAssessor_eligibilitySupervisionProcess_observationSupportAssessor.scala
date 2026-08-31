// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor {

  def initialise(api: ObservationSupportAssessor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_supportVerdictOut(TaggedSupportVerdict(SupportVerdict.NoSupportVerdict, TaggedTicket.NoTicket))
  }

  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case SUPPORT_INACTIVE
        //   N.md SUPPORT_INACTIVE
        (api.evaluationTicket == EvaluationTicket.NoTicket) ___>: (api.supportVerdictOut.ticket == TaggedTicket.NoTicket &
          api.supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict),
        // case SUPPORT_READY
        //   N.md SUPPORT_READY
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.cameraEvidence == CameraEvidence.AvailableCurrent &
          api.radioEvidence == RadioEvidence.AvailableCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.supportVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.supportVerdictOut.ticket == TaggedTicket.TokenB) &
          api.supportVerdictOut.verdict == SupportVerdict.SupportReady),
        // case SUPPORT_UNTRUSTED
        //   N.md SUPPORT_UNTRUSTED
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          (api.cameraEvidence == CameraEvidence.UnknownCurrent |
            api.cameraEvidence == CameraEvidence.Invalid |
            api.cameraEvidence == CameraEvidence.Stale |
            api.radioEvidence == RadioEvidence.UnknownCurrent |
            api.radioEvidence == RadioEvidence.Invalid |
            api.radioEvidence == RadioEvidence.Stale)) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.supportVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.supportVerdictOut.ticket == TaggedTicket.TokenB) &
          api.supportVerdictOut.verdict == SupportVerdict.SupportUntrusted),
        // case SUPPORT_UNAVAILABLE
        //   N.md SUPPORT_UNAVAILABLE
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.cameraEvidence != CameraEvidence.UnknownCurrent &
          api.cameraEvidence != CameraEvidence.Invalid &
          api.cameraEvidence != CameraEvidence.Stale &
          api.radioEvidence != RadioEvidence.UnknownCurrent &
          api.radioEvidence != RadioEvidence.Invalid &
          api.radioEvidence != RadioEvidence.Stale &
          (api.cameraEvidence == CameraEvidence.UnavailableCurrent |
            api.radioEvidence == RadioEvidence.UnavailableCurrent)) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.supportVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.supportVerdictOut.ticket == TaggedTicket.TokenB) &
          api.supportVerdictOut.verdict == SupportVerdict.SupportUnavailable)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val camera = api.get_cameraEvidence().get
    val radio = api.get_radioEvidence().get
    val ticket = api.get_evaluationTicket().get
    val taggedTicket: TaggedTicket.Type = ticket match {
      case EvaluationTicket.TokenA => TaggedTicket.TokenA
      case EvaluationTicket.TokenB => TaggedTicket.TokenB
      case _ => TaggedTicket.NoTicket
    }
    val untrusted = camera == CameraEvidence.UnknownCurrent |
      camera == CameraEvidence.Invalid |
      camera == CameraEvidence.Stale |
      radio == RadioEvidence.UnknownCurrent |
      radio == RadioEvidence.Invalid |
      radio == RadioEvidence.Stale
    val unavailable = camera == CameraEvidence.UnavailableCurrent |
      radio == RadioEvidence.UnavailableCurrent
    val verdict: SupportVerdict.Type =
      if (ticket == EvaluationTicket.NoTicket) SupportVerdict.NoSupportVerdict
      else if (camera == CameraEvidence.AvailableCurrent & radio == RadioEvidence.AvailableCurrent) SupportVerdict.SupportReady
      else if (untrusted) SupportVerdict.SupportUntrusted
      else if (unavailable) SupportVerdict.SupportUnavailable
      else SupportVerdict.SupportUntrusted
    api.put_supportVerdictOut(TaggedSupportVerdict(verdict, taggedTicket))
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }
}
