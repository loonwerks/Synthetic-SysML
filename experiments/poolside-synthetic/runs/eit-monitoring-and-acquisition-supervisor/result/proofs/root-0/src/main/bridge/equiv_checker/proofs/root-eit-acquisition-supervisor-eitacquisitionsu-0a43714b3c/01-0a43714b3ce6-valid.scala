// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_0a43714b3ce6_1_Valid {
  @pure def check(
      fault_summary: equiv_shared_0.EIT_Acquisition_Supervisor.FaultSummary,
      recovery_event: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryEvent.Type,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      recoverymemory: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
