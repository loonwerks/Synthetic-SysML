// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Assessment_governor_process_battery_assessment {

  def initialise(api: Battery_Assessment_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_battery
        api.battery_assessment == Battery_Assessment_Value.Invalid_Battery
        // END INITIALIZES ENSURES
      )
    )
    api.put_battery_assessment(Battery_Assessment_Value.Invalid_Battery)
  }

  def timeTriggered(api: Battery_Assessment_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case invalid
        (api.raw_battery.status == Input_Status.Invalid) ___>: (api.battery_assessment == Battery_Assessment_Value.Invalid_Battery),
        // case adequate
        (api.raw_battery.status == Input_Status.Valid &&
          api.raw_battery.indication == Battery_Indication.Adequate) ___>: (api.battery_assessment == Battery_Assessment_Value.Adequate_Battery),
        // case low
        (api.raw_battery.status == Input_Status.Valid &&
          api.raw_battery.indication == Battery_Indication.Low) ___>: (api.battery_assessment == Battery_Assessment_Value.Low_Battery)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val battery: Drone_Lifecycle_Governor.Battery_Sample = api.get_raw_battery().get
    val assessment: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type =
      if (battery.status == Input_Status.Invalid) {
        Battery_Assessment_Value.Invalid_Battery
      } else if (battery.indication == Battery_Indication.Adequate) {
        Battery_Assessment_Value.Adequate_Battery
      } else {
        Battery_Assessment_Value.Low_Battery
      }
    api.put_battery_assessment(assessment)
  }

  def finalise(api: Battery_Assessment_Operational_Api): Unit = { }
}
