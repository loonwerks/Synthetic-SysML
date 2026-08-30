// #Sireum #Logika
package equiv_checker.proofs

import org.sireum._

object VC_4cb44d6789ed_2_Complement {
  @pure def check(
      warehouse_report: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type,
      warehouse_report_facts: equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts): Unit = {
    Contract(Requires(!((((T) & (T)) ___>: (equiv_shared_0.Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition_GumboX.inititialize_IEP_Post(warehouse_report_facts))) & T)))
  }
}
