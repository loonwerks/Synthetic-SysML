// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_0a5f26a2a4de_Oracle_Pointwise_Realizable {
  @pure def check(
      defensesupport: equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseSupportObservation,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.inititialize_IEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.INAPPLICABLE)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.inititialize_IEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_AVAILABILITY)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.inititialize_IEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.BLOCKED_CAPACITOR)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseReadinessQualifier_threatResponseProcess_defenseReadinessQualifier_GumboX.inititialize_IEP_Post(defensesupport, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.DefenseQualification.READY)))))
  }
}
