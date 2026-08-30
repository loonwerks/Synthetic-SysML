// #Sireum

package scp_candidate.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner {

  // BEGIN STATE VARS
  var confidenceState: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type = Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Untrusted
  // END STATE VARS

  def initialise(api: BatteryConfidenceStateOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        confidenceState
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_CONFIDENCE
        confidenceState == BatteryConfidence.Untrusted &&
          api.stateToEligibility.confidence == BatteryConfidence.Untrusted &&
          api.stateToEligibility.band == QualifiedBand.Suppressed &&
          api.stateToEligibility.chargeNeeded == F &&
          api.stateToEligibility.batteryUsable == F &&
          api.stateToEligibility.batteryFault == T &&
          api.stateToEligibility.winningCase == ConfidenceCase.CONF_01 &&
          api.stateToAttention == api.stateToEligibility &&
          api.stateToAdvisory == api.stateToEligibility &&
          api.faultToAggregation == T
        // END INITIALIZES ENSURES
      )
    )
    confidenceState = BatteryConfidence.Untrusted
    val f: BatteryStateFacts = BatteryStateFacts(BatteryConfidence.Untrusted, QualifiedBand.Suppressed, F, F, T, ConfidenceCase.CONF_01)
    api.put_stateToEligibility(f)
    api.put_stateToAttention(f)
    api.put_stateToAdvisory(f)
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: BatteryConfidenceStateOwner_Operational_Api): Unit = { }

  def finalise(api: BatteryConfidenceStateOwner_Operational_Api): Unit = { }
}
