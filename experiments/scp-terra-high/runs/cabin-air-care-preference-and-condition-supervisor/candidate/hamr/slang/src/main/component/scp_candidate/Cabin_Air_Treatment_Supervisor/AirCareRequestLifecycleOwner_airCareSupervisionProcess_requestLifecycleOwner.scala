// #Sireum

package scp_candidate.Cabin_Air_Treatment_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object AirCareRequestLifecycleOwner_airCareSupervisionProcess_requestLifecycleOwner {

  // BEGIN STATE VARS
  var requestMemory: Cabin_Air_Treatment_Supervisor.RequestMemory.Type = Cabin_Air_Treatment_Supervisor.RequestMemory.Released
  // END STATE VARS

  def initialise(api: AirCareRequestLifecycleOwner_Initialization_Api): Unit = {
    Contract(
      Modifies(api, requestMemory),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_REQUEST_LIFECYCLE_SAFE
        requestMemory == RequestMemory.Released &&
          api.requestIntent == RequestIntent.None
        // END INITIALIZES ENSURES
      )
    )
    requestMemory = RequestMemory.Released
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_requestIntent(Cabin_Air_Treatment_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Modifies(api, requestMemory)
    )
    val selection = api.get_airCareSelection().get
    val validity = api.get_requestValidity().get
    if (validity == RequestValidity.Invalid) {
      requestMemory = RequestMemory.RearmRequired
      api.put_requestIntent(RequestIntent.BlockedInvalid)
    } else if (selection == AirCareSelection.Off) {
      requestMemory = RequestMemory.Released
      api.put_requestIntent(RequestIntent.None)
    } else if (requestMemory == RequestMemory.Released) {
      requestMemory = RequestMemory.AcceptedActive
      if (selection == AirCareSelection.Auto) {
        api.put_requestIntent(RequestIntent.FreshAuto)
      } else {
        api.put_requestIntent(RequestIntent.FreshPurge)
      }
    } else if (requestMemory == RequestMemory.AcceptedActive) {
      if (selection == AirCareSelection.Auto) {
        api.put_requestIntent(RequestIntent.HeldAuto)
      } else {
        api.put_requestIntent(RequestIntent.HeldPurge)
      }
    } else {
      api.put_requestIntent(RequestIntent.BlockedRearm)
    }
  }

  def finalise(api: AirCareRequestLifecycleOwner_Operational_Api): Unit = { }
}
