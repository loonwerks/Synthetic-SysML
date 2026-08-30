// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_33e2cfec3bda_2_Complement {
  @pure def check(
      emergency_state: equiv_shared_0.Factory_Dispatch_Coordinator.EmergencyState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_event: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryEvent.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      recovery_state: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type,
      in_retained_recovery: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type,
      retained_recovery: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryControl_coordinator_process_recovery_control_GumboX.compute_CEP_Post(in_retained_recovery, retained_recovery, qualified_outcome, recovery_event, emergency_state, recovery_gate, recovery_state))) & T)))
  }
}
