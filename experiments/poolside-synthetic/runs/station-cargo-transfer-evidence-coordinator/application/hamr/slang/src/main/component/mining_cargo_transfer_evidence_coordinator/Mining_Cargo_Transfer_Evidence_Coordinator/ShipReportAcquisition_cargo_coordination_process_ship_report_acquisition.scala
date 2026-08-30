// #Sireum

package mining_cargo_transfer_evidence_coordinator.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import mining_cargo_transfer_evidence_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition {

  def initialise(api: ShipReportAcquisition_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_ship_report_facts(Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts.example())
  }

  def timeTriggered(api: ShipReportAcquisition_Operational_Api): Unit = {
    // example api usage

    val apiUsage_ship_report: Option[Mining_Cargo_Transfer_Evidence_Coordinator.ShipReport.Type] = api.get_ship_report()
    api.logInfo(s"Received on data port ship_report: ${apiUsage_ship_report}")
  }

  def finalise(api: ShipReportAcquisition_Operational_Api): Unit = { }
}
