// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryQualificationOwner_governorProcess_batteryQualificationOwner {

  def initialise(api: BatteryQualificationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_batteryQualification(Drone_Lifecycle_Governor.BatteryQualification.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryQualificationOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01
        //   batteryCheck INVALID -> batteryQualification UNAVAILABLE
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryQualification == BatteryQualification.UNAVAILABLE),
        // case CASE_02
        //   batteryCheck VALID and batteryCapacity LOW -> INSUFFICIENT
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryQualification == BatteryQualification.INSUFFICIENT),
        // case CASE_03
        //   batteryCheck VALID and batteryCapacity USABLE -> SUFFICIENT
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryQualification == BatteryQualification.SUFFICIENT)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val batteryQualification: Drone_Lifecycle_Governor.BatteryQualification.Type =
      if (api.batteryCheck == BatteryCheck.INVALID) {
        BatteryQualification.UNAVAILABLE
      } else if (api.batteryCapacity == BatteryCapacityBand.LOW) {
        BatteryQualification.INSUFFICIENT
      } else {
        BatteryQualification.SUFFICIENT
      }
    api.put_batteryQualification(batteryQualification)
  }

  def finalise(api: BatteryQualificationOwner_Operational_Api): Unit = { }
}
