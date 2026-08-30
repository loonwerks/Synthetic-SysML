// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7a84cf58902b_2_Valid {
  @pure def check(
      appliedresolution: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      currentmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      storedrecoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type,
      recoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTargetOwner_vehicleModeCoordinationProcess_recoveryTargetOwner_GumboX.inititialize_IEP_Post(recoverytarget, storedrecoverytarget))) & T))
  }
}
