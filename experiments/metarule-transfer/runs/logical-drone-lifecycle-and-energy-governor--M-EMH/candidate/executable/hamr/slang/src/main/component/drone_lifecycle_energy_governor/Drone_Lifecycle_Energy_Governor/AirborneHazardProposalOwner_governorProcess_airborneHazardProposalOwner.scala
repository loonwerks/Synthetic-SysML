// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object AirborneHazardProposalOwner_governorProcess_airborneHazardProposalOwner {

  def initialise(api: AirborneHazardProposalOwner_Initialization_Api): Unit = {
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
    // example api usage

    val apiUsage_navigationIn: Option[Drone_Lifecycle_Energy_Governor.NavigationReport.Type] = api.get_navigationIn()
    api.logInfo(s"Received on data port navigationIn: ${apiUsage_navigationIn}")
    val apiUsage_flightControlIn: Option[Drone_Lifecycle_Energy_Governor.FlightControlReport.Type] = api.get_flightControlIn()
    api.logInfo(s"Received on data port flightControlIn: ${apiUsage_flightControlIn}")
    val apiUsage_batteryIn: Option[Drone_Lifecycle_Energy_Governor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val navigation = api.get_navigationIn().get
    val flightControl = api.get_flightControlIn().get
    val battery = api.get_batteryIn().get
    val unusable = !battery.usable
    val low = battery.usable &
      (battery.band == BatteryBand.LOW | battery.band == BatteryBand.CRITICAL)
    val navigationLost = navigation == NavigationReport.UNUSABLE
    api.put_proposalOut(HazardProposal(unusable |
      (battery.confidence == BatteryConfidence.TRUSTED &
        battery.band == BatteryBand.CRITICAL) |
      flightControl == FlightControlReport.FAULTED,
      navigationLost | (battery.confidence == BatteryConfidence.TRUSTED &
        battery.band == BatteryBand.LOW),
      unusable, low, navigationLost))
  }

  def finalise(api: AirborneHazardProposalOwner_Operational_Api): Unit = { }
}
