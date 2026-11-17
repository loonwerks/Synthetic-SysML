// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner {

  // BEGIN STATE VARS
  var confidenceState: Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Type = Drone_Battery_Charge_Qualification_Supervisor.BatteryConfidence.Untrusted
  // END STATE VARS

  def initialise(api: BatteryConfidenceStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_stateToEligibility(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_stateToAttention(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_stateToAdvisory(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: BatteryConfidenceStateOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CONFIDENCE_PUBLICATIONS_AGREE
        api.stateToEligibility.confidence == confidenceState &
          api.stateToAttention.confidence == api.stateToEligibility.confidence &
          api.stateToAttention.band == api.stateToEligibility.band &
          api.stateToAttention.chargeNeeded == api.stateToEligibility.chargeNeeded &
          api.stateToAttention.batteryUsable == api.stateToEligibility.batteryUsable &
          api.stateToAttention.batteryFault == api.stateToEligibility.batteryFault &
          api.stateToAttention.winningCase == api.stateToEligibility.winningCase &
          api.stateToAdvisory.confidence == api.stateToEligibility.confidence &
          api.stateToAdvisory.band == api.stateToEligibility.band &
          api.stateToAdvisory.chargeNeeded == api.stateToEligibility.chargeNeeded &
          api.stateToAdvisory.batteryUsable == api.stateToEligibility.batteryUsable &
          api.stateToAdvisory.batteryFault == api.stateToEligibility.batteryFault &
          api.stateToAdvisory.winningCase == api.stateToEligibility.winningCase &
          api.faultToAggregation == api.stateToEligibility.batteryFault,
        // guarantee CONFIDENCE_DERIVED_FACTS
        api.stateToEligibility.band == api.qualificationIn.band &
          api.stateToEligibility.batteryUsable == (confidenceState == BatteryConfidence.Trusted) &
          api.stateToEligibility.batteryFault == (api.qualificationIn.validEvidence == F) &
          api.stateToEligibility.chargeNeeded == (confidenceState == BatteryConfidence.Trusted &
            api.qualificationIn.band != QualifiedBand.Full),
        // case CONF_01_INVALID
        (api.qualificationIn.validEvidence == F) ___>: (confidenceState == BatteryConfidence.Untrusted &
          api.stateToEligibility.winningCase == ConfidenceCase.CONF_01),
        // case CONF_02_FIRST_VALID
        (api.qualificationIn.validEvidence &
          In(confidenceState) == BatteryConfidence.Untrusted) ___>: (confidenceState == BatteryConfidence.Confirming &
          api.stateToEligibility.winningCase == ConfidenceCase.CONF_02),
        // case CONF_03_SECOND_VALID
        (api.qualificationIn.validEvidence &
          In(confidenceState) == BatteryConfidence.Confirming) ___>: (confidenceState == BatteryConfidence.Trusted &
          api.stateToEligibility.winningCase == ConfidenceCase.CONF_03),
        // case CONF_04_RETAIN_TRUST
        (api.qualificationIn.validEvidence &
          In(confidenceState) == BatteryConfidence.Trusted) ___>: (confidenceState == BatteryConfidence.Trusted &
          api.stateToEligibility.winningCase == ConfidenceCase.CONF_04)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_qualificationIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification] = api.get_qualificationIn()
    api.logInfo(s"Received on data port qualificationIn: ${apiUsage_qualificationIn}")
  }

  def finalise(api: BatteryConfidenceStateOwner_Operational_Api): Unit = { }
}
