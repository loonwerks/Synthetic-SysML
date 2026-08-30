// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_650be21ce03a_1_Valid {
  @pure def check(
      brake_pedal_report: equiv_shared_0.Protected_Start_Power_Supervisor.BrakePedalReport,
      pedal_fault: B,
      qualified_pedal_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
