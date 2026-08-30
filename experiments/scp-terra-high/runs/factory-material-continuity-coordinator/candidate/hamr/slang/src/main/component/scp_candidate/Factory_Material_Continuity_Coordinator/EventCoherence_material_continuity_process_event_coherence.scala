// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EventCoherence_material_continuity_process_event_coherence {

  def initialise(api: EventCoherence_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_event_to_demand(Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress)
    api.put_qualified_event_to_supply(Factory_Material_Continuity_Coordinator.QualifiedEvent.NoProgress)
    api.put_fault_trigger(Factory_Material_Continuity_Coordinator.FaultTrigger.INACTIVE)
  }

  def timeTriggered(api: EventCoherence_Operational_Api): Unit = { }

  def finalise(api: EventCoherence_Operational_Api): Unit = { }
}
