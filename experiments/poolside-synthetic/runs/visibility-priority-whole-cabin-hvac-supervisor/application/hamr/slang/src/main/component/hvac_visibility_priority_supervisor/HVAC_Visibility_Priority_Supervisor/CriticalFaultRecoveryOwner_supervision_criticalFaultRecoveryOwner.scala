// #Sireum

package hvac_visibility_priority_supervisor.HVAC_Visibility_Priority_Supervisor

import org.sireum._
import hvac_visibility_priority_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object CriticalFaultRecoveryOwner_supervision_criticalFaultRecoveryOwner {

  def initialise(api: CriticalFaultRecoveryOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_recoveryReport(HVAC_Visibility_Priority_Supervisor.RecoveryReport.example())
  }

  def timeTriggered(api: CriticalFaultRecoveryOwner_Operational_Api): Unit = {
    // example api usage

    val apiUsage_recoveryAcknowledgment: Option[HVAC_Visibility_Priority_Supervisor.RecoveryAcknowledgment.Type] = api.get_recoveryAcknowledgment()
    api.logInfo(s"Received on data port recoveryAcknowledgment: ${apiUsage_recoveryAcknowledgment}")
    val apiUsage_criticalElectrical: Option[HVAC_Visibility_Priority_Supervisor.ElectricalCriticality.Type] = api.get_criticalElectrical()
    api.logInfo(s"Received on data port criticalElectrical: ${apiUsage_criticalElectrical}")
    val apiUsage_criticalEquipment: Option[HVAC_Visibility_Priority_Supervisor.EquipmentCriticality.Type] = api.get_criticalEquipment()
    api.logInfo(s"Received on data port criticalEquipment: ${apiUsage_criticalEquipment}")
    val apiUsage_visibilityFault: Option[HVAC_Visibility_Priority_Supervisor.VisibilityCriticality.Type] = api.get_visibilityFault()
    api.logInfo(s"Received on data port visibilityFault: ${apiUsage_visibilityFault}")
  }

  def finalise(api: CriticalFaultRecoveryOwner_Operational_Api): Unit = { }
}
