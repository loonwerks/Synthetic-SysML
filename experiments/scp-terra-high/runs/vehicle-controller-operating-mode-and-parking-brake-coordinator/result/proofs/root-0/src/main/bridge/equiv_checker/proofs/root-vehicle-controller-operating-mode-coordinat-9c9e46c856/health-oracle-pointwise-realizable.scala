// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_9c9e46c85691_Oracle_Pointwise_Realizable {
  @pure def check(
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.RequireApply)) |
        (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_GumboX.inititialize_IEP_Post(equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.AllowRelease)))))
  }
}
