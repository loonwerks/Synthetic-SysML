// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockingActionEligibility_supervisor_process_docking_action_eligibility {

  def initialise(api: DockingActionEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_proposal(Docking_Access_Supervisor.DockingProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def timeTriggered(api: DockingActionEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_proposal(Docking_Access_Supervisor.DockingProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def finalise(api: DockingActionEligibility_Operational_Api): Unit = { }
}
