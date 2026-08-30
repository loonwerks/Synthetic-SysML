// #Sireum

package scp_candidate.Factory_Material_Continuity_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment {

  def initialise(api: MaterialReadinessAssessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_readiness_to_urgent(Factory_Material_Continuity_Coordinator.MaterialReadinessFacts.example())
    api.put_readiness_to_routine(Factory_Material_Continuity_Coordinator.MaterialReadinessFacts.example())
    api.put_readiness_to_replenishment(Factory_Material_Continuity_Coordinator.MaterialReadinessFacts.example())
  }

  def timeTriggered(api: MaterialReadinessAssessment_Operational_Api): Unit = { }

  def finalise(api: MaterialReadinessAssessment_Operational_Api): Unit = { }
}
