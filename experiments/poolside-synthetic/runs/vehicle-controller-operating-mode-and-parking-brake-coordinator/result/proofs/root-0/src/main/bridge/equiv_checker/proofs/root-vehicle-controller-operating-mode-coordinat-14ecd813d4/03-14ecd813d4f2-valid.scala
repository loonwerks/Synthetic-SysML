// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_14ecd813d4f2_3_Valid {
  @pure def check(
      demandsnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot,
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      modedecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ModeDecision,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      modememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ControllerMode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
