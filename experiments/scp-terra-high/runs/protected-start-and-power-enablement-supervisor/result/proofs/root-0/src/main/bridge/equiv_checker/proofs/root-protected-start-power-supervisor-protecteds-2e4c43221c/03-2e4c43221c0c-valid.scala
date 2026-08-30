// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_2e4c43221c0c_3_Valid {
  @pure def check(
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      recovery_permit_fact: equiv_shared_0.Protected_Start_Power_Supervisor.RecoveryPermitFact,
      session_decision_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SessionDecisionFacts,
      in_sessionmemory: equiv_shared_0.Protected_Start_Power_Supervisor.Session.Type,
      sessionmemory: equiv_shared_0.Protected_Start_Power_Supervisor.Session.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
