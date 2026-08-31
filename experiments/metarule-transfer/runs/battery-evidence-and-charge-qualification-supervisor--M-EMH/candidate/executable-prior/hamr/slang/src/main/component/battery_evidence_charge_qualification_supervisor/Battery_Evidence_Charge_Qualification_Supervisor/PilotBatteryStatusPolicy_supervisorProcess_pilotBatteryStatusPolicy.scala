// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PilotBatteryStatusPolicy_supervisorProcess_pilotBatteryStatusPolicy {

  def initialise(api: PilotBatteryStatusPolicy_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotBatteryStatus(Battery_Evidence_Charge_Qualification_Supervisor.PilotBatteryStatus.example())
  }

  def timeTriggered(api: PilotBatteryStatusPolicy_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryAssessment: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.Type] = api.get_batteryAssessment()
    api.logInfo(s"Received on data port batteryAssessment: ${apiUsage_batteryAssessment}")
    val apiUsage_chargerPathQualification: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type] = api.get_chargerPathQualification()
    api.logInfo(s"Received on data port chargerPathQualification: ${apiUsage_chargerPathQualification}")
    val apiUsage_chargeSessionSnapshot: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot] = api.get_chargeSessionSnapshot()
    api.logInfo(s"Received on data port chargeSessionSnapshot: ${apiUsage_chargeSessionSnapshot}")
  }

  def finalise(api: PilotBatteryStatusPolicy_Operational_Api): Unit = { }
}
