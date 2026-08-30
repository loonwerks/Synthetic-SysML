// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_960b7f3c7a53_1_Valid {
  @pure def check(
      current_state_to_composition: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      current_state_to_replenishment: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      prior_supply_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type,
      qualified_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      supplyphasememory: equiv_shared_0.Factory_Material_Continuity_Coordinator.SupplyState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
