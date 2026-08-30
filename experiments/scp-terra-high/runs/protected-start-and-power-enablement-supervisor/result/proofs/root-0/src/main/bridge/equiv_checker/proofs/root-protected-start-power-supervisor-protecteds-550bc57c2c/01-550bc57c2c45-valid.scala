// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_550bc57c2c45_1_Valid {
  @pure def check(
      electrical_power_report: equiv_shared_0.Protected_Start_Power_Supervisor.ElectricalPowerReport,
      qualified_supply_facts: equiv_shared_0.Protected_Start_Power_Supervisor.QualifiedSupplyFacts,
      supply_fault: B): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
