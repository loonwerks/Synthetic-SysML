// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_062b16624dc8_2_Complement {
  @pure def check(
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      observation_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.ObservationEvidenceAssessor_eligibility_supervisor_process_observation_evidence_assessor_GumboX.inititialize_IEP_Post(observation_assessment))) & T)))
  }
}
