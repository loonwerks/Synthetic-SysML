// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0a5f26a2a4de_1_Valid {
  @pure def check(
      defensequalification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.Type,
      defensesupport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseSupportObservation,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
