// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_75b6047f0541_2_Complement {
  @pure def check(
      demand_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.DemandStateView.Type,
      material_readiness_facts: equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialReadinessFacts,
      proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      recovery_gate: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.UrgentReleaseEligibility_material_continuity_process_urgent_release_eligibility_GumboX.compute_CEP_Post(demand_state, material_readiness_facts, recovery_gate, proposal))) & T)))
  }
}
