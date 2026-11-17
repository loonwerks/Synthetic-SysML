// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_PHASE_APPLICABLE_BLOCKER
        //   Applicable qualification loss proposes a block or recovery | N.md#CASE_13
        (T) ___>: ((api.sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
          (api.sessionPhaseInput == ObservationSessionState.IDLE |
            api.sessionPhaseInput == ObservationSessionState.SUSPENDED) ___>:
          api.sessionProposal == SessionProposal.BLOCK_EVIDENCE) &
          (api.sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
            (api.sessionPhaseInput == ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == ObservationSessionState.QUEUED |
              api.sessionPhaseInput == ObservationSessionState.SENDING) ___>:
            api.sessionProposal == SessionProposal.RECOVER_EVIDENCE) &
          (api.sortieQualification == SortieQualification.BLOCKED_ENERGY &
            (api.sessionPhaseInput == ObservationSessionState.IDLE |
              api.sessionPhaseInput == ObservationSessionState.SUSPENDED) ___>:
            api.sessionProposal == SessionProposal.BLOCK_ENERGY) &
          (api.sortieQualification == SortieQualification.BLOCKED_ENERGY &
            (api.sessionPhaseInput == ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == ObservationSessionState.QUEUED |
              api.sessionPhaseInput == ObservationSessionState.SENDING) ___>:
            api.sessionProposal == SessionProposal.RECOVER_ENERGY) &
          (api.sortieQualification == SortieQualification.BLOCKED_CONTEXT &
            (api.sessionPhaseInput == ObservationSessionState.IDLE |
              api.sessionPhaseInput == ObservationSessionState.SUSPENDED) ___>:
            api.sessionProposal == SessionProposal.BLOCK_CONTEXT) &
          (api.sortieQualification == SortieQualification.BLOCKED_CONTEXT &
            (api.sessionPhaseInput == ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == ObservationSessionState.QUEUED |
              api.sessionPhaseInput == ObservationSessionState.SENDING) ___>:
            api.sessionProposal == SessionProposal.RECOVER_CONTEXT) &
          (api.sortieQualification == SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == ObservationSessionState.IDLE |
              api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
            api.cameraEvidence == CameraEvidence.UNAVAILABLE ___>:
            api.sessionProposal == SessionProposal.BLOCK_CAMERA) &
          (api.sortieQualification == SortieQualification.ELIGIBLE &
            api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            (api.cameraEvidence == CameraEvidence.UNAVAILABLE |
              api.cameraEvidence == CameraEvidence.FAILED) ___>:
            api.sessionProposal == SessionProposal.RECOVER_CAMERA) &
          (api.sortieQualification == SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == ObservationSessionState.IDLE |
              api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
            api.cameraEvidence != CameraEvidence.UNAVAILABLE &
            api.radioEvidence == RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == SessionProposal.BLOCK_RADIO) &
          (api.sortieQualification == SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
              api.cameraEvidence != CameraEvidence.UNAVAILABLE &
              api.cameraEvidence != CameraEvidence.FAILED |
              api.sessionPhaseInput == ObservationSessionState.QUEUED |
              api.sessionPhaseInput == ObservationSessionState.SENDING) &
            api.radioEvidence == RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == SessionProposal.RECOVER_RADIO)),
        // case CASE_14_AUTOMATIC_PROGRESS
        //   Only active qualified phases advance automatically | N.md#CASE_14
        (api.sortieQualification == SortieQualification.ELIGIBLE) ___>: ((api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
          api.cameraEvidence == CameraEvidence.CAPTURED &
          api.radioEvidence != RadioEvidence.UNAVAILABLE ___>:
          api.sessionProposal == SessionProposal.CAPTURE_COMPLETE) &
          (api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            api.cameraEvidence == CameraEvidence.READY &
            api.radioEvidence != RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == SessionProposal.HOLD) &
          (api.sessionPhaseInput == ObservationSessionState.QUEUED &
            api.radioEvidence != RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == SessionProposal.BEGIN_DELIVERY) &
          (api.sessionPhaseInput == ObservationSessionState.SENDING &
            api.radioEvidence == RadioEvidence.ACCEPTED ___>:
            api.sessionProposal == SessionProposal.DELIVERY_COMPLETE) &
          (api.sessionPhaseInput == ObservationSessionState.SENDING &
            api.radioEvidence == RadioEvidence.REJECTED ___>:
            api.sessionProposal == SessionProposal.DELIVERY_REJECTED) &
          (api.sessionPhaseInput == ObservationSessionState.SENDING &
            api.radioEvidence == RadioEvidence.READY ___>:
            api.sessionProposal == SessionProposal.HOLD)),
        // case CASE_15_NONACTIVE_STARTABLE
        //   Qualified nonactive session is startable | N.md#CASE_15
        (api.sortieQualification == SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == ObservationSessionState.IDLE |
            api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != CameraEvidence.UNAVAILABLE &
          api.radioEvidence != RadioEvidence.UNAVAILABLE) ___>: (api.sessionProposal == SessionProposal.STARTABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_sortieQualification(), api.get_cameraEvidence(), api.get_radioEvidence(), api.get_sessionPhaseInput()) match {
      case (Some(q), Some(c), Some(r), Some(p)) =>
        val result: SessionProposal.Type =
          if (q == SortieQualification.BLOCKED_EVIDENCE) if (p == ObservationSessionState.IDLE | p == ObservationSessionState.SUSPENDED) SessionProposal.BLOCK_EVIDENCE else SessionProposal.RECOVER_EVIDENCE
          else if (q == SortieQualification.BLOCKED_ENERGY) if (p == ObservationSessionState.IDLE | p == ObservationSessionState.SUSPENDED) SessionProposal.BLOCK_ENERGY else SessionProposal.RECOVER_ENERGY
          else if (q == SortieQualification.BLOCKED_CONTEXT) if (p == ObservationSessionState.IDLE | p == ObservationSessionState.SUSPENDED) SessionProposal.BLOCK_CONTEXT else SessionProposal.RECOVER_CONTEXT
          else if (p == ObservationSessionState.IDLE | p == ObservationSessionState.SUSPENDED) if (c == CameraEvidence.UNAVAILABLE) SessionProposal.BLOCK_CAMERA else if (r == RadioEvidence.UNAVAILABLE) SessionProposal.BLOCK_RADIO else SessionProposal.STARTABLE
          else if (p == ObservationSessionState.ACQUIRING) if (c == CameraEvidence.UNAVAILABLE | c == CameraEvidence.FAILED) SessionProposal.RECOVER_CAMERA else if (r == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO else if (c == CameraEvidence.CAPTURED) SessionProposal.CAPTURE_COMPLETE else SessionProposal.HOLD
          else if (p == ObservationSessionState.QUEUED) if (r == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO else SessionProposal.BEGIN_DELIVERY
          else if (r == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO else if (r == RadioEvidence.ACCEPTED) SessionProposal.DELIVERY_COMPLETE else if (r == RadioEvidence.REJECTED) SessionProposal.DELIVERY_REJECTED else SessionProposal.HOLD
        api.put_sessionProposal(result)
      case _ => api.put_sessionProposal(SessionProposal.BLOCK_EVIDENCE)
    }
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
