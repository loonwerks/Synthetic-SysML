// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier {

  def initialise(api: EgressReadinessQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE)
  }

  def timeTriggered(api: EgressReadinessQualifier_Operational_Api): Unit = {
    (api.get_evidenceAssessment(), api.get_egressRoute()) match {
      case (Some(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE), Some(Frigate_Threat_Egress_Supervisor.EgressRouteObservation.UNKNOWN)) => api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_UNKNOWN)
      case (Some(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE), Some(Frigate_Threat_Egress_Supervisor.EgressRouteObservation.BLOCKED)) => api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_BLOCKED)
      case (Some(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE), Some(_)) => api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.READY)
      case _ => api.put_egressQualification(Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE)
    }
  }

  def finalise(api: EgressReadinessQualifier_Operational_Api): Unit = { }
}
