// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner {

  def initialise(api: AirborneHazardProposalOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_proposalOut(Drone_Lifecycle_Energy_Governor.HazardProposal.example())
  }

  def timeTriggered(api: AirborneHazardProposalOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee AIRBORNE_HAZARD_PROPOSALS
        api.proposalOut.batteryUnusable == !(api.batteryIn.usable) &
          api.proposalOut.lowOrCritical == (api.batteryIn.usable &
            (api.batteryIn.band == BatteryBand.LOW |
              api.batteryIn.band == BatteryBand.CRITICAL)) &
          api.proposalOut.navigationUnusable == (api.navigationIn == NavigationReport.UNUSABLE) &
          api.proposalOut.emergencyLand == (!(api.batteryIn.usable) |
            api.batteryIn.confidence == BatteryConfidence.TRUSTED &
              api.batteryIn.band == BatteryBand.CRITICAL |
            api.flightControlIn == FlightControlReport.FAULTED) &
          api.proposalOut.forcedReturn == (api.navigationIn == NavigationReport.UNUSABLE |
            api.batteryIn.confidence == BatteryConfidence.TRUSTED &
              api.batteryIn.band == BatteryBand.LOW)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    (api.get_navigationIn(), api.get_flightControlIn(), api.get_batteryIn()) match {
      case (Some(navigation), Some(flightControl), Some(battery)) =>
        api.put_proposalOut(HazardProposal(!battery.usable |
          (battery.confidence == BatteryConfidence.TRUSTED &
            battery.band == BatteryBand.CRITICAL) |
          flightControl == FlightControlReport.FAULTED,
          navigation == NavigationReport.UNUSABLE |
            (battery.confidence == BatteryConfidence.TRUSTED & battery.band == BatteryBand.LOW),
          !battery.usable,
          battery.usable & (battery.band == BatteryBand.LOW |
            battery.band == BatteryBand.CRITICAL),
          navigation == NavigationReport.UNUSABLE))
      case _ => api.put_proposalOut(HazardProposal(T, F, T, F, F))
    }
  }

  def finalise(api: AirborneHazardProposalOwner_Operational_Api): Unit = { }
}
