// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Qualification_Owner_charge_supervision_process_charge_qualification_owner {

  // BEGIN STATE VARS
  var authorizationState: Drone_Battery_Charge_Supervisor.ChargeAuthorization.Type = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge

  var recoveryPhase: Drone_Battery_Charge_Supervisor.RecoveryPhase.Type = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
  // END STATE VARS

  def initialise(api: Charge_Qualification_Owner_Initialization_Api): Unit = {
    Contract(Modifies(api, authorizationState, recoveryPhase))
    authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
    recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
    api.put_authorization(Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge)
    api.put_decision_to_attention(Drone_Battery_Charge_Supervisor.ChargeDecision(
      Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge,
      Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive))
    api.put_decision_to_readiness(Drone_Battery_Charge_Supervisor.ChargeDecision(
      Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge,
      Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive))
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        api,
        authorizationState,
        recoveryPhase
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_INHIBITS
        recoveryPhase != Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal ___>:
          authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge,
        // guarantee OWNER_PUBLICATIONS_AGREE
        api.authorization == authorizationState &
          api.decision_to_attention.authorization == authorizationState &
          api.decision_to_readiness.authorization == authorizationState &
          api.decision_to_attention.disposition == api.decision_to_readiness.disposition,
        // case CASE_01_INPUT_FAULT
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery |
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext |
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault),
        // case CASE_02_RETAINED_NONNEUTRAL
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent != Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.qualified_intent != Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_03_NEUTRAL_ADVANCES_RECOVERY
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_04_WAIT_FOR_FRESH_INTENT
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_05_FRESH_END
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive),
        // case CASE_06_FRESH_ELIGIBLE_BEGIN
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted),
        // case CASE_07_FRESH_INELIGIBLE_BEGIN
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          !(api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied),
        // case CASE_08_NORMAL_END
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive),
        // case CASE_09_NORMAL_ELIGIBLE_BEGIN
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted),
        // case CASE_10_NORMAL_INELIGIBLE_BEGIN
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          !(api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied),
        // case CASE_11_RETAIN_ELIGIBLE_PERMISSION
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          In(authorizationState) == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued),
        // case CASE_12_REMAIN_OR_REVOKE
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          !(In(authorizationState) == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
            api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_battery_evidence().get
    val context = api.get_charge_context().get
    val intent = api.get_qualified_intent().get
    var disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive

    if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery |
      context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext |
      intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent) {
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
      recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral
      disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault
    } else if (recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral) {
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
      if (intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent) {
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent
      } else {
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral
      }
      disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending
    } else if (recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) {
      if (intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent) {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending
      } else if (intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge) {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
      } else if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
        context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted
      } else {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied
      }
    } else if (intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge) {
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
      recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
    } else if (intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge) {
      recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
      if (evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
        context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted
      } else {
        authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
        disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied
      }
    } else if (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
      evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
      context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext) {
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge
      recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
      disposition = Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued
    } else {
      authorizationState = Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge
      recoveryPhase = Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal
    }

    api.put_authorization(authorizationState)
    val decision = Drone_Battery_Charge_Supervisor.ChargeDecision(authorizationState, disposition)
    api.put_decision_to_attention(decision)
    api.put_decision_to_readiness(decision)
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
