// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility {

  def initialise(api: ImageReleaseFeasibilityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_release_proposal(EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)
  }

  def timeTriggered(api: ImageReleaseFeasibilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )
    val recovery_frame: EIT_Acquisition_Supervisor.RecoveryFrame =
      api.get_recovery_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.RecoveryFrame) => v
        case _ => EIT_Acquisition_Supervisor.RecoveryFrame.example()
      }

    val session_frame: EIT_Acquisition_Supervisor.SessionFrame =
      api.get_session_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.SessionFrame) => v
        case _ => EIT_Acquisition_Supervisor.SessionFrame.example()
      }

    val image_frame: EIT_Acquisition_Supervisor.ImageFrame =
      api.get_image_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.ImageFrame) => v
        case _ => EIT_Acquisition_Supervisor.ImageFrame.example()
      }

    val release_proposal: EIT_Acquisition_Supervisor.Proposal.Type =
      if (recovery_frame.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN &&
          session_frame.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING &&
          image_frame.imageState == EIT_Acquisition_Supervisor.ImageState.AVAILABLE) {
        EIT_Acquisition_Supervisor.Proposal.PROPOSED
      } else {
        EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
      }

    api.put_release_proposal(release_proposal)
  }

  def finalise(api: ImageReleaseFeasibilityOwner_Operational_Api): Unit = { }
}
