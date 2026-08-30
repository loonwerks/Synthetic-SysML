// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DockingLifecycle_supervisor_process_docking_lifecycle {

  def initialise(api: DockingLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_lifecycle_view(Docking_Access_Supervisor.PriorLifecycleView(
      Docking_Access_Supervisor.LifecycleState.CLEAR_IDLE, Docking_Access_Supervisor.Correlation.NONE))
  }

  def timeTriggered(api: DockingLifecycle_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_lifecycle_view(Docking_Access_Supervisor.PriorLifecycleView(
      Docking_Access_Supervisor.LifecycleState.CLEAR_IDLE, Docking_Access_Supervisor.Correlation.NONE))
  }

  def finalise(api: DockingLifecycle_Operational_Api): Unit = { }
}
