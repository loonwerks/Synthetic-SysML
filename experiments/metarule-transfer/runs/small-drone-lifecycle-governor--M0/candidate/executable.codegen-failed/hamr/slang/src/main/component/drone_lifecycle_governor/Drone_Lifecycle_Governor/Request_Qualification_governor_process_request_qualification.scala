// #Sireum

package drone_lifecycle_governor.Drone_Lifecycle_Governor

import org.sireum._
import drone_lifecycle_governor._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Qualification_governor_process_request_qualification {

  def initialise(api: Request_Qualification_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_qualified_request(Drone_Lifecycle_Governor.Qualified_Request.Invalid_Request)
  }

  def timeTriggered(api: Request_Qualification_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case REQUEST_INVALID
        (api.raw_request.status == Input_Status.Invalid) ___>: (api.qualified_request == Qualified_Request.Invalid_Request),
        // case REQUEST_NO_REQUEST
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.No_Request) ___>: (api.qualified_request == Qualified_Request.No_Request),
        // case REQUEST_SWITCH_ON
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Switch_On) ___>: (api.qualified_request == Qualified_Request.Switch_On),
        // case REQUEST_SWITCH_OFF
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Switch_Off) ___>: (api.qualified_request == Qualified_Request.Switch_Off),
        // case REQUEST_BEGIN_CHARGE
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Begin_Charge) ___>: (api.qualified_request == Qualified_Request.Begin_Charge),
        // case REQUEST_END_CHARGE
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.End_Charge) ___>: (api.qualified_request == Qualified_Request.End_Charge),
        // case REQUEST_ACTIVATE
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Activate) ___>: (api.qualified_request == Qualified_Request.Activate),
        // case REQUEST_DEACTIVATE
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Deactivate) ___>: (api.qualified_request == Qualified_Request.Deactivate),
        // case REQUEST_BEGIN_FLIGHT
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.Begin_Flight) ___>: (api.qualified_request == Qualified_Request.Begin_Flight),
        // case REQUEST_END_FLIGHT
        (api.raw_request.status == Input_Status.Valid &
          api.raw_request.'event' == Lifecycle_Event.End_Flight) ___>: (api.qualified_request == Qualified_Request.End_Flight)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    // example api usage

    val apiUsage_raw_request: Option[Drone_Lifecycle_Governor.Lifecycle_Request_Sample] = api.get_raw_request()
    api.logInfo(s"Received on data port raw_request: ${apiUsage_raw_request}")
  }

  def finalise(api: Request_Qualification_Operational_Api): Unit = { }
}
