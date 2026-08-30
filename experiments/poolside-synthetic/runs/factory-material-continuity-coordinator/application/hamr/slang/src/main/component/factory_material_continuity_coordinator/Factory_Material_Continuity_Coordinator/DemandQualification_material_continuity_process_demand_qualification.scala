// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DemandQualification_material_continuity_process_demand_qualification {

  @strictpure def isValid(dv: DemandCode.Type): B =
    dv == DemandCode.ARoutine | dv == DemandCode.AUrgent | dv == DemandCode.BRoutine | dv == DemandCode.BUrgent

  @strictpure def isUrgent(dv: DemandCode.Type): B =
    dv == DemandCode.AUrgent | dv == DemandCode.BUrgent

  @strictpure def materialClassOf(dv: DemandCode.Type): MaterialClass.Type = dv match {
    case DemandCode.ARoutine => MaterialClass.A
    case DemandCode.AUrgent => MaterialClass.A
    case DemandCode.BRoutine => MaterialClass.B
    case DemandCode.BUrgent => MaterialClass.B
    case DemandCode.NONE => MaterialClass.NONE
    case DemandCode.INVALID => MaterialClass.NONE
  }

  def initialise(api: DemandQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_DEMAND_FACTS_SAFE
        api.demand_facts.demandValue == DemandCode.NONE,
        api.demand_facts.present,
        api.demand_facts.valid,
        api.demand_facts.urgent,
        api.demand_facts.materialClass == MaterialClass.NONE
      )
    )
    // example api usage

    api.put_demand_facts(
      Factory_Material_Continuity_Coordinator.DemandFacts(
        present = T,
        valid = T,
        urgent = T,
        materialClass = Factory_Material_Continuity_Coordinator.MaterialClass.NONE,
        demandValue = Factory_Material_Continuity_Coordinator.DemandCode.NONE))
  }

  def timeTriggered(api: DemandQualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // QUALIFIED_DEMAND_FACTS
        api.demand_facts.demandValue == api.demand_boundary_facts.demandValue,
        api.demand_facts.present == api.demand_boundary_facts.present,
        api.demand_facts.valid == isValid(api.demand_boundary_facts.demandValue),
        api.demand_facts.urgent == isUrgent(api.demand_boundary_facts.demandValue),
        api.demand_facts.materialClass == materialClassOf(api.demand_boundary_facts.demandValue)
      )
    )
    // example api usage

    val apiUsage_demand_boundary_facts: Option[Factory_Material_Continuity_Coordinator.DemandBoundaryFacts] = api.get_demand_boundary_facts()
    val facts = apiUsage_demand_boundary_facts.get
    val dv = facts.demandValue

    api.put_demand_facts(
      Factory_Material_Continuity_Coordinator.DemandFacts(
        present = facts.present,
        valid = isValid(dv),
        urgent = isUrgent(dv),
        materialClass = materialClassOf(dv),
        demandValue = dv))
  }

  def finalise(api: DemandQualification_Operational_Api): Unit = { }
}
