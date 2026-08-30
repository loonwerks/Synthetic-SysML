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
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext.example())
    api.put_demand_view(Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = {
    Contract(
      Modifies(
        // BEGIN COMPUTE MODIFIES timeTriggered
        demandMemory
        // END COMPUTE MODIFIES timeTriggered
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES timeTriggered
        // guarantee PUBLISH_PRE_STATE_DEMAND
        //   request context and demand view reflect entry demand memory and control event
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
        //   If accepted directive is INHIBIT, DISABLE, or RECOVER
        (api.accepted_directive == PriorityDirective.INHIBIT |
          api.accepted_directive == PriorityDirective.DISABLE |
          api.accepted_directive == PriorityDirective.RECOVER) ___>: (demandMemory == DemandPhase.IDLE),
        // case CASE_18_DEMAND_ACTIVE
        //   If accepted directive is ENABLE or HOLD with active demand feedback
        ((api.accepted_directive == PriorityDirective.ENABLE |
          api.accepted_directive == PriorityDirective.HOLD) &
          ((In(demandMemory) == DemandPhase.REQUESTED |
            In(demandMemory) == DemandPhase.ACTIVE) &
            api.actuation_feedback == ActuationFeedback.ENABLED_CONFIRMED |
            In(demandMemory) == DemandPhase.ACTIVE &
              api.actuation_feedback != ActuationFeedback.DISABLED_CONFIRMED)) ___>: (demandMemory == DemandPhase.ACTIVE),
        // case CASE_19_DEMAND_REQUESTED_OR_IDLE
        //   If accepted directive is ENABLE or HOLD with non-active demand feedback
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
    // example api usage

    val apiUsage_control_event: Option[Power_Propulsion_Availability_Supervisor.ControlEvent.Type] = api.get_control_event()
    api.logInfo(s"Received on data port control_event: ${apiUsage_control_event}")
    val apiUsage_actuation_feedback: Option[Power_Propulsion_Availability_Supervisor.ActuationFeedback.Type] = api.get_actuation_feedback()
    api.logInfo(s"Received on data port actuation_feedback: ${apiUsage_actuation_feedback}")
    val apiUsage_accepted_directive: Option[Power_Propulsion_Availability_Supervisor.PriorityDirective.Type] = api.get_accepted_directive()
    api.logInfo(s"Received on data port accepted_directive: ${apiUsage_accepted_directive}")
  }

  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
