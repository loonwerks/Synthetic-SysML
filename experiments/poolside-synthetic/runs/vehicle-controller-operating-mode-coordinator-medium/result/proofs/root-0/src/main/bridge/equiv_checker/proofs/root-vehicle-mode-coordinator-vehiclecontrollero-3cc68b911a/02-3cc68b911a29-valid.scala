// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3cc68b911a29_2_Valid {
  @pure def check(
      servicefacts: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceFacts,
      servicelevels: equiv_shared_0.Vehicle_Mode_Coordinator.ServiceLevels,
      in_previousmaintenance: B,
      previousmaintenance: B,
      in_previousreturn: B,
      previousreturn: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.ServiceEventOwner_vehicleModeCoordinationProcess_serviceEventOwner_GumboX.compute_CEP_Post(in_previousmaintenance, in_previousreturn, previousmaintenance, previousreturn, servicelevels, servicefacts))) & T))
  }
}
