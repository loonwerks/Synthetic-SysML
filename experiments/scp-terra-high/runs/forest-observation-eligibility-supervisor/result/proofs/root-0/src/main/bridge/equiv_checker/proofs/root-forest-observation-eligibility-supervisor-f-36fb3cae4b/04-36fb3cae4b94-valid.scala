// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_36fb3cae4b94_4_Valid {
  @pure def check(
      eligibilitydecision: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type,
      energyverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      requestcontext: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      supportverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, eligibilitydecision))) ___>: (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, eligibilitydecision))) & T))
  }
}
