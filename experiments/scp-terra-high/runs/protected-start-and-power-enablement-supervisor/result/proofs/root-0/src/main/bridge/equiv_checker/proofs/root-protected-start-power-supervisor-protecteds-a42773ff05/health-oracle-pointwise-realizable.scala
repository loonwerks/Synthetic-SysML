// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object Health_a42773ff05d9_Oracle_Pointwise_Realizable {
  @pure def check(
      electrical_power_report: equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalPowerReport): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: ((equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_GumboX.inititialize_IEP_Post(equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable = F), F)) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_GumboX.inititialize_IEP_Post(equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable = F), T)) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_GumboX.inititialize_IEP_Post(equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable = T), F)) |
        (equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_GumboX.inititialize_IEP_Post(equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts(supplyUsable = T), T)))))
  }
}
