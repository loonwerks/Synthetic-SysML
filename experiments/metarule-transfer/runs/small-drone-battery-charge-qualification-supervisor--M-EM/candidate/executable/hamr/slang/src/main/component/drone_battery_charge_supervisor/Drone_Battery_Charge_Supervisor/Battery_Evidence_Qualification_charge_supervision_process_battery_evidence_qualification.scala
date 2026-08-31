// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification {

  def initialise(api: Battery_Evidence_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
  }

  def timeTriggered(api: Battery_Evidence_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case BATTERY_INVALID
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery),
        // case BATTERY_LOW
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.battery_sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Low) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence),
        // case BATTERY_ADEQUATE
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.battery_sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Adequate) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val sample = api.get_battery_sample().get
    if (sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) {
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    } else if (sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Low) {
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence)
    } else {
      api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
      api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
      api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
    }
  }

  def finalise(api: Battery_Evidence_Qualification_Operational_Api): Unit = { }
}
