// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Battery_Evidence_Qualification_charge_supervision_process_battery_evidence_qualification {

  def initialise(api: Battery_Evidence_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidence_to_owner(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_attention(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
    api.put_evidence_to_readiness(Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery)
  }

  def timeTriggered(api: Battery_Evidence_Qualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_battery_sample: Option[Drone_Battery_Charge_Supervisor.BatterySample] = api.get_battery_sample()
    api.logInfo(s"Received on data port battery_sample: ${apiUsage_battery_sample}")
  }

  def finalise(api: Battery_Evidence_Qualification_Operational_Api): Unit = { }
}
