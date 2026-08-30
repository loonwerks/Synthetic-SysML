// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3c69831e8c47_4_Valid {
  @pure def check(
      navigation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationAssessment,
      navigation_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_GumboX.inititialize_IEP_Post(navigation_assessment))) ___>: (T)) & T))
  }
}
