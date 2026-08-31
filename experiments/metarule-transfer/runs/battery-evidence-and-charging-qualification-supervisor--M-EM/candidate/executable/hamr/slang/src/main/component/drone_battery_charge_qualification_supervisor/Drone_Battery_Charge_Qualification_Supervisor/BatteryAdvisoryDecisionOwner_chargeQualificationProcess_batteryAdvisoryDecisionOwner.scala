// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner {

  def initialise(api: BatteryAdvisoryDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_advisoryToRequestResult(Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts.example())
  }

  def timeTriggered(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ADVISORY_UNKNOWN
        (api.batteryIn.confidence != BatteryConfidence.Trusted |
          api.lifecycleIn.contextValid == F) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN),
        // case ADVISORY_AIRBORNE_ATTENTION
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.lifecycleIn.contextValid &
          api.lifecycleIn.airborneContext &
          (api.batteryIn.band == QualifiedBand.Low |
            api.batteryIn.band == QualifiedBand.Critical)) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.AIRBORNE_ATTENTION),
        // case ADVISORY_BATTERY_READY
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.lifecycleIn.contextValid &
          (api.batteryIn.band == QualifiedBand.Full |
            api.batteryIn.band == QualifiedBand.Nominal)) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.BATTERY_READY),
        // case ADVISORY_CHARGE_QUALIFIED
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.lifecycleIn.contextValid &
          api.lifecycleIn.airborneContext == F &
          (api.batteryIn.band == QualifiedBand.Low |
            api.batteryIn.band == QualifiedBand.Critical) &
          api.eligibilityIn == ChargeEligibility.Permitted) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_QUALIFIED),
        // case ADVISORY_CHARGE_BLOCKED
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.lifecycleIn.contextValid &
          api.lifecycleIn.airborneContext == F &
          (api.batteryIn.band == QualifiedBand.Low |
            api.batteryIn.band == QualifiedBand.Critical) &
          api.eligibilityIn != ChargeEligibility.Permitted) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_BLOCKED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_lifecycleIn: Option[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts] = api.get_lifecycleIn()
    api.logInfo(s"Received on data port lifecycleIn: ${apiUsage_lifecycleIn}")
    val apiUsage_batteryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val apiUsage_eligibilityIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type] = api.get_eligibilityIn()
    api.logInfo(s"Received on data port eligibilityIn: ${apiUsage_eligibilityIn}")
  }

  def finalise(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = { }
}
