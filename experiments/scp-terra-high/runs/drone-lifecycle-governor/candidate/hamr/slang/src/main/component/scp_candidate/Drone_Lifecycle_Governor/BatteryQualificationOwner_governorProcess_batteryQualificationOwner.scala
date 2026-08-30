// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryQualificationOwner_governorProcess_batteryQualificationOwner {

  def initialise(api: BatteryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryQualification(Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryQualificationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryCapacity(), api.get_batteryCheck()) match {
      case (Some(capacity), Some(check)) =>
        val qualification: Drone_Lifecycle_Governor.BatteryQualification.Type =
          if (check == Drone_Lifecycle_Governor.BatteryCheck.INVALID) Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE
          else if (capacity == Drone_Lifecycle_Governor.BatteryCapacityBand.LOW) Drone_Lifecycle_Governor.BatteryQualification.INSUFFICIENT
          else Drone_Lifecycle_Governor.BatteryQualification.SUFFICIENT
        api.put_batteryQualification(qualification)
    }
  }

  def finalise(api: BatteryQualificationOwner_Operational_Api): Unit = { }
}
