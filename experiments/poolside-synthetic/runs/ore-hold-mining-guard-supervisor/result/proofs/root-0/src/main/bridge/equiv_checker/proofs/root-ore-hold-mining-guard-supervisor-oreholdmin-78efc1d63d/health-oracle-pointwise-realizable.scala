// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_78efc1d63d14_Oracle_Pointwise_Realizable {
  @pure def check(
      mining_support: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_GumboX.compute_CEP_Post(mining_support, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.SupportReady)) |
        (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_GumboX.compute_CEP_Post(mining_support, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.SupportBlocked)) |
        (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningSupportQualificationOwner_mining_guard_process_mining_support_qualification_owner_GumboX.compute_CEP_Post(mining_support, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.SupportAssessment.InvalidSupport)))))
  }
}
