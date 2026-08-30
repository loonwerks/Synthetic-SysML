// #Sireum

package forest_observation_eligibility_supervisor.Forest_Observation_Eligibility_Supervisor

import org.sireum._
import forest_observation_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ObservationSupportAssessor_eligibilitySupervisionProcess_observationSupportAssessor {

  def initialise(api: ObservationSupportAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_supportVerdictOut(Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict.example())
  }

  def timeTriggered(api: ObservationSupportAssessor_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case SUPPORT_INACTIVE
        //   if evaluationTicket is NoTicket
        (api.evaluationTicket == EvaluationTicket.NoTicket) ___>: (api.supportVerdictOut.ticket == TaggedTicket.NoTicket &
          api.supportVerdictOut.verdict == SupportVerdict.NoSupportVerdict),
        // case SUPPORT_READY
        //   if evaluationTicket is not NoTicket and cameraEvidence and radioEvidence are AvailableCurrent
        (api.evaluationTicket != EvaluationTicket.NoTicket &
          api.cameraEvidence == CameraEvidence.AvailableCurrent &
          api.radioEvidence == RadioEvidence.AvailableCurrent) ___>: ((api.evaluationTicket == EvaluationTicket.TokenA ___>:
          api.supportVerdictOut.ticket == TaggedTicket.TokenA) &
          (api.evaluationTicket == EvaluationTicket.TokenB ___>:
            api.supportVerdictOut.ticket == TaggedTicket.TokenB) &
          api.supportVerdictOut.verdict == SupportVerdict.SupportReady),
        // case SUPPORT_UNTRUSTED
        //   if evaluationTicket is not NoTicket and any support evidence is UnknownCurrent Invalid or Stale
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
        //   if evaluationTicket is not NoTicket, camera and radio evidence are not untrustworthy, and at least one is UnavailableCurrent
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
    // example api usage

    val apiUsage_cameraEvidence: Option[Forest_Observation_Eligibility_Supervisor.CameraEvidence.Type] = api.get_cameraEvidence()
    api.logInfo(s"Received on data port cameraEvidence: ${apiUsage_cameraEvidence}")
    val apiUsage_radioEvidence: Option[Forest_Observation_Eligibility_Supervisor.RadioEvidence.Type] = api.get_radioEvidence()
    api.logInfo(s"Received on data port radioEvidence: ${apiUsage_radioEvidence}")
    val apiUsage_evaluationTicket: Option[Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type] = api.get_evaluationTicket()
    api.logInfo(s"Received on data port evaluationTicket: ${apiUsage_evaluationTicket}")
  }

  def finalise(api: ObservationSupportAssessor_Operational_Api): Unit = { }
}
