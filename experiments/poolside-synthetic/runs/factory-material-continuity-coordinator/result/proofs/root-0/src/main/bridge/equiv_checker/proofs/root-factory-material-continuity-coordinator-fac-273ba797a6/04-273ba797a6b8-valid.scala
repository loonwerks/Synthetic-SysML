// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_273ba797a6b8_4_Valid {
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
      Ensures((((T) & (equiv_shared_0.Factory_Material_Continuity_Coordinator.RecoverySupervisor_material_continuity_process_recovery_supervisor_GumboX.inititialize_IEP_Post(recoveryphasememory, emergency_state, gate_to_demand, gate_to_replenishment, gate_to_routine, gate_to_supply, gate_to_urgent, recovery_state))) ___>: (T)) & T))
  }
}
