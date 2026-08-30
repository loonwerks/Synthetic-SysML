// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier {

  def initialise(api: ThreatEvidenceQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_evidenceAssessment(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE)
  }

  def timeTriggered(api: ThreatEvidenceQualifier_Operational_Api): Unit = {
    api.get_threatObservation() match {
      case Some(o) =>
        api.put_evidenceAssessment(
          if (o.validity == Frigate_Threat_Egress_Supervisor.ObservationValidity.INVALID) Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE
          else if (o.evidenceBand == Frigate_Threat_Egress_Supervisor.EvidenceBand.CLEAR) Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR
          else if (o.evidenceBand == Frigate_Threat_Egress_Supervisor.EvidenceBand.SUSPICIOUS) Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT
          else Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE)
      case _ => api.put_evidenceAssessment(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE)
    }
  }

  def finalise(api: ThreatEvidenceQualifier_Operational_Api): Unit = { }
}
