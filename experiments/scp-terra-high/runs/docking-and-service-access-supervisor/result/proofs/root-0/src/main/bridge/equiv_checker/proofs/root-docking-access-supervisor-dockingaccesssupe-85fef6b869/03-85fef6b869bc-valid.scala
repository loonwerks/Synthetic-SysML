// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_85fef6b869bc_3_Valid {
  @pure def check(
      access_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      access_proposal: equiv_shared_0.Docking_Access_Supervisor.AccessProposal,
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
