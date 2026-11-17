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
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ATTENTION_INPUT_FAULT
        //   Input fault is pilot-visible | N.md#ATTENTION_INPUT_FAULT
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.InputFault),
        // case ATTENTION_RECOVERY_PENDING
        //   Recovery is pilot-visible | N.md#ATTENTION_RECOVERY_PENDING
        (api.charge_decision.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.RecoveryPending),
        // case ATTENTION_LOW_BATTERY
        //   Low valid evidence is pilot-visible outside fault/recovery | N.md#ATTENTION_LOW_BATTERY
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.LowBattery),
        // case ATTENTION_NONE
        //   Non-low valid evidence has no battery attention | N.md#ATTENTION_NONE
        (api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.charge_decision.disposition != Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence) ___>: (api.battery_attention == Drone_Battery_Charge_Supervisor.BatteryAttention.None)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_charge_decision: Option[Drone_Battery_Charge_Supervisor.ChargeDecision] = api.get_charge_decision()
    api.logInfo(s"Received on data port charge_decision: ${apiUsage_charge_decision}")
    val apiUsage_battery_evidence: Option[Drone_Battery_Charge_Supervisor.BatteryEvidence.Type] = api.get_battery_evidence()
    api.logInfo(s"Received on data port battery_evidence: ${apiUsage_battery_evidence}")
  }

  def finalise(api: Pilot_Attention_Derivation_Operational_Api): Unit = { }
}
