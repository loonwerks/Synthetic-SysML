// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_960b7f3c7a53_2_Complement {
  @pure def check(
      current_state_to_composition: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      current_state_to_replenishment: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      prior_supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      qualified_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      supplyphasememory: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyLifecycle_material_continuity_process_supply_lifecycle_GumboX.inititialize_IEP_Post(supplyphasememory, current_state_to_composition, current_state_to_replenishment, prior_supply_state))) & T)))
  }
}
