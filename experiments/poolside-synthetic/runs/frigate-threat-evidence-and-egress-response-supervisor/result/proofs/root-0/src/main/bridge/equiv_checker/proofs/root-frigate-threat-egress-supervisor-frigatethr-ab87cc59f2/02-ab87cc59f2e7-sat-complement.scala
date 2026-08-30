// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ab87cc59f2e7_2_Complement {
  @pure def check(
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type,
      threatobservation: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatObservation): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatEvidenceQualifier_threatResponseProcess_threatEvidenceQualifier_GumboX.compute_CEP_Post(threatobservation, evidenceassessment))) & T)))
  }
}
