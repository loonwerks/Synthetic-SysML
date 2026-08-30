// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_6e259d2e663f_2_Complement {
  @pure def check(
      decision: equiv_shared_0.Factory_Material_Continuity_Coordinator.Decision,
      demand_transition: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandTransition,
      material_coordination_result: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialCoordinationResult,
      recovery_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryState.Type,
      supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.ResultComposition_material_continuity_process_result_composition_GumboX.inititialize_IEP_Post(material_coordination_result))) & T)))
  }
}
