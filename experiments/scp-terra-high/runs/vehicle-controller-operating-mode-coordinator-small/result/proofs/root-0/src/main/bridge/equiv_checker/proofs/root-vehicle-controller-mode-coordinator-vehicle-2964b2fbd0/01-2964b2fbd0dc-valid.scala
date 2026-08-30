// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2964b2fbd0dc_1_Valid {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      coordination_class: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
