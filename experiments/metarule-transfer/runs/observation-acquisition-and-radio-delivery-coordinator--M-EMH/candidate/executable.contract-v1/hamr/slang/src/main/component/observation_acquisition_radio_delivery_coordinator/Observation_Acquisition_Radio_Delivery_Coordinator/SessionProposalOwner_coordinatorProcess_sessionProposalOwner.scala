// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_PHASE_APPLICABLE_BLOCKER
        //   Applicable qualification loss proposes blocking or recovery
        (api.sortieQualification != SortieQualification.ELIGIBLE |
          (api.sessionPhaseInput == ObservationSessionState.IDLE |
            api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
            (api.cameraEvidence == CameraEvidence.UNAVAILABLE |
              api.radioEvidence == RadioEvidence.UNAVAILABLE) |
          api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            (api.cameraEvidence == CameraEvidence.UNAVAILABLE |
              api.cameraEvidence == CameraEvidence.FAILED |
              api.radioEvidence == RadioEvidence.UNAVAILABLE) |
          (api.sessionPhaseInput == ObservationSessionState.QUEUED |
            api.sessionPhaseInput == ObservationSessionState.SENDING) &
            api.radioEvidence == RadioEvidence.UNAVAILABLE) ___>: ((api.sortieQualification == SortieQualification.BLOCKED_EVIDENCE &
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
        //   Active qualified sessions progress from relevant evidence
        (api.sortieQualification == SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            api.cameraEvidence != CameraEvidence.UNAVAILABLE &
            api.cameraEvidence != CameraEvidence.FAILED &
            api.radioEvidence != RadioEvidence.UNAVAILABLE |
            (api.sessionPhaseInput == ObservationSessionState.QUEUED |
              api.sessionPhaseInput == ObservationSessionState.SENDING) &
              api.radioEvidence != RadioEvidence.UNAVAILABLE)) ___>: ((api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
          api.cameraEvidence == CameraEvidence.CAPTURED ___>:
          api.sessionProposal == SessionProposal.CAPTURE_COMPLETE) &
          (api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            api.cameraEvidence == CameraEvidence.READY ___>:
            api.sessionProposal == SessionProposal.HOLD) &
          (api.sessionPhaseInput == ObservationSessionState.QUEUED ___>:
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
        //   Qualified nonactive sessions are startable
        (api.sortieQualification == SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == ObservationSessionState.IDLE |
            api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != CameraEvidence.UNAVAILABLE &
          api.radioEvidence != RadioEvidence.UNAVAILABLE) ___>: (api.sessionProposal == SessionProposal.STARTABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val qualification = api.get_sortieQualification()
    val camera = api.get_cameraEvidence()
    val radio = api.get_radioEvidence()
    val phase = api.get_sessionPhaseInput()
    val inactive = phase == Some(ObservationSessionState.IDLE) || phase == Some(ObservationSessionState.SUSPENDED)

    if (qualification == Some(SortieQualification.BLOCKED_EVIDENCE)) {
      api.put_sessionProposal(if (inactive) SessionProposal.BLOCK_EVIDENCE else SessionProposal.RECOVER_EVIDENCE)
    } else if (qualification == Some(SortieQualification.BLOCKED_ENERGY)) {
      api.put_sessionProposal(if (inactive) SessionProposal.BLOCK_ENERGY else SessionProposal.RECOVER_ENERGY)
    } else if (qualification == Some(SortieQualification.BLOCKED_CONTEXT)) {
      api.put_sessionProposal(if (inactive) SessionProposal.BLOCK_CONTEXT else SessionProposal.RECOVER_CONTEXT)
    } else if (inactive) {
      if (camera == Some(CameraEvidence.UNAVAILABLE)) {
        api.put_sessionProposal(SessionProposal.BLOCK_CAMERA)
      } else if (radio == Some(RadioEvidence.UNAVAILABLE)) {
        api.put_sessionProposal(SessionProposal.BLOCK_RADIO)
      } else {
        api.put_sessionProposal(SessionProposal.STARTABLE)
      }
    } else if (phase == Some(ObservationSessionState.ACQUIRING)) {
      if (camera == Some(CameraEvidence.UNAVAILABLE) || camera == Some(CameraEvidence.FAILED)) {
        api.put_sessionProposal(SessionProposal.RECOVER_CAMERA)
      } else if (radio == Some(RadioEvidence.UNAVAILABLE)) {
        api.put_sessionProposal(SessionProposal.RECOVER_RADIO)
      } else if (camera == Some(CameraEvidence.CAPTURED)) {
        api.put_sessionProposal(SessionProposal.CAPTURE_COMPLETE)
      } else {
        api.put_sessionProposal(SessionProposal.HOLD)
      }
    } else if (phase == Some(ObservationSessionState.QUEUED)) {
      api.put_sessionProposal(if (radio == Some(RadioEvidence.UNAVAILABLE)) SessionProposal.RECOVER_RADIO else SessionProposal.BEGIN_DELIVERY)
    } else if (phase == Some(ObservationSessionState.SENDING)) {
      if (radio == Some(RadioEvidence.UNAVAILABLE)) {
        api.put_sessionProposal(SessionProposal.RECOVER_RADIO)
      } else if (radio == Some(RadioEvidence.ACCEPTED)) {
        api.put_sessionProposal(SessionProposal.DELIVERY_COMPLETE)
      } else if (radio == Some(RadioEvidence.REJECTED)) {
        api.put_sessionProposal(SessionProposal.DELIVERY_REJECTED)
      } else {
        api.put_sessionProposal(SessionProposal.HOLD)
      }
    } else {
      api.put_sessionProposal(SessionProposal.HOLD)
    }
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
