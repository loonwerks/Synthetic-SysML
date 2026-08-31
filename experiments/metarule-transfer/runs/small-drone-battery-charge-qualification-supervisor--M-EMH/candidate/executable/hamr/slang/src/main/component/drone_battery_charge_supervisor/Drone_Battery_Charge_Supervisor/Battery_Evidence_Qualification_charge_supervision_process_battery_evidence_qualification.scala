// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification {

  def initialise(api: Battery_Evidence_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_evidence_to_owner(BatteryEvidence.InvalidBattery)
    api.put_evidence_to_attention(BatteryEvidence.InvalidBattery)
    api.put_evidence_to_readiness(BatteryEvidence.InvalidBattery)
  }

  def timeTriggered(api: Battery_Evidence_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case BATTERY_INVALID
        (api.battery_sample.status == InputStatus.Invalid) ___>: (api.evidence_to_owner == BatteryEvidence.InvalidBattery &
          api.evidence_to_attention == BatteryEvidence.InvalidBattery &
          api.evidence_to_readiness == BatteryEvidence.InvalidBattery),
        // case BATTERY_LOW
        (api.battery_sample.status == InputStatus.Valid &
          api.battery_sample.indication == BatteryIndication.Low) ___>: (api.evidence_to_owner == BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_attention == BatteryEvidence.LowBatteryEvidence &
          api.evidence_to_readiness == BatteryEvidence.LowBatteryEvidence),
        // case BATTERY_ADEQUATE
        (api.battery_sample.status == InputStatus.Valid &
          api.battery_sample.indication == BatteryIndication.Adequate) ___>: (api.evidence_to_owner == BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_attention == BatteryEvidence.AdequateBatteryEvidence &
          api.evidence_to_readiness == BatteryEvidence.AdequateBatteryEvidence)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val sample = api.get_battery_sample().get
    val evidence: BatteryEvidence.Type =
      if (sample.status == InputStatus.Invalid) {
        BatteryEvidence.InvalidBattery
      } else if (sample.indication == BatteryIndication.Low) {
        BatteryEvidence.LowBatteryEvidence
      } else {
        BatteryEvidence.AdequateBatteryEvidence
      }
    api.put_evidence_to_owner(evidence)
    api.put_evidence_to_attention(evidence)
    api.put_evidence_to_readiness(evidence)
  }

  def finalise(api: Battery_Evidence_Qualification_Operational_Api): Unit = { }
}
