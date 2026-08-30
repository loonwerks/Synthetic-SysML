// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AccessActionEligibility_supervisor_process_access_action_eligibility {

  def initialise(api: AccessActionEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_access_proposal(Docking_Access_Supervisor.AccessProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def timeTriggered(api: AccessActionEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_access_proposal(Docking_Access_Supervisor.AccessProposal(
      F, Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def finalise(api: AccessActionEligibility_Operational_Api): Unit = { }
}
