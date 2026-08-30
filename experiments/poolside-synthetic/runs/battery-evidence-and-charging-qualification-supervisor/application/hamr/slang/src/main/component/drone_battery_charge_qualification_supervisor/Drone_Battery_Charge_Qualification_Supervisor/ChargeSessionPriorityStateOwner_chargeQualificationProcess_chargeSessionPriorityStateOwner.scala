// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object ChargeSessionPriorityStateOwner_chargeQualificationProcess_chargeSessionPriorityStateOwner {

  def initialise(api: ChargeSessionPriorityStateOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_conflictToAggregation(Base_Types.Boolean_example())
    api.put_resolutionToNotification(Drone_Battery_Charge_Qualification_Supervisor.SessionResolution.example())
  }

  def timeTriggered(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_interfaceIn: Option[Drone_Battery_Charge_Qualification_Supervisor.InterfaceFacts] = api.get_interfaceIn()
    api.logInfo(s"Received on data port interfaceIn: ${apiUsage_interfaceIn}")
    val apiUsage_eligibilityIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ChargeEligibility.Type] = api.get_eligibilityIn()
    api.logInfo(s"Received on data port eligibilityIn: ${apiUsage_eligibilityIn}")
  }

  def finalise(api: ChargeSessionPriorityStateOwner_Operational_Api): Unit = { }
}
