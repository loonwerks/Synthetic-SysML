// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object RecoverySupervisor_cargo_coordination_process_recovery_supervisor {

  def initialise(api: RecoverySupervisor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_recovery_state(Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.HEALTHY)
  }

  def timeTriggered(api: RecoverySupervisor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_recovery_transition: Option[Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition] = api.get_recovery_transition()
    api.logInfo(s"Received on data port recovery_transition: ${apiUsage_recovery_transition}")
  }

  def finalise(api: RecoverySupervisor_Operational_Api): Unit = { }
}
