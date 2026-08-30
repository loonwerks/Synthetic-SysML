// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b11bdb21f901_4_Valid {
  @pure def check(
      energyevidence: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyEvidence.Type,
      energyverdictout: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      evaluationticket: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EvaluationTicket.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_GumboX.compute_CEP_Post(energyevidence, evaluationticket, energyverdictout))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EnergyAssessor_eligibilitySupervisionProcess_energyAssessor_Candidate_GumboX.compute_CEP_Post(energyevidence, evaluationticket, energyverdictout))) & T))
  }
}
