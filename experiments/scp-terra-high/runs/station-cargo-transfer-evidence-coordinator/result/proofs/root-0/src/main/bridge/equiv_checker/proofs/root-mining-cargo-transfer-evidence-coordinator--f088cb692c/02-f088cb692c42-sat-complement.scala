// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_f088cb692c42_2_Complement {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryTransition,
      in_recoverystate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type,
      recoverystate: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoveryState.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.RecoverySupervisor_cargo_coordination_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, recoverystate, recovery_transition, prior_recovery_state))) & T)))
  }
}
