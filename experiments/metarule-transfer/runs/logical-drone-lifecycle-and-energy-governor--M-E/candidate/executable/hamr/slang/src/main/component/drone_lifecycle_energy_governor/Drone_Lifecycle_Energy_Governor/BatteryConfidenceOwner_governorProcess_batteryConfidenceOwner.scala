// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceOwner_governorProcess_batteryConfidenceOwner {

  // BEGIN STATE VARS
  var confidenceState: Drone_Lifecycle_Energy_Governor.BatteryConfidence.Type = Drone_Lifecycle_Energy_Governor.BatteryConfidence.UNTRUSTED
  // END STATE VARS

  def initialise(api: BatteryConfidenceOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, confidenceState))
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
    Contract(
      Modifies(api, confidenceState),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee SAME_STEP_CONFIDENCE_PRESERVATION
        api.stateToCharge.band == api.evidenceIn.band &
          api.stateToReadiness.band == api.evidenceIn.band &
          api.stateToComposition.band == api.evidenceIn.band &
          api.stateToHazard.band == api.evidenceIn.band &
          api.stateToCharge.confidence == confidenceState &
          api.stateToReadiness.confidence == confidenceState &
          api.confidenceToFault == confidenceState &
          api.stateToComposition.confidence == confidenceState &
          api.stateToHazard.confidence == confidenceState &
          api.stateToCharge.usable == (confidenceState == BatteryConfidence.TRUSTED) &
          api.stateToReadiness.usable == api.stateToCharge.usable &
          api.stateToComposition.usable == api.stateToCharge.usable &
          api.stateToHazard.usable == api.stateToCharge.usable,
        // case CASE_A_01_INVALID
        (!(api.evidenceIn.validBand)) ___>: (confidenceState == BatteryConfidence.UNTRUSTED),
        // case CASE_A_02_FIRST_VALID
        (api.evidenceIn.validBand &
          In(confidenceState) == BatteryConfidence.UNTRUSTED) ___>: (confidenceState == BatteryConfidence.CONFIRMING),
        // case CASE_A_03_SECOND_VALID
        (api.evidenceIn.validBand &
          In(confidenceState) == BatteryConfidence.CONFIRMING) ___>: (confidenceState == BatteryConfidence.TRUSTED),
        // case CASE_A_04_TRUSTED_RETENTION
        (api.evidenceIn.validBand &
          In(confidenceState) == BatteryConfidence.TRUSTED) ___>: (confidenceState == BatteryConfidence.TRUSTED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    api.get_evidenceIn() match {
      case Some(evidence) =>
        confidenceState =
          if (!evidence.validBand) BatteryConfidence.UNTRUSTED
          else if (confidenceState == BatteryConfidence.UNTRUSTED) BatteryConfidence.CONFIRMING
          else BatteryConfidence.TRUSTED
        val facts = BatteryStateFacts(evidence.band, confidenceState,
          confidenceState == BatteryConfidence.TRUSTED)
        api.put_stateToCharge(facts)
        api.put_stateToReadiness(facts)
        api.put_confidenceToFault(confidenceState)
        api.put_stateToComposition(facts)
        api.put_stateToHazard(facts)
      case _ =>
        confidenceState = BatteryConfidence.UNTRUSTED
        val facts = BatteryStateFacts(BatteryBand.CRITICAL, confidenceState, F)
        api.put_stateToCharge(facts)
        api.put_stateToReadiness(facts)
        api.put_confidenceToFault(confidenceState)
        api.put_stateToComposition(facts)
        api.put_stateToHazard(facts)
    }
  }

  def finalise(api: BatteryConfidenceOwner_Operational_Api): Unit = { }
}
