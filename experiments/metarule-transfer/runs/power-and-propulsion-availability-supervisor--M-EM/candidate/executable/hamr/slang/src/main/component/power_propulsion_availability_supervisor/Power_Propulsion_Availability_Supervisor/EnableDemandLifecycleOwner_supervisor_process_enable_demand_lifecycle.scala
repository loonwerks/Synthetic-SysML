// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle {

  // BEGIN STATE VARS
  var demandMemory: Power_Propulsion_Availability_Supervisor.DemandPhase.Type = Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE
  // END STATE VARS

  def initialise(api: EnableDemandLifecycleOwner_Initialization_Api): Unit = {
    demandMemory = DemandPhase.IDLE
    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext(
      demand = DemandPhase.IDLE, candidateEvent = RequestContextEvent.NONE))
    api.put_demand_view(Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_STATE_DEMAND
        api.request_context.demand == In(demandMemory) &
          api.demand_view == In(demandMemory) &
          (api.control_event == ControlEvent.NONE &
            api.request_context.candidateEvent == RequestContextEvent.NONE |
            api.control_event == ControlEvent.REQUEST_ENABLE &
              api.request_context.candidateEvent == RequestContextEvent.REQUEST_ENABLE |
            api.control_event == ControlEvent.REQUEST_DISABLE &
              api.request_context.candidateEvent == RequestContextEvent.REQUEST_DISABLE |
            api.control_event == ControlEvent.ACKNOWLEDGE_RECOVERY &
              api.request_context.candidateEvent == RequestContextEvent.ACKNOWLEDGE_RECOVERY),
        // case CASE_17_DEMAND_INVALIDATED
        (api.accepted_directive == PriorityDirective.INHIBIT |
          api.accepted_directive == PriorityDirective.DISABLE |
          api.accepted_directive == PriorityDirective.RECOVER) ___>: (demandMemory == DemandPhase.IDLE),
        // case CASE_18_DEMAND_ACTIVE
        ((api.accepted_directive == PriorityDirective.ENABLE |
          api.accepted_directive == PriorityDirective.HOLD) &
          ((In(demandMemory) == DemandPhase.REQUESTED |
            In(demandMemory) == DemandPhase.ACTIVE) &
            api.actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED |
            In(demandMemory) == DemandPhase.ACTIVE &
              api.actuation_feedback != ActuationFeedback.DISABLED_CONFIRMED)) ___>: (demandMemory == DemandPhase.ACTIVE),
        // case CASE_19_DEMAND_REQUESTED_OR_IDLE
        ((api.accepted_directive == PriorityDirective.ENABLE |
          api.accepted_directive == PriorityDirective.HOLD) &
          (In(demandMemory) == DemandPhase.IDLE |
            In(demandMemory) == DemandPhase.REQUESTED &
              api.actuation_feedback != ActuationFeedback.ENABLED_CONFIRMED |
            In(demandMemory) == DemandPhase.ACTIVE &
              api.actuation_feedback == ActuationFeedback.DISABLED_CONFIRMED)) ___>: ((In(demandMemory) != DemandPhase.IDLE |
          api.accepted_directive == PriorityDirective.ENABLE) &
          demandMemory == DemandPhase.REQUESTED |
          In(demandMemory) == DemandPhase.IDLE &
            api.accepted_directive == PriorityDirective.HOLD &
            demandMemory == DemandPhase.IDLE)
        // END COMPUTE ENSURES timeTriggered
      )
    )
    val previous: DemandPhase.Type = demandMemory
    val event: ControlEvent.Type = api.get_control_event().get
    val feedback: ActuationFeedback.Type = api.get_actuation_feedback().get
    val directive: PriorityDirective.Type = api.get_accepted_directive().get
    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext(
      demand = previous,
      candidateEvent =
        if (event == ControlEvent.REQUEST_ENABLE) RequestContextEvent.REQUEST_ENABLE
        else if (event == ControlEvent.REQUEST_DISABLE) RequestContextEvent.REQUEST_DISABLE
        else if (event == ControlEvent.ACKNOWLEDGE_RECOVERY) RequestContextEvent.ACKNOWLEDGE_RECOVERY
        else RequestContextEvent.NONE))
    api.put_demand_view(previous)
    if (directive == PriorityDirective.INHIBIT |
        directive == PriorityDirective.DISABLE |
        directive == PriorityDirective.RECOVER) {
      demandMemory = DemandPhase.IDLE
    }
    else if ((previous == DemandPhase.REQUESTED | previous == DemandPhase.ACTIVE) &
             feedback == ActuationFeedback.ENABLED_CONFIRMED) {
      demandMemory = DemandPhase.ACTIVE
    }
    else if (previous == DemandPhase.ACTIVE &
             feedback != ActuationFeedback.DISABLED_CONFIRMED) {
      demandMemory = DemandPhase.ACTIVE
    } else if (previous == DemandPhase.IDLE & directive == PriorityDirective.HOLD) {
      demandMemory = DemandPhase.IDLE
    } else {
      demandMemory = DemandPhase.REQUESTED
    }
  }

  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
