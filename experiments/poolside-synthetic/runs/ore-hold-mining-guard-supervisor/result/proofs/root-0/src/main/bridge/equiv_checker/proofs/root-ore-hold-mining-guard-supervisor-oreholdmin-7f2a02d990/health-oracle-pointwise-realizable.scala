// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7f2a02d99075_Oracle_Pointwise_Realizable {
  @pure def check(
      hold_sample: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldSample): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_GumboX.compute_CEP_Post(hold_sample, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.SpaceAvailable)) |
        (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_GumboX.compute_CEP_Post(hold_sample, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.GuardReached)) |
        (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldGuardQualificationOwner_mining_guard_process_hold_guard_qualification_owner_GumboX.compute_CEP_Post(hold_sample, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.HoldAssessment.InvalidHold)))))
  }
}
