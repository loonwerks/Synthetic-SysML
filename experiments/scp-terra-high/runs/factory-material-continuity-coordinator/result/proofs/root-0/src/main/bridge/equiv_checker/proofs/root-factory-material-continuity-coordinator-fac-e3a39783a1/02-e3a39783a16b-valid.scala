// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e3a39783a16b_2_Valid {
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
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandRegistry_material_continuity_process_demand_registry_GumboX.compute_CEP_Post(in_demandphasememory, demandphasememory, demand_facts, qualified_event, recovery_gate, current_state_to_routine, current_state_to_urgent, demand_transition, prior_demand_state))) & T))
  }
}
