// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object SupplyLifecycle_material_continuity_process_supply_lifecycle {

  def initialise(api: SupplyLifecycle_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_prior_supply_state(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
    api.put_current_state_to_replenishment(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
    api.put_current_state_to_composition(Factory_Material_Continuity_Coordinator.SupplyState.CLEAR)
  }

  def timeTriggered(api: SupplyLifecycle_Operational_Api): Unit = { }

  def finalise(api: SupplyLifecycle_Operational_Api): Unit = { }
}
