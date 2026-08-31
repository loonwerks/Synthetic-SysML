// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object FaultAggregationOwner_governorProcess_faultAggregationOwner {

  def initialise(api: FaultAggregationOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector(T, F, F, F, F, F, T))
  }

  def timeTriggered(api: FaultAggregationOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_confidenceIn(), api.get_chargerFaultIn(), api.get_navigationIn(),
      api.get_flightControlIn(), api.get_homeFaultIn(), api.get_touchdownFaultIn()) match {
      case (Some(confidence), Some(charger), Some(navigation), Some(flightControl), Some(home), Some(touchdown)) =>
        val batteryFault = confidence != Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED
        val navigationFault = navigation == Drone_Lifecycle_Energy_Governor.NavigationReport.UNUSABLE
        val flightControlFault = flightControl == Drone_Lifecycle_Energy_Governor.FlightControlReport.FAULTED
        api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector(
          batteryFault, charger, navigationFault, flightControlFault, home, touchdown,
          batteryFault || charger || navigationFault || flightControlFault || home || touchdown))
      case _ =>
        api.put_faultsOut(Drone_Lifecycle_Energy_Governor.FaultVector(T, F, F, F, F, F, T))
    }
  }

  def finalise(api: FaultAggregationOwner_Operational_Api): Unit = { }
}
