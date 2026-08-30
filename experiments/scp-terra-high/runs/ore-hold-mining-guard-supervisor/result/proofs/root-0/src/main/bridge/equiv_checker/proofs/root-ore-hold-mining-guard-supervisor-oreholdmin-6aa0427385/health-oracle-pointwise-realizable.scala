// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_6aa042738511_Oracle_Pointwise_Realizable {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_GumboX.compute_CEP_Post(guard_resolution, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.StopMining)) |
        (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_GumboX.compute_CEP_Post(guard_resolution, equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.ContinueMining)))))
  }
}
