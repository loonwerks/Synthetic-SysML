// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7209bd5a7ff5_2_Complement {
  @pure def check(
      brakedemand: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.BrakeDemand.Type,
      episodesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.EpisodeSnapshot,
      maintenancesnapshot: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceSnapshot,
      selectedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.SelectedIndication.Type): Unit = {
    Contract(Requires(!((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_Candidate_GumboX.compute_CEP_Post(episodesnapshot, maintenancesnapshot, selectedindication, brakedemand))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ParkingBrakeDemandOwner_modeCoordinationProcess_parkingBrakeDemandOwner_GumboX.compute_CEP_Post(episodesnapshot, maintenancesnapshot, selectedindication, brakedemand))) & T)))
  }
}
