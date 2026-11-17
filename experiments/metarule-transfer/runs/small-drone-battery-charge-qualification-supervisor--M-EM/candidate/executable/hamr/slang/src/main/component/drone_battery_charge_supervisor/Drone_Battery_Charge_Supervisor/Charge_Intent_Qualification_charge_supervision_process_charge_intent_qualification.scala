// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Intent_Qualification_charge_supervision_process_charge_intent_qualification {

  def initialise(api: Charge_Intent_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
  }

  def timeTriggered(api: Charge_Intent_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case INTENT_INVALID
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent),
        // case INTENT_NEUTRAL
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.NoIntent) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent),
        // case INTENT_BEGIN
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.BeginCharge) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge),
        // case INTENT_END
        (api.intent_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.intent_sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.EndCharge) ___>: (api.qualified_intent == Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val sample = api.get_intent_sample().get
    if (sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) {
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.InvalidChargeIntent)
    } else if (sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.NoIntent) {
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.NoIntent)
    } else if (sample.intent == Drone_Battery_Charge_Supervisor.ChargeIntent.BeginCharge) {
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.BeginCharge)
    } else {
      api.put_qualified_intent(Drone_Battery_Charge_Supervisor.QualifiedChargeIntent.EndCharge)
    }
  }

  def finalise(api: Charge_Intent_Qualification_Operational_Api): Unit = { }
}
