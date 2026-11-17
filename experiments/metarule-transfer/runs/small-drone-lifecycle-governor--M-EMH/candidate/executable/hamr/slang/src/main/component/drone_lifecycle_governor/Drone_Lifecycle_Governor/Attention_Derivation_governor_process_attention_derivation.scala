// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Attention_Derivation_governor_process_attention_derivation {

  def initialise(api: Attention_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.None)
  }

  def timeTriggered(api: Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        //   N.md#ATTENTION_INPUT_FAULT
        (api.decision_disposition.input_fault_detected) ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Input_Fault),
        // case ATTENTION_RECOVERY
        //   N.md#ATTENTION_RECOVERY
        (!(api.decision_disposition.input_fault_detected) & api.decision_disposition.recovery_pending) ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral),
        // case ATTENTION_LOW_BATTERY
        //   N.md#ATTENTION_LOW_BATTERY
        (!(api.decision_disposition.input_fault_detected) & !(api.decision_disposition.recovery_pending) &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Low_Battery),
        // case ATTENTION_NONE
        //   N.md#ATTENTION_NONE
        (!(api.decision_disposition.input_fault_detected) & !(api.decision_disposition.recovery_pending) &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val disposition = api.get_decision_disposition().get
    val battery = api.get_battery_assessment().get
    if (disposition.input_fault_detected) {
      api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.Input_Fault)
    } else if (disposition.recovery_pending) {
      api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral)
    } else if (battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) {
      api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.Low_Battery)
    } else {
      api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.None)
    }
  }

  def finalise(api: Attention_Derivation_Operational_Api): Unit = { }
}
