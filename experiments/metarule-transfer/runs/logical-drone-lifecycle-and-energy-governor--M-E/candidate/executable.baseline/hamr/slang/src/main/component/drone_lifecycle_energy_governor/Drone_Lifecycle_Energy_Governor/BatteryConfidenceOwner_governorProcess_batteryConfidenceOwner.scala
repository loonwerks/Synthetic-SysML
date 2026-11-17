// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner {

  def initialise(api: BatteryConfidenceOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_stateToCharge(Drone_Lifecycle_Energy_Governor.BatteryStateFacts.example())
    api.put_stateToReadiness(Drone_Lifecycle_Energy_Governor.BatteryStateFacts.example())
    api.put_confidenceToFault(Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED)
    api.put_stateToComposition(Drone_Lifecycle_Energy_Governor.BatteryStateFacts.example())
    api.put_stateToHazard(Drone_Lifecycle_Energy_Governor.BatteryStateFacts.example())
  }

  def timeTriggered(api: BatteryConfidenceOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_evidenceIn: Option[Drone_Lifecycle_Energy_Governor.BatteryEvidence] = api.get_evidenceIn()
    api.logInfo(s"Received on data port evidenceIn: ${apiUsage_evidenceIn}")
  }

  def finalise(api: BatteryConfidenceOwner_Operational_Api): Unit = { }
}
