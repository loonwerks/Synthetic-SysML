// #Sireum

package drone_lifecycle_energy_governor.Drone_Lifecycle_Energy_Governor

import org.sireum._
import drone_lifecycle_energy_governor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner {

  def initialise(api: ChargeEligibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibilityOut(ChargeEligibility(F, F, T))
  }

  def timeTriggered(api: ChargeEligibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    (api.get_batteryIn(), api.get_chargerIn()) match {
      case (Some(battery), Some(charger)) =>
        val eligible = battery.usable & battery.band != BatteryBand.FULL & charger.healthyConnected
        api.put_eligibilityOut(ChargeEligibility(eligible, eligible, !eligible))
      case _ => api.put_eligibilityOut(ChargeEligibility(F, F, T))
    }
  }

  def finalise(api: ChargeEligibilityOwner_Operational_Api): Unit = { }
}
