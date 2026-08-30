// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockingActionArbitration_supervisor_process_docking_action_arbitration {

  def initialise(api: DockingActionArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_decision(Docking_Access_Supervisor.DockingDecisionFrame(
      Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def timeTriggered(api: DockingActionArbitration_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_decision(Docking_Access_Supervisor.DockingDecisionFrame(
      Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.Correlation.NONE, Docking_Access_Supervisor.DecisionContext.CLEAR))
  }

  def finalise(api: DockingActionArbitration_Operational_Api): Unit = { }
}
