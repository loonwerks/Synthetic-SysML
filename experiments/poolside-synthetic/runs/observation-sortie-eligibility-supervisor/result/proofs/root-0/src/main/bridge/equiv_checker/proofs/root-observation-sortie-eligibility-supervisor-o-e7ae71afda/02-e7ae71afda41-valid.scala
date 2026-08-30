// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e7ae71afda41_2_Valid {
  @pure def check(
      obstacle_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      obstacle_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ObstacleEvidenceAssessor_eligibility_supervisor_process_obstacle_evidence_assessor_GumboX.compute_CEP_Post(obstacle_evidence, obstacle_assessment))) & T))
  }
}
