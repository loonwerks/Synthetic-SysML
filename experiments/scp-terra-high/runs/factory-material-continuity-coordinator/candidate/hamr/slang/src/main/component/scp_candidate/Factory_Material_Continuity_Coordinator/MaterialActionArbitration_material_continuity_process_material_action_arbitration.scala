// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialActionArbitration_material_continuity_process_material_action_arbitration {

  def initialise(api: MaterialActionArbitration_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_decision(Factory_Material_Continuity_Coordinator.Decision.example())
  }

  def timeTriggered(api: MaterialActionArbitration_Operational_Api): Unit = { }

  def finalise(api: MaterialActionArbitration_Operational_Api): Unit = { }
}
