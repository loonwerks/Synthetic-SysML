// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner {

  def initialise(api: ChargeEligibilityDecisionOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibilityToAdvisory(ChargeEligibility.Blocked)
    api.put_eligibilityToSession(ChargeEligibility.Blocked)
  }

  def timeTriggered(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_chargerIn(), api.get_interfaceIn(), api.get_lifecycleIn(), api.get_batteryIn()) match {
      case (Some(charger), Some(interface), Some(lifecycle), Some(battery)) =>
        val eligibility: ChargeEligibility.Type =
          if (battery.confidence != BatteryConfidence.Trusted ||
              !charger.chargerUsable || !interface.interfaceHealthy ||
              !lifecycle.chargeContextAllowed) {
            ChargeEligibility.Blocked
          } else if (battery.band == QualifiedBand.Full) {
            ChargeEligibility.NotNeeded
          } else {
            ChargeEligibility.Permitted
          }
        api.put_eligibilityToAdvisory(eligibility)
        api.put_eligibilityToSession(eligibility)
      case _ =>
    }
  }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
