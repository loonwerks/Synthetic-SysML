// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c5100122a2c7_3_Valid {
  @pure def check(
      propulsion_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionAssessment,
      propulsion_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.PropulsionEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
