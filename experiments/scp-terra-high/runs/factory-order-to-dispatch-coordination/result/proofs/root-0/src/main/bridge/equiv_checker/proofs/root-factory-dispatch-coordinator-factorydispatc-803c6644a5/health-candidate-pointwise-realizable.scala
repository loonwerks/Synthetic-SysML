// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_803c6644a5d6_Candidate_Pointwise_Realizable {
  @pure def check(
      dispatch_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      emergency_state: equiv_shared_0.Factory_Dispatch_Coordinator.EmergencyState.Type,
      procurement_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      production_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      quotation_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_Candidate_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.HOLD)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_Candidate_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.ISSUE_QUOTE)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_Candidate_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.ORDER_MATERIAL)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_Candidate_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.RELEASE_PRODUCTION)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_Candidate_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.RELEASE_DISPATCH)))))
  }
}
