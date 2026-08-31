// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_PHASE_APPLICABLE_BLOCKER
        (api.sortieQualification != SortieQualification.ELIGIBLE |
          api.sortieQualification == SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == ObservationSessionState.IDLE |
              api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
            (api.cameraEvidence == CameraEvidence.UNAVAILABLE |
              api.radioEvidence == RadioEvidence.UNAVAILABLE) |
          api.sortieQualification == SortieQualification.ELIGIBLE &
            api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            (api.cameraEvidence == CameraEvidence.UNAVAILABLE |
              api.cameraEvidence == CameraEvidence.FAILED |
              api.radioEvidence == RadioEvidence.UNAVAILABLE) |
          api.sortieQualification == SortieQualification.ELIGIBLE &
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
        (api.sortieQualification == SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == ObservationSessionState.ACQUIRING &
            api.cameraEvidence != CameraEvidence.UNAVAILABLE &
            api.cameraEvidence != CameraEvidence.FAILED &
            api.radioEvidence != RadioEvidence.UNAVAILABLE |
            api.sessionPhaseInput == ObservationSessionState.QUEUED &
              api.radioEvidence != RadioEvidence.UNAVAILABLE |
            api.sessionPhaseInput == ObservationSessionState.SENDING &
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
        (api.sortieQualification == SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == ObservationSessionState.IDLE |
            api.sessionPhaseInput == ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != CameraEvidence.UNAVAILABLE &
          api.radioEvidence != RadioEvidence.UNAVAILABLE) ___>: (api.sessionProposal == SessionProposal.STARTABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val qualification = api.get_sortieQualification().get
    val camera = api.get_cameraEvidence().get
    val radio = api.get_radioEvidence().get
    val phase = api.get_sessionPhaseInput().get
    val inactive = phase == ObservationSessionState.IDLE | phase == ObservationSessionState.SUSPENDED

    val proposal: SessionProposal.Type =
      if (qualification == SortieQualification.BLOCKED_EVIDENCE) {
        if (inactive) SessionProposal.BLOCK_EVIDENCE else SessionProposal.RECOVER_EVIDENCE
      } else if (qualification == SortieQualification.BLOCKED_ENERGY) {
        if (inactive) SessionProposal.BLOCK_ENERGY else SessionProposal.RECOVER_ENERGY
      } else if (qualification == SortieQualification.BLOCKED_CONTEXT) {
        if (inactive) SessionProposal.BLOCK_CONTEXT else SessionProposal.RECOVER_CONTEXT
      } else if (inactive) {
        if (camera == CameraEvidence.UNAVAILABLE) SessionProposal.BLOCK_CAMERA
        else if (radio == RadioEvidence.UNAVAILABLE) SessionProposal.BLOCK_RADIO
        else SessionProposal.STARTABLE
      } else if (phase == ObservationSessionState.ACQUIRING) {
        if (camera == CameraEvidence.UNAVAILABLE | camera == CameraEvidence.FAILED) SessionProposal.RECOVER_CAMERA
        else if (radio == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO
        else if (camera == CameraEvidence.CAPTURED) SessionProposal.CAPTURE_COMPLETE
        else SessionProposal.HOLD
      } else if (phase == ObservationSessionState.QUEUED) {
        if (radio == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO
        else SessionProposal.BEGIN_DELIVERY
      } else if (phase == ObservationSessionState.SENDING) {
        if (radio == RadioEvidence.UNAVAILABLE) SessionProposal.RECOVER_RADIO
        else if (radio == RadioEvidence.ACCEPTED) SessionProposal.DELIVERY_COMPLETE
        else if (radio == RadioEvidence.REJECTED) SessionProposal.DELIVERY_REJECTED
        else SessionProposal.HOLD
      } else {
        SessionProposal.HOLD
      }
    api.put_sessionProposal(proposal)
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
