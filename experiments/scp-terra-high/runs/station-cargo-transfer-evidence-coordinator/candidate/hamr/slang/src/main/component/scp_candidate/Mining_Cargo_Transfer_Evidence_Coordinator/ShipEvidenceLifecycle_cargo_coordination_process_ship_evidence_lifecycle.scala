// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ShipEvidenceLifecycle_cargo_coordination_process_ship_evidence_lifecycle {

  def initialise(api: ShipEvidenceLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_prior_ship_evidence(Mining_Cargo_Transfer_Evidence_Coordinator.ShipEvidenceState.CLEAR)
  }

  def timeTriggered(api: ShipEvidenceLifecycle_Operational_Api): Unit = { }
  def finalise(api: ShipEvidenceLifecycle_Operational_Api): Unit = { }
}
