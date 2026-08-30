// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8f43e2dda433_1_Valid {
  @pure def check(
      arbitrationforpublication: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      arbitrationforqualification: equiv_shared_0.Vehicle_Mode_Coordinator.ArbitrationResult,
      conditionassessment: equiv_shared_0.Vehicle_Mode_Coordinator.ConditionAssessment.Type,
      lifecyclefacts: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleFacts,
      servicefacts: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
