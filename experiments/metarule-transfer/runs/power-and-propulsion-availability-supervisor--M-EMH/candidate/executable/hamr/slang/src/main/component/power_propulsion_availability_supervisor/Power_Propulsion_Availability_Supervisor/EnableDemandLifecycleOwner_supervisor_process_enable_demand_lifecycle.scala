// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle {

  var demandMemory: Power_Propulsion_Availability_Supervisor.DemandPhase.Type =
    Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE

  def initialise(api: EnableDemandLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api, demandMemory))
    demandMemory = Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext(
      Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE,
      Power_Propulsion_Availability_Supervisor.RequestContextEvent.NONE))
    api.put_demand_view(Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = {
    Contract(Modifies(api, demandMemory))
    val event: Power_Propulsion_Availability_Supervisor.ControlEvent.Type = api.get_control_event() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.ControlEvent.NONE
    }
    val feedback: Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type = api.get_actuation_feedback() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.ActuationFeedback.UNKNOWN
    }
    val directive: Power_Propulsion_Availability_Supervisor.PriorityDirective.Type = api.get_accepted_directive() match {
      case Some(value) => value
      case _ => Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT
    }
    val candidate: Power_Propulsion_Availability_Supervisor.RequestContextEvent.Type = event match {
      case Power_Propulsion_Availability_Supervisor.ControlEvent.REQUEST_ENABLE =>
        Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_ENABLE
      case Power_Propulsion_Availability_Supervisor.ControlEvent.REQUEST_DISABLE =>
        Power_Propulsion_Availability_Supervisor.RequestContextEvent.REQUEST_DISABLE
      case Power_Propulsion_Availability_Supervisor.ControlEvent.ACKNOWLEDGE_RECOVERY =>
        Power_Propulsion_Availability_Supervisor.RequestContextEvent.ACKNOWLEDGE_RECOVERY
      case _ => Power_Propulsion_Availability_Supervisor.RequestContextEvent.NONE
    }
    val pre: Power_Propulsion_Availability_Supervisor.DemandPhase.Type = demandMemory
    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext(pre, candidate))
    api.put_demand_view(pre)

    if (directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.INHIBIT ||
        directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.DISABLE ||
        directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.RECOVER) {
      demandMemory = Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
    } else if ((pre == Power_Propulsion_Availability_Supervisor.DemandPhase.REQUESTED ||
                pre == Power_Propulsion_Availability_Supervisor.DemandPhase.ACTIVE) &&
               feedback == Power_Propulsion_Availability_Supervisor.ActuationFeedback.ENABLED_CONFIRMED ||
               pre == Power_Propulsion_Availability_Supervisor.DemandPhase.ACTIVE &&
               feedback != Power_Propulsion_Availability_Supervisor.ActuationFeedback.DISABLED_CONFIRMED) {
      demandMemory = Power_Propulsion_Availability_Supervisor.DemandPhase.ACTIVE
    } else if (pre != Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE ||
               directive == Power_Propulsion_Availability_Supervisor.PriorityDirective.ENABLE) {
      demandMemory = Power_Propulsion_Availability_Supervisor.DemandPhase.REQUESTED
    } else {
      demandMemory = Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
    }
  }

  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
