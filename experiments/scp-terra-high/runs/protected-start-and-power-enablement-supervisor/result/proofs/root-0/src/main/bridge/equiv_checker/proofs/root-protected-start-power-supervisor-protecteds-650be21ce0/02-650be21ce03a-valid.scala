// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_650be21ce03a_2_Valid {
  @pure def check(
      brake_pedal_report: equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalReport,
      pedal_fault: B,
      qualified_pedal_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalQualificationOwner_protected_start_power_process_brake_pedal_qualification_owner_GumboX.compute_CEP_Post(brake_pedal_report, pedal_fault, qualified_pedal_facts))) & T))
  }
}
