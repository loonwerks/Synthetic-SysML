// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryEvidenceQualifier_supervisorProcess_batteryEvidenceQualifier {

  def initialise(api: BatteryEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_batteryAssessment(Battery_Evidence_Charge_Qualification_Supervisor.BatteryAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: BatteryEvidenceQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryCapacity: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCapacityBand.Type] = api.get_batteryCapacity()
    api.logInfo(s"Received on data port batteryCapacity: ${apiUsage_batteryCapacity}")
    val apiUsage_batteryCheck: Option[Battery_Evidence_Charge_Qualification_Supervisor.BatteryCheck.Type] = api.get_batteryCheck()
    api.logInfo(s"Received on data port batteryCheck: ${apiUsage_batteryCheck}")
  }

  def finalise(api: BatteryEvidenceQualifier_Operational_Api): Unit = { }
}
