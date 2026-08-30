// #Sireum

package scp_candidate.Mining_Cargo_Transfer_Evidence_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestAdmission_cargo_coordination_process_request_admission {

  def initialise(api: RequestAdmission_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_admission_decision(Mining_Cargo_Transfer_Evidence_Coordinator.AdmissionDecision(
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestKind.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.Correlation.NONE,
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.NO_REQUEST,
      Mining_Cargo_Transfer_Evidence_Coordinator.RequestLedger.NO_HISTORY))
    api.put_request_disposition(Mining_Cargo_Transfer_Evidence_Coordinator.RequestDisposition.NO_REQUEST)
  }

  def timeTriggered(api: RequestAdmission_Operational_Api): Unit = { }
  def finalise(api: RequestAdmission_Operational_Api): Unit = { }
}
