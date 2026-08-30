// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_a1d92f2225ba_Oracle_Pointwise_Realizable {
  @pure def check(
      egressroute: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_GumboX.compute_CEP_Post(egressroute, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.INAPPLICABLE)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_GumboX.compute_CEP_Post(egressroute, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_UNKNOWN)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_GumboX.compute_CEP_Post(egressroute, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.ROUTE_BLOCKED)) |
        (equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_GumboX.compute_CEP_Post(egressroute, evidenceassessment, equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.READY)))))
  }
}
