// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4fd8602bc207_1_Valid {
  @pure def check(
      qualified_parking_brake_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts,
      qualified_pedal_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts,
      start_restraint_fact: equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintFact): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
