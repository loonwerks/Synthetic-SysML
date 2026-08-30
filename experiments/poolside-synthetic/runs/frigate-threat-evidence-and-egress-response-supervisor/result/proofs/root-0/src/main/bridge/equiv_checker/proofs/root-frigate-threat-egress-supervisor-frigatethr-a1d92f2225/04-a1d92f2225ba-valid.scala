// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a1d92f2225ba_4_Valid {
  @pure def check(
      egressqualification: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressQualification.Type,
      egressroute: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressRouteObservation.Type,
      evidenceassessment: equiv_shared_0.Frigate_Threat_Egress_Supervisor.EvidenceAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Frigate_Threat_Egress_Supervisor.EgressReadinessQualifier_threatResponseProcess_egressReadinessQualifier_GumboX.compute_CEP_Post(egressroute, evidenceassessment, egressqualification))) ___>: (T)) & T))
  }
}
