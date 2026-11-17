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
        //   Invalid battery check makes capacity unavailable
        (api.batteryCheck == BatteryCheck.INVALID) ___>: (api.batteryQualification == BatteryQualification.UNAVAILABLE),
        // case CASE_02
        //   Valid low capacity is insufficient
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.LOW) ___>: (api.batteryQualification == BatteryQualification.INSUFFICIENT),
        // case CASE_03
        //   Valid usable capacity is sufficient
        (api.batteryCheck == BatteryCheck.VALID &
          api.batteryCapacity == BatteryCapacityBand.USABLE) ___>: (api.batteryQualification == BatteryQualification.SUFFICIENT)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val capacity = api.get_batteryCapacity()
    val check = api.get_batteryCheck()
    (capacity, check) match {
      case (Some(BatteryCapacityBand.LOW), Some(BatteryCheck.VALID)) =>
        api.put_batteryQualification(BatteryQualification.INSUFFICIENT)
      case (Some(BatteryCapacityBand.USABLE), Some(BatteryCheck.VALID)) =>
        api.put_batteryQualification(BatteryQualification.SUFFICIENT)
      case _ =>
        api.put_batteryQualification(BatteryQualification.UNAVAILABLE)
    }
  }

  def finalise(api: BatteryQualificationOwner_Operational_Api): Unit = { }
}
