// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_36fb3cae4b94_1_Valid {
  @pure def check(
      eligibilitydecision: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.EligibilityDecision.Type,
      energyverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedEnergyVerdict,
      requestcontext: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.RequestContext.Type,
      supportverdictin: equiv_shared_0.Forest_Observation_Eligibility_Supervisor.TaggedSupportVerdict): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
