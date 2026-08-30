// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment {

  def initialise(api: MaterialReadinessAssessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_READINESS_SAFE
        api.readiness_to_urgent.band == InventoryBandCode.INVALID,
        api.readiness_to_urgent.usable,
        api.readiness_to_urgent.materialAvailable,
        api.readiness_to_urgent.reserveLow,
        api.readiness_to_urgent.replenishmentNeeded,
        api.readiness_to_urgent.productionEvidenceUsable,
        api.readiness_to_urgent.productionAccepting,
        // routine mirrors urgent
        api.readiness_to_routine == api.readiness_to_urgent,
        // replenishment mirrors urgent
        api.readiness_to_replenishment == api.readiness_to_urgent
      )
    )
    // example api usage

    val init: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts =
      Factory_Material_Continuity_Coordinator.MaterialReadinessFacts(
        band = Factory_Material_Continuity_Coordinator.InventoryBandCode.INVALID,
        usable = T,
        materialAvailable = T,
        reserveLow = T,
        replenishmentNeeded = T,
        productionEvidenceUsable = T,
        productionAccepting = T)

    api.put_readiness_to_urgent(init)
    api.put_readiness_to_routine(init)
    api.put_readiness_to_replenishment(init)
  }

  def timeTriggered(api: MaterialReadinessAssessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // MATERIAL_READINESS_DERIVATION
        api.readiness_to_urgent.band == api.inventory_boundary_facts.band,
        api.readiness_to_urgent.usable == api.inventory_boundary_facts.usable,
        api.readiness_to_urgent.materialAvailable == (api.inventory_boundary_facts.usable &&
          (api.inventory_boundary_facts.band == InventoryBandCode.LOW ||
           api.inventory_boundary_facts.band == InventoryBandCode.READY)),
        api.readiness_to_urgent.reserveLow == (api.inventory_boundary_facts.usable &&
          api.inventory_boundary_facts.band == InventoryBandCode.LOW),
        api.readiness_to_urgent.replenishmentNeeded == (api.inventory_boundary_facts.usable &&
          (api.inventory_boundary_facts.band == InventoryBandCode.EMPTY ||
           api.inventory_boundary_facts.band == InventoryBandCode.LOW)),
        api.readiness_to_urgent.productionEvidenceUsable == (api.production_availability != Availability.INVALID),
        api.readiness_to_urgent.productionAccepting == (api.production_availability == Availability.AVAILABLE),
        // routine mirrors urgent
        api.readiness_to_routine == api.readiness_to_urgent,
        // replenishment mirrors urgent
        api.readiness_to_replenishment == api.readiness_to_urgent
      )
    )
    // example api usage

    val ebf: Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts = api.get_inventory_boundary_facts().get
    val prodAvail: Factory_Material_Continuity_Coordinator.Availability.Type = api.get_production_availability().get

    val band = ebf.band
    val usable = ebf.usable
    val materialAvailable = usable && (band == Factory_Material_Continuity_Coordinator.InventoryBandCode.LOW ||
      band == Factory_Material_Continuity_Coordinator.InventoryBandCode.READY)
    val reserveLow = usable && band == Factory_Material_Continuity_Coordinator.InventoryBandCode.LOW
    val replenishmentNeeded = usable && (band == Factory_Material_Continuity_Coordinator.InventoryBandCode.EMPTY ||
      band == Factory_Material_Continuity_Coordinator.InventoryBandCode.LOW)
    val productionEvidenceUsable = prodAvail != Factory_Material_Continuity_Coordinator.Availability.INVALID
    val productionAccepting = prodAvail == Factory_Material_Continuity_Coordinator.Availability.AVAILABLE

    val readiness: Factory_Material_Continuity_Coordinator.MaterialReadinessFacts =
      Factory_Material_Continuity_Coordinator.MaterialReadinessFacts(
        band = band,
        usable = usable,
        materialAvailable = materialAvailable,
        reserveLow = reserveLow,
        replenishmentNeeded = replenishmentNeeded,
        productionEvidenceUsable = productionEvidenceUsable,
        productionAccepting = productionAccepting)

    api.put_readiness_to_urgent(readiness)
    api.put_readiness_to_routine(readiness)
    api.put_readiness_to_replenishment(readiness)
  }

  def finalise(api: MaterialReadinessAssessment_Operational_Api): Unit = { }
}
