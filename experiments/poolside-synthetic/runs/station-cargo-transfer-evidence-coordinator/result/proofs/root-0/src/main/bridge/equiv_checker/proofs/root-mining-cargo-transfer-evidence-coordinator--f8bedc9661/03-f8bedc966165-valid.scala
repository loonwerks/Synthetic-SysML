// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f8bedc966165_3_Valid {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition,
      recoverystate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
