// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c24d7d533fa7_3_Valid {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleEpochFacts,
      lifecycleindications: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.LifecycleIndications,
      previousoff: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OffIndicationLevel.Type,
      previouson: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.OnIndicationLevel.Type,
      previousstart: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.StartIndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
