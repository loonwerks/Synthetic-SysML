// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Assessment_governor_process_battery_assessment {

  def initialise(api: Battery_Assessment_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery)
  }

  def timeTriggered(api: Battery_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case BATTERY_INVALID
        //   N.md#BATTERY_INVALID
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Invalid) ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery),
        // case BATTERY_ADEQUATE
        //   N.md#BATTERY_ADEQUATE
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_battery.indication == Drone_Lifecycle_Governor.Battery_Indication.Adequate) ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery),
        // case BATTERY_LOW
        //   N.md#BATTERY_LOW
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_battery.indication == Drone_Lifecycle_Governor.Battery_Indication.Low) ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val battery = api.get_raw_battery().get
    if (battery.status == Drone_Lifecycle_Governor.Input_Status.Invalid) {
      api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery)
    } else if (battery.indication == Drone_Lifecycle_Governor.Battery_Indication.Adequate) {
      api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery)
    } else {
      api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)
    }
  }

  def finalise(api: Battery_Assessment_Operational_Api): Unit = { }
}
