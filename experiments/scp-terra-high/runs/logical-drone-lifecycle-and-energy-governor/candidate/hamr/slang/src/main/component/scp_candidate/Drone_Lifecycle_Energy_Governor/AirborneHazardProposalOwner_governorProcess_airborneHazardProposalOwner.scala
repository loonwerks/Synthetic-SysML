// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner {

  def initialise(api: AirborneHazardProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal(T, F, T, F, F))
  }

  def timeTriggered(api: AirborneHazardProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_navigationIn() match {
      case Some(navigation) => api.get_flightControlIn() match {
        case Some(flightControl) => api.get_batteryIn() match {
          case Some(battery) =>
            val unusable: B = !battery.usable
            val lowOrCritical: B = battery.usable &&
              (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW ||
                battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL)
            val navigationUnusable: B = navigation == Drone_Lifecycle_Energy_Governor.NavigationReport.UNUSABLE
            val emergency: B = unusable ||
              (battery.confidence == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED &&
                battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL) ||
              flightControl == Drone_Lifecycle_Energy_Governor.FlightControlReport.FAULTED
            val forcedReturn: B = navigationUnusable ||
              (battery.confidence == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED &&
                battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW)
            api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal(
              emergency, forcedReturn, unusable, lowOrCritical, navigationUnusable))
        }
      }
    }
  }

  def finalise(api: AirborneHazardProposalOwner_Operational_Api): Unit = { }
}
