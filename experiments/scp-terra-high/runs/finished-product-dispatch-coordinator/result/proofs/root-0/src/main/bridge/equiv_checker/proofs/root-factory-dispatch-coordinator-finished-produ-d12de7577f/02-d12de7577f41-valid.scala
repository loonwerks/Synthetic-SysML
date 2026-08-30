// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d12de7577f41_2_Valid {
  @pure def check(
      candidate_readiness: equiv_shared_0.Factory_Dispatch_Coordinator.Candidate_Inventory_Readiness,
      inventory_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.Dispatch_Inventory_Snapshot,
      recovery_context: equiv_shared_0.Factory_Dispatch_Coordinator.Recovery_Qualification_Context,
      request_fact: equiv_shared_0.Factory_Dispatch_Coordinator.Qualified_Request_Fact): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Qualifier_dispatch_coordinator_process_inventory_qualifier_GumboX.inititialize_IEP_Post(candidate_readiness))) & T))
  }
}
