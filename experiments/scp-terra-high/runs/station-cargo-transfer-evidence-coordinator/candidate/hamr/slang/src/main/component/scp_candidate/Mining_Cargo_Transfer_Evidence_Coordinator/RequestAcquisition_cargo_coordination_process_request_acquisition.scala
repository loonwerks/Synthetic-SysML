// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestAcquisition_cargo_coordination_process_request_acquisition {

  def initialise(api: RequestAcquisition_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_request_facts(Mining_Cargo_Transfer_Evidence_Coordinator.RequestFacts(
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      T, F))
  }

  def timeTriggered(api: RequestAcquisition_Operational_Api): Unit = { }
  def finalise(api: RequestAcquisition_Operational_Api): Unit = { }
}
