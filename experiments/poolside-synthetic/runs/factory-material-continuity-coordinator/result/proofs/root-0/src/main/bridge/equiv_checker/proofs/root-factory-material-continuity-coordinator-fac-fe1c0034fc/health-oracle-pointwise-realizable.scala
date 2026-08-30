// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_fe1c0034fcc3_Oracle_Pointwise_Realizable {
  @pure def check(
      demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      material_readiness_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_GumboX.compute_CEP_Post(demand_state, material_readiness_facts, recovery_gate, equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.NotProposed)) |
        (equiv_shared_0.Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_GumboX.compute_CEP_Post(demand_state, material_readiness_facts, recovery_gate, equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.PROPOSED)))))
  }
}
