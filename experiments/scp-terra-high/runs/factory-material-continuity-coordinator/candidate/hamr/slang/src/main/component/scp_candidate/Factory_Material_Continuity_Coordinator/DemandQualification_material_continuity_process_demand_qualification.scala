// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DemandQualification_material_continuity_process_demand_qualification {

  def initialise(api: DemandQualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_demand_facts(Factory_Material_Continuity_Coordinator.DemandFacts.example())
  }

  def timeTriggered(api: DemandQualification_Operational_Api): Unit = { }

  def finalise(api: DemandQualification_Operational_Api): Unit = { }
}
