// #Sireum

package scp_candidate.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionController_supervisorProcess_chargeSessionController {

  var committedChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type =
    Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE

  def initialise(api: ChargeSessionController_Initialization_Api): Unit = {
    Contract(
      Modifies(api, committedChargeSession),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_session
        api.currentChargeSession == ChargeSessionState.IDLE,
        // guarantee initial_permission
        api.chargePermission == ChargePermission.DISABLED,
        // guarantee initial_snapshot
        api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE &&
          api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &&
          api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE &&
          api.chargeSessionSnapshot.reason == ChargeReason.NONE
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

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
    Contract(Modifies(api, committedChargeSession))
    api.get_chargeDecision() match {
      case Some(decision) =>
        val pre: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = committedChargeSession
        var next: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = pre
        var disposition: Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.Type = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.NO_CHANGE
        var reason: Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.Type = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.NONE
        if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.AUTHORIZE) {
          next = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.TERMINATE) {
          next = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.ACCEPTED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CANCELLED
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_EVIDENCE) {
          next = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CHARGER) {
          next = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.RECOVER_CONTEXT) {
          next = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.SUSPENDED
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.RECOVERY_APPLIED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_EVIDENCE) {
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.EVIDENCE_UNAVAILABLE
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CHARGER) {
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CHARGER_UNAVAILABLE
        } else if (decision == Battery_Evidence_Charge_Qualification_Supervisor.ChargeDecision.REJECT_CONTEXT) {
          disposition = Battery_Evidence_Charge_Qualification_Supervisor.SnapshotChargeDisposition.REJECTED
          reason = Battery_Evidence_Charge_Qualification_Supervisor.ChargeReason.CONTEXT_INELIGIBLE
        }
        api.put_currentChargeSession(pre)
        committedChargeSession = next
        val snapshot: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot(
          if (pre == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE)
            Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.IDLE
          else if (pre == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
            Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.ENABLED
          else Battery_Evidence_Charge_Qualification_Supervisor.SnapshotPreSessionState.SUSPENDED,
          if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE)
            Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.IDLE
          else if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
            Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.ENABLED
          else Battery_Evidence_Charge_Qualification_Supervisor.SnapshotNextSessionState.SUSPENDED,
          disposition, reason)
        api.put_chargeSessionSnapshot(snapshot)
        api.put_chargePermission(
          if (next == Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.ENABLED)
            Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.ENABLED
          else Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED)
    }
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
