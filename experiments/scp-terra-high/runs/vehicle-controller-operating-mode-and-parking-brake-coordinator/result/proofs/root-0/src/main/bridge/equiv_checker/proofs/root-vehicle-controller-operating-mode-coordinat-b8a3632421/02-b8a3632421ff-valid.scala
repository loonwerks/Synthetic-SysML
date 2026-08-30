// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b8a3632421ff_2_Valid {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      factstosession: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      maintenanceindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication,
      in_previousmaintenance: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type,
      previousmaintenance: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_Candidate_GumboX.compute_CEP_Post(maintenanceindication, factstoconflict, factstopriority, factstosession))) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochOwner_modeCoordinationProcess_maintenanceEpochOwner_GumboX.compute_CEP_Post(in_previousmaintenance, previousmaintenance, maintenanceindication, factstoconflict, factstopriority, factstosession))) & T))
  }
}
