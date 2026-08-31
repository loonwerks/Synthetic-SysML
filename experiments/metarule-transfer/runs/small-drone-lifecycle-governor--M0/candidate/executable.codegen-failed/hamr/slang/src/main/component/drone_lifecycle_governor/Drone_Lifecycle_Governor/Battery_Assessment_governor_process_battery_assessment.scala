// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Assessment_governor_process_battery_assessment {

  def initialise(api: Battery_Assessment_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery)
  }

  def timeTriggered(api: Battery_Assessment_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case BATTERY_INVALID
        (api.raw_battery.status == Input_Status.Invalid) ___>: (api.battery_assessment == Battery_Assessment_Value.Invalid_Battery),
        // case BATTERY_ADEQUATE
        (api.raw_battery.status == Input_Status.Valid &
          api.raw_battery.indication == Battery_Indication.Adequate) ___>: (api.battery_assessment == Battery_Assessment_Value.Adequate_Battery),
        // case BATTERY_LOW
        (api.raw_battery.status == Input_Status.Valid &
          api.raw_battery.indication == Battery_Indication.Low) ___>: (api.battery_assessment == Battery_Assessment_Value.Low_Battery)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_raw_battery: Option[Drone_Lifecycle_Governor.Battery_Sample] = api.get_raw_battery()
    api.logInfo(s"Received on data port raw_battery: ${apiUsage_raw_battery}")
  }

  def finalise(api: Battery_Assessment_Operational_Api): Unit = { }
}
