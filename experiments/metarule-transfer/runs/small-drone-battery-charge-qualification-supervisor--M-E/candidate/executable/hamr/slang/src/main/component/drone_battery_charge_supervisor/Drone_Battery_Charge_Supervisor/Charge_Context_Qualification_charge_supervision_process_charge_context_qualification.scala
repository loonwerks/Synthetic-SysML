// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Context_Qualification_charge_supervision_process_charge_context_qualification {

  def initialise(api: Charge_Context_Qualification_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
  }

  def timeTriggered(api: Charge_Context_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CONTEXT_INVALID
        (api.charger_sample.status == InputStatus.Invalid |
          api.flight_sample.status == InputStatus.Invalid) ___>: (api.charge_context == ChargeContext.InvalidChargeContext),
        // case CONTEXT_FLIGHT_ACTIVE
        (api.charger_sample.status == InputStatus.Valid &
          api.flight_sample.status == InputStatus.Valid &
          api.flight_sample.activity == FlightActivity.Active) ___>: (api.charge_context == ChargeContext.FlightActiveContext),
        // case CONTEXT_AVAILABLE_INACTIVE
        (api.charger_sample.status == InputStatus.Valid &
          api.flight_sample.status == InputStatus.Valid &
          api.flight_sample.activity == FlightActivity.Inactive &
          api.charger_sample.availability == ChargerAvailability.Available) ___>: (api.charge_context == ChargeContext.AvailableInactiveContext),
        // case CONTEXT_UNAVAILABLE_INACTIVE
        (api.charger_sample.status == InputStatus.Valid &
          api.flight_sample.status == InputStatus.Valid &
          api.flight_sample.activity == FlightActivity.Inactive &
          api.charger_sample.availability == ChargerAvailability.Unavailable) ___>: (api.charge_context == ChargeContext.UnavailableInactiveContext)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val charger = api.get_charger_sample().get
    val flight = api.get_flight_sample().get
    if (charger.status == InputStatus.Invalid | flight.status == InputStatus.Invalid) {
      api.put_charge_context(ChargeContext.InvalidChargeContext)
    } else if (flight.activity == FlightActivity.Active) {
      api.put_charge_context(ChargeContext.FlightActiveContext)
    } else if (charger.availability == ChargerAvailability.Available) {
      api.put_charge_context(ChargeContext.AvailableInactiveContext)
    } else {
      api.put_charge_context(ChargeContext.UnavailableInactiveContext)
    }
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
