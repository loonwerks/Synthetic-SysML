// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition {

  def initialise(api: WarehouseReportAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_warehouse_report_facts(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts.example())
  }

  def timeTriggered(api: WarehouseReportAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_warehouse_report: Option[Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReport.Type] = api.get_warehouse_report()
    api.logInfo(s"Received on data port warehouse_report: ${apiUsage_warehouse_report}")
  }

  def finalise(api: WarehouseReportAcquisition_Operational_Api): Unit = { }
}
