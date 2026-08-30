// #Sireum

package eit_acquisition_supervisor.EIT_Acquisition_Supervisor

import org.sireum._
import eit_acquisition_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CollectionFeasibilityOwner_acquisition_process_collection_feasibility {

  def initialise(api: CollectionFeasibilityOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_collection_proposal(EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)
  }

  def timeTriggered(api: CollectionFeasibilityOwner_Operational_Api): Unit = {
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

    val cycle_frame: EIT_Acquisition_Supervisor.CycleFrame =
      api.get_cycle_frame() match {
        case Some(v: EIT_Acquisition_Supervisor.CycleFrame) => v
        case _ => EIT_Acquisition_Supervisor.CycleFrame.example()
      }

    val collection_proposal: EIT_Acquisition_Supervisor.Proposal.Type =
      if (recovery_frame.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN &&
          session_frame.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING &&
          cycle_frame.cycleState == EIT_Acquisition_Supervisor.CycleState.READY) {
        EIT_Acquisition_Supervisor.Proposal.PROPOSED
      } else {
        EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
      }

    api.put_collection_proposal(collection_proposal)
  }

  def finalise(api: CollectionFeasibilityOwner_Operational_Api): Unit = { }
}
