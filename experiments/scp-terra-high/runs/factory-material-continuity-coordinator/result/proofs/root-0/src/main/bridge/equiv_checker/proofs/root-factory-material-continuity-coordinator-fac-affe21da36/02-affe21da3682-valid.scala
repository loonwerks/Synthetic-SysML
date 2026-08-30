// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_affe21da3682_2_Valid {
  @pure def check(
      decision: equiv_shared_0.Factory_Material_Continuity_Coordinator.Decision,
      emergency_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.EmergencyState.Type,
      replenishment_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      routine_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      urgent_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Factory_Material_Continuity_Coordinator.MaterialActionArbitration_material_continuity_process_material_action_arbitration_GumboX.inititialize_IEP_Post(decision))) & T))
  }
}
