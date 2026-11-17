// #Sireum

package drone_battery_charge_supervisor.Drone_Battery_Charge_Supervisor

import org.sireum._
import drone_battery_charge_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object Charge_Context_Qualification_charge_supervision_process_charge_context_qualification {

  def initialise(api: Charge_Context_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_charge_context(Drone_Battery_Charge_Supervisor.ChargeContext.InvalidChargeContext)
  }

  def timeTriggered(api: Charge_Context_Qualification_Operational_Api): Unit = {
    Contract(
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
    // example api usage

    val apiUsage_charger_sample: Option[Drone_Battery_Charge_Supervisor.ChargerSample] = api.get_charger_sample()
    api.logInfo(s"Received on data port charger_sample: ${apiUsage_charger_sample}")
    val apiUsage_flight_sample: Option[Drone_Battery_Charge_Supervisor.FlightActivitySample] = api.get_flight_sample()
    api.logInfo(s"Received on data port flight_sample: ${apiUsage_flight_sample}")
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
