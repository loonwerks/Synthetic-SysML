// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_03485d6f7330_4_Valid {
  @pure def check(
      servicefacts: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceFacts,
      servicelevels: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceLevels,
      previousmaintenance: B,
      previousreturn: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_GumboX.inititialize_IEP_Post(previousmaintenance, previousreturn, servicefacts))) ___>: (T)) & T))
  }
}
