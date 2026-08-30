// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_fd2a561d6cb3_2_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      undocking_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      undocking_proposal: equiv_shared_0.Docking_Access_Supervisor.UndockingProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_GumboX.compute_CEP_Post(admission_decision, undocking_frame, undocking_proposal))) & T))
  }
}
