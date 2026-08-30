// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestQualification_coordinator_process_request_qualification {

  def initialise(api: RequestQualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_FACTS
        api.request_facts.fresh_request == FreshRequest.NONE &&
          api.request_facts.request_present == F &&
          api.request_facts.request_valid == F &&
          api.request_facts.request_expedited == F
        // END INITIALIZES ENSURES
      )
    )
    api.put_request_facts(Factory_Dispatch_Coordinator.RequestFacts(
      FreshRequest.NONE, F, F, F))
  }

  def timeTriggered(api: RequestQualification_Operational_Api): Unit = {
    Contract(Modifies(api))
    val boundary: Factory_Dispatch_Coordinator.RequestBoundaryFacts = api.get_request_boundary_facts().get
    val valid: B = boundary.fresh_request == FreshRequest.VALID_STANDARD ||
      boundary.fresh_request == FreshRequest.VALID_EXPEDITE
    api.put_request_facts(Factory_Dispatch_Coordinator.RequestFacts(
      boundary.fresh_request, boundary.request_present, valid,
      boundary.fresh_request == FreshRequest.VALID_EXPEDITE))
  }

  def finalise(api: RequestQualification_Operational_Api): Unit = { }
}
