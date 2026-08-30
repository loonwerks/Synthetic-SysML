// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_09c52e41e430_4_Valid {
  @pure def check(
      demandsnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot,
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      modedecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      in_modememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type,
      modememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_GumboX.compute_CEP_Post(in_modememory, modememory, demandsnapshot, episodesnapshot, maintenancesnapshot, recoverydecision, modedecision))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ControllerModeTransitionOwner_modeCoordinationProcess_controllerModeTransitionOwner_Candidate_GumboX.compute_CEP_Post(demandsnapshot, episodesnapshot, maintenancesnapshot, recoverydecision, modedecision))) & T))
  }
}
