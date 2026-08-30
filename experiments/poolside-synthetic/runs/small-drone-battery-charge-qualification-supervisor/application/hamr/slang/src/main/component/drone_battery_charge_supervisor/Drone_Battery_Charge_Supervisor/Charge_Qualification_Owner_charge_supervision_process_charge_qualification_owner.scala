// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun

@enum object RecoveryPhase {
  "Normal"
  "AwaitNeutral"
  "AwaitFreshIntent"
}

object Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner {

  var authorizationState: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
  var recoveryPhase: RecoveryPhase.Type = RecoveryPhase.Normal

  def initialise(api: Charge_Qualification_Owner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, authorizationState, recoveryPhase),
      Ensures(
        authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
        recoveryPhase == RecoveryPhase.Normal &
        api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
        api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
        api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive &
        api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
        api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_OWNER_STATE_AND_OUTPUTS
    authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
    recoveryPhase = RecoveryPhase.Normal

    api.put_authorization(authorizationState)
    val decision_to_attention: Drone_Battery_Charge_Supervisor.ChargeDecision =
      Drone_Battery_Charge_Supervisor.ChargeDecision(
        authorization = authorizationState,
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
    api.put_decision_to_attention(decision_to_attention)
    val decision_to_readiness: Drone_Battery_Charge_Supervisor.ChargeDecision =
      Drone_Battery_Charge_Supervisor.ChargeDecision(
        authorization = authorizationState,
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
    api.put_decision_to_readiness(decision_to_readiness)
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(api, authorizationState, recoveryPhase),
      Ensures(
        // RECOVERY_INHIBITS
        (recoveryPhase == RecoveryPhase.Normal) |
        (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge) &
        // OWNER_PUBLICATIONS_AGREE
        api.authorization == authorizationState &
        api.decision_to_attention.authorization == authorizationState &
        api.decision_to_readiness.authorization == authorizationState &
        api.decision_to_attention.disposition == api.decision_to_readiness.disposition
      )
    )

    // example api usage

    val battery_evidence = api.get_battery_evidence().get
    val charge_context = api.get_charge_context().get
    val qualified_intent = api.get_qualified_intent().get

    if (battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery |
        charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext |
        qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent) {
      // CASE_01_INPUT_FAULT
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
      recoveryPhase = RecoveryPhase.AwaitNeutral
      api.put_authorization(authorizationState)
      val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
        Drone_Battery_Charge_Supervisor.ChargeDecision(
          authorization = authorizationState,
          disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault)
      api.put_decision_to_attention(decision)
      api.put_decision_to_readiness(decision)
    } else if (recoveryPhase == RecoveryPhase.AwaitNeutral) {
      if (qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent) {
        // CASE_03_NEUTRAL_ADVANCES_RECOVERY
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = RecoveryPhase.AwaitFreshIntent
      } else {
        // CASE_02_RETAINED_NONNEUTRAL
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = RecoveryPhase.AwaitNeutral
      }
      api.put_authorization(authorizationState)
      val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
        Drone_Battery_Charge_Supervisor.ChargeDecision(
          authorization = authorizationState,
          disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending)
      api.put_decision_to_attention(decision)
      api.put_decision_to_readiness(decision)
    } else if (recoveryPhase == RecoveryPhase.AwaitFreshIntent) {
      if (qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge) {
        // CASE_05_FRESH_END
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = RecoveryPhase.Normal
        api.put_authorization(authorizationState)
        val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
          Drone_Battery_Charge_Supervisor.ChargeDecision(
            authorization = authorizationState,
            disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
        api.put_decision_to_attention(decision)
        api.put_decision_to_readiness(decision)
      } else if (qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge) {
        if (battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
          // CASE_06_FRESH_ELIGIBLE_BEGIN
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        } else {
          // CASE_07_FRESH_INELIGIBLE_BEGIN
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        }
      } else {
        // CASE_04_WAIT_FOR_FRESH_INTENT
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = RecoveryPhase.AwaitFreshIntent
        api.put_authorization(authorizationState)
        val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
          Drone_Battery_Charge_Supervisor.ChargeDecision(
            authorization = authorizationState,
            disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending)
        api.put_decision_to_attention(decision)
        api.put_decision_to_readiness(decision)
      }
    } else {
      // recoveryPhase == Normal
      if (qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge) {
        // CASE_08_NORMAL_END
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = RecoveryPhase.Normal
        api.put_authorization(authorizationState)
        val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
          Drone_Battery_Charge_Supervisor.ChargeDecision(
            authorization = authorizationState,
            disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
        api.put_decision_to_attention(decision)
        api.put_decision_to_readiness(decision)
      } else if (qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge) {
        if (battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
          // CASE_09_NORMAL_ELIGIBLE_BEGIN
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        } else {
          // CASE_10_NORMAL_INELIGIBLE_BEGIN
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        }
      } else {
        // qualified_intent == NoIntent
        if (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
            battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
          // CASE_11_RETAIN_ELIGIBLE_PERMISSION
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        } else {
          // CASE_12_REMAIN_OR_REVOKE
          authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
          recoveryPhase = RecoveryPhase.Normal
          api.put_authorization(authorizationState)
          val decision: Drone_Battery_Charge_Supervisor.ChargeDecision =
            Drone_Battery_Charge_Supervisor.ChargeDecision(
              authorization = authorizationState,
              disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
          api.put_decision_to_attention(decision)
          api.put_decision_to_readiness(decision)
        }
      }
    }
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
