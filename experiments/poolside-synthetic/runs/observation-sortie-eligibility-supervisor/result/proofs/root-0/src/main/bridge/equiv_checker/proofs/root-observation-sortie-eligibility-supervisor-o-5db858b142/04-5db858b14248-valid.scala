// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5db858b14248_4_Valid {
  @pure def check(
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      observation_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_GumboX.compute_CEP_Post(observation_evidence, observation_assessment))) ___>: (T)) & T))
  }
}
