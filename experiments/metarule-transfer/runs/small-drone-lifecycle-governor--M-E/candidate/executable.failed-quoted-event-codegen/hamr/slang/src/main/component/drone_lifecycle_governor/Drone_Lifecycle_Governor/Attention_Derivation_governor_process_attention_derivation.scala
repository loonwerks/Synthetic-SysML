// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Attention_Derivation_governor_process_attention_derivation {

  def initialise(api: Attention_Derivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_attention_status(Drone_Lifecycle_Governor.Attention_Status.None)
  }

  def timeTriggered(api: Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        (api.decision_disposition.input_fault_detected) ___>: (api.attention_status == Attention_Status.Input_Fault),
        // case ATTENTION_RECOVERY
        (!(api.decision_disposition.input_fault_detected) & api.decision_disposition.recovery_pending) ___>: (api.attention_status == Attention_Status.Recovery_Awaiting_Neutral),
        // case ATTENTION_LOW_BATTERY
        (!(api.decision_disposition.input_fault_detected) & !(api.decision_disposition.recovery_pending) &
          api.battery_assessment == Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.Low_Battery),
        // case ATTENTION_NONE
        (!(api.decision_disposition.input_fault_detected) & !(api.decision_disposition.recovery_pending) &
          api.battery_assessment != Battery_Assessment_Value.Low_Battery) ___>: (api.attention_status == Attention_Status.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_decision_disposition: Option[Drone_Lifecycle_Governor.Decision_Disposition] = api.get_decision_disposition()
    api.logInfo(s"Received on data port decision_disposition: ${apiUsage_decision_disposition}")
    val apiUsage_battery_assessment: Option[Drone_Lifecycle_Governor.Battery_Assessment_Value.Type] = api.get_battery_assessment()
    api.logInfo(s"Received on data port battery_assessment: ${apiUsage_battery_assessment}")
  }

  def finalise(api: Attention_Derivation_Operational_Api): Unit = { }
}
