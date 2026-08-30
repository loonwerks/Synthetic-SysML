// #Sireum #Logika

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_governor_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // SAFE_INITIAL_REQUEST_FACT
        api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request
      )
    )
    api.put_qualified_request(Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Modifies(api),
      Ensures(
        // case REQUEST_INVALID
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Invalid)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request),
        // case REQUEST_NO_REQUEST
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.No_Request)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.No_Request),
        // case REQUEST_SWITCH_ON
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Switch_On)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Switch_On),
        // case REQUEST_SWITCH_OFF
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Switch_Off)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Switch_Off),
        // case REQUEST_BEGIN_CHARGE
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Charge)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge),
        // case REQUEST_END_CHARGE
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.End_Charge)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Charge),
        // case REQUEST_ACTIVATE
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Activate)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Activate),
        // case REQUEST_DEACTIVATE
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Deactivate)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Deactivate),
        // case REQUEST_BEGIN_FLIGHT
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Flight)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight),
        // case REQUEST_END_FLIGHT
        (api.raw_request.status == Drone_Lifecycle_Governor.Input_Status.Valid &
          api.raw_request.request_event == Drone_Lifecycle_Governor.Lifecycle_Event.End_Flight)
          ___>: (api.qualified_request == Drone_Lifecycle_Governor.Qualified_Request.End_Flight)
      )
    )
    val raw: Drone_Lifecycle_Governor.Lifecycle_Request_Sample = api.get_raw_request().get
    var result: Drone_Lifecycle_Governor.Qualified_Request.Type = Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request
    if (raw.status == Drone_Lifecycle_Governor.Input_Status.Invalid) {
      result = Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request
    } else {
      raw.request_event match {
        case Drone_Lifecycle_Governor.Lifecycle_Event.No_Request =>
          result = Drone_Lifecycle_Governor.Qualified_Request.No_Request
        case Drone_Lifecycle_Governor.Lifecycle_Event.Switch_On =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Switch_On
        case Drone_Lifecycle_Governor.Lifecycle_Event.Switch_Off =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Switch_Off
        case Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Charge =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Begin_Charge
        case Drone_Lifecycle_Governor.Lifecycle_Event.End_Charge =>
          result = Drone_Lifecycle_Governor.Qualified_Request.End_Charge
        case Drone_Lifecycle_Governor.Lifecycle_Event.Activate =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Activate
        case Drone_Lifecycle_Governor.Lifecycle_Event.Deactivate =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Deactivate
        case Drone_Lifecycle_Governor.Lifecycle_Event.Begin_Flight =>
          result = Drone_Lifecycle_Governor.Qualified_Request.Begin_Flight
        case Drone_Lifecycle_Governor.Lifecycle_Event.End_Flight =>
          result = Drone_Lifecycle_Governor.Qualified_Request.End_Flight
      }
    }
    api.put_qualified_request(result)
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
