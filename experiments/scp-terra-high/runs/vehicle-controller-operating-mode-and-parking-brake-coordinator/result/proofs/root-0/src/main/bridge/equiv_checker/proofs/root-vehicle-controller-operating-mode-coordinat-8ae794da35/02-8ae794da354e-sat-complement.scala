// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8ae794da354e_2_Complement {
  @pure def check(
      conflictclass: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ConflictClass.Type,
      degradationfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      lifecyclefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      maintenancefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      returnfacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      selectiontobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      selectiontodemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      selectiontoepisode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      selectiontorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      selectiontosession: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_Candidate_GumboX.compute_CEP_Post(conflictclass, degradationfacts, lifecyclefacts, maintenancefacts, returnfacts, selectiontobrake, selectiontodemand, selectiontoepisode, selectiontorecovery, selectiontosession))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_GumboX.compute_CEP_Post(conflictclass, degradationfacts, lifecyclefacts, maintenancefacts, returnfacts, selectiontobrake, selectiontodemand, selectiontoepisode, selectiontorecovery, selectiontosession))) & T)))
  }
}
