// #Sireum

package scp_candidate.Drone_Lifecycle_Governor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_governor_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initial_request
        api.qualified_request == Qualified_Request.Invalid_Request
        // END INITIALIZES ENSURES
      )
    )
    api.put_qualified_request(Qualified_Request.Invalid_Request)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case invalid
        (api.raw_request.status == Input_Status.Invalid) ___>: (api.qualified_request == Qualified_Request.Invalid_Request),
        // case no_request
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.No_Request) ___>: (api.qualified_request == Qualified_Request.No_Request),
        // case switch_on
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Switch_On) ___>: (api.qualified_request == Qualified_Request.Switch_On),
        // case switch_off
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Switch_Off) ___>: (api.qualified_request == Qualified_Request.Switch_Off),
        // case begin_charge
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Begin_Charge) ___>: (api.qualified_request == Qualified_Request.Begin_Charge),
        // case end_charge
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.End_Charge) ___>: (api.qualified_request == Qualified_Request.End_Charge),
        // case activate
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Activate) ___>: (api.qualified_request == Qualified_Request.Activate),
        // case deactivate
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Deactivate) ___>: (api.qualified_request == Qualified_Request.Deactivate),
        // case begin_flight
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.Begin_Flight) ___>: (api.qualified_request == Qualified_Request.Begin_Flight),
        // case end_flight
        (api.raw_request.status == Input_Status.Valid &&
          api.raw_request.request_event == Lifecycle_Event.End_Flight) ___>: (api.qualified_request == Qualified_Request.End_Flight)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val request: Drone_Lifecycle_Governor.Lifecycle_Request_Sample = api.get_raw_request().get
    val qualified: Drone_Lifecycle_Governor.Qualified_Request.Type =
      if (request.status == Input_Status.Invalid) {
        Qualified_Request.Invalid_Request
      } else {
        request.request_event match {
          case Lifecycle_Event.No_Request => Qualified_Request.No_Request
          case Lifecycle_Event.Switch_On => Qualified_Request.Switch_On
          case Lifecycle_Event.Switch_Off => Qualified_Request.Switch_Off
          case Lifecycle_Event.Begin_Charge => Qualified_Request.Begin_Charge
          case Lifecycle_Event.End_Charge => Qualified_Request.End_Charge
          case Lifecycle_Event.Activate => Qualified_Request.Activate
          case Lifecycle_Event.Deactivate => Qualified_Request.Deactivate
          case Lifecycle_Event.Begin_Flight => Qualified_Request.Begin_Flight
          case Lifecycle_Event.End_Flight => Qualified_Request.End_Flight
        }
      }
    api.put_qualified_request(qualified)
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
