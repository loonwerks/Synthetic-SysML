// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner {

  var confidenceState: BatteryConfidence.Type = BatteryConfidence.Untrusted

  def facts(
    qualification: BatteryQualification,
    confidence: BatteryConfidence.Type,
    winningCase: ConfidenceCase.Type): BatteryStateFacts = {
    return BatteryStateFacts(
      confidence = confidence,
      band = qualification.band,
      chargeNeeded = confidence == BatteryConfidence.Trusted &&
        qualification.band != QualifiedBand.Full,
      batteryUsable = confidence == BatteryConfidence.Trusted,
      batteryFault = !qualification.validEvidence,
      winningCase = winningCase)
  }

  def initialise(api: BatteryConfidenceStateOwner_Initialization_Api): Unit = {
    Contract(Modifies(confidenceState, api))
    confidenceState = BatteryConfidence.Untrusted
    val initial: BatteryStateFacts = facts(
      BatteryQualification(F, QualifiedBand.Suppressed),
      confidenceState,
      ConfidenceCase.CONF_01)
    api.put_stateToEligibility(initial)
    api.put_stateToAttention(initial)
    api.put_stateToAdvisory(initial)
    api.put_faultToAggregation(T)
  }

  def timeTriggered(api: BatteryConfidenceStateOwner_Operational_Api): Unit = {
    Contract(Modifies(confidenceState, api))
    api.get_qualificationIn() match {
      case Some(qualification) =>
        var winningCase: ConfidenceCase.Type = ConfidenceCase.CONF_04
        if (!qualification.validEvidence) {
          confidenceState = BatteryConfidence.Untrusted
          winningCase = ConfidenceCase.CONF_01
        } else if (confidenceState == BatteryConfidence.Untrusted) {
          confidenceState = BatteryConfidence.Confirming
          winningCase = ConfidenceCase.CONF_02
        } else if (confidenceState == BatteryConfidence.Confirming) {
          confidenceState = BatteryConfidence.Trusted
          winningCase = ConfidenceCase.CONF_03
        } else {
          confidenceState = BatteryConfidence.Trusted
        }
        val output: BatteryStateFacts = facts(qualification, confidenceState, winningCase)
        api.put_stateToEligibility(output)
        api.put_stateToAttention(output)
        api.put_stateToAdvisory(output)
        api.put_faultToAggregation(output.batteryFault)
      case _ =>
    }
  }

  def finalise(api: BatteryConfidenceStateOwner_Operational_Api): Unit = { }
}
