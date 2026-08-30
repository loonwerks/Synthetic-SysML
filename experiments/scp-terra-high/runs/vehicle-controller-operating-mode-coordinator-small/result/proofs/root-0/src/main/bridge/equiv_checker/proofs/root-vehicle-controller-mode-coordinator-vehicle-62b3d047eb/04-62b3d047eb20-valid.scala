// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_62b3d047eb20_4_Valid {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      coordination_class: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      mode_decision: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ModeDecision,
      in_controllermode: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type,
      controllermode: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_GumboX.compute_CEP_Post(in_controllermode, controllermode, condition_assessment, coordination_class, lifecycle_assessment, mode_decision))) ___>: (T)) & T))
  }
}
