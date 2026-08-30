// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_667b04ee2105_2_Complement {
  @pure def check(
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      snapshottobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottomode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      snapshottorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      in_episodememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type,
      episodememory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisode.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_Candidate_GumboX.compute_CEP_Post(degradationfacts, recoverydecision, selectedindication, snapshottobrake, snapshottomode, snapshottorecovery))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedEpisodeOwner_modeCoordinationProcess_degradedEpisodeOwner_GumboX.compute_CEP_Post(in_episodememory, episodememory, degradationfacts, recoverydecision, selectedindication, snapshottobrake, snapshottomode, snapshottorecovery))) & T)))
  }
}
