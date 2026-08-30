// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_53fc7d92d7d2_4_Valid {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      lifecycleindications: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications,
      in_previousoff: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type,
      previousoff: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type,
      in_previouson: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type,
      previouson: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type,
      in_previousstart: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type,
      previousstart: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_GumboX.compute_CEP_Post(in_previousoff, in_previouson, in_previousstart, previousoff, previouson, previousstart, lifecycleindications, factstoconflict, factstopriority))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochOwner_modeCoordinationProcess_lifecycleEpochOwner_Candidate_GumboX.compute_CEP_Post(lifecycleindications, factstoconflict, factstopriority))) & T))
  }
}
