// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_216ac161a7f8_2_Complement {
  @pure def check(
      ship_report: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type,
      ship_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_GumboX.compute_CEP_Post(ship_report, ship_report_facts))) & T)))
  }
}
