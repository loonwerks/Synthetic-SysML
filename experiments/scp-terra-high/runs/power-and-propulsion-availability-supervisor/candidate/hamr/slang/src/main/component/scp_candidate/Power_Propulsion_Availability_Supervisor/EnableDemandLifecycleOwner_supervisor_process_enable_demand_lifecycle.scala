// #Sireum

package scp_candidate.Power_Propulsion_Availability_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object EnableDemandLifecycleOwner_supervisor_process_enable_demand_lifecycle {

  def initialise(api: EnableDemandLifecycleOwner_Initialization_Api): Unit = {
    Contract(Modifies(api), Ensures(
      // BEGIN INITIALIZES ENSURES
        // guarantee INITIAL_DEMAND_IDLE
        api.demand_view == DemandPhase.IDLE &&
          api.request_context.demand == DemandPhase.IDLE &&
          api.request_context.candidateEvent == RequestContextEvent.NONE
        // END INITIALIZES ENSURES
    ))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_request_context(Power_Propulsion_Availability_Supervisor.RequestContext(
      DemandPhase.IDLE, RequestContextEvent.NONE))
    api.put_demand_view(Power_Propulsion_Availability_Supervisor.DemandPhase.IDLE)
  }

  def timeTriggered(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
  def finalise(api: EnableDemandLifecycleOwner_Operational_Api): Unit = { }
}
