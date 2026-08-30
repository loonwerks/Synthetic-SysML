// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_550bc57c2c45_4_Valid {
  @pure def check(
      electrical_power_report: equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalPowerReport,
      qualified_supply_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts,
      supply_fault: B): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalSupplyQualificationOwner_protected_start_power_process_electrical_supply_qualification_owner_GumboX.compute_CEP_Post(electrical_power_report, qualified_supply_facts, supply_fault))) ___>: (T)) & T))
  }
}
