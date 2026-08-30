// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_522f9919bd98_2_Valid {
  @pure def check(
      inventory_evidence: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Sample,
      inventory_finding: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Type,
      pending_request: equiv_shared_0.Factory_Dispatch_Coordinator.Pending_Request_View.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.compute_CEP_Post(inventory_evidence, pending_request, inventory_finding))) & T))
  }
}
