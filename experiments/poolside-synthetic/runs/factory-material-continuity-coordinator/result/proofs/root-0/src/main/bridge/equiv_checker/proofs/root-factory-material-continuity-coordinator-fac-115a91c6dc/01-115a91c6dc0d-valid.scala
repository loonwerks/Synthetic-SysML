// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_115a91c6dc0d_1_Valid {
  @pure def check(
      demand_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandBoundaryFacts,
      demand_signal: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandSignal.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
