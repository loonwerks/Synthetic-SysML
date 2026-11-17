// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Attention_Derivation_governor_process_attention_derivation {

  def initialise(api: Attention_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    api.put_attention_status(Attention_Status.None)
  }

  def timeTriggered(api: Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        (api.decision_disposition.input_fault_detected == T) ___>: (api.attention_status == Attention_Status.Input_Fault),
        // case ATTENTION_RECOVERY
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == T) ___>: (api.attention_status == Attention_Status.Recovery_Awaiting_Neutral),
        // case ATTENTION_LOW_BATTERY
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == F &
          api.battery_assessment == Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.Low_Battery),
        // case ATTENTION_NONE
        (api.decision_disposition.input_fault_detected == F &
          api.decision_disposition.recovery_pending == F &
          api.battery_assessment != Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_decision_disposition(), api.get_battery_assessment()) match {
      case (Some(disposition), Some(assessment)) =>
        if (disposition.input_fault_detected) {
          api.put_attention_status(Attention_Status.Input_Fault)
        } else if (disposition.recovery_pending) {
          api.put_attention_status(Attention_Status.Recovery_Awaiting_Neutral)
        } else if (assessment == Battery_Assessment_Value.Low_Battery) {
          api.put_attention_status(Attention_Status.Low_Battery)
        } else {
          api.put_attention_status(Attention_Status.None)
        }
    }
  }

  def finalise(api: Attention_Derivation_Operational_Api): Unit = { }
}
