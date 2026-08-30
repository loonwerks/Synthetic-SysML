// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_096d7a20cdb7_1_Valid {
  @pure def check(
      decision: equiv_shared_0.Factory_Material_Continuity_Coordinator.Decision,
      emergency_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.EmergencyState.Type,
      replenishment_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      routine_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type,
      urgent_proposal: equiv_shared_0.Factory_Material_Continuity_Coordinator.ProposalState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
