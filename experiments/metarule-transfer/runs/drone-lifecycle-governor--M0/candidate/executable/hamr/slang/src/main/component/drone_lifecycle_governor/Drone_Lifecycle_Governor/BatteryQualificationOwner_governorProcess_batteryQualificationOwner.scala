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
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_01
        //   Invalid battery check is unavailable | N.md#CASE_01
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryQualification == BatteryQualification.UNAVAILABLE),
        // case CASE_02
        //   Valid low capacity is insufficient | N.md#CASE_02
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryQualification == BatteryQualification.INSUFFICIENT),
        // case CASE_03
        //   Valid usable capacity is sufficient | N.md#CASE_03
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryQualification == BatteryQualification.SUFFICIENT)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val capacity = api.get_batteryCapacity().get
    val check = api.get_batteryCheck().get
    val qualification: BatteryQualification.Type =
      if (check == BatteryCheck.INVALID) BatteryQualification.UNAVAILABLE
      else if (capacity == BatteryCapacityBand.LOW) BatteryQualification.INSUFFICIENT
      else BatteryQualification.SUFFICIENT
    api.put_batteryQualification(qualification)
  }

  def finalise(api: BatteryQualificationOwner_Operational_Api): Unit = { }
}
