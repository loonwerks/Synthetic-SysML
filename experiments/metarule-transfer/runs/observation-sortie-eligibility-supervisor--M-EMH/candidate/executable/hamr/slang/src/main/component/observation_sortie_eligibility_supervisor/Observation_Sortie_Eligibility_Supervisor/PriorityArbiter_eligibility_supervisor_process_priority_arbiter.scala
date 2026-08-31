// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_eligibility_supervisor_process_priority_arbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_accepted_directive(Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    // example api usage

    val apiUsage_candidate_event: Option[Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type] = api.get_candidate_event()
    api.logInfo(s"Received on data port candidate_event: ${apiUsage_candidate_event}")
    val apiUsage_fault_summary: Option[Observation_Sortie_Eligibility_Supervisor.FaultSummary] = api.get_fault_summary()
    api.logInfo(s"Received on data port fault_summary: ${apiUsage_fault_summary}")
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
