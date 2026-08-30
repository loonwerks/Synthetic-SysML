// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DemandAcquisition_material_continuity_process_demand_acquisition {

  def initialise(api: DemandAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_NO_DEMAND
        !(api.demand_boundary_facts.present) &&
          api.demand_boundary_facts.demandValue == DemandCode.NONE
        // END INITIALIZES ENSURES
      )
    )
    api.put_demand_boundary_facts(DemandBoundaryFacts(
      present = F,
      demandValue = DemandCode.NONE))
  }

  def timeTriggered(api: DemandAcquisition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val v: DemandSignal.Type = api.get_demand_signal().get
    val code: DemandCode.Type = v match {
      case DemandSignal.NONE => DemandCode.NONE
      case DemandSignal.INVALID => DemandCode.INVALID
      case DemandSignal.ARoutine => DemandCode.ARoutine
      case DemandSignal.AUrgent => DemandCode.AUrgent
      case DemandSignal.BRoutine => DemandCode.BRoutine
      case DemandSignal.BUrgent => DemandCode.BUrgent
    }
    api.put_demand_boundary_facts(DemandBoundaryFacts(v != DemandSignal.NONE, code))
  }

  def finalise(api: DemandAcquisition_Operational_Api): Unit = { }
}
