// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object AttentionLatchStateOwner_chargeQualificationProcess_attentionLatchStateOwner {

  def initialise(api: AttentionLatchStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_resolutionToNotification(Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution.example())
    api.put_clearedToRequestResult(Base_Types.Boolean_example())
  }

  def timeTriggered(api: AttentionLatchStateOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_batteryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.BatteryStateFacts] = api.get_batteryIn()
    api.logInfo(s"Received on data port batteryIn: ${apiUsage_batteryIn}")
  }

  def finalise(api: AttentionLatchStateOwner_Operational_Api): Unit = { }
}
