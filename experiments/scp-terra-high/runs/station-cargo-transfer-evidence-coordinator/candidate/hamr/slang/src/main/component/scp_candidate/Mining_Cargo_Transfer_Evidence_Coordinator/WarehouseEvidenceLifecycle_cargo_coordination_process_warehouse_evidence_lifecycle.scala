// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseEvidenceLifecycle_cargo_coordination_process_warehouse_evidence_lifecycle {

  def initialise(api: WarehouseEvidenceLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_warehouse_evidence(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseEvidenceState.CLEAR)
  }

  def timeTriggered(api: WarehouseEvidenceLifecycle_Operational_Api): Unit = { }
  def finalise(api: WarehouseEvidenceLifecycle_Operational_Api): Unit = { }
}
