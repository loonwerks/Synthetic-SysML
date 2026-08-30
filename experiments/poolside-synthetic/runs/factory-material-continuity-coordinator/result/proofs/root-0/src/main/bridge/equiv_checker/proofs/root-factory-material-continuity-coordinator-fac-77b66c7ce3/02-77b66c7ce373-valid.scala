// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_77b66c7ce373_2_Valid {
  @pure def check(
      decision: equiv_shared_0.Factory_Material_Continuity_Coordinator.Decision,
      demand_transition: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandTransition,
      material_coordination_result: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialCoordinationResult,
      recovery_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryState.Type,
      supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_GumboX.compute_CEP_Post(decision, demand_transition, recovery_state, supply_state, material_coordination_result))) & T))
  }
}
