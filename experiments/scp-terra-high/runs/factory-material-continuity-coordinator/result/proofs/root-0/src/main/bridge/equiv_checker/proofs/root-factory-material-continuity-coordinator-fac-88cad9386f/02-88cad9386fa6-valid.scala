// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_88cad9386fa6_2_Valid {
  @pure def check(
      inventory_boundary_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.InventoryBoundaryFacts,
      production_availability: equiv_shared_0.Factory_Material_Continuity_Coordinator.Availability.Type,
      readiness_to_replenishment: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      readiness_to_routine: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      readiness_to_urgent: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessAssessment_material_continuity_process_material_readiness_assessment_GumboX.compute_CEP_Post(inventory_boundary_facts, production_availability, readiness_to_replenishment, readiness_to_routine, readiness_to_urgent))) & T))
  }
}
