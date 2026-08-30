// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_38494bcb7154_4_Valid {
  @pure def check(
      energyevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type,
      energyverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_GumboX.inititialize_IEP_Post(energyverdictout))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Candidate_GumboX.inititialize_IEP_Post(energyverdictout))) & T))
  }
}
