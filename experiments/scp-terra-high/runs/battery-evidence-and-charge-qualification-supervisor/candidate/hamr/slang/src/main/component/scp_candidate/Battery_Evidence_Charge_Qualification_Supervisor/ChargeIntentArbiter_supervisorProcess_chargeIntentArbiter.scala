// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter {

  def initialise(api: ChargeIntentArbiter_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_decision
        api.chargeDecision == ChargeDecision.NO_CHANGE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_chargeDecision(Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE)
  }

  def timeTriggered(api: ChargeIntentArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_chargeRequest(), api.get_chargeEligibilityEnvelope()) match {
      case (Some(request), Some(envelope)) =>
        val decision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type =
          if (request == Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.CANCEL_CHARGE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.TERMINATE
          else if (envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_EVIDENCE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE
          else if (envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CHARGER)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER
          else if (envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CONTEXT)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT
          else if (request == Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE &&
            envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.AUTHORIZE
          else if (request == Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE &&
            envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE
          else if (request == Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE &&
            envelope == Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CHARGER)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER
          else if (request == Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE
        api.put_chargeDecision(decision)
    }
  }

  def finalise(api: ChargeIntentArbiter_Operational_Api): Unit = { }
}
