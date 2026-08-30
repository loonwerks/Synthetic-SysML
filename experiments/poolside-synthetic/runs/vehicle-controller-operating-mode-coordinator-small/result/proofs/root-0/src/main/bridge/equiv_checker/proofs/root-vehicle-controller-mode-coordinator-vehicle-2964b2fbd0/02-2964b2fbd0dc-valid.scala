// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2964b2fbd0dc_2_Valid {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      coordination_class: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CrossChannelCompatibility_mode_coordination_process_cross_channel_compatibility_GumboX.compute_CEP_Post(condition_assessment, lifecycle_assessment, coordination_class))) & T))
  }
}
