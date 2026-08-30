// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_06b57528a92f_2_Complement {
  @pure def check(
      dispatch_decision: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision,
      execution_context: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Execution_Context,
      lifecycle_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type,
      outcome_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      recovery_context: equiv_shared_0.Factory_Dispatch_Coordinator.Recovery_Qualification_Context,
      shipment_instruction: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Instruction,
      in_active_amount: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Amount.Type,
      active_amount: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Amount.Type,
      in_active_attempt: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Attempt.Type,
      active_attempt: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Attempt.Type,
      in_active_product_id: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Id.Type,
      active_product_id: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Id.Type,
      in_active_request_id: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Id.Type,
      active_request_id: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Id.Type,
      in_lifecycle: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type,
      lifecycle: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Commitment_Tracker_dispatch_coordinator_process_commitment_tracker_GumboX.compute_CEP_Post(in_active_amount, in_active_attempt, in_active_product_id, in_active_request_id, in_lifecycle, active_amount, active_attempt, active_product_id, active_request_id, lifecycle, dispatch_decision, outcome_plan, execution_context, lifecycle_snapshot, recovery_context, shipment_instruction))) & T)))
  }
}
