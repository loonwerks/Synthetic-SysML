// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b97481596585_3_Valid {
  @pure def check(
      maintenancefacts: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      snapshottobrake: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      sessionmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSession.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
