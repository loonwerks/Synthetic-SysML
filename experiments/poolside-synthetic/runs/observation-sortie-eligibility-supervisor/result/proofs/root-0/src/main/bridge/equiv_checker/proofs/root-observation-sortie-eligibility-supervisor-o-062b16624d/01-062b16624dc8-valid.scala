// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_062b16624dc8_1_Valid {
  @pure def check(
      observation_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      observation_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
