// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RecoverySupervisor_cargo_coordination_process_recovery_supervisor {

  def initialise(api: RecoverySupervisor_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_recovery_state(Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoverySupervisor_Operational_Api): Unit = { }
  def finalise(api: RecoverySupervisor_Operational_Api): Unit = { }
}
