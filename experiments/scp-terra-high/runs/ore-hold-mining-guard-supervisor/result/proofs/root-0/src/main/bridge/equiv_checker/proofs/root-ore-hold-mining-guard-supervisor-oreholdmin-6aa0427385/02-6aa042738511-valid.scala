// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6aa042738511_2_Valid {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      mining_command: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_Candidate_GumboX.compute_CEP_Post(guard_resolution, mining_command))) ___>: (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_GumboX.compute_CEP_Post(guard_resolution, mining_command))) & T))
  }
}
