// #Sireum

package scp_candidate.Drone_Lifecycle_Energy_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeEligibilityOwner_governorProcess_chargeEligibilityOwner {

  def initialise(api: ChargeEligibilityOwner_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_eligibilityOut(Drone_Lifecycle_Energy_Governor.ChargeEligibility(F, F, T))
  }

  def timeTriggered(api: ChargeEligibilityOwner_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.get_batteryIn() match {
      case Some(battery) => api.get_chargerIn() match {
        case Some(charger) =>
          val eligible: B = battery.usable &&
            battery.band != Drone_Lifecycle_Energy_Governor.BatteryBand.FULL &&
            charger.healthyConnected
          api.put_eligibilityOut(Drone_Lifecycle_Energy_Governor.ChargeEligibility(
            eligible, eligible, !eligible))
      }
    }
  }

  def finalise(api: ChargeEligibilityOwner_Operational_Api): Unit = { }
}
