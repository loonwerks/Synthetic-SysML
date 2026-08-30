// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_68e549e64a7f_Candidate_Pointwise_Realizable {
  @pure def check(
      energy_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = F, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.None))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = F, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = F, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Stale))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = F, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = F, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Limited))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = T, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.None))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = T, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Invalid))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = T, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Stale))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = T, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.UnavailableOrUnknown))) |
        (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_Candidate_GumboX.compute_CEP_Post(energy_evidence, equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment(ready = T, localCause = equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyCause.Limited))))))
  }
}
