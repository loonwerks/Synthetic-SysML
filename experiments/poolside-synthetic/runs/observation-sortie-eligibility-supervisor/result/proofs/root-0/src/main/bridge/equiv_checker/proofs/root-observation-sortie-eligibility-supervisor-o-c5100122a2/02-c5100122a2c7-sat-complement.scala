// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c5100122a2c7_2_Complement {
  @pure def check(
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment,
      propulsion_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionEvidenceAssessor_eligibility_supervisor_process_propulsion_evidence_assessor_GumboX.compute_CEP_Post(propulsion_evidence, propulsion_assessment))) & T)))
  }
}
