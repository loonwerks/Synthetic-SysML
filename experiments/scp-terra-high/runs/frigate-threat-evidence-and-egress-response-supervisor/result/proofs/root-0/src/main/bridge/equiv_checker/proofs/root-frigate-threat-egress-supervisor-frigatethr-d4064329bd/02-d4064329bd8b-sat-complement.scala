// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d4064329bd8b_2_Complement {
  @pure def check(
      defensequalification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.Type,
      defensesupport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseSupportObservation,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.compute_CEP_Post(defensesupport, evidenceassessment, defensequalification))) & T)))
  }
}
