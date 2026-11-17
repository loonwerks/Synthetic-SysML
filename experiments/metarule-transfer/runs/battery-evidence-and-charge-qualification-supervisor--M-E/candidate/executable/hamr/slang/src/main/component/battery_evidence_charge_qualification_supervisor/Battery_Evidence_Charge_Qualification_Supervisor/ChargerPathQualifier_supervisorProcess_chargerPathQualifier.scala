// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargerPathQualifier_supervisorProcess_chargerPathQualifier {

  def initialise(api: ChargerPathQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargerPathQualification(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
  }

  def timeTriggered(api: ChargerPathQualifier_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargerConnection: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargerConnection.Type] = api.get_chargerConnection()
    api.logInfo(s"Received on data port chargerConnection: ${apiUsage_chargerConnection}")
    val apiUsage_chargeActivity: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeActivity.Type] = api.get_chargeActivity()
    api.logInfo(s"Received on data port chargeActivity: ${apiUsage_chargeActivity}")
  }

  def finalise(api: ChargerPathQualifier_Operational_Api): Unit = { }
}
