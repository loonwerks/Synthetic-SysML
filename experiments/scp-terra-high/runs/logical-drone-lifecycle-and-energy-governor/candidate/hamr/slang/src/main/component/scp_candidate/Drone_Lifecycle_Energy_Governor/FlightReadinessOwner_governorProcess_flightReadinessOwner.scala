// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object FlightReadinessOwner_governorProcess_flightReadinessOwner {

  def initialise(api: FlightReadinessOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_readinessOut(F)
  }

  def timeTriggered(api: FlightReadinessOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_navigationIn() match {
      case Some(navigation) => api.get_flightControlIn() match {
        case Some(flightControl) => api.get_batteryIn() match {
          case Some(battery) =>
            val adequate: B = battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.MEDIUM ||
              battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.FULL
            api.put_readinessOut(battery.usable && adequate &&
              navigation == Drone_Lifecycle_Energy_Governor.NavigationReport.USABLE &&
              flightControl == Drone_Lifecycle_Energy_Governor.FlightControlReport.AVAILABLE)
        }
      }
    }
  }

  def finalise(api: FlightReadinessOwner_Operational_Api): Unit = { }
}
