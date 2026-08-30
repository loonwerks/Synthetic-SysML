// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object WarehouseReportAcquisition_cargo_coordination_process_warehouse_report_acquisition {

  def initialise(api: WarehouseReportAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_warehouse_report_facts(Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportFacts(
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportClass.NO_EVENT,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      T,
      Mining_Cargo_Transfer_Evidence_Coordinator.WarehouseReportValue.NONE))
  }

  def timeTriggered(api: WarehouseReportAcquisition_Operational_Api): Unit = { }
  def finalise(api: WarehouseReportAcquisition_Operational_Api): Unit = { }
}
