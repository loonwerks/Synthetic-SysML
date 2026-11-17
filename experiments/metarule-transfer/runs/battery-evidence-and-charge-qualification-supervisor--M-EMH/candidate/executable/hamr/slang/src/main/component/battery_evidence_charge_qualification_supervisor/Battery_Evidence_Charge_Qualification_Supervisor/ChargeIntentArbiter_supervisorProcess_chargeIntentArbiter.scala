// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter {

  def initialise(api: ChargeIntentArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_chargeDecision(Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE)
  }

  def timeTriggered(api: ChargeIntentArbiter_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CASE_14_CANCEL_PRIORITY
        //   Cancellation overrides all other intents | N.md
        (api.chargeRequest == ChargeRequest.CANCEL_CHARGE) ___>: (api.chargeDecision == ChargeDecision.TERMINATE),
        // case CASE_15_RECOVERY_PRIORITY
        //   Recovery overrides fresh requests | N.md
        (api.chargeRequest != ChargeRequest.CANCEL_CHARGE &
          (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE |
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER |
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT)) ___>: ((api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE ___>:
          api.chargeDecision == ChargeDecision.RECOVER_EVIDENCE) &
          (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CHARGER ___>:
            api.chargeDecision == ChargeDecision.RECOVER_CHARGER) &
          (api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT ___>:
            api.chargeDecision == ChargeDecision.RECOVER_CONTEXT)),
        // case CASE_16_REQUEST_OR_HOLD
        //   Authorize, reject, or hold after priority checks | N.md
        (api.chargeRequest != ChargeRequest.CANCEL_CHARGE &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_EVIDENCE &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CHARGER &
          api.chargeEligibilityEnvelope != ChargeEligibilityEnvelope.RECOVER_CONTEXT) ___>: ((api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
          api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.ELIGIBLE ___>:
          api.chargeDecision == ChargeDecision.AUTHORIZE) &
          (api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE ___>:
            api.chargeDecision == ChargeDecision.REJECT_EVIDENCE) &
          (api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER ___>:
            api.chargeDecision == ChargeDecision.REJECT_CHARGER) &
          (api.chargeRequest == ChargeRequest.REQUEST_CHARGE &
            api.chargeEligibilityEnvelope == ChargeEligibilityEnvelope.BLOCKED_CONTEXT ___>:
            api.chargeDecision == ChargeDecision.REJECT_CONTEXT) &
          (api.chargeRequest == ChargeRequest.NO_REQUEST ___>:
            api.chargeDecision == ChargeDecision.NO_CHANGE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request = api.get_chargeRequest().get
    val envelope = api.get_chargeEligibilityEnvelope().get
    if (request == ChargeRequest.CANCEL_CHARGE) {
      api.put_chargeDecision(ChargeDecision.TERMINATE)
    } else if (envelope == ChargeEligibilityEnvelope.RECOVER_EVIDENCE) {
      api.put_chargeDecision(ChargeDecision.RECOVER_EVIDENCE)
    } else if (envelope == ChargeEligibilityEnvelope.RECOVER_CHARGER) {
      api.put_chargeDecision(ChargeDecision.RECOVER_CHARGER)
    } else if (envelope == ChargeEligibilityEnvelope.RECOVER_CONTEXT) {
      api.put_chargeDecision(ChargeDecision.RECOVER_CONTEXT)
    } else if (request == ChargeRequest.NO_REQUEST) {
      api.put_chargeDecision(ChargeDecision.NO_CHANGE)
    } else if (envelope == ChargeEligibilityEnvelope.ELIGIBLE) {
      api.put_chargeDecision(ChargeDecision.AUTHORIZE)
    } else if (envelope == ChargeEligibilityEnvelope.BLOCKED_EVIDENCE) {
      api.put_chargeDecision(ChargeDecision.REJECT_EVIDENCE)
    } else if (envelope == ChargeEligibilityEnvelope.BLOCKED_CHARGER) {
      api.put_chargeDecision(ChargeDecision.REJECT_CHARGER)
    } else {
      api.put_chargeDecision(ChargeDecision.REJECT_CONTEXT)
    }
  }

  def finalise(api: ChargeIntentArbiter_Operational_Api): Unit = { }
}
