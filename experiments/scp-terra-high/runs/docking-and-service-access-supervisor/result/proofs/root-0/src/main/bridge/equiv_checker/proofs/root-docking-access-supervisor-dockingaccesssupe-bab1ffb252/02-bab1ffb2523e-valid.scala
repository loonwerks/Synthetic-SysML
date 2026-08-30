// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_bab1ffb2523e_2_Valid {
  @pure def check(
      admission_decision: equiv_shared_0.Docking_Access_Supervisor.AdmissionDecision,
      docking_frame: equiv_shared_0.Docking_Access_Supervisor.CoordinationFrame,
      docking_proposal: equiv_shared_0.Docking_Access_Supervisor.DockingProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.DockingActionEligibility_supervisor_process_docking_action_eligibility_GumboX.inititialize_IEP_Post(docking_proposal))) & T))
  }
}
