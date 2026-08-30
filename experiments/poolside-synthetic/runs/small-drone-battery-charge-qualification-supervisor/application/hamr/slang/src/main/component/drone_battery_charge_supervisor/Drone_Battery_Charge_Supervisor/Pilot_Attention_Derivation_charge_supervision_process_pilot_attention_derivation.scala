// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation {

  def initialise(api: Pilot_Attention_Derivation_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.None
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_ATTENTION
    api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
  }

  def timeTriggered(api: Pilot_Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )

    // example api usage

    val charge_decision = api.get_charge_decision().get
    val battery_evidence = api.get_battery_evidence().get

    if (charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault) {
      // ATTENTION_INPUT_FAULT
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault)
    } else if (charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) {
      // ATTENTION_RECOVERY_PENDING
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending)
    } else if (battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) {
      // ATTENTION_LOW_BATTERY
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery)
    } else {
      // ATTENTION_NONE
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
    }
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
