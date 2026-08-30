// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_28073b4ca088_3_Valid {
  @pure def check(
      inventory_snapshot: equiv_shared_0.Factory_Dispatch_Coordinator.InventorySnapshot,
      material_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.MaterialBoundaryFacts,
      product_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.ProductBoundaryFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
