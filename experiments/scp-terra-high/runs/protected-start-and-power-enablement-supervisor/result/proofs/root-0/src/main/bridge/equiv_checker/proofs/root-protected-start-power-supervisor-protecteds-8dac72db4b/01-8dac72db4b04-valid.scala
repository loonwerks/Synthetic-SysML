// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_8dac72db4b04_1_Valid {
  @pure def check(
      qualified_supply_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      self_test_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestStateFacts,
      start_restraint_fact: equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintFact,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
