// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6b2c9afa3d4d_4_Valid {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      mining_command: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommandDerivationOwner_mining_guard_process_mining_command_derivation_owner_GumboX.inititialize_IEP_Post(mining_command))) ___>: (T)) & T))
  }
}
