// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_3d1c8396b9d3_2_Complement {
  @pure def check(
      command_fault: B,
      command_report: equiv_shared_0.Protected_Start_Power_Supervisor.CommandReport,
      qualified_command_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedCommandFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.CommandQualificationOwner_protected_start_power_process_command_qualification_owner_GumboX.inititialize_IEP_Post(command_fault, qualified_command_facts))) & T)))
  }
}
