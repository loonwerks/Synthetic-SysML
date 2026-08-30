// #Sireum #Logika

package factory_material_continuity_coordinator.Factory_Material_Continuity_Coordinator

import org.sireum._
import factory_material_continuity_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object DemandAcquisition_material_continuity_process_demand_acquisition {

  @strictpure def demandCodeOf(s: DemandSignal.Type): DemandCode.Type = s match {
    case DemandSignal.NONE => DemandCode.NONE
    case DemandSignal.INVALID => DemandCode.INVALID
    case DemandSignal.ARoutine => DemandCode.ARoutine
    case DemandSignal.AUrgent => DemandCode.AUrgent
    case DemandSignal.BRoutine => DemandCode.BRoutine
    case DemandSignal.BUrgent => DemandCode.BUrgent
  }

  def initialise(api: DemandAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_NO_DEMAND
        api.demand_boundary_facts.present,
        api.demand_boundary_facts.demandValue == DemandCode.NONE
      )
    )
    // example api usage

    api.put_demand_boundary_facts(
      Factory_Material_Continuity_Coordinator.DemandBoundaryFacts(
        present = T,
        demandValue = Factory_Material_Continuity_Coordinator.DemandCode.NONE))
  }

  def timeTriggered(api: DemandAcquisition_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // DEMAND_PRESENCE_CLASSIFICATION
        api.demand_boundary_facts.present == (api.demand_signal != DemandSignal.NONE),
        api.demand_boundary_facts.demandValue == demandCodeOf(api.demand_signal)
      )
    )
    // example api usage

    val apiUsage_demand_signal: Option[Factory_Material_Continuity_Coordinator.DemandSignal.Type] = api.get_demand_signal()
    val signal = apiUsage_demand_signal.get

    api.put_demand_boundary_facts(
      Factory_Material_Continuity_Coordinator.DemandBoundaryFacts(
        present = signal != Factory_Material_Continuity_Coordinator.DemandSignal.NONE,
        demandValue = demandCodeOf(signal)))
  }

  def finalise(api: DemandAcquisition_Operational_Api): Unit = { }
}
