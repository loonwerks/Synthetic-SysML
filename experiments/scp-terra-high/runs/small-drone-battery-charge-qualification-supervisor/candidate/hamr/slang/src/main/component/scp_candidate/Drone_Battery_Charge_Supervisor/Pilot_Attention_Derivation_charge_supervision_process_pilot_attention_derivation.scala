// #Sireum

package scp_candidate.Drone_Battery_Charge_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation {

  def initialise(api: Pilot_Attention_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
  }

  def timeTriggered(api: Pilot_Attention_Derivation_Operational_Api): Unit = {
    Contract(Modifies(api))
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
