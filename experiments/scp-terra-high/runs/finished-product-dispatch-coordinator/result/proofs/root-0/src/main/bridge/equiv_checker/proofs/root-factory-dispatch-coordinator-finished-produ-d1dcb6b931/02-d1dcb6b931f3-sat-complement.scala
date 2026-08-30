// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d1dcb6b931f3_2_Complement {
  @pure def check(
      candidate_readiness: equiv_shared_0.Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness,
      inventory_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
      recovery_context: equiv_shared_0.Factory_Dispatch_Coordinator.Recovery_Qualification_Context,
      request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_GumboX.compute_CEP_Post(inventory_snapshot, recovery_context, request_fact, candidate_readiness))) & T)))
  }
}
