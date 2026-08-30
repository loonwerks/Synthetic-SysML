// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_36112f476b21_4_Valid {
  @pure def check(
      command_fault: B,
      command_report: equiv_shared_0.Protected_Start_Power_Supervisor.CommandReport,
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_GumboX.compute_CEP_Post(command_report, command_fault, qualified_command_facts))) ___>: (T)) & T))
  }
}
