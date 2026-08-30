// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DispatchEligibility_coordinator_process_dispatch_eligibility {

  def initialise(api: DispatchEligibility_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DISPATCH_NOT_PROPOSED
        api.proposal == ProposalState.NOT_PROPOSED
        // END INITIALIZES ENSURES
      )
    )
    api.put_proposal(ProposalState.NOT_PROPOSED)
  }

  def timeTriggered(api: DispatchEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    val stock: Factory_Dispatch_Coordinator.StockFacts = api.get_stock_facts().get
    val proposal: ProposalState.Type =
      if (api.get_recovery_gate().get == RecoveryGate.OPEN &&
          api.get_order_state().get == OrderState.OPEN && stock.product_usable &&
          stock.product_available && api.get_dispatch_available().get) { ProposalState.PROPOSED }
      else { ProposalState.NOT_PROPOSED }
    api.put_proposal(proposal)
  }

  def finalise(api: DispatchEligibility_Operational_Api): Unit = { }
}
