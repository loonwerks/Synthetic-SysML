// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_c01fec61ad45_Oracle_Pointwise_Realizable {
  @pure def check(
      qualified_supply_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts,
      self_test_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.SelfTestStateFacts,
      start_restraint_fact: equiv_shared_0.Protected_Start_Power_Supervisor.StartRestraintFact,
      thermal_state_facts: equiv_shared_0.Protected_Start_Power_Supervisor.ThermalStateFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_GumboX.compute_CEP_Post(qualified_supply_facts, self_test_state_facts, start_restraint_fact, thermal_state_facts, equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts(startReady = F, sustainReady = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_GumboX.compute_CEP_Post(qualified_supply_facts, self_test_state_facts, start_restraint_fact, thermal_state_facts, equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts(startReady = F, sustainReady = T))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_GumboX.compute_CEP_Post(qualified_supply_facts, self_test_state_facts, start_restraint_fact, thermal_state_facts, equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts(startReady = T, sustainReady = F))) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessCompositionOwner_protected_start_power_process_readiness_composition_owner_GumboX.compute_CEP_Post(qualified_supply_facts, self_test_state_facts, start_restraint_fact, thermal_state_facts, equiv_shared_0.Protected_Start_Power_Supervisor.ReadinessFacts(startReady = T, sustainReady = T))))))
  }
}
