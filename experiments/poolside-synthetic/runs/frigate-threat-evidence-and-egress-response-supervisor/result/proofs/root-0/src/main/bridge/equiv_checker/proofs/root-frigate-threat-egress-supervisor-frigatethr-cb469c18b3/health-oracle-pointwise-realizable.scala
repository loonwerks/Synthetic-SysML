// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_cb469c18b3c7_Oracle_Pointwise_Realizable {
  @pure def check(
      threatobservation: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_GumboX.inititialize_IEP_Post(threatobservation, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.UNAVAILABLE)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_GumboX.inititialize_IEP_Post(threatobservation, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.CLEAR)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_GumboX.inititialize_IEP_Post(threatobservation, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.SUSPECT)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_GumboX.inititialize_IEP_Post(threatobservation, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.HOSTILE)))))
  }
}
