// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_471312a20b4a_2_Complement {
  @pure def check(
      material_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.MaterialBoundaryFacts,
      product_boundary_facts: equiv_shared_0.Factory_Dispatch_Coordinator.ProductBoundaryFacts,
      stock_facts: equiv_shared_0.Factory_Dispatch_Coordinator.StockFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.StockAssessment_coordinator_process_stock_assessment_GumboX.inititialize_IEP_Post(stock_facts))) & T)))
  }
}
