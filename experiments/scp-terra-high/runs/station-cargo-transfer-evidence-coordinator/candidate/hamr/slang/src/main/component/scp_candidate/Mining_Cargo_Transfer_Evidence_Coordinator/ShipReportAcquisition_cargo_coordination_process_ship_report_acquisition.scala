// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object ShipReportAcquisition_cargo_coordination_process_ship_report_acquisition {

  def initialise(api: ShipReportAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_ship_report_facts(Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportFacts(
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportClass.NO_EVENT,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      T,
      Mining_Cargo_Transfer_Evidence_Coordinator.ShipReportValue.NONE))
  }

  def timeTriggered(api: ShipReportAcquisition_Operational_Api): Unit = { }
  def finalise(api: ShipReportAcquisition_Operational_Api): Unit = { }
}
