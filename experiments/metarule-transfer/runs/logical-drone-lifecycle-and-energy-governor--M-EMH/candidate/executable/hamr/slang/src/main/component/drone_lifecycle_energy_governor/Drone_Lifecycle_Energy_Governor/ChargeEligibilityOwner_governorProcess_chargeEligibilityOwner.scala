// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner {

  def initialise(api: ChargeEligibilityOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_eligibilityOut(Drone_Lifecycle_Energy_Governor.ChargeEligibility.example())
  }

  def timeTriggered(api: ChargeEligibilityOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee CHARGE_ELIGIBILITY_COMBINATION
        api.eligibilityOut.entryEligible == (api.batteryIn.usable &
          api.batteryIn.band != BatteryBand.FULL &
          api.chargerIn.healthyConnected) &
          api.eligibilityOut.retentionEligible == api.eligibilityOut.entryEligible &
          api.eligibilityOut.exitRequired == !(api.eligibilityOut.retentionEligible)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_batteryIn: Option[Drone_Lifecycle_Energy_Governor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
    val apiUsage_chargerIn: Option[Drone_Lifecycle_Energy_Governor.ChargerFacts] = api.get_chargerIn()
    api.logInfo(s"Received on data port chargerIn: ${apiUsage_chargerIn}")
    val battery = api.get_batteryIn().get
    val charger = api.get_chargerIn().get
    val eligible = battery.usable & battery.band != BatteryBand.FULL &
      charger.healthyConnected
    api.put_eligibilityOut(ChargeEligibility(eligible, eligible, !eligible))
  }

  def finalise(api: ChargeEligibilityOwner_Operational_Api): Unit = { }
}
