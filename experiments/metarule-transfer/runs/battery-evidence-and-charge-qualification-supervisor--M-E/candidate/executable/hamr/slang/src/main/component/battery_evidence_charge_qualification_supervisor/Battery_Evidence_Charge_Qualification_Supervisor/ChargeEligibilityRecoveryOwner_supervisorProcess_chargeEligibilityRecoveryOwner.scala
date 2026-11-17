// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner {

  def initialise(api: ChargeEligibilityRecoveryOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeEligibilityEnvelope(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE)
  }

  def timeTriggered(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargeContextQualification: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.Type] = api.get_chargeContextQualification()
    api.logInfo(s"Received on data port chargeContextQualification: ${apiUsage_chargeContextQualification}")
    val apiUsage_chargerPathQualification: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.Type] = api.get_chargerPathQualification()
    api.logInfo(s"Received on data port chargerPathQualification: ${apiUsage_chargerPathQualification}")
    val apiUsage_currentChargeSession: Option[Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type] = api.get_currentChargeSession()
    api.logInfo(s"Received on data port currentChargeSession: ${apiUsage_currentChargeSession}")
  }

  def finalise(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = { }
}
