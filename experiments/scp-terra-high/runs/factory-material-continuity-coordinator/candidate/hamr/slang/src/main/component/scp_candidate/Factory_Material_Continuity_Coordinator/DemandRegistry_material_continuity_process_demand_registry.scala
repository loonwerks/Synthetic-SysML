// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DemandRegistry_material_continuity_process_demand_registry {

  def initialise(api: DemandRegistry_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_demand_state(Factory_Material_Continuity_Coordinator.DemandState.IDLE)
    api.put_current_state_to_urgent(Factory_Material_Continuity_Coordinator.DemandStateView.IDLE)
    api.put_current_state_to_routine(Factory_Material_Continuity_Coordinator.DemandStateView.IDLE)
    api.put_demand_transition(Factory_Material_Continuity_Coordinator.DemandTransition.example())
  }

  def timeTriggered(api: DemandRegistry_Operational_Api): Unit = { }

  def finalise(api: DemandRegistry_Operational_Api): Unit = { }
}
