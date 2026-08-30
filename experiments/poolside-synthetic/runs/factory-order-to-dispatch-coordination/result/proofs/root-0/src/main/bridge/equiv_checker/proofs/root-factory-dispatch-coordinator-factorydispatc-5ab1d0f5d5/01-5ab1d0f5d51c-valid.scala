// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5ab1d0f5d51c_1_Valid {
  @pure def check(
      material_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.MaterialBoundaryFacts,
      product_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.ProductBoundaryFacts,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
