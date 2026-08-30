// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_38494bcb7154_1_Valid {
  @pure def check(
      energyevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type,
      energyverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
