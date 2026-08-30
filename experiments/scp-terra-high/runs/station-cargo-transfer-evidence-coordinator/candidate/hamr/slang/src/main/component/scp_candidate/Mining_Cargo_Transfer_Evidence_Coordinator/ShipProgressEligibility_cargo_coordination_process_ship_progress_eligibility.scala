// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ShipProgressEligibility_cargo_coordination_process_ship_progress_eligibility {

  def initialise(api: ShipProgressEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_ship_proposal(Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal(
      Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE))
  }

  def timeTriggered(api: ShipProgressEligibility_Operational_Api): Unit = { }
  def finalise(api: ShipProgressEligibility_Operational_Api): Unit = { }
}
