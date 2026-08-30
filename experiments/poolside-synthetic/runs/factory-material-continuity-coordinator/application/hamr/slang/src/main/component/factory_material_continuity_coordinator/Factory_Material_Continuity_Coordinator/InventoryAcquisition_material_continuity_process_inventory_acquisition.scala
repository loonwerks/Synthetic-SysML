// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object InventoryAcquisition_material_continuity_process_inventory_acquisition {

  @strictpure def bandCodeOf(b: InventoryBand.Type): InventoryBandCode.Type = b match {
    case InventoryBand.INVALID => InventoryBandCode.INVALID
    case InventoryBand.EMPTY => InventoryBandCode.EMPTY
    case InventoryBand.LOW => InventoryBandCode.LOW
    case InventoryBand.READY => InventoryBandCode.READY
  }

  def initialise(api: InventoryAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_INVENTORY_UNUSABLE
        api.inventory_boundary_facts.band == InventoryBandCode.INVALID,
        api.inventory_boundary_facts.usable
      )
    )
    // example api usage

    api.put_inventory_boundary_facts(
      Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts(
        band = Factory_Material_Continuity_Coordinator.InventoryBandCode.INVALID,
        usable = T))
  }

  def timeTriggered(api: InventoryAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INVENTORY_USABILITY_CLASSIFICATION
        api.inventory_boundary_facts.band == bandCodeOf(api.inventory_band),
        api.inventory_boundary_facts.usable == (api.inventory_band != InventoryBand.INVALID)
      )
    )
    // example api usage

    val apiUsage_inventory_band: Option[Factory_Material_Continuity_Coordinator.InventoryBand.Type] = api.get_inventory_band()
    val band = apiUsage_inventory_band.get

    api.put_inventory_boundary_facts(
      Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts(
        band = bandCodeOf(band),
        usable = band != Factory_Material_Continuity_Coordinator.InventoryBand.INVALID))
  }

  def finalise(api: InventoryAcquisition_Operational_Api): Unit = { }
}
