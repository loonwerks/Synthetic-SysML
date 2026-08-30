// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_dispatch_coordination_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // INITIAL_REQUEST_INVALID
        api.qualified_request == Qualified_Request.Invalid_Request
      )
    )

    api.put_qualified_request(Factory_Dispatch_Coordinator.Qualified_Request.Invalid_Request)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQUEST_INVALID
        //   qualified request is invalid when raw request status is invalid
        (api.raw_request.status == Input_Status.Invalid) ___>: (api.qualified_request == Qualified_Request.Invalid_Request),
        // case REQUEST_NEUTRAL
        //   qualified request is no qualified request when raw request is valid and not a shipment
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.request_event == Dispatch_Request_Event.No_Request) ___>: (api.qualified_request == Qualified_Request.No_Qualified_Request),
        // case REQUEST_SHIPMENT
        //   qualified request is qualified shipment request when raw request is valid and a shipment
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.request_event == Dispatch_Request_Event.Request_Shipment) ___>: (api.qualified_request == Qualified_Request.Qualified_Shipment_Request)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val raw = api.get_raw_request().get
    val qualified: Qualified_Request.Type =
      if (raw.status == Input_Status.Invalid) {
        Qualified_Request.Invalid_Request
      } else if (raw.request_event == Dispatch_Request_Event.No_Request) {
        Qualified_Request.No_Qualified_Request
      } else {
        Qualified_Request.Qualified_Shipment_Request
      }
    api.put_qualified_request(qualified)
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
