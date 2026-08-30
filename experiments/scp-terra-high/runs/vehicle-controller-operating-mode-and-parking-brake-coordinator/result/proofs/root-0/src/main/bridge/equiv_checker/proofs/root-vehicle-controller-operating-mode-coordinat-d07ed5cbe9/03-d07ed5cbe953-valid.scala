// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_d07ed5cbe953_3_Valid {
  @pure def check(
      degradedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication,
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstoepisode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      in_previousdegraded: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type,
      previousdegraded: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
