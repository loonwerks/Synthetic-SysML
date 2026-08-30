// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_667b04ee2105_3_Valid {
  @pure def check(
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      snapshottobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottomode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      in_episodememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type,
      episodememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
