// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9b7270d731d2_1_Valid {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      factstosession: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceEpochFacts,
      maintenanceindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.MaintenanceIndication,
      previousmaintenance: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
