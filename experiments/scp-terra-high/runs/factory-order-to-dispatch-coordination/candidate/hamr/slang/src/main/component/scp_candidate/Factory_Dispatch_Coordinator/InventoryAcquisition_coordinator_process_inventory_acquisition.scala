// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object InventoryAcquisition_coordinator_process_inventory_acquisition {

  def initialise(api: InventoryAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_INVENTORY_BOUNDARY
        api.material_boundary_facts.material_band == MaterialBand.INVALID &&
          api.material_boundary_facts.material_usable == F &&
          api.product_boundary_facts.product_band == ProductBand.INVALID &&
          api.product_boundary_facts.product_usable == F
        // END INITIALIZES ENSURES
      )
    )
    api.put_material_boundary_facts(Factory_Dispatch_Coordinator.MaterialBoundaryFacts(
      MaterialBand.INVALID, F))
    api.put_product_boundary_facts(Factory_Dispatch_Coordinator.ProductBoundaryFacts(
      ProductBand.INVALID, F))
  }

  def timeTriggered(api: InventoryAcquisition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val snapshot: Factory_Dispatch_Coordinator.InventorySnapshot = api.get_inventory_snapshot().get
    api.put_material_boundary_facts(Factory_Dispatch_Coordinator.MaterialBoundaryFacts(
      snapshot.material_band, snapshot.material_band != MaterialBand.INVALID))
    api.put_product_boundary_facts(Factory_Dispatch_Coordinator.ProductBoundaryFacts(
      snapshot.product_band, snapshot.product_band != ProductBand.INVALID))
  }

  def finalise(api: InventoryAcquisition_Operational_Api): Unit = { }
}
