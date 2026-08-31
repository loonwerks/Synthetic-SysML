// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation {

  def initialise(api: Pilot_Attention_Derivation_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
  }

  def timeTriggered(api: Pilot_Attention_Derivation_Operational_Api): Unit = {
    // example api usage

    val apiUsage_charge_decision: Option[Drone_Battery_Charge_Supervisor.ChargeDecision] = api.get_charge_decision()
    api.logInfo(s"Received on data port charge_decision: ${apiUsage_charge_decision}")
    val apiUsage_battery_evidence: Option[Drone_Battery_Charge_Supervisor.BatteryEvidence.Type] = api.get_battery_evidence()
    api.logInfo(s"Received on data port battery_evidence: ${apiUsage_battery_evidence}")
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
