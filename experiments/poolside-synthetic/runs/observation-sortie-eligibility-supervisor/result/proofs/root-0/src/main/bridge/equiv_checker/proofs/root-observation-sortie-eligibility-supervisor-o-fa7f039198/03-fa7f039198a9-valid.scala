// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fa7f039198a9_3_Valid {
  @pure def check(
      energy_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyAssessment,
      energy_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EnergyEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
