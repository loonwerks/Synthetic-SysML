// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CurrentRequestResultDecisionOwner_chargeQualificationProcess_currentRequestResultDecisionOwner {

  def initialise(api: CurrentRequestResultDecisionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_publicFactsOut(Drone_Battery_Charge_Qualification_Supervisor.PublicDecisionFacts.example())
  }

  def timeTriggered(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_requestIn: Option[Drone_Battery_Charge_Qualification_Supervisor.ServiceRequest.Type] = api.get_requestIn()
    api.logInfo(s"Received on data port requestIn: ${apiUsage_requestIn}")
    val apiUsage_attentionClearedIn: Option[Base_Types.Boolean] = api.get_attentionClearedIn()
    api.logInfo(s"Received on data port attentionClearedIn: ${apiUsage_attentionClearedIn}")
    val apiUsage_advisoryIn: Option[Drone_Battery_Charge_Qualification_Supervisor.AdvisoryFacts] = api.get_advisoryIn()
    api.logInfo(s"Received on data port advisoryIn: ${apiUsage_advisoryIn}")
    val apiUsage_sessionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution] = api.get_sessionIn()
    api.logInfo(s"Received on data port sessionIn: ${apiUsage_sessionIn}")
  }

  def finalise(api: CurrentRequestResultDecisionOwner_Operational_Api): Unit = { }
}
