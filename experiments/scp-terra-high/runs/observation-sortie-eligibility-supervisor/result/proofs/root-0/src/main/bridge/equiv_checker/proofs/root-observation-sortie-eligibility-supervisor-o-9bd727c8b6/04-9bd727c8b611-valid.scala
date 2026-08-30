// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9bd727c8b611_4_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      communication_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.CommunicationEvidenceAssessor_eligibility_supervisor_process_communication_evidence_assessor_GumboX.inititialize_IEP_Post(communication_assessment))) ___>: (T)) & T))
  }
}
