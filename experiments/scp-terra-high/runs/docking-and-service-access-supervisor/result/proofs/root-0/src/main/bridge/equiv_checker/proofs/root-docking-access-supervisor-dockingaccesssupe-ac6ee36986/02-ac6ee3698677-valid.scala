// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ac6ee3698677_2_Valid {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition,
      recoverystate: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.RecoverySupervisor_supervisor_process_recovery_supervisor_GumboX.inititialize_IEP_Post(recoverystate, prior_recovery_state))) & T))
  }
}
