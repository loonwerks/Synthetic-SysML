// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object BatteryConfidenceStateOwner_chargeQualificationProcess_batteryConfidenceStateOwner {

  def initialise(api: BatteryConfidenceStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_stateToEligibility(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_stateToAttention(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_stateToAdvisory(Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts.example())
    api.put_faultToAggregation(Base_Types.Boolean_example())
  }

  def timeTriggered(api: BatteryConfidenceStateOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualificationIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryQualification] = api.get_qualificationIn()
    api.logInfo(s"Received on data port qualificationIn: ${apiUsage_qualificationIn}")
  }

  def finalise(api: BatteryConfidenceStateOwner_Operational_Api): Unit = { }
}
