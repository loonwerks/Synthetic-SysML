// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f43e2dda433_2_Valid {
  @pure def check(
      arbitrationforpublication: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      arbitrationforqualification: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      conditionassessment: equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.Type,
      lifecyclefacts: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleFacts,
      servicefacts: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.IntentArbitrationOwner_vehicleModeCoordinationProcess_intentArbitrationOwner_GumboX.compute_CEP_Post(conditionassessment, lifecyclefacts, servicefacts, arbitrationforpublication, arbitrationforqualification))) & T))
  }
}
