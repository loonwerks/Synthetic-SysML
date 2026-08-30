// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_28073b4ca088_4_Valid {
  @pure def check(
      inventory_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.InventorySnapshot,
      material_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.MaterialBoundaryFacts,
      product_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.ProductBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_GumboX.inititialize_IEP_Post(material_boundary_facts, product_boundary_facts))) ___>: (T)) & T))
  }
}
