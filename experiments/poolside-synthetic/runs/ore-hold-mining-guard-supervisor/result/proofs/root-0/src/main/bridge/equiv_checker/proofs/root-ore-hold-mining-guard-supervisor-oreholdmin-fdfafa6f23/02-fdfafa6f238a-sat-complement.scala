// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fdfafa6f238a_2_Complement {
  @pure def check(
      guard_resolution: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardResolution,
      guard_status: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardStatus.Type,
      offload_readiness: equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.OffloadReadiness.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Ore_Hold_Mining_Guard_Supervisor.GuardReportingDerivationOwner_mining_guard_process_guard_reporting_derivation_owner_GumboX.inititialize_IEP_Post(guard_status, offload_readiness))) & T)))
  }
}
