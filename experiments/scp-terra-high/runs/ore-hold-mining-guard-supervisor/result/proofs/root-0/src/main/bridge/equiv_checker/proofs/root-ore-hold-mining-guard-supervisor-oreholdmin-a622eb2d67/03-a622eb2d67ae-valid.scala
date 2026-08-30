// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a622eb2d67ae_3_Valid {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      guard_status: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type,
      offload_readiness: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
