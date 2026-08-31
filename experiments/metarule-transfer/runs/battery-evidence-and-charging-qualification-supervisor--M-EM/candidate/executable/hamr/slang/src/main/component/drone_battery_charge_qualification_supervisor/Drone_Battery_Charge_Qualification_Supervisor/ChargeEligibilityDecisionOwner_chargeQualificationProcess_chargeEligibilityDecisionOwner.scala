// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner {

  def initialise(api: ChargeEligibilityDecisionOwner_Initialization_Api): Unit = {
    api.put_eligibilityToAdvisory(ChargeEligibility.Blocked); api.put_eligibilityToSession(ChargeEligibility.Blocked)
  }

  def timeTriggered(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee ELIGIBILITY_PUBLICATIONS_AGREE
        api.eligibilityToAdvisory == api.eligibilityToSession,
        // case ELIGIBILITY_BLOCKED
        (api.batteryIn.confidence != BatteryConfidence.Trusted |
          api.chargerIn.chargerUsable == F |
          api.interfaceIn.interfaceHealthy == F |
          api.lifecycleIn.chargeContextAllowed == F) ___>: (api.eligibilityToAdvisory == ChargeEligibility.Blocked),
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
    (api.get_batteryIn(), api.get_chargerIn(), api.get_interfaceIn(), api.get_lifecycleIn()) match {
      case (Some(b), Some(c), Some(i), Some(l)) =>
        val e: ChargeEligibility.Type = if (b.confidence != BatteryConfidence.Trusted | !c.chargerUsable | !i.interfaceHealthy | !l.chargeContextAllowed) ChargeEligibility.Blocked
          else if (b.band == QualifiedBand.Full) ChargeEligibility.NotNeeded else ChargeEligibility.Permitted
        api.put_eligibilityToAdvisory(e); api.put_eligibilityToSession(e)
      case _ => api.put_eligibilityToAdvisory(ChargeEligibility.Blocked); api.put_eligibilityToSession(ChargeEligibility.Blocked)
    }
  }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
