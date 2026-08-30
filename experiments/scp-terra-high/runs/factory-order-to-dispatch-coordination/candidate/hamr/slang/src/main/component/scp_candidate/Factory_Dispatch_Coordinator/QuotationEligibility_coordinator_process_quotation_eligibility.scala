// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object QuotationEligibility_coordinator_process_quotation_eligibility {

  def initialise(api: QuotationEligibility_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_QUOTATION_NOT_PROPOSED
        api.proposal == ProposalState.NOT_PROPOSED
        // END INITIALIZES ENSURES
      )
    )
    api.put_proposal(ProposalState.NOT_PROPOSED)
  }

  def timeTriggered(api: QuotationEligibility_Operational_Api): Unit = {
    Contract(Modifies(api))
    val facts: Factory_Dispatch_Coordinator.RequestFacts = api.get_request_facts().get
    val proposal: ProposalState.Type =
      if (api.get_recovery_gate().get == RecoveryGate.OPEN &&
          api.get_order_state().get == OrderState.IDLE && facts.request_valid) { ProposalState.PROPOSED }
      else { ProposalState.NOT_PROPOSED }
    api.put_proposal(proposal)
  }

  def finalise(api: QuotationEligibility_Operational_Api): Unit = { }
}
