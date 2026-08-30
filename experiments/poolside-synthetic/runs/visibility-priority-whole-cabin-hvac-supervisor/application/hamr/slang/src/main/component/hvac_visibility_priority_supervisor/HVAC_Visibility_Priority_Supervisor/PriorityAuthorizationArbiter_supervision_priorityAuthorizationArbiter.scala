// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityAuthorizationArbiter_supervision_priorityAuthorizationArbiter {

  def initialise(api: PriorityAuthorizationArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_selectedIntent(HVAC_Visibility_Priority_Supervisor.SelectedIntent.example())
    api.put_arbitrationStatus(HVAC_Visibility_Priority_Supervisor.ArbitrationStatus.example())
  }

  def timeTriggered(api: PriorityAuthorizationArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_qualifiedRequest: Option[HVAC_Visibility_Priority_Supervisor.QualifiedRequest] = api.get_qualifiedRequest()
    api.logInfo(s"Received on data port qualifiedRequest: ${apiUsage_qualifiedRequest}")
    val apiUsage_recoveryReport: Option[HVAC_Visibility_Priority_Supervisor.RecoveryReport] = api.get_recoveryReport()
    api.logInfo(s"Received on data port recoveryReport: ${apiUsage_recoveryReport}")
    val apiUsage_thermalProposal: Option[HVAC_Visibility_Priority_Supervisor.ThermalProposal] = api.get_thermalProposal()
    api.logInfo(s"Received on data port thermalProposal: ${apiUsage_thermalProposal}")
    val apiUsage_visibilityProposal: Option[HVAC_Visibility_Priority_Supervisor.VisibilityProposal] = api.get_visibilityProposal()
    api.logInfo(s"Received on data port visibilityProposal: ${apiUsage_visibilityProposal}")
    val apiUsage_cabinAirProposal: Option[HVAC_Visibility_Priority_Supervisor.CabinAirProposal] = api.get_cabinAirProposal()
    api.logInfo(s"Received on data port cabinAirProposal: ${apiUsage_cabinAirProposal}")
  }

  def finalise(api: PriorityAuthorizationArbiter_Operational_Api): Unit = { }
}
