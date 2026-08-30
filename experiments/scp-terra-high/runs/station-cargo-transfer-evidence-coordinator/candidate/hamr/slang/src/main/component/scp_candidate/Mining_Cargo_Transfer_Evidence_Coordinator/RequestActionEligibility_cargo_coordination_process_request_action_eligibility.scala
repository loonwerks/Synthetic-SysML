// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestActionEligibility_cargo_coordination_process_request_action_eligibility {

  def initialise(api: RequestActionEligibility_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_proposal(Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal(
      Mining_Cargo_Transfer_Evidence_Coordinator.ProposalKind.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.TransferAction.HOLD,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE))
  }

  def timeTriggered(api: RequestActionEligibility_Operational_Api): Unit = { }
  def finalise(api: RequestActionEligibility_Operational_Api): Unit = { }
}
