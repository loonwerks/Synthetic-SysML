// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_c01fec61ad45_2_Complement {
  @pure def check(
      qualified_supply_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts,
      readiness_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts,
      self_test_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestStateFacts,
      start_restraint_fact: equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintFact,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_GumboX.compute_CEP_Post(qualified_supply_facts, self_test_state_facts, start_restraint_fact, thermal_state_facts, readiness_facts))) & T)))
  }
}
