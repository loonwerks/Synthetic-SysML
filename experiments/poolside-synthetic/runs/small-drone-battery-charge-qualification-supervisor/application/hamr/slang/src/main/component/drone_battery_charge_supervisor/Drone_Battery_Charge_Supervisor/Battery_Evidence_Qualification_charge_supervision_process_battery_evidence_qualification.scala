// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification {

  def initialise(api: Battery_Evidence_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
        api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
        api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_BATTERY_EVIDENCE
    api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
  }

  def timeTriggered(api: Battery_Evidence_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.evidence_to_owner == api.evidence_to_attention &
        api.evidence_to_owner == api.evidence_to_readiness
      )
    )

    // example api usage

    val battery_sample = api.get_battery_sample().get

    if (battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) {
      // BATTERY_INVALID
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    } else if (battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
               battery_sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Low) {
      // BATTERY_LOW
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
    } else {
      // BATTERY_ADEQUATE
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
    }
  }

  def finalise(api: Battery_Evidence_Qualification_Operational_Api): Unit = { }
}
