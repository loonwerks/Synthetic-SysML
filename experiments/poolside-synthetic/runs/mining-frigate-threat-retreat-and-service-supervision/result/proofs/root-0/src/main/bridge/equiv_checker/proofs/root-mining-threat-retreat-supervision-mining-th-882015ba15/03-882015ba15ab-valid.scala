// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_882015ba15ab_3_Valid {
  @pure def check(
      next_recovery_state: equiv_shared_0.Mining_Threat_Retreat_Supervision.RecoveryStateValue,
      public_result: equiv_shared_0.Mining_Threat_Retreat_Supervision.PublicResultValue,
      selected_action: equiv_shared_0.Mining_Threat_Retreat_Supervision.ActionValue,
      selected_cause: equiv_shared_0.Mining_Threat_Retreat_Supervision.SelectedCauseValue): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
