// #Sireum

package scp_candidate.Factory_Dispatch_Coordinator

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_dispatch_coordination_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_INVALID
        api.qualified_request == Qualified_Request.Invalid_Request
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_request(Factory_Dispatch_Coordinator.Qualified_Request.Invalid_Request)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        Request_Qualification_dispatch_coordination_process_request_qualification_GumboX.compute_CEP_Post(
          api.raw_request, api.qualified_request)
      )
    )
    val sample: Dispatch_Request_Sample = api.get_raw_request().get
    val qualified: Qualified_Request.Type = sample.status match {
      case Input_Status.Invalid => Qualified_Request.Invalid_Request
      case Input_Status.Valid =>
        sample.request_event match {
          case Dispatch_Request_Event.No_Request => Qualified_Request.No_Qualified_Request
          case Dispatch_Request_Event.Request_Shipment => Qualified_Request.Qualified_Shipment_Request
        }
    }
    api.put_qualified_request(qualified)
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
