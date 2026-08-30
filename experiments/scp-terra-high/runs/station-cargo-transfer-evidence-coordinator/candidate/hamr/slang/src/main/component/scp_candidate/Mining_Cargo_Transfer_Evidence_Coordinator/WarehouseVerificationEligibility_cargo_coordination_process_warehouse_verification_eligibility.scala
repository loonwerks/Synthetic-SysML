// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseVerificationEligibility_cargo_coordination_process_warehouse_verification_eligibility {

  def initialise(api: WarehouseVerificationEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_warehouse_proposal(Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal(
      Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE))
  }

  def timeTriggered(api: WarehouseVerificationEligibility_Operational_Api): Unit = { }
  def finalise(api: WarehouseVerificationEligibility_Operational_Api): Unit = { }
}
