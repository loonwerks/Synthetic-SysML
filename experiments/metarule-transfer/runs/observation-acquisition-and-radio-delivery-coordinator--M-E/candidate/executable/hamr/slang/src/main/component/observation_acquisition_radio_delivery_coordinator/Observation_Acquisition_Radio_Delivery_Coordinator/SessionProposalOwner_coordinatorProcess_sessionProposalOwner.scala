// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(T)
      /*
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_13_PHASE_APPLICABLE_BLOCKER
        (api.sortieQualification != Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE |
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
            (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
              api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) |
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
              api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED |
              api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) |
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) ___>: ((api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) ___>:
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
            api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
              api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED) ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
            api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO) &
          (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
              api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
              api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO)),
        // case CASE_14_AUTOMATIC_PROGRESS
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
            api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED &
            api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE |
            (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
              api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) &
              api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)) ___>: ((api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
          api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED ___>:
          api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE) &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
            api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD) &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY) &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE) &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED) &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
            api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY ___>:
            api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD)),
        // case CASE_15_NONACTIVE_STARTABLE
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) ___>: (api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE)
        // END COMPUTE ENSURES timeTriggered
      */
    )
    val sortieQualification = api.get_sortieQualification().get
    val cameraEvidence = api.get_cameraEvidence().get
    val radioEvidence = api.get_radioEvidence().get
    val sessionPhaseInput = api.get_sessionPhaseInput().get
    if (sortieQualification != Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE) {
      val active = sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING |
        sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
        sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING
      if (sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE) {
        api.put_sessionProposal(if (active) Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE else Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
      } else if (sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY) {
        api.put_sessionProposal(if (active) Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY else Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY)
      } else {
        api.put_sessionProposal(if (active) Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT else Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT)
      }
    } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
      sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) {
      if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA)
      } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO)
      } else {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE)
      }
    } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) {
      if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
        cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA)
      } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO)
      } else if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE)
      } else {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD)
      }
    } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) {
      api.put_sessionProposal(if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO else Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY)
    } else {
      if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO)
      } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE)
      } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED) {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED)
      } else {
        api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD)
      }
    }
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
