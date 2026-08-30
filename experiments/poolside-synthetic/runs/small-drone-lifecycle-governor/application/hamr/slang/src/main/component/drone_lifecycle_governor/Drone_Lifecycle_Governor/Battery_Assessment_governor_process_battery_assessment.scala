// #Sireum #Logika

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Assessment_governor_process_battery_assessment {

  def initialise(api: Battery_Assessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // SAFE_INITIAL_BATTERY_FACT
        api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery
      )
    )
    api.put_battery_assessment(Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery)
  }

  def timeTriggered(api: Battery_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // case BATTERY_INVALID
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Invalid)
          ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery),
        // case BATTERY_ADEQUATE
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_battery.indication == Drone_Lifecycle_Governor.Battery_Indication.Adequate)
          ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery),
        // case BATTERY_LOW
        (api.raw_battery.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_battery.indication == Drone_Lifecycle_Governor.Battery_Indication.Low)
          ___>: (api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)
      )
    )
    val raw: Drone_Lifecycle_Governor.Battery_Sample = api.get_raw_battery().get
    var result: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery
    if (raw.status == Drone_Lifecycle_Governor.Input_Status.Invalid) {
      result = Drone_Lifecycle_Governor.Battery_Assessment_Value.Invalid_Battery
    } else {
      raw.indication match {
        case Drone_Lifecycle_Governor.Battery_Indication.Adequate =>
          result = Drone_Lifecycle_Governor.Battery_Assessment_Value.Adequate_Battery
        case Drone_Lifecycle_Governor.Battery_Indication.Low =>
          result = Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery
      }
    }
    api.put_battery_assessment(result)
  }

  def finalise(api: Battery_Assessment_Operational_Api): Unit = { }
}
