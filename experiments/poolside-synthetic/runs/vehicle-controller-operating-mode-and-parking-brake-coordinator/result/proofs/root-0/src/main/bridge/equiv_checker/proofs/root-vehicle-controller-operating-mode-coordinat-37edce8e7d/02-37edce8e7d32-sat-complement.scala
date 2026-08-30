// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_37edce8e7d32_2_Complement {
  @pure def check(
      factstoconflict: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      factstopriority: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      factstorecovery: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochFacts,
      returnindication: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnIndication,
      in_previousreturn: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type,
      previousreturn: equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.IndicationLevel.Type): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Operating_Mode_Coordinator.ReturnEpochOwner_modeCoordinationProcess_returnEpochOwner_GumboX.compute_CEP_Post(in_previousreturn, previousreturn, returnindication, factstoconflict, factstopriority, factstorecovery))) & T)))
  }
}
