// #Sireum

package drone_battery_charge_qualification_supervisor.Drone_Battery_Charge_Qualification_Supervisor

import org.sireum._
import drone_battery_charge_qualification_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object NotificationCompositionOwner_chargeQualificationProcess_notificationCompositionOwner {

  def initialise(api: NotificationCompositionOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_pilotNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.PilotNotice.EvidenceUntrusted)
    api.put_flightControlNoticeOut(Drone_Battery_Charge_Qualification_Supervisor.FlightControlNotice.EvidenceUntrusted)
  }

  def timeTriggered(api: NotificationCompositionOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_attentionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.AttentionResolution] = api.get_attentionIn()
    api.logInfo(s"Received on data port attentionIn: ${apiUsage_attentionIn}")
    val apiUsage_faultsIn: Option[Drone_Battery_Charge_Qualification_Supervisor.FaultFacts] = api.get_faultsIn()
    api.logInfo(s"Received on data port faultsIn: ${apiUsage_faultsIn}")
    val apiUsage_sessionIn: Option[Drone_Battery_Charge_Qualification_Supervisor.SessionResolution] = api.get_sessionIn()
    api.logInfo(s"Received on data port sessionIn: ${apiUsage_sessionIn}")
  }

  def finalise(api: NotificationCompositionOwner_Operational_Api): Unit = { }
}
