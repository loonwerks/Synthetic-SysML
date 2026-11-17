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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_authorization(Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge)
    api.put_decision_to_attention(Drone_Battery_Charge_Supervisor.ChargeDecision.example())
    api.put_decision_to_readiness(Drone_Battery_Charge_Supervisor.ChargeDecision.example())
  }

  def timeTriggered(api: Charge_Qualification_Owner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        authorizationState,
        recoveryPhase
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee RECOVERY_INHIBITS
        //   Recovery phases always inhibit authorization | N.md#RECOVERY_INHIBITS
        recoveryPhase != Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal ___>:
          authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge,
        // guarantee OWNER_PUBLICATIONS_AGREE
        //   All owner publications are one logical decision | N.md#OWNER_PUBLICATIONS_AGREE
        api.authorization == authorizationState &
          api.decision_to_attention.authorization == authorizationState &
          api.decision_to_readiness.authorization == authorizationState &
          api.decision_to_attention.disposition == api.decision_to_readiness.disposition,
        // case CASE_01_INPUT_FAULT
        //   Any invalid qualified evidence enters recovery | N.md#CASE_01_INPUT_FAULT
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery |
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext |
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.InputFault),
        // case CASE_02_RETAINED_NONNEUTRAL
        //   Nonneutral intent cannot pass AwaitNeutral recovery | N.md#CASE_02_RETAINED_NONNEUTRAL
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent != Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.qualified_intent != Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_03_NEUTRAL_ADVANCES_RECOVERY
        //   Neutral input advances recovery to AwaitFreshIntent | N.md#CASE_03_NEUTRAL_ADVANCES_RECOVERY
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitNeutral) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_04_WAIT_FOR_FRESH_INTENT
        //   Neutral input retains AwaitFreshIntent recovery | N.md#CASE_04_WAIT_FOR_FRESH_INTENT
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.RecoveryPending),
        // case CASE_05_FRESH_END
        //   Fresh EndCharge exits recovery inhibited | N.md#CASE_05_FRESH_END
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive),
        // case CASE_06_FRESH_ELIGIBLE_BEGIN
        //   Fresh eligible BeginCharge permits charge | N.md#CASE_06_FRESH_ELIGIBLE_BEGIN
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted),
        // case CASE_07_FRESH_INELIGIBLE_BEGIN
        //   Fresh ineligible BeginCharge is denied | N.md#CASE_07_FRESH_INELIGIBLE_BEGIN
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.AwaitFreshIntent &
          !(api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied),
        // case CASE_08_NORMAL_END
        //   EndCharge in Normal inhibits authorization | N.md#CASE_08_NORMAL_END
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive),
        // case CASE_09_NORMAL_ELIGIBLE_BEGIN
        //   Eligible BeginCharge in Normal permits charge | N.md#CASE_09_NORMAL_ELIGIBLE_BEGIN
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginAccepted),
        // case CASE_10_NORMAL_INELIGIBLE_BEGIN
        //   Ineligible BeginCharge in Normal is denied | N.md#CASE_10_NORMAL_INELIGIBLE_BEGIN
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          !(api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.BeginDenied),
        // case CASE_11_RETAIN_ELIGIBLE_PERMISSION
        //   Eligible neutral sample retains a prior permission | N.md#CASE_11_RETAIN_ELIGIBLE_PERMISSION
        (api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
          api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          In(authorizationState) == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Continued),
        // case CASE_12_REMAIN_OR_REVOKE
        //   All other valid neutral samples inhibit charge | N.md#CASE_12_REMAIN_OR_REVOKE
        (api.battery_evidence != Drone_Battery_Charge_Supervisor.BatteryEvidence.InvalidBattery &
          api.charge_context != Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext &
          api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent &
          In(recoveryPhase) == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          !(In(authorizationState) == Drone_Battery_Charge_Supervisor.ChargeAuthorization.PermitCharge &
            api.battery_evidence == Drone_Battery_Charge_Supervisor.BatteryEvidence.LowBatteryEvidence &
            api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)) ___>: (authorizationState == Drone_Battery_Charge_Supervisor.ChargeAuthorization.InhibitCharge &
          recoveryPhase == Drone_Battery_Charge_Supervisor.RecoveryPhase.Normal &
          api.decision_to_attention.disposition == Drone_Battery_Charge_Supervisor.ChargeDisposition.Inactive)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_battery_evidence: Option[Drone_Battery_Charge_Supervisor.BatteryEvidence.Type] = api.get_battery_evidence()
    api.logInfo(s"Received on data port battery_evidence: ${apiUsage_battery_evidence}")
    val apiUsage_charge_context: Option[Drone_Battery_Charge_Supervisor.ChargeContext.Type] = api.get_charge_context()
    api.logInfo(s"Received on data port charge_context: ${apiUsage_charge_context}")
    val apiUsage_qualified_intent: Option[Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.Type] = api.get_qualified_intent()
    api.logInfo(s"Received on data port qualified_intent: ${apiUsage_qualified_intent}")
  }

  def finalise(api: Charge_Qualification_Owner_Operational_Api): Unit = { }
}
