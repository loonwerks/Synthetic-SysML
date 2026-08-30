// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ResultComposition_material_continuity_process_result_composition {

  def initialise(api: ResultComposition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_material_coordination_result(Factory_Material_Continuity_Coordinator.MaterialCoordinationResult.example())
  }

  def timeTriggered(api: ResultComposition_Operational_Api): Unit = { }

  def finalise(api: ResultComposition_Operational_Api): Unit = { }
}
