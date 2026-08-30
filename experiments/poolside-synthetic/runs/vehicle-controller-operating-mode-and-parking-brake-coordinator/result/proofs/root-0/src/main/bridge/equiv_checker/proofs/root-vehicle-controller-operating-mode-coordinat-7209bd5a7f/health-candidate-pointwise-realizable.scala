// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_7209bd5a7ff5_Candidate_Pointwise_Realizable {
  @pure def check(
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((T) |
        (T))))
  }
}
