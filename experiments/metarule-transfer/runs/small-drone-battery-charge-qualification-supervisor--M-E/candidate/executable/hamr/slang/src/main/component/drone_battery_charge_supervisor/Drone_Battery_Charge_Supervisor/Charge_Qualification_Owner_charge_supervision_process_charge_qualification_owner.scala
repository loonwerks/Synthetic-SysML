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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    authorizationState = ChargeAuthorization.InhibitCharge
    recoveryPhase = RecoveryPhase.Normal
    val initialDecision = ChargeDecision(
      authorization = ChargeAuthorization.InhibitCharge,
      disposition = ChargeDisposition.Inactive)
    api.put_authorization(ChargeAuthorization.InhibitCharge)
    api.put_decision_to_attention(initialDecision)
    api.put_decision_to_readiness(initialDecision)
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(api, authorizationState, recoveryPhase),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_INHIBITS
        recoveryPhase != RecoveryPhase.Normal ___>:
          authorizationState == ChargeAuthorization.InhibitCharge,
        // guarantee OWNER_PUBLICATIONS_AGREE
        api.authorization == authorizationState &
          api.decision_to_attention.authorization == authorizationState &
          api.decision_to_readiness.authorization == authorizationState &
          api.decision_to_attention.disposition == api.decision_to_readiness.disposition,
        // case CASE_01_INPUT_FAULT
        (api.battery_evidence == BatteryEvidence.InvalidBattery |
          api.charge_context == ChargeContext.InvalidChargeContext |
          api.qualified_intent == QualifiedChargeIntent.InvalidChargeIntent) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.AwaitNeutral &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.InputFault &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.InputFault),
        // case CASE_02_RETAINED_NONNEUTRAL
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent != QualifiedChargeIntent.InvalidChargeIntent &
          In(recoveryPhase) == RecoveryPhase.AwaitNeutral &
          api.qualified_intent != QualifiedChargeIntent.NoIntent) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.AwaitNeutral &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.RecoveryPending),
        // case CASE_03_NEUTRAL_ADVANCES_RECOVERY
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == RecoveryPhase.AwaitNeutral) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.AwaitFreshIntent &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.RecoveryPending),
        // case CASE_04_WAIT_FOR_FRESH_INTENT
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.AwaitFreshIntent &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.RecoveryPending &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.RecoveryPending),
        // case CASE_05_FRESH_END
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.Inactive),
        // case CASE_06_FRESH_ELIGIBLE_BEGIN
        (api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
          api.charge_context == ChargeContext.AvailableInactiveContext &
          api.qualified_intent == QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == ChargeAuthorization.PermitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.BeginAccepted &
          api.decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.BeginAccepted),
        // case CASE_07_FRESH_INELIGIBLE_BEGIN
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == RecoveryPhase.AwaitFreshIntent &
          !(api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
            api.charge_context == ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.BeginDenied &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.BeginDenied),
        // case CASE_08_NORMAL_END
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == RecoveryPhase.Normal) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.Inactive),
        // case CASE_09_NORMAL_ELIGIBLE_BEGIN
        (api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
          api.charge_context == ChargeContext.AvailableInactiveContext &
          api.qualified_intent == QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == RecoveryPhase.Normal) ___>: (authorizationState == ChargeAuthorization.PermitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.BeginAccepted &
          api.decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.BeginAccepted),
        // case CASE_10_NORMAL_INELIGIBLE_BEGIN
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == RecoveryPhase.Normal &
          !(api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
            api.charge_context == ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.BeginDenied &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.BeginDenied),
        // case CASE_11_RETAIN_ELIGIBLE_PERMISSION
        (api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
          api.charge_context == ChargeContext.AvailableInactiveContext &
          api.qualified_intent == QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == RecoveryPhase.Normal &
          In(authorizationState) == ChargeAuthorization.PermitCharge) ___>: (authorizationState == ChargeAuthorization.PermitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.Continued &
          api.decision_to_readiness.authorization == ChargeAuthorization.PermitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.Continued),
        // case CASE_12_REMAIN_OR_REVOKE
        (api.battery_evidence != BatteryEvidence.InvalidBattery &
          api.charge_context != ChargeContext.InvalidChargeContext &
          api.qualified_intent == QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == RecoveryPhase.Normal &
          !(In(authorizationState) == ChargeAuthorization.PermitCharge &
            api.battery_evidence == BatteryEvidence.LowBatteryEvidence &
            api.charge_context == ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == ChargeAuthorization.InhibitCharge &
          recoveryPhase == RecoveryPhase.Normal &
          api.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_attention.disposition == ChargeDisposition.Inactive &
          api.decision_to_readiness.authorization == ChargeAuthorization.InhibitCharge &
          api.decision_to_readiness.disposition == ChargeDisposition.Inactive)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val evidence = api.get_battery_evidence().get
    val context = api.get_charge_context().get
    val intent = api.get_qualified_intent().get

    var nextAuthorization = ChargeAuthorization.InhibitCharge
    var nextRecovery = RecoveryPhase.Normal
    var disposition = ChargeDisposition.Inactive

    if (evidence == BatteryEvidence.InvalidBattery |
      context == ChargeContext.InvalidChargeContext |
      intent == QualifiedChargeIntent.InvalidChargeIntent) {
      nextRecovery = RecoveryPhase.AwaitNeutral
      disposition = ChargeDisposition.InputFault
    } else if (recoveryPhase == RecoveryPhase.AwaitNeutral) {
      nextRecovery = RecoveryPhase.AwaitNeutral
      disposition = ChargeDisposition.RecoveryPending
      if (intent == QualifiedChargeIntent.NoIntent) {
        nextRecovery = RecoveryPhase.AwaitFreshIntent
      }
    } else if (recoveryPhase == RecoveryPhase.AwaitFreshIntent) {
      if (intent == QualifiedChargeIntent.NoIntent) {
        nextRecovery = RecoveryPhase.AwaitFreshIntent
        disposition = ChargeDisposition.RecoveryPending
      } else if (intent == QualifiedChargeIntent.EndCharge) {
        nextRecovery = RecoveryPhase.Normal
      } else if (evidence == BatteryEvidence.LowBatteryEvidence &
        context == ChargeContext.AvailableInactiveContext) {
        nextAuthorization = ChargeAuthorization.PermitCharge
        nextRecovery = RecoveryPhase.Normal
        disposition = ChargeDisposition.BeginAccepted
      } else {
        nextRecovery = RecoveryPhase.Normal
        disposition = ChargeDisposition.BeginDenied
      }
    } else if (intent == QualifiedChargeIntent.EndCharge) {
      nextRecovery = RecoveryPhase.Normal
    } else if (intent == QualifiedChargeIntent.BeginCharge) {
      nextRecovery = RecoveryPhase.Normal
      if (evidence == BatteryEvidence.LowBatteryEvidence &
        context == ChargeContext.AvailableInactiveContext) {
        nextAuthorization = ChargeAuthorization.PermitCharge
        disposition = ChargeDisposition.BeginAccepted
      } else {
        disposition = ChargeDisposition.BeginDenied
      }
    } else if (authorizationState == ChargeAuthorization.PermitCharge &
      evidence == BatteryEvidence.LowBatteryEvidence &
      context == ChargeContext.AvailableInactiveContext) {
      nextAuthorization = ChargeAuthorization.PermitCharge
      nextRecovery = RecoveryPhase.Normal
      disposition = ChargeDisposition.Continued
    }

    authorizationState = nextAuthorization
    recoveryPhase = nextRecovery
    val decision = ChargeDecision(
      authorization = nextAuthorization,
      disposition = disposition)
    api.put_authorization(nextAuthorization)
    api.put_decision_to_attention(decision)
    api.put_decision_to_readiness(decision)
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
