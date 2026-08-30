// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e9faf92ac5ac_1_Valid {
  @pure def check(
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      rearm_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.RearmStateFacts,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts,
      supervisory_status: equiv_shared_0.Protected_Start_Power_Supervisor.SupervisoryStatus): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
