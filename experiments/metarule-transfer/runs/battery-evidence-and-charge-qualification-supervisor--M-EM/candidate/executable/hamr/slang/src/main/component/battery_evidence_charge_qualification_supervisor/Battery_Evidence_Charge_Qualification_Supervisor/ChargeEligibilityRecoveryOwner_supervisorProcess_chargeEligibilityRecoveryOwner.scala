// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner {

  def initialise(api: ChargeEligibilityRecoveryOwner_Initialization_Api): Unit = {
    api.put_chargeEligibilityEnvelope(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = {
    val result: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type =
      (api.get_chargeContextQualification(), api.get_chargerPathQualification(),
      api.get_currentChargeSession()) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE), _, Some(session)) =>
        if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
          Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_EVIDENCE
        else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE
      case (Some(_), Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE), Some(session)) =>
        if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
          Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CHARGER
        else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CHARGER
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_CONTEXT), Some(_), Some(session)) =>
        if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
          Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CONTEXT
        else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CONTEXT
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.ELIGIBLE), Some(_), Some(_)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE
    }
    api.put_chargeEligibilityEnvelope(result)
  }

  def finalise(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = { }
}
