// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_216ac161a7f8_1_Valid {
  @pure def check(
      ship_report: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type,
      ship_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts): Unit = {
    Contract(Requires(T),
      Ensures((T) ___>: (T)))
  }
}
