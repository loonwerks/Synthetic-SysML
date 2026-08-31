// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle {
  var demandMemory: DemandPhase.Type = DemandPhase.IDLE

  def initialise(api: EnableDemandLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, demandMemory))
    demandMemory = DemandPhase.IDLE
    api.put_request_context(RequestContext(DemandPhase.IDLE, RequestContextEvent.NONE))
    api.put_demand_view(DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = {
    Contract(Modifies(api, demandMemory))
    val previous: DemandPhase.Type = demandMemory
    val event: RequestContextEvent.Type = api.get_control_event() match {
      case Some(ControlEvent.REQUEST_ENABLE) => RequestContextEvent.REQUEST_ENABLE
      case Some(ControlEvent.REQUEST_DISABLE) => RequestContextEvent.REQUEST_DISABLE
      case Some(ControlEvent.ACKNOWLEDGE_RECOVERY) => RequestContextEvent.ACKNOWLEDGE_RECOVERY
      case _ => RequestContextEvent.NONE
    }
    api.put_request_context(RequestContext(previous, event))
    api.put_demand_view(previous)
    val directive: Option[PriorityDirective.Type] = api.get_accepted_directive()
    if (directive == Some(PriorityDirective.INHIBIT) ||
        directive == Some(PriorityDirective.DISABLE) ||
        directive == Some(PriorityDirective.RECOVER)) {
      demandMemory = DemandPhase.IDLE
    } else if ((directive == Some(PriorityDirective.ENABLE) || directive == Some(PriorityDirective.HOLD)) &&
      ((previous == DemandPhase.REQUESTED || previous == DemandPhase.ACTIVE) &&
        api.get_actuation_feedback() == Some(ActuationFeedback.ENABLED_CONFIRMED) ||
       (previous == DemandPhase.ACTIVE &&
        api.get_actuation_feedback() != Some(ActuationFeedback.DISABLED_CONFIRMED)))) {
      demandMemory = DemandPhase.ACTIVE
    } else if (directive == Some(PriorityDirective.ENABLE) ||
               (directive == Some(PriorityDirective.HOLD) && previous != DemandPhase.IDLE)) {
      demandMemory = DemandPhase.REQUESTED
    } else {
      demandMemory = DemandPhase.IDLE
    }
  }

  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
