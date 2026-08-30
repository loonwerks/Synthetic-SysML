// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_d4064329bd8b_Oracle_Pointwise_Realizable {
  @pure def check(
      defensesupport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseSupportObservation,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.compute_CEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.compute_CEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.compute_CEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.compute_CEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.READY)))))
  }
}
