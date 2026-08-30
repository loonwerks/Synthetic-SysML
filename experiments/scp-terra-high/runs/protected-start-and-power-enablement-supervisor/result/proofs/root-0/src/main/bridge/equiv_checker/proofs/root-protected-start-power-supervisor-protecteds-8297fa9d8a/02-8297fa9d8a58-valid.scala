// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8297fa9d8a58_2_Valid {
  @pure def check(
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts,
      self_test_fault: B,
      self_test_report: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestReport,
      self_test_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestStateFacts,
      in_selftestmemory: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestState.Type,
      selftestmemory: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestCampaignStateOwner_protected_start_power_process_self_test_campaign_state_owner_GumboX.compute_CEP_Post(in_selftestmemory, selftestmemory, qualified_command_facts, self_test_report, self_test_fault, self_test_state_facts))) & T))
  }
}
