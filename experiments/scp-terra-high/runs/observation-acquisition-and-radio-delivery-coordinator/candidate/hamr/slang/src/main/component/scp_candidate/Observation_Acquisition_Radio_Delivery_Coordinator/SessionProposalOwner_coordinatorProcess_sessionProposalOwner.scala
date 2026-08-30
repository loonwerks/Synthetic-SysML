// #Sireum

package scp_candidate.Observation_Acquisition_Radio_Delivery_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SessionProposalOwner_coordinatorProcess_sessionProposalOwner {

  def initialise(api: SessionProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_sessionProposal(Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE)
  }

  def timeTriggered(api: SessionProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val qualification: Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.Type = api.get_sortieQualification().get
    val camera: Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.Type = api.get_cameraEvidence().get
    val radio: Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.Type = api.get_radioEvidence().get
    val phase: Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.Type = api.get_sessionPhaseInput().get
    val active: B = phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING ||
      phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED ||
      phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SENDING

    var proposal: Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.Type =
      Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.HOLD
    if (qualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_EVIDENCE) {
      if (active) { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_EVIDENCE }
      else { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_EVIDENCE }
    } else if (qualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_ENERGY) {
      if (active) { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_ENERGY }
      else { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_ENERGY }
    } else if (qualification == Observation_Acquisition_Radio_Delivery_Coordinator.SortieQualification.BLOCKED_CONTEXT) {
      if (active) { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CONTEXT }
      else { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CONTEXT }
    } else if (phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.IDLE ||
        phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.SUSPENDED) {
      if (camera == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_CAMERA
      } else if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BLOCK_RADIO
      } else {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.STARTABLE
      }
    } else if (phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.ACQUIRING) {
      if (camera == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.UNAVAILABLE ||
          camera == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.FAILED) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_CAMERA
      } else if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
      } else if (camera == Observation_Acquisition_Radio_Delivery_Coordinator.CameraEvidence.CAPTURED) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.CAPTURE_COMPLETE
      }
    } else if (phase == Observation_Acquisition_Radio_Delivery_Coordinator.ObservationSessionState.QUEUED) {
      if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
      } else { proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.BEGIN_DELIVERY }
    } else {
      if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.UNAVAILABLE) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.RECOVER_RADIO
      } else if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.ACCEPTED) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_COMPLETE
      } else if (radio == Observation_Acquisition_Radio_Delivery_Coordinator.RadioEvidence.REJECTED) {
        proposal = Observation_Acquisition_Radio_Delivery_Coordinator.SessionProposal.DELIVERY_REJECTED
      }
    }
    api.put_sessionProposal(proposal)
  }

  def finalise(api: SessionProposalOwner_Operational_Api): Unit = { }
}
