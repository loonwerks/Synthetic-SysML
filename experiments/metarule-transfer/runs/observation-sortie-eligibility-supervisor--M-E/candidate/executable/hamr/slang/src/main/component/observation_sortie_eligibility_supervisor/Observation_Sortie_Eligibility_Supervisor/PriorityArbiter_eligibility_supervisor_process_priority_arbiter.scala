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
    val event: Option[Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Type] = api.get_candidate_event()
    val fault: Option[Observation_Sortie_Eligibility_Supervisor.FaultSummary] = api.get_fault_summary()
    var directive: Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Type =
      Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit
    if (fault.isEmpty || fault.get.faultState == Observation_Sortie_Eligibility_Supervisor.FaultState.Active) {
      directive = Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Inhibit
    } else {
      event match {
        case Some(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Cancel) =>
          directive = Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Cancel
        case Some(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.AcknowledgeRecovery) =>
          directive = Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Recover
        case Some(Observation_Sortie_Eligibility_Supervisor.OperatorEvent.Submit) =>
          directive = Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Submit
        case _ => directive = Observation_Sortie_Eligibility_Supervisor.PriorityDirective.Hold
      }
    }
    api.put_accepted_directive(directive)
  }

  def finalise(api: PriorityArbiter_Operational_Api): Unit = { }
}
