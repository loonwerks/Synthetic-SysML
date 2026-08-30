// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e3a39783a16b_1_Valid {
  @pure def check(
      current_state_to_routine: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      current_state_to_urgent: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      demand_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandFacts,
      demand_transition: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandTransition,
      prior_demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandState.Type,
      qualified_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.QualifiedEvent.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      in_demandphasememory: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandState.Type,
      demandphasememory: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
