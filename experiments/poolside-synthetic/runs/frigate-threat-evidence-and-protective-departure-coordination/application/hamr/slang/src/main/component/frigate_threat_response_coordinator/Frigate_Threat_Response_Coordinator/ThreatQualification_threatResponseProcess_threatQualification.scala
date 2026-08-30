// #Sireum

package frigate_threat_response_coordinator.Frigate_Threat_Response_Coordinator

import org.sireum._
import frigate_threat_response_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatQualification_threatResponseProcess_threatQualification {

  def initialise(api: ThreatQualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualifiedThreatToAlertOut(Frigate_Threat_Response_Coordinator.QualifiedThreat.example())
    api.put_threatValidityToDefenseOut(Frigate_Threat_Response_Coordinator.ThreatValidity.USABLE)
    api.put_threatValidityToEscapeOut(Frigate_Threat_Response_Coordinator.ThreatValidity.USABLE)
  }

  def timeTriggered(api: ThreatQualification_Operational_Api): Unit = {
    // example api usage

    val apiUsage_threatEvidenceIn: Option[Frigate_Threat_Response_Coordinator.ThreatEvidence] = api.get_threatEvidenceIn()
    api.logInfo(s"Received on data port threatEvidenceIn: ${apiUsage_threatEvidenceIn}")
  }

  def finalise(api: ThreatQualification_Operational_Api): Unit = { }
}
