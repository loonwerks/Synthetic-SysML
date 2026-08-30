// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_ce8df6e4d88e_2_Complement {
  @pure def check(
      appliednextmode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      modeforqualification: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      modeforrecovery: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      qualifiedtransition: equiv_shared_0.Vehicle_Mode_Coordinator.QualifiedTransition.Type,
      resolutionforpublication: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      resolutionforrecovery: equiv_shared_0.Vehicle_Mode_Coordinator.TransitionResolution,
      storedrecoverytarget: equiv_shared_0.Vehicle_Mode_Coordinator.RecoveryTarget.Type,
      in_controllermode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type,
      controllermode: equiv_shared_0.Vehicle_Mode_Coordinator.ControllerMode.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.ModeTransitionApplicationOwner_vehicleModeCoordinationProcess_modeTransitionApplicationOwner_GumboX.compute_CEP_Post(in_controllermode, controllermode, qualifiedtransition, storedrecoverytarget, appliednextmode, modeforqualification, modeforrecovery, resolutionforpublication, resolutionforrecovery))) & T)))
  }
}
