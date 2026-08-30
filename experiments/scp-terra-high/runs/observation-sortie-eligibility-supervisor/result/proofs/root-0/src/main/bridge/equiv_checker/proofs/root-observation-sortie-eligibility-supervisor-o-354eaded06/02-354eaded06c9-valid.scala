// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_354eaded06c9_2_Valid {
  @pure def check(
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment,
      propulsion_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_GumboX.inititialize_IEP_Post(propulsion_assessment))) & T))
  }
}
