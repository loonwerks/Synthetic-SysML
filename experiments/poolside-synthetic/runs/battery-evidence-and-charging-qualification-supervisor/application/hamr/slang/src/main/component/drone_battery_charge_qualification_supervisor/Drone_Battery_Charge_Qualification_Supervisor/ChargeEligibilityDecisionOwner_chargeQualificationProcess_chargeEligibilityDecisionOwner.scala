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

    api.put_eligibilityToAdvisory(Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Blocked)
    api.put_eligibilityToSession(Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Blocked)
  }

  def timeTriggered(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_chargerIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargerFacts] = api.get_chargerIn()
    api.logInfo(s"Received on data port chargerIn: ${apiUsage_chargerIn}")
    val apiUsage_interfaceIn: Option[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] = api.get_interfaceIn()
    api.logInfo(s"Received on data port interfaceIn: ${apiUsage_interfaceIn}")
    val apiUsage_lifecycleIn: Option[Drone_Battery_Charge_Qualification_Supervisor.LifecycleFacts] = api.get_lifecycleIn()
    api.logInfo(s"Received on data port lifecycleIn: ${apiUsage_lifecycleIn}")
    val apiUsage_batteryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
  }

  def finalise(api: ChargeEligibilityDecisionOwner_Operational_Api): Unit = { }
}
