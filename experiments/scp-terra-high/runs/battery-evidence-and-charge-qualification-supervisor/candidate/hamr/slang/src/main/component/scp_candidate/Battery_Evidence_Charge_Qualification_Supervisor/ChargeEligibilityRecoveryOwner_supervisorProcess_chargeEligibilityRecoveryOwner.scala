// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner {

  def initialise(api: ChargeEligibilityRecoveryOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_envelope
        api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeEligibilityEnvelope(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)
  }

  def timeTriggered(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_chargeContextQualification(), api.get_chargerPathQualification(), api.get_currentChargeSession()) match {
      case (Some(context), Some(path), Some(session)) =>
        val envelope: Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.Type =
          if (context == Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_EVIDENCE)
            if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
              Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_EVIDENCE
            else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE
          else if (path == Battery_Evidence_Charge_Qualification_Supervisor.ChargerPathQualification.UNAVAILABLE)
            if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
              Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CHARGER
            else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CHARGER
          else if (context == Battery_Evidence_Charge_Qualification_Supervisor.ChargeContextQualification.BLOCKED_CONTEXT)
            if (session == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
              Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CONTEXT
            else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CONTEXT
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE
        api.put_chargeEligibilityEnvelope(envelope)
    }
  }

  def finalise(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = { }
}
