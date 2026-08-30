// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_420989bde169_2_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      communication_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_GumboX.compute_CEP_Post(communication_evidence, communication_assessment))) & T))
  }
}
