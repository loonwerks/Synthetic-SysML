// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_7e24e6773dba_4_Valid {
  @pure def check(
      coordination_result: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type,
      mode_decision: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ModeDecision,
      mode_disposition: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationFrameDerivation_mode_coordination_process_coordination_frame_derivation_GumboX.compute_CEP_Post(mode_decision, coordination_result, mode_disposition))) ___>: (T)) & T))
  }
}
