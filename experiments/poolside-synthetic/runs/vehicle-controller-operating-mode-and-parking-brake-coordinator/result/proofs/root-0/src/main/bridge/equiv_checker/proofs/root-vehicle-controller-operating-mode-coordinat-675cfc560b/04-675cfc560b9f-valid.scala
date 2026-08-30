// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_675cfc560b9f_4_Valid {
  @pure def check(
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      snapshottobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottomode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      episodememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_GumboX.inititialize_IEP_Post(episodememory, snapshottobrake, snapshottomode, snapshottorecovery))) ___>: (T)) & T))
  }
}
