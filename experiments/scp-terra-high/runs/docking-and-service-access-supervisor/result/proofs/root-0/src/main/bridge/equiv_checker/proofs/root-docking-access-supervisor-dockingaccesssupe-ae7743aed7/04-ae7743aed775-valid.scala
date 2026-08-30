// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ae7743aed775_4_Valid {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition,
      in_recoverystate: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type,
      recoverystate: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.compute_CEP_Post(in_recoverystate, recoverystate, recovery_transition, prior_recovery_state))) ___>: (T)) & T))
  }
}
