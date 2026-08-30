// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fe1c0034fcc3_4_Valid {
  @pure def check(
      demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      material_readiness_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Factory_Material_Continuity_Coordinator.RoutineReleaseEligibility_material_continuity_process_routine_release_eligibility_GumboX.compute_CEP_Post(demand_state, material_readiness_facts, recovery_gate, proposal))) ___>: (T)) & T))
  }
}
