// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object InventoryAcquisition_material_continuity_process_inventory_acquisition {

  def initialise(api: InventoryAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_inventory_boundary_facts(Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts.example())
  }

  def timeTriggered(api: InventoryAcquisition_Operational_Api): Unit = { }

  def finalise(api: InventoryAcquisition_Operational_Api): Unit = { }
}
