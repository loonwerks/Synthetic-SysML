// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object UndockingActionEligibility_supervisor_process_undocking_action_eligibility {

  def initialise(api: UndockingActionEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_undocking_proposal(Docking_Access_Supervisor.UndockingProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def timeTriggered(api: UndockingActionEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_undocking_proposal(Docking_Access_Supervisor.UndockingProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def finalise(api: UndockingActionEligibility_Operational_Api): Unit = { }
}
