// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_eef365193f07_1_Valid {
  @pure def check(
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      request_facts: equiv_shared_0.EIT_Acquisition_Supervisor.RequestFactsRecord,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame,
      start_feasibility: equiv_shared_0.EIT_Acquisition_Supervisor.StartFeasibility.Type,
      sessionmemory: equiv_shared_0.EIT_Acquisition_Supervisor.SessionState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
