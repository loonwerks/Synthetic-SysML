// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d12a32bc0b02_3_Valid {
  @pure def check(
      dispatch_decision: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Decision,
      execution_context: equiv_shared_0.Factory_Dispatch_Coordinator.Active_Execution_Context,
      lifecycle_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type,
      outcome_plan: equiv_shared_0.Factory_Dispatch_Coordinator.Outcome_Plan.Type,
      recovery_context: equiv_shared_0.Factory_Dispatch_Coordinator.Recovery_Qualification_Context,
      shipment_instruction: equiv_shared_0.Factory_Dispatch_Coordinator.Shipment_Instruction,
      active_amount: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Amount.Type,
      active_attempt: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Attempt.Type,
      active_product_id: equiv_shared_0.Factory_Dispatch_Coordinator.Product_Id.Type,
      active_request_id: equiv_shared_0.Factory_Dispatch_Coordinator.Request_Id.Type,
      lifecycle: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Lifecycle.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
