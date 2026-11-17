// #Sireum

package power_propulsion_availability_supervisor.Power_Propulsion_Availability_Supervisor

import org.sireum._
import power_propulsion_availability_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle {

  def initialise(api: EnableDemandLifecycleOwner_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext.example())
    api.put_demand_view(Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = {
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
