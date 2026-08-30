// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_df6262792a91_2_Valid {
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
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationPriorityOwner_modeCoordinationProcess_indicationPriorityOwner_GumboX.inititialize_IEP_Post(selectiontobrake, selectiontodemand, selectiontoepisode, selectiontorecovery, selectiontosession))) & T))
  }
}
