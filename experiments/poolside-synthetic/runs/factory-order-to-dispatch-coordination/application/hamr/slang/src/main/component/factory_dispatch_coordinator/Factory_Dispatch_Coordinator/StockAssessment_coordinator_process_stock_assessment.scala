// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object StockAssessment_coordinator_process_stock_assessment {

  def initialise(api: StockAssessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_stock_facts(Factory_Dispatch_Coordinator.StockFacts.example())
  }

  def timeTriggered(api: StockAssessment_Operational_Api): Unit = {
    // example api usage

    val apiUsage_material_boundary_facts: Option[Factory_Dispatch_Coordinator.MaterialBoundaryFacts] = api.get_material_boundary_facts()
    api.logInfo(s"Received on data port material_boundary_facts: ${apiUsage_material_boundary_facts}")
    val apiUsage_product_boundary_facts: Option[Factory_Dispatch_Coordinator.ProductBoundaryFacts] = api.get_product_boundary_facts()
    api.logInfo(s"Received on data port product_boundary_facts: ${apiUsage_product_boundary_facts}")
  }

  def finalise(api: StockAssessment_Operational_Api): Unit = { }
}
