// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Context_Qualification_charge_supervision_process_charge_context_qualification {

  def initialise(api: Charge_Context_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        api.charge_context == Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext
      )
    )

    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    // INITIAL_CHARGE_CONTEXT
    api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
  }

  def timeTriggered(api: Charge_Context_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api)
    )

    // example api usage

    val charger_sample = api.get_charger_sample().get
    val flight_sample = api.get_flight_sample().get

    if (charger_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid |
        flight_sample.status == Drone_Battery_Charge_Supervisor.InputStatus.Invalid) {
      // CONTEXT_INVALID
      api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
    } else if (flight_sample.activity == Drone_Battery_Charge_Supervisor.FlightActivity.Active) {
      // CONTEXT_FLIGHT_ACTIVE
      api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.FlightActiveContext)
    } else if (charger_sample.availability == Drone_Battery_Charge_Supervisor.ChargerAvailability.Available) {
      // CONTEXT_AVAILABLE_INACTIVE
      api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.AvailableInactiveContext)
    } else {
      // CONTEXT_UNAVAILABLE_INACTIVE
      api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.UnavailableInactiveContext)
    }
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
