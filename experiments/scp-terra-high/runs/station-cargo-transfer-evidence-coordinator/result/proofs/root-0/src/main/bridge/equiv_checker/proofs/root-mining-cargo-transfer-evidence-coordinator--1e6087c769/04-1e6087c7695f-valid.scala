// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_1e6087c7695f_4_Valid {
  @pure def check(
      ship_report: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type,
      ship_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts): Unit = {
    Contract(Requires(T),
      Ensures((((T) & (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition_GumboX.inititialize_IEP_Post(ship_report_facts))) ___>: (T)) & T))
  }
}
