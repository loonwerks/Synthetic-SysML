// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_273ba797a6b8_3_Valid {
  @pure def check(
      emergency_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.EmergencyState.Type,
      fault_trigger: equiv_shared_0.Factory_Material_Continuity_Coordinator.FaultTrigger.Type,
      gate_to_demand: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      gate_to_replenishment: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      gate_to_routine: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      gate_to_supply: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      gate_to_urgent: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryGate.Type,
      recovery_event: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryEvent.Type,
      recovery_state: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryState.Type,
      recoveryphasememory: equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
