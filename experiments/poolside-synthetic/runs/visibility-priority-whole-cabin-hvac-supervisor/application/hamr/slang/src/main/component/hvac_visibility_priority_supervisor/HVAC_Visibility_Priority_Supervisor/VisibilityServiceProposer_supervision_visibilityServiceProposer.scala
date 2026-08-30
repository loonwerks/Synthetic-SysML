// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object VisibilityServiceProposer_supervision_visibilityServiceProposer {

  def initialise(api: VisibilityServiceProposer_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_visibilityProposal(HVAC_Visibility_Priority_Supervisor.VisibilityProposal.example())
  }

  def timeTriggered(api: VisibilityServiceProposer_Operational_Api): Unit = {
    // example api usage

    val apiUsage_visibilityNeed: Option[HVAC_Visibility_Priority_Supervisor.VisibilityNeed.Type] = api.get_visibilityNeed()
    api.logInfo(s"Received on data port visibilityNeed: ${apiUsage_visibilityNeed}")
    val apiUsage_visibilityPath: Option[HVAC_Visibility_Priority_Supervisor.VisibilityPathReadiness] = api.get_visibilityPath()
    api.logInfo(s"Received on data port visibilityPath: ${apiUsage_visibilityPath}")
  }

  def finalise(api: VisibilityServiceProposer_Operational_Api): Unit = { }
}
