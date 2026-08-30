// #Sireum

package scp_candidate.Docking_Access_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoverySupervisor_supervisor_process_recovery_supervisor {

  def initialise(api: RecoverySupervisor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_recovery_state(Docking_Access_Supervisor.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoverySupervisor_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_recovery_state(Docking_Access_Supervisor.RecoveryState.HEALTHY)
  }

  def finalise(api: RecoverySupervisor_Operational_Api): Unit = { }
}
