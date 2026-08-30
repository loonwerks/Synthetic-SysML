// #Sireum

package factory_dispatch_coordinator.Factory_Dispatch_Coordinator

import org.sireum._
import factory_dispatch_coordinator._

// This file will not be overwritten if HAMR codegen is rerun
object Request_Registry_dispatch_coordination_process_request_registry {

  // BEGIN STATE VARS
  var active: Factory_Dispatch_Coordinator.Active_Slot.Type = Factory_Dispatch_Coordinator.Active_Slot.Empty

  var last_completed: Factory_Dispatch_Coordinator.Completion_Slot.Type = Factory_Dispatch_Coordinator.Completion_Slot.No_Completion
  // END STATE VARS

  def initialise(api: Request_Registry_Initialization_Api): Unit = {
    Contract(
      Modifies(api, active, last_completed),
      Ensures(
        active == Active_Slot.Empty &
        last_completed == Completion_Slot.No_Completion &
        api.pending_request == Pending_Request_View.No_Pending_Request &
        api.dispatch_candidate == Dispatch_Candidate(
          request = Request_Value.No_Request,
          event_blocked = F,
          recovery_hold = F) &
        api.registry_outcome == Registry_Outcome.No_Registry_Notice
      )
    )
    active = Active_Slot.Empty
    last_completed = Completion_Slot.No_Completion
    api.put_pending_request(Factory_Dispatch_Coordinator.Pending_Request_View.No_Pending_Request)
    api.put_dispatch_candidate(
      Factory_Dispatch_Coordinator.Dispatch_Candidate(
        request = Factory_Dispatch_Coordinator.Request_Value.No_Request,
        event_blocked = F,
        recovery_hold = F))
    api.put_registry_outcome(Factory_Dispatch_Coordinator.Registry_Outcome.No_Registry_Notice)
  }

  def timeTriggered(api: Request_Registry_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        active,
        last_completed,
        api
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee REGISTRY_STATE_INVARIANT
        active == Active_Slot.Empty
        // END COMPUTE ENSURES timeTriggered
      )
    )
    active = Active_Slot.Empty

    api.put_pending_request(Pending_Request_View.No_Pending_Request)

    api.put_dispatch_candidate(
      Factory_Dispatch_Coordinator.Dispatch_Candidate(
        request = Factory_Dispatch_Coordinator.Request_Value.No_Request,
        event_blocked = F,
        recovery_hold = F))

    api.put_registry_outcome(Registry_Outcome.No_Registry_Notice)
  }

  def finalise(api: Request_Registry_Operational_Api): Unit = { }
}
