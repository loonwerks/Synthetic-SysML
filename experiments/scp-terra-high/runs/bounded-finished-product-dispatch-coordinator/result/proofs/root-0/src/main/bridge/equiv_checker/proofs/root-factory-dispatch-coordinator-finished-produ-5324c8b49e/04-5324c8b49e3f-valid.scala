// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5324c8b49e3f_4_Valid {
  @pure def check(
      inventory_evidence: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Sample,
      inventory_finding: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Type,
      pending_request: equiv_shared_0.Factory_Dispatch_Coordinator.Pending_Request_View.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.inititialize_IEP_Post(inventory_finding))) ___>: (T)) & T))
  }
}
