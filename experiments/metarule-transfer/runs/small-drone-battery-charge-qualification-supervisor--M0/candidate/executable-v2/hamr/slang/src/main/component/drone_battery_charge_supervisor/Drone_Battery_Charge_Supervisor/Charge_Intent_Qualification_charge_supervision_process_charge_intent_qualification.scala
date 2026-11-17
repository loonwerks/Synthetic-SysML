// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification {

  def initialise(api: Charge_Intent_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
  }

  def timeTriggered(api: Charge_Intent_Qualification_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case INTENT_INVALID
        //   Invalid intent is never qualified | N.md#INTENT_INVALID
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent),
        // case INTENT_NEUTRAL
        //   Valid neutral intent is qualified | N.md#INTENT_NEUTRAL
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.NoIntent) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent),
        // case INTENT_BEGIN
        //   Valid begin intent is qualified | N.md#INTENT_BEGIN
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.BeginCharge) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge),
        // case INTENT_END
        //   Valid end intent is qualified | N.md#INTENT_END
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.EndCharge) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_intent_sample: Option[Drone_Battery_Charge_Supervisor.ChargeIntentSample] = api.get_intent_sample()
    api.logInfo(s"Received on data port intent_sample: ${apiUsage_intent_sample}")
  }

  def finalise(api: Charge_Intent_Qualification_Operational_Api): Unit = { }
}
