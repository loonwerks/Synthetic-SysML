// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification {

  def initialise(api: Charge_Intent_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
  }

  def timeTriggered(api: Charge_Intent_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case INTENT_INVALID
        (api.intent_sample.status == InputStatus.Invalid) ___>: (api.qualified_intent == QualifiedChargeIntent.InvalidChargeIntent),
        // case INTENT_NEUTRAL
        (api.intent_sample.status == InputStatus.Valid &
          api.intent_sample.intent == ChargeIntent.NoIntent) ___>: (api.qualified_intent == QualifiedChargeIntent.NoIntent),
        // case INTENT_BEGIN
        (api.intent_sample.status == InputStatus.Valid &
          api.intent_sample.intent == ChargeIntent.BeginCharge) ___>: (api.qualified_intent == QualifiedChargeIntent.BeginCharge),
        // case INTENT_END
        (api.intent_sample.status == InputStatus.Valid &
          api.intent_sample.intent == ChargeIntent.EndCharge) ___>: (api.qualified_intent == QualifiedChargeIntent.EndCharge)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val sample = api.get_intent_sample().get
    if (sample.status == InputStatus.Invalid) {
      api.put_qualified_intent(QualifiedChargeIntent.InvalidChargeIntent)
    } else if (sample.intent == ChargeIntent.NoIntent) {
      api.put_qualified_intent(QualifiedChargeIntent.NoIntent)
    } else if (sample.intent == ChargeIntent.BeginCharge) {
      api.put_qualified_intent(QualifiedChargeIntent.BeginCharge)
    } else {
      api.put_qualified_intent(QualifiedChargeIntent.EndCharge)
    }
  }

  def finalise(api: Charge_Intent_Qualification_Operational_Api): Unit = { }
}
