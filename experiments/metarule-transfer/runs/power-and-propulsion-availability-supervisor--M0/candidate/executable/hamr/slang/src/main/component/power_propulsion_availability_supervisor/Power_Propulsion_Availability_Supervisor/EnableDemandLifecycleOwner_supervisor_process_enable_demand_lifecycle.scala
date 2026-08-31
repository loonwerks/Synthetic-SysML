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
    val priorDemand: DemandPhase.Type = demandMemory
    // This executable projection fails closed because this Sireum release
    // cannot encode ControlEvent or ActuationFeedback in SMT.
    api.put_request_context(RequestContext(priorDemand, RequestContextEvent.NONE))
    api.put_demand_view(priorDemand)
    demandMemory = DemandPhase.IDLE
  }

  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
