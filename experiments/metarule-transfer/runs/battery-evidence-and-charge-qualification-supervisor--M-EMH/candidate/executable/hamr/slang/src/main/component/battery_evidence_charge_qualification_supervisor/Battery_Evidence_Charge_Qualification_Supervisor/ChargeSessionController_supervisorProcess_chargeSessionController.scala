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
    committedChargeSession = ChargeSessionState.IDLE
    api.put_currentChargeSession(ChargeSessionState.IDLE)
    api.put_chargeSessionSnapshot(ChargeSessionSnapshot(
      preSession = SnapshotPreSessionState.IDLE,
      nextSession = SnapshotNextSessionState.IDLE,
      disposition = SnapshotChargeDisposition.NO_CHANGE,
      reason = ChargeReason.NONE))
    api.put_chargePermission(ChargePermission.DISABLED)
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
        //   Transition for authorization, cancellation, or recovery | N.md
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
        //   Hold the prior session for no-change or rejection | N.md
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
    val preSession = committedChargeSession
    api.put_currentChargeSession(preSession)
    val decision = api.get_chargeDecision().get
        val disposition: SnapshotChargeDisposition.Type = if (decision == ChargeDecision.NO_CHANGE) {
          SnapshotChargeDisposition.NO_CHANGE
        } else if (decision == ChargeDecision.AUTHORIZE | decision == ChargeDecision.TERMINATE) {
          SnapshotChargeDisposition.ACCEPTED
        } else if (decision == ChargeDecision.RECOVER_EVIDENCE |
          decision == ChargeDecision.RECOVER_CHARGER |
          decision == ChargeDecision.RECOVER_CONTEXT) {
          SnapshotChargeDisposition.RECOVERY_APPLIED
        } else {
          SnapshotChargeDisposition.REJECTED
        }
        val reason: ChargeReason.Type = if (decision == ChargeDecision.TERMINATE) {
          ChargeReason.CANCELLED
        } else if (decision == ChargeDecision.RECOVER_EVIDENCE | decision == ChargeDecision.REJECT_EVIDENCE) {
          ChargeReason.EVIDENCE_UNAVAILABLE
        } else if (decision == ChargeDecision.RECOVER_CHARGER | decision == ChargeDecision.REJECT_CHARGER) {
          ChargeReason.CHARGER_UNAVAILABLE
        } else if (decision == ChargeDecision.RECOVER_CONTEXT | decision == ChargeDecision.REJECT_CONTEXT) {
          ChargeReason.CONTEXT_INELIGIBLE
        } else {
          ChargeReason.NONE
        }
        if (decision == ChargeDecision.AUTHORIZE) {
          committedChargeSession = ChargeSessionState.ENABLED
        } else if (decision == ChargeDecision.TERMINATE) {
          committedChargeSession = ChargeSessionState.IDLE
        } else if (decision == ChargeDecision.RECOVER_EVIDENCE |
          decision == ChargeDecision.RECOVER_CHARGER |
          decision == ChargeDecision.RECOVER_CONTEXT) {
          committedChargeSession = ChargeSessionState.SUSPENDED
        }
        val nextSession: SnapshotNextSessionState.Type =
          if (committedChargeSession == ChargeSessionState.IDLE) SnapshotNextSessionState.IDLE
          else if (committedChargeSession == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
          else SnapshotNextSessionState.SUSPENDED
        api.put_chargeSessionSnapshot(ChargeSessionSnapshot(
          preSession = if (preSession == ChargeSessionState.IDLE) SnapshotPreSessionState.IDLE
            else if (preSession == ChargeSessionState.ENABLED) SnapshotPreSessionState.ENABLED
            else SnapshotPreSessionState.SUSPENDED,
          nextSession = nextSession,
          disposition = disposition,
          reason = reason))
        if (committedChargeSession == ChargeSessionState.ENABLED) {
          api.put_chargePermission(ChargePermission.ENABLED)
        } else {
          api.put_chargePermission(ChargePermission.DISABLED)
        }
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
