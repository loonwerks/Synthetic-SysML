// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c778574a6749_2_Complement {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      undocking_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      undocking_proposal: equiv_shared_0.Docking_Access_Supervisor.UndockingProposal): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.UndockingActionEligibility_supervisor_process_undocking_action_eligibility_GumboX.inititialize_IEP_Post(undocking_proposal))) & T)))
  }
}
