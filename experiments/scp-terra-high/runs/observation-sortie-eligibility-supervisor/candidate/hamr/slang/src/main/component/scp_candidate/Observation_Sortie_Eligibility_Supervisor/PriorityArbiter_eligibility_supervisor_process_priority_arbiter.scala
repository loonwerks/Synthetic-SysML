// #Sireum

package scp_candidate.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import scp_candidate._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_eligibility_supervisor_process_priority_arbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_accepted_directive(Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.Inhibit)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
