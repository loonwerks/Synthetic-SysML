// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_273de767ce8e_1_Valid {
  @pure def check(
      demandsnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DemandSnapshot,
      recoverydecision: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.RecoveryDecision.Type,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type,
      in_demandmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type,
      demandmemory: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OperatingDemand.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
