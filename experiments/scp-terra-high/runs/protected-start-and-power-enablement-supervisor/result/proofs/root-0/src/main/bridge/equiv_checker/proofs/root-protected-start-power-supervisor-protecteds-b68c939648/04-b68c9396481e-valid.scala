// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_b68c9396481e_4_Valid {
  @pure def check(
      exact_fault_summary: equiv_shared_0.Protected_Start_Power_Supervisor.ExactFaultSummary,
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      rearm_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.RearmStateFacts,
      recovery_permit_fact: equiv_shared_0.Protected_Start_Power_Supervisor.RecoveryPermitFact,
      rearmmemory: equiv_shared_0.Protected_Start_Power_Supervisor.RearmState.Type): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.RearmQualificationStateOwner_protected_start_power_process_rearm_qualification_state_owner_GumboX.inititialize_IEP_Post(rearmmemory, rearm_state_facts, recovery_permit_fact))) ___>: (T)) & T))
  }
}
