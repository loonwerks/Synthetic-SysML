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
    // example api usage

    val apiUsage_charger_sample: Option[Drone_Battery_Charge_Supervisor.ChargerSample] = api.get_charger_sample()
    api.logInfo(s"Received on data port charger_sample: ${apiUsage_charger_sample}")
    val apiUsage_flight_sample: Option[Drone_Battery_Charge_Supervisor.FlightActivitySample] = api.get_flight_sample()
    api.logInfo(s"Received on data port flight_sample: ${apiUsage_flight_sample}")
  }

  def finalise(api: Charge_Context_Qualification_Operational_Api): Unit = { }
}
