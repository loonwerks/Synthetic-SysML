// #Sireum

package docked_service_access_lifecycle_supervisor.Docked_Service_Access_Lifecycle_Supervisor

import org.sireum._
import docked_service_access_lifecycle_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object IntentQualifier_supervisorProcess_intentQualifier {

  def initialise(api: IntentQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedIntent(Docked_Service_Access_Lifecycle_Supervisor.QualifiedIntent.NO_ACTION)
  }

  def timeTriggered(api: IntentQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_pilotIntent: Option[Docked_Service_Access_Lifecycle_Supervisor.PilotIntent.Type] = api.get_pilotIntent()
    api.logInfo(s"Received on data port pilotIntent: ${apiUsage_pilotIntent}")
  }

  def finalise(api: IntentQualifier_Operational_Api): Unit = { }
}
