// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_803c6644a5d6_4_Valid {
  @pure def check(
      dispatch_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      emergency_state: equiv_shared_0.Factory_Dispatch_Coordinator.EmergencyState.Type,
      procurement_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      production_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      quotation_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.ActionArbitration_coordinator_process_action_arbitration_GumboX.compute_CEP_Post(dispatch_proposal, emergency_state, procurement_proposal, production_proposal, quotation_proposal, selected_action))) ___>: (T)) & T))
  }
}
