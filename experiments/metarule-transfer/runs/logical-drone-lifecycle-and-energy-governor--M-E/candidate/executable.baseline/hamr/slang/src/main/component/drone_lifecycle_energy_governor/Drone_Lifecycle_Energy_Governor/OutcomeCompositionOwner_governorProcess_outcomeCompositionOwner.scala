// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object OutcomeCompositionOwner_governorProcess_outcomeCompositionOwner {

  def initialise(api: OutcomeCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotStatusOut(Drone_Lifecycle_Energy_Governor.PilotStatus.example())
    api.put_chargePermissionOut(Drone_Lifecycle_Energy_Governor.ChargePermission.DENIED)
    api.put_flightControlOut(Drone_Lifecycle_Energy_Governor.FlightControlOutputs.example())
    api.put_propulsionPermissionOut(Drone_Lifecycle_Energy_Governor.PropulsionPermission.DISABLED)
  }

  def timeTriggered(api: OutcomeCompositionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_batteryIn: Option[Drone_Lifecycle_Energy_Governor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val apiUsage_faultsIn: Option[Drone_Lifecycle_Energy_Governor.FaultVector] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
    val apiUsage_resolutionIn: Option[Drone_Lifecycle_Energy_Governor.LifecycleResolution] = api.get_resolutionIn()
    api.logInfo(s"Received on data port resolutionIn: ${apiUsage_resolutionIn}")
  }

  def finalise(api: OutcomeCompositionOwner_Operational_Api): Unit = { }
}
