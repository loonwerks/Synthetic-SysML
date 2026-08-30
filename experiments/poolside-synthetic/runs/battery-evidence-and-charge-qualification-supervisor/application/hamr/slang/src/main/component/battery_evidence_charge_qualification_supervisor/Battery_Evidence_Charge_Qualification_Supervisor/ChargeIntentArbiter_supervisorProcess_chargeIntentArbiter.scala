// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter {

  def initialise(api: ChargeIntentArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_chargeDecision(ChargeDecision.NO_CHANGE)
    // END WORK
  }

  def timeTriggered(api: ChargeIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_14_CANCEL_PRIORITY
        (api.chargeRequest == ChargeRequest.CANCEL_CHARGE) ___>: (api.chargeDecision == ChargeDecision.TERMINATE),
        // case CASE_15_RECOVERY_PRIORITY
        (api.chargeRequest != ChargeRequest.CANCEL_CHARGE &
          (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE |
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER |
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) ___>: (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE ___>:
          api.chargeDecision == ChargeDecision.RECOVER_EVIDENCE &
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER ___>:
            api.chargeDecision == ChargeDecision.RECOVER_CHARGER &
              api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT ___>:
              api.chargeDecision == ChargeDecision.RECOVER_CONTEXT),
        // case CASE_16_REQUEST_OR_HOLD
        (api.chargeRequest != ChargeRequest.CANCEL_CHARGE &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT) ___>: (api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE ___>:
          api.chargeDecision == ChargeDecision.AUTHORIZE &
            api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE ___>:
            api.chargeDecision == ChargeDecision.REJECT_EVIDENCE &
              api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
              api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER ___>:
              api.chargeDecision == ChargeDecision.REJECT_CHARGER &
                api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
                api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT ___>:
                api.chargeDecision == ChargeDecision.REJECT_CONTEXT &
                  api.chargeRequest == ChargeRequest.NO_REQUEST ___>:
                  api.chargeDecision == ChargeDecision.NO_CHANGE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val chargeRequest = api.get_chargeRequest().get
    val chargeEligibilityEnvelope = api.get_chargeEligibilityEnvelope().get
    var decision: ChargeDecision.Type = ChargeDecision.NO_CHANGE
    if (chargeRequest == ChargeRequest.CANCEL_CHARGE) {
      decision = ChargeDecision.TERMINATE
    } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) {
      decision = ChargeDecision.RECOVER_EVIDENCE
    } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) {
      decision = ChargeDecision.RECOVER_CHARGER
    } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) {
      decision = ChargeDecision.RECOVER_CONTEXT
    } else if (chargeRequest == ChargeRequest.REQUEST_CHARGE) {
      if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE) {
        decision = ChargeDecision.AUTHORIZE
      } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE) {
        decision = ChargeDecision.REJECT_EVIDENCE
      } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER) {
        decision = ChargeDecision.REJECT_CHARGER
      } else if (chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT) {
        decision = ChargeDecision.REJECT_CONTEXT
      }
    } else {
      decision = ChargeDecision.NO_CHANGE
    }
    api.put_chargeDecision(decision)
    // END WORK
  }

  def finalise(api: ChargeIntentArbiter_Operational_Api): Unit = { }
}
