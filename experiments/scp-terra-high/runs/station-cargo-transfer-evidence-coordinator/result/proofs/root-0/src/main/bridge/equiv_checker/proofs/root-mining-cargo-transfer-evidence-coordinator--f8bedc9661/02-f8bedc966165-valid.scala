// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f8bedc966165_2_Valid {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition,
      recoverystate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_GumboX.inititialize_IEP_Post(recoverystate, prior_recovery_state))) & T))
  }
}
