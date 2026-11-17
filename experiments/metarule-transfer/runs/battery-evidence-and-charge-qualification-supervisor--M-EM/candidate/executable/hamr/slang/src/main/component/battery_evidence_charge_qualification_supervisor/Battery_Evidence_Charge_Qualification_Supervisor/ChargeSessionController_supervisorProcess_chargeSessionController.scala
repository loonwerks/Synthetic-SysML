// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionController_supervisorProcess_chargeSessionController {

  var committedChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type =
    Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE

  def initialise(api: ChargeSessionController_Initialization_Api): Unit = {
    committedChargeSession = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE
    api.put_currentChargeSession(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE)
    api.put_chargeSessionSnapshot(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.IDLE,
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.IDLE,
      Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.NO_CHANGE,
      Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.NONE))
    api.put_chargePermission(Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED)
  }

  def timeTriggered(api: ChargeSessionController_Operational_Api): Unit = {
    val previous: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = committedChargeSession
    val decision: Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.Type = api.get_chargeDecision() match {
      case Some(value) => value
      case _ => Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.NO_CHANGE
    }
    val isAuthorize: B = decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.AUTHORIZE
    val isTerminate: B = decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.TERMINATE
    val isRecover: B = decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE ||
      decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER ||
      decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT
    val isRejected: B = decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE ||
      decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER ||
      decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT
    val next: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type =
      if (isAuthorize) Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED
      else if (isTerminate) Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE
      else if (isRecover) Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED
      else previous
    val disposition: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type =
      if (isAuthorize || isTerminate) Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED
      else if (isRecover) Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED
      else if (isRejected) Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED
      else Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.NO_CHANGE
    val reason: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type =
      if (isTerminate) Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CANCELLED
      else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE ||
               decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE)
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE
      else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER ||
               decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER)
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE
      else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT ||
               decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT)
        Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE
      else Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.NONE
    val pre: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.Type =
      if (previous == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
        Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.ENABLED
      else if (previous == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED)
        Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.SUSPENDED
      else Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.IDLE
    val projectedNext: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.Type =
      if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
        Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED
      else if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED)
        Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.SUSPENDED
      else Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.IDLE
    api.put_currentChargeSession(previous)
    committedChargeSession = next
    api.put_chargeSessionSnapshot(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(
      pre, projectedNext, disposition, reason))
    api.put_chargePermission(
      if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
        Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.ENABLED
      else Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED)
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
