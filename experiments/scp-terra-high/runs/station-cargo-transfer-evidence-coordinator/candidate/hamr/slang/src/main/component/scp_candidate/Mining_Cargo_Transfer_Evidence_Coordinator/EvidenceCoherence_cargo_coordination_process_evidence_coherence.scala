// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EvidenceCoherence_cargo_coordination_process_evidence_coherence {

  def initialise(api: EvidenceCoherence_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_recovery_transition(Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition(
      Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.CLEAR,
      Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.RETAIN))
    api.put_coordination_guard(Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationGuard(
      Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.CLEAR,
      Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.OPEN))
    api.put_coordination_frame(Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationFrame(
      Mining_Cargo_Transfer_Evidence_Coordinator.ProgressClass.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.FaultTrigger.CLEAR,
      Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryIntent.RETAIN,
      Mining_Cargo_Transfer_Evidence_Coordinator.OrdinaryInhibition.OPEN,
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferOutcome.NONE))
    api.put_ship_update(Mining_Cargo_Transfer_Evidence_Coordinator.ShipUpdate.RETAIN)
    api.put_warehouse_update(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseUpdate.RETAIN)
    api.put_priority_directive(Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective(
      Mining_Cargo_Transfer_Evidence_Coordinator.PriorityKind.ORDINARY,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE))
  }

  def timeTriggered(api: EvidenceCoherence_Operational_Api): Unit = { }
  def finalise(api: EvidenceCoherence_Operational_Api): Unit = { }
}
