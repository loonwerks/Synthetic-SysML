// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner {
  var confidenceState: BatteryConfidence.Type = BatteryConfidence.UNTRUSTED

  def facts(band: BatteryBand.Type, confidence: BatteryConfidence.Type): BatteryStateFacts = {
    return BatteryStateFacts(band, confidence, confidence == BatteryConfidence.TRUSTED)
  }

  def initialise(api: BatteryConfidenceOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    confidenceState = BatteryConfidence.UNTRUSTED
    val initial = facts(BatteryBand.CRITICAL, confidenceState)
    api.put_stateToCharge(initial)
    api.put_stateToReadiness(initial)
    api.put_confidenceToFault(confidenceState)
    api.put_stateToComposition(initial)
    api.put_stateToHazard(initial)
  }

  def timeTriggered(api: BatteryConfidenceOwner_Operational_Api): Unit = {
    Contract(Modifies(api, confidenceState))
    api.get_evidenceIn() match {
      case Some(evidence) =>
        val entryConfidence = confidenceState
        val output = facts(evidence.band, entryConfidence)
        api.put_stateToCharge(output)
        api.put_stateToReadiness(output)
        api.put_confidenceToFault(entryConfidence)
        api.put_stateToComposition(output)
        api.put_stateToHazard(output)
        if (!evidence.validBand) {
          confidenceState = BatteryConfidence.UNTRUSTED
        } else if (entryConfidence == BatteryConfidence.UNTRUSTED) {
          confidenceState = BatteryConfidence.CONFIRMING
        } else {
          confidenceState = BatteryConfidence.TRUSTED
        }
      case _ =>
        val output = facts(BatteryBand.CRITICAL, confidenceState)
        api.put_stateToCharge(output)
        api.put_stateToReadiness(output)
        api.put_confidenceToFault(confidenceState)
        api.put_stateToComposition(output)
        api.put_stateToHazard(output)
        confidenceState = BatteryConfidence.UNTRUSTED
    }
  }

  def finalise(api: BatteryConfidenceOwner_Operational_Api): Unit = { }
}
