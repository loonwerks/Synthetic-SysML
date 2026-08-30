// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d773ff5a4044_4_Valid {
  @pure def check(
      conflictclass: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type,
      decisiontodemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      decisiontoepisode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      decisiontomode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      returnfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_GumboX.compute_CEP_Post(conflictclass, degradationfacts, episodesnapshot, returnfacts, selectedindication, decisiontodemand, decisiontoepisode, decisiontomode))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryEligibilityOwner_modeCoordinationProcess_recoveryEligibilityOwner_Candidate_GumboX.compute_CEP_Post(conflictclass, degradationfacts, episodesnapshot, returnfacts, selectedindication, decisiontodemand, decisiontoepisode, decisiontomode))) & T))
  }
}
