// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Pilot_Attention_Derivation_charge_supervision_process_pilot_attention_derivation {

  def initialise(api: Pilot_Attention_Derivation_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_battery_attention(BatteryAttention.None)
  }

  def timeTriggered(api: Pilot_Attention_Derivation_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        (api.charge_decision.disposition == ChargeDisposition.InputFault) ___>: (api.battery_attention == BatteryAttention.InputFault),
        // case ATTENTION_RECOVERY_PENDING
        (api.charge_decision.disposition == ChargeDisposition.RecoveryPending) ___>: (api.battery_attention == BatteryAttention.RecoveryPending),
        // case ATTENTION_LOW_BATTERY
        (api.charge_decision.disposition != ChargeDisposition.InputFault &
          api.charge_decision.disposition != ChargeDisposition.RecoveryPending &
          api.battery_evidence == BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == BatteryAttention.LowBattery),
        // case ATTENTION_NONE
        (api.charge_decision.disposition != ChargeDisposition.InputFault &
          api.charge_decision.disposition != ChargeDisposition.RecoveryPending &
          api.battery_evidence != BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == BatteryAttention.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val decision = api.get_charge_decision().get
    val evidence = api.get_battery_evidence().get
    val attention: BatteryAttention.Type =
      if (decision.disposition == ChargeDisposition.InputFault) {
        BatteryAttention.InputFault
      } else if (decision.disposition == ChargeDisposition.RecoveryPending) {
        BatteryAttention.RecoveryPending
      } else if (evidence == BatteryEvidence.LowBatteryEvidence) {
        BatteryAttention.LowBattery
      } else {
        BatteryAttention.None
      }
    api.put_battery_attention(attention)
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
