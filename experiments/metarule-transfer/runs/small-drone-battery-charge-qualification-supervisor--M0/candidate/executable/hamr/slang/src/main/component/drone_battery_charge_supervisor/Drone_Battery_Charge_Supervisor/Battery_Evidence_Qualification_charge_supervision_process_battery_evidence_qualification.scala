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
        //   Invalid battery evidence is published to every consumer | N.md#BATTERY_INVALID
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery),
        // case BATTERY_LOW
        //   Valid Low sample is qualified consistently | N.md#BATTERY_LOW
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.battery_sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Low) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence),
        // case BATTERY_ADEQUATE
        //   Valid Adequate sample is qualified consistently | N.md#BATTERY_ADEQUATE
        (api.battery_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.battery_sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Adequate) ___>: (api.evidence_to_owner == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_attention == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_readiness == Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val sample: Drone_Battery_Charge_Supervisor.BatterySample = api.get_battery_sample().get
    val evidence: Drone_Battery_Charge_Supervisor.BatteryEvidence.Type =
      if (sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid) {
        if (sample.indication == Drone_Battery_Charge_Supervisor.BatteryIndication.Low) {
          Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence
        } else {
          Drone_Battery_Charge_Supervisor.BatteryEvidence.AdequateBatteryEvidence
        }
      } else {
        Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery
    }
    api.put_evidence_to_owner(evidence)
    api.put_evidence_to_attention(evidence)
    api.put_evidence_to_readiness(evidence)
  }

  def finalise(api: Battery_Evidence_Qualification_Operational_Api): Unit = { }
}
