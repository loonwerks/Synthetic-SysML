// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_a85c3dbd4d51_2_Valid {
  @pure def check(
      degradedindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradedIndication,
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstoepisode: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      factstorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochFacts,
      previousdegraded: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.DegradationEpochOwner_modeCoordinationProcess_degradationEpochOwner_GumboX.inititialize_IEP_Post(previousdegraded, factstoconflict, factstoepisode, factstopriority, factstorecovery))) & T))
  }
}
