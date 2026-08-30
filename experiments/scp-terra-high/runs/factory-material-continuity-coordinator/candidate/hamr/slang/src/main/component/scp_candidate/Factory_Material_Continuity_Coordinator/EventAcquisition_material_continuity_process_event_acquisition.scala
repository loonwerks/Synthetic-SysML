// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EventAcquisition_material_continuity_process_event_acquisition {

  def initialise(api: EventAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_event_boundary_facts(Factory_Material_Continuity_Coordinator.EventBoundaryFacts.example())
  }

  def timeTriggered(api: EventAcquisition_Operational_Api): Unit = { }

  def finalise(api: EventAcquisition_Operational_Api): Unit = { }
}
