// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker {

  // BEGIN STATE VARS
  var requestMemory: Windshield_Defrost_Request_Supervisor.RequestMemory.Type = Windshield_Defrost_Request_Supervisor.RequestMemory.Released
  // END STATE VARS

  def initialise(api: RequestIntentTracker_Initialization_Api): Unit = {
    Contract(
      Modifies(requestMemory, api),
      Ensures(
        requestMemory == Windshield_Defrost_Request_Supervisor.RequestMemory.Released &
        api.requestIntent == Windshield_Defrost_Request_Supervisor.RequestIntent.None
      )
    )
    requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.Released
    api.put_requestIntent(Windshield_Defrost_Request_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: RequestIntentTracker_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        requestMemory,
        api
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_01_FRESH_REQUEST
        //   fresh request when request memory is released
        (RequestValidity.Valid == api.requestValidity &
          DefrostSelection.Active == api.defrostSelection &
          In(requestMemory) == RequestMemory.Released) ___>: (api.requestIntent == RequestIntent.Fresh &
          requestMemory == RequestMemory.AcceptedActive),
        // case CC_02_HELD_REQUEST
        //   held request when request memory is accepted active
        (RequestValidity.Valid == api.requestValidity &
          DefrostSelection.Active == api.defrostSelection &
          In(requestMemory) == RequestMemory.AcceptedActive) ___>: (api.requestIntent == RequestIntent.Held &
          requestMemory == RequestMemory.AcceptedActive),
        // case CC_03_RELEASE_REARM
        //   release and rearm
        (RequestValidity.Valid == api.requestValidity &
          DefrostSelection.Released == api.defrostSelection) ___>: (api.requestIntent == RequestIntent.None &
          requestMemory == RequestMemory.Released),
        // case CC_04_INVALID_REQUEST
        //   invalid request blocked
        (RequestValidity.Invalid == api.requestValidity) ___>: (api.requestIntent == RequestIntent.BlockedInvalid &
          requestMemory == RequestMemory.RearmRequired),
        // case CC_05_ACTIVE_BEFORE_REARM
        //   active before rearm blocked
        (RequestValidity.Valid == api.requestValidity &
          DefrostSelection.Active == api.defrostSelection &
          In(requestMemory) == RequestMemory.RearmRequired) ___>: (api.requestIntent == RequestIntent.BlockedRearm &
          requestMemory == RequestMemory.RearmRequired)
        // END COMPUTE ENSURES timeTriggered
      )
    )

    val requestValidity = api.get_requestValidity().get
    val defrostSelection = api.get_defrostSelection().get

    if (requestValidity == RequestValidity.Valid &
        defrostSelection == DefrostSelection.Active &
        requestMemory == RequestMemory.Released) {
      api.put_requestIntent(RequestIntent.Fresh)
      requestMemory = RequestMemory.AcceptedActive
    } else if (requestValidity == RequestValidity.Valid &
               defrostSelection == DefrostSelection.Active &
               requestMemory == RequestMemory.AcceptedActive) {
      api.put_requestIntent(RequestIntent.Held)
      requestMemory = RequestMemory.AcceptedActive
    } else if (requestValidity == RequestValidity.Valid &
               defrostSelection == DefrostSelection.Released) {
      api.put_requestIntent(RequestIntent.None)
      requestMemory = RequestMemory.Released
    } else if (requestValidity == RequestValidity.Invalid) {
      api.put_requestIntent(RequestIntent.BlockedInvalid)
      requestMemory = RequestMemory.RearmRequired
    } else if (requestValidity == RequestValidity.Valid &
               defrostSelection == DefrostSelection.Active &
               requestMemory == RequestMemory.RearmRequired) {
      api.put_requestIntent(RequestIntent.BlockedRearm)
      requestMemory = RequestMemory.RearmRequired
    }
  }

  def finalise(api: RequestIntentTracker_Operational_Api): Unit = { }
}
