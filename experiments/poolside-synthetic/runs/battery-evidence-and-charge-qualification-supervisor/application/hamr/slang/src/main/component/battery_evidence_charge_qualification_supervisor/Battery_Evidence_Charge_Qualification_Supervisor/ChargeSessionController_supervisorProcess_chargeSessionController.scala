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
    Contract(
      Modifies(api)
    )
    // BEGIN WORK
    api.put_currentChargeSession(ChargeSessionState.IDLE)
    api.put_chargeSessionSnapshot(ChargeSessionSnapshot(
      preSession = SnapshotPreSessionState.IDLE,
      nextSession = SnapshotNextSessionState.IDLE,
      disposition = SnapshotChargeDisposition.NO_CHANGE,
      reason = ChargeReason.NONE))
    api.put_chargePermission(ChargePermission.DISABLED)
    // END WORK
  }

  def timeTriggered(api: ChargeSessionController_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        committedChargeSession,
        api
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_COMMITTED_PRE_STATE
        api.currentChargeSession == In(committedChargeSession),
        // guarantee PROJECT_PRE_SESSION
        In(committedChargeSession) == ChargeSessionState.IDLE ___>:
          api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.IDLE &
            In(committedChargeSession) == ChargeSessionState.ENABLED ___>:
            api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.ENABLED &
              In(committedChargeSession) == ChargeSessionState.SUSPENDED ___>:
              api.chargeSessionSnapshot.preSession == SnapshotPreSessionState.SUSPENDED,
        // guarantee PROJECT_NEXT_SESSION
        committedChargeSession == ChargeSessionState.IDLE ___>:
          api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.IDLE &
            api.chargePermission == ChargePermission.DISABLED &
            committedChargeSession == ChargeSessionState.ENABLED ___>:
            api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.ENABLED &
              api.chargePermission == ChargePermission.ENABLED &
              committedChargeSession == ChargeSessionState.SUSPENDED ___>:
              api.chargeSessionSnapshot.nextSession == SnapshotNextSessionState.SUSPENDED &
                api.chargePermission == ChargePermission.DISABLED,
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
          api.chargeDecision == ChargeDecision.RECOVER_CONTEXT) ___>: (api.chargeDecision == ChargeDecision.AUTHORIZE ___>:
          committedChargeSession == ChargeSessionState.ENABLED &
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
            api.chargeSessionSnapshot.reason == ChargeReason.NONE &
            api.chargeDecision == ChargeDecision.TERMINATE ___>:
            committedChargeSession == ChargeSessionState.IDLE &
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.ACCEPTED &
              api.chargeSessionSnapshot.reason == ChargeReason.CANCELLED &
              api.chargeDecision == ChargeDecision.RECOVER_EVIDENCE ___>:
              committedChargeSession == ChargeSessionState.SUSPENDED &
                api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE &
                api.chargeDecision == ChargeDecision.RECOVER_CHARGER ___>:
                committedChargeSession == ChargeSessionState.SUSPENDED &
                  api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                  api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE &
                  api.chargeDecision == ChargeDecision.RECOVER_CONTEXT ___>:
                  committedChargeSession == ChargeSessionState.SUSPENDED &
                    api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.RECOVERY_APPLIED &
                    api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE),
        // case CASE_18_HOLDING_DECISIONS
        (api.chargeDecision == ChargeDecision.NO_CHANGE |
          api.chargeDecision == ChargeDecision.REJECT_EVIDENCE |
          api.chargeDecision == ChargeDecision.REJECT_CHARGER |
          api.chargeDecision == ChargeDecision.REJECT_CONTEXT) ___>: (committedChargeSession == In(committedChargeSession) &
          api.chargeDecision == ChargeDecision.NO_CHANGE ___>:
          api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.NO_CHANGE &
            api.chargeSessionSnapshot.reason == ChargeReason.NONE &
            api.chargeDecision == ChargeDecision.REJECT_EVIDENCE ___>:
            api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
              api.chargeSessionSnapshot.reason == ChargeReason.EVIDENCE_UNAVAILABLE &
              api.chargeDecision == ChargeDecision.REJECT_CHARGER ___>:
              api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
                api.chargeSessionSnapshot.reason == ChargeReason.CHARGER_UNAVAILABLE &
                api.chargeDecision == ChargeDecision.REJECT_CONTEXT ___>:
                api.chargeSessionSnapshot.disposition == SnapshotChargeDisposition.REJECTED &
                  api.chargeSessionSnapshot.reason == ChargeReason.CONTEXT_INELIGIBLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // BEGIN WORK
    val chargeDecision = api.get_chargeDecision().get
    val preState = committedChargeSession // Capture before modification
    var newState: ChargeSessionState.Type = committedChargeSession
    var nextSession: SnapshotNextSessionState.Type = SnapshotNextSessionState.IDLE
    var permission: ChargePermission.Type = ChargePermission.DISABLED
    var disposition: SnapshotChargeDisposition.Type = SnapshotChargeDisposition.NO_CHANGE
    var reason: ChargeReason.Type = ChargeReason.NONE
    if (chargeDecision == ChargeDecision.AUTHORIZE) {
      newState = ChargeSessionState.ENABLED
      nextSession = SnapshotNextSessionState.ENABLED
      permission = ChargePermission.ENABLED
      disposition = SnapshotChargeDisposition.ACCEPTED
      reason = ChargeReason.NONE
    } else if (chargeDecision == ChargeDecision.TERMINATE) {
      newState = ChargeSessionState.IDLE
      nextSession = SnapshotNextSessionState.IDLE
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.ACCEPTED
      reason = ChargeReason.CANCELLED
    } else if (chargeDecision == ChargeDecision.RECOVER_EVIDENCE) {
      newState = ChargeSessionState.SUSPENDED
      nextSession = SnapshotNextSessionState.SUSPENDED
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.EVIDENCE_UNAVAILABLE
    } else if (chargeDecision == ChargeDecision.RECOVER_CHARGER) {
      newState = ChargeSessionState.SUSPENDED
      nextSession = SnapshotNextSessionState.SUSPENDED
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.CHARGER_UNAVAILABLE
    } else if (chargeDecision == ChargeDecision.RECOVER_CONTEXT) {
      newState = ChargeSessionState.SUSPENDED
      nextSession = SnapshotNextSessionState.SUSPENDED
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.RECOVERY_APPLIED
      reason = ChargeReason.CONTEXT_INELIGIBLE
    } else if (chargeDecision == ChargeDecision.NO_CHANGE) {
      newState = committedChargeSession
      nextSession = if (committedChargeSession == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
                    else if (committedChargeSession == ChargeSessionState.SUSPENDED) SnapshotNextSessionState.SUSPENDED
                    else SnapshotNextSessionState.IDLE
      permission = if (committedChargeSession == ChargeSessionState.ENABLED) ChargePermission.ENABLED else ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.NO_CHANGE
      reason = ChargeReason.NONE
    } else if (chargeDecision == ChargeDecision.REJECT_EVIDENCE) {
      newState = committedChargeSession
      nextSession = if (committedChargeSession == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
                    else if (committedChargeSession == ChargeSessionState.SUSPENDED) SnapshotNextSessionState.SUSPENDED
                    else SnapshotNextSessionState.IDLE
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.EVIDENCE_UNAVAILABLE
    } else if (chargeDecision == ChargeDecision.REJECT_CHARGER) {
      newState = committedChargeSession
      nextSession = if (committedChargeSession == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
                    else if (committedChargeSession == ChargeSessionState.SUSPENDED) SnapshotNextSessionState.SUSPENDED
                    else SnapshotNextSessionState.IDLE
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.CHARGER_UNAVAILABLE
    } else if (chargeDecision == ChargeDecision.REJECT_CONTEXT) {
      newState = committedChargeSession
      nextSession = if (committedChargeSession == ChargeSessionState.ENABLED) SnapshotNextSessionState.ENABLED
                    else if (committedChargeSession == ChargeSessionState.SUSPENDED) SnapshotNextSessionState.SUSPENDED
                    else SnapshotNextSessionState.IDLE
      permission = ChargePermission.DISABLED
      disposition = SnapshotChargeDisposition.REJECTED
      reason = ChargeReason.CONTEXT_INELIGIBLE
    }
    // Publish outputs BEFORE modifying state to match In(committedChargeSession) contract
    api.put_currentChargeSession(preState)
    api.put_chargeSessionSnapshot(ChargeSessionSnapshot(
      preSession = if (preState == ChargeSessionState.ENABLED) SnapshotPreSessionState.ENABLED
                   else if (preState == ChargeSessionState.SUSPENDED) SnapshotPreSessionState.SUSPENDED
                   else SnapshotPreSessionState.IDLE,
      nextSession = nextSession,
      disposition = disposition,
      reason = reason))
    api.put_chargePermission(permission)
    // Now update state
    committedChargeSession = newState
    // END WORK
  }

  def finalise(api: ChargeSessionController_Operational_Api): Unit = { }
}
