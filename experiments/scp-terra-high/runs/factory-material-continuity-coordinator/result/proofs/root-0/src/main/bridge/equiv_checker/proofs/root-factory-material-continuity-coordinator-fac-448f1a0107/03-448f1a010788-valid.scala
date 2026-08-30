// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_448f1a010788_3_Valid {
  @pure def check(
      demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      material_readiness_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
