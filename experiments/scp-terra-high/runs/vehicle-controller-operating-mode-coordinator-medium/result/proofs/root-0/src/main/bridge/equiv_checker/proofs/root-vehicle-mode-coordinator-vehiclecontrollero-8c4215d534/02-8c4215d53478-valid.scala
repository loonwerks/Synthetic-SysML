// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8c4215d53478_2_Valid {
  @pure def check(
      lifecyclefacts: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleFacts,
      lifecyclelevels: equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleLevels,
      in_previousoff: B,
      previousoff: B,
      in_previouson: B,
      previouson: B,
      in_previousstart: B,
      previousstart: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_Candidate_GumboX.compute_CEP_Post(in_previousoff, in_previouson, in_previousstart, previousoff, previouson, previousstart, lifecyclelevels, lifecyclefacts))) ___>: (equiv_shared_0.Vehicle_Mode_Coordinator.LifecycleEventOwner_vehicleModeCoordinationProcess_lifecycleEventOwner_GumboX.compute_CEP_Post(in_previousoff, in_previouson, in_previousstart, previousoff, previouson, previousstart, lifecyclelevels, lifecyclefacts))) & T))
  }
}
