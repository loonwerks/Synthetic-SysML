// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0860775bfdd7_4_Valid {
  @pure def check(
      conflicttopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type,
      conflicttorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type,
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      lifecyclefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      maintenancefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      returnfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_GumboX.compute_CEP_Post(degradationfacts, lifecyclefacts, maintenancefacts, returnfacts, conflicttopriority, conflicttorecovery))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClassificationOwner_modeCoordinationProcess_conflictClassificationOwner_Candidate_GumboX.compute_CEP_Post(degradationfacts, lifecyclefacts, maintenancefacts, returnfacts, conflicttopriority, conflicttorecovery))) & T))
  }
}
