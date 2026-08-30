// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_36fb3cae4b94_Candidate_Pointwise_Realizable {
  @pure def check(
      energyverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      requestcontext: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      supportverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.NoDecision)) |
        (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Permit)) |
        (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenyPower)) |
        (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.DenySupport)) |
        (equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityArbiter_eligibilitySupervisionProcess_eligibilityArbiter_Candidate_GumboX.compute_CEP_Post(energyverdictin, requestcontext, supportverdictin, equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Withdraw)))))
  }
}
