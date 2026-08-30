// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityNeedAssessor_supervision_visibilityNeedAssessor {

  def initialise(api: VisibilityNeedAssessor_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_visibilityNeed(HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Unavailable)
    api.put_visibilityFault(HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Present)
  }

  def timeTriggered(api: VisibilityNeedAssessor_Operational_Api): Unit = {
    // example api usage

    val apiUsage_glazingObservation: Option[HVAC_Visibility_Priority_Supervisor.GlazingObservation] = api.get_glazingObservation()
    api.logInfo(s"Received on data port glazingObservation: ${apiUsage_glazingObservation}")
  }

  def finalise(api: VisibilityNeedAssessor_Operational_Api): Unit = { }
}
