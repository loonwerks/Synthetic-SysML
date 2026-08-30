// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_57382c35531e_3_Valid {
  @pure def check(
      vessel_facts: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_readiness: equiv_shared_0.Docking_Access_Supervisor.VesselFacts,
      vessel_status: equiv_shared_0.Docking_Access_Supervisor.VesselStatus.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
