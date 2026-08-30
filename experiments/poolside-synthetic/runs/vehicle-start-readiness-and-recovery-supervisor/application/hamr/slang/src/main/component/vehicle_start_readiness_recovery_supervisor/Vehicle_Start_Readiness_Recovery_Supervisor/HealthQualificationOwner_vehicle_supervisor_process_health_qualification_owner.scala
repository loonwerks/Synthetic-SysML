// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object HealthQualificationOwner_vehicle_supervisor_process_health_qualification_owner {

  def initialise(api: HealthQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_health_to_authorization(Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Ready)
    api.put_health_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.HealthQualification.Ready)
  }

  def timeTriggered(api: HealthQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_health_observation: Option[Vehicle_Start_Readiness_Recovery_Supervisor.HealthObservation] = api.get_health_observation()
    api.logInfo(s"Received on data port health_observation: ${apiUsage_health_observation}")
  }

  def finalise(api: HealthQualificationOwner_Operational_Api): Unit = { }
}
