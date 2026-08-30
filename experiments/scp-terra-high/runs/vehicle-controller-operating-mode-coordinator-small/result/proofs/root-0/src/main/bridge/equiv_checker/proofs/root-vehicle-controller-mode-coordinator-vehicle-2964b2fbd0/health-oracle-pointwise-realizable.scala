// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_2964b2fbd0dc_Oracle_Pointwise_Realizable {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.InvalidEvidence)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Quiet)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.LifecycleOnly)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionOnly)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.OffDominantConflict)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.ConditionDominantConflict)) |
        (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.RecoveryConflict)))))
  }
}
