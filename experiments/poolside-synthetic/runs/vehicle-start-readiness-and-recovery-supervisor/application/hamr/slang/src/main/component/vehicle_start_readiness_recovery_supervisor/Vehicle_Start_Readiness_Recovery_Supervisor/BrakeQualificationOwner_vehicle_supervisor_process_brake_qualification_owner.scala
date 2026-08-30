// #Sireum

package vehicle_start_readiness_recovery_supervisor.Vehicle_Start_Readiness_Recovery_Supervisor

import org.sireum._
import vehicle_start_readiness_recovery_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BrakeQualificationOwner_vehicle_supervisor_process_brake_qualification_owner {

  def initialise(api: BrakeQualificationOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_brake_to_authorization(Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts.example())
    api.put_brake_to_lifecycle(Vehicle_Start_Readiness_Recovery_Supervisor.BrakeFacts.example())
  }

  def timeTriggered(api: BrakeQualificationOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_brake_observation: Option[Vehicle_Start_Readiness_Recovery_Supervisor.BrakeObservation.Type] = api.get_brake_observation()
    api.logInfo(s"Received on data port brake_observation: ${apiUsage_brake_observation}")
  }

  def finalise(api: BrakeQualificationOwner_Operational_Api): Unit = { }
}
