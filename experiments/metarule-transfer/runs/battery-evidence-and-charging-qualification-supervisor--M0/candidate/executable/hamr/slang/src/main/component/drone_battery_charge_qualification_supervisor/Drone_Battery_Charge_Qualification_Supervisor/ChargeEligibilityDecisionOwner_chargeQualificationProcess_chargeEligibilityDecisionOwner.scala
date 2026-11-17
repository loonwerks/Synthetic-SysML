// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner {

  def initialise(api: ChargeEligibilityDecisionOwner_Initialization_Api): Unit = {
  }

  def timeTriggered(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ELIGIBILITY_PUBLICATIONS_AGREE
        api.eligibilityToAdvisory == api.eligibilityToSession,
        // case ELIGIBILITY_BLOCKED
        (api.batteryIn.confidence != BatteryConfidence.Trusted |
          !(api.chargerIn.chargerUsable) |
          !(api.interfaceIn.interfaceHealthy) |
          !(api.lifecycleIn.chargeContextAllowed)) ___>: (api.eligibilityToAdvisory == ChargeEligibility.Blocked),
        // case ELIGIBILITY_NOT_NEEDED
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.chargerIn.chargerUsable &
          api.interfaceIn.interfaceHealthy &
          api.lifecycleIn.chargeContextAllowed &
          api.batteryIn.band == QualifiedBand.Full) ___>: (api.eligibilityToAdvisory == ChargeEligibility.NotNeeded),
        // case ELIGIBILITY_PERMITTED
        (api.batteryIn.confidence == BatteryConfidence.Trusted &
          api.chargerIn.chargerUsable &
          api.interfaceIn.interfaceHealthy &
          api.lifecycleIn.chargeContextAllowed &
          api.batteryIn.band != QualifiedBand.Full) ___>: (api.eligibilityToAdvisory == ChargeEligibility.Permitted)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val charger = api.get_chargerIn().get
    val interface = api.get_interfaceIn().get
    val lifecycle = api.get_lifecycleIn().get
    val battery = api.get_batteryIn().get
    val eligibility: ChargeEligibility.Type =
      if (battery.confidence != BatteryConfidence.Trusted | !charger.chargerUsable |
        !interface.interfaceHealthy | !lifecycle.chargeContextAllowed) ChargeEligibility.Blocked
      else if (battery.band == QualifiedBand.Full) ChargeEligibility.NotNeeded
      else ChargeEligibility.Permitted
    api.put_eligibilityToAdvisory(eligibility)
    api.put_eligibilityToSession(eligibility)
  }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
