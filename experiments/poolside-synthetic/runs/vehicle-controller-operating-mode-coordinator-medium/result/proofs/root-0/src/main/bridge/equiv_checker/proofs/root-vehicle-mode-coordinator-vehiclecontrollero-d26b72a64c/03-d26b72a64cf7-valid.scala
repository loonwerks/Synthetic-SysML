// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d26b72a64cf7_3_Valid {
  @pure def check(
      appliednextmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      modeforqualification: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      modeforrecovery: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      qualifiedtransition: equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.Type,
      resolutionforpublication: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      resolutionforrecovery: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      storedrecoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type,
      controllermode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
