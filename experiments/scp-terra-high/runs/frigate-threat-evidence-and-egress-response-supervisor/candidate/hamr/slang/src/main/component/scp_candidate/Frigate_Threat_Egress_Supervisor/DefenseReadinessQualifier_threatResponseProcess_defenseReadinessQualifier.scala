// #Sireum

package scp_candidate.Frigate_Threat_Egress_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier {

  def initialise(api: DefenseReadinessQualifier_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_defenseQualification(Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE)
  }

  def timeTriggered(api: DefenseReadinessQualifier_Operational_Api): Unit = {
    (api.get_evidenceAssessment(), api.get_defenseSupport()) match {
      case (Some(Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE), Some(s)) =>
        api.put_defenseQualification(if (s.defenseAvailability == Frigate_Threat_Egress_Supervisor.DefenseAvailability.UNAVAILABLE) Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY else if (s.capacitorSupport == Frigate_Threat_Egress_Supervisor.CapacitorSupport.INSUFFICIENT) Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR else Frigate_Threat_Egress_Supervisor.DefenseQualification.READY)
      case _ => api.put_defenseQualification(Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE)
    }
  }

  def finalise(api: DefenseReadinessQualifier_Operational_Api): Unit = { }
}
