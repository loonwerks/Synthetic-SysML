// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_096d7a20cdb7_2_Valid {
  @pure def check(
      decision: equiv_shared_0.Factory_Material_Continuity_Coordinator.Decision,
      emergency_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.EmergencyState.Type,
      replenishment_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      routine_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      urgent_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_GumboX.compute_CEP_Post(emergency_state, replenishment_proposal, routine_proposal, urgent_proposal, decision))) & T))
  }
}
