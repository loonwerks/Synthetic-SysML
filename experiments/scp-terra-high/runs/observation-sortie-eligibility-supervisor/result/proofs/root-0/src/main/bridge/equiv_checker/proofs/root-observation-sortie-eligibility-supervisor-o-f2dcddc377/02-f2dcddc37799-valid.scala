// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f2dcddc37799_2_Valid {
  @pure def check(
      navigation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationAssessment,
      navigation_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceRecord): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.NavigationEvidenceAssessor_eligibility_supervisor_process_navigation_evidence_assessor_GumboX.compute_CEP_Post(navigation_evidence, navigation_assessment))) & T))
  }
}
