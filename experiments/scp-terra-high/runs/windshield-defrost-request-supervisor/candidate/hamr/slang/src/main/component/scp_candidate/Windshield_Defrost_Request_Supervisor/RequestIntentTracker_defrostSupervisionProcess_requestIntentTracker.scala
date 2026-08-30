// #Sireum

package scp_candidate.Windshield_Defrost_Request_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker {

  // BEGIN STATE VARS
  var requestMemory: Windshield_Defrost_Request_Supervisor.RequestMemory.Type = Windshield_Defrost_Request_Supervisor.RequestMemory.Released
  // END STATE VARS

  def initialise(api: RequestIntentTracker_Initialization_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_STATE
        requestMemory == RequestMemory.Released &
          api.requestIntent == RequestIntent.None
        // END INITIALIZES ENSURES
      )
    )
    requestMemory = RequestMemory.Released
    api.put_requestIntent(RequestIntent.None)
  }

  def timeTriggered(api: RequestIntentTracker_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory)
    )
    val validity = api.get_requestValidity().get
    val selection = api.get_defrostSelection().get
    if (validity == RequestValidity.Invalid) {
      requestMemory = RequestMemory.RearmRequired
      api.put_requestIntent(RequestIntent.BlockedInvalid)
    } else if (selection == DefrostSelection.Released) {
      requestMemory = RequestMemory.Released
      api.put_requestIntent(RequestIntent.None)
    } else {
      requestMemory match {
        case RequestMemory.Released =>
          requestMemory = RequestMemory.AcceptedActive
          api.put_requestIntent(RequestIntent.Fresh)
        case RequestMemory.AcceptedActive =>
          api.put_requestIntent(RequestIntent.Held)
        case RequestMemory.RearmRequired =>
          api.put_requestIntent(RequestIntent.BlockedRearm)
      }
    }
  }

  def finalise(api: RequestIntentTracker_Operational_Api): Unit = { }
}
