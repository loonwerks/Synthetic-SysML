// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Attention_Derivation_governor_process_attention_derivation {

  def initialise(api: Attention_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_attention
        api.attention_status == Attention_Status.None
        // END INITIALIZES ENSURES
      )
    )
    api.put_attention_status(Attention_Status.None)
  }

  def timeTriggered(api: Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case input_fault
        (api.decision_disposition.input_fault_detected) ___>: (api.attention_status == Attention_Status.Input_Fault),
        // case recovery
        (!(api.decision_disposition.input_fault_detected) && api.decision_disposition.recovery_pending) ___>: (api.attention_status == Attention_Status.Recovery_Awaiting_Neutral),
        // case low_battery
        (!(api.decision_disposition.input_fault_detected) && !(api.decision_disposition.recovery_pending) &&
          api.battery_assessment == Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.Low_Battery),
        // case none
        (!(api.decision_disposition.input_fault_detected) && !(api.decision_disposition.recovery_pending) &&
          api.battery_assessment != Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val disposition: Drone_Lifecycle_Governor.Decision_Disposition = api.get_decision_disposition().get
    val battery: Drone_Lifecycle_Governor.Battery_Assessment_Value.Type = api.get_battery_assessment().get
    val attention: Drone_Lifecycle_Governor.Attention_Status.Type =
      if (disposition.input_fault_detected) {
        Attention_Status.Input_Fault
      } else if (disposition.recovery_pending) {
        Attention_Status.Recovery_Awaiting_Neutral
      } else if (battery == Battery_Assessment_Value.Low_Battery) {
        Attention_Status.Low_Battery
      } else {
        Attention_Status.None
      }
    api.put_attention_status(attention)
  }

  def finalise(api: Attention_Derivation_Operational_Api): Unit = { }
}
