// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner {

  def initialise(api: ChargeEligibilityRecoveryOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeEligibilityEnvelope(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE)
  }

  def timeTriggered(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_10_EVIDENCE_PRECEDENCE
        (api.chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) ___>: ((api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) &
          (api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)),
        // case CASE_11_CHARGER_PRECEDENCE
        (api.chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE &
          api.chargerPathQualification == ChargerPathQualification.UNAVAILABLE) ___>: ((api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) &
          (api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER)),
        // case CASE_12_CONTEXT_RECOVERY
        (api.chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
          api.chargerPathQualification != ChargerPathQualification.UNAVAILABLE) ___>: ((api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) &
          (api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT)),
        // case CASE_13_ELIGIBLE
        (api.chargeContextQualification == ChargeContextQualification.ELIGIBLE &
          api.chargerPathQualification != ChargerPathQualification.UNAVAILABLE) ___>: (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val context = api.get_chargeContextQualification().get
    val path = api.get_chargerPathQualification().get
    val session = api.get_currentChargeSession().get
    if (context == ChargeContextQualification.BLOCKED_EVIDENCE) {
      if (session == ChargeSessionState.ENABLED) {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.RECOVER_EVIDENCE)
      } else {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)
      }
    } else if (path == ChargerPathQualification.UNAVAILABLE) {
      if (session == ChargeSessionState.ENABLED) {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.RECOVER_CHARGER)
      } else {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.BLOCKED_CHARGER)
      }
    } else if (context == ChargeContextQualification.BLOCKED_CONTEXT) {
      if (session == ChargeSessionState.ENABLED) {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.RECOVER_CONTEXT)
      } else {
        api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.BLOCKED_CONTEXT)
      }
    } else {
      api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.ELIGIBLE)
    }
  }

  def finalise(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = { }
}
