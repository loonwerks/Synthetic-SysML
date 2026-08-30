// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1fcfeb18cd04_3_Valid {
  @pure def check(
      appliedresolution: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      storedrecoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type,
      in_recoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type,
      recoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
