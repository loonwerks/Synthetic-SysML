// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_81e9ddc1c717_2_Valid {
  @pure def check(
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      rearm_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.RearmStateFacts,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts,
      supervisory_status: equiv_shared_0.Protected_Start_Power_Supervisor.SupervisoryStatus): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.SupervisoryStatusNoticeOwner_protected_start_power_process_supervisory_status_notice_owner_GumboX.compute_CEP_Post(exact_fault_summary, readiness_facts, rearm_state_facts, session_decision_facts, supervisory_status))) & T))
  }
}
