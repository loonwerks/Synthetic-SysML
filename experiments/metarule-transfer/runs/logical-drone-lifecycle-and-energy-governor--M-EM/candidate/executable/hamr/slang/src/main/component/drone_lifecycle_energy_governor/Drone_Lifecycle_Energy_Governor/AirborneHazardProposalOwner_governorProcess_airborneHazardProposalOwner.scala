// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner {

  def initialise(api: AirborneHazardProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal(T, F, T, F, F))
  }

  def timeTriggered(api: AirborneHazardProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_navigationIn(), api.get_flightControlIn(), api.get_batteryIn()) match {
      case (Some(navigation), Some(flightControl), Some(battery)) =>
        val batteryUnusable = !battery.usable
        val lowOrCritical = battery.usable &&
          (battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW ||
            battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL)
        val navigationUnusable = navigation == Drone_Lifecycle_Energy_Governor.NavigationReport.UNUSABLE
        api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal(
          batteryUnusable ||
            (battery.confidence == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED &&
              battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL) ||
            flightControl == Drone_Lifecycle_Energy_Governor.FlightControlReport.FAULTED,
          navigationUnusable ||
            (battery.confidence == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED &&
              battery.band == Drone_Lifecycle_Energy_Governor.BatteryBand.LOW),
          batteryUnusable,
          lowOrCritical,
          navigationUnusable))
      case _ =>
        api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal(T, F, T, F, F))
    }
  }

  def finalise(api: AirborneHazardProposalOwner_Operational_Api): Unit = { }
}
