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
      Modifies(api, requestMemory)
    )
    requestMemory = RequestMemory.Released
    api.put_requestIntent(RequestIntent.None)
  }

  def timeTriggered(api: RequestIntentTracker_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // case CC_01_FRESH_REQUEST
        //   A valid active selection from Released is fresh and becomes accepted
        (api.requestValidity == RequestValidity.Valid &
          api.defrostSelection == DefrostSelection.Active &
          In(requestMemory) == RequestMemory.Released) ___>: (api.requestIntent == RequestIntent.Fresh &
          requestMemory == RequestMemory.AcceptedActive),
        // case CC_02_HELD_REQUEST
        //   A valid continuously active selection remains held and accepted
        (api.requestValidity == RequestValidity.Valid &
          api.defrostSelection == DefrostSelection.Active &
          In(requestMemory) == RequestMemory.AcceptedActive) ___>: (api.requestIntent == RequestIntent.Held &
          requestMemory == RequestMemory.AcceptedActive),
        // case CC_03_RELEASE_REARM
        //   Every valid release becomes non-actionable and arms a later fresh request
        (api.requestValidity == RequestValidity.Valid &
          api.defrostSelection == DefrostSelection.Released) ___>: (api.requestIntent == RequestIntent.None &
          requestMemory == RequestMemory.Released),
        // case CC_04_INVALID_REQUEST
        //   Every invalid request is blocked and enters the release-required state
        (api.requestValidity == RequestValidity.Invalid) ___>: (api.requestIntent == RequestIntent.BlockedInvalid &
          requestMemory == RequestMemory.RearmRequired),
        // case CC_05_ACTIVE_BEFORE_REARM
        //   A valid active selection cannot bypass required release
        (api.requestValidity == RequestValidity.Valid &
          api.defrostSelection == DefrostSelection.Active &
          In(requestMemory) == RequestMemory.RearmRequired) ___>: (api.requestIntent == RequestIntent.BlockedRearm &
          requestMemory == RequestMemory.RearmRequired)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val defrostSelection = api.get_defrostSelection().get
    val requestValidity = api.get_requestValidity().get

    if (requestValidity == RequestValidity.Invalid) {
      requestMemory = RequestMemory.RearmRequired
      api.put_requestIntent(RequestIntent.BlockedInvalid)
    } else if (defrostSelection == DefrostSelection.Released) {
      requestMemory = RequestMemory.Released
      api.put_requestIntent(RequestIntent.None)
    } else if (requestMemory == RequestMemory.Released) {
      requestMemory = RequestMemory.AcceptedActive
      api.put_requestIntent(RequestIntent.Fresh)
    } else if (requestMemory == RequestMemory.AcceptedActive) {
      requestMemory = RequestMemory.AcceptedActive
      api.put_requestIntent(RequestIntent.Held)
    } else {
      requestMemory = RequestMemory.RearmRequired
      api.put_requestIntent(RequestIntent.BlockedRearm)
    }
  }

  def finalise(api: RequestIntentTracker_Operational_Api): Unit = { }
}
