// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_5f909947b869_1_Valid {
  @pure def check(
      coordination_result: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.CoordinationResult.Type,
      mode_decision: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ModeDecision,
      mode_disposition: equiv_shared_0.Vehicle_Controller_Mode_Coordinator.ControllerModeDisposition.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
