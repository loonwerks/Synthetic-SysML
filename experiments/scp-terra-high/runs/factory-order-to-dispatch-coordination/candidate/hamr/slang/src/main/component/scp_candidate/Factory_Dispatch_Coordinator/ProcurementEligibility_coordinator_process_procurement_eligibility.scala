// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ProcurementEligibility_coordinator_process_procurement_eligibility {

  def initialise(api: ProcurementEligibility_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_PROCUREMENT_NOT_PROPOSED
        api.proposal == ProposalState.NOT_PROPOSED
        // END INITIALIZES ENSURES
      )
    )
    api.put_proposal(ProposalState.NOT_PROPOSED)
  }

  def timeTriggered(api: ProcurementEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    val stock: Factory_Dispatch_Coordinator.StockFacts = api.get_stock_facts().get
    val proposal: ProposalState.Type =
      if (api.get_recovery_gate().get == RecoveryGate.OPEN &&
          api.get_order_state().get == OrderState.OPEN && stock.material_usable &&
          stock.material_shortage && api.get_supplier_available().get) { ProposalState.PROPOSED }
      else { ProposalState.NOT_PROPOSED }
    api.put_proposal(proposal)
  }

  def finalise(api: ProcurementEligibility_Operational_Api): Unit = { }
}
