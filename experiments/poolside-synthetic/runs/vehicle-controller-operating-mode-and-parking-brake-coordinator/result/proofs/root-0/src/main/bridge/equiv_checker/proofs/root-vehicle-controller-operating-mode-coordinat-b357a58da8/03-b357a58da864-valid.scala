// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b357a58da864_3_Valid {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      factstorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      returnindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication,
      previousreturn: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
