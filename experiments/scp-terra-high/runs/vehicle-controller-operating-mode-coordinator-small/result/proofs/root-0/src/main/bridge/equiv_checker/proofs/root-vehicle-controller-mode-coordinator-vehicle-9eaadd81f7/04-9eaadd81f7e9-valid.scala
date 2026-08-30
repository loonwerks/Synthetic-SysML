// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_9eaadd81f7e9_4_Valid {
  @pure def check(
      condition_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ConditionAssessment.Type,
      coordination_class: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationClass.Type,
      lifecycle_assessment: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.LifecycleAssessment.Type,
      mode_decision: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ModeDecision,
      controllermode: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeArbitration_mode_coordination_process_controller_mode_arbitration_GumboX.inititialize_IEP_Post(controllermode, mode_decision))) ___>: (T)) & T))
  }
}
