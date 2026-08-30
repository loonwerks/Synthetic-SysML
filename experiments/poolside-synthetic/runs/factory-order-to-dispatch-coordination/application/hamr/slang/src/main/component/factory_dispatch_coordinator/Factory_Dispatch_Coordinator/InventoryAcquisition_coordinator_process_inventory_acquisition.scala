// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object InventoryAcquisition_coordinator_process_inventory_acquisition {

  def initialise(api: InventoryAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_material_boundary_facts(Factory_Dispatch_Coordinator.MaterialBoundaryFacts.example())
    api.put_product_boundary_facts(Factory_Dispatch_Coordinator.ProductBoundaryFacts.example())
  }

  def timeTriggered(api: InventoryAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_inventory_snapshot: Option[Factory_Dispatch_Coordinator.InventorySnapshot] = api.get_inventory_snapshot()
    api.logInfo(s"Received on data port inventory_snapshot: ${apiUsage_inventory_snapshot}")
  }

  def finalise(api: InventoryAcquisition_Operational_Api): Unit = { }
}
