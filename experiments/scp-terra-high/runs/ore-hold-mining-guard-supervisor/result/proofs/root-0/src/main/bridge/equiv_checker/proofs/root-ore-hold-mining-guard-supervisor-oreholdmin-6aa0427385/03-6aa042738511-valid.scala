// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6aa042738511_3_Valid {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      mining_command: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.MiningCommand.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
