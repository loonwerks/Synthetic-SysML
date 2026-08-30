// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_08d11386b32f_3_Valid {
  @pure def check(
      inventory_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts,
      production_availability: equiv_shared_0.Factory_Material_Continuity_Coordinator.Availability.Type,
      readiness_to_replenishment: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      readiness_to_routine: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      readiness_to_urgent: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
