// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_05565ab65bc7_2_Valid {
  @pure def check(
      access_proposal: equiv_shared_0.Docking_Access_Supervisor.AccessProposal,
      docking_decision: equiv_shared_0.Docking_Access_Supervisor.DockingDecisionFrame,
      docking_proposal: equiv_shared_0.Docking_Access_Supervisor.DockingProposal,
      priority_directive: equiv_shared_0.Docking_Access_Supervisor.PriorityDirective,
      undocking_proposal: equiv_shared_0.Docking_Access_Supervisor.UndockingProposal): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Docking_Access_Supervisor.DockingActionArbitration_supervisor_process_docking_action_arbitration_GumboX.compute_CEP_Post(access_proposal, docking_proposal, priority_directive, undocking_proposal, docking_decision))) & T))
  }
}
