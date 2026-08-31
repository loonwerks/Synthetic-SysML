// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

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
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01
        //   Invalid battery check is unavailable
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryQualification == BatteryQualification.UNAVAILABLE),
        // case CASE_02
        //   Valid low battery is insufficient
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryQualification == BatteryQualification.INSUFFICIENT),
        // case CASE_03
        //   Valid usable battery is sufficient
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryQualification == BatteryQualification.SUFFICIENT)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val qualification: Drone_Lifecycle_Governor.BatteryQualification.Type =
      if (api.get_batteryCheck().get == BatteryCheck.INVALID) {
        BatteryQualification.UNAVAILABLE
      } else if (api.get_batteryCapacity().get == BatteryCapacityBand.LOW) {
        BatteryQualification.INSUFFICIENT
      } else {
        BatteryQualification.SUFFICIENT
      }
    api.put_batteryQualification(qualification)
  }

  def finalise(api: BatteryQualificationOwner_Operational_Api): Unit = { }
}
