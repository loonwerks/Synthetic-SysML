// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission {

  def initialise(api: BatteryObservationAdmissionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_battery(Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation.example())
  }

  def timeTriggered(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_battery_observation: Option[Power_Propulsion_Availability_Supervisor.BatteryObservation] = api.get_battery_observation()
    api.logInfo(s"Received on data port battery_observation: ${apiUsage_battery_observation}")
  }

  def finalise(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
}
