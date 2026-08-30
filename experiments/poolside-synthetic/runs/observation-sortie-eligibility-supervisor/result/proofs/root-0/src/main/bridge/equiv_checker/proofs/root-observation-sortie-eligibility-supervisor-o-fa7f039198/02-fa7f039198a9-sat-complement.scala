// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fa7f039198a9_2_Complement {
  @pure def check(
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      energy_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidenceAssessor_eligibility_supervisor_process_energy_evidence_assessor_GumboX.inititialize_IEP_Post(energy_assessment))) & T)))
  }
}
