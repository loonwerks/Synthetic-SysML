// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResultComposition_supervisor_process_result_composition {

  def initialise(api: ResultComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_access_result(Docking_Access_Supervisor.DockingAccessResult(
      Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.PublicMode.HOLDING, Docking_Access_Supervisor.Correlation.NONE,
      Docking_Access_Supervisor.RequestDisposition.NO_REQUEST,
      Docking_Access_Supervisor.AccessStatus.CLOSED, Docking_Access_Supervisor.DockingOutcome.NONE))
  }

  def timeTriggered(api: ResultComposition_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_docking_access_result(Docking_Access_Supervisor.DockingAccessResult(
      Docking_Access_Supervisor.SupervisoryAction.HOLD,
      Docking_Access_Supervisor.DecisionCause.NO_ELIGIBLE_ACTION,
      Docking_Access_Supervisor.PublicMode.HOLDING, Docking_Access_Supervisor.Correlation.NONE,
      Docking_Access_Supervisor.RequestDisposition.NO_REQUEST,
      Docking_Access_Supervisor.AccessStatus.CLOSED, Docking_Access_Supervisor.DockingOutcome.NONE))
  }

  def finalise(api: ResultComposition_Operational_Api): Unit = { }
}
