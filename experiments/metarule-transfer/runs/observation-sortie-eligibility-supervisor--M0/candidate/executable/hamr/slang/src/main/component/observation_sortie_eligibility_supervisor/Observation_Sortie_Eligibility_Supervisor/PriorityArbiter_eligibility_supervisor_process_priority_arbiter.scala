// #Sireum

package observation_sortie_eligibility_supervisor.Observation_Sortie_Eligibility_Supervisor

import org.sireum._
import observation_sortie_eligibility_supervisor._

// This file will not be overwritten if HAMR codegen is rerun
object PriorityArbiter_eligibility_supervisor_process_priority_arbiter {

  def initialise(api: PriorityArbiter_Initialization_Api): Unit = {
    Contract(Modifies(api))
    api.put_accepted_directive(PriorityDirective.Inhibit)
  }

  def timeTriggered(api: PriorityArbiter_Operational_Api): Unit = {
    Contract(Modifies(api))
    val directive: PriorityDirective.Type = api.get_fault_summary() match {
      case Some(summary) if summary.faultState == FaultState.Clear =>
        api.get_candidate_event() match {
          case Some(OperatorEvent.Cancel) => PriorityDirective.Cancel
          case Some(OperatorEvent.AcknowledgeRecovery) => PriorityDirective.Recover
          case Some(OperatorEvent.Submit) => PriorityDirective.Submit
          case _ => PriorityDirective.Hold
        }
      case _ => PriorityDirective.Inhibit
    }
    api.put_accepted_directive(directive)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
