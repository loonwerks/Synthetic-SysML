// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_778cc5bdbefe_3_Valid {
  @pure def check(
      event_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.EventBoundaryFacts,
      material_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialEvent.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
