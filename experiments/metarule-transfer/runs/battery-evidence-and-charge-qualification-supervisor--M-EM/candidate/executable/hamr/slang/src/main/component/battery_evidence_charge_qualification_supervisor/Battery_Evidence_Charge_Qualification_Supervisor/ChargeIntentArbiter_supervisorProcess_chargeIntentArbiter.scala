// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeIntentArbiter_supervisorProcess_chargeIntentArbiter {

  def initialise(api: ChargeIntentArbiter_Initialization_Api): Unit = {
    api.put_chargeDecision(Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE)
  }

  def timeTriggered(api: ChargeIntentArbiter_Operational_Api): Unit = {
    val decision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type =
      (api.get_chargeRequest(), api.get_chargeEligibilityEnvelope()) match {
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.CANCEL_CHARGE), _) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.TERMINATE
      case (_, Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_EVIDENCE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE
      case (_, Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CHARGER)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER
      case (_, Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.RECOVER_CONTEXT)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.ELIGIBLE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.AUTHORIZE
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_EVIDENCE)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CHARGER)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER
      case (Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeRequest.REQUEST_CHARGE),
            Some(Battery_Evidence_Charge_Qualification_Supervisor.ChargeEligibilityEnvelope.BLOCKED_CONTEXT)) =>
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE
    }
    api.put_chargeDecision(decision)
  }

  def finalise(api: ChargeIntentArbiter_Operational_Api): Unit = { }
}
