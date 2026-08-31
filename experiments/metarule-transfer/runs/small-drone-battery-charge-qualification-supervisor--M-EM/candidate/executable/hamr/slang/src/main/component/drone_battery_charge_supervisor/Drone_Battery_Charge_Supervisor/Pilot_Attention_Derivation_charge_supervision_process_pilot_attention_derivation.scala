// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation {

  def initialise(api: Pilot_Attention_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
  }

  def timeTriggered(api: Pilot_Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault),
        // case ATTENTION_RECOVERY_PENDING
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending),
        // case ATTENTION_LOW_BATTERY
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery),
        // case ATTENTION_NONE
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_charge_decision().get
    val evidence = api.get_battery_evidence().get
    if (decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault) {
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault)
    } else if (decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) {
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending)
    } else if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) {
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery)
    } else {
      api.put_battery_attention(Drone_Battery_Charge_Supervisor.BatteryAttention.None)
    }
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
