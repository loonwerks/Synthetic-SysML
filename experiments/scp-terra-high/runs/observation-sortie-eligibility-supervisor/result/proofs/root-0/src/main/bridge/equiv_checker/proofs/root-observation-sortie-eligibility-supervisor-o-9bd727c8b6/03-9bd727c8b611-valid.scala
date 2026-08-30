// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9bd727c8b611_3_Valid {
  @pure def check(
      communication_assessment: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.SingleEquipmentAssessment,
      communication_evidence: equiv_shared_0.Observation_Sortie_Eligibility_Supervisor.EquipmentEvidence): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
