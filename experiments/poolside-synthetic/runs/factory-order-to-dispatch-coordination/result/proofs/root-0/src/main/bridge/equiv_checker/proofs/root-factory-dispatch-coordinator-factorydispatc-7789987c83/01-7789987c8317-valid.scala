// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7789987c8317_1_Valid {
  @pure def check(
      dispatch_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      emergency_state: equiv_shared_0.Factory_Dispatch_Coordinator.EmergencyState.Type,
      procurement_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      production_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      quotation_proposal: equiv_shared_0.Factory_Dispatch_Coordinator.ProposalState.Type,
      selected_action: equiv_shared_0.Factory_Dispatch_Coordinator.DispatchAction.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
