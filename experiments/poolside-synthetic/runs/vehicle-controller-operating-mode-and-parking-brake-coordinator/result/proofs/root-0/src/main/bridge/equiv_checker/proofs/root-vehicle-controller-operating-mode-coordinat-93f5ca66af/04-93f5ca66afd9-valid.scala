// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_93f5ca66afd9_4_Valid {
  @pure def check(
      maintenancefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      snapshottobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      in_sessionmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type,
      sessionmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSessionOwner_modeCoordinationProcess_maintenanceSessionOwner_GumboX.compute_CEP_Post(in_sessionmemory, sessionmemory, maintenancefacts, selectedindication, maintenancesnapshot, snapshottobrake))) ___>: (T)) & T))
  }
}
