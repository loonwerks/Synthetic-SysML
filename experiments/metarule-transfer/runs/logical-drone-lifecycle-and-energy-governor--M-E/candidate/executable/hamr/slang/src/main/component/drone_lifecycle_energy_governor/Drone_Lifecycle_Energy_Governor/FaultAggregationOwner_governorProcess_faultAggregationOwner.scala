// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_governorProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector.example())
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CURRENT_FAULT_VECTOR_AND_DISJUNCTION
        api.faultsOut.batteryFault == (api.confidenceIn != BatteryConfidence.TRUSTED) &
          api.faultsOut.chargerFault == api.chargerFaultIn &
          api.faultsOut.navigationFault == (api.navigationIn == NavigationReport.UNUSABLE) &
          api.faultsOut.flightControlFault == (api.flightControlIn == FlightControlReport.FAULTED) &
          api.faultsOut.homeFault == api.homeFaultIn &
          api.faultsOut.touchdownFault == api.touchdownFaultIn &
          api.faultsOut.aggregateFault == (api.faultsOut.batteryFault | api.faultsOut.chargerFault |
            api.faultsOut.navigationFault |
            api.faultsOut.flightControlFault |
            api.faultsOut.homeFault |
            api.faultsOut.touchdownFault)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_confidenceIn(), api.get_chargerFaultIn(), api.get_navigationIn(),
      api.get_flightControlIn(), api.get_homeFaultIn(), api.get_touchdownFaultIn()) match {
      case (Some(confidence), Some(charger), Some(navigation), Some(flight), Some(home), Some(touchdown)) =>
        val battery = confidence != BatteryConfidence.TRUSTED
        val nav = navigation == NavigationReport.UNUSABLE
        val fc = flight == FlightControlReport.FAULTED
        api.put_faultsOut(FaultVector(battery, charger, nav, fc, home, touchdown,
          battery | charger | nav | fc | home | touchdown))
      case _ => api.put_faultsOut(FaultVector(T, F, F, F, F, F, T))
    }
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
