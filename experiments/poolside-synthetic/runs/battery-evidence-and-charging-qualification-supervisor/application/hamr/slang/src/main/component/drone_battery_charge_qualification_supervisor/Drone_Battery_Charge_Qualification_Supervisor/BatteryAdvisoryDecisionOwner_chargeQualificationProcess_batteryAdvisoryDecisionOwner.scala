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
