// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityDecisionOwner_chargeQualificationProcess_chargeEligibilityDecisionOwner {

  def initialise(api: ChargeEligibilityDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

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
        val apiUsage_chargerIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts] = api.get_chargerIn()
    api.logInfo(s"Received on data port chargerIn: ${apiUsage_chargerIn}")
    val apiUsage_interfaceIn: Option[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] = api.get_interfaceIn()
    api.logInfo(s"Received on data port interfaceIn: ${apiUsage_interfaceIn}")
    val apiUsage_lifecycleIn: Option[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts] = api.get_lifecycleIn()
    api.logInfo(s"Received on data port lifecycleIn: ${apiUsage_lifecycleIn}")
    val apiUsage_batteryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val eligibility: ChargeEligibility.Type =
      if (apiUsage_batteryIn.get.confidence != BatteryConfidence.Trusted |
          !apiUsage_chargerIn.get.chargerUsable |
          !apiUsage_interfaceIn.get.interfaceHealthy |
          !apiUsage_lifecycleIn.get.chargeContextAllowed) ChargeEligibility.Blocked
      else if (apiUsage_batteryIn.get.band == QualifiedBand.Full) ChargeEligibility.NotNeeded
      else ChargeEligibility.Permitted
    api.put_eligibilityToAdvisory(eligibility)
    api.put_eligibilityToSession(eligibility)
  }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
