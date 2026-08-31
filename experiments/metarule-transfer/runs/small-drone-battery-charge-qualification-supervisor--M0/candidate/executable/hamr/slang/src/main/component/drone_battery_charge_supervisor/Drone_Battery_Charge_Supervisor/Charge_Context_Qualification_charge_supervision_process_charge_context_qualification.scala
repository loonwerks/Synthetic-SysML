// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Context_Qualification_charge_supervision_process_charge_context_qualification {

  def initialise(api: Charge_Context_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
  }

  def timeTriggered(api: Charge_Context_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CONTEXT_INVALID
        //   Invalid charger or flight evidence inhibits context qualification | N.md#CONTEXT_INVALID
        (api.charger_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid |
          api.flight_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) ___>: (api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext),
        // case CONTEXT_FLIGHT_ACTIVE
        //   Valid active flight context is not charge eligible | N.md#CONTEXT_FLIGHT_ACTIVE
        (api.charger_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.activity == Drone_Battery_Charge_Supervisor.FlightActivity.Active) ___>: (api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.FlightActiveContext),
        // case CONTEXT_AVAILABLE_INACTIVE
        //   Available charger and inactive flight context are qualified | N.md#CONTEXT_AVAILABLE_INACTIVE
        (api.charger_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.activity == Drone_Battery_Charge_Supervisor.FlightActivity.Inactive &
          api.charger_sample.availability == Drone_Battery_Charge_Supervisor.ChargerAvailability.Available) ___>: (api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext),
        // case CONTEXT_UNAVAILABLE_INACTIVE
        //   Unavailable charger remains noneligible while flight is inactive | N.md#CONTEXT_UNAVAILABLE_INACTIVE
        (api.charger_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Valid &
          api.flight_sample.activity == Drone_Battery_Charge_Supervisor.FlightActivity.Inactive &
          api.charger_sample.availability == Drone_Battery_Charge_Supervisor.ChargerAvailability.Unavailable) ___>: (api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.UnavailableInactiveContext)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val charger: Drone_Battery_Charge_Supervisor.ChargerSample = api.get_charger_sample().get
    val flight: Drone_Battery_Charge_Supervisor.FlightActivitySample = api.get_flight_sample().get
    val context: Drone_Battery_Charge_Supervisor.ChargeContext.Type =
      if (charger.status != Drone_Battery_Charge_Supervisor.InputStatus.Valid |
          flight.status != Drone_Battery_Charge_Supervisor.InputStatus.Valid) {
        Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext
      } else if (flight.activity == Drone_Battery_Charge_Supervisor.FlightActivity.Active) {
        Drone_Battery_Charge_Supervisor.ChargeContext.FlightActiveContext
      } else if (charger.availability == Drone_Battery_Charge_Supervisor.ChargerAvailability.Available) {
        Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext
      } else {
        Drone_Battery_Charge_Supervisor.ChargeContext.UnavailableInactiveContext
      }
    api.put_charge_context(context)
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
