// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object StartAuthorizationOwner_vehicle_supervisor_process_start_authorization_owner {

  def initialise(api: StartAuthorizationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts.example())
    api.put_authorization_to_outcome(Vehicle_Start_Readiness_Recovery_Supervisor.StartAuthorizationFacts.example())
  }

  def timeTriggered(api: StartAuthorizationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_request_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.RequestFacts] = api.get_request_facts()
    api.logInfo(s"Received on data port request_facts: ${apiUsage_request_facts}")
    val apiUsage_brake_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts] = api.get_brake_facts()
    api.logInfo(s"Received on data port brake_facts: ${apiUsage_brake_facts}")
    val apiUsage_health_qualification: Option[Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Type] = api.get_health_qualification()
    api.logInfo(s"Received on data port health_qualification: ${apiUsage_health_qualification}")
    val apiUsage_power_facts: Option[Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts] = api.get_power_facts()
    api.logInfo(s"Received on data port power_facts: ${apiUsage_power_facts}")
  }

  def finalise(api: StartAuthorizationOwner_Operational_Api): Unit = { }
}
