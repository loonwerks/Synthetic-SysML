// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_905dc67d4b0f_4_Valid {
  @pure def check(
      inventory_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.InventorySnapshot,
      material_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.MaterialBoundaryFacts,
      product_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.ProductBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Dispatch_Coordinator.InventoryAcquisition_coordinator_process_inventory_acquisition_GumboX.compute_CEP_Post(inventory_snapshot, material_boundary_facts, product_boundary_facts))) ___>: (T)) & T))
  }
}
