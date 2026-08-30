// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_dc5be6f8e784_1_Valid {
  @pure def check(
      collection_proposal: equiv_shared_0.EIT_Acquisition_Supervisor.Proposal.Type,
      cycle_frame: equiv_shared_0.EIT_Acquisition_Supervisor.CycleFrame,
      recovery_frame: equiv_shared_0.EIT_Acquisition_Supervisor.RecoveryFrame,
      session_frame: equiv_shared_0.EIT_Acquisition_Supervisor.SessionFrame): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
