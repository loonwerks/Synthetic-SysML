// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FlightReadinessOwner_governorProcess_flightReadinessOwner {

  def initialise(api: FlightReadinessOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_readinessOut(Base_Types.Boolean_example())
  }

  def timeTriggered(api: FlightReadinessOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee COMBINED_FLIGHT_READINESS
        api.readinessOut == (api.batteryIn.usable &
          (api.batteryIn.band == BatteryBand.MEDIUM |
            api.batteryIn.band == BatteryBand.FULL) &
          api.navigationIn == NavigationReport.USABLE &
          api.flightControlIn == FlightControlReport.AVAILABLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_navigationIn(), api.get_flightControlIn(), api.get_batteryIn()) match {
      case (Some(navigation), Some(flightControl), Some(battery)) =>
        api.put_readinessOut(battery.usable &
          (battery.band == BatteryBand.MEDIUM | battery.band == BatteryBand.FULL) &
          navigation == NavigationReport.USABLE &
          flightControl == FlightControlReport.AVAILABLE)
      case _ => api.put_readinessOut(F)
    }
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
