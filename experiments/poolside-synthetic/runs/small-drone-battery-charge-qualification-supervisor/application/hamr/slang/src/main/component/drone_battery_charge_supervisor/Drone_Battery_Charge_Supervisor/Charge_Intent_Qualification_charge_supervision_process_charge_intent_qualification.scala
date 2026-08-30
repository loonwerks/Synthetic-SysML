// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification {

  def initialise(api: Charge_Intent_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_QUALIFIED_INTENT
    api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
  }

  def timeTriggered(api: Charge_Intent_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )

    // example api usage

    val intent_sample = api.get_intent_sample().get

    if (intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) {
      // INTENT_INVALID
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
    } else if (intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.NoIntent) {
      // INTENT_NEUTRAL
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent)
    } else if (intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.BeginCharge) {
      // INTENT_BEGIN
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge)
    } else {
      // INTENT_END
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge)
    }
  }

  def finalise(api: Charge_Intent_Qualification_Operational_Api): Unit = { }
}
