// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ac6ee3698677_1_Valid {
  @pure def check(
      prior_recovery_state: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type,
      recovery_transition: equiv_shared_0.Docking_Access_Supervisor.RecoveryTransition,
      recoverystate: equiv_shared_0.Docking_Access_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
