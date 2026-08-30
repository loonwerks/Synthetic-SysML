// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityRecoveryOwner_supervisorProcess_chargeEligibilityRecoveryOwner {

  def initialise(api: ChargeEligibilityRecoveryOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_chargeEligibilityEnvelope(ChargeEligibilityEnvelope.ELIGIBLE)
    // END WORK
  }

  def timeTriggered(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_10_EVIDENCE_PRECEDENCE
        (api.chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) ___>: (api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE &
            api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE),
        // case CASE_11_CHARGER_PRECEDENCE
        (api.chargeContextQualification != ChargeContextQualification.BLOCKED_EVIDENCE &
          api.chargerPathQualification == ChargerPathQualification.UNAVAILABLE) ___>: (api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER &
            api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER),
        // case CASE_12_CONTEXT_RECOVERY
        (api.chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT &
          api.chargerPathQualification != ChargerPathQualification.UNAVAILABLE) ___>: (api.currentChargeSession == ChargeSessionState.ENABLED ___>:
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT &
            api.currentChargeSession != ChargeSessionState.ENABLED ___>:
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT),
        // case CASE_13_ELIGIBLE
        (api.chargeContextQualification == ChargeContextQualification.ELIGIBLE &
          api.chargerPathQualification != ChargerPathQualification.UNAVAILABLE) ___>: (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val chargeContextQualification = api.get_chargeContextQualification().get
    val chargerPathQualification = api.get_chargerPathQualification().get
    val currentChargeSession = api.get_currentChargeSession().get
    var eligibility: ChargeEligibilityEnvelope.Type = ChargeEligibilityEnvelope.ELIGIBLE
    if (chargeContextQualification == ChargeContextQualification.BLOCKED_EVIDENCE) {
      if (currentChargeSession == ChargeSessionState.ENABLED) {
        eligibility = ChargeEligibilityEnvelope.RECOVER_EVIDENCE
      } else {
        eligibility = ChargeEligibilityEnvelope.BLOCKED_EVIDENCE
      }
    } else if (chargerPathQualification == ChargerPathQualification.UNAVAILABLE) {
      if (currentChargeSession == ChargeSessionState.ENABLED) {
        eligibility = ChargeEligibilityEnvelope.RECOVER_CHARGER
      } else {
        eligibility = ChargeEligibilityEnvelope.BLOCKED_CHARGER
      }
    } else if (chargeContextQualification == ChargeContextQualification.BLOCKED_CONTEXT) {
      if (currentChargeSession == ChargeSessionState.ENABLED) {
        eligibility = ChargeEligibilityEnvelope.RECOVER_CONTEXT
      } else {
        eligibility = ChargeEligibilityEnvelope.BLOCKED_CONTEXT
      }
    } else if (chargeContextQualification == ChargeContextQualification.ELIGIBLE) {
      eligibility = ChargeEligibilityEnvelope.ELIGIBLE
    }
    api.put_chargeEligibilityEnvelope(eligibility)
    // END WORK
  }

  def finalise(api: ChargeEligibilityRecoveryOwner_Operational_Api): Unit = { }
}
