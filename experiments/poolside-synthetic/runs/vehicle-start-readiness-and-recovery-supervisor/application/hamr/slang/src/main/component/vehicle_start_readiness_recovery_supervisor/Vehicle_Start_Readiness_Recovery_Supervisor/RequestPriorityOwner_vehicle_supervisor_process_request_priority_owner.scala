// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestPriorityOwner_vehicle_supervisor_process_request_priority_owner {

  def initialise(api: RequestPriorityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_to_authorization(Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts.example())
    api.put_request_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts.example())
  }

  def timeTriggered(api: RequestPriorityOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_levels: Option[Vehicle_Start_Readiness_Recovery_Supervisor.RequestLevels] = api.get_request_levels()
    api.logInfo(s"Received on data port request_levels: ${apiUsage_request_levels}")
  }

  def finalise(api: RequestPriorityOwner_Operational_Api): Unit = { }
}
