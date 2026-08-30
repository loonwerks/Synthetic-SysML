// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_16c0fd942f3d_2_Valid {
  @pure def check(
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      rearm_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.RearmStateFacts,
      recovery_permit_fact: equiv_shared_0.Protected_Start_Power_Supervisor.RecoveryPermitFact,
      in_rearmmemory: equiv_shared_0.Protected_Start_Power_Supervisor.RearmState.Type,
      rearmmemory: equiv_shared_0.Protected_Start_Power_Supervisor.RearmState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_GumboX.compute_CEP_Post(in_rearmmemory, rearmmemory, exact_fault_summary, qualified_command_facts, readiness_facts, rearm_state_facts, recovery_permit_fact))) & T))
  }
}
