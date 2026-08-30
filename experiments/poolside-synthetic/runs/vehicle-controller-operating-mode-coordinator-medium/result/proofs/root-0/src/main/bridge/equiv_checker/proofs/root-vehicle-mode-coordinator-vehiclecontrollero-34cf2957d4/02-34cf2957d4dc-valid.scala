// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_34cf2957d4dc_2_Valid {
  @pure def check(
      lifecyclefacts: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleFacts,
      lifecyclelevels: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleLevels,
      previousoff: B,
      previouson: B,
      previousstart: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_GumboX.inititialize_IEP_Post(previousoff, previouson, previousstart, lifecyclefacts))) & T))
  }
}
