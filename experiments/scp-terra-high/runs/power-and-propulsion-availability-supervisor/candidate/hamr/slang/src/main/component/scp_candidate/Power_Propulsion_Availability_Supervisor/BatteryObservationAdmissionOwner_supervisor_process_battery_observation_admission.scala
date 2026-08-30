// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryObservationAdmissionOwner_supervisor_process_battery_observation_admission {

  def initialise(api: BatteryObservationAdmissionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_ADMISSION_REJECTED
        api.qualified_battery.admission == AdmissionResult.REJECTED_INVALID &&
          api.qualified_battery.quality == BatteryQuality.UNKNOWN
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_battery(Power_Propulsion_Availability_Supervisor.QualifiedBatteryObservation(
      AdmissionResult.REJECTED_INVALID, BatteryQuality.UNKNOWN))
  }

  def timeTriggered(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
  def finalise(api: BatteryObservationAdmissionOwner_Operational_Api): Unit = { }
}
