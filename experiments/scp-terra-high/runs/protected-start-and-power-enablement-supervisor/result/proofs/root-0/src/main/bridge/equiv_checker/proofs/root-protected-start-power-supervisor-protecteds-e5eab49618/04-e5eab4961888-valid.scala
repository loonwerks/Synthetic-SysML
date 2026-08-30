// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_e5eab4961888_4_Valid {
  @pure def check(
      qualified_parking_brake_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedParkingBrakeFacts,
      qualified_pedal_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedPedalFacts,
      start_restraint_fact: equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintFact): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintDecisionOwner_protected_start_power_process_start_restraint_decision_owner_GumboX.compute_CEP_Post(qualified_parking_brake_facts, qualified_pedal_facts, start_restraint_fact))) ___>: (T)) & T))
  }
}
