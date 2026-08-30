// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner {

  var confidenceState: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type =
    Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED

  def initialise(api: BatteryConfidenceOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    confidenceState = Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
    val state: Drone_Lifecycle_Energy_Governor.BatteryStateFacts = Drone_Lifecycle_Energy_Governor.BatteryStateFacts(
      Drone_Lifecycle_Energy_Governor.BatteryBand.CRITICAL, confidenceState, F)
    api.put_stateToCharge(state)
    api.put_stateToReadiness(state)
    api.put_confidenceToFault(Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED)
    api.put_stateToComposition(state)
    api.put_stateToHazard(state)
  }

  def timeTriggered(api: BatteryConfidenceOwner_Operational_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    api.get_evidenceIn() match {
      case Some(evidence) =>
        var nextConfidence: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type =
          Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED
        if (!evidence.validBand) {
          nextConfidence = Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
        } else if (confidenceState == Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED) {
          nextConfidence = Drone_Lifecycle_Energy_Governor.BatteryConfidence.CONFIRMING
        }
        confidenceState = nextConfidence
        val state: Drone_Lifecycle_Energy_Governor.BatteryStateFacts = Drone_Lifecycle_Energy_Governor.BatteryStateFacts(
          evidence.band, confidenceState,
          confidenceState == Drone_Lifecycle_Energy_Governor.BatteryConfidence.TRUSTED)
        api.put_stateToCharge(state)
        api.put_stateToReadiness(state)
        api.put_confidenceToFault(confidenceState)
        api.put_stateToComposition(state)
        api.put_stateToHazard(state)
    }
  }

  def finalise(api: BatteryConfidenceOwner_Operational_Api): Unit = { }
}
