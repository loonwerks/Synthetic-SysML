// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9f8cfe786f2e_4_Valid {
  @pure def check(
      priority_directive: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.PriorityDirective,
      request_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal,
      ship_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal,
      transfer_decision: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferDecision,
      warehouse_proposal: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ActionProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.TransferActionArbitration_cargo_coordination_process_transfer_action_arbitration_GumboX.compute_CEP_Post(priority_directive, request_proposal, ship_proposal, warehouse_proposal, transfer_decision))) ___>: (T)) & T))
  }
}
