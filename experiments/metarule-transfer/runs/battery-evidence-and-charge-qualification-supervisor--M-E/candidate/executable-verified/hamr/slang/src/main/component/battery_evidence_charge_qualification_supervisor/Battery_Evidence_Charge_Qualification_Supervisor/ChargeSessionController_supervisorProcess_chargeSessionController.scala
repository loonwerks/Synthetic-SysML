// #Sireum

package battery_evidence_charge_qualification_supervisor.Battery_Evidence_Charge_Qualification_Supervisor

import org.sireum._
import battery_evidence_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionController_supervisorProcess_chargeSessionController {

  // BEGIN STATE VARS
  var committedChargeSession: Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.Type = Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE
  // END STATE VARS

  def initialise(api: ChargeSessionController_Initialization_Api): Unit = {
    Contract(Modifies(api, committedChargeSession))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_currentChargeSession(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionState.IDLE)
    api.put_chargeSessionSnapshot(Battery_Evidence_Charge_Qualification_Supervisor.ChargeSessionSnapshot.example())
    api.put_chargePermission(Battery_Evidence_Charge_Qualification_Supervisor.ChargePermission.DISABLED)
  }

  def timeTriggered(api: ChargeSessionController_Operational_Api): Unit = {
    Contract(
      Modifies(api, committedChargeSession),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_COMMITTED_PRE_STATE
        api.currentChargeSession == In(committedChargeSession),
        // guarantee PROJECT_PRE_SESSION
        (In(committedChargeSession) == ChargeSessionState.IDLE ___>:
          api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE) &
          (In(committedChargeSession) == ChargeSessionState.ENABLED ___>:
            api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.ENABLED) &
          (In(committedChargeSession) == ChargeSessionState.SUSPENDED ___>:
            api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED),
        // guarantee PROJECT_NEXT_SESSION
        (committedChargeSession == ChargeSessionState.IDLE ___>:
          api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
            api.chargePermission == ChargePermission.DISABLED) &
          (committedChargeSession == ChargeSessionState.ENABLED ___>:
            api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED &
              api.chargePermission == ChargePermission.ENABLED) &
          (committedChargeSession == ChargeSessionState.SUSPENDED ___>:
            api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED &
              api.chargePermission == ChargePermission.DISABLED),
        // guarantee RECOVERY_REASON_INVARIANT
        api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED ___>:
          api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE |
            api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE |
            api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE,
        // case CASE_17_TRANSITIONING_DECISIONS
        (api.chargeDecision == ChargeDecision.AUTHORIZE |
          api.chargeDecision == ChargeDecision.TERMINATE |
          api.chargeDecision == ChargeDecision.RECOVER_EVIDENCE |
          api.chargeDecision == ChargeDecision.RECOVER_CHARGER |
          api.chargeDecision == ChargeDecision.RECOVER_CONTEXT) ___>: ((api.chargeDecision == ChargeDecision.AUTHORIZE ___>:
          committedChargeSession == ChargeSessionState.ENABLED &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
            api.chargeSessionSnapshot.reason == ChargeReason.NONE) &
          (api.chargeDecision == ChargeDecision.TERMINATE ___>:
            committedChargeSession == ChargeSessionState.IDLE &
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
              api.chargeSessionSnapshot.reason == ChargeReason.CANCELLED) &
          (api.chargeDecision == ChargeDecision.RECOVER_EVIDENCE ___>:
            committedChargeSession == ChargeSessionState.SUSPENDED &
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) &
          (api.chargeDecision == ChargeDecision.RECOVER_CHARGER ___>:
            committedChargeSession == ChargeSessionState.SUSPENDED &
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) &
          (api.chargeDecision == ChargeDecision.RECOVER_CONTEXT ___>:
            committedChargeSession == ChargeSessionState.SUSPENDED &
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
              api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)),
        // case CASE_18_HOLDING_DECISIONS
        (api.chargeDecision == ChargeDecision.NO_CHANGE |
          api.chargeDecision == ChargeDecision.REJECT_EVIDENCE |
          api.chargeDecision == ChargeDecision.REJECT_CHARGER |
          api.chargeDecision == ChargeDecision.REJECT_CONTEXT) ___>: (committedChargeSession == In(committedChargeSession) &
          (api.chargeDecision == ChargeDecision.NO_CHANGE ___>:
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE &
              api.chargeSessionSnapshot.reason == ChargeReason.NONE) &
          (api.chargeDecision == ChargeDecision.REJECT_EVIDENCE ___>:
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
              api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE) &
          (api.chargeDecision == ChargeDecision.REJECT_CHARGER ___>:
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
              api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE) &
          (api.chargeDecision == ChargeDecision.REJECT_CONTEXT ___>:
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
              api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE))
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val pre = committedChargeSession
    val decision = api.get_chargeDecision().get
    api.put_currentChargeSession(pre)

    var next = pre
    var disposition = SnapshotChargeDisposition.NO_CHANGE
    var reason = ChargeReason.NONE
    if (decision == ChargeDecision.AUTHORIZE) {
      next = ChargeSessionState.ENABLED
      disposition = SnapshotChargeDisposition.ACCEPTED
    } else if (decision == ChargeDecision.TERMINATE) {
      next = ChargeSessionState.IDLE
      disposition = SnapshotChargeDisposition.ACCEPTED
      reason = ChargeReason.CANCELLED
    } else if (decision == ChargeDecision.RECOVER_EVIDENCE) {
      next = ChargeSessionState.SUSPENDED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.EVIDENCE_UNAVAILABLE
    } else if (decision == ChargeDecision.RECOVER_CHARGER) {
      next = ChargeSessionState.SUSPENDED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.CHARGER_UNAVAILABLE
    } else if (decision == ChargeDecision.RECOVER_CONTEXT) {
      next = ChargeSessionState.SUSPENDED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.CONTEXT_INELIGIBLE
    } else if (decision == ChargeDecision.REJECT_EVIDENCE) {
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.EVIDENCE_UNAVAILABLE
    } else if (decision == ChargeDecision.REJECT_CHARGER) {
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.CHARGER_UNAVAILABLE
    } else if (decision == ChargeDecision.REJECT_CONTEXT) {
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.CONTEXT_INELIGIBLE
    }

    committedChargeSession = next
    val preSnapshot: SnapshotPreSessionState.Type = if (pre == ChargeSessionState.IDLE) SnapshotPreSessionState.IDLE
      else if (pre == ChargeSessionState.ENABLED) SnapshotPreSessionState.ENABLED
      else SnapshotPreSessionState.SUSPENDED
    val nextSnapshot: SnapshotNextSessionState.Type = if (next == ChargeSessionState.IDLE) SnapshotNextSessionState.IDLE
      else if (next == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
      else SnapshotNextSessionState.SUSPENDED
    val permission: ChargePermission.Type = if (next == ChargeSessionState.ENABLED) ChargePermission.ENABLED
      else ChargePermission.DISABLED
    api.put_chargeSessionSnapshot(ChargeSessionSnapshot(preSnapshot, nextSnapshot, disposition, reason))
    api.put_chargePermission(permission)
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
