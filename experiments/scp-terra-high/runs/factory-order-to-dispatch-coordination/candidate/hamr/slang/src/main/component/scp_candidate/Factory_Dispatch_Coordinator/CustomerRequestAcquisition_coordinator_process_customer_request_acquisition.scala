// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object CustomerRequestAcquisition_coordinator_process_customer_request_acquisition {

  def initialise(api: CustomerRequestAcquisition_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_BOUNDARY
        api.request_boundary_facts.fresh_request == FreshRequest.NONE &&
          api.request_boundary_facts.request_present == F
        // END INITIALIZES ENSURES
      )
    )
    api.put_request_boundary_facts(Factory_Dispatch_Coordinator.RequestBoundaryFacts(
      FreshRequest.NONE, F))
  }

  def timeTriggered(api: CustomerRequestAcquisition_Operational_Api): Unit = {
    Contract(Modifies(api))
    val request: FreshRequest.Type = api.get_fresh_request().get
    api.put_request_boundary_facts(Factory_Dispatch_Coordinator.RequestBoundaryFacts(
      request, request != FreshRequest.NONE))
  }

  def finalise(api: CustomerRequestAcquisition_Operational_Api): Unit = { }
}
