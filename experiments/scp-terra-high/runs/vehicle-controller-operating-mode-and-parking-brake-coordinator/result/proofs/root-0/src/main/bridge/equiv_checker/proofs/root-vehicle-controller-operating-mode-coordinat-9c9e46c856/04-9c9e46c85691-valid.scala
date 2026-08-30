// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9c9e46c85691_4_Valid {
  @pure def check(
      brakedemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type,
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_GumboX.inititialize_IEP_Post(brakedemand))) ___>: (T)) & T))
  }
}
