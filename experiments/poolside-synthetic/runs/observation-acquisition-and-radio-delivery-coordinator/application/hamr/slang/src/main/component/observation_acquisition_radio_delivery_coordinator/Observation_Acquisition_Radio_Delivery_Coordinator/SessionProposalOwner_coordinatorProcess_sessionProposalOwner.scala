// #Sireum

package observation_acquisition_radio_delivery_coordinator.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import observation_acquisition_radio_delivery_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE
      )
    )
    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // CASE_13_PHASE_APPLICABLE_BLOCKER
        (api.sortieQualification != Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
          api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
          (api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
            api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED))
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
          api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
          api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO) &
        // CASE_14_AUTOMATIC_PROGRESS
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
          api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING &
          api.cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.READY &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED) &
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE &
          api.radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.READY)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD) &
        // CASE_15_NONACTIVE_STARTABLE
        (api.sortieQualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE &
          (api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE |
            api.sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) &
          api.cameraEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE &
          api.radioEvidence != Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE)
          ->:(api.sessionProposal == Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE)
      )
    )

    val sortieQualificationOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type] = api.get_sortieQualification()
    val cameraEvidenceOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type] = api.get_cameraEvidence()
    val radioEvidenceOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type] = api.get_radioEvidence()
    val sessionPhaseInputOpt: Option[Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type] = api.get_sessionPhaseInput()

    val sortieQualification: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type = sortieQualificationOpt.get
    val cameraEvidence: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type = cameraEvidenceOpt.get
    val radioEvidence: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type = radioEvidenceOpt.get
    val sessionPhaseInput: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = sessionPhaseInputOpt.get

    val proposal: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type =
      if (sortieQualification != Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.ELIGIBLE) {
        Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE
      } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) {
        if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE |
          cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA
        } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
        } else if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE
        } else {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD
        }
      } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) {
        if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
        } else {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY
        }
      } else if (sessionPhaseInput == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING) {
        if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
        } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE
        } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED
        } else {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD
        }
      } else {
        // IDLE or SUSPENDED
        if (cameraEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE
        } else if (radioEvidence == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO
        } else {
          Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE
        }
      }

    api.put_sessionProposal(proposal)
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
