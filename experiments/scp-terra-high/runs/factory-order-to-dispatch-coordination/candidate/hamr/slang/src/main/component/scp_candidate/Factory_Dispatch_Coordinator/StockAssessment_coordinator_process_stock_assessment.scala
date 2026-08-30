// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object StockAssessment_coordinator_process_stock_assessment {

  def initialise(api: StockAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_STOCK_FACTS
        api.stock_facts.material_band == MaterialBand.INVALID &&
          api.stock_facts.material_usable == F &&
          api.stock_facts.material_shortage == F &&
          api.stock_facts.material_ready == F &&
          api.stock_facts.product_band == ProductBand.INVALID &&
          api.stock_facts.product_usable == F &&
          api.stock_facts.product_available == F
        // END INITIALIZES ENSURES
      )
    )
    api.put_stock_facts(Factory_Dispatch_Coordinator.StockFacts(
      MaterialBand.INVALID, F, F, F, ProductBand.INVALID, F, F))
  }

  def timeTriggered(api: StockAssessment_Operational_Api): Unit = {
    Contract(Modifies(api))
    val material: Factory_Dispatch_Coordinator.MaterialBoundaryFacts = api.get_material_boundary_facts().get
    val product: Factory_Dispatch_Coordinator.ProductBoundaryFacts = api.get_product_boundary_facts().get
    api.put_stock_facts(Factory_Dispatch_Coordinator.StockFacts(
      material.material_band,
      material.material_usable,
      material.material_usable && material.material_band == MaterialBand.SHORT,
      material.material_usable && material.material_band == MaterialBand.READY,
      product.product_band,
      product.product_usable,
      product.product_usable && product.product_band == ProductBand.AVAILABLE))
  }

  def finalise(api: StockAssessment_Operational_Api): Unit = { }
}
