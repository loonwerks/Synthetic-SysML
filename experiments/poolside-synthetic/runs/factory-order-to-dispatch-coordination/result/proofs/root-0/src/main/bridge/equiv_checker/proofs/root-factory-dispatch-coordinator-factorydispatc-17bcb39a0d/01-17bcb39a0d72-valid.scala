// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_17bcb39a0d72_1_Valid {
  @pure def check(
      emergency_state: equiv_shared_0.Factory_Dispatch_Coordinator.EmergencyState.Type,
      qualified_outcome: equiv_shared_0.Factory_Dispatch_Coordinator.QualifiedOutcome.Type,
      recovery_event: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryEvent.Type,
      recovery_gate: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryGate.Type,
      recovery_state: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type,
      retained_recovery: equiv_shared_0.Factory_Dispatch_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
