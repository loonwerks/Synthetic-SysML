// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_eligibility_supervisor_process_priority_arbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val event: Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type = api.get_candidate_event().get
    val summary: Observation_Sortie_Eligibility_Supervisor.FaultSummary = api.get_fault_summary().get
    val directive: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type =
      if (summary.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Clear) {
        event match {
          case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Cancel => Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel
          case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.AcknowledgeRecovery => Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover
          case Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Submit => Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit
          case _ => Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Hold
        }
      } else {
        Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit
      }
    api.put_accepted_directive(directive)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
