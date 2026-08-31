// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner {
  var confidenceState: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type =
    Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED

  def initialise(api: BatteryConfidenceOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    confidenceState = Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
    publish(api, Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL, confidenceState)
  }

  def timeTriggered(api: BatteryConfidenceOwner_Operational_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    api.get_evidenceIn() match {
      case Some(evidence) =>
        val prior = confidenceState
        publish(api, evidence.band, prior)
        confidenceState =
          if (!evidence.validBand) Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
          else if (prior == Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED)
            Drone_Lifecycle_Energy_Governor.BatteryConfidence.CONFIRMING
          else Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED
      case _ =>
        publish(api, Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL,
          Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED)
        confidenceState = Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
    }
  }

  def publish(
    api: BatteryConfidenceOwner_Api,
    band: Drone_Lifecycle_Energy_Governor.BatteryBand.Type,
    confidence: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type): Unit = {
    Contract(Modifies(api))
    val state = Drone_Lifecycle_Energy_Governor.BatteryStateFacts(
      band, confidence, confidence == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED)
    api.put_stateToCharge(state)
    api.put_stateToReadiness(state)
    api.put_confidenceToFault(confidence)
    api.put_stateToComposition(state)
    api.put_stateToHazard(state)
  }

  def finalise(api: BatteryConfidenceOwner_Operational_Api): Unit = { }
}
