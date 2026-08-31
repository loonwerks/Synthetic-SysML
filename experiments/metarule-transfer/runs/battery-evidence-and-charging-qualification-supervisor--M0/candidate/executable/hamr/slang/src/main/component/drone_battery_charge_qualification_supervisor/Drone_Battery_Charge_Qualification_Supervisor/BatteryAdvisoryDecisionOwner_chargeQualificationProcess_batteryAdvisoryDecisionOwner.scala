// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner {

  def initialise(api: BatteryAdvisoryDecisionOwner_Initialization_Api): Unit = {
  }

  def timeTriggered(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case ADVISORY_UNKNOWN
        (api.batteryIn.confidence != BatteryConfidence.Trusted |
          !(api.lifecycleIn.contextValid)) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.ADVISORY_UNKNOWN),
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
          !(api.lifecycleIn.airborneContext) &
          (api.batteryIn.band == QualifiedBand.Low |
            api.batteryIn.band == QualifiedBand.Critical) &
          api.eligibilityIn == ChargeEligibility.Permitted) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_QUALIFIED),
        // case ADVISORY_CHARGE_BLOCKED
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.lifecycleIn.contextValid &
          !(api.lifecycleIn.airborneContext) &
          (api.batteryIn.band == QualifiedBand.Low |
            api.batteryIn.band == QualifiedBand.Critical) &
          api.eligibilityIn != ChargeEligibility.Permitted) ___>: (api.advisoryToRequestResult.advisoryValue == PilotAdvisory.CHARGE_BLOCKED)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val lifecycle = api.get_lifecycleIn().get
    val battery = api.get_batteryIn().get
    val eligibility = api.get_eligibilityIn().get
    val advisory: PilotAdvisory.Type =
      if (battery.confidence != BatteryConfidence.Trusted | !lifecycle.contextValid) PilotAdvisory.ADVISORY_UNKNOWN
      else if (lifecycle.airborneContext & (battery.band == QualifiedBand.Low | battery.band == QualifiedBand.Critical)) PilotAdvisory.AIRBORNE_ATTENTION
      else if (battery.band == QualifiedBand.Full | battery.band == QualifiedBand.Nominal) PilotAdvisory.BATTERY_READY
      else if (eligibility == ChargeEligibility.Permitted) PilotAdvisory.CHARGE_QUALIFIED
      else PilotAdvisory.CHARGE_BLOCKED
    api.put_advisoryToRequestResult(AdvisoryFacts(advisory))
  }

  def finalise(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = { }
}
