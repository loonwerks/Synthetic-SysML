// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_62b3d047eb20_1_Valid {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      coordination_class: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      mode_decision: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ModeDecision,
      in_controllermode: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type,
      controllermode: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
