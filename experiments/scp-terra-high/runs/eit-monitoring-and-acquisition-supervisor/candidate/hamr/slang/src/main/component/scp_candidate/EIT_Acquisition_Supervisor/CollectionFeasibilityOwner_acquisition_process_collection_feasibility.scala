// #Sireum

package scp_candidate.EIT_Acquisition_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CollectionFeasibilityOwner_acquisition_process_collection_feasibility {

  def initialise(api: CollectionFeasibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_collection_proposal(EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED)
  }

  def timeTriggered(api: CollectionFeasibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    val recovery: EIT_Acquisition_Supervisor.RecoveryFrame = api.get_recovery_frame().get
    val session: EIT_Acquisition_Supervisor.SessionFrame = api.get_session_frame().get
    val cycle: EIT_Acquisition_Supervisor.CycleFrame = api.get_cycle_frame().get
    var result: EIT_Acquisition_Supervisor.Proposal.Type = EIT_Acquisition_Supervisor.Proposal.NOT_PROPOSED
    if (recovery.recoveryGate == EIT_Acquisition_Supervisor.RecoveryGate.OPEN &&
          session.sessionState == EIT_Acquisition_Supervisor.SessionState.MONITORING &&
          cycle.cycleState == EIT_Acquisition_Supervisor.CycleState.READY) {
      result = EIT_Acquisition_Supervisor.Proposal.PROPOSED
    }
    api.put_collection_proposal(result)
  }

  def finalise(api: CollectionFeasibilityOwner_Operational_Api): Unit = { }
}
