// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Commitment_Tracker_dispatch_coordinator_process_commitment_tracker {

  def initialise(api: Commitment_Tracker_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_execution_context(Factory_Dispatch_Coordinator.Active_Execution_Context.example())
    api.put_recovery_context(Factory_Dispatch_Coordinator.Recovery_Qualification_Context.example())
    api.put_shipment_instruction(Factory_Dispatch_Coordinator.Shipment_Instruction.example())
    api.put_lifecycle_snapshot(Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Idle)
  }

  def timeTriggered(api: Commitment_Tracker_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_execution_context(Factory_Dispatch_Coordinator.Active_Execution_Context.example())
    api.put_recovery_context(Factory_Dispatch_Coordinator.Recovery_Qualification_Context.example())
    api.put_shipment_instruction(Factory_Dispatch_Coordinator.Shipment_Instruction.example())
    api.put_lifecycle_snapshot(Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Idle)
  }

  def finalise(api: Commitment_Tracker_Operational_Api): Unit = { }
}
