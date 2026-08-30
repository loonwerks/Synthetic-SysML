// #Sireum #Logika

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Attention_Derivation_governor_process_attention_derivation {

  def initialise(api: Attention_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_ATTENTION_NONE
        api.attention_status == Drone_Lifecycle_Governor.Attention_Status.None
      )
    )
    api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.None)
  }

  def timeTriggered(api: Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // case ATTENTION_INPUT_FAULT
        (api.decision_disposition.input_fault_detected == T)
          ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Input_Fault),
        // case ATTENTION_RECOVERY
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == T)
          ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral),
        // case ATTENTION_LOW_BATTERY
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == F &
          api.battery_assessment == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)
          ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.Low_Battery),
        // case ATTENTION_NONE
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == F &
          api.battery_assessment != Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery)
          ___>: (api.attention_status == Drone_Lifecycle_Governor.Attention_Status.None)
      )
    )
    val disposition: Drone_Lifecycle_Governor.Decision_Disposition = api.get_decision_disposition().get
    val battery: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = api.get_battery_assessment().get
    var result: Drone_Lifecycle_Governor.Attention_Status.Type = Drone_Lifecycle_Governor.Attention_Status.None
    if (disposition.input_fault_detected) {
      result = Drone_Lifecycle_Governor.Attention_Status.Input_Fault
    } else if (disposition.recovery_pending) {
      result = Drone_Lifecycle_Governor.Attention_Status.Recovery_Awaiting_Neutral
    } else if (battery == Drone_Lifecycle_Governor.Battery_Assessment_Value.Low_Battery) {
      result = Drone_Lifecycle_Governor.Attention_Status.Low_Battery
    } else {
      result = Drone_Lifecycle_Governor.Attention_Status.None
    }
    api.put_attention_status(result)
  }

  def finalise(api: Attention_Derivation_Operational_Api): Unit = { }
}
