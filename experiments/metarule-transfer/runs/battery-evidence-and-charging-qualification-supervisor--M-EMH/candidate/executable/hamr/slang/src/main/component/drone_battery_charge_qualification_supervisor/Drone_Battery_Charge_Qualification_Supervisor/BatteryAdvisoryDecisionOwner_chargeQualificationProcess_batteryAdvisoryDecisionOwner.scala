// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryAdvisoryDecisionOwner_chargeQualificationProcess_batteryAdvisoryDecisionOwner {

  def initialise(api: BatteryAdvisoryDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_advisoryToRequestResult(AdvisoryFacts(PilotAdvisory.ADVISORY_UNKNOWN))
  }

  def timeTriggered(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_lifecycleIn(), api.get_batteryIn(), api.get_eligibilityIn()) match {
      case (Some(lifecycle), Some(battery), Some(eligibility)) =>
        val advisory: PilotAdvisory.Type =
          if (battery.confidence != BatteryConfidence.Trusted || !lifecycle.contextValid) {
            PilotAdvisory.ADVISORY_UNKNOWN
          } else if (lifecycle.airborneContext &&
                     (battery.band == QualifiedBand.Low || battery.band == QualifiedBand.Critical)) {
            PilotAdvisory.AIRBORNE_ATTENTION
          } else if (battery.band == QualifiedBand.Full || battery.band == QualifiedBand.Nominal) {
            PilotAdvisory.BATTERY_READY
          } else if (eligibility == ChargeEligibility.Permitted) {
            PilotAdvisory.CHARGE_QUALIFIED
          } else {
            PilotAdvisory.CHARGE_BLOCKED
          }
        api.put_advisoryToRequestResult(AdvisoryFacts(advisory))
      case _ =>
    }
  }

  def finalise(api: BatteryAdvisoryDecisionOwner_Operational_Api): Unit = { }
}
