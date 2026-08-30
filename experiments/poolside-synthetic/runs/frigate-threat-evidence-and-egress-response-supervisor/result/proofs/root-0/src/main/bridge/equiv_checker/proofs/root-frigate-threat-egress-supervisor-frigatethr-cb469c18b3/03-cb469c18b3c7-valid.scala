// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_cb469c18b3c7_3_Valid {
  @pure def check(
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type,
      threatobservation: equiv_shared_0.Frigate_Threat_Egress_Supervisor.ThreatObservation): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
