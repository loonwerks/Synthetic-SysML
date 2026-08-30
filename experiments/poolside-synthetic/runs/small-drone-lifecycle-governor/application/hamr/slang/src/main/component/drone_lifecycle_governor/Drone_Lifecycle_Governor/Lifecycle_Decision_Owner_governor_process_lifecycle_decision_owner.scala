// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Lifecycle_Decision_Owner_governor_process_lifecycle_decision_owner {

  def initialise(api: Lifecycle_Decision_Owner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selected_phase(Drone_Lifecycle_Governor.Lifecycle_Phase.Off)
    api.put_decision_disposition(Drone_Lifecycle_Governor.Decision_Disposition.example())
    api.put_phase_report(Drone_Lifecycle_Governor.Lifecycle_Phase.Off)
  }

  def timeTriggered(api: Lifecycle_Decision_Owner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualified_request: Option[Drone_Lifecycle_Governor.Qualified_Request.Type] = api.get_qualified_request()
    api.logInfo(s"Received on data port qualified_request: ${apiUsage_qualified_request}")
    val apiUsage_battery_assessment: Option[Drone_Lifecycle_Governor.Battery_Assessment_Value.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
  }

  def finalise(api: Lifecycle_Decision_Owner_Operational_Api): Unit = { }
}
