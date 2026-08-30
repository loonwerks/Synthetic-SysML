// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_68e549e64a7f_2_Valid {
  @pure def check(
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      energy_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, energy_assessment))) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_GumboX.compute_CEP_Post(energy_evidence, energy_assessment))) & T))
  }
}
