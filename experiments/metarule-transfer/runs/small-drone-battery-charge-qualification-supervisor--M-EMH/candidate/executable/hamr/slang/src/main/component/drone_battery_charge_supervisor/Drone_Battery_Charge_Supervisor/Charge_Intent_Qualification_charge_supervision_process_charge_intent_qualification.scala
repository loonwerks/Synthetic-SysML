// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification {

  def initialise(api: Charge_Intent_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_intent(QualifiedChargeIntent.InvalidChargeIntent)
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
    val intent: QualifiedChargeIntent.Type =
      if (sample.status == InputStatus.Invalid) {
        QualifiedChargeIntent.InvalidChargeIntent
      } else if (sample.intent == ChargeIntent.NoIntent) {
        QualifiedChargeIntent.NoIntent
      } else if (sample.intent == ChargeIntent.BeginCharge) {
        QualifiedChargeIntent.BeginCharge
      } else {
        QualifiedChargeIntent.EndCharge
      }
    api.put_qualified_intent(intent)
  }

  def finalise(api: Charge_Intent_Qualification_Operational_Api): Unit = { }
}
