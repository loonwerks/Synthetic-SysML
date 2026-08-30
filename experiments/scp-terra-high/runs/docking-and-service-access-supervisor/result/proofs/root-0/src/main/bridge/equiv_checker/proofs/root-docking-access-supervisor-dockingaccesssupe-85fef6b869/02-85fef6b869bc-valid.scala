// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_85fef6b869bc_2_Valid {
  @pure def check(
      access_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      access_proposal: equiv_shared_0.Docking_Access_Supervisor.AccessProposal,
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.AccessActionEligibility_supervisor_process_access_action_eligibility_GumboX.compute_CEP_Post(access_frame, admission_decision, access_proposal))) & T))
  }
}
