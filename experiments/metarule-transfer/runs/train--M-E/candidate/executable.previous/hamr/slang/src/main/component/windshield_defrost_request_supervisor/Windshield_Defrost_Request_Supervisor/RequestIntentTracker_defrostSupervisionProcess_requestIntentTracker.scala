// #Sireum

package windshield_defrost_request_supervisor.Windshield_Defrost_Request_Supervisor

import org.sireum._
import windshield_defrost_request_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object RequestIntentTracker_defrostSupervisionProcess_requestIntentTracker {

  var requestMemory: Windshield_Defrost_Request_Supervisor.RequestMemory.Type =
    Windshield_Defrost_Request_Supervisor.RequestMemory.Released

  def initialise(api: RequestIntentTracker_Initialization_Api): Unit = {
    requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.Released
    api.put_requestIntent(Windshield_Defrost_Request_Supervisor.RequestIntent.None)
  }

  def timeTriggered(api: RequestIntentTracker_Operational_Api): Unit = {
    val defrostSelection = api.get_defrostSelection()
    val requestValidity = api.get_requestValidity()

    val requestIntent: Windshield_Defrost_Request_Supervisor.RequestIntent.Type =
      (requestValidity, defrostSelection, requestMemory) match {
        case (Some(Windshield_Defrost_Request_Supervisor.RequestValidity.Invalid), _, _) =>
          requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.RearmRequired
          Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedInvalid
        case (Some(Windshield_Defrost_Request_Supervisor.RequestValidity.Valid),
              Some(Windshield_Defrost_Request_Supervisor.DefrostSelection.Released), _) =>
          requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.Released
          Windshield_Defrost_Request_Supervisor.RequestIntent.None
        case (Some(Windshield_Defrost_Request_Supervisor.RequestValidity.Valid),
              Some(Windshield_Defrost_Request_Supervisor.DefrostSelection.Active),
              Windshield_Defrost_Request_Supervisor.RequestMemory.Released) =>
          requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.AcceptedActive
          Windshield_Defrost_Request_Supervisor.RequestIntent.Fresh
        case (Some(Windshield_Defrost_Request_Supervisor.RequestValidity.Valid),
              Some(Windshield_Defrost_Request_Supervisor.DefrostSelection.Active),
              Windshield_Defrost_Request_Supervisor.RequestMemory.AcceptedActive) =>
          requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.AcceptedActive
          Windshield_Defrost_Request_Supervisor.RequestIntent.Held
        case _ =>
          requestMemory = Windshield_Defrost_Request_Supervisor.RequestMemory.RearmRequired
          Windshield_Defrost_Request_Supervisor.RequestIntent.BlockedRearm
      }

    api.put_requestIntent(requestIntent)
  }

  def finalise(api: RequestIntentTracker_Operational_Api): Unit = { }
}
