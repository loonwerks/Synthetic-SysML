// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_5324c8b49e3f_Oracle_Pointwise_Realizable {
  @pure def check(
      inventory_evidence: equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Sample,
      pending_request: equiv_shared_0.Factory_Dispatch_Coordinator.Pending_Request_View.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.No_Demand)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Invalid_Inventory)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Sufficient)) |
        (equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Assessment_dispatch_coordination_process_inventory_assessment_GumboX.inititialize_IEP_Post(equiv_shared_0.Factory_Dispatch_Coordinator.Inventory_Finding.Insufficient)))))
  }
}
