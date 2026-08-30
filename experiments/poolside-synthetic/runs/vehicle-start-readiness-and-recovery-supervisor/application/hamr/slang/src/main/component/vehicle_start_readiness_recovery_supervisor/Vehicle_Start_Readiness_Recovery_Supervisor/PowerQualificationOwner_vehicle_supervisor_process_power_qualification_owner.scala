// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PowerQualificationOwner_vehicle_supervisor_process_power_qualification_owner {

  def initialise(api: PowerQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_power_to_authorization(Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts.example())
    api.put_power_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.PowerFacts.example())
  }

  def timeTriggered(api: PowerQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_power_observation: Option[Vehicle_Start_Readiness_Recovery_Supervisor.PowerObservation.Type] = api.get_power_observation()
    api.logInfo(s"Received on data port power_observation: ${apiUsage_power_observation}")
  }

  def finalise(api: PowerQualificationOwner_Operational_Api): Unit = { }
}
