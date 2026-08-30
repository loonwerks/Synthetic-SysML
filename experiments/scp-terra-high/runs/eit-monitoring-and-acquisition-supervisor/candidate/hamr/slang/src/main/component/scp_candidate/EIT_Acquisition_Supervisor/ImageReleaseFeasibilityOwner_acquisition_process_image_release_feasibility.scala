// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ImageReleaseFeasibilityOwner_acquisition_process_image_release_feasibility {

  def initialise(api: ImageReleaseFeasibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_release_proposal(EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)
  }

  def timeTriggered(api: ImageReleaseFeasibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    val session: EIT_Acquisition_Supervisor.SessionFrame = api.get_session_frame().get
    val image: EIT_Acquisition_Supervisor.ImageFrame = api.get_image_frame().get
    var result: EIT_Acquisition_Supervisor.Proposal.Type = EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN &&
          session.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING &&
          image.imageState == EIT_Acquisition_Supervisor.ImageState.AVAILABLE) {
      result = EIT_Acquisition_Supervisor.Proposal.PROPOSED
    }
    api.put_release_proposal(result)
  }

  def finalise(api: ImageReleaseFeasibilityOwner_Operational_Api): Unit = { }
}
