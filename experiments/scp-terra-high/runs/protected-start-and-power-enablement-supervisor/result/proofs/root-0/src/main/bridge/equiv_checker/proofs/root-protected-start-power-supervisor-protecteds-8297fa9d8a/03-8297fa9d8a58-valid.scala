// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8297fa9d8a58_3_Valid {
  @pure def check(
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts,
      self_test_fault: B,
      self_test_report: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestReport,
      self_test_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestStateFacts,
      in_selftestmemory: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestState.Type,
      selftestmemory: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestState.Type): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
