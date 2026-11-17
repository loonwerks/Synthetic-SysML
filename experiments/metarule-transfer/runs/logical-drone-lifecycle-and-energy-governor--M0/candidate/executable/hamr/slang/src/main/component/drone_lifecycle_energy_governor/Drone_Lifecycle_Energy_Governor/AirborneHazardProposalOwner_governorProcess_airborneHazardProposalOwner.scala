// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner {

  def initialise(api: AirborneHazardProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_proposalOut(HazardProposal(T, F, T, F, F))
  }

  def timeTriggered(api: AirborneHazardProposalOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_navigationIn(), api.get_flightControlIn(), api.get_batteryIn()) match {
      case (Some(navigation), Some(flightControl), Some(battery)) =>
        val unusable = !battery.usable
        val lowOrCritical = battery.usable &
          (battery.band == BatteryBand.LOW | battery.band == BatteryBand.CRITICAL)
        val navigationUnusable = navigation == NavigationReport.UNUSABLE
        val emergency = unusable |
          (battery.confidence == BatteryConfidence.TRUSTED & battery.band == BatteryBand.CRITICAL) |
          flightControl == FlightControlReport.FAULTED
        val forcedReturn = navigationUnusable |
          (battery.confidence == BatteryConfidence.TRUSTED & battery.band == BatteryBand.LOW)
        api.put_proposalOut(HazardProposal(emergency, forcedReturn, unusable, lowOrCritical, navigationUnusable))
      case _ => api.put_proposalOut(HazardProposal(T, F, T, F, F))
    }
  }

  def finalise(api: AirborneHazardProposalOwner_Operational_Api): Unit = { }
}
