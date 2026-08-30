// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResultComposition_cargo_coordination_process_result_composition {

  def initialise(api: ResultComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_transfer_result(Mining_Cargo_Transfer_Evidence_Coordinator.TransferCoordinationResult(
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD,
      Mining_Cargo_Transfer_Evidence_Coordinator.DecisionCause.NO_ELIGIBLE_ACTION,
      Mining_Cargo_Transfer_Evidence_Coordinator.CoordinationMode.HOLDING,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.PublicRequestDisposition.NO_REQUEST,
      Mining_Cargo_Transfer_Evidence_Coordinator.PublicTransferOutcome.NONE))
  }

  def timeTriggered(api: ResultComposition_Operational_Api): Unit = { }
  def finalise(api: ResultComposition_Operational_Api): Unit = { }
}
