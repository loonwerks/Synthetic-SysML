// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualifier_supervision_requestQualifier {

  def initialise(api: RequestQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedTarget(HVAC_Visibility_Priority_Supervisor.QualifiedTarget.example())
    api.put_qualifiedRequest(HVAC_Visibility_Priority_Supervisor.QualifiedRequest.example())
  }

  def timeTriggered(api: RequestQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_userRequest: Option[HVAC_Visibility_Priority_Supervisor.UserClimateRequest] = api.get_userRequest()
    api.logInfo(s"Received on data port userRequest: ${apiUsage_userRequest}")
  }

  def finalise(api: RequestQualifier_Operational_Api): Unit = { }
}
